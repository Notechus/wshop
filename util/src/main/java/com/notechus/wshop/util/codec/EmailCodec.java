package com.notechus.wshop.util.codec;

import com.notechus.wshop.util.type.Email;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.MessageCodec;
import io.vertx.core.json.JsonObject;

/**
 * @author notechus.
 */
public class EmailCodec implements MessageCodec<Email, Email> {

    @Override
    public void encodeToWire(Buffer buffer, Email message) {
        JsonObject jsonToEncode = new JsonObject();
        jsonToEncode.put("from", message.getFrom());
        jsonToEncode.put("to", message.getTo());
        jsonToEncode.put("subject", message.getSubject());
        jsonToEncode.put("text", message.getText());

        String jsonToStr = jsonToEncode.encode();

        int length = jsonToStr.getBytes().length;

        buffer.appendInt(length);
        buffer.appendString(jsonToStr);
    }

    @Override
    public Email decodeFromWire(int i, Buffer buffer) {
        int _pos = i;

        int length = buffer.getInt(_pos);

        String jsonStr = buffer.getString(_pos += 4, _pos += length);
        JsonObject contentJson = new JsonObject(jsonStr);

        String from = contentJson.getString("from");
        String to = contentJson.getString("to");
        String subject = contentJson.getString("subject");
        String text = contentJson.getString("text");

        return new Email(from, to, text);
    }

    @Override
    public Email transform(Email message) {
        return message;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public byte systemCodecID() {
        return -1;
    }
}

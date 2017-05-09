package com.notechus.wshop.util.codec;

import com.notechus.wshop.util.event.RequestParcelEvent;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.MessageCodec;
import io.vertx.core.json.JsonObject;

/**
 * @author notechus.
 */
public class RequestParcelCodec implements MessageCodec<RequestParcelEvent, RequestParcelEvent> {
    @Override
    public void encodeToWire(Buffer buffer, RequestParcelEvent requestParcelEvent) {
        JsonObject jsonObject = new JsonObject();
    }

    @Override
    public RequestParcelEvent decodeFromWire(int i, Buffer buffer) {
        return null;
    }

    @Override
    public RequestParcelEvent transform(RequestParcelEvent requestParcelEvent) {
        return null;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public byte systemCodecID() {
        return 0;
    }
}

package com.notechus.wshop.util.codec;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.MessageCodec;
import io.vertx.ext.mail.MailMessage;

/**
 * @author notechus.
 */
public class MailMessageCodec implements MessageCodec<String, MailMessage> {
    
    @Override
    public void encodeToWire(Buffer buffer, String s) {

    }

    @Override
    public MailMessage decodeFromWire(int i, Buffer buffer) {
        return null;
    }

    @Override
    public MailMessage transform(String s) {
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

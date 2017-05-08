package com.notechus.wshop.infrastructure.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.eventbus.impl.codecs.JsonObjectMessageCodec;
import io.vertx.ext.mail.MailClient;
import io.vertx.ext.mail.MailConfig;
import io.vertx.ext.mail.MailMessage;
import io.vertx.ext.mail.StartTLSOptions;

/**
 * @author notechus.
 */
public class MailVerticle extends AbstractVerticle {

    private static final String HOSTNAME = "";
    private static final int PORT = 2345;
    private static final String USERNAME = "";
    private static final String PASSWORD = "";

    @Override
    public void start(Future<Void> startFuture) throws Exception {

        MailConfig config = new MailConfig();
        config.setHostname(HOSTNAME);
        config.setPort(PORT);
        config.setStarttls(StartTLSOptions.REQUIRED);
        config.setUsername(USERNAME);
        config.setPassword(PASSWORD);


        MailClient mailClient = MailClient.createNonShared(vertx, config);

        vertx.eventBus().registerCodec(new JsonObjectMessageCodec()).consumer("wshop.mail", message -> {
            if (MailMessage.class.isAssignableFrom(message.body().getClass()))
                mailClient.sendMail((MailMessage) message.body(), res -> {
                    if (res.succeeded()) System.out.println("Successfully sent email");
                    else System.err.println("Email could not be sent");
                });
        });

        startFuture.complete();
    }
}

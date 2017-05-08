package com.notechus.wshop.web.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.impl.codecs.JsonObjectMessageCodec;
import io.vertx.ext.mail.MailMessage;
import io.vertx.ext.web.Router;

/**
 * @author notechus.
 */
public class WebVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        Router router = Router.router(vertx);

        EventBus bus = vertx.eventBus();
        bus.registerCodec(new JsonObjectMessageCodec());

        router.get("/").handler(routingContext -> {
            routingContext
                    .response()
                    .putHeader("content-type", "text/html")
                    .end("Hello World!");
            bus.publish("wshop.mail", new MailMessage());
        });

        vertx.createHttpServer().requestHandler(router::accept).listen(8080);
    }
}

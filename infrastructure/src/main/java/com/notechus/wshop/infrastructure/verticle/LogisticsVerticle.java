package com.notechus.wshop.infrastructure.verticle;

import com.notechus.wshop.util.codec.RequestParcelCodec;
import com.notechus.wshop.util.event.RequestParcelEvent;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.EventBus;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.client.WebClient;

/**
 * @author notechus.
 */
public class LogisticsVerticle extends AbstractVerticle {

    @Override
    public void start(Future<Void> startFuture) throws Exception {

        EventBus eventBus = vertx.eventBus();
        WebClient webClient = WebClient.create(vertx);

        eventBus.registerDefaultCodec(RequestParcelEvent.class, new RequestParcelCodec());

        eventBus.consumer("wshop.logistics", e -> {
            RequestParcelEvent event = (RequestParcelEvent) e.body();

            webClient.post(8080, "localhost", "/package").sendJson(event, ar -> {
                if (ar.succeeded()) {
                    // log + reply to http client?
                    HttpResponse<Buffer> result = ar.result();
                    String s = result.bodyAsJson(String.class);
                    eventBus.publish("wshop.mail", s); // send reply to push email notification
                } else {
                    // log error
                }
            });

        });

        startFuture.complete();
    }
}

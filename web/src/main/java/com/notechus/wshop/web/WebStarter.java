package com.notechus.wshop.web;

import io.vertx.core.Vertx;

/**
 * @author notechus.
 */
public class WebStarter {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();

        vertx.deployVerticle("com.notechus.wshop.web.verticle.WebVerticle", stringAsyncResult -> {
            if (stringAsyncResult.succeeded()) System.out.println("deployed web verticle");
            else System.err.println(stringAsyncResult.cause().getMessage());
        });

        vertx.deployVerticle("com.notechus.wshop.infrastructure.verticle.MailVerticle", stringAsyncResult -> {
            if (stringAsyncResult.succeeded()) System.out.println("deployed mail verticle");
            else System.err.println(stringAsyncResult.cause().getMessage());
        });
    }
}

package net.knaur.java;

import io.javalin.Javalin;
import io.javalin.config.JavalinConfig;

import static io.javalin.apibuilder.ApiBuilder.*;


public class Main {
    public static void main(String[] args) {

        Javalin app = Javalin.create(cfg -> {
            cfg.useVirtualThreads = true;
            cfg.router.apiBuilder(() -> {
                get("/hello", ctx -> ctx.result("Hello World"));
            });
        });
        app.start(7000);
    }
}

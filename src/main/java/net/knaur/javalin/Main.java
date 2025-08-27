package net.knaur.javalin;

import io.javalin.Javalin;

import java.util.Map;

import static io.javalin.apibuilder.ApiBuilder.*;

public class Main {
    public static void main(String[] args) {
        Javalin app = createApp();
        app.start(7000);
    }

    private static Javalin createApp() {
        return Javalin.create(cfg -> {
            cfg.useVirtualThreads = true;
            cfg.router.apiBuilder(() -> {
                get("/hello", ctx -> ctx.json(Map.of("message", "Hello World")));
            });
        });
    }
}

package az.tarlan;

import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
        Javalin.create()
                .get("/health", ctx -> ctx.result("OK"))
                .start(8080);
    }
}

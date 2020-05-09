package news.feed

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.features.DefaultHeaders

fun main(args: Array<String>) {
    val port = 8080

    embeddedServer(
        Netty,
        port = port,
        module = Application::main
    ).start(wait = true)
}

fun Application.main() {
    install(DefaultHeaders)

    routing {
        root()
    }
}

fun Routing.root() {
    get("/") {
        call.respondText("<h1>News Feed</h1>", ContentType.Text.Html)
    }
}

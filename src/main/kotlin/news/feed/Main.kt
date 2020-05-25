package news.feed

import io.ktor.application.*
import io.ktor.features.DefaultHeaders
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

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
        staticRoute()
        home()
    }
}


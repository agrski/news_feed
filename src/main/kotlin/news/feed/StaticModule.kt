package news.feed

import io.ktor.http.content.*
import io.ktor.routing.Route

fun Route.staticRoute() {
    static("/static") {
        log("Serving static resources on /static")
        resources("static")
    }
}

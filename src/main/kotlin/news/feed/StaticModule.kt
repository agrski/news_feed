package news.feed

import io.ktor.routing.Route
import io.ktor.http.content.*

fun Route.staticRoute() {
    static("/static") {
        resources("static")
    }
}

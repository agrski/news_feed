package news.feed

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.http.content.defaultResource
import io.ktor.http.content.static
import io.ktor.response.respondText
import io.ktor.routing.Route

fun Route.home() {
    static("/") {
        log("Serving resource home.html on /")
        defaultResource("home.html", "static")
    }
}

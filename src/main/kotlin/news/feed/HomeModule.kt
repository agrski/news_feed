package news.feed

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.*
import io.ktor.http.content.defaultResource
import io.ktor.http.content.static

fun Route.home() {
    static("/"){
        defaultResource("home.html", "static")
    }
}

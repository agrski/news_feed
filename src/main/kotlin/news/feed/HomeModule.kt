package news.feed

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.http.content.defaultResource
import io.ktor.http.content.static
import io.ktor.response.respondText
import io.ktor.routing.Route

fun Route.home() {
    listOf("/", "/index.html").forEach { homePath ->
        val resourceName = "home.html"
        val resourceFolder = "static"

        static(homePath) {
            log("Serving resource ${resourceName} on ${homePath}")
            defaultResource(resourceName, resourceFolder)
        }
    }
}

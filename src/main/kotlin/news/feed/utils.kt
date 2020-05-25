package news.feed

import io.ktor.routing.*
import org.slf4j.event.Level

fun Route.log(msg: String, level: Level = Level.INFO) {
    val logger = this.application.environment.log

    val logAtLevelFor: (String) -> Unit = when(level) {
        Level.TRACE -> logger::debug
        Level.DEBUG -> logger::debug
        Level.INFO  -> logger::info
        Level.WARN  -> logger::warn
        Level.ERROR -> logger::error
    }

    logAtLevelFor(msg)
}

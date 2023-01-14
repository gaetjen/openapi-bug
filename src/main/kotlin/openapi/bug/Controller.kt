package openapi.bug

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class Controller {
    @Get("/ping")
    fun ping(): String {
        return """["pong"]"""
    }
}
package com.example

import com.example.features.login.configureLoginRouting
import com.example.features.register.configureRegisterRouting
import io.ktor.server.engine.*
import io.ktor.server.cio.*
import com.example.plugins.*

fun main() {
    embeddedServer(CIO, port = 8081, host = "0.0.0.0") {
        configureRouting()
        configureLoginRouting()
        configureRegisterRouting()
        configureSerialization()
    }.start(wait = true)
}

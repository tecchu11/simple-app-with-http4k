package com.example.tecchu11.app

import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.server.Undertow
import org.http4k.server.asServer

private val port: String = System.getenv("APP_PORT") ?: "9000"

fun main() {
    val app = { request: Request ->
        Response(Status.OK).body(
            """
                {
                "message": "Hello, ${request.query("name")}!"
                }
            """.trimIndent()
        )
    }
    app.asServer(Undertow(port.toInt())).start()
}

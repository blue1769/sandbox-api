package com.blustar.sandboxapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SandboxApiApplication

fun main(args: Array<String>) {
	runApplication<SandboxApiApplication>(*args)
}

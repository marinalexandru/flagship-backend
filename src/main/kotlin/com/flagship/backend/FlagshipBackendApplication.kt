package com.flagship.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlagshipBackendApplication

fun main(args: Array<String>) {
	runApplication<FlagshipBackendApplication>(*args)
}

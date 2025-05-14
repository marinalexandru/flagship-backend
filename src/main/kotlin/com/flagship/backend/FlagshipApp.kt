package com.flagship.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlagshipApp

fun main(args: Array<String>) {
	runApplication<FlagshipApp>(*args)
}

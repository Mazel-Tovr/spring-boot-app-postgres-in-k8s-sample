package com.mazeltov.sample

import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*

@SpringBootApplication
class SampleApplication

fun main(args: Array<String>) {
	runApplication<SampleApplication>(*args)
}

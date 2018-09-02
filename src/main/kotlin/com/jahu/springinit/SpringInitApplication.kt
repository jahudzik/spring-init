package com.jahu.springinit

import com.jahu.springinit.quotes.Quote
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class SpringInitApplication {

    private val quotesServiceUrl = "http://gturnquist-quoters.cfapps.io/api/random"
    private val log = LoggerFactory.getLogger(SpringInitApplication::class.java)

    @Bean
    fun restTemplate(builder: RestTemplateBuilder) = builder.build()

    @Bean
    fun run(restTemplate: RestTemplate) = CommandLineRunner {
        val quote = restTemplate.getForObject(quotesServiceUrl, Quote::class.java)
        log.info(quote.toString())
    }

}

fun main(args: Array<String>) {
    runApplication<SpringInitApplication>(*args)
}

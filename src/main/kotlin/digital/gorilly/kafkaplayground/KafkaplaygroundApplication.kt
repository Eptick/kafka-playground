package digital.gorilly.kafkaplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaplaygroundApplication

fun main(args: Array<String>) {
	runApplication<KafkaplaygroundApplication>(*args)
}

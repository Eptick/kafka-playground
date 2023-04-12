package digital.gorilly.kafkaplayground

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling


@SpringBootApplication
@EnableScheduling
class KafkaPlaygroundApplication

@Autowired
private var demoOne: DemoOne? = null

fun main(args: Array<String>) {
	runApplication<KafkaPlaygroundApplication>(*args)
}

package digital.gorilly.kafkaplayground;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.util.logging.Logger

@Component
class DemoOne {
    companion object {
        val log = Logger.getLogger(this::class.java.name)
    }

    @Autowired
    private var kafkaTemplate: KafkaTemplate<String, String>? = null


    fun sendMessage(msg: String?) {
        kafkaTemplate!!.send("demo", msg)
    }

    @Scheduled(fixedDelay = 100000)
    fun init() {
        log.info("aa")
        sendMessage("testing")
    }

    @KafkaListener(topics = ["demo"])
    fun listenGroupFoo(message: String) {
        log.info("Received Message in group foo: $message")
    }

}



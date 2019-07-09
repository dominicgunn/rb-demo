package dev.retrobuddy.rbdemo

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class DemoApplicationSpec extends Specification {

    def "simple application test"() {
        when: "i start the application"
        // This will happen when the test context loads

        then: "no exceptions are thrown"
        noExceptionThrown()
    }

}

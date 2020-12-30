package vip.yazilim.springvip.templates.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import vip.yazilim.libs.springvip.constants.BASE_PACKAGE

@SpringBootApplication(scanBasePackages = [BASE_PACKAGE, "vip.yazilim.springvipexamples"])
class SpringVipExamplesApplication

fun main(args: Array<String>) {
    runApplication<SpringVipExamplesApplication>(*args)
}

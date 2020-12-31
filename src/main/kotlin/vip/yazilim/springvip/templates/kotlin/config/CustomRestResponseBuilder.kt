package vip.yazilim.springvip.templates.kotlin.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import vip.yazilim.libs.springvip.config.bean.IRestResponseBuilder
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Cust
 * @author maemresen - maemresen@yazilim.vip
 * 12/31/2020
 */
@Component
class CustomRestResponseBuilder : IRestResponseBuilder {
    override fun generateRestResponse(
        responseBody: Any,
        httpStatus: HttpStatus,
        request: HttpServletRequest,
        response: HttpServletResponse
    ): Any {
        return mapOf(
            Pair("my-data", responseBody),
            Pair("additional-data-1", "value"),
            Pair("additional-data-2", true)
        )
    }

}
package vip.yazilim.libs.springvip.template.config.springvip;

import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import vip.yazilim.libs.springvip.config.bean.IRestResponseBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author maemresen - maemresen@yazilim.vip
 * 21.08.2020
 */
@Component
public class CustomRestResponseBuilder implements IRestResponseBuilder {
    @NotNull
    @Override
    public Object generateRestResponse(@NotNull Object responseBody, @NotNull HttpStatus httpStatus, @NotNull HttpServletRequest request, @NotNull HttpServletResponse response) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("info", "my custom response model");
        map.put("my-data", responseBody);
        return map;
    }
}

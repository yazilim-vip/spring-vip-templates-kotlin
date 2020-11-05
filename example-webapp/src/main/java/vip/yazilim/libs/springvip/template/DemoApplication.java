package vip.yazilim.libs.springvip.template;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vip.yazilim.libs.springvip.template.scheduled.ScheduledTasks;
import vip.yazilim.libs.springvip.template.example.IPersonService;

import static vip.yazilim.libs.springvip.constants.GlobalConstantsKt.BASE_PACKAGE;

@SpringBootApplication(scanBasePackages = {BASE_PACKAGE, "vip.yazilim.libs.springvip.template"})
@Slf4j
@AllArgsConstructor
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    private final ScheduledTasks scheduledTasks;
    private final IPersonService personService;

    @Override
    public void run(String... args) {
        log.info(personService.getAll().toString());
    }
}

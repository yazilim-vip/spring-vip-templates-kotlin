package vip.yazilim.libs.springvip.template.scheduled;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import vip.yazilim.libs.springvip.util.scheduled.ScheduledTask;

@Component
@Slf4j
public class MyScheduledTask extends ScheduledTask {

    public MyScheduledTask() {
        super(log
                , "MyThread"
                , 2 * 1000
                , 0
                , 1000 * 15);
    }

    @Override
    protected void doThreadJob() throws Exception {
        log.info("Hello World!!");
    }
}

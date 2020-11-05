package vip.yazilim.libs.springvip.template.scheduled;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author maemresen - maemresen@yazilim.vip
 * 20.08.2020
 */
@Component
public class ScheduledTasks {

    private final MyScheduledTask myScheduledTask;

    public ScheduledTasks(MyScheduledTask myScheduledTask) {
        this.myScheduledTask = myScheduledTask;
    }

    @Async
    public void test(){
        myScheduledTask.run();

    }

}

package com.meysamzamani.datasynchronizer.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DataSyncScheduler {

    // Specify the cron expression to run the job every 3 hours
    @Scheduled(cron = "0 0 */3 * * *")
    public void syncData() {

    }

}

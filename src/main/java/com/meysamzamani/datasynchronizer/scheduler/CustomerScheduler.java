package com.meysamzamani.datasynchronizer.scheduler;

import com.meysamzamani.datasynchronizer.application.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CustomerScheduler {

    @Autowired
    private CustomerService customerService;

    // Specify the cron expression to run the job every 3 hours
    @Scheduled(cron = "0 */1 * * * *")
    public void syncData() {
        customerService.syncCustomerToStorage();
    }

}

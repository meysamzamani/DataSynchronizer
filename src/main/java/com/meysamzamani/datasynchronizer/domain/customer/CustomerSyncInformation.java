package com.meysamzamani.datasynchronizer.domain.customer;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = CustomerSyncInformation.TABLE_NAME)
public class CustomerSyncInformation {

    public static final String TABLE_NAME= "customer_sync";

    @Id
    @SequenceGenerator(name = "customer_sync_sequence", sequenceName = "customer_sync_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_sync_sequence")
    private Long id;
    @Column(nullable = false)
    private LocalDate syncTime;
    @Column(nullable = false)
    private Long maxCustomerId;

    public CustomerSyncInformation() {
    }

    public CustomerSyncInformation(LocalDate syncTime, Long maxCustomerId) {
        this.syncTime = syncTime;
        this.maxCustomerId = maxCustomerId;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getSyncTime() {
        return syncTime;
    }

    public Long getMaxCustomerId() {
        return maxCustomerId;
    }
}

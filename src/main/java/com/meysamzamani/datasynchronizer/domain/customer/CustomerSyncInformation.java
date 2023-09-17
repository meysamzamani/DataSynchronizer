package com.meysamzamani.datasynchronizer.domain.customer;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = CustomerSyncInformation.TABLE_NAME)
public class CustomerSyncInformation {

    public static final String TABLE_NAME= "customer_sync";

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false)
    private LocalDateTime syncTime;
    @Column(nullable = false)
    private Long maxCustomerId;
    @Column(nullable = false)
    private String bucket;
    private boolean isActive;

    public CustomerSyncInformation() {
    }

    public CustomerSyncInformation(LocalDateTime syncTime, Long maxCustomerId, String bucket, boolean isActive) {
        this.syncTime = syncTime;
        this.maxCustomerId = maxCustomerId;
        this.bucket = bucket;
        this.isActive = isActive;
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getSyncTime() {
        return syncTime;
    }

    public Long getMaxCustomerId() {
        return maxCustomerId;
    }

    public String getBucket() {
        return bucket;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

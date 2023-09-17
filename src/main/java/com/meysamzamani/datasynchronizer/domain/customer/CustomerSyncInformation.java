package com.meysamzamani.datasynchronizer.domain.customer;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = CustomerSyncInformation.TABLE_NAME)
public class CustomerSyncInformation {

    public static final String TABLE_NAME= "customer_sync";

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false)
    private LocalDate syncTime;
    @Column(nullable = false)
    private Long maxCustomerId;
    @Column(nullable = false)
    private String filePath;
    @Column(nullable = false)
    private String bucket;
    private boolean isActive;

    public CustomerSyncInformation() {
    }

    public CustomerSyncInformation(LocalDate syncTime, Long maxCustomerId, String filePath, String bucket, boolean isActive) {
        this.syncTime = syncTime;
        this.maxCustomerId = maxCustomerId;
        this.filePath = filePath;
        this.bucket = bucket;
        this.isActive = isActive;
    }

    public UUID getId() {
        return id;
    }

    public LocalDate getSyncTime() {
        return syncTime;
    }

    public Long getMaxCustomerId() {
        return maxCustomerId;
    }

    public String getFilePath() {
        return filePath;
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

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}

package com.meysamzamani.datasynchronizer.domain.shared;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = Dummy.TABLE_NAME)
public class Dummy {
    public static final String TABLE_NAME= "dummy";

    @Id
    @SequenceGenerator(name = "dummy_sequence", sequenceName = "dummy_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dummy_sequence")
    @Column(name = "auftragid")
    private Long auftragId;
    @Column(nullable = false, name = "artikelnummer")
    private String aritkelNummer;
    @Column(nullable = false, name = "created")
    private LocalDate created;
    @Column(nullable = false, name = "lastchange")
    private LocalDate lastChange;
    @Column(nullable = false, name = "kundeid")
    private Long kundeId;

    public Dummy() {}

    public Dummy(String aritkelNummer, LocalDate created, LocalDate lastChange, Long kundeId) {
        this.aritkelNummer = aritkelNummer;
        this.created = created;
        this.lastChange = lastChange;
        this.kundeId = kundeId;
    }

    public Long getAuftragId() {
        return auftragId;
    }

    public String getAritkelNummer() {
        return aritkelNummer;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getLastChange() {
        return lastChange;
    }

    public Long getKundeId() {
        return kundeId;
    }
}

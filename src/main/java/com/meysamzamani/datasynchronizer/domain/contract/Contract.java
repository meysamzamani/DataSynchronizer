package com.meysamzamani.datasynchronizer.domain.contract;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = Contract.TABLE_NAME)
public class Contract {

    public static final String TABLE_NAME= "auftraege";

    @Id
    @Column(name = "auftragid")
    private Long auftragId;
    @Column(nullable = false, name = "artikelnummer")
    private String artikelNummer;
    @Column(nullable = false, name = "created")
    private LocalDate created;
    @Column(nullable = false, name = "lastchange")
    private LocalDate lastChange;
    @Column(nullable = false, name = "kundeid")
    private Long kundeId;

    public Contract() {}

    public Contract(Long auftragId, String artikelNummer, LocalDate created, LocalDate lastChange, Long kundeId) {
        this.auftragId = auftragId;
        this.artikelNummer = artikelNummer;
        this.created = created;
        this.lastChange = lastChange;
        this.kundeId = kundeId;
    }

    public Long getAuftragId() {
        return auftragId;
    }

    public String getArtikelNummer() {
        return artikelNummer;
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

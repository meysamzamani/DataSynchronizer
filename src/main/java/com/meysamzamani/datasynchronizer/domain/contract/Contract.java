package com.meysamzamani.datasynchronizer.domain.contract;

import jakarta.persistence.*;

@Entity
@Table(name = Contract.TABLE_NAME)
public class Contract {

    public static final String TABLE_NAME= "auftraege";

    @Id
    @Column(name = "auftragid")
    private String auftragId;
    @Column(nullable = false, name = "artikelnummer")
    private String artikelNummer;
    @Column(nullable = false, name = "created")
    private String created;
    @Column(nullable = false, name = "lastchange")
    private String lastChange;
    @Column(nullable = false, name = "kundeid")
    private String kundeId;

    public Contract() {}

    public Contract(String auftragId, String artikelNummer, String created, String lastChange, String kundeId) {
        this.auftragId = auftragId;
        this.artikelNummer = artikelNummer;
        this.created = created;
        this.lastChange = lastChange;
        this.kundeId = kundeId;
    }

    public String getAuftragId() {
        return auftragId;
    }

    public String getArtikelNummer() {
        return artikelNummer;
    }

    public String getCreated() {
        return created;
    }

    public String getLastChange() {
        return lastChange;
    }

    public String getKundeId() {
        return kundeId;
    }
}

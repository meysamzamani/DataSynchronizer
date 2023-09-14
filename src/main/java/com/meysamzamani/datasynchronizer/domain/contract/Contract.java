package com.meysamzamani.datasynchronizer.domain.contract;

import com.meysamzamani.datasynchronizer.domain.customer.Customer;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = Contract.TABLE_NAME)
public class Contract {

    public static final String TABLE_NAME= "auftraege";

    @Id
    @SequenceGenerator(name = "contract_sequence", sequenceName = "contract_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contract_sequence")
    @Column(name = "auftragid")
    private Long auftragId;
    @Column(nullable = false, name = "artikelnummer")
    private String artikelNummer;
    @Column(nullable = false, name = "created")
    private LocalDate created;
    @Column(nullable = false, name = "lastchange")
    private LocalDate lastChange;
    @ManyToOne
    @JoinColumn(name="kundeid", nullable=false)
    private Customer kunde;

    public Contract() {}

    public Contract(String artikelNummer, LocalDate created, LocalDate lastChange, Customer kunde) {
        this.artikelNummer = artikelNummer;
        this.created = created;
        this.lastChange = lastChange;
        this.kunde = kunde;
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

    public Customer getKunde() {
        return kunde;
    }
}

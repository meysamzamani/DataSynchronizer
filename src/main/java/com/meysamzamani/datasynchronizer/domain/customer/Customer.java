package com.meysamzamani.datasynchronizer.domain.customer;

import jakarta.persistence.*;

@Entity
@Table(name = Customer.TABLE_NAME)
public class Customer {

    public static final String TABLE_NAME= "kunde";

    @Id
    @SequenceGenerator(name = "customer_sequence", sequenceName = "customer_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_sequence")
    @Column(name = "kundenid")
    private Long kundenId;
    @Column(nullable = false, name = "vorname", length = 100)
    private String vorName;
    @Column(nullable = false, name = "nachname", length = 100)
    private String nachName;
    @Column(unique = true, nullable = false, name = "email", length = 100)
    private String email;
    @Column(nullable = false, name = "strasse")
    private String strasse;
    @Column(nullable = false, name = "strassenzusatz")
    private String strassenZusatz;
    @Column(nullable = false, name = "ort")
    private String ort;
    @Column(nullable = false, name = "land")
    private String land;
    @Column(nullable = false, name = "plz")
    private String plz;
    @Column(nullable = false, name = "firmenname", length = 100)
    private String firmenName;

    public Customer() {}

    public Customer(String vorName, String nachName, String email, String strasse, String strassenZusatz, String ort, String land, String plz, String firmenName) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.email = email;
        this.strasse = strasse;
        this.strassenZusatz = strassenZusatz;
        this.ort = ort;
        this.land = land;
        this.plz = plz;
        this.firmenName = firmenName;
    }

    public Long getKundenId() {
        return kundenId;
    }

    public String getVorName() {
        return vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public String getEmail() {
        return email;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getStrassenZusatz() {
        return strassenZusatz;
    }

    public String getOrt() {
        return ort;
    }

    public String getLand() {
        return land;
    }

    public String getPlz() {
        return plz;
    }

    public String getFirmenName() {
        return firmenName;
    }
}

package com.royken.restapi.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kenfack Valmy-Roi <roykenvalmy@gmail.com>
 */
@Entity
@XmlRootElement(name="pointDeVente")
@XmlAccessorType(XmlAccessType.FIELD)
@Table(name = "pointdevente")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PointDeVente extends BaseClass{
    private static final long serialVersionUID = 1L;
    
  
    
    @Column(unique = true,name = "CODE")
    private String code;
    
    @Column(name = "NOM")
    private String nom;
    
    @Column(name = "BRAND")
    private String brand;
    
    @Column(name = "LATITUDE")
    private Double latitude;
    
    @Column(name = "LONGITUDE")
    private Double longitude;
    
    @Column(name = "CIRCUIT")
    private String circuit;
    
    @Column(name = "PROPRIO")
    private String proprio;
    
    @Column(name = "RATE")
    private int rate;
    
    @Column(name = "ADRESSE")
    private String adresse;
    
    @Column(name = "QUARTIER")
    private String quartier;
    
    @Column(name = "TEL")
    private String tel;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getCircuit() {
        return circuit;
    }

    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }

    public String getProprio() {
        return proprio;
    }

    public void setProprio(String proprio) {
        this.proprio = proprio;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "PointDeVente{"  + ", nom=" + nom + ", latitude=" + latitude + ", longitude=" + longitude + ", circuit=" + circuit + ", proprio=" + proprio + ", rate=" + rate + ", adresse=" + adresse + ", quartier=" + quartier + ", tel=" + tel + '}';
    }
    
}

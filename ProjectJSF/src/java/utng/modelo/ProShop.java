/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author janto
 */
@Entity
@Table(name = "pro_shop")
public class ProShop implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pro_shop")
    private Long idProShop;
    @Column(name = "opening_hours", length = 10)
    private String openingHours;
    @Column(length = 40)
    private String annualRevenue;
    @Column(length = 40)
    private String otherShopDetails;
    @ManyToOne
    @JoinColumn(name = "id_golf_club")
    private GolfClub golfClub;

    
    public ProShop(Long idProShop, String openingHours, String annualRevenue, String otherShopDetails, GolfClub golfClub) {
        this.idProShop = idProShop;
        this.openingHours = openingHours;
        this.annualRevenue = annualRevenue;
        this.otherShopDetails = otherShopDetails;
        this.golfClub = golfClub;
    }

    public ProShop() {
        idProShop = 0L;
    }

    public Long getIdProShop() {
        return idProShop;
    }

    public void setIdProShop(Long idProShop) {
        this.idProShop = idProShop;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getOtherShopDetails() {
        return otherShopDetails;
    }

    public void setOtherShopDetails(String otherShopDetails) {
        this.otherShopDetails = otherShopDetails;
    }

    public GolfClub getGolfClub() {
        return golfClub;
    }

    public void setGolfClub(GolfClub golfClub) {
        this.golfClub = golfClub;
    }

    
}

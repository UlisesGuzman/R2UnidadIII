/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author janto
 */
@Entity
@Table(name = "golf_club")

public class GolfClub implements Serializable
 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_golf_club")
    private Long idGolfClub;
    @Column(name = "club_name", length = 100)
    private String clubName;
    @Column(length = 150)
    private String yearEstablished;
    @Column(length = 30)
    private String clubAddress;
    @Column(length = 80)
    private String otherClubDetails;

    public GolfClub(Long idGolfClub, String clubName, String yearEstablished, String clubAddress,String otherClubDetails) {
        this.idGolfClub = idGolfClub;
        this.clubName = clubName;
        this.yearEstablished = yearEstablished;
        this.clubAddress = clubAddress;
        this.otherClubDetails = otherClubDetails;
    }

    public GolfClub() {
        this(0L, "", "", "", "");
    }

    public Long getIdGolfClub() {
        return idGolfClub;
    }

    public void setIdGolfClub(Long idGolfClub) {
        this.idGolfClub = idGolfClub;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getYearEstablished() {
        return yearEstablished;
    }

    public void setYearEstablished(String yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    public String getClubAddress() {
        return clubAddress;
    }

    public void setClubAddress(String clubAddress) {
        this.clubAddress = clubAddress;
    }

    public String getOtherClubDetails() {
        return otherClubDetails;
    }

    public void setOtherClubDetails(String otherClubDetails) {
        this.otherClubDetails = otherClubDetails;
    }

     
}


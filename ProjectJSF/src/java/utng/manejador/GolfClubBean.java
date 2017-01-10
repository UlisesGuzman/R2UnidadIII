/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.GolfClubDAO;
import utng.modelo.GolfClub;

/**
 *
 * @author janto
 */
@ManagedBean
@SessionScoped
public class GolfClubBean implements Serializable {

    private List<GolfClub> golfclubs;
    private GolfClub golfclub;

    public String listar() {
        GolfClubDAO dao = new GolfClubDAO();
        try {
            golfclubs = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Golf Clubs";
    }

    public String eliminar() {
        GolfClubDAO dao = new GolfClubDAO();
        try {
            dao.delete(golfclub);
            golfclubs = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String agregar() {
        golfclub = new GolfClub();
        return "Agregar";
    }

    public String guardar() {
        GolfClubDAO dao = new GolfClubDAO();
        try {
            if (golfclub.getIdGolfClub()!= 0) {
                dao.update(golfclub);
            } else {
                dao.insert(golfclub);
            }
            golfclubs = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(GolfClub golfclub) {
        this.golfclub = golfclub;
        return "Editar";
    }

    public List<GolfClub> getGolfclubs() {
        return golfclubs;
    }

    public void setGolfclubs(List<GolfClub> golfclubs) {
        this.golfclubs = golfclubs;
    }

    public GolfClub getGolfclub() {
        return golfclub;
    }

    public void setGolfclub(GolfClub golfclub) {
        this.golfclub = golfclub;
    }

    
}

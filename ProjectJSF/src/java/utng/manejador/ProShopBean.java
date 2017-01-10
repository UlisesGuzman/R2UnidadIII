/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

/**
 *
 * @author janto
 */
import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.ProShopDAO;
import utng.datos.GolfClubDAO;
import utng.modelo.ProShop;
import utng.modelo.GolfClub;

@ManagedBean
@SessionScoped
public class ProShopBean implements Serializable {

    private List<ProShop> proshops;
    private ProShop proshop;
    private List<GolfClub> golfclubs;

    public ProShopBean() {
        proshop = new ProShop();
        proshop.setGolfClub(new GolfClub());
    }

    public String listar() {
        ProShopDAO dao = new ProShopDAO();
        try {
            proshops = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ProShops";
    }

    public String eliminar() {
        ProShopDAO dao = new ProShopDAO();
        try {
            dao.delete(proshop);
            proshops = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String agregar() {
        proshop = new ProShop();
        proshop.setGolfClub(new GolfClub());
        try {
            golfclubs = new GolfClubDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Agregar";
    }

    public String guardar() {
        ProShopDAO dao = new ProShopDAO();
        try {
            if (proshop.getIdProShop()!= 0) {
                dao.update(proshop);
            } else {
                dao.insert(proshop);
            }
            proshops = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(ProShop proshop) {
        this.proshop = proshop;
        try {
            golfclubs = new GolfClubDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }

    public List<ProShop> getProshops() {
        return proshops;
    }

    public void setProshops(List<ProShop> proshops) {
        this.proshops = proshops;
    }

    public ProShop getProshop() {
        return proshop;
    }

    public void setProshop(ProShop proshop) {
        this.proshop = proshop;
    }

    public List<GolfClub> getGolfclubs() {
        return golfclubs;
    }

    public void setGolfclubs(List<GolfClub> golfclubs) {
        this.golfclubs = golfclubs;
    }

    
    
}

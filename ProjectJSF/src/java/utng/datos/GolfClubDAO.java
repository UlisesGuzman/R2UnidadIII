/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.GolfClub;

/**
 *
 * @author janto
 */
public class GolfClubDAO extends DAO<GolfClub> {
        public GolfClubDAO() {
        super(new GolfClub());
    }

    public GolfClub getOneById(GolfClub golfclub) throws HibernateException {
        return super.getOneById(golfclub.getIdGolfClub());
    }
   
}

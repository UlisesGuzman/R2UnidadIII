/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.ProShop;

/**
 *
 * @author janto
 */
public class ProShopDAO extends DAO<ProShop> {

    public ProShopDAO() {
        super(new ProShop());
    }

    public ProShop getOneById(ProShop proshop) throws HibernateException {
        return super.getOneById(proshop.getIdProShop());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entidades.TbPrb;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author david
 */
@Stateless
public class TbPrbFacade extends AbstractFacade<TbPrb> {

    @PersistenceContext(unitName = "PruebaJava1GitPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbPrbFacade() {
        super(TbPrb.class);
    }
    
}

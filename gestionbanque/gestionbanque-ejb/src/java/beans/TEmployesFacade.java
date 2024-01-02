/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import entity.TEmployes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ibelm
 */
@Stateless
public class TEmployesFacade extends AbstractFacade<TEmployes> {

    @PersistenceContext(unitName = "JeeEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TEmployesFacade() {
        super(TEmployes.class);
    }
    
}

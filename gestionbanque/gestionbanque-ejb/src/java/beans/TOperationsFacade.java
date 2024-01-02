/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import entity.TComptes;
import entity.TOperations;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ibelm
 */
@Stateless
public class TOperationsFacade extends AbstractFacade<TOperations> {

    @PersistenceContext(unitName = "JeeEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TOperationsFacade() {
        super(TOperations.class);
    }

    // versement 
    public void versement(int sourceAccountNumber, double amount) {
        try {
            TComptes sourceAccount = em.find(TComptes.class, sourceAccountNumber);

            if (sourceAccount == null) {
                throw new IllegalArgumentException("Invalid account number");
            }

            // Perform the versement operation
            sourceAccount.setSolde(sourceAccount.getSolde() + amount);

            em.merge(sourceAccount);

        } catch (Exception e) {
            throw new RuntimeException("Error performing versement: " + e.getMessage(), e);
        }
    }

// retrait 
    public void retrait(int AccountNumber, double amount) {
        try {
            TComptes sourceAccount = em.find(TComptes.class, AccountNumber);

            if (sourceAccount == null) {
                throw new IllegalArgumentException("Invalid account number");
            }

            if (sourceAccount.getSolde() < amount) {
                throw new IllegalArgumentException("Insufficient funds");
            }

            // Perform the versement operation
            sourceAccount.setSolde(sourceAccount.getSolde() - amount);

            em.merge(sourceAccount);

        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Error performing versement: " + e.getMessage(), e);
        }
    }

}

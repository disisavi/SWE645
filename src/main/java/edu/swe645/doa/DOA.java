package edu.swe645.doa;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DOA {
    private static DOA doa;
    private Session session;
    private Transaction transaction;

    private DOA() {
        this.session = HibernateUtil.getSessionFactory().openSession();
        transaction = this.session.beginTransaction();
    }

    public static DOA getDoa() {
        if (doa == null) {
            synchronized (DOA.class) {
                if (doa == null) {
                    doa = new DOA();
                }
            }
        }
        return doa;
    }

    void getNewSession() {
        this.session = HibernateUtil.getSessionFactory().openSession();
        transaction = this.session.beginTransaction();
    }

    void startTrasaction() {
        transaction.begin();
    }

    public Object getByKey(Class className, String key) {
        if (!this.transaction.isActive()) {
            this.startTrasaction();
        }
        Object object = this.session.get(className, key);
        this.commit();
        return object;
    }

    public void updateObject(Object object) {
        if (!this.transaction.isActive()) {
            this.startTrasaction();
        }
        this.session.update(object);
    }

    public synchronized void persistNewObject(Object object) {
        if (!this.transaction.isActive()) {
            this.startTrasaction();
        }
        this.session.persist(object);
    }

    public Set<Object> getAll(Class classname) {
        if (!this.transaction.isActive()) {
            this.startTrasaction();
        }

        List<Object> objects = (List<Object>) this.session.createCriteria(classname).list();
        Set<Object> retrunObjectSet = new HashSet<>(objects);

        this.commit();
        return retrunObjectSet;
    }


    public void shutdown() {
        this.session.close();
        try {
            HibernateUtil.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void commit() {
        try {
            this.session.getTransaction().commit();
            this.getNewSession();
        } catch (Exception e) {
            this.session.getTransaction().rollback();
            throw e;
        }
    }


}

package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class genericDAO<T> {
	private final Class<T> typeParameterClass;

    public genericDAO(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }
	
	public void salvar(T t){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(t);
		transaction.commit();
		session.close();
	}
	
	public void atualizar(T t){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(t);
		transaction.commit();
		session.close();
	}
	
	public void remover(T t){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(t);
		transaction.commit();
		session.close();
	}
	
	public T findByID(int ID){
		T t;
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		t = session.get(typeParameterClass, ID);
		
		transaction.commit();
		session.close();
		
		return t;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findByParam(String param, String arg){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		List<T> t = session.createQuery(
				"SELECT t "
				+ "FROM " + typeParameterClass + " t "
				+ "WHERE t." + param + "= '" + arg + "'").getResultList();
		
		transaction.commit();
		session.close();
		
		return t;
	}
	
	
}

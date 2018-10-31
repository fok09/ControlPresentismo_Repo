package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.Contratacion;
import hbt.HibernateUtil;

public class ContratacionDAO {
	private static ContratacionDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static ContratacionDAO getInstancia(){
		if (instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new ContratacionDAO();
		}
		return instancia;
	}
	
	public void grabarContratacion(Contratacion contratacion) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.merge(contratacion);
		session.flush();
		session.getTransaction().commit();
	}
	
	public Contratacion getByClienteId(int idCliente) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Contratacion cont = (Contratacion) session.createQuery("FROM Contratacion CO INNER JOIN Cliente C WHERE C.id = " + idCliente).uniqueResult();
		session.getTransaction().commit();
		return cont;
	}
	
	
}

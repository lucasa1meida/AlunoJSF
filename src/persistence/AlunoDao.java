package persistence;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Aluno;

public class AlunoDao {

	Session session;
	Transaction transaction;
	Query query;
	
	public void create(Aluno a) throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
				session.save(a);
			transaction.commit();
		session.close();
	}
	
	public List<Aluno> findAll(){
		session = HibernateUtil.getSessionFactory().openSession();
		List<Aluno> lista = session.createQuery("select a from Aluno as a").list();
		session.close();
		return lista;
	}
}

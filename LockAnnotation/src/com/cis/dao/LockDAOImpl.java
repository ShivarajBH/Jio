package com.cis.dao;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

//import com.cis.dao.LockDAO;




//import com.cis.dao.model.Agency;
import com.cis.model.Lock;



@Repository("lockDAO")
public class LockDAOImpl implements LockDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
		public  void addLock(Lock lock) {
			sessionFactory.getCurrentSession().saveOrUpdate(lock);				
		}
		
	@SuppressWarnings("unchecked")
		public List<Lock> getAllLocks() {
			return (List<Lock>) sessionFactory.getCurrentSession().createCriteria(Lock.class).list();
		}
		
	
	public Lock getLock(Integer lockSno) {
		
			return (Lock) sessionFactory.getCurrentSession().get(Lock.class, lockSno);
		
		}

		public void deleteLock(Lock lock) {
		
			sessionFactory.getCurrentSession().createQuery("DELETE FROM Lock WHERE lockSno= "+lock.getLockSno()).executeUpdate();
		}

		


}

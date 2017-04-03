package com.cis.service;
import java.util.*;

import com.cis.dao.LockDAO;
import com.cis.model.Lock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("lockService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class LockServiceImpl implements LockService {
	
	@Autowired
	private LockDAO lockDAO;
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addLock(Lock lock) {
		lockDAO.addLock(lock);
	}
	
	public List<Lock> getAllLocks() {
		return lockDAO.getAllLocks();
	}

	public Lock getLock(int lockSno) {
		return lockDAO.getLock(lockSno);
	}
	
	public void deleteLock(Lock lock) {
		lockDAO.deleteLock(lock);
	}

}



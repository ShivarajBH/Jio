package com.cis.dao;
import java.util.List;

import com.cis.model.Lock;

public interface LockDAO {
	//public Integer saveLock(Lock lock);
	public void addLock(Lock lock);
	public List<Lock> getAllLocks();
	public Lock getLock(Integer lockSno);
	public void deleteLock(Lock lock);
	//public void updateLock(Lock lock);

}

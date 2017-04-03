package com.cis.service;
import java.util.List;
import com.cis.model.Lock;
public interface LockService {
	public void addLock(Lock lock);
	public List<Lock> getAllLocks();
	public Lock getLock(int lockSno);
	public void deleteLock(Lock lock);
}

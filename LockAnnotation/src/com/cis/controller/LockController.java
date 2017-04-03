package com.cis.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cis.beans.LockBean;
import com.cis.model.Lock;
import com.cis.service.LockService;


@Controller   //annotation marks this class as spring bean which may handle different HTTP requests based on mapping specified 
                               //on class or individual controller methods. 
public class LockController {
	
	@Autowired
	private LockService lockService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)//You use the @RequestMapping spring annotation to map URLs 
	                                                               //onto an entire class or a particular handler method
	public ModelAndView saveLock(@ModelAttribute("command") LockBean lockBean, BindingResult result)//method argument indicates 
	                                                                                         //the argument should be retrieved from the model.
	{
	System.out.println("hi");
		Lock lock = prepareModel(lockBean);
		lockService.addLock(lock);
		return new ModelAndView("redirect:/locklist.html");
	}

	@RequestMapping(value="/locklist", method = RequestMethod.GET)
	public ModelAndView getAllLocks() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("lock1",  prepareListofBean(lockService.getAllLocks()));
		return new ModelAndView("locklist", model);
	}

	@RequestMapping(value = "/insertlock", method = RequestMethod.GET)
	public ModelAndView addLock(@ModelAttribute("command")  LockBean lockBean,BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("lock1",  prepareListofBean(lockService.getAllLocks()));
		return new ModelAndView("insertlock", model);
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView editLock(@ModelAttribute("command")  LockBean lockBean,
			BindingResult result) {
		lockService.deleteLock(prepareModel(lockBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("lock", null);
		model.put("lock1",  prepareListofBean(lockService.getAllLocks()));
		return new ModelAndView("insertlock", model);
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView deleteLock(@ModelAttribute("command")  LockBean lockBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("lock", prepareLockBean(lockService.getLock(lockBean.getLockSno())));
		model.put("lock1",  prepareListofBean(lockService.getAllLocks()));
		return new ModelAndView("insertlock", model);
	}
	
	private Lock prepareModel(LockBean lockBean){
		Lock lock = new Lock();
		lock.setLockPrice(lockBean.getLockPrice());
		lock.setLockModel(lockBean.getLockModel());
		lock.setLockColor(lockBean.getLockColor());
		lock.setLockKind(lockBean.getLockKind());
		lock.setLockSize(lockBean.getLockSize());
		lock.setHeight(lockBean.getHeight());
		lock.setDepth(lockBean.getDepth());
		lock.setWidth(lockBean.getWidth());
		lock.setWeight(lockBean.getWeight());
		lock.setLockSno(lockBean.getLockSno());
		lockBean.setLockSno(null);
		return lock;
	}
	
	private List<LockBean> prepareListofBean(List<Lock> lock){
		List<LockBean> beans = null;
		if(lock != null && !lock.isEmpty()){
			beans = new ArrayList<LockBean>();
			LockBean bean = null;
			for(Lock lock1 : lock){
				bean = new LockBean();
				
				bean.setLockPrice(lock1.getLockPrice());
				bean.setLockSno(lock1.getLockSno());
				bean.setLockModel(lock1.getLockModel());
				bean.setLockColor(lock1.getLockColor());
				bean.setLockKind(lock1.getLockKind());
				bean.setLockSize(lock1.getLockSize());
				bean.setHeight(lock1.getHeight());
				bean.setDepth(lock1.getDepth());
				bean.setWidth(lock1.getWidth());
				bean.setWeight(lock1.getWeight());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	private LockBean prepareLockBean(Lock lock)
	{
		LockBean bean = new LockBean();
		
		bean.setLockPrice(lock.getLockPrice());
		bean.setLockSno(lock.getLockSno());
		bean.setLockModel(lock.getLockModel());
		bean.setLockColor(lock.getLockColor());
		bean.setLockKind(lock.getLockKind());
		bean.setLockSize(lock.getLockSize());
		bean.setHeight(lock.getHeight());
		bean.setDepth(lock.getDepth());
		bean.setWidth(lock.getWidth());
		bean.setWeight(lock.getWeight());
		return bean;
	}
}

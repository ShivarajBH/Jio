package com.cis.beans;

public class LockBean {
	
	private Integer lockSno;
	private Integer lockPrice;
	private String lockModel;
	private String lockColor;
	private String lockKind;
	private String lockSize;
	private Integer height;
	private Integer depth;
	private Integer width;
	private Integer weight;
	
	
	public String getLockKind() {
		return lockKind;
	}
	public void setLockKind(String lockKind) {
		this.lockKind = lockKind;
	}
	public String getLockSize() {
		return lockSize;
	}
	public void setLockSize(String lockSize) {
		this.lockSize = lockSize;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getDepth() {
		return depth;
	}
	public void setDepth(Integer depth) {
		this.depth = depth;
	}
	public Integer getLockSno() {
		return lockSno;
	}
	public Integer getLockPrice() {
		return lockPrice;
	}
	public String getLockModel() {
		return lockModel;
	}
	public String getLockColor() {
		return lockColor;
	}
	public Integer getWidth() {
		return width;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setLockSno(Integer lockSno) {
		this.lockSno = lockSno;
	}
	public void setLockPrice(Integer lockPrice) {
		this.lockPrice = lockPrice;
	}
	public void setLockModel(String lockModel) {
		this.lockModel = lockModel;
	}
	public void setLockColor(String lockColor) {
		this.lockColor = lockColor;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
}

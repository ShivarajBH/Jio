package com.cis.model;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="lock4")
public class Lock implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2666752100196191762L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "lockSno")
	private Integer lockSno;
	
	@Column(name = "lockPrice")
	private Integer lockPrice;
	
	@Column(name = "lockModel")
	private String lockModel;
	
	@Column(name = "lockColor")
	private String lockColor;
	
	
	@Column(name="lockKind")
	private String lockKind;
	
	@Column(name="lockSize")
	private String lockSize;
	
	@Column(name="height")
	private Integer height;
	
	@Column (name="depth")
	private Integer depth;
	
	@Column(name = "width")
	private Integer width;
	
	@Column(name = "weight")
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

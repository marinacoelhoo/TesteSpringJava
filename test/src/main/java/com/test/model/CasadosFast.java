package com.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CasadosFast {
	@Id
	private String id;
	private String customerFullName;
	private String customerName;
	private String customerGender;
	private String customerPhoto;
	private String partnerFullName;
	private String partnerName;
	private String partnerPhoto;
	private String partnerGender;
	private String city;
	private String state;
	private Integer weddingListNumber;
	private String weddingDay;
	private Boolean old;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomerFullName() {
		return customerFullName;
	}
	
	
	
	
	
	public void setCustomerFullName(String customerFullName) {
		this.customerFullName = customerFullName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public String getCustomerPhoto() {
		return customerPhoto;
	}
	public void setCustomerPhoto(String customerPhoto) {
		this.customerPhoto = customerPhoto;
	}
	public String getPartnerFullName() {
		return partnerFullName;
	}
	public void setPartnerFullName(String partnerFullName) {
		this.partnerFullName = partnerFullName;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public String getPartnerPhoto() {
		return partnerPhoto;
	}
	public void setPartnerPhoto(String partnerPhoto) {
		this.partnerPhoto = partnerPhoto;
	}
	public String getPartnerGender() {
		return partnerGender;
	}
	public void setPartnerGender(String partnerGender) {
		this.partnerGender = partnerGender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getWeddingListNumber() {
		return weddingListNumber;
	}
	public void setWeddingListNumber(Integer weddingListNumber) {
		this.weddingListNumber = weddingListNumber;
	}
	public String getWeddingDay() {
		return weddingDay;
	}
	public void setWeddingDay(String weddingDay) {
		this.weddingDay = weddingDay;
	}
	public Boolean getOld() {
		return old;
	}
	public void setOld(Boolean old) {
		this.old = old;
	}
	
	
}

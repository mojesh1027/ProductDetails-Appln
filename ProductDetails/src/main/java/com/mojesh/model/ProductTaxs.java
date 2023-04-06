package com.mojesh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductTaxs {
  @Id
  @Column(length=25)
  private String pcategery;
  @Column(length=10)
  private Double discount;
  @Column(length=10)
  private Double gst;
  @Column(length=10)
  private Double delivarycharges;
  @Column(length=10)
  private Integer pid;
public ProductTaxs(String pcategery, Double discount, Double gst, Double delivarycharges, Integer pid) {
	super();
	this.pcategery = pcategery;
	this.discount = discount;
	this.gst = gst;
	this.delivarycharges = delivarycharges;
	this.pid = pid;
}
public ProductTaxs() {
	super();
}
public String getPcategery() {
	return pcategery;
}
public void setPcategery(String pcategery) {
	this.pcategery = pcategery;
}
public Double getDiscount() {
	return discount;
}
public void setDiscount(Double discount) {
	this.discount = discount;
}
public Double getGst() {
	return gst;
}
public void setGst(Double gst) {
	this.gst = gst;
}
public Double getDelivarycharges() {
	return delivarycharges;
}
public void setDelivarycharges(Double delivarycharges) {
	this.delivarycharges = delivarycharges;
}
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
@Override
public String toString() {
	return "ProductTaxs [pcategery=" + pcategery + ", discount=" + discount + ", gst=" + gst + ", delivarycharges="
			+ delivarycharges + ", pid=" + pid + "]";
} 
}
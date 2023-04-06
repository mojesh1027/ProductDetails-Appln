package com.mojesh.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class ProductDetails {
	  @Id
	  @SequenceGenerator(name = "pcategery_Sequence", sequenceName = "ORACLE_DB_SEQ_PCATEGERY")
	  @Column(length=10)
	  private Integer pid;
	  @Column(length=30)
	  private String pname;
	  @Column(length=30)
	  private String ptype;
	  @Column(length=25)
	  private String pcategery;
	  @Column(length=25)
	  private Double price;
	  
	  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	  private ProductTaxs ProductTaxes;
	  @Column(length=10)
	  private Double finalPrice;

	public ProductDetails() {
		super();
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getPcategery() {
		return pcategery;
	}

	public void setPcategery(String pcategery) {
		this.pcategery = pcategery;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProductTaxs getProductTaxes() {
		return ProductTaxes;
	}

	public void setProductTaxes(ProductTaxs productTaxes) {
		ProductTaxes = productTaxes;
	}

	public Double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}

	@Override
	public String toString() {
		return "ProductDetails [pid=" + pid + ", pname=" + pname + ", ptype=" + ptype + ", pcategery=" + pcategery
				+ ", price=" + price + ", ProductTaxes=" + ProductTaxes + ", finalPrice=" + finalPrice + "]";
	}
	
}

package com.mojesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mojesh.model.ProductDetails;
import com.mojesh.model.ProductTaxs;
import com.mojesh.repo.ProductDeatilsRepo;
import com.mojesh.repo.ProductTaxsRepo;
@Service
public class ProductServiceImp implements ProductServiceDetails {

	@Autowired
	private ProductDeatilsRepo prepo;
	@Autowired
	private ProductTaxsRepo trepo;
	@Override
	public ProductDetails savedetails(ProductDetails product) {
		
		String categery=product.getPcategery();
		double dis=0.00,gst=0.00,dchar=0.00,tol=0.00;
		tol=product.getPrice();
		if(categery.equalsIgnoreCase("electonics"))
		{
			dis=tol*15/100;
			gst=tol*18/100;
			dchar=350;
		}
		else if(categery.equalsIgnoreCase("home appliances"))
		{
			dis=tol*22/100;
			gst=tol*24/100;
			dchar=800;
		}
		else if(categery.equalsIgnoreCase("clothing"))
		{
			dis=tol*40/100;
			gst=tol*12/100;
			dchar=0.00;
		}
		else if(categery.equalsIgnoreCase("furniture"))
		{
			dis=tol*10/100;
			gst=tol*18/100;
			dchar=300;
		}
		product.setFinalPrice(tol-dis+gst+dchar);
		ProductTaxs tax=new ProductTaxs();
		tax.setDiscount(dis);
		tax.setGst(gst);
		tax.setDelivarycharges(dchar);
		tax.setPcategery(categery);
		tax.setPid(product.getPid());
		trepo.save(tax);
		product.setProductTaxes(tax);
		ProductDetails p=product;
		return prepo.save(p);
		
	}
	@Override
	public ProductDetails getdetails(String pcategery) {
		ProductDetails pd=prepo.findById(pcategery).get();
		return pd;
	}
	

}

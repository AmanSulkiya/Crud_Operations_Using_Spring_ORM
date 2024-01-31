package com.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.model.Product;


@Component
public class ProductDao {
    
    @Autowired//here, we are automatically generate the object of HibernateTemplate class...why we generate the object of HibernateTemplate class...bcz we want to use its readymade method like(save(insert),delete(delete),saveOrUpdate(update)
    private HibernateTemplate hibernateTemplate;
    
    //create/insert product into database
    @Transactional        //@Transactional annotation is used only in case of create,insert ,update,delete opeartion..not for select/get operation
    public void saveProduct(Product p) {
        
        hibernateTemplate.saveOrUpdate(p);
    }
    
   
    public List<Product> getProduct(){
    	
    	List<Product> products = this.hibernateTemplate.loadAll(Product.class);
    	return products;
    }
    
    @Transactional
    public void deleteProduct(int p1) {
    	
    	
        Product p =  this.hibernateTemplate.load(Product.class,p1);
        this.hibernateTemplate.delete(p);
        
    }
    
    
    
  //get the single product  //select
	  public Product getProduct(int pid)
	  {
		  return this.hibernateTemplate.get(Product.class,pid);
	 }

}
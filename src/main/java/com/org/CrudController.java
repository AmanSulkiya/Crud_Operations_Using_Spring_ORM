package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Dao.ProductDao;
import com.model.Product;

@Controller
public class CrudController {
    
    @Autowired
    private ProductDao  productDao;
    
    //show add product form
        @RequestMapping("/add_p")
        public String addProduct(Model m)
        {
//            m.addAttribute("title","Add Product");
            return "add_product_form";
        }
        
        
        @RequestMapping("/hm")
        public String showData(Model m){
        	
        	List<Product> products = productDao.getProduct();
        	 m.addAttribute("title","Add Product");
        	 m.addAttribute("product",products);
        	
			return "index1";
        	
        }
        
		/*
		 * @RequestMapping("/hm") public String deleteData(Model m){ Product products =
		 * productDao.deleteProduct(p); m.addAttribute("title","Add Product");
		 * m.addAttribute("product",products);
		 * 
		 * return "index1";
		 * 
		 * }
		 */
    
    
    //handle or add product
    @RequestMapping("/handle_product")
    public String insertData(@ModelAttribute Product prod) {
        
        productDao.saveProduct(prod);
        
        return "redirect:/hm";
        
        
    }
    
    

   
    	@RequestMapping("/delete/{productId}")  //68
    	public String  deleteProduct(@PathVariable("productId") int productId)
    	{
    		productDao.deleteProduct(productId); //41
    		
    		return "redirect:/hm";
    		}
    	
    
    
    
    
    //up
    @RequestMapping("/update/{productId}")
    public String updateProduct(@PathVariable("productId") int productId, Model m)
    {
    	Product product =productDao.getProduct(productId);
    	
    	m.addAttribute("product",product);
    	return "update_form";
    	
    }


    
    
    
    

}

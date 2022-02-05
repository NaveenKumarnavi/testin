package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Product;
import service.ProductService;

@RestController
public class ProductController {

	@Autowired
		    private ProductService service;
	
		    @PostMapping("/addProduct")
		    public Product addProduct(@RequestBody Product product){
		        return service.saveProduct(product);
		    }
		    @PostMapping("/addProducts")
		    public List<Product> addProducts(@RequestBody List<Product> products){
		        return service.saveProducts(products);
		    }
		    @GetMapping("/Products")
		    public Product findAllProducts(@RequestBody Product products){
		        return service.getproducts(products);
		    }
		    @GetMapping("/Products/{psaf_sys_id}")
		    public Product findProductByPsaf_sys_id(@PathVariable int psaf_sys_id){
		        return service.getProductByPsaf_sys_id(psaf_sys_id);
		    }
		  
		    @PutMapping("/update")
		    public Product updateProduct(@RequestBody Product product){
		        return service.saveProduct(product);
		    }

		    @DeleteMapping("/delete/{psaf_sys_id}")
		    public int deleteProduct(@PathVariable int psaf_sys_id){
		        return service.deleteProduct(psaf_sys_id);
		    }

	
}

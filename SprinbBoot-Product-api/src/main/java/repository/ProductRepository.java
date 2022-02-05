package repository;



import org.springframework.data.jpa.repository.JpaRepository;


import entity.Product;


public interface ProductRepository extends JpaRepository<Product,Integer>{


	void deleteByPsaf_sys_id(int psaf_sys_id);

	Product findAll(Product products);

	Product findByPsaf_sys_id(int psaf_sys_id);


}

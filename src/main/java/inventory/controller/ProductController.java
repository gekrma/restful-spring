package inventory.controller;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import inventory.entity.Product;
import inventory.exception.ProductNotFoundException;
import inventory.model.dao.ProductRepository;

@RestController
public class ProductController extends HttpServlet {

	@Autowired
	private ProductRepository repo;
	
	// GET - http://127.0.0.1:8000/product
	@GetMapping( "/product" )
	public Iterable<Product> getInventory() {
		return repo.findAll();
	}
	
	// GET - http://127.0.0.1:8000/product/{id}
	@GetMapping( "/product/{id}" )
	public Product getProduct( @PathVariable Long id ) {
		return repo.findById( id ).orElseThrow( () -> new ProductNotFoundException( id ) );
	}
	
	// POST - http://127.0.0.1:8000/product
	@PostMapping( "/product" )
	public Product insertProduct( @RequestBody Product product ) {
		return repo.save( product );
	}
	
	// PUT - http://127.0.0.1:8000/product/1
	@PutMapping( "/product/{id}" )
	public Product updateProduct( @RequestBody Product newProduct, @PathVariable Long id ) {
		Product product = repo.findById( id ).orElseThrow( () -> new ProductNotFoundException( id ) );
		
		product.setName( newProduct.getName() );
		product.setPrice( newProduct.getPrice() );
		product.setQuantity( newProduct.getQuantity() );
		
		return repo.save( product );
	}
	
	// DELETE - http://127.0.0.1:8000/product/1
	@DeleteMapping( "/product/{id}" )
	public void deleteProduct( @PathVariable Long id ) {
		repo.findById( id ).orElseThrow( () -> new ProductNotFoundException( id ) );
		repo.deleteById( id );
	}
}

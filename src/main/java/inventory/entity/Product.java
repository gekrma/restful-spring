package inventory.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Product {
	@Id @GeneratedValue( generator = "product_id_seq" )
	private Long id;
	private String name;
	private Long price;
	private int quantity;
}

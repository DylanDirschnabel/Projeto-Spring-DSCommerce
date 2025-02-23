package com.devsuperior.dscommerce.entities;

import java.time.Instant;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_payment")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant moment;
		
	@OneToOne
	@MapsId
	private Order order;
	
	public Payment() {}
	
	public Payment(Long id, Instant moment, Order order) {
		setId(id);
		setMoment(moment);
		setOrder(order);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	
}

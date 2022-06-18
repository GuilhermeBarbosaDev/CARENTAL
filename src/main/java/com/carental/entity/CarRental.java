package com.carental.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CAR_RENTAL")
public class CarRental extends Automobile{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="RT_ID", nullable=false)
	private Long rentalId;
	
    @Column(name="RT_NAME", nullable=false, length=120)
	private String rentalName;
	
    @Column(name="RT_CARS_ID", nullable=false)
	private Automobile cars;

	
	
    
    
	/**
	 * @param id
	 * @param name
	 * @param brand
	 * @param price
	 * @param rentalId
	 * @param rentalName
	 * @param cars
	 */
	public CarRental(Long id, String name, String brand, Double price, Long rentalId, String rentalName, Automobile cars) {
		super(id, name, brand, price);
		this.rentalId = rentalId;
		this.rentalName = rentalName;
		this.cars = cars;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cars == null) ? 0 : cars.hashCode());
		result = prime * result + ((rentalId == null) ? 0 : rentalId.hashCode());
		result = prime * result + ((rentalName == null) ? 0 : rentalName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarRental other = (CarRental) obj;
		if (cars == null) {
			if (other.cars != null)
				return false;
		} else if (!cars.equals(other.cars))
			return false;
		if (rentalId == null) {
			if (other.rentalId != null)
				return false;
		} else if (!rentalId.equals(other.rentalId))
			return false;
		if (rentalName == null) {
			if (other.rentalName != null)
				return false;
		} else if (!rentalName.equals(other.rentalName))
			return false;
		return true;
	}


	public Long getRentalId() {
		return rentalId;
	}

	public void setRentalId(Long rentalId) {
		this.rentalId = rentalId;
	}

	public String getRentalName() {
		return rentalName;
	}

	public void setRentalName(String rentalName) {
		this.rentalName = rentalName;
	}

	public Automobile getCars() {
		return cars;
	}

	public void setCars(Automobile cars) {
		this.cars = cars;
	}
	
	


	
}

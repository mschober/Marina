package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import play.db.jpa.Model;

@Entity
public class Slip extends Model {

	public String name;
	
	@OneToOne
	public Boat boat;

	public Slip(String name, Boat boat) {
		this.name = name;
		this.boat = boat;
	}
	
	@Override
	public String toString(){
		Serializable formatBoat = (boat == null)? "<Empty>" : boat;
		return "[" + name + "]: " + formatBoat;
	}

}

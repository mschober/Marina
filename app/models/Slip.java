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

	@OneToOne
	public Size size;

	public Slip(String name, Boat boat) {
		this.name = name;
		this.boat = boat;
		this.size = new Size(0, 0);
	}
	
	@Override
	public String toString(){
		Serializable formatBoat = (boat == null)? "" : boat;
		return "[" + name + "]: " + formatBoat;
	}

	public String toFullString() {
		return toString().concat("\n").concat(size.toString());
	}

	public Slip setLength(int length) {
		this.size.setLength(length).save();
		return this;
	}

	public Slip setBeam(int beam) {
		this.size.setBeam(beam).save();
		return this;
	}

}

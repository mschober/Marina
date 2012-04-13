package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.OneToOne;


import play.db.jpa.Model;
import utils.MarinaFactory;
import utils.MarinaHelper;

@Entity
public class Slip extends Model {

	public static final String SLIP_SIZE = "Slip Size: ";

	public String name;
	
	@OneToOne
	public Boat boat;

	@OneToOne
	public Size size;

	public Slip(String name, Boat boat) {
		this.name = name;
		this.boat = boat;
		this.size = MarinaFactory.size();
	}
	
	@Override
	public String toString(){
		return formatName(name).concat(formatBoat(boat));
	}

	public String toFullString() {
		return formatName(name, size) + formatBoat(boat);
	}

	public Slip setLength(int length) {
		this.size.setLength(length).save();
		return this;
	}

	public Slip setBeam(int beam) {
		this.size.setBeam(beam).save();
		return this;
	}

	public static String formatName(String name, Size size) {
		return formatName(name.concat(size.toString()));
	}

	public static String formatName(String string) {
		return "[".concat(string).concat("]: ");
	}
	
	private static String formatBoat(Boat b) {
		return (b == null)? "" : b.toString();
	}

}

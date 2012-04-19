package models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import play.data.validation.Required;
import play.db.jpa.Model;
import utils.MarinaFactory;

@Entity
public class Slip extends Model {

	static final String NEW_SLIP = "New Slip";

	public static final String SLIP_SIZE = "Slip Size: ";

	public String name;
	
	@OneToOne
	public Boat boat;

	@OneToOne
	@Required
	public Size size;

	public Slip(String name, Size size, Boat boat) {
		this(name, size);
		this.boat = boat;
	}

	public Slip() {
		this(NEW_SLIP, null, null);
	}

	public Slip(String name, Size size) {
		this.name = name;
		this.size = size;
	}

	public Slip(String name) {
		this(name, null, null);
	}

	@Override
	public String toString(){
		return name.concat(formatBoat(boat));
	}

	public String toFullString() {
//		return PrintFormatter.format(new Slip(name, size)) + formatBoat(boat);
		return "";
	}

	private static String formatBoat(Boat b) {
		return (b == null)? "" : b.toString();
	}
}

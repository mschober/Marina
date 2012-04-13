package models;


import javax.persistence.Entity;

import play.db.jpa.GenericModel;
import play.db.jpa.Model;

@Entity
public class Size extends Model {
	
	public Integer length;
	public Integer beam;

	public Size(int length, int beam){
		this.length = length;
		this.beam = beam;
	}

	public Size setLength(int length2) {
		this.length = length2;
		return this;
	}

	public Size setBeam(int beam2) {
		this.beam = beam2;
		return this;
	}
	
	@Override
	public String toString(){
		return format(this);
	}

	public static String format(Size size) {
		return " -> (Length: " + size.length + ", " + "Beam: " + size.beam + ")"; 
	}
	
}

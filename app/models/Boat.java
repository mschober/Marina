package models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import play.db.jpa.Model;
import utils.MarinaFactory;

@Entity
public class Boat extends Model {
	
	public String name;
	
	@OneToOne
	public Size size;

	public Boat(String name){
		this(name, MarinaFactory.size());
	}
	
	public Boat(String name, Size size){
		this.name = name;
		this.size = size;
	}
	
	@Override
	public String toString(){
		return name.concat(formatSize(size));
	}

	private String formatSize(Size size2) {
		return (size2 == null)? "": size2.toString();
	}

	public void setSize(Size size) {
		this.size = size;
	}

}

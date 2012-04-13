package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
import utils.MarinaFactory;

@Entity
public class Boat extends Model {
	
	public String name;
	public Size size;

	public Boat(String name){
		this.name = name;
		this.size = MarinaFactory.size();
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

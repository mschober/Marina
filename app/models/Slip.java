package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Slip extends Model {

	public String name;
	public Boat boat;

	public Slip(String name, Boat boat) {
		this.name = name;
		this.boat = boat;
	}

}

package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Boat extends Model {
	
	public String name;

	public Boat(String name){
		this.name = name;
	}
	
	@Override
	public String toString(){
		return name;
	}

}

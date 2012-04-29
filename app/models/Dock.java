package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Dock extends Model {

	@OneToMany
	public List<Slip> slips;
	public String name;
	
	public Dock(String name, List<Slip> slips){
		this.name = name;
		this.slips = slips;
	}

	public int slipCount() {
		return slips.size();
	}

}

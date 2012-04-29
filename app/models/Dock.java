package models;

import java.util.Arrays;
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
		setName(name);
		setSlips(slips);
	}

	public void setSlips(List<Slip> slips2) {
		this.slips = (slips2 != null)? slips2: Arrays.asList(new Slip[]{new Slip()});
	}

	public void setName(String name2) {
		this.name = (name2 != null)? name2: "Unnamed"; 
	}

	public int slipCount() {
		return slips.size();
	}
	
	@Override
	public String toString(){
		return name + "\n" + slips.toString();
	}

}

package controllers;

import play.*;
import play.db.jpa.JPABase;
import play.mvc.*;
import utils.MarinaHelper;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	Dock aDock = Dock.find("byName", "A Dock").first();
    	Dock bDock = Dock.find("byName", "B Dock").first();
    	Dock cDock = Dock.find("byName", "C Dock").first();
        render(aDock, bDock, cDock);
    }
    
    public static void showBoats(Long id) {
       Slip slip = Slip.findById(id);
       List<Boat> boats = Boat.findAll();
       render(slip, boats);
    }
    
    public static void delete(Long slipId) {
    	Slip slip = Slip.findById(slipId);
    	slip.boat = null;
    	slip.save();
    	index();
    }
    
    public static void post(Long slipId, String boatName){
    	Boat createdBoat = new Boat(boatName);
    	createdBoat.save();
		fillSlip(slipId, createdBoat.id);
    	index();
    }
    
    public static void fillSlip(Long slipId, Long boatId) {
    	Boat foundBoat = Boat.findById(boatId);
    	fillSlip(slipId, foundBoat);
    	index();
    }

	private static void fillSlip(Long slipId, Boat foundBoat) {
		Slip slip = Slip.findById(slipId);
		slip.boat = foundBoat;
    	slip.save();
	}
}
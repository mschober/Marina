package controllers;

import play.*;
import play.db.jpa.JPABase;
import play.mvc.*;
import utils.MarinaHelper;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	List<Slip> slips = Slip.findAll();
        render(slips);
    }

    public static void showBoats(Long id) {
    	Slip slip = Slip.findById(id);
    	List<Boat> boats = Boat.findAll();
    	render(slip, boats);
    }
    
    public static void fillSlip(Long slipId, Long boatId) {
    	Slip slip = Slip.findById(slipId);
    	Boat boat = Boat.findById(boatId);
    	slip.boat = boat;
    	slip.save();
//    	slip.fill(boat);
    	index();
    }
}
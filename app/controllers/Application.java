package controllers;

import play.*;
import play.db.jpa.JPABase;
import play.mvc.*;
import utils.MarinaHelper;

import java.util.*;

import javax.swing.plaf.ListUI;

import org.apache.commons.collections.ListUtils;

import models.*;

public class Application extends Controller {

    public static void index() {
        List<Slip> slips = Slip.findAll();
        render(slips);
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
		Slip slip = Slip.findById(slipId);
		slip.boat = createdBoat;
		slip.save();
    	index();
    }
}

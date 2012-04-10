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

}
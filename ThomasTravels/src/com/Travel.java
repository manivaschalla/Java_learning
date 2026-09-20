package com; 

public class Travel {
	
	 public boolean isCarDriver(Driver driver) {
		if(driver.getCategory().equalsIgnoreCase("Car")) {
			return true;
		}else {
			return false;
		}
	 }
	 

}

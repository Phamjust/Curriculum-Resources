package com.revature.storage;

import com.revature.models.Human;

//We don't "extends" interfaces with classes, we "implements" them
public class HumanArrayImpl implements HumanArray{

	Human[] humanArray;
	
	public HumanArrayImpl() {
		humanArray = new Human[2];
	}
	
	@Override
	public void addHuman(Human h) {
		// TODO Auto-generated method stub
		
		boolean isThereSpace = false;
		
		//Check if there is space and add human!
		for(int i = 0; i< this.humanArray.length; i++) {
			if(humanArray[i] == null) {
				isThereSpace=true;
				humanArray[i] = h;
				break; //break out of the loop!
			}
		}
		
		if(isThereSpace) {
//			System.out.println("Great! Our job is done!");
		}else {
			//make a new empty array with double length
			Human[] newArray = new Human[this.humanArray.length*2]; 
			
			//fill up the new array with the old array Humans
			for(int i = 0; i< this.humanArray.length; i++) {
				newArray[i] = this.humanArray[i];
			}
			
			this.humanArray = newArray; //replace the old array with the brand new bigger array!
			
			//add extra human
			for(int i = 0; i< this.humanArray.length; i++) {
				if(humanArray[i] == null) {
					isThereSpace=true;
					humanArray[i] = h;
					break; //break out of the loop!
				}
			}
			
			//execute the same method?
//			this.addHuman(h);
		
		}
		
	}

	@Override
	public Human findHumanByName(String name) {
		// TODO Auto-generated method stub
		
		for (Human h: this.humanArray){
			if (h.getName()=="Null") {
				return h;
			}
			if(h.getName()== name) {
				return h;
			}
		}
		System.out.println("doesnt exist");
		return null;
	}
	

	@Override
	public void removeHumanByName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public human printAllTheHumans() {

		for(Human h: this.humanArray) {
			// check if human exist at this point and if that human has a matching name
			if(h!= null && h.getName().equals(name)) {
				returningHuman = h
			}
			
		}
		return returningHuman;
	}

}

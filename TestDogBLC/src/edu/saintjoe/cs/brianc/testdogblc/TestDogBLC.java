package edu.saintjoe.cs.brianc.testdogblc;

public class TestDogBLC {

	    private String name;
	    //private makes it exclusive to the code
	    private int weight;
	    	    // making the weight integer
	    public void setName(String newName) {
	    	name = newName;
	    	//creating the object newName
	    }
	    
	    public void setWeight(int newWeight) {
	    	weight = newWeight;
	    	//create a new object weight
	    }
	    

	    public String getName() {
	    	return name;
	    	//calling for the reference to return the name
	    }
	    
	    public int getWeight() {
	    	return weight;
	    	//calling for the referene to return the weight value
	    }
	    
	    public void bark() {
	    //making a method bark
	    	int pointless = 0;
	    	
	    	
	    	if (weight > 60 ) {
	          System.out.println("Woof!! Woof!! says " + name + " that weighs " + weight);
	    	} else if (weight > 14 ) {
	    		System.out.println("Ruff!! Ruff!! says " + name + " that weighs " + weight);
	    	} else
	    		System.out.println("Yip!! Yip!! says " + name + " that weighs " + weight);
	    }
	    //for the different integer values, it controls the size of the bark and the name that it prints out based upon the weight of the dog
	    //if x is between 0 and 14: yip yip, if between 14 and 60: ruff ruff, and greater than 60: woof woof
	    public int setBoth(String newName, int newWeight) {
	    	//make the integer public so it is not contained to only this code
	    	int oldWeight = weight;
	    	//create a new integer for a different weight value
	    	name = newName;
	    	weight = newWeight;
	    	return oldWeight;
	    }
	    	//return this next value of weight and name

	    public void eat() { }
	    //a method stating void for nothing to happen
	    public void chaseCat() { }
	    //another void command from reference ChaseCat
	}


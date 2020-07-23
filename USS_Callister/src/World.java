package src;

import java.util.ArrayList;

public class World {
	
	private String name;
	private int numEntities = 0;
	private boolean isMultiplayer = false;
	private ArrayList<Object> entities;
	
	public World() {
		
	}
	
	public World(String nameIn) {
		name = nameIn;
	}
	
	public World(String nameIn, ArrayList<Object> entitiesIn) {
		name = nameIn;
		entities = entitiesIn;
		
	}
	
	public World(String nameIn, ArrayList<Object> entitiesIn, boolean isMultiplayerIn) {
		name = nameIn;
		entities = entitiesIn;
		isMultiplayer = isMultiplayerIn;
		
	}
	
	
	//#####################################################################################################################################################################################
	//################################################################################# World Complex Methods #############################################################################
	//#####################################################################################################################################################################################
	
	
	
	
	
	//#####################################################################################################################################################################################
	//################################################################################# World Print Methods ###############################################################################
	//#####################################################################################################################################################################################
	
	public void printName() {
		System.out.println("World Name: " + name);
	}
	
	public void printNumEntities() {
		System.out.println("Number of World Entities: " + numEntities);
	}
	
	public void printEntities() {
		System.out.println();
		for (int i = 0; i < entities.size(); i++) {
			System.out.println("Entity " + (i + 1) + entities.get(i).toString());
		}
	}
	
	public void printWorldData() {
		printName();
		printNumEntities();
		printEntities();
	}
	
	
	//#####################################################################################################################################################################################
	//################################################################################# World Get Methods #################################################################################
	//#####################################################################################################################################################################################
	
	
	public ArrayList<Object> getEntities() {
		return entities;
	}
	
	public int getNumEntities() {
		return numEntities;
	}
	
	public boolean getIsMultiplayer() {
		return isMultiplayer;
	}
	
	
	//#####################################################################################################################################################################################
	//################################################################################# World Set Methods #################################################################################
	//#####################################################################################################################################################################################
	
	
	public void setEntities(ArrayList<Object> entitiesIn) {
		entities = entitiesIn;
	}
	
	public void setNumEntities(int numEntitiesIn) {
		numEntities = numEntitiesIn;
	}
	
	public void setIsMultiplayer(boolean isMultiplayerIn) {
		isMultiplayer = isMultiplayerIn;
	}
	
}
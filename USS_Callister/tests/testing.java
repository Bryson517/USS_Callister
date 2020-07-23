package tests;

import src.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class testing {
	
	public static ArrayList<World> worlds;
	public static ArrayList<Human> humans;
	
	public static void main(String[] args) {
		System.out.println("Starting Testing...");
		System.out.println("Test 1: ");
		System.out.println("Test 2: ");
		System.out.println("Test 3: ");
		System.out.println("Test 4: ");
		System.out.println("Test 5: ");
		
		
	}
	
	
	@Before
	public void before() {
		// Before each test.
		
		worlds = new ArrayList<World>();
		humans = new ArrayList<Human>();
		
	}
	
	
	@Test(timeout = 5000)
	public void testWorldCreationMethods() {
		
		worlds.add(new World());
		worlds.add(new World("Test World 2"));
		
		ArrayList<Object> worldTestEntities = new ArrayList<Object>();
		worldTestEntities.add(Integer.valueOf("5"), new String("Hello World"));
		worlds.add(new World("Test World 3", worldTestEntities));
		
		ArrayList<Object> worldTestEntities2 = new ArrayList<Object>();
		worldTestEntities2.add(Integer.valueOf("5"), new String("Hello World"));
		worlds.add(new World("Test World 3", worldTestEntities2, true));
	}
	
	@Test(timeout = 5000)
	public void testWorldReturnMethods() {
		
	}
	
}


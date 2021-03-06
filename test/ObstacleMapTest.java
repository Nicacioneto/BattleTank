package test;

import static org.junit.Assert.*;

import org.junit.Test;

import project.Model;
import project.ObstacleMap;

public class ObstacleMapTest {
	
	@Test
	public void testInit() {
		int[] indexes4, indexes5, indexes6;
		Model[] obstacleMap2;
		ObstacleMap.init();
		Model[] obstacleMap1 = new Model[80 * 130];
		ObstacleMap.obstacleMap1 = new Model[80 * 130];	
		assertArrayEquals(obstacleMap1, obstacleMap1);
		
		ObstacleMap.indexes = new int[9];
		indexes4 = new int[9];
		ObstacleMap.indexes2 = new int[25];
		indexes5 = new int[25];
		ObstacleMap.indexes3 = new int[49];
		indexes6 = new int[49];
		assertArrayEquals(ObstacleMap.indexes, indexes4);
		assertArrayEquals(ObstacleMap.indexes2, indexes5);
		assertArrayEquals(ObstacleMap.indexes3, indexes6);
	
	}

	@Test
	public void testRemoveObstacle2() {
		ObstacleMap.removeObstacle2(8598);
		assertEquals(ObstacleMap.obstacleMap2[8598], null);
	}

	@Test
	public void testClear() {
		ObstacleMap.init();
		ObstacleMap.clear();
		assertEquals(ObstacleMap.obstacleMap2.length,80 * 130);
	}

	@Test
	public void testIsOccupied() {
		assertFalse(ObstacleMap.isOccupied(8598));
	}

	@Test
	public void testIsOccupied2() {
		assertFalse(ObstacleMap.isOccupied(8598));

	}


	@Test
	public void testAlertNearbyTanks() {
		ObstacleMap.alertNearbyTanks(8598);
		Model[] obstacleMap1 = new Model[80 * 130];
		assertEquals(ObstacleMap.obstacleMap2.length, 80 * 130);
		assertEquals(ObstacleMap.indexes3.length, 49);
	}

}

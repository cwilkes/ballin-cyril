package com.ladro.ecs2;

import java.util.Map;

public interface ElevatorService {

	/**
	 * Returns the current floor that an elevator is on and its motion.
	 * 
	 * @return
	 */
	Map<Integer, Pair<Integer, ElevatorMotion>> bankStatus();

	/**
	 * When people press a button on a floor this method is called to request an
	 * elevator
	 * 
	 * @param floor
	 * @param direction
	 */
	void requestPickup(int floor, ButtonPushDirection direction);

}

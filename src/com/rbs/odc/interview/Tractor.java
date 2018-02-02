package com.rbs.odc.interview;

public class Tractor {
	// Made the class attributes private
	private int[] position = new int[]{0,0};
	private int[] field = new int[]{5,5};
	private String orientation = "N";
	
	public void move(String command) {
		// Kept this IF-ELSE intact since the problem domain states only 2 directions
		if(command=="F"){
			moveForwards();
		}else if(command=="T"){
			turnClockwise();
		}
	}

	private void moveForwards() {
		// Replaced the IF-ELSE ladder with algorithm executor  
		position = MoveAlgorithmExecutor.getAlgorithmFromCondition(orientation).execute(position);
		
		// Extracted the condition to check if tractor is in Ditch
		if(isTractorInDitch()){
			throw new TractorInDitchException();
		}
	}

	/**
	 * Checks whether the tractor is in Ditch
	 * 
	 * @return boolean TRUE if its in ditch, FALSE otherwise
	 */
	private boolean isTractorInDitch() {
		return position[0]>field[0]||position[1]>field[1];
	}

	private void turnClockwise() {
		// Replaced the IF-ELSE ladder with algorithm executor
		orientation = TurnAlgorithmExecutor.getAlgorithmFromCondition(orientation).execute(orientation);
	}

	public int getPositionX() {
		return position[0];
	}

	public int getPositionY() {
		return position[1];
	}

	public String getOrientation() {
		return orientation;
	}
}

package com.rbs.odc.interview;

public enum MoveAlgorithmExecutor {
	NORTH {
		boolean match(String condition) {
			return condition == "N";
        }
         
		int[] execute(int[] position) {
            return new int[]{position[0], position[1]+1};
        }
	},
	SOUTH {
		boolean match(String condition) {
			return condition == "S";
        }
         
		int[] execute(int[] position) {
            return new int[]{position[0], position[1]-1};
        }
	},
	EAST {
		boolean match(String condition) {
           return condition == "E";
        }
         
        int[] execute(int[] position) {
        	return new int[]{position[0]+1, position[1]};
        }
	},
	WEST {
		boolean match(String condition) {
			return condition == "W";
        }
         
		int[] execute(int[] position) {
			return new int[]{position[0]-1, position[1]};
        }
	};
	
	public static MoveAlgorithmExecutor getAlgorithmFromCondition(String condition) {		
        for(MoveAlgorithmExecutor c : values()) {
            if(c.match(condition)) {
                return c;
            }
        }
        return null;
    }
     
    abstract boolean match(String condition);
     
    abstract int[] execute(int[] p);
}

package com.rbs.odc.interview;

/**
 * Enum: TurnAlgorithmExecutor
 * This enum works on match() and execute() framework
 * If the condition in match() is TRUE, execute() is called
 * 
 * @author ashish
 *
 */
public enum TurnAlgorithmExecutor {
	NORTH {
		boolean match(String condition) {
			return condition == "N";
        }
         
		String execute(String orientation) {
			return "E";
        }
	},
	SOUTH {
		boolean match(String condition) {
			return condition == "S";
        }
         
		String execute(String orientation) {
			return "W";
        }
	},
	EAST {
		boolean match(String condition) {
           return condition == "E";
        }
         
		String execute(String orientation) {
			return "S";
        }
	},
	WEST {
		boolean match(String condition) {
			return condition == "W";
        }
         
		String execute(String orientation) {
			return "N";
        }
	};

	public static TurnAlgorithmExecutor getAlgorithmFromCondition(String condition) {		
        for(TurnAlgorithmExecutor c : values()) {
            if(c.match(condition)) {
                return c;
            }
        }
        return null;
    }
     
    abstract boolean match(String condition);
     
    abstract String execute(String o);
}

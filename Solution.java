//ascii to int

public class Solution {
    public int convertASCIIToInt(int ascii) {
	    if (ascii < 48 || ascii > 57) {
	      return 0;
	    }
	
	    return ascii - 48;
    }
    
}

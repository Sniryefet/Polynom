package Polynom;

import java.util.Comparator;

public class Monom_Comperator implements Comparator<Monom> {
	
	/**
	 * The 2 parameters that we compare:
	 * @param a 
	 * @param b
	 * 
	 * 
	 * @return 0 if they are equal , positive if a>b , negative if a<b 
	 */
	@Override
	
	public int compare(Monom a, Monom b) {
		// TODO Auto-generated method stub
		return -(a.get_power()-b.get_power());    //We prefer to be smart then beautiful
	}

	// ******** add your code below *********

}

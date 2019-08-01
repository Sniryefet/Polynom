
package Polynom;
/**
 * This class represents a simple "Monom" of shape a*x^b, where a is a real number and a is an integer (summed a none negative), 
 * see: https://en.wikipedia.org/wiki/Monomial 
 * The class implements function and support simple operations as: construction, value at x, derivative, add and multiply. 
 * @author Boaz
 *
 */
public class Monom implements function{
	private double _coefficient; // 
	private int _power;
	
	/**
	 * Constructor that gets a and b and turns it into a monom
	 * @param a  the coefficient of the Monom
	 * @param b  the power of the monom
	 */
	
	public Monom(double a, int b){
		this._coefficient=a;
		this._power=b;
	}
	
	/**
	 * Copy constructor that takes other monom and copies its info to the new monom
	 * @param ot (Other) monom that gets copied
	 */
	
	public Monom(Monom ot) {
		this(ot.get_coefficient(), ot.get_power());
	}
	// ***************** add your code below **********************


	//****************** Private Methods and Data *****************
	
	/**
	 * @return the power value of the monom 
	 */
	
	
	public int get_power() {
		
		 return _power;
	}
	/**
	 * 
	 * @return the coefficient value of the monom
	 */
	public double get_coefficient() {
		
		return _coefficient;
	}
	/**
	 * set a to be the coefficient of the monom
	 * @param a the value of the new coefficient
	 */
	public void set_coefficient(double a){
		this._coefficient = a;
	}
	/**
	 * set p to be the new power of the monom
	 * @param p the value of the new power
	 */
	
	public void set_power(int p) {
		this._power = p;
	}
	
	/**
	 * @param x the point where we need the value of the monom at
	 * @return the value of the monom at the point x 
	 */
	@Override
	public double f(double x) {
		double y = (Math.pow(x,_power))*_coefficient;
		
		return y;
	} 
	/**
	 * possible only if the 2 monoms have the same power
	 * add this monom with m monom by adding the coefficients 
	 * @param m the monom we are adding to ours monom
	 */
	public void add (Monom m) {
		if(m.get_power()!=this.get_power()) 
			throw new RuntimeException("Error: can not add two monoms with different coefficients");
		
		this._coefficient += m.get_coefficient();
	}
	/**
	 * Mathematical function that returns the derivative of this Monom
	 * @return derivatived monom
	 */
	public Monom derivative() {
		if(this.get_power()==0) {
			return  new Monom(0,0);
		}

		return  new Monom(this.get_coefficient()*this.get_power(),this.get_power()-1);
	}
	/**
	 * Mathematical function that multiplies 2 monoms
	 * @param m the monom we multiply by
	 * @return the result of the multiplication
	 */
	public Monom multiply(Monom m) {
		
		Monom k =new Monom(m.get_coefficient()*_coefficient,m._power+this.get_power());
		return k;
	}
	public String toString() {
		if(this.equals("x")) return "x";
		if(this.get_power()==0) {
			return ""+this.get_coefficient();
		}
		if(this.get_power()==1) {
			return ""+this.get_coefficient()+"x";
		}
		if(this.get_coefficient()==1) {
			return "x^"+this.get_power();
		}
		else
		return ""+this.get_coefficient()+"x^"+this.get_power();
	}
}

package Polynom;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {
	
	public final static double chk = 0.00001;

		@Test
		public void testMonomcopy() {
			Monom m1 = new Monom(2.17,4);
			Monom m2 = new Monom(m1);
			if(m1.get_coefficient()!=(m2.get_coefficient())) {
				fail("Error in copy constructor");
			}		
	}
		@Test
		public void testMonomtoString() {
			double kido = -2.21;
			int power = 12;
			Monom m1 = new Monom(kido, power);
			Monom m2 = new Monom(m1);
			String s = m1.toString();
			
			if(!s.equals(m2.toString())) {
				fail("Error in the toString function");
			}
		}
		@Test
		public void testDerivative() {
			double coef = 5;
			int power = 2;
			Monom m1 = new Monom(coef,power);
			Monom m2 = m1.derivative();			
			assertTrue(m2.get_coefficient()==10);
			assertTrue(m2.get_power()==1);
		}

		@Test
		public void testAdd() {
			double conf = -3, conf2 = 3;
			int power = 3;
			Monom m1 = new Monom(conf,power);
			Monom m2 = new Monom(conf2,power);
			m1.add(m2);
			assertEquals(m1.get_coefficient(), conf+conf2,chk);
		}

		@Test
		public void testMultiply() {
			double conf = 4, conf2 = 5;
			int pow1 = 5, pow2 = 5;
			Monom m1 = new Monom(conf,pow1);
			Monom m2 = new Monom(conf2,pow2);
			Monom m3=m1.multiply(m2);
			assertEquals(m3.get_coefficient(), conf*conf2,chk);
			assertEquals(m3.get_power(), pow1+pow2,chk);
		}

		//////////////////////////////////////////////////////////////////////////////////////////////
		
		@Test
		public void testToStringInit() throws Exception {
			Polynom mp = new Polynom ("2*x^5+3*x^1");
			assertTrue("2.0x^5+3.0x".equals(mp.toString()));
		}
		
		@Test
		public void polynomSub() throws Exception {
			Polynom mp = new Polynom ("2*x^5+3*x^1");
			Polynom bp = new Polynom ("4*x^2+3*x^3+2");
			mp.substract(bp);
			assertTrue("2.0x^5-3.0x^3-4.0x^2+3.0x-2.0".equals(mp.toString()));
		}
		
		@Test
		public void testPolyonomcopy() throws Exception {
			Polynom bp = new Polynom ("4*x^2+3*x^3+2");
			Polynom m2 = new Polynom(bp);
			if(!bp.equals(m2)) 
				fail("Error in copy constructor or in equals");
			
										
}
		@Test
		public void testPolyonomString() throws Exception {
			Polynom p = new Polynom ("3x^2-2x+5*x^5");
			String s= "5.0x^5+3.0x^2-2.0x";
			if(!s.equals(p.toString()))
				fail("Error");
}
			
			
		
		@Test
		public void testPolyonomArea() throws Exception {
			
			
		}
		@Test
		public void testPolyonomRoot() throws Exception {
			Polynom p =new Polynom("2x-1");
			double res = p.root(-1, 1, 0.01);
			if(res>0.6||res<0.4)
				fail("Error in the root function");

							
		}
		@Test
		public void testPolyonomDerivative() throws Exception{
			Polynom p1 = new Polynom ("x^2-1");
			Polynom_able p2 = p1.derivative();
			if(!p2.toString().equals("2.0x"))
				fail("Error in the derivative function");

			
		}
		@Test
		public void testPolyonomMult() throws Exception {
			Polynom p1 = new Polynom ("x^2-1");
			Polynom p2 = new Polynom ("x^2+1");
			p1.multiply(p2);
			if(!p1.toString().equals("x^4-1.0"))
				fail("Error in the mult function");
				
			
		}
		@Test
		public void testPolyonomAddMonom() throws Exception {
			Polynom p1 =new Polynom("x^2-1");
			Monom m =new Monom (1 ,2);
			p1.add(m);
			if(!p1.toString().equals("2.0x^2-1.0")) 
				fail("Error in the addMonom function");
	
		}
		@Test
		public void testPolyonomAddPolynom() throws Exception {
			Polynom p1 =new Polynom("x^2-1");
			Polynom_able p2 =new Polynom("x^2-1");
			p1.add(p2);
			if(!p1.toString().equals("2.0x^2-2.0"))
				fail("Error in the add Polynom to polynom function");
		
		}
		@Test
		public void testPolyonomValueAtX() throws Exception {
			Polynom p =new Polynom("2x");
			if(p.f(2)!=4)
				fail("Error in the Value at x function");

						
		}
}

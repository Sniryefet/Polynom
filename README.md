# Polynom Project
By Snir Yefet and Barel Kantzepolski.

![](https://github.com/Sniryefet/Polynom/blob/master/pictures/Polynom%20headline%20picture.PNG)


### Overview
---
There are three Interfaces :
* Polynom_Able
* Function
* Cont_function

There are three main classes :
* Polynom
* Monom
* Monom_Comperator

The Polynom is an Object composed of Monoms in a shape a*x^b .

**NOTIC :**
b MUST be a Natural Number.
a can be a Real Number.

# Monom 
---
### Constructors :
1. **Monom(double a, int b)** – creates new Monom where a is the coefficient and b is the power.
2. **Monom(Monom other)** – copy constructor creates new Monom with same coefficient and power as the Monom other.

### Methods
1. **Void add(Monom m)** – add the Monom m to current Monom.
2. **Monom derivative()** – derivative Monom and return new Monom.
3. **double f(x)** – return the result of f(x) in Monom.
4. **double get_coefficient()** – return the coefficient Monom.
5. **int get_power()** – return the power of Monom.
6. **String toString()** – return String a representation of this Monom in the shape ax^b.




# Polynom 
---
### Constructors :
1. **Polynom()** – Creates default Polynom with no Monoms in it.
2. **Polynom(String s)** – Creates a Polynom according to a given String .
3. **Polynom(Polynom_able p)** - Creates a deep copy of the given Polynom_able (assuming Polynom able is from type Polynom).

### Methods:

1. **void add(Monom m)** – Adding a Monom to the Polynom.
2. **void add(Polynom_able p)** – Adding a given Polynom to "our" Polynom.
3. **void subtract(Polynom_able p)** – Subtracting a given Polynom to "our" Polynom.
4. **void multiply(Polynom_able p)** – multiplying between the two polynoms.
5. **boolean Equals(Polynom p)**- Checks if the two Polynoms are equals . isZero()- checking if the polynom has no Monoms.
6. **boolean isZero** - Is the Polynom equals '0'?
7. **double area(double x0 ,double x1 ,eps)**-calculating Riemann_integral
.the are above x axis.
8. **double areaUnderX** – calculating area below X axis .
9. **double Root()**- assuming there is at least one solution to the Polynom f(x)=0 ,returning the one value of x answering this requirement.
10. **double f(double x)** – returning the value of the polynom for a given 'x'.
11.  **Polynom_able derivative()**- Returning Polynom_able/Polynom after derivative. 
12. **Polynom_able copy()**-return a copy of the polynom
13. **Iterator<Monom> iteretor()** – return an Iterator of Monoms over this Polynom(has the method hasNext(), next() and remove()).
14. **String toString()**- Printing the Polynom.
15. **Void Plot(double x1 , double x2)**- Drawing a graph for a given range for the Polynom and printing the critical points to the console with an epsilon proximity.

![](https://github.com/Sniryefet/Polynom/blob/master/pictures/Polynim%20plot%20example.PNG)

**CREDIT**
Plot function is implemented with the help of [Gral](https://github.com/eseifert/gra/"Gral") 
* The Jars for Gral are included in this project so one just need to add them to the project path






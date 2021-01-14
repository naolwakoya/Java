public class MaxTemp {

  // Purpose of the code in conjunction with Temperature.java is to practice the use of constructors in simple object oriented programming
  
  /** t1 and t2 are considered the same if Math.abs(t1-t2) < EPSILON */
  
  // I changed the value of epsilon because my value of (temps[i].getTemp() - max.getTemp()) had significant digits
  public static final double EPSILON = 0.010001;
  private Temperature[] temps;

  /* add attributes as you need */

  /*
   * ---------------------------------------------------- constructor
   * ----------------------------------------------------
   */

  public MaxTemp(Temperature[] tem) {
    // add your code here
    this.temps = tem;
  }

  /*
   * ---------------------------------------------------- getter
   * ----------------------------------------------------
   */

  public double[] getMax() {
    // - returns null if empty array was passed to constructor
    // - returns null if null was passed to constructor
    // - otherwise, returns an array of length 2 [max, count]
    // where max is the maximum temperature (expressed in the Kelvin scale)
    // of all Temperature objects passed to the constructor, and count
    // is the number of times that temperature was present (in the input
    // array of the constructor)
    if (temps.length == 0 || temps == null) {
      return null;
    }
    Temperature max = new Temperature(-Double.MAX_VALUE);
    int maxCounter = 0;
    max.setScale("K");
    
    //find the max value in Kelvins
    for (int i = 0; i < temps.length; i++) {
      temps[i].setScale("K");
	  System.out.println("Temp here is " + temps[i].getTemps());
      if (temps[i].getTemp() > max.getTemp()) {
        max = temps[i];
        }
        }
    // iterate through the array to find how many times that max value occurs
    for (int i = 0; i < temps.length; i++) {
      temps[i].setScale("K");
	  System.out.println("Temp here is " + temps[i].getTemps());
      if (temps[i].getTemp() == max.getTemp()) {
        maxCounter++;
        
      }
      // testing if the difference between current and max values is less than epsilon
        else if (Math.abs(temps[i].getTemp() - max.getTemp()) <= EPSILON) {
        maxCounter++;
      }
    }

    
    
    // add your code here
    return new double[] { max.getTemp(), maxCounter };
  }

  /* OPTIONAL - use your main method to test your code */
  public static void main(String[] args) {
    // testing code here is optional
    
    Temperature tem = new Temperature(10.1);
    System.out.println(tem.getScale());    // outputs the char 'C'
    System.out.println(tem.temp());        // outputs 10.1C
    tem.setScale("F");
    System.out.println(tem.temp());        // outputs 50.18F
    System.out.println(tem.getScale());  
    // outputs the char 'F'
    
    // max is 101.12 and 101.11 so it'll output 2 as the counter
    MaxTemp test = new MaxTemp(new Temperature[] {new Temperature(101.12, "K"), new Temperature(-300), new Temperature(101.11, "K")});
    System.out.println(test.getMax()[1]);
  }
}

public class Temperature{

// Purpose of the code is to practice constructors and and simple object behaviour by converting degrees

  // names for the different temperature scales
  public static String[] scales = {"Celsius", "Fahrenheit", "Kelvin"};
  private double temperature;
  private String scale;


  /* ----------------------------------------------------
   * constructors
   * ----------------------------------------------------
   */

  public Temperature(double temp){
    this.temperature = temp;
    this.scale = scales[0];
  }

  public Temperature(double temp, String scale){
    // - creates a temperature object with given temp using the given scale
    // - scale must be one of the three strings in the scales attribute
    //   OR the the first letter of the name (upper case)
    //   Examples: new Temperature(12.3, "K")
    //             new Temperature(-90.2, "Celsius")
    this.temperature = temp;
    this.scale = scale;
  }

  /* ----------------------------------------------------
   * methods
   * ----------------------------------------------------
   */


  public char getScale(){
    char unit = ' ';
    if(this.scale.equals(scales[0]) || this.scale.equals("C")){
      unit = 'C';
    }
    else if(this.scale.equals(scales[1]) || this.scale.equals("F")){
      unit = 'F';
    }
    else if(this.scale.equals(scales[2]) || this.scale.equals("K")){
      unit = 'K';
    }
    return unit;
  }


  public double getTemp(){
    return this.temperature;
  }
    // - returns the object's temperature using its current scale




  public void setScale(String scale){
    // - scale must be one of the three strings in the scales attribute
    //   OR the first letter of the name (see the second constructor)
    // - sets the scale of the current object
    if(this.scale.equals(scales[0]) || this.scale.equals("C")){
      if(scale.equals(scales[1]) || scale.equals("F")) {
        this.temperature = (this.temperature*9/5) + 32;
        this.scale = scale;
      }
      else if(scale.equals(scales[2]) || this.scale.equals("K")) {
        this.temperature = this.temperature + 273.15;
        this.scale = scale;
      }
      else {
        return;
      }
    }
    else if(this.scale.equals("F")) {
      if(scale.equals("C")) {
        this.temperature = (this.temperature-32)*5/9;
        this.scale = scale;
      }
      else if(scale.equals("K")) {
        this.temperature = (this.temperature + 459.67)*5/9;
        this.scale = scale;
      }
    }
      else if(this.scale.equals("K")) {
        if(scale.equals("C")){
          this.temperature = this.temperature-273.15;
          this.scale = scale;
        }
        else if(scale.equals("F")){
          this.temperature = (this.temperature * 9/5)-459.67;
          this.scale = scale;
        }
      }
    }

  public void setTemp(double temp){
    // - sets the objects temperature to that specified using the
    //   current scale of the object
    this.temperature = temp;
  }

  public void setTemp(double temp, char scale){
    // - sets the objects temperature to that specified using the
    //   specified scale ('K', 'C' or 'F')
    this.temperature = temp;
    if(scale == 'K'){
      this.scale = "K";
  }
  else if(scale == 'C'){
    this.scale = "C";
  }
  else if(scale == 'F'){
    this.scale = "F";
  }
}

  public void setTemp(double temp, String scale){
    // - sets the objects temperature to that specified using the
    //   specified scale
    // - scale must be one of the three strings in the scales attribute
    //   OR the the first letter of the name (upper case)
    this.temperature = temp;
    this.scale = scale;
  }








  /* do not change anything below this line */
  /* -------------------------------------- */

  /* string representation of object */
  public String temp(){
    return "" + this.getTemp() + this.getScale();
  }



  /* Override the toString() method                                */
  /* with this we will not need the temp() method from above       */
  /* we will cover this soon!                                      */
  /* you do not need to use this for this assignment!              */
  @Override
  public String toString(){
    return "" + this.getTemp() + this.getScale();
  }

}

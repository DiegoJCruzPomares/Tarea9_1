package tarea9_4;

/**
 * Class Oval
 */
public class Oval {

  //
  // Fields
  //

  private String Color;
  private int Diameter;
  
  //
  // Constructors
  //
  public Oval () { };

  public Oval(String Color, int diameter) {
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Color
   * @param newVar the new value of Color
   */
  public void setColor (String newVar) {
    Color = newVar;
  }

  /**
   * Get the value of Color
   * @return the value of Color
   */
  public String getColor () {
    return Color;
  }

  /**
   * Set the value of Diameter
   * @param newVar the new value of Diameter
   */
  public void setDiameter (int newVar) {
    Diameter = newVar;
  }

  /**
   * Get the value of Diameter
   * @return the value of Diameter
   */
  public int getDiameter () {
    return Diameter;
  }

  //
  // Other methods
  //

}

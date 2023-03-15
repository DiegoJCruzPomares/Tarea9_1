package tarea9_7;
import java.util.*;


/**
 * Class place
 */
public class place {

  //
  // Fields
  //

  private int id;
  private String address;
  private String location;
  private String province;
  
  //
  // Constructors
  //
  public place () { };

  public place(int id, String address, String location, String province) {
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id;
  }

  /**
   * Set the value of address
   * @param newVar the new value of address
   */
  public void setAddress (String newVar) {
    address = newVar;
  }

  /**
   * Get the value of address
   * @return the value of address
   */
  public String getAddress () {
    return address;
  }

  /**
   * Set the value of location
   * @param newVar the new value of location
   */
  public void setLocation (String newVar) {
    location = newVar;
  }

  /**
   * Get the value of location
   * @return the value of location
   */
  public String getLocation () {
    return location;
  }

  /**
   * Set the value of province
   * @param newVar the new value of province
   */
  public void setProvince (String newVar) {
    province = newVar;
  }

  /**
   * Get the value of province
   * @return the value of province
   */
  public String getProvince () {
    return province;
  }

  //
  // Other methods
  //

}

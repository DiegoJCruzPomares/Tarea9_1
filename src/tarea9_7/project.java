package tarea9_7;
import java.util.*;


/**
 * Class project
 */
public class project {

  //
  // Fields
  //

  private int id;
  private String start_date;
  private String end_date;
  private String description;
  private place place_id;
  
  //
  // Constructors
  //
  public project () { };

  public project(int id, String start_date, String end_date, String description, int place_id) {
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
   * Set the value of start_date
   * @param newVar the new value of start_date
   */
  public void setStart_date (String newVar) {
    start_date = newVar;
  }

  /**
   * Get the value of start_date
   * @return the value of start_date
   */
  public String getStart_date () {
    return start_date;
  }

  /**
   * Set the value of end_date
   * @param newVar the new value of end_date
   */
  public void setEnd_date (String newVar) {
    end_date = newVar;
  }

  /**
   * Get the value of end_date
   * @return the value of end_date
   */
  public String getEnd_date () {
    return end_date;
  }

  /**
   * Set the value of description
   * @param newVar the new value of description
   */
  public void setDescription (String newVar) {
    description = newVar;
  }

  /**
   * Get the value of description
   * @return the value of description
   */
  public String getDescription () {
    return description;
  }

  /**
   * Set the value of place_id
   * @param newVar the new value of place_id
   */
  public void setPlace_id (place newVar) {
    place_id = newVar;
  }

  /**
   * Get the value of place_id
   * @return the value of place_id
   */
  public place getPlace_id () {
    return place_id;
  }

  //
  // Other methods
  //

}

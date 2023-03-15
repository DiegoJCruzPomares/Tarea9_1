package tarea9_7;
import java.util.*;


/**
 * Class employees
 */
public class employees {

  //
  // Fields
  //

  private int id;
  private String name;
  private String surname;
  private String Assigned_rol;
  private project project_id;
  
  //
  // Constructors
  //
  public employees () { };

  public employees(int id, String name, String surname, String Assigned_rol, int project_id) {
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
   * Set the value of name
   * @param newVar the new value of name
   */
  public void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  public String getName () {
    return name;
  }

  /**
   * Set the value of surname
   * @param newVar the new value of surname
   */
  public void setSurname (String newVar) {
    surname = newVar;
  }

  /**
   * Get the value of surname
   * @return the value of surname
   */
  public String getSurname () {
    return surname;
  }

  /**
   * Set the value of Assigned_rol
   * @param newVar the new value of Assigned_rol
   */
  public void setAssigned_rol (String newVar) {
    Assigned_rol = newVar;
  }

  /**
   * Get the value of Assigned_rol
   * @return the value of Assigned_rol
   */
  public String getAssigned_rol () {
    return Assigned_rol;
  }

  /**
   * Set the value of project_id
   * @param newVar the new value of project_id
   */
  public void setProject_id (project newVar) {
    project_id = newVar;
  }

  /**
   * Get the value of project_id
   * @return the value of project_id
   */
  public project getProject_id () {
    return project_id;
  }

  //
  // Other methods
  //

}

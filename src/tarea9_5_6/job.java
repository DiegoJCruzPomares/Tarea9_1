package tarea9_5_6;

/**
 * Class job
 */
public class job {

  //
  // Fields
  //

  private String name;
  private String startDate;
  private String EndDate;
  private Float salary;
  private Person employee;
  private Person chief;
  
  //
  // Constructors
  //
  public job () { };

  public job(String name, String startDate, String endDate, int salary, Person employee, Person chief) {
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

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
   * Set the value of startDate
   * @param newVar the new value of startDate
   */
  public void setStartDate (String newVar) {
    startDate = newVar;
  }

  /**
   * Get the value of startDate
   * @return the value of startDate
   */
  public String getStartDate () {
    return startDate;
  }

  /**
   * Set the value of EndDate
   * @param newVar the new value of EndDate
   */
  public void setEndDate (String newVar) {
    EndDate = newVar;
  }

  /**
   * Get the value of EndDate
   * @return the value of EndDate
   */
  public String getEndDate () {
    return EndDate;
  }

  /**
   * Set the value of salary
   * @param newVar the new value of salary
   */
  public void setSalary (Float newVar) {
    salary = newVar;
  }

  /**
   * Get the value of salary
   * @return the value of salary
   */
  public Float getSalary () {
    return salary;
  }

  /**
   * Set the value of employee
   * @param newVar the new value of employee
   */
  public void setEmployee (Person newVar) {
    employee = newVar;
  }

  /**
   * Get the value of employee
   * @return the value of employee
   */
  public Person getEmployee () {
    return employee;
  }

  /**
   * Set the value of chief
   * @param newVar the new value of chief
   */
  public void setChief (Person newVar) {
    chief = newVar;
  }

  /**
   * Get the value of chief
   * @return the value of chief
   */
  public Person getChief () {
    return chief;
  }

  //
  // Other methods
  //

}

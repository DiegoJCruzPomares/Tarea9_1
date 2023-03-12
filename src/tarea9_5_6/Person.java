package tarea9_5_6;

/**
 * Class Person
 */
public class Person {

  //
  // Fields
  //

  private String name;
  private String surname1;
  private String surname2;
  private String birthDate;
  private String sex;
  private int id;
  
  //
  // Constructors
  //
  public Person () { };

  public Person(String name, String surname1, String surname2, String birthDate, String sex, int id) {
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
   * Set the value of surname1
   * @param newVar the new value of surname1
   */
  public void setSurname1 (String newVar) {
    surname1 = newVar;
  }

  /**
   * Get the value of surname1
   * @return the value of surname1
   */
  public String getSurname1 () {
    return surname1;
  }

  /**
   * Set the value of surname2
   * @param newVar the new value of surname2
   */
  public void setSurname2 (String newVar) {
    surname2 = newVar;
  }

  /**
   * Get the value of surname2
   * @return the value of surname2
   */
  public String getSurname2 () {
    return surname2;
  }

  /**
   * Set the value of birthDate
   * @param newVar the new value of birthDate
   */
  public void setBirthDate (String newVar) {
    birthDate = newVar;
  }

  /**
   * Get the value of birthDate
   * @return the value of birthDate
   */
  public String getBirthDate () {
    return birthDate;
  }

  /**
   * Set the value of sex
   * @param newVar the new value of sex
   */
  public void setSex (String newVar) {
    sex = newVar;
  }

  /**
   * Get the value of sex
   * @return the value of sex
   */
  public String getSex () {
    return sex;
  }

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

  //
  // Other methods
  //

}

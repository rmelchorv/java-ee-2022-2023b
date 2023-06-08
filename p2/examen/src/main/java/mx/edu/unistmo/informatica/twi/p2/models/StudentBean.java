package mx.edu.unistmo.informatica.twi.p2.models;

public class StudentBean implements java.io.Serializable {
  private String name;
  private String id;
  private String career;

  public StudentBean() {

  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getCareer() {
    return career;
  }
  public void setCareer(String career) {
    this.career = career;
  }
}

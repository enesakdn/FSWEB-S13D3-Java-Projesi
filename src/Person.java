public class Person {
 public String firstname;
 public String lastName;
 public int age;
 public String job;
 public int height;
 public String horoscope;

 public Person() {
  System.out.println("Person Oluşturuldu");
 }

 public Person(String firstname, String lastName, int age) {
  this.firstname = firstname;
  this.lastName = lastName;
  this.age = age;
 }

 public Person( String job, int height, String horoscope,String firstname, String lastName, int age) {
  this(firstname,lastName,age);
  this.job = job;
  this.height = height;
  this.horoscope = horoscope;
 }

 public String getFirstname() {
 return "firstName: "+ firstname;
 };
 public String getLastName() {
  return "lastName: "+ lastName;
 };
  public String getAge() {
   return  "age:" +age;
 };
  public boolean isTeen() {
   if(age<=19 && age>=13) return true;
   return false;
  }
}

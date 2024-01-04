
/**
 * Write a description of class NguyenBrad here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NguyenBrad extends Animal
{
  public NguyenBrad() {
    super("Nguyen Brad", "orange", 4);
  }
  
  public String getType() {
    return "Cat";
  }
  
  public String getName() {
      return "Chairman Meow";
  }
  
  public String speak() {
      return "meow";
  }
  
  public String getDisposition() {
      return "cat-ing";
  }
}
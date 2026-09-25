public class Dog {

  // field
  private String name;
  private int age;

  // constructa1
  public Dog (String name, int age){
    this.name = name;
    this.age = age;
  }

  // constructa2
  public Dog (int age){
    this("A dog", age);
  }

  // constructa3
  public Dog () {
    this("A dog", 0);
  }

  // method
  public String profile() {
    return name + "(" + age + ")";
  }

  // インスタンス初期化子
  {
    System.out.println("Dog instance.");
  }  
}

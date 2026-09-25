public class Dog {
  // フィールドを設定
  private String name;
  private int age;

  // コンストラクタを設定
  public Dog (String name, int age) {
    this.name = name;
    this.age = age;
  }

  // メソッドを設定
  public String profile () {
    return this.name + "(" + this.age + ")";
  }

  public void eat (String food) {
    System.out.println(profile() + " eats " + food);
  }

  public void eat () {
    System.out.println(profile() + " drinks water.");
  }

  // nameフィールドのためのgetter
  public String getName () {
    return this.name;
  }

  // ageフィールドのためのgetter
  public int getAge () {
    return this.age;
  }

  // nameフィールドのためのsetter
  public void setName (String name){
    this.name = name;
  }

  // ageフィールドのためのsetter
  public void setAge (int age){
    if(age>=0) {
      this.age = age;
    }
  }

  
}

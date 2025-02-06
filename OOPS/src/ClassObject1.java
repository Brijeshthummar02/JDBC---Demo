public class ClassObject1 {
    String name;
    int age;
}
public void printdata()
{
    System.out.println(name);
    System.out.println(age);
}
public static void main(String[] args) {
    ClassObject1 std1 = new ClassObject1();
    std1.name = "Rohan";
    std1.age = 18;
    std1.printdata();
}
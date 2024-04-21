//One or more classes can implement interface 
//interface allow us to fully abstract a class
interface Interface1{

    public void display_1();
}
interface Interface2{

    void display_2();
}
class ClassA implements Interface1{

    public void display_1()
    {
        System.out.println("Method of interface1 implemented by classA");
    }
}
class ClassB implements Interface2{

    public void display_2()
    {
        System.out.println("Method of interface2 implemented by classB");
    }
}
class ClassC implements Interface2{

    public void display_2()
    {
        System.out.println("Method of interface2 implemented by classC");
    }
}
class demo
{
    public static void main(String args[])
    {
        ClassA obj1=new ClassA();
        ClassB obj2=new ClassB();
        ClassC obj3=new ClassC();
        obj1.display_1();
        obj2.display_2();
        obj3.display_2();
    }
}
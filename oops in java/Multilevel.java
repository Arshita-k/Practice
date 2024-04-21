abstract class A
{
    public abstract void show();
    public abstract void display();
}
class B extends A
{
    public void show()
    {
        System.out.println("Show() implemented in class B");
    }
    //final 
    public final void display()
    {
        System.out.println("final display() implemented in class B");
    } 
}
class C extends B
{
    public void show()
    {
        System.out.println("Show() implemented in class C");
    }
}
class Multilevel {
    public static void main(String args[])
    {
        B Obj1 = new B();
        C Obj2 = new C();
        Obj1.show();
        Obj1.display();
        Obj2.show();
        Obj2.display();
    }
}
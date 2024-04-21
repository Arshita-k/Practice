class Sample
{
    int num1;
    int num2;
    Sample(){ num1=num2=-1;}
    Sample(int a,int b) 
    {
        num1=a;
        num2=b;
    }
    public Sample(Sample obj)
    {
        num1=obj.num1;
        num2=obj.num2;
    }
    void show()
    {
        System.out.println("Number1 is " + num1);
        System.out.println("Number2 is " + num2);
    }
}
class Sample1 extends Sample
{
    private int num2;
    Sample1()
    {
        //to access base class constructor
        super();
        num2=-1;
    }
    Sample1(int a,int b,int c)
    {
        super(a,b);
        num2=c;
    }
    Sample1(Sample1 obj)
    {
        super(obj);
        num2=obj.num2;
    }
    int sum() 
    {
        //to access base class instance variable
        return super.num1 + super.num2 + num2;
    }
    //method overriding
    void show()
    {
        //to call superclass show()
        super.show();
        System.out.println("Number3 is " + num2);
    }
}
class test {
    public static void main(String args[])
    {
        Sample1 A = new Sample1();
        Sample1 B = new Sample1(10,20,30);
        Sample1 C = new Sample1(B);
        A.show();
        System.out.println("Sum of numbers:" + A.sum());
        B.show();
        System.out.println("Sum of numbers:" + B.sum());
        C.show();
        System.out.println("Sum of numbers:" + C.sum());
    }
}
public class Test
{
    int a;
    int b;

    public Test(int i, int j)
    {
        this.a = i;
        this.b = j;
    }
    
    public static void passByValue(int x, int y)
    {
        // working with primitive types(int, char, double, etc.), then you're working with pass by value. i.e. the method receives a copy of the value of the variable
        // Changes made to the copy of the variable inside the method do not affect the original variable.
        x *= 2;
        y /=2;
    }

    public static void passByReference(Test obj)
    {
        // working with objects, then you're working with pass by reference. i.e. the method receives a reference to the object
        // Changes made to the object inside the method do affect the original object.
        obj.a *= 2;
        obj.b /= 2;
    }

    public static void main(String[] args)
    {
        System.out.println("Pass by value: ");
        int a = 10;
        int b = 20;
        System.out.println("before a: " + a);
        System.out.println("before b: " + b);
        passByValue(a, b);
        System.out.println("after a: " + a);
        System.out.println("after b: " + b);
        
        System.out.println("Pass by reference: ");
        Test testObj = new Test(10, 20);
        System.out.println("before a: " + testObj.a);
        System.out.println("before b: " + testObj.b);
        passByReference(testObj);
        System.out.println("after a: " + testObj.a);
        System.out.println("after b: " + testObj.b);
    }
}
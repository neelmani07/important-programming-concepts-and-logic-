/*
It is an inner class without a name and for which only a single object is created. An anonymous inner class can be useful when making an instance of an object with certain “extras” such as overloading methods of a class or interface, without having to actually subclass a class.

Anonymous inner classes are useful in writing implementation classes for listener interfaces in graphics programming.

*/


//Java program to demonstrate need for Anonymous Inner class 
interface Age 
{ 
    int x = 21; 
    void getAge(); 
} 
class AnonymousDemo 
{ 
    public static void main(String[] args)  
    { 
        MyClass obj=new MyClass(); 
        obj.getAge();      
    } 
} 
  
class MyClass implements Age 
{ 
    @Override
    public void getAge()  
    { 
        System.out.print("Age is "+x); 
    } 
} 
/*
In the program, interface Age is created with getAge() method and x=21.  Myclass is written as implementation class of Age interface. As done in Program, there is no need to write a  separate class Myclass. Instead,   directly copy the code of Myclass into this parameter, as shown here:

Age oj1 = new Age() {
            @Override
            public void getAge() {
                System.out.print("Age is "+x);
            }
        };

Here, an object to Age is not created but an object of Myclass is created and copied in the entire class code as shown above. This is possible only with anonymous inner class. Such a class is called ‘anonymous inner class’, so here we call ‘Myclass’ as anonymous inner class.
*/



//Java program to demonstrate Anonymous inner class 
interface Age 
{ 
    int x = 21; 
    void getAge(); 
} 
class AnonymousDemo 
{ 
    public static void main(String[] args) { 
  
        // Myclass is hidden inner class of Age interface 
        // whose name is not written but an object to it  
        // is created. 
        Age oj1 = new Age() { 
            @Override
            public void getAge() { 
                System.out.print("Age is "+x); 
            } 
        }; 
        oj1.getAge(); 
    } 
} 





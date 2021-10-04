package com.ram.myapp.mymod;

//16 WAP that show the partial implementation of Interface.

public interface ImplementationOfInterface {
	
	void Method1();
    void Method2();
}
abstract class A implements ImplementationOfInterface
{
   public void Method1()
   {
        System.out.println("In  Method 1");
   }

   abstract public void Method3();
}
class B extends A    //Inherits class A 
{
   public void Method2()
   {
        System.out.println("In Method 2");
   }
   public void Method3()
   {
        System.out.println("In Method 3");
   }
    public static void main(String args[])
       {
           B b1=new B();
           b1.Method1();
           b1.Method2();
           b1.Method3();
       }            
   

}

class A
{ 
   int a;
   A(int x)
   {
     a=x;
   }
   void writeA()
   {
      System.out.println(a);
   }
}
class B extends A
{
  int b;
  B(int x,int y)
  {
    super(x);
    b=y;
  }
  void writeB()
  {
     System.out.println(a+" "+b);
  }
}
class supTest
{
   public static void main(String[] args)
   {
       B o=new B(1,2);
       o.writeB();
       
   }
}
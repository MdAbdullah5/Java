class series
{
  static int max(int a,int b)
  {
    if(a>b)
    {
      return a;
    }
    else
    {
      return b;
    }
  }
  public static void main(String[] args)
  {
     int a[]=new int[6];
     a[0]=1;
     a[1]=2;
     a[2]=3;
     a[3]=4;
     int p=1;
     int q=1;
     for(int i=0;i<=2;i++)
     {
       p=max(a[i],a[i+1]);
     }
     System.out.println("1st max:"+p);
     for(int i=0;i<=2;i++)
     {
        if(a[i]==p||a[i+1]==p)
        {continue;}
        else
        {
           q=max(a[i],a[i+1]);
        }
     }
     System.out.println("2nd max:"+q);
  }
}
package Sorting;
public class BubbleSort
{
    public static void main(String args [])
    {
        int[]a={36,18,12,5,8};
        //int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    a[j]=a[j]+a[j+1];
                    a[j+1]=a[j]-a[j+1];   //without using third variable
                    a[j]=a[j]-a[j+1];
                    /*temp=a[j];
                    a[j]=a[j+1];   //with using third variable
                    a[j+1]=temp;*/
                }
            }
        }
       
        for(int j=0;j<a.length;j++)
        {
            System.out.println(a[j]+" ");
        }
            System.out.println("------------");
            System.out.println("Second lowest no="+a[1]+" ");  //----->for second lowest no
            System.out.println("------------");
            System.out.println("Second highest no="+a[a.length-2]+" ");  //----->for second  highest no
        
    }
     
}

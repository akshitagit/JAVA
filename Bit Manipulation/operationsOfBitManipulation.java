import java.util.*;
public class Main
{
    static Scanner sc=new Scanner(System.in);
    public static void getbit(int pos,int num){
        /*   Bit Mask : 1<<i
             Operation :AND  :
        */
       int bitmask= 1<<pos;
       int temp=(num & bitmask);
       if(temp==0) System.out.println("Bit at position "+ pos +" is 0");
       else System.out.println("Bit at position "+ pos +" is 1");
        
    }
    public static void setbit(int pos,int num){
        /* 
          Bit Mask : 1<<i
          Operation :OR  :
        */
        int bitmask=1<<pos;
        int temp=(num | bitmask);
        System.out.println("New number is "+temp);
    }
    public static void clearbit(int pos,int num){
        /* 
        Bit Mask : 1<< i
        Operation : AND WITH NOT
        */
        int bitmask=1<<pos;
        bitmask=~(bitmask);
        int temp=(num & bitmask);
        System.out.println("After performing clear bit number is: "+temp);
    }
    public static void updatebit(int pos,int num){
        /* 
         For 0                      For 1
         Bitmask : 1<<i             Bitmask: 1<<i
         Operation :AND WITH NOT    Operation : OR
         */
        int ch=sc.nextInt();
        if(ch==1){ // for updating 1
         int bitmask=1<<pos;
        int temp=(num | bitmask);
        System.out.println("New number is "+temp);   
        }
        else // for updating 0
        {
        int bitmask=1<<pos;
        bitmask=~(bitmask);
        int temp=(num & bitmask);
        System.out.println("After performing updatebit number is: "+temp);
        }
    }
	public static void main(String[] args) {
		System.out.println("Enter the position of the bit that you want to:");
		int pos=sc.nextInt();
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Enter 1 for get bit:");
		System.out.println("Enter 2 for set bit:");
		System.out.println("Enter 3 for clear bit:");
		System.out.println("Enter 4 for updatebit:");
		int ch=sc.nextInt();
		switch(ch){
		    case 1: getbit(pos,num);
		    break;
		    case 2: setbit(pos,num);
		    break;
		    case 3: clearbit(pos,num);
		    break;
		    case 4: updatebit(pos,num);
		    break;
		    default :
		    System.out.println("enter correct choice:");
		        
		}
		
	}
}

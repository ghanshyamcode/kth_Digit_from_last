//Write a progrma to print kth digit from last. [sample input 23617 and k=4 output=3]
public class digitfromlast {
    public static void main(String args[]){
        int val=0;
        int num=Integer.parseInt(args[0]);   //Taking input from user through command line
        int k=Integer.parseInt(args[1]);     //Taking index number from last 
        for(int i=0; i<k; i++){
            val=num%10;   
            num=num/10;
        }
        System.out.println(k +"th digit from last, of the number "+ args[0] +" is " +val);

    }
}

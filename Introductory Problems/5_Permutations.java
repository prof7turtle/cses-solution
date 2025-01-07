import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println(1);
        }
        else if(n<4){
            System.out.println("NO SOLUTION");
            
        }
        else{
            StringBuilder str=new StringBuilder();
            for(int i=2;i<=n;i=i+2){
                str.append(i).append(" ");
            }
            for(int i=1;i<=n;i=i+2){
                str.append(i).append(" ");
            }
            System.out.println(str.toString().trim());
            
        }
        
 
        
        
 
    }
}

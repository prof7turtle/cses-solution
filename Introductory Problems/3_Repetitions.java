import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=1;
        int max_count=1;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.charAt(i-1)==ch){
                count++;
            }
            
            
            max_count=Integer.max(count,max_count);
            if(s.charAt(i-1)!=ch){
                count=1;
            }
        }
        System.out.println(max_count);
        
        
        
    }
    
}

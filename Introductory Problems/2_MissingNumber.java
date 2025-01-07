import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        Long arr[]=new Long[n-1];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
 
        //TLE-----------------------------
        /*
        Arrays.sort(arr);
        boolean check=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i+1) continue;
            else {
                System.out.println(i+1);
                check=true;
            } 
            break;
        }
        if(check==false){
            System.out.println(arr.length+1);
        }
        */
 
 
       //Easy and mathematic way
        Long sum1=0L;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLong();
            sum1+=arr[i];
        }
        Long expected_sum=(long)n*(n+1) / 2;
        
        Long missing_num=expected_sum-sum1;
        System.out.println(missing_num);
        
        
    }
    
}

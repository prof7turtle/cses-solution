import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Long n=sc.nextLong();
        Long temp=n;
        List<Long> list =new ArrayList<>();
        list.add(temp);
        while(temp!=1){
            if(temp%2==0){
                temp=temp/2;
                list.add(temp);
            }
            else{
                temp=(temp*3)+1;
                list.add(temp);
 
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        sc.close();
    }
    
}

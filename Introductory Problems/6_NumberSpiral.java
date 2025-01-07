import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/*

//Template using fastreader by harshil
Codeforces:harshil7_
--Template inspired by Codeforces:SecondThread

--Please do not use the Template to avoid plagiarism
*/

public class Main {

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        long t=sc.nextInt();
        while(t-->0){
            long y=sc.nextInt();
            long x=sc.nextInt();

            
            //bigger odd = upar khatam hoga
            //bigger even = niche khatam hoga;
            long ans=0;
            if(y>x){
                if(y%2==0){
                    ans=(y*y)-(x-1);
                }
                else{
                    long temp=(y-1)*(y-1);
                    ans=temp+x;
                }
            }
            else{
                if(x%2!=0){
                    ans=(x*x)-(y-1);
                }
                else{
                    long temp=(x-1)*(x-1);
                    ans=temp+y;
                }
            }

            System.out.println(ans);
            
            
            
        }
        

    }
}

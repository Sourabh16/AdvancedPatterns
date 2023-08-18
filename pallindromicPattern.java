public class pallindromicPattern {
    public static void Pallindrome(int n){
        
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //num
            int x=i;
            for(int j=1;j<=i;j++){
                
                System.out.print(x);
                x--;
            }
            //num2
            int y=i;
            for(int j=1;j<=(i-1);j++){
                System.out.print(y);
                y--;
            }
            
            System.out.println();
            
        }
    }public static void main(String[] args){
        Pallindrome(5);
    }
}

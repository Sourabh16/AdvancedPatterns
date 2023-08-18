public class numberPyramid {
    public static void pyramid(int n){
        int cout = 1;
        for(int i=1;i<=n;i++){
            //space - n-i
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //num
            for(int  j=1;j<=i;j++){
                System.out.print(cout+" ");
            }
            System.out.println();
            cout++;
        }
    }
    public static void main(String args[]){
        pyramid(8);
    }
}

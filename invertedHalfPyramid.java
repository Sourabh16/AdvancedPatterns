//Logic by Sourabh
public class invertedHalfPyramid {
    public static void half_pyramid(int totRows, int totCols){
        //outer loop
        for(int i =1;i<=totRows;i++){
            //inner-columns
            for(int j=1;j<=totCols;j++){
                if(j>=totCols-i+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }System.out.println();

        }
    }
    public static void main(String[] args){
        half_pyramid(4,4);
    }
}

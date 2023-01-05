public class MoreLoopFun {
    public static void main(String[] args) {
        /*for(int outer = 1; outer < 5; outer++){
            for(int inner = 1; inner < 3; inner++){
                System.out.print(inner+ " ");
            }
            System.out.println();
        }*/

        //clock demo
        /*for(int hours = 0; hours < 24; hours++){
            for(int minutes = 0; minutes < 60; minutes++){
                for(int seconds = 0; seconds < 60; seconds++) {
                    System.out.println(hours + ":" + minutes + ":" + seconds);
                }
            }
        }*/
        /*print the following pattern

         *
         **
         ***
         ****

         */
        for(int row = 1; row <= 4; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Second triangle");
        System.out.println();

        /*print the following pattern

         ****
         ***
         **
         *

         */
        for(int row = 1; row <= 4; row++){
            for(int col = 4; col >= row; col--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Second triangle, another method");
        System.out.println();

        for(int outer = 4; outer >= 1; outer--){
            for(int inner = outer; inner > 0; inner--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
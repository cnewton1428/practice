package com.company;

public class Main {

    public static int main(String[] args) {
//    void= no value being passed back

        //Methods are a collection of statements grouped together to perform

        //Creating Methods
        public static int AddTwoNumbers(int num1, int num2){
            int sum = 0;
            sum = num1 + num2;

            return sum;
        }
    }
}
//    int sum = AddTwoNumbers(1, 2);
//        System.out.println(sum);

  // object is kbd of Scanner type= user input in Scanner class; nextInt is a method of the Scanner class
        //Scanner is non-static class
        //static is the method name itself?


        // 5.

//        String names [] = {"Jake", "Monica", "Blake"};
//        for (int i = 0; i<names.length; i++){
//            System.out.println(names[i]);
//        }

        //6.
//        int[] list = {2, 5, 9, 0, 2, 1, 8, 5, 4};
//        for (int i = 0; i < list.length; i++) {
//            if (list[i] == 5)
//                System.out.println("value of 5 equals index of " + i);
//            else {
//                System.out.println(list[i]);
//            }

        //or.6.
//        int[] num = {2, 5, 9, 0, 2, 1, 8, 5, 4};
//        for (int counter = 0; counter < num.length; counter++) {
//            if (num[counter] == 5) {
//                System.out.println(counter);
//            }
//        }
//    }


//        }

        //4.
//        int[] myArray = new int[10];
//        Scanner input = new Scanner(System.in);
//        int total = 0;
//        double average = 0;
//
//
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println("Enter a number");
//            int userInput = input.nextInt();
//            myArray[i] = userInput;
//            total = total + myArray[i];
//            System.out.println("sum: " + total);
//            System.out.println("average: " + total / myArray.length);
//        }

//7.
////        int[] num = new int[10];
//        int [] num = {1,2,3,4,5,6,7,8,9,10};
////        for (int i =num.length; i >= 1 ; i--) {
////            System.out.println(i);
////
//        for (int i= num.length-1; i>=0; i--){
//            System.out.println(num[i]); //prints all the elements in the array vs. just printing the indeces of the array which is what occurs when system.out.println(i); (you get a system out of bounds expression)
//
////        }
//        }
////    }
//}

        //8.
//        String [] values = {"w", "t", "y", "h", "k"};
//        for (int i = 0; i<= values.length; i++){
//            if (values[i].equalsIgnoreCase("t")){
//                values[1] = "hello";
//            }
//            System.out.println(values[i]);
//        }

        //9.
//        int[] a = {1, 7, 6, 5, 9};
//        int[] b = {2, 7, 6, 3, 4};

//        for (int counter = 0; counter<a.length; counter++){
//            for (int count=0; count<b.length; count++){
//                if(a[counter]==b[count]){
//                    System.out.println(a[counter] + "," + b[count]);
//                }
//            }
//        }

        //prints what's similar from both arrays for the 1st spot with the rest of the second array
//        for (int counter = 0; counter < a.length; counter++) {
//            for (int count = 0; count < b.length; count++) {
//                if (a[counter] == b[counter]) {
//                    System.out.println(a[counter] + "," + b[count]);
//                }
//            }
//        }

        //Color
//        ArrayList<String> colors = new ArrayList<>();
//        colors.add("Green");
//        colors.add("Yellow");
//        colors.add("Red");
//
//
//        Scanner in = new Scanner (System.in);
//                String s="";
//        do {
//            System.out.println("Enter a color or enter q to quit");
//            s= in.nextLine();
//
        //if condition tests true condition
//            if (!s.equalsIgnoreCase("Q")){
//                colors.add(s);
//                System.out.println(s);
//            }
        //while condition tests false condition and ends

//        }while (!s.equalsIgnoreCase("Q"));
//        System.out.println();
//
//        for (String x: colors) {
//            System.out.println(x);
//        }

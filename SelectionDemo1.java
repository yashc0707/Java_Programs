import java.util.Scanner;

class SelectionDemo1 {
    public static void main(String Arr[]) {

        Scanner sobj = new Scanner(System.in);
        int iAge = 0;

        System.out.println("Enter Your Age:");

        iAge = sobj.nextInt();

        if (iAge >= 18) {
            System.out.println("Person Can vote");
        }

        else {
            System.out.println("Person Cant Vote");
        }

    }
}
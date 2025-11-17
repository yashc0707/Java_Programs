import java.util.Scanner;

class SwitchDemo {
    public static void main(String Arr[]) {

        Scanner sobj = new Scanner(System.in);
        int istd = 0;

        System.out.println("Enter Your Standard:");

        istd = sobj.nextInt();

        switch (istd) {
            case 1:
                System.out.println("Exam is at 9Am");
                break;

            case 2:
                System.out.println("Exam is at 10Am");
                break;

            case 3:
                System.out.println("Exam is at 11Am");
                break;

            case 4:
                System.out.println("Exam is at 12noon");
                break;

            default:
                System.out.println("Invalid Standard");

        }

    }
}
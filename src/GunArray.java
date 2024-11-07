import java.util.Scanner;

public class GunArray {
    public static void main(String[] args) {
        //Tao mang chua ten danh sach sung
        String[] gun = {"M16", "M14", "M4A1"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of a gun: ");
        String input = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < gun.length; i++) {
            if(gun[i].equalsIgnoreCase(input)) {
                System.out.println("Position of gun in list " + input + " is: " + i);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Not found "+input+" in list");
        }
    }
}

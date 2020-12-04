import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Decoder dec = new Decoder();
        Scanner scan = new Scanner(System.in);
        String str;

        str = scan.nextLine();
        dec.decode(str);
        System.out.println(dec.getBuffer());
        //dec.reset();
        str = scan.nextLine();
        dec.decode(str);
        System.out.println(dec.getBuffer());

        str = scan.nextLine();
        dec.decode(str);
        System.out.println(dec.getBuffer());

    }
}

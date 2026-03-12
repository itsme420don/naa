import java.io.File;
import java.util.Scanner;

public class FileInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename: ");
        File f = new File(sc.nextLine());
        System.out.println("Exists: "+f.exists());
        System.out.println("Can Read: "+f.canRead());
        System.out.println("Can Write: "+f.canWrite());
        System.out.println("Type: "+(f.isFile()?"File":"Folder"));
        if(f.exists()) System.out.println("Size: "+f.length()+" bytes");
    }
}

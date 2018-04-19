import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestReader {
    public static void main(String [] args)throws IOException{
        FileWriter fw=new FileWriter("E:\\我的文件\\mikey\\java\\TestFildReader\\src\\1.txt");
        fw.write("hello");
        fw.flush();

        FileReader fr=new FileReader("E:\\我的文件\\mikey\\java\\TestFildReader\\src\\1.txt");
        int i;
        i=fr.read();
        while (i!=-1){
            System.out.printf("%c",(char)i);
            i=fr.read();
        }
        fr.close();
        //Scanner s=new Scanner(System.in);
        //int i=s.nextInt();

    }
}
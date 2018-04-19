import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String [] a ) throws IOException{
        FileReader fr=new FileReader("E:\\我的文件\\mikey\\java\\TestFildReader\\src\\1.txt");
        FileWriter fw=new FileWriter("E:\\我的文件\\mikey\\java\\TestFildReader\\src\\11.txt");
        int c=fr.read();
        while (-1!=c) {
            fw.write(c);
            c = fr.read();
        }
        fw.flush();
        fr.close();
        fw.close();
    }
}

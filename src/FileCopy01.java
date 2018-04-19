import java.io.*;

public class FileCopy01 {
    public static void main(String [] a ) throws IOException{
        FileInputStream fr=new FileInputStream("E:\\我的文件\\mikey\\java\\TestFildReader\\src\\1.txt");
        FileOutputStream fw=new FileOutputStream("E:\\我的文件\\mikey\\java\\TestFildReader\\src\\111.txt");
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


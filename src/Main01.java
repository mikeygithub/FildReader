import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.Buffer;

public class Main01 {
    public static void main(String [] at)throws Exception{
        FileInputStream fis=new FileInputStream("E:\\我的文件\\mikey\\java\\1_Java概述_1.avi");
        FileOutputStream fos=new FileOutputStream("E:\\我的文件\\mikey\\java\\TestFildReader\\src\\java.j");
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);

        int b;
        b=bis.read();
        while (b!=-1){
            bos.write(b);
            b=bis.read();
        }
        bos.flush();
        bis.close();


    }
}

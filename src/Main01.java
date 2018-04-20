import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.Buffer;

public class Main01 {
    public static void main(String [] at)throws Exception{
        //FileInputStream fis=new FileInputStream("E:\\我的文件\\mikey\\java\\1_Java概述_1.avi");
        //FileOutputStream fos=new FileOutputStream("E:\\我的文件\\mikey\\java\\TestFildReader\\src\\java.j");
        //BufferedInputStream bis=new BufferedInputStream(fis);
        //BufferedOutputStream bos=new BufferedOutputStream(fos);
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("E:\\我的文件\\mikey\\java\\1_Java概述_1.avi"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\我的文件\\mikey\\java\\TestFildReader\\src\\java01.j"));
byte[] buf=new byte[1024];
        int b;
        b=bis.read();
        while (b!=-1){
            bos.write(b);
            bos.write(buf,0,b);
            b=bis.read();
        }
        //BufferedOutputStream bos1=new BufferedOutputStream(new FileOutputStream("E:\\我的文件\\mikey\\java\\TestFildReader\\src\\java001.j"));
        //bos1.write(buf);
        //bos1.flush();
        bos.flush();
        bis.close();


    }
}

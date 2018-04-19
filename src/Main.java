import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        //FileReader fr=new FileReader("E:\\桌面壁纸\\111.jpg");
        FileReader fr=new FileReader("E:\\我的文件\\mikey\\java\\TestFildReader\\src\\Main.java");
                int ch;
        ch=fr.read();
        while(-1!=ch){
            System.out.printf("%c",(char)ch);//int c=ch;System.out.printf("%d",c);//System.out.printf("%d",ch);
            ch=fr.read();

        }
        //int c=ch;System.out.println(c);
        fr.close();
    }
}

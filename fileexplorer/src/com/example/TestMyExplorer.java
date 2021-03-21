import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class TestMyExplorer {
    public static void main(String[] args) throws IOException {
        MyExplorer me = new MyExplorer();
        //me.delFile(new File("1"));
        //me.showFiles(new File("F:/Test"));
        //System.out.println(".");
        //me.printFile(new File("f1.txt"));
        //me.writeData(new File("f2.txt"),"new");
        //me.createFile(new File("F:/oo"),"txt","1");
        //me.shearFile(new File("F:/ii - 副本"),new File("F:/oo"));
        //File f = new File("F:/oo");
        //me.delFile(f);
        //f.mkdir();
        //System.out.println(f.isDirectory());
        //System.out.println(f.delete());
        //me.listFilesMatchString(new File("F:/ii"),"1");
//        String source = "C:\\system32\\blogs\\changle\\";
//        //验证通过-匹配windows路径
//        System.out.println(source.matches("^[A-z]:\\\\(.+?\\\\)*$"));
//
//        String fileName = "C:\\file\\path\\my.png";
//        //验证通过-匹配windows文件全名
//        System.out.println(fileName.matches("^[A-z]:\\\\\\S+$"));
//        //验证通过-匹配windows文件全名
//        System.out.println(fileName.matches("^[A-z]:\\\\(\\S+)*$"));
//
//        System.out.println(removeFilePath("c:\\file\\path\\my.png"));
        //me.listFilesMatchRegex(new File("F:\\\\TestPicture"),"F:\\\\TestPicture\\01.bmp");
        //new File("F:/ii/新建文件夹").mkdir();
        //me.renameFile(new File("F:/ii/新建文件夹"));
//        me.encode(new File("F:/ii/111 - 副本.txt"));
//        me.decode(new File("F:/ii/encoded-111 - 副本.txt"));
//        me.encode(new File("F:\\TestPicture\\02 - 副本.jpg"));
//        me.decode(new File("F:\\TestPicture\\encoded-02 - 副本.jpg"));
        String s1 = "abc";
        String s2 = "abc";
        System.out.println();
//

    }
}
abstract class abc {
    int i;
    public int f1() {
        int inPut = new Scanner(System.in).nextInt();
        return 1/inPut;
    }
    public abstract int f2();
}
interface abcd {
    default void f(){

    }

    void ff();
}
class a extends abc implements abcd{

    @Override
    public int f1() {
        return super.f1();
    }

    void f3(){

    }

    int  f3(String s  ){
        return 1;
    }

    @Override
    public int f2() {
        return 0;
    }

    @Override
    public void ff() {

    }
}
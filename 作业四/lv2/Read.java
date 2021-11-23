package stream;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
class ReadStream {
    public static void main(String[] args) {
        File f = new File("E:\\yyds.txt");
        // 创建基于文件的Reader
        try (FileWriter fr = new FileWriter(f)) {
            // 以字符流的形式把数据写入到文件中
            System.out.println("请输入您所需要的字符：");
            Scanner s = new Scanner(System.in);
            String a = s.nextLine();
            System.out.println("输入的字符串是："+a);
            char[] cs = a.toCharArray();
            fr.write(cs);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try (FileReader fr = new FileReader(f)) {
            // 创建字符数组，其长度就是文件的长度
            char[] all = new char[(int) f.length()];
            // 以字符流的形式读取文件所有内容
            fr.read(all);
            System.out.println("输出的字符串是：");
            for (char b : all) {
                System.out.print(b);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
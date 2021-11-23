import java.util.Objects;
import java.util.Scanner;
public class Counter {
    public static void main(String[] args) {
        System.out.println("请输入格式为【数字】【符号】【数字】的计算式：");
        System.out.println("请输入第一个【数字】：");//输入第一个数
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        System.out.println("请输入【符号】：");
        Scanner s1 = new Scanner(System.in);
        String b = s1.nextLine();
        System.out.println("请输入第二个【数字】：");
        Scanner s2 = new Scanner(System.in);
        float c = s2.nextFloat();
        System.out.println("得出结果为：");
        if (Objects.equals(b, "+")) {
        float d = a+c;
        System.out.println(a+"+"+c+"="+d);
        }
       else if (Objects.equals(b, "-")) {
            float d = a-c;
            System.out.println(a+"-"+c+"="+d);
        }
       else if (Objects.equals(b, "*")) {
            float d = a*c;
            System.out.println(a+"*"+c+"="+d);
        }
        else if (Objects.equals(b, "/")) {
            float d = a/c;
            System.out.println(a+"/"+c+"="+d);
        }
    }}
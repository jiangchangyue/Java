/*
编写一异常处理程序，模拟危险品检查。
程序循环接受输入字符串，如果字符串中含有“b”“o”“m”“b”四个字母，则抛出异常，并处理异常；如果没有异常，程序循环接受输入字符串。
*/

import java.util.Scanner;
class Danger extends Exception{
    final String mas="危险！请检查！";
    public String warn(){
        return mas;
    }
}
class str{
    String w;
    str(String w){
        this.w=w;
    }
    public void chack()throws Danger{
        char []a=w.toCharArray();
        int num1=0;
        int num2=0;
        int num3=0;
        for(int i=0;i<a.length;i++){
            if(a[i]=='b') num1++;
            if(a[i]=='o') num2++;
            if(a[i]=='m') num3++;
            }
        for(int i=0;i<a.length;i++){
            if(num1==2||num2!=0||num3!=0){
                throw new Danger();
            }
        }
    }
}
public class Lianxi {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("按1开始，按0结束:");
            int m=input.nextInt();
            if(m==0) break;
            System.out.println("输入字符串：");
            String w=input.next();
            str g=new str(w);
            try{
                g.chack();
            }
            catch (Danger e){
                System.out.println(e.warn());
                continue;
            }
            System.out.println("安全！");
        }
    }
}

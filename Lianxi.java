import java.util.Scanner;
class Danger extends Exception{
    final String mas="Σ�գ����飡";
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
            System.out.println("��1��ʼ����0����:");
            int m=input.nextInt();
            if(m==0) break;
            System.out.println("�����ַ�����");
            String w=input.next();
            str g=new str(w);
            try{
                g.chack();
            }
            catch (Danger e){
                System.out.println(e.warn());
                continue;
            }
            System.out.println("��ȫ��");
        }
    }
}

import java.util.Scanner;
interface Gradeable{
    double f();
    void show(double x);
}
class Grade1 implements Gradeable{
    double []a=new double[9];
    Grade1(double []a){
        for(int i=0;i<9;i++)
            this.a[i]=a[i];
    }
    public double f() {
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j+1]) {
                    double temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        double num = 0;
        for (int k = 1; k < a.length-1; k++) {
            num = num + a[k];
        }
        num = num / (a.length-2);
        return num;
    }
    public void show(double x){
        System.out.printf("����1��ֽ����%.1f\n",x);
    }
}
class Grade2 implements Gradeable{
    double []r=new double[9];
    Grade2(double []r){
        for(int i=0;i<9;i++){
            this.r[i]=r[i];
        }
    }
    public double f(){
        double num=0;
        for(int i=0;i<9;i++){
            num=num+r[i];
        }
        return num/9;
    }
    public void show(double x){
        System.out.printf("����2��ֽ����%.1f\n",x);
    }
}
class Grade3 implements Gradeable{
    String []w=new String [9];
    double []r=new double[9];
    Grade3(String []w){
        for(int i=0;i<9;i++){
            this.w[i]=w[i];
        }
    }
    public double f(){
        for(int i=0;i<9;i++){
            if(w[i].equals("A+")) r[i]=8;
            else if(w[i].equals("A")) r[i]=7;
            else if(w[i].equals("B+")) r[i]=6;
            else if(w[i].equals("B")) r[i]=5;
            else if(w[i].equals("C+")) r[i]=4;
            else if(w[i].equals("C")) r[i]=3;
            else if(w[i].equals("D+")) r[i]=2;
            else if(w[i].equals("D")) r[i]=1;
        }
        for (int i = 1; i < r.length; i++) {
            for (int j = 0; j < r.length-1; j++) {
                if (r[j] > r[j+1]) {
                    double temp = r[j];
                    r[j] = r[j+1];
                    r[j+1] = temp;
                }
            }
        }
        double num = 0;
        for (int k = 1; k < r.length-1; k++) {
            num = num + r[k];
        }
        num = num / (r.length-2);
        return num;
    }
    public void show(double x){
        int m=(int)x;
        switch(m){
            case 1:System.out.println("����3��ֽ����D");break;
            case 2:System.out.println("����3��ֽ����D+");break;
            case 3:System.out.println("����3��ֽ����C");break;
            case 4:System.out.println("����3��ֽ����C+");break;
            case 5:System.out.println("����3��ֽ����B");break;
            case 6:System.out.println("����3��ֽ����B+");break;
            case 7:System.out.println("����3��ֽ����A");break;
            case 8:System.out.println("����3��ֽ����A+");break;
        }
    }
}
public class Text {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        double []a=new double[9];
        double []l=new double[9];
        String []w=new String[9];
        System.out.print("����1�������ݣ�");
        for(int i=0;i<9;i++)
            a[i]=in.nextDouble();
        Grade1 m=new Grade1(a);
        double e=m.f();
        m.show(e);
        System.out.print("����2�������ݣ�");
        for(int i=0;i<9;i++)
            l[i]=in.nextDouble();
        Grade2 x=new Grade2(l);
        double d=x.f();
        x.show(d);
        System.out.print("����3�������ݣ�");
        for(int i=0;i<9;i++)
            w[i]=in.next();
        Grade3 y=new Grade3(w);
        double t=y.f();
        y.show(t);
    }
}

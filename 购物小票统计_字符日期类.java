import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

class Strr{
    String w;
    Strr(String w){
        this.w=w;
    }
    public int split1()throws Exception{
        String[] dateAndTime=w.split(" ");
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse(dateAndTime[0]);
        calendar.setTime(date);
        int i =calendar.get(Calendar.DAY_OF_WEEK);
        return i;
    }
    public double split2(){
        String[] dateAndTime=w.split(" ");
        String g=dateAndTime[2];
        double mon=Double.parseDouble(g);
        return mon;
    }
}
public class 购物小票统计_字符日期类 {
    public static void main(String args[])throws Exception{
        double []a=new double[7];
        Scanner input=new Scanner(System.in);
        System.out.println("输入记录数：");
        int n=input.nextInt();
        String x = input.nextLine();
        System.out.println("输入小票信息：");
        for(int i=0;i<n;i++) {
            String w = input.nextLine();
            Strr r = new Strr(w);
            int week =r.split1();
            double mon=r.split2();
            if(week==2) a[0]+=mon;
            if(week==3) a[1]+=mon;
            if(week==4) a[2]+=mon;
            if(week==5) a[3]+=mon;
            if(week==6) a[4]+=mon;
            if(week==7) a[5]+=mon;
            if(week==1) a[6]+=mon;
        }
        for(int i=0;i<7;i++){
            System.out.println("星期"+(i+1)+" "+a[i]+"元");
        }
    }
}

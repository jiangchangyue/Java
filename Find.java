/*
编写一个“英汉-汉英”字典。输入英文，输出中文解释；输入中文，输出相关的英语单词。
*/
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

class txttest {
    public static String [] toArrayByRandomAccessFile(File file) {
        InputStreamReader isr;
        String str;
        String []ww = new String [7987];
        try {
            isr = new InputStreamReader(new FileInputStream(file), "utf-8");
            BufferedReader fileR = new BufferedReader(new FileReader(file));
            int i=0;
            while ((str = fileR.readLine())!= null) {
                ww[i++]=str;
            }
            fileR.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ww;
    }
}


class compare {
    public static int com(String g, String j) {
        String[] ce = j.split("   ");
        int flag=0;
        if (g.compareTo(ce[0]) == 0) {
            System.out.println(ce[1]);
            System.out.println();
            flag=1;
        }
        if(ce[1].contains(g)==true){
            System.out.println(ce[0]);
            System.out.println();
            flag=1;
        }
        return flag;
    }
}

public class Find {
    public static void main(String args[]) {
        File file = new File("src/dictionary.txt");
        String st[] = txttest.toArrayByRandomAccessFile(file);
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("input one word(press 0 to exit):");
            String t = input.next();
            if(t.compareTo("0")==0)break;
            int flag=0;
            for(int i=0;i<7987;i++){
                flag=compare.com(t,st[i]);
                if(flag==1)break;
            }
            if(flag==0)
                System.out.println("without this word!");
            System.out.println();
        }
    }
}

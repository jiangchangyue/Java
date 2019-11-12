package com.westos.danli;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Spider1 {
    public static void main(String[] args) throws IOException {
        HttpURLConnection connection =(HttpURLConnection)
                new URL("https://tieba.baidu.com/f?ie=utf-8&kw=%E9%A3%8E%E6%99%AF%E5%9B%BE&fr=search").openConnection();
//        InputStream in = connection.getInputStream();
//        BufferedReader reader;
//        reader = new BufferedReader(new FileReader(String.valueOf(in)));
        String html = Spider1.getHtml(connection);//
        ArrayList pictureUrl = getPictureUrl(html);
        getPicture(pictureUrl);//
 
        return;
    }
 
    private static void getPicture(ArrayList pictureUrl) throws IOException {
        for (Object p : pictureUrl) {
           HttpURLConnection conn = (HttpURLConnection) new URL((String)p).openConnection();
            InputStream in = conn.getInputStream();
            UUID uuid = UUID.randomUUID();//
            FileOutputStream out = new FileOutputStream("C:\\desktop\\picture\\"+uuid+".png");//
            while (true){
                byte[] bytes = new byte[1024];
                int len = in.read(bytes);
                if(len == -1){
                    break;
                }
                out.write(bytes,0,len);
            }
            out.close();
        }
    }
    private static ArrayList getPictureUrl(String html) {
        Pattern patternRegex = Pattern.compile("bpic=\"(.*?)\"");
        Matcher matcher = patternRegex.matcher(html);
        String htmlUrl=null;
 
        ArrayList<String> listUrl = new ArrayList<>();
        while (matcher.find()){
            htmlUrl = matcher.group();
            String[] split = htmlUrl.split("=\"");
            String[] split1 = split[1].split("\"");//
            listUrl.add(split1[0]);//
        }
        return listUrl;
    }
   
    private static String getHtml(HttpURLConnection connection) throws IOException {
        InputStream in = connection.getInputStream();//
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("123.html"));
        StringBuffer stringBuffer1 = new StringBuffer();//
        while (true) {
            String s = reader.readLine();//
            if (s == null) {
                break;
            }
            bufferedOutputStream.write(s.getBytes());
            stringBuffer1.append(s).append("\n");//
        }
        return stringBuffer1.toString();
    }
 
 
    }
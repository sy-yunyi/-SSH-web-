package sy.qust.three.util;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sy on 2017/5/31 0031.
 */
public class test {
    public static void main(String[] args){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmSS");
        String s=sdf.format(new Date());
        System.out.println(s);


    }
}

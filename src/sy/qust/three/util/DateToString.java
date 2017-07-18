package sy.qust.three.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sy on 2017/5/31 0031.
 */
public class DateToString {
    public static String toString(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmSS");
        String s=sdf.format(date);
        return s;
    }
}

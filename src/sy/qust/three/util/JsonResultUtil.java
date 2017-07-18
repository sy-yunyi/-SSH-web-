package sy.qust.three.util;

import com.google.gson.Gson;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by sy on 2017/5/27 0027.
 */
public class JsonResultUtil {
    public static void toJosn(HttpServletResponse response,Object data){
        Gson gson =new Gson();
        try {
            response.setContentType("text/json; charset=utf-8");
            response.setCharacterEncoding("UTF-8");
            response.setHeader("Cache-Control", "no-cache"); //取消浏览器缓存
            PrintWriter out=response.getWriter();
            String result=gson.toJson(data);
            out.print(result);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

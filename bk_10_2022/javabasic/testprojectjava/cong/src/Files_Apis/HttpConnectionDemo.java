package Files_Apis;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
//sử dụng https url connection để gọi đến 1 trong trong java, để đọc dữ liêu, giá trị trả về của web
public class HttpConnectionDemo {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://howkteam.vn/");

        // Open a connection(?) on the URL(??) and cast the response(???)
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

        for (int i=0;i<httpURLConnection.getHeaderFields().size();i++) {
            System.out.println(httpURLConnection.getHeaderFieldKey(i)+ "=" + httpURLConnection.getHeaderField(i));
        }

    }
}

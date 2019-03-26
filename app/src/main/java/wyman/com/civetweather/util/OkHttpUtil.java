package wyman.com.civetweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Callback;
import okhttp3.Request;

public class OkHttpUtil {
    public static void sendOkHttpRequest(String url ,Callback callback){
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(callback);
    }
}

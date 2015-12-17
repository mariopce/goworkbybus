package com.tomtom.work.workbus.network;

import android.content.Context;

import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class TransitartRequester {

    static final String ROOT_URL = "http://api.transitart.io/";
    /**
     * 10MB.
     */
    private static final long CACHE_SIZE = 10 * 1024 * 1024;

    private Context context;
    private String CACHE_DIR ="/http/";

    public TransitartRequester(Context context) {
        this.context = context;
    }

    public  <T> T setupInterface(Class<T> service) {
        final OkHttpClient client = new OkHttpClient();
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        client.interceptors().add(logging);
        Cache cache = new Cache(new File(context.getExternalCacheDir()+CACHE_DIR), CACHE_SIZE);
        client.setConnectTimeout(10, TimeUnit.SECONDS);
        client.setWriteTimeout(10, TimeUnit.SECONDS);
        client.setReadTimeout(30, TimeUnit.SECONDS);
        client.setCache(cache);
        Retrofit builder = new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
        return builder.create(service);
    }
}

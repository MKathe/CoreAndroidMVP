package com.codev.coreandroidmvp.data.repositories.remote;

import com.codev.coreandroidmvp.BuildConfig;

/**
 * Service Factory for Retrofit
 */
public class ServiceFactory {

    public static final String API_BASE_URL = "URL";

// set your desired log level

/*    private static OkHttpClient httpClient = new OkHttpClient();
    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> serviceClass) {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(logging).build();

        Retrofit retrofit = builder.client(httpClient).client(client).build();
        return retrofit.create(serviceClass);
    }*/
}

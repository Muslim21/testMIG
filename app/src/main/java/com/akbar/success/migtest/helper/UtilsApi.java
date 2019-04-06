package com.akbar.success.migtest.helper;

public class UtilsApi {

    public static final String BASE_URL_API = "http://192.168.0.104/latihan1/";

    // Mendeklarasikan Interface BaseApiService
    public static ApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(ApiService.class);
    }
}

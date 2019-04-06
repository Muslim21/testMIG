package com.akbar.success.migtest.helper;



import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {

    @FormUrlEncoded
    @POST("Login.php")
    Call<ResponseBody> loginRequest(@Field("email") String email,
                                    @Field("password") String password);

    // Fungsi ini untuk memanggil API http://'''''/register.php

    @FormUrlEncoded
    @POST("Register.php")
    Call<ResponseBody> registerRequest(@Field("nama") String nama,
                                       @Field("email") String email,
                                       @Field("password") String password);



}

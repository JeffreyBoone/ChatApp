package com.koddev.chatapp.Fragments;

import com.koddev.chatapp.Notifications.MyResponse;
import com.koddev.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAkquBudI:APA91bHDX7FPjWmkq7ZgL4fLySI1IzVt6ffMmEwyYAVZkb8P9I2iUDhR48e6f3TMVjfcHJ61paWZ4JqbVRgcYfN6esRgaGL2QyLBnIENg-GQD7_Rt_CIRKmBeYZt4xFsKry2vE04a9pL"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

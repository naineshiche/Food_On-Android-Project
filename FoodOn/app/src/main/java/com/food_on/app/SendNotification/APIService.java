package com.food_on.app.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAABMMfvUE:APA91bH44K5cUUGXU03jXpenttpgTWO6Dh43oas_1CNfR2oYmy_N36wWrAqKDOIGJCDwqNcLHsXqb8AI02ufAnEQ7v-PAM_Gf3Yf7FKQJwlsg4jOnWyXtMp5gLmkcfC-cu2hl7fCreCr\t\n"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}

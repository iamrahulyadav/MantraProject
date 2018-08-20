package com.pasistence.mantrafingerprint.Common;

import com.pasistence.mantrafingerprint.Remote.IMyAPI;
import com.pasistence.mantrafingerprint.Remote.RetrofitClient;

public class Common {

    public static final String BASE_URL = "http://192.168.0.105/mantra/";
    // public static final String BASE_URL = "http://localhost/myapi/";

    public static IMyAPI getApi(){
        return RetrofitClient.getClient(BASE_URL).create(IMyAPI.class);
    }

}

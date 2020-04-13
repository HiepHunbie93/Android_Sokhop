package com.example.ev.SoKhop.Api;

import android.app.Activity;

import com.example.ev.SoKhop.Api.core.API;

/**
 * Created by MSI on 10/13/2016.
 */

public class HttpGetPositionTimeline extends API {

    private String access_token ;
    private String user_id;
    public HttpGetPositionTimeline(Activity context, String token, String id) {
        super(context);
        access_token = token;
        user_id = id;
    }

    @Override
    protected APIMethods getMethod() {
        return APIMethods.GET;
    }

    @Override
    protected String getUrl() {
        return APIConstants.GET_POSITION_TIMELINE_URL +"?access_token="+ access_token+"&user_id="+user_id;
    }

    public void request(APIDelegate httpRequestCallback) {

//        addParam("access_token",access_token);
        super.request(httpRequestCallback, true);
    }
}

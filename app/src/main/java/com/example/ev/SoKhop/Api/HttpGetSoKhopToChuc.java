package com.example.ev.SoKhop.Api;

import android.app.Activity;

import com.example.ev.SoKhop.Api.core.API;

/**
 * Created by MSI on 11/2/2016.
 */

public class HttpGetSoKhopToChuc extends API {

    private String access_token ;
    private String page_id;
    public HttpGetSoKhopToChuc(Activity context, String token, String id) {
        super(context);
        access_token = token;
        page_id = id;
    }

    @Override
    protected APIMethods getMethod() {
        return APIMethods.GET;
    }

    @Override
    protected String getUrl() {
        return APIConstants.GET_ALL_CANDIDATE_MATCHING_JOB_URL +"?access_token="+ access_token+"&page="+page_id;
    }

    public void request(APIDelegate httpRequestCallback) {

//        addParam("access_token",access_token);
        super.request(httpRequestCallback, true);
    }
}
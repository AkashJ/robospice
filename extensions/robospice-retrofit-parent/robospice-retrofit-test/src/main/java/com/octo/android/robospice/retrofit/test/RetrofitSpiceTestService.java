package com.octo.android.robospice.retrofit.test;

import java.io.File;

import com.octo.android.robospice.retrofit.RetrofitGsonSpiceService;

public class RetrofitSpiceTestService extends RetrofitGsonSpiceService {

    @Override
    protected String getServerUrl() {
        return "";
    }

    @Override
    public File getCacheFolder() {
        return new File("/");
    }

}

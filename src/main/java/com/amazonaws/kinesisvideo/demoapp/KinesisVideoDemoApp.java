package com.amazonaws.kinesisvideo.demoapp;

import android.app.Application;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.regions.Regions;

public class KinesisVideoDemoApp extends Application {
    public static final String TAG = KinesisVideoDemoApp.class.getSimpleName();
    public static Regions KINESIS_VIDEO_REGION = Regions.US_WEST_2;

    private static final AWSCredentials CREDENTIALS = new BasicAWSCredentials("YOUR ACCESS KEY ID", "YOUR ACCESS KEY SECRET");
    // If you want to use session token
    // private static final AWSCredentials CREDENTIALS = new BasicSessionCredentials("YOUR ACCESS KEY ID", "YOUR ACCESS KEY SECRET", "YOUR SESSION TOKEN");
    private static final StaticCredentialsProvider CREDENTIALS_PROVIDER = new StaticCredentialsProvider(CREDENTIALS);

    public static AWSCredentialsProvider getCredentialsProvider() {
        return CREDENTIALS_PROVIDER;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}

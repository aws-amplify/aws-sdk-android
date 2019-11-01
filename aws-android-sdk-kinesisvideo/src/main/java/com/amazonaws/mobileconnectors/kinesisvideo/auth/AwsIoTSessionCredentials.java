package com.amazonaws.mobileconnectors.kinesisvideo.auth;

import com.amazonaws.auth.AWSSessionCredentials;

import java.util.Date;

public class AwsIoTSessionCredentials implements AWSSessionCredentials {
    private String accessKeyId;
    private String secretAccessKey;
    private String sessionToken;
    private Date expiration;

    public String getAccessKeyId() {
        return accessKeyId;
    }
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }
    public String getSecretAccessKey() {
        return secretAccessKey;
    }
    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }
    public String getSessionToken() {
        return sessionToken;
    }
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }
    public Date getExpiration() {
        return expiration;
    }
    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    @Override
    public String toString() {
        return "AwsIoTSessionCredentials [accessKeyId=" + accessKeyId + ", secretAccessKey=" + secretAccessKey
                + ", sessionToken=" + sessionToken + ", expiration=" + expiration + "]";
    }

    @Override
    public String getAWSAccessKeyId() {
        return accessKeyId;
    }

    @Override
    public String getAWSSecretKey() {
        return secretAccessKey;
    }
}
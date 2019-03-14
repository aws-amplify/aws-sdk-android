package com.amazonaws.mobile.client.internal.oauth2;

public class OAuth2Exception extends RuntimeException {
    String error, errorDescription, errorUri;

    public OAuth2Exception(String message, String error, String errorDescription,
                           String errorUri) {
        super(message);
        this.error = error;
        this.errorDescription = errorDescription;
        this.errorUri = errorUri;
    }

    public String getError() {
        return error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public String getErrorUri() {
        return errorUri;
    }
}

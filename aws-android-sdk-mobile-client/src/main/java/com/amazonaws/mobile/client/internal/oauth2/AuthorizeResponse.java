package com.amazonaws.mobile.client.internal.oauth2;

import android.net.Uri;

public class AuthorizeResponse {
    Uri responseUri;
    String code;

    public Uri getResponseUri() {
        return responseUri;
    }

    public String getCode() {
        return code;
    }
}

package com.amazonaws.mobileconnectors.cognitoidentityprovider.android.demo;

import io.reactivex.Single;

public interface AuthProvider {

    Single<String> getJwtToken();
}

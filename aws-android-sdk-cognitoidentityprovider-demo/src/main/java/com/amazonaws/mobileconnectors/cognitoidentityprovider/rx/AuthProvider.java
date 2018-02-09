package com.amazonaws.mobileconnectors.cognitoidentityprovider.rx;

import io.reactivex.Single;

public interface AuthProvider {

    Single<String> getJwtToken();
}

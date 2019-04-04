package com.amazonaws.mobile.client.internal.oauth2;

public class OAuth2Tokens {
    String tokenType;
    String accessToken;
    String idToken;
    String refreshToken;
    String scopes;
    Long expiresIn;
    Long createDate;

    public OAuth2Tokens(String accessToken, String idToken, String refreshToken, String tokenType,
                        Long expiresIn, Long createDate, String scopes) {
        this.accessToken = accessToken;
        this.idToken = idToken;
        this.refreshToken = refreshToken;
        this.tokenType = tokenType;
        this.expiresIn = expiresIn;
        this.createDate = createDate;
        this.scopes = scopes;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getIdToken() {
        return idToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public String getScopes() {
        return scopes;
    }


    public Long getExpiresIn() {
        return expiresIn;
    }

    public Long getCreateDate() {
        return createDate;
    }

}

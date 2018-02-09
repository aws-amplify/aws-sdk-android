package com.amazonaws.mobileconnectors.cognitoidentityprovider.android.demo;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoDevice;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserSession;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.ChallengeContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.MultiFactorAuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoSecretHash;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProviderClient;

import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

public class AuthProviderCognito implements AuthProvider {

    // store in case we need to refresh with the stored username and password
    private final String emailAddress;
    private final String password;

    private AmazonCognitoIdentityProvider cognitoIdentityProviderClient;
    private CognitoUser cognitoUser;

    public AuthProviderCognito(String clientId, String clientSecret, String poolId, String region,
                               String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;

        cognitoIdentityProviderClient =
                new AmazonCognitoIdentityProviderClient(new AnonymousAWSCredentials(),
                        new ClientConfiguration());
        cognitoIdentityProviderClient.setRegion(RegionUtils.getRegion(region));

        CognitoUserPool pool = new CognitoUserPool(poolId, clientId, clientSecret, Regions.EU_WEST_1);
        cognitoUser = new CognitoUser(pool, emailAddress, clientId, clientSecret,
                CognitoSecretHash.getSecretHash(emailAddress, clientId, clientSecret),
                cognitoIdentityProviderClient);
    }

    @Override
    public Single<String> getJwtToken() {
        return Single.create(new SingleOnSubscribe<String>() {
            @Override
            public void subscribe(SingleEmitter<String> emitter) throws Exception {
                try {
                    cognitoUser.getSession(new AuthenticationHandler() {
                        @Override
                        public void onSuccess(CognitoUserSession userSession, CognitoDevice newDevice) {
                            emitter.onSuccess(userSession.getAccessToken().getJWTToken());
                        }

                        @Override
                        public void getAuthenticationDetails(
                                AuthenticationContinuation authenticationContinuation, String userId) {
                            AuthenticationDetails authenticationDetails = new AuthenticationDetails(emailAddress,
                                    password, null);
                            authenticationContinuation.setAuthenticationDetails(authenticationDetails);
                            authenticationContinuation.continueTask();
                        }

                        @Override
                        public void getMFACode(MultiFactorAuthenticationContinuation continuation) {
                            emitter.onError(new UnsupportedOperationException("MFA required - aborting"));
                        }

                        @Override
                        public void authenticationChallenge(ChallengeContinuation continuation) {
                            emitter.onError(
                                    new UnsupportedOperationException("unsupported authentication challenge"));
                        }

                        @Override
                        public void onFailure(Exception exception) {
                            emitter.onError(exception);
                        }
                    });

                } catch (Exception ex) {
                    emitter.onError(ex);
                }
            }
        });
    }
}
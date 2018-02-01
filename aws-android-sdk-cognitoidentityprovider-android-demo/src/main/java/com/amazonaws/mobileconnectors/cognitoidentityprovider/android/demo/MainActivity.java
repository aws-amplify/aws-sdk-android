package com.amazonaws.mobileconnectors.cognitoidentityprovider.android.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.amazonaws.AndroidInitializer;
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

import java.util.Random;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private static String TAG = MainActivity.class.getSimpleName();

    String clientId = "your client id";
    String clientSecret = "your client secret";
    String poolId = "your pool id";

    String region = "your region";
    String emailAddress = "user id for login";
    String password = "user password for login";

    private TextView textview;
    private TextView textview2;
    
    private final Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.textView);
        textview2 = findViewById(R.id.textView2);
        AndroidInitializer.init(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (random.nextBoolean()) {
            Log.d(TAG, "using reactive extensions code path");
            textview2.setText("RX");
            rxJava();  
        } else {
            Log.d(TAG, "using stock aws code path");
            textview2.setText("legacy");
            legacy();
        }
    }

    private void legacy() {
        AmazonCognitoIdentityProvider cognitoIdentityProviderClient =
                new AmazonCognitoIdentityProviderClient(new AnonymousAWSCredentials(),
                        new ClientConfiguration());
        cognitoIdentityProviderClient.setRegion(RegionUtils.getRegion(region));

        CognitoUserPool pool = new CognitoUserPool(poolId, clientId, clientSecret, Regions.EU_WEST_1);
        CognitoUser cognitoUser = new CognitoUser(pool, emailAddress, clientId, clientSecret,
                CognitoSecretHash.getSecretHash(emailAddress, clientId, clientSecret),
                cognitoIdentityProviderClient);
        cognitoUser.getSessionInBackground(new AuthenticationHandler() {
            @Override
            public void onSuccess(CognitoUserSession userSession, CognitoDevice newDevice) {
                if (textview != null) {
                    textview.setText(userSession.getAccessToken().getJWTToken());
                }
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
                Log.e(TAG, "MFA required - aborting", new UnsupportedOperationException("MFA required - aborting"));
            }

            @Override
            public void authenticationChallenge(ChallengeContinuation continuation) {
                Log.e(TAG, "unsupported authentication challenge", new UnsupportedOperationException("unsupported authentication challenge"));
            }

            @Override
            public void onFailure(Exception exception) {
                Log.e(TAG, "failure", exception);
            }
        });

    }

    private void rxJava() {

        AuthProvider authProvider = new AuthProviderCognito(clientId, clientSecret, poolId, region,
                emailAddress, password);

        authProvider.getJwtToken()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<String>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println("Subscribed");
                    }

                    @Override
                    public void onSuccess(String jwt) {
                        if (textview != null) {
                            textview.setText(jwt);
                        } else {
                            System.out.println("Success: " + jwt);
                        }
                    }

                    @Override
                    public void onError(Throwable ex) {
                        System.out.println("Yikes: " + ex.getMessage());
                    }
                });
    }
}

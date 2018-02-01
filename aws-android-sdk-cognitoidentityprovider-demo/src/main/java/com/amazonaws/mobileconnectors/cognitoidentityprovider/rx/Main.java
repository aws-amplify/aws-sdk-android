package com.amazonaws.mobileconnectors.cognitoidentityprovider.rx;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class Main {

  public static void main(String[] args) {
    String clientId = "your client id";
    String clientSecret = "your client secret";
    String poolId = "your pool id";
    
    String region = "your region";
    String emailAddress = "user id for login";
    String password = "user password for login";
    AuthProvider authProvider = new AuthProviderCognito(clientId, clientSecret, poolId, region,
        emailAddress, password);

    authProvider.getJwtToken()
        .subscribe(new SingleObserver<String>() {
          @Override
          public void onSubscribe(Disposable d) {
            System.out.println("Subscribed");
          }

          @Override
          public void onSuccess(String jwt) {
            System.out.println("Success: " + jwt);
          }

          @Override
          public void onError(Throwable ex) {
            System.out.println("Yikes: " + ex.getMessage());
          }
        });
  }
}

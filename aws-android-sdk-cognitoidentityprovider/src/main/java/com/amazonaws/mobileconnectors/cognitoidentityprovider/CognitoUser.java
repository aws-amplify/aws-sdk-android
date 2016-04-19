/*
 * Copyright 2013-2016 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognitoidentityprovider;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.util.Log;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.ForgotPasswordContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.MultiFactorAuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoInternalErrorException;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoNotAuthorizedException;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoParameterInvalidException;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.ForgotPasswordHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.GenericHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.GetDetailsHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.UpdateAttributesHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.VerificationHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.tokens.CognitoAccessToken;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.tokens.CognitoIdToken;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.tokens.CognitoRefreshToken;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoSecretHash;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.Hkdf;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider;
import com.amazonaws.services.cognitoidentityprovider.model.AuthenticateRequest;
import com.amazonaws.services.cognitoidentityprovider.model.AuthenticateResult;
import com.amazonaws.services.cognitoidentityprovider.model.AuthenticationResultType;
import com.amazonaws.services.cognitoidentityprovider.model.ChangePasswordRequest;
import com.amazonaws.services.cognitoidentityprovider.model.CodeDeliveryDetailsType;
import com.amazonaws.services.cognitoidentityprovider.model.CodeMismatchException;
import com.amazonaws.services.cognitoidentityprovider.model.ConfirmSignUpRequest;
import com.amazonaws.services.cognitoidentityprovider.model.ConfirmForgotPasswordRequest;
import com.amazonaws.services.cognitoidentityprovider.model.DeleteUserAttributesRequest;
import com.amazonaws.services.cognitoidentityprovider.model.DeleteUserRequest;
import com.amazonaws.services.cognitoidentityprovider.model.ForgotPasswordResult;
import com.amazonaws.services.cognitoidentityprovider.model.GetAuthenticationDetailsRequest;
import com.amazonaws.services.cognitoidentityprovider.model.GetAuthenticationDetailsResult;
import com.amazonaws.services.cognitoidentityprovider.model.GetUserAttributeVerificationCodeRequest;
import com.amazonaws.services.cognitoidentityprovider.model.GetUserAttributeVerificationCodeResult;
import com.amazonaws.services.cognitoidentityprovider.model.GetUserRequest;
import com.amazonaws.services.cognitoidentityprovider.model.GetUserResult;
import com.amazonaws.services.cognitoidentityprovider.model.EnhanceAuthRequest;
import com.amazonaws.services.cognitoidentityprovider.model.EnhanceAuthResult;
import com.amazonaws.services.cognitoidentityprovider.model.InvalidParameterException;
import com.amazonaws.services.cognitoidentityprovider.model.PasswordClaimType;
import com.amazonaws.services.cognitoidentityprovider.model.RefreshTokensRequest;
import com.amazonaws.services.cognitoidentityprovider.model.RefreshTokensResult;
import com.amazonaws.services.cognitoidentityprovider.model.ResendConfirmationCodeRequest;
import com.amazonaws.services.cognitoidentityprovider.model.ForgotPasswordRequest;
import com.amazonaws.services.cognitoidentityprovider.model.ResendConfirmationCodeResult;
import com.amazonaws.services.cognitoidentityprovider.model.SetUserSettingsRequest;
import com.amazonaws.services.cognitoidentityprovider.model.SetUserSettingsResult;
import com.amazonaws.services.cognitoidentityprovider.model.UpdateUserAttributesRequest;
import com.amazonaws.services.cognitoidentityprovider.model.UpdateUserAttributesResult;
import com.amazonaws.services.cognitoidentityprovider.model.VerifyUserAttributeRequest;
import com.amazonaws.services.cognitoidentityprovider.model.VerifyUserAttributeResult;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * Represents a single Cognito User.
 * <p>
 *     This class encapsulates all operations possible on a user and all tokens belonging to the user.
 *     The user tokens, as {@link CognitoUserSession}, are stored in SharedPreferences. Only the tokens
 *     belonging to the last successfully authenticated user are stored.
 * </p>
 */
public class CognitoUser {
    private final String TAG = "CognitoUser";

    /**
     * Application context.
     */
    private final Context context;

    /**
     * CIP low-level client.
     */
    private final AmazonCognitoIdentityProvider cognitoIdentityProviderClient;

    /**
     * Client ID for Your Identity Pool.
     */
    private final String clientId;

    /**
     * Client secret generated for this {@code clientId}, this may be {@code null} if a secret is not
     * generated for the {@code clientId}.
     */
    private final String clientSecret;
    
    /**
     * userId for this user, this is mutable to allow the userId to be set during authentication.
     * This can be the username (users' unique sign-in username) or an alias (if available, such as email or phone number).
     */
    private String userId;

    // Username used for authentication process. This will be set from the results in the pre-auth API call.
    private String usernameInternal;
    
    /**
     * Reference to the {@link CognitoUserPool} to which this user belongs .
     */
    private CognitoUserPool pool;

    /**
     * Secret-Hash for this user-pool, this is mutable because userId is mutable.
     */
    private String secretHash;

    private CognitoUserSession cipSession;

    /**
     * Constructs a new Cognito User from a Cognito user identity pool {@link CognitoUserPool} and userId.
     *
     * @param pool              REQUIRED: Reference to {@link CognitoUserPool}, to which this user belongs.
     * @param userId            REQUIRED: userId of this user.
     * @param clientId			REQUIRED: Client-Id of the android app.
     * @param clientSecret      REQUIRED: Client secret assigned for this Client-Id.
     * @param secretHash		REQUIRED: Secret-Hash, calculated for this android app.
     * @param client			REQUIRED: Low level android client.
     * @param context			REQUIRED: Application context.
     */
    protected CognitoUser(CognitoUserPool pool, String userId,
                          String clientId, String clientSecret, String secretHash,
                          AmazonCognitoIdentityProvider client, Context context) {
        this.pool = pool;
        this.context = context;
        this.userId = userId;
        this.cognitoIdentityProviderClient = client;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.secretHash = secretHash;
        cipSession = null;
    }

    /**
     * Returns the userId of this user.
     *
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Confirms user registration in background.
     * <p>
     *     Confirming a user is required to complete the user's registration. Any other operations on a user.
     *     are possible only after registration confirmation.
     * </p>
     *
     * @param confirmationCode      REQUIRED: Code sent to the phone-number or email used to register the user.
     * @param forcedAliasCreation   REQUIRED: This flag indicates if the confirmation should go-through in case of
     *                              parameter contentions.
     * @param callback              REQUIRED: This is a reference to {@link GenericHandler} callback handler.
     */
    public void confirmSignUpInBackground(final String confirmationCode,
                                          final boolean forcedAliasCreation,
                                          final GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    confirmSignUpInternal(confirmationCode, forcedAliasCreation);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess();
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Confirms user registration in current thread.
     * <p>
     *     Confirming a user is required to complete the user's registration. Any other operations on a user
     *     are possible only after registration confirmation.
     *     <b>Note:</b> This method will perform network operations. Calling this method in
     *     applications' main thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     *
     * @param confirmationCode      REQUIRED: Code sent to the phone-number or email used to register the user
     * @param forcedAliasCreation   REQUIRED: This flag indicates if the confirmation should go-through in case of
     *                              parameter contentions.
     * @param callback              REQUIRED: This is a reference to {@link GenericHandler} callback handler
     */
    public void confirmSignUp(String confirmationCode,
                              boolean forcedAliasCreation,
                              GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        try {
            confirmSignUpInternal(confirmationCode, forcedAliasCreation);
            callback.onSuccess();
        } catch (AmazonServiceException e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to Confirm Registration.
     *
     * @param confirmationCode      REQUIRED: Code to confirm this user.
     * @param forcedAliasCreation   REQUIRED: Is set over-rides parameter contentions
     */
    private void confirmSignUpInternal(String confirmationCode, boolean forcedAliasCreation) {
        ConfirmSignUpRequest confirmUserRegistrationRequest = new ConfirmSignUpRequest();
        confirmUserRegistrationRequest.setClientId(clientId);
        confirmUserRegistrationRequest.setSecretHash(secretHash);
        confirmUserRegistrationRequest.setUsername(userId);
        confirmUserRegistrationRequest.setConfirmationCode(confirmationCode);
        confirmUserRegistrationRequest.setForceAliasCreation(forcedAliasCreation);

        cognitoIdentityProviderClient.confirmSignUp(confirmUserRegistrationRequest);
    }

    /**
     * Request to resend registration confirmation code for a user, in background.
     *
     * @param callback          REQUIRED: {@link VerificationHandler} callback handler.
     */
    public void resendConfirmationCodeInBackground(final VerificationHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    final ResendConfirmationCodeResult resendConfirmationCodeResult = resendConfirmationCodeInternal();
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess(new CognitoUserCodeDeliveryDetails(resendConfirmationCodeResult.getCodeDeliveryDetails()));
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Request to resend registration confirmation code for a user, in current thread.
     *<p>
     *     <b>Note:</b> This method will perform network operations. Calling this method in
     *     applications' main thread will cause Android to throw NetworkOnMainThreadException.
     *</p>
     *
     * @param callback          REQUIRED: {@link VerificationHandler} callback handler.
     */
    public void resendConfirmationCode(final VerificationHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        try {
            ResendConfirmationCodeResult resendConfirmationCodeResult = resendConfirmationCodeInternal();
            callback.onSuccess(new CognitoUserCodeDeliveryDetails(resendConfirmationCodeResult.getCodeDeliveryDetails()));
        } catch (Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to request registration code resend.
     */
    private ResendConfirmationCodeResult resendConfirmationCodeInternal() {
        ResendConfirmationCodeRequest resendConfirmationCodeRequest = new ResendConfirmationCodeRequest();
        resendConfirmationCodeRequest.setUsername(userId);
        resendConfirmationCodeRequest.setClientId(clientId);
        resendConfirmationCodeRequest.setSecretHash(secretHash);

        return cognitoIdentityProviderClient.resendConfirmationCode(resendConfirmationCodeRequest);
    }

    /**
     * Starts the process to set a new password for forgotten password case, in background.
     * <p>
     *     This will initiate the process to set a new password when the current password is forgotten.
     *     The new password will be successfully set only after the verification code, sent to the
     *     registered email or phone number of the user, successfully verified by Cognito Identity Provider service.
     *     This method will pass a continuation object to the callback.
     *     Use setters in the Continuation object {@link ForgotPasswordContinuation} to set the
     *     new password and verification code and call continue on the continuation object,
     *     {@code CognitoIdentityProviderContinuation.continueTask()}.
     * </p>
     *
     * @param callback      REQUIRED: {@link ForgotPasswordHandler} callback
     */
    public void forgotPasswordInBackground(final ForgotPasswordHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        final CognitoUser cognitoUser = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    final ForgotPasswordResult forgotPasswordResult = forgotPasswordInternal();
                    final ForgotPasswordContinuation continuation = new ForgotPasswordContinuation(cognitoUser,
                            new CognitoUserCodeDeliveryDetails(forgotPasswordResult.getCodeDeliveryDetails()),
                            ForgotPasswordContinuation.RUN_IN_BACKGROUND, callback);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.getResetCode(continuation);
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Starts the process to set a new new password for forgotten password case, in current thread.
     * <p>
     *     This will initiate the process to set a new password when the current password is forgotten.
     *     The new password will be successfully set only after the verification code, sent to the
     *     registered email or phone number of the user, successfully verified by Cognito Identity Provider service.
     *     This method will pass a continuation object to the callback.
     *     Use setters in the Continuation object {@link ForgotPasswordContinuation} to set the
     *     new password and verification code and call continue on the continuation object,
     *     {@code CognitoIdentityProviderContinuation.continueTask()}.
     *     <b>Note:</b> This method will perform network operations. Calling this method in
     *     applications' main thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     *
     * @param callback      REQUIRED: {@link ForgotPasswordHandler} callback
     */
    public void forgotPassword(ForgotPasswordHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        final CognitoUser cognitoUser = this;

        try {
            ForgotPasswordResult forgotPasswordResult = forgotPasswordInternal();
            ForgotPasswordContinuation continuation = new ForgotPasswordContinuation(cognitoUser,
                    new CognitoUserCodeDeliveryDetails(forgotPasswordResult.getCodeDeliveryDetails()),
                    ForgotPasswordContinuation.RUN_IN_CURRENT, callback);
            callback.getResetCode(continuation);
        } catch (AmazonServiceException e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to start forgot password process.
     */
    private ForgotPasswordResult forgotPasswordInternal() {
        ForgotPasswordRequest resetPasswordRequest = new ForgotPasswordRequest();
        resetPasswordRequest.setClientId(clientId);
        resetPasswordRequest.setSecretHash(secretHash);
        resetPasswordRequest.setUsername(userId);

        return cognitoIdentityProviderClient.forgotPassword(resetPasswordRequest);
    }

    /**
     * Set new password and send verification code to Cognito Identity Provider service, in background.
     * <p>
     *     This method will be called by {@link ForgotPasswordContinuation} continuation object.
     * </p>
     * @param verificationCode  REQUIRED: Code sent from Cognito Identity Provider Service.
     * @param newPassword       REQUIRED: New password. On successful verification of {@code verificationCode},
     *                          this will be the new password for this user.
     * @param callback          REQUIRED: {@link ForgotPasswordHandler} callback.
     */
    public void confirmPasswordInBackground(final String verificationCode,
                                            final String newPassword,
                                            final ForgotPasswordHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    confirmPasswordInternal(verificationCode, newPassword);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess();
                        }
                    };
                } catch (final AmazonServiceException e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Sends the new password and the verification code to Cognito Identity Provider service, in background.
     * <p>
     *     This method will be called by {@link ForgotPasswordContinuation} continuation object.
     *     <b>Note:</b> This method will perform network operations. Calling this method in
     *     applications' main thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     * @param verificationCode  REQUIRED: Code sent from Cognito Identity Provider Service.
     * @param newPassword       REQUIRED: New password. On successful verification of {@code verificationCode},
     *                          this will be the new password for this user.
     * @param callback          REQUIRED: {@link ForgotPasswordHandler} callback.
     */
    public void confirmPassword(final String verificationCode,
                                final String newPassword,
                                final ForgotPasswordHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        try {
            confirmPasswordInternal(verificationCode, newPassword);
            callback.onSuccess();
        } catch (AmazonServiceException e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to set a new password.
     * @param verificationCode  REQUIRED: Verification code sent to the user.
     * @param newPassword       REQUIRED: New password for the user.
     */
    private void confirmPasswordInternal(String verificationCode, String newPassword) {
        ConfirmForgotPasswordRequest confirmResetPasswordRequest = new ConfirmForgotPasswordRequest();
        confirmResetPasswordRequest.setUsername(userId);
        confirmResetPasswordRequest.setClientId(clientId);
        confirmResetPasswordRequest.setSecretHash(secretHash);
        confirmResetPasswordRequest.setConfirmationCode(verificationCode);
        confirmResetPasswordRequest.setPassword(newPassword);

        cognitoIdentityProviderClient.confirmForgotPassword(confirmResetPasswordRequest);
    }

    /**
     * Returns a valid tokens for a user through the callback method. Runs in background.
     * {@link AuthenticationHandler#onSuccess(CognitoUserSession)}.
     * <p>
     *     Tokens are passed as instance of {@link CognitoUserSession}.
     *     Call this method to get valid tokens for a user. This method returns any valid cached
     *     tokens for the user. If no valid cached tokens are available this method initiates the
     *     process to authenticate the user and get tokens from Cognito Identity Provider service.
     *     Implement the interface {@link AuthenticationHandler} and pass it as callback to this
     *     method. This method uses the callback to interact with application at different
     *     stages of the authentication process. Continuation objects are used when the authentication
     *     process requires more data to continue. See {@link com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.CognitoIdentityProviderContinuation} for details on continuation objects.
     * </p>
     * @param callback      REQUIRED: {@link AuthenticationHandler} callback
     */
    public void getSessionInBackground(final AuthenticationHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        final CognitoUser cognitoUser = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    getCachedSession();
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess(cipSession);
                        }
                    };
                } catch (final CognitoNotAuthorizedException e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            AuthenticationContinuation authenticationContinuation =
                                    new AuthenticationContinuation(cognitoUser
                                            , AuthenticationContinuation.RUN_IN_BACKGROUND, callback);
                            callback.getAuthenticationDetails(authenticationContinuation, cognitoUser.getUserId());
                        }
                    };
                }
                catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Returns a valid tokens for a user through the callback method. Runs in background.
     * {@link AuthenticationHandler#onSuccess(CognitoUserSession)}.
     * <p>
     *     Tokens are passed as instance of {@link CognitoUserSession}.
     *     Call this method to get valid tokens for a user. This method returns any valid cached
     *     tokens for the user. If no valid cached tokens are available this method initiates the
     *     process to authenticate the user and get tokens from Cognito Identity Provider service.
     *     Implement the interface {@link AuthenticationHandler} and pass it as callback to this
     *     method. This method uses the callback to interact with application at different
     *     stages of the authentication process. Continuation objects are used when the authentication
     *     process requires more data to continue. See {@link com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.CognitoIdentityProviderContinuation}
     *     for details on continuation objects.
     *     <b>Note:</b> This method will perform network operations. Calling this method in
     *     applications' main thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     * @param callback      REQUIRED: {@link AuthenticationHandler} callback
     */
    public void getSession(final AuthenticationHandler callback) {
        if (callback == null) {
            throw new InvalidParameterException("callback is null");
        }

        try {
            getCachedSession();
            callback.onSuccess(cipSession);
        } catch (InvalidParameterException e) {
            callback.onFailure(e);
        } catch (CognitoNotAuthorizedException e) {
            AuthenticationContinuation authenticationContinuation = new AuthenticationContinuation(this
                    , AuthenticationContinuation.RUN_IN_CURRENT, callback);
            callback.getAuthenticationDetails(authenticationContinuation, getUserId());
        } catch (Exception e) {
            callback.onFailure(new AmazonServiceException(e.getMessage()));
        }
    }

    /**
     * Call this method for valid, cached tokens for this user.
     *
     * @return Valid, cached tokens {@link CognitoUserSession}. {@code null} otherwise.
     */
    private CognitoUserSession getCachedSession() {
        if (userId == null) {
            throw new CognitoNotAuthorizedException("User-ID is null");
        }

        if (cipSession != null) {
            if (cipSession.isValid()) {
                return cipSession;
            }
        }

        // Read cached tokens
        CognitoUserSession cachedTokens = readCachedTokens();

        // Return cached tokens if they are still valid
        if (cachedTokens.isValid()) {
            cipSession = cachedTokens;
            return  cipSession;
        }

        // Clear any cached tokens, since none of them are valid.
        clearCachedTokens();

        if (cachedTokens.getRefreshToken() != null) {
            // Use Refresh token to get new tokens
            try {
                cipSession = refreshSessionInternal(cachedTokens.getRefreshToken());
                cacheTokens(cipSession);
                return cipSession;
            } catch (Exception e) {
                // Could not get new tokens from refresh. Should authenticate user.
                throw new CognitoNotAuthorizedException("user is not authenticated");
            }
        }
        throw new CognitoNotAuthorizedException("user is not authenticated");
    }

    /**
     * Authenticates a user to get a valid {@link CognitoUserSession}. Runs in background.
     *
     * @param authenticationDetails REQUIRED: An {@link AuthenticationDetails} object containing
     *                              sign-in details.
     * @param callback              REQUIRED: {@link AuthenticationHandler} callback.
     */
    public void authenticateUserInBackground(final AuthenticationDetails authenticationDetails,
                                             final AuthenticationHandler callback) {
        if (callback == null) {
            throw new InvalidParameterException("callback is null");
        }

        // Get the userId from AuthenticationDetails, this will override the current userId
        this.userId = authenticationDetails.getUserId();

        // Update secret hash
        try {
            this.secretHash = CognitoSecretHash.getSecretHash(userId, clientId, clientSecret);
        }
        catch (Exception exception) {
            callback.onFailure(exception);
        }

        final CognitoUser cognitoUser = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    AuthenticateResult authenticateResult = authenticate(authenticationDetails);
                    if (authenticateResult.getCodeDeliveryDetails() == null) {
                        final CognitoUserSession session = cipSession;
                        returnCallback = new Runnable() {
                            @Override
                            public void run() {
                                callback.onSuccess(session);
                            }
                        };
                    }
                    else {
                        final MultiFactorAuthenticationContinuation multiFactorAuthenticationContinuation =
                                new MultiFactorAuthenticationContinuation(cognitoUser,
                                        authenticateResult.getAuthState(),
                                        new CognitoUserCodeDeliveryDetails(authenticateResult.getCodeDeliveryDetails()),
                                        MultiFactorAuthenticationContinuation.RUN_IN_BACKGROUND,
                                        callback);
                        returnCallback = new Runnable() {
                            @Override
                            public void run() {
                                callback.getMFACode(multiFactorAuthenticationContinuation);
                            }
                        };
                    }
                } catch (final AmazonServiceException e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(new AmazonServiceException("Error", e));
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Authenticates a user to get valid {@link CognitoUserSession}. Runs in current thread.
     *
     * @param authenticationDetails REQUIRED: An {@link AuthenticationDetails} object containing
     *                              sign-in details.
     * @param callback              REQUIRED: {@link AuthenticationHandler} callback.
     */
    public void authenticateUser(final AuthenticationDetails authenticationDetails,
                                 final AuthenticationHandler callback) {
        if (userId == null) {
            throw new CognitoParameterInvalidException("userId is null");
        }

        // Get the userId from AuthenticationDetails, this will override the current userId
        this.userId = authenticationDetails.getUserId();

        // Update secret hash
        try {
            this.secretHash = CognitoSecretHash.getSecretHash(userId, clientId, clientSecret);
        }
        catch (Exception exception) {
            callback.onFailure(exception);
        }

        try {
            AuthenticateResult authenticateResult = authenticate(authenticationDetails);
            if (authenticateResult.getCodeDeliveryDetails() == null) {
                callback.onSuccess(cipSession);
            }
            else {
                final MultiFactorAuthenticationContinuation multiFactorAuthenticationContinuation =
                        new MultiFactorAuthenticationContinuation(this,
                                authenticateResult.getAuthState(),
                                new CognitoUserCodeDeliveryDetails(authenticateResult.getCodeDeliveryDetails()),
                                MultiFactorAuthenticationContinuation.RUN_IN_CURRENT,
                                callback);
                callback.getMFACode(multiFactorAuthenticationContinuation);
            }
        } catch (final Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to authenticate user.
     *
     * @param authenticationDetails REQUIRED: An {@link AuthenticationDetails} object containing
     *                              sign-in details.
     * @return result from authentication
     */
    private AuthenticateResult authenticate(AuthenticationDetails authenticationDetails) {

        // Validate authentication Details
        if (authenticationDetails == null)
            throw new CognitoParameterInvalidException("AuthenticationDetails is null");

        // Set user name
        userId = authenticationDetails.getUserId();

        // Authenticate user
        AuthenticateResult authResult = authenticateInternal(authenticationDetails);

        // Check if MFA verification is required
        if (authResult.getCodeDeliveryDetails() == null) {
            // Get a Cognito User Session Token with the token
            cipSession = getCognitoUserSession(authResult.getAuthenticationResult());
            cacheTokens(cipSession);
        }
        return authResult;
    }

    /**
     * Sends MFA code for verification. Runs in background.
     *
     * @param mfaCode               REQUIRED: MFA Code send to the user
     * @param authState             REQUIRED: Authentication state
     * @param codeDeliveryDetails   REQUIRED: MFA Code delivery details
     * @param callback              REQUIRED: {@link AuthenticationHandler} callback
     */
    public void sendMFACodeInBackground(final String mfaCode,
                                        final String authState,
                                        final CognitoUserCodeDeliveryDetails codeDeliveryDetails,
                                        final AuthenticationHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        final CognitoUser cognitoUser = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    cognitoUser.sendMFACodeInternal(mfaCode, authState);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess(cognitoUser.getCachedSession());
                        }
                    };
                } catch (final CodeMismatchException e) {
                    // The MFA code supplied is incorrect, will retry until the service errors
                    final MultiFactorAuthenticationContinuation multiFactorAuthenticationContinuation
                            = new MultiFactorAuthenticationContinuation(cognitoUser, authState,
                            codeDeliveryDetails, MultiFactorAuthenticationContinuation.RUN_IN_BACKGROUND, callback);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.getMFACode(multiFactorAuthenticationContinuation);
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Sends MFA code for verification. Runs on current thread.
     * <p>
     *     <b>Note:</b> This method will perform network operations. Calling this method in
     *     applications' main thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     *
     * @param mfaCode               REQUIRED: MFA Code send to the user
     * @param authState             REQUIRED: Authentication state
     * @param codeDeliveryDetails   REQUIRED: MFA Code delivery details
     * @param callback              REQUIRED: {@link AuthenticationHandler} callback
     */
    public void sendMFACode(final String mfaCode,
                            final String authState,
                            final CognitoUserCodeDeliveryDetails codeDeliveryDetails,
                            final AuthenticationHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        try {
            sendMFACodeInternal(mfaCode, authState);
            callback.onSuccess(getCachedSession());
        } catch (CodeMismatchException e) {
            // The MFA code supplied is incorrect, will retry until the service errors
            final MultiFactorAuthenticationContinuation multiFactorAuthenticationContinuation
                    = new MultiFactorAuthenticationContinuation(this, authState, codeDeliveryDetails,
                    MultiFactorAuthenticationContinuation.RUN_IN_CURRENT, callback);
            callback.getMFACode(multiFactorAuthenticationContinuation);
        } catch (Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to send MFA code for verification.
     *
     * @param mfaCode				REQUIRED: Multi Factor Authentication code
     */
    private void sendMFACodeInternal(String mfaCode, String authState) {

        if (mfaCode == null) {
            throw new CognitoParameterInvalidException("MFA code is null");
        }

        EnhanceAuthRequest enhancedAuthRequest = new EnhanceAuthRequest();
        enhancedAuthRequest.setUsername(usernameInternal);
        enhancedAuthRequest.setClientId(clientId);
        enhancedAuthRequest.setSecretHash(secretHash);
        enhancedAuthRequest.setCode(mfaCode);
        enhancedAuthRequest.setAuthState(authState);

        EnhanceAuthResult enhancedAuthResult
                = cognitoIdentityProviderClient.enhanceAuth(enhancedAuthRequest);

        this.cipSession = getCognitoUserSession(enhancedAuthResult.getAuthenticationResult());
        cacheTokens(cipSession);
    }

    /**
     * Request to change password for this user, in background.
     * <p>
     *     This operation requires a valid accessToken {@link CognitoUserSession#accessToken}.
     *     Un-authenticated users will have to be authenticated before calling this method.
     * </p>
     *
     * @param oldUserPassword   REQUIRED: Current password of this user.
     * @param newUserPassword   REQUIRED: New password for this user.
     * @param callback          REQUIRED: {@link GenericHandler} callback handler.
     */
    public void changePasswordInBackground(final String oldUserPassword,
                                           final String newUserPassword,
                                           final GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    CognitoUserSession session = user.getCachedSession();
                    changePasswordInternal(oldUserPassword, newUserPassword, session);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess();
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Request to change password for this user, in current thread.
     * <p>
     *     This operation requires a valid accessToken {@link CognitoUserSession#accessToken}.
     *     Unauthenticated users will need to be authenticated before calling this method.
     *     <b>Note:</b> This method will perform network operations. Calling this method in
     *     applications' main thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     *
     * @param oldUserPassword   REQUIRED: Current password of this user.
     * @param newUserPassword   REQUIRED: New password for this user.
     * @param callback          REQUIRED: {@link GenericHandler} callback handler.
     */
    public void changePassword(final String oldUserPassword,
                               final String newUserPassword,
                               final GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        try {
            changePasswordInternal(oldUserPassword, newUserPassword, getCachedSession());
            callback.onSuccess();
        } catch (AmazonServiceException e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to change a user password.
     *
     * @param oldUserPassword REQUIRED: old password.
     * @param newUserPassword REQUIRED: new password.
     */
    private void changePasswordInternal(String oldUserPassword, String newUserPassword,
                                        CognitoUserSession session) {
        if (session != null && session.isValid()) {
            ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest();
            changePasswordRequest.setPreviousPassword(oldUserPassword);
            changePasswordRequest.setProposedPassword(newUserPassword);
            changePasswordRequest.setAccessToken(session.getAccessToken().getJWTToken());
            cognitoIdentityProviderClient.changePassword(changePasswordRequest);
        }
        else {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }
    }

    /**
     * Retrieves the current user attributes. Runs in background.
     *
     * <p>
     *     All attributes, which are set for this user, are fetched.
     *     This method requires valid accessToken.
     * </p>
     *
     * @param callback      REQUIRED: {@link GetDetailsHandler} callback
     */
    public void getDetailsInBackground(final GetDetailsHandler callback) {

        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    CognitoUserSession session = user.getCachedSession();
                    final CognitoUserDetails userDetails = getUserDetailsInternal(session);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess(userDetails);
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Retrieves the current user attributes. Runs on current thread.
     *
     * <p>
     *     All attributes, which are set for this user, are fetched.
     *     This method requires valid accessToken.
     *     <b>Note:</b> This method will perform network operations. Calling this method in
     *     applications' main thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     *
     * @param callback      REQUIRED: {@link GetDetailsHandler} callback
     */
    public void getDetails(final GetDetailsHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        try {
            CognitoUserDetails userDetails = getUserDetailsInternal(this.getCachedSession());
            callback.onSuccess(userDetails);
        } catch (Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to fetch user attributes.
     *
     * @param session		REQUIRED: {@link CognitoUserSession}
     * @return User attributes
     */
    private CognitoUserDetails getUserDetailsInternal(CognitoUserSession session) {
        if (session != null && session.isValid()) {
            GetUserRequest getUserRequest = new GetUserRequest();
            getUserRequest.setAccessToken(session.getAccessToken().getJWTToken());
            GetUserResult userResult = cognitoIdentityProviderClient.getUser(getUserRequest);

            return new CognitoUserDetails(new CognitoUserAttributes(userResult.getUserAttributes()),
                    new CognitoUserSettings(userResult.getMFAOptions()));
        }
        else {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }
    }

    /**
     * Requests code to verify a user attribute, in background.
     * <p>
     *     The user attributes that can be verified are those attributes that can be used to
     *     communicate with the user, e.g. phone_number and email.
     *     The verification code is sent to the medium that is represented by the attribute.
     *     Attribute verification is required to enable the attribute to be used an attribute as alias
     *     for the user.
     *     Aliases attributes can be used in lieu of the userId to authenticate the user.
     *     If an attribute was used in the confirm the user after sign-up, then that alias is
     *     already verified and does not require re-verification.
     * </p>
     * @param attributeName         REQUIRED: Name of the attribute that requires verification.
     * @param callback              REQUIRED: callback.
     */
    public void getAttributeVerificationCodeInBackground(final String attributeName,
                                                         final VerificationHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    final CognitoUserSession session = user.getCachedSession();
                    final GetUserAttributeVerificationCodeResult getUserAttributeVerificationCodeResult =
                            getAttributeVerificationCodeInternal(attributeName, session);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess(new CognitoUserCodeDeliveryDetails(getUserAttributeVerificationCodeResult.getCodeDeliveryDetails()));
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Requests code to verify a user attribute, in current thread.
     * <p>
     *     The user attributes that can be verified are those attributes that can be used to
     *     communicate with the user, e.g. phone_number and email.
     *     The verification code is sent to the medium that is represented by the attribute.
     *     Attribute verification is required to enable the attribute to be used an attribute as alias
     *     for the user.
     *     Aliases attributes can be used in lieu of the userId to authenticate the user.
     *     If an attribute was used in the confirm the user after sign-up, then that alias is
     *     already verified and does not require re-verification.
     *     <b>Note:</b> This method will perform network operations. Calling this method in
     *     applications' main thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     * @param attributeName         REQUIRED: Name of the attribute that requires verification.
     * @param callback              REQUIRED: callback.
     */
    public void getAttributeVerificationCode(String attributeName, VerificationHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        try {
            GetUserAttributeVerificationCodeResult getUserAttributeVerificationCodeResult =
            getAttributeVerificationCodeInternal(attributeName, this.getCachedSession());
            callback.onSuccess(new CognitoUserCodeDeliveryDetails(getUserAttributeVerificationCodeResult.getCodeDeliveryDetails()));
        } catch (Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to request for attribute verification code.
     *
     * @param attributeName         REQUIRED: Name of the attribute that requires verification.
     * @param session               REQUIRED: A valid {@link CognitoUserSession}.
     */
    private GetUserAttributeVerificationCodeResult getAttributeVerificationCodeInternal(final String attributeName,
                                                      final CognitoUserSession session) {
        if(session != null && session.isValid()){
            GetUserAttributeVerificationCodeRequest getUserAttributeVerificationCodeRequest
                    = new GetUserAttributeVerificationCodeRequest();
            getUserAttributeVerificationCodeRequest.setAccessToken(session.getAccessToken().getJWTToken());
            getUserAttributeVerificationCodeRequest.setAttributeName(attributeName);

            return cognitoIdentityProviderClient.getUserAttributeVerificationCode(getUserAttributeVerificationCodeRequest);
        }
        else {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }
    }

    /**
     * Verify an attribute with the verification code, in background.
     * <p>
     *     Call this method to verify an attribute with the "verification code".
     *     To request for a "verification code" call the method
     *     {@link CognitoUser#getAttributeVerificationCodeInBackground(String, VerificationHandler)}.
     * </p>
     * @param attributeName         REQUIRED: The attribute that is being verified.
     * @param verificationCode      REQUIRED: The code for verification.
     * @param callback              REQUIRED: Callback
     */
    public void verifyAttributeInBackground(final String attributeName,
                                            final String verificationCode,
                                            final GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    CognitoUserSession session = user.getCachedSession();
                    verifyAttributeInternal(attributeName, verificationCode, session);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess();
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Verify an attribute with the verification code, in current thread.
     * <p>
     *     Call this method to verify an attribute with the "verification code".
     *     To request for a "verification code" call the method
     *     {@link CognitoUser#getAttributeVerificationCodeInBackground(String, VerificationHandler)}.
     *     <b>Note:</b> This method will perform network operations. Calling this method in
     *     applications' main thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     * @param attributeName         REQUIRED: The attribute that is being verified.
     * @param verificationCode      REQUIRED: The code for verification.
     * @param callback              REQUIRED: Callback
     */
    public void verifyAttribute(String attributeName,
                                String verificationCode,
                                GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        try {
            VerifyUserAttributeResult verifyUserAttributeResult =
                    verifyAttributeInternal(attributeName, verificationCode, this.getCachedSession());
        } catch (Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to verify an attribute.
     * @param attributeName         REQUIRED: The attribute that is being verified.
     * @param verificationCode      REQUIRED: The code for verification.
     * @param session               REQUIRED: A valid {@link CognitoUserSession}.
     * @return {@link VerifyUserAttributeResult}
     */
    private VerifyUserAttributeResult verifyAttributeInternal(String attributeName,
                                                              String verificationCode,
                                                              CognitoUserSession session) {
        if(session != null && session.isValid()) {
            VerifyUserAttributeRequest verifyUserAttributeRequest = new VerifyUserAttributeRequest();
            verifyUserAttributeRequest.setAttributeName(attributeName);
            verifyUserAttributeRequest.setAccessToken(session.getAccessToken().getJWTToken());
            verifyUserAttributeRequest.setCode(verificationCode);

            return cognitoIdentityProviderClient.verifyUserAttribute(verifyUserAttributeRequest);
        }
        else {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }
    }

    /**
     * Updates attributes for a user. Runs in background.
     * <p>
     *     Requires valid accessToken.
     * </p>
     *
     * @param attributes        REQUIRED: All attributes and values that need to be updated for this  user.
     * @param callback          REQUIRED: {@link UpdateAttributesHandler} callback.
     */
    public void updateAttributesInBackground(final CognitoUserAttributes attributes,
                                             final UpdateAttributesHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    CognitoUserSession session = user.getCachedSession();
                    final UpdateUserAttributesResult updateUserAttributesResult =
                            updateAttributesInternal(attributes, session);

                    final List<CognitoUserCodeDeliveryDetails> attributesVerificationList =
                            new ArrayList<CognitoUserCodeDeliveryDetails>();
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            for(CodeDeliveryDetailsType details: updateUserAttributesResult.getCodeDeliveryDetailsList()) {
                                attributesVerificationList.add(new CognitoUserCodeDeliveryDetails(details));
                            }
                            callback.onSuccess(attributesVerificationList);
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Updates attributes for a user. Runs in background.
     * <p>
     *     Requires valid accessToken.
     *     <b>Note:</b> This method will perform network operations. Calling this method in
     *     applications' main thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     *
     * @param attributes        REQUIRED: All attributes and values that need to be updated for this  user.
     * @param callback          REQUIRED: {@link UpdateAttributesHandler} callback.
     */
    public void updateAttributes(final CognitoUserAttributes attributes,
                                 final UpdateAttributesHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        try {
        	CognitoUserSession session = getCachedSession();
        	if(session == null) {
        		System.out.println("++++Update: Null ");
        	} else {
        		System.out.println("++++Update: "+session.toString());
        	}
        	System.out.println("++++Update: ");
            UpdateUserAttributesResult updateUserAttributesResult =
                    updateAttributesInternal(attributes, session);

            List<CognitoUserCodeDeliveryDetails> attributesVerificationList =
                    new ArrayList<CognitoUserCodeDeliveryDetails>();

            for(CodeDeliveryDetailsType details: updateUserAttributesResult.getCodeDeliveryDetailsList()) {
                attributesVerificationList.add(new CognitoUserCodeDeliveryDetails(details));
            }
            callback.onSuccess(attributesVerificationList);
        } catch (Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Helper method to update user attributes.
     *
     * @param attributes        REQUIRED: Attributes.
     * @param session           REQUIRED: A valid {@link CognitoUserSession}.
     */
    private UpdateUserAttributesResult updateAttributesInternal(final CognitoUserAttributes attributes,
                                          final CognitoUserSession session) {
        if (session != null && session.isValid()) {
            UpdateUserAttributesRequest updateUserAttributesRequest = new UpdateUserAttributesRequest();
            updateUserAttributesRequest.setAccessToken(session.getAccessToken().getJWTToken());
            updateUserAttributesRequest.setUserAttributes(attributes.getAttributesList());

            return cognitoIdentityProviderClient.updateUserAttributes(updateUserAttributesRequest);
        }
        else {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }
    }

    /**
     * Deletes user attributes, in background.
     *
     * @param attributeNamesToDelete    REQUIRED: List of user attributes that have to be deleted.
     * @param callback                  REQUIRED: {@link GenericHandler} callback
     */
    public void deleteAttributesInBackground(final List<String> attributeNamesToDelete,
                                             final GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    CognitoUserSession session = user.getCachedSession();
                    deleteAttributesInternal(attributeNamesToDelete, session);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess();
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Deletes user attributes, in background.
     * <p>
     *     <b>Note:</b> This method will perform network operations. Calling this method in
     *     applications' main thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     *
     * @param attributeNamesToDelete    REQUIRED: List of user attributes that have to be deleted.
     * @param callback                  REQUIRED: {@link GenericHandler} callback
     */
    public void deleteAttributes(final List<String> attributeNamesToDelete,
                                 final GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        try {
            deleteAttributesInternal(attributeNamesToDelete, this.getCachedSession());
            callback.onSuccess();
        } catch (Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to delete user attributes.
     *
     * @param attributeNamesToDelete        REQUIRED: Attribute that is being deleted.
     * @param session                       REQUIRED: A valid {@link CognitoUserSession}.
     */
    private void deleteAttributesInternal(final List<String> attributeNamesToDelete,
                                          final CognitoUserSession session) {

        // Check if session is valid
        if (session == null) {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }

        if (!session.isValid()) {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }

        // Validate the attributes to delete list
        if (attributeNamesToDelete == null) {
            return;
        }

        if (attributeNamesToDelete.size() < 1) {
            return;
        }

        // Translating to AttributeNameType list
        DeleteUserAttributesRequest deleteUserAttributesRequest = new DeleteUserAttributesRequest();
        deleteUserAttributesRequest.setAccessToken(session.getAccessToken().getJWTToken());
        deleteUserAttributesRequest.setUserAttributeNames(attributeNamesToDelete);

        cognitoIdentityProviderClient.deleteUserAttributes(deleteUserAttributesRequest);
    }

    /**
     * Sign-Out this user by removing all cached tokens.
     */
    public void signOut() {
        cipSession = null;
        clearCachedTokens();
    }

    /**
     * Deletes this user, in background.
     *
     * @param callback      REQUIRED: To communicate the response.
     */
    public void deleteUserInBackground(final GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    CognitoUserSession session = user.getCachedSession();
                    deleteUserInternal(session);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess();
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Deletes this user, in current thread.
     * <p>
     *     <b>Note:</b> This method will perform network operations. Calling this method in applications' main thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     *
     * @param callback      REQUIRED: To communicate the response.
     */
    public void deleteUser(GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        try {
            deleteUserInternal(this.getCachedSession());
        } catch (Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to delete a user.
     *
     * @param session           REQUIRED: A valid {@link CognitoUserSession}
     */
    private void deleteUserInternal(final CognitoUserSession session) {

        // Check if session is valid
        if (session == null) {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }

        if (!session.isValid()) {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }

        DeleteUserRequest deleteUserRequest = new DeleteUserRequest();
        deleteUserRequest.setAccessToken(session.getAccessToken().getJWTToken());

        cognitoIdentityProviderClient.deleteUser(deleteUserRequest);
    }

    /**
     * Set's user settings, in background.
     *
     * @param cognitoUserSettings           REQUIRED: User settings as {@link CognitoUserSettings}.
     * @param callback                      REQUIRED: {@link GenericHandler} callback.
     */
    public void setUserSettingsInBackground(final CognitoUserSettings cognitoUserSettings,
                                            final GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUserSession session = this.getCachedSession();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    setUserSettingsInternal(cognitoUserSettings, session);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess();
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Set's user settings, in current thread.
     * <p>
     *     <b>Note:</b> This method will perform network operations. Calling this method in
     *     applications' main thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     *
     * @param cognitoUserSettings           REQUIRED: User settings as {@link CognitoUserSettings}.
     * @param callback                      REQUIRED: {@link GenericHandler} callback.
     */
    public void setUserSettings(CognitoUserSettings cognitoUserSettings,
                                GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        try {
            setUserSettingsInternal(cognitoUserSettings, this.getCachedSession());
        } catch (Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to set MFA delivery options.
     *
     * @param cognitoUserSettings           REQUIRED: {@link CognitoUserAttributes}, with MFA delivery options.
     * @param session                       REQUIRED: A valid {@link CognitoUserSession}.
     */
    private void setUserSettingsInternal(CognitoUserSettings cognitoUserSettings,
                                          CognitoUserSession session) {
        if (session != null && session.isValid()) {
            if (cognitoUserSettings == null) {
                throw new CognitoParameterInvalidException("user attributes is null");
            }
            SetUserSettingsRequest setUserSettingsRequest = new SetUserSettingsRequest();
            setUserSettingsRequest.setAccessToken(session.getAccessToken().getJWTToken());
            setUserSettingsRequest.setMFAOptions(cognitoUserSettings.getSettingsList());

            SetUserSettingsResult setUserSettingsResult =
                    cognitoIdentityProviderClient.setUserSettings(setUserSettingsRequest); }
        else {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }
    }

    /**
     * Removes all cached tokens.
     */
    private void clearCachedTokens() {
        try {
            // Clear all cached tokens and last logged in user.
            SharedPreferences csiCachedTokens =  context.getSharedPreferences("CognitoIdentityProviderCache", 0);
            csiCachedTokens.edit().clear().apply();
        } catch (Exception e) {
            // Logging exception, this is not a fatal error
            Log.e(TAG, "Error while deleting from SharedPreferences");
        }
    }

    /**
     * Checks for any valid tokens.
     *
     * @return {@link CognitoUserSession} if cached tokens are available.
     */
    private CognitoUserSession readCachedTokens() {
        CognitoUserSession userSession = new CognitoUserSession(null, null, null);
        
        try {
            SharedPreferences csiCachedTokens = context.getSharedPreferences("CognitoIdentityProviderCache", 0);

            // Format "key" strings
            String csiIdTokenKey        = "CognitoIdentityProvider." + clientId + "." + userId + ".idToken";
            String csiAccessTokenKey    = "CognitoIdentityProvider." + clientId + "." + userId + ".accessToken";
            String csiRefreshTokenKey   = "CognitoIdentityProvider." + clientId + "." + userId + ".refreshToken";
            
            if (csiCachedTokens.contains(csiIdTokenKey)) {
                CognitoIdToken csiCachedIdToken = new CognitoIdToken(csiCachedTokens.getString(csiIdTokenKey, null));
                CognitoAccessToken csiCachedAccessToken = new CognitoAccessToken(csiCachedTokens.getString(csiAccessTokenKey, null));
                CognitoRefreshToken csiCachedRefreshToken = new CognitoRefreshToken(csiCachedTokens.getString(csiRefreshTokenKey, null));
                userSession = new CognitoUserSession(csiCachedIdToken, csiCachedAccessToken, csiCachedRefreshToken);
            }
        } catch (Exception e) {
            // Logging exception, this is not a fatal error
            Log.e(TAG, "Error while reading SharedPreferences");
        }
        return  userSession;
    }

    /**
     * Cache tokens locally.
     *
     * @param session           REQUIRED: Tokens to be cached.
     */
    private void cacheTokens(CognitoUserSession session) {
        try {
            SharedPreferences csiCachedTokens = context.getSharedPreferences("CognitoIdentityProviderCache", 0);

            String csiUserPoolId = pool.getUserPoolId();

            // Create keys to look for cached tokens
            String csiIdTokenKey        = "CognitoIdentityProvider." + clientId + "." + userId + ".idToken";
            String csiAccessTokenKey    = "CognitoIdentityProvider." + clientId + "." + userId + ".accessToken";
            String csiRefreshTokenKey   = "CognitoIdentityProvider." + clientId + "." + userId + ".refreshToken";
            String csiLastUserKey       = "CognitoIdentityProvider." + clientId + ".LastAuthUser";

            // Store the data in Shared Preferences
            SharedPreferences.Editor cacheEdit = csiCachedTokens.edit();
            cacheEdit.putString(csiIdTokenKey, session.getIdToken().getJWTToken());
            cacheEdit.putString(csiAccessTokenKey, session.getAccessToken().getJWTToken());
            cacheEdit.putString(csiRefreshTokenKey, session.getRefreshToken().getToken());
            cacheEdit.putString(csiLastUserKey, userId).apply();

        } catch (Exception e) {
            // Logging exception, this is not a fatal error
            Log.e(TAG, "Error while writing to SharedPreferences.");
        }
    }

    /**
     * Internal method to start the authentication process.
     *
     * @param authenticationDetails             REQUIRED: User authentication details.
     * @return  result from authentication.
     */
    private AuthenticateResult authenticateInternal(AuthenticationDetails authenticationDetails) {
        AuthenticationHelper authenticationHelper = new AuthenticationHelper(pool.getUserPoolId());

        // Get authentication parameters
        GetAuthenticationDetailsResult authParameters = preAuthProcess(authenticationHelper, authenticationDetails);

        // Store the internal username, so that it is used in the rest of the authentication process.
        // This username will be used in lieu of userID (which can be username or an alias).
        this.usernameInternal = authParameters.getUsername();
        secretHash = CognitoSecretHash.getSecretHash(usernameInternal,clientId,clientSecret);

        // Authenticate user
        return authenticateUser(authenticationDetails.getPassword(), authParameters, authenticationHelper);
    }

    /**
     * Pre-auth process, get the authentication details.
     *
     * @param authenticationHelper              REQUIRED: For client side SRP calculations.
     * @param authenticationDetails             REQUIRED: User authentication details.
     * @return pre-authentication details.
     */
    private GetAuthenticationDetailsResult preAuthProcess(AuthenticationHelper authenticationHelper,
                                                          AuthenticationDetails authenticationDetails) {
        GetAuthenticationDetailsRequest getUserAuthDetailsRequest = new GetAuthenticationDetailsRequest();
        getUserAuthDetailsRequest.setClientId(clientId);
        getUserAuthDetailsRequest.setSecretHash(secretHash);
        getUserAuthDetailsRequest.setUsername(userId);
        getUserAuthDetailsRequest.setSrpA(authenticationHelper.getA().toString(16));
        getUserAuthDetailsRequest.setValidationData(authenticationDetails.getValidationData());

        return cognitoIdentityProviderClient.getAuthenticationDetails(getUserAuthDetailsRequest);
    }

    /**
     * Authenticates the user with password.
     *
     * @param password                          REQUIRED: User password.
     * @param authDetails                       REQUIRED: Authentication parameters returned from pre-auth.
     * @param authenticationHelper              REQUIRED: For Client side SRP math.
     * @return result from authentication.
     */
    private AuthenticateResult authenticateUser(String password,
                                                GetAuthenticationDetailsResult authDetails,
                                                AuthenticationHelper authenticationHelper) {
        BigInteger B = new BigInteger(authDetails.getSrpB(), 16);
        if (B.mod(AuthenticationHelper.N).equals(BigInteger.ZERO)) {
            throw new CognitoInternalErrorException("B cannot be zero");
        }

        BigInteger salt = new BigInteger(authDetails.getSalt(), 16);
        byte[] key = authenticationHelper.getPasswordAuthenticationKey(usernameInternal, password, B, salt);

        // HMAC our data with key (HKDF(S)) (the shared secret)
        Date timestamp = new Date();
        byte[] hmac;
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec keySpec = new SecretKeySpec(key, "HmacSHA256");
            mac.init(keySpec);
            mac.update(pool.getUserPoolId().split("_", 2)[1].getBytes(StandardCharsets.UTF_8));
            mac.update(usernameInternal.getBytes(StandardCharsets.UTF_8));
            mac.update(authDetails.getSecretBlock().array());

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss z yyyy");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(SimpleTimeZone.UTC_TIME, "UTC"));
            String dateString = simpleDateFormat.format(timestamp);
            byte[] dateBytes = dateString.getBytes(StandardCharsets.UTF_8);

            hmac = mac.doFinal(dateBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new CognitoInternalErrorException("Exception in authentication", e);
        } catch (InvalidKeyException e) {
            throw new CognitoInternalErrorException("Exception in authentication", e);
        }

        PasswordClaimType passwordClaim = new PasswordClaimType();
        passwordClaim.setSecretBlock(authDetails.getSecretBlock());
        passwordClaim.setSignature(ByteBuffer.wrap(hmac));

        AuthenticateRequest authUserRequest = new AuthenticateRequest();
        authUserRequest.setClientId(clientId);
        authUserRequest.setSecretHash(secretHash);
        authUserRequest.setUsername(authDetails.getUsername());
        authUserRequest.setPasswordClaim(passwordClaim);
        authUserRequest.setTimestamp(timestamp);

        return cognitoIdentityProviderClient.authenticate(authUserRequest);
    }

    /**
     * Private class for SRP client side math.
     */
    private static class AuthenticationHelper {
        private BigInteger a;
        private BigInteger A;
        private String poolName;

        public AuthenticationHelper(String userPoolName) {
            do {
                a = new BigInteger(EPHEMERAL_KEY_LENGTH, SECURE_RANDOM).mod(N);
                A = g.modPow(a, N);
            } while (A.mod(N).equals(BigInteger.ZERO));

            poolName = userPoolName.split("_", 2)[1];
        }

        public BigInteger geta() {
            return a;
        }

        public BigInteger getA() {
            return A;
        }

        private static final String HEX_N =
                "FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD1"
                        + "29024E088A67CC74020BBEA63B139B22514A08798E3404DD"
                        + "EF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245"
                        + "E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7ED"
                        + "EE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3D"
                        + "C2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F"
                        + "83655D23DCA3AD961C62F356208552BB9ED529077096966D"
                        + "670C354E4ABC9804F1746C08CA18217C32905E462E36CE3B"
                        + "E39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9"
                        + "DE2BCBF6955817183995497CEA956AE515D2261898FA0510"
                        + "15728E5A8AAAC42DAD33170D04507A33A85521ABDF1CBA64"
                        + "ECFB850458DBEF0A8AEA71575D060C7DB3970F85A6E1E4C7"
                        + "ABF5AE8CDB0933D71E8C94E04A25619DCEE3D2261AD2EE6B"
                        + "F12FFA06D98A0864D87602733EC86A64521F2B18177B200C"
                        + "BBE117577A615D6C770988C0BAD946E208E24FA074E5AB31"
                        + "43DB5BFCE0FD108E4B82D120A93AD2CAFFFFFFFFFFFFFFFF";
        private static final BigInteger N = new BigInteger(HEX_N, 16);
        private static final BigInteger g = BigInteger.valueOf(2);
        private static final BigInteger k;

        private static final int EPHEMERAL_KEY_LENGTH = 1024;
        private static final int DERIVED_KEY_SIZE = 16;
        private static final String DERIVED_KEY_INFO = "Caldera Derived Key";

        private static final ThreadLocal<MessageDigest> THREAD_MESSAGE_DIGEST =
                new ThreadLocal<MessageDigest>() {
                    @Override
                    protected MessageDigest initialValue() {
                        try {
                            return MessageDigest.getInstance("SHA-256");
                        } catch (NoSuchAlgorithmException e) {
                            throw new CognitoInternalErrorException("Exception in authentication", e);
                        }
                    }
                };

        private static final SecureRandom SECURE_RANDOM;

        static {
            try {
                SECURE_RANDOM = SecureRandom.getInstance("SHA1PRNG");

                MessageDigest messageDigest = THREAD_MESSAGE_DIGEST.get();
                messageDigest.reset();
                messageDigest.update(N.toByteArray());
                byte[] digest = messageDigest.digest(g.toByteArray());
                k = new BigInteger(1, digest);
            } catch (NoSuchAlgorithmException e) {
                throw new CognitoInternalErrorException(e.getMessage(), e);
            }
        }

        public byte[] getPasswordAuthenticationKey(String userId,
                                                   String userPassword,
                                                   BigInteger B,
                                                   BigInteger salt) {
            // Authenticate the password
            // u = H(A, B)
            MessageDigest messageDigest = THREAD_MESSAGE_DIGEST.get();
            messageDigest.reset();
            messageDigest.update(A.toByteArray());
            BigInteger u = new BigInteger(1, messageDigest.digest(B.toByteArray()));
            if (u.equals(BigInteger.ZERO)) {
                throw new CognitoInternalErrorException("Hash of A and B cannot be zero");
            }

            // x = H(salt | H(poolName | userId | ":" | password))
            messageDigest.reset();
            messageDigest.update(poolName.getBytes(StandardCharsets.UTF_8));
            messageDigest.update(userId.getBytes(StandardCharsets.UTF_8));
            messageDigest.update(":".getBytes(StandardCharsets.UTF_8));
            byte [] userIdHash = messageDigest.digest(userPassword.getBytes(StandardCharsets.UTF_8));

            messageDigest.reset();
            messageDigest.update(salt.toByteArray());
            BigInteger x = new BigInteger(1, messageDigest.digest(userIdHash));
            BigInteger S = (B.subtract(k.multiply(g.modPow(x,N))).modPow(a.add(u.multiply(x)), N)).mod(N);

            Hkdf hkdf = null;
            try {
                hkdf = Hkdf.getInstance("HmacSHA256");
            } catch (NoSuchAlgorithmException e) {
                throw new CognitoInternalErrorException(e.getMessage(), e);
            }
            hkdf.init(S.toByteArray(), u.toByteArray());
            byte[] key = hkdf.deriveKey(DERIVED_KEY_INFO, DERIVED_KEY_SIZE);
            return key;
        }
    }

    /**
     * Creates a user session with the tokens from authentication.
     *
     * @param authResult                        REQUIRED: Authentication result which contains the
     *                                          tokens.
     * @return {@link CognitoUserSession} with the latest tokens.
     */
    private CognitoUserSession getCognitoUserSession(AuthenticationResultType authResult) {
        return getCognitoUserSession(authResult, null);
    }

    /**
     * Creates a user session with the tokens from authentication and overrider the refresh token
     * with the value passed.
     *
     * @param authResult                        REQUIRED: Authentication result which contains the
     *                                          tokens.
     * @param refreshTokenOverride              REQUIRED: This will be used to create a new session
     *                                          object if it is not null.
     * @return {@link CognitoUserSession} with the latest tokens.
     */
    private CognitoUserSession getCognitoUserSession(AuthenticationResultType authResult,
                                                     CognitoRefreshToken refreshTokenOverride) {
        String idtoken = authResult.getIdToken();
        CognitoIdToken idToken = new CognitoIdToken(idtoken);

        String acctoken = authResult.getAccessToken();
        CognitoAccessToken accessToken = new CognitoAccessToken(acctoken);


        CognitoRefreshToken refreshToken;
        if (refreshTokenOverride != null) {
            refreshToken = refreshTokenOverride; }
        else {
            String reftoken = authResult.getRefreshToken();
            refreshToken = new CognitoRefreshToken(reftoken);
        }

        return new CognitoUserSession(idToken, accessToken, refreshToken);
    }

    /**
     * Internal method to refresh the tokens if the session has expired.
     *
     * @param refreshToken                      REQUIRED: Refresh token for get new tokens.
     * @return {@link CognitoUserSession}
     */
    private CognitoUserSession refreshSessionInternal(CognitoRefreshToken refreshToken) {
        if (refreshToken != null) {

            RefreshTokensRequest refreshTokensRequest = new RefreshTokensRequest();
            refreshTokensRequest.setClientId(clientId);
            refreshTokensRequest.setClientSecret(clientSecret);
            refreshTokensRequest.setRefreshToken(refreshToken.getToken());

            RefreshTokensResult refreshTokensResult =
                    cognitoIdentityProviderClient.refreshTokens(refreshTokensRequest);
            AuthenticationResultType authenticationResult = refreshTokensResult.getAuthenticationResult();

            if (authenticationResult != null) {
                throw new CognitoNotAuthorizedException("user is not authenticated");
            }

            // The new tokens received from the refresh token, will not contain a new refresh token.
            // Retain the old refresh token.
            return getCognitoUserSession(authenticationResult, refreshToken);
        }
        throw new CognitoNotAuthorizedException("user is not authenticated");
    }
}

/*
  * Copyright 2013-2018 Amazon.com, Inc. or its affiliates.
  * All Rights Reserved.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *     http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */

package com.amazonaws.mobile.auth.userpools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.amazonaws.mobile.config.AWSConfiguration;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.NewPasswordContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.VerificationHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoDevice;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserCodeDeliveryDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserSession;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.ChallengeContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.ForgotPasswordContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.MultiFactorAuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.ForgotPasswordHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.GenericHandler;

import com.amazonaws.services.cognitoidentityprovider.model.InvalidParameterException;
import com.amazonaws.services.cognitoidentityprovider.model.NotAuthorizedException;
import com.amazonaws.services.cognitoidentityprovider.model.UserNotConfirmedException;
import com.amazonaws.services.cognitoidentityprovider.model.UserNotFoundException;

import com.amazonaws.mobile.auth.core.signin.SignInProvider;
import com.amazonaws.mobile.auth.core.signin.SignInProviderResultHandler;
import com.amazonaws.mobile.auth.core.internal.util.ViewHelper;

import org.json.JSONException;

import java.util.HashSet;
import java.util.Set;

import static com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.AttributeKeys.CONFIRMATION_DESTINATION;
import static com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.AttributeKeys.IS_SIGN_UP_CONFIRMED;
import static com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD;
import static com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME;
import static com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.AttributeKeys.VERIFICATION_CODE;

/**
 * Manages sign-in using Cognito User Pools.
 */
public class CognitoUserPoolsSignInProvider implements SignInProvider {

    private String signUpConfirmationDestination;
    private NewPasswordContinuation mForceChangePasswordContinuation;

    /**
     * Cognito User Pools attributes.
     */
    public static final class AttributeKeys {

        /** Username attribute. */
        public static final String USERNAME = "username";

        /** Password attribute. */
        public static final String PASSWORD = "password";

        /** Verification code attribute. */
        public static final String VERIFICATION_CODE = "verification_code";

        /** Given name attribute. */
        public static final String GIVEN_NAME = "given_name";

        /** Email address attribute. */
        public static final String EMAIL_ADDRESS = "email";

        /** Phone number attribute. */
        public static final String PHONE_NUMBER = "phone_number";

        /** Background Color. */
        public static final String BACKGROUND_COLOR = "signInBackgroundColor";

        /** Key for enabling background color full screen. */
        public static final String FULL_SCREEN_BACKGROUND_COLOR = "fullScreenBackgroundColor";

        /** Key for specifying the custom font family. */
        public static final String FONT_FAMILY = "fontFamily";
        public static final String IS_SIGN_UP_CONFIRMED = "isSignUpConfirmed";
        public static final String CONFIRMATION_DESTINATION = "destination";
    }

    /** Log tag. */
    private static final String LOG_TAG = CognitoUserPoolsSignInProvider.class.getSimpleName();

    /** Start of Intent request codes owned by the Cognito User Pools app. */
    private static final int REQUEST_CODE_START = 0x2970;

    private enum RequestCodes {
        /** Request code for password reset Intent. */
        FORGOT_PASSWORD_REQUEST_CODE(REQUEST_CODE_START + 42),
        /** Request code for account registration Intent. */
        SIGN_UP_REQUEST_CODE(REQUEST_CODE_START + 43),
        /** Request code for MFA Intent. */
        MFA_REQUEST_CODE(REQUEST_CODE_START + 44),
        /** Request code for account verification Intent. */
        VERIFICATION_REQUEST_CODE(REQUEST_CODE_START + 45),
        /** Request code for force change password Intent. */
        FORCE_CHANGE_PASSWORD_REQUEST_CODE(REQUEST_CODE_START + 46);

        public final int value;

        RequestCodes(final int value) {
            this.value = value;
        }

        static RequestCodes valueOf(final int value) {
            Log.e(LOG_TAG, "valueOf: " + value, new RuntimeException(""));
            for (RequestCodes requestCodes : RequestCodes.values()) {
                Log.e(LOG_TAG, "valueOf: compare " + requestCodes.value);
                if (value == requestCodes.value) {
                    return requestCodes;
                }
            }
            return null;
        }
    }

    /** Minimum length of password supported by Cognito. */
    private static final int PASSWORD_MIN_LENGTH = 6;

    /** Prefix of the exception message. */
    private static final String USERPOOLS_EXCEPTION_PREFIX = "(Service";

    /** The sign-in results adapter from the SignInManager. */
    private SignInProviderResultHandler resultsHandler;

    /** Forgot Password processing provided by the Cognito User Pools SDK. */
    private ForgotPasswordContinuation forgotPasswordContinuation;

    /** MFA processing provided by the Cognito User Pools SDK. */
    private MultiFactorAuthenticationContinuation multiFactorAuthenticationContinuation;

    /** Android context. */
    private Context context;

    /** Invoking Android Activity. */
    private Activity activity;

    /** Sign-in username. */
    private String username;

    /** Sign-in password. */
    private String password;

    /** Sign-in verification code. */
    private String verificationCode;

    /** The key for CognitoUserPools Login. */
    private String cognitoLoginKey;

    /** Active Cognito User Pool. */
    private CognitoUserPool cognitoUserPool;

    /** Active Cognito User Pools session. */
    private CognitoUserSession cognitoUserSession;

    /** AWSConfiguration object. */
    private AWSConfiguration awsConfiguration;

    /** Background Color for the View. */
    private static int backgroundColor;

    /** Draw the background color full screen if fullScreenBackgroundColor is True. */
    private static boolean isBackgroundColorFullScreenEnabled;

    /** Tyypeface font-family. */
    private static String fontFamily;

    /**
     * Handle callbacks from the Forgot Password flow.
     */
    private ForgotPasswordHandler forgotPasswordHandler = new ForgotPasswordHandler() {
        @Override
        public void onSuccess() {
            Log.d(LOG_TAG, "Password change succeeded.");
            ViewHelper.showDialog(activity, activity.getString(R.string.title_activity_forgot_password),
                    activity.getString(R.string.password_change_success));
            final CognitoUser cognitoUser = cognitoUserPool.getUser(username);
            cognitoUser.getSessionInBackground(authenticationHandler);
        }

        @Override
        public void getResetCode(final ForgotPasswordContinuation continuation) {
            forgotPasswordContinuation = continuation;

            final Intent intent = new Intent(context, ForgotPasswordActivity.class);
            activity.startActivityForResult(intent, RequestCodes.FORGOT_PASSWORD_REQUEST_CODE.value);
        }

        @Override
        public void onFailure(final Exception exception) {
            Log.e(LOG_TAG, "Password change failed.", exception);

            final String message;
            if (exception instanceof InvalidParameterException) {
                message = activity.getString(R.string.password_change_no_verification_failed);
            } else {
                message = getErrorMessageFromException(exception);
            }
            ViewHelper.showDialog(activity, activity.getString(R.string.title_activity_forgot_password),
                    activity.getString(R.string.password_change_failed) + " " + message);
        }
    };

    /**
     * Start the SignUp Confirm Activity with the attribte keys.
     */
    private void startVerificationActivity() {
        final Intent intent = new Intent(context, SignUpConfirmActivity.class);
        intent.putExtra(USERNAME, username);
        intent.putExtra(CONFIRMATION_DESTINATION, signUpConfirmationDestination);
        activity.startActivityForResult(intent, RequestCodes.VERIFICATION_REQUEST_CODE.value);
    }

    /**
     * Handle callbacks from the Sign Up - Confirm Account flow.
     */
    private GenericHandler signUpConfirmationHandler = new GenericHandler() {
        @Override
        public void onSuccess() {
            Log.i(LOG_TAG, "Confirmed.");
            ViewHelper.showDialog(activity, activity.getString(R.string.title_activity_sign_up_confirm),
                    activity.getString(R.string.sign_up_confirm_success));
            final CognitoUser cognitoUser = cognitoUserPool.getUser(username);
            cognitoUser.getSessionInBackground(authenticationHandler);
        }

        @Override
        public void onFailure(final Exception exception) {
            Log.e(LOG_TAG, "Failed to confirm user.", exception);
            ViewHelper.showDialog(activity, activity.getString(R.string.title_activity_sign_up_confirm),
                    activity.getString(R.string.sign_up_confirm_failed) + " " + getErrorMessageFromException(exception));
        }
    };

    /**
     * Resent the confirmation code on MFA.
     */
    private void resendConfirmationCode() {
        final CognitoUser cognitoUser = cognitoUserPool.getUser(username);
        cognitoUser.resendConfirmationCodeInBackground(new VerificationHandler() {
            @Override
            public void onSuccess(final CognitoUserCodeDeliveryDetails verificationCodeDeliveryMedium) {
                startVerificationActivity();
            }

            @Override
            public void onFailure(final Exception exception) {
                if (null != resultsHandler) {
                    ViewHelper.showDialog(activity, activity.getString(R.string.title_activity_sign_in),
                        activity.getString(R.string.login_failed)
                            + "\nUser was not verified and resending confirmation code failed.\n"
                            + getErrorMessageFromException(exception));

                    resultsHandler.onError(CognitoUserPoolsSignInProvider.this, exception);
                }
            }
        });
    }

    /**
     * Handle callbacks from the Authentication flow. Includes MFA handling.
     */
    private AuthenticationHandler authenticationHandler = new AuthenticationHandler() {
        @Override
        public void onSuccess(final CognitoUserSession userSession, final CognitoDevice newDevice) {
            Log.i(LOG_TAG, "Logged in. " + userSession.getIdToken());

            cognitoUserSession = userSession;

            if (null != resultsHandler) {
                resultsHandler.onSuccess(CognitoUserPoolsSignInProvider.this);
            }
        }

        @Override
        public void getAuthenticationDetails(
                final AuthenticationContinuation authenticationContinuation, final String userId) {

            if (null != username && null != password) {
                final AuthenticationDetails authenticationDetails = new AuthenticationDetails(
                        username,
                        password,
                        null);

                authenticationContinuation.setAuthenticationDetails(authenticationDetails);
                authenticationContinuation.continueTask();
            }
        }

        @Override
        public void getMFACode(final MultiFactorAuthenticationContinuation continuation) {
            multiFactorAuthenticationContinuation = continuation;

            final Intent intent = new Intent(context, MFAActivity.class);
            activity.startActivityForResult(intent, RequestCodes.MFA_REQUEST_CODE.value);
        }

        @Override
        public void authenticationChallenge(final ChallengeContinuation continuation) {
            if (continuation instanceof NewPasswordContinuation) {
                mForceChangePasswordContinuation = (NewPasswordContinuation) continuation;

                final Intent intent = new Intent(context, ForceChangePasswordActivity.class);
                activity.startActivityForResult(intent, RequestCodes.FORCE_CHANGE_PASSWORD_REQUEST_CODE.value);
            } else {
                throw new UnsupportedOperationException("Not supported in this sample.");
            }
        }

        @Override
        public void onFailure(final Exception exception) {
            Log.e(LOG_TAG, "Failed to login.", exception);

            final String message;

            // UserNotConfirmedException will only happen once in the sign-in flow in the case
            // that the user attempting to sign in had not confirmed their account by entering
            // the correct verification code. A different exception is thrown if the code
            // is invalid, so this will not create an continuous confirmation loop if the
            // user enters the wrong code.
            if (exception instanceof UserNotConfirmedException) {
                resendConfirmationCode();
                return;
            }

            if (exception instanceof UserNotFoundException) {
                message = activity.getString(R.string.user_does_not_exist);
            } else if (exception instanceof NotAuthorizedException) {
                message = activity.getString(R.string.incorrect_username_or_password);
            } else {
                message = getErrorMessageFromException(exception);
            }


            if (null != resultsHandler) {
                ViewHelper.showDialog(activity, activity.getString(R.string.title_activity_sign_in),
                                      activity.getString(R.string.login_failed) + " " + message);
                resultsHandler.onError(CognitoUserPoolsSignInProvider.this, exception);
            }
        }
    };

    /** {@inheritDoc} */
    @Override
    public void initialize(final Context context, final AWSConfiguration awsConfiguration) {
        this.context = context;
        this.awsConfiguration = awsConfiguration;

        Log.d(LOG_TAG, "Initializing Cognito User Pools");

        this.cognitoUserPool = new CognitoUserPool(context, awsConfiguration);

        cognitoLoginKey = "cognito-idp." + getValueFromConfig("Region")
            + ".amazonaws.com/" + cognitoUserPool.getUserPoolId();
    }

    protected String getValueFromConfig(final String valueName) {
        try {
            return awsConfiguration.optJsonObject("CognitoUserPool").getString(valueName);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Cannot find the CognitoUserPool " + valueName +
                    " from the AWSConfiguration file.", e);
        }
    }

    @Override
    public boolean isRequestCodeOurs(int requestCode) {
        return RequestCodes.valueOf(requestCode) != null;
    }

    /** {@inheritDoc} */
    @Override
    public void handleActivityResult(final int requestCode,
                                     final int resultCode,
                                     final Intent data) {

        RequestCodes requestCodeEnum = RequestCodes.valueOf(requestCode);
        if (Activity.RESULT_OK == resultCode && requestCodeEnum != null) {
            switch (requestCodeEnum) {
                case FORGOT_PASSWORD_REQUEST_CODE:
                    password = data.getStringExtra(PASSWORD);
                    verificationCode = data.getStringExtra(VERIFICATION_CODE);

                    if (password.length() < PASSWORD_MIN_LENGTH) {
                        ViewHelper.showDialog(activity, activity.getString(R.string.title_activity_forgot_password),
                                    activity.getString(R.string.password_change_failed) 
                                    + " " + activity.getString(R.string.password_length_validation_failed));
                        return;
                    }

                    Log.d(LOG_TAG, "verificationCode = " + verificationCode);

                    forgotPasswordContinuation.setPassword(password);
                    forgotPasswordContinuation.setVerificationCode(verificationCode);
                    forgotPasswordContinuation.continueTask();
                    break;
                case SIGN_UP_REQUEST_CODE:
                    username = data.getStringExtra(USERNAME);
                    password = data.getStringExtra(PASSWORD);
                    final boolean isSignUpConfirmed = data.getBooleanExtra(IS_SIGN_UP_CONFIRMED, true);
                    signUpConfirmationDestination = data.getStringExtra(CONFIRMATION_DESTINATION);

                    Log.d(LOG_TAG, "sign up result username = " + username);

                    if (isSignUpConfirmed) {
                        Log.d(LOG_TAG, "Signed up. User ID = " + username);
                        ViewHelper.showDialog(activity, activity.getString(R.string.title_activity_sign_up),
                                activity.getString(R.string.sign_up_success) + " " + username);
                        signInUser();
                    } else {
                        Log.w(LOG_TAG, "Additional confirmation for sign up.");
                        startVerificationActivity();
                    }
                    break;
                case MFA_REQUEST_CODE:
                    verificationCode = data.getStringExtra(VERIFICATION_CODE);

                    if (verificationCode.length() < 1) {
                        ViewHelper.showDialog(activity, activity.getString(R.string.title_activity_mfa),
                                    activity.getString(R.string.mfa_failed) 
                                    + " " + activity.getString(R.string.mfa_code_empty));
                        return;
                    }

                    Log.d(LOG_TAG, "verificationCode = " + verificationCode);

                    multiFactorAuthenticationContinuation.setMfaCode(verificationCode);
                    multiFactorAuthenticationContinuation.continueTask();

                    break;
                case VERIFICATION_REQUEST_CODE:
                    Log.d(LOG_TAG, "handleActivityResult: VERIFICATION_REQUEST_CODE");
                    username = data.getStringExtra(USERNAME);
                    verificationCode = data.getStringExtra(VERIFICATION_CODE);

                    if (username.length() < 1) {
                        ViewHelper.showDialog(activity, activity.getString(R.string.title_activity_sign_up_confirm),
                                    activity.getString(R.string.sign_up_confirm_title)
                                    + " " + activity.getString(R.string.sign_up_username_missing));
                        return;
                    }

                    if (verificationCode.length() < 1) {
                        ViewHelper.showDialog(activity, activity.getString(R.string.title_activity_sign_up_confirm),
                                    activity.getString(R.string.sign_up_confirm_title) 
                                    + " " + activity.getString(R.string.sign_up_confirm_code_missing));
                        return;
                    }

                    Log.d(LOG_TAG, "username = " + username);
                    Log.d(LOG_TAG, "verificationCode = " + verificationCode);

                    final CognitoUser cognitoUser = cognitoUserPool.getUser(username);
                    cognitoUser.confirmSignUpInBackground(verificationCode, true, signUpConfirmationHandler);

                    break;
                case FORCE_CHANGE_PASSWORD_REQUEST_CODE:
                    Log.d(LOG_TAG, "handleActivityResult: FORCE_CHANGE_PASSWORD_REQUEST_CODE");
                    password = data.getStringExtra(PASSWORD);

                    mForceChangePasswordContinuation.setPassword(password);
                    mForceChangePasswordContinuation.continueTask();
                    break;
                default:
                    Log.e(LOG_TAG, "Unknown Request Code sent.");
            }
        }
    }

    protected void signInUser() {
        final CognitoUser cognitoUser = cognitoUserPool.getUser(username);
        cognitoUser.getSessionInBackground(authenticationHandler);
    }

    /** {@inheritDoc} */
    @Override
    public View.OnClickListener initializeSignInButton(final Activity signInActivity,
                                                       final View buttonView,
                                                       final SignInProviderResultHandler providerResultsHandler) {
        this.activity = signInActivity;
        this.resultsHandler = providerResultsHandler;

        final UserPoolSignInView userPoolSignInView =
            (UserPoolSignInView) activity.findViewById(R.id.user_pool_sign_in_view_id);

        backgroundColor = userPoolSignInView.getBackgroundColor();
        fontFamily = userPoolSignInView.getFontFamily();
        isBackgroundColorFullScreenEnabled = userPoolSignInView.isBackgroundColorFullScreen();

        userPoolSignInView.getSignUpTextView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignUpActivity.startActivity(activity, RequestCodes.SIGN_UP_REQUEST_CODE.value);
            }
        });

        final TextView forgotPasswordTextView = userPoolSignInView.getForgotPasswordTextView();
        forgotPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                username = userPoolSignInView.getEnteredUserName();
                if (username.length() < 1) {
                    Log.w(LOG_TAG, "Missing username.");
                    ViewHelper.showDialog(activity, activity.getString(R.string.title_activity_sign_in), "Missing username.");
                    return;
                }

                final CognitoUser cognitoUser = cognitoUserPool.getUser(username);
                cognitoUser.forgotPasswordInBackground(forgotPasswordHandler);
            }
        });

        final View.OnClickListener signInClickListener = new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                username = userPoolSignInView.getEnteredUserName();
                password = userPoolSignInView.getEnteredPassword();

                signInUser();
            }
        };

        buttonView.setOnClickListener(signInClickListener);
        return signInClickListener;
    }

    /** {@inheritDoc} */
    @Override
    public String getDisplayName() {
        return "Amazon Cognito Your User Pools";
    }

    /** {@inheritDoc} */
    @Override
    public String getCognitoLoginKey() {
        return cognitoLoginKey;
    }

    /**
     * Authentication handler for handling token refresh.
     */
    private static class RefreshSessionAuthenticationHandler implements AuthenticationHandler {
        private CognitoUserSession userSession = null;

        private CognitoUserSession getUserSession() {
            return userSession;
        }

        @Override
        public void onSuccess(final CognitoUserSession userSession, final CognitoDevice newDevice) {
            this.userSession = userSession;
        }

        @Override
        public void getAuthenticationDetails(final AuthenticationContinuation authenticationContinuation,
                                             final String UserId) {
            Log.d(LOG_TAG, "Can't refresh the session silently, due to authentication details needed.");
        }

        @Override
        public void getMFACode(final MultiFactorAuthenticationContinuation continuation) {
            Log.wtf(LOG_TAG, "Refresh flow can not trigger request for MFA code.");
        }

        @Override
        public void authenticationChallenge(final ChallengeContinuation continuation) {
            Log.wtf(LOG_TAG, "Refresh flow can not trigger request for authentication challenge.");
        }

        @Override
        public void onFailure(final Exception exception) {
            Log.e(LOG_TAG, "Can't refresh session.", exception);
        }
    }

    /** {@inheritDoc} */
    @Override
    public boolean refreshUserSignInState() {
        if (null != cognitoUserSession && cognitoUserSession.isValid()) {
            return true;
        }

        final RefreshSessionAuthenticationHandler refreshSessionAuthenticationHandler
            = new RefreshSessionAuthenticationHandler();

        cognitoUserPool.getCurrentUser().getSession(refreshSessionAuthenticationHandler);
        if (null != refreshSessionAuthenticationHandler.getUserSession()) {
            cognitoUserSession = refreshSessionAuthenticationHandler.getUserSession();
            Log.i(LOG_TAG, "refreshUserSignInState: Signed in with Cognito.");
            return true;
        }

        Log.i(LOG_TAG, "refreshUserSignInState: Not signed in with Cognito.");
        cognitoUserSession = null;
        return false;
    }

    /** {@inheritDoc} */
    @Override
    public String getToken() {
        return null == cognitoUserSession ? null : cognitoUserSession.getIdToken().getJWTToken();
    }

    /** {@inheritDoc} */
    @Override
    public String refreshToken() {
        // If there is a session, but the credentials are expired rendering the session not valid.
        if ((cognitoUserSession != null) && !cognitoUserSession.isValid()) {
            // Attempt to refresh the credentials.
            final RefreshSessionAuthenticationHandler refreshSessionAuthenticationHandler
                = new RefreshSessionAuthenticationHandler();

            // Cognito User Pools SDK will attempt to refresh the token upon calling getSession().
            cognitoUserPool.getCurrentUser().getSession(refreshSessionAuthenticationHandler);

            if (null != refreshSessionAuthenticationHandler.getUserSession()) {
                cognitoUserSession = refreshSessionAuthenticationHandler.getUserSession();
            } else {
                Log.e(LOG_TAG, "Could not refresh the Cognito User Pool Token.");
            }
        }

        return getToken();
    }

    /** {@inheritDoc} */
    @Override
    public void signOut() {
        if (null != cognitoUserPool && null != cognitoUserPool.getCurrentUser()) {
            cognitoUserPool.getCurrentUser().signOut();

            cognitoUserSession = null;
            username = null;
            password = null;
        }
    }

    /**
     * @return the Cognito User Pool.
     */
    public CognitoUserPool getCognitoUserPool() {
        return cognitoUserPool;
    }

    /**
     * Extract the error message from the exception object.
     * @param exception The exception object thrown by Cognito IdentityProvider.
     * */
    static String getErrorMessageFromException(final Exception exception) {
        final String message = exception.getLocalizedMessage();
        if (message == null) {
            return exception.getMessage();
        }
        final int index = message.indexOf(USERPOOLS_EXCEPTION_PREFIX);
        if (index == -1) {
            return message;
        } else {
            return message.substring(0, index);
        }
    }

    static boolean isBackgroundColorFullScreen() {
        return isBackgroundColorFullScreenEnabled;
    }

    static int getBackgroundColor() {
        return backgroundColor;
    }

    static String getFontFamily() {
        return fontFamily;
    }
}

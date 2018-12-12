/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.amazonmobileanalytics;

import android.content.Context;
import android.util.Log;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.DefaultAnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.http.RequestTimingHandler;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.Preconditions;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.SDKInfo;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.DefaultEventClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.InternalEventClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.FileSessionStore;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.InternalSessionClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client.DefaultSessionClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.validate.EncodingValidator;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.validate.FileManagerValidator;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.validate.PermissionValidator;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.mobileanalytics.AmazonMobileAnalyticsClient;
import com.amazonaws.util.VersionInfoUtils;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;

import java.util.HashMap;

/**
 * MobileAnalyticsManager in the entry point to recording analytic events for
 * your application. Each MobileAnalyticsManager instance is associated with a
 * app ID which is used both as a key to get a SharedPreferences object that
 * MobileAnalyticsManager can use, and as a directory name that
 * MobileAnalyticsManager will use to store files about events that you record.
 * If you are developing a library, you should create a app ID for your library
 * so it does not collide with the app ID of app developer using your library.
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class MobileAnalyticsManager {
    private static final String SDK_VERSION = VersionInfoUtils.getVersion();
    private static final String SDK_NAME = "AmazonMobileAnalyticsSDK";
    private static final SDKInfo sdkInfo = new SDKInfo(SDK_NAME, SDK_VERSION);
    private static final String TAG = "MobileAnalyticsManager";

    private static final PermissionValidator internetPermissionValidator = new PermissionValidator(
            "android.permission.INTERNET");
    private static final PermissionValidator accessNetworkStatePermissionValidator = new PermissionValidator(
            "android.permission.ACCESS_NETWORK_STATE");

    private static final HashMap<String, MobileAnalyticsManager> instanceMap =
            new HashMap<String, MobileAnalyticsManager>();

    private static final EncodingValidator encodingValidator = new EncodingValidator("UTF-8");
    private static final FileManagerValidator fileManagerValidator = new FileManagerValidator();

    private final AnalyticsContext context;
    private final InternalEventClient eventClient;
    private final InternalSessionClient sessionClient;

    /**
     * Create an {@link MobileAnalyticsManager} object using the specified
     * {@link AnalyticsConfig} values
     *
     * @param appContext The Android ApplicationContext
     * @param AWSCredentialsProvider The credentials provider
     *            MobileAnalyticsManager should use when making requests to AWS
     * @param appId The AppId from the Amazon Mobile Analytics console, which
     *            will be used as a key for a SharedPreferences object
     *            MobileAnalyticsManager has exclusive access to, and as a
     *            directory name that MobileAnalyticsManager can use to store
     *            events you record.
     * @param options The {@link AnalyticsConfig} to use when creating the
     *            {@link MobileAnalyticsManager} instance
     * @param initCompletionCallback A callback to allow developers to handle
     *            custom logic after initialization but before the session
     *            begins
     * @return an {@link MobileAnalyticsManager} instance
     * @throws InitializationException if any part of constructing the
     *             MobileAnalyticsManager instance failed
     */
    MobileAnalyticsManager(final Context appContext, final String appId, final Regions region,
            final AWSCredentialsProvider credentialsProvider,
            AnalyticsConfig options,
            final AnalyticsCallback<MobileAnalyticsManager> initCompletionCallback)
            throws InitializationException {

        try {
            Preconditions.checkNotNull(credentialsProvider,
                    "The ersClient provided must not be null");
            Preconditions.checkNotNull(appContext,
                    "The application context provided must not be null");
            Preconditions.checkNotNull(options, "The options provided must not be null");
            Preconditions.checkNotNull(appId, "The app ID specified must not be null");

            AmazonMobileAnalyticsClient ersClient = new AmazonMobileAnalyticsClient(
                    credentialsProvider,
                    options.getClientConfiguration());

            internetPermissionValidator.validate(appContext);
            accessNetworkStatePermissionValidator.validate(appContext);
            encodingValidator.validate();

            this.context = new DefaultAnalyticsContext(ersClient, appContext, region, appId,
                    sdkInfo, options.getAllowWANDelivery());
            fileManagerValidator.validate(context);

            eventClient = new DefaultEventClient(context, options.getAllowEventCollection());

            sessionClient = new DefaultSessionClient(context, eventClient, new FileSessionStore(
                    context));
            context.getERSClient().addRequestHandler(
                    new RequestTimingHandler(context.getSystem().getConnectivity(), eventClient));

            if (initCompletionCallback != null) {
                initCompletionCallback.onComplete(this);
            }

            sessionClient.startSession();

            Log.d(TAG, String.format(
                    "Amazon Mobile Analytics SDK(%s) initialization successfully completed",
                    SDK_VERSION));
        } catch (RuntimeException e) {
            Log.d(TAG, "Cannot initialize Amazon Mobile Analytics SDK", e);
            throw new InitializationException(e.getLocalizedMessage());
        }
    }

    /**
     * For testing purposes only
     *
     * @param appContext
     * @param appId
     * @param region
     * @param credentialsProvider
     * @param options
     * @param initCompletionCallback
     * @throws InitializationException
     */
    MobileAnalyticsManager(final Context appContext, final String appId, final Regions region,
            final AWSCredentialsProvider credentialsProvider,
            AnalyticsConfig options,
            final AnalyticsCallback<MobileAnalyticsManager> initCompletionCallback,
            AnalyticsContext analyticsContext, InternalEventClient eventClient,
            InternalSessionClient sessionClient, AmazonMobileAnalyticsClient ersClient)
            throws InitializationException {

        try {
            Preconditions.checkNotNull(credentialsProvider,
                    "The ersClient provided must not be null");
            Preconditions.checkNotNull(appContext,
                    "The application context provided must not be null");
            Preconditions.checkNotNull(options, "The options provided must not be null");
            Preconditions.checkNotNull(appId, "The app ID specified must not be null");

            internetPermissionValidator.validate(appContext);
            accessNetworkStatePermissionValidator.validate(appContext);
            encodingValidator.validate();

            this.context = analyticsContext;
            this.sessionClient = sessionClient;
            this.eventClient = eventClient;
            fileManagerValidator.validate(context);

            context.getERSClient().addRequestHandler(
                    new RequestTimingHandler(context.getSystem().getConnectivity(), eventClient));

            if (initCompletionCallback != null) {
                initCompletionCallback.onComplete(this);
            }

            sessionClient.startSession();

            Log.d(TAG, (String.format(
                    "Amazon Mobile Analytics SDK(%s) initialization successfully completed",
                    SDK_VERSION)));
        } catch (RuntimeException e) {
            Log.d(TAG, "Cannot initialize Amazon Mobile Analytics SDK", e);
            throw new InitializationException(e.getLocalizedMessage());
        }
    }

    /**
     * The {@link EventClient} is the primary class used to create, store, and
     * submit events from your application.
     *
     * @return an {@link EventClient}
     */
    public EventClient getEventClient() {
        return eventClient;
    }

    /**
     * The {@link SessionClient} is the primary class used to pause and resume
     * sessions, so that you can gain useful data about how your users are
     * interacting with your application. You should use the
     * {@link SessionClient} onPause and onResume method in each of your
     * activities onPause and onResume methods.
     *
     * @return an {@link SessionClient}
     */
    public SessionClient getSessionClient() {
        return sessionClient;
    }

    /*
     * Returns the instance of MobileAnalyticsManager associated with the given
     * appId
     * @param appId The app ID associated with the instance of the
     * MobileAnalyticsManager you want
     * @return MobileAnalyticsManager instance associated with the given appId
     */
    public static MobileAnalyticsManager getInstance(String appId) {
        synchronized (instanceMap) {
            return instanceMap.get(appId);
        }
    }

    /*
     * Same as getOrCreateInstance(Context, String, Regions, AWSCredentialsProvider)
     * without the Regions and AWSCredentialsProvider parameters. This method defaults
     * to use Regions.US_EAST_1 and create a CognitoCachingCredentialsProvider with the
     * provided Cognito identity pool Id.
     */
    public static MobileAnalyticsManager getOrCreateInstance(Context context, String appId,
            String cognitoId
            ) throws InitializationException {

        CognitoCachingCredentialsProvider cognitoProvider = new CognitoCachingCredentialsProvider(
                context,
                cognitoId,
                Regions.US_EAST_1
        );
        return getOrCreateInstance(context, appId, Regions.US_EAST_1, cognitoProvider, null, null);
    }

    /*
     * Same as getOrCreateInstance(Context, String, Regions, AWSCredentialsProvider,
     * AnalyticsConfig) without the AnalyticsConfig options parameter.
     */
    public static MobileAnalyticsManager getOrCreateInstance(Context context, String appId,
            Regions region, AWSCredentialsProvider credentialsProvider
            ) throws InitializationException {
        return getOrCreateInstance(context, appId, region, credentialsProvider, null, null);
    }

    /*
     * Same as getOrCreateInstance(Context, String, Regions, AWSCredentialsProvider,
     * AnalyticsConfig,  AnalyticsCallback<MobileAnalyticsManager>) without the AnalyticsCallback
     * initCompletionCallback parameter.
     */
    public static MobileAnalyticsManager getOrCreateInstance(Context context, String appId,
            Regions region, AWSCredentialsProvider credentialsProvider,
            AnalyticsConfig options) throws InitializationException {
        return getOrCreateInstance(context, appId, region, credentialsProvider, options, null);
    }

    /*
     * Same as getOrCreateInstance(Context, String, Regions, AWSCredentialsProvider,
     * AnalyticsConfig, AnalyticsCallback<MobileAnalyticsManager>) without
     * optional parameters
     */
    public static MobileAnalyticsManager getOrCreateInstance(Context context, String appId,
            Regions region, AWSCredentialsProvider credentialsProvider,
            AnalyticsCallback<MobileAnalyticsManager> initCompletionCallback)
            throws InitializationException {
        return getOrCreateInstance(context, appId, region, credentialsProvider, null,
                initCompletionCallback);
    }

    /*
     * Returns the MobileAnalyticsManager instance associated with the appId,
     * creating a new one if necessary
     * @param context The application context
     * @param credentialsProvider Credentials provider that we will be using
     * when making API calls
     * @param appId appId taken from the Amazon Mobile Analytics console
     * @param region The region for MobileAnalyticsManager
     * @param options (optional) options to give to the MobileAnalyticsManager
     * instance
     * @param initCompletionCallback callback that will be called after the
     * MobileAnalyticsManager instance is initialized
     * @return MobileAnalyticsManager instance associated with given appId
     */
    public static MobileAnalyticsManager getOrCreateInstance(Context context, String appId,
            Regions region,
            AWSCredentialsProvider credentialsProvider,
            AnalyticsConfig options,
            AnalyticsCallback<MobileAnalyticsManager> initCompletionCallback)
            throws InitializationException {
        synchronized (instanceMap) {
            if (!instanceMap.containsKey(appId)) {
                if (options == null) {
                    options = new AnalyticsConfig();
                }
                instanceMap.put(appId, new MobileAnalyticsManager(
                        context, appId, region, credentialsProvider,
                        options, initCompletionCallback)
                        );
            }
            return instanceMap.get(appId);
        }
    }
}

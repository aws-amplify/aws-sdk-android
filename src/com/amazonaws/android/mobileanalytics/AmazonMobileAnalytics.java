/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.android.mobileanalytics;

import android.content.Context;

import com.amazonaws.android.mobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.android.mobileanalytics.internal.core.DefaultAnalyticsContext;
import com.amazonaws.android.mobileanalytics.internal.core.http.RequestTimingHandler;
import com.amazonaws.android.mobileanalytics.internal.core.log.Logger;
import com.amazonaws.android.mobileanalytics.internal.core.util.Preconditions;
import com.amazonaws.android.mobileanalytics.internal.core.util.SDKInfo;
import com.amazonaws.android.mobileanalytics.internal.event.DefaultEventClient;
import com.amazonaws.android.mobileanalytics.internal.event.InternalEventClient;
import com.amazonaws.android.mobileanalytics.internal.session.InternalSessionClient;
import com.amazonaws.android.mobileanalytics.internal.session.client.DefaultSessionClient;
import com.amazonaws.android.mobileanalytics.internal.validate.EncodingValidator;
import com.amazonaws.android.mobileanalytics.internal.validate.FileManagerValidator;
import com.amazonaws.android.mobileanalytics.internal.validate.PermissionValidator;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.eventrecorder.AWSEventRecorderServiceClient;

/**
 * AmazonMobileAnalytics in the entry point to recording analytic events for your
 * application. To instantiate an instance of the AmazonMobileAnalytics class you must
 * be sure to pass it the application context, valid AWSCredentialsProvider, and
 * the namespace of your app, which should be unique to your application. The namespace must be the same each
 * time the app calls the constructor. This namespace is used both as a key to get
 * a SharedPreferences object that AmazonMobileAnalytics can use, and as a directory
 * name that AmazonMobileAnalytics will use to store files about events that you
 * record.  If you are developing a library, you should create a namespace for your library so it does not collide with the namespace
 * of app developer using your library.
 * 
 * Warning: Never create multiple instances of AmazonMobileAnalytics with the same
 * appNameSpace. Doing so is an error, and the behavior is undefined.
 * 
 */
public class AmazonMobileAnalytics {
    private static final String SDK_VERSION = "2.0";
    private static final String SDK_NAME = "AmazonMobileAnalyticsSDK";
    private static final String USER_AGENT = "MobileAnalytics";
    private static final SDKInfo sdkInfo = new SDKInfo(SDK_NAME, SDK_VERSION);
    private static final Logger logger = Logger.getLogger(AmazonMobileAnalytics.class);

    private static final PermissionValidator internetPermissionValidator = new PermissionValidator("android.permission.INTERNET");
    private static final PermissionValidator accessNetworkStatePermissionValidator = new PermissionValidator(
            "android.permission.ACCESS_NETWORK_STATE");

    private static final EncodingValidator encodingValidator = new EncodingValidator("UTF-8");
    private static final FileManagerValidator fileManagerValidator = new FileManagerValidator();

    private final AnalyticsContext context;
    private final InternalEventClient eventClient;
    private final InternalSessionClient sessionClient;

    /**
     * Create an {@link AmazonMobileAnalytics} object using the default
     * {@link AnalyticsOptions} values
     * 
     * Warning: Never create multiple instances of AmazonMobileAnalytics with the same
     * appNameSpace. Doing so is an error, and the behavior is undefined.
     * 
     * @param AWSCredentialsProvider
     *            The credentials provider AmazonMobileAnalytics should use when making
     *            requests to AWS
     * @param appContext
     *            The Android ApplicationContext
     * @param appNameSpace
     *            A unique string (preferably a UUID), which will be used as a
     *            key for a SharedPreferences object AmazonMobileAnalytics has
     *            exclusive access to, and as a directory name that
     *            AmazonMobileAnalytics can use to store events you record.
     * @return an {@link AmazonMobileAnalytics} instance
     */
    public AmazonMobileAnalytics(final AWSCredentialsProvider credentialsProvider, final Context appContext, final String appNameSpace)
            throws InitializationException {
        this(credentialsProvider, appContext, appNameSpace, new AnalyticsOptions());
    }

    /**
     * Create an {@link AmazonMobileAnalytics} object using the default
     * {@link AnalyticsOptions} values
     * 
     * Warning: Never create multiple instances of AmazonMobileAnalytics with the same
     * appNameSpace. Doing so is an error, and the behavior is undefined.
     * 
     * @param AWSCredentialsProvider
     *            The credentials provider AmazonMobileAnalytics should use when making
     *            requests to AWS
     * @param appContext
     *            The Android ApplicationContext
     * @param appNameSpace
     *            A unique string (preferably a UUID), which will be used as a
     *            key for a SharedPreferences object AmazonMobileAnalytics has
     *            exclusive access to, and as a directory name that
     *            AmazonMobileAnalytics can use to store events you record.
     * @param initCompletionCallback
     *            A callback to allow developers to handle custom logic after
     *            initialization but before the session begins
     * @return an {@link AmazonMobileAnalytics} instance
     * @throws InitializationException
     *             if any part of constructing the AmazonMobileAnalytics instance
     *             failed
     */
    public AmazonMobileAnalytics(final AWSCredentialsProvider credentialsProvider, final Context appContext, final String appNameSpace,
            final AnalyticsCallback<AmazonMobileAnalytics> initCompletionCallback) throws InitializationException {
        this(credentialsProvider, appContext, appNameSpace, new AnalyticsOptions(), initCompletionCallback);
    }

    /**
     * Create an {@link AmazonMobileAnalytics} object using the specified
     * {@link AnalyticsOptions} values
     * 
     * Warning: Never create multiple instances of AmazonMobileAnalytics with the same
     * appNameSpace. Doing so is an error, and the behavior is undefined.
     * 
     * @param AWSCredentialsProvider
     *            The credentials provider AmazonMobileAnalytics should use when making
     *            requests to AWS
     * @param appContext
     *            The Android ApplicationContext
     * @param appNameSpace
     *            A unique string (preferably a UUID), which will be used as a
     *            key for a SharedPreferences object AmazonMobileAnalytics has
     *            exclusive access to, and as a directory name that
     *            AmazonMobileAnalytics can use to store events you record.
     * @param options
     *            The {@link AnalyticsOptions} to use when creating the
     *            {@link AmazonMobileAnalytics} instance
     * @return an {@link AmazonMobileAnalytics} instance
     * @throws InitializationException
     *             if any part of constructing the AmazonMobileAnalytics instance
     *             failed
     */
    public AmazonMobileAnalytics(final AWSCredentialsProvider credentialsProvider, final Context appContext, final String appNameSpace,
            AnalyticsOptions options) throws InitializationException {
        this(credentialsProvider, appContext, appNameSpace, options, null);
    }

    /**
     * Create an {@link AmazonMobileAnalytics} object using the specified
     * {@link AnalyticsOptions} values
     * 
     * Warning: Never create multiple instances of AmazonMobileAnalytics with the same
     * appNameSpace. Doing so is an error, and the behavior is undefined.
     * 
     * @param AWSCredentialsProvider
     *            The credentials provider AmazonMobileAnalytics should use when making
     *            requests to AWS
     * @param appContext
     *            The Android ApplicationContext
     * @param appNameSpace
     *            A unique string (preferably a UUID), which will be used as a
     *            key for a SharedPreferences object AmazonMobileAnalytics has
     *            exclusive access to, and as a directory name that
     *            AmazonMobileAnalytics can use to store events you record.
     * @param options
     *            The {@link AnalyticsOptions} to use when creating the
     *            {@link AmazonMobileAnalytics} instance
     * @param initCompletionCallback
     *            A callback to allow developers to handle custom logic after
     *            initialization but before the session begins
     * @return an {@link AmazonMobileAnalytics} instance
     * @throws InitializationException
     *             if any part of constructing the AmazonMobileAnalytics instance
     *             failed
     */
    public AmazonMobileAnalytics(final AWSCredentialsProvider credentialsProvider, final Context appContext, final String appNameSpace,
            AnalyticsOptions options, final AnalyticsCallback<AmazonMobileAnalytics> initCompletionCallback) throws InitializationException {

        try {
            Preconditions.checkNotNull(credentialsProvider, "The ersClient provided must not be null");
            Preconditions.checkNotNull(appContext, "The application context provided must not be null");
            Preconditions.checkNotNull(options, "The options provided must not be null");
            Preconditions.checkNotNull(appNameSpace, "The namespace specified must not be null");

            AWSEventRecorderServiceClient ersClient = new AWSEventRecorderServiceClient(credentialsProvider,
                    options.getClientConfiguration().withUserAgent(USER_AGENT));

            Logger.tryInitialize();
            internetPermissionValidator.validate(appContext);
            accessNetworkStatePermissionValidator.validate(appContext);
            encodingValidator.validate();

            this.context = DefaultAnalyticsContext.newInstance(ersClient, appContext, appNameSpace, sdkInfo, options.getAllowWANDelivery());
            fileManagerValidator.validate(context);

            eventClient = DefaultEventClient.newInstance(context, options.getAllowEventCollection());

            sessionClient = DefaultSessionClient.newInstance(context, eventClient);
            context.getERSClient().addRequestHandler(new RequestTimingHandler(context.getSystem().getConnectivity(), eventClient));

            if (initCompletionCallback != null) {
                initCompletionCallback.onComplete(this);
            }

            sessionClient.startSession();

            logger.devi(String.format("Amazon Mobile Analytics SDK(%s) initialization successfully completed", SDK_VERSION));
        } catch (RuntimeException e) {
            logger.deve("Cannot initialize Amazon Mobile Analytics SDK", e);
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

}

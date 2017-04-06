/**
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.pinpoint;

import android.content.Context;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsClient;
import com.amazonaws.mobileconnectors.pinpoint.analytics.SessionClient;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.Preconditions;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.SDKInfo;
import com.amazonaws.mobileconnectors.pinpoint.internal.validate.EncodingValidator;
import com.amazonaws.mobileconnectors.pinpoint.internal.validate.PermissionValidator;
import com.amazonaws.mobileconnectors.pinpoint.targeting.TargetingClient;
import com.amazonaws.mobileconnectors.pinpoint.targeting.notification.GCMTokenRegisteredHandler;
import com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClient;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.pinpoint.AmazonPinpointClient;
import com.amazonaws.services.pinpointanalytics.AmazonPinpointAnalyticsClient;
import com.amazonaws.util.VersionInfoUtils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * PinpointManager is the entry point to Pinpoint Analytics and Targeting.
 * Each PinpointManager instance is associated with an
 * app ID which is used both as a key to get a SharedPreferences object that
 * PinpointManager can use, and as a directory name that
 * PinpointManager will use to store files about events that you record.
 * If you are developing a library, you should create a app ID for your library
 * so it does not collide with the app ID of app developer using your library.
 */
public class PinpointManager {
    private static final String SDK_VERSION = VersionInfoUtils.getVersion();
    private static final String SDK_NAME = "PinpointSDK";
    private static final SDKInfo sdkInfo = new SDKInfo(SDK_NAME, SDK_VERSION);
    private static final Log log =
            LogFactory.getLog(PinpointManager.class);

    private static final PermissionValidator internetPermissionValidator = new PermissionValidator(
            "android.permission.INTERNET");
    private static final PermissionValidator accessNetworkStatePermissionValidator = new PermissionValidator(
            "android.permission.ACCESS_NETWORK_STATE");

    private static final EncodingValidator encodingValidator = new EncodingValidator("UTF-8");

    private final PinpointContext pinpointContext;
    private final AnalyticsClient analyticsClient;
    private final SessionClient sessionClient;
    private final TargetingClient targetingClient;
    private final NotificationClient notificationClient;

    public PinpointManager(final PinpointConfiguration config){
        try {
            Preconditions.checkNotNull(config, "The config provided must not be null");
            final AWSCredentialsProvider credentialsProvider = config.getCredentialsProvider();
            final Context appContext = config.getAppContext();
            final String appId = config.getAppId();
            final Regions region = config.getRegion();
            final PinpointCallback<PinpointManager> initCompletionCallback = config.getInitCompletionCallback();

            Preconditions.checkNotNull(credentialsProvider,
                    "The credentialsProvider provided must not be null");
            Preconditions.checkNotNull(appContext,
                "The application pinpointContext provided must not be null");
            Preconditions.checkNotNull(appId, "The app ID specified must not be null");

            final AmazonPinpointAnalyticsClient analyticsServiceClient = new AmazonPinpointAnalyticsClient(
                    credentialsProvider,
                    config.getClientConfiguration());

            final AmazonPinpointClient targetingServiceClient = new AmazonPinpointClient(
                    credentialsProvider,
                    config.getClientConfiguration());

            internetPermissionValidator.validate(appContext);
            accessNetworkStatePermissionValidator.validate(appContext);
            encodingValidator.validate();

            this.pinpointContext = new PinpointContext(analyticsServiceClient, targetingServiceClient, appContext, appId,
                    sdkInfo, config);
            this.notificationClient = new NotificationClient(this.pinpointContext);
            this.pinpointContext.setNotificationClient(this.notificationClient);

            if (config.getEnableEvents()) {
                this.analyticsClient = new AnalyticsClient(this.pinpointContext);
                this.pinpointContext.setAnalyticsClient(this.analyticsClient);
                this.sessionClient = new SessionClient(this.pinpointContext);
                this.pinpointContext.setSessionClient(this.sessionClient);

            } else {
                this.analyticsClient = null;
                this.sessionClient = null;
            }

            if (config.getEnableTargeting()) {
                this.targetingClient = new TargetingClient(pinpointContext);
                this.pinpointContext.setTargetingClient(this.targetingClient);
                this.notificationClient.addGCMTokenRegisteredHandler(new GCMTokenRegisteredHandler() {
                    @Override
                    public void tokenRegistered(String deviceToken) {
                        PinpointManager.this.targetingClient.updateEndpointProfile();
                    }
                });
            } else {
                this.targetingClient = null;
            }

            if (initCompletionCallback != null) {
                initCompletionCallback.onComplete(this);
            }

            log.debug(String.format(
                    "Pinpoint SDK(%s) initialization successfully completed",
                    SDK_VERSION));
        } catch (final RuntimeException e) {
            log.debug("Cannot initialize Pinpoint SDK", e);
            throw new AmazonClientException(e.getLocalizedMessage());
        }
    }

    public PinpointContext getPinpointContext() {
        return pinpointContext;
    }

    /**
     * The {@link AnalyticsClient} is the primary class used to create, store, and
     * submit events from your application.
     *
     * @return an {@link AnalyticsClient}
     */
    public AnalyticsClient getAnalyticsClient() {
        return analyticsClient;
    }

    /**
     * The {@link TargetingClient} is the primary class used to update device information.
     *
     * @return an {@link TargetingClient}
     */
    public TargetingClient getTargetingClient() {
        return targetingClient;
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

    /**
     * The {@link NotificationClient} is the primary class used for Pinpoint Targeting
     *
     * @return an {@link NotificationClient}
     */
    public NotificationClient getNotificationClient() {
        return notificationClient;
    }
}

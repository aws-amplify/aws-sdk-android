/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
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
import com.amazonaws.mobileconnectors.pinpoint.targeting.notification.DeviceTokenRegisteredHandler;
import com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClient;
import com.amazonaws.mobileconnectors.pinpoint.targeting.notification.PinpointNotificationReceiver;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.pinpoint.AmazonPinpointClient;
import com.amazonaws.services.pinpoint.model.ChannelType;
import com.amazonaws.services.pinpointanalytics.AmazonPinpointAnalyticsClient;
import com.amazonaws.util.VersionInfoUtils;
import android.content.Context;

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
    // This value is decided by the Amazon Pinpoint Service
    private static final String SDK_NAME = "aws-sdk-android";
    private static final SDKInfo SDK_INFO = new SDKInfo(SDK_NAME, SDK_VERSION);
    private static final Log log = LogFactory.getLog(PinpointManager.class);
    private static final PermissionValidator INTERNET_PERMISSION_VALIDATOR = new PermissionValidator("android.permission.INTERNET");
    private static final PermissionValidator ACCESS_NETWORK_STATE_PERMISSION_VALIDATOR = new PermissionValidator(
        "android.permission.ACCESS_NETWORK_STATE");
    private static final EncodingValidator ENCODING_VALIDATOR = new EncodingValidator("UTF-8");

    private final PinpointContext pinpointContext;
    private final AnalyticsClient analyticsClient;
    private final SessionClient sessionClient;
    private final TargetingClient targetingClient;
    private final NotificationClient notificationClient;

    /**
     * Constructor.
     *
     * @param config {@link PinpointConfiguration} object.
     */
    public PinpointManager(final PinpointConfiguration config) {
        try {
            Preconditions.checkNotNull(config, "The config provided must not be null");
            final AWSCredentialsProvider credentialsProvider = config.getCredentialsProvider();
            final Context appContext = config.getAppContext();
            final String appId = config.getAppId();
            final Regions region = config.getRegion();
            final ChannelType channelType = config.getChannelType();
            final PinpointCallback<PinpointManager> initCompletionCallback = config.getInitCompletionCallback();

            Preconditions.checkNotNull(credentialsProvider, "The credentialsProvider provided must not be null");
            Preconditions.checkNotNull(appContext, "The application pinpointContext provided must not be null");
            Preconditions.checkNotNull(appId, "The app ID specified must not be null");

            final AmazonPinpointAnalyticsClient analyticsServiceClient = new AmazonPinpointAnalyticsClient(credentialsProvider, config.getClientConfiguration());

            final AmazonPinpointClient targetingServiceClient = new AmazonPinpointClient(credentialsProvider, config.getClientConfiguration());

            INTERNET_PERMISSION_VALIDATOR.validate(appContext);
            ACCESS_NETWORK_STATE_PERMISSION_VALIDATOR.validate(appContext);
            ENCODING_VALIDATOR.validate();

            this.pinpointContext = new PinpointContext(analyticsServiceClient, targetingServiceClient, appContext, appId, SDK_INFO, config);
            this.notificationClient = NotificationClient.createClient(this.pinpointContext, channelType);
            this.pinpointContext.setNotificationClient(this.notificationClient);
            PinpointNotificationReceiver.setNotificationClient(this.notificationClient);

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
                if (config.getExecutor() != null) {
                    this.targetingClient = new TargetingClient(pinpointContext, config.getExecutor());
                } else {
                    this.targetingClient = new TargetingClient(pinpointContext);
                }

                this.pinpointContext.setTargetingClient(this.targetingClient);
                this.notificationClient.addDeviceTokenRegisteredHandler(new DeviceTokenRegisteredHandler() {

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
            //override default endpoint.
            if (region != null && !"us-east-1".equals(region.getName())) {
                this.pinpointContext.getPinpointServiceClient().setEndpoint(String.format("pinpoint.%s.amazonaws.com", region.getName()));
            }

            log.debug(String.format("Pinpoint SDK(%s) initialization successfully completed", SDK_VERSION));
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

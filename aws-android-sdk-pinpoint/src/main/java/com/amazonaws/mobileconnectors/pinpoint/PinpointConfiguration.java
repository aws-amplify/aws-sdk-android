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
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;

/**
 * The PinpointConfiguration class allows developers to configure the Pinpoint SDK.
 *
 */
public class PinpointConfiguration {

    private Context context;
    private String appId;
    private Regions region;
    private boolean enableEvents = true;
    private boolean enableTargeting = true;
    private ClientConfiguration clientConfiguration;
    private AWSCredentialsProvider credentialsProvider;
    private PinpointCallback<PinpointManager> initCompletionCallback;

    /**
     * Create an {@link PinpointConfiguration} object with the specified parameters.
     */
    public PinpointConfiguration(final Context context, final String appId, final Regions region, final AWSCredentialsProvider credentialsProvider){
        this.clientConfiguration = new ClientConfiguration();
        this.context = context;
        this.appId = appId;
        this.credentialsProvider = credentialsProvider;
        this.region = region;
    }

    /**
     * Sets the client configuration this client will use when making request
     *
     * @return the current PinpointConfiguration instance
     */
    public PinpointConfiguration withClientConfiguration(ClientConfiguration clientConfig) {
        this.clientConfiguration = new ClientConfiguration(clientConfig);
        return this;
    }

    /**
     * Gets the client configuration this client will use when making requests.
     * If none was supplied to the constructor this will return the default
     * client configuration.
     *
     * @return The ClientConfiguration used for making requests
     */
    public ClientConfiguration getClientConfiguration() {
        return this.clientConfiguration;
    }

    /**
     * Sets whether or not event collection is enabled for the SDK.
     *
     * @param allowEventCollection true if event collection should be allowed, otherwise false.
     * @return the current PinpointConfiguration instance
     */
    public PinpointConfiguration withAllowsEventCollection(boolean allowEventCollection) {
        this.enableEvents = allowEventCollection;
        return this;
    }

    /**
     * Indicates whether or not event collection is enabled for the SDK.
     *
     * @return true/false indicating if event collection is enabled
     */
    public boolean getEnableEvents() {
        return this.enableEvents;
    }

    /**
     * Indicates whether or not endpoint registration for Pinpoint is enabled for the SDK.
     *
     * @return true/false indicating if Pinpoint is enabled
     */
    public boolean getEnableTargeting() {
        return this.enableTargeting;
    }

    /**
     * Enables pinpoint and endpoint registration.
     *
     * @param enablePinpoint true if Pinpoint to be enabled. Defaults to false.
     * @return the current PinpointConfiguration instance
     */
    public PinpointConfiguration withEnablePinpoint(boolean enablePinpoint) {
        this.enableTargeting = enablePinpoint;
        return this;
    }

    /**
     * The credentials provider used in order to authenticate.
     *
     * @return the AWSCredentialsProvider
     */
    public AWSCredentialsProvider getCredentialsProvider() {
        return this.credentialsProvider;
    }

    /**
     * Please provide a CognitoCredentialsProvider in order to authenticate.
     *
     * @return the current PinpointConfiguration instance
     */
    public PinpointConfiguration withCredentialsProvider(final AWSCredentialsProvider credentialsProvider) {
        this.credentialsProvider = credentialsProvider;
        return this;
    }

    /**
     * The Android Context. Interface to global information about an application environment.
     * This is an abstract class whose implementation is provided by the Android system.
     * It allows access to application-specific resources and classes, as well as up-calls for application-level
     * operations such as launching activities, broadcasting and receiving intents, etc.
     *
     * @return the Android Context object
     */
    public Context getAppContext() {
        return this.context;
    }

    /**
     * The Android Context. See https://developer.android.com/reference/android/content/Context.html
     *
     * @return the current PinpointConfiguration instance
     */
    public PinpointConfiguration withAppContext(final Context context) {
        this.context = context;
        return this;
    }

    /**
     * The Pinpoint AppId
     *
     * @return the Pinpoint AppId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * The Pinpoint AppId
     *
     * @return the current PinpointConfiguration instance
     */
    public PinpointConfiguration withAppId(final String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * The AWS Region configured
     *
     * @return the Region
     */
    public Regions getRegion() {
        return region;
    }

    /**
     * The AWS Region for Pinpoint
     *
     * @return the current PinpointConfiguration instance
     */
    public PinpointConfiguration withRegion(final Regions region) {
        this.region = region;
        return this;
    }

    /**
     * The callback to be called after initialization is complete
     *
     * @return the callback
     */
    public PinpointCallback<PinpointManager> getInitCompletionCallback() {
        return initCompletionCallback;
    }

    /**
     * The callback to be called after initialization is complete
     *
     * @return the current PinpointConfiguration instance
     */
    public PinpointConfiguration withInitCompletionCallback(final PinpointCallback<PinpointManager> initCompletionCallback) {
        this.initCompletionCallback = initCompletionCallback;
        return this;
    }
}

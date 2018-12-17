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

import com.amazonaws.ClientConfiguration;

/**
 * The AnalyticsConfig class allows developers to configure out Amazon Mobile
 * Analytics behaves. It includes enabling/disabling the sending of events, so
 * developers can easily develop applications that allow end-users to
 * opt-in/opt-out of analytics collections. By default it allows events to only
 * be sent over WIFI, but can be set to allow events to be sent over the mobile
 * network. Finally developers can set any networking behavior that a low-level
 * AWS client can change through a ClientConfiguration object.
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0 Please use AWS Pinpoint SDK for Android along with AWS Pinpoint service instead.
 */
@Deprecated
public class AnalyticsConfig {

    private boolean allowEventCollection = true;
    private boolean allowWANDelivery = true;
    private ClientConfiguration clientConfiguration;

    /**
     * Create an {@link AnalyticsConfig} object set to defaults. Which allows
     * event collection and has WAN delivery set to true
     */
    public AnalyticsConfig() {
        this(new ClientConfiguration());
    }

    /**
     * Creates an {@link AnalyticsConfig} object with the specified client
     * configuration configuration
     *
     * @param clientConfiguration
     */
    public AnalyticsConfig(ClientConfiguration clientConfiguration) {
        if (clientConfiguration == null) {
            throw new IllegalArgumentException();
        } else {
            this.clientConfiguration = new ClientConfiguration(clientConfiguration);
        }
    }

    /**
     * Sets the client configuration this client will use when making request
     *
     * @return AnalyticsConfig the current instance
     */
    public AnalyticsConfig withClientConfiguration(ClientConfiguration clientConfig) {
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
     * @param allowEventCollection
     * @return AnalyticsConfig the current instance
     */
    public AnalyticsConfig withAllowsEventCollection(boolean allowEventCollection) {
        this.allowEventCollection = allowEventCollection;
        return this;
    }

    /**
     * Indicates whether or not event collection is enabled for the SDK.
     *
     * @return true/false indicating if event collection is enabled
     */
    public boolean getAllowEventCollection() {
        return this.allowEventCollection;
    }

    /**
     * Sets whether or not events will be sent to the Amazon Mobile Analytics
     * website over WAN (mobile) networks.
     *
     * @param allowWANDelivery
     * @return AnalyticsConfig the current instance
     */
    public AnalyticsConfig withAllowsWANDelivery(boolean allowWANDelivery) {
        this.allowWANDelivery = allowWANDelivery;
        return this;
    }

    /**
     * Indicates whether or not events will be sent to the Amazon Mobile
     * Analytics website over WAN (mobile) networks.
     *
     * @return true indicates events will be delivered via WAN or WIFI networks.
     *         false indicates events will be delivered via WIFI network only.
     */
    public boolean getAllowWANDelivery() {
        return this.allowWANDelivery;
    }
}

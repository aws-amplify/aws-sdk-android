/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.geo.tracker;

import androidx.annotation.NonNull;

/**
 * Configuration options for tracking.
 */
public class TrackingOptions {
    private String customDeviceId;
    private Long retrieveLocationFrequency;
    private Long emitLocationFrequency;

    protected TrackingOptions(
            String customDeviceId,
            Long retrieveLocationFrequency,
            Long emitLocationFrequency
    ) {
        this.customDeviceId = customDeviceId;
        this.retrieveLocationFrequency = retrieveLocationFrequency;
        this.emitLocationFrequency = emitLocationFrequency;
    }


    /**
     * Returns the custom ID chosen to identify this device on the chosen tracker resource.
     * @return the custom ID chosen to identify this device on the chosen tracker resource.
     */
    public String getCustomDeviceId() {
        return customDeviceId;
    }

    /**
     * Returns the frequency in milliseconds to get the current device location.
     * @return the frequency in milliseconds to get the current device location.
     */
    public Long getRetrieveLocationFrequency() {
        return retrieveLocationFrequency;
    }

    /**
     * Returns the frequency in milliseconds to publish a batch of locations to Amazon Location Service.
     * @return the frequency in milliseconds to publish a batch of locations to Amazon Location Service.
     */
    public Long getEmitLocationFrequency() {
        return emitLocationFrequency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String customDeviceId;
        private Long retrieveLocationFrequency;
        private Long emitLocationFrequency;

        /**
         * Sets the custom ID chosen to identify this device on the chosen tracker resource.
         * @param customDeviceId the custom ID chosen to identify this device on the chosen tracker resource.
         * @return An instance of the builder object.
         */
        @NonNull
        public Builder customDeviceId(@NonNull String customDeviceId) {
            this.customDeviceId = customDeviceId;
            return this;
        }

        /**
         * Sets the frequency in milliseconds to get the current device location.
         * @param retrieveLocationFrequency the frequency in milliseconds to get the current device location.
         * @return An instance of the builder object.
         */
        @NonNull
        public Builder retrieveLocationFrequency(@NonNull Long retrieveLocationFrequency) {
            this.retrieveLocationFrequency = retrieveLocationFrequency;
            return this;
        }

        /**
         * Sets the frequency in milliseconds to publish a batch of locations to Amazon Location Service.
         * @param emitLocationFrequency the frequency in milliseconds to publish a batch of locations.
         * @return An instance of the builder object.
         */
        @NonNull
        public Builder emitLocationFrequency(@NonNull Long emitLocationFrequency) {
            this.emitLocationFrequency = emitLocationFrequency;
            return this;
        }

        /**
         * Builds a new instance of TrackingOptions.
         * @return a new instance of TrackingOptions.
         */
        @NonNull
        public TrackingOptions build() {
            return new TrackingOptions(customDeviceId, retrieveLocationFrequency, emitLocationFrequency);
        }
    }
}

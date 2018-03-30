/**
 * Copyright 2017-2018 Amazon.com,
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

package com.amazonaws.kinesisvideo.client;

import com.amazonaws.kinesisvideo.auth.KinesisVideoCredentialsProvider;
import com.amazonaws.kinesisvideo.common.logging.OutputChannel;
import com.amazonaws.kinesisvideo.producer.StorageCallbacks;

/**
 * Configuration for KinesisVideoClient.
 */
public final class KinesisVideoClientConfiguration {
    private final String region;
    private final KinesisVideoCredentialsProvider credentialsProvider;
    private final StorageCallbacks storageCallbacks;
    private final String endpoint;
    private final OutputChannel logChannel;

    private KinesisVideoClientConfiguration(final Builder builder) {
        this.region = builder.region;
        this.credentialsProvider = builder.credentialsProvider;
        this.storageCallbacks = builder.storageCallbacks;
        this.endpoint = builder.endpoint;
        this.logChannel = builder.logChannel;
    }

    public static Builder builder() {
        return new Builder();
    }

    private static void sanitizeBuilder(final Builder builder) {
        final String region = builder.region;
        final String endpoint = builder.endpoint;

        if (region == null && endpoint == null) {
            builder.withRegion(KinesisVideoClientConfigurationDefaults.US_WEST_2);
            builder.withEndpoint(KinesisVideoClientConfigurationDefaults.getControlPlaneEndpoint(builder.region));
        }

        if (region == null) {
            // TODO: determine from endpoint?
            builder.withRegion(KinesisVideoClientConfigurationDefaults.US_WEST_2);
        }

        if (endpoint == null) {
            builder.withEndpoint(constructEndpoint(region));
        }
    }

    private static String constructEndpoint(final String region) {
        return KinesisVideoClientConfigurationDefaults.getControlPlaneEndpoint(region);
    }

    public String getServiceName() {
        return "kinesisvideo";
    }

    public String getRegion() {
        return this.region;
    }

    public KinesisVideoCredentialsProvider getCredentialsProvider() {
        return this.credentialsProvider;
    }

    public StorageCallbacks getStorageCallbacks() {
        return this.storageCallbacks;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public OutputChannel getLogChannel() {
        return this.logChannel;
    }

    public static class Builder {
        private String region;
        private KinesisVideoCredentialsProvider credentialsProvider;
        private StorageCallbacks storageCallbacks =
                KinesisVideoClientConfigurationDefaults.NO_OP_STORAGE_CALLBACKS;
        private String endpoint;
        private OutputChannel logChannel;

        public Builder withRegion(final String region) {
            this.region = region;
            return this;
        }

        public Builder withCredentialsProvider(final KinesisVideoCredentialsProvider credentialsProvider) {
            this.credentialsProvider = credentialsProvider;
            return this;
        }

        public Builder withStorageCallbacks(final StorageCallbacks storageCallbacks) {
            this.storageCallbacks = storageCallbacks;
            return this;
        }

        public Builder withEndpoint(final String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder withLogChannel(final OutputChannel logChannel) {
            this.logChannel = logChannel;
            return this;
        }

        public KinesisVideoClientConfiguration build() {
            sanitizeBuilder(this);
            return new KinesisVideoClientConfiguration(this);
        }
    }
}

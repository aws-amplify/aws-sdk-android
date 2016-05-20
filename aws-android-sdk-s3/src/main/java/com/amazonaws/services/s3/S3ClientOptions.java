/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3;

/**
 * S3 client configuration options such as the request access style.
 */
public class S3ClientOptions {

    /** The default setting for use of path-style access */
    public static final boolean DEFAULT_PATH_STYLE_ACCESS = false;
    /** S3 accelerate is by default not enabled */
    public static final boolean DEFAULT_ACCELERATE_MODE_ENABLED = false;

    /** Flag for use of path-style access */
    private boolean pathStyleAccess;
    private boolean accelerateModeEnabled;

    /**
     * @return a new S3ClientOptions builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private boolean pathStyleAccess = DEFAULT_PATH_STYLE_ACCESS;
        private boolean accelerateModeEnabled = DEFAULT_ACCELERATE_MODE_ENABLED;

        private Builder() {
        }

        public S3ClientOptions build() {
            return new S3ClientOptions(pathStyleAccess, accelerateModeEnabled);
        }

        /**
         * <p>
         * Configures the client to use path-style access for all requests.
         * </p>
         * <p>
         * Amazon S3 supports virtual-hosted-style and path-style access in all
         * Regions. The path-style syntax, however, requires that you use the
         * region-specific endpoint when attempting to access a bucket.
         * </p>
         * <p>
         * The default behaviour is to detect which access style to use based on
         * the configured endpoint (an IP will result in path-style access) and
         * the bucket being accessed (some buckets are not valid DNS names).
         * Setting this flag will result in path-style access being used for all
         * requests.
         * </p>
         *
         * @param pathStyleAccess True to always use path-style access.
         * @return this Builder instance that can be used for method chaining
         */
        public Builder setPathStyleAccess(boolean pathStyleAccess) {
            this.pathStyleAccess = pathStyleAccess;
            return this;
        }

        /**
         * <p>
         * Configures the client to use S3 accelerate endpoint for all requests.
         * </p>
         * <p>
         * A bucket by default cannot be accessed in accelerate mode. If you
         * wish to do so, you need to enable the accelerate configuration for
         * the bucket in advance.
         * </p>
         *
         * @see {@link AmazonS3#setBucketAccelerateConfiguration(com.amazonaws.services.s3.model.SetBucketAccelerateConfigurationRequest)}
         */
        public Builder setAccelerateModeEnabled(boolean accelerateModeEnabled) {
            this.accelerateModeEnabled = accelerateModeEnabled;
            return this;
        }
    }

    /**
     * @deprecated Use {@link S3ClientOptions#builder()} to build new
     *             S3ClientOptions instead.
     */
    @Deprecated
    public S3ClientOptions() {
    }

    /**
     * @deprecated Will be removed once S3ClientOptions is made an immutable
     *             class.
     */
    @Deprecated
    public S3ClientOptions(S3ClientOptions other) {
        this.pathStyleAccess = other.pathStyleAccess;
        this.accelerateModeEnabled = other.accelerateModeEnabled;
    }

    private S3ClientOptions(boolean pathStyleAccess, boolean accelerateModeEnabled) {
        this.pathStyleAccess = pathStyleAccess;
        this.accelerateModeEnabled = accelerateModeEnabled;
    }

    /**
     * <p>
     * Returns whether the client uses path-style access for all requests.
     * </p>
     * <p>
     * Amazon S3 supports virtual-hosted-style and path-style access in all
     * Regions. The path-style syntax, however, requires that you use the
     * region-specific endpoint when attempting to access a bucket.
     * </p>
     * <p>
     * The default behaviour is to detect which access style to use based on the
     * configured endpoint (an IP will result in path-style access) and the
     * bucket being accessed (some buckets are not valid DNS names). Setting
     * this flag will result in path-style access being used for all requests.
     * </p>
     *
     * @return True is the client should always use path-style access
     */
    public boolean isPathStyleAccess() {
        return pathStyleAccess;
    }

    /**
     * <p>
     * Returns whether the client has enabled accelerate mode for getting and
     * putting objects.
     * </p>
     * <p>
     * The default behavior is to disable accelerate mode for any operations
     * (GET, PUT, DELETE). You need to call
     * {@link com.amazonaws.services.s3.AmazonS3Client#setBucketAccelerateConfiguration(com.amazonaws.services.s3.model.SetBucketAccelerateConfigurationRequest)}
     * first to use this feature.
     * </p>
     *
     * @return True if accelerate mode is enabled.
     */
    public boolean isAccelerateModeEnabled() {
        return accelerateModeEnabled;
    }

    /**
     * <p>
     * Configures the client to use path-style access for all requests.
     * </p>
     * <p>
     * Amazon S3 supports virtual-hosted-style and path-style access in all
     * Regions. The path-style syntax, however, requires that you use the
     * region-specific endpoint when attempting to access a bucket.
     * </p>
     * <p>
     * The default behaviour is to detect which access style to use based on the
     * configured endpoint (an IP will result in path-style access) and the
     * bucket being accessed (some buckets are not valid DNS names). Setting
     * this flag will result in path-style access being used for all requests.
     * </p>
     *
     * @param pathStyleAccess True to always use path-style access.
     */
    @Deprecated
    public void setPathStyleAccess(boolean pathStyleAccess) {
        this.pathStyleAccess = pathStyleAccess;
    }

    /**
     * <p>
     * Configures the client to use path-style access for all requests.
     * </p>
     * <p>
     * Amazon S3 supports virtual-hosted-style and path-style access in all
     * Regions. The path-style syntax, however, requires that you use the
     * region-specific endpoint when attempting to access a bucket.
     * </p>
     * <p>
     * The default behaviour is to detect which access style to use based on the
     * configured endpoint (an IP will result in path-style access) and the
     * bucket being accessed (some buckets are not valid DNS names). Setting
     * this flag will result in path-style access being used for all requests.
     * </p>
     *
     * @param pathStyleAccess True to always use path-style access.
     * @return The updated S3ClientOptions object with the new path-style access
     *         setting.
     */
    @Deprecated
    public S3ClientOptions withPathStyleAccess(boolean pathStyleAccess) {
        setPathStyleAccess(pathStyleAccess);
        return this;
    }

}

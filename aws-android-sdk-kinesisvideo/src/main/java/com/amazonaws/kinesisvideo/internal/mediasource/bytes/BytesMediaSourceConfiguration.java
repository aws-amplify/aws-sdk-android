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

package com.amazonaws.kinesisvideo.internal.mediasource.bytes;

import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceConfiguration;

public class BytesMediaSourceConfiguration implements MediaSourceConfiguration {

    private static final String MEDIA_SOURCE_TYPE = "BytesMediaSource";
    private static final String MEDIA_SOURCE_DESCRIPTION = "Generates bytes in specific "
            + "configuration. Useful for debugging";

    public static class Builder
            implements MediaSourceConfiguration.Builder<BytesMediaSourceConfiguration> {

        private int fps;
        private long retentionPeriodInHours;

        public Builder withFps(final int fps) {
            this.fps = fps;
            return this;
        }

        public Builder withRetentionPeriodInHours(final long retentionPeriodInHours) {
            this.retentionPeriodInHours = retentionPeriodInHours;
            return this;
        }

        @Override
        public BytesMediaSourceConfiguration build() {
            return new BytesMediaSourceConfiguration(this);
        }
    }

    private final Builder mBuilder;

    public BytesMediaSourceConfiguration(final Builder builder) {
        mBuilder = builder;
    }

    public int getFps() {
        return mBuilder.fps;
    }

    public long getRetentionPeriodInHours() {
        return mBuilder.retentionPeriodInHours;
    }

    @Override
    public String getMediaSourceType() {
        return MEDIA_SOURCE_TYPE;
    }

    @Override
    public String getMediaSourceDescription() {
        return MEDIA_SOURCE_DESCRIPTION;
    }
}

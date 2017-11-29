/**
 * Copyright 2017-2017 Amazon.com,
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

package com.amazonaws.kinesisvideo.mediasource.bytes;

import com.amazonaws.kinesisvideo.client.mediasource.MediaSourceConfiguration;

public class BytesMediaSourceConfiguration implements MediaSourceConfiguration {

    private static final String MEDIA_SOURCE_TYPE = "BytesMediaSource";
    private static final String MEDIA_SOURCE_DESCRIPTION = "Generates bytes in specific "
            + "configuration. Useful for debugging";

    public static class Builder
            implements MediaSourceConfiguration.Builder<BytesMediaSourceConfiguration> {

        private int fps;

        public Builder withFps(final int fps) {
            this.fps = fps;
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

    @Override
    public String getMediaSourceType() {
        return null;
    }

    @Override
    public String getMediaSourceDescription() {
        return null;
    }
}

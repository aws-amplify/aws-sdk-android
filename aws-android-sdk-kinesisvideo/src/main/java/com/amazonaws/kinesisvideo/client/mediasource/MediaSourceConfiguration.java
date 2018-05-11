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

package com.amazonaws.kinesisvideo.client.mediasource;

/**
 * Configuration for the media source. Each concrete media source
 * has different configuration implementation. E.g. for camera or microphone
 */
public interface MediaSourceConfiguration {

    interface Builder<T extends MediaSourceConfiguration> {
        T build();
    }

    /**
     * @return type of the media source, e.g. "AndroidCamera"
     */
    String getMediaSourceType();

    /**
     * @return description of the media source, e.g. "AndroidCamera"
     */
    String getMediaSourceDescription();
}

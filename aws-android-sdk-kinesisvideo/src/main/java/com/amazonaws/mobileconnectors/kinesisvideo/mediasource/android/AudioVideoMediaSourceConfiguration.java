// /**
//  * Copyright 2017-2018 Amazon.com,
//  * Inc. or its affiliates. All Rights Reserved.
//  *
//  * Licensed under the Amazon Software License (the "License").
//  * You may not use this file except in compliance with the
//  * License. A copy of the License is located at
//  *
//  *     http://aws.amazon.com/asl/
//  *
//  * or in the "license" file accompanying this file. This file is
//  * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
//  * CONDITIONS OF ANY KIND, express or implied. See the License
//  * for the specific language governing permissions and
//  * limitations under the License.
//  */

package com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android;

import android.os.Parcelable;

/**
 * Parcelable wrapper for CameraMediaSourceConfiguration. Allows passing
* the configuration in bundles
*/
public class AudioVideoMediaSourceConfiguration extends AndroidCameraMediaSourceConfiguration implements Parcelable {
    public static final String MEDIA_SOURCE_TYPE = "AudioVideoSource";

    public AudioVideoMediaSourceConfiguration(final Builder builder) {
        super(builder);
    }

    @Override
    public String getMediaSourceType() {
        return MEDIA_SOURCE_TYPE;
    }
}

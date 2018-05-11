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

package com.amazonaws.mobileconnectors.kinesisvideo.data;

import android.media.MediaFormat;

public enum MimeType {
    H264("h264", MediaFormat.MIMETYPE_VIDEO_AVC),
    H265("h265", MediaFormat.MIMETYPE_VIDEO_HEVC),
    VP8("vp8", MediaFormat.MIMETYPE_VIDEO_VP8),
    VP9("vp9", MediaFormat.MIMETYPE_VIDEO_VP9);

    private final String mMimeType;
    private final String mDescription;

    MimeType(final String description,
                     final String mimeType) {
        mDescription = description;
        mMimeType = mimeType;
    }

    public String getMimeType() {
        return mMimeType;
    }

    public String getDescription() {
        return mDescription;
    }

    @Override
    public String toString() {
        return mDescription + " (" + mMimeType + ")";
    }
}

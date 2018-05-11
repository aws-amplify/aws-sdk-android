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

package com.amazonaws.mobileconnectors.kinesisvideo.encoding;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MuxerWrapper {
    private static final String TAG = MuxerWrapper.class.getSimpleName();
    private static final String OUTPUT_PATH = "/sdcard/";
    private static final String WEBM_EXTENSION = ".webm";
    private static final String MP4_EXTENSION = ".mp4";
    private static final String FILE_NAME_PREFIX = "muxer-output-";
    private static final String FILE_TIMESTAMP_FORMAT = "yyyy-MM-dd_HH-mm-ss";
    private static final DateFormat DATE_FORMAT_NOW = new SimpleDateFormat(FILE_TIMESTAMP_FORMAT);

    private final String mMimeType;
    private MediaMuxer mMediaMuxer;
    private int mTrackIndex;

    public MuxerWrapper(final MediaCodec encoder) {
        mMimeType = encoder.getOutputFormat().getString(MediaFormat.KEY_MIME);
    }

    public synchronized void start(final MediaCodec encoder) {
        if (mMediaMuxer != null) {
            Log.w(TAG, "starting muxer before stopping previous one");
            stop();
        }

        final MediaFormat outputFormat = encoder.getOutputFormat();
        mMediaMuxer = createMuxer();
        mTrackIndex = mMediaMuxer.addTrack(outputFormat);
        mMediaMuxer.start();
    }

    private MediaMuxer createMuxer() {
        try {
            return new MediaMuxer(getOutputPath(), getMediaFormat());
        } catch (final IOException e) {
            throw new RuntimeException("unable to create muxer", e);
        }
    }

    private String getOutputPath() {
        final String extension = getOutputFileExtension();
        final String timestamp = DATE_FORMAT_NOW.format(new Date());

        final String outputFullPath = new StringBuilder()
                .append(OUTPUT_PATH)
                .append(FILE_NAME_PREFIX)
                .append(timestamp)
                .append(extension)
                .toString();

        Log.d(TAG, "Using '" + outputFullPath + "' for output");
        return outputFullPath;
    }

    private String getOutputFileExtension() {
        if (MediaFormat.MIMETYPE_VIDEO_VP8.equals(mMimeType)
            || MediaFormat.MIMETYPE_VIDEO_VP9.equals(mMimeType)) {
            return WEBM_EXTENSION;
        } else if (MediaFormat.MIMETYPE_VIDEO_AVC.equals(mMimeType)) {
            return MP4_EXTENSION;
        } else {
            throw new RuntimeException("unsupported media format '" + mMimeType + "'."
                        + " only AVC(h264) and vp8/vp9 are supported");
        }
    }

    private int getMediaFormat() {
        if (MediaFormat.MIMETYPE_VIDEO_VP8.equals(mMimeType)
            || MediaFormat.MIMETYPE_VIDEO_VP9.equals(mMimeType)) {
            return MediaMuxer.OutputFormat.MUXER_OUTPUT_WEBM;
        } else if (MediaFormat.MIMETYPE_VIDEO_AVC.equals(mMimeType)) {
            return MediaMuxer.OutputFormat.MUXER_OUTPUT_MPEG_4;
        } else {
            throw new RuntimeException("unsupported media format '" + mMimeType + "'."
                        + " only AVC(h264) and vp8/vp9 are supported");
        }
    }

    public void writeData(final MediaCodec.BufferInfo bufferInfo, final ByteBuffer encodedData) {
        if (mMediaMuxer == null) {
            throw new IllegalStateException("writing data before starting the muxer");
        }

        mMediaMuxer.writeSampleData(mTrackIndex, encodedData, bufferInfo);
    }

    public synchronized void stop() {
        mMediaMuxer.stop();
        mMediaMuxer.release();
        mMediaMuxer = null;
    }
}

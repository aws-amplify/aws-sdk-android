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

import android.media.Image;
import android.media.MediaCodec;
import android.util.Log;

import com.amazonaws.kinesisvideo.client.mediasource.AbstractMediaSourceConfiguration;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;
import com.amazonaws.mobileconnectors.kinesisvideo.util.FrameUtility;

import java.nio.ByteBuffer;

/**
 * Wrapper class around MediaCodec. It accepts raw frame data in YUV420 format as an input, sends it
 * to the encoder, and notifies the listeners when encoding is complete. All happens on the same thread.
 */
public class EncoderWrapper {
    private static final String TAG = EncoderWrapper.class.getSimpleName();
    private static final int TIMEOUT_USEC = 10000;
    private final AbstractMediaSourceConfiguration mMediaSourceConfiguration;
    private MediaCodec mEncoder;
    private EncoderFrameSubmitter mEncoderFrameSubmitter;
    private long mLastRecordedFrameTimestamp = 0;
    private MediaCodec.BufferInfo mBufferInfo;
    private CodecPrivateDataAvailableListener mCodecPrivateDataListener;
    private FrameAvailableListener mFrameAvailableListener;
    private boolean mIsStopped = false;
    private int mFrameIndex;
    private long mFragmentStart = 0;

    /**
     * Interface for frame listeners.
     */
    public interface FrameAvailableListener {
        /**
         * Called when a new frame is available.
         * @param frame The new frame.
         */
        void onFrameAvailable(final KinesisVideoFrame frame);
    }

    /**
     * Interface for codec private data listeners.
     */
    public interface CodecPrivateDataAvailableListener {
        /**
         * Called when new codec private data is available.
         * @param privateData
         */
        void onCodecPrivateDataAvailable(final byte[] privateData);
    }

    /**
     * This constructor creates a new EncoderWrapper using the given MediaSourceConfiguration.
     * @param mediaSourceConfiguration MediaSourceConfiguration to use.
     */
    public EncoderWrapper(final AbstractMediaSourceConfiguration mediaSourceConfiguration) {
        mMediaSourceConfiguration = mediaSourceConfiguration;
        initEncoder();
    }

    /**
     * Helper fucntion to initialize the EncoderWrapper using the MediaSourceConfiguration.
     * It creates, configures and starts an encoder.
     */
    private void initEncoder() {
        mBufferInfo = new MediaCodec.BufferInfo();
        mEncoder = EncoderFactory.createConfiguredEncoder(mMediaSourceConfiguration);
        mEncoderFrameSubmitter = new EncoderFrameSubmitter(mEncoder);
        mEncoder.start();
    }

    /**
     * Sets a listener for codec private data.
     * @param listener The listener object.
     */
    public void setCodecPrivateDataAvailableListener(final CodecPrivateDataAvailableListener listener) {
        mCodecPrivateDataListener = listener;
    }

    /**
     * Sets a listener for new frames.
     * @param listener The listener object.
     */
    public void setEncodedFrameAvailableListener(final FrameAvailableListener listener) {
        mFrameAvailableListener = listener;
    }

    /**
     * Encodes a frame using the available encoder, and processes the output of the encoder as well.
     * @param frameImageYUV420 The frame to be encoded.
     * @param endOfStream True if this is the last frame.
     */
    public void encodeFrame(final Image frameImageYUV420, final boolean endOfStream) {
        // Edge case.
        if (mIsStopped) {
            Log.w(TAG, "received a frame to encode after already stopped. returning");
            return;
        }

        // Submit the frame to encoder using EncoderFrameSubmitter.
        Log.d(TAG, "encoding frame" + threadId());
        mEncoderFrameSubmitter.submitFrameToEncoder(frameImageYUV420, endOfStream);
        Log.d(TAG, "frame sent to encoder" + threadId());

        // Process output from encoder.
        getDataFromEncoder(endOfStream);
        Log.d(TAG, "frame encoded" + threadId());
    }

    /**
     * Deques an output buffer from the encoder and processes it based on the return value from dequeueOutputBuffer.
     * @param endOfStream True if the stream has ended.
     */
    private void getDataFromEncoder(final boolean endOfStream) {
        boolean stopReadingFromEncoder = false;
        while(!stopReadingFromEncoder) {
            mBufferInfo = new MediaCodec.BufferInfo();
            int outputBufferId = mEncoder.dequeueOutputBuffer(mBufferInfo, TIMEOUT_USEC);
            switch (outputBufferId) {
                case MediaCodec.INFO_TRY_AGAIN_LATER:
                    if (endOfStream) {
                        Log.d(TAG, "no output available, await end of stream");
                        sleep(15);
                    }
                    stopReadingFromEncoder = true;
                    break;

                case MediaCodec.INFO_OUTPUT_FORMAT_CHANGED:
                    break;

                default:
                    if (outputBufferId < 0) {
                        Log.w(TAG, "unexpected encoder output buffer id: " + outputBufferId);
                        break;
                    }

                    // Process output buffer.
                    processEncoderOutputBuffer(outputBufferId);

                    // Handle end of stream.
                    if (isEndOfStream()) {
                        stopReadingFromEncoder = true;
                    }

                    // Break after processing one buffer.
                    break;
            }
        }
    }

    /**
     * Process the given output buffer from the encoder.
     * @param outputBufferId Output buffer ID.
     */
    private void processEncoderOutputBuffer(final int outputBufferId) {
        // Edge case.
        if (mBufferInfo.size == 0) {
            Log.w(TAG, "empty buffer " + outputBufferId);
            mEncoder.releaseOutputBuffer(outputBufferId, false);
            return;
        }

        // Read output buffer contents.
        final ByteBuffer encodedData = mEncoder.getOutputBuffer(outputBufferId);
        if (encodedData == null) {
            throw new RuntimeException("encoder output buffer " + outputBufferId + " is null");
        }

        // Process the data.
        processEncodedData(encodedData);

        // Release the buffer.
        mEncoder.releaseOutputBuffer(outputBufferId, false);
    }

    /**
     * Process the data from the output buffer.
     * @param encodedData Data from the output buffer.
     */
    private void processEncodedData(final ByteBuffer encodedData) {
        // Position the buffers.
        adjustEncodedDataPosition(encodedData);
        adjustEncodedDataPosition(encodedData);

        // Handle coded private data.
        if (isCodecPrivateData()) {
            notifyCodecPrivateDataAvailable(encodedData);
            return;
        }

        // Handle end of stream.
        if (isEndOfStream()) {
            Log.d(TAG, "end of stream reached");
            return;
        }

        // Send the data to KVS producer SDK.
        sendEncodedFrameToProducerSDK(encodedData);
    }

    /**
     * Helper fucntion to position a given buffer correctly.
     * @param encodedData The buffer to be used.
     */
    private void adjustEncodedDataPosition(final ByteBuffer encodedData) {
        encodedData.position(mBufferInfo.offset);
        encodedData.limit(mBufferInfo.offset + mBufferInfo.size);
    }

    /**
     * Helper function to check for end of stream flag.
     * @return True if the flag is present.
     */
    private boolean isEndOfStream() {
        return (mBufferInfo.flags & MediaCodec.BUFFER_FLAG_END_OF_STREAM) != 0;
    }

    /**
     * Helper function to check for codec private data flag.
     * @return True if the flag is present.
     */
    private boolean isCodecPrivateData() {
        return (mBufferInfo.flags & MediaCodec.BUFFER_FLAG_CODEC_CONFIG) != 0;
    }

    /**
     * Helper fucntion to notify codec private data listener.
     * @param codecPrivateDataBuffer The data to be passed to the listener.
     */
    private void notifyCodecPrivateDataAvailable(final ByteBuffer codecPrivateDataBuffer) {
        Log.d(TAG, "got codec private data");
        final ByteBuffer privateData = codecPrivateDataBuffer;
        final byte[] codecPrivateDataArray = convertToArray(privateData);
        mCodecPrivateDataListener.onCodecPrivateDataAvailable(codecPrivateDataArray);
    }

    /**
     * Helper function to notify frame listener. It uses the data and system time to create a Frame
     * to be sent to the listener.
     * @param encodedData The frame data to be passed to the listener.
     */
    private void sendEncodedFrameToProducerSDK(final ByteBuffer encodedData) {
        final long currentTime = System.currentTimeMillis();
        Log.d(TAG, "time between frames: " + (currentTime - mLastRecordedFrameTimestamp) + "ms");
        mLastRecordedFrameTimestamp = currentTime;

        if (mFragmentStart == 0) {
            mFragmentStart = currentTime;
        }

        final ByteBuffer frameData = encodedData;

        mFrameAvailableListener.onFrameAvailable(
                FrameUtility.createFrame(
                        mBufferInfo,
                        1 + currentTime - mFragmentStart,
                        mFrameIndex++,
                        frameData));
    }

    /**
     * Stops the encoder and releases it. It also uodates the status.
     */
    public void stop() {
        Log.d(TAG, "stopping encoder");
        mIsStopped = true;
        mEncoder.stop();
        mEncoder.release();
    }

    /**
     * Helper fucntion to convert a ByteBuffer to byte array.
     * @param byteBuffer The ByteBuffer to be converted.
     * @return The byte[] after conversion.
     */
    private byte[] convertToArray(final ByteBuffer byteBuffer) {
        final byte[] array = new byte[byteBuffer.remaining()];
        byteBuffer.get(array);
        return array;
    }

    /**
     * Helper fucntion to get a string with Thread ID of the calling thread.
     * @return A string with the thread ID.
     */
    private static String threadId() {
        return " | threadId=" + Thread.currentThread().getId();
    }

    /**
     * Helper function to sleep for the given millis.
     * @param ms Time in millis to sleep.
     */
    private static void sleep(final int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

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

package com.amazon.blueshift.bluefront.android.audio.encoder;

import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.encoder.AudioEncoder;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.encoder.AudioEncoderException;
import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.google.common.net.MediaType;

import java.nio.ByteBuffer;
import java.util.Set;

/**
 * Opus encoder that encodes 16-bit PCM audio to Opus format.
 */
public class OpusEncoder implements AudioEncoder {

    /**
     * The number of milliseconds per second.
     */
    private static final int MS_PER_SEC = 1000;

    /**
     * This encoder only encodes CBR Opus, so VBR is set to false.
     */
    private static final boolean IS_VBR = false;

    /**
     * This encoder is used for audio applications.
     */
    private static final int APPLICATION_AUDIO = 2049;

    /**
     * This encoder is used for encoding voice.
     */
    private static final int SIGNAL_VOICE = 3001;

    // Default values.
    private static final int DEFAULT_FRAME_SIZE_MILLIS = 20;
    private static final int DEFAULT_SAMPLE_RATE = 16000;
    private static final int DEFAULT_CHANNELS = 1;
    private static final int DEFAULT_BIT_RATE = 32000;
    private static final int DEFAULT_COMPLEXITY = 10;

    // Values used to validate the input to the constructor.
    private static final Set<Integer> VALID_FRAME_SIZE_MILLIS = Sets.newHashSet(5, 10, 20, 40, 60);
    private static final Set<Integer> VALID_SAMPLES_RATES =
            Sets.newHashSet(8000, 12000, 16000, 24000, 48000);
    private static final int MIN_COMPLEXITY = 1;
    private static final int MAX_COMPLEXITY = 10;
    private static final int BIT_RATE_INTERVAL = 400;
    private static final int MAX_BIT_RATE = 512000;
    private static final int MIN_BIT_RATE = 6000;

    // Values set by client.
    private final int mFrameSizeMillis;
    private final int mSampleRate;
    private final int mChannels;
    private final int mBitrate;
    private final int mComplexity;

    static {
        System.loadLibrary("blueshift-opus");
    }

    private ByteBuffer mOpusEncoder;
    private final MediaType mMediaType;
    private final int mFrameSize;
    private final int mPacketSize;

    /**
     * Constructor with good defaults for the Android mobile library.
     * @throws AudioEncoderException when there's an error creating the encoder.
     */
    public OpusEncoder() throws AudioEncoderException {
        this(DEFAULT_FRAME_SIZE_MILLIS, DEFAULT_SAMPLE_RATE, DEFAULT_CHANNELS, DEFAULT_BIT_RATE,
                DEFAULT_COMPLEXITY);
    }

    /**
     * Create a new Opus encoder with the following settings.
     * @param frameSizeMillis the frame size in milliseconds, must be 5, 10, 20, 40, or 60.
     * @param sampleRate the sample rate of the PCM audio in Hz, must be one of 8000, 12000, 16000,
     *          24000, or 48000.
     * @param channels the number of channels of audio, can be 1 or 2.
     * @param bitrate the Opus bitrate, can be between 6000 and 512000 in increments of 400.
     * @param complexity the complexity of the Opus audio, should be an integer between 1 and 10.
     * @throws AudioEncoderException when there's an error initializing the encoder.
     */
    public OpusEncoder(final int frameSizeMillis, final int sampleRate, final int channels,
            final int bitrate, final int complexity) throws AudioEncoderException {
        Preconditions.checkArgument(VALID_FRAME_SIZE_MILLIS.contains(frameSizeMillis),
                "Frame size is invalid");
        Preconditions.checkArgument(VALID_SAMPLES_RATES.contains(sampleRate),
                "Sample rate is invalid");
        Preconditions.checkArgument(channels == 1 || channels == 2,
                "Number of channels is invalid");
        Preconditions.checkArgument(bitrate >= MIN_BIT_RATE && bitrate <= MAX_BIT_RATE
                && (bitrate - MIN_BIT_RATE) % BIT_RATE_INTERVAL == 0,
                "Bitrate is invalid");
        Preconditions.checkArgument(complexity >= MIN_COMPLEXITY && complexity <= MAX_COMPLEXITY,
                "Complexity is invalid");

        mFrameSizeMillis = frameSizeMillis;
        mSampleRate = sampleRate;
        mChannels = channels;
        mBitrate = bitrate;
        mComplexity = complexity;

        mOpusEncoder = createOpusEncoder(sampleRate, channels, bitrate, complexity,
                IS_VBR, APPLICATION_AUDIO, SIGNAL_VOICE);
        mPacketSize = bitrate * frameSizeMillis / (Byte.SIZE * MS_PER_SEC);
        mFrameSize = sampleRate * frameSizeMillis / MS_PER_SEC;
        mMediaType = MediaType.parse("audio/x-cbr-opus-with-preamble")
                .withParameter("bit-rate", Integer.toString(bitrate))
                .withParameter("frame-size-milliseconds", Integer.toString(frameSizeMillis))
                .withParameter("preamble-size", "0");
    }

    @Override
    public synchronized byte[] encode(final short[] samples, final int numSamples) throws AudioEncoderException {
        Preconditions.checkNotNull(mOpusEncoder, "Opus encoder is not initialized");
        Preconditions.checkNotNull(samples, "Samples buffer cannot be null");
        Preconditions.checkArgument(samples.length >= numSamples, "Number of samples cannot exceed buffer size");

        return encodeOpus(mOpusEncoder, samples, mPacketSize);
    }

    @Override
    public MediaType getMediaType() {
        return mMediaType;
    }

    @Override
    public int getFrameSize() {
        return mFrameSize;
    }

    @Override
    public int getPacketSize() {
        return mPacketSize;
    }

    @Override
    public synchronized void close() {
        if (mOpusEncoder != null) {
            destroyOpusEncoder(mOpusEncoder);
            mOpusEncoder = null;
        }
    }

    /**
     * Create a native Opus Encoder and return a handle to the bytes.
     * @param sampleRate the sample rate of the audio.
     * @param channels the number of channels in the audio.
     * @param bitrate the bitrate of the Opus audio.
     * @param complexity the complexity of the Opus compression.
     * @param vbr whether or not to use VBR during compression.
     * @param application the application of the audio being compressed.
     * @param signal the type of audio being compressed.
     * @return the handle to the Opus Encoder.
     * @throws AudioEncoderException when there's an error initializing the Opus encoder.
     */
    private native ByteBuffer createOpusEncoder(final int sampleRate, final int channels, final int bitrate,
            final int complexity, final boolean vbr, final int application, final int signal) throws AudioEncoderException;

    /**
     * Encode a short array of PCM samples into Opus.
     * @param opusEncoder the Opus encoder to use for encoding.
     * @param samples the audio samples to encode.
     * @param packetSize the packet size of the encoded audio.
     * @return the encoded Opus bytes.
     * @throws AudioEncoderException when there's an error encoding the audio.
     */
    private native byte[] encodeOpus(final ByteBuffer opusEncoder, final short[] samples, final int packetSize)
            throws AudioEncoderException;

    /**
     * Free the memory used for an Opus Encoder.
     * @param opusEncoder the Opus encoder to free.
     */
    private native void destroyOpusEncoder(final ByteBuffer opusEncoder);

    @Override
    public final OpusEncoder newEncoder() {
        try {
            return new OpusEncoder(mFrameSizeMillis, mSampleRate, mChannels, mBitrate, mComplexity);
        } catch (final AudioEncoderException e) {
            return null;
        }
    }
}

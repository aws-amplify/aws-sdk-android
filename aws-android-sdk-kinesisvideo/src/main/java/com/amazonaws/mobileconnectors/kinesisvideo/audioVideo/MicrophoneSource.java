package com.amazonaws.mobileconnectors.kinesisvideo.audiovideo;


import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.media.MediaFormat;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Log;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.mobileconnectors.kinesisvideo.encoding.EncoderWrapper.FrameAvailableListener;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;
import com.amazonaws.mobileconnectors.kinesisvideo.util.FrameUtility;
import com.amazonaws.kinesisvideo.producer.Tag;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceSink;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.AUDIO_TRACK_ID;

import java.util.concurrent.CountDownLatch;


public class MicrophoneSource {
    private static final String TAG = MicrophoneSource.class.getSimpleName();

    // TODO: Make the below configured through mAudioVideoMediaSourceConfiguration
    private static final int AUDIO_SAMPLE_RATE = 44100; // mMediaSourceConfiguration.getSampleRate(), Hardcoded sample rate for now (emulator requires 8000);
    private static final int AUDIO_CHANNEL_TYPE = AudioFormat.CHANNEL_IN_MONO; // Android Docs: "CHANNEL_IN_MONO is guaranteed to work on all devices."
    private static final int AUDIO_ENCODING_TYPE = AudioFormat.ENCODING_PCM_16BIT; // Android Docs: "ENCODING_PCM_16BIT is Guaranteed to be supported by devices."
    private static final int AUDIO_BIT_RATE = 256 * 1024;
    private final int bufferSize = AudioRecord.getMinBufferSize(AUDIO_SAMPLE_RATE, AUDIO_CHANNEL_TYPE, AUDIO_ENCODING_TYPE) * 2; 

    private final OutputStream outputStream = new ByteArrayOutputStream();


    private AudioRecord audioRecord = null;
    MediaCodec audioEncoder = null;
    private Thread audioCaptureThread = null;
    private volatile boolean isCapturing = false;
    private long mLastRecordedFrameTimestamp = 0;
    private int mFrameIndex = 0;
    private long mFragmentStart = 0;
    MediaCodec.BufferInfo mBufferInfo = new MediaCodec.BufferInfo();

    private MediaSourceSink mMediaSourceSink;

    private volatile CountDownLatch mLatch;
    private volatile boolean firstVideoFrameSent = false;



    public MicrophoneSource(MediaSourceSink mediaSourceSink, CountDownLatch latch) {
        mMediaSourceSink = mediaSourceSink;
        mLatch = latch;
    }

    private FrameAvailableListener mFrameAvailableListener = new FrameAvailableListener() {
        @Override
        public void onFrameAvailable(final KinesisVideoFrame frame) {
            try {
                Log.i(TAG, "updating sink with frame");
                mMediaSourceSink.onFrame(frame);
            } catch (final KinesisVideoException e) {
                Log.e(TAG, "error updating sink with frame", e);
            }
        }
    };



    public void startAudioCapture () {
        System.out.println("[TESTING] startAudioCapture called.");

        try {
            audioRecord = new AudioRecord(MediaRecorder.AudioSource.DEFAULT,
                        AUDIO_SAMPLE_RATE,
                        AUDIO_CHANNEL_TYPE,
                        AUDIO_ENCODING_TYPE,
                        bufferSize);
            
            audioEncoder = createAudioEncoder();
            audioEncoder.start();
            audioRecord.startRecording();
            isCapturing = true;

            audioCaptureThread = new Thread(new Runnable() {
                public void run() {
                    // MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    ByteBuffer[] codecInputBuffers = audioEncoder.getInputBuffers();
                    ByteBuffer[] codecOutputBuffers = audioEncoder.getOutputBuffers();


                    try {
                        while (isCapturing) {
                            // System.out.println("[TESTING] Handling audio sample...");
                            boolean success = handleCodecInput(codecInputBuffers, Thread.currentThread().isAlive());
                            if (success) {handleCodecOutput(codecOutputBuffers, outputStream);}
                        }
                    } catch (IOException e) {
                        System.out.println("Failed in audioCaptureThread: " + e);
                    } finally {
                        audioEncoder.stop();
                        audioRecord.stop();
            
                        audioEncoder.release();
                        audioRecord.release();
            
                        try {
                            outputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }, "AudioCapture Thread");
            audioCaptureThread.start();

        } catch (final SecurityException e) {
            System.out.println("Security exception: " + e);
        } catch (IOException e) {
            System.out.println("Failed in audioCaptureThread: " + e);
        }
    }

    public void stopAudioCapture() {
        Log.i(TAG, "stopping audio capturing");
        isCapturing = false;
    }

    private MediaCodec createAudioEncoder() throws IOException {

        MediaCodec mediaCodec = null;
        try{
            mediaCodec = MediaCodec.createEncoderByType("audio/mp4a-latm");

        } catch (Exception e) {
            System.out.println("[TESTING] Failed to createEncoderByType");
            throw new IOException(e);
        }
        MediaFormat mediaFormat = new MediaFormat();

        mediaFormat.setString(MediaFormat.KEY_MIME, MediaFormat.MIMETYPE_AUDIO_AAC);
        mediaFormat.setInteger(MediaFormat.KEY_SAMPLE_RATE, AUDIO_SAMPLE_RATE);
        mediaFormat.setInteger(MediaFormat.KEY_CHANNEL_COUNT, AUDIO_CHANNEL_TYPE);
        mediaFormat.setInteger(MediaFormat.KEY_MAX_INPUT_SIZE, bufferSize);
        mediaFormat.setInteger(MediaFormat.KEY_BIT_RATE, AUDIO_BIT_RATE);
        mediaFormat.setInteger(MediaFormat.KEY_AAC_PROFILE, MediaCodecInfo.CodecProfileLevel.AACObjectLC);

        try {
            mediaCodec.configure(mediaFormat, null, null, MediaCodec.CONFIGURE_FLAG_ENCODE);
        } catch (Exception e) {
            System.out.println("[TESTING] Failed to configure mediaCodec");
            mediaCodec.release();
            throw new IOException(e);
        }

        return mediaCodec;
    }

    private boolean handleCodecInput(ByteBuffer[] codecInputBuffers, boolean running) throws IOException {
        byte[] audioRecordData = new byte[bufferSize];
        int length = audioRecord.read(audioRecordData, 0, audioRecordData.length);

        if (length == AudioRecord.ERROR_BAD_VALUE ||
                length == AudioRecord.ERROR_INVALID_OPERATION ||
                length != bufferSize) {
            if (length != bufferSize) {
                return false;
            }
            return false; // testing with this here too
        }

        int codecInputBufferIndex = audioEncoder.dequeueInputBuffer(-1); // (-1 == no timeout)

        if (codecInputBufferIndex >= 0) {
            ByteBuffer codecBuffer = codecInputBuffers[codecInputBufferIndex];
            codecBuffer.clear();
            codecBuffer.put(audioRecordData);
            audioEncoder.queueInputBuffer(codecInputBufferIndex, 0, length, 0, running ? 0 : audioEncoder.BUFFER_FLAG_END_OF_STREAM);
        }

        return true;
    }


    private void handleCodecOutput(ByteBuffer[] codecOutputBuffers,
                                   OutputStream outputStream)
            throws IOException {
        int codecOutputBufferIndex = audioEncoder.dequeueOutputBuffer(mBufferInfo, 0);

        if (mBufferInfo.size == 0) {
            Log.w(TAG, "empty buffer " + codecOutputBufferIndex);
            //audioEncoder.releaseOutputBuffer(codecOutputBufferIndex, false);
            return;
        }
        while (codecOutputBufferIndex != MediaCodec.INFO_TRY_AGAIN_LATER) {
            if (codecOutputBufferIndex >= 0) {
                ByteBuffer encoderOutputBuffer = codecOutputBuffers[codecOutputBufferIndex];

                if (encoderOutputBuffer == null) {
                    System.out.println("[TESTING] encodedData is null.");
                    return;
                }

                encoderOutputBuffer.position(mBufferInfo.offset);
                encoderOutputBuffer.limit(mBufferInfo.offset + mBufferInfo.size);

                if ((mBufferInfo.flags & MediaCodec.BUFFER_FLAG_CODEC_CONFIG) != MediaCodec.BUFFER_FLAG_CODEC_CONFIG) {
            
                    if (encoderOutputBuffer == null) {
                        System.out.println("[TESTING] encoderOutputBuffer is null.");
                        return;
                    }

                    try {
                        mLatch.await();
                    } catch (InterruptedException e) {
                        System.out.println("MicrophoneSource interrupted waiting on first video frame to be sent.");
                    }

                    sendEncodedFrameToProducerSDK(encoderOutputBuffer);
                } else {
                    System.out.println("[TESTING] Audio encoder outputted Codec Config (CPD)!");
                    notifyCodecPrivateDataAvailable(encoderOutputBuffer);
                }

                encoderOutputBuffer.clear();

                audioEncoder.releaseOutputBuffer(codecOutputBufferIndex, false);
            } else if (codecOutputBufferIndex == MediaCodec.INFO_OUTPUT_BUFFERS_CHANGED) {
                System.out.println("[TESTING] handleCodecOutput codecOutputBufferIndex == MediaCodec.INFO_OUTPUT_BUFFERS_CHANGED.");
                codecOutputBuffers = audioEncoder.getOutputBuffers();
            }

            codecOutputBufferIndex = audioEncoder.dequeueOutputBuffer(mBufferInfo, 0);
        }
    }

    private void notifyCodecPrivateDataAvailable(final ByteBuffer codecPrivateData) {
        final byte[] codecPrivateDataArray = new byte[codecPrivateData.remaining()];
        codecPrivateData.get(codecPrivateDataArray);

        try {
            mMediaSourceSink.onCodecPrivateData(codecPrivateDataArray, AUDIO_TRACK_ID);
        } catch (KinesisVideoException e) {
            Log.e(TAG, "error updating sink with codec private data", e);
            throw new RuntimeException("error updating sink with codec private data", e);
        }
    }

    private void sendEncodedFrameToProducerSDK(final ByteBuffer encodedData) {
        final long currentTime = System.currentTimeMillis();
        
        Log.d(TAG, "[TESTING] Microphone's sendEncodedFrameToProducerSDK time between frames: " + (currentTime - mLastRecordedFrameTimestamp) + "ms");

        mLastRecordedFrameTimestamp = currentTime;

        if (mFragmentStart == 0) {
            mFragmentStart = currentTime;
        }

        final ByteBuffer frameData = encodedData;

        if(isCapturing) {
            mFrameAvailableListener.onFrameAvailable(
                FrameUtility.createFrameWithTrackID(
                        mBufferInfo,
                        currentTime,
                        mFrameIndex++,
                        frameData,
                        AUDIO_TRACK_ID));
        } else {
            System.out.println("[TESTING] Not sending Frame to KVS, isCapturing is false.");
        }
    }
}
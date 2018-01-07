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

package com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio;

import android.os.AsyncTask;
import android.util.Log;

import com.amazonaws.AmazonClientException;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.AudioRecordingTask.AudioRecordingTaskState;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.common.Progress;
import com.google.common.base.Preconditions;


/**
 * A task that do the audio recording in the background thread.
 */
public class AudioRecordingTask extends AsyncTask<Void, Progress<AudioRecordingTaskState>, Void> {

    private static final String TAG = AudioRecordingTask.class.getCanonicalName();

    private final AudioRecorder mAudioRecorder;
    private final AudioRecordingTaskListener mListener;

    /**
     * Create an audio recording task.
     * @param audioRecorder the audio recorder that records audio.
     * @param listener the task listener used to handle the audio events.
     */
    public AudioRecordingTask(final AudioRecorder audioRecorder, final AudioRecordingTaskListener listener) {
        mAudioRecorder = Preconditions.checkNotNull(audioRecorder, "Audio recorder cannot be null.");
        mListener = Preconditions.checkNotNull(listener, "Listener for this task cannot be null");

        mAudioRecorder.setAudioSourceListener(new AudioRecorderListener());
    }

    @SuppressWarnings("unchecked")
    @Override
    protected Void doInBackground(final Void... params) {
        try {
            mAudioRecorder.startRecording();
        } catch (final Exception e) {
            publishProgress(new Progress<AudioRecordingTaskState>(AudioRecordingTaskState.Error, e));
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(final Progress<AudioRecordingTaskState>... updates) {
        Preconditions.checkNotNull(updates, "Updates cannot be null.");
        Preconditions.checkArgument(updates.length == 1, "Only one update is allowed.");

        final Progress<AudioRecordingTaskState> update = updates[0];
        Log.v(TAG, "onProgressUpdate: " + update.getState().toString());
        final Object payload = update.getPayload();

        if (mListener != null) {
            switch (update.getState()) {
                case ReadyForSpeech:
                    mListener.onReadyForSpeech();
                    break;

                case BeginningOfSpeech:
                    mListener.onBeginningOfSpeech();
                    break;

                case BufferReceived:
                    if (payload != null && payload instanceof byte[]) {
                        mListener.onBufferReceived((byte[]) payload);
                    }
                    break;

                case RmsChanged:
                    if (payload != null && payload instanceof Float) {
                        mListener.onRmsChanged((Float) payload);
                    }
                    break;

                case SilenceDetected:
                    mListener.onSilenceDetected();
                    break;

                case Error:
                    if (payload != null && payload instanceof AmazonClientException) {
                        mListener.onError((AmazonClientException) payload);
                    }
                    break;

                case NoSpeechTimeout:
                    mListener.onNoSpeechTimeout();
                    break;

                case MaxSpeechTimeout:
                    mListener.onMaxSpeechTimeout();
                    break;

                default:
                    mListener.onError(new AmazonClientException("Received an unknown progress update"));
                    break;
            }
        } else {
            Log.w(TAG, "Audio recording task listener is null.");
        }
    }

    /**
     * Stop the recorder.
     */
    public void stopRecording() {
        Log.v(TAG, "stop recording");
        mAudioRecorder.cancel();
    }

    /**
     * The various states of the {@link AudioRecordingTask}.
     */
    public static enum AudioRecordingTaskState {
        /**
         * The end pointer is ready for speech.
         */
        ReadyForSpeech,
        /**
         * The audio recorder starts recording.
         */
        BeginningOfSpeech,
        /**
         * Buffer received from the audio recorder.
         */
        BufferReceived,
        /**
         * The sound level changed in the recorded audio.
         */
        RmsChanged,
        /**
         * Silence detected by the end pointer.
         */
        SilenceDetected,
        /**
         * Recorder stopped by the user.
         */
        EndOfSpeech,
        /**
         * There is an error.
         */
        Error,
        /**
         * No speech timeout fired.
         */
        NoSpeechTimeout,
        /**
         * Max speech timeout fired.
         */
        MaxSpeechTimeout
    }

    /**
     * An AudioSourceListener implementation for the {@link AudioRecordingTask}.
     */
    @SuppressWarnings("unchecked")
    private class AudioRecorderListener implements AudioSourceListener {

        @Override
        public void onReadyForSpeech() {
            publishProgress(new Progress<AudioRecordingTaskState>(AudioRecordingTaskState.ReadyForSpeech));
        }

        @Override
        public void onBeginningOfSpeech() {
            publishProgress(new Progress<AudioRecordingTaskState>(AudioRecordingTaskState.BeginningOfSpeech));
        }

        @Override
        public void onRmsChanged(final float rmsdB) {
            publishProgress(new Progress<AudioRecordingTaskState>(AudioRecordingTaskState.RmsChanged, rmsdB));
        }

        @Override
        public void onBufferReceived(final byte[] buffer) {
            publishProgress(new Progress<AudioRecordingTaskState>(AudioRecordingTaskState.BufferReceived, buffer));
        }

        @Override
        public void onSilenceDetected() {
            publishProgress(new Progress<AudioRecordingTaskState>(AudioRecordingTaskState.SilenceDetected));
        }

        @Override
        public void onNoSpeechTimeout() {
            publishProgress(new Progress<AudioRecordingTaskState>(AudioRecordingTaskState.NoSpeechTimeout));
        }

        @Override
        public void onMaxSpeechTimeout() {
            publishProgress(new Progress<AudioRecordingTaskState>(AudioRecordingTaskState.MaxSpeechTimeout));
        }
    }
}

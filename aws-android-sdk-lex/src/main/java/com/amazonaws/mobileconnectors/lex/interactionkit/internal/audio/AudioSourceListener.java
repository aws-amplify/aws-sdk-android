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


/**
 * Listener interface for AudioSource events.
 */
public interface AudioSourceListener {
    /**
     * Called when the endpointer is ready for the user to start speaking.
     */
    void onReadyForSpeech();

    /**
     * The user has started to speak.
     */
    void onBeginningOfSpeech();

    /**
     * The sound level in the audio stream has changed. There is no guarantee that this method will
     * be called.
     *
     * @param rmsdB the new RMS dB value
     */
    void onRmsChanged(float rmsdB);

    /**
     * More sound has been received. The purpose of this function is to allow giving feedback to the
     * user regarding the captured audio. There is no guarantee that this method will be called.
     *
     * @param buffer a buffer containing a sequence of big-endian 16-bit integers representing a
     *        single channel audio stream. The sample rate is implementation dependent.
     */
    void onBufferReceived(byte[] buffer);

    /**
     * Called when the end pointer detected that the user stops speaking.
     */
    void onSilenceDetected();

    /**
     * Called when the no speech timeout fires.
     */
    void onNoSpeechTimeout();

    /**
     * Called when the max speech timeout fires.
     */
    void onMaxSpeechTimeout();

    /**
     * A Null AudioSourceListener that does nothing.
     */
    public static class NullListener implements AudioSourceListener {

        @Override
        public void onReadyForSpeech() {
            // Do nothing.
        }

        @Override
        public void onBeginningOfSpeech() {
            // Do nothing.
        }

        @Override
        public void onRmsChanged(final float rmsdB) {
            // Do nothing.
        }

        @Override
        public void onBufferReceived(final byte[] buffer) {
            // Do nothing.
        }

        @Override
        public void onSilenceDetected() {
            // Do nothing.
        }

        @Override
        public void onNoSpeechTimeout() {
            // Do nothing.
        }

        @Override
        public void onMaxSpeechTimeout() {
            // Do nothing.
        }
    }
}

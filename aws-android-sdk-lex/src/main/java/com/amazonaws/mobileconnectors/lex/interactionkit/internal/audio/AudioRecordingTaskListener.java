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

import com.amazonaws.AmazonClientException;

/**
 * An interface for the audio recording task's listener.
 */
public interface AudioRecordingTaskListener {
    /**
     * On end pointer is ready for speech.
     */
    void onReadyForSpeech();
    /**
     * On the recorder start recording.
     */
    void onBeginningOfSpeech();
    /**
     * On buffer audio received from the audio recorder.
     * @param buffer the audio buffer.
     */
    void onBufferReceived(byte[] buffer);
    /**
     * On the sound level changed from the recorded audio.
     * @param rmsdB the sound level.
     */
    void onRmsChanged(float rmsdB);
    /**
     * On silence detected by the end pointer.
     */
    void onSilenceDetected();
    /**
     * On no speech timeout.
     */
    void onNoSpeechTimeout();
    /**
     * On max speech timeout.
     */
    void onMaxSpeechTimeout();
    /**
     * On exception caught.
     * @param e the exception.
     */
    void onError(AmazonClientException e);
}

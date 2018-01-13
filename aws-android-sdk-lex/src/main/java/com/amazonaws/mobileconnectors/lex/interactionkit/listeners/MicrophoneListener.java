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

package com.amazonaws.mobileconnectors.lex.interactionkit.listeners;

/**
 * Callback for events on microphones.
 */
public interface MicrophoneListener {

    /**
     * This is invoked when the client is ready for recording.
     */
    public void readyForRecording();

    /**
     * This is invoked when the client has started recording.
     */
    public void startedRecording();

    /**
     * This is invoked when the client has stopped recording.
     */
    public void onRecordingEnd();

    /**
     * This is invoked to indicate a change in the sound level.
     *
     * @param soundLevel Sound level as a {@link Double}.
     */
    public void onSoundLevelChanged(double soundLevel);

    /**
     * Indicates an error when recording sound on the microphone.
     *
     * @param e Error as an {@link Exception}.
     * @throws Exception
     */
    public void onMicrophoneError(Exception e);
}

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

package com.amazonaws.mobileconnectors.lex.interactionkit.config;

import com.amazonaws.mobileconnectors.lex.interactionkit.utils.AudioEncoding;

import java.util.HashMap;
import java.util.Map;

/**
 * Contains configuration for SDK's interaction with the users.
 */
public class InteractionConfig {
    /**
     * Time out interval in milli-seconds when no sound is heard from the user.
     */
    private int noSpeechTimeoutInterval;

    /**
     * Maximum value for no sound time put, in milli-seconds.
     */
    private int maxSpeechTimeoutInterval;

    /**
     * The number of speech frames which defines what is a active speech. TODO -
     * Add explanations to use this setting.
     */
    private int startPointingThreshold;

    /**
     * The number of non-speech frames which defines what a silence is. TODO -
     * Add explanations to use this setting.
     */
    private int endPointingThreshold;

    /**
     * The likelihood-ratio test threshold value, which will be used to classify
     * whether a frame of audio is a speech or not. TODO - Expose this to
     * developers? TODO - Add explanations to use this setting.
     */
    private float lrtThreshold;

    /**
     * Indicates if the SDK should playback audio response from Amazon Lex.
     * Default is "true".
     */
    private boolean enableAudioPlayback;

    /**
     * Current audio encoding codec.
     */
    private AudioEncoding audioEncoding;

    /**
     * The Amazon Lex bot name.
     */
    private String botName;

    /**
     * The Amazon Lex bot Alias
     */
    private String botAlias;

    /**
     * User id.
     */
    private String userId;

    public static final int DEFAULT_NO_SPEECH_TIMEOUT_INTERVAL = 5000;
    public static final int DEFAULT_MAX_SPEECH_TIMEOUT_INTERVAL = 15000;
    public static final int DEFAULT_START_POINTING_THRESHOLD = 8;
    public static final int DEFAULT_END_POINTING_THRESHOLD = 80;
    public static final float DEFAULT_LRT_THRESHOLD = 1.8f;
    public static final AudioEncoding DEFAULT_AUDIO_ENCODING = AudioEncoding.OPUS;

    /**
     * Session attributes which are common for all requests.
     */
    private Map<String, String> globalSessionAttributes;

    /**
     * Creates a new instance of this object, with no global attributes.
     *
     * @param botName Name of the bot, should match a bot in set in the service.
     * @param botAlias Bot alias.
     */
    public InteractionConfig(String botName, String botAlias, String userId) {
        this(botName, botAlias, userId, null);
    }

    /**
     * Creates a new instance of this object, with no global attributes.
     *
     * @param botName Name of the bot, should match a bot in set in the service.
     * @param botAlias Bot alias.
     */
    public InteractionConfig(String botName, String botAlias) {
        this(botName, botAlias, null);
    }

    /**
     * Creates a new instance of this object, with global attributes.
     *
     * @param botName Name of the bot, should match a bot in set in the service.
     * @param botAlias Bot alias.
     * @param globalSessionAttributes {@link Map}.
     */
    public InteractionConfig(String botName, String botAlias, String userId,
            Map<String, String> globalSessionAttributes) {
        this.noSpeechTimeoutInterval = DEFAULT_NO_SPEECH_TIMEOUT_INTERVAL;
        this.startPointingThreshold = DEFAULT_START_POINTING_THRESHOLD;
        this.maxSpeechTimeoutInterval = DEFAULT_MAX_SPEECH_TIMEOUT_INTERVAL;
        this.endPointingThreshold = DEFAULT_END_POINTING_THRESHOLD;
        this.lrtThreshold = DEFAULT_LRT_THRESHOLD;
        this.audioEncoding = DEFAULT_AUDIO_ENCODING;
        this.botName = botName;
        this.botAlias = botAlias;
        this.userId = userId;

        if (globalSessionAttributes == null) {
            this.globalSessionAttributes = new HashMap<String, String>();
        } else {
            this.globalSessionAttributes = globalSessionAttributes;
        }

        this.enableAudioPlayback = true;
    }

    /**
     * Returns bot name.
     *
     * @return bot name as a {@link String}.
     */
    public String getBotName() {
        return botName;
    }

    /**
     * Sets bot name.
     *
     * @param botName Bot name as a {@link String}.
     */
    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * Returns bot alias.
     *
     * @return bot alias as a {@link String}.
     */
    public String getBotAlias() {
        return botAlias;
    }

    /**
     * Sets bot alias.
     *
     * @param botAlias Bots alias as a {@link String}.
     */
    public void setBotAlias(String botAlias) {
        this.botAlias = botAlias;
    }

    /**
     * Returns current audio encoding, if no encoding is set returns default
     * encoding.
     *
     * @return {@link AudioEncoding}
     */
    public AudioEncoding getAudioEncoding() {
        return audioEncoding;
    }

    /**
     * Set audio encoding.
     *
     * @param audioEncoding {@link AudioEncoding}, encoding used for audio
     *            streamed to the service.
     * @return {@link InteractionConfig}
     */
    public InteractionConfig withAudioEncoding(AudioEncoding audioEncoding) {
        this.audioEncoding = audioEncoding;
        return this;
    }

    /**
     * Set audio encoding.
     *
     * @param audioEncoding {@link AudioEncoding}, encoding used for audio
     *            streamed to the service.
     */
    public void setAudioEncoding(AudioEncoding audioEncoding) {
        this.audioEncoding = audioEncoding;
    }

    /**
     * Returns current audio playback setting.
     *
     * @return true if the audio playback from the SDK has been enabled.
     */
    public boolean isEnableAudioPlayback() {
        return enableAudioPlayback;
    }

    /**
     * Set this to true if the audio response from Amazon Lex service should be
     * played back by the SDK.
     *
     * @param enableAudioPlayback {@link boolean}
     */
    public void setEnableAudioPlayback(boolean enableAudioPlayback) {
        this.enableAudioPlayback = enableAudioPlayback;
    }

    /**
     * Set this to true if the audio response from Amazon Lex service should be
     * played back by the SDK.
     *
     * @param enableAudioPlayback {@link boolean}
     * @return {@link InteractionConfig}
     */
    public InteractionConfig WithEnableAudioPlayback(boolean enableAudioPlayback) {
        this.enableAudioPlayback = enableAudioPlayback;
        return this;
    }

    /**
     * Set no speech time out interval.
     *
     * @param noSpeechTimeoutInterval time out interval in milli-seconds.
     */
    public void setNoSpeechTimeoutInterval(int noSpeechTimeoutInterval) {
        this.noSpeechTimeoutInterval = noSpeechTimeoutInterval;
    }

    /**
     * Set no speech time out interval.
     *
     * @param noSpeechTimeoutInterval time out interval in milli-seconds.
     * @return {@link InteractionConfig}
     */
    public InteractionConfig withNoSpeechTimeoutInterval(int noSpeechTimeoutInterval) {
        this.noSpeechTimeoutInterval = noSpeechTimeoutInterval;
        return this;
    }

    /**
     * Returns current no speech time-out value.
     *
     * @return
     */
    public int getNoSpeechTimeoutInterval() {
        return noSpeechTimeoutInterval;
    }

    /**
     * Set maximum interval for speech.
     *
     * @param maxSpeechTimeoutInterval maximum speech time out interval in
     *            milli-seconds.
     */
    public void setMaxSpeechTimeoutInterval(int maxSpeechTimeoutInterval) {
        this.maxSpeechTimeoutInterval = maxSpeechTimeoutInterval;
    }

    /**
     * Set maximum interval for speech.
     *
     * @param maxSpeechTimeoutInterval maximum speech time out interval in
     *            milli-seconds.
     * @return {@link InteractionConfig}
     */
    public InteractionConfig withMaxSpeechTimeoutInterval(int maxSpeechTimeoutInterval) {
        this.maxSpeechTimeoutInterval = maxSpeechTimeoutInterval;
        return this;
    }

    /**
     * Returns maximum interval for speech.
     *
     * @return
     */
    public int getMaxSpeechTimeoutInterval() {
        return maxSpeechTimeoutInterval;
    }

    /**
     * Set start point threshold.
     *
     * @param startPointingThreshold
     */
    public void setStartPointingThreshold(int startPointingThreshold) {
        this.startPointingThreshold = startPointingThreshold;
    }

    /**
     * Set start point threshold.
     *
     * @param startPointingThreshold
     * @return {@link InteractionConfig}
     */
    public InteractionConfig withStartPointingThreshold(int startPointingThreshold) {
        this.startPointingThreshold = startPointingThreshold;
        return this;
    }

    /**
     * Get current star point threshold.
     *
     * @return
     */
    public int getStartPointingThreshold() {
        return startPointingThreshold;
    }

    /**
     * Set endpoint threshold.
     *
     * @param endPointingThreshold
     */
    public void setEndPointingThreshold(int endPointingThreshold) {
        this.endPointingThreshold = endPointingThreshold;
    }

    /**
     * Set endpoint threshold.
     *
     * @param endPointingThreshold
     * @return {@link InteractionConfig}
     */
    public InteractionConfig withEndPointingThreshold(int endPointingThreshold) {
        this.endPointingThreshold = endPointingThreshold;
        return this;
    }

    /**
     * Get current end point threshold.
     *
     * @return the end pointing threshold.
     */
    public int getEndPointingThreshold() {
        return endPointingThreshold;
    }

    /**
     * Get the global SessionAtributes
     *
     * @return the global session attributes
     */
    public Map<String, String> getGlobalSessionAttributes() {
        return globalSessionAttributes;
    }

    /**
     * Set the global SessionAtributes
     *
     * @param globalSessionAttributes the global session attributes.
     */
    public void setGlobalSessionAttributes(Map<String, String> globalSessionAttributes) {
        this.globalSessionAttributes = globalSessionAttributes;
    }

    /**
     * Set the global SessionAtributes
     *
     * @param globalSessionAttributes the global session attributes.
     * @return {@link InteractionConfig}
     */
    public InteractionConfig withGlobalSessionAttributes(
            Map<String, String> globalSessionAttributes) {
        this.globalSessionAttributes = globalSessionAttributes;
        return this;
    }

    /**
     * Get the user id
     *
     * @return the userid
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the user id
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Sets the user id
     *
     * @param userId
     * @return {@link InteractionConfig}
     */
    public InteractionConfig withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Returns the likely hood ration threshold
     *
     * @return
     */
    public float getLrtThreshold() {
        return lrtThreshold;
    }

    /**
     * Sets the Likely hood ration threshold for the VAD
     *
     * @param lrtThreshold
     */
    public void setLrtThreshold(float lrtThreshold) {
        this.lrtThreshold = lrtThreshold;
    }

    /**
     * Sets the Likely hood ration threshold for the VAD
     *
     * @param lrtThreshold
     */
    public InteractionConfig withLrtThreshold(float lrtThreshold) {
        this.lrtThreshold = lrtThreshold;
        return this;
    }
}

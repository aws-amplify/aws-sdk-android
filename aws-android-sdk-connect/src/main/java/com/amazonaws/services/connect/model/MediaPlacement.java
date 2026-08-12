/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * A set of endpoints used by clients to connect to the media service group for
 * an Amazon Chime SDK meeting.
 * </p>
 */
public class MediaPlacement implements Serializable {
    /**
     * <p>
     * The audio host URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String audioHostUrl;

    /**
     * <p>
     * The audio fallback URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String audioFallbackUrl;

    /**
     * <p>
     * The signaling URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String signalingUrl;

    /**
     * <p>
     * The turn control URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String turnControlUrl;

    /**
     * <p>
     * The event ingestion URL to which you send client meeting events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String eventIngestionUrl;

    /**
     * <p>
     * The audio host URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         The audio host URL.
     *         </p>
     */
    public String getAudioHostUrl() {
        return audioHostUrl;
    }

    /**
     * <p>
     * The audio host URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param audioHostUrl <p>
     *            The audio host URL.
     *            </p>
     */
    public void setAudioHostUrl(String audioHostUrl) {
        this.audioHostUrl = audioHostUrl;
    }

    /**
     * <p>
     * The audio host URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param audioHostUrl <p>
     *            The audio host URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaPlacement withAudioHostUrl(String audioHostUrl) {
        this.audioHostUrl = audioHostUrl;
        return this;
    }

    /**
     * <p>
     * The audio fallback URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         The audio fallback URL.
     *         </p>
     */
    public String getAudioFallbackUrl() {
        return audioFallbackUrl;
    }

    /**
     * <p>
     * The audio fallback URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param audioFallbackUrl <p>
     *            The audio fallback URL.
     *            </p>
     */
    public void setAudioFallbackUrl(String audioFallbackUrl) {
        this.audioFallbackUrl = audioFallbackUrl;
    }

    /**
     * <p>
     * The audio fallback URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param audioFallbackUrl <p>
     *            The audio fallback URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaPlacement withAudioFallbackUrl(String audioFallbackUrl) {
        this.audioFallbackUrl = audioFallbackUrl;
        return this;
    }

    /**
     * <p>
     * The signaling URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         The signaling URL.
     *         </p>
     */
    public String getSignalingUrl() {
        return signalingUrl;
    }

    /**
     * <p>
     * The signaling URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param signalingUrl <p>
     *            The signaling URL.
     *            </p>
     */
    public void setSignalingUrl(String signalingUrl) {
        this.signalingUrl = signalingUrl;
    }

    /**
     * <p>
     * The signaling URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param signalingUrl <p>
     *            The signaling URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaPlacement withSignalingUrl(String signalingUrl) {
        this.signalingUrl = signalingUrl;
        return this;
    }

    /**
     * <p>
     * The turn control URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         The turn control URL.
     *         </p>
     */
    public String getTurnControlUrl() {
        return turnControlUrl;
    }

    /**
     * <p>
     * The turn control URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param turnControlUrl <p>
     *            The turn control URL.
     *            </p>
     */
    public void setTurnControlUrl(String turnControlUrl) {
        this.turnControlUrl = turnControlUrl;
    }

    /**
     * <p>
     * The turn control URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param turnControlUrl <p>
     *            The turn control URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaPlacement withTurnControlUrl(String turnControlUrl) {
        this.turnControlUrl = turnControlUrl;
        return this;
    }

    /**
     * <p>
     * The event ingestion URL to which you send client meeting events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         The event ingestion URL to which you send client meeting events.
     *         </p>
     */
    public String getEventIngestionUrl() {
        return eventIngestionUrl;
    }

    /**
     * <p>
     * The event ingestion URL to which you send client meeting events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param eventIngestionUrl <p>
     *            The event ingestion URL to which you send client meeting
     *            events.
     *            </p>
     */
    public void setEventIngestionUrl(String eventIngestionUrl) {
        this.eventIngestionUrl = eventIngestionUrl;
    }

    /**
     * <p>
     * The event ingestion URL to which you send client meeting events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param eventIngestionUrl <p>
     *            The event ingestion URL to which you send client meeting
     *            events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaPlacement withEventIngestionUrl(String eventIngestionUrl) {
        this.eventIngestionUrl = eventIngestionUrl;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAudioHostUrl() != null)
            sb.append("AudioHostUrl: " + getAudioHostUrl() + ",");
        if (getAudioFallbackUrl() != null)
            sb.append("AudioFallbackUrl: " + getAudioFallbackUrl() + ",");
        if (getSignalingUrl() != null)
            sb.append("SignalingUrl: " + getSignalingUrl() + ",");
        if (getTurnControlUrl() != null)
            sb.append("TurnControlUrl: " + getTurnControlUrl() + ",");
        if (getEventIngestionUrl() != null)
            sb.append("EventIngestionUrl: " + getEventIngestionUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAudioHostUrl() == null) ? 0 : getAudioHostUrl().hashCode());
        hashCode = prime * hashCode
                + ((getAudioFallbackUrl() == null) ? 0 : getAudioFallbackUrl().hashCode());
        hashCode = prime * hashCode
                + ((getSignalingUrl() == null) ? 0 : getSignalingUrl().hashCode());
        hashCode = prime * hashCode
                + ((getTurnControlUrl() == null) ? 0 : getTurnControlUrl().hashCode());
        hashCode = prime * hashCode
                + ((getEventIngestionUrl() == null) ? 0 : getEventIngestionUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaPlacement == false)
            return false;
        MediaPlacement other = (MediaPlacement) obj;

        if (other.getAudioHostUrl() == null ^ this.getAudioHostUrl() == null)
            return false;
        if (other.getAudioHostUrl() != null
                && other.getAudioHostUrl().equals(this.getAudioHostUrl()) == false)
            return false;
        if (other.getAudioFallbackUrl() == null ^ this.getAudioFallbackUrl() == null)
            return false;
        if (other.getAudioFallbackUrl() != null
                && other.getAudioFallbackUrl().equals(this.getAudioFallbackUrl()) == false)
            return false;
        if (other.getSignalingUrl() == null ^ this.getSignalingUrl() == null)
            return false;
        if (other.getSignalingUrl() != null
                && other.getSignalingUrl().equals(this.getSignalingUrl()) == false)
            return false;
        if (other.getTurnControlUrl() == null ^ this.getTurnControlUrl() == null)
            return false;
        if (other.getTurnControlUrl() != null
                && other.getTurnControlUrl().equals(this.getTurnControlUrl()) == false)
            return false;
        if (other.getEventIngestionUrl() == null ^ this.getEventIngestionUrl() == null)
            return false;
        if (other.getEventIngestionUrl() != null
                && other.getEventIngestionUrl().equals(this.getEventIngestionUrl()) == false)
            return false;
        return true;
    }
}

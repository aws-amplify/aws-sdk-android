/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * A set of endpoints used by clients to connect to the media service group for
 * a Amazon Chime SDK meeting.
 * </p>
 */
public class MediaPlacement implements Serializable {
    /**
     * <p>
     * The audio host URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String audioHostUrl;

    /**
     * <p>
     * The audio fallback URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String audioFallbackUrl;

    /**
     * <p>
     * The screen data URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String screenDataUrl;

    /**
     * <p>
     * The screen sharing URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String screenSharingUrl;

    /**
     * <p>
     * The screen viewing URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String screenViewingUrl;

    /**
     * <p>
     * The signaling URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String signalingUrl;

    /**
     * <p>
     * The turn control URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String turnControlUrl;

    /**
     * <p>
     * The audio host URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
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
     * <b>Length: </b> - 4096<br/>
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
     * <b>Length: </b> - 4096<br/>
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
     * <b>Length: </b> - 4096<br/>
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
     * <b>Length: </b> - 4096<br/>
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
     * <b>Length: </b> - 4096<br/>
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
     * The screen data URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @return <p>
     *         The screen data URL.
     *         </p>
     */
    public String getScreenDataUrl() {
        return screenDataUrl;
    }

    /**
     * <p>
     * The screen data URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param screenDataUrl <p>
     *            The screen data URL.
     *            </p>
     */
    public void setScreenDataUrl(String screenDataUrl) {
        this.screenDataUrl = screenDataUrl;
    }

    /**
     * <p>
     * The screen data URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param screenDataUrl <p>
     *            The screen data URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaPlacement withScreenDataUrl(String screenDataUrl) {
        this.screenDataUrl = screenDataUrl;
        return this;
    }

    /**
     * <p>
     * The screen sharing URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @return <p>
     *         The screen sharing URL.
     *         </p>
     */
    public String getScreenSharingUrl() {
        return screenSharingUrl;
    }

    /**
     * <p>
     * The screen sharing URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param screenSharingUrl <p>
     *            The screen sharing URL.
     *            </p>
     */
    public void setScreenSharingUrl(String screenSharingUrl) {
        this.screenSharingUrl = screenSharingUrl;
    }

    /**
     * <p>
     * The screen sharing URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param screenSharingUrl <p>
     *            The screen sharing URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaPlacement withScreenSharingUrl(String screenSharingUrl) {
        this.screenSharingUrl = screenSharingUrl;
        return this;
    }

    /**
     * <p>
     * The screen viewing URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @return <p>
     *         The screen viewing URL.
     *         </p>
     */
    public String getScreenViewingUrl() {
        return screenViewingUrl;
    }

    /**
     * <p>
     * The screen viewing URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param screenViewingUrl <p>
     *            The screen viewing URL.
     *            </p>
     */
    public void setScreenViewingUrl(String screenViewingUrl) {
        this.screenViewingUrl = screenViewingUrl;
    }

    /**
     * <p>
     * The screen viewing URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param screenViewingUrl <p>
     *            The screen viewing URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaPlacement withScreenViewingUrl(String screenViewingUrl) {
        this.screenViewingUrl = screenViewingUrl;
        return this;
    }

    /**
     * <p>
     * The signaling URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
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
     * <b>Length: </b> - 4096<br/>
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
     * <b>Length: </b> - 4096<br/>
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
     * <b>Length: </b> - 4096<br/>
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
     * <b>Length: </b> - 4096<br/>
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
     * <b>Length: </b> - 4096<br/>
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
        if (getScreenDataUrl() != null)
            sb.append("ScreenDataUrl: " + getScreenDataUrl() + ",");
        if (getScreenSharingUrl() != null)
            sb.append("ScreenSharingUrl: " + getScreenSharingUrl() + ",");
        if (getScreenViewingUrl() != null)
            sb.append("ScreenViewingUrl: " + getScreenViewingUrl() + ",");
        if (getSignalingUrl() != null)
            sb.append("SignalingUrl: " + getSignalingUrl() + ",");
        if (getTurnControlUrl() != null)
            sb.append("TurnControlUrl: " + getTurnControlUrl());
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
                + ((getScreenDataUrl() == null) ? 0 : getScreenDataUrl().hashCode());
        hashCode = prime * hashCode
                + ((getScreenSharingUrl() == null) ? 0 : getScreenSharingUrl().hashCode());
        hashCode = prime * hashCode
                + ((getScreenViewingUrl() == null) ? 0 : getScreenViewingUrl().hashCode());
        hashCode = prime * hashCode
                + ((getSignalingUrl() == null) ? 0 : getSignalingUrl().hashCode());
        hashCode = prime * hashCode
                + ((getTurnControlUrl() == null) ? 0 : getTurnControlUrl().hashCode());
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
        if (other.getScreenDataUrl() == null ^ this.getScreenDataUrl() == null)
            return false;
        if (other.getScreenDataUrl() != null
                && other.getScreenDataUrl().equals(this.getScreenDataUrl()) == false)
            return false;
        if (other.getScreenSharingUrl() == null ^ this.getScreenSharingUrl() == null)
            return false;
        if (other.getScreenSharingUrl() != null
                && other.getScreenSharingUrl().equals(this.getScreenSharingUrl()) == false)
            return false;
        if (other.getScreenViewingUrl() == null ^ this.getScreenViewingUrl() == null)
            return false;
        if (other.getScreenViewingUrl() != null
                && other.getScreenViewingUrl().equals(this.getScreenViewingUrl()) == false)
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
        return true;
    }
}

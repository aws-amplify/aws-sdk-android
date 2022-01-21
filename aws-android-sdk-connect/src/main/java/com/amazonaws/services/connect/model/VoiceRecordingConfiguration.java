/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about the recording configuration settings.
 * </p>
 */
public class VoiceRecordingConfiguration implements Serializable {
    /**
     * <p>
     * Identifies which track is being recorded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FROM_AGENT, TO_AGENT, ALL
     */
    private String voiceRecordingTrack;

    /**
     * <p>
     * Identifies which track is being recorded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FROM_AGENT, TO_AGENT, ALL
     *
     * @return <p>
     *         Identifies which track is being recorded.
     *         </p>
     * @see VoiceRecordingTrack
     */
    public String getVoiceRecordingTrack() {
        return voiceRecordingTrack;
    }

    /**
     * <p>
     * Identifies which track is being recorded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FROM_AGENT, TO_AGENT, ALL
     *
     * @param voiceRecordingTrack <p>
     *            Identifies which track is being recorded.
     *            </p>
     * @see VoiceRecordingTrack
     */
    public void setVoiceRecordingTrack(String voiceRecordingTrack) {
        this.voiceRecordingTrack = voiceRecordingTrack;
    }

    /**
     * <p>
     * Identifies which track is being recorded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FROM_AGENT, TO_AGENT, ALL
     *
     * @param voiceRecordingTrack <p>
     *            Identifies which track is being recorded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VoiceRecordingTrack
     */
    public VoiceRecordingConfiguration withVoiceRecordingTrack(String voiceRecordingTrack) {
        this.voiceRecordingTrack = voiceRecordingTrack;
        return this;
    }

    /**
     * <p>
     * Identifies which track is being recorded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FROM_AGENT, TO_AGENT, ALL
     *
     * @param voiceRecordingTrack <p>
     *            Identifies which track is being recorded.
     *            </p>
     * @see VoiceRecordingTrack
     */
    public void setVoiceRecordingTrack(VoiceRecordingTrack voiceRecordingTrack) {
        this.voiceRecordingTrack = voiceRecordingTrack.toString();
    }

    /**
     * <p>
     * Identifies which track is being recorded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FROM_AGENT, TO_AGENT, ALL
     *
     * @param voiceRecordingTrack <p>
     *            Identifies which track is being recorded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VoiceRecordingTrack
     */
    public VoiceRecordingConfiguration withVoiceRecordingTrack(
            VoiceRecordingTrack voiceRecordingTrack) {
        this.voiceRecordingTrack = voiceRecordingTrack.toString();
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
        if (getVoiceRecordingTrack() != null)
            sb.append("VoiceRecordingTrack: " + getVoiceRecordingTrack());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVoiceRecordingTrack() == null) ? 0 : getVoiceRecordingTrack().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceRecordingConfiguration == false)
            return false;
        VoiceRecordingConfiguration other = (VoiceRecordingConfiguration) obj;

        if (other.getVoiceRecordingTrack() == null ^ this.getVoiceRecordingTrack() == null)
            return false;
        if (other.getVoiceRecordingTrack() != null
                && other.getVoiceRecordingTrack().equals(this.getVoiceRecordingTrack()) == false)
            return false;
        return true;
    }
}

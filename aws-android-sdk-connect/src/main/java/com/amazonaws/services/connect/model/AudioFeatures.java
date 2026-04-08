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
 * Has audio-specific configurations as the operating parameter for Echo
 * Reduction.
 * </p>
 */
public class AudioFeatures implements Serializable {
    /**
     * <p>
     * Makes echo reduction available to clients who connect to the meeting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNAVAILABLE
     */
    private String echoReduction;

    /**
     * <p>
     * Makes echo reduction available to clients who connect to the meeting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNAVAILABLE
     *
     * @return <p>
     *         Makes echo reduction available to clients who connect to the
     *         meeting.
     *         </p>
     * @see MeetingFeatureStatus
     */
    public String getEchoReduction() {
        return echoReduction;
    }

    /**
     * <p>
     * Makes echo reduction available to clients who connect to the meeting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNAVAILABLE
     *
     * @param echoReduction <p>
     *            Makes echo reduction available to clients who connect to the
     *            meeting.
     *            </p>
     * @see MeetingFeatureStatus
     */
    public void setEchoReduction(String echoReduction) {
        this.echoReduction = echoReduction;
    }

    /**
     * <p>
     * Makes echo reduction available to clients who connect to the meeting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNAVAILABLE
     *
     * @param echoReduction <p>
     *            Makes echo reduction available to clients who connect to the
     *            meeting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MeetingFeatureStatus
     */
    public AudioFeatures withEchoReduction(String echoReduction) {
        this.echoReduction = echoReduction;
        return this;
    }

    /**
     * <p>
     * Makes echo reduction available to clients who connect to the meeting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNAVAILABLE
     *
     * @param echoReduction <p>
     *            Makes echo reduction available to clients who connect to the
     *            meeting.
     *            </p>
     * @see MeetingFeatureStatus
     */
    public void setEchoReduction(MeetingFeatureStatus echoReduction) {
        this.echoReduction = echoReduction.toString();
    }

    /**
     * <p>
     * Makes echo reduction available to clients who connect to the meeting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNAVAILABLE
     *
     * @param echoReduction <p>
     *            Makes echo reduction available to clients who connect to the
     *            meeting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MeetingFeatureStatus
     */
    public AudioFeatures withEchoReduction(MeetingFeatureStatus echoReduction) {
        this.echoReduction = echoReduction.toString();
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
        if (getEchoReduction() != null)
            sb.append("EchoReduction: " + getEchoReduction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEchoReduction() == null) ? 0 : getEchoReduction().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioFeatures == false)
            return false;
        AudioFeatures other = (AudioFeatures) obj;

        if (other.getEchoReduction() == null ^ this.getEchoReduction() == null)
            return false;
        if (other.getEchoReduction() != null
                && other.getEchoReduction().equals(this.getEchoReduction()) == false)
            return false;
        return true;
    }
}

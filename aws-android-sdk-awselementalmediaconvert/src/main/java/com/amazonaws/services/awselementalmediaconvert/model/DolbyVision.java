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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * Settings for Dolby Vision
 */
public class DolbyVision implements Serializable {
    /**
     * Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to
     * override the MaxCLL and MaxFALL values in your input with new values.
     */
    private DolbyVisionLevel6Metadata l6Metadata;

    /**
     * Use Dolby Vision Mode to choose how the service will handle Dolby Vision
     * MaxCLL and MaxFALL properies.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, RECALCULATE, SPECIFY
     */
    private String l6Mode;

    /**
     * In the current MediaConvert implementation, the Dolby Vision profile is
     * always 5 (PROFILE_5). Therefore, all of your inputs must contain Dolby
     * Vision frame interleaved data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROFILE_5
     */
    private String profile;

    /**
     * Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to
     * override the MaxCLL and MaxFALL values in your input with new values.
     *
     * @return Use these settings when you set DolbyVisionLevel6Mode to SPECIFY
     *         to override the MaxCLL and MaxFALL values in your input with new
     *         values.
     */
    public DolbyVisionLevel6Metadata getL6Metadata() {
        return l6Metadata;
    }

    /**
     * Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to
     * override the MaxCLL and MaxFALL values in your input with new values.
     *
     * @param l6Metadata Use these settings when you set DolbyVisionLevel6Mode
     *            to SPECIFY to override the MaxCLL and MaxFALL values in your
     *            input with new values.
     */
    public void setL6Metadata(DolbyVisionLevel6Metadata l6Metadata) {
        this.l6Metadata = l6Metadata;
    }

    /**
     * Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to
     * override the MaxCLL and MaxFALL values in your input with new values.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param l6Metadata Use these settings when you set DolbyVisionLevel6Mode
     *            to SPECIFY to override the MaxCLL and MaxFALL values in your
     *            input with new values.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DolbyVision withL6Metadata(DolbyVisionLevel6Metadata l6Metadata) {
        this.l6Metadata = l6Metadata;
        return this;
    }

    /**
     * Use Dolby Vision Mode to choose how the service will handle Dolby Vision
     * MaxCLL and MaxFALL properies.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, RECALCULATE, SPECIFY
     *
     * @return Use Dolby Vision Mode to choose how the service will handle Dolby
     *         Vision MaxCLL and MaxFALL properies.
     * @see DolbyVisionLevel6Mode
     */
    public String getL6Mode() {
        return l6Mode;
    }

    /**
     * Use Dolby Vision Mode to choose how the service will handle Dolby Vision
     * MaxCLL and MaxFALL properies.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, RECALCULATE, SPECIFY
     *
     * @param l6Mode Use Dolby Vision Mode to choose how the service will handle
     *            Dolby Vision MaxCLL and MaxFALL properies.
     * @see DolbyVisionLevel6Mode
     */
    public void setL6Mode(String l6Mode) {
        this.l6Mode = l6Mode;
    }

    /**
     * Use Dolby Vision Mode to choose how the service will handle Dolby Vision
     * MaxCLL and MaxFALL properies.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, RECALCULATE, SPECIFY
     *
     * @param l6Mode Use Dolby Vision Mode to choose how the service will handle
     *            Dolby Vision MaxCLL and MaxFALL properies.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DolbyVisionLevel6Mode
     */
    public DolbyVision withL6Mode(String l6Mode) {
        this.l6Mode = l6Mode;
        return this;
    }

    /**
     * Use Dolby Vision Mode to choose how the service will handle Dolby Vision
     * MaxCLL and MaxFALL properies.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, RECALCULATE, SPECIFY
     *
     * @param l6Mode Use Dolby Vision Mode to choose how the service will handle
     *            Dolby Vision MaxCLL and MaxFALL properies.
     * @see DolbyVisionLevel6Mode
     */
    public void setL6Mode(DolbyVisionLevel6Mode l6Mode) {
        this.l6Mode = l6Mode.toString();
    }

    /**
     * Use Dolby Vision Mode to choose how the service will handle Dolby Vision
     * MaxCLL and MaxFALL properies.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, RECALCULATE, SPECIFY
     *
     * @param l6Mode Use Dolby Vision Mode to choose how the service will handle
     *            Dolby Vision MaxCLL and MaxFALL properies.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DolbyVisionLevel6Mode
     */
    public DolbyVision withL6Mode(DolbyVisionLevel6Mode l6Mode) {
        this.l6Mode = l6Mode.toString();
        return this;
    }

    /**
     * In the current MediaConvert implementation, the Dolby Vision profile is
     * always 5 (PROFILE_5). Therefore, all of your inputs must contain Dolby
     * Vision frame interleaved data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROFILE_5
     *
     * @return In the current MediaConvert implementation, the Dolby Vision
     *         profile is always 5 (PROFILE_5). Therefore, all of your inputs
     *         must contain Dolby Vision frame interleaved data.
     * @see DolbyVisionProfile
     */
    public String getProfile() {
        return profile;
    }

    /**
     * In the current MediaConvert implementation, the Dolby Vision profile is
     * always 5 (PROFILE_5). Therefore, all of your inputs must contain Dolby
     * Vision frame interleaved data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROFILE_5
     *
     * @param profile In the current MediaConvert implementation, the Dolby
     *            Vision profile is always 5 (PROFILE_5). Therefore, all of your
     *            inputs must contain Dolby Vision frame interleaved data.
     * @see DolbyVisionProfile
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * In the current MediaConvert implementation, the Dolby Vision profile is
     * always 5 (PROFILE_5). Therefore, all of your inputs must contain Dolby
     * Vision frame interleaved data.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROFILE_5
     *
     * @param profile In the current MediaConvert implementation, the Dolby
     *            Vision profile is always 5 (PROFILE_5). Therefore, all of your
     *            inputs must contain Dolby Vision frame interleaved data.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DolbyVisionProfile
     */
    public DolbyVision withProfile(String profile) {
        this.profile = profile;
        return this;
    }

    /**
     * In the current MediaConvert implementation, the Dolby Vision profile is
     * always 5 (PROFILE_5). Therefore, all of your inputs must contain Dolby
     * Vision frame interleaved data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROFILE_5
     *
     * @param profile In the current MediaConvert implementation, the Dolby
     *            Vision profile is always 5 (PROFILE_5). Therefore, all of your
     *            inputs must contain Dolby Vision frame interleaved data.
     * @see DolbyVisionProfile
     */
    public void setProfile(DolbyVisionProfile profile) {
        this.profile = profile.toString();
    }

    /**
     * In the current MediaConvert implementation, the Dolby Vision profile is
     * always 5 (PROFILE_5). Therefore, all of your inputs must contain Dolby
     * Vision frame interleaved data.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROFILE_5
     *
     * @param profile In the current MediaConvert implementation, the Dolby
     *            Vision profile is always 5 (PROFILE_5). Therefore, all of your
     *            inputs must contain Dolby Vision frame interleaved data.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DolbyVisionProfile
     */
    public DolbyVision withProfile(DolbyVisionProfile profile) {
        this.profile = profile.toString();
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
        if (getL6Metadata() != null)
            sb.append("L6Metadata: " + getL6Metadata() + ",");
        if (getL6Mode() != null)
            sb.append("L6Mode: " + getL6Mode() + ",");
        if (getProfile() != null)
            sb.append("Profile: " + getProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getL6Metadata() == null) ? 0 : getL6Metadata().hashCode());
        hashCode = prime * hashCode + ((getL6Mode() == null) ? 0 : getL6Mode().hashCode());
        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DolbyVision == false)
            return false;
        DolbyVision other = (DolbyVision) obj;

        if (other.getL6Metadata() == null ^ this.getL6Metadata() == null)
            return false;
        if (other.getL6Metadata() != null
                && other.getL6Metadata().equals(this.getL6Metadata()) == false)
            return false;
        if (other.getL6Mode() == null ^ this.getL6Mode() == null)
            return false;
        if (other.getL6Mode() != null && other.getL6Mode().equals(this.getL6Mode()) == false)
            return false;
        if (other.getProfile() == null ^ this.getProfile() == null)
            return false;
        if (other.getProfile() != null && other.getProfile().equals(this.getProfile()) == false)
            return false;
        return true;
    }
}

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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the Amazon GuardDuty detector specified by the detectorId.
 * </p>
 */
public class UpdateDetectorRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of the detector to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * Specifies whether the detector is enabled or not enabled.
     * </p>
     */
    private Boolean enable;

    /**
     * <p>
     * An enum value that specifies how frequently findings are exported, such
     * as to CloudWatch Events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     */
    private String findingPublishingFrequency;

    /**
     * <p>
     * The unique ID of the detector to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The unique ID of the detector to update.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector to update.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDetectorRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * Specifies whether the detector is enabled or not enabled.
     * </p>
     *
     * @return <p>
     *         Specifies whether the detector is enabled or not enabled.
     *         </p>
     */
    public Boolean isEnable() {
        return enable;
    }

    /**
     * <p>
     * Specifies whether the detector is enabled or not enabled.
     * </p>
     *
     * @return <p>
     *         Specifies whether the detector is enabled or not enabled.
     *         </p>
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * <p>
     * Specifies whether the detector is enabled or not enabled.
     * </p>
     *
     * @param enable <p>
     *            Specifies whether the detector is enabled or not enabled.
     *            </p>
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * <p>
     * Specifies whether the detector is enabled or not enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enable <p>
     *            Specifies whether the detector is enabled or not enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDetectorRequest withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * <p>
     * An enum value that specifies how frequently findings are exported, such
     * as to CloudWatch Events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @return <p>
     *         An enum value that specifies how frequently findings are
     *         exported, such as to CloudWatch Events.
     *         </p>
     * @see FindingPublishingFrequency
     */
    public String getFindingPublishingFrequency() {
        return findingPublishingFrequency;
    }

    /**
     * <p>
     * An enum value that specifies how frequently findings are exported, such
     * as to CloudWatch Events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency <p>
     *            An enum value that specifies how frequently findings are
     *            exported, such as to CloudWatch Events.
     *            </p>
     * @see FindingPublishingFrequency
     */
    public void setFindingPublishingFrequency(String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
    }

    /**
     * <p>
     * An enum value that specifies how frequently findings are exported, such
     * as to CloudWatch Events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency <p>
     *            An enum value that specifies how frequently findings are
     *            exported, such as to CloudWatch Events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingPublishingFrequency
     */
    public UpdateDetectorRequest withFindingPublishingFrequency(String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
        return this;
    }

    /**
     * <p>
     * An enum value that specifies how frequently findings are exported, such
     * as to CloudWatch Events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency <p>
     *            An enum value that specifies how frequently findings are
     *            exported, such as to CloudWatch Events.
     *            </p>
     * @see FindingPublishingFrequency
     */
    public void setFindingPublishingFrequency(FindingPublishingFrequency findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency.toString();
    }

    /**
     * <p>
     * An enum value that specifies how frequently findings are exported, such
     * as to CloudWatch Events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency <p>
     *            An enum value that specifies how frequently findings are
     *            exported, such as to CloudWatch Events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingPublishingFrequency
     */
    public UpdateDetectorRequest withFindingPublishingFrequency(
            FindingPublishingFrequency findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency.toString();
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
        if (getDetectorId() != null)
            sb.append("DetectorId: " + getDetectorId() + ",");
        if (getEnable() != null)
            sb.append("Enable: " + getEnable() + ",");
        if (getFindingPublishingFrequency() != null)
            sb.append("FindingPublishingFrequency: " + getFindingPublishingFrequency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getEnable() == null) ? 0 : getEnable().hashCode());
        hashCode = prime
                * hashCode
                + ((getFindingPublishingFrequency() == null) ? 0 : getFindingPublishingFrequency()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDetectorRequest == false)
            return false;
        UpdateDetectorRequest other = (UpdateDetectorRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getEnable() == null ^ this.getEnable() == null)
            return false;
        if (other.getEnable() != null && other.getEnable().equals(this.getEnable()) == false)
            return false;
        if (other.getFindingPublishingFrequency() == null
                ^ this.getFindingPublishingFrequency() == null)
            return false;
        if (other.getFindingPublishingFrequency() != null
                && other.getFindingPublishingFrequency().equals(
                        this.getFindingPublishingFrequency()) == false)
            return false;
        return true;
    }
}

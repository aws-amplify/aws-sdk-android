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

package com.amazonaws.services.amazonfrauddetector.model;

import java.io.Serializable;

/**
 * <p>
 * The summary of the detector version.
 * </p>
 */
public class DetectorVersionSummary implements Serializable {
    /**
     * <p>
     * The detector version ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String detectorVersionId;

    /**
     * <p>
     * The detector version status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     */
    private String status;

    /**
     * <p>
     * The detector version description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String description;

    /**
     * <p>
     * Timestamp of when the detector version was last updated.
     * </p>
     */
    private String lastUpdatedTime;

    /**
     * <p>
     * The detector version ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The detector version ID.
     *         </p>
     */
    public String getDetectorVersionId() {
        return detectorVersionId;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param detectorVersionId <p>
     *            The detector version ID.
     *            </p>
     */
    public void setDetectorVersionId(String detectorVersionId) {
        this.detectorVersionId = detectorVersionId;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param detectorVersionId <p>
     *            The detector version ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorVersionSummary withDetectorVersionId(String detectorVersionId) {
        this.detectorVersionId = detectorVersionId;
        return this;
    }

    /**
     * <p>
     * The detector version status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     *
     * @return <p>
     *         The detector version status.
     *         </p>
     * @see DetectorVersionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The detector version status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The detector version status.
     *            </p>
     * @see DetectorVersionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The detector version status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The detector version status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DetectorVersionStatus
     */
    public DetectorVersionSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The detector version status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The detector version status.
     *            </p>
     * @see DetectorVersionStatus
     */
    public void setStatus(DetectorVersionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The detector version status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The detector version status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DetectorVersionStatus
     */
    public DetectorVersionSummary withStatus(DetectorVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The detector version description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The detector version description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The detector version description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            The detector version description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The detector version description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            The detector version description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorVersionSummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Timestamp of when the detector version was last updated.
     * </p>
     *
     * @return <p>
     *         Timestamp of when the detector version was last updated.
     *         </p>
     */
    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of when the detector version was last updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            Timestamp of when the detector version was last updated.
     *            </p>
     */
    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of when the detector version was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            Timestamp of when the detector version was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorVersionSummary withLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
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
        if (getDetectorVersionId() != null)
            sb.append("detectorVersionId: " + getDetectorVersionId() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("lastUpdatedTime: " + getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDetectorVersionId() == null) ? 0 : getDetectorVersionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectorVersionSummary == false)
            return false;
        DetectorVersionSummary other = (DetectorVersionSummary) obj;

        if (other.getDetectorVersionId() == null ^ this.getDetectorVersionId() == null)
            return false;
        if (other.getDetectorVersionId() != null
                && other.getDetectorVersionId().equals(this.getDetectorVersionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }
}

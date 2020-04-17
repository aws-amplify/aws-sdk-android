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

public class CreateDetectorVersionResult implements Serializable {
    /**
     * <p>
     * The ID for the created version's parent detector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     */
    private String detectorId;

    /**
     * <p>
     * The ID for the created detector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String detectorVersionId;

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     */
    private String status;

    /**
     * <p>
     * The ID for the created version's parent detector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @return <p>
     *         The ID for the created version's parent detector.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The ID for the created version's parent detector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @param detectorId <p>
     *            The ID for the created version's parent detector.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID for the created version's parent detector.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @param detectorId <p>
     *            The ID for the created version's parent detector.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDetectorVersionResult withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The ID for the created detector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The ID for the created detector.
     *         </p>
     */
    public String getDetectorVersionId() {
        return detectorVersionId;
    }

    /**
     * <p>
     * The ID for the created detector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param detectorVersionId <p>
     *            The ID for the created detector.
     *            </p>
     */
    public void setDetectorVersionId(String detectorVersionId) {
        this.detectorVersionId = detectorVersionId;
    }

    /**
     * <p>
     * The ID for the created detector.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param detectorVersionId <p>
     *            The ID for the created detector.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDetectorVersionResult withDetectorVersionId(String detectorVersionId) {
        this.detectorVersionId = detectorVersionId;
        return this;
    }

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     *
     * @return <p>
     *         The status of the detector version.
     *         </p>
     * @see DetectorVersionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the detector version.
     *            </p>
     * @see DetectorVersionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the detector version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DetectorVersionStatus
     */
    public CreateDetectorVersionResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the detector version.
     *            </p>
     * @see DetectorVersionStatus
     */
    public void setStatus(DetectorVersionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the detector version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DetectorVersionStatus
     */
    public CreateDetectorVersionResult withStatus(DetectorVersionStatus status) {
        this.status = status.toString();
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
            sb.append("detectorId: " + getDetectorId() + ",");
        if (getDetectorVersionId() != null)
            sb.append("detectorVersionId: " + getDetectorVersionId() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode
                + ((getDetectorVersionId() == null) ? 0 : getDetectorVersionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDetectorVersionResult == false)
            return false;
        CreateDetectorVersionResult other = (CreateDetectorVersionResult) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDetectorVersionId() == null ^ this.getDetectorVersionId() == null)
            return false;
        if (other.getDetectorVersionId() != null
                && other.getDetectorVersionId().equals(this.getDetectorVersionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}

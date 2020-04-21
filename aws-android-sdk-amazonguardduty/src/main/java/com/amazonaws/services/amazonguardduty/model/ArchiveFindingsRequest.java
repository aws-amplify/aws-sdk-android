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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Archives GuardDuty findings that are specified by the list of finding IDs.
 * </p>
 * <note>
 * <p>
 * Only the master account can archive findings. Member accounts don't have
 * permission to archive findings from their accounts.
 * </p>
 * </note>
 */
public class ArchiveFindingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose
     * findings you want to archive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * The IDs of the findings that you want to archive.
     * </p>
     */
    private java.util.List<String> findingIds;

    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose
     * findings you want to archive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The ID of the detector that specifies the GuardDuty service whose
     *         findings you want to archive.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose
     * findings you want to archive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The ID of the detector that specifies the GuardDuty service
     *            whose findings you want to archive.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose
     * findings you want to archive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The ID of the detector that specifies the GuardDuty service
     *            whose findings you want to archive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ArchiveFindingsRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The IDs of the findings that you want to archive.
     * </p>
     *
     * @return <p>
     *         The IDs of the findings that you want to archive.
     *         </p>
     */
    public java.util.List<String> getFindingIds() {
        return findingIds;
    }

    /**
     * <p>
     * The IDs of the findings that you want to archive.
     * </p>
     *
     * @param findingIds <p>
     *            The IDs of the findings that you want to archive.
     *            </p>
     */
    public void setFindingIds(java.util.Collection<String> findingIds) {
        if (findingIds == null) {
            this.findingIds = null;
            return;
        }

        this.findingIds = new java.util.ArrayList<String>(findingIds);
    }

    /**
     * <p>
     * The IDs of the findings that you want to archive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingIds <p>
     *            The IDs of the findings that you want to archive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ArchiveFindingsRequest withFindingIds(String... findingIds) {
        if (getFindingIds() == null) {
            this.findingIds = new java.util.ArrayList<String>(findingIds.length);
        }
        for (String value : findingIds) {
            this.findingIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the findings that you want to archive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingIds <p>
     *            The IDs of the findings that you want to archive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ArchiveFindingsRequest withFindingIds(java.util.Collection<String> findingIds) {
        setFindingIds(findingIds);
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
        if (getFindingIds() != null)
            sb.append("FindingIds: " + getFindingIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getFindingIds() == null) ? 0 : getFindingIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArchiveFindingsRequest == false)
            return false;
        ArchiveFindingsRequest other = (ArchiveFindingsRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getFindingIds() == null ^ this.getFindingIds() == null)
            return false;
        if (other.getFindingIds() != null
                && other.getFindingIds().equals(this.getFindingIds()) == false)
            return false;
        return true;
    }
}

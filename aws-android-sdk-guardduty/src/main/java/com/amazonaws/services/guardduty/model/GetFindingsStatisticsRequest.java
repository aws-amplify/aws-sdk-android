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
 * Lists Amazon GuardDuty findings statistics for the specified detector ID.
 * </p>
 */
public class GetFindingsStatisticsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose
     * findings' statistics you want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * The types of finding statistics to retrieve.
     * </p>
     */
    private java.util.List<String> findingStatisticTypes;

    /**
     * <p>
     * Represents the criteria that is used for querying findings.
     * </p>
     */
    private FindingCriteria findingCriteria;

    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose
     * findings' statistics you want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The ID of the detector that specifies the GuardDuty service whose
     *         findings' statistics you want to retrieve.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose
     * findings' statistics you want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The ID of the detector that specifies the GuardDuty service
     *            whose findings' statistics you want to retrieve.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose
     * findings' statistics you want to retrieve.
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
     *            whose findings' statistics you want to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsStatisticsRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The types of finding statistics to retrieve.
     * </p>
     *
     * @return <p>
     *         The types of finding statistics to retrieve.
     *         </p>
     */
    public java.util.List<String> getFindingStatisticTypes() {
        return findingStatisticTypes;
    }

    /**
     * <p>
     * The types of finding statistics to retrieve.
     * </p>
     *
     * @param findingStatisticTypes <p>
     *            The types of finding statistics to retrieve.
     *            </p>
     */
    public void setFindingStatisticTypes(java.util.Collection<String> findingStatisticTypes) {
        if (findingStatisticTypes == null) {
            this.findingStatisticTypes = null;
            return;
        }

        this.findingStatisticTypes = new java.util.ArrayList<String>(findingStatisticTypes);
    }

    /**
     * <p>
     * The types of finding statistics to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingStatisticTypes <p>
     *            The types of finding statistics to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsStatisticsRequest withFindingStatisticTypes(String... findingStatisticTypes) {
        if (getFindingStatisticTypes() == null) {
            this.findingStatisticTypes = new java.util.ArrayList<String>(
                    findingStatisticTypes.length);
        }
        for (String value : findingStatisticTypes) {
            this.findingStatisticTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The types of finding statistics to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingStatisticTypes <p>
     *            The types of finding statistics to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsStatisticsRequest withFindingStatisticTypes(
            java.util.Collection<String> findingStatisticTypes) {
        setFindingStatisticTypes(findingStatisticTypes);
        return this;
    }

    /**
     * <p>
     * Represents the criteria that is used for querying findings.
     * </p>
     *
     * @return <p>
     *         Represents the criteria that is used for querying findings.
     *         </p>
     */
    public FindingCriteria getFindingCriteria() {
        return findingCriteria;
    }

    /**
     * <p>
     * Represents the criteria that is used for querying findings.
     * </p>
     *
     * @param findingCriteria <p>
     *            Represents the criteria that is used for querying findings.
     *            </p>
     */
    public void setFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
    }

    /**
     * <p>
     * Represents the criteria that is used for querying findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingCriteria <p>
     *            Represents the criteria that is used for querying findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsStatisticsRequest withFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
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
        if (getFindingStatisticTypes() != null)
            sb.append("FindingStatisticTypes: " + getFindingStatisticTypes() + ",");
        if (getFindingCriteria() != null)
            sb.append("FindingCriteria: " + getFindingCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime
                * hashCode
                + ((getFindingStatisticTypes() == null) ? 0 : getFindingStatisticTypes().hashCode());
        hashCode = prime * hashCode
                + ((getFindingCriteria() == null) ? 0 : getFindingCriteria().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingsStatisticsRequest == false)
            return false;
        GetFindingsStatisticsRequest other = (GetFindingsStatisticsRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getFindingStatisticTypes() == null ^ this.getFindingStatisticTypes() == null)
            return false;
        if (other.getFindingStatisticTypes() != null
                && other.getFindingStatisticTypes().equals(this.getFindingStatisticTypes()) == false)
            return false;
        if (other.getFindingCriteria() == null ^ this.getFindingCriteria() == null)
            return false;
        if (other.getFindingCriteria() != null
                && other.getFindingCriteria().equals(this.getFindingCriteria()) == false)
            return false;
        return true;
    }
}

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
 * Updates the filter specified by the filter name.
 * </p>
 */
public class UpdateFilterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of the detector that specifies the GuardDuty service where
     * you want to update a filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * The name of the filter.
     * </p>
     */
    private String filterName;

    /**
     * <p>
     * The description of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     */
    private String description;

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the
     * filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>NOOP, ARCHIVE
     */
    private String action;

    /**
     * <p>
     * Specifies the position of the filter in the list of current filters. Also
     * specifies the order in which this filter is applied to the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer rank;

    /**
     * <p>
     * Represents the criteria to be used in the filter for querying findings.
     * </p>
     */
    private FindingCriteria findingCriteria;

    /**
     * <p>
     * The unique ID of the detector that specifies the GuardDuty service where
     * you want to update a filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The unique ID of the detector that specifies the GuardDuty
     *         service where you want to update a filter.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector that specifies the GuardDuty service where
     * you want to update a filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector that specifies the GuardDuty
     *            service where you want to update a filter.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector that specifies the GuardDuty service where
     * you want to update a filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector that specifies the GuardDuty
     *            service where you want to update a filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFilterRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     *
     * @return <p>
     *         The name of the filter.
     *         </p>
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     *
     * @param filterName <p>
     *            The name of the filter.
     *            </p>
     */
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterName <p>
     *            The name of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFilterRequest withFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }

    /**
     * <p>
     * The description of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @return <p>
     *         The description of the filter.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param description <p>
     *            The description of the filter.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param description <p>
     *            The description of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFilterRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the
     * filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>NOOP, ARCHIVE
     *
     * @return <p>
     *         Specifies the action that is to be applied to the findings that
     *         match the filter.
     *         </p>
     * @see FilterAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the
     * filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>NOOP, ARCHIVE
     *
     * @param action <p>
     *            Specifies the action that is to be applied to the findings
     *            that match the filter.
     *            </p>
     * @see FilterAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the
     * filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>NOOP, ARCHIVE
     *
     * @param action <p>
     *            Specifies the action that is to be applied to the findings
     *            that match the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FilterAction
     */
    public UpdateFilterRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the
     * filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>NOOP, ARCHIVE
     *
     * @param action <p>
     *            Specifies the action that is to be applied to the findings
     *            that match the filter.
     *            </p>
     * @see FilterAction
     */
    public void setAction(FilterAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the
     * filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>NOOP, ARCHIVE
     *
     * @param action <p>
     *            Specifies the action that is to be applied to the findings
     *            that match the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FilterAction
     */
    public UpdateFilterRequest withAction(FilterAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the position of the filter in the list of current filters. Also
     * specifies the order in which this filter is applied to the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         Specifies the position of the filter in the list of current
     *         filters. Also specifies the order in which this filter is applied
     *         to the findings.
     *         </p>
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * <p>
     * Specifies the position of the filter in the list of current filters. Also
     * specifies the order in which this filter is applied to the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param rank <p>
     *            Specifies the position of the filter in the list of current
     *            filters. Also specifies the order in which this filter is
     *            applied to the findings.
     *            </p>
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * <p>
     * Specifies the position of the filter in the list of current filters. Also
     * specifies the order in which this filter is applied to the findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param rank <p>
     *            Specifies the position of the filter in the list of current
     *            filters. Also specifies the order in which this filter is
     *            applied to the findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFilterRequest withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * <p>
     * Represents the criteria to be used in the filter for querying findings.
     * </p>
     *
     * @return <p>
     *         Represents the criteria to be used in the filter for querying
     *         findings.
     *         </p>
     */
    public FindingCriteria getFindingCriteria() {
        return findingCriteria;
    }

    /**
     * <p>
     * Represents the criteria to be used in the filter for querying findings.
     * </p>
     *
     * @param findingCriteria <p>
     *            Represents the criteria to be used in the filter for querying
     *            findings.
     *            </p>
     */
    public void setFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
    }

    /**
     * <p>
     * Represents the criteria to be used in the filter for querying findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingCriteria <p>
     *            Represents the criteria to be used in the filter for querying
     *            findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFilterRequest withFindingCriteria(FindingCriteria findingCriteria) {
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
        if (getFilterName() != null)
            sb.append("FilterName: " + getFilterName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getRank() != null)
            sb.append("Rank: " + getRank() + ",");
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
        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
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

        if (obj instanceof UpdateFilterRequest == false)
            return false;
        UpdateFilterRequest other = (UpdateFilterRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getFilterName() == null ^ this.getFilterName() == null)
            return false;
        if (other.getFilterName() != null
                && other.getFilterName().equals(this.getFilterName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getRank() == null ^ this.getRank() == null)
            return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false)
            return false;
        if (other.getFindingCriteria() == null ^ this.getFindingCriteria() == null)
            return false;
        if (other.getFindingCriteria() != null
                && other.getFindingCriteria().equals(this.getFindingCriteria()) == false)
            return false;
        return true;
    }
}

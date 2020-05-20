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

package com.amazonaws.services.securityhub.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * <code>UpdateFindings</code> is deprecated. Instead of
 * <code>UpdateFindings</code>, use <code>BatchUpdateFindings</code>.
 * </p>
 * <p>
 * Updates the <code>Note</code> and <code>RecordState</code> of the Security
 * Hub-aggregated findings that the filter attributes specify. Any member
 * account that can view the finding also sees the update to the finding.
 * </p>
 */
public class UpdateFindingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A collection of attributes that specify which findings you want to
     * update.
     * </p>
     */
    private AwsSecurityFindingFilters filters;

    /**
     * <p>
     * The updated note for the finding.
     * </p>
     */
    private NoteUpdate note;

    /**
     * <p>
     * The updated record state for the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     */
    private String recordState;

    /**
     * <p>
     * A collection of attributes that specify which findings you want to
     * update.
     * </p>
     *
     * @return <p>
     *         A collection of attributes that specify which findings you want
     *         to update.
     *         </p>
     */
    public AwsSecurityFindingFilters getFilters() {
        return filters;
    }

    /**
     * <p>
     * A collection of attributes that specify which findings you want to
     * update.
     * </p>
     *
     * @param filters <p>
     *            A collection of attributes that specify which findings you
     *            want to update.
     *            </p>
     */
    public void setFilters(AwsSecurityFindingFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * A collection of attributes that specify which findings you want to
     * update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A collection of attributes that specify which findings you
     *            want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFindingsRequest withFilters(AwsSecurityFindingFilters filters) {
        this.filters = filters;
        return this;
    }

    /**
     * <p>
     * The updated note for the finding.
     * </p>
     *
     * @return <p>
     *         The updated note for the finding.
     *         </p>
     */
    public NoteUpdate getNote() {
        return note;
    }

    /**
     * <p>
     * The updated note for the finding.
     * </p>
     *
     * @param note <p>
     *            The updated note for the finding.
     *            </p>
     */
    public void setNote(NoteUpdate note) {
        this.note = note;
    }

    /**
     * <p>
     * The updated note for the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param note <p>
     *            The updated note for the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFindingsRequest withNote(NoteUpdate note) {
        this.note = note;
        return this;
    }

    /**
     * <p>
     * The updated record state for the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @return <p>
     *         The updated record state for the finding.
     *         </p>
     * @see RecordState
     */
    public String getRecordState() {
        return recordState;
    }

    /**
     * <p>
     * The updated record state for the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param recordState <p>
     *            The updated record state for the finding.
     *            </p>
     * @see RecordState
     */
    public void setRecordState(String recordState) {
        this.recordState = recordState;
    }

    /**
     * <p>
     * The updated record state for the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param recordState <p>
     *            The updated record state for the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecordState
     */
    public UpdateFindingsRequest withRecordState(String recordState) {
        this.recordState = recordState;
        return this;
    }

    /**
     * <p>
     * The updated record state for the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param recordState <p>
     *            The updated record state for the finding.
     *            </p>
     * @see RecordState
     */
    public void setRecordState(RecordState recordState) {
        this.recordState = recordState.toString();
    }

    /**
     * <p>
     * The updated record state for the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param recordState <p>
     *            The updated record state for the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecordState
     */
    public UpdateFindingsRequest withRecordState(RecordState recordState) {
        this.recordState = recordState.toString();
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getNote() != null)
            sb.append("Note: " + getNote() + ",");
        if (getRecordState() != null)
            sb.append("RecordState: " + getRecordState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNote() == null) ? 0 : getNote().hashCode());
        hashCode = prime * hashCode
                + ((getRecordState() == null) ? 0 : getRecordState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFindingsRequest == false)
            return false;
        UpdateFindingsRequest other = (UpdateFindingsRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNote() == null ^ this.getNote() == null)
            return false;
        if (other.getNote() != null && other.getNote().equals(this.getNote()) == false)
            return false;
        if (other.getRecordState() == null ^ this.getRecordState() == null)
            return false;
        if (other.getRecordState() != null
                && other.getRecordState().equals(this.getRecordState()) == false)
            return false;
        return true;
    }
}

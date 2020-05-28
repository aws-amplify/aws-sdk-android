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
package com.amazonaws.services.catalog.marketplace.model;

import java.io.Serializable;


public class DescribeChangeSetResult implements Serializable {
    /**
     * <p>Required. The unique identifier for the change set referenced in this request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     */
    private String changeSetId;

    /**
     * <p>The ARN associated with the unique identifier for the change set referenced in this request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:*/-]+$<br/>
     */
    private String changeSetArn;

    /**
     * <p>The optional name provided in the <code>StartChangeSet</code> request. If you do not provide a name, one is set by default.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[\w\s+=.:@-]+$<br/>
     */
    private String changeSetName;

    /**
     * <p>The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request started. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^([\d]{4})\-(1[0-2]|0[1-9])\-(3[01]|0[1-9]|[12][\d])T(2[0-3]|[01][\d]):([0-5][\d]):([0-5][\d])Z$<br/>
     */
    private String startTime;

    /**
     * <p>The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request transitioned to a terminal state. The change cannot transition to a different state. Null if the request is not in a terminal state. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^([\d]{4})\-(1[0-2]|0[1-9])\-(3[01]|0[1-9]|[12][\d])T(2[0-3]|[01][\d]):([0-5][\d]):([0-5][\d])Z$<br/>
     */
    private String endTime;

    /**
     * <p>The status of the change request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PREPARING, APPLYING, SUCCEEDED, CANCELLED, FAILED
     */
    private String status;

    /**
     * <p>Returned if there is a failure on the change set, but that failure is not related to any of the changes in the request.</p>
     */
    private String failureDescription;

    /**
     * <p>An array of <code>ChangeSummary</code> objects.</p>
     */
    private java.util.List<ChangeSummary> changeSet;

    /**
     * <p>Required. The unique identifier for the change set referenced in this request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @return <p>Required. The unique identifier for the change set referenced in this request.</p>
     */
    public String getChangeSetId() {
        return changeSetId;
    }

    /**
     * <p>Required. The unique identifier for the change set referenced in this request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @param changeSetId <p>Required. The unique identifier for the change set referenced in this request.</p>
     */
    public void setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
    }

    /**
     * <p>Required. The unique identifier for the change set referenced in this request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @param changeSetId <p>Required. The unique identifier for the change set referenced in this request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeChangeSetResult withChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }

    /**
     * <p>The ARN associated with the unique identifier for the change set referenced in this request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:*/-]+$<br/>
     *
     * @return <p>The ARN associated with the unique identifier for the change set referenced in this request.</p>
     */
    public String getChangeSetArn() {
        return changeSetArn;
    }

    /**
     * <p>The ARN associated with the unique identifier for the change set referenced in this request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:*/-]+$<br/>
     *
     * @param changeSetArn <p>The ARN associated with the unique identifier for the change set referenced in this request.</p>
     */
    public void setChangeSetArn(String changeSetArn) {
        this.changeSetArn = changeSetArn;
    }

    /**
     * <p>The ARN associated with the unique identifier for the change set referenced in this request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:*/-]+$<br/>
     *
     * @param changeSetArn <p>The ARN associated with the unique identifier for the change set referenced in this request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeChangeSetResult withChangeSetArn(String changeSetArn) {
        this.changeSetArn = changeSetArn;
        return this;
    }

    /**
     * <p>The optional name provided in the <code>StartChangeSet</code> request. If you do not provide a name, one is set by default.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[\w\s+=.:@-]+$<br/>
     *
     * @return <p>The optional name provided in the <code>StartChangeSet</code> request. If you do not provide a name, one is set by default.</p>
     */
    public String getChangeSetName() {
        return changeSetName;
    }

    /**
     * <p>The optional name provided in the <code>StartChangeSet</code> request. If you do not provide a name, one is set by default.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[\w\s+=.:@-]+$<br/>
     *
     * @param changeSetName <p>The optional name provided in the <code>StartChangeSet</code> request. If you do not provide a name, one is set by default.</p>
     */
    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>The optional name provided in the <code>StartChangeSet</code> request. If you do not provide a name, one is set by default.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[\w\s+=.:@-]+$<br/>
     *
     * @param changeSetName <p>The optional name provided in the <code>StartChangeSet</code> request. If you do not provide a name, one is set by default.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeChangeSetResult withChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }

    /**
     * <p>The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request started. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^([\d]{4})\-(1[0-2]|0[1-9])\-(3[01]|0[1-9]|[12][\d])T(2[0-3]|[01][\d]):([0-5][\d]):([0-5][\d])Z$<br/>
     *
     * @return <p>The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request started. </p>
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * <p>The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request started. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^([\d]{4})\-(1[0-2]|0[1-9])\-(3[01]|0[1-9]|[12][\d])T(2[0-3]|[01][\d]):([0-5][\d]):([0-5][\d])Z$<br/>
     *
     * @param startTime <p>The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request started. </p>
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request started. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^([\d]{4})\-(1[0-2]|0[1-9])\-(3[01]|0[1-9]|[12][\d])T(2[0-3]|[01][\d]):([0-5][\d]):([0-5][\d])Z$<br/>
     *
     * @param startTime <p>The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request started. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeChangeSetResult withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request transitioned to a terminal state. The change cannot transition to a different state. Null if the request is not in a terminal state. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^([\d]{4})\-(1[0-2]|0[1-9])\-(3[01]|0[1-9]|[12][\d])T(2[0-3]|[01][\d]):([0-5][\d]):([0-5][\d])Z$<br/>
     *
     * @return <p>The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request transitioned to a terminal state. The change cannot transition to a different state. Null if the request is not in a terminal state. </p>
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * <p>The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request transitioned to a terminal state. The change cannot transition to a different state. Null if the request is not in a terminal state. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^([\d]{4})\-(1[0-2]|0[1-9])\-(3[01]|0[1-9]|[12][\d])T(2[0-3]|[01][\d]):([0-5][\d]):([0-5][\d])Z$<br/>
     *
     * @param endTime <p>The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request transitioned to a terminal state. The change cannot transition to a different state. Null if the request is not in a terminal state. </p>
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request transitioned to a terminal state. The change cannot transition to a different state. Null if the request is not in a terminal state. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^([\d]{4})\-(1[0-2]|0[1-9])\-(3[01]|0[1-9]|[12][\d])T(2[0-3]|[01][\d]):([0-5][\d]):([0-5][\d])Z$<br/>
     *
     * @param endTime <p>The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request transitioned to a terminal state. The change cannot transition to a different state. Null if the request is not in a terminal state. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeChangeSetResult withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>The status of the change request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PREPARING, APPLYING, SUCCEEDED, CANCELLED, FAILED
     *
     * @return <p>The status of the change request.</p>
     *
     * @see ChangeStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The status of the change request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PREPARING, APPLYING, SUCCEEDED, CANCELLED, FAILED
     *
     * @param status <p>The status of the change request.</p>
     *
     * @see ChangeStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The status of the change request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PREPARING, APPLYING, SUCCEEDED, CANCELLED, FAILED
     *
     * @param status <p>The status of the change request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ChangeStatus
     */
    public DescribeChangeSetResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>The status of the change request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PREPARING, APPLYING, SUCCEEDED, CANCELLED, FAILED
     *
     * @param status <p>The status of the change request.</p>
     *
     * @see ChangeStatus
     */
    public void setStatus(ChangeStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>The status of the change request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PREPARING, APPLYING, SUCCEEDED, CANCELLED, FAILED
     *
     * @param status <p>The status of the change request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ChangeStatus
     */
    public DescribeChangeSetResult withStatus(ChangeStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>Returned if there is a failure on the change set, but that failure is not related to any of the changes in the request.</p>
     *
     * @return <p>Returned if there is a failure on the change set, but that failure is not related to any of the changes in the request.</p>
     */
    public String getFailureDescription() {
        return failureDescription;
    }

    /**
     * <p>Returned if there is a failure on the change set, but that failure is not related to any of the changes in the request.</p>
     *
     * @param failureDescription <p>Returned if there is a failure on the change set, but that failure is not related to any of the changes in the request.</p>
     */
    public void setFailureDescription(String failureDescription) {
        this.failureDescription = failureDescription;
    }

    /**
     * <p>Returned if there is a failure on the change set, but that failure is not related to any of the changes in the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failureDescription <p>Returned if there is a failure on the change set, but that failure is not related to any of the changes in the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeChangeSetResult withFailureDescription(String failureDescription) {
        this.failureDescription = failureDescription;
        return this;
    }

    /**
     * <p>An array of <code>ChangeSummary</code> objects.</p>
     *
     * @return <p>An array of <code>ChangeSummary</code> objects.</p>
     */
    public java.util.List<ChangeSummary> getChangeSet() {
        return changeSet;
    }

    /**
     * <p>An array of <code>ChangeSummary</code> objects.</p>
     *
     * @param changeSet <p>An array of <code>ChangeSummary</code> objects.</p>
     */
    public void setChangeSet(java.util.Collection<ChangeSummary> changeSet) {
        if (changeSet == null) {
            this.changeSet = null;
            return;
        }

        this.changeSet = new java.util.ArrayList<ChangeSummary>(changeSet);
    }

    /**
     * <p>An array of <code>ChangeSummary</code> objects.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param changeSet <p>An array of <code>ChangeSummary</code> objects.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeChangeSetResult withChangeSet(ChangeSummary... changeSet) {
        if (getChangeSet() == null) {
            this.changeSet = new java.util.ArrayList<ChangeSummary>(changeSet.length);
        }
        for (ChangeSummary value : changeSet) {
            this.changeSet.add(value);
        }
        return this;
    }

    /**
     * <p>An array of <code>ChangeSummary</code> objects.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param changeSet <p>An array of <code>ChangeSummary</code> objects.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeChangeSetResult withChangeSet(java.util.Collection<ChangeSummary> changeSet) {
        setChangeSet(changeSet);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getChangeSetId() != null) sb.append("ChangeSetId: " + getChangeSetId() + ",");
        if (getChangeSetArn() != null) sb.append("ChangeSetArn: " + getChangeSetArn() + ",");
        if (getChangeSetName() != null) sb.append("ChangeSetName: " + getChangeSetName() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getFailureDescription() != null) sb.append("FailureDescription: " + getFailureDescription() + ",");
        if (getChangeSet() != null) sb.append("ChangeSet: " + getChangeSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeSetId() == null) ? 0 : getChangeSetId().hashCode());
        hashCode = prime * hashCode + ((getChangeSetArn() == null) ? 0 : getChangeSetArn().hashCode());
        hashCode = prime * hashCode + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureDescription() == null) ? 0 : getFailureDescription().hashCode());
        hashCode = prime * hashCode + ((getChangeSet() == null) ? 0 : getChangeSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeChangeSetResult == false) return false;
        DescribeChangeSetResult other = (DescribeChangeSetResult)obj;

        if (other.getChangeSetId() == null ^ this.getChangeSetId() == null) return false;
        if (other.getChangeSetId() != null && other.getChangeSetId().equals(this.getChangeSetId()) == false) return false;
        if (other.getChangeSetArn() == null ^ this.getChangeSetArn() == null) return false;
        if (other.getChangeSetArn() != null && other.getChangeSetArn().equals(this.getChangeSetArn()) == false) return false;
        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null) return false;
        if (other.getChangeSetName() != null && other.getChangeSetName().equals(this.getChangeSetName()) == false) return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getFailureDescription() == null ^ this.getFailureDescription() == null) return false;
        if (other.getFailureDescription() != null && other.getFailureDescription().equals(this.getFailureDescription()) == false) return false;
        if (other.getChangeSet() == null ^ this.getChangeSet() == null) return false;
        if (other.getChangeSet() != null && other.getChangeSet().equals(this.getChangeSet()) == false) return false;
        return true;
    }
}

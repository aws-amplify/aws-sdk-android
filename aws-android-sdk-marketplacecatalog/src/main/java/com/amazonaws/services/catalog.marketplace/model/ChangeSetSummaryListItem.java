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


/**
 * <p>A summary of a change set returned in a list of change sets when the <code>ListChangeSets</code> action is called.</p>
 */
public class ChangeSetSummaryListItem implements Serializable {
    /**
     * <p>The unique identifier for a change set.</p>
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
     * <p>The non-unique name for the change set.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[\w\s+=.:@-]+$<br/>
     */
    private String changeSetName;

    /**
     * <p>The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was started.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^([\d]{4})\-(1[0-2]|0[1-9])\-(3[01]|0[1-9]|[12][\d])T(2[0-3]|[01][\d]):([0-5][\d]):([0-5][\d])Z$<br/>
     */
    private String startTime;

    /**
     * <p>The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was finished.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^([\d]{4})\-(1[0-2]|0[1-9])\-(3[01]|0[1-9]|[12][\d])T(2[0-3]|[01][\d]):([0-5][\d]):([0-5][\d])Z$<br/>
     */
    private String endTime;

    /**
     * <p>The current status of the change set.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PREPARING, APPLYING, SUCCEEDED, CANCELLED, FAILED
     */
    private String status;

    /**
     * <p>This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a maximum of 20 entities. It must contain at least one entity.</p>
     */
    private java.util.List<String> entityIdList;

    /**
     * <p>The unique identifier for a change set.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @return <p>The unique identifier for a change set.</p>
     */
    public String getChangeSetId() {
        return changeSetId;
    }

    /**
     * <p>The unique identifier for a change set.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @param changeSetId <p>The unique identifier for a change set.</p>
     */
    public void setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
    }

    /**
     * <p>The unique identifier for a change set.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @param changeSetId <p>The unique identifier for a change set.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ChangeSetSummaryListItem withChangeSetId(String changeSetId) {
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
    public ChangeSetSummaryListItem withChangeSetArn(String changeSetArn) {
        this.changeSetArn = changeSetArn;
        return this;
    }

    /**
     * <p>The non-unique name for the change set.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[\w\s+=.:@-]+$<br/>
     *
     * @return <p>The non-unique name for the change set.</p>
     */
    public String getChangeSetName() {
        return changeSetName;
    }

    /**
     * <p>The non-unique name for the change set.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[\w\s+=.:@-]+$<br/>
     *
     * @param changeSetName <p>The non-unique name for the change set.</p>
     */
    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>The non-unique name for the change set.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[\w\s+=.:@-]+$<br/>
     *
     * @param changeSetName <p>The non-unique name for the change set.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ChangeSetSummaryListItem withChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }

    /**
     * <p>The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was started.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^([\d]{4})\-(1[0-2]|0[1-9])\-(3[01]|0[1-9]|[12][\d])T(2[0-3]|[01][\d]):([0-5][\d]):([0-5][\d])Z$<br/>
     *
     * @return <p>The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was started.</p>
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * <p>The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was started.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^([\d]{4})\-(1[0-2]|0[1-9])\-(3[01]|0[1-9]|[12][\d])T(2[0-3]|[01][\d]):([0-5][\d]):([0-5][\d])Z$<br/>
     *
     * @param startTime <p>The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was started.</p>
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was started.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^([\d]{4})\-(1[0-2]|0[1-9])\-(3[01]|0[1-9]|[12][\d])T(2[0-3]|[01][\d]):([0-5][\d]):([0-5][\d])Z$<br/>
     *
     * @param startTime <p>The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was started.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ChangeSetSummaryListItem withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was finished.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^([\d]{4})\-(1[0-2]|0[1-9])\-(3[01]|0[1-9]|[12][\d])T(2[0-3]|[01][\d]):([0-5][\d]):([0-5][\d])Z$<br/>
     *
     * @return <p>The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was finished.</p>
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * <p>The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was finished.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^([\d]{4})\-(1[0-2]|0[1-9])\-(3[01]|0[1-9]|[12][\d])T(2[0-3]|[01][\d]):([0-5][\d]):([0-5][\d])Z$<br/>
     *
     * @param endTime <p>The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was finished.</p>
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was finished.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^([\d]{4})\-(1[0-2]|0[1-9])\-(3[01]|0[1-9]|[12][\d])T(2[0-3]|[01][\d]):([0-5][\d]):([0-5][\d])Z$<br/>
     *
     * @param endTime <p>The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was finished.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ChangeSetSummaryListItem withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>The current status of the change set.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PREPARING, APPLYING, SUCCEEDED, CANCELLED, FAILED
     *
     * @return <p>The current status of the change set.</p>
     *
     * @see ChangeStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The current status of the change set.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PREPARING, APPLYING, SUCCEEDED, CANCELLED, FAILED
     *
     * @param status <p>The current status of the change set.</p>
     *
     * @see ChangeStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The current status of the change set.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PREPARING, APPLYING, SUCCEEDED, CANCELLED, FAILED
     *
     * @param status <p>The current status of the change set.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ChangeStatus
     */
    public ChangeSetSummaryListItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>The current status of the change set.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PREPARING, APPLYING, SUCCEEDED, CANCELLED, FAILED
     *
     * @param status <p>The current status of the change set.</p>
     *
     * @see ChangeStatus
     */
    public void setStatus(ChangeStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>The current status of the change set.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PREPARING, APPLYING, SUCCEEDED, CANCELLED, FAILED
     *
     * @param status <p>The current status of the change set.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ChangeStatus
     */
    public ChangeSetSummaryListItem withStatus(ChangeStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a maximum of 20 entities. It must contain at least one entity.</p>
     *
     * @return <p>This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a maximum of 20 entities. It must contain at least one entity.</p>
     */
    public java.util.List<String> getEntityIdList() {
        return entityIdList;
    }

    /**
     * <p>This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a maximum of 20 entities. It must contain at least one entity.</p>
     *
     * @param entityIdList <p>This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a maximum of 20 entities. It must contain at least one entity.</p>
     */
    public void setEntityIdList(java.util.Collection<String> entityIdList) {
        if (entityIdList == null) {
            this.entityIdList = null;
            return;
        }

        this.entityIdList = new java.util.ArrayList<String>(entityIdList);
    }

    /**
     * <p>This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a maximum of 20 entities. It must contain at least one entity.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entityIdList <p>This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a maximum of 20 entities. It must contain at least one entity.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ChangeSetSummaryListItem withEntityIdList(String... entityIdList) {
        if (getEntityIdList() == null) {
            this.entityIdList = new java.util.ArrayList<String>(entityIdList.length);
        }
        for (String value : entityIdList) {
            this.entityIdList.add(value);
        }
        return this;
    }

    /**
     * <p>This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a maximum of 20 entities. It must contain at least one entity.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entityIdList <p>This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a maximum of 20 entities. It must contain at least one entity.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ChangeSetSummaryListItem withEntityIdList(java.util.Collection<String> entityIdList) {
        setEntityIdList(entityIdList);
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
        if (getEntityIdList() != null) sb.append("EntityIdList: " + getEntityIdList());
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
        hashCode = prime * hashCode + ((getEntityIdList() == null) ? 0 : getEntityIdList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ChangeSetSummaryListItem == false) return false;
        ChangeSetSummaryListItem other = (ChangeSetSummaryListItem)obj;

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
        if (other.getEntityIdList() == null ^ this.getEntityIdList() == null) return false;
        if (other.getEntityIdList() != null && other.getEntityIdList().equals(this.getEntityIdList()) == false) return false;
        return true;
    }
}

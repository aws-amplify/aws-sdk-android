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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Status information returned by the <code>DeleteInventory</code> action.</p>
 */
public class InventoryDeletionStatusItem implements Serializable {
    /**
     * <p>The deletion ID returned by the <code>DeleteInventory</code> action.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}<br/>
     */
    private String deletionId;

    /**
     * <p>The name of the inventory data type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     */
    private String typeName;

    /**
     * <p>The UTC timestamp when the delete operation started.</p>
     */
    private java.util.Date deletionStartTime;

    /**
     * <p>The status of the operation. Possible values are InProgress and Complete.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Complete
     */
    private String lastStatus;

    /**
     * <p>Information about the status.</p>
     */
    private String lastStatusMessage;

    /**
     * <p>Information about the delete operation. For more information about this summary, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-custom.html#sysman-inventory-delete">Understanding the delete inventory summary</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    private InventoryDeletionSummary deletionSummary;

    /**
     * <p>The UTC timestamp of when the last status report.</p>
     */
    private java.util.Date lastStatusUpdateTime;

    /**
     * <p>The deletion ID returned by the <code>DeleteInventory</code> action.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}<br/>
     *
     * @return <p>The deletion ID returned by the <code>DeleteInventory</code> action.</p>
     */
    public String getDeletionId() {
        return deletionId;
    }

    /**
     * <p>The deletion ID returned by the <code>DeleteInventory</code> action.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}<br/>
     *
     * @param deletionId <p>The deletion ID returned by the <code>DeleteInventory</code> action.</p>
     */
    public void setDeletionId(String deletionId) {
        this.deletionId = deletionId;
    }

    /**
     * <p>The deletion ID returned by the <code>DeleteInventory</code> action.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}<br/>
     *
     * @param deletionId <p>The deletion ID returned by the <code>DeleteInventory</code> action.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InventoryDeletionStatusItem withDeletionId(String deletionId) {
        this.deletionId = deletionId;
        return this;
    }

    /**
     * <p>The name of the inventory data type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @return <p>The name of the inventory data type.</p>
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * <p>The name of the inventory data type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @param typeName <p>The name of the inventory data type.</p>
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>The name of the inventory data type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @param typeName <p>The name of the inventory data type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InventoryDeletionStatusItem withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * <p>The UTC timestamp when the delete operation started.</p>
     *
     * @return <p>The UTC timestamp when the delete operation started.</p>
     */
    public java.util.Date getDeletionStartTime() {
        return deletionStartTime;
    }

    /**
     * <p>The UTC timestamp when the delete operation started.</p>
     *
     * @param deletionStartTime <p>The UTC timestamp when the delete operation started.</p>
     */
    public void setDeletionStartTime(java.util.Date deletionStartTime) {
        this.deletionStartTime = deletionStartTime;
    }

    /**
     * <p>The UTC timestamp when the delete operation started.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deletionStartTime <p>The UTC timestamp when the delete operation started.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InventoryDeletionStatusItem withDeletionStartTime(java.util.Date deletionStartTime) {
        this.deletionStartTime = deletionStartTime;
        return this;
    }

    /**
     * <p>The status of the operation. Possible values are InProgress and Complete.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Complete
     *
     * @return <p>The status of the operation. Possible values are InProgress and Complete.</p>
     *
     * @see InventoryDeletionStatus
     */
    public String getLastStatus() {
        return lastStatus;
    }

    /**
     * <p>The status of the operation. Possible values are InProgress and Complete.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Complete
     *
     * @param lastStatus <p>The status of the operation. Possible values are InProgress and Complete.</p>
     *
     * @see InventoryDeletionStatus
     */
    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    /**
     * <p>The status of the operation. Possible values are InProgress and Complete.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Complete
     *
     * @param lastStatus <p>The status of the operation. Possible values are InProgress and Complete.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see InventoryDeletionStatus
     */
    public InventoryDeletionStatusItem withLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
        return this;
    }

    /**
     * <p>The status of the operation. Possible values are InProgress and Complete.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Complete
     *
     * @param lastStatus <p>The status of the operation. Possible values are InProgress and Complete.</p>
     *
     * @see InventoryDeletionStatus
     */
    public void setLastStatus(InventoryDeletionStatus lastStatus) {
        this.lastStatus = lastStatus.toString();
    }

    /**
     * <p>The status of the operation. Possible values are InProgress and Complete.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Complete
     *
     * @param lastStatus <p>The status of the operation. Possible values are InProgress and Complete.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see InventoryDeletionStatus
     */
    public InventoryDeletionStatusItem withLastStatus(InventoryDeletionStatus lastStatus) {
        this.lastStatus = lastStatus.toString();
        return this;
    }

    /**
     * <p>Information about the status.</p>
     *
     * @return <p>Information about the status.</p>
     */
    public String getLastStatusMessage() {
        return lastStatusMessage;
    }

    /**
     * <p>Information about the status.</p>
     *
     * @param lastStatusMessage <p>Information about the status.</p>
     */
    public void setLastStatusMessage(String lastStatusMessage) {
        this.lastStatusMessage = lastStatusMessage;
    }

    /**
     * <p>Information about the status.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastStatusMessage <p>Information about the status.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InventoryDeletionStatusItem withLastStatusMessage(String lastStatusMessage) {
        this.lastStatusMessage = lastStatusMessage;
        return this;
    }

    /**
     * <p>Information about the delete operation. For more information about this summary, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-custom.html#sysman-inventory-delete">Understanding the delete inventory summary</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @return <p>Information about the delete operation. For more information about this summary, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-custom.html#sysman-inventory-delete">Understanding the delete inventory summary</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    public InventoryDeletionSummary getDeletionSummary() {
        return deletionSummary;
    }

    /**
     * <p>Information about the delete operation. For more information about this summary, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-custom.html#sysman-inventory-delete">Understanding the delete inventory summary</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @param deletionSummary <p>Information about the delete operation. For more information about this summary, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-custom.html#sysman-inventory-delete">Understanding the delete inventory summary</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    public void setDeletionSummary(InventoryDeletionSummary deletionSummary) {
        this.deletionSummary = deletionSummary;
    }

    /**
     * <p>Information about the delete operation. For more information about this summary, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-custom.html#sysman-inventory-delete">Understanding the delete inventory summary</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deletionSummary <p>Information about the delete operation. For more information about this summary, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-custom.html#sysman-inventory-delete">Understanding the delete inventory summary</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InventoryDeletionStatusItem withDeletionSummary(InventoryDeletionSummary deletionSummary) {
        this.deletionSummary = deletionSummary;
        return this;
    }

    /**
     * <p>The UTC timestamp of when the last status report.</p>
     *
     * @return <p>The UTC timestamp of when the last status report.</p>
     */
    public java.util.Date getLastStatusUpdateTime() {
        return lastStatusUpdateTime;
    }

    /**
     * <p>The UTC timestamp of when the last status report.</p>
     *
     * @param lastStatusUpdateTime <p>The UTC timestamp of when the last status report.</p>
     */
    public void setLastStatusUpdateTime(java.util.Date lastStatusUpdateTime) {
        this.lastStatusUpdateTime = lastStatusUpdateTime;
    }

    /**
     * <p>The UTC timestamp of when the last status report.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastStatusUpdateTime <p>The UTC timestamp of when the last status report.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InventoryDeletionStatusItem withLastStatusUpdateTime(java.util.Date lastStatusUpdateTime) {
        this.lastStatusUpdateTime = lastStatusUpdateTime;
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
        if (getDeletionId() != null) sb.append("DeletionId: " + getDeletionId() + ",");
        if (getTypeName() != null) sb.append("TypeName: " + getTypeName() + ",");
        if (getDeletionStartTime() != null) sb.append("DeletionStartTime: " + getDeletionStartTime() + ",");
        if (getLastStatus() != null) sb.append("LastStatus: " + getLastStatus() + ",");
        if (getLastStatusMessage() != null) sb.append("LastStatusMessage: " + getLastStatusMessage() + ",");
        if (getDeletionSummary() != null) sb.append("DeletionSummary: " + getDeletionSummary() + ",");
        if (getLastStatusUpdateTime() != null) sb.append("LastStatusUpdateTime: " + getLastStatusUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeletionId() == null) ? 0 : getDeletionId().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getDeletionStartTime() == null) ? 0 : getDeletionStartTime().hashCode());
        hashCode = prime * hashCode + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        hashCode = prime * hashCode + ((getLastStatusMessage() == null) ? 0 : getLastStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getDeletionSummary() == null) ? 0 : getDeletionSummary().hashCode());
        hashCode = prime * hashCode + ((getLastStatusUpdateTime() == null) ? 0 : getLastStatusUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InventoryDeletionStatusItem == false) return false;
        InventoryDeletionStatusItem other = (InventoryDeletionStatusItem)obj;

        if (other.getDeletionId() == null ^ this.getDeletionId() == null) return false;
        if (other.getDeletionId() != null && other.getDeletionId().equals(this.getDeletionId()) == false) return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null) return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false) return false;
        if (other.getDeletionStartTime() == null ^ this.getDeletionStartTime() == null) return false;
        if (other.getDeletionStartTime() != null && other.getDeletionStartTime().equals(this.getDeletionStartTime()) == false) return false;
        if (other.getLastStatus() == null ^ this.getLastStatus() == null) return false;
        if (other.getLastStatus() != null && other.getLastStatus().equals(this.getLastStatus()) == false) return false;
        if (other.getLastStatusMessage() == null ^ this.getLastStatusMessage() == null) return false;
        if (other.getLastStatusMessage() != null && other.getLastStatusMessage().equals(this.getLastStatusMessage()) == false) return false;
        if (other.getDeletionSummary() == null ^ this.getDeletionSummary() == null) return false;
        if (other.getDeletionSummary() != null && other.getDeletionSummary().equals(this.getDeletionSummary()) == false) return false;
        if (other.getLastStatusUpdateTime() == null ^ this.getLastStatusUpdateTime() == null) return false;
        if (other.getLastStatusUpdateTime() != null && other.getLastStatusUpdateTime().equals(this.getLastStatusUpdateTime()) == false) return false;
        return true;
    }
}

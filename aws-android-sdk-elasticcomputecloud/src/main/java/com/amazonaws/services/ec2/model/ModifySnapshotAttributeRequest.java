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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds or removes permission settings for the specified snapshot. You may add
 * or remove specified AWS account IDs from a snapshot's list of create volume
 * permissions, but you cannot do both in a single operation. If you need to
 * both add and remove account IDs for a snapshot, you must use multiple
 * operations. You can make up to 500 modifications to a snapshot in a single
 * operation.
 * </p>
 * <p>
 * Encrypted snapshots and snapshots with AWS Marketplace product codes cannot
 * be made public. Snapshots encrypted with your default CMK cannot be shared
 * with other accounts.
 * </p>
 * <p>
 * For more information about modifying snapshot permissions, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html"
 * >Sharing Snapshots</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
 * </p>
 */
public class ModifySnapshotAttributeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The snapshot attribute to modify. Only volume creation permissions can be
     * modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     */
    private String attribute;

    /**
     * <p>
     * A JSON representation of the snapshot attribute modification.
     * </p>
     */
    private CreateVolumePermissionModifications createVolumePermission;

    /**
     * <p>
     * The group to modify for the snapshot.
     * </p>
     */
    private java.util.List<String> groupNames;

    /**
     * <p>
     * The type of operation to perform to the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     */
    private String operationType;

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * The account ID to modify for the snapshot.
     * </p>
     */
    private java.util.List<String> userIds;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The snapshot attribute to modify. Only volume creation permissions can be
     * modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @return <p>
     *         The snapshot attribute to modify. Only volume creation
     *         permissions can be modified.
     *         </p>
     * @see SnapshotAttributeName
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * <p>
     * The snapshot attribute to modify. Only volume creation permissions can be
     * modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @param attribute <p>
     *            The snapshot attribute to modify. Only volume creation
     *            permissions can be modified.
     *            </p>
     * @see SnapshotAttributeName
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The snapshot attribute to modify. Only volume creation permissions can be
     * modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @param attribute <p>
     *            The snapshot attribute to modify. Only volume creation
     *            permissions can be modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnapshotAttributeName
     */
    public ModifySnapshotAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * <p>
     * The snapshot attribute to modify. Only volume creation permissions can be
     * modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @param attribute <p>
     *            The snapshot attribute to modify. Only volume creation
     *            permissions can be modified.
     *            </p>
     * @see SnapshotAttributeName
     */
    public void setAttribute(SnapshotAttributeName attribute) {
        this.attribute = attribute.toString();
    }

    /**
     * <p>
     * The snapshot attribute to modify. Only volume creation permissions can be
     * modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @param attribute <p>
     *            The snapshot attribute to modify. Only volume creation
     *            permissions can be modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnapshotAttributeName
     */
    public ModifySnapshotAttributeRequest withAttribute(SnapshotAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * A JSON representation of the snapshot attribute modification.
     * </p>
     *
     * @return <p>
     *         A JSON representation of the snapshot attribute modification.
     *         </p>
     */
    public CreateVolumePermissionModifications getCreateVolumePermission() {
        return createVolumePermission;
    }

    /**
     * <p>
     * A JSON representation of the snapshot attribute modification.
     * </p>
     *
     * @param createVolumePermission <p>
     *            A JSON representation of the snapshot attribute modification.
     *            </p>
     */
    public void setCreateVolumePermission(CreateVolumePermissionModifications createVolumePermission) {
        this.createVolumePermission = createVolumePermission;
    }

    /**
     * <p>
     * A JSON representation of the snapshot attribute modification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createVolumePermission <p>
     *            A JSON representation of the snapshot attribute modification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifySnapshotAttributeRequest withCreateVolumePermission(
            CreateVolumePermissionModifications createVolumePermission) {
        this.createVolumePermission = createVolumePermission;
        return this;
    }

    /**
     * <p>
     * The group to modify for the snapshot.
     * </p>
     *
     * @return <p>
     *         The group to modify for the snapshot.
     *         </p>
     */
    public java.util.List<String> getGroupNames() {
        return groupNames;
    }

    /**
     * <p>
     * The group to modify for the snapshot.
     * </p>
     *
     * @param groupNames <p>
     *            The group to modify for the snapshot.
     *            </p>
     */
    public void setGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
            return;
        }

        this.groupNames = new java.util.ArrayList<String>(groupNames);
    }

    /**
     * <p>
     * The group to modify for the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupNames <p>
     *            The group to modify for the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifySnapshotAttributeRequest withGroupNames(String... groupNames) {
        if (getGroupNames() == null) {
            this.groupNames = new java.util.ArrayList<String>(groupNames.length);
        }
        for (String value : groupNames) {
            this.groupNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The group to modify for the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupNames <p>
     *            The group to modify for the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifySnapshotAttributeRequest withGroupNames(java.util.Collection<String> groupNames) {
        setGroupNames(groupNames);
        return this;
    }

    /**
     * <p>
     * The type of operation to perform to the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     *
     * @return <p>
     *         The type of operation to perform to the attribute.
     *         </p>
     * @see OperationType
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * <p>
     * The type of operation to perform to the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     *
     * @param operationType <p>
     *            The type of operation to perform to the attribute.
     *            </p>
     * @see OperationType
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * <p>
     * The type of operation to perform to the attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     *
     * @param operationType <p>
     *            The type of operation to perform to the attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationType
     */
    public ModifySnapshotAttributeRequest withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * <p>
     * The type of operation to perform to the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     *
     * @param operationType <p>
     *            The type of operation to perform to the attribute.
     *            </p>
     * @see OperationType
     */
    public void setOperationType(OperationType operationType) {
        this.operationType = operationType.toString();
    }

    /**
     * <p>
     * The type of operation to perform to the attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     *
     * @param operationType <p>
     *            The type of operation to perform to the attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationType
     */
    public ModifySnapshotAttributeRequest withOperationType(OperationType operationType) {
        this.operationType = operationType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     *
     * @return <p>
     *         The ID of the snapshot.
     *         </p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     *
     * @param snapshotId <p>
     *            The ID of the snapshot.
     *            </p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotId <p>
     *            The ID of the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifySnapshotAttributeRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * <p>
     * The account ID to modify for the snapshot.
     * </p>
     *
     * @return <p>
     *         The account ID to modify for the snapshot.
     *         </p>
     */
    public java.util.List<String> getUserIds() {
        return userIds;
    }

    /**
     * <p>
     * The account ID to modify for the snapshot.
     * </p>
     *
     * @param userIds <p>
     *            The account ID to modify for the snapshot.
     *            </p>
     */
    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }

        this.userIds = new java.util.ArrayList<String>(userIds);
    }

    /**
     * <p>
     * The account ID to modify for the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIds <p>
     *            The account ID to modify for the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifySnapshotAttributeRequest withUserIds(String... userIds) {
        if (getUserIds() == null) {
            this.userIds = new java.util.ArrayList<String>(userIds.length);
        }
        for (String value : userIds) {
            this.userIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The account ID to modify for the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIds <p>
     *            The account ID to modify for the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifySnapshotAttributeRequest withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifySnapshotAttributeRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getAttribute() != null)
            sb.append("Attribute: " + getAttribute() + ",");
        if (getCreateVolumePermission() != null)
            sb.append("CreateVolumePermission: " + getCreateVolumePermission() + ",");
        if (getGroupNames() != null)
            sb.append("GroupNames: " + getGroupNames() + ",");
        if (getOperationType() != null)
            sb.append("OperationType: " + getOperationType() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getUserIds() != null)
            sb.append("UserIds: " + getUserIds() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreateVolumePermission() == null) ? 0 : getCreateVolumePermission()
                        .hashCode());
        hashCode = prime * hashCode + ((getGroupNames() == null) ? 0 : getGroupNames().hashCode());
        hashCode = prime * hashCode
                + ((getOperationType() == null) ? 0 : getOperationType().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifySnapshotAttributeRequest == false)
            return false;
        ModifySnapshotAttributeRequest other = (ModifySnapshotAttributeRequest) obj;

        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null
                && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getCreateVolumePermission() == null ^ this.getCreateVolumePermission() == null)
            return false;
        if (other.getCreateVolumePermission() != null
                && other.getCreateVolumePermission().equals(this.getCreateVolumePermission()) == false)
            return false;
        if (other.getGroupNames() == null ^ this.getGroupNames() == null)
            return false;
        if (other.getGroupNames() != null
                && other.getGroupNames().equals(this.getGroupNames()) == false)
            return false;
        if (other.getOperationType() == null ^ this.getOperationType() == null)
            return false;
        if (other.getOperationType() != null
                && other.getOperationType().equals(this.getOperationType()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}

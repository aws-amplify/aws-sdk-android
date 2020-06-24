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

package com.amazonaws.services.backup.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns selection metadata and a document in JSON format that specifies a
 * list of resources that are associated with a backup plan.
 * </p>
 */
public class GetBackupSelectionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     */
    private String backupPlanId;

    /**
     * <p>
     * Uniquely identifies the body of a request to assign a set of resources to
     * a backup plan.
     * </p>
     */
    private String selectionId;

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     *
     * @return <p>
     *         Uniquely identifies a backup plan.
     *         </p>
     */
    public String getBackupPlanId() {
        return backupPlanId;
    }

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     *
     * @param backupPlanId <p>
     *            Uniquely identifies a backup plan.
     *            </p>
     */
    public void setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
    }

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlanId <p>
     *            Uniquely identifies a backup plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBackupSelectionRequest withBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }

    /**
     * <p>
     * Uniquely identifies the body of a request to assign a set of resources to
     * a backup plan.
     * </p>
     *
     * @return <p>
     *         Uniquely identifies the body of a request to assign a set of
     *         resources to a backup plan.
     *         </p>
     */
    public String getSelectionId() {
        return selectionId;
    }

    /**
     * <p>
     * Uniquely identifies the body of a request to assign a set of resources to
     * a backup plan.
     * </p>
     *
     * @param selectionId <p>
     *            Uniquely identifies the body of a request to assign a set of
     *            resources to a backup plan.
     *            </p>
     */
    public void setSelectionId(String selectionId) {
        this.selectionId = selectionId;
    }

    /**
     * <p>
     * Uniquely identifies the body of a request to assign a set of resources to
     * a backup plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param selectionId <p>
     *            Uniquely identifies the body of a request to assign a set of
     *            resources to a backup plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBackupSelectionRequest withSelectionId(String selectionId) {
        this.selectionId = selectionId;
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
        if (getBackupPlanId() != null)
            sb.append("BackupPlanId: " + getBackupPlanId() + ",");
        if (getSelectionId() != null)
            sb.append("SelectionId: " + getSelectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupPlanId() == null) ? 0 : getBackupPlanId().hashCode());
        hashCode = prime * hashCode
                + ((getSelectionId() == null) ? 0 : getSelectionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBackupSelectionRequest == false)
            return false;
        GetBackupSelectionRequest other = (GetBackupSelectionRequest) obj;

        if (other.getBackupPlanId() == null ^ this.getBackupPlanId() == null)
            return false;
        if (other.getBackupPlanId() != null
                && other.getBackupPlanId().equals(this.getBackupPlanId()) == false)
            return false;
        if (other.getSelectionId() == null ^ this.getSelectionId() == null)
            return false;
        if (other.getSelectionId() != null
                && other.getSelectionId().equals(this.getSelectionId()) == false)
            return false;
        return true;
    }
}

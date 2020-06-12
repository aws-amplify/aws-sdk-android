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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

public class GetImportResult implements Serializable {
    /**
     * <p>
     * The name given to the import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z_]+<br/>
     */
    private String name;

    /**
     * <p>
     * The type of resource imported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     */
    private String resourceType;

    /**
     * <p>
     * The action taken when there was a conflict between an existing resource
     * and a resource in the import file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE_LATEST, FAIL_ON_CONFLICT
     */
    private String mergeStrategy;

    /**
     * <p>
     * The identifier for the specific import job.
     * </p>
     */
    private String importId;

    /**
     * <p>
     * The status of the import job. If the status is <code>FAILED</code>, you
     * can get the reason for the failure from the <code>failureReason</code>
     * field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, FAILED
     */
    private String importStatus;

    /**
     * <p>
     * A string that describes why an import job failed to complete.
     * </p>
     */
    private java.util.List<String> failureReason;

    /**
     * <p>
     * A timestamp for the date and time that the import job was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The name given to the import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z_]+<br/>
     *
     * @return <p>
     *         The name given to the import job.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name given to the import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z_]+<br/>
     *
     * @param name <p>
     *            The name given to the import job.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name given to the import job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z_]+<br/>
     *
     * @param name <p>
     *            The name given to the import job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImportResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of resource imported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @return <p>
     *         The type of resource imported.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource imported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @param resourceType <p>
     *            The type of resource imported.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @param resourceType <p>
     *            The type of resource imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public GetImportResult withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of resource imported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @param resourceType <p>
     *            The type of resource imported.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of resource imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @param resourceType <p>
     *            The type of resource imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public GetImportResult withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The action taken when there was a conflict between an existing resource
     * and a resource in the import file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE_LATEST, FAIL_ON_CONFLICT
     *
     * @return <p>
     *         The action taken when there was a conflict between an existing
     *         resource and a resource in the import file.
     *         </p>
     * @see MergeStrategy
     */
    public String getMergeStrategy() {
        return mergeStrategy;
    }

    /**
     * <p>
     * The action taken when there was a conflict between an existing resource
     * and a resource in the import file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE_LATEST, FAIL_ON_CONFLICT
     *
     * @param mergeStrategy <p>
     *            The action taken when there was a conflict between an existing
     *            resource and a resource in the import file.
     *            </p>
     * @see MergeStrategy
     */
    public void setMergeStrategy(String mergeStrategy) {
        this.mergeStrategy = mergeStrategy;
    }

    /**
     * <p>
     * The action taken when there was a conflict between an existing resource
     * and a resource in the import file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE_LATEST, FAIL_ON_CONFLICT
     *
     * @param mergeStrategy <p>
     *            The action taken when there was a conflict between an existing
     *            resource and a resource in the import file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MergeStrategy
     */
    public GetImportResult withMergeStrategy(String mergeStrategy) {
        this.mergeStrategy = mergeStrategy;
        return this;
    }

    /**
     * <p>
     * The action taken when there was a conflict between an existing resource
     * and a resource in the import file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE_LATEST, FAIL_ON_CONFLICT
     *
     * @param mergeStrategy <p>
     *            The action taken when there was a conflict between an existing
     *            resource and a resource in the import file.
     *            </p>
     * @see MergeStrategy
     */
    public void setMergeStrategy(MergeStrategy mergeStrategy) {
        this.mergeStrategy = mergeStrategy.toString();
    }

    /**
     * <p>
     * The action taken when there was a conflict between an existing resource
     * and a resource in the import file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE_LATEST, FAIL_ON_CONFLICT
     *
     * @param mergeStrategy <p>
     *            The action taken when there was a conflict between an existing
     *            resource and a resource in the import file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MergeStrategy
     */
    public GetImportResult withMergeStrategy(MergeStrategy mergeStrategy) {
        this.mergeStrategy = mergeStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The identifier for the specific import job.
     * </p>
     *
     * @return <p>
     *         The identifier for the specific import job.
     *         </p>
     */
    public String getImportId() {
        return importId;
    }

    /**
     * <p>
     * The identifier for the specific import job.
     * </p>
     *
     * @param importId <p>
     *            The identifier for the specific import job.
     *            </p>
     */
    public void setImportId(String importId) {
        this.importId = importId;
    }

    /**
     * <p>
     * The identifier for the specific import job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importId <p>
     *            The identifier for the specific import job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImportResult withImportId(String importId) {
        this.importId = importId;
        return this;
    }

    /**
     * <p>
     * The status of the import job. If the status is <code>FAILED</code>, you
     * can get the reason for the failure from the <code>failureReason</code>
     * field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, FAILED
     *
     * @return <p>
     *         The status of the import job. If the status is
     *         <code>FAILED</code>, you can get the reason for the failure from
     *         the <code>failureReason</code> field.
     *         </p>
     * @see ImportStatus
     */
    public String getImportStatus() {
        return importStatus;
    }

    /**
     * <p>
     * The status of the import job. If the status is <code>FAILED</code>, you
     * can get the reason for the failure from the <code>failureReason</code>
     * field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, FAILED
     *
     * @param importStatus <p>
     *            The status of the import job. If the status is
     *            <code>FAILED</code>, you can get the reason for the failure
     *            from the <code>failureReason</code> field.
     *            </p>
     * @see ImportStatus
     */
    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    /**
     * <p>
     * The status of the import job. If the status is <code>FAILED</code>, you
     * can get the reason for the failure from the <code>failureReason</code>
     * field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, FAILED
     *
     * @param importStatus <p>
     *            The status of the import job. If the status is
     *            <code>FAILED</code>, you can get the reason for the failure
     *            from the <code>failureReason</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImportStatus
     */
    public GetImportResult withImportStatus(String importStatus) {
        this.importStatus = importStatus;
        return this;
    }

    /**
     * <p>
     * The status of the import job. If the status is <code>FAILED</code>, you
     * can get the reason for the failure from the <code>failureReason</code>
     * field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, FAILED
     *
     * @param importStatus <p>
     *            The status of the import job. If the status is
     *            <code>FAILED</code>, you can get the reason for the failure
     *            from the <code>failureReason</code> field.
     *            </p>
     * @see ImportStatus
     */
    public void setImportStatus(ImportStatus importStatus) {
        this.importStatus = importStatus.toString();
    }

    /**
     * <p>
     * The status of the import job. If the status is <code>FAILED</code>, you
     * can get the reason for the failure from the <code>failureReason</code>
     * field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, FAILED
     *
     * @param importStatus <p>
     *            The status of the import job. If the status is
     *            <code>FAILED</code>, you can get the reason for the failure
     *            from the <code>failureReason</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImportStatus
     */
    public GetImportResult withImportStatus(ImportStatus importStatus) {
        this.importStatus = importStatus.toString();
        return this;
    }

    /**
     * <p>
     * A string that describes why an import job failed to complete.
     * </p>
     *
     * @return <p>
     *         A string that describes why an import job failed to complete.
     *         </p>
     */
    public java.util.List<String> getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * A string that describes why an import job failed to complete.
     * </p>
     *
     * @param failureReason <p>
     *            A string that describes why an import job failed to complete.
     *            </p>
     */
    public void setFailureReason(java.util.Collection<String> failureReason) {
        if (failureReason == null) {
            this.failureReason = null;
            return;
        }

        this.failureReason = new java.util.ArrayList<String>(failureReason);
    }

    /**
     * <p>
     * A string that describes why an import job failed to complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            A string that describes why an import job failed to complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImportResult withFailureReason(String... failureReason) {
        if (getFailureReason() == null) {
            this.failureReason = new java.util.ArrayList<String>(failureReason.length);
        }
        for (String value : failureReason) {
            this.failureReason.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A string that describes why an import job failed to complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            A string that describes why an import job failed to complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImportResult withFailureReason(java.util.Collection<String> failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * A timestamp for the date and time that the import job was created.
     * </p>
     *
     * @return <p>
     *         A timestamp for the date and time that the import job was
     *         created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * A timestamp for the date and time that the import job was created.
     * </p>
     *
     * @param createdDate <p>
     *            A timestamp for the date and time that the import job was
     *            created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * A timestamp for the date and time that the import job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            A timestamp for the date and time that the import job was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImportResult withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getMergeStrategy() != null)
            sb.append("mergeStrategy: " + getMergeStrategy() + ",");
        if (getImportId() != null)
            sb.append("importId: " + getImportId() + ",");
        if (getImportStatus() != null)
            sb.append("importStatus: " + getImportStatus() + ",");
        if (getFailureReason() != null)
            sb.append("failureReason: " + getFailureReason() + ",");
        if (getCreatedDate() != null)
            sb.append("createdDate: " + getCreatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getMergeStrategy() == null) ? 0 : getMergeStrategy().hashCode());
        hashCode = prime * hashCode + ((getImportId() == null) ? 0 : getImportId().hashCode());
        hashCode = prime * hashCode
                + ((getImportStatus() == null) ? 0 : getImportStatus().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImportResult == false)
            return false;
        GetImportResult other = (GetImportResult) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getMergeStrategy() == null ^ this.getMergeStrategy() == null)
            return false;
        if (other.getMergeStrategy() != null
                && other.getMergeStrategy().equals(this.getMergeStrategy()) == false)
            return false;
        if (other.getImportId() == null ^ this.getImportId() == null)
            return false;
        if (other.getImportId() != null && other.getImportId().equals(this.getImportId()) == false)
            return false;
        if (other.getImportStatus() == null ^ this.getImportStatus() == null)
            return false;
        if (other.getImportStatus() != null
                && other.getImportStatus().equals(this.getImportStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        return true;
    }
}

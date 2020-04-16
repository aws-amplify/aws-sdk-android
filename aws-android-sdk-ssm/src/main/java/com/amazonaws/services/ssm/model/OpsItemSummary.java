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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * A count of OpsItems.
 * </p>
 */
public class OpsItemSummary implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM entity that created the
     * OpsItem.
     * </p>
     */
    private String createdBy;

    /**
     * <p>
     * The date and time the OpsItem was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM entity that created the
     * OpsItem.
     * </p>
     */
    private String lastModifiedBy;

    /**
     * <p>
     * The date and time the OpsItem was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The importance of this OpsItem in relation to other OpsItems in the
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     */
    private Integer priority;

    /**
     * <p>
     * The impacted AWS resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String source;

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>,
     * <code>In Progress</code>, or <code>Resolved</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     */
    private String status;

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(oi)-[0-9a-f]{12}$<br/>
     */
    private String opsItemId;

    /**
     * <p>
     * A short heading that describes the nature of the OpsItem and the impacted
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String title;

    /**
     * <p>
     * Operational data is custom data that provides useful reference details
     * about the OpsItem.
     * </p>
     */
    private java.util.Map<String, OpsItemDataValue> operationalData;

    /**
     * <p>
     * A list of OpsItems by category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String category;

    /**
     * <p>
     * A list of OpsItems by severity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String severity;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM entity that created the
     * OpsItem.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM entity that created the
     *         OpsItem.
     *         </p>
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM entity that created the
     * OpsItem.
     * </p>
     *
     * @param createdBy <p>
     *            The Amazon Resource Name (ARN) of the IAM entity that created
     *            the OpsItem.
     *            </p>
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM entity that created the
     * OpsItem.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdBy <p>
     *            The Amazon Resource Name (ARN) of the IAM entity that created
     *            the OpsItem.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsItemSummary withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * <p>
     * The date and time the OpsItem was created.
     * </p>
     *
     * @return <p>
     *         The date and time the OpsItem was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The date and time the OpsItem was created.
     * </p>
     *
     * @param createdTime <p>
     *            The date and time the OpsItem was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time the OpsItem was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The date and time the OpsItem was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsItemSummary withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM entity that created the
     * OpsItem.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM entity that created the
     *         OpsItem.
     *         </p>
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM entity that created the
     * OpsItem.
     * </p>
     *
     * @param lastModifiedBy <p>
     *            The Amazon Resource Name (ARN) of the IAM entity that created
     *            the OpsItem.
     *            </p>
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM entity that created the
     * OpsItem.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedBy <p>
     *            The Amazon Resource Name (ARN) of the IAM entity that created
     *            the OpsItem.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsItemSummary withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * <p>
     * The date and time the OpsItem was last updated.
     * </p>
     *
     * @return <p>
     *         The date and time the OpsItem was last updated.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the OpsItem was last updated.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The date and time the OpsItem was last updated.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the OpsItem was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The date and time the OpsItem was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsItemSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The importance of this OpsItem in relation to other OpsItems in the
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @return <p>
     *         The importance of this OpsItem in relation to other OpsItems in
     *         the system.
     *         </p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>
     * The importance of this OpsItem in relation to other OpsItems in the
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @param priority <p>
     *            The importance of this OpsItem in relation to other OpsItems
     *            in the system.
     *            </p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The importance of this OpsItem in relation to other OpsItems in the
     * system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @param priority <p>
     *            The importance of this OpsItem in relation to other OpsItems
     *            in the system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsItemSummary withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>
     * The impacted AWS resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The impacted AWS resource.
     *         </p>
     */
    public String getSource() {
        return source;
    }

    /**
     * <p>
     * The impacted AWS resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param source <p>
     *            The impacted AWS resource.
     *            </p>
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The impacted AWS resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param source <p>
     *            The impacted AWS resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsItemSummary withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>,
     * <code>In Progress</code>, or <code>Resolved</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     *
     * @return <p>
     *         The OpsItem status. Status can be <code>Open</code>,
     *         <code>In Progress</code>, or <code>Resolved</code>.
     *         </p>
     * @see OpsItemStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>,
     * <code>In Progress</code>, or <code>Resolved</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     *
     * @param status <p>
     *            The OpsItem status. Status can be <code>Open</code>,
     *            <code>In Progress</code>, or <code>Resolved</code>.
     *            </p>
     * @see OpsItemStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>,
     * <code>In Progress</code>, or <code>Resolved</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     *
     * @param status <p>
     *            The OpsItem status. Status can be <code>Open</code>,
     *            <code>In Progress</code>, or <code>Resolved</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OpsItemStatus
     */
    public OpsItemSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>,
     * <code>In Progress</code>, or <code>Resolved</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     *
     * @param status <p>
     *            The OpsItem status. Status can be <code>Open</code>,
     *            <code>In Progress</code>, or <code>Resolved</code>.
     *            </p>
     * @see OpsItemStatus
     */
    public void setStatus(OpsItemStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>,
     * <code>In Progress</code>, or <code>Resolved</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     *
     * @param status <p>
     *            The OpsItem status. Status can be <code>Open</code>,
     *            <code>In Progress</code>, or <code>Resolved</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OpsItemStatus
     */
    public OpsItemSummary withStatus(OpsItemStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(oi)-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the OpsItem.
     *         </p>
     */
    public String getOpsItemId() {
        return opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(oi)-[0-9a-f]{12}$<br/>
     *
     * @param opsItemId <p>
     *            The ID of the OpsItem.
     *            </p>
     */
    public void setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(oi)-[0-9a-f]{12}$<br/>
     *
     * @param opsItemId <p>
     *            The ID of the OpsItem.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsItemSummary withOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
        return this;
    }

    /**
     * <p>
     * A short heading that describes the nature of the OpsItem and the impacted
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A short heading that describes the nature of the OpsItem and the
     *         impacted resource.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * A short heading that describes the nature of the OpsItem and the impacted
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param title <p>
     *            A short heading that describes the nature of the OpsItem and
     *            the impacted resource.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * A short heading that describes the nature of the OpsItem and the impacted
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param title <p>
     *            A short heading that describes the nature of the OpsItem and
     *            the impacted resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsItemSummary withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * Operational data is custom data that provides useful reference details
     * about the OpsItem.
     * </p>
     *
     * @return <p>
     *         Operational data is custom data that provides useful reference
     *         details about the OpsItem.
     *         </p>
     */
    public java.util.Map<String, OpsItemDataValue> getOperationalData() {
        return operationalData;
    }

    /**
     * <p>
     * Operational data is custom data that provides useful reference details
     * about the OpsItem.
     * </p>
     *
     * @param operationalData <p>
     *            Operational data is custom data that provides useful reference
     *            details about the OpsItem.
     *            </p>
     */
    public void setOperationalData(java.util.Map<String, OpsItemDataValue> operationalData) {
        this.operationalData = operationalData;
    }

    /**
     * <p>
     * Operational data is custom data that provides useful reference details
     * about the OpsItem.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operationalData <p>
     *            Operational data is custom data that provides useful reference
     *            details about the OpsItem.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsItemSummary withOperationalData(
            java.util.Map<String, OpsItemDataValue> operationalData) {
        this.operationalData = operationalData;
        return this;
    }

    /**
     * <p>
     * Operational data is custom data that provides useful reference details
     * about the OpsItem.
     * </p>
     * <p>
     * The method adds a new key-value pair into OperationalData parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into OperationalData.
     * @param value The corresponding value of the entry to be added into
     *            OperationalData.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsItemSummary addOperationalDataEntry(String key, OpsItemDataValue value) {
        if (null == this.operationalData) {
            this.operationalData = new java.util.HashMap<String, OpsItemDataValue>();
        }
        if (this.operationalData.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.operationalData.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into OperationalData.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public OpsItemSummary clearOperationalDataEntries() {
        this.operationalData = null;
        return this;
    }

    /**
     * <p>
     * A list of OpsItems by category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         A list of OpsItems by category.
     *         </p>
     */
    public String getCategory() {
        return category;
    }

    /**
     * <p>
     * A list of OpsItems by category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param category <p>
     *            A list of OpsItems by category.
     *            </p>
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * A list of OpsItems by category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param category <p>
     *            A list of OpsItems by category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsItemSummary withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * <p>
     * A list of OpsItems by severity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         A list of OpsItems by severity.
     *         </p>
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * <p>
     * A list of OpsItems by severity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param severity <p>
     *            A list of OpsItems by severity.
     *            </p>
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * A list of OpsItems by severity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param severity <p>
     *            A list of OpsItems by severity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsItemSummary withSeverity(String severity) {
        this.severity = severity;
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
        if (getCreatedBy() != null)
            sb.append("CreatedBy: " + getCreatedBy() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: " + getLastModifiedBy() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getOpsItemId() != null)
            sb.append("OpsItemId: " + getOpsItemId() + ",");
        if (getTitle() != null)
            sb.append("Title: " + getTitle() + ",");
        if (getOperationalData() != null)
            sb.append("OperationalData: " + getOperationalData() + ",");
        if (getCategory() != null)
            sb.append("Category: " + getCategory() + ",");
        if (getSeverity() != null)
            sb.append("Severity: " + getSeverity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOpsItemId() == null) ? 0 : getOpsItemId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode
                + ((getOperationalData() == null) ? 0 : getOperationalData().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpsItemSummary == false)
            return false;
        OpsItemSummary other = (OpsItemSummary) obj;

        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null
                && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null
                && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOpsItemId() == null ^ this.getOpsItemId() == null)
            return false;
        if (other.getOpsItemId() != null
                && other.getOpsItemId().equals(this.getOpsItemId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getOperationalData() == null ^ this.getOperationalData() == null)
            return false;
        if (other.getOperationalData() != null
                && other.getOperationalData().equals(this.getOperationalData()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        return true;
    }
}

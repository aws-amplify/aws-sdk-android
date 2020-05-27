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

/**
 * <p>
 * Contains information about the finding, which is generated when abnormal or
 * suspicious activity is detected.
 * </p>
 */
public class Finding implements Serializable {
    /**
     * <p>
     * The ID of the account in which the finding was generated.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The ARN of the finding.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The confidence score for the finding.
     * </p>
     */
    private Double confidence;

    /**
     * <p>
     * The time and date when the finding was created.
     * </p>
     */
    private String createdAt;

    /**
     * <p>
     * The description of the finding.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the finding.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The partition associated with the finding.
     * </p>
     */
    private String partition;

    /**
     * <p>
     * The Region where the finding was generated.
     * </p>
     */
    private String region;

    /**
     * <p>
     * Contains information about the AWS resource associated with the activity
     * that prompted GuardDuty to generate a finding.
     * </p>
     */
    private Resource resource;

    /**
     * <p>
     * The version of the schema used for the finding.
     * </p>
     */
    private String schemaVersion;

    /**
     * <p>
     * Contains additional information about the generated finding.
     * </p>
     */
    private Service service;

    /**
     * <p>
     * The severity of the finding.
     * </p>
     */
    private Double severity;

    /**
     * <p>
     * The title of the finding.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The type of finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String type;

    /**
     * <p>
     * The time and date when the finding was last updated.
     * </p>
     */
    private String updatedAt;

    /**
     * <p>
     * The ID of the account in which the finding was generated.
     * </p>
     *
     * @return <p>
     *         The ID of the account in which the finding was generated.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The ID of the account in which the finding was generated.
     * </p>
     *
     * @param accountId <p>
     *            The ID of the account in which the finding was generated.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the account in which the finding was generated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The ID of the account in which the finding was generated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The ARN of the finding.
     * </p>
     *
     * @return <p>
     *         The ARN of the finding.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN of the finding.
     * </p>
     *
     * @param arn <p>
     *            The ARN of the finding.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The ARN of the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The confidence score for the finding.
     * </p>
     *
     * @return <p>
     *         The confidence score for the finding.
     *         </p>
     */
    public Double getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The confidence score for the finding.
     * </p>
     *
     * @param confidence <p>
     *            The confidence score for the finding.
     *            </p>
     */
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence score for the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param confidence <p>
     *            The confidence score for the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * <p>
     * The time and date when the finding was created.
     * </p>
     *
     * @return <p>
     *         The time and date when the finding was created.
     *         </p>
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The time and date when the finding was created.
     * </p>
     *
     * @param createdAt <p>
     *            The time and date when the finding was created.
     *            </p>
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time and date when the finding was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The time and date when the finding was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     *
     * @return <p>
     *         The description of the finding.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     *
     * @param description <p>
     *            The description of the finding.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     *
     * @return <p>
     *         The ID of the finding.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     *
     * @param id <p>
     *            The ID of the finding.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The ID of the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The partition associated with the finding.
     * </p>
     *
     * @return <p>
     *         The partition associated with the finding.
     *         </p>
     */
    public String getPartition() {
        return partition;
    }

    /**
     * <p>
     * The partition associated with the finding.
     * </p>
     *
     * @param partition <p>
     *            The partition associated with the finding.
     *            </p>
     */
    public void setPartition(String partition) {
        this.partition = partition;
    }

    /**
     * <p>
     * The partition associated with the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partition <p>
     *            The partition associated with the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withPartition(String partition) {
        this.partition = partition;
        return this;
    }

    /**
     * <p>
     * The Region where the finding was generated.
     * </p>
     *
     * @return <p>
     *         The Region where the finding was generated.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The Region where the finding was generated.
     * </p>
     *
     * @param region <p>
     *            The Region where the finding was generated.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Region where the finding was generated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region <p>
     *            The Region where the finding was generated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * Contains information about the AWS resource associated with the activity
     * that prompted GuardDuty to generate a finding.
     * </p>
     *
     * @return <p>
     *         Contains information about the AWS resource associated with the
     *         activity that prompted GuardDuty to generate a finding.
     *         </p>
     */
    public Resource getResource() {
        return resource;
    }

    /**
     * <p>
     * Contains information about the AWS resource associated with the activity
     * that prompted GuardDuty to generate a finding.
     * </p>
     *
     * @param resource <p>
     *            Contains information about the AWS resource associated with
     *            the activity that prompted GuardDuty to generate a finding.
     *            </p>
     */
    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * Contains information about the AWS resource associated with the activity
     * that prompted GuardDuty to generate a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resource <p>
     *            Contains information about the AWS resource associated with
     *            the activity that prompted GuardDuty to generate a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withResource(Resource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * <p>
     * The version of the schema used for the finding.
     * </p>
     *
     * @return <p>
     *         The version of the schema used for the finding.
     *         </p>
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * <p>
     * The version of the schema used for the finding.
     * </p>
     *
     * @param schemaVersion <p>
     *            The version of the schema used for the finding.
     *            </p>
     */
    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The version of the schema used for the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemaVersion <p>
     *            The version of the schema used for the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }

    /**
     * <p>
     * Contains additional information about the generated finding.
     * </p>
     *
     * @return <p>
     *         Contains additional information about the generated finding.
     *         </p>
     */
    public Service getService() {
        return service;
    }

    /**
     * <p>
     * Contains additional information about the generated finding.
     * </p>
     *
     * @param service <p>
     *            Contains additional information about the generated finding.
     *            </p>
     */
    public void setService(Service service) {
        this.service = service;
    }

    /**
     * <p>
     * Contains additional information about the generated finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param service <p>
     *            Contains additional information about the generated finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withService(Service service) {
        this.service = service;
        return this;
    }

    /**
     * <p>
     * The severity of the finding.
     * </p>
     *
     * @return <p>
     *         The severity of the finding.
     *         </p>
     */
    public Double getSeverity() {
        return severity;
    }

    /**
     * <p>
     * The severity of the finding.
     * </p>
     *
     * @param severity <p>
     *            The severity of the finding.
     *            </p>
     */
    public void setSeverity(Double severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param severity <p>
     *            The severity of the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withSeverity(Double severity) {
        this.severity = severity;
        return this;
    }

    /**
     * <p>
     * The title of the finding.
     * </p>
     *
     * @return <p>
     *         The title of the finding.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The title of the finding.
     * </p>
     *
     * @param title <p>
     *            The title of the finding.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param title <p>
     *            The title of the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The type of finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return <p>
     *         The type of finding.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param type <p>
     *            The type of finding.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param type <p>
     *            The type of finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The time and date when the finding was last updated.
     * </p>
     *
     * @return <p>
     *         The time and date when the finding was last updated.
     *         </p>
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The time and date when the finding was last updated.
     * </p>
     *
     * @param updatedAt <p>
     *            The time and date when the finding was last updated.
     *            </p>
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time and date when the finding was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The time and date when the finding was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getPartition() != null)
            sb.append("Partition: " + getPartition() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getResource() != null)
            sb.append("Resource: " + getResource() + ",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: " + getSchemaVersion() + ",");
        if (getService() != null)
            sb.append("Service: " + getService() + ",");
        if (getSeverity() != null)
            sb.append("Severity: " + getSeverity() + ",");
        if (getTitle() != null)
            sb.append("Title: " + getTitle() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: " + getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPartition() == null) ? 0 : getPartition().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode
                + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Finding == false)
            return false;
        Finding other = (Finding) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPartition() == null ^ this.getPartition() == null)
            return false;
        if (other.getPartition() != null
                && other.getPartition().equals(this.getPartition()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null
                && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null
                && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }
}

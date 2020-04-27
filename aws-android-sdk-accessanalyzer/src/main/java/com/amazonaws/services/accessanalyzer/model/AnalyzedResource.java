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

package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;

/**
 * <p>
 * Contains details about the analyzed resource.
 * </p>
 */
public class AnalyzedResource implements Serializable {
    /**
     * <p>
     * The actions that an external principal is granted permission to use by
     * the policy that generated the finding.
     * </p>
     */
    private java.util.List<String> actions;

    /**
     * <p>
     * The time at which the resource was analyzed.
     * </p>
     */
    private java.util.Date analyzedAt;

    /**
     * <p>
     * The time at which the finding was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * An error message.
     * </p>
     */
    private String error;

    /**
     * <p>
     * Indicates whether the policy that generated the finding grants public
     * access to the resource.
     * </p>
     */
    private Boolean isPublic;

    /**
     * <p>
     * The ARN of the resource that was analyzed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:[^:]*:[^:]*:[^:]*:[^:]*:.*$<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * The AWS account ID that owns the resource.
     * </p>
     */
    private String resourceOwnerAccount;

    /**
     * <p>
     * The type of the resource that was analyzed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     */
    private String resourceType;

    /**
     * <p>
     * Indicates how the access that generated the finding is granted. This is
     * populated for Amazon S3 bucket findings.
     * </p>
     */
    private java.util.List<String> sharedVia;

    /**
     * <p>
     * The current status of the finding generated from the analyzed resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED, RESOLVED
     */
    private String status;

    /**
     * <p>
     * The time at which the finding was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The actions that an external principal is granted permission to use by
     * the policy that generated the finding.
     * </p>
     *
     * @return <p>
     *         The actions that an external principal is granted permission to
     *         use by the policy that generated the finding.
     *         </p>
     */
    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions that an external principal is granted permission to use by
     * the policy that generated the finding.
     * </p>
     *
     * @param actions <p>
     *            The actions that an external principal is granted permission
     *            to use by the policy that generated the finding.
     *            </p>
     */
    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * The actions that an external principal is granted permission to use by
     * the policy that generated the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The actions that an external principal is granted permission
     *            to use by the policy that generated the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzedResource withActions(String... actions) {
        if (getActions() == null) {
            this.actions = new java.util.ArrayList<String>(actions.length);
        }
        for (String value : actions) {
            this.actions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The actions that an external principal is granted permission to use by
     * the policy that generated the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The actions that an external principal is granted permission
     *            to use by the policy that generated the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzedResource withActions(java.util.Collection<String> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The time at which the resource was analyzed.
     * </p>
     *
     * @return <p>
     *         The time at which the resource was analyzed.
     *         </p>
     */
    public java.util.Date getAnalyzedAt() {
        return analyzedAt;
    }

    /**
     * <p>
     * The time at which the resource was analyzed.
     * </p>
     *
     * @param analyzedAt <p>
     *            The time at which the resource was analyzed.
     *            </p>
     */
    public void setAnalyzedAt(java.util.Date analyzedAt) {
        this.analyzedAt = analyzedAt;
    }

    /**
     * <p>
     * The time at which the resource was analyzed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyzedAt <p>
     *            The time at which the resource was analyzed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzedResource withAnalyzedAt(java.util.Date analyzedAt) {
        this.analyzedAt = analyzedAt;
        return this;
    }

    /**
     * <p>
     * The time at which the finding was created.
     * </p>
     *
     * @return <p>
     *         The time at which the finding was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The time at which the finding was created.
     * </p>
     *
     * @param createdAt <p>
     *            The time at which the finding was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the finding was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The time at which the finding was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzedResource withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * An error message.
     * </p>
     *
     * @return <p>
     *         An error message.
     *         </p>
     */
    public String getError() {
        return error;
    }

    /**
     * <p>
     * An error message.
     * </p>
     *
     * @param error <p>
     *            An error message.
     *            </p>
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * An error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param error <p>
     *            An error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzedResource withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * <p>
     * Indicates whether the policy that generated the finding grants public
     * access to the resource.
     * </p>
     *
     * @return <p>
     *         Indicates whether the policy that generated the finding grants
     *         public access to the resource.
     *         </p>
     */
    public Boolean isIsPublic() {
        return isPublic;
    }

    /**
     * <p>
     * Indicates whether the policy that generated the finding grants public
     * access to the resource.
     * </p>
     *
     * @return <p>
     *         Indicates whether the policy that generated the finding grants
     *         public access to the resource.
     *         </p>
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    /**
     * <p>
     * Indicates whether the policy that generated the finding grants public
     * access to the resource.
     * </p>
     *
     * @param isPublic <p>
     *            Indicates whether the policy that generated the finding grants
     *            public access to the resource.
     *            </p>
     */
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * <p>
     * Indicates whether the policy that generated the finding grants public
     * access to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isPublic <p>
     *            Indicates whether the policy that generated the finding grants
     *            public access to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzedResource withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    /**
     * <p>
     * The ARN of the resource that was analyzed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:[^:]*:[^:]*:[^:]*:[^:]*:.*$<br/>
     *
     * @return <p>
     *         The ARN of the resource that was analyzed.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource that was analyzed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:[^:]*:[^:]*:[^:]*:[^:]*:.*$<br/>
     *
     * @param resourceArn <p>
     *            The ARN of the resource that was analyzed.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource that was analyzed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:[^:]*:[^:]*:[^:]*:[^:]*:.*$<br/>
     *
     * @param resourceArn <p>
     *            The ARN of the resource that was analyzed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzedResource withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * The AWS account ID that owns the resource.
     * </p>
     *
     * @return <p>
     *         The AWS account ID that owns the resource.
     *         </p>
     */
    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    /**
     * <p>
     * The AWS account ID that owns the resource.
     * </p>
     *
     * @param resourceOwnerAccount <p>
     *            The AWS account ID that owns the resource.
     *            </p>
     */
    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    /**
     * <p>
     * The AWS account ID that owns the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceOwnerAccount <p>
     *            The AWS account ID that owns the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzedResource withResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }

    /**
     * <p>
     * The type of the resource that was analyzed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @return <p>
     *         The type of the resource that was analyzed.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of the resource that was analyzed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @param resourceType <p>
     *            The type of the resource that was analyzed.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource that was analyzed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @param resourceType <p>
     *            The type of the resource that was analyzed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public AnalyzedResource withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of the resource that was analyzed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @param resourceType <p>
     *            The type of the resource that was analyzed.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of the resource that was analyzed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @param resourceType <p>
     *            The type of the resource that was analyzed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public AnalyzedResource withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates how the access that generated the finding is granted. This is
     * populated for Amazon S3 bucket findings.
     * </p>
     *
     * @return <p>
     *         Indicates how the access that generated the finding is granted.
     *         This is populated for Amazon S3 bucket findings.
     *         </p>
     */
    public java.util.List<String> getSharedVia() {
        return sharedVia;
    }

    /**
     * <p>
     * Indicates how the access that generated the finding is granted. This is
     * populated for Amazon S3 bucket findings.
     * </p>
     *
     * @param sharedVia <p>
     *            Indicates how the access that generated the finding is
     *            granted. This is populated for Amazon S3 bucket findings.
     *            </p>
     */
    public void setSharedVia(java.util.Collection<String> sharedVia) {
        if (sharedVia == null) {
            this.sharedVia = null;
            return;
        }

        this.sharedVia = new java.util.ArrayList<String>(sharedVia);
    }

    /**
     * <p>
     * Indicates how the access that generated the finding is granted. This is
     * populated for Amazon S3 bucket findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sharedVia <p>
     *            Indicates how the access that generated the finding is
     *            granted. This is populated for Amazon S3 bucket findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzedResource withSharedVia(String... sharedVia) {
        if (getSharedVia() == null) {
            this.sharedVia = new java.util.ArrayList<String>(sharedVia.length);
        }
        for (String value : sharedVia) {
            this.sharedVia.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Indicates how the access that generated the finding is granted. This is
     * populated for Amazon S3 bucket findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sharedVia <p>
     *            Indicates how the access that generated the finding is
     *            granted. This is populated for Amazon S3 bucket findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzedResource withSharedVia(java.util.Collection<String> sharedVia) {
        setSharedVia(sharedVia);
        return this;
    }

    /**
     * <p>
     * The current status of the finding generated from the analyzed resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED, RESOLVED
     *
     * @return <p>
     *         The current status of the finding generated from the analyzed
     *         resource.
     *         </p>
     * @see FindingStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the finding generated from the analyzed resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED, RESOLVED
     *
     * @param status <p>
     *            The current status of the finding generated from the analyzed
     *            resource.
     *            </p>
     * @see FindingStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the finding generated from the analyzed resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED, RESOLVED
     *
     * @param status <p>
     *            The current status of the finding generated from the analyzed
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingStatus
     */
    public AnalyzedResource withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the finding generated from the analyzed resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED, RESOLVED
     *
     * @param status <p>
     *            The current status of the finding generated from the analyzed
     *            resource.
     *            </p>
     * @see FindingStatus
     */
    public void setStatus(FindingStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the finding generated from the analyzed resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED, RESOLVED
     *
     * @param status <p>
     *            The current status of the finding generated from the analyzed
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingStatus
     */
    public AnalyzedResource withStatus(FindingStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the finding was updated.
     * </p>
     *
     * @return <p>
     *         The time at which the finding was updated.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The time at which the finding was updated.
     * </p>
     *
     * @param updatedAt <p>
     *            The time at which the finding was updated.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the finding was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The time at which the finding was updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzedResource withUpdatedAt(java.util.Date updatedAt) {
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
        if (getActions() != null)
            sb.append("actions: " + getActions() + ",");
        if (getAnalyzedAt() != null)
            sb.append("analyzedAt: " + getAnalyzedAt() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getError() != null)
            sb.append("error: " + getError() + ",");
        if (getIsPublic() != null)
            sb.append("isPublic: " + getIsPublic() + ",");
        if (getResourceArn() != null)
            sb.append("resourceArn: " + getResourceArn() + ",");
        if (getResourceOwnerAccount() != null)
            sb.append("resourceOwnerAccount: " + getResourceOwnerAccount() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getSharedVia() != null)
            sb.append("sharedVia: " + getSharedVia() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getUpdatedAt() != null)
            sb.append("updatedAt: " + getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getAnalyzedAt() == null) ? 0 : getAnalyzedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getIsPublic() == null) ? 0 : getIsPublic().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getResourceOwnerAccount() == null) ? 0 : getResourceOwnerAccount().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSharedVia() == null) ? 0 : getSharedVia().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyzedResource == false)
            return false;
        AnalyzedResource other = (AnalyzedResource) obj;

        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getAnalyzedAt() == null ^ this.getAnalyzedAt() == null)
            return false;
        if (other.getAnalyzedAt() != null
                && other.getAnalyzedAt().equals(this.getAnalyzedAt()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getIsPublic() == null ^ this.getIsPublic() == null)
            return false;
        if (other.getIsPublic() != null && other.getIsPublic().equals(this.getIsPublic()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceOwnerAccount() == null ^ this.getResourceOwnerAccount() == null)
            return false;
        if (other.getResourceOwnerAccount() != null
                && other.getResourceOwnerAccount().equals(this.getResourceOwnerAccount()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSharedVia() == null ^ this.getSharedVia() == null)
            return false;
        if (other.getSharedVia() != null
                && other.getSharedVia().equals(this.getSharedVia()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null
                && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }
}

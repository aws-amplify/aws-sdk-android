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
 * Contains the ARN of the analyzed resource.
 * </p>
 */
public class AnalyzedResourceSummary implements Serializable {
    /**
     * <p>
     * The ARN of the analyzed resource.
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
     * The type of resource that was analyzed.
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
     * The ARN of the analyzed resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:[^:]*:[^:]*:[^:]*:[^:]*:.*$<br/>
     *
     * @return <p>
     *         The ARN of the analyzed resource.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN of the analyzed resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:[^:]*:[^:]*:[^:]*:[^:]*:.*$<br/>
     *
     * @param resourceArn <p>
     *            The ARN of the analyzed resource.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the analyzed resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:[^:]*:[^:]*:[^:]*:[^:]*:.*$<br/>
     *
     * @param resourceArn <p>
     *            The ARN of the analyzed resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzedResourceSummary withResourceArn(String resourceArn) {
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
    public AnalyzedResourceSummary withResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }

    /**
     * <p>
     * The type of resource that was analyzed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @return <p>
     *         The type of resource that was analyzed.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource that was analyzed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @param resourceType <p>
     *            The type of resource that was analyzed.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource that was analyzed.
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
     *            The type of resource that was analyzed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public AnalyzedResourceSummary withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of resource that was analyzed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @param resourceType <p>
     *            The type of resource that was analyzed.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of resource that was analyzed.
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
     *            The type of resource that was analyzed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public AnalyzedResourceSummary withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getResourceArn() != null)
            sb.append("resourceArn: " + getResourceArn() + ",");
        if (getResourceOwnerAccount() != null)
            sb.append("resourceOwnerAccount: " + getResourceOwnerAccount() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getResourceOwnerAccount() == null) ? 0 : getResourceOwnerAccount().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyzedResourceSummary == false)
            return false;
        AnalyzedResourceSummary other = (AnalyzedResourceSummary) obj;

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
        return true;
    }
}

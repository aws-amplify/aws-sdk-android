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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


/**
 * <p>The operation that you want this job to perform on each object listed in the manifest. For more information about the available operations, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html">Available Operations</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
 */
public class JobOperation implements Serializable {
    /**
     * <p>Directs the specified job to invoke an AWS Lambda function on each object in the manifest.</p>
     */
    private LambdaInvokeOperation lambdaInvoke;

    /**
     * <p>Directs the specified job to execute a PUT Copy object call on each object in the manifest.</p>
     */
    private S3CopyObjectOperation s3PutObjectCopy;

    /**
     * <p>Directs the specified job to execute a PUT Object acl call on each object in the manifest.</p>
     */
    private S3SetObjectAclOperation s3PutObjectAcl;

    /**
     * <p>Directs the specified job to execute a PUT Object tagging call on each object in the manifest.</p>
     */
    private S3SetObjectTaggingOperation s3PutObjectTagging;

    /**
     * <p>Directs the specified job to execute an Initiate Glacier Restore call on each object in the manifest.</p>
     */
    private S3InitiateRestoreObjectOperation s3InitiateRestoreObject;

    /**
     * <p>Contains the configuration parameters for a Set Object Legal Hold operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object Legal Hold API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.htmll#object-lock-legal-holds">PUT Object Legal Hold</a>.</p>
     */
    private S3SetObjectLegalHoldOperation s3PutObjectLegalHold;

    /**
     * <p>Contains the configuration parameters for a Set Object Retention operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object Retention API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes">PUT Object Retention</a>.</p>
     */
    private S3SetObjectRetentionOperation s3PutObjectRetention;

    /**
     * <p>Directs the specified job to invoke an AWS Lambda function on each object in the manifest.</p>
     *
     * @return <p>Directs the specified job to invoke an AWS Lambda function on each object in the manifest.</p>
     */
    public LambdaInvokeOperation getLambdaInvoke() {
        return lambdaInvoke;
    }

    /**
     * <p>Directs the specified job to invoke an AWS Lambda function on each object in the manifest.</p>
     *
     * @param lambdaInvoke <p>Directs the specified job to invoke an AWS Lambda function on each object in the manifest.</p>
     */
    public void setLambdaInvoke(LambdaInvokeOperation lambdaInvoke) {
        this.lambdaInvoke = lambdaInvoke;
    }

    /**
     * <p>Directs the specified job to invoke an AWS Lambda function on each object in the manifest.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lambdaInvoke <p>Directs the specified job to invoke an AWS Lambda function on each object in the manifest.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobOperation withLambdaInvoke(LambdaInvokeOperation lambdaInvoke) {
        this.lambdaInvoke = lambdaInvoke;
        return this;
    }

    /**
     * <p>Directs the specified job to execute a PUT Copy object call on each object in the manifest.</p>
     *
     * @return <p>Directs the specified job to execute a PUT Copy object call on each object in the manifest.</p>
     */
    public S3CopyObjectOperation getS3PutObjectCopy() {
        return s3PutObjectCopy;
    }

    /**
     * <p>Directs the specified job to execute a PUT Copy object call on each object in the manifest.</p>
     *
     * @param s3PutObjectCopy <p>Directs the specified job to execute a PUT Copy object call on each object in the manifest.</p>
     */
    public void setS3PutObjectCopy(S3CopyObjectOperation s3PutObjectCopy) {
        this.s3PutObjectCopy = s3PutObjectCopy;
    }

    /**
     * <p>Directs the specified job to execute a PUT Copy object call on each object in the manifest.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3PutObjectCopy <p>Directs the specified job to execute a PUT Copy object call on each object in the manifest.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobOperation withS3PutObjectCopy(S3CopyObjectOperation s3PutObjectCopy) {
        this.s3PutObjectCopy = s3PutObjectCopy;
        return this;
    }

    /**
     * <p>Directs the specified job to execute a PUT Object acl call on each object in the manifest.</p>
     *
     * @return <p>Directs the specified job to execute a PUT Object acl call on each object in the manifest.</p>
     */
    public S3SetObjectAclOperation getS3PutObjectAcl() {
        return s3PutObjectAcl;
    }

    /**
     * <p>Directs the specified job to execute a PUT Object acl call on each object in the manifest.</p>
     *
     * @param s3PutObjectAcl <p>Directs the specified job to execute a PUT Object acl call on each object in the manifest.</p>
     */
    public void setS3PutObjectAcl(S3SetObjectAclOperation s3PutObjectAcl) {
        this.s3PutObjectAcl = s3PutObjectAcl;
    }

    /**
     * <p>Directs the specified job to execute a PUT Object acl call on each object in the manifest.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3PutObjectAcl <p>Directs the specified job to execute a PUT Object acl call on each object in the manifest.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobOperation withS3PutObjectAcl(S3SetObjectAclOperation s3PutObjectAcl) {
        this.s3PutObjectAcl = s3PutObjectAcl;
        return this;
    }

    /**
     * <p>Directs the specified job to execute a PUT Object tagging call on each object in the manifest.</p>
     *
     * @return <p>Directs the specified job to execute a PUT Object tagging call on each object in the manifest.</p>
     */
    public S3SetObjectTaggingOperation getS3PutObjectTagging() {
        return s3PutObjectTagging;
    }

    /**
     * <p>Directs the specified job to execute a PUT Object tagging call on each object in the manifest.</p>
     *
     * @param s3PutObjectTagging <p>Directs the specified job to execute a PUT Object tagging call on each object in the manifest.</p>
     */
    public void setS3PutObjectTagging(S3SetObjectTaggingOperation s3PutObjectTagging) {
        this.s3PutObjectTagging = s3PutObjectTagging;
    }

    /**
     * <p>Directs the specified job to execute a PUT Object tagging call on each object in the manifest.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3PutObjectTagging <p>Directs the specified job to execute a PUT Object tagging call on each object in the manifest.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobOperation withS3PutObjectTagging(S3SetObjectTaggingOperation s3PutObjectTagging) {
        this.s3PutObjectTagging = s3PutObjectTagging;
        return this;
    }

    /**
     * <p>Directs the specified job to execute an Initiate Glacier Restore call on each object in the manifest.</p>
     *
     * @return <p>Directs the specified job to execute an Initiate Glacier Restore call on each object in the manifest.</p>
     */
    public S3InitiateRestoreObjectOperation getS3InitiateRestoreObject() {
        return s3InitiateRestoreObject;
    }

    /**
     * <p>Directs the specified job to execute an Initiate Glacier Restore call on each object in the manifest.</p>
     *
     * @param s3InitiateRestoreObject <p>Directs the specified job to execute an Initiate Glacier Restore call on each object in the manifest.</p>
     */
    public void setS3InitiateRestoreObject(S3InitiateRestoreObjectOperation s3InitiateRestoreObject) {
        this.s3InitiateRestoreObject = s3InitiateRestoreObject;
    }

    /**
     * <p>Directs the specified job to execute an Initiate Glacier Restore call on each object in the manifest.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3InitiateRestoreObject <p>Directs the specified job to execute an Initiate Glacier Restore call on each object in the manifest.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobOperation withS3InitiateRestoreObject(S3InitiateRestoreObjectOperation s3InitiateRestoreObject) {
        this.s3InitiateRestoreObject = s3InitiateRestoreObject;
        return this;
    }

    /**
     * <p>Contains the configuration parameters for a Set Object Legal Hold operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object Legal Hold API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.htmll#object-lock-legal-holds">PUT Object Legal Hold</a>.</p>
     *
     * @return <p>Contains the configuration parameters for a Set Object Legal Hold operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object Legal Hold API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.htmll#object-lock-legal-holds">PUT Object Legal Hold</a>.</p>
     */
    public S3SetObjectLegalHoldOperation getS3PutObjectLegalHold() {
        return s3PutObjectLegalHold;
    }

    /**
     * <p>Contains the configuration parameters for a Set Object Legal Hold operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object Legal Hold API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.htmll#object-lock-legal-holds">PUT Object Legal Hold</a>.</p>
     *
     * @param s3PutObjectLegalHold <p>Contains the configuration parameters for a Set Object Legal Hold operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object Legal Hold API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.htmll#object-lock-legal-holds">PUT Object Legal Hold</a>.</p>
     */
    public void setS3PutObjectLegalHold(S3SetObjectLegalHoldOperation s3PutObjectLegalHold) {
        this.s3PutObjectLegalHold = s3PutObjectLegalHold;
    }

    /**
     * <p>Contains the configuration parameters for a Set Object Legal Hold operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object Legal Hold API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.htmll#object-lock-legal-holds">PUT Object Legal Hold</a>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3PutObjectLegalHold <p>Contains the configuration parameters for a Set Object Legal Hold operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object Legal Hold API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.htmll#object-lock-legal-holds">PUT Object Legal Hold</a>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobOperation withS3PutObjectLegalHold(S3SetObjectLegalHoldOperation s3PutObjectLegalHold) {
        this.s3PutObjectLegalHold = s3PutObjectLegalHold;
        return this;
    }

    /**
     * <p>Contains the configuration parameters for a Set Object Retention operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object Retention API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes">PUT Object Retention</a>.</p>
     *
     * @return <p>Contains the configuration parameters for a Set Object Retention operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object Retention API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes">PUT Object Retention</a>.</p>
     */
    public S3SetObjectRetentionOperation getS3PutObjectRetention() {
        return s3PutObjectRetention;
    }

    /**
     * <p>Contains the configuration parameters for a Set Object Retention operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object Retention API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes">PUT Object Retention</a>.</p>
     *
     * @param s3PutObjectRetention <p>Contains the configuration parameters for a Set Object Retention operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object Retention API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes">PUT Object Retention</a>.</p>
     */
    public void setS3PutObjectRetention(S3SetObjectRetentionOperation s3PutObjectRetention) {
        this.s3PutObjectRetention = s3PutObjectRetention;
    }

    /**
     * <p>Contains the configuration parameters for a Set Object Retention operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object Retention API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes">PUT Object Retention</a>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3PutObjectRetention <p>Contains the configuration parameters for a Set Object Retention operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object Retention API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes">PUT Object Retention</a>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobOperation withS3PutObjectRetention(S3SetObjectRetentionOperation s3PutObjectRetention) {
        this.s3PutObjectRetention = s3PutObjectRetention;
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
        if (getLambdaInvoke() != null) sb.append("LambdaInvoke: " + getLambdaInvoke() + ",");
        if (getS3PutObjectCopy() != null) sb.append("S3PutObjectCopy: " + getS3PutObjectCopy() + ",");
        if (getS3PutObjectAcl() != null) sb.append("S3PutObjectAcl: " + getS3PutObjectAcl() + ",");
        if (getS3PutObjectTagging() != null) sb.append("S3PutObjectTagging: " + getS3PutObjectTagging() + ",");
        if (getS3InitiateRestoreObject() != null) sb.append("S3InitiateRestoreObject: " + getS3InitiateRestoreObject() + ",");
        if (getS3PutObjectLegalHold() != null) sb.append("S3PutObjectLegalHold: " + getS3PutObjectLegalHold() + ",");
        if (getS3PutObjectRetention() != null) sb.append("S3PutObjectRetention: " + getS3PutObjectRetention());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambdaInvoke() == null) ? 0 : getLambdaInvoke().hashCode());
        hashCode = prime * hashCode + ((getS3PutObjectCopy() == null) ? 0 : getS3PutObjectCopy().hashCode());
        hashCode = prime * hashCode + ((getS3PutObjectAcl() == null) ? 0 : getS3PutObjectAcl().hashCode());
        hashCode = prime * hashCode + ((getS3PutObjectTagging() == null) ? 0 : getS3PutObjectTagging().hashCode());
        hashCode = prime * hashCode + ((getS3InitiateRestoreObject() == null) ? 0 : getS3InitiateRestoreObject().hashCode());
        hashCode = prime * hashCode + ((getS3PutObjectLegalHold() == null) ? 0 : getS3PutObjectLegalHold().hashCode());
        hashCode = prime * hashCode + ((getS3PutObjectRetention() == null) ? 0 : getS3PutObjectRetention().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof JobOperation == false) return false;
        JobOperation other = (JobOperation)obj;

        if (other.getLambdaInvoke() == null ^ this.getLambdaInvoke() == null) return false;
        if (other.getLambdaInvoke() != null && other.getLambdaInvoke().equals(this.getLambdaInvoke()) == false) return false;
        if (other.getS3PutObjectCopy() == null ^ this.getS3PutObjectCopy() == null) return false;
        if (other.getS3PutObjectCopy() != null && other.getS3PutObjectCopy().equals(this.getS3PutObjectCopy()) == false) return false;
        if (other.getS3PutObjectAcl() == null ^ this.getS3PutObjectAcl() == null) return false;
        if (other.getS3PutObjectAcl() != null && other.getS3PutObjectAcl().equals(this.getS3PutObjectAcl()) == false) return false;
        if (other.getS3PutObjectTagging() == null ^ this.getS3PutObjectTagging() == null) return false;
        if (other.getS3PutObjectTagging() != null && other.getS3PutObjectTagging().equals(this.getS3PutObjectTagging()) == false) return false;
        if (other.getS3InitiateRestoreObject() == null ^ this.getS3InitiateRestoreObject() == null) return false;
        if (other.getS3InitiateRestoreObject() != null && other.getS3InitiateRestoreObject().equals(this.getS3InitiateRestoreObject()) == false) return false;
        if (other.getS3PutObjectLegalHold() == null ^ this.getS3PutObjectLegalHold() == null) return false;
        if (other.getS3PutObjectLegalHold() != null && other.getS3PutObjectLegalHold().equals(this.getS3PutObjectLegalHold()) == false) return false;
        if (other.getS3PutObjectRetention() == null ^ this.getS3PutObjectRetention() == null) return false;
        if (other.getS3PutObjectRetention() != null && other.getS3PutObjectRetention().equals(this.getS3PutObjectRetention()) == false) return false;
        return true;
    }
}

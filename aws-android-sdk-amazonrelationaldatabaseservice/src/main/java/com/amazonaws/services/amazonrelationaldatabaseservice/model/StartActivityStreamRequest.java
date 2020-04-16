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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts a database activity stream to monitor activity on the database. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/DBActivityStreams.html"
 * >Database Activity Streams</a> in the <i>Amazon Aurora User Guide</i>.
 * </p>
 */
public class StartActivityStreamRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB cluster, for example
     * <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * Specifies the mode of the database activity stream. Database events such
     * as a change or access generate an activity stream event. The database
     * session can handle these events either synchronously or asynchronously.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     */
    private String mode;

    /**
     * <p>
     * The AWS KMS key identifier for encrypting messages in the database
     * activity stream. The key identifier can be either a key ID, a key ARN, or
     * a key alias.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Specifies whether or not the database activity stream is to start as soon
     * as possible, regardless of the maintenance window for the database.
     * </p>
     */
    private Boolean applyImmediately;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB cluster, for example
     * <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the DB cluster, for example
     *         <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>
     *         .
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB cluster, for example
     * <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     * </p>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the DB cluster, for example
     *            <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>
     *            .
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB cluster, for example
     * <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the DB cluster, for example
     *            <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartActivityStreamRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * Specifies the mode of the database activity stream. Database events such
     * as a change or access generate an activity stream event. The database
     * session can handle these events either synchronously or asynchronously.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     *
     * @return <p>
     *         Specifies the mode of the database activity stream. Database
     *         events such as a change or access generate an activity stream
     *         event. The database session can handle these events either
     *         synchronously or asynchronously.
     *         </p>
     * @see ActivityStreamMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * Specifies the mode of the database activity stream. Database events such
     * as a change or access generate an activity stream event. The database
     * session can handle these events either synchronously or asynchronously.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     *
     * @param mode <p>
     *            Specifies the mode of the database activity stream. Database
     *            events such as a change or access generate an activity stream
     *            event. The database session can handle these events either
     *            synchronously or asynchronously.
     *            </p>
     * @see ActivityStreamMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Specifies the mode of the database activity stream. Database events such
     * as a change or access generate an activity stream event. The database
     * session can handle these events either synchronously or asynchronously.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     *
     * @param mode <p>
     *            Specifies the mode of the database activity stream. Database
     *            events such as a change or access generate an activity stream
     *            event. The database session can handle these events either
     *            synchronously or asynchronously.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActivityStreamMode
     */
    public StartActivityStreamRequest withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * Specifies the mode of the database activity stream. Database events such
     * as a change or access generate an activity stream event. The database
     * session can handle these events either synchronously or asynchronously.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     *
     * @param mode <p>
     *            Specifies the mode of the database activity stream. Database
     *            events such as a change or access generate an activity stream
     *            event. The database session can handle these events either
     *            synchronously or asynchronously.
     *            </p>
     * @see ActivityStreamMode
     */
    public void setMode(ActivityStreamMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * Specifies the mode of the database activity stream. Database events such
     * as a change or access generate an activity stream event. The database
     * session can handle these events either synchronously or asynchronously.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     *
     * @param mode <p>
     *            Specifies the mode of the database activity stream. Database
     *            events such as a change or access generate an activity stream
     *            event. The database session can handle these events either
     *            synchronously or asynchronously.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActivityStreamMode
     */
    public StartActivityStreamRequest withMode(ActivityStreamMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encrypting messages in the database
     * activity stream. The key identifier can be either a key ID, a key ARN, or
     * a key alias.
     * </p>
     *
     * @return <p>
     *         The AWS KMS key identifier for encrypting messages in the
     *         database activity stream. The key identifier can be either a key
     *         ID, a key ARN, or a key alias.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encrypting messages in the database
     * activity stream. The key identifier can be either a key ID, a key ARN, or
     * a key alias.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key identifier for encrypting messages in the
     *            database activity stream. The key identifier can be either a
     *            key ID, a key ARN, or a key alias.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encrypting messages in the database
     * activity stream. The key identifier can be either a key ID, a key ARN, or
     * a key alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key identifier for encrypting messages in the
     *            database activity stream. The key identifier can be either a
     *            key ID, a key ARN, or a key alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartActivityStreamRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * Specifies whether or not the database activity stream is to start as soon
     * as possible, regardless of the maintenance window for the database.
     * </p>
     *
     * @return <p>
     *         Specifies whether or not the database activity stream is to start
     *         as soon as possible, regardless of the maintenance window for the
     *         database.
     *         </p>
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * Specifies whether or not the database activity stream is to start as soon
     * as possible, regardless of the maintenance window for the database.
     * </p>
     *
     * @return <p>
     *         Specifies whether or not the database activity stream is to start
     *         as soon as possible, regardless of the maintenance window for the
     *         database.
     *         </p>
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * Specifies whether or not the database activity stream is to start as soon
     * as possible, regardless of the maintenance window for the database.
     * </p>
     *
     * @param applyImmediately <p>
     *            Specifies whether or not the database activity stream is to
     *            start as soon as possible, regardless of the maintenance
     *            window for the database.
     *            </p>
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * Specifies whether or not the database activity stream is to start as soon
     * as possible, regardless of the maintenance window for the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyImmediately <p>
     *            Specifies whether or not the database activity stream is to
     *            start as soon as possible, regardless of the maintenance
     *            window for the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartActivityStreamRequest withApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
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
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getMode() != null)
            sb.append("Mode: " + getMode() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: " + getApplyImmediately());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartActivityStreamRequest == false)
            return false;
        StartActivityStreamRequest other = (StartActivityStreamRequest) obj;

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null
                && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        return true;
    }
}

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

package com.amazonaws.services.macie.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the classification types for the specified S3 resources. If
 * memberAccountId isn't specified, the action updates the classification types
 * of the S3 resources associated with Amazon Macie Classic for the current
 * master account. If memberAccountId is specified, the action updates the
 * classification types of the S3 resources associated with Amazon Macie Classic
 * for the specified member account.
 * </p>
 */
public class UpdateS3ResourcesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The AWS ID of the Amazon Macie Classic member account whose S3 resources'
     * classification types you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String memberAccountId;

    /**
     * <p>
     * The S3 resources whose classification types you want to update.
     * </p>
     */
    private java.util.List<S3ResourceClassificationUpdate> s3ResourcesUpdate;

    /**
     * <p>
     * The AWS ID of the Amazon Macie Classic member account whose S3 resources'
     * classification types you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>
     *         The AWS ID of the Amazon Macie Classic member account whose S3
     *         resources' classification types you want to update.
     *         </p>
     */
    public String getMemberAccountId() {
        return memberAccountId;
    }

    /**
     * <p>
     * The AWS ID of the Amazon Macie Classic member account whose S3 resources'
     * classification types you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param memberAccountId <p>
     *            The AWS ID of the Amazon Macie Classic member account whose S3
     *            resources' classification types you want to update.
     *            </p>
     */
    public void setMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    /**
     * <p>
     * The AWS ID of the Amazon Macie Classic member account whose S3 resources'
     * classification types you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param memberAccountId <p>
     *            The AWS ID of the Amazon Macie Classic member account whose S3
     *            resources' classification types you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateS3ResourcesRequest withMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
        return this;
    }

    /**
     * <p>
     * The S3 resources whose classification types you want to update.
     * </p>
     *
     * @return <p>
     *         The S3 resources whose classification types you want to update.
     *         </p>
     */
    public java.util.List<S3ResourceClassificationUpdate> getS3ResourcesUpdate() {
        return s3ResourcesUpdate;
    }

    /**
     * <p>
     * The S3 resources whose classification types you want to update.
     * </p>
     *
     * @param s3ResourcesUpdate <p>
     *            The S3 resources whose classification types you want to
     *            update.
     *            </p>
     */
    public void setS3ResourcesUpdate(
            java.util.Collection<S3ResourceClassificationUpdate> s3ResourcesUpdate) {
        if (s3ResourcesUpdate == null) {
            this.s3ResourcesUpdate = null;
            return;
        }

        this.s3ResourcesUpdate = new java.util.ArrayList<S3ResourceClassificationUpdate>(
                s3ResourcesUpdate);
    }

    /**
     * <p>
     * The S3 resources whose classification types you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3ResourcesUpdate <p>
     *            The S3 resources whose classification types you want to
     *            update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateS3ResourcesRequest withS3ResourcesUpdate(
            S3ResourceClassificationUpdate... s3ResourcesUpdate) {
        if (getS3ResourcesUpdate() == null) {
            this.s3ResourcesUpdate = new java.util.ArrayList<S3ResourceClassificationUpdate>(
                    s3ResourcesUpdate.length);
        }
        for (S3ResourceClassificationUpdate value : s3ResourcesUpdate) {
            this.s3ResourcesUpdate.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The S3 resources whose classification types you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3ResourcesUpdate <p>
     *            The S3 resources whose classification types you want to
     *            update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateS3ResourcesRequest withS3ResourcesUpdate(
            java.util.Collection<S3ResourceClassificationUpdate> s3ResourcesUpdate) {
        setS3ResourcesUpdate(s3ResourcesUpdate);
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
        if (getMemberAccountId() != null)
            sb.append("memberAccountId: " + getMemberAccountId() + ",");
        if (getS3ResourcesUpdate() != null)
            sb.append("s3ResourcesUpdate: " + getS3ResourcesUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMemberAccountId() == null) ? 0 : getMemberAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getS3ResourcesUpdate() == null) ? 0 : getS3ResourcesUpdate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateS3ResourcesRequest == false)
            return false;
        UpdateS3ResourcesRequest other = (UpdateS3ResourcesRequest) obj;

        if (other.getMemberAccountId() == null ^ this.getMemberAccountId() == null)
            return false;
        if (other.getMemberAccountId() != null
                && other.getMemberAccountId().equals(this.getMemberAccountId()) == false)
            return false;
        if (other.getS3ResourcesUpdate() == null ^ this.getS3ResourcesUpdate() == null)
            return false;
        if (other.getS3ResourcesUpdate() != null
                && other.getS3ResourcesUpdate().equals(this.getS3ResourcesUpdate()) == false)
            return false;
        return true;
    }
}

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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * Summary of the information about a CloudFront origin access identity.
 * </p>
 */
public class CloudFrontOriginAccessIdentitySummary implements Serializable {
    /**
     * <p>
     * The ID for the origin access identity. For example:
     * <code>E74FTE3AJFJ256A</code>.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The Amazon S3 canonical user ID for the origin access identity, which you
     * use when giving the origin access identity read permission to an object
     * in Amazon S3.
     * </p>
     */
    private String s3CanonicalUserId;

    /**
     * <p>
     * The comment for this origin access identity, as originally specified when
     * created.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The ID for the origin access identity. For example:
     * <code>E74FTE3AJFJ256A</code>.
     * </p>
     *
     * @return <p>
     *         The ID for the origin access identity. For example:
     *         <code>E74FTE3AJFJ256A</code>.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID for the origin access identity. For example:
     * <code>E74FTE3AJFJ256A</code>.
     * </p>
     *
     * @param id <p>
     *            The ID for the origin access identity. For example:
     *            <code>E74FTE3AJFJ256A</code>.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for the origin access identity. For example:
     * <code>E74FTE3AJFJ256A</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The ID for the origin access identity. For example:
     *            <code>E74FTE3AJFJ256A</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentitySummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 canonical user ID for the origin access identity, which you
     * use when giving the origin access identity read permission to an object
     * in Amazon S3.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 canonical user ID for the origin access identity,
     *         which you use when giving the origin access identity read
     *         permission to an object in Amazon S3.
     *         </p>
     */
    public String getS3CanonicalUserId() {
        return s3CanonicalUserId;
    }

    /**
     * <p>
     * The Amazon S3 canonical user ID for the origin access identity, which you
     * use when giving the origin access identity read permission to an object
     * in Amazon S3.
     * </p>
     *
     * @param s3CanonicalUserId <p>
     *            The Amazon S3 canonical user ID for the origin access
     *            identity, which you use when giving the origin access identity
     *            read permission to an object in Amazon S3.
     *            </p>
     */
    public void setS3CanonicalUserId(String s3CanonicalUserId) {
        this.s3CanonicalUserId = s3CanonicalUserId;
    }

    /**
     * <p>
     * The Amazon S3 canonical user ID for the origin access identity, which you
     * use when giving the origin access identity read permission to an object
     * in Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3CanonicalUserId <p>
     *            The Amazon S3 canonical user ID for the origin access
     *            identity, which you use when giving the origin access identity
     *            read permission to an object in Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentitySummary withS3CanonicalUserId(String s3CanonicalUserId) {
        this.s3CanonicalUserId = s3CanonicalUserId;
        return this;
    }

    /**
     * <p>
     * The comment for this origin access identity, as originally specified when
     * created.
     * </p>
     *
     * @return <p>
     *         The comment for this origin access identity, as originally
     *         specified when created.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * The comment for this origin access identity, as originally specified when
     * created.
     * </p>
     *
     * @param comment <p>
     *            The comment for this origin access identity, as originally
     *            specified when created.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The comment for this origin access identity, as originally specified when
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comment <p>
     *            The comment for this origin access identity, as originally
     *            specified when created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentitySummary withComment(String comment) {
        this.comment = comment;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getS3CanonicalUserId() != null)
            sb.append("S3CanonicalUserId: " + getS3CanonicalUserId() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getS3CanonicalUserId() == null) ? 0 : getS3CanonicalUserId().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudFrontOriginAccessIdentitySummary == false)
            return false;
        CloudFrontOriginAccessIdentitySummary other = (CloudFrontOriginAccessIdentitySummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getS3CanonicalUserId() == null ^ this.getS3CanonicalUserId() == null)
            return false;
        if (other.getS3CanonicalUserId() != null
                && other.getS3CanonicalUserId().equals(this.getS3CanonicalUserId()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }
}

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

/**
 * <p>
 * The S3 resources whose classification types you want to update. This data
 * type is used as a request parameter in the UpdateS3Resources action.
 * </p>
 */
public class S3ResourceClassificationUpdate implements Serializable {
    /**
     * <p>
     * The name of the S3 bucket whose classification types you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String bucketName;

    /**
     * <p>
     * The prefix of the S3 bucket whose classification types you want to
     * update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     */
    private String prefix;

    /**
     * <p>
     * The classification type that you want to update for the resource
     * associated with Amazon Macie Classic.
     * </p>
     */
    private ClassificationTypeUpdate classificationTypeUpdate;

    /**
     * <p>
     * The name of the S3 bucket whose classification types you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         The name of the S3 bucket whose classification types you want to
     *         update.
     *         </p>
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket whose classification types you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param bucketName <p>
     *            The name of the S3 bucket whose classification types you want
     *            to update.
     *            </p>
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket whose classification types you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param bucketName <p>
     *            The name of the S3 bucket whose classification types you want
     *            to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3ResourceClassificationUpdate withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * <p>
     * The prefix of the S3 bucket whose classification types you want to
     * update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     *
     * @return <p>
     *         The prefix of the S3 bucket whose classification types you want
     *         to update.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * The prefix of the S3 bucket whose classification types you want to
     * update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     *
     * @param prefix <p>
     *            The prefix of the S3 bucket whose classification types you
     *            want to update.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix of the S3 bucket whose classification types you want to
     * update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     *
     * @param prefix <p>
     *            The prefix of the S3 bucket whose classification types you
     *            want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3ResourceClassificationUpdate withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * The classification type that you want to update for the resource
     * associated with Amazon Macie Classic.
     * </p>
     *
     * @return <p>
     *         The classification type that you want to update for the resource
     *         associated with Amazon Macie Classic.
     *         </p>
     */
    public ClassificationTypeUpdate getClassificationTypeUpdate() {
        return classificationTypeUpdate;
    }

    /**
     * <p>
     * The classification type that you want to update for the resource
     * associated with Amazon Macie Classic.
     * </p>
     *
     * @param classificationTypeUpdate <p>
     *            The classification type that you want to update for the
     *            resource associated with Amazon Macie Classic.
     *            </p>
     */
    public void setClassificationTypeUpdate(ClassificationTypeUpdate classificationTypeUpdate) {
        this.classificationTypeUpdate = classificationTypeUpdate;
    }

    /**
     * <p>
     * The classification type that you want to update for the resource
     * associated with Amazon Macie Classic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classificationTypeUpdate <p>
     *            The classification type that you want to update for the
     *            resource associated with Amazon Macie Classic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3ResourceClassificationUpdate withClassificationTypeUpdate(
            ClassificationTypeUpdate classificationTypeUpdate) {
        this.classificationTypeUpdate = classificationTypeUpdate;
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
        if (getBucketName() != null)
            sb.append("bucketName: " + getBucketName() + ",");
        if (getPrefix() != null)
            sb.append("prefix: " + getPrefix() + ",");
        if (getClassificationTypeUpdate() != null)
            sb.append("classificationTypeUpdate: " + getClassificationTypeUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime
                * hashCode
                + ((getClassificationTypeUpdate() == null) ? 0 : getClassificationTypeUpdate()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ResourceClassificationUpdate == false)
            return false;
        S3ResourceClassificationUpdate other = (S3ResourceClassificationUpdate) obj;

        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null
                && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getClassificationTypeUpdate() == null
                ^ this.getClassificationTypeUpdate() == null)
            return false;
        if (other.getClassificationTypeUpdate() != null
                && other.getClassificationTypeUpdate().equals(this.getClassificationTypeUpdate()) == false)
            return false;
        return true;
    }
}

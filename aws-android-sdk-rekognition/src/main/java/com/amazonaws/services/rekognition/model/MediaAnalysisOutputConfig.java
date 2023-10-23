/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Output configuration provided in the job creation request.
 * </p>
 */
public class MediaAnalysisOutputConfig implements Serializable {
    /**
     * <p>
     * Specifies the Amazon S3 bucket to contain the output of the media
     * analysis job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[0-9A-Za-z\.\-_]*<br/>
     */
    private String s3Bucket;

    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the
     * bucket you have designated for storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 800<br/>
     * <b>Pattern: </b>\S*<br/>
     */
    private String s3KeyPrefix;

    /**
     * <p>
     * Specifies the Amazon S3 bucket to contain the output of the media
     * analysis job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[0-9A-Za-z\.\-_]*<br/>
     *
     * @return <p>
     *         Specifies the Amazon S3 bucket to contain the output of the media
     *         analysis job.
     *         </p>
     */
    public String getS3Bucket() {
        return s3Bucket;
    }

    /**
     * <p>
     * Specifies the Amazon S3 bucket to contain the output of the media
     * analysis job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[0-9A-Za-z\.\-_]*<br/>
     *
     * @param s3Bucket <p>
     *            Specifies the Amazon S3 bucket to contain the output of the
     *            media analysis job.
     *            </p>
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * Specifies the Amazon S3 bucket to contain the output of the media
     * analysis job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[0-9A-Za-z\.\-_]*<br/>
     *
     * @param s3Bucket <p>
     *            Specifies the Amazon S3 bucket to contain the output of the
     *            media analysis job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaAnalysisOutputConfig withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the
     * bucket you have designated for storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 800<br/>
     * <b>Pattern: </b>\S*<br/>
     *
     * @return <p>
     *         Specifies the Amazon S3 key prefix that comes after the name of
     *         the bucket you have designated for storage.
     *         </p>
     */
    public String getS3KeyPrefix() {
        return s3KeyPrefix;
    }

    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the
     * bucket you have designated for storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 800<br/>
     * <b>Pattern: </b>\S*<br/>
     *
     * @param s3KeyPrefix <p>
     *            Specifies the Amazon S3 key prefix that comes after the name
     *            of the bucket you have designated for storage.
     *            </p>
     */
    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the
     * bucket you have designated for storage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 800<br/>
     * <b>Pattern: </b>\S*<br/>
     *
     * @param s3KeyPrefix <p>
     *            Specifies the Amazon S3 key prefix that comes after the name
     *            of the bucket you have designated for storage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaAnalysisOutputConfig withS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
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
        if (getS3Bucket() != null)
            sb.append("S3Bucket: " + getS3Bucket() + ",");
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: " + getS3KeyPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode
                + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaAnalysisOutputConfig == false)
            return false;
        MediaAnalysisOutputConfig other = (MediaAnalysisOutputConfig) obj;

        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null
                && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        return true;
    }
}

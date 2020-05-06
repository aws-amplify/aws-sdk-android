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

package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;

/**
 * <p>
 * The output properties for a detection job.
 * </p>
 */
public class OutputDataConfig implements Serializable {
    /**
     * <p>
     * When you use the <code>OutputDataConfig</code> object with asynchronous
     * operations, you specify the Amazon S3 location where you want to write
     * the output data. The URI must be in the same region as the API endpoint
     * that you are calling. The location is used as the prefix for the actual
     * location of the output.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^[0-9a-z\.\-_]*(?!\.)$<br/>
     */
    private String s3Bucket;

    /**
     * <p>
     * The path to the output data files in the S3 bucket. Amazon Comprehend
     * Medical creates an output directory using the job ID so that the output
     * from one job does not overwrite the output of another.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String s3Key;

    /**
     * <p>
     * When you use the <code>OutputDataConfig</code> object with asynchronous
     * operations, you specify the Amazon S3 location where you want to write
     * the output data. The URI must be in the same region as the API endpoint
     * that you are calling. The location is used as the prefix for the actual
     * location of the output.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^[0-9a-z\.\-_]*(?!\.)$<br/>
     *
     * @return <p>
     *         When you use the <code>OutputDataConfig</code> object with
     *         asynchronous operations, you specify the Amazon S3 location where
     *         you want to write the output data. The URI must be in the same
     *         region as the API endpoint that you are calling. The location is
     *         used as the prefix for the actual location of the output.
     *         </p>
     */
    public String getS3Bucket() {
        return s3Bucket;
    }

    /**
     * <p>
     * When you use the <code>OutputDataConfig</code> object with asynchronous
     * operations, you specify the Amazon S3 location where you want to write
     * the output data. The URI must be in the same region as the API endpoint
     * that you are calling. The location is used as the prefix for the actual
     * location of the output.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^[0-9a-z\.\-_]*(?!\.)$<br/>
     *
     * @param s3Bucket <p>
     *            When you use the <code>OutputDataConfig</code> object with
     *            asynchronous operations, you specify the Amazon S3 location
     *            where you want to write the output data. The URI must be in
     *            the same region as the API endpoint that you are calling. The
     *            location is used as the prefix for the actual location of the
     *            output.
     *            </p>
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * When you use the <code>OutputDataConfig</code> object with asynchronous
     * operations, you specify the Amazon S3 location where you want to write
     * the output data. The URI must be in the same region as the API endpoint
     * that you are calling. The location is used as the prefix for the actual
     * location of the output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^[0-9a-z\.\-_]*(?!\.)$<br/>
     *
     * @param s3Bucket <p>
     *            When you use the <code>OutputDataConfig</code> object with
     *            asynchronous operations, you specify the Amazon S3 location
     *            where you want to write the output data. The URI must be in
     *            the same region as the API endpoint that you are calling. The
     *            location is used as the prefix for the actual location of the
     *            output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDataConfig withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * <p>
     * The path to the output data files in the S3 bucket. Amazon Comprehend
     * Medical creates an output directory using the job ID so that the output
     * from one job does not overwrite the output of another.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The path to the output data files in the S3 bucket. Amazon
     *         Comprehend Medical creates an output directory using the job ID
     *         so that the output from one job does not overwrite the output of
     *         another.
     *         </p>
     */
    public String getS3Key() {
        return s3Key;
    }

    /**
     * <p>
     * The path to the output data files in the S3 bucket. Amazon Comprehend
     * Medical creates an output directory using the job ID so that the output
     * from one job does not overwrite the output of another.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param s3Key <p>
     *            The path to the output data files in the S3 bucket. Amazon
     *            Comprehend Medical creates an output directory using the job
     *            ID so that the output from one job does not overwrite the
     *            output of another.
     *            </p>
     */
    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The path to the output data files in the S3 bucket. Amazon Comprehend
     * Medical creates an output directory using the job ID so that the output
     * from one job does not overwrite the output of another.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param s3Key <p>
     *            The path to the output data files in the S3 bucket. Amazon
     *            Comprehend Medical creates an output directory using the job
     *            ID so that the output from one job does not overwrite the
     *            output of another.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDataConfig withS3Key(String s3Key) {
        this.s3Key = s3Key;
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
        if (getS3Key() != null)
            sb.append("S3Key: " + getS3Key());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputDataConfig == false)
            return false;
        OutputDataConfig other = (OutputDataConfig) obj;

        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        return true;
    }
}

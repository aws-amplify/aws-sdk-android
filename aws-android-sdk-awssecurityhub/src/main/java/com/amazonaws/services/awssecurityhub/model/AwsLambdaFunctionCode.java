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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * The code for the Lambda function. You can specify either an object in Amazon
 * S3, or upload a deployment package directly.
 * </p>
 */
public class AwsLambdaFunctionCode implements Serializable {
    /**
     * <p>
     * An Amazon S3 bucket in the same AWS Region as your function. The bucket
     * can be in a different AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String s3Bucket;

    /**
     * <p>
     * The Amazon S3 key of the deployment package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String s3Key;

    /**
     * <p>
     * For versioned objects, the version of the deployment package object to
     * use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String s3ObjectVersion;

    /**
     * <p>
     * The base64-encoded contents of the deployment package. AWS SDK and AWS
     * CLI clients handle the encoding for you.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String zipFile;

    /**
     * <p>
     * An Amazon S3 bucket in the same AWS Region as your function. The bucket
     * can be in a different AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         An Amazon S3 bucket in the same AWS Region as your function. The
     *         bucket can be in a different AWS account.
     *         </p>
     */
    public String getS3Bucket() {
        return s3Bucket;
    }

    /**
     * <p>
     * An Amazon S3 bucket in the same AWS Region as your function. The bucket
     * can be in a different AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param s3Bucket <p>
     *            An Amazon S3 bucket in the same AWS Region as your function.
     *            The bucket can be in a different AWS account.
     *            </p>
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * An Amazon S3 bucket in the same AWS Region as your function. The bucket
     * can be in a different AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param s3Bucket <p>
     *            An Amazon S3 bucket in the same AWS Region as your function.
     *            The bucket can be in a different AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionCode withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 key of the deployment package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon S3 key of the deployment package.
     *         </p>
     */
    public String getS3Key() {
        return s3Key;
    }

    /**
     * <p>
     * The Amazon S3 key of the deployment package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param s3Key <p>
     *            The Amazon S3 key of the deployment package.
     *            </p>
     */
    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The Amazon S3 key of the deployment package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param s3Key <p>
     *            The Amazon S3 key of the deployment package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionCode withS3Key(String s3Key) {
        this.s3Key = s3Key;
        return this;
    }

    /**
     * <p>
     * For versioned objects, the version of the deployment package object to
     * use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         For versioned objects, the version of the deployment package
     *         object to use.
     *         </p>
     */
    public String getS3ObjectVersion() {
        return s3ObjectVersion;
    }

    /**
     * <p>
     * For versioned objects, the version of the deployment package object to
     * use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param s3ObjectVersion <p>
     *            For versioned objects, the version of the deployment package
     *            object to use.
     *            </p>
     */
    public void setS3ObjectVersion(String s3ObjectVersion) {
        this.s3ObjectVersion = s3ObjectVersion;
    }

    /**
     * <p>
     * For versioned objects, the version of the deployment package object to
     * use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param s3ObjectVersion <p>
     *            For versioned objects, the version of the deployment package
     *            object to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionCode withS3ObjectVersion(String s3ObjectVersion) {
        this.s3ObjectVersion = s3ObjectVersion;
        return this;
    }

    /**
     * <p>
     * The base64-encoded contents of the deployment package. AWS SDK and AWS
     * CLI clients handle the encoding for you.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The base64-encoded contents of the deployment package. AWS SDK
     *         and AWS CLI clients handle the encoding for you.
     *         </p>
     */
    public String getZipFile() {
        return zipFile;
    }

    /**
     * <p>
     * The base64-encoded contents of the deployment package. AWS SDK and AWS
     * CLI clients handle the encoding for you.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param zipFile <p>
     *            The base64-encoded contents of the deployment package. AWS SDK
     *            and AWS CLI clients handle the encoding for you.
     *            </p>
     */
    public void setZipFile(String zipFile) {
        this.zipFile = zipFile;
    }

    /**
     * <p>
     * The base64-encoded contents of the deployment package. AWS SDK and AWS
     * CLI clients handle the encoding for you.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param zipFile <p>
     *            The base64-encoded contents of the deployment package. AWS SDK
     *            and AWS CLI clients handle the encoding for you.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionCode withZipFile(String zipFile) {
        this.zipFile = zipFile;
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
            sb.append("S3Key: " + getS3Key() + ",");
        if (getS3ObjectVersion() != null)
            sb.append("S3ObjectVersion: " + getS3ObjectVersion() + ",");
        if (getZipFile() != null)
            sb.append("ZipFile: " + getZipFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        hashCode = prime * hashCode
                + ((getS3ObjectVersion() == null) ? 0 : getS3ObjectVersion().hashCode());
        hashCode = prime * hashCode + ((getZipFile() == null) ? 0 : getZipFile().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsLambdaFunctionCode == false)
            return false;
        AwsLambdaFunctionCode other = (AwsLambdaFunctionCode) obj;

        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        if (other.getS3ObjectVersion() == null ^ this.getS3ObjectVersion() == null)
            return false;
        if (other.getS3ObjectVersion() != null
                && other.getS3ObjectVersion().equals(this.getS3ObjectVersion()) == false)
            return false;
        if (other.getZipFile() == null ^ this.getZipFile() == null)
            return false;
        if (other.getZipFile() != null && other.getZipFile().equals(this.getZipFile()) == false)
            return false;
        return true;
    }
}

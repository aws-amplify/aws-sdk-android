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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the output location for managed spot training
 * checkpoint data.
 * </p>
 */
public class CheckpointConfig implements Serializable {
    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store
     * checkpoints. For example, <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String s3Uri;

    /**
     * <p>
     * (Optional) The local directory where checkpoints are written. The default
     * directory is <code>/opt/ml/checkpoints/</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String localPath;

    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store
     * checkpoints. For example, <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         Identifies the S3 path where you want Amazon SageMaker to store
     *         checkpoints. For example,
     *         <code>s3://bucket-name/key-name-prefix</code>.
     *         </p>
     */
    public String getS3Uri() {
        return s3Uri;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store
     * checkpoints. For example, <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3Uri <p>
     *            Identifies the S3 path where you want Amazon SageMaker to
     *            store checkpoints. For example,
     *            <code>s3://bucket-name/key-name-prefix</code>.
     *            </p>
     */
    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store
     * checkpoints. For example, <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3Uri <p>
     *            Identifies the S3 path where you want Amazon SageMaker to
     *            store checkpoints. For example,
     *            <code>s3://bucket-name/key-name-prefix</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CheckpointConfig withS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
        return this;
    }

    /**
     * <p>
     * (Optional) The local directory where checkpoints are written. The default
     * directory is <code>/opt/ml/checkpoints/</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         (Optional) The local directory where checkpoints are written. The
     *         default directory is <code>/opt/ml/checkpoints/</code>.
     *         </p>
     */
    public String getLocalPath() {
        return localPath;
    }

    /**
     * <p>
     * (Optional) The local directory where checkpoints are written. The default
     * directory is <code>/opt/ml/checkpoints/</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param localPath <p>
     *            (Optional) The local directory where checkpoints are written.
     *            The default directory is <code>/opt/ml/checkpoints/</code>.
     *            </p>
     */
    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    /**
     * <p>
     * (Optional) The local directory where checkpoints are written. The default
     * directory is <code>/opt/ml/checkpoints/</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param localPath <p>
     *            (Optional) The local directory where checkpoints are written.
     *            The default directory is <code>/opt/ml/checkpoints/</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CheckpointConfig withLocalPath(String localPath) {
        this.localPath = localPath;
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
        if (getS3Uri() != null)
            sb.append("S3Uri: " + getS3Uri() + ",");
        if (getLocalPath() != null)
            sb.append("LocalPath: " + getLocalPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckpointConfig == false)
            return false;
        CheckpointConfig other = (CheckpointConfig) obj;

        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getLocalPath() == null ^ this.getLocalPath() == null)
            return false;
        if (other.getLocalPath() != null
                && other.getLocalPath().equals(this.getLocalPath()) == false)
            return false;
        return true;
    }
}

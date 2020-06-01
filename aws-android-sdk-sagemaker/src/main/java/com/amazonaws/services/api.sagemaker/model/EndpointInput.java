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
 * Input object for the endpoint
 * </p>
 */
public class EndpointInput implements Serializable {
    /**
     * <p>
     * An endpoint in customer's account which has enabled
     * <code>DataCaptureConfig</code> enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointName;

    /**
     * <p>
     * Path to the filesystem where the endpoint data is available to the
     * container.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String localPath;

    /**
     * <p>
     * Whether the <code>Pipe</code> or <code>File</code> is used as the input
     * mode for transfering data for the monitoring job. <code>Pipe</code> mode
     * is recommended for large datasets. <code>File</code> mode is useful for
     * small files that fit in memory. Defaults to <code>File</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     */
    private String s3InputMode;

    /**
     * <p>
     * Whether input data distributed in Amazon S3 is fully replicated or
     * sharded by an S3 key. Defauts to <code>FullyReplicated</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FullyReplicated, ShardedByS3Key
     */
    private String s3DataDistributionType;

    /**
     * <p>
     * An endpoint in customer's account which has enabled
     * <code>DataCaptureConfig</code> enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         An endpoint in customer's account which has enabled
     *         <code>DataCaptureConfig</code> enabled.
     *         </p>
     */
    public String getEndpointName() {
        return endpointName;
    }

    /**
     * <p>
     * An endpoint in customer's account which has enabled
     * <code>DataCaptureConfig</code> enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointName <p>
     *            An endpoint in customer's account which has enabled
     *            <code>DataCaptureConfig</code> enabled.
     *            </p>
     */
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * An endpoint in customer's account which has enabled
     * <code>DataCaptureConfig</code> enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointName <p>
     *            An endpoint in customer's account which has enabled
     *            <code>DataCaptureConfig</code> enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointInput withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * <p>
     * Path to the filesystem where the endpoint data is available to the
     * container.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         Path to the filesystem where the endpoint data is available to
     *         the container.
     *         </p>
     */
    public String getLocalPath() {
        return localPath;
    }

    /**
     * <p>
     * Path to the filesystem where the endpoint data is available to the
     * container.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param localPath <p>
     *            Path to the filesystem where the endpoint data is available to
     *            the container.
     *            </p>
     */
    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    /**
     * <p>
     * Path to the filesystem where the endpoint data is available to the
     * container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param localPath <p>
     *            Path to the filesystem where the endpoint data is available to
     *            the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointInput withLocalPath(String localPath) {
        this.localPath = localPath;
        return this;
    }

    /**
     * <p>
     * Whether the <code>Pipe</code> or <code>File</code> is used as the input
     * mode for transfering data for the monitoring job. <code>Pipe</code> mode
     * is recommended for large datasets. <code>File</code> mode is useful for
     * small files that fit in memory. Defaults to <code>File</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @return <p>
     *         Whether the <code>Pipe</code> or <code>File</code> is used as the
     *         input mode for transfering data for the monitoring job.
     *         <code>Pipe</code> mode is recommended for large datasets.
     *         <code>File</code> mode is useful for small files that fit in
     *         memory. Defaults to <code>File</code>.
     *         </p>
     * @see ProcessingS3InputMode
     */
    public String getS3InputMode() {
        return s3InputMode;
    }

    /**
     * <p>
     * Whether the <code>Pipe</code> or <code>File</code> is used as the input
     * mode for transfering data for the monitoring job. <code>Pipe</code> mode
     * is recommended for large datasets. <code>File</code> mode is useful for
     * small files that fit in memory. Defaults to <code>File</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @param s3InputMode <p>
     *            Whether the <code>Pipe</code> or <code>File</code> is used as
     *            the input mode for transfering data for the monitoring job.
     *            <code>Pipe</code> mode is recommended for large datasets.
     *            <code>File</code> mode is useful for small files that fit in
     *            memory. Defaults to <code>File</code>.
     *            </p>
     * @see ProcessingS3InputMode
     */
    public void setS3InputMode(String s3InputMode) {
        this.s3InputMode = s3InputMode;
    }

    /**
     * <p>
     * Whether the <code>Pipe</code> or <code>File</code> is used as the input
     * mode for transfering data for the monitoring job. <code>Pipe</code> mode
     * is recommended for large datasets. <code>File</code> mode is useful for
     * small files that fit in memory. Defaults to <code>File</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @param s3InputMode <p>
     *            Whether the <code>Pipe</code> or <code>File</code> is used as
     *            the input mode for transfering data for the monitoring job.
     *            <code>Pipe</code> mode is recommended for large datasets.
     *            <code>File</code> mode is useful for small files that fit in
     *            memory. Defaults to <code>File</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingS3InputMode
     */
    public EndpointInput withS3InputMode(String s3InputMode) {
        this.s3InputMode = s3InputMode;
        return this;
    }

    /**
     * <p>
     * Whether the <code>Pipe</code> or <code>File</code> is used as the input
     * mode for transfering data for the monitoring job. <code>Pipe</code> mode
     * is recommended for large datasets. <code>File</code> mode is useful for
     * small files that fit in memory. Defaults to <code>File</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @param s3InputMode <p>
     *            Whether the <code>Pipe</code> or <code>File</code> is used as
     *            the input mode for transfering data for the monitoring job.
     *            <code>Pipe</code> mode is recommended for large datasets.
     *            <code>File</code> mode is useful for small files that fit in
     *            memory. Defaults to <code>File</code>.
     *            </p>
     * @see ProcessingS3InputMode
     */
    public void setS3InputMode(ProcessingS3InputMode s3InputMode) {
        this.s3InputMode = s3InputMode.toString();
    }

    /**
     * <p>
     * Whether the <code>Pipe</code> or <code>File</code> is used as the input
     * mode for transfering data for the monitoring job. <code>Pipe</code> mode
     * is recommended for large datasets. <code>File</code> mode is useful for
     * small files that fit in memory. Defaults to <code>File</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @param s3InputMode <p>
     *            Whether the <code>Pipe</code> or <code>File</code> is used as
     *            the input mode for transfering data for the monitoring job.
     *            <code>Pipe</code> mode is recommended for large datasets.
     *            <code>File</code> mode is useful for small files that fit in
     *            memory. Defaults to <code>File</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingS3InputMode
     */
    public EndpointInput withS3InputMode(ProcessingS3InputMode s3InputMode) {
        this.s3InputMode = s3InputMode.toString();
        return this;
    }

    /**
     * <p>
     * Whether input data distributed in Amazon S3 is fully replicated or
     * sharded by an S3 key. Defauts to <code>FullyReplicated</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FullyReplicated, ShardedByS3Key
     *
     * @return <p>
     *         Whether input data distributed in Amazon S3 is fully replicated
     *         or sharded by an S3 key. Defauts to <code>FullyReplicated</code>
     *         </p>
     * @see ProcessingS3DataDistributionType
     */
    public String getS3DataDistributionType() {
        return s3DataDistributionType;
    }

    /**
     * <p>
     * Whether input data distributed in Amazon S3 is fully replicated or
     * sharded by an S3 key. Defauts to <code>FullyReplicated</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FullyReplicated, ShardedByS3Key
     *
     * @param s3DataDistributionType <p>
     *            Whether input data distributed in Amazon S3 is fully
     *            replicated or sharded by an S3 key. Defauts to
     *            <code>FullyReplicated</code>
     *            </p>
     * @see ProcessingS3DataDistributionType
     */
    public void setS3DataDistributionType(String s3DataDistributionType) {
        this.s3DataDistributionType = s3DataDistributionType;
    }

    /**
     * <p>
     * Whether input data distributed in Amazon S3 is fully replicated or
     * sharded by an S3 key. Defauts to <code>FullyReplicated</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FullyReplicated, ShardedByS3Key
     *
     * @param s3DataDistributionType <p>
     *            Whether input data distributed in Amazon S3 is fully
     *            replicated or sharded by an S3 key. Defauts to
     *            <code>FullyReplicated</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingS3DataDistributionType
     */
    public EndpointInput withS3DataDistributionType(String s3DataDistributionType) {
        this.s3DataDistributionType = s3DataDistributionType;
        return this;
    }

    /**
     * <p>
     * Whether input data distributed in Amazon S3 is fully replicated or
     * sharded by an S3 key. Defauts to <code>FullyReplicated</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FullyReplicated, ShardedByS3Key
     *
     * @param s3DataDistributionType <p>
     *            Whether input data distributed in Amazon S3 is fully
     *            replicated or sharded by an S3 key. Defauts to
     *            <code>FullyReplicated</code>
     *            </p>
     * @see ProcessingS3DataDistributionType
     */
    public void setS3DataDistributionType(ProcessingS3DataDistributionType s3DataDistributionType) {
        this.s3DataDistributionType = s3DataDistributionType.toString();
    }

    /**
     * <p>
     * Whether input data distributed in Amazon S3 is fully replicated or
     * sharded by an S3 key. Defauts to <code>FullyReplicated</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FullyReplicated, ShardedByS3Key
     *
     * @param s3DataDistributionType <p>
     *            Whether input data distributed in Amazon S3 is fully
     *            replicated or sharded by an S3 key. Defauts to
     *            <code>FullyReplicated</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingS3DataDistributionType
     */
    public EndpointInput withS3DataDistributionType(
            ProcessingS3DataDistributionType s3DataDistributionType) {
        this.s3DataDistributionType = s3DataDistributionType.toString();
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
        if (getEndpointName() != null)
            sb.append("EndpointName: " + getEndpointName() + ",");
        if (getLocalPath() != null)
            sb.append("LocalPath: " + getLocalPath() + ",");
        if (getS3InputMode() != null)
            sb.append("S3InputMode: " + getS3InputMode() + ",");
        if (getS3DataDistributionType() != null)
            sb.append("S3DataDistributionType: " + getS3DataDistributionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        hashCode = prime * hashCode
                + ((getS3InputMode() == null) ? 0 : getS3InputMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getS3DataDistributionType() == null) ? 0 : getS3DataDistributionType()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointInput == false)
            return false;
        EndpointInput other = (EndpointInput) obj;

        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null
                && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getLocalPath() == null ^ this.getLocalPath() == null)
            return false;
        if (other.getLocalPath() != null
                && other.getLocalPath().equals(this.getLocalPath()) == false)
            return false;
        if (other.getS3InputMode() == null ^ this.getS3InputMode() == null)
            return false;
        if (other.getS3InputMode() != null
                && other.getS3InputMode().equals(this.getS3InputMode()) == false)
            return false;
        if (other.getS3DataDistributionType() == null ^ this.getS3DataDistributionType() == null)
            return false;
        if (other.getS3DataDistributionType() != null
                && other.getS3DataDistributionType().equals(this.getS3DataDistributionType()) == false)
            return false;
        return true;
    }
}

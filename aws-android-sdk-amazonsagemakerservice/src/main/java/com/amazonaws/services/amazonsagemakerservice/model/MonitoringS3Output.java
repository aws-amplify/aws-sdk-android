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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Information about where and how you want to store the results of a monitoring
 * job.
 * </p>
 */
public class MonitoringS3Output implements Serializable {
    /**
     * <p>
     * A URI that identifies the Amazon S3 storage location where Amazon
     * SageMaker saves the results of a monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String s3Uri;

    /**
     * <p>
     * The local path to the Amazon S3 storage location where Amazon SageMaker
     * saves the results of a monitoring job. LocalPath is an absolute path for
     * the output data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String localPath;

    /**
     * <p>
     * Whether to upload the results of the monitoring job continuously or after
     * the job completes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Continuous, EndOfJob
     */
    private String s3UploadMode;

    /**
     * <p>
     * A URI that identifies the Amazon S3 storage location where Amazon
     * SageMaker saves the results of a monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         A URI that identifies the Amazon S3 storage location where Amazon
     *         SageMaker saves the results of a monitoring job.
     *         </p>
     */
    public String getS3Uri() {
        return s3Uri;
    }

    /**
     * <p>
     * A URI that identifies the Amazon S3 storage location where Amazon
     * SageMaker saves the results of a monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3Uri <p>
     *            A URI that identifies the Amazon S3 storage location where
     *            Amazon SageMaker saves the results of a monitoring job.
     *            </p>
     */
    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * A URI that identifies the Amazon S3 storage location where Amazon
     * SageMaker saves the results of a monitoring job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3Uri <p>
     *            A URI that identifies the Amazon S3 storage location where
     *            Amazon SageMaker saves the results of a monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringS3Output withS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
        return this;
    }

    /**
     * <p>
     * The local path to the Amazon S3 storage location where Amazon SageMaker
     * saves the results of a monitoring job. LocalPath is an absolute path for
     * the output data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The local path to the Amazon S3 storage location where Amazon
     *         SageMaker saves the results of a monitoring job. LocalPath is an
     *         absolute path for the output data.
     *         </p>
     */
    public String getLocalPath() {
        return localPath;
    }

    /**
     * <p>
     * The local path to the Amazon S3 storage location where Amazon SageMaker
     * saves the results of a monitoring job. LocalPath is an absolute path for
     * the output data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param localPath <p>
     *            The local path to the Amazon S3 storage location where Amazon
     *            SageMaker saves the results of a monitoring job. LocalPath is
     *            an absolute path for the output data.
     *            </p>
     */
    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    /**
     * <p>
     * The local path to the Amazon S3 storage location where Amazon SageMaker
     * saves the results of a monitoring job. LocalPath is an absolute path for
     * the output data.
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
     *            The local path to the Amazon S3 storage location where Amazon
     *            SageMaker saves the results of a monitoring job. LocalPath is
     *            an absolute path for the output data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringS3Output withLocalPath(String localPath) {
        this.localPath = localPath;
        return this;
    }

    /**
     * <p>
     * Whether to upload the results of the monitoring job continuously or after
     * the job completes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Continuous, EndOfJob
     *
     * @return <p>
     *         Whether to upload the results of the monitoring job continuously
     *         or after the job completes.
     *         </p>
     * @see ProcessingS3UploadMode
     */
    public String getS3UploadMode() {
        return s3UploadMode;
    }

    /**
     * <p>
     * Whether to upload the results of the monitoring job continuously or after
     * the job completes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Continuous, EndOfJob
     *
     * @param s3UploadMode <p>
     *            Whether to upload the results of the monitoring job
     *            continuously or after the job completes.
     *            </p>
     * @see ProcessingS3UploadMode
     */
    public void setS3UploadMode(String s3UploadMode) {
        this.s3UploadMode = s3UploadMode;
    }

    /**
     * <p>
     * Whether to upload the results of the monitoring job continuously or after
     * the job completes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Continuous, EndOfJob
     *
     * @param s3UploadMode <p>
     *            Whether to upload the results of the monitoring job
     *            continuously or after the job completes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingS3UploadMode
     */
    public MonitoringS3Output withS3UploadMode(String s3UploadMode) {
        this.s3UploadMode = s3UploadMode;
        return this;
    }

    /**
     * <p>
     * Whether to upload the results of the monitoring job continuously or after
     * the job completes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Continuous, EndOfJob
     *
     * @param s3UploadMode <p>
     *            Whether to upload the results of the monitoring job
     *            continuously or after the job completes.
     *            </p>
     * @see ProcessingS3UploadMode
     */
    public void setS3UploadMode(ProcessingS3UploadMode s3UploadMode) {
        this.s3UploadMode = s3UploadMode.toString();
    }

    /**
     * <p>
     * Whether to upload the results of the monitoring job continuously or after
     * the job completes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Continuous, EndOfJob
     *
     * @param s3UploadMode <p>
     *            Whether to upload the results of the monitoring job
     *            continuously or after the job completes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingS3UploadMode
     */
    public MonitoringS3Output withS3UploadMode(ProcessingS3UploadMode s3UploadMode) {
        this.s3UploadMode = s3UploadMode.toString();
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
            sb.append("LocalPath: " + getLocalPath() + ",");
        if (getS3UploadMode() != null)
            sb.append("S3UploadMode: " + getS3UploadMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        hashCode = prime * hashCode
                + ((getS3UploadMode() == null) ? 0 : getS3UploadMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringS3Output == false)
            return false;
        MonitoringS3Output other = (MonitoringS3Output) obj;

        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getLocalPath() == null ^ this.getLocalPath() == null)
            return false;
        if (other.getLocalPath() != null
                && other.getLocalPath().equals(this.getLocalPath()) == false)
            return false;
        if (other.getS3UploadMode() == null ^ this.getS3UploadMode() == null)
            return false;
        if (other.getS3UploadMode() != null
                && other.getS3UploadMode().equals(this.getS3UploadMode()) == false)
            return false;
        return true;
    }
}

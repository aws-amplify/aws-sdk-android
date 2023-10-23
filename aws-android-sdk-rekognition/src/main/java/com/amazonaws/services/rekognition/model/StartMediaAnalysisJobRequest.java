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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Initiates a new media analysis job. Accepts a manifest file in an Amazon S3
 * bucket. The output is a manifest file and a summary of the manifest stored in
 * the Amazon S3 bucket.
 * </p>
 */
public class StartMediaAnalysisJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Idempotency token used to prevent the accidental creation of duplicate
     * versions. If you use the same token with multiple
     * <code>StartMediaAnalysisJobRequest</code> requests, the same response is
     * returned. Use <code>ClientRequestToken</code> to prevent the same request
     * from being processed more than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name of the job. Does not have to be unique.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String jobName;

    /**
     * <p>
     * Configuration options for the media analysis job to be created.
     * </p>
     */
    private MediaAnalysisOperationsConfig operationsConfig;

    /**
     * <p>
     * Input data to be analyzed by the job.
     * </p>
     */
    private MediaAnalysisInput input;

    /**
     * <p>
     * The Amazon S3 bucket location to store the results.
     * </p>
     */
    private MediaAnalysisOutputConfig outputConfig;

    /**
     * <p>
     * The identifier of customer managed AWS KMS key (name or ARN). The key is
     * used to encrypt images copied into the service. The key is also used to
     * encrypt results and manifest files written to the output Amazon S3
     * bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Idempotency token used to prevent the accidental creation of duplicate
     * versions. If you use the same token with multiple
     * <code>StartMediaAnalysisJobRequest</code> requests, the same response is
     * returned. Use <code>ClientRequestToken</code> to prevent the same request
     * from being processed more than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Idempotency token used to prevent the accidental creation of
     *         duplicate versions. If you use the same token with multiple
     *         <code>StartMediaAnalysisJobRequest</code> requests, the same
     *         response is returned. Use <code>ClientRequestToken</code> to
     *         prevent the same request from being processed more than once.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * Idempotency token used to prevent the accidental creation of duplicate
     * versions. If you use the same token with multiple
     * <code>StartMediaAnalysisJobRequest</code> requests, the same response is
     * returned. Use <code>ClientRequestToken</code> to prevent the same request
     * from being processed more than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Idempotency token used to prevent the accidental creation of
     *            duplicate versions. If you use the same token with multiple
     *            <code>StartMediaAnalysisJobRequest</code> requests, the same
     *            response is returned. Use <code>ClientRequestToken</code> to
     *            prevent the same request from being processed more than once.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Idempotency token used to prevent the accidental creation of duplicate
     * versions. If you use the same token with multiple
     * <code>StartMediaAnalysisJobRequest</code> requests, the same response is
     * returned. Use <code>ClientRequestToken</code> to prevent the same request
     * from being processed more than once.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Idempotency token used to prevent the accidental creation of
     *            duplicate versions. If you use the same token with multiple
     *            <code>StartMediaAnalysisJobRequest</code> requests, the same
     *            response is returned. Use <code>ClientRequestToken</code> to
     *            prevent the same request from being processed more than once.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMediaAnalysisJobRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The name of the job. Does not have to be unique.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         The name of the job. Does not have to be unique.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name of the job. Does not have to be unique.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param jobName <p>
     *            The name of the job. Does not have to be unique.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job. Does not have to be unique.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param jobName <p>
     *            The name of the job. Does not have to be unique.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMediaAnalysisJobRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * Configuration options for the media analysis job to be created.
     * </p>
     *
     * @return <p>
     *         Configuration options for the media analysis job to be created.
     *         </p>
     */
    public MediaAnalysisOperationsConfig getOperationsConfig() {
        return operationsConfig;
    }

    /**
     * <p>
     * Configuration options for the media analysis job to be created.
     * </p>
     *
     * @param operationsConfig <p>
     *            Configuration options for the media analysis job to be
     *            created.
     *            </p>
     */
    public void setOperationsConfig(MediaAnalysisOperationsConfig operationsConfig) {
        this.operationsConfig = operationsConfig;
    }

    /**
     * <p>
     * Configuration options for the media analysis job to be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operationsConfig <p>
     *            Configuration options for the media analysis job to be
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMediaAnalysisJobRequest withOperationsConfig(
            MediaAnalysisOperationsConfig operationsConfig) {
        this.operationsConfig = operationsConfig;
        return this;
    }

    /**
     * <p>
     * Input data to be analyzed by the job.
     * </p>
     *
     * @return <p>
     *         Input data to be analyzed by the job.
     *         </p>
     */
    public MediaAnalysisInput getInput() {
        return input;
    }

    /**
     * <p>
     * Input data to be analyzed by the job.
     * </p>
     *
     * @param input <p>
     *            Input data to be analyzed by the job.
     *            </p>
     */
    public void setInput(MediaAnalysisInput input) {
        this.input = input;
    }

    /**
     * <p>
     * Input data to be analyzed by the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param input <p>
     *            Input data to be analyzed by the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMediaAnalysisJobRequest withInput(MediaAnalysisInput input) {
        this.input = input;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to store the results.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 bucket location to store the results.
     *         </p>
     */
    public MediaAnalysisOutputConfig getOutputConfig() {
        return outputConfig;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to store the results.
     * </p>
     *
     * @param outputConfig <p>
     *            The Amazon S3 bucket location to store the results.
     *            </p>
     */
    public void setOutputConfig(MediaAnalysisOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to store the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputConfig <p>
     *            The Amazon S3 bucket location to store the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMediaAnalysisJobRequest withOutputConfig(MediaAnalysisOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }

    /**
     * <p>
     * The identifier of customer managed AWS KMS key (name or ARN). The key is
     * used to encrypt images copied into the service. The key is also used to
     * encrypt results and manifest files written to the output Amazon S3
     * bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @return <p>
     *         The identifier of customer managed AWS KMS key (name or ARN). The
     *         key is used to encrypt images copied into the service. The key is
     *         also used to encrypt results and manifest files written to the
     *         output Amazon S3 bucket.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The identifier of customer managed AWS KMS key (name or ARN). The key is
     * used to encrypt images copied into the service. The key is also used to
     * encrypt results and manifest files written to the output Amazon S3
     * bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param kmsKeyId <p>
     *            The identifier of customer managed AWS KMS key (name or ARN).
     *            The key is used to encrypt images copied into the service. The
     *            key is also used to encrypt results and manifest files written
     *            to the output Amazon S3 bucket.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of customer managed AWS KMS key (name or ARN). The key is
     * used to encrypt images copied into the service. The key is also used to
     * encrypt results and manifest files written to the output Amazon S3
     * bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param kmsKeyId <p>
     *            The identifier of customer managed AWS KMS key (name or ARN).
     *            The key is used to encrypt images copied into the service. The
     *            key is also used to encrypt results and manifest files written
     *            to the output Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMediaAnalysisJobRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getJobName() != null)
            sb.append("JobName: " + getJobName() + ",");
        if (getOperationsConfig() != null)
            sb.append("OperationsConfig: " + getOperationsConfig() + ",");
        if (getInput() != null)
            sb.append("Input: " + getInput() + ",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: " + getOutputConfig() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode
                + ((getOperationsConfig() == null) ? 0 : getOperationsConfig().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode
                + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMediaAnalysisJobRequest == false)
            return false;
        StartMediaAnalysisJobRequest other = (StartMediaAnalysisJobRequest) obj;

        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getOperationsConfig() == null ^ this.getOperationsConfig() == null)
            return false;
        if (other.getOperationsConfig() != null
                && other.getOperationsConfig().equals(this.getOperationsConfig()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null
                && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }
}

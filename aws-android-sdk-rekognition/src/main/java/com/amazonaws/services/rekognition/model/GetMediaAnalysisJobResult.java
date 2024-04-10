/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class GetMediaAnalysisJobResult implements Serializable {
    /**
     * <p>
     * The identifier for the media analysis job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String jobId;

    /**
     * <p>
     * The name of the media analysis job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String jobName;

    /**
     * <p>
     * Operation configurations that were provided during job creation.
     * </p>
     */
    private MediaAnalysisOperationsConfig operationsConfig;

    /**
     * <p>
     * The current status of the media analysis job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, QUEUED, IN_PROGRESS, SUCCEEDED, FAILED
     */
    private String status;

    /**
     * <p>
     * Details about the error that resulted in failure of the job.
     * </p>
     */
    private MediaAnalysisJobFailureDetails failureDetails;

    /**
     * <p>
     * The Unix date and time when the job was started.
     * </p>
     */
    private java.util.Date creationTimestamp;

    /**
     * <p>
     * The Unix date and time when the job finished.
     * </p>
     */
    private java.util.Date completionTimestamp;

    /**
     * <p>
     * Reference to the input manifest that was provided in the job creation
     * request.
     * </p>
     */
    private MediaAnalysisInput input;

    /**
     * <p>
     * Output configuration that was provided in the creation request.
     * </p>
     */
    private MediaAnalysisOutputConfig outputConfig;

    /**
     * <p>
     * KMS Key that was provided in the creation request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Output manifest that contains prediction results.
     * </p>
     */
    private MediaAnalysisResults results;

    /**
     * <p>
     * The summary manifest provides statistics on input manifest and errors
     * identified in the input manifest.
     * </p>
     */
    private MediaAnalysisManifestSummary manifestSummary;

    /**
     * <p>
     * The identifier for the media analysis job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         The identifier for the media analysis job.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The identifier for the media analysis job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param jobId <p>
     *            The identifier for the media analysis job.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier for the media analysis job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param jobId <p>
     *            The identifier for the media analysis job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMediaAnalysisJobResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The name of the media analysis job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         The name of the media analysis job.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name of the media analysis job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param jobName <p>
     *            The name of the media analysis job.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the media analysis job.
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
     *            The name of the media analysis job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMediaAnalysisJobResult withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * Operation configurations that were provided during job creation.
     * </p>
     *
     * @return <p>
     *         Operation configurations that were provided during job creation.
     *         </p>
     */
    public MediaAnalysisOperationsConfig getOperationsConfig() {
        return operationsConfig;
    }

    /**
     * <p>
     * Operation configurations that were provided during job creation.
     * </p>
     *
     * @param operationsConfig <p>
     *            Operation configurations that were provided during job
     *            creation.
     *            </p>
     */
    public void setOperationsConfig(MediaAnalysisOperationsConfig operationsConfig) {
        this.operationsConfig = operationsConfig;
    }

    /**
     * <p>
     * Operation configurations that were provided during job creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operationsConfig <p>
     *            Operation configurations that were provided during job
     *            creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMediaAnalysisJobResult withOperationsConfig(
            MediaAnalysisOperationsConfig operationsConfig) {
        this.operationsConfig = operationsConfig;
        return this;
    }

    /**
     * <p>
     * The current status of the media analysis job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, QUEUED, IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @return <p>
     *         The current status of the media analysis job.
     *         </p>
     * @see MediaAnalysisJobStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the media analysis job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, QUEUED, IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param status <p>
     *            The current status of the media analysis job.
     *            </p>
     * @see MediaAnalysisJobStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the media analysis job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, QUEUED, IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param status <p>
     *            The current status of the media analysis job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaAnalysisJobStatus
     */
    public GetMediaAnalysisJobResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the media analysis job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, QUEUED, IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param status <p>
     *            The current status of the media analysis job.
     *            </p>
     * @see MediaAnalysisJobStatus
     */
    public void setStatus(MediaAnalysisJobStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the media analysis job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, QUEUED, IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param status <p>
     *            The current status of the media analysis job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaAnalysisJobStatus
     */
    public GetMediaAnalysisJobResult withStatus(MediaAnalysisJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Details about the error that resulted in failure of the job.
     * </p>
     *
     * @return <p>
     *         Details about the error that resulted in failure of the job.
     *         </p>
     */
    public MediaAnalysisJobFailureDetails getFailureDetails() {
        return failureDetails;
    }

    /**
     * <p>
     * Details about the error that resulted in failure of the job.
     * </p>
     *
     * @param failureDetails <p>
     *            Details about the error that resulted in failure of the job.
     *            </p>
     */
    public void setFailureDetails(MediaAnalysisJobFailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * <p>
     * Details about the error that resulted in failure of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureDetails <p>
     *            Details about the error that resulted in failure of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMediaAnalysisJobResult withFailureDetails(
            MediaAnalysisJobFailureDetails failureDetails) {
        this.failureDetails = failureDetails;
        return this;
    }

    /**
     * <p>
     * The Unix date and time when the job was started.
     * </p>
     *
     * @return <p>
     *         The Unix date and time when the job was started.
     *         </p>
     */
    public java.util.Date getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * <p>
     * The Unix date and time when the job was started.
     * </p>
     *
     * @param creationTimestamp <p>
     *            The Unix date and time when the job was started.
     *            </p>
     */
    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The Unix date and time when the job was started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimestamp <p>
     *            The Unix date and time when the job was started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMediaAnalysisJobResult withCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * <p>
     * The Unix date and time when the job finished.
     * </p>
     *
     * @return <p>
     *         The Unix date and time when the job finished.
     *         </p>
     */
    public java.util.Date getCompletionTimestamp() {
        return completionTimestamp;
    }

    /**
     * <p>
     * The Unix date and time when the job finished.
     * </p>
     *
     * @param completionTimestamp <p>
     *            The Unix date and time when the job finished.
     *            </p>
     */
    public void setCompletionTimestamp(java.util.Date completionTimestamp) {
        this.completionTimestamp = completionTimestamp;
    }

    /**
     * <p>
     * The Unix date and time when the job finished.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionTimestamp <p>
     *            The Unix date and time when the job finished.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMediaAnalysisJobResult withCompletionTimestamp(java.util.Date completionTimestamp) {
        this.completionTimestamp = completionTimestamp;
        return this;
    }

    /**
     * <p>
     * Reference to the input manifest that was provided in the job creation
     * request.
     * </p>
     *
     * @return <p>
     *         Reference to the input manifest that was provided in the job
     *         creation request.
     *         </p>
     */
    public MediaAnalysisInput getInput() {
        return input;
    }

    /**
     * <p>
     * Reference to the input manifest that was provided in the job creation
     * request.
     * </p>
     *
     * @param input <p>
     *            Reference to the input manifest that was provided in the job
     *            creation request.
     *            </p>
     */
    public void setInput(MediaAnalysisInput input) {
        this.input = input;
    }

    /**
     * <p>
     * Reference to the input manifest that was provided in the job creation
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param input <p>
     *            Reference to the input manifest that was provided in the job
     *            creation request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMediaAnalysisJobResult withInput(MediaAnalysisInput input) {
        this.input = input;
        return this;
    }

    /**
     * <p>
     * Output configuration that was provided in the creation request.
     * </p>
     *
     * @return <p>
     *         Output configuration that was provided in the creation request.
     *         </p>
     */
    public MediaAnalysisOutputConfig getOutputConfig() {
        return outputConfig;
    }

    /**
     * <p>
     * Output configuration that was provided in the creation request.
     * </p>
     *
     * @param outputConfig <p>
     *            Output configuration that was provided in the creation
     *            request.
     *            </p>
     */
    public void setOutputConfig(MediaAnalysisOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * Output configuration that was provided in the creation request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputConfig <p>
     *            Output configuration that was provided in the creation
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMediaAnalysisJobResult withOutputConfig(MediaAnalysisOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }

    /**
     * <p>
     * KMS Key that was provided in the creation request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @return <p>
     *         KMS Key that was provided in the creation request.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * KMS Key that was provided in the creation request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param kmsKeyId <p>
     *            KMS Key that was provided in the creation request.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * KMS Key that was provided in the creation request.
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
     *            KMS Key that was provided in the creation request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMediaAnalysisJobResult withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * Output manifest that contains prediction results.
     * </p>
     *
     * @return <p>
     *         Output manifest that contains prediction results.
     *         </p>
     */
    public MediaAnalysisResults getResults() {
        return results;
    }

    /**
     * <p>
     * Output manifest that contains prediction results.
     * </p>
     *
     * @param results <p>
     *            Output manifest that contains prediction results.
     *            </p>
     */
    public void setResults(MediaAnalysisResults results) {
        this.results = results;
    }

    /**
     * <p>
     * Output manifest that contains prediction results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results <p>
     *            Output manifest that contains prediction results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMediaAnalysisJobResult withResults(MediaAnalysisResults results) {
        this.results = results;
        return this;
    }

    /**
     * <p>
     * The summary manifest provides statistics on input manifest and errors
     * identified in the input manifest.
     * </p>
     *
     * @return <p>
     *         The summary manifest provides statistics on input manifest and
     *         errors identified in the input manifest.
     *         </p>
     */
    public MediaAnalysisManifestSummary getManifestSummary() {
        return manifestSummary;
    }

    /**
     * <p>
     * The summary manifest provides statistics on input manifest and errors
     * identified in the input manifest.
     * </p>
     *
     * @param manifestSummary <p>
     *            The summary manifest provides statistics on input manifest and
     *            errors identified in the input manifest.
     *            </p>
     */
    public void setManifestSummary(MediaAnalysisManifestSummary manifestSummary) {
        this.manifestSummary = manifestSummary;
    }

    /**
     * <p>
     * The summary manifest provides statistics on input manifest and errors
     * identified in the input manifest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param manifestSummary <p>
     *            The summary manifest provides statistics on input manifest and
     *            errors identified in the input manifest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMediaAnalysisJobResult withManifestSummary(
            MediaAnalysisManifestSummary manifestSummary) {
        this.manifestSummary = manifestSummary;
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
        if (getJobId() != null)
            sb.append("JobId: " + getJobId() + ",");
        if (getJobName() != null)
            sb.append("JobName: " + getJobName() + ",");
        if (getOperationsConfig() != null)
            sb.append("OperationsConfig: " + getOperationsConfig() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: " + getFailureDetails() + ",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: " + getCreationTimestamp() + ",");
        if (getCompletionTimestamp() != null)
            sb.append("CompletionTimestamp: " + getCompletionTimestamp() + ",");
        if (getInput() != null)
            sb.append("Input: " + getInput() + ",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: " + getOutputConfig() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getResults() != null)
            sb.append("Results: " + getResults() + ",");
        if (getManifestSummary() != null)
            sb.append("ManifestSummary: " + getManifestSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode
                + ((getOperationsConfig() == null) ? 0 : getOperationsConfig().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getCompletionTimestamp() == null) ? 0 : getCompletionTimestamp().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode
                + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode
                + ((getManifestSummary() == null) ? 0 : getManifestSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMediaAnalysisJobResult == false)
            return false;
        GetMediaAnalysisJobResult other = (GetMediaAnalysisJobResult) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null
                && other.getFailureDetails().equals(this.getFailureDetails()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null
                && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getCompletionTimestamp() == null ^ this.getCompletionTimestamp() == null)
            return false;
        if (other.getCompletionTimestamp() != null
                && other.getCompletionTimestamp().equals(this.getCompletionTimestamp()) == false)
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
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getManifestSummary() == null ^ this.getManifestSummary() == null)
            return false;
        if (other.getManifestSummary() != null
                && other.getManifestSummary().equals(this.getManifestSummary()) == false)
            return false;
        return true;
    }
}

/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Import job response.
 */
public class ImportJobResponse implements Serializable {
    /**
     * The unique ID of the application to which the import job applies.
     */
    private String applicationId;

    /**
     * The number of pieces that have successfully imported as of the time of
     * the request.
     */
    private Integer completedPieces;

    /**
     * The date the import job completed in ISO 8601 format.
     */
    private String completionDate;

    /**
     * The date the import job was created in ISO 8601 format.
     */
    private String creationDate;

    /**
     * The import job settings.
     */
    private ImportJobResource definition;

    /**
     * The number of pieces that have failed to import as of the time of the
     * request.
     */
    private Integer failedPieces;

    /**
     * Provides up to 100 of the first failed entries for the job, if any exist.
     */
    private java.util.List<String> failures;

    /**
     * The unique ID of the import job.
     */
    private String id;

    /**
     * The status of the import job. Valid values: CREATED, INITIALIZING,
     * PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED The job status is
     * FAILED if one or more pieces failed to import.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, INITIALIZING, PROCESSING, COMPLETING,
     * COMPLETED, FAILING, FAILED
     */
    private String jobStatus;

    /**
     * The number of endpoints that failed to import; for example, because of
     * syntax errors.
     */
    private Integer totalFailures;

    /**
     * The total number of pieces that must be imported to finish the job. Each
     * piece is an approximately equal portion of the endpoints to import.
     */
    private Integer totalPieces;

    /**
     * The number of endpoints that were processed by the import job.
     */
    private Integer totalProcessed;

    /**
     * The job type. Will be Import.
     */
    private String type;

    /**
     * The unique ID of the application to which the import job applies.
     *
     * @return The unique ID of the application to which the import job applies.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * The unique ID of the application to which the import job applies.
     *
     * @param applicationId The unique ID of the application to which the import
     *            job applies.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The unique ID of the application to which the import job applies.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId The unique ID of the application to which the import
     *            job applies.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * The number of pieces that have successfully imported as of the time of
     * the request.
     *
     * @return The number of pieces that have successfully imported as of the
     *         time of the request.
     */
    public Integer getCompletedPieces() {
        return completedPieces;
    }

    /**
     * The number of pieces that have successfully imported as of the time of
     * the request.
     *
     * @param completedPieces The number of pieces that have successfully
     *            imported as of the time of the request.
     */
    public void setCompletedPieces(Integer completedPieces) {
        this.completedPieces = completedPieces;
    }

    /**
     * The number of pieces that have successfully imported as of the time of
     * the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completedPieces The number of pieces that have successfully
     *            imported as of the time of the request.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withCompletedPieces(Integer completedPieces) {
        this.completedPieces = completedPieces;
        return this;
    }

    /**
     * The date the import job completed in ISO 8601 format.
     *
     * @return The date the import job completed in ISO 8601 format.
     */
    public String getCompletionDate() {
        return completionDate;
    }

    /**
     * The date the import job completed in ISO 8601 format.
     *
     * @param completionDate The date the import job completed in ISO 8601
     *            format.
     */
    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * The date the import job completed in ISO 8601 format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionDate The date the import job completed in ISO 8601
     *            format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withCompletionDate(String completionDate) {
        this.completionDate = completionDate;
        return this;
    }

    /**
     * The date the import job was created in ISO 8601 format.
     *
     * @return The date the import job was created in ISO 8601 format.
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * The date the import job was created in ISO 8601 format.
     *
     * @param creationDate The date the import job was created in ISO 8601
     *            format.
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * The date the import job was created in ISO 8601 format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate The date the import job was created in ISO 8601
     *            format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * The import job settings.
     *
     * @return The import job settings.
     */
    public ImportJobResource getDefinition() {
        return definition;
    }

    /**
     * The import job settings.
     *
     * @param definition The import job settings.
     */
    public void setDefinition(ImportJobResource definition) {
        this.definition = definition;
    }

    /**
     * The import job settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param definition The import job settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withDefinition(ImportJobResource definition) {
        this.definition = definition;
        return this;
    }

    /**
     * The number of pieces that have failed to import as of the time of the
     * request.
     *
     * @return The number of pieces that have failed to import as of the time of
     *         the request.
     */
    public Integer getFailedPieces() {
        return failedPieces;
    }

    /**
     * The number of pieces that have failed to import as of the time of the
     * request.
     *
     * @param failedPieces The number of pieces that have failed to import as of
     *            the time of the request.
     */
    public void setFailedPieces(Integer failedPieces) {
        this.failedPieces = failedPieces;
    }

    /**
     * The number of pieces that have failed to import as of the time of the
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedPieces The number of pieces that have failed to import as of
     *            the time of the request.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withFailedPieces(Integer failedPieces) {
        this.failedPieces = failedPieces;
        return this;
    }

    /**
     * Provides up to 100 of the first failed entries for the job, if any exist.
     *
     * @return Provides up to 100 of the first failed entries for the job, if
     *         any exist.
     */
    public java.util.List<String> getFailures() {
        return failures;
    }

    /**
     * Provides up to 100 of the first failed entries for the job, if any exist.
     *
     * @param failures Provides up to 100 of the first failed entries for the
     *            job, if any exist.
     */
    public void setFailures(java.util.Collection<String> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new java.util.ArrayList<String>(failures);
    }

    /**
     * Provides up to 100 of the first failed entries for the job, if any exist.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failures Provides up to 100 of the first failed entries for the
     *            job, if any exist.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withFailures(String... failures) {
        if (getFailures() == null) {
            this.failures = new java.util.ArrayList<String>(failures.length);
        }
        for (String value : failures) {
            this.failures.add(value);
        }
        return this;
    }

    /**
     * Provides up to 100 of the first failed entries for the job, if any exist.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failures Provides up to 100 of the first failed entries for the
     *            job, if any exist.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withFailures(java.util.Collection<String> failures) {
        setFailures(failures);
        return this;
    }

    /**
     * The unique ID of the import job.
     *
     * @return The unique ID of the import job.
     */
    public String getId() {
        return id;
    }

    /**
     * The unique ID of the import job.
     *
     * @param id The unique ID of the import job.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique ID of the import job.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id The unique ID of the import job.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The status of the import job. Valid values: CREATED, INITIALIZING,
     * PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED The job status is
     * FAILED if one or more pieces failed to import.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, INITIALIZING, PROCESSING, COMPLETING,
     * COMPLETED, FAILING, FAILED
     *
     * @return The status of the import job. Valid values: CREATED,
     *         INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
     *         The job status is FAILED if one or more pieces failed to import.
     * @see JobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * The status of the import job. Valid values: CREATED, INITIALIZING,
     * PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED The job status is
     * FAILED if one or more pieces failed to import.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, INITIALIZING, PROCESSING, COMPLETING,
     * COMPLETED, FAILING, FAILED
     *
     * @param jobStatus The status of the import job. Valid values: CREATED,
     *            INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING,
     *            FAILED The job status is FAILED if one or more pieces failed
     *            to import.
     * @see JobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * The status of the import job. Valid values: CREATED, INITIALIZING,
     * PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED The job status is
     * FAILED if one or more pieces failed to import.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, INITIALIZING, PROCESSING, COMPLETING,
     * COMPLETED, FAILING, FAILED
     *
     * @param jobStatus The status of the import job. Valid values: CREATED,
     *            INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING,
     *            FAILED The job status is FAILED if one or more pieces failed
     *            to import.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public ImportJobResponse withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * The status of the import job. Valid values: CREATED, INITIALIZING,
     * PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED The job status is
     * FAILED if one or more pieces failed to import.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, INITIALIZING, PROCESSING, COMPLETING,
     * COMPLETED, FAILING, FAILED
     *
     * @param jobStatus The status of the import job. Valid values: CREATED,
     *            INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING,
     *            FAILED The job status is FAILED if one or more pieces failed
     *            to import.
     * @see JobStatus
     */
    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * The status of the import job. Valid values: CREATED, INITIALIZING,
     * PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED The job status is
     * FAILED if one or more pieces failed to import.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, INITIALIZING, PROCESSING, COMPLETING,
     * COMPLETED, FAILING, FAILED
     *
     * @param jobStatus The status of the import job. Valid values: CREATED,
     *            INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING,
     *            FAILED The job status is FAILED if one or more pieces failed
     *            to import.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public ImportJobResponse withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * The number of endpoints that failed to import; for example, because of
     * syntax errors.
     *
     * @return The number of endpoints that failed to import; for example,
     *         because of syntax errors.
     */
    public Integer getTotalFailures() {
        return totalFailures;
    }

    /**
     * The number of endpoints that failed to import; for example, because of
     * syntax errors.
     *
     * @param totalFailures The number of endpoints that failed to import; for
     *            example, because of syntax errors.
     */
    public void setTotalFailures(Integer totalFailures) {
        this.totalFailures = totalFailures;
    }

    /**
     * The number of endpoints that failed to import; for example, because of
     * syntax errors.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalFailures The number of endpoints that failed to import; for
     *            example, because of syntax errors.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withTotalFailures(Integer totalFailures) {
        this.totalFailures = totalFailures;
        return this;
    }

    /**
     * The total number of pieces that must be imported to finish the job. Each
     * piece is an approximately equal portion of the endpoints to import.
     *
     * @return The total number of pieces that must be imported to finish the
     *         job. Each piece is an approximately equal portion of the
     *         endpoints to import.
     */
    public Integer getTotalPieces() {
        return totalPieces;
    }

    /**
     * The total number of pieces that must be imported to finish the job. Each
     * piece is an approximately equal portion of the endpoints to import.
     *
     * @param totalPieces The total number of pieces that must be imported to
     *            finish the job. Each piece is an approximately equal portion
     *            of the endpoints to import.
     */
    public void setTotalPieces(Integer totalPieces) {
        this.totalPieces = totalPieces;
    }

    /**
     * The total number of pieces that must be imported to finish the job. Each
     * piece is an approximately equal portion of the endpoints to import.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalPieces The total number of pieces that must be imported to
     *            finish the job. Each piece is an approximately equal portion
     *            of the endpoints to import.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withTotalPieces(Integer totalPieces) {
        this.totalPieces = totalPieces;
        return this;
    }

    /**
     * The number of endpoints that were processed by the import job.
     *
     * @return The number of endpoints that were processed by the import job.
     */
    public Integer getTotalProcessed() {
        return totalProcessed;
    }

    /**
     * The number of endpoints that were processed by the import job.
     *
     * @param totalProcessed The number of endpoints that were processed by the
     *            import job.
     */
    public void setTotalProcessed(Integer totalProcessed) {
        this.totalProcessed = totalProcessed;
    }

    /**
     * The number of endpoints that were processed by the import job.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalProcessed The number of endpoints that were processed by the
     *            import job.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withTotalProcessed(Integer totalProcessed) {
        this.totalProcessed = totalProcessed;
        return this;
    }

    /**
     * The job type. Will be Import.
     *
     * @return The job type. Will be Import.
     */
    public String getType() {
        return type;
    }

    /**
     * The job type. Will be Import.
     *
     * @param type The job type. Will be Import.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The job type. Will be Import.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type The job type. Will be Import.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withType(String type) {
        this.type = type;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getCompletedPieces() != null)
            sb.append("CompletedPieces: " + getCompletedPieces() + ",");
        if (getCompletionDate() != null)
            sb.append("CompletionDate: " + getCompletionDate() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getDefinition() != null)
            sb.append("Definition: " + getDefinition() + ",");
        if (getFailedPieces() != null)
            sb.append("FailedPieces: " + getFailedPieces() + ",");
        if (getFailures() != null)
            sb.append("Failures: " + getFailures() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getJobStatus() != null)
            sb.append("JobStatus: " + getJobStatus() + ",");
        if (getTotalFailures() != null)
            sb.append("TotalFailures: " + getTotalFailures() + ",");
        if (getTotalPieces() != null)
            sb.append("TotalPieces: " + getTotalPieces() + ",");
        if (getTotalProcessed() != null)
            sb.append("TotalProcessed: " + getTotalProcessed() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode
                + ((getCompletedPieces() == null) ? 0 : getCompletedPieces().hashCode());
        hashCode = prime * hashCode
                + ((getCompletionDate() == null) ? 0 : getCompletionDate().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode
                + ((getFailedPieces() == null) ? 0 : getFailedPieces().hashCode());
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode
                + ((getTotalFailures() == null) ? 0 : getTotalFailures().hashCode());
        hashCode = prime * hashCode
                + ((getTotalPieces() == null) ? 0 : getTotalPieces().hashCode());
        hashCode = prime * hashCode
                + ((getTotalProcessed() == null) ? 0 : getTotalProcessed().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportJobResponse == false)
            return false;
        ImportJobResponse other = (ImportJobResponse) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCompletedPieces() == null ^ this.getCompletedPieces() == null)
            return false;
        if (other.getCompletedPieces() != null
                && other.getCompletedPieces().equals(this.getCompletedPieces()) == false)
            return false;
        if (other.getCompletionDate() == null ^ this.getCompletionDate() == null)
            return false;
        if (other.getCompletionDate() != null
                && other.getCompletionDate().equals(this.getCompletionDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null
                && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getFailedPieces() == null ^ this.getFailedPieces() == null)
            return false;
        if (other.getFailedPieces() != null
                && other.getFailedPieces().equals(this.getFailedPieces()) == false)
            return false;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null
                && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getTotalFailures() == null ^ this.getTotalFailures() == null)
            return false;
        if (other.getTotalFailures() != null
                && other.getTotalFailures().equals(this.getTotalFailures()) == false)
            return false;
        if (other.getTotalPieces() == null ^ this.getTotalPieces() == null)
            return false;
        if (other.getTotalPieces() != null
                && other.getTotalPieces().equals(this.getTotalPieces()) == false)
            return false;
        if (other.getTotalProcessed() == null ^ this.getTotalProcessed() == null)
            return false;
        if (other.getTotalProcessed() != null
                && other.getTotalProcessed().equals(this.getTotalProcessed()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}

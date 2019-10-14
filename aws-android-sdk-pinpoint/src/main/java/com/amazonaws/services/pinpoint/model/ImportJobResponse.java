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
 * <p>
 * Provides information about the status and settings of a job that imports
 * endpoint definitions from one or more files. The files can be stored in an
 * Amazon Simple Storage Service (Amazon S3) bucket or uploaded directly from a
 * computer by using the Amazon Pinpoint console.
 * </p>
 */
public class ImportJobResponse implements Serializable {
    /**
     * <p>
     * The unique identifier for the application that's associated with the
     * import job.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * The number of pieces that were processed successfully (completed) by the
     * import job, as of the time of the request.
     * </p>
     */
    private Integer completedPieces;

    /**
     * <p>
     * The date, in ISO 8601 format, when the import job was completed.
     * </p>
     */
    private String completionDate;

    /**
     * <p>
     * The date, in ISO 8601 format, when the import job was created.
     * </p>
     */
    private String creationDate;

    /**
     * <p>
     * The resource settings that apply to the import job.
     * </p>
     */
    private ImportJobResource definition;

    /**
     * <p>
     * The number of pieces that weren't processed successfully (failed) by the
     * import job, as of the time of the request.
     * </p>
     */
    private Integer failedPieces;

    /**
     * <p>
     * An array of entries, one for each of the first 100 entries that weren't
     * processed successfully (failed) by the import job, if any.
     * </p>
     */
    private java.util.List<String> failures;

    /**
     * <p>
     * The unique identifier for the import job.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The status of the import job. The job status is FAILED if Amazon Pinpoint
     * wasn't able to process one or more pieces in the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, INITIALIZING, PROCESSING, COMPLETING,
     * COMPLETED, FAILING, FAILED
     */
    private String jobStatus;

    /**
     * <p>
     * The total number of endpoint definitions that weren't processed
     * successfully (failed) by the import job, typically because an error, such
     * as a syntax error, occurred.
     * </p>
     */
    private Integer totalFailures;

    /**
     * <p>
     * The total number of pieces that must be processed to complete the import
     * job. Each piece consists of an approximately equal portion of the
     * endpoint definitions that are part of the import job.
     * </p>
     */
    private Integer totalPieces;

    /**
     * <p>
     * The total number of endpoint definitions that were processed by the
     * import job.
     * </p>
     */
    private Integer totalProcessed;

    /**
     * <p>
     * The job type. This value is IMPORT for import jobs.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The unique identifier for the application that's associated with the
     * import job.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application that's associated with
     *         the import job.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that's associated with the
     * import job.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application that's associated
     *            with the import job.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that's associated with the
     * import job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application that's associated
     *            with the import job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The number of pieces that were processed successfully (completed) by the
     * import job, as of the time of the request.
     * </p>
     *
     * @return <p>
     *         The number of pieces that were processed successfully (completed)
     *         by the import job, as of the time of the request.
     *         </p>
     */
    public Integer getCompletedPieces() {
        return completedPieces;
    }

    /**
     * <p>
     * The number of pieces that were processed successfully (completed) by the
     * import job, as of the time of the request.
     * </p>
     *
     * @param completedPieces <p>
     *            The number of pieces that were processed successfully
     *            (completed) by the import job, as of the time of the request.
     *            </p>
     */
    public void setCompletedPieces(Integer completedPieces) {
        this.completedPieces = completedPieces;
    }

    /**
     * <p>
     * The number of pieces that were processed successfully (completed) by the
     * import job, as of the time of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completedPieces <p>
     *            The number of pieces that were processed successfully
     *            (completed) by the import job, as of the time of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withCompletedPieces(Integer completedPieces) {
        this.completedPieces = completedPieces;
        return this;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the import job was completed.
     * </p>
     *
     * @return <p>
     *         The date, in ISO 8601 format, when the import job was completed.
     *         </p>
     */
    public String getCompletionDate() {
        return completionDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the import job was completed.
     * </p>
     *
     * @param completionDate <p>
     *            The date, in ISO 8601 format, when the import job was
     *            completed.
     *            </p>
     */
    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the import job was completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionDate <p>
     *            The date, in ISO 8601 format, when the import job was
     *            completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withCompletionDate(String completionDate) {
        this.completionDate = completionDate;
        return this;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the import job was created.
     * </p>
     *
     * @return <p>
     *         The date, in ISO 8601 format, when the import job was created.
     *         </p>
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the import job was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date, in ISO 8601 format, when the import job was created.
     *            </p>
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the import job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date, in ISO 8601 format, when the import job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The resource settings that apply to the import job.
     * </p>
     *
     * @return <p>
     *         The resource settings that apply to the import job.
     *         </p>
     */
    public ImportJobResource getDefinition() {
        return definition;
    }

    /**
     * <p>
     * The resource settings that apply to the import job.
     * </p>
     *
     * @param definition <p>
     *            The resource settings that apply to the import job.
     *            </p>
     */
    public void setDefinition(ImportJobResource definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The resource settings that apply to the import job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param definition <p>
     *            The resource settings that apply to the import job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withDefinition(ImportJobResource definition) {
        this.definition = definition;
        return this;
    }

    /**
     * <p>
     * The number of pieces that weren't processed successfully (failed) by the
     * import job, as of the time of the request.
     * </p>
     *
     * @return <p>
     *         The number of pieces that weren't processed successfully (failed)
     *         by the import job, as of the time of the request.
     *         </p>
     */
    public Integer getFailedPieces() {
        return failedPieces;
    }

    /**
     * <p>
     * The number of pieces that weren't processed successfully (failed) by the
     * import job, as of the time of the request.
     * </p>
     *
     * @param failedPieces <p>
     *            The number of pieces that weren't processed successfully
     *            (failed) by the import job, as of the time of the request.
     *            </p>
     */
    public void setFailedPieces(Integer failedPieces) {
        this.failedPieces = failedPieces;
    }

    /**
     * <p>
     * The number of pieces that weren't processed successfully (failed) by the
     * import job, as of the time of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedPieces <p>
     *            The number of pieces that weren't processed successfully
     *            (failed) by the import job, as of the time of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withFailedPieces(Integer failedPieces) {
        this.failedPieces = failedPieces;
        return this;
    }

    /**
     * <p>
     * An array of entries, one for each of the first 100 entries that weren't
     * processed successfully (failed) by the import job, if any.
     * </p>
     *
     * @return <p>
     *         An array of entries, one for each of the first 100 entries that
     *         weren't processed successfully (failed) by the import job, if
     *         any.
     *         </p>
     */
    public java.util.List<String> getFailures() {
        return failures;
    }

    /**
     * <p>
     * An array of entries, one for each of the first 100 entries that weren't
     * processed successfully (failed) by the import job, if any.
     * </p>
     *
     * @param failures <p>
     *            An array of entries, one for each of the first 100 entries
     *            that weren't processed successfully (failed) by the import
     *            job, if any.
     *            </p>
     */
    public void setFailures(java.util.Collection<String> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new java.util.ArrayList<String>(failures);
    }

    /**
     * <p>
     * An array of entries, one for each of the first 100 entries that weren't
     * processed successfully (failed) by the import job, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failures <p>
     *            An array of entries, one for each of the first 100 entries
     *            that weren't processed successfully (failed) by the import
     *            job, if any.
     *            </p>
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
     * <p>
     * An array of entries, one for each of the first 100 entries that weren't
     * processed successfully (failed) by the import job, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failures <p>
     *            An array of entries, one for each of the first 100 entries
     *            that weren't processed successfully (failed) by the import
     *            job, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withFailures(java.util.Collection<String> failures) {
        setFailures(failures);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the import job.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the import job.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the import job.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the import job.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the import job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the import job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The status of the import job. The job status is FAILED if Amazon Pinpoint
     * wasn't able to process one or more pieces in the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, INITIALIZING, PROCESSING, COMPLETING,
     * COMPLETED, FAILING, FAILED
     *
     * @return <p>
     *         The status of the import job. The job status is FAILED if Amazon
     *         Pinpoint wasn't able to process one or more pieces in the job.
     *         </p>
     * @see JobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * <p>
     * The status of the import job. The job status is FAILED if Amazon Pinpoint
     * wasn't able to process one or more pieces in the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, INITIALIZING, PROCESSING, COMPLETING,
     * COMPLETED, FAILING, FAILED
     *
     * @param jobStatus <p>
     *            The status of the import job. The job status is FAILED if
     *            Amazon Pinpoint wasn't able to process one or more pieces in
     *            the job.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The status of the import job. The job status is FAILED if Amazon Pinpoint
     * wasn't able to process one or more pieces in the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, INITIALIZING, PROCESSING, COMPLETING,
     * COMPLETED, FAILING, FAILED
     *
     * @param jobStatus <p>
     *            The status of the import job. The job status is FAILED if
     *            Amazon Pinpoint wasn't able to process one or more pieces in
     *            the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public ImportJobResponse withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * The status of the import job. The job status is FAILED if Amazon Pinpoint
     * wasn't able to process one or more pieces in the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, INITIALIZING, PROCESSING, COMPLETING,
     * COMPLETED, FAILING, FAILED
     *
     * @param jobStatus <p>
     *            The status of the import job. The job status is FAILED if
     *            Amazon Pinpoint wasn't able to process one or more pieces in
     *            the job.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * The status of the import job. The job status is FAILED if Amazon Pinpoint
     * wasn't able to process one or more pieces in the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, INITIALIZING, PROCESSING, COMPLETING,
     * COMPLETED, FAILING, FAILED
     *
     * @param jobStatus <p>
     *            The status of the import job. The job status is FAILED if
     *            Amazon Pinpoint wasn't able to process one or more pieces in
     *            the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public ImportJobResponse withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The total number of endpoint definitions that weren't processed
     * successfully (failed) by the import job, typically because an error, such
     * as a syntax error, occurred.
     * </p>
     *
     * @return <p>
     *         The total number of endpoint definitions that weren't processed
     *         successfully (failed) by the import job, typically because an
     *         error, such as a syntax error, occurred.
     *         </p>
     */
    public Integer getTotalFailures() {
        return totalFailures;
    }

    /**
     * <p>
     * The total number of endpoint definitions that weren't processed
     * successfully (failed) by the import job, typically because an error, such
     * as a syntax error, occurred.
     * </p>
     *
     * @param totalFailures <p>
     *            The total number of endpoint definitions that weren't
     *            processed successfully (failed) by the import job, typically
     *            because an error, such as a syntax error, occurred.
     *            </p>
     */
    public void setTotalFailures(Integer totalFailures) {
        this.totalFailures = totalFailures;
    }

    /**
     * <p>
     * The total number of endpoint definitions that weren't processed
     * successfully (failed) by the import job, typically because an error, such
     * as a syntax error, occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalFailures <p>
     *            The total number of endpoint definitions that weren't
     *            processed successfully (failed) by the import job, typically
     *            because an error, such as a syntax error, occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withTotalFailures(Integer totalFailures) {
        this.totalFailures = totalFailures;
        return this;
    }

    /**
     * <p>
     * The total number of pieces that must be processed to complete the import
     * job. Each piece consists of an approximately equal portion of the
     * endpoint definitions that are part of the import job.
     * </p>
     *
     * @return <p>
     *         The total number of pieces that must be processed to complete the
     *         import job. Each piece consists of an approximately equal portion
     *         of the endpoint definitions that are part of the import job.
     *         </p>
     */
    public Integer getTotalPieces() {
        return totalPieces;
    }

    /**
     * <p>
     * The total number of pieces that must be processed to complete the import
     * job. Each piece consists of an approximately equal portion of the
     * endpoint definitions that are part of the import job.
     * </p>
     *
     * @param totalPieces <p>
     *            The total number of pieces that must be processed to complete
     *            the import job. Each piece consists of an approximately equal
     *            portion of the endpoint definitions that are part of the
     *            import job.
     *            </p>
     */
    public void setTotalPieces(Integer totalPieces) {
        this.totalPieces = totalPieces;
    }

    /**
     * <p>
     * The total number of pieces that must be processed to complete the import
     * job. Each piece consists of an approximately equal portion of the
     * endpoint definitions that are part of the import job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalPieces <p>
     *            The total number of pieces that must be processed to complete
     *            the import job. Each piece consists of an approximately equal
     *            portion of the endpoint definitions that are part of the
     *            import job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withTotalPieces(Integer totalPieces) {
        this.totalPieces = totalPieces;
        return this;
    }

    /**
     * <p>
     * The total number of endpoint definitions that were processed by the
     * import job.
     * </p>
     *
     * @return <p>
     *         The total number of endpoint definitions that were processed by
     *         the import job.
     *         </p>
     */
    public Integer getTotalProcessed() {
        return totalProcessed;
    }

    /**
     * <p>
     * The total number of endpoint definitions that were processed by the
     * import job.
     * </p>
     *
     * @param totalProcessed <p>
     *            The total number of endpoint definitions that were processed
     *            by the import job.
     *            </p>
     */
    public void setTotalProcessed(Integer totalProcessed) {
        this.totalProcessed = totalProcessed;
    }

    /**
     * <p>
     * The total number of endpoint definitions that were processed by the
     * import job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalProcessed <p>
     *            The total number of endpoint definitions that were processed
     *            by the import job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResponse withTotalProcessed(Integer totalProcessed) {
        this.totalProcessed = totalProcessed;
        return this;
    }

    /**
     * <p>
     * The job type. This value is IMPORT for import jobs.
     * </p>
     *
     * @return <p>
     *         The job type. This value is IMPORT for import jobs.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The job type. This value is IMPORT for import jobs.
     * </p>
     *
     * @param type <p>
     *            The job type. This value is IMPORT for import jobs.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The job type. This value is IMPORT for import jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The job type. This value is IMPORT for import jobs.
     *            </p>
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

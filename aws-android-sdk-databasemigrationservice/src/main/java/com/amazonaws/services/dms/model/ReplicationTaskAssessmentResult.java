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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

/**
 * <p>
 * The task assessment report in JSON format.
 * </p>
 */
public class ReplicationTaskAssessmentResult implements Serializable {
    /**
     * <p>
     * The replication task identifier of the task on which the task assessment
     * was run.
     * </p>
     */
    private String replicationTaskIdentifier;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     */
    private String replicationTaskArn;

    /**
     * <p>
     * The date the task assessment was completed.
     * </p>
     */
    private java.util.Date replicationTaskLastAssessmentDate;

    /**
     * <p>
     * The status of the task assessment.
     * </p>
     */
    private String assessmentStatus;

    /**
     * <p>
     * The file containing the results of the task assessment.
     * </p>
     */
    private String assessmentResultsFile;

    /**
     * <p>
     * The task assessment results in JSON format.
     * </p>
     */
    private String assessmentResults;

    /**
     * <p>
     * The URL of the S3 object containing the task assessment results.
     * </p>
     */
    private String s3ObjectUrl;

    /**
     * <p>
     * The replication task identifier of the task on which the task assessment
     * was run.
     * </p>
     *
     * @return <p>
     *         The replication task identifier of the task on which the task
     *         assessment was run.
     *         </p>
     */
    public String getReplicationTaskIdentifier() {
        return replicationTaskIdentifier;
    }

    /**
     * <p>
     * The replication task identifier of the task on which the task assessment
     * was run.
     * </p>
     *
     * @param replicationTaskIdentifier <p>
     *            The replication task identifier of the task on which the task
     *            assessment was run.
     *            </p>
     */
    public void setReplicationTaskIdentifier(String replicationTaskIdentifier) {
        this.replicationTaskIdentifier = replicationTaskIdentifier;
    }

    /**
     * <p>
     * The replication task identifier of the task on which the task assessment
     * was run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTaskIdentifier <p>
     *            The replication task identifier of the task on which the task
     *            assessment was run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskAssessmentResult withReplicationTaskIdentifier(
            String replicationTaskIdentifier) {
        this.replicationTaskIdentifier = replicationTaskIdentifier;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the replication task.
     *         </p>
     */
    public String getReplicationTaskArn() {
        return replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     *
     * @param replicationTaskArn <p>
     *            The Amazon Resource Name (ARN) of the replication task.
     *            </p>
     */
    public void setReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTaskArn <p>
     *            The Amazon Resource Name (ARN) of the replication task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskAssessmentResult withReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
        return this;
    }

    /**
     * <p>
     * The date the task assessment was completed.
     * </p>
     *
     * @return <p>
     *         The date the task assessment was completed.
     *         </p>
     */
    public java.util.Date getReplicationTaskLastAssessmentDate() {
        return replicationTaskLastAssessmentDate;
    }

    /**
     * <p>
     * The date the task assessment was completed.
     * </p>
     *
     * @param replicationTaskLastAssessmentDate <p>
     *            The date the task assessment was completed.
     *            </p>
     */
    public void setReplicationTaskLastAssessmentDate(
            java.util.Date replicationTaskLastAssessmentDate) {
        this.replicationTaskLastAssessmentDate = replicationTaskLastAssessmentDate;
    }

    /**
     * <p>
     * The date the task assessment was completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTaskLastAssessmentDate <p>
     *            The date the task assessment was completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskAssessmentResult withReplicationTaskLastAssessmentDate(
            java.util.Date replicationTaskLastAssessmentDate) {
        this.replicationTaskLastAssessmentDate = replicationTaskLastAssessmentDate;
        return this;
    }

    /**
     * <p>
     * The status of the task assessment.
     * </p>
     *
     * @return <p>
     *         The status of the task assessment.
     *         </p>
     */
    public String getAssessmentStatus() {
        return assessmentStatus;
    }

    /**
     * <p>
     * The status of the task assessment.
     * </p>
     *
     * @param assessmentStatus <p>
     *            The status of the task assessment.
     *            </p>
     */
    public void setAssessmentStatus(String assessmentStatus) {
        this.assessmentStatus = assessmentStatus;
    }

    /**
     * <p>
     * The status of the task assessment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assessmentStatus <p>
     *            The status of the task assessment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskAssessmentResult withAssessmentStatus(String assessmentStatus) {
        this.assessmentStatus = assessmentStatus;
        return this;
    }

    /**
     * <p>
     * The file containing the results of the task assessment.
     * </p>
     *
     * @return <p>
     *         The file containing the results of the task assessment.
     *         </p>
     */
    public String getAssessmentResultsFile() {
        return assessmentResultsFile;
    }

    /**
     * <p>
     * The file containing the results of the task assessment.
     * </p>
     *
     * @param assessmentResultsFile <p>
     *            The file containing the results of the task assessment.
     *            </p>
     */
    public void setAssessmentResultsFile(String assessmentResultsFile) {
        this.assessmentResultsFile = assessmentResultsFile;
    }

    /**
     * <p>
     * The file containing the results of the task assessment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assessmentResultsFile <p>
     *            The file containing the results of the task assessment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskAssessmentResult withAssessmentResultsFile(String assessmentResultsFile) {
        this.assessmentResultsFile = assessmentResultsFile;
        return this;
    }

    /**
     * <p>
     * The task assessment results in JSON format.
     * </p>
     *
     * @return <p>
     *         The task assessment results in JSON format.
     *         </p>
     */
    public String getAssessmentResults() {
        return assessmentResults;
    }

    /**
     * <p>
     * The task assessment results in JSON format.
     * </p>
     *
     * @param assessmentResults <p>
     *            The task assessment results in JSON format.
     *            </p>
     */
    public void setAssessmentResults(String assessmentResults) {
        this.assessmentResults = assessmentResults;
    }

    /**
     * <p>
     * The task assessment results in JSON format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assessmentResults <p>
     *            The task assessment results in JSON format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskAssessmentResult withAssessmentResults(String assessmentResults) {
        this.assessmentResults = assessmentResults;
        return this;
    }

    /**
     * <p>
     * The URL of the S3 object containing the task assessment results.
     * </p>
     *
     * @return <p>
     *         The URL of the S3 object containing the task assessment results.
     *         </p>
     */
    public String getS3ObjectUrl() {
        return s3ObjectUrl;
    }

    /**
     * <p>
     * The URL of the S3 object containing the task assessment results.
     * </p>
     *
     * @param s3ObjectUrl <p>
     *            The URL of the S3 object containing the task assessment
     *            results.
     *            </p>
     */
    public void setS3ObjectUrl(String s3ObjectUrl) {
        this.s3ObjectUrl = s3ObjectUrl;
    }

    /**
     * <p>
     * The URL of the S3 object containing the task assessment results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3ObjectUrl <p>
     *            The URL of the S3 object containing the task assessment
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskAssessmentResult withS3ObjectUrl(String s3ObjectUrl) {
        this.s3ObjectUrl = s3ObjectUrl;
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
        if (getReplicationTaskIdentifier() != null)
            sb.append("ReplicationTaskIdentifier: " + getReplicationTaskIdentifier() + ",");
        if (getReplicationTaskArn() != null)
            sb.append("ReplicationTaskArn: " + getReplicationTaskArn() + ",");
        if (getReplicationTaskLastAssessmentDate() != null)
            sb.append("ReplicationTaskLastAssessmentDate: "
                    + getReplicationTaskLastAssessmentDate() + ",");
        if (getAssessmentStatus() != null)
            sb.append("AssessmentStatus: " + getAssessmentStatus() + ",");
        if (getAssessmentResultsFile() != null)
            sb.append("AssessmentResultsFile: " + getAssessmentResultsFile() + ",");
        if (getAssessmentResults() != null)
            sb.append("AssessmentResults: " + getAssessmentResults() + ",");
        if (getS3ObjectUrl() != null)
            sb.append("S3ObjectUrl: " + getS3ObjectUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReplicationTaskIdentifier() == null) ? 0 : getReplicationTaskIdentifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getReplicationTaskArn() == null) ? 0 : getReplicationTaskArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationTaskLastAssessmentDate() == null) ? 0
                        : getReplicationTaskLastAssessmentDate().hashCode());
        hashCode = prime * hashCode
                + ((getAssessmentStatus() == null) ? 0 : getAssessmentStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssessmentResultsFile() == null) ? 0 : getAssessmentResultsFile().hashCode());
        hashCode = prime * hashCode
                + ((getAssessmentResults() == null) ? 0 : getAssessmentResults().hashCode());
        hashCode = prime * hashCode
                + ((getS3ObjectUrl() == null) ? 0 : getS3ObjectUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationTaskAssessmentResult == false)
            return false;
        ReplicationTaskAssessmentResult other = (ReplicationTaskAssessmentResult) obj;

        if (other.getReplicationTaskIdentifier() == null
                ^ this.getReplicationTaskIdentifier() == null)
            return false;
        if (other.getReplicationTaskIdentifier() != null
                && other.getReplicationTaskIdentifier().equals(this.getReplicationTaskIdentifier()) == false)
            return false;
        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null
                && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getReplicationTaskLastAssessmentDate() == null
                ^ this.getReplicationTaskLastAssessmentDate() == null)
            return false;
        if (other.getReplicationTaskLastAssessmentDate() != null
                && other.getReplicationTaskLastAssessmentDate().equals(
                        this.getReplicationTaskLastAssessmentDate()) == false)
            return false;
        if (other.getAssessmentStatus() == null ^ this.getAssessmentStatus() == null)
            return false;
        if (other.getAssessmentStatus() != null
                && other.getAssessmentStatus().equals(this.getAssessmentStatus()) == false)
            return false;
        if (other.getAssessmentResultsFile() == null ^ this.getAssessmentResultsFile() == null)
            return false;
        if (other.getAssessmentResultsFile() != null
                && other.getAssessmentResultsFile().equals(this.getAssessmentResultsFile()) == false)
            return false;
        if (other.getAssessmentResults() == null ^ this.getAssessmentResults() == null)
            return false;
        if (other.getAssessmentResults() != null
                && other.getAssessmentResults().equals(this.getAssessmentResults()) == false)
            return false;
        if (other.getS3ObjectUrl() == null ^ this.getS3ObjectUrl() == null)
            return false;
        if (other.getS3ObjectUrl() != null
                && other.getS3ObjectUrl().equals(this.getS3ObjectUrl()) == false)
            return false;
        return true;
    }
}

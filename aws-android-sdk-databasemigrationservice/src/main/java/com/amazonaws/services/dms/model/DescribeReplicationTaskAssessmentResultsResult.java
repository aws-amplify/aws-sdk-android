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
 * <p/>
 */
public class DescribeReplicationTaskAssessmentResultsResult implements Serializable {
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * - The Amazon S3 bucket where the task assessment report is located.
     * </p>
     */
    private String bucketName;

    /**
     * <p>
     * The task assessment report.
     * </p>
     */
    private java.util.List<ReplicationTaskAssessmentResult> replicationTaskAssessmentResults;

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous request. If
     *         this parameter is specified, the response includes only records
     *         beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReplicationTaskAssessmentResultsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * - The Amazon S3 bucket where the task assessment report is located.
     * </p>
     *
     * @return <p>
     *         - The Amazon S3 bucket where the task assessment report is
     *         located.
     *         </p>
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * <p>
     * - The Amazon S3 bucket where the task assessment report is located.
     * </p>
     *
     * @param bucketName <p>
     *            - The Amazon S3 bucket where the task assessment report is
     *            located.
     *            </p>
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * - The Amazon S3 bucket where the task assessment report is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketName <p>
     *            - The Amazon S3 bucket where the task assessment report is
     *            located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReplicationTaskAssessmentResultsResult withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * <p>
     * The task assessment report.
     * </p>
     *
     * @return <p>
     *         The task assessment report.
     *         </p>
     */
    public java.util.List<ReplicationTaskAssessmentResult> getReplicationTaskAssessmentResults() {
        return replicationTaskAssessmentResults;
    }

    /**
     * <p>
     * The task assessment report.
     * </p>
     *
     * @param replicationTaskAssessmentResults <p>
     *            The task assessment report.
     *            </p>
     */
    public void setReplicationTaskAssessmentResults(
            java.util.Collection<ReplicationTaskAssessmentResult> replicationTaskAssessmentResults) {
        if (replicationTaskAssessmentResults == null) {
            this.replicationTaskAssessmentResults = null;
            return;
        }

        this.replicationTaskAssessmentResults = new java.util.ArrayList<ReplicationTaskAssessmentResult>(
                replicationTaskAssessmentResults);
    }

    /**
     * <p>
     * The task assessment report.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTaskAssessmentResults <p>
     *            The task assessment report.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReplicationTaskAssessmentResultsResult withReplicationTaskAssessmentResults(
            ReplicationTaskAssessmentResult... replicationTaskAssessmentResults) {
        if (getReplicationTaskAssessmentResults() == null) {
            this.replicationTaskAssessmentResults = new java.util.ArrayList<ReplicationTaskAssessmentResult>(
                    replicationTaskAssessmentResults.length);
        }
        for (ReplicationTaskAssessmentResult value : replicationTaskAssessmentResults) {
            this.replicationTaskAssessmentResults.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The task assessment report.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTaskAssessmentResults <p>
     *            The task assessment report.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReplicationTaskAssessmentResultsResult withReplicationTaskAssessmentResults(
            java.util.Collection<ReplicationTaskAssessmentResult> replicationTaskAssessmentResults) {
        setReplicationTaskAssessmentResults(replicationTaskAssessmentResults);
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getBucketName() != null)
            sb.append("BucketName: " + getBucketName() + ",");
        if (getReplicationTaskAssessmentResults() != null)
            sb.append("ReplicationTaskAssessmentResults: " + getReplicationTaskAssessmentResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationTaskAssessmentResults() == null) ? 0
                        : getReplicationTaskAssessmentResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicationTaskAssessmentResultsResult == false)
            return false;
        DescribeReplicationTaskAssessmentResultsResult other = (DescribeReplicationTaskAssessmentResultsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null
                && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getReplicationTaskAssessmentResults() == null
                ^ this.getReplicationTaskAssessmentResults() == null)
            return false;
        if (other.getReplicationTaskAssessmentResults() != null
                && other.getReplicationTaskAssessmentResults().equals(
                        this.getReplicationTaskAssessmentResults()) == false)
            return false;
        return true;
    }
}

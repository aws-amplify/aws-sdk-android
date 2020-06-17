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

package com.amazonaws.services.snowball.model;

import java.io.Serializable;

public class DescribeJobResult implements Serializable {
    /**
     * <p>
     * Information about a specific job, including shipping information, job
     * status, and other important metadata.
     * </p>
     */
    private JobMetadata jobMetadata;

    /**
     * <p>
     * Information about a specific job part (in the case of an export job),
     * including shipping information, job status, and other important metadata.
     * </p>
     */
    private java.util.List<JobMetadata> subJobMetadata;

    /**
     * <p>
     * Information about a specific job, including shipping information, job
     * status, and other important metadata.
     * </p>
     *
     * @return <p>
     *         Information about a specific job, including shipping information,
     *         job status, and other important metadata.
     *         </p>
     */
    public JobMetadata getJobMetadata() {
        return jobMetadata;
    }

    /**
     * <p>
     * Information about a specific job, including shipping information, job
     * status, and other important metadata.
     * </p>
     *
     * @param jobMetadata <p>
     *            Information about a specific job, including shipping
     *            information, job status, and other important metadata.
     *            </p>
     */
    public void setJobMetadata(JobMetadata jobMetadata) {
        this.jobMetadata = jobMetadata;
    }

    /**
     * <p>
     * Information about a specific job, including shipping information, job
     * status, and other important metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobMetadata <p>
     *            Information about a specific job, including shipping
     *            information, job status, and other important metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobResult withJobMetadata(JobMetadata jobMetadata) {
        this.jobMetadata = jobMetadata;
        return this;
    }

    /**
     * <p>
     * Information about a specific job part (in the case of an export job),
     * including shipping information, job status, and other important metadata.
     * </p>
     *
     * @return <p>
     *         Information about a specific job part (in the case of an export
     *         job), including shipping information, job status, and other
     *         important metadata.
     *         </p>
     */
    public java.util.List<JobMetadata> getSubJobMetadata() {
        return subJobMetadata;
    }

    /**
     * <p>
     * Information about a specific job part (in the case of an export job),
     * including shipping information, job status, and other important metadata.
     * </p>
     *
     * @param subJobMetadata <p>
     *            Information about a specific job part (in the case of an
     *            export job), including shipping information, job status, and
     *            other important metadata.
     *            </p>
     */
    public void setSubJobMetadata(java.util.Collection<JobMetadata> subJobMetadata) {
        if (subJobMetadata == null) {
            this.subJobMetadata = null;
            return;
        }

        this.subJobMetadata = new java.util.ArrayList<JobMetadata>(subJobMetadata);
    }

    /**
     * <p>
     * Information about a specific job part (in the case of an export job),
     * including shipping information, job status, and other important metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subJobMetadata <p>
     *            Information about a specific job part (in the case of an
     *            export job), including shipping information, job status, and
     *            other important metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobResult withSubJobMetadata(JobMetadata... subJobMetadata) {
        if (getSubJobMetadata() == null) {
            this.subJobMetadata = new java.util.ArrayList<JobMetadata>(subJobMetadata.length);
        }
        for (JobMetadata value : subJobMetadata) {
            this.subJobMetadata.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about a specific job part (in the case of an export job),
     * including shipping information, job status, and other important metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subJobMetadata <p>
     *            Information about a specific job part (in the case of an
     *            export job), including shipping information, job status, and
     *            other important metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobResult withSubJobMetadata(java.util.Collection<JobMetadata> subJobMetadata) {
        setSubJobMetadata(subJobMetadata);
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
        if (getJobMetadata() != null)
            sb.append("JobMetadata: " + getJobMetadata() + ",");
        if (getSubJobMetadata() != null)
            sb.append("SubJobMetadata: " + getSubJobMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJobMetadata() == null) ? 0 : getJobMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getSubJobMetadata() == null) ? 0 : getSubJobMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJobResult == false)
            return false;
        DescribeJobResult other = (DescribeJobResult) obj;

        if (other.getJobMetadata() == null ^ this.getJobMetadata() == null)
            return false;
        if (other.getJobMetadata() != null
                && other.getJobMetadata().equals(this.getJobMetadata()) == false)
            return false;
        if (other.getSubJobMetadata() == null ^ this.getSubJobMetadata() == null)
            return false;
        if (other.getSubJobMetadata() != null
                && other.getSubJobMetadata().equals(this.getSubJobMetadata()) == false)
            return false;
        return true;
    }
}

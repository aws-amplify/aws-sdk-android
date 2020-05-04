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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


public class DescribeJobResult implements Serializable {
    /**
     * <p>Contains the configuration parameters and status for the job specified in the <code>Describe Job</code> request.</p>
     */
    private JobDescriptor job;

    /**
     * <p>Contains the configuration parameters and status for the job specified in the <code>Describe Job</code> request.</p>
     *
     * @return <p>Contains the configuration parameters and status for the job specified in the <code>Describe Job</code> request.</p>
     */
    public JobDescriptor getJob() {
        return job;
    }

    /**
     * <p>Contains the configuration parameters and status for the job specified in the <code>Describe Job</code> request.</p>
     *
     * @param job <p>Contains the configuration parameters and status for the job specified in the <code>Describe Job</code> request.</p>
     */
    public void setJob(JobDescriptor job) {
        this.job = job;
    }

    /**
     * <p>Contains the configuration parameters and status for the job specified in the <code>Describe Job</code> request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param job <p>Contains the configuration parameters and status for the job specified in the <code>Describe Job</code> request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeJobResult withJob(JobDescriptor job) {
        this.job = job;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJob() != null) sb.append("Job: " + getJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJob() == null) ? 0 : getJob().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeJobResult == false) return false;
        DescribeJobResult other = (DescribeJobResult)obj;

        if (other.getJob() == null ^ this.getJob() == null) return false;
        if (other.getJob() != null && other.getJob().equals(this.getJob()) == false) return false;
        return true;
    }
}

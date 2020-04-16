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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

public class ListJobTemplatesResult implements Serializable {
    /**
     * List of Job templates.
     */
    private java.util.List<JobTemplate> jobTemplates;

    /**
     * Use this string to request the next batch of job templates.
     */
    private String nextToken;

    /**
     * List of Job templates.
     *
     * @return List of Job templates.
     */
    public java.util.List<JobTemplate> getJobTemplates() {
        return jobTemplates;
    }

    /**
     * List of Job templates.
     *
     * @param jobTemplates List of Job templates.
     */
    public void setJobTemplates(java.util.Collection<JobTemplate> jobTemplates) {
        if (jobTemplates == null) {
            this.jobTemplates = null;
            return;
        }

        this.jobTemplates = new java.util.ArrayList<JobTemplate>(jobTemplates);
    }

    /**
     * List of Job templates.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobTemplates List of Job templates.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJobTemplatesResult withJobTemplates(JobTemplate... jobTemplates) {
        if (getJobTemplates() == null) {
            this.jobTemplates = new java.util.ArrayList<JobTemplate>(jobTemplates.length);
        }
        for (JobTemplate value : jobTemplates) {
            this.jobTemplates.add(value);
        }
        return this;
    }

    /**
     * List of Job templates.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobTemplates List of Job templates.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJobTemplatesResult withJobTemplates(java.util.Collection<JobTemplate> jobTemplates) {
        setJobTemplates(jobTemplates);
        return this;
    }

    /**
     * Use this string to request the next batch of job templates.
     *
     * @return Use this string to request the next batch of job templates.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Use this string to request the next batch of job templates.
     *
     * @param nextToken Use this string to request the next batch of job
     *            templates.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Use this string to request the next batch of job templates.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken Use this string to request the next batch of job
     *            templates.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJobTemplatesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getJobTemplates() != null)
            sb.append("JobTemplates: " + getJobTemplates() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJobTemplates() == null) ? 0 : getJobTemplates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobTemplatesResult == false)
            return false;
        ListJobTemplatesResult other = (ListJobTemplatesResult) obj;

        if (other.getJobTemplates() == null ^ this.getJobTemplates() == null)
            return false;
        if (other.getJobTemplates() != null
                && other.getJobTemplates().equals(this.getJobTemplates()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

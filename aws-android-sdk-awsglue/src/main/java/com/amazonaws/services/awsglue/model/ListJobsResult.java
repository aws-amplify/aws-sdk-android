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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

public class ListJobsResult implements Serializable {
    /**
     * <p>
     * The names of all jobs in the account, or the jobs with the specified
     * tags.
     * </p>
     */
    private java.util.List<String> jobNames;

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of all jobs in the account, or the jobs with the specified
     * tags.
     * </p>
     *
     * @return <p>
     *         The names of all jobs in the account, or the jobs with the
     *         specified tags.
     *         </p>
     */
    public java.util.List<String> getJobNames() {
        return jobNames;
    }

    /**
     * <p>
     * The names of all jobs in the account, or the jobs with the specified
     * tags.
     * </p>
     *
     * @param jobNames <p>
     *            The names of all jobs in the account, or the jobs with the
     *            specified tags.
     *            </p>
     */
    public void setJobNames(java.util.Collection<String> jobNames) {
        if (jobNames == null) {
            this.jobNames = null;
            return;
        }

        this.jobNames = new java.util.ArrayList<String>(jobNames);
    }

    /**
     * <p>
     * The names of all jobs in the account, or the jobs with the specified
     * tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobNames <p>
     *            The names of all jobs in the account, or the jobs with the
     *            specified tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJobsResult withJobNames(String... jobNames) {
        if (getJobNames() == null) {
            this.jobNames = new java.util.ArrayList<String>(jobNames.length);
        }
        for (String value : jobNames) {
            this.jobNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of all jobs in the account, or the jobs with the specified
     * tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobNames <p>
     *            The names of all jobs in the account, or the jobs with the
     *            specified tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJobsResult withJobNames(java.util.Collection<String> jobNames) {
        setJobNames(jobNames);
        return this;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     *
     * @return <p>
     *         A continuation token, if the returned list does not contain the
     *         last metric available.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if the returned list does not contain
     *            the last metric available.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if the returned list does not contain
     *            the last metric available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJobsResult withNextToken(String nextToken) {
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
        if (getJobNames() != null)
            sb.append("JobNames: " + getJobNames() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobNames() == null) ? 0 : getJobNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobsResult == false)
            return false;
        ListJobsResult other = (ListJobsResult) obj;

        if (other.getJobNames() == null ^ this.getJobNames() == null)
            return false;
        if (other.getJobNames() != null && other.getJobNames().equals(this.getJobNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

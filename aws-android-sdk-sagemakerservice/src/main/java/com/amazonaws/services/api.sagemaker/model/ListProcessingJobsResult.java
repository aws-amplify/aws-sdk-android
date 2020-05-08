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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class ListProcessingJobsResult implements Serializable {
    /**
     * <p>
     * An array of <code>ProcessingJobSummary</code> objects, each listing a
     * processing job.
     * </p>
     */
    private java.util.List<ProcessingJobSummary> processingJobSummaries;

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of processing jobs, use it in the subsequent
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>ProcessingJobSummary</code> objects, each listing a
     * processing job.
     * </p>
     *
     * @return <p>
     *         An array of <code>ProcessingJobSummary</code> objects, each
     *         listing a processing job.
     *         </p>
     */
    public java.util.List<ProcessingJobSummary> getProcessingJobSummaries() {
        return processingJobSummaries;
    }

    /**
     * <p>
     * An array of <code>ProcessingJobSummary</code> objects, each listing a
     * processing job.
     * </p>
     *
     * @param processingJobSummaries <p>
     *            An array of <code>ProcessingJobSummary</code> objects, each
     *            listing a processing job.
     *            </p>
     */
    public void setProcessingJobSummaries(
            java.util.Collection<ProcessingJobSummary> processingJobSummaries) {
        if (processingJobSummaries == null) {
            this.processingJobSummaries = null;
            return;
        }

        this.processingJobSummaries = new java.util.ArrayList<ProcessingJobSummary>(
                processingJobSummaries);
    }

    /**
     * <p>
     * An array of <code>ProcessingJobSummary</code> objects, each listing a
     * processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processingJobSummaries <p>
     *            An array of <code>ProcessingJobSummary</code> objects, each
     *            listing a processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProcessingJobsResult withProcessingJobSummaries(
            ProcessingJobSummary... processingJobSummaries) {
        if (getProcessingJobSummaries() == null) {
            this.processingJobSummaries = new java.util.ArrayList<ProcessingJobSummary>(
                    processingJobSummaries.length);
        }
        for (ProcessingJobSummary value : processingJobSummaries) {
            this.processingJobSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProcessingJobSummary</code> objects, each listing a
     * processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processingJobSummaries <p>
     *            An array of <code>ProcessingJobSummary</code> objects, each
     *            listing a processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProcessingJobsResult withProcessingJobSummaries(
            java.util.Collection<ProcessingJobSummary> processingJobSummaries) {
        setProcessingJobSummaries(processingJobSummaries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of processing jobs, use it in the subsequent
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon SageMaker returns this
     *         token. To retrieve the next set of processing jobs, use it in the
     *         subsequent request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of processing jobs, use it in the subsequent
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of processing jobs, use it in
     *            the subsequent request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of processing jobs, use it in the subsequent
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of processing jobs, use it in
     *            the subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProcessingJobsResult withNextToken(String nextToken) {
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
        if (getProcessingJobSummaries() != null)
            sb.append("ProcessingJobSummaries: " + getProcessingJobSummaries() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getProcessingJobSummaries() == null) ? 0 : getProcessingJobSummaries()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProcessingJobsResult == false)
            return false;
        ListProcessingJobsResult other = (ListProcessingJobsResult) obj;

        if (other.getProcessingJobSummaries() == null ^ this.getProcessingJobSummaries() == null)
            return false;
        if (other.getProcessingJobSummaries() != null
                && other.getProcessingJobSummaries().equals(this.getProcessingJobSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

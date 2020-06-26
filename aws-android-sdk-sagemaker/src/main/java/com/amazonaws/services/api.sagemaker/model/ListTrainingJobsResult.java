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

public class ListTrainingJobsResult implements Serializable {
    /**
     * <p>
     * An array of <code>TrainingJobSummary</code> objects, each listing a
     * training job.
     * </p>
     */
    private java.util.List<TrainingJobSummary> trainingJobSummaries;

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of training jobs, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>TrainingJobSummary</code> objects, each listing a
     * training job.
     * </p>
     *
     * @return <p>
     *         An array of <code>TrainingJobSummary</code> objects, each listing
     *         a training job.
     *         </p>
     */
    public java.util.List<TrainingJobSummary> getTrainingJobSummaries() {
        return trainingJobSummaries;
    }

    /**
     * <p>
     * An array of <code>TrainingJobSummary</code> objects, each listing a
     * training job.
     * </p>
     *
     * @param trainingJobSummaries <p>
     *            An array of <code>TrainingJobSummary</code> objects, each
     *            listing a training job.
     *            </p>
     */
    public void setTrainingJobSummaries(
            java.util.Collection<TrainingJobSummary> trainingJobSummaries) {
        if (trainingJobSummaries == null) {
            this.trainingJobSummaries = null;
            return;
        }

        this.trainingJobSummaries = new java.util.ArrayList<TrainingJobSummary>(
                trainingJobSummaries);
    }

    /**
     * <p>
     * An array of <code>TrainingJobSummary</code> objects, each listing a
     * training job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingJobSummaries <p>
     *            An array of <code>TrainingJobSummary</code> objects, each
     *            listing a training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrainingJobsResult withTrainingJobSummaries(
            TrainingJobSummary... trainingJobSummaries) {
        if (getTrainingJobSummaries() == null) {
            this.trainingJobSummaries = new java.util.ArrayList<TrainingJobSummary>(
                    trainingJobSummaries.length);
        }
        for (TrainingJobSummary value : trainingJobSummaries) {
            this.trainingJobSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>TrainingJobSummary</code> objects, each listing a
     * training job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingJobSummaries <p>
     *            An array of <code>TrainingJobSummary</code> objects, each
     *            listing a training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrainingJobsResult withTrainingJobSummaries(
            java.util.Collection<TrainingJobSummary> trainingJobSummaries) {
        setTrainingJobSummaries(trainingJobSummaries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of training jobs, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon SageMaker returns this
     *         token. To retrieve the next set of training jobs, use it in the
     *         subsequent request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of training jobs, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of training jobs, use it in
     *            the subsequent request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of training jobs, use it in the subsequent request.
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
     *            token. To retrieve the next set of training jobs, use it in
     *            the subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrainingJobsResult withNextToken(String nextToken) {
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
        if (getTrainingJobSummaries() != null)
            sb.append("TrainingJobSummaries: " + getTrainingJobSummaries() + ",");
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
                + ((getTrainingJobSummaries() == null) ? 0 : getTrainingJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrainingJobsResult == false)
            return false;
        ListTrainingJobsResult other = (ListTrainingJobsResult) obj;

        if (other.getTrainingJobSummaries() == null ^ this.getTrainingJobSummaries() == null)
            return false;
        if (other.getTrainingJobSummaries() != null
                && other.getTrainingJobSummaries().equals(this.getTrainingJobSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

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

public class ListCompilationJobsResult implements Serializable {
    /**
     * <p>
     * An array of <a>CompilationJobSummary</a> objects, each describing a model
     * compilation job.
     * </p>
     */
    private java.util.List<CompilationJobSummary> compilationJobSummaries;

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this
     * <code>NextToken</code>. To retrieve the next set of model compilation
     * jobs, use this token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <a>CompilationJobSummary</a> objects, each describing a model
     * compilation job.
     * </p>
     *
     * @return <p>
     *         An array of <a>CompilationJobSummary</a> objects, each describing
     *         a model compilation job.
     *         </p>
     */
    public java.util.List<CompilationJobSummary> getCompilationJobSummaries() {
        return compilationJobSummaries;
    }

    /**
     * <p>
     * An array of <a>CompilationJobSummary</a> objects, each describing a model
     * compilation job.
     * </p>
     *
     * @param compilationJobSummaries <p>
     *            An array of <a>CompilationJobSummary</a> objects, each
     *            describing a model compilation job.
     *            </p>
     */
    public void setCompilationJobSummaries(
            java.util.Collection<CompilationJobSummary> compilationJobSummaries) {
        if (compilationJobSummaries == null) {
            this.compilationJobSummaries = null;
            return;
        }

        this.compilationJobSummaries = new java.util.ArrayList<CompilationJobSummary>(
                compilationJobSummaries);
    }

    /**
     * <p>
     * An array of <a>CompilationJobSummary</a> objects, each describing a model
     * compilation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compilationJobSummaries <p>
     *            An array of <a>CompilationJobSummary</a> objects, each
     *            describing a model compilation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCompilationJobsResult withCompilationJobSummaries(
            CompilationJobSummary... compilationJobSummaries) {
        if (getCompilationJobSummaries() == null) {
            this.compilationJobSummaries = new java.util.ArrayList<CompilationJobSummary>(
                    compilationJobSummaries.length);
        }
        for (CompilationJobSummary value : compilationJobSummaries) {
            this.compilationJobSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>CompilationJobSummary</a> objects, each describing a model
     * compilation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compilationJobSummaries <p>
     *            An array of <a>CompilationJobSummary</a> objects, each
     *            describing a model compilation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCompilationJobsResult withCompilationJobSummaries(
            java.util.Collection<CompilationJobSummary> compilationJobSummaries) {
        setCompilationJobSummaries(compilationJobSummaries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this
     * <code>NextToken</code>. To retrieve the next set of model compilation
     * jobs, use this token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon SageMaker returns this
     *         <code>NextToken</code>. To retrieve the next set of model
     *         compilation jobs, use this token in the next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this
     * <code>NextToken</code>. To retrieve the next set of model compilation
     * jobs, use this token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            <code>NextToken</code>. To retrieve the next set of model
     *            compilation jobs, use this token in the next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this
     * <code>NextToken</code>. To retrieve the next set of model compilation
     * jobs, use this token in the next request.
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
     *            <code>NextToken</code>. To retrieve the next set of model
     *            compilation jobs, use this token in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCompilationJobsResult withNextToken(String nextToken) {
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
        if (getCompilationJobSummaries() != null)
            sb.append("CompilationJobSummaries: " + getCompilationJobSummaries() + ",");
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
                + ((getCompilationJobSummaries() == null) ? 0 : getCompilationJobSummaries()
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

        if (obj instanceof ListCompilationJobsResult == false)
            return false;
        ListCompilationJobsResult other = (ListCompilationJobsResult) obj;

        if (other.getCompilationJobSummaries() == null ^ this.getCompilationJobSummaries() == null)
            return false;
        if (other.getCompilationJobSummaries() != null
                && other.getCompilationJobSummaries().equals(this.getCompilationJobSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

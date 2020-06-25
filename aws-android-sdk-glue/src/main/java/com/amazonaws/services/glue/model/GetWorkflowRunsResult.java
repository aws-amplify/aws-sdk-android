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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

public class GetWorkflowRunsResult implements Serializable {
    /**
     * <p>
     * A list of workflow run metadata objects.
     * </p>
     */
    private java.util.List<WorkflowRun> runs;

    /**
     * <p>
     * A continuation token, if not all requested workflow runs have been
     * returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of workflow run metadata objects.
     * </p>
     *
     * @return <p>
     *         A list of workflow run metadata objects.
     *         </p>
     */
    public java.util.List<WorkflowRun> getRuns() {
        return runs;
    }

    /**
     * <p>
     * A list of workflow run metadata objects.
     * </p>
     *
     * @param runs <p>
     *            A list of workflow run metadata objects.
     *            </p>
     */
    public void setRuns(java.util.Collection<WorkflowRun> runs) {
        if (runs == null) {
            this.runs = null;
            return;
        }

        this.runs = new java.util.ArrayList<WorkflowRun>(runs);
    }

    /**
     * <p>
     * A list of workflow run metadata objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runs <p>
     *            A list of workflow run metadata objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetWorkflowRunsResult withRuns(WorkflowRun... runs) {
        if (getRuns() == null) {
            this.runs = new java.util.ArrayList<WorkflowRun>(runs.length);
        }
        for (WorkflowRun value : runs) {
            this.runs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of workflow run metadata objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runs <p>
     *            A list of workflow run metadata objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetWorkflowRunsResult withRuns(java.util.Collection<WorkflowRun> runs) {
        setRuns(runs);
        return this;
    }

    /**
     * <p>
     * A continuation token, if not all requested workflow runs have been
     * returned.
     * </p>
     *
     * @return <p>
     *         A continuation token, if not all requested workflow runs have
     *         been returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all requested workflow runs have been
     * returned.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if not all requested workflow runs have
     *            been returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all requested workflow runs have been
     * returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if not all requested workflow runs have
     *            been returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetWorkflowRunsResult withNextToken(String nextToken) {
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
        if (getRuns() != null)
            sb.append("Runs: " + getRuns() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuns() == null) ? 0 : getRuns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkflowRunsResult == false)
            return false;
        GetWorkflowRunsResult other = (GetWorkflowRunsResult) obj;

        if (other.getRuns() == null ^ this.getRuns() == null)
            return false;
        if (other.getRuns() != null && other.getRuns().equals(this.getRuns()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

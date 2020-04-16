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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

public class ListExperimentsResult implements Serializable {
    /**
     * <p>
     * A list of the summaries of your experiments.
     * </p>
     */
    private java.util.List<ExperimentSummary> experimentSummaries;

    /**
     * <p>
     * A token for getting the next set of experiments, if there are any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the summaries of your experiments.
     * </p>
     *
     * @return <p>
     *         A list of the summaries of your experiments.
     *         </p>
     */
    public java.util.List<ExperimentSummary> getExperimentSummaries() {
        return experimentSummaries;
    }

    /**
     * <p>
     * A list of the summaries of your experiments.
     * </p>
     *
     * @param experimentSummaries <p>
     *            A list of the summaries of your experiments.
     *            </p>
     */
    public void setExperimentSummaries(java.util.Collection<ExperimentSummary> experimentSummaries) {
        if (experimentSummaries == null) {
            this.experimentSummaries = null;
            return;
        }

        this.experimentSummaries = new java.util.ArrayList<ExperimentSummary>(experimentSummaries);
    }

    /**
     * <p>
     * A list of the summaries of your experiments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param experimentSummaries <p>
     *            A list of the summaries of your experiments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListExperimentsResult withExperimentSummaries(ExperimentSummary... experimentSummaries) {
        if (getExperimentSummaries() == null) {
            this.experimentSummaries = new java.util.ArrayList<ExperimentSummary>(
                    experimentSummaries.length);
        }
        for (ExperimentSummary value : experimentSummaries) {
            this.experimentSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the summaries of your experiments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param experimentSummaries <p>
     *            A list of the summaries of your experiments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListExperimentsResult withExperimentSummaries(
            java.util.Collection<ExperimentSummary> experimentSummaries) {
        setExperimentSummaries(experimentSummaries);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of experiments, if there are any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         A token for getting the next set of experiments, if there are
     *         any.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of experiments, if there are any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            A token for getting the next set of experiments, if there are
     *            any.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of experiments, if there are any.
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
     *            A token for getting the next set of experiments, if there are
     *            any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListExperimentsResult withNextToken(String nextToken) {
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
        if (getExperimentSummaries() != null)
            sb.append("ExperimentSummaries: " + getExperimentSummaries() + ",");
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
                + ((getExperimentSummaries() == null) ? 0 : getExperimentSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListExperimentsResult == false)
            return false;
        ListExperimentsResult other = (ListExperimentsResult) obj;

        if (other.getExperimentSummaries() == null ^ this.getExperimentSummaries() == null)
            return false;
        if (other.getExperimentSummaries() != null
                && other.getExperimentSummaries().equals(this.getExperimentSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

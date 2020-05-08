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

public class ListTrialComponentsResult implements Serializable {
    /**
     * <p>
     * A list of the summaries of your trial components.
     * </p>
     */
    private java.util.List<TrialComponentSummary> trialComponentSummaries;

    /**
     * <p>
     * A token for getting the next set of components, if there are any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the summaries of your trial components.
     * </p>
     *
     * @return <p>
     *         A list of the summaries of your trial components.
     *         </p>
     */
    public java.util.List<TrialComponentSummary> getTrialComponentSummaries() {
        return trialComponentSummaries;
    }

    /**
     * <p>
     * A list of the summaries of your trial components.
     * </p>
     *
     * @param trialComponentSummaries <p>
     *            A list of the summaries of your trial components.
     *            </p>
     */
    public void setTrialComponentSummaries(
            java.util.Collection<TrialComponentSummary> trialComponentSummaries) {
        if (trialComponentSummaries == null) {
            this.trialComponentSummaries = null;
            return;
        }

        this.trialComponentSummaries = new java.util.ArrayList<TrialComponentSummary>(
                trialComponentSummaries);
    }

    /**
     * <p>
     * A list of the summaries of your trial components.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trialComponentSummaries <p>
     *            A list of the summaries of your trial components.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrialComponentsResult withTrialComponentSummaries(
            TrialComponentSummary... trialComponentSummaries) {
        if (getTrialComponentSummaries() == null) {
            this.trialComponentSummaries = new java.util.ArrayList<TrialComponentSummary>(
                    trialComponentSummaries.length);
        }
        for (TrialComponentSummary value : trialComponentSummaries) {
            this.trialComponentSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the summaries of your trial components.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trialComponentSummaries <p>
     *            A list of the summaries of your trial components.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrialComponentsResult withTrialComponentSummaries(
            java.util.Collection<TrialComponentSummary> trialComponentSummaries) {
        setTrialComponentSummaries(trialComponentSummaries);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of components, if there are any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         A token for getting the next set of components, if there are any.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of components, if there are any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            A token for getting the next set of components, if there are
     *            any.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of components, if there are any.
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
     *            A token for getting the next set of components, if there are
     *            any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrialComponentsResult withNextToken(String nextToken) {
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
        if (getTrialComponentSummaries() != null)
            sb.append("TrialComponentSummaries: " + getTrialComponentSummaries() + ",");
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
                + ((getTrialComponentSummaries() == null) ? 0 : getTrialComponentSummaries()
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

        if (obj instanceof ListTrialComponentsResult == false)
            return false;
        ListTrialComponentsResult other = (ListTrialComponentsResult) obj;

        if (other.getTrialComponentSummaries() == null ^ this.getTrialComponentSummaries() == null)
            return false;
        if (other.getTrialComponentSummaries() != null
                && other.getTrialComponentSummaries().equals(this.getTrialComponentSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

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

public class ListTrialsResult implements Serializable {
    /**
     * <p>
     * A list of the summaries of your trials.
     * </p>
     */
    private java.util.List<TrialSummary> trialSummaries;

    /**
     * <p>
     * A token for getting the next set of trials, if there are any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the summaries of your trials.
     * </p>
     *
     * @return <p>
     *         A list of the summaries of your trials.
     *         </p>
     */
    public java.util.List<TrialSummary> getTrialSummaries() {
        return trialSummaries;
    }

    /**
     * <p>
     * A list of the summaries of your trials.
     * </p>
     *
     * @param trialSummaries <p>
     *            A list of the summaries of your trials.
     *            </p>
     */
    public void setTrialSummaries(java.util.Collection<TrialSummary> trialSummaries) {
        if (trialSummaries == null) {
            this.trialSummaries = null;
            return;
        }

        this.trialSummaries = new java.util.ArrayList<TrialSummary>(trialSummaries);
    }

    /**
     * <p>
     * A list of the summaries of your trials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trialSummaries <p>
     *            A list of the summaries of your trials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrialsResult withTrialSummaries(TrialSummary... trialSummaries) {
        if (getTrialSummaries() == null) {
            this.trialSummaries = new java.util.ArrayList<TrialSummary>(trialSummaries.length);
        }
        for (TrialSummary value : trialSummaries) {
            this.trialSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the summaries of your trials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trialSummaries <p>
     *            A list of the summaries of your trials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrialsResult withTrialSummaries(java.util.Collection<TrialSummary> trialSummaries) {
        setTrialSummaries(trialSummaries);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of trials, if there are any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         A token for getting the next set of trials, if there are any.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of trials, if there are any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            A token for getting the next set of trials, if there are any.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of trials, if there are any.
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
     *            A token for getting the next set of trials, if there are any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrialsResult withNextToken(String nextToken) {
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
        if (getTrialSummaries() != null)
            sb.append("TrialSummaries: " + getTrialSummaries() + ",");
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
                + ((getTrialSummaries() == null) ? 0 : getTrialSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrialsResult == false)
            return false;
        ListTrialsResult other = (ListTrialsResult) obj;

        if (other.getTrialSummaries() == null ^ this.getTrialSummaries() == null)
            return false;
        if (other.getTrialSummaries() != null
                && other.getTrialSummaries().equals(this.getTrialSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

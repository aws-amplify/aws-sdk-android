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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

public class ListInputsResult implements Serializable {
    /**
     * <p>
     * Summary information about the inputs.
     * </p>
     */
    private java.util.List<InputSummary> inputSummaries;

    /**
     * <p>
     * A token to retrieve the next set of results, or <code>null</code> if
     * there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about the inputs.
     * </p>
     *
     * @return <p>
     *         Summary information about the inputs.
     *         </p>
     */
    public java.util.List<InputSummary> getInputSummaries() {
        return inputSummaries;
    }

    /**
     * <p>
     * Summary information about the inputs.
     * </p>
     *
     * @param inputSummaries <p>
     *            Summary information about the inputs.
     *            </p>
     */
    public void setInputSummaries(java.util.Collection<InputSummary> inputSummaries) {
        if (inputSummaries == null) {
            this.inputSummaries = null;
            return;
        }

        this.inputSummaries = new java.util.ArrayList<InputSummary>(inputSummaries);
    }

    /**
     * <p>
     * Summary information about the inputs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputSummaries <p>
     *            Summary information about the inputs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInputsResult withInputSummaries(InputSummary... inputSummaries) {
        if (getInputSummaries() == null) {
            this.inputSummaries = new java.util.ArrayList<InputSummary>(inputSummaries.length);
        }
        for (InputSummary value : inputSummaries) {
            this.inputSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the inputs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputSummaries <p>
     *            Summary information about the inputs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInputsResult withInputSummaries(java.util.Collection<InputSummary> inputSummaries) {
        setInputSummaries(inputSummaries);
        return this;
    }

    /**
     * <p>
     * A token to retrieve the next set of results, or <code>null</code> if
     * there are no additional results.
     * </p>
     *
     * @return <p>
     *         A token to retrieve the next set of results, or <code>null</code>
     *         if there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results, or <code>null</code> if
     * there are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            A token to retrieve the next set of results, or
     *            <code>null</code> if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results, or <code>null</code> if
     * there are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token to retrieve the next set of results, or
     *            <code>null</code> if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInputsResult withNextToken(String nextToken) {
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
        if (getInputSummaries() != null)
            sb.append("inputSummaries: " + getInputSummaries() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInputSummaries() == null) ? 0 : getInputSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInputsResult == false)
            return false;
        ListInputsResult other = (ListInputsResult) obj;

        if (other.getInputSummaries() == null ^ this.getInputSummaries() == null)
            return false;
        if (other.getInputSummaries() != null
                && other.getInputSummaries().equals(this.getInputSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

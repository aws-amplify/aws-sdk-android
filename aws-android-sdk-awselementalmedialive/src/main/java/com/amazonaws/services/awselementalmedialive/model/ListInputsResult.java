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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for ListInputsResponse
 */
public class ListInputsResult implements Serializable {
    /**
     * Placeholder documentation for __listOfInput
     */
    private java.util.List<Input> inputs;

    /**
     * Placeholder documentation for __string
     */
    private String nextToken;

    /**
     * Placeholder documentation for __listOfInput
     *
     * @return Placeholder documentation for __listOfInput
     */
    public java.util.List<Input> getInputs() {
        return inputs;
    }

    /**
     * Placeholder documentation for __listOfInput
     *
     * @param inputs Placeholder documentation for __listOfInput
     */
    public void setInputs(java.util.Collection<Input> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<Input>(inputs);
    }

    /**
     * Placeholder documentation for __listOfInput
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputs Placeholder documentation for __listOfInput
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInputsResult withInputs(Input... inputs) {
        if (getInputs() == null) {
            this.inputs = new java.util.ArrayList<Input>(inputs.length);
        }
        for (Input value : inputs) {
            this.inputs.add(value);
        }
        return this;
    }

    /**
     * Placeholder documentation for __listOfInput
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputs Placeholder documentation for __listOfInput
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInputsResult withInputs(java.util.Collection<Input> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * Placeholder documentation for __string
     *
     * @return Placeholder documentation for __string
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Placeholder documentation for __string
     *
     * @param nextToken Placeholder documentation for __string
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Placeholder documentation for __string
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken Placeholder documentation for __string
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
        if (getInputs() != null)
            sb.append("Inputs: " + getInputs() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
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

        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

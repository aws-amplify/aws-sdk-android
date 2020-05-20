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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for ListMultiplexProgramsResponse
 */
public class ListMultiplexProgramsResult implements Serializable {
    /**
     * List of multiplex programs.
     */
    private java.util.List<MultiplexProgramSummary> multiplexPrograms;

    /**
     * Token for the next ListMultiplexProgram request.
     */
    private String nextToken;

    /**
     * List of multiplex programs.
     *
     * @return List of multiplex programs.
     */
    public java.util.List<MultiplexProgramSummary> getMultiplexPrograms() {
        return multiplexPrograms;
    }

    /**
     * List of multiplex programs.
     *
     * @param multiplexPrograms List of multiplex programs.
     */
    public void setMultiplexPrograms(java.util.Collection<MultiplexProgramSummary> multiplexPrograms) {
        if (multiplexPrograms == null) {
            this.multiplexPrograms = null;
            return;
        }

        this.multiplexPrograms = new java.util.ArrayList<MultiplexProgramSummary>(multiplexPrograms);
    }

    /**
     * List of multiplex programs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiplexPrograms List of multiplex programs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultiplexProgramsResult withMultiplexPrograms(
            MultiplexProgramSummary... multiplexPrograms) {
        if (getMultiplexPrograms() == null) {
            this.multiplexPrograms = new java.util.ArrayList<MultiplexProgramSummary>(
                    multiplexPrograms.length);
        }
        for (MultiplexProgramSummary value : multiplexPrograms) {
            this.multiplexPrograms.add(value);
        }
        return this;
    }

    /**
     * List of multiplex programs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiplexPrograms List of multiplex programs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultiplexProgramsResult withMultiplexPrograms(
            java.util.Collection<MultiplexProgramSummary> multiplexPrograms) {
        setMultiplexPrograms(multiplexPrograms);
        return this;
    }

    /**
     * Token for the next ListMultiplexProgram request.
     *
     * @return Token for the next ListMultiplexProgram request.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Token for the next ListMultiplexProgram request.
     *
     * @param nextToken Token for the next ListMultiplexProgram request.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Token for the next ListMultiplexProgram request.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken Token for the next ListMultiplexProgram request.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultiplexProgramsResult withNextToken(String nextToken) {
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
        if (getMultiplexPrograms() != null)
            sb.append("MultiplexPrograms: " + getMultiplexPrograms() + ",");
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
                + ((getMultiplexPrograms() == null) ? 0 : getMultiplexPrograms().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMultiplexProgramsResult == false)
            return false;
        ListMultiplexProgramsResult other = (ListMultiplexProgramsResult) obj;

        if (other.getMultiplexPrograms() == null ^ this.getMultiplexPrograms() == null)
            return false;
        if (other.getMultiplexPrograms() != null
                && other.getMultiplexPrograms().equals(this.getMultiplexPrograms()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

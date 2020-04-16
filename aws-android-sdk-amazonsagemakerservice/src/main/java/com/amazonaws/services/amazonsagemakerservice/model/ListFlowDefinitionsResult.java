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

public class ListFlowDefinitionsResult implements Serializable {
    /**
     * <p>
     * An array of objects describing the flow definitions.
     * </p>
     */
    private java.util.List<FlowDefinitionSummary> flowDefinitionSummaries;

    /**
     * <p>
     * A token to resume pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects describing the flow definitions.
     * </p>
     *
     * @return <p>
     *         An array of objects describing the flow definitions.
     *         </p>
     */
    public java.util.List<FlowDefinitionSummary> getFlowDefinitionSummaries() {
        return flowDefinitionSummaries;
    }

    /**
     * <p>
     * An array of objects describing the flow definitions.
     * </p>
     *
     * @param flowDefinitionSummaries <p>
     *            An array of objects describing the flow definitions.
     *            </p>
     */
    public void setFlowDefinitionSummaries(
            java.util.Collection<FlowDefinitionSummary> flowDefinitionSummaries) {
        if (flowDefinitionSummaries == null) {
            this.flowDefinitionSummaries = null;
            return;
        }

        this.flowDefinitionSummaries = new java.util.ArrayList<FlowDefinitionSummary>(
                flowDefinitionSummaries);
    }

    /**
     * <p>
     * An array of objects describing the flow definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flowDefinitionSummaries <p>
     *            An array of objects describing the flow definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFlowDefinitionsResult withFlowDefinitionSummaries(
            FlowDefinitionSummary... flowDefinitionSummaries) {
        if (getFlowDefinitionSummaries() == null) {
            this.flowDefinitionSummaries = new java.util.ArrayList<FlowDefinitionSummary>(
                    flowDefinitionSummaries.length);
        }
        for (FlowDefinitionSummary value : flowDefinitionSummaries) {
            this.flowDefinitionSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects describing the flow definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flowDefinitionSummaries <p>
     *            An array of objects describing the flow definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFlowDefinitionsResult withFlowDefinitionSummaries(
            java.util.Collection<FlowDefinitionSummary> flowDefinitionSummaries) {
        setFlowDefinitionSummaries(flowDefinitionSummaries);
        return this;
    }

    /**
     * <p>
     * A token to resume pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         A token to resume pagination.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to resume pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            A token to resume pagination.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to resume pagination.
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
     *            A token to resume pagination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFlowDefinitionsResult withNextToken(String nextToken) {
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
        if (getFlowDefinitionSummaries() != null)
            sb.append("FlowDefinitionSummaries: " + getFlowDefinitionSummaries() + ",");
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
                + ((getFlowDefinitionSummaries() == null) ? 0 : getFlowDefinitionSummaries()
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

        if (obj instanceof ListFlowDefinitionsResult == false)
            return false;
        ListFlowDefinitionsResult other = (ListFlowDefinitionsResult) obj;

        if (other.getFlowDefinitionSummaries() == null ^ this.getFlowDefinitionSummaries() == null)
            return false;
        if (other.getFlowDefinitionSummaries() != null
                && other.getFlowDefinitionSummaries().equals(this.getFlowDefinitionSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

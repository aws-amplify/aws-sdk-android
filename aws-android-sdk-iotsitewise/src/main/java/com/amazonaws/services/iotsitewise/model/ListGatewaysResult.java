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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

public class ListGatewaysResult implements Serializable {
    /**
     * <p>
     * A list that summarizes each gateway.
     * </p>
     */
    private java.util.List<GatewaySummary> gatewaySummaries;

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list that summarizes each gateway.
     * </p>
     *
     * @return <p>
     *         A list that summarizes each gateway.
     *         </p>
     */
    public java.util.List<GatewaySummary> getGatewaySummaries() {
        return gatewaySummaries;
    }

    /**
     * <p>
     * A list that summarizes each gateway.
     * </p>
     *
     * @param gatewaySummaries <p>
     *            A list that summarizes each gateway.
     *            </p>
     */
    public void setGatewaySummaries(java.util.Collection<GatewaySummary> gatewaySummaries) {
        if (gatewaySummaries == null) {
            this.gatewaySummaries = null;
            return;
        }

        this.gatewaySummaries = new java.util.ArrayList<GatewaySummary>(gatewaySummaries);
    }

    /**
     * <p>
     * A list that summarizes each gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gatewaySummaries <p>
     *            A list that summarizes each gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGatewaysResult withGatewaySummaries(GatewaySummary... gatewaySummaries) {
        if (getGatewaySummaries() == null) {
            this.gatewaySummaries = new java.util.ArrayList<GatewaySummary>(gatewaySummaries.length);
        }
        for (GatewaySummary value : gatewaySummaries) {
            this.gatewaySummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list that summarizes each gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gatewaySummaries <p>
     *            A list that summarizes each gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGatewaysResult withGatewaySummaries(
            java.util.Collection<GatewaySummary> gatewaySummaries) {
        setGatewaySummaries(gatewaySummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     *
     * @return <p>
     *         The token for the next set of results, or null if there are no
     *         additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results, or null if there are no
     *            additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results, or null if there are no
     *            additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGatewaysResult withNextToken(String nextToken) {
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
        if (getGatewaySummaries() != null)
            sb.append("gatewaySummaries: " + getGatewaySummaries() + ",");
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
                + ((getGatewaySummaries() == null) ? 0 : getGatewaySummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGatewaysResult == false)
            return false;
        ListGatewaysResult other = (ListGatewaysResult) obj;

        if (other.getGatewaySummaries() == null ^ this.getGatewaySummaries() == null)
            return false;
        if (other.getGatewaySummaries() != null
                && other.getGatewaySummaries().equals(this.getGatewaySummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

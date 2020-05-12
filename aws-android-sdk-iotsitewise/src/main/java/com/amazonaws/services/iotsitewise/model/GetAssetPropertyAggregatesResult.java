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

public class GetAssetPropertyAggregatesResult implements Serializable {
    /**
     * <p>
     * The requested aggregated values.
     * </p>
     */
    private java.util.List<AggregatedValue> aggregatedValues;

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
     * The requested aggregated values.
     * </p>
     *
     * @return <p>
     *         The requested aggregated values.
     *         </p>
     */
    public java.util.List<AggregatedValue> getAggregatedValues() {
        return aggregatedValues;
    }

    /**
     * <p>
     * The requested aggregated values.
     * </p>
     *
     * @param aggregatedValues <p>
     *            The requested aggregated values.
     *            </p>
     */
    public void setAggregatedValues(java.util.Collection<AggregatedValue> aggregatedValues) {
        if (aggregatedValues == null) {
            this.aggregatedValues = null;
            return;
        }

        this.aggregatedValues = new java.util.ArrayList<AggregatedValue>(aggregatedValues);
    }

    /**
     * <p>
     * The requested aggregated values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aggregatedValues <p>
     *            The requested aggregated values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetPropertyAggregatesResult withAggregatedValues(
            AggregatedValue... aggregatedValues) {
        if (getAggregatedValues() == null) {
            this.aggregatedValues = new java.util.ArrayList<AggregatedValue>(
                    aggregatedValues.length);
        }
        for (AggregatedValue value : aggregatedValues) {
            this.aggregatedValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The requested aggregated values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aggregatedValues <p>
     *            The requested aggregated values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetPropertyAggregatesResult withAggregatedValues(
            java.util.Collection<AggregatedValue> aggregatedValues) {
        setAggregatedValues(aggregatedValues);
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
    public GetAssetPropertyAggregatesResult withNextToken(String nextToken) {
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
        if (getAggregatedValues() != null)
            sb.append("aggregatedValues: " + getAggregatedValues() + ",");
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
                + ((getAggregatedValues() == null) ? 0 : getAggregatedValues().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssetPropertyAggregatesResult == false)
            return false;
        GetAssetPropertyAggregatesResult other = (GetAssetPropertyAggregatesResult) obj;

        if (other.getAggregatedValues() == null ^ this.getAggregatedValues() == null)
            return false;
        if (other.getAggregatedValues() != null
                && other.getAggregatedValues().equals(this.getAggregatedValues()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

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

package com.amazonaws.services.awsiotsitewise.model;

import java.io.Serializable;

public class GetAssetPropertyValueHistoryResult implements Serializable {
    /**
     * <p>
     * The asset property's value history.
     * </p>
     */
    private java.util.List<AssetPropertyValue> assetPropertyValueHistory;

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
     * The asset property's value history.
     * </p>
     *
     * @return <p>
     *         The asset property's value history.
     *         </p>
     */
    public java.util.List<AssetPropertyValue> getAssetPropertyValueHistory() {
        return assetPropertyValueHistory;
    }

    /**
     * <p>
     * The asset property's value history.
     * </p>
     *
     * @param assetPropertyValueHistory <p>
     *            The asset property's value history.
     *            </p>
     */
    public void setAssetPropertyValueHistory(
            java.util.Collection<AssetPropertyValue> assetPropertyValueHistory) {
        if (assetPropertyValueHistory == null) {
            this.assetPropertyValueHistory = null;
            return;
        }

        this.assetPropertyValueHistory = new java.util.ArrayList<AssetPropertyValue>(
                assetPropertyValueHistory);
    }

    /**
     * <p>
     * The asset property's value history.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetPropertyValueHistory <p>
     *            The asset property's value history.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetPropertyValueHistoryResult withAssetPropertyValueHistory(
            AssetPropertyValue... assetPropertyValueHistory) {
        if (getAssetPropertyValueHistory() == null) {
            this.assetPropertyValueHistory = new java.util.ArrayList<AssetPropertyValue>(
                    assetPropertyValueHistory.length);
        }
        for (AssetPropertyValue value : assetPropertyValueHistory) {
            this.assetPropertyValueHistory.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The asset property's value history.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetPropertyValueHistory <p>
     *            The asset property's value history.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetPropertyValueHistoryResult withAssetPropertyValueHistory(
            java.util.Collection<AssetPropertyValue> assetPropertyValueHistory) {
        setAssetPropertyValueHistory(assetPropertyValueHistory);
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
    public GetAssetPropertyValueHistoryResult withNextToken(String nextToken) {
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
        if (getAssetPropertyValueHistory() != null)
            sb.append("assetPropertyValueHistory: " + getAssetPropertyValueHistory() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAssetPropertyValueHistory() == null) ? 0 : getAssetPropertyValueHistory()
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

        if (obj instanceof GetAssetPropertyValueHistoryResult == false)
            return false;
        GetAssetPropertyValueHistoryResult other = (GetAssetPropertyValueHistoryResult) obj;

        if (other.getAssetPropertyValueHistory() == null
                ^ this.getAssetPropertyValueHistory() == null)
            return false;
        if (other.getAssetPropertyValueHistory() != null
                && other.getAssetPropertyValueHistory().equals(this.getAssetPropertyValueHistory()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

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

public class ListAssociatedAssetsResult implements Serializable {
    /**
     * <p>
     * A list that summarizes the associated assets.
     * </p>
     */
    private java.util.List<AssociatedAssetsSummary> assetSummaries;

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
     * A list that summarizes the associated assets.
     * </p>
     *
     * @return <p>
     *         A list that summarizes the associated assets.
     *         </p>
     */
    public java.util.List<AssociatedAssetsSummary> getAssetSummaries() {
        return assetSummaries;
    }

    /**
     * <p>
     * A list that summarizes the associated assets.
     * </p>
     *
     * @param assetSummaries <p>
     *            A list that summarizes the associated assets.
     *            </p>
     */
    public void setAssetSummaries(java.util.Collection<AssociatedAssetsSummary> assetSummaries) {
        if (assetSummaries == null) {
            this.assetSummaries = null;
            return;
        }

        this.assetSummaries = new java.util.ArrayList<AssociatedAssetsSummary>(assetSummaries);
    }

    /**
     * <p>
     * A list that summarizes the associated assets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetSummaries <p>
     *            A list that summarizes the associated assets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAssociatedAssetsResult withAssetSummaries(AssociatedAssetsSummary... assetSummaries) {
        if (getAssetSummaries() == null) {
            this.assetSummaries = new java.util.ArrayList<AssociatedAssetsSummary>(
                    assetSummaries.length);
        }
        for (AssociatedAssetsSummary value : assetSummaries) {
            this.assetSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list that summarizes the associated assets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetSummaries <p>
     *            A list that summarizes the associated assets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAssociatedAssetsResult withAssetSummaries(
            java.util.Collection<AssociatedAssetsSummary> assetSummaries) {
        setAssetSummaries(assetSummaries);
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
    public ListAssociatedAssetsResult withNextToken(String nextToken) {
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
        if (getAssetSummaries() != null)
            sb.append("assetSummaries: " + getAssetSummaries() + ",");
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
                + ((getAssetSummaries() == null) ? 0 : getAssetSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssociatedAssetsResult == false)
            return false;
        ListAssociatedAssetsResult other = (ListAssociatedAssetsResult) obj;

        if (other.getAssetSummaries() == null ^ this.getAssetSummaries() == null)
            return false;
        if (other.getAssetSummaries() != null
                && other.getAssetSummaries().equals(this.getAssetSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

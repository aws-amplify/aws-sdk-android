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

public class ListProjectAssetsResult implements Serializable {
    /**
     * <p>
     * A list that contains the IDs of each asset associated with the project.
     * </p>
     */
    private java.util.List<String> assetIds;

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
     * A list that contains the IDs of each asset associated with the project.
     * </p>
     *
     * @return <p>
     *         A list that contains the IDs of each asset associated with the
     *         project.
     *         </p>
     */
    public java.util.List<String> getAssetIds() {
        return assetIds;
    }

    /**
     * <p>
     * A list that contains the IDs of each asset associated with the project.
     * </p>
     *
     * @param assetIds <p>
     *            A list that contains the IDs of each asset associated with the
     *            project.
     *            </p>
     */
    public void setAssetIds(java.util.Collection<String> assetIds) {
        if (assetIds == null) {
            this.assetIds = null;
            return;
        }

        this.assetIds = new java.util.ArrayList<String>(assetIds);
    }

    /**
     * <p>
     * A list that contains the IDs of each asset associated with the project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetIds <p>
     *            A list that contains the IDs of each asset associated with the
     *            project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProjectAssetsResult withAssetIds(String... assetIds) {
        if (getAssetIds() == null) {
            this.assetIds = new java.util.ArrayList<String>(assetIds.length);
        }
        for (String value : assetIds) {
            this.assetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains the IDs of each asset associated with the project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetIds <p>
     *            A list that contains the IDs of each asset associated with the
     *            project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProjectAssetsResult withAssetIds(java.util.Collection<String> assetIds) {
        setAssetIds(assetIds);
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
    public ListProjectAssetsResult withNextToken(String nextToken) {
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
        if (getAssetIds() != null)
            sb.append("assetIds: " + getAssetIds() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetIds() == null) ? 0 : getAssetIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProjectAssetsResult == false)
            return false;
        ListProjectAssetsResult other = (ListProjectAssetsResult) obj;

        if (other.getAssetIds() == null ^ this.getAssetIds() == null)
            return false;
        if (other.getAssetIds() != null && other.getAssetIds().equals(this.getAssetIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

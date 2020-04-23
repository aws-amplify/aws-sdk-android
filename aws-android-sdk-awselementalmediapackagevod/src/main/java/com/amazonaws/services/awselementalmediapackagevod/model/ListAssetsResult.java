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

package com.amazonaws.services.awselementalmediapackagevod.model;

import java.io.Serializable;

public class ListAssetsResult implements Serializable {
    /**
     * A list of MediaPackage VOD Asset resources.
     */
    private java.util.List<AssetShallow> assets;

    /**
     * A token that can be used to resume pagination from the end of the
     * collection.
     */
    private String nextToken;

    /**
     * A list of MediaPackage VOD Asset resources.
     *
     * @return A list of MediaPackage VOD Asset resources.
     */
    public java.util.List<AssetShallow> getAssets() {
        return assets;
    }

    /**
     * A list of MediaPackage VOD Asset resources.
     *
     * @param assets A list of MediaPackage VOD Asset resources.
     */
    public void setAssets(java.util.Collection<AssetShallow> assets) {
        if (assets == null) {
            this.assets = null;
            return;
        }

        this.assets = new java.util.ArrayList<AssetShallow>(assets);
    }

    /**
     * A list of MediaPackage VOD Asset resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assets A list of MediaPackage VOD Asset resources.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAssetsResult withAssets(AssetShallow... assets) {
        if (getAssets() == null) {
            this.assets = new java.util.ArrayList<AssetShallow>(assets.length);
        }
        for (AssetShallow value : assets) {
            this.assets.add(value);
        }
        return this;
    }

    /**
     * A list of MediaPackage VOD Asset resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assets A list of MediaPackage VOD Asset resources.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAssetsResult withAssets(java.util.Collection<AssetShallow> assets) {
        setAssets(assets);
        return this;
    }

    /**
     * A token that can be used to resume pagination from the end of the
     * collection.
     *
     * @return A token that can be used to resume pagination from the end of the
     *         collection.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the
     * collection.
     *
     * @param nextToken A token that can be used to resume pagination from the
     *            end of the collection.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the
     * collection.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken A token that can be used to resume pagination from the
     *            end of the collection.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAssetsResult withNextToken(String nextToken) {
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
        if (getAssets() != null)
            sb.append("Assets: " + getAssets() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssets() == null) ? 0 : getAssets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssetsResult == false)
            return false;
        ListAssetsResult other = (ListAssetsResult) obj;

        if (other.getAssets() == null ^ this.getAssets() == null)
            return false;
        if (other.getAssets() != null && other.getAssets().equals(this.getAssets()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

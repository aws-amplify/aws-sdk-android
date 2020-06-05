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
package com.amazonaws.services.personalize-runtime.model;

import java.io.Serializable;


public class GetRecommendationsResult implements Serializable {
    /**
     * <p>A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500 items in the list.</p>
     */
    private java.util.List<PredictedItem> itemList;

    /**
     * <p>A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500 items in the list.</p>
     *
     * @return <p>A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500 items in the list.</p>
     */
    public java.util.List<PredictedItem> getItemList() {
        return itemList;
    }

    /**
     * <p>A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500 items in the list.</p>
     *
     * @param itemList <p>A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500 items in the list.</p>
     */
    public void setItemList(java.util.Collection<PredictedItem> itemList) {
        if (itemList == null) {
            this.itemList = null;
            return;
        }

        this.itemList = new java.util.ArrayList<PredictedItem>(itemList);
    }

    /**
     * <p>A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500 items in the list.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param itemList <p>A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500 items in the list.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationsResult withItemList(PredictedItem... itemList) {
        if (getItemList() == null) {
            this.itemList = new java.util.ArrayList<PredictedItem>(itemList.length);
        }
        for (PredictedItem value : itemList) {
            this.itemList.add(value);
        }
        return this;
    }

    /**
     * <p>A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500 items in the list.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param itemList <p>A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500 items in the list.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationsResult withItemList(java.util.Collection<PredictedItem> itemList) {
        setItemList(itemList);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getItemList() != null) sb.append("itemList: " + getItemList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemList() == null) ? 0 : getItemList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetRecommendationsResult == false) return false;
        GetRecommendationsResult other = (GetRecommendationsResult)obj;

        if (other.getItemList() == null ^ this.getItemList() == null) return false;
        if (other.getItemList() != null && other.getItemList().equals(this.getItemList()) == false) return false;
        return true;
    }
}

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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Retrieve a JSON array of up to twenty of your presets. This will return the
 * presets themselves, not just a list of them. To retrieve the next twenty
 * presets, use the nextToken string returned with the array.
 */
public class ListPresetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Optionally, specify a preset category to limit responses to only presets
     * from that category.
     */
    private String category;

    /**
     * Optional. When you request a list of presets, you can choose to list them
     * alphabetically by NAME or chronologically by CREATION_DATE. If you don't
     * specify, the service will list them by name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, CREATION_DATE, SYSTEM
     */
    private String listBy;

    /**
     * Optional. Number of presets, up to twenty, that will be returned at one
     * time
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     */
    private Integer maxResults;

    /**
     * Use this string, provided with the response to a previous request, to
     * request the next batch of presets.
     */
    private String nextToken;

    /**
     * Optional. When you request lists of resources, you can specify whether
     * they are sorted in ASCENDING or DESCENDING order. Default varies by
     * resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     */
    private String order;

    /**
     * Optionally, specify a preset category to limit responses to only presets
     * from that category.
     *
     * @return Optionally, specify a preset category to limit responses to only
     *         presets from that category.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Optionally, specify a preset category to limit responses to only presets
     * from that category.
     *
     * @param category Optionally, specify a preset category to limit responses
     *            to only presets from that category.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Optionally, specify a preset category to limit responses to only presets
     * from that category.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param category Optionally, specify a preset category to limit responses
     *            to only presets from that category.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPresetsRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Optional. When you request a list of presets, you can choose to list them
     * alphabetically by NAME or chronologically by CREATION_DATE. If you don't
     * specify, the service will list them by name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, CREATION_DATE, SYSTEM
     *
     * @return Optional. When you request a list of presets, you can choose to
     *         list them alphabetically by NAME or chronologically by
     *         CREATION_DATE. If you don't specify, the service will list them
     *         by name.
     * @see PresetListBy
     */
    public String getListBy() {
        return listBy;
    }

    /**
     * Optional. When you request a list of presets, you can choose to list them
     * alphabetically by NAME or chronologically by CREATION_DATE. If you don't
     * specify, the service will list them by name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, CREATION_DATE, SYSTEM
     *
     * @param listBy Optional. When you request a list of presets, you can
     *            choose to list them alphabetically by NAME or chronologically
     *            by CREATION_DATE. If you don't specify, the service will list
     *            them by name.
     * @see PresetListBy
     */
    public void setListBy(String listBy) {
        this.listBy = listBy;
    }

    /**
     * Optional. When you request a list of presets, you can choose to list them
     * alphabetically by NAME or chronologically by CREATION_DATE. If you don't
     * specify, the service will list them by name.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, CREATION_DATE, SYSTEM
     *
     * @param listBy Optional. When you request a list of presets, you can
     *            choose to list them alphabetically by NAME or chronologically
     *            by CREATION_DATE. If you don't specify, the service will list
     *            them by name.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PresetListBy
     */
    public ListPresetsRequest withListBy(String listBy) {
        this.listBy = listBy;
        return this;
    }

    /**
     * Optional. When you request a list of presets, you can choose to list them
     * alphabetically by NAME or chronologically by CREATION_DATE. If you don't
     * specify, the service will list them by name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, CREATION_DATE, SYSTEM
     *
     * @param listBy Optional. When you request a list of presets, you can
     *            choose to list them alphabetically by NAME or chronologically
     *            by CREATION_DATE. If you don't specify, the service will list
     *            them by name.
     * @see PresetListBy
     */
    public void setListBy(PresetListBy listBy) {
        this.listBy = listBy.toString();
    }

    /**
     * Optional. When you request a list of presets, you can choose to list them
     * alphabetically by NAME or chronologically by CREATION_DATE. If you don't
     * specify, the service will list them by name.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, CREATION_DATE, SYSTEM
     *
     * @param listBy Optional. When you request a list of presets, you can
     *            choose to list them alphabetically by NAME or chronologically
     *            by CREATION_DATE. If you don't specify, the service will list
     *            them by name.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PresetListBy
     */
    public ListPresetsRequest withListBy(PresetListBy listBy) {
        this.listBy = listBy.toString();
        return this;
    }

    /**
     * Optional. Number of presets, up to twenty, that will be returned at one
     * time
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @return Optional. Number of presets, up to twenty, that will be returned
     *         at one time
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Optional. Number of presets, up to twenty, that will be returned at one
     * time
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param maxResults Optional. Number of presets, up to twenty, that will be
     *            returned at one time
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Optional. Number of presets, up to twenty, that will be returned at one
     * time
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param maxResults Optional. Number of presets, up to twenty, that will be
     *            returned at one time
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPresetsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Use this string, provided with the response to a previous request, to
     * request the next batch of presets.
     *
     * @return Use this string, provided with the response to a previous
     *         request, to request the next batch of presets.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Use this string, provided with the response to a previous request, to
     * request the next batch of presets.
     *
     * @param nextToken Use this string, provided with the response to a
     *            previous request, to request the next batch of presets.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Use this string, provided with the response to a previous request, to
     * request the next batch of presets.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken Use this string, provided with the response to a
     *            previous request, to request the next batch of presets.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPresetsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Optional. When you request lists of resources, you can specify whether
     * they are sorted in ASCENDING or DESCENDING order. Default varies by
     * resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @return Optional. When you request lists of resources, you can specify
     *         whether they are sorted in ASCENDING or DESCENDING order. Default
     *         varies by resource.
     * @see Order
     */
    public String getOrder() {
        return order;
    }

    /**
     * Optional. When you request lists of resources, you can specify whether
     * they are sorted in ASCENDING or DESCENDING order. Default varies by
     * resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param order Optional. When you request lists of resources, you can
     *            specify whether they are sorted in ASCENDING or DESCENDING
     *            order. Default varies by resource.
     * @see Order
     */
    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * Optional. When you request lists of resources, you can specify whether
     * they are sorted in ASCENDING or DESCENDING order. Default varies by
     * resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param order Optional. When you request lists of resources, you can
     *            specify whether they are sorted in ASCENDING or DESCENDING
     *            order. Default varies by resource.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Order
     */
    public ListPresetsRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * Optional. When you request lists of resources, you can specify whether
     * they are sorted in ASCENDING or DESCENDING order. Default varies by
     * resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param order Optional. When you request lists of resources, you can
     *            specify whether they are sorted in ASCENDING or DESCENDING
     *            order. Default varies by resource.
     * @see Order
     */
    public void setOrder(Order order) {
        this.order = order.toString();
    }

    /**
     * Optional. When you request lists of resources, you can specify whether
     * they are sorted in ASCENDING or DESCENDING order. Default varies by
     * resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param order Optional. When you request lists of resources, you can
     *            specify whether they are sorted in ASCENDING or DESCENDING
     *            order. Default varies by resource.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Order
     */
    public ListPresetsRequest withOrder(Order order) {
        this.order = order.toString();
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
        if (getCategory() != null)
            sb.append("Category: " + getCategory() + ",");
        if (getListBy() != null)
            sb.append("ListBy: " + getListBy() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getOrder() != null)
            sb.append("Order: " + getOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getListBy() == null) ? 0 : getListBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPresetsRequest == false)
            return false;
        ListPresetsRequest other = (ListPresetsRequest) obj;

        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getListBy() == null ^ this.getListBy() == null)
            return false;
        if (other.getListBy() != null && other.getListBy().equals(this.getListBy()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        return true;
    }
}

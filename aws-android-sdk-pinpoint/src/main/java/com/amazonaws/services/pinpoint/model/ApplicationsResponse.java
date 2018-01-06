/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Get Applications Result.
 */
public class ApplicationsResponse implements Serializable {
    /**
     * List of applications returned in this page.
     */
    private java.util.List<ApplicationResponse> item;

    /**
     * The string that you use in a subsequent request to get the next page of
     * results in a paginated response.
     */
    private String nextToken;

    /**
     * List of applications returned in this page.
     *
     * @return List of applications returned in this page.
     */
    public java.util.List<ApplicationResponse> getItem() {
        return item;
    }

    /**
     * List of applications returned in this page.
     *
     * @param item List of applications returned in this page.
     */
    public void setItem(java.util.Collection<ApplicationResponse> item) {
        if (item == null) {
            this.item = null;
            return;
        }

        this.item = new java.util.ArrayList<ApplicationResponse>(item);
    }

    /**
     * List of applications returned in this page.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param item List of applications returned in this page.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationsResponse withItem(ApplicationResponse... item) {
        if (getItem() == null) {
            this.item = new java.util.ArrayList<ApplicationResponse>(item.length);
        }
        for (ApplicationResponse value : item) {
            this.item.add(value);
        }
        return this;
    }

    /**
     * List of applications returned in this page.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param item List of applications returned in this page.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationsResponse withItem(java.util.Collection<ApplicationResponse> item) {
        setItem(item);
        return this;
    }

    /**
     * The string that you use in a subsequent request to get the next page of
     * results in a paginated response.
     *
     * @return The string that you use in a subsequent request to get the next
     *         page of results in a paginated response.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * The string that you use in a subsequent request to get the next page of
     * results in a paginated response.
     *
     * @param nextToken The string that you use in a subsequent request to get
     *            the next page of results in a paginated response.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The string that you use in a subsequent request to get the next page of
     * results in a paginated response.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken The string that you use in a subsequent request to get
     *            the next page of results in a paginated response.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationsResponse withNextToken(String nextToken) {
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
        if (getItem() != null)
            sb.append("Item: " + getItem() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationsResponse == false)
            return false;
        ApplicationsResponse other = (ApplicationsResponse) obj;

        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

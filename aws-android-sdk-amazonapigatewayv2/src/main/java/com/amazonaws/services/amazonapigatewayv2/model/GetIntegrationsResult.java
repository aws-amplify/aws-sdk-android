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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

public class GetIntegrationsResult implements Serializable {
    /**
     * <p>
     * The elements from this collection.
     * </p>
     */
    private java.util.List<Integration> items;

    /**
     * <p>
     * The next page of elements from this collection. Not valid for the last
     * element of the collection.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The elements from this collection.
     * </p>
     *
     * @return <p>
     *         The elements from this collection.
     *         </p>
     */
    public java.util.List<Integration> getItems() {
        return items;
    }

    /**
     * <p>
     * The elements from this collection.
     * </p>
     *
     * @param items <p>
     *            The elements from this collection.
     *            </p>
     */
    public void setItems(java.util.Collection<Integration> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<Integration>(items);
    }

    /**
     * <p>
     * The elements from this collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            The elements from this collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntegrationsResult withItems(Integration... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<Integration>(items.length);
        }
        for (Integration value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The elements from this collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            The elements from this collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntegrationsResult withItems(java.util.Collection<Integration> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * The next page of elements from this collection. Not valid for the last
     * element of the collection.
     * </p>
     *
     * @return <p>
     *         The next page of elements from this collection. Not valid for the
     *         last element of the collection.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The next page of elements from this collection. Not valid for the last
     * element of the collection.
     * </p>
     *
     * @param nextToken <p>
     *            The next page of elements from this collection. Not valid for
     *            the last element of the collection.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next page of elements from this collection. Not valid for the last
     * element of the collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The next page of elements from this collection. Not valid for
     *            the last element of the collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntegrationsResult withNextToken(String nextToken) {
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
        if (getItems() != null)
            sb.append("Items: " + getItems() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIntegrationsResult == false)
            return false;
        GetIntegrationsResult other = (GetIntegrationsResult) obj;

        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

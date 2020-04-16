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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class ListResourceDataSyncResult implements Serializable {
    /**
     * <p>
     * A list of your current Resource Data Sync configurations and their
     * statuses.
     * </p>
     */
    private java.util.List<ResourceDataSyncItem> resourceDataSyncItems;

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of your current Resource Data Sync configurations and their
     * statuses.
     * </p>
     *
     * @return <p>
     *         A list of your current Resource Data Sync configurations and
     *         their statuses.
     *         </p>
     */
    public java.util.List<ResourceDataSyncItem> getResourceDataSyncItems() {
        return resourceDataSyncItems;
    }

    /**
     * <p>
     * A list of your current Resource Data Sync configurations and their
     * statuses.
     * </p>
     *
     * @param resourceDataSyncItems <p>
     *            A list of your current Resource Data Sync configurations and
     *            their statuses.
     *            </p>
     */
    public void setResourceDataSyncItems(
            java.util.Collection<ResourceDataSyncItem> resourceDataSyncItems) {
        if (resourceDataSyncItems == null) {
            this.resourceDataSyncItems = null;
            return;
        }

        this.resourceDataSyncItems = new java.util.ArrayList<ResourceDataSyncItem>(
                resourceDataSyncItems);
    }

    /**
     * <p>
     * A list of your current Resource Data Sync configurations and their
     * statuses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceDataSyncItems <p>
     *            A list of your current Resource Data Sync configurations and
     *            their statuses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceDataSyncResult withResourceDataSyncItems(
            ResourceDataSyncItem... resourceDataSyncItems) {
        if (getResourceDataSyncItems() == null) {
            this.resourceDataSyncItems = new java.util.ArrayList<ResourceDataSyncItem>(
                    resourceDataSyncItems.length);
        }
        for (ResourceDataSyncItem value : resourceDataSyncItems) {
            this.resourceDataSyncItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of your current Resource Data Sync configurations and their
     * statuses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceDataSyncItems <p>
     *            A list of your current Resource Data Sync configurations and
     *            their statuses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceDataSyncResult withResourceDataSyncItems(
            java.util.Collection<ResourceDataSyncItem> resourceDataSyncItems) {
        setResourceDataSyncItems(resourceDataSyncItems);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of items to return. Use this token to
     *         get the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. Use this token
     *            to get the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. Use this token
     *            to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceDataSyncResult withNextToken(String nextToken) {
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
        if (getResourceDataSyncItems() != null)
            sb.append("ResourceDataSyncItems: " + getResourceDataSyncItems() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceDataSyncItems() == null) ? 0 : getResourceDataSyncItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourceDataSyncResult == false)
            return false;
        ListResourceDataSyncResult other = (ListResourceDataSyncResult) obj;

        if (other.getResourceDataSyncItems() == null ^ this.getResourceDataSyncItems() == null)
            return false;
        if (other.getResourceDataSyncItems() != null
                && other.getResourceDataSyncItems().equals(this.getResourceDataSyncItems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

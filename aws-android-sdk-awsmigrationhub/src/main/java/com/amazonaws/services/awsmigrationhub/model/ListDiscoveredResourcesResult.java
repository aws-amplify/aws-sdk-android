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

package com.amazonaws.services.awsmigrationhub.model;

import java.io.Serializable;

public class ListDiscoveredResourcesResult implements Serializable {
    /**
     * <p>
     * If there are more discovered resources than the max result, return the
     * next token to be passed to the next call as a bookmark of where to start
     * from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Returned list of discovered resources associated with the given
     * MigrationTask.
     * </p>
     */
    private java.util.List<DiscoveredResource> discoveredResourceList;

    /**
     * <p>
     * If there are more discovered resources than the max result, return the
     * next token to be passed to the next call as a bookmark of where to start
     * from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @return <p>
     *         If there are more discovered resources than the max result,
     *         return the next token to be passed to the next call as a bookmark
     *         of where to start from.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are more discovered resources than the max result, return the
     * next token to be passed to the next call as a bookmark of where to start
     * from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @param nextToken <p>
     *            If there are more discovered resources than the max result,
     *            return the next token to be passed to the next call as a
     *            bookmark of where to start from.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more discovered resources than the max result, return the
     * next token to be passed to the next call as a bookmark of where to start
     * from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @param nextToken <p>
     *            If there are more discovered resources than the max result,
     *            return the next token to be passed to the next call as a
     *            bookmark of where to start from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDiscoveredResourcesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Returned list of discovered resources associated with the given
     * MigrationTask.
     * </p>
     *
     * @return <p>
     *         Returned list of discovered resources associated with the given
     *         MigrationTask.
     *         </p>
     */
    public java.util.List<DiscoveredResource> getDiscoveredResourceList() {
        return discoveredResourceList;
    }

    /**
     * <p>
     * Returned list of discovered resources associated with the given
     * MigrationTask.
     * </p>
     *
     * @param discoveredResourceList <p>
     *            Returned list of discovered resources associated with the
     *            given MigrationTask.
     *            </p>
     */
    public void setDiscoveredResourceList(
            java.util.Collection<DiscoveredResource> discoveredResourceList) {
        if (discoveredResourceList == null) {
            this.discoveredResourceList = null;
            return;
        }

        this.discoveredResourceList = new java.util.ArrayList<DiscoveredResource>(
                discoveredResourceList);
    }

    /**
     * <p>
     * Returned list of discovered resources associated with the given
     * MigrationTask.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param discoveredResourceList <p>
     *            Returned list of discovered resources associated with the
     *            given MigrationTask.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDiscoveredResourcesResult withDiscoveredResourceList(
            DiscoveredResource... discoveredResourceList) {
        if (getDiscoveredResourceList() == null) {
            this.discoveredResourceList = new java.util.ArrayList<DiscoveredResource>(
                    discoveredResourceList.length);
        }
        for (DiscoveredResource value : discoveredResourceList) {
            this.discoveredResourceList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Returned list of discovered resources associated with the given
     * MigrationTask.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param discoveredResourceList <p>
     *            Returned list of discovered resources associated with the
     *            given MigrationTask.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDiscoveredResourcesResult withDiscoveredResourceList(
            java.util.Collection<DiscoveredResource> discoveredResourceList) {
        setDiscoveredResourceList(discoveredResourceList);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getDiscoveredResourceList() != null)
            sb.append("DiscoveredResourceList: " + getDiscoveredResourceList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getDiscoveredResourceList() == null) ? 0 : getDiscoveredResourceList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDiscoveredResourcesResult == false)
            return false;
        ListDiscoveredResourcesResult other = (ListDiscoveredResourcesResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDiscoveredResourceList() == null ^ this.getDiscoveredResourceList() == null)
            return false;
        if (other.getDiscoveredResourceList() != null
                && other.getDiscoveredResourceList().equals(this.getDiscoveredResourceList()) == false)
            return false;
        return true;
    }
}

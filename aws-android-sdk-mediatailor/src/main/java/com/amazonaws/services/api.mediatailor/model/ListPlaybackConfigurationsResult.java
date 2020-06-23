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

package com.amazonaws.services.api.mediatailor.model;

import java.io.Serializable;

public class ListPlaybackConfigurationsResult implements Serializable {
    /**
     * <p>
     * Array of playback configurations. This might be all the available
     * configurations or a subset, depending on the settings that you provide
     * and the total number of configurations stored.
     * </p>
     */
    private java.util.List<PlaybackConfiguration> items;

    /**
     * <p>
     * Pagination token returned by the GET list request when results exceed the
     * maximum allowed. Use the token to fetch the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Array of playback configurations. This might be all the available
     * configurations or a subset, depending on the settings that you provide
     * and the total number of configurations stored.
     * </p>
     *
     * @return <p>
     *         Array of playback configurations. This might be all the available
     *         configurations or a subset, depending on the settings that you
     *         provide and the total number of configurations stored.
     *         </p>
     */
    public java.util.List<PlaybackConfiguration> getItems() {
        return items;
    }

    /**
     * <p>
     * Array of playback configurations. This might be all the available
     * configurations or a subset, depending on the settings that you provide
     * and the total number of configurations stored.
     * </p>
     *
     * @param items <p>
     *            Array of playback configurations. This might be all the
     *            available configurations or a subset, depending on the
     *            settings that you provide and the total number of
     *            configurations stored.
     *            </p>
     */
    public void setItems(java.util.Collection<PlaybackConfiguration> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<PlaybackConfiguration>(items);
    }

    /**
     * <p>
     * Array of playback configurations. This might be all the available
     * configurations or a subset, depending on the settings that you provide
     * and the total number of configurations stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            Array of playback configurations. This might be all the
     *            available configurations or a subset, depending on the
     *            settings that you provide and the total number of
     *            configurations stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlaybackConfigurationsResult withItems(PlaybackConfiguration... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<PlaybackConfiguration>(items.length);
        }
        for (PlaybackConfiguration value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Array of playback configurations. This might be all the available
     * configurations or a subset, depending on the settings that you provide
     * and the total number of configurations stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            Array of playback configurations. This might be all the
     *            available configurations or a subset, depending on the
     *            settings that you provide and the total number of
     *            configurations stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlaybackConfigurationsResult withItems(
            java.util.Collection<PlaybackConfiguration> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * Pagination token returned by the GET list request when results exceed the
     * maximum allowed. Use the token to fetch the next page of results.
     * </p>
     *
     * @return <p>
     *         Pagination token returned by the GET list request when results
     *         exceed the maximum allowed. Use the token to fetch the next page
     *         of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Pagination token returned by the GET list request when results exceed the
     * maximum allowed. Use the token to fetch the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            Pagination token returned by the GET list request when results
     *            exceed the maximum allowed. Use the token to fetch the next
     *            page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token returned by the GET list request when results exceed the
     * maximum allowed. Use the token to fetch the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            Pagination token returned by the GET list request when results
     *            exceed the maximum allowed. Use the token to fetch the next
     *            page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlaybackConfigurationsResult withNextToken(String nextToken) {
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

        if (obj instanceof ListPlaybackConfigurationsResult == false)
            return false;
        ListPlaybackConfigurationsResult other = (ListPlaybackConfigurationsResult) obj;

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

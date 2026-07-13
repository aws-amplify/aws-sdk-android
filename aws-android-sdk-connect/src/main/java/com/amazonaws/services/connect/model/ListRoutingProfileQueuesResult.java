/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class ListRoutingProfileQueuesResult implements Serializable {
    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the routing profiles.
     * </p>
     */
    private java.util.List<RoutingProfileQueueConfigSummary> routingProfileQueueConfigSummaryList;

    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     */
    private String lastModifiedRegion;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoutingProfileQueuesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Information about the routing profiles.
     * </p>
     *
     * @return <p>
     *         Information about the routing profiles.
     *         </p>
     */
    public java.util.List<RoutingProfileQueueConfigSummary> getRoutingProfileQueueConfigSummaryList() {
        return routingProfileQueueConfigSummaryList;
    }

    /**
     * <p>
     * Information about the routing profiles.
     * </p>
     *
     * @param routingProfileQueueConfigSummaryList <p>
     *            Information about the routing profiles.
     *            </p>
     */
    public void setRoutingProfileQueueConfigSummaryList(
            java.util.Collection<RoutingProfileQueueConfigSummary> routingProfileQueueConfigSummaryList) {
        if (routingProfileQueueConfigSummaryList == null) {
            this.routingProfileQueueConfigSummaryList = null;
            return;
        }

        this.routingProfileQueueConfigSummaryList = new java.util.ArrayList<RoutingProfileQueueConfigSummary>(
                routingProfileQueueConfigSummaryList);
    }

    /**
     * <p>
     * Information about the routing profiles.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingProfileQueueConfigSummaryList <p>
     *            Information about the routing profiles.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoutingProfileQueuesResult withRoutingProfileQueueConfigSummaryList(
            RoutingProfileQueueConfigSummary... routingProfileQueueConfigSummaryList) {
        if (getRoutingProfileQueueConfigSummaryList() == null) {
            this.routingProfileQueueConfigSummaryList = new java.util.ArrayList<RoutingProfileQueueConfigSummary>(
                    routingProfileQueueConfigSummaryList.length);
        }
        for (RoutingProfileQueueConfigSummary value : routingProfileQueueConfigSummaryList) {
            this.routingProfileQueueConfigSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the routing profiles.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingProfileQueueConfigSummaryList <p>
     *            Information about the routing profiles.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoutingProfileQueuesResult withRoutingProfileQueueConfigSummaryList(
            java.util.Collection<RoutingProfileQueueConfigSummary> routingProfileQueueConfigSummaryList) {
        setRoutingProfileQueueConfigSummaryList(routingProfileQueueConfigSummaryList);
        return this;
    }

    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     *
     * @return <p>
     *         The timestamp when this resource was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The timestamp when this resource was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The timestamp when this resource was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoutingProfileQueuesResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @return <p>
     *         The Amazon Web Services Region where this resource was last
     *         modified.
     *         </p>
     */
    public String getLastModifiedRegion() {
        return lastModifiedRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @param lastModifiedRegion <p>
     *            The Amazon Web Services Region where this resource was last
     *            modified.
     *            </p>
     */
    public void setLastModifiedRegion(String lastModifiedRegion) {
        this.lastModifiedRegion = lastModifiedRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @param lastModifiedRegion <p>
     *            The Amazon Web Services Region where this resource was last
     *            modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoutingProfileQueuesResult withLastModifiedRegion(String lastModifiedRegion) {
        this.lastModifiedRegion = lastModifiedRegion;
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
        if (getRoutingProfileQueueConfigSummaryList() != null)
            sb.append("RoutingProfileQueueConfigSummaryList: "
                    + getRoutingProfileQueueConfigSummaryList() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getLastModifiedRegion() != null)
            sb.append("LastModifiedRegion: " + getLastModifiedRegion());
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
                + ((getRoutingProfileQueueConfigSummaryList() == null) ? 0
                        : getRoutingProfileQueueConfigSummaryList().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedRegion() == null) ? 0 : getLastModifiedRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRoutingProfileQueuesResult == false)
            return false;
        ListRoutingProfileQueuesResult other = (ListRoutingProfileQueuesResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRoutingProfileQueueConfigSummaryList() == null
                ^ this.getRoutingProfileQueueConfigSummaryList() == null)
            return false;
        if (other.getRoutingProfileQueueConfigSummaryList() != null
                && other.getRoutingProfileQueueConfigSummaryList().equals(
                        this.getRoutingProfileQueueConfigSummaryList()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedRegion() == null ^ this.getLastModifiedRegion() == null)
            return false;
        if (other.getLastModifiedRegion() != null
                && other.getLastModifiedRegion().equals(this.getLastModifiedRegion()) == false)
            return false;
        return true;
    }
}

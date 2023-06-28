/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

public class ListEdgeAgentConfigurationsResult implements Serializable {
    /**
     * <p>
     * A description of a single stream's edge configuration.
     * </p>
     */
    private java.util.List<ListEdgeAgentConfigurationsEdgeConfig> edgeConfigs = new java.util.ArrayList<ListEdgeAgentConfigurationsEdgeConfig>();

    /**
     * <p>
     * If the response is truncated, the call returns this element with a given
     * token. To get the next batch of edge configurations, use this token in
     * your next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A description of a single stream's edge configuration.
     * </p>
     *
     * @return <p>
     *         A description of a single stream's edge configuration.
     *         </p>
     */
    public java.util.List<ListEdgeAgentConfigurationsEdgeConfig> getEdgeConfigs() {
        return edgeConfigs;
    }

    /**
     * <p>
     * A description of a single stream's edge configuration.
     * </p>
     *
     * @param edgeConfigs <p>
     *            A description of a single stream's edge configuration.
     *            </p>
     */
    public void setEdgeConfigs(
            java.util.Collection<ListEdgeAgentConfigurationsEdgeConfig> edgeConfigs) {
        if (edgeConfigs == null) {
            this.edgeConfigs = null;
            return;
        }

        this.edgeConfigs = new java.util.ArrayList<ListEdgeAgentConfigurationsEdgeConfig>(
                edgeConfigs);
    }

    /**
     * <p>
     * A description of a single stream's edge configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param edgeConfigs <p>
     *            A description of a single stream's edge configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEdgeAgentConfigurationsResult withEdgeConfigs(
            ListEdgeAgentConfigurationsEdgeConfig... edgeConfigs) {
        if (getEdgeConfigs() == null) {
            this.edgeConfigs = new java.util.ArrayList<ListEdgeAgentConfigurationsEdgeConfig>(
                    edgeConfigs.length);
        }
        for (ListEdgeAgentConfigurationsEdgeConfig value : edgeConfigs) {
            this.edgeConfigs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A description of a single stream's edge configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param edgeConfigs <p>
     *            A description of a single stream's edge configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEdgeAgentConfigurationsResult withEdgeConfigs(
            java.util.Collection<ListEdgeAgentConfigurationsEdgeConfig> edgeConfigs) {
        setEdgeConfigs(edgeConfigs);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, the call returns this element with a given
     * token. To get the next batch of edge configurations, use this token in
     * your next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     *
     * @return <p>
     *         If the response is truncated, the call returns this element with
     *         a given token. To get the next batch of edge configurations, use
     *         this token in your next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the call returns this element with a given
     * token. To get the next batch of edge configurations, use this token in
     * your next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, the call returns this element
     *            with a given token. To get the next batch of edge
     *            configurations, use this token in your next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the call returns this element with a given
     * token. To get the next batch of edge configurations, use this token in
     * your next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, the call returns this element
     *            with a given token. To get the next batch of edge
     *            configurations, use this token in your next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEdgeAgentConfigurationsResult withNextToken(String nextToken) {
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
        if (getEdgeConfigs() != null)
            sb.append("EdgeConfigs: " + getEdgeConfigs() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEdgeConfigs() == null) ? 0 : getEdgeConfigs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEdgeAgentConfigurationsResult == false)
            return false;
        ListEdgeAgentConfigurationsResult other = (ListEdgeAgentConfigurationsResult) obj;

        if (other.getEdgeConfigs() == null ^ this.getEdgeConfigs() == null)
            return false;
        if (other.getEdgeConfigs() != null
                && other.getEdgeConfigs().equals(this.getEdgeConfigs()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

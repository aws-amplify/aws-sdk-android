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

package com.amazonaws.services.es.model;

import java.io.Serializable;

/**
 * <p>
 * The result of a
 * <code><a>DescribeInboundCrossClusterSearchConnections</a></code> request.
 * Contains the list of connections matching the filter criteria.
 * </p>
 */
public class DescribeInboundCrossClusterSearchConnectionsResult implements Serializable {
    /**
     * <p>
     * Consists of list of
     * <code><a>InboundCrossClusterSearchConnection</a></code> matching the
     * specified filter criteria.
     * </p>
     */
    private java.util.List<InboundCrossClusterSearchConnection> crossClusterSearchConnections;

    /**
     * <p>
     * If more results are available and NextToken is present, make the next
     * request to the same API with the received NextToken to paginate the
     * remaining results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Consists of list of
     * <code><a>InboundCrossClusterSearchConnection</a></code> matching the
     * specified filter criteria.
     * </p>
     *
     * @return <p>
     *         Consists of list of
     *         <code><a>InboundCrossClusterSearchConnection</a></code> matching
     *         the specified filter criteria.
     *         </p>
     */
    public java.util.List<InboundCrossClusterSearchConnection> getCrossClusterSearchConnections() {
        return crossClusterSearchConnections;
    }

    /**
     * <p>
     * Consists of list of
     * <code><a>InboundCrossClusterSearchConnection</a></code> matching the
     * specified filter criteria.
     * </p>
     *
     * @param crossClusterSearchConnections <p>
     *            Consists of list of
     *            <code><a>InboundCrossClusterSearchConnection</a></code>
     *            matching the specified filter criteria.
     *            </p>
     */
    public void setCrossClusterSearchConnections(
            java.util.Collection<InboundCrossClusterSearchConnection> crossClusterSearchConnections) {
        if (crossClusterSearchConnections == null) {
            this.crossClusterSearchConnections = null;
            return;
        }

        this.crossClusterSearchConnections = new java.util.ArrayList<InboundCrossClusterSearchConnection>(
                crossClusterSearchConnections);
    }

    /**
     * <p>
     * Consists of list of
     * <code><a>InboundCrossClusterSearchConnection</a></code> matching the
     * specified filter criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crossClusterSearchConnections <p>
     *            Consists of list of
     *            <code><a>InboundCrossClusterSearchConnection</a></code>
     *            matching the specified filter criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInboundCrossClusterSearchConnectionsResult withCrossClusterSearchConnections(
            InboundCrossClusterSearchConnection... crossClusterSearchConnections) {
        if (getCrossClusterSearchConnections() == null) {
            this.crossClusterSearchConnections = new java.util.ArrayList<InboundCrossClusterSearchConnection>(
                    crossClusterSearchConnections.length);
        }
        for (InboundCrossClusterSearchConnection value : crossClusterSearchConnections) {
            this.crossClusterSearchConnections.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Consists of list of
     * <code><a>InboundCrossClusterSearchConnection</a></code> matching the
     * specified filter criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crossClusterSearchConnections <p>
     *            Consists of list of
     *            <code><a>InboundCrossClusterSearchConnection</a></code>
     *            matching the specified filter criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInboundCrossClusterSearchConnectionsResult withCrossClusterSearchConnections(
            java.util.Collection<InboundCrossClusterSearchConnection> crossClusterSearchConnections) {
        setCrossClusterSearchConnections(crossClusterSearchConnections);
        return this;
    }

    /**
     * <p>
     * If more results are available and NextToken is present, make the next
     * request to the same API with the received NextToken to paginate the
     * remaining results.
     * </p>
     *
     * @return <p>
     *         If more results are available and NextToken is present, make the
     *         next request to the same API with the received NextToken to
     *         paginate the remaining results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If more results are available and NextToken is present, make the next
     * request to the same API with the received NextToken to paginate the
     * remaining results.
     * </p>
     *
     * @param nextToken <p>
     *            If more results are available and NextToken is present, make
     *            the next request to the same API with the received NextToken
     *            to paginate the remaining results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If more results are available and NextToken is present, make the next
     * request to the same API with the received NextToken to paginate the
     * remaining results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If more results are available and NextToken is present, make
     *            the next request to the same API with the received NextToken
     *            to paginate the remaining results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInboundCrossClusterSearchConnectionsResult withNextToken(String nextToken) {
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
        if (getCrossClusterSearchConnections() != null)
            sb.append("CrossClusterSearchConnections: " + getCrossClusterSearchConnections() + ",");
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
                + ((getCrossClusterSearchConnections() == null) ? 0
                        : getCrossClusterSearchConnections().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInboundCrossClusterSearchConnectionsResult == false)
            return false;
        DescribeInboundCrossClusterSearchConnectionsResult other = (DescribeInboundCrossClusterSearchConnectionsResult) obj;

        if (other.getCrossClusterSearchConnections() == null
                ^ this.getCrossClusterSearchConnections() == null)
            return false;
        if (other.getCrossClusterSearchConnections() != null
                && other.getCrossClusterSearchConnections().equals(
                        this.getCrossClusterSearchConnections()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

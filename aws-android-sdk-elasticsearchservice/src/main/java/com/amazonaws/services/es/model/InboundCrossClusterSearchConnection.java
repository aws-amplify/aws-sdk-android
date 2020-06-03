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
 * Specifies details of an inbound connection.
 * </p>
 */
public class InboundCrossClusterSearchConnection implements Serializable {
    /**
     * <p>
     * Specifies the <code><a>DomainInformation</a></code> for the source
     * Elasticsearch domain.
     * </p>
     */
    private DomainInformation sourceDomainInfo;

    /**
     * <p>
     * Specifies the <code><a>DomainInformation</a></code> for the destination
     * Elasticsearch domain.
     * </p>
     */
    private DomainInformation destinationDomainInfo;

    /**
     * <p>
     * Specifies the connection id for the inbound cross-cluster search
     * connection.
     * </p>
     */
    private String crossClusterSearchConnectionId;

    /**
     * <p>
     * Specifies the
     * <code><a>InboundCrossClusterSearchConnectionStatus</a></code> for the
     * outbound connection.
     * </p>
     */
    private InboundCrossClusterSearchConnectionStatus connectionStatus;

    /**
     * <p>
     * Specifies the <code><a>DomainInformation</a></code> for the source
     * Elasticsearch domain.
     * </p>
     *
     * @return <p>
     *         Specifies the <code><a>DomainInformation</a></code> for the
     *         source Elasticsearch domain.
     *         </p>
     */
    public DomainInformation getSourceDomainInfo() {
        return sourceDomainInfo;
    }

    /**
     * <p>
     * Specifies the <code><a>DomainInformation</a></code> for the source
     * Elasticsearch domain.
     * </p>
     *
     * @param sourceDomainInfo <p>
     *            Specifies the <code><a>DomainInformation</a></code> for the
     *            source Elasticsearch domain.
     *            </p>
     */
    public void setSourceDomainInfo(DomainInformation sourceDomainInfo) {
        this.sourceDomainInfo = sourceDomainInfo;
    }

    /**
     * <p>
     * Specifies the <code><a>DomainInformation</a></code> for the source
     * Elasticsearch domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDomainInfo <p>
     *            Specifies the <code><a>DomainInformation</a></code> for the
     *            source Elasticsearch domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InboundCrossClusterSearchConnection withSourceDomainInfo(
            DomainInformation sourceDomainInfo) {
        this.sourceDomainInfo = sourceDomainInfo;
        return this;
    }

    /**
     * <p>
     * Specifies the <code><a>DomainInformation</a></code> for the destination
     * Elasticsearch domain.
     * </p>
     *
     * @return <p>
     *         Specifies the <code><a>DomainInformation</a></code> for the
     *         destination Elasticsearch domain.
     *         </p>
     */
    public DomainInformation getDestinationDomainInfo() {
        return destinationDomainInfo;
    }

    /**
     * <p>
     * Specifies the <code><a>DomainInformation</a></code> for the destination
     * Elasticsearch domain.
     * </p>
     *
     * @param destinationDomainInfo <p>
     *            Specifies the <code><a>DomainInformation</a></code> for the
     *            destination Elasticsearch domain.
     *            </p>
     */
    public void setDestinationDomainInfo(DomainInformation destinationDomainInfo) {
        this.destinationDomainInfo = destinationDomainInfo;
    }

    /**
     * <p>
     * Specifies the <code><a>DomainInformation</a></code> for the destination
     * Elasticsearch domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationDomainInfo <p>
     *            Specifies the <code><a>DomainInformation</a></code> for the
     *            destination Elasticsearch domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InboundCrossClusterSearchConnection withDestinationDomainInfo(
            DomainInformation destinationDomainInfo) {
        this.destinationDomainInfo = destinationDomainInfo;
        return this;
    }

    /**
     * <p>
     * Specifies the connection id for the inbound cross-cluster search
     * connection.
     * </p>
     *
     * @return <p>
     *         Specifies the connection id for the inbound cross-cluster search
     *         connection.
     *         </p>
     */
    public String getCrossClusterSearchConnectionId() {
        return crossClusterSearchConnectionId;
    }

    /**
     * <p>
     * Specifies the connection id for the inbound cross-cluster search
     * connection.
     * </p>
     *
     * @param crossClusterSearchConnectionId <p>
     *            Specifies the connection id for the inbound cross-cluster
     *            search connection.
     *            </p>
     */
    public void setCrossClusterSearchConnectionId(String crossClusterSearchConnectionId) {
        this.crossClusterSearchConnectionId = crossClusterSearchConnectionId;
    }

    /**
     * <p>
     * Specifies the connection id for the inbound cross-cluster search
     * connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crossClusterSearchConnectionId <p>
     *            Specifies the connection id for the inbound cross-cluster
     *            search connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InboundCrossClusterSearchConnection withCrossClusterSearchConnectionId(
            String crossClusterSearchConnectionId) {
        this.crossClusterSearchConnectionId = crossClusterSearchConnectionId;
        return this;
    }

    /**
     * <p>
     * Specifies the
     * <code><a>InboundCrossClusterSearchConnectionStatus</a></code> for the
     * outbound connection.
     * </p>
     *
     * @return <p>
     *         Specifies the
     *         <code><a>InboundCrossClusterSearchConnectionStatus</a></code> for
     *         the outbound connection.
     *         </p>
     */
    public InboundCrossClusterSearchConnectionStatus getConnectionStatus() {
        return connectionStatus;
    }

    /**
     * <p>
     * Specifies the
     * <code><a>InboundCrossClusterSearchConnectionStatus</a></code> for the
     * outbound connection.
     * </p>
     *
     * @param connectionStatus <p>
     *            Specifies the
     *            <code><a>InboundCrossClusterSearchConnectionStatus</a></code>
     *            for the outbound connection.
     *            </p>
     */
    public void setConnectionStatus(InboundCrossClusterSearchConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * <p>
     * Specifies the
     * <code><a>InboundCrossClusterSearchConnectionStatus</a></code> for the
     * outbound connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionStatus <p>
     *            Specifies the
     *            <code><a>InboundCrossClusterSearchConnectionStatus</a></code>
     *            for the outbound connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InboundCrossClusterSearchConnection withConnectionStatus(
            InboundCrossClusterSearchConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus;
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
        if (getSourceDomainInfo() != null)
            sb.append("SourceDomainInfo: " + getSourceDomainInfo() + ",");
        if (getDestinationDomainInfo() != null)
            sb.append("DestinationDomainInfo: " + getDestinationDomainInfo() + ",");
        if (getCrossClusterSearchConnectionId() != null)
            sb.append("CrossClusterSearchConnectionId: " + getCrossClusterSearchConnectionId()
                    + ",");
        if (getConnectionStatus() != null)
            sb.append("ConnectionStatus: " + getConnectionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceDomainInfo() == null) ? 0 : getSourceDomainInfo().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationDomainInfo() == null) ? 0 : getDestinationDomainInfo().hashCode());
        hashCode = prime
                * hashCode
                + ((getCrossClusterSearchConnectionId() == null) ? 0
                        : getCrossClusterSearchConnectionId().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionStatus() == null) ? 0 : getConnectionStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InboundCrossClusterSearchConnection == false)
            return false;
        InboundCrossClusterSearchConnection other = (InboundCrossClusterSearchConnection) obj;

        if (other.getSourceDomainInfo() == null ^ this.getSourceDomainInfo() == null)
            return false;
        if (other.getSourceDomainInfo() != null
                && other.getSourceDomainInfo().equals(this.getSourceDomainInfo()) == false)
            return false;
        if (other.getDestinationDomainInfo() == null ^ this.getDestinationDomainInfo() == null)
            return false;
        if (other.getDestinationDomainInfo() != null
                && other.getDestinationDomainInfo().equals(this.getDestinationDomainInfo()) == false)
            return false;
        if (other.getCrossClusterSearchConnectionId() == null
                ^ this.getCrossClusterSearchConnectionId() == null)
            return false;
        if (other.getCrossClusterSearchConnectionId() != null
                && other.getCrossClusterSearchConnectionId().equals(
                        this.getCrossClusterSearchConnectionId()) == false)
            return false;
        if (other.getConnectionStatus() == null ^ this.getConnectionStatus() == null)
            return false;
        if (other.getConnectionStatus() != null
                && other.getConnectionStatus().equals(this.getConnectionStatus()) == false)
            return false;
        return true;
    }
}

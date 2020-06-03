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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new cross-cluster search connection from a source domain to a
 * destination domain.
 * </p>
 */
public class CreateOutboundCrossClusterSearchConnectionRequest extends AmazonWebServiceRequest
        implements Serializable {
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
     * Specifies the connection alias that will be used by the customer for this
     * connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     */
    private String connectionAlias;

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
    public CreateOutboundCrossClusterSearchConnectionRequest withSourceDomainInfo(
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
    public CreateOutboundCrossClusterSearchConnectionRequest withDestinationDomainInfo(
            DomainInformation destinationDomainInfo) {
        this.destinationDomainInfo = destinationDomainInfo;
        return this;
    }

    /**
     * <p>
     * Specifies the connection alias that will be used by the customer for this
     * connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     *
     * @return <p>
     *         Specifies the connection alias that will be used by the customer
     *         for this connection.
     *         </p>
     */
    public String getConnectionAlias() {
        return connectionAlias;
    }

    /**
     * <p>
     * Specifies the connection alias that will be used by the customer for this
     * connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     *
     * @param connectionAlias <p>
     *            Specifies the connection alias that will be used by the
     *            customer for this connection.
     *            </p>
     */
    public void setConnectionAlias(String connectionAlias) {
        this.connectionAlias = connectionAlias;
    }

    /**
     * <p>
     * Specifies the connection alias that will be used by the customer for this
     * connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     *
     * @param connectionAlias <p>
     *            Specifies the connection alias that will be used by the
     *            customer for this connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOutboundCrossClusterSearchConnectionRequest withConnectionAlias(
            String connectionAlias) {
        this.connectionAlias = connectionAlias;
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
        if (getConnectionAlias() != null)
            sb.append("ConnectionAlias: " + getConnectionAlias());
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
        hashCode = prime * hashCode
                + ((getConnectionAlias() == null) ? 0 : getConnectionAlias().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOutboundCrossClusterSearchConnectionRequest == false)
            return false;
        CreateOutboundCrossClusterSearchConnectionRequest other = (CreateOutboundCrossClusterSearchConnectionRequest) obj;

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
        if (other.getConnectionAlias() == null ^ this.getConnectionAlias() == null)
            return false;
        if (other.getConnectionAlias() != null
                && other.getConnectionAlias().equals(this.getConnectionAlias()) == false)
            return false;
        return true;
    }
}

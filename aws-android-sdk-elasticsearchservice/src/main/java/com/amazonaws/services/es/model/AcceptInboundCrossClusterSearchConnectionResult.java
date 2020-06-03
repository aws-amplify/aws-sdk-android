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
 * The result of a <code><a>AcceptInboundCrossClusterSearchConnection</a></code>
 * operation. Contains details of accepted inbound connection.
 * </p>
 */
public class AcceptInboundCrossClusterSearchConnectionResult implements Serializable {
    /**
     * <p>
     * Specifies the <code><a>InboundCrossClusterSearchConnection</a></code> of
     * accepted inbound connection.
     * </p>
     */
    private InboundCrossClusterSearchConnection crossClusterSearchConnection;

    /**
     * <p>
     * Specifies the <code><a>InboundCrossClusterSearchConnection</a></code> of
     * accepted inbound connection.
     * </p>
     *
     * @return <p>
     *         Specifies the
     *         <code><a>InboundCrossClusterSearchConnection</a></code> of
     *         accepted inbound connection.
     *         </p>
     */
    public InboundCrossClusterSearchConnection getCrossClusterSearchConnection() {
        return crossClusterSearchConnection;
    }

    /**
     * <p>
     * Specifies the <code><a>InboundCrossClusterSearchConnection</a></code> of
     * accepted inbound connection.
     * </p>
     *
     * @param crossClusterSearchConnection <p>
     *            Specifies the
     *            <code><a>InboundCrossClusterSearchConnection</a></code> of
     *            accepted inbound connection.
     *            </p>
     */
    public void setCrossClusterSearchConnection(
            InboundCrossClusterSearchConnection crossClusterSearchConnection) {
        this.crossClusterSearchConnection = crossClusterSearchConnection;
    }

    /**
     * <p>
     * Specifies the <code><a>InboundCrossClusterSearchConnection</a></code> of
     * accepted inbound connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crossClusterSearchConnection <p>
     *            Specifies the
     *            <code><a>InboundCrossClusterSearchConnection</a></code> of
     *            accepted inbound connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptInboundCrossClusterSearchConnectionResult withCrossClusterSearchConnection(
            InboundCrossClusterSearchConnection crossClusterSearchConnection) {
        this.crossClusterSearchConnection = crossClusterSearchConnection;
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
        if (getCrossClusterSearchConnection() != null)
            sb.append("CrossClusterSearchConnection: " + getCrossClusterSearchConnection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCrossClusterSearchConnection() == null) ? 0
                        : getCrossClusterSearchConnection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptInboundCrossClusterSearchConnectionResult == false)
            return false;
        AcceptInboundCrossClusterSearchConnectionResult other = (AcceptInboundCrossClusterSearchConnectionResult) obj;

        if (other.getCrossClusterSearchConnection() == null
                ^ this.getCrossClusterSearchConnection() == null)
            return false;
        if (other.getCrossClusterSearchConnection() != null
                && other.getCrossClusterSearchConnection().equals(
                        this.getCrossClusterSearchConnection()) == false)
            return false;
        return true;
    }
}

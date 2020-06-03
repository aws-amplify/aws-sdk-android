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
 * Allows the destination domain owner to reject an inbound cross-cluster search
 * connection request.
 * </p>
 */
public class RejectInboundCrossClusterSearchConnectionRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The id of the inbound connection that you want to reject.
     * </p>
     */
    private String crossClusterSearchConnectionId;

    /**
     * <p>
     * The id of the inbound connection that you want to reject.
     * </p>
     *
     * @return <p>
     *         The id of the inbound connection that you want to reject.
     *         </p>
     */
    public String getCrossClusterSearchConnectionId() {
        return crossClusterSearchConnectionId;
    }

    /**
     * <p>
     * The id of the inbound connection that you want to reject.
     * </p>
     *
     * @param crossClusterSearchConnectionId <p>
     *            The id of the inbound connection that you want to reject.
     *            </p>
     */
    public void setCrossClusterSearchConnectionId(String crossClusterSearchConnectionId) {
        this.crossClusterSearchConnectionId = crossClusterSearchConnectionId;
    }

    /**
     * <p>
     * The id of the inbound connection that you want to reject.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crossClusterSearchConnectionId <p>
     *            The id of the inbound connection that you want to reject.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RejectInboundCrossClusterSearchConnectionRequest withCrossClusterSearchConnectionId(
            String crossClusterSearchConnectionId) {
        this.crossClusterSearchConnectionId = crossClusterSearchConnectionId;
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
        if (getCrossClusterSearchConnectionId() != null)
            sb.append("CrossClusterSearchConnectionId: " + getCrossClusterSearchConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCrossClusterSearchConnectionId() == null) ? 0
                        : getCrossClusterSearchConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RejectInboundCrossClusterSearchConnectionRequest == false)
            return false;
        RejectInboundCrossClusterSearchConnectionRequest other = (RejectInboundCrossClusterSearchConnectionRequest) obj;

        if (other.getCrossClusterSearchConnectionId() == null
                ^ this.getCrossClusterSearchConnectionId() == null)
            return false;
        if (other.getCrossClusterSearchConnectionId() != null
                && other.getCrossClusterSearchConnectionId().equals(
                        this.getCrossClusterSearchConnectionId()) == false)
            return false;
        return true;
    }
}

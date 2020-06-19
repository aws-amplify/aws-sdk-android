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
package com.amazonaws.services.opsworks-cm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p> Returns the current status of an existing association or disassociation request. </p> <p> A <code>ResourceNotFoundException</code> is thrown when no recent association or disassociation request with the specified token is found, or when the server does not exist. A <code>ValidationException</code> is raised when parameters of the request are not valid. </p>
 */
public class DescribeNodeAssociationStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String nodeAssociationStatusToken;

    /**
     * <p>The name of the server from which to disassociate the node. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     */
    private String serverName;

    /**
     * <p>The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse. </p>
     */
    public String getNodeAssociationStatusToken() {
        return nodeAssociationStatusToken;
    }

    /**
     * <p>The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param nodeAssociationStatusToken <p>The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse. </p>
     */
    public void setNodeAssociationStatusToken(String nodeAssociationStatusToken) {
        this.nodeAssociationStatusToken = nodeAssociationStatusToken;
    }

    /**
     * <p>The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param nodeAssociationStatusToken <p>The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeNodeAssociationStatusRequest withNodeAssociationStatusToken(String nodeAssociationStatusToken) {
        this.nodeAssociationStatusToken = nodeAssociationStatusToken;
        return this;
    }

    /**
     * <p>The name of the server from which to disassociate the node. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @return <p>The name of the server from which to disassociate the node. </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>The name of the server from which to disassociate the node. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>The name of the server from which to disassociate the node. </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>The name of the server from which to disassociate the node. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>The name of the server from which to disassociate the node. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeNodeAssociationStatusRequest withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNodeAssociationStatusToken() != null) sb.append("NodeAssociationStatusToken: " + getNodeAssociationStatusToken() + ",");
        if (getServerName() != null) sb.append("ServerName: " + getServerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeAssociationStatusToken() == null) ? 0 : getNodeAssociationStatusToken().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeNodeAssociationStatusRequest == false) return false;
        DescribeNodeAssociationStatusRequest other = (DescribeNodeAssociationStatusRequest)obj;

        if (other.getNodeAssociationStatusToken() == null ^ this.getNodeAssociationStatusToken() == null) return false;
        if (other.getNodeAssociationStatusToken() != null && other.getNodeAssociationStatusToken().equals(this.getNodeAssociationStatusToken()) == false) return false;
        if (other.getServerName() == null ^ this.getServerName() == null) return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false) return false;
        return true;
    }
}

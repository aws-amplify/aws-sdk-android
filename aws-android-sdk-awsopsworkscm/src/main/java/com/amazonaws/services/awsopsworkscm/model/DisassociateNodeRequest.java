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

package com.amazonaws.services.awsopsworkscm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disassociates a node from an AWS OpsWorks CM server, and removes the node
 * from the server's managed nodes. After a node is disassociated, the node key
 * pair is no longer valid for accessing the configuration manager's API. For
 * more information about how to associate a node, see <a>AssociateNode</a>.
 * </p>
 * <p>
 * A node can can only be disassociated from a server that is in a
 * <code>HEALTHY</code> state. Otherwise, an <code>InvalidStateException</code>
 * is thrown. A <code>ResourceNotFoundException</code> is thrown when the server
 * does not exist. A <code>ValidationException</code> is raised when parameters
 * of the request are not valid.
 * </p>
 */
public class DisassociateNodeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the server from which to disassociate the node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     */
    private String serverName;

    /**
     * <p>
     * The name of the client node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>^[\-\p{Alnum}_:.]+$<br/>
     */
    private String nodeName;

    /**
     * <p>
     * Engine attributes that are used for disassociating the node. No
     * attributes are required for Puppet.
     * </p>
     * <p class="title">
     * <b>Attributes required in a DisassociateNode request for Chef</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node
     * was associated. By default only one organization named
     * <code>default</code> can exist.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<EngineAttribute> engineAttributes;

    /**
     * <p>
     * The name of the server from which to disassociate the node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @return <p>
     *         The name of the server from which to disassociate the node.
     *         </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>
     * The name of the server from which to disassociate the node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>
     *            The name of the server from which to disassociate the node.
     *            </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server from which to disassociate the node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>
     *            The name of the server from which to disassociate the node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateNodeRequest withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * <p>
     * The name of the client node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>^[\-\p{Alnum}_:.]+$<br/>
     *
     * @return <p>
     *         The name of the client node.
     *         </p>
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * <p>
     * The name of the client node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>^[\-\p{Alnum}_:.]+$<br/>
     *
     * @param nodeName <p>
     *            The name of the client node.
     *            </p>
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * <p>
     * The name of the client node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>^[\-\p{Alnum}_:.]+$<br/>
     *
     * @param nodeName <p>
     *            The name of the client node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateNodeRequest withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * <p>
     * Engine attributes that are used for disassociating the node. No
     * attributes are required for Puppet.
     * </p>
     * <p class="title">
     * <b>Attributes required in a DisassociateNode request for Chef</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node
     * was associated. By default only one organization named
     * <code>default</code> can exist.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Engine attributes that are used for disassociating the node. No
     *         attributes are required for Puppet.
     *         </p>
     *         <p class="title">
     *         <b>Attributes required in a DisassociateNode request for Chef</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CHEF_ORGANIZATION</code>: The Chef organization with which
     *         the node was associated. By default only one organization named
     *         <code>default</code> can exist.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<EngineAttribute> getEngineAttributes() {
        return engineAttributes;
    }

    /**
     * <p>
     * Engine attributes that are used for disassociating the node. No
     * attributes are required for Puppet.
     * </p>
     * <p class="title">
     * <b>Attributes required in a DisassociateNode request for Chef</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node
     * was associated. By default only one organization named
     * <code>default</code> can exist.
     * </p>
     * </li>
     * </ul>
     *
     * @param engineAttributes <p>
     *            Engine attributes that are used for disassociating the node.
     *            No attributes are required for Puppet.
     *            </p>
     *            <p class="title">
     *            <b>Attributes required in a DisassociateNode request for
     *            Chef</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CHEF_ORGANIZATION</code>: The Chef organization with
     *            which the node was associated. By default only one
     *            organization named <code>default</code> can exist.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setEngineAttributes(java.util.Collection<EngineAttribute> engineAttributes) {
        if (engineAttributes == null) {
            this.engineAttributes = null;
            return;
        }

        this.engineAttributes = new java.util.ArrayList<EngineAttribute>(engineAttributes);
    }

    /**
     * <p>
     * Engine attributes that are used for disassociating the node. No
     * attributes are required for Puppet.
     * </p>
     * <p class="title">
     * <b>Attributes required in a DisassociateNode request for Chef</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node
     * was associated. By default only one organization named
     * <code>default</code> can exist.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineAttributes <p>
     *            Engine attributes that are used for disassociating the node.
     *            No attributes are required for Puppet.
     *            </p>
     *            <p class="title">
     *            <b>Attributes required in a DisassociateNode request for
     *            Chef</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CHEF_ORGANIZATION</code>: The Chef organization with
     *            which the node was associated. By default only one
     *            organization named <code>default</code> can exist.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateNodeRequest withEngineAttributes(EngineAttribute... engineAttributes) {
        if (getEngineAttributes() == null) {
            this.engineAttributes = new java.util.ArrayList<EngineAttribute>(
                    engineAttributes.length);
        }
        for (EngineAttribute value : engineAttributes) {
            this.engineAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Engine attributes that are used for disassociating the node. No
     * attributes are required for Puppet.
     * </p>
     * <p class="title">
     * <b>Attributes required in a DisassociateNode request for Chef</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node
     * was associated. By default only one organization named
     * <code>default</code> can exist.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineAttributes <p>
     *            Engine attributes that are used for disassociating the node.
     *            No attributes are required for Puppet.
     *            </p>
     *            <p class="title">
     *            <b>Attributes required in a DisassociateNode request for
     *            Chef</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CHEF_ORGANIZATION</code>: The Chef organization with
     *            which the node was associated. By default only one
     *            organization named <code>default</code> can exist.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateNodeRequest withEngineAttributes(
            java.util.Collection<EngineAttribute> engineAttributes) {
        setEngineAttributes(engineAttributes);
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
        if (getServerName() != null)
            sb.append("ServerName: " + getServerName() + ",");
        if (getNodeName() != null)
            sb.append("NodeName: " + getNodeName() + ",");
        if (getEngineAttributes() != null)
            sb.append("EngineAttributes: " + getEngineAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getNodeName() == null) ? 0 : getNodeName().hashCode());
        hashCode = prime * hashCode
                + ((getEngineAttributes() == null) ? 0 : getEngineAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateNodeRequest == false)
            return false;
        DisassociateNodeRequest other = (DisassociateNodeRequest) obj;

        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null
                && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getNodeName() == null ^ this.getNodeName() == null)
            return false;
        if (other.getNodeName() != null && other.getNodeName().equals(this.getNodeName()) == false)
            return false;
        if (other.getEngineAttributes() == null ^ this.getEngineAttributes() == null)
            return false;
        if (other.getEngineAttributes() != null
                && other.getEngineAttributes().equals(this.getEngineAttributes()) == false)
            return false;
        return true;
    }
}

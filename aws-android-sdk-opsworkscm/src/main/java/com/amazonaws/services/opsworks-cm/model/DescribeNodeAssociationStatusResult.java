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


public class DescribeNodeAssociationStatusResult implements Serializable {
    /**
     * <p>The status of the association or disassociation request. </p> <p class="title"> <b>Possible values:</b> </p> <ul> <li> <p> <code>SUCCESS</code>: The association or disassociation succeeded. </p> </li> <li> <p> <code>FAILED</code>: The association or disassociation failed. </p> </li> <li> <p> <code>IN_PROGRESS</code>: The association or disassociation is still in progress. </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, FAILED, IN_PROGRESS
     */
    private String nodeAssociationStatus;

    /**
     * <p>Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed certificate (the result of the CSR). </p>
     */
    private java.util.List<EngineAttribute> engineAttributes;

    /**
     * <p>The status of the association or disassociation request. </p> <p class="title"> <b>Possible values:</b> </p> <ul> <li> <p> <code>SUCCESS</code>: The association or disassociation succeeded. </p> </li> <li> <p> <code>FAILED</code>: The association or disassociation failed. </p> </li> <li> <p> <code>IN_PROGRESS</code>: The association or disassociation is still in progress. </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, FAILED, IN_PROGRESS
     *
     * @return <p>The status of the association or disassociation request. </p> <p class="title"> <b>Possible values:</b> </p> <ul> <li> <p> <code>SUCCESS</code>: The association or disassociation succeeded. </p> </li> <li> <p> <code>FAILED</code>: The association or disassociation failed. </p> </li> <li> <p> <code>IN_PROGRESS</code>: The association or disassociation is still in progress. </p> </li> </ul>
     *
     * @see NodeAssociationStatus
     */
    public String getNodeAssociationStatus() {
        return nodeAssociationStatus;
    }

    /**
     * <p>The status of the association or disassociation request. </p> <p class="title"> <b>Possible values:</b> </p> <ul> <li> <p> <code>SUCCESS</code>: The association or disassociation succeeded. </p> </li> <li> <p> <code>FAILED</code>: The association or disassociation failed. </p> </li> <li> <p> <code>IN_PROGRESS</code>: The association or disassociation is still in progress. </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, FAILED, IN_PROGRESS
     *
     * @param nodeAssociationStatus <p>The status of the association or disassociation request. </p> <p class="title"> <b>Possible values:</b> </p> <ul> <li> <p> <code>SUCCESS</code>: The association or disassociation succeeded. </p> </li> <li> <p> <code>FAILED</code>: The association or disassociation failed. </p> </li> <li> <p> <code>IN_PROGRESS</code>: The association or disassociation is still in progress. </p> </li> </ul>
     *
     * @see NodeAssociationStatus
     */
    public void setNodeAssociationStatus(String nodeAssociationStatus) {
        this.nodeAssociationStatus = nodeAssociationStatus;
    }

    /**
     * <p>The status of the association or disassociation request. </p> <p class="title"> <b>Possible values:</b> </p> <ul> <li> <p> <code>SUCCESS</code>: The association or disassociation succeeded. </p> </li> <li> <p> <code>FAILED</code>: The association or disassociation failed. </p> </li> <li> <p> <code>IN_PROGRESS</code>: The association or disassociation is still in progress. </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, FAILED, IN_PROGRESS
     *
     * @param nodeAssociationStatus <p>The status of the association or disassociation request. </p> <p class="title"> <b>Possible values:</b> </p> <ul> <li> <p> <code>SUCCESS</code>: The association or disassociation succeeded. </p> </li> <li> <p> <code>FAILED</code>: The association or disassociation failed. </p> </li> <li> <p> <code>IN_PROGRESS</code>: The association or disassociation is still in progress. </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see NodeAssociationStatus
     */
    public DescribeNodeAssociationStatusResult withNodeAssociationStatus(String nodeAssociationStatus) {
        this.nodeAssociationStatus = nodeAssociationStatus;
        return this;
    }

    /**
     * <p>The status of the association or disassociation request. </p> <p class="title"> <b>Possible values:</b> </p> <ul> <li> <p> <code>SUCCESS</code>: The association or disassociation succeeded. </p> </li> <li> <p> <code>FAILED</code>: The association or disassociation failed. </p> </li> <li> <p> <code>IN_PROGRESS</code>: The association or disassociation is still in progress. </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, FAILED, IN_PROGRESS
     *
     * @param nodeAssociationStatus <p>The status of the association or disassociation request. </p> <p class="title"> <b>Possible values:</b> </p> <ul> <li> <p> <code>SUCCESS</code>: The association or disassociation succeeded. </p> </li> <li> <p> <code>FAILED</code>: The association or disassociation failed. </p> </li> <li> <p> <code>IN_PROGRESS</code>: The association or disassociation is still in progress. </p> </li> </ul>
     *
     * @see NodeAssociationStatus
     */
    public void setNodeAssociationStatus(NodeAssociationStatus nodeAssociationStatus) {
        this.nodeAssociationStatus = nodeAssociationStatus.toString();
    }

    /**
     * <p>The status of the association or disassociation request. </p> <p class="title"> <b>Possible values:</b> </p> <ul> <li> <p> <code>SUCCESS</code>: The association or disassociation succeeded. </p> </li> <li> <p> <code>FAILED</code>: The association or disassociation failed. </p> </li> <li> <p> <code>IN_PROGRESS</code>: The association or disassociation is still in progress. </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, FAILED, IN_PROGRESS
     *
     * @param nodeAssociationStatus <p>The status of the association or disassociation request. </p> <p class="title"> <b>Possible values:</b> </p> <ul> <li> <p> <code>SUCCESS</code>: The association or disassociation succeeded. </p> </li> <li> <p> <code>FAILED</code>: The association or disassociation failed. </p> </li> <li> <p> <code>IN_PROGRESS</code>: The association or disassociation is still in progress. </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see NodeAssociationStatus
     */
    public DescribeNodeAssociationStatusResult withNodeAssociationStatus(NodeAssociationStatus nodeAssociationStatus) {
        this.nodeAssociationStatus = nodeAssociationStatus.toString();
        return this;
    }

    /**
     * <p>Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed certificate (the result of the CSR). </p>
     *
     * @return <p>Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed certificate (the result of the CSR). </p>
     */
    public java.util.List<EngineAttribute> getEngineAttributes() {
        return engineAttributes;
    }

    /**
     * <p>Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed certificate (the result of the CSR). </p>
     *
     * @param engineAttributes <p>Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed certificate (the result of the CSR). </p>
     */
    public void setEngineAttributes(java.util.Collection<EngineAttribute> engineAttributes) {
        if (engineAttributes == null) {
            this.engineAttributes = null;
            return;
        }

        this.engineAttributes = new java.util.ArrayList<EngineAttribute>(engineAttributes);
    }

    /**
     * <p>Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed certificate (the result of the CSR). </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineAttributes <p>Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed certificate (the result of the CSR). </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeNodeAssociationStatusResult withEngineAttributes(EngineAttribute... engineAttributes) {
        if (getEngineAttributes() == null) {
            this.engineAttributes = new java.util.ArrayList<EngineAttribute>(engineAttributes.length);
        }
        for (EngineAttribute value : engineAttributes) {
            this.engineAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed certificate (the result of the CSR). </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineAttributes <p>Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed certificate (the result of the CSR). </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeNodeAssociationStatusResult withEngineAttributes(java.util.Collection<EngineAttribute> engineAttributes) {
        setEngineAttributes(engineAttributes);
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
        if (getNodeAssociationStatus() != null) sb.append("NodeAssociationStatus: " + getNodeAssociationStatus() + ",");
        if (getEngineAttributes() != null) sb.append("EngineAttributes: " + getEngineAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeAssociationStatus() == null) ? 0 : getNodeAssociationStatus().hashCode());
        hashCode = prime * hashCode + ((getEngineAttributes() == null) ? 0 : getEngineAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeNodeAssociationStatusResult == false) return false;
        DescribeNodeAssociationStatusResult other = (DescribeNodeAssociationStatusResult)obj;

        if (other.getNodeAssociationStatus() == null ^ this.getNodeAssociationStatus() == null) return false;
        if (other.getNodeAssociationStatus() != null && other.getNodeAssociationStatus().equals(this.getNodeAssociationStatus()) == false) return false;
        if (other.getEngineAttributes() == null ^ this.getEngineAttributes() == null) return false;
        if (other.getEngineAttributes() != null && other.getEngineAttributes().equals(this.getEngineAttributes()) == false) return false;
        return true;
    }
}

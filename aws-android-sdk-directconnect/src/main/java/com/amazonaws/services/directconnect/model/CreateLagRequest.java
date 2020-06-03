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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a link aggregation group (LAG) with the specified number of bundled
 * physical connections between the customer network and a specific AWS Direct
 * Connect location. A LAG is a logical interface that uses the Link Aggregation
 * Control Protocol (LACP) to aggregate multiple interfaces, enabling you to
 * treat them as a single interface.
 * </p>
 * <p>
 * All connections in a LAG must use the same bandwidth and must terminate at
 * the same AWS Direct Connect endpoint.
 * </p>
 * <p>
 * You can have up to 10 connections per LAG. Regardless of this limit, if you
 * request more connections for the LAG than AWS Direct Connect can allocate on
 * a single endpoint, no LAG is created.
 * </p>
 * <p>
 * You can specify an existing physical connection or interconnect to include in
 * the LAG (which counts towards the total number of connections). Doing so
 * interrupts the current physical connection or hosted connections, and
 * re-establishes them as a member of the LAG. The LAG will be created on the
 * same AWS Direct Connect endpoint to which the connection terminates. Any
 * virtual interfaces associated with the connection are automatically
 * disassociated and re-associated with the LAG. The connection ID does not
 * change.
 * </p>
 * <p>
 * If the AWS account used to create a LAG is a registered AWS Direct Connect
 * Partner, the LAG is automatically enabled to host sub-connections. For a LAG
 * owned by a partner, any associated virtual interfaces cannot be directly
 * configured.
 * </p>
 */
public class CreateLagRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The number of physical connections initially provisioned and bundled by
     * the LAG.
     * </p>
     */
    private Integer numberOfConnections;

    /**
     * <p>
     * The location for the LAG.
     * </p>
     */
    private String location;

    /**
     * <p>
     * The bandwidth of the individual physical connections bundled by the LAG.
     * The possible values are 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps,
     * 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps.
     * </p>
     */
    private String connectionsBandwidth;

    /**
     * <p>
     * The name of the LAG.
     * </p>
     */
    private String lagName;

    /**
     * <p>
     * The ID of an existing connection to migrate to the LAG.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * The tags to associate with the LAG.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The tags to associate with the automtically created LAGs.
     * </p>
     */
    private java.util.List<Tag> childConnectionTags;

    /**
     * <p>
     * The name of the service provider associated with the LAG.
     * </p>
     */
    private String providerName;

    /**
     * <p>
     * The number of physical connections initially provisioned and bundled by
     * the LAG.
     * </p>
     *
     * @return <p>
     *         The number of physical connections initially provisioned and
     *         bundled by the LAG.
     *         </p>
     */
    public Integer getNumberOfConnections() {
        return numberOfConnections;
    }

    /**
     * <p>
     * The number of physical connections initially provisioned and bundled by
     * the LAG.
     * </p>
     *
     * @param numberOfConnections <p>
     *            The number of physical connections initially provisioned and
     *            bundled by the LAG.
     *            </p>
     */
    public void setNumberOfConnections(Integer numberOfConnections) {
        this.numberOfConnections = numberOfConnections;
    }

    /**
     * <p>
     * The number of physical connections initially provisioned and bundled by
     * the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfConnections <p>
     *            The number of physical connections initially provisioned and
     *            bundled by the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLagRequest withNumberOfConnections(Integer numberOfConnections) {
        this.numberOfConnections = numberOfConnections;
        return this;
    }

    /**
     * <p>
     * The location for the LAG.
     * </p>
     *
     * @return <p>
     *         The location for the LAG.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The location for the LAG.
     * </p>
     *
     * @param location <p>
     *            The location for the LAG.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location for the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The location for the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLagRequest withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The bandwidth of the individual physical connections bundled by the LAG.
     * The possible values are 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps,
     * 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps.
     * </p>
     *
     * @return <p>
     *         The bandwidth of the individual physical connections bundled by
     *         the LAG. The possible values are 50Mbps, 100Mbps, 200Mbps,
     *         300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps.
     *         </p>
     */
    public String getConnectionsBandwidth() {
        return connectionsBandwidth;
    }

    /**
     * <p>
     * The bandwidth of the individual physical connections bundled by the LAG.
     * The possible values are 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps,
     * 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps.
     * </p>
     *
     * @param connectionsBandwidth <p>
     *            The bandwidth of the individual physical connections bundled
     *            by the LAG. The possible values are 50Mbps, 100Mbps, 200Mbps,
     *            300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps.
     *            </p>
     */
    public void setConnectionsBandwidth(String connectionsBandwidth) {
        this.connectionsBandwidth = connectionsBandwidth;
    }

    /**
     * <p>
     * The bandwidth of the individual physical connections bundled by the LAG.
     * The possible values are 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps,
     * 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionsBandwidth <p>
     *            The bandwidth of the individual physical connections bundled
     *            by the LAG. The possible values are 50Mbps, 100Mbps, 200Mbps,
     *            300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLagRequest withConnectionsBandwidth(String connectionsBandwidth) {
        this.connectionsBandwidth = connectionsBandwidth;
        return this;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     *
     * @return <p>
     *         The name of the LAG.
     *         </p>
     */
    public String getLagName() {
        return lagName;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     *
     * @param lagName <p>
     *            The name of the LAG.
     *            </p>
     */
    public void setLagName(String lagName) {
        this.lagName = lagName;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lagName <p>
     *            The name of the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLagRequest withLagName(String lagName) {
        this.lagName = lagName;
        return this;
    }

    /**
     * <p>
     * The ID of an existing connection to migrate to the LAG.
     * </p>
     *
     * @return <p>
     *         The ID of an existing connection to migrate to the LAG.
     *         </p>
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * <p>
     * The ID of an existing connection to migrate to the LAG.
     * </p>
     *
     * @param connectionId <p>
     *            The ID of an existing connection to migrate to the LAG.
     *            </p>
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of an existing connection to migrate to the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionId <p>
     *            The ID of an existing connection to migrate to the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLagRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * <p>
     * The tags to associate with the LAG.
     * </p>
     *
     * @return <p>
     *         The tags to associate with the LAG.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to associate with the LAG.
     * </p>
     *
     * @param tags <p>
     *            The tags to associate with the LAG.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to associate with the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to associate with the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLagRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to associate with the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to associate with the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLagRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The tags to associate with the automtically created LAGs.
     * </p>
     *
     * @return <p>
     *         The tags to associate with the automtically created LAGs.
     *         </p>
     */
    public java.util.List<Tag> getChildConnectionTags() {
        return childConnectionTags;
    }

    /**
     * <p>
     * The tags to associate with the automtically created LAGs.
     * </p>
     *
     * @param childConnectionTags <p>
     *            The tags to associate with the automtically created LAGs.
     *            </p>
     */
    public void setChildConnectionTags(java.util.Collection<Tag> childConnectionTags) {
        if (childConnectionTags == null) {
            this.childConnectionTags = null;
            return;
        }

        this.childConnectionTags = new java.util.ArrayList<Tag>(childConnectionTags);
    }

    /**
     * <p>
     * The tags to associate with the automtically created LAGs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param childConnectionTags <p>
     *            The tags to associate with the automtically created LAGs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLagRequest withChildConnectionTags(Tag... childConnectionTags) {
        if (getChildConnectionTags() == null) {
            this.childConnectionTags = new java.util.ArrayList<Tag>(childConnectionTags.length);
        }
        for (Tag value : childConnectionTags) {
            this.childConnectionTags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to associate with the automtically created LAGs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param childConnectionTags <p>
     *            The tags to associate with the automtically created LAGs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLagRequest withChildConnectionTags(java.util.Collection<Tag> childConnectionTags) {
        setChildConnectionTags(childConnectionTags);
        return this;
    }

    /**
     * <p>
     * The name of the service provider associated with the LAG.
     * </p>
     *
     * @return <p>
     *         The name of the service provider associated with the LAG.
     *         </p>
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the LAG.
     * </p>
     *
     * @param providerName <p>
     *            The name of the service provider associated with the LAG.
     *            </p>
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerName <p>
     *            The name of the service provider associated with the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLagRequest withProviderName(String providerName) {
        this.providerName = providerName;
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
        if (getNumberOfConnections() != null)
            sb.append("numberOfConnections: " + getNumberOfConnections() + ",");
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getConnectionsBandwidth() != null)
            sb.append("connectionsBandwidth: " + getConnectionsBandwidth() + ",");
        if (getLagName() != null)
            sb.append("lagName: " + getLagName() + ",");
        if (getConnectionId() != null)
            sb.append("connectionId: " + getConnectionId() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getChildConnectionTags() != null)
            sb.append("childConnectionTags: " + getChildConnectionTags() + ",");
        if (getProviderName() != null)
            sb.append("providerName: " + getProviderName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNumberOfConnections() == null) ? 0 : getNumberOfConnections().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionsBandwidth() == null) ? 0 : getConnectionsBandwidth().hashCode());
        hashCode = prime * hashCode + ((getLagName() == null) ? 0 : getLagName().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getChildConnectionTags() == null) ? 0 : getChildConnectionTags().hashCode());
        hashCode = prime * hashCode
                + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLagRequest == false)
            return false;
        CreateLagRequest other = (CreateLagRequest) obj;

        if (other.getNumberOfConnections() == null ^ this.getNumberOfConnections() == null)
            return false;
        if (other.getNumberOfConnections() != null
                && other.getNumberOfConnections().equals(this.getNumberOfConnections()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getConnectionsBandwidth() == null ^ this.getConnectionsBandwidth() == null)
            return false;
        if (other.getConnectionsBandwidth() != null
                && other.getConnectionsBandwidth().equals(this.getConnectionsBandwidth()) == false)
            return false;
        if (other.getLagName() == null ^ this.getLagName() == null)
            return false;
        if (other.getLagName() != null && other.getLagName().equals(this.getLagName()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null
                && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getChildConnectionTags() == null ^ this.getChildConnectionTags() == null)
            return false;
        if (other.getChildConnectionTags() != null
                && other.getChildConnectionTags().equals(this.getChildConnectionTags()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null
                && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        return true;
    }
}

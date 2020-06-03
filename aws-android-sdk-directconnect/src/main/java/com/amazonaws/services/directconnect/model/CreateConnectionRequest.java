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
 * Creates a connection between a customer network and a specific AWS Direct
 * Connect location.
 * </p>
 * <p>
 * A connection links your internal network to an AWS Direct Connect location
 * over a standard Ethernet fiber-optic cable. One end of the cable is connected
 * to your router, the other to an AWS Direct Connect router.
 * </p>
 * <p>
 * To find the locations for your Region, use <a>DescribeLocations</a>.
 * </p>
 * <p>
 * You can automatically add the new connection to a link aggregation group
 * (LAG) by specifying a LAG ID in the request. This ensures that the new
 * connection is allocated on the same AWS Direct Connect endpoint that hosts
 * the specified LAG. If there are no available ports on the endpoint, the
 * request fails and no connection is created.
 * </p>
 */
public class CreateConnectionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The location of the connection.
     * </p>
     */
    private String location;

    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     */
    private String bandwidth;

    /**
     * <p>
     * The name of the connection.
     * </p>
     */
    private String connectionName;

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     */
    private String lagId;

    /**
     * <p>
     * The tags to associate with the lag.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the service provider associated with the requested
     * connection.
     * </p>
     */
    private String providerName;

    /**
     * <p>
     * The location of the connection.
     * </p>
     *
     * @return <p>
     *         The location of the connection.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The location of the connection.
     * </p>
     *
     * @param location <p>
     *            The location of the connection.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The location of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConnectionRequest withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     *
     * @return <p>
     *         The bandwidth of the connection.
     *         </p>
     */
    public String getBandwidth() {
        return bandwidth;
    }

    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     *
     * @param bandwidth <p>
     *            The bandwidth of the connection.
     *            </p>
     */
    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bandwidth <p>
     *            The bandwidth of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConnectionRequest withBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * <p>
     * The name of the connection.
     * </p>
     *
     * @return <p>
     *         The name of the connection.
     *         </p>
     */
    public String getConnectionName() {
        return connectionName;
    }

    /**
     * <p>
     * The name of the connection.
     * </p>
     *
     * @param connectionName <p>
     *            The name of the connection.
     *            </p>
     */
    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionName <p>
     *            The name of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConnectionRequest withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     *
     * @return <p>
     *         The ID of the LAG.
     *         </p>
     */
    public String getLagId() {
        return lagId;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     *
     * @param lagId <p>
     *            The ID of the LAG.
     *            </p>
     */
    public void setLagId(String lagId) {
        this.lagId = lagId;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lagId <p>
     *            The ID of the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConnectionRequest withLagId(String lagId) {
        this.lagId = lagId;
        return this;
    }

    /**
     * <p>
     * The tags to associate with the lag.
     * </p>
     *
     * @return <p>
     *         The tags to associate with the lag.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to associate with the lag.
     * </p>
     *
     * @param tags <p>
     *            The tags to associate with the lag.
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
     * The tags to associate with the lag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to associate with the lag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConnectionRequest withTags(Tag... tags) {
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
     * The tags to associate with the lag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to associate with the lag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConnectionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the service provider associated with the requested
     * connection.
     * </p>
     *
     * @return <p>
     *         The name of the service provider associated with the requested
     *         connection.
     *         </p>
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the requested
     * connection.
     * </p>
     *
     * @param providerName <p>
     *            The name of the service provider associated with the requested
     *            connection.
     *            </p>
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the requested
     * connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerName <p>
     *            The name of the service provider associated with the requested
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConnectionRequest withProviderName(String providerName) {
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
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getBandwidth() != null)
            sb.append("bandwidth: " + getBandwidth() + ",");
        if (getConnectionName() != null)
            sb.append("connectionName: " + getConnectionName() + ",");
        if (getLagId() != null)
            sb.append("lagId: " + getLagId() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getProviderName() != null)
            sb.append("providerName: " + getProviderName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getLagId() == null) ? 0 : getLagId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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

        if (obj instanceof CreateConnectionRequest == false)
            return false;
        CreateConnectionRequest other = (CreateConnectionRequest) obj;

        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getBandwidth() == null ^ this.getBandwidth() == null)
            return false;
        if (other.getBandwidth() != null
                && other.getBandwidth().equals(this.getBandwidth()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null
                && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getLagId() == null ^ this.getLagId() == null)
            return false;
        if (other.getLagId() != null && other.getLagId().equals(this.getLagId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null
                && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        return true;
    }
}

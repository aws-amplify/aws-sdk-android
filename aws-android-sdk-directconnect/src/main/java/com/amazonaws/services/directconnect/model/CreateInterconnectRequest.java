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
 * Creates an interconnect between an AWS Direct Connect Partner's network and a
 * specific AWS Direct Connect location.
 * </p>
 * <p>
 * An interconnect is a connection that is capable of hosting other connections.
 * The AWS Direct Connect partner can use an interconnect to provide AWS Direct
 * Connect hosted connections to customers through their own network services.
 * Like a standard connection, an interconnect links the partner's network to an
 * AWS Direct Connect location over a standard Ethernet fiber-optic cable. One
 * end is connected to the partner's router, the other to an AWS Direct Connect
 * router.
 * </p>
 * <p>
 * You can automatically add the new interconnect to a link aggregation group
 * (LAG) by specifying a LAG ID in the request. This ensures that the new
 * interconnect is allocated on the same AWS Direct Connect endpoint that hosts
 * the specified LAG. If there are no available ports on the endpoint, the
 * request fails and no interconnect is created.
 * </p>
 * <p>
 * For each end customer, the AWS Direct Connect Partner provisions a connection
 * on their interconnect by calling <a>AllocateHostedConnection</a>. The end
 * customer can then connect to AWS resources by creating a virtual interface on
 * their connection, using the VLAN assigned to them by the AWS Direct Connect
 * Partner.
 * </p>
 * <note>
 * <p>
 * Intended for use by AWS Direct Connect Partners only.
 * </p>
 * </note>
 */
public class CreateInterconnectRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the interconnect.
     * </p>
     */
    private String interconnectName;

    /**
     * <p>
     * The port bandwidth, in Gbps. The possible values are 1 and 10.
     * </p>
     */
    private String bandwidth;

    /**
     * <p>
     * The location of the interconnect.
     * </p>
     */
    private String location;

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     */
    private String lagId;

    /**
     * <p>
     * The tags to associate with the interconnect.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the service provider associated with the interconnect.
     * </p>
     */
    private String providerName;

    /**
     * <p>
     * The name of the interconnect.
     * </p>
     *
     * @return <p>
     *         The name of the interconnect.
     *         </p>
     */
    public String getInterconnectName() {
        return interconnectName;
    }

    /**
     * <p>
     * The name of the interconnect.
     * </p>
     *
     * @param interconnectName <p>
     *            The name of the interconnect.
     *            </p>
     */
    public void setInterconnectName(String interconnectName) {
        this.interconnectName = interconnectName;
    }

    /**
     * <p>
     * The name of the interconnect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param interconnectName <p>
     *            The name of the interconnect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInterconnectRequest withInterconnectName(String interconnectName) {
        this.interconnectName = interconnectName;
        return this;
    }

    /**
     * <p>
     * The port bandwidth, in Gbps. The possible values are 1 and 10.
     * </p>
     *
     * @return <p>
     *         The port bandwidth, in Gbps. The possible values are 1 and 10.
     *         </p>
     */
    public String getBandwidth() {
        return bandwidth;
    }

    /**
     * <p>
     * The port bandwidth, in Gbps. The possible values are 1 and 10.
     * </p>
     *
     * @param bandwidth <p>
     *            The port bandwidth, in Gbps. The possible values are 1 and 10.
     *            </p>
     */
    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * <p>
     * The port bandwidth, in Gbps. The possible values are 1 and 10.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bandwidth <p>
     *            The port bandwidth, in Gbps. The possible values are 1 and 10.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInterconnectRequest withBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * <p>
     * The location of the interconnect.
     * </p>
     *
     * @return <p>
     *         The location of the interconnect.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The location of the interconnect.
     * </p>
     *
     * @param location <p>
     *            The location of the interconnect.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the interconnect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The location of the interconnect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInterconnectRequest withLocation(String location) {
        this.location = location;
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
    public CreateInterconnectRequest withLagId(String lagId) {
        this.lagId = lagId;
        return this;
    }

    /**
     * <p>
     * The tags to associate with the interconnect.
     * </p>
     *
     * @return <p>
     *         The tags to associate with the interconnect.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to associate with the interconnect.
     * </p>
     *
     * @param tags <p>
     *            The tags to associate with the interconnect.
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
     * The tags to associate with the interconnect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to associate with the interconnect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInterconnectRequest withTags(Tag... tags) {
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
     * The tags to associate with the interconnect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to associate with the interconnect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInterconnectRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the service provider associated with the interconnect.
     * </p>
     *
     * @return <p>
     *         The name of the service provider associated with the
     *         interconnect.
     *         </p>
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the interconnect.
     * </p>
     *
     * @param providerName <p>
     *            The name of the service provider associated with the
     *            interconnect.
     *            </p>
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the interconnect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerName <p>
     *            The name of the service provider associated with the
     *            interconnect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInterconnectRequest withProviderName(String providerName) {
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
        if (getInterconnectName() != null)
            sb.append("interconnectName: " + getInterconnectName() + ",");
        if (getBandwidth() != null)
            sb.append("bandwidth: " + getBandwidth() + ",");
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
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

        hashCode = prime * hashCode
                + ((getInterconnectName() == null) ? 0 : getInterconnectName().hashCode());
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
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

        if (obj instanceof CreateInterconnectRequest == false)
            return false;
        CreateInterconnectRequest other = (CreateInterconnectRequest) obj;

        if (other.getInterconnectName() == null ^ this.getInterconnectName() == null)
            return false;
        if (other.getInterconnectName() != null
                && other.getInterconnectName().equals(this.getInterconnectName()) == false)
            return false;
        if (other.getBandwidth() == null ^ this.getBandwidth() == null)
            return false;
        if (other.getBandwidth() != null
                && other.getBandwidth().equals(this.getBandwidth()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
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

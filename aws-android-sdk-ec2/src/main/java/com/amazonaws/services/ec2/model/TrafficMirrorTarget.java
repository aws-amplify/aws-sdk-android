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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a Traffic Mirror target.
 * </p>
 */
public class TrafficMirrorTarget implements Serializable {
    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     */
    private String trafficMirrorTargetId;

    /**
     * <p>
     * The network interface ID that is attached to the target.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Load Balancer.
     * </p>
     */
    private String networkLoadBalancerArn;

    /**
     * <p>
     * The type of Traffic Mirror target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>network-interface, network-load-balancer
     */
    private String type;

    /**
     * <p>
     * Information about the Traffic Mirror target.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the account that owns the Traffic Mirror target.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The tags assigned to the Traffic Mirror target.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     *
     * @return <p>
     *         The ID of the Traffic Mirror target.
     *         </p>
     */
    public String getTrafficMirrorTargetId() {
        return trafficMirrorTargetId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     *
     * @param trafficMirrorTargetId <p>
     *            The ID of the Traffic Mirror target.
     *            </p>
     */
    public void setTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorTargetId <p>
     *            The ID of the Traffic Mirror target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorTarget withTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
        return this;
    }

    /**
     * <p>
     * The network interface ID that is attached to the target.
     * </p>
     *
     * @return <p>
     *         The network interface ID that is attached to the target.
     *         </p>
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * <p>
     * The network interface ID that is attached to the target.
     * </p>
     *
     * @param networkInterfaceId <p>
     *            The network interface ID that is attached to the target.
     *            </p>
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The network interface ID that is attached to the target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceId <p>
     *            The network interface ID that is attached to the target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorTarget withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Load Balancer.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Network Load Balancer.
     *         </p>
     */
    public String getNetworkLoadBalancerArn() {
        return networkLoadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Load Balancer.
     * </p>
     *
     * @param networkLoadBalancerArn <p>
     *            The Amazon Resource Name (ARN) of the Network Load Balancer.
     *            </p>
     */
    public void setNetworkLoadBalancerArn(String networkLoadBalancerArn) {
        this.networkLoadBalancerArn = networkLoadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Load Balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkLoadBalancerArn <p>
     *            The Amazon Resource Name (ARN) of the Network Load Balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorTarget withNetworkLoadBalancerArn(String networkLoadBalancerArn) {
        this.networkLoadBalancerArn = networkLoadBalancerArn;
        return this;
    }

    /**
     * <p>
     * The type of Traffic Mirror target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>network-interface, network-load-balancer
     *
     * @return <p>
     *         The type of Traffic Mirror target.
     *         </p>
     * @see TrafficMirrorTargetType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of Traffic Mirror target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>network-interface, network-load-balancer
     *
     * @param type <p>
     *            The type of Traffic Mirror target.
     *            </p>
     * @see TrafficMirrorTargetType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of Traffic Mirror target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>network-interface, network-load-balancer
     *
     * @param type <p>
     *            The type of Traffic Mirror target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficMirrorTargetType
     */
    public TrafficMirrorTarget withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of Traffic Mirror target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>network-interface, network-load-balancer
     *
     * @param type <p>
     *            The type of Traffic Mirror target.
     *            </p>
     * @see TrafficMirrorTargetType
     */
    public void setType(TrafficMirrorTargetType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of Traffic Mirror target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>network-interface, network-load-balancer
     *
     * @param type <p>
     *            The type of Traffic Mirror target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficMirrorTargetType
     */
    public TrafficMirrorTarget withType(TrafficMirrorTargetType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about the Traffic Mirror target.
     * </p>
     *
     * @return <p>
     *         Information about the Traffic Mirror target.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Information about the Traffic Mirror target.
     * </p>
     *
     * @param description <p>
     *            Information about the Traffic Mirror target.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Information about the Traffic Mirror target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            Information about the Traffic Mirror target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorTarget withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The ID of the account that owns the Traffic Mirror target.
     * </p>
     *
     * @return <p>
     *         The ID of the account that owns the Traffic Mirror target.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The ID of the account that owns the Traffic Mirror target.
     * </p>
     *
     * @param ownerId <p>
     *            The ID of the account that owns the Traffic Mirror target.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the account that owns the Traffic Mirror target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The ID of the account that owns the Traffic Mirror target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorTarget withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror target.
     * </p>
     *
     * @return <p>
     *         The tags assigned to the Traffic Mirror target.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror target.
     * </p>
     *
     * @param tags <p>
     *            The tags assigned to the Traffic Mirror target.
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
     * The tags assigned to the Traffic Mirror target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the Traffic Mirror target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorTarget withTags(Tag... tags) {
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
     * The tags assigned to the Traffic Mirror target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the Traffic Mirror target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorTarget withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTrafficMirrorTargetId() != null)
            sb.append("TrafficMirrorTargetId: " + getTrafficMirrorTargetId() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getNetworkLoadBalancerArn() != null)
            sb.append("NetworkLoadBalancerArn: " + getNetworkLoadBalancerArn() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTrafficMirrorTargetId() == null) ? 0 : getTrafficMirrorTargetId().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getNetworkLoadBalancerArn() == null) ? 0 : getNetworkLoadBalancerArn()
                        .hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficMirrorTarget == false)
            return false;
        TrafficMirrorTarget other = (TrafficMirrorTarget) obj;

        if (other.getTrafficMirrorTargetId() == null ^ this.getTrafficMirrorTargetId() == null)
            return false;
        if (other.getTrafficMirrorTargetId() != null
                && other.getTrafficMirrorTargetId().equals(this.getTrafficMirrorTargetId()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getNetworkLoadBalancerArn() == null ^ this.getNetworkLoadBalancerArn() == null)
            return false;
        if (other.getNetworkLoadBalancerArn() != null
                && other.getNetworkLoadBalancerArn().equals(this.getNetworkLoadBalancerArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}

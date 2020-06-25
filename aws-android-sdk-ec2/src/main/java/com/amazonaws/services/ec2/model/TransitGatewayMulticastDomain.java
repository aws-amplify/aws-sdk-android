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
 * Describes the transit gateway multicast domain.
 * </p>
 */
public class TransitGatewayMulticastDomain implements Serializable {
    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     */
    private String transitGatewayMulticastDomainId;

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     */
    private String transitGatewayId;

    /**
     * <p>
     * The state of the transit gateway multicast domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     */
    private String state;

    /**
     * <p>
     * The time the transit gateway multicast domain was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The tags for the transit gateway multicast domain.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     *
     * @return <p>
     *         The ID of the transit gateway multicast domain.
     *         </p>
     */
    public String getTransitGatewayMulticastDomainId() {
        return transitGatewayMulticastDomainId;
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     *
     * @param transitGatewayMulticastDomainId <p>
     *            The ID of the transit gateway multicast domain.
     *            </p>
     */
    public void setTransitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
        this.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId;
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayMulticastDomainId <p>
     *            The ID of the transit gateway multicast domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastDomain withTransitGatewayMulticastDomainId(
            String transitGatewayMulticastDomainId) {
        this.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId;
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the transit gateway.
     *         </p>
     */
    public String getTransitGatewayId() {
        return transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     *
     * @param transitGatewayId <p>
     *            The ID of the transit gateway.
     *            </p>
     */
    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayId <p>
     *            The ID of the transit gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastDomain withTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway multicast domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @return <p>
     *         The state of the transit gateway multicast domain.
     *         </p>
     * @see TransitGatewayMulticastDomainState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the transit gateway multicast domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The state of the transit gateway multicast domain.
     *            </p>
     * @see TransitGatewayMulticastDomainState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the transit gateway multicast domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The state of the transit gateway multicast domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayMulticastDomainState
     */
    public TransitGatewayMulticastDomain withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway multicast domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The state of the transit gateway multicast domain.
     *            </p>
     * @see TransitGatewayMulticastDomainState
     */
    public void setState(TransitGatewayMulticastDomainState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the transit gateway multicast domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The state of the transit gateway multicast domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayMulticastDomainState
     */
    public TransitGatewayMulticastDomain withState(TransitGatewayMulticastDomainState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The time the transit gateway multicast domain was created.
     * </p>
     *
     * @return <p>
     *         The time the transit gateway multicast domain was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time the transit gateway multicast domain was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time the transit gateway multicast domain was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the transit gateway multicast domain was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time the transit gateway multicast domain was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastDomain withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The tags for the transit gateway multicast domain.
     * </p>
     *
     * @return <p>
     *         The tags for the transit gateway multicast domain.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the transit gateway multicast domain.
     * </p>
     *
     * @param tags <p>
     *            The tags for the transit gateway multicast domain.
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
     * The tags for the transit gateway multicast domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the transit gateway multicast domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastDomain withTags(Tag... tags) {
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
     * The tags for the transit gateway multicast domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the transit gateway multicast domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastDomain withTags(java.util.Collection<Tag> tags) {
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
        if (getTransitGatewayMulticastDomainId() != null)
            sb.append("TransitGatewayMulticastDomainId: " + getTransitGatewayMulticastDomainId()
                    + ",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: " + getTransitGatewayId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
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
                + ((getTransitGatewayMulticastDomainId() == null) ? 0
                        : getTransitGatewayMulticastDomainId().hashCode());
        hashCode = prime * hashCode
                + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayMulticastDomain == false)
            return false;
        TransitGatewayMulticastDomain other = (TransitGatewayMulticastDomain) obj;

        if (other.getTransitGatewayMulticastDomainId() == null
                ^ this.getTransitGatewayMulticastDomainId() == null)
            return false;
        if (other.getTransitGatewayMulticastDomainId() != null
                && other.getTransitGatewayMulticastDomainId().equals(
                        this.getTransitGatewayMulticastDomainId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null
                && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}

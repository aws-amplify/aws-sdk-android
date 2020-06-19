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
 * Describes a local gateway.
 * </p>
 */
public class LocalGateway implements Serializable {
    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     */
    private String localGatewayId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     */
    private String outpostArn;

    /**
     * <p>
     * The ID of the AWS account ID that owns the local gateway.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The state of the local gateway.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The tags assigned to the local gateway.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the local gateway.
     *         </p>
     */
    public String getLocalGatewayId() {
        return localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     *
     * @param localGatewayId <p>
     *            The ID of the local gateway.
     *            </p>
     */
    public void setLocalGatewayId(String localGatewayId) {
        this.localGatewayId = localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGatewayId <p>
     *            The ID of the local gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGateway withLocalGatewayId(String localGatewayId) {
        this.localGatewayId = localGatewayId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Outpost.
     *         </p>
     */
    public String getOutpostArn() {
        return outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the Outpost.
     *            </p>
     */
    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the Outpost.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGateway withOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account ID that owns the local gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account ID that owns the local gateway.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account ID that owns the local gateway.
     * </p>
     *
     * @param ownerId <p>
     *            The ID of the AWS account ID that owns the local gateway.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account ID that owns the local gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The ID of the AWS account ID that owns the local gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGateway withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The state of the local gateway.
     * </p>
     *
     * @return <p>
     *         The state of the local gateway.
     *         </p>
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the local gateway.
     * </p>
     *
     * @param state <p>
     *            The state of the local gateway.
     *            </p>
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the local gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state <p>
     *            The state of the local gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGateway withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The tags assigned to the local gateway.
     * </p>
     *
     * @return <p>
     *         The tags assigned to the local gateway.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the local gateway.
     * </p>
     *
     * @param tags <p>
     *            The tags assigned to the local gateway.
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
     * The tags assigned to the local gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the local gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGateway withTags(Tag... tags) {
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
     * The tags assigned to the local gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the local gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGateway withTags(java.util.Collection<Tag> tags) {
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
        if (getLocalGatewayId() != null)
            sb.append("LocalGatewayId: " + getLocalGatewayId() + ",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: " + getOutpostArn() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLocalGatewayId() == null) ? 0 : getLocalGatewayId().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalGateway == false)
            return false;
        LocalGateway other = (LocalGateway) obj;

        if (other.getLocalGatewayId() == null ^ this.getLocalGatewayId() == null)
            return false;
        if (other.getLocalGatewayId() != null
                && other.getLocalGatewayId().equals(this.getLocalGatewayId()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null
                && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}

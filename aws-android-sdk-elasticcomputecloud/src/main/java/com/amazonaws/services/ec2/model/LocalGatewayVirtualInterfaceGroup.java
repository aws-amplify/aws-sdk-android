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
 * Describes a local gateway virtual interface group.
 * </p>
 */
public class LocalGatewayVirtualInterfaceGroup implements Serializable {
    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     */
    private String localGatewayVirtualInterfaceGroupId;

    /**
     * <p>
     * The IDs of the virtual interfaces.
     * </p>
     */
    private java.util.List<String> localGatewayVirtualInterfaceIds;

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     */
    private String localGatewayId;

    /**
     * <p>
     * The tags assigned to the virtual interface group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual interface group.
     *         </p>
     */
    public String getLocalGatewayVirtualInterfaceGroupId() {
        return localGatewayVirtualInterfaceGroupId;
    }

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     *
     * @param localGatewayVirtualInterfaceGroupId <p>
     *            The ID of the virtual interface group.
     *            </p>
     */
    public void setLocalGatewayVirtualInterfaceGroupId(String localGatewayVirtualInterfaceGroupId) {
        this.localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroupId;
    }

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGatewayVirtualInterfaceGroupId <p>
     *            The ID of the virtual interface group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayVirtualInterfaceGroup withLocalGatewayVirtualInterfaceGroupId(
            String localGatewayVirtualInterfaceGroupId) {
        this.localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroupId;
        return this;
    }

    /**
     * <p>
     * The IDs of the virtual interfaces.
     * </p>
     *
     * @return <p>
     *         The IDs of the virtual interfaces.
     *         </p>
     */
    public java.util.List<String> getLocalGatewayVirtualInterfaceIds() {
        return localGatewayVirtualInterfaceIds;
    }

    /**
     * <p>
     * The IDs of the virtual interfaces.
     * </p>
     *
     * @param localGatewayVirtualInterfaceIds <p>
     *            The IDs of the virtual interfaces.
     *            </p>
     */
    public void setLocalGatewayVirtualInterfaceIds(
            java.util.Collection<String> localGatewayVirtualInterfaceIds) {
        if (localGatewayVirtualInterfaceIds == null) {
            this.localGatewayVirtualInterfaceIds = null;
            return;
        }

        this.localGatewayVirtualInterfaceIds = new java.util.ArrayList<String>(
                localGatewayVirtualInterfaceIds);
    }

    /**
     * <p>
     * The IDs of the virtual interfaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGatewayVirtualInterfaceIds <p>
     *            The IDs of the virtual interfaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayVirtualInterfaceGroup withLocalGatewayVirtualInterfaceIds(
            String... localGatewayVirtualInterfaceIds) {
        if (getLocalGatewayVirtualInterfaceIds() == null) {
            this.localGatewayVirtualInterfaceIds = new java.util.ArrayList<String>(
                    localGatewayVirtualInterfaceIds.length);
        }
        for (String value : localGatewayVirtualInterfaceIds) {
            this.localGatewayVirtualInterfaceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the virtual interfaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGatewayVirtualInterfaceIds <p>
     *            The IDs of the virtual interfaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayVirtualInterfaceGroup withLocalGatewayVirtualInterfaceIds(
            java.util.Collection<String> localGatewayVirtualInterfaceIds) {
        setLocalGatewayVirtualInterfaceIds(localGatewayVirtualInterfaceIds);
        return this;
    }

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
    public LocalGatewayVirtualInterfaceGroup withLocalGatewayId(String localGatewayId) {
        this.localGatewayId = localGatewayId;
        return this;
    }

    /**
     * <p>
     * The tags assigned to the virtual interface group.
     * </p>
     *
     * @return <p>
     *         The tags assigned to the virtual interface group.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the virtual interface group.
     * </p>
     *
     * @param tags <p>
     *            The tags assigned to the virtual interface group.
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
     * The tags assigned to the virtual interface group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the virtual interface group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayVirtualInterfaceGroup withTags(Tag... tags) {
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
     * The tags assigned to the virtual interface group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the virtual interface group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayVirtualInterfaceGroup withTags(java.util.Collection<Tag> tags) {
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
        if (getLocalGatewayVirtualInterfaceGroupId() != null)
            sb.append("LocalGatewayVirtualInterfaceGroupId: "
                    + getLocalGatewayVirtualInterfaceGroupId() + ",");
        if (getLocalGatewayVirtualInterfaceIds() != null)
            sb.append("LocalGatewayVirtualInterfaceIds: " + getLocalGatewayVirtualInterfaceIds()
                    + ",");
        if (getLocalGatewayId() != null)
            sb.append("LocalGatewayId: " + getLocalGatewayId() + ",");
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
                + ((getLocalGatewayVirtualInterfaceGroupId() == null) ? 0
                        : getLocalGatewayVirtualInterfaceGroupId().hashCode());
        hashCode = prime
                * hashCode
                + ((getLocalGatewayVirtualInterfaceIds() == null) ? 0
                        : getLocalGatewayVirtualInterfaceIds().hashCode());
        hashCode = prime * hashCode
                + ((getLocalGatewayId() == null) ? 0 : getLocalGatewayId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalGatewayVirtualInterfaceGroup == false)
            return false;
        LocalGatewayVirtualInterfaceGroup other = (LocalGatewayVirtualInterfaceGroup) obj;

        if (other.getLocalGatewayVirtualInterfaceGroupId() == null
                ^ this.getLocalGatewayVirtualInterfaceGroupId() == null)
            return false;
        if (other.getLocalGatewayVirtualInterfaceGroupId() != null
                && other.getLocalGatewayVirtualInterfaceGroupId().equals(
                        this.getLocalGatewayVirtualInterfaceGroupId()) == false)
            return false;
        if (other.getLocalGatewayVirtualInterfaceIds() == null
                ^ this.getLocalGatewayVirtualInterfaceIds() == null)
            return false;
        if (other.getLocalGatewayVirtualInterfaceIds() != null
                && other.getLocalGatewayVirtualInterfaceIds().equals(
                        this.getLocalGatewayVirtualInterfaceIds()) == false)
            return false;
        if (other.getLocalGatewayId() == null ^ this.getLocalGatewayId() == null)
            return false;
        if (other.getLocalGatewayId() != null
                && other.getLocalGatewayId().equals(this.getLocalGatewayId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}

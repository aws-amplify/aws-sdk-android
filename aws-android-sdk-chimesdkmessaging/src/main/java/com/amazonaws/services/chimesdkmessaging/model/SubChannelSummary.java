/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

/**
 * <p>
 * Summary of the sub-channels associated with the elastic channel.
 * </p>
 */
public class SubChannelSummary implements Serializable {
    /**
     * <p>
     * The unique ID of a SubChannel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     */
    private String subChannelId;

    /**
     * <p>
     * The number of members in a SubChannel.
     * </p>
     */
    private Integer membershipCount;

    /**
     * <p>
     * The unique ID of a SubChannel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The unique ID of a SubChannel.
     *         </p>
     */
    public String getSubChannelId() {
        return subChannelId;
    }

    /**
     * <p>
     * The unique ID of a SubChannel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param subChannelId <p>
     *            The unique ID of a SubChannel.
     *            </p>
     */
    public void setSubChannelId(String subChannelId) {
        this.subChannelId = subChannelId;
    }

    /**
     * <p>
     * The unique ID of a SubChannel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param subChannelId <p>
     *            The unique ID of a SubChannel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubChannelSummary withSubChannelId(String subChannelId) {
        this.subChannelId = subChannelId;
        return this;
    }

    /**
     * <p>
     * The number of members in a SubChannel.
     * </p>
     *
     * @return <p>
     *         The number of members in a SubChannel.
     *         </p>
     */
    public Integer getMembershipCount() {
        return membershipCount;
    }

    /**
     * <p>
     * The number of members in a SubChannel.
     * </p>
     *
     * @param membershipCount <p>
     *            The number of members in a SubChannel.
     *            </p>
     */
    public void setMembershipCount(Integer membershipCount) {
        this.membershipCount = membershipCount;
    }

    /**
     * <p>
     * The number of members in a SubChannel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param membershipCount <p>
     *            The number of members in a SubChannel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubChannelSummary withMembershipCount(Integer membershipCount) {
        this.membershipCount = membershipCount;
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
        if (getSubChannelId() != null)
            sb.append("SubChannelId: " + getSubChannelId() + ",");
        if (getMembershipCount() != null)
            sb.append("MembershipCount: " + getMembershipCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSubChannelId() == null) ? 0 : getSubChannelId().hashCode());
        hashCode = prime * hashCode
                + ((getMembershipCount() == null) ? 0 : getMembershipCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubChannelSummary == false)
            return false;
        SubChannelSummary other = (SubChannelSummary) obj;

        if (other.getSubChannelId() == null ^ this.getSubChannelId() == null)
            return false;
        if (other.getSubChannelId() != null
                && other.getSubChannelId().equals(this.getSubChannelId()) == false)
            return false;
        if (other.getMembershipCount() == null ^ this.getMembershipCount() == null)
            return false;
        if (other.getMembershipCount() != null
                && other.getMembershipCount().equals(this.getMembershipCount()) == false)
            return false;
        return true;
    }
}

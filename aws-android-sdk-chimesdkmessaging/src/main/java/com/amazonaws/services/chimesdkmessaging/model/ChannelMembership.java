/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The details of a channel member.
 * </p>
 */
public class ChannelMembership implements Serializable {
    /**
     * <p>
     * The identifier of the member who invited another member.
     * </p>
     */
    private Identity invitedBy;

    /**
     * <p>
     * The membership type set for the channel member.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     */
    private String type;

    /**
     * <p>
     * The data of the channel member.
     * </p>
     */
    private Identity member;

    /**
     * <p>
     * The ARN of the member's channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String channelArn;

    /**
     * <p>
     * The time at which the channel membership was created.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The time at which a channel membership was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;

    /**
     * <p>
     * The identifier of the member who invited another member.
     * </p>
     *
     * @return <p>
     *         The identifier of the member who invited another member.
     *         </p>
     */
    public Identity getInvitedBy() {
        return invitedBy;
    }

    /**
     * <p>
     * The identifier of the member who invited another member.
     * </p>
     *
     * @param invitedBy <p>
     *            The identifier of the member who invited another member.
     *            </p>
     */
    public void setInvitedBy(Identity invitedBy) {
        this.invitedBy = invitedBy;
    }

    /**
     * <p>
     * The identifier of the member who invited another member.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invitedBy <p>
     *            The identifier of the member who invited another member.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMembership withInvitedBy(Identity invitedBy) {
        this.invitedBy = invitedBy;
        return this;
    }

    /**
     * <p>
     * The membership type set for the channel member.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @return <p>
     *         The membership type set for the channel member.
     *         </p>
     * @see ChannelMembershipType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The membership type set for the channel member.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership type set for the channel member.
     *            </p>
     * @see ChannelMembershipType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The membership type set for the channel member.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership type set for the channel member.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMembershipType
     */
    public ChannelMembership withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The membership type set for the channel member.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership type set for the channel member.
     *            </p>
     * @see ChannelMembershipType
     */
    public void setType(ChannelMembershipType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The membership type set for the channel member.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership type set for the channel member.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMembershipType
     */
    public ChannelMembership withType(ChannelMembershipType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The data of the channel member.
     * </p>
     *
     * @return <p>
     *         The data of the channel member.
     *         </p>
     */
    public Identity getMember() {
        return member;
    }

    /**
     * <p>
     * The data of the channel member.
     * </p>
     *
     * @param member <p>
     *            The data of the channel member.
     *            </p>
     */
    public void setMember(Identity member) {
        this.member = member;
    }

    /**
     * <p>
     * The data of the channel member.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param member <p>
     *            The data of the channel member.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMembership withMember(Identity member) {
        this.member = member;
        return this;
    }

    /**
     * <p>
     * The ARN of the member's channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the member's channel.
     *         </p>
     */
    public String getChannelArn() {
        return channelArn;
    }

    /**
     * <p>
     * The ARN of the member's channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param channelArn <p>
     *            The ARN of the member's channel.
     *            </p>
     */
    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the member's channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param channelArn <p>
     *            The ARN of the member's channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMembership withChannelArn(String channelArn) {
        this.channelArn = channelArn;
        return this;
    }

    /**
     * <p>
     * The time at which the channel membership was created.
     * </p>
     *
     * @return <p>
     *         The time at which the channel membership was created.
     *         </p>
     */
    public java.util.Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * <p>
     * The time at which the channel membership was created.
     * </p>
     *
     * @param createdTimestamp <p>
     *            The time at which the channel membership was created.
     *            </p>
     */
    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which the channel membership was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTimestamp <p>
     *            The time at which the channel membership was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMembership withCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    /**
     * <p>
     * The time at which a channel membership was last updated.
     * </p>
     *
     * @return <p>
     *         The time at which a channel membership was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time at which a channel membership was last updated.
     * </p>
     *
     * @param lastUpdatedTimestamp <p>
     *            The time at which a channel membership was last updated.
     *            </p>
     */
    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time at which a channel membership was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTimestamp <p>
     *            The time at which a channel membership was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMembership withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
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
        if (getInvitedBy() != null)
            sb.append("InvitedBy: " + getInvitedBy() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getMember() != null)
            sb.append("Member: " + getMember() + ",");
        if (getChannelArn() != null)
            sb.append("ChannelArn: " + getChannelArn() + ",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: " + getCreatedTimestamp() + ",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: " + getLastUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvitedBy() == null) ? 0 : getInvitedBy().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMember() == null) ? 0 : getMember().hashCode());
        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelMembership == false)
            return false;
        ChannelMembership other = (ChannelMembership) obj;

        if (other.getInvitedBy() == null ^ this.getInvitedBy() == null)
            return false;
        if (other.getInvitedBy() != null
                && other.getInvitedBy().equals(this.getInvitedBy()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMember() == null ^ this.getMember() == null)
            return false;
        if (other.getMember() != null && other.getMember().equals(this.getMember()) == false)
            return false;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null
                && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null
                && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null
                && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        return true;
    }
}

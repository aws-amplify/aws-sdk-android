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
 * The membership information, including member ARNs, the channel ARN, and
 * membership types.
 * </p>
 */
public class BatchChannelMemberships implements Serializable {
    /**
     * <p>
     * The identifier of the member who invited another member.
     * </p>
     */
    private Identity invitedBy;

    /**
     * <p>
     * The membership types set for the channel users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     */
    private String type;

    /**
     * <p>
     * The users successfully added to the request.
     * </p>
     */
    private java.util.List<Identity> members;

    /**
     * <p>
     * The ARN of the channel to which you're adding users.
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
    public BatchChannelMemberships withInvitedBy(Identity invitedBy) {
        this.invitedBy = invitedBy;
        return this;
    }

    /**
     * <p>
     * The membership types set for the channel users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @return <p>
     *         The membership types set for the channel users.
     *         </p>
     * @see ChannelMembershipType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The membership types set for the channel users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership types set for the channel users.
     *            </p>
     * @see ChannelMembershipType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The membership types set for the channel users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership types set for the channel users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMembershipType
     */
    public BatchChannelMemberships withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The membership types set for the channel users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership types set for the channel users.
     *            </p>
     * @see ChannelMembershipType
     */
    public void setType(ChannelMembershipType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The membership types set for the channel users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership types set for the channel users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMembershipType
     */
    public BatchChannelMemberships withType(ChannelMembershipType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The users successfully added to the request.
     * </p>
     *
     * @return <p>
     *         The users successfully added to the request.
     *         </p>
     */
    public java.util.List<Identity> getMembers() {
        return members;
    }

    /**
     * <p>
     * The users successfully added to the request.
     * </p>
     *
     * @param members <p>
     *            The users successfully added to the request.
     *            </p>
     */
    public void setMembers(java.util.Collection<Identity> members) {
        if (members == null) {
            this.members = null;
            return;
        }

        this.members = new java.util.ArrayList<Identity>(members);
    }

    /**
     * <p>
     * The users successfully added to the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param members <p>
     *            The users successfully added to the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchChannelMemberships withMembers(Identity... members) {
        if (getMembers() == null) {
            this.members = new java.util.ArrayList<Identity>(members.length);
        }
        for (Identity value : members) {
            this.members.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The users successfully added to the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param members <p>
     *            The users successfully added to the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchChannelMemberships withMembers(java.util.Collection<Identity> members) {
        setMembers(members);
        return this;
    }

    /**
     * <p>
     * The ARN of the channel to which you're adding users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the channel to which you're adding users.
     *         </p>
     */
    public String getChannelArn() {
        return channelArn;
    }

    /**
     * <p>
     * The ARN of the channel to which you're adding users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param channelArn <p>
     *            The ARN of the channel to which you're adding users.
     *            </p>
     */
    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel to which you're adding users.
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
     *            The ARN of the channel to which you're adding users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchChannelMemberships withChannelArn(String channelArn) {
        this.channelArn = channelArn;
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
        if (getMembers() != null)
            sb.append("Members: " + getMembers() + ",");
        if (getChannelArn() != null)
            sb.append("ChannelArn: " + getChannelArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvitedBy() == null) ? 0 : getInvitedBy().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMembers() == null) ? 0 : getMembers().hashCode());
        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchChannelMemberships == false)
            return false;
        BatchChannelMemberships other = (BatchChannelMemberships) obj;

        if (other.getInvitedBy() == null ^ this.getInvitedBy() == null)
            return false;
        if (other.getInvitedBy() != null
                && other.getInvitedBy().equals(this.getInvitedBy()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMembers() == null ^ this.getMembers() == null)
            return false;
        if (other.getMembers() != null && other.getMembers().equals(this.getMembers()) == false)
            return false;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null
                && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        return true;
    }
}

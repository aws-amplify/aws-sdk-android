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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds a specified number of users to a channel.
 * </p>
 */
public class BatchCreateChannelMembershipRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are always returned as part of
     * <code>ListChannelMemberships</code>. Hidden members are only returned if
     * the type filter in <code>ListChannelMemberships</code> equals
     * <code>HIDDEN</code>. Otherwise hidden members are not returned. This is
     * only supported by moderators.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     */
    private String type;

    /**
     * <p>
     * The <code>AppInstanceUserArn</code>s of the members you want to add to
     * the channel.
     * </p>
     */
    private java.util.List<String> memberArns;

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String chimeBearer;

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
    public BatchCreateChannelMembershipRequest withChannelArn(String channelArn) {
        this.channelArn = channelArn;
        return this;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are always returned as part of
     * <code>ListChannelMemberships</code>. Hidden members are only returned if
     * the type filter in <code>ListChannelMemberships</code> equals
     * <code>HIDDEN</code>. Otherwise hidden members are not returned. This is
     * only supported by moderators.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @return <p>
     *         The membership type of a user, <code>DEFAULT</code> or
     *         <code>HIDDEN</code>. Default members are always returned as part
     *         of <code>ListChannelMemberships</code>. Hidden members are only
     *         returned if the type filter in
     *         <code>ListChannelMemberships</code> equals <code>HIDDEN</code>.
     *         Otherwise hidden members are not returned. This is only supported
     *         by moderators.
     *         </p>
     * @see ChannelMembershipType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are always returned as part of
     * <code>ListChannelMemberships</code>. Hidden members are only returned if
     * the type filter in <code>ListChannelMemberships</code> equals
     * <code>HIDDEN</code>. Otherwise hidden members are not returned. This is
     * only supported by moderators.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership type of a user, <code>DEFAULT</code> or
     *            <code>HIDDEN</code>. Default members are always returned as
     *            part of <code>ListChannelMemberships</code>. Hidden members
     *            are only returned if the type filter in
     *            <code>ListChannelMemberships</code> equals <code>HIDDEN</code>
     *            . Otherwise hidden members are not returned. This is only
     *            supported by moderators.
     *            </p>
     * @see ChannelMembershipType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are always returned as part of
     * <code>ListChannelMemberships</code>. Hidden members are only returned if
     * the type filter in <code>ListChannelMemberships</code> equals
     * <code>HIDDEN</code>. Otherwise hidden members are not returned. This is
     * only supported by moderators.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership type of a user, <code>DEFAULT</code> or
     *            <code>HIDDEN</code>. Default members are always returned as
     *            part of <code>ListChannelMemberships</code>. Hidden members
     *            are only returned if the type filter in
     *            <code>ListChannelMemberships</code> equals <code>HIDDEN</code>
     *            . Otherwise hidden members are not returned. This is only
     *            supported by moderators.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMembershipType
     */
    public BatchCreateChannelMembershipRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are always returned as part of
     * <code>ListChannelMemberships</code>. Hidden members are only returned if
     * the type filter in <code>ListChannelMemberships</code> equals
     * <code>HIDDEN</code>. Otherwise hidden members are not returned. This is
     * only supported by moderators.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership type of a user, <code>DEFAULT</code> or
     *            <code>HIDDEN</code>. Default members are always returned as
     *            part of <code>ListChannelMemberships</code>. Hidden members
     *            are only returned if the type filter in
     *            <code>ListChannelMemberships</code> equals <code>HIDDEN</code>
     *            . Otherwise hidden members are not returned. This is only
     *            supported by moderators.
     *            </p>
     * @see ChannelMembershipType
     */
    public void setType(ChannelMembershipType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are always returned as part of
     * <code>ListChannelMemberships</code>. Hidden members are only returned if
     * the type filter in <code>ListChannelMemberships</code> equals
     * <code>HIDDEN</code>. Otherwise hidden members are not returned. This is
     * only supported by moderators.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership type of a user, <code>DEFAULT</code> or
     *            <code>HIDDEN</code>. Default members are always returned as
     *            part of <code>ListChannelMemberships</code>. Hidden members
     *            are only returned if the type filter in
     *            <code>ListChannelMemberships</code> equals <code>HIDDEN</code>
     *            . Otherwise hidden members are not returned. This is only
     *            supported by moderators.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMembershipType
     */
    public BatchCreateChannelMembershipRequest withType(ChannelMembershipType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code>s of the members you want to add to
     * the channel.
     * </p>
     *
     * @return <p>
     *         The <code>AppInstanceUserArn</code>s of the members you want to
     *         add to the channel.
     *         </p>
     */
    public java.util.List<String> getMemberArns() {
        return memberArns;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code>s of the members you want to add to
     * the channel.
     * </p>
     *
     * @param memberArns <p>
     *            The <code>AppInstanceUserArn</code>s of the members you want
     *            to add to the channel.
     *            </p>
     */
    public void setMemberArns(java.util.Collection<String> memberArns) {
        if (memberArns == null) {
            this.memberArns = null;
            return;
        }

        this.memberArns = new java.util.ArrayList<String>(memberArns);
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code>s of the members you want to add to
     * the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memberArns <p>
     *            The <code>AppInstanceUserArn</code>s of the members you want
     *            to add to the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCreateChannelMembershipRequest withMemberArns(String... memberArns) {
        if (getMemberArns() == null) {
            this.memberArns = new java.util.ArrayList<String>(memberArns.length);
        }
        for (String value : memberArns) {
            this.memberArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code>s of the members you want to add to
     * the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memberArns <p>
     *            The <code>AppInstanceUserArn</code>s of the members you want
     *            to add to the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCreateChannelMembershipRequest withMemberArns(
            java.util.Collection<String> memberArns) {
        setMemberArns(memberArns);
        return this;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The <code>AppInstanceUserArn</code> of the user that makes the
     *         API call.
     *         </p>
     */
    public String getChimeBearer() {
        return chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param chimeBearer <p>
     *            The <code>AppInstanceUserArn</code> of the user that makes the
     *            API call.
     *            </p>
     */
    public void setChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
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
     * @param chimeBearer <p>
     *            The <code>AppInstanceUserArn</code> of the user that makes the
     *            API call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCreateChannelMembershipRequest withChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: " + getChannelArn() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getMemberArns() != null)
            sb.append("MemberArns: " + getMemberArns() + ",");
        if (getChimeBearer() != null)
            sb.append("ChimeBearer: " + getChimeBearer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMemberArns() == null) ? 0 : getMemberArns().hashCode());
        hashCode = prime * hashCode
                + ((getChimeBearer() == null) ? 0 : getChimeBearer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreateChannelMembershipRequest == false)
            return false;
        BatchCreateChannelMembershipRequest other = (BatchCreateChannelMembershipRequest) obj;

        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null
                && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMemberArns() == null ^ this.getMemberArns() == null)
            return false;
        if (other.getMemberArns() != null
                && other.getMemberArns().equals(this.getMemberArns()) == false)
            return false;
        if (other.getChimeBearer() == null ^ this.getChimeBearer() == null)
            return false;
        if (other.getChimeBearer() != null
                && other.getChimeBearer().equals(this.getChimeBearer()) == false)
            return false;
        return true;
    }
}

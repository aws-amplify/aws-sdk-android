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

public class PutChannelMembershipPreferencesResult implements Serializable {
    /**
     * <p>
     * The ARN of the channel.
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
     * The details of a user.
     * </p>
     */
    private Identity member;

    /**
     * <p>
     * The ARN and metadata of the member being added.
     * </p>
     */
    private ChannelMembershipPreferences preferences;

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the channel.
     *         </p>
     */
    public String getChannelArn() {
        return channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param channelArn <p>
     *            The ARN of the channel.
     *            </p>
     */
    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
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
     *            The ARN of the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutChannelMembershipPreferencesResult withChannelArn(String channelArn) {
        this.channelArn = channelArn;
        return this;
    }

    /**
     * <p>
     * The details of a user.
     * </p>
     *
     * @return <p>
     *         The details of a user.
     *         </p>
     */
    public Identity getMember() {
        return member;
    }

    /**
     * <p>
     * The details of a user.
     * </p>
     *
     * @param member <p>
     *            The details of a user.
     *            </p>
     */
    public void setMember(Identity member) {
        this.member = member;
    }

    /**
     * <p>
     * The details of a user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param member <p>
     *            The details of a user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutChannelMembershipPreferencesResult withMember(Identity member) {
        this.member = member;
        return this;
    }

    /**
     * <p>
     * The ARN and metadata of the member being added.
     * </p>
     *
     * @return <p>
     *         The ARN and metadata of the member being added.
     *         </p>
     */
    public ChannelMembershipPreferences getPreferences() {
        return preferences;
    }

    /**
     * <p>
     * The ARN and metadata of the member being added.
     * </p>
     *
     * @param preferences <p>
     *            The ARN and metadata of the member being added.
     *            </p>
     */
    public void setPreferences(ChannelMembershipPreferences preferences) {
        this.preferences = preferences;
    }

    /**
     * <p>
     * The ARN and metadata of the member being added.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferences <p>
     *            The ARN and metadata of the member being added.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutChannelMembershipPreferencesResult withPreferences(
            ChannelMembershipPreferences preferences) {
        this.preferences = preferences;
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
        if (getMember() != null)
            sb.append("Member: " + getMember() + ",");
        if (getPreferences() != null)
            sb.append("Preferences: " + getPreferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getMember() == null) ? 0 : getMember().hashCode());
        hashCode = prime * hashCode
                + ((getPreferences() == null) ? 0 : getPreferences().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutChannelMembershipPreferencesResult == false)
            return false;
        PutChannelMembershipPreferencesResult other = (PutChannelMembershipPreferencesResult) obj;

        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null
                && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getMember() == null ^ this.getMember() == null)
            return false;
        if (other.getMember() != null && other.getMember().equals(this.getMember()) == false)
            return false;
        if (other.getPreferences() == null ^ this.getPreferences() == null)
            return false;
        if (other.getPreferences() != null
                && other.getPreferences().equals(this.getPreferences()) == false)
            return false;
        return true;
    }
}

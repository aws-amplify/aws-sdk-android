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
 * Summary of the channel membership details of an <code>AppInstanceUser</code>.
 * </p>
 */
public class ChannelMembershipForAppInstanceUserSummary implements Serializable {
    /**
     * <p>
     * Returns the channel data for an <code>AppInstance</code>.
     * </p>
     */
    private ChannelSummary channelSummary;

    /**
     * <p>
     * Returns the channel membership data for an <code>AppInstance</code>.
     * </p>
     */
    private AppInstanceUserMembershipSummary appInstanceUserMembershipSummary;

    /**
     * <p>
     * Returns the channel data for an <code>AppInstance</code>.
     * </p>
     *
     * @return <p>
     *         Returns the channel data for an <code>AppInstance</code>.
     *         </p>
     */
    public ChannelSummary getChannelSummary() {
        return channelSummary;
    }

    /**
     * <p>
     * Returns the channel data for an <code>AppInstance</code>.
     * </p>
     *
     * @param channelSummary <p>
     *            Returns the channel data for an <code>AppInstance</code>.
     *            </p>
     */
    public void setChannelSummary(ChannelSummary channelSummary) {
        this.channelSummary = channelSummary;
    }

    /**
     * <p>
     * Returns the channel data for an <code>AppInstance</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelSummary <p>
     *            Returns the channel data for an <code>AppInstance</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMembershipForAppInstanceUserSummary withChannelSummary(
            ChannelSummary channelSummary) {
        this.channelSummary = channelSummary;
        return this;
    }

    /**
     * <p>
     * Returns the channel membership data for an <code>AppInstance</code>.
     * </p>
     *
     * @return <p>
     *         Returns the channel membership data for an
     *         <code>AppInstance</code>.
     *         </p>
     */
    public AppInstanceUserMembershipSummary getAppInstanceUserMembershipSummary() {
        return appInstanceUserMembershipSummary;
    }

    /**
     * <p>
     * Returns the channel membership data for an <code>AppInstance</code>.
     * </p>
     *
     * @param appInstanceUserMembershipSummary <p>
     *            Returns the channel membership data for an
     *            <code>AppInstance</code>.
     *            </p>
     */
    public void setAppInstanceUserMembershipSummary(
            AppInstanceUserMembershipSummary appInstanceUserMembershipSummary) {
        this.appInstanceUserMembershipSummary = appInstanceUserMembershipSummary;
    }

    /**
     * <p>
     * Returns the channel membership data for an <code>AppInstance</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appInstanceUserMembershipSummary <p>
     *            Returns the channel membership data for an
     *            <code>AppInstance</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMembershipForAppInstanceUserSummary withAppInstanceUserMembershipSummary(
            AppInstanceUserMembershipSummary appInstanceUserMembershipSummary) {
        this.appInstanceUserMembershipSummary = appInstanceUserMembershipSummary;
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
        if (getChannelSummary() != null)
            sb.append("ChannelSummary: " + getChannelSummary() + ",");
        if (getAppInstanceUserMembershipSummary() != null)
            sb.append("AppInstanceUserMembershipSummary: " + getAppInstanceUserMembershipSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChannelSummary() == null) ? 0 : getChannelSummary().hashCode());
        hashCode = prime
                * hashCode
                + ((getAppInstanceUserMembershipSummary() == null) ? 0
                        : getAppInstanceUserMembershipSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelMembershipForAppInstanceUserSummary == false)
            return false;
        ChannelMembershipForAppInstanceUserSummary other = (ChannelMembershipForAppInstanceUserSummary) obj;

        if (other.getChannelSummary() == null ^ this.getChannelSummary() == null)
            return false;
        if (other.getChannelSummary() != null
                && other.getChannelSummary().equals(this.getChannelSummary()) == false)
            return false;
        if (other.getAppInstanceUserMembershipSummary() == null
                ^ this.getAppInstanceUserMembershipSummary() == null)
            return false;
        if (other.getAppInstanceUserMembershipSummary() != null
                && other.getAppInstanceUserMembershipSummary().equals(
                        this.getAppInstanceUserMembershipSummary()) == false)
            return false;
        return true;
    }
}

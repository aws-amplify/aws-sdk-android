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

public class DescribeChannelModeratorResult implements Serializable {
    /**
     * <p>
     * The details of the channel moderator.
     * </p>
     */
    private ChannelModerator channelModerator;

    /**
     * <p>
     * The details of the channel moderator.
     * </p>
     *
     * @return <p>
     *         The details of the channel moderator.
     *         </p>
     */
    public ChannelModerator getChannelModerator() {
        return channelModerator;
    }

    /**
     * <p>
     * The details of the channel moderator.
     * </p>
     *
     * @param channelModerator <p>
     *            The details of the channel moderator.
     *            </p>
     */
    public void setChannelModerator(ChannelModerator channelModerator) {
        this.channelModerator = channelModerator;
    }

    /**
     * <p>
     * The details of the channel moderator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelModerator <p>
     *            The details of the channel moderator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChannelModeratorResult withChannelModerator(ChannelModerator channelModerator) {
        this.channelModerator = channelModerator;
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
        if (getChannelModerator() != null)
            sb.append("ChannelModerator: " + getChannelModerator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChannelModerator() == null) ? 0 : getChannelModerator().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChannelModeratorResult == false)
            return false;
        DescribeChannelModeratorResult other = (DescribeChannelModeratorResult) obj;

        if (other.getChannelModerator() == null ^ this.getChannelModerator() == null)
            return false;
        if (other.getChannelModerator() != null
                && other.getChannelModerator().equals(this.getChannelModerator()) == false)
            return false;
        return true;
    }
}

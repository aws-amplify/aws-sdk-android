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
 * Summary of the details of a moderated channel.
 * </p>
 */
public class ChannelModeratedByAppInstanceUserSummary implements Serializable {
    /**
     * <p>
     * Summary of the details of a <code>Channel</code>.
     * </p>
     */
    private ChannelSummary channelSummary;

    /**
     * <p>
     * Summary of the details of a <code>Channel</code>.
     * </p>
     *
     * @return <p>
     *         Summary of the details of a <code>Channel</code>.
     *         </p>
     */
    public ChannelSummary getChannelSummary() {
        return channelSummary;
    }

    /**
     * <p>
     * Summary of the details of a <code>Channel</code>.
     * </p>
     *
     * @param channelSummary <p>
     *            Summary of the details of a <code>Channel</code>.
     *            </p>
     */
    public void setChannelSummary(ChannelSummary channelSummary) {
        this.channelSummary = channelSummary;
    }

    /**
     * <p>
     * Summary of the details of a <code>Channel</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelSummary <p>
     *            Summary of the details of a <code>Channel</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelModeratedByAppInstanceUserSummary withChannelSummary(ChannelSummary channelSummary) {
        this.channelSummary = channelSummary;
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
            sb.append("ChannelSummary: " + getChannelSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChannelSummary() == null) ? 0 : getChannelSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelModeratedByAppInstanceUserSummary == false)
            return false;
        ChannelModeratedByAppInstanceUserSummary other = (ChannelModeratedByAppInstanceUserSummary) obj;

        if (other.getChannelSummary() == null ^ this.getChannelSummary() == null)
            return false;
        if (other.getChannelSummary() != null
                && other.getChannelSummary().equals(this.getChannelSummary()) == false)
            return false;
        return true;
    }
}

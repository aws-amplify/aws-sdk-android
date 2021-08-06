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

public class DescribeChannelBanResult implements Serializable {
    /**
     * <p>
     * The details of the ban.
     * </p>
     */
    private ChannelBan channelBan;

    /**
     * <p>
     * The details of the ban.
     * </p>
     *
     * @return <p>
     *         The details of the ban.
     *         </p>
     */
    public ChannelBan getChannelBan() {
        return channelBan;
    }

    /**
     * <p>
     * The details of the ban.
     * </p>
     *
     * @param channelBan <p>
     *            The details of the ban.
     *            </p>
     */
    public void setChannelBan(ChannelBan channelBan) {
        this.channelBan = channelBan;
    }

    /**
     * <p>
     * The details of the ban.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelBan <p>
     *            The details of the ban.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChannelBanResult withChannelBan(ChannelBan channelBan) {
        this.channelBan = channelBan;
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
        if (getChannelBan() != null)
            sb.append("ChannelBan: " + getChannelBan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelBan() == null) ? 0 : getChannelBan().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChannelBanResult == false)
            return false;
        DescribeChannelBanResult other = (DescribeChannelBanResult) obj;

        if (other.getChannelBan() == null ^ this.getChannelBan() == null)
            return false;
        if (other.getChannelBan() != null
                && other.getChannelBan().equals(this.getChannelBan()) == false)
            return false;
        return true;
    }
}

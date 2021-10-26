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

public class DescribeChannelFlowResult implements Serializable {
    /**
     * <p>
     * The channel flow details.
     * </p>
     */
    private ChannelFlow channelFlow;

    /**
     * <p>
     * The channel flow details.
     * </p>
     *
     * @return <p>
     *         The channel flow details.
     *         </p>
     */
    public ChannelFlow getChannelFlow() {
        return channelFlow;
    }

    /**
     * <p>
     * The channel flow details.
     * </p>
     *
     * @param channelFlow <p>
     *            The channel flow details.
     *            </p>
     */
    public void setChannelFlow(ChannelFlow channelFlow) {
        this.channelFlow = channelFlow;
    }

    /**
     * <p>
     * The channel flow details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelFlow <p>
     *            The channel flow details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChannelFlowResult withChannelFlow(ChannelFlow channelFlow) {
        this.channelFlow = channelFlow;
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
        if (getChannelFlow() != null)
            sb.append("ChannelFlow: " + getChannelFlow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChannelFlow() == null) ? 0 : getChannelFlow().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChannelFlowResult == false)
            return false;
        DescribeChannelFlowResult other = (DescribeChannelFlowResult) obj;

        if (other.getChannelFlow() == null ^ this.getChannelFlow() == null)
            return false;
        if (other.getChannelFlow() != null
                && other.getChannelFlow().equals(this.getChannelFlow()) == false)
            return false;
        return true;
    }
}

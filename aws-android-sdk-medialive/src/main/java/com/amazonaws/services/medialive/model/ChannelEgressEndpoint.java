/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for ChannelEgressEndpoint
 */
public class ChannelEgressEndpoint implements Serializable {
    /**
     * Public IP of where a channel's output comes from
     */
    private String sourceIp;

    /**
     * Public IP of where a channel's output comes from
     *
     * @return Public IP of where a channel's output comes from
     */
    public String getSourceIp() {
        return sourceIp;
    }

    /**
     * Public IP of where a channel's output comes from
     *
     * @param sourceIp Public IP of where a channel's output comes from
     */
    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    /**
     * Public IP of where a channel's output comes from
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceIp Public IP of where a channel's output comes from
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelEgressEndpoint withSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
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
        if (getSourceIp() != null)
            sb.append("SourceIp: " + getSourceIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceIp() == null) ? 0 : getSourceIp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelEgressEndpoint == false)
            return false;
        ChannelEgressEndpoint other = (ChannelEgressEndpoint) obj;

        if (other.getSourceIp() == null ^ this.getSourceIp() == null)
            return false;
        if (other.getSourceIp() != null && other.getSourceIp().equals(this.getSourceIp()) == false)
            return false;
        return true;
    }
}

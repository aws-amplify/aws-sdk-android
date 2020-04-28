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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Delete all schedule actions on a channel.
 */
public class DeleteScheduleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Id of the channel whose schedule is being deleted.
     */
    private String channelId;

    /**
     * Id of the channel whose schedule is being deleted.
     *
     * @return Id of the channel whose schedule is being deleted.
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Id of the channel whose schedule is being deleted.
     *
     * @param channelId Id of the channel whose schedule is being deleted.
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * Id of the channel whose schedule is being deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelId Id of the channel whose schedule is being deleted.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteScheduleRequest withChannelId(String channelId) {
        this.channelId = channelId;
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
        if (getChannelId() != null)
            sb.append("ChannelId: " + getChannelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteScheduleRequest == false)
            return false;
        DeleteScheduleRequest other = (DeleteScheduleRequest) obj;

        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null
                && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        return true;
    }
}

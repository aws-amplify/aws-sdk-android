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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Changes the class of the channel.
 */
public class UpdateChannelClassRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The channel class that you wish to update this channel to use.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     */
    private String channelClass;

    /**
     * Channel Id of the channel whose class should be updated.
     */
    private String channelId;

    /**
     * A list of output destinations for this channel.
     */
    private java.util.List<OutputDestination> destinations;

    /**
     * The channel class that you wish to update this channel to use.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @return The channel class that you wish to update this channel to use.
     * @see ChannelClass
     */
    public String getChannelClass() {
        return channelClass;
    }

    /**
     * The channel class that you wish to update this channel to use.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @param channelClass The channel class that you wish to update this
     *            channel to use.
     * @see ChannelClass
     */
    public void setChannelClass(String channelClass) {
        this.channelClass = channelClass;
    }

    /**
     * The channel class that you wish to update this channel to use.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @param channelClass The channel class that you wish to update this
     *            channel to use.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelClass
     */
    public UpdateChannelClassRequest withChannelClass(String channelClass) {
        this.channelClass = channelClass;
        return this;
    }

    /**
     * The channel class that you wish to update this channel to use.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @param channelClass The channel class that you wish to update this
     *            channel to use.
     * @see ChannelClass
     */
    public void setChannelClass(ChannelClass channelClass) {
        this.channelClass = channelClass.toString();
    }

    /**
     * The channel class that you wish to update this channel to use.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @param channelClass The channel class that you wish to update this
     *            channel to use.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelClass
     */
    public UpdateChannelClassRequest withChannelClass(ChannelClass channelClass) {
        this.channelClass = channelClass.toString();
        return this;
    }

    /**
     * Channel Id of the channel whose class should be updated.
     *
     * @return Channel Id of the channel whose class should be updated.
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Channel Id of the channel whose class should be updated.
     *
     * @param channelId Channel Id of the channel whose class should be updated.
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * Channel Id of the channel whose class should be updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelId Channel Id of the channel whose class should be updated.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateChannelClassRequest withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * A list of output destinations for this channel.
     *
     * @return A list of output destinations for this channel.
     */
    public java.util.List<OutputDestination> getDestinations() {
        return destinations;
    }

    /**
     * A list of output destinations for this channel.
     *
     * @param destinations A list of output destinations for this channel.
     */
    public void setDestinations(java.util.Collection<OutputDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<OutputDestination>(destinations);
    }

    /**
     * A list of output destinations for this channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations A list of output destinations for this channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateChannelClassRequest withDestinations(OutputDestination... destinations) {
        if (getDestinations() == null) {
            this.destinations = new java.util.ArrayList<OutputDestination>(destinations.length);
        }
        for (OutputDestination value : destinations) {
            this.destinations.add(value);
        }
        return this;
    }

    /**
     * A list of output destinations for this channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations A list of output destinations for this channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateChannelClassRequest withDestinations(
            java.util.Collection<OutputDestination> destinations) {
        setDestinations(destinations);
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
        if (getChannelClass() != null)
            sb.append("ChannelClass: " + getChannelClass() + ",");
        if (getChannelId() != null)
            sb.append("ChannelId: " + getChannelId() + ",");
        if (getDestinations() != null)
            sb.append("Destinations: " + getDestinations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChannelClass() == null) ? 0 : getChannelClass().hashCode());
        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode
                + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChannelClassRequest == false)
            return false;
        UpdateChannelClassRequest other = (UpdateChannelClassRequest) obj;

        if (other.getChannelClass() == null ^ this.getChannelClass() == null)
            return false;
        if (other.getChannelClass() != null
                && other.getChannelClass().equals(this.getChannelClass()) == false)
            return false;
        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null
                && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null
                && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        return true;
    }
}

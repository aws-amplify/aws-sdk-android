/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about which channels are supported, and how many
 * contacts an agent can have on a channel simultaneously.
 * </p>
 */
public class MediaConcurrency implements Serializable {
    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     */
    private String channel;

    /**
     * <p>
     * The number of contacts an agent can have on a channel simultaneously.
     * </p>
     * <p>
     * Valid Range for <code>VOICE</code>: Minimum value of 1. Maximum value of
     * 1.
     * </p>
     * <p>
     * Valid Range for <code>CHAT</code>: Minimum value of 1. Maximum value of
     * 10.
     * </p>
     * <p>
     * Valid Range for <code>TASK</code>: Minimum value of 1. Maximum value of
     * 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer concurrency;

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @return <p>
     *         The channels that agents can handle in the Contact Control Panel
     *         (CCP).
     *         </p>
     * @see Channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            The channels that agents can handle in the Contact Control
     *            Panel (CCP).
     *            </p>
     * @see Channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            The channels that agents can handle in the Contact Control
     *            Panel (CCP).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Channel
     */
    public MediaConcurrency withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            The channels that agents can handle in the Contact Control
     *            Panel (CCP).
     *            </p>
     * @see Channel
     */
    public void setChannel(Channel channel) {
        this.channel = channel.toString();
    }

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            The channels that agents can handle in the Contact Control
     *            Panel (CCP).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Channel
     */
    public MediaConcurrency withChannel(Channel channel) {
        this.channel = channel.toString();
        return this;
    }

    /**
     * <p>
     * The number of contacts an agent can have on a channel simultaneously.
     * </p>
     * <p>
     * Valid Range for <code>VOICE</code>: Minimum value of 1. Maximum value of
     * 1.
     * </p>
     * <p>
     * Valid Range for <code>CHAT</code>: Minimum value of 1. Maximum value of
     * 10.
     * </p>
     * <p>
     * Valid Range for <code>TASK</code>: Minimum value of 1. Maximum value of
     * 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return <p>
     *         The number of contacts an agent can have on a channel
     *         simultaneously.
     *         </p>
     *         <p>
     *         Valid Range for <code>VOICE</code>: Minimum value of 1. Maximum
     *         value of 1.
     *         </p>
     *         <p>
     *         Valid Range for <code>CHAT</code>: Minimum value of 1. Maximum
     *         value of 10.
     *         </p>
     *         <p>
     *         Valid Range for <code>TASK</code>: Minimum value of 1. Maximum
     *         value of 10.
     *         </p>
     */
    public Integer getConcurrency() {
        return concurrency;
    }

    /**
     * <p>
     * The number of contacts an agent can have on a channel simultaneously.
     * </p>
     * <p>
     * Valid Range for <code>VOICE</code>: Minimum value of 1. Maximum value of
     * 1.
     * </p>
     * <p>
     * Valid Range for <code>CHAT</code>: Minimum value of 1. Maximum value of
     * 10.
     * </p>
     * <p>
     * Valid Range for <code>TASK</code>: Minimum value of 1. Maximum value of
     * 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param concurrency <p>
     *            The number of contacts an agent can have on a channel
     *            simultaneously.
     *            </p>
     *            <p>
     *            Valid Range for <code>VOICE</code>: Minimum value of 1.
     *            Maximum value of 1.
     *            </p>
     *            <p>
     *            Valid Range for <code>CHAT</code>: Minimum value of 1. Maximum
     *            value of 10.
     *            </p>
     *            <p>
     *            Valid Range for <code>TASK</code>: Minimum value of 1. Maximum
     *            value of 10.
     *            </p>
     */
    public void setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
    }

    /**
     * <p>
     * The number of contacts an agent can have on a channel simultaneously.
     * </p>
     * <p>
     * Valid Range for <code>VOICE</code>: Minimum value of 1. Maximum value of
     * 1.
     * </p>
     * <p>
     * Valid Range for <code>CHAT</code>: Minimum value of 1. Maximum value of
     * 10.
     * </p>
     * <p>
     * Valid Range for <code>TASK</code>: Minimum value of 1. Maximum value of
     * 10.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param concurrency <p>
     *            The number of contacts an agent can have on a channel
     *            simultaneously.
     *            </p>
     *            <p>
     *            Valid Range for <code>VOICE</code>: Minimum value of 1.
     *            Maximum value of 1.
     *            </p>
     *            <p>
     *            Valid Range for <code>CHAT</code>: Minimum value of 1. Maximum
     *            value of 10.
     *            </p>
     *            <p>
     *            Valid Range for <code>TASK</code>: Minimum value of 1. Maximum
     *            value of 10.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaConcurrency withConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
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
        if (getChannel() != null)
            sb.append("Channel: " + getChannel() + ",");
        if (getConcurrency() != null)
            sb.append("Concurrency: " + getConcurrency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode
                + ((getConcurrency() == null) ? 0 : getConcurrency().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaConcurrency == false)
            return false;
        MediaConcurrency other = (MediaConcurrency) obj;

        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getConcurrency() == null ^ this.getConcurrency() == null)
            return false;
        if (other.getConcurrency() != null
                && other.getConcurrency().equals(this.getConcurrency()) == false)
            return false;
        return true;
    }
}

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

package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;

/**
 * <p>
 * The details of the data-retention settings for an <code>AppInstance</code>.
 * </p>
 */
public class AppInstanceRetentionSettings implements Serializable {
    /**
     * <p>
     * The length of time in days to retain the messages in a channel.
     * </p>
     */
    private ChannelRetentionSettings channelRetentionSettings;

    /**
     * <p>
     * The length of time in days to retain the messages in a channel.
     * </p>
     *
     * @return <p>
     *         The length of time in days to retain the messages in a channel.
     *         </p>
     */
    public ChannelRetentionSettings getChannelRetentionSettings() {
        return channelRetentionSettings;
    }

    /**
     * <p>
     * The length of time in days to retain the messages in a channel.
     * </p>
     *
     * @param channelRetentionSettings <p>
     *            The length of time in days to retain the messages in a
     *            channel.
     *            </p>
     */
    public void setChannelRetentionSettings(ChannelRetentionSettings channelRetentionSettings) {
        this.channelRetentionSettings = channelRetentionSettings;
    }

    /**
     * <p>
     * The length of time in days to retain the messages in a channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelRetentionSettings <p>
     *            The length of time in days to retain the messages in a
     *            channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppInstanceRetentionSettings withChannelRetentionSettings(
            ChannelRetentionSettings channelRetentionSettings) {
        this.channelRetentionSettings = channelRetentionSettings;
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
        if (getChannelRetentionSettings() != null)
            sb.append("ChannelRetentionSettings: " + getChannelRetentionSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getChannelRetentionSettings() == null) ? 0 : getChannelRetentionSettings()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppInstanceRetentionSettings == false)
            return false;
        AppInstanceRetentionSettings other = (AppInstanceRetentionSettings) obj;

        if (other.getChannelRetentionSettings() == null
                ^ this.getChannelRetentionSettings() == null)
            return false;
        if (other.getChannelRetentionSettings() != null
                && other.getChannelRetentionSettings().equals(this.getChannelRetentionSettings()) == false)
            return false;
        return true;
    }
}

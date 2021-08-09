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
 * The details of the retention settings for a channel.
 * </p>
 */
public class ChannelRetentionSettings implements Serializable {
    /**
     * <p>
     * The time in days to retain the messages in a channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5475<br/>
     */
    private Integer retentionDays;

    /**
     * <p>
     * The time in days to retain the messages in a channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5475<br/>
     *
     * @return <p>
     *         The time in days to retain the messages in a channel.
     *         </p>
     */
    public Integer getRetentionDays() {
        return retentionDays;
    }

    /**
     * <p>
     * The time in days to retain the messages in a channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5475<br/>
     *
     * @param retentionDays <p>
     *            The time in days to retain the messages in a channel.
     *            </p>
     */
    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    /**
     * <p>
     * The time in days to retain the messages in a channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5475<br/>
     *
     * @param retentionDays <p>
     *            The time in days to retain the messages in a channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelRetentionSettings withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
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
        if (getRetentionDays() != null)
            sb.append("RetentionDays: " + getRetentionDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRetentionDays() == null) ? 0 : getRetentionDays().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelRetentionSettings == false)
            return false;
        ChannelRetentionSettings other = (ChannelRetentionSettings) obj;

        if (other.getRetentionDays() == null ^ this.getRetentionDays() == null)
            return false;
        if (other.getRetentionDays() != null
                && other.getRetentionDays().equals(this.getRetentionDays()) == false)
            return false;
        return true;
    }
}

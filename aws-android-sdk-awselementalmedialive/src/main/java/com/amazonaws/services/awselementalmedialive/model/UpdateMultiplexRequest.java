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
 * Updates a multiplex.
 */
public class UpdateMultiplexRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * ID of the multiplex to update.
     */
    private String multiplexId;

    /**
     * The new settings for a multiplex.
     */
    private MultiplexSettings multiplexSettings;

    /**
     * Name of the multiplex.
     */
    private String name;

    /**
     * ID of the multiplex to update.
     *
     * @return ID of the multiplex to update.
     */
    public String getMultiplexId() {
        return multiplexId;
    }

    /**
     * ID of the multiplex to update.
     *
     * @param multiplexId ID of the multiplex to update.
     */
    public void setMultiplexId(String multiplexId) {
        this.multiplexId = multiplexId;
    }

    /**
     * ID of the multiplex to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiplexId ID of the multiplex to update.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMultiplexRequest withMultiplexId(String multiplexId) {
        this.multiplexId = multiplexId;
        return this;
    }

    /**
     * The new settings for a multiplex.
     *
     * @return The new settings for a multiplex.
     */
    public MultiplexSettings getMultiplexSettings() {
        return multiplexSettings;
    }

    /**
     * The new settings for a multiplex.
     *
     * @param multiplexSettings The new settings for a multiplex.
     */
    public void setMultiplexSettings(MultiplexSettings multiplexSettings) {
        this.multiplexSettings = multiplexSettings;
    }

    /**
     * The new settings for a multiplex.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiplexSettings The new settings for a multiplex.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMultiplexRequest withMultiplexSettings(MultiplexSettings multiplexSettings) {
        this.multiplexSettings = multiplexSettings;
        return this;
    }

    /**
     * Name of the multiplex.
     *
     * @return Name of the multiplex.
     */
    public String getName() {
        return name;
    }

    /**
     * Name of the multiplex.
     *
     * @param name Name of the multiplex.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name of the multiplex.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name Name of the multiplex.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMultiplexRequest withName(String name) {
        this.name = name;
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
        if (getMultiplexId() != null)
            sb.append("MultiplexId: " + getMultiplexId() + ",");
        if (getMultiplexSettings() != null)
            sb.append("MultiplexSettings: " + getMultiplexSettings() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMultiplexId() == null) ? 0 : getMultiplexId().hashCode());
        hashCode = prime * hashCode
                + ((getMultiplexSettings() == null) ? 0 : getMultiplexSettings().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMultiplexRequest == false)
            return false;
        UpdateMultiplexRequest other = (UpdateMultiplexRequest) obj;

        if (other.getMultiplexId() == null ^ this.getMultiplexId() == null)
            return false;
        if (other.getMultiplexId() != null
                && other.getMultiplexId().equals(this.getMultiplexId()) == false)
            return false;
        if (other.getMultiplexSettings() == null ^ this.getMultiplexSettings() == null)
            return false;
        if (other.getMultiplexSettings() != null
                && other.getMultiplexSettings().equals(this.getMultiplexSettings()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}

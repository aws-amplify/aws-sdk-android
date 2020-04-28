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
 * Create a new multiplex.
 */
public class CreateMultiplexRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * A list of availability zones for the multiplex. You must specify exactly
     * two.
     */
    private java.util.List<String> availabilityZones;

    /**
     * Configuration for a multiplex event.
     */
    private MultiplexSettings multiplexSettings;

    /**
     * Name of multiplex.
     */
    private String name;

    /**
     * Unique request ID. This prevents retries from creating multiple
     * resources.
     */
    private String requestId;

    /**
     * A collection of key-value pairs.
     */
    private java.util.Map<String, String> tags;

    /**
     * A list of availability zones for the multiplex. You must specify exactly
     * two.
     *
     * @return A list of availability zones for the multiplex. You must specify
     *         exactly two.
     */
    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * A list of availability zones for the multiplex. You must specify exactly
     * two.
     *
     * @param availabilityZones A list of availability zones for the multiplex.
     *            You must specify exactly two.
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * A list of availability zones for the multiplex. You must specify exactly
     * two.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones A list of availability zones for the multiplex.
     *            You must specify exactly two.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultiplexRequest withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) {
            this.availabilityZones = new java.util.ArrayList<String>(availabilityZones.length);
        }
        for (String value : availabilityZones) {
            this.availabilityZones.add(value);
        }
        return this;
    }

    /**
     * A list of availability zones for the multiplex. You must specify exactly
     * two.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones A list of availability zones for the multiplex.
     *            You must specify exactly two.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultiplexRequest withAvailabilityZones(
            java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * Configuration for a multiplex event.
     *
     * @return Configuration for a multiplex event.
     */
    public MultiplexSettings getMultiplexSettings() {
        return multiplexSettings;
    }

    /**
     * Configuration for a multiplex event.
     *
     * @param multiplexSettings Configuration for a multiplex event.
     */
    public void setMultiplexSettings(MultiplexSettings multiplexSettings) {
        this.multiplexSettings = multiplexSettings;
    }

    /**
     * Configuration for a multiplex event.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiplexSettings Configuration for a multiplex event.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultiplexRequest withMultiplexSettings(MultiplexSettings multiplexSettings) {
        this.multiplexSettings = multiplexSettings;
        return this;
    }

    /**
     * Name of multiplex.
     *
     * @return Name of multiplex.
     */
    public String getName() {
        return name;
    }

    /**
     * Name of multiplex.
     *
     * @param name Name of multiplex.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name of multiplex.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name Name of multiplex.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultiplexRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Unique request ID. This prevents retries from creating multiple
     * resources.
     * 
     * @return Unique request ID. This prevents retries from creating multiple
     *         resources.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Unique request ID. This prevents retries from creating multiple
     * resources.
     * 
     * @param requestId Unique request ID. This prevents retries from creating
     *            multiple resources.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Unique request ID. This prevents retries from creating multiple
     * resources. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId Unique request ID. This prevents retries from creating
     *            multiple resources. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultiplexRequest withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * A collection of key-value pairs.
     *
     * @return A collection of key-value pairs.
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * A collection of key-value pairs.
     *
     * @param tags A collection of key-value pairs.
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * A collection of key-value pairs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags A collection of key-value pairs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultiplexRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * A collection of key-value pairs.
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultiplexRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateMultiplexRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getMultiplexSettings() != null)
            sb.append("MultiplexSettings: " + getMultiplexSettings() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRequestId() != null)
            sb.append("RequestId: " + getRequestId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode
                + ((getMultiplexSettings() == null) ? 0 : getMultiplexSettings().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMultiplexRequest == false)
            return false;
        CreateMultiplexRequest other = (CreateMultiplexRequest) obj;

        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
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
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}

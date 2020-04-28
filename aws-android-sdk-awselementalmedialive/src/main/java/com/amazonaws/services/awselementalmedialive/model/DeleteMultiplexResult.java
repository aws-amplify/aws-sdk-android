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

/**
 * Placeholder documentation for DeleteMultiplexResponse
 */
public class DeleteMultiplexResult implements Serializable {
    /**
     * The unique arn of the multiplex.
     */
    private String arn;

    /**
     * A list of availability zones for the multiplex.
     */
    private java.util.List<String> availabilityZones;

    /**
     * A list of the multiplex output destinations.
     */
    private java.util.List<MultiplexOutputDestination> destinations;

    /**
     * The unique id of the multiplex.
     */
    private String id;

    /**
     * Configuration for a multiplex event.
     */
    private MultiplexSettings multiplexSettings;

    /**
     * The name of the multiplex.
     */
    private String name;

    /**
     * The number of currently healthy pipelines.
     */
    private Integer pipelinesRunningCount;

    /**
     * The number of programs in the multiplex.
     */
    private Integer programCount;

    /**
     * The current state of the multiplex.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING,
     * RECOVERING, STOPPING, DELETING, DELETED
     */
    private String state;

    /**
     * A collection of key-value pairs.
     */
    private java.util.Map<String, String> tags;

    /**
     * The unique arn of the multiplex.
     *
     * @return The unique arn of the multiplex.
     */
    public String getArn() {
        return arn;
    }

    /**
     * The unique arn of the multiplex.
     *
     * @param arn The unique arn of the multiplex.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The unique arn of the multiplex.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn The unique arn of the multiplex.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMultiplexResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * A list of availability zones for the multiplex.
     *
     * @return A list of availability zones for the multiplex.
     */
    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * A list of availability zones for the multiplex.
     *
     * @param availabilityZones A list of availability zones for the multiplex.
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * A list of availability zones for the multiplex.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones A list of availability zones for the multiplex.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMultiplexResult withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) {
            this.availabilityZones = new java.util.ArrayList<String>(availabilityZones.length);
        }
        for (String value : availabilityZones) {
            this.availabilityZones.add(value);
        }
        return this;
    }

    /**
     * A list of availability zones for the multiplex.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones A list of availability zones for the multiplex.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMultiplexResult withAvailabilityZones(
            java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * A list of the multiplex output destinations.
     *
     * @return A list of the multiplex output destinations.
     */
    public java.util.List<MultiplexOutputDestination> getDestinations() {
        return destinations;
    }

    /**
     * A list of the multiplex output destinations.
     *
     * @param destinations A list of the multiplex output destinations.
     */
    public void setDestinations(java.util.Collection<MultiplexOutputDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<MultiplexOutputDestination>(destinations);
    }

    /**
     * A list of the multiplex output destinations.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations A list of the multiplex output destinations.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMultiplexResult withDestinations(MultiplexOutputDestination... destinations) {
        if (getDestinations() == null) {
            this.destinations = new java.util.ArrayList<MultiplexOutputDestination>(
                    destinations.length);
        }
        for (MultiplexOutputDestination value : destinations) {
            this.destinations.add(value);
        }
        return this;
    }

    /**
     * A list of the multiplex output destinations.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations A list of the multiplex output destinations.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMultiplexResult withDestinations(
            java.util.Collection<MultiplexOutputDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * The unique id of the multiplex.
     *
     * @return The unique id of the multiplex.
     */
    public String getId() {
        return id;
    }

    /**
     * The unique id of the multiplex.
     *
     * @param id The unique id of the multiplex.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique id of the multiplex.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id The unique id of the multiplex.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMultiplexResult withId(String id) {
        this.id = id;
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
    public DeleteMultiplexResult withMultiplexSettings(MultiplexSettings multiplexSettings) {
        this.multiplexSettings = multiplexSettings;
        return this;
    }

    /**
     * The name of the multiplex.
     *
     * @return The name of the multiplex.
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the multiplex.
     *
     * @param name The name of the multiplex.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the multiplex.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name The name of the multiplex.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMultiplexResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The number of currently healthy pipelines.
     *
     * @return The number of currently healthy pipelines.
     */
    public Integer getPipelinesRunningCount() {
        return pipelinesRunningCount;
    }

    /**
     * The number of currently healthy pipelines.
     *
     * @param pipelinesRunningCount The number of currently healthy pipelines.
     */
    public void setPipelinesRunningCount(Integer pipelinesRunningCount) {
        this.pipelinesRunningCount = pipelinesRunningCount;
    }

    /**
     * The number of currently healthy pipelines.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pipelinesRunningCount The number of currently healthy pipelines.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMultiplexResult withPipelinesRunningCount(Integer pipelinesRunningCount) {
        this.pipelinesRunningCount = pipelinesRunningCount;
        return this;
    }

    /**
     * The number of programs in the multiplex.
     *
     * @return The number of programs in the multiplex.
     */
    public Integer getProgramCount() {
        return programCount;
    }

    /**
     * The number of programs in the multiplex.
     *
     * @param programCount The number of programs in the multiplex.
     */
    public void setProgramCount(Integer programCount) {
        this.programCount = programCount;
    }

    /**
     * The number of programs in the multiplex.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param programCount The number of programs in the multiplex.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMultiplexResult withProgramCount(Integer programCount) {
        this.programCount = programCount;
        return this;
    }

    /**
     * The current state of the multiplex.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING,
     * RECOVERING, STOPPING, DELETING, DELETED
     *
     * @return The current state of the multiplex.
     * @see MultiplexState
     */
    public String getState() {
        return state;
    }

    /**
     * The current state of the multiplex.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING,
     * RECOVERING, STOPPING, DELETING, DELETED
     *
     * @param state The current state of the multiplex.
     * @see MultiplexState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * The current state of the multiplex.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING,
     * RECOVERING, STOPPING, DELETING, DELETED
     *
     * @param state The current state of the multiplex.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MultiplexState
     */
    public DeleteMultiplexResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The current state of the multiplex.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING,
     * RECOVERING, STOPPING, DELETING, DELETED
     *
     * @param state The current state of the multiplex.
     * @see MultiplexState
     */
    public void setState(MultiplexState state) {
        this.state = state.toString();
    }

    /**
     * The current state of the multiplex.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING,
     * RECOVERING, STOPPING, DELETING, DELETED
     *
     * @param state The current state of the multiplex.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MultiplexState
     */
    public DeleteMultiplexResult withState(MultiplexState state) {
        this.state = state.toString();
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
    public DeleteMultiplexResult withTags(java.util.Map<String, String> tags) {
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
    public DeleteMultiplexResult addTagsEntry(String key, String value) {
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
    public DeleteMultiplexResult clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getDestinations() != null)
            sb.append("Destinations: " + getDestinations() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getMultiplexSettings() != null)
            sb.append("MultiplexSettings: " + getMultiplexSettings() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getPipelinesRunningCount() != null)
            sb.append("PipelinesRunningCount: " + getPipelinesRunningCount() + ",");
        if (getProgramCount() != null)
            sb.append("ProgramCount: " + getProgramCount() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode
                + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getMultiplexSettings() == null) ? 0 : getMultiplexSettings().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getPipelinesRunningCount() == null) ? 0 : getPipelinesRunningCount().hashCode());
        hashCode = prime * hashCode
                + ((getProgramCount() == null) ? 0 : getProgramCount().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMultiplexResult == false)
            return false;
        DeleteMultiplexResult other = (DeleteMultiplexResult) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null
                && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getPipelinesRunningCount() == null ^ this.getPipelinesRunningCount() == null)
            return false;
        if (other.getPipelinesRunningCount() != null
                && other.getPipelinesRunningCount().equals(this.getPipelinesRunningCount()) == false)
            return false;
        if (other.getProgramCount() == null ^ this.getProgramCount() == null)
            return false;
        if (other.getProgramCount() != null
                && other.getProgramCount().equals(this.getProgramCount()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}

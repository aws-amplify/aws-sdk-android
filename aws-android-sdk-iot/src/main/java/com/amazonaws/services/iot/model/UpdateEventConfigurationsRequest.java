/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the event configurations.
 * </p>
 */
public class UpdateEventConfigurationsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The new event configuration values.
     * </p>
     */
    private java.util.Map<String, Configuration> eventConfigurations;

    /**
     * <p>
     * The new event configuration values.
     * </p>
     *
     * @return <p>
     *         The new event configuration values.
     *         </p>
     */
    public java.util.Map<String, Configuration> getEventConfigurations() {
        return eventConfigurations;
    }

    /**
     * <p>
     * The new event configuration values.
     * </p>
     *
     * @param eventConfigurations <p>
     *            The new event configuration values.
     *            </p>
     */
    public void setEventConfigurations(java.util.Map<String, Configuration> eventConfigurations) {
        this.eventConfigurations = eventConfigurations;
    }

    /**
     * <p>
     * The new event configuration values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventConfigurations <p>
     *            The new event configuration values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEventConfigurationsRequest withEventConfigurations(
            java.util.Map<String, Configuration> eventConfigurations) {
        this.eventConfigurations = eventConfigurations;
        return this;
    }

    /**
     * <p>
     * The new event configuration values.
     * </p>
     * <p>
     * The method adds a new key-value pair into eventConfigurations parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into eventConfigurations.
     * @param value The corresponding value of the entry to be added into
     *            eventConfigurations.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEventConfigurationsRequest addeventConfigurationsEntry(String key,
            Configuration value) {
        if (null == this.eventConfigurations) {
            this.eventConfigurations = new java.util.HashMap<String, Configuration>();
        }
        if (this.eventConfigurations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.eventConfigurations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into eventConfigurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateEventConfigurationsRequest cleareventConfigurationsEntries() {
        this.eventConfigurations = null;
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
        if (getEventConfigurations() != null)
            sb.append("eventConfigurations: " + getEventConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventConfigurations() == null) ? 0 : getEventConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEventConfigurationsRequest == false)
            return false;
        UpdateEventConfigurationsRequest other = (UpdateEventConfigurationsRequest) obj;

        if (other.getEventConfigurations() == null ^ this.getEventConfigurations() == null)
            return false;
        if (other.getEventConfigurations() != null
                && other.getEventConfigurations().equals(this.getEventConfigurations()) == false)
            return false;
        return true;
    }
}

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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a configuration for automatically rolling back to a
 * previous version of an application revision when a deployment is not
 * completed successfully.
 * </p>
 */
public class AutoRollbackConfiguration implements Serializable {
    /**
     * <p>
     * Indicates whether a defined automatic rollback configuration is currently
     * enabled.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The event type or types that trigger a rollback.
     * </p>
     */
    private java.util.List<String> events;

    /**
     * <p>
     * Indicates whether a defined automatic rollback configuration is currently
     * enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether a defined automatic rollback configuration is
     *         currently enabled.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether a defined automatic rollback configuration is currently
     * enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether a defined automatic rollback configuration is
     *         currently enabled.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether a defined automatic rollback configuration is currently
     * enabled.
     * </p>
     *
     * @param enabled <p>
     *            Indicates whether a defined automatic rollback configuration
     *            is currently enabled.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether a defined automatic rollback configuration is currently
     * enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Indicates whether a defined automatic rollback configuration
     *            is currently enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoRollbackConfiguration withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The event type or types that trigger a rollback.
     * </p>
     *
     * @return <p>
     *         The event type or types that trigger a rollback.
     *         </p>
     */
    public java.util.List<String> getEvents() {
        return events;
    }

    /**
     * <p>
     * The event type or types that trigger a rollback.
     * </p>
     *
     * @param events <p>
     *            The event type or types that trigger a rollback.
     *            </p>
     */
    public void setEvents(java.util.Collection<String> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<String>(events);
    }

    /**
     * <p>
     * The event type or types that trigger a rollback.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            The event type or types that trigger a rollback.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoRollbackConfiguration withEvents(String... events) {
        if (getEvents() == null) {
            this.events = new java.util.ArrayList<String>(events.length);
        }
        for (String value : events) {
            this.events.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The event type or types that trigger a rollback.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            The event type or types that trigger a rollback.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoRollbackConfiguration withEvents(java.util.Collection<String> events) {
        setEvents(events);
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
        if (getEnabled() != null)
            sb.append("enabled: " + getEnabled() + ",");
        if (getEvents() != null)
            sb.append("events: " + getEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoRollbackConfiguration == false)
            return false;
        AutoRollbackConfiguration other = (AutoRollbackConfiguration) obj;

        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        return true;
    }
}

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

public class DescribeEventConfigurationsResult implements Serializable {
    /**
     * <p>
     * The event configurations.
     * </p>
     */
    private java.util.Map<String, Configuration> eventConfigurations;

    /**
     * <p>
     * The creation date of the event configuration.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date the event configurations were last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The event configurations.
     * </p>
     *
     * @return <p>
     *         The event configurations.
     *         </p>
     */
    public java.util.Map<String, Configuration> getEventConfigurations() {
        return eventConfigurations;
    }

    /**
     * <p>
     * The event configurations.
     * </p>
     *
     * @param eventConfigurations <p>
     *            The event configurations.
     *            </p>
     */
    public void setEventConfigurations(java.util.Map<String, Configuration> eventConfigurations) {
        this.eventConfigurations = eventConfigurations;
    }

    /**
     * <p>
     * The event configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventConfigurations <p>
     *            The event configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventConfigurationsResult withEventConfigurations(
            java.util.Map<String, Configuration> eventConfigurations) {
        this.eventConfigurations = eventConfigurations;
        return this;
    }

    /**
     * <p>
     * The event configurations.
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
    public DescribeEventConfigurationsResult addeventConfigurationsEntry(String key,
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
    public DescribeEventConfigurationsResult cleareventConfigurationsEntries() {
        this.eventConfigurations = null;
        return this;
    }

    /**
     * <p>
     * The creation date of the event configuration.
     * </p>
     *
     * @return <p>
     *         The creation date of the event configuration.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The creation date of the event configuration.
     * </p>
     *
     * @param creationDate <p>
     *            The creation date of the event configuration.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date of the event configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The creation date of the event configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventConfigurationsResult withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date the event configurations were last modified.
     * </p>
     *
     * @return <p>
     *         The date the event configurations were last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date the event configurations were last modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date the event configurations were last modified.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the event configurations were last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date the event configurations were last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventConfigurationsResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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
            sb.append("eventConfigurations: " + getEventConfigurations() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null)
            sb.append("lastModifiedDate: " + getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventConfigurations() == null) ? 0 : getEventConfigurations().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventConfigurationsResult == false)
            return false;
        DescribeEventConfigurationsResult other = (DescribeEventConfigurationsResult) obj;

        if (other.getEventConfigurations() == null ^ this.getEventConfigurations() == null)
            return false;
        if (other.getEventConfigurations() != null
                && other.getEventConfigurations().equals(this.getEventConfigurations()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }
}

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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about of the hours of operation.
 * </p>
 */
public class HoursOfOperation implements Serializable {
    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     */
    private String hoursOfOperationId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the hours of operation.
     * </p>
     */
    private String hoursOfOperationArn;

    /**
     * <p>
     * The name for the hours of operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     */
    private String name;

    /**
     * <p>
     * The description for the hours of operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     */
    private String description;

    /**
     * <p>
     * The time zone for the hours of operation.
     * </p>
     */
    private String timeZone;

    /**
     * <p>
     * Configuration information for the hours of operation.
     * </p>
     */
    private java.util.List<HoursOfOperationConfig> config;

    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     *
     * @return <p>
     *         The identifier for the hours of operation.
     *         </p>
     */
    public String getHoursOfOperationId() {
        return hoursOfOperationId;
    }

    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     *
     * @param hoursOfOperationId <p>
     *            The identifier for the hours of operation.
     *            </p>
     */
    public void setHoursOfOperationId(String hoursOfOperationId) {
        this.hoursOfOperationId = hoursOfOperationId;
    }

    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hoursOfOperationId <p>
     *            The identifier for the hours of operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HoursOfOperation withHoursOfOperationId(String hoursOfOperationId) {
        this.hoursOfOperationId = hoursOfOperationId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the hours of operation.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the hours of operation.
     *         </p>
     */
    public String getHoursOfOperationArn() {
        return hoursOfOperationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the hours of operation.
     * </p>
     *
     * @param hoursOfOperationArn <p>
     *            The Amazon Resource Name (ARN) for the hours of operation.
     *            </p>
     */
    public void setHoursOfOperationArn(String hoursOfOperationArn) {
        this.hoursOfOperationArn = hoursOfOperationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the hours of operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hoursOfOperationArn <p>
     *            The Amazon Resource Name (ARN) for the hours of operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HoursOfOperation withHoursOfOperationArn(String hoursOfOperationArn) {
        this.hoursOfOperationArn = hoursOfOperationArn;
        return this;
    }

    /**
     * <p>
     * The name for the hours of operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @return <p>
     *         The name for the hours of operation.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name for the hours of operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @param name <p>
     *            The name for the hours of operation.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the hours of operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @param name <p>
     *            The name for the hours of operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HoursOfOperation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description for the hours of operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @return <p>
     *         The description for the hours of operation.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for the hours of operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @param description <p>
     *            The description for the hours of operation.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the hours of operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @param description <p>
     *            The description for the hours of operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HoursOfOperation withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The time zone for the hours of operation.
     * </p>
     *
     * @return <p>
     *         The time zone for the hours of operation.
     *         </p>
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * <p>
     * The time zone for the hours of operation.
     * </p>
     *
     * @param timeZone <p>
     *            The time zone for the hours of operation.
     *            </p>
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * <p>
     * The time zone for the hours of operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeZone <p>
     *            The time zone for the hours of operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HoursOfOperation withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * <p>
     * Configuration information for the hours of operation.
     * </p>
     *
     * @return <p>
     *         Configuration information for the hours of operation.
     *         </p>
     */
    public java.util.List<HoursOfOperationConfig> getConfig() {
        return config;
    }

    /**
     * <p>
     * Configuration information for the hours of operation.
     * </p>
     *
     * @param config <p>
     *            Configuration information for the hours of operation.
     *            </p>
     */
    public void setConfig(java.util.Collection<HoursOfOperationConfig> config) {
        if (config == null) {
            this.config = null;
            return;
        }

        this.config = new java.util.ArrayList<HoursOfOperationConfig>(config);
    }

    /**
     * <p>
     * Configuration information for the hours of operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param config <p>
     *            Configuration information for the hours of operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HoursOfOperation withConfig(HoursOfOperationConfig... config) {
        if (getConfig() == null) {
            this.config = new java.util.ArrayList<HoursOfOperationConfig>(config.length);
        }
        for (HoursOfOperationConfig value : config) {
            this.config.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Configuration information for the hours of operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param config <p>
     *            Configuration information for the hours of operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HoursOfOperation withConfig(java.util.Collection<HoursOfOperationConfig> config) {
        setConfig(config);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @return <p>
     *         One or more tags.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HoursOfOperation withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HoursOfOperation addTagsEntry(String key, String value) {
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
    public HoursOfOperation clearTagsEntries() {
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
        if (getHoursOfOperationId() != null)
            sb.append("HoursOfOperationId: " + getHoursOfOperationId() + ",");
        if (getHoursOfOperationArn() != null)
            sb.append("HoursOfOperationArn: " + getHoursOfOperationArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTimeZone() != null)
            sb.append("TimeZone: " + getTimeZone() + ",");
        if (getConfig() != null)
            sb.append("Config: " + getConfig() + ",");
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
                + ((getHoursOfOperationId() == null) ? 0 : getHoursOfOperationId().hashCode());
        hashCode = prime * hashCode
                + ((getHoursOfOperationArn() == null) ? 0 : getHoursOfOperationArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTimeZone() == null) ? 0 : getTimeZone().hashCode());
        hashCode = prime * hashCode + ((getConfig() == null) ? 0 : getConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HoursOfOperation == false)
            return false;
        HoursOfOperation other = (HoursOfOperation) obj;

        if (other.getHoursOfOperationId() == null ^ this.getHoursOfOperationId() == null)
            return false;
        if (other.getHoursOfOperationId() != null
                && other.getHoursOfOperationId().equals(this.getHoursOfOperationId()) == false)
            return false;
        if (other.getHoursOfOperationArn() == null ^ this.getHoursOfOperationArn() == null)
            return false;
        if (other.getHoursOfOperationArn() != null
                && other.getHoursOfOperationArn().equals(this.getHoursOfOperationArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTimeZone() == null ^ this.getTimeZone() == null)
            return false;
        if (other.getTimeZone() != null && other.getTimeZone().equals(this.getTimeZone()) == false)
            return false;
        if (other.getConfig() == null ^ this.getConfig() == null)
            return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}

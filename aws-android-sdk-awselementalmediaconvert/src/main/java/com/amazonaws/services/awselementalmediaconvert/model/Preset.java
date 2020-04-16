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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * A preset is a collection of preconfigured media conversion settings that you
 * want MediaConvert to apply to the output during the conversion process.
 */
public class Preset implements Serializable {
    /**
     * An identifier for this resource that is unique within all of AWS.
     */
    private String arn;

    /**
     * An optional category you create to organize your presets.
     */
    private String category;

    /**
     * The timestamp in epoch seconds for preset creation.
     */
    private java.util.Date createdAt;

    /**
     * An optional description you create for each preset.
     */
    private String description;

    /**
     * The timestamp in epoch seconds when the preset was last updated.
     */
    private java.util.Date lastUpdated;

    /**
     * A name you create for each preset. Each name must be unique within your
     * account.
     */
    private String name;

    /**
     * Settings for preset
     */
    private PresetSettings settings;

    /**
     * A preset can be of two types: system or custom. System or built-in preset
     * can't be modified or deleted by the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, CUSTOM
     */
    private String type;

    /**
     * An identifier for this resource that is unique within all of AWS.
     *
     * @return An identifier for this resource that is unique within all of AWS.
     */
    public String getArn() {
        return arn;
    }

    /**
     * An identifier for this resource that is unique within all of AWS.
     *
     * @param arn An identifier for this resource that is unique within all of
     *            AWS.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * An identifier for this resource that is unique within all of AWS.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn An identifier for this resource that is unique within all of
     *            AWS.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Preset withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * An optional category you create to organize your presets.
     *
     * @return An optional category you create to organize your presets.
     */
    public String getCategory() {
        return category;
    }

    /**
     * An optional category you create to organize your presets.
     *
     * @param category An optional category you create to organize your presets.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * An optional category you create to organize your presets.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param category An optional category you create to organize your presets.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Preset withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * The timestamp in epoch seconds for preset creation.
     *
     * @return The timestamp in epoch seconds for preset creation.
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * The timestamp in epoch seconds for preset creation.
     *
     * @param createdAt The timestamp in epoch seconds for preset creation.
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The timestamp in epoch seconds for preset creation.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt The timestamp in epoch seconds for preset creation.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Preset withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * An optional description you create for each preset.
     *
     * @return An optional description you create for each preset.
     */
    public String getDescription() {
        return description;
    }

    /**
     * An optional description you create for each preset.
     *
     * @param description An optional description you create for each preset.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * An optional description you create for each preset.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description An optional description you create for each preset.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Preset withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The timestamp in epoch seconds when the preset was last updated.
     *
     * @return The timestamp in epoch seconds when the preset was last updated.
     */
    public java.util.Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * The timestamp in epoch seconds when the preset was last updated.
     *
     * @param lastUpdated The timestamp in epoch seconds when the preset was
     *            last updated.
     */
    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * The timestamp in epoch seconds when the preset was last updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdated The timestamp in epoch seconds when the preset was
     *            last updated.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Preset withLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * A name you create for each preset. Each name must be unique within your
     * account.
     *
     * @return A name you create for each preset. Each name must be unique
     *         within your account.
     */
    public String getName() {
        return name;
    }

    /**
     * A name you create for each preset. Each name must be unique within your
     * account.
     *
     * @param name A name you create for each preset. Each name must be unique
     *            within your account.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A name you create for each preset. Each name must be unique within your
     * account.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name A name you create for each preset. Each name must be unique
     *            within your account.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Preset withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Settings for preset
     *
     * @return Settings for preset
     */
    public PresetSettings getSettings() {
        return settings;
    }

    /**
     * Settings for preset
     *
     * @param settings Settings for preset
     */
    public void setSettings(PresetSettings settings) {
        this.settings = settings;
    }

    /**
     * Settings for preset
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings Settings for preset
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Preset withSettings(PresetSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * A preset can be of two types: system or custom. System or built-in preset
     * can't be modified or deleted by the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, CUSTOM
     *
     * @return A preset can be of two types: system or custom. System or
     *         built-in preset can't be modified or deleted by the user.
     * @see Type
     */
    public String getType() {
        return type;
    }

    /**
     * A preset can be of two types: system or custom. System or built-in preset
     * can't be modified or deleted by the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, CUSTOM
     *
     * @param type A preset can be of two types: system or custom. System or
     *            built-in preset can't be modified or deleted by the user.
     * @see Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * A preset can be of two types: system or custom. System or built-in preset
     * can't be modified or deleted by the user.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, CUSTOM
     *
     * @param type A preset can be of two types: system or custom. System or
     *            built-in preset can't be modified or deleted by the user.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public Preset withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * A preset can be of two types: system or custom. System or built-in preset
     * can't be modified or deleted by the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, CUSTOM
     *
     * @param type A preset can be of two types: system or custom. System or
     *            built-in preset can't be modified or deleted by the user.
     * @see Type
     */
    public void setType(Type type) {
        this.type = type.toString();
    }

    /**
     * A preset can be of two types: system or custom. System or built-in preset
     * can't be modified or deleted by the user.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, CUSTOM
     *
     * @param type A preset can be of two types: system or custom. System or
     *            built-in preset can't be modified or deleted by the user.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public Preset withType(Type type) {
        this.type = type.toString();
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
        if (getCategory() != null)
            sb.append("Category: " + getCategory() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: " + getLastUpdated() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Preset == false)
            return false;
        Preset other = (Preset) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null
                && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}

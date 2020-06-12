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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * A configuration property of an SDK type.
 * </p>
 */
public class SdkConfigurationProperty implements Serializable {
    /**
     * <p>
     * The name of a an <a>SdkType</a> configuration property.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The user-friendly name of an <a>SdkType</a> configuration property.
     * </p>
     */
    private String friendlyName;

    /**
     * <p>
     * The description of an <a>SdkType</a> configuration property.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A boolean flag of an <a>SdkType</a> configuration property to indicate if
     * the associated SDK configuration property is required (<code>true</code>)
     * or not (<code>false</code>).
     * </p>
     */
    private Boolean required;

    /**
     * <p>
     * The default value of an <a>SdkType</a> configuration property.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The name of a an <a>SdkType</a> configuration property.
     * </p>
     *
     * @return <p>
     *         The name of a an <a>SdkType</a> configuration property.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of a an <a>SdkType</a> configuration property.
     * </p>
     *
     * @param name <p>
     *            The name of a an <a>SdkType</a> configuration property.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a an <a>SdkType</a> configuration property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of a an <a>SdkType</a> configuration property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SdkConfigurationProperty withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The user-friendly name of an <a>SdkType</a> configuration property.
     * </p>
     *
     * @return <p>
     *         The user-friendly name of an <a>SdkType</a> configuration
     *         property.
     *         </p>
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * <p>
     * The user-friendly name of an <a>SdkType</a> configuration property.
     * </p>
     *
     * @param friendlyName <p>
     *            The user-friendly name of an <a>SdkType</a> configuration
     *            property.
     *            </p>
     */
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    /**
     * <p>
     * The user-friendly name of an <a>SdkType</a> configuration property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param friendlyName <p>
     *            The user-friendly name of an <a>SdkType</a> configuration
     *            property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SdkConfigurationProperty withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * <p>
     * The description of an <a>SdkType</a> configuration property.
     * </p>
     *
     * @return <p>
     *         The description of an <a>SdkType</a> configuration property.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of an <a>SdkType</a> configuration property.
     * </p>
     *
     * @param description <p>
     *            The description of an <a>SdkType</a> configuration property.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of an <a>SdkType</a> configuration property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of an <a>SdkType</a> configuration property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SdkConfigurationProperty withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A boolean flag of an <a>SdkType</a> configuration property to indicate if
     * the associated SDK configuration property is required (<code>true</code>)
     * or not (<code>false</code>).
     * </p>
     *
     * @return <p>
     *         A boolean flag of an <a>SdkType</a> configuration property to
     *         indicate if the associated SDK configuration property is required
     *         (<code>true</code>) or not (<code>false</code>).
     *         </p>
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * <p>
     * A boolean flag of an <a>SdkType</a> configuration property to indicate if
     * the associated SDK configuration property is required (<code>true</code>)
     * or not (<code>false</code>).
     * </p>
     *
     * @return <p>
     *         A boolean flag of an <a>SdkType</a> configuration property to
     *         indicate if the associated SDK configuration property is required
     *         (<code>true</code>) or not (<code>false</code>).
     *         </p>
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * <p>
     * A boolean flag of an <a>SdkType</a> configuration property to indicate if
     * the associated SDK configuration property is required (<code>true</code>)
     * or not (<code>false</code>).
     * </p>
     *
     * @param required <p>
     *            A boolean flag of an <a>SdkType</a> configuration property to
     *            indicate if the associated SDK configuration property is
     *            required (<code>true</code>) or not (<code>false</code>).
     *            </p>
     */
    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * <p>
     * A boolean flag of an <a>SdkType</a> configuration property to indicate if
     * the associated SDK configuration property is required (<code>true</code>)
     * or not (<code>false</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param required <p>
     *            A boolean flag of an <a>SdkType</a> configuration property to
     *            indicate if the associated SDK configuration property is
     *            required (<code>true</code>) or not (<code>false</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SdkConfigurationProperty withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * <p>
     * The default value of an <a>SdkType</a> configuration property.
     * </p>
     *
     * @return <p>
     *         The default value of an <a>SdkType</a> configuration property.
     *         </p>
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * The default value of an <a>SdkType</a> configuration property.
     * </p>
     *
     * @param defaultValue <p>
     *            The default value of an <a>SdkType</a> configuration property.
     *            </p>
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value of an <a>SdkType</a> configuration property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultValue <p>
     *            The default value of an <a>SdkType</a> configuration property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SdkConfigurationProperty withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getFriendlyName() != null)
            sb.append("friendlyName: " + getFriendlyName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getRequired() != null)
            sb.append("required: " + getRequired() + ",");
        if (getDefaultValue() != null)
            sb.append("defaultValue: " + getDefaultValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getFriendlyName() == null) ? 0 : getFriendlyName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SdkConfigurationProperty == false)
            return false;
        SdkConfigurationProperty other = (SdkConfigurationProperty) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFriendlyName() == null ^ this.getFriendlyName() == null)
            return false;
        if (other.getFriendlyName() != null
                && other.getFriendlyName().equals(this.getFriendlyName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRequired() == null ^ this.getRequired() == null)
            return false;
        if (other.getRequired() != null && other.getRequired().equals(this.getRequired()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null
                && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        return true;
    }
}

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
 * A type of SDK that API Gateway can generate.
 * </p>
 */
public class SdkType implements Serializable {
    /**
     * <p>
     * The identifier of an <a>SdkType</a> instance.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The user-friendly name of an <a>SdkType</a> instance.
     * </p>
     */
    private String friendlyName;

    /**
     * <p>
     * The description of an <a>SdkType</a>.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A list of configuration properties of an <a>SdkType</a>.
     * </p>
     */
    private java.util.List<SdkConfigurationProperty> configurationProperties;

    /**
     * <p>
     * The identifier of an <a>SdkType</a> instance.
     * </p>
     *
     * @return <p>
     *         The identifier of an <a>SdkType</a> instance.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of an <a>SdkType</a> instance.
     * </p>
     *
     * @param id <p>
     *            The identifier of an <a>SdkType</a> instance.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of an <a>SdkType</a> instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier of an <a>SdkType</a> instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SdkType withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The user-friendly name of an <a>SdkType</a> instance.
     * </p>
     *
     * @return <p>
     *         The user-friendly name of an <a>SdkType</a> instance.
     *         </p>
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * <p>
     * The user-friendly name of an <a>SdkType</a> instance.
     * </p>
     *
     * @param friendlyName <p>
     *            The user-friendly name of an <a>SdkType</a> instance.
     *            </p>
     */
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    /**
     * <p>
     * The user-friendly name of an <a>SdkType</a> instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param friendlyName <p>
     *            The user-friendly name of an <a>SdkType</a> instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SdkType withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * <p>
     * The description of an <a>SdkType</a>.
     * </p>
     *
     * @return <p>
     *         The description of an <a>SdkType</a>.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of an <a>SdkType</a>.
     * </p>
     *
     * @param description <p>
     *            The description of an <a>SdkType</a>.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of an <a>SdkType</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of an <a>SdkType</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SdkType withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A list of configuration properties of an <a>SdkType</a>.
     * </p>
     *
     * @return <p>
     *         A list of configuration properties of an <a>SdkType</a>.
     *         </p>
     */
    public java.util.List<SdkConfigurationProperty> getConfigurationProperties() {
        return configurationProperties;
    }

    /**
     * <p>
     * A list of configuration properties of an <a>SdkType</a>.
     * </p>
     *
     * @param configurationProperties <p>
     *            A list of configuration properties of an <a>SdkType</a>.
     *            </p>
     */
    public void setConfigurationProperties(
            java.util.Collection<SdkConfigurationProperty> configurationProperties) {
        if (configurationProperties == null) {
            this.configurationProperties = null;
            return;
        }

        this.configurationProperties = new java.util.ArrayList<SdkConfigurationProperty>(
                configurationProperties);
    }

    /**
     * <p>
     * A list of configuration properties of an <a>SdkType</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationProperties <p>
     *            A list of configuration properties of an <a>SdkType</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SdkType withConfigurationProperties(SdkConfigurationProperty... configurationProperties) {
        if (getConfigurationProperties() == null) {
            this.configurationProperties = new java.util.ArrayList<SdkConfigurationProperty>(
                    configurationProperties.length);
        }
        for (SdkConfigurationProperty value : configurationProperties) {
            this.configurationProperties.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of configuration properties of an <a>SdkType</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationProperties <p>
     *            A list of configuration properties of an <a>SdkType</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SdkType withConfigurationProperties(
            java.util.Collection<SdkConfigurationProperty> configurationProperties) {
        setConfigurationProperties(configurationProperties);
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
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getFriendlyName() != null)
            sb.append("friendlyName: " + getFriendlyName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getConfigurationProperties() != null)
            sb.append("configurationProperties: " + getConfigurationProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getFriendlyName() == null) ? 0 : getFriendlyName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getConfigurationProperties() == null) ? 0 : getConfigurationProperties()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SdkType == false)
            return false;
        SdkType other = (SdkType) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getConfigurationProperties() == null ^ this.getConfigurationProperties() == null)
            return false;
        if (other.getConfigurationProperties() != null
                && other.getConfigurationProperties().equals(this.getConfigurationProperties()) == false)
            return false;
        return true;
    }
}

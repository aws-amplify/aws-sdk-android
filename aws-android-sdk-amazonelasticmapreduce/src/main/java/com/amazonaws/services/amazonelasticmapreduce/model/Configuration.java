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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <note>
 * <p>
 * Amazon EMR releases 4.x or later.
 * </p>
 * </note>
 * <p>
 * An optional configuration specification to be used when provisioning cluster
 * instances, which can include configurations for applications and software
 * bundled with Amazon EMR. A configuration consists of a classification,
 * properties, and optional nested configurations. A classification refers to an
 * application-specific configuration file. Properties are the settings you want
 * to change in that file. For more information, see <a href=
 * "https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html"
 * >Configuring Applications</a>.
 * </p>
 */
public class Configuration implements Serializable {
    /**
     * <p>
     * The classification within a configuration.
     * </p>
     */
    private String classification;

    /**
     * <p>
     * A list of additional configurations to apply within a configuration
     * object.
     * </p>
     */
    private java.util.List<Configuration> configurations;

    /**
     * <p>
     * A set of properties specified within a configuration classification.
     * </p>
     */
    private java.util.Map<String, String> properties;

    /**
     * <p>
     * The classification within a configuration.
     * </p>
     *
     * @return <p>
     *         The classification within a configuration.
     *         </p>
     */
    public String getClassification() {
        return classification;
    }

    /**
     * <p>
     * The classification within a configuration.
     * </p>
     *
     * @param classification <p>
     *            The classification within a configuration.
     *            </p>
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * <p>
     * The classification within a configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classification <p>
     *            The classification within a configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Configuration withClassification(String classification) {
        this.classification = classification;
        return this;
    }

    /**
     * <p>
     * A list of additional configurations to apply within a configuration
     * object.
     * </p>
     *
     * @return <p>
     *         A list of additional configurations to apply within a
     *         configuration object.
     *         </p>
     */
    public java.util.List<Configuration> getConfigurations() {
        return configurations;
    }

    /**
     * <p>
     * A list of additional configurations to apply within a configuration
     * object.
     * </p>
     *
     * @param configurations <p>
     *            A list of additional configurations to apply within a
     *            configuration object.
     *            </p>
     */
    public void setConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new java.util.ArrayList<Configuration>(configurations);
    }

    /**
     * <p>
     * A list of additional configurations to apply within a configuration
     * object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurations <p>
     *            A list of additional configurations to apply within a
     *            configuration object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Configuration withConfigurations(Configuration... configurations) {
        if (getConfigurations() == null) {
            this.configurations = new java.util.ArrayList<Configuration>(configurations.length);
        }
        for (Configuration value : configurations) {
            this.configurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of additional configurations to apply within a configuration
     * object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurations <p>
     *            A list of additional configurations to apply within a
     *            configuration object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Configuration withConfigurations(java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * <p>
     * A set of properties specified within a configuration classification.
     * </p>
     *
     * @return <p>
     *         A set of properties specified within a configuration
     *         classification.
     *         </p>
     */
    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    /**
     * <p>
     * A set of properties specified within a configuration classification.
     * </p>
     *
     * @param properties <p>
     *            A set of properties specified within a configuration
     *            classification.
     *            </p>
     */
    public void setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * A set of properties specified within a configuration classification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param properties <p>
     *            A set of properties specified within a configuration
     *            classification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Configuration withProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * <p>
     * A set of properties specified within a configuration classification.
     * </p>
     * <p>
     * The method adds a new key-value pair into Properties parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Properties.
     * @param value The corresponding value of the entry to be added into
     *            Properties.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Configuration addPropertiesEntry(String key, String value) {
        if (null == this.properties) {
            this.properties = new java.util.HashMap<String, String>();
        }
        if (this.properties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.properties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Properties.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Configuration clearPropertiesEntries() {
        this.properties = null;
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
        if (getClassification() != null)
            sb.append("Classification: " + getClassification() + ",");
        if (getConfigurations() != null)
            sb.append("Configurations: " + getConfigurations() + ",");
        if (getProperties() != null)
            sb.append("Properties: " + getProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClassification() == null) ? 0 : getClassification().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Configuration == false)
            return false;
        Configuration other = (Configuration) obj;

        if (other.getClassification() == null ^ this.getClassification() == null)
            return false;
        if (other.getClassification() != null
                && other.getClassification().equals(this.getClassification()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null
                && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null
                && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }
}

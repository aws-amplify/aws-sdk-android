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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * The results from a request to change the configuration settings of an
 * environment.
 * </p>
 */
public class DescribeConfigurationSettingsResult implements Serializable {
    /**
     * <p>
     * A list of <a>ConfigurationSettingsDescription</a>.
     * </p>
     */
    private java.util.List<ConfigurationSettingsDescription> configurationSettings;

    /**
     * <p>
     * A list of <a>ConfigurationSettingsDescription</a>.
     * </p>
     *
     * @return <p>
     *         A list of <a>ConfigurationSettingsDescription</a>.
     *         </p>
     */
    public java.util.List<ConfigurationSettingsDescription> getConfigurationSettings() {
        return configurationSettings;
    }

    /**
     * <p>
     * A list of <a>ConfigurationSettingsDescription</a>.
     * </p>
     *
     * @param configurationSettings <p>
     *            A list of <a>ConfigurationSettingsDescription</a>.
     *            </p>
     */
    public void setConfigurationSettings(
            java.util.Collection<ConfigurationSettingsDescription> configurationSettings) {
        if (configurationSettings == null) {
            this.configurationSettings = null;
            return;
        }

        this.configurationSettings = new java.util.ArrayList<ConfigurationSettingsDescription>(
                configurationSettings);
    }

    /**
     * <p>
     * A list of <a>ConfigurationSettingsDescription</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSettings <p>
     *            A list of <a>ConfigurationSettingsDescription</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConfigurationSettingsResult withConfigurationSettings(
            ConfigurationSettingsDescription... configurationSettings) {
        if (getConfigurationSettings() == null) {
            this.configurationSettings = new java.util.ArrayList<ConfigurationSettingsDescription>(
                    configurationSettings.length);
        }
        for (ConfigurationSettingsDescription value : configurationSettings) {
            this.configurationSettings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>ConfigurationSettingsDescription</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSettings <p>
     *            A list of <a>ConfigurationSettingsDescription</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConfigurationSettingsResult withConfigurationSettings(
            java.util.Collection<ConfigurationSettingsDescription> configurationSettings) {
        setConfigurationSettings(configurationSettings);
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
        if (getConfigurationSettings() != null)
            sb.append("ConfigurationSettings: " + getConfigurationSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getConfigurationSettings() == null) ? 0 : getConfigurationSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationSettingsResult == false)
            return false;
        DescribeConfigurationSettingsResult other = (DescribeConfigurationSettingsResult) obj;

        if (other.getConfigurationSettings() == null ^ this.getConfigurationSettings() == null)
            return false;
        if (other.getConfigurationSettings() != null
                && other.getConfigurationSettings().equals(this.getConfigurationSettings()) == false)
            return false;
        return true;
    }
}

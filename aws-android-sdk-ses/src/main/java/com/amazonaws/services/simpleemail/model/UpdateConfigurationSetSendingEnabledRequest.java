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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Enables or disables email sending for messages sent using a specific
 * configuration set in a given AWS Region. You can use this operation in
 * conjunction with Amazon CloudWatch alarms to temporarily pause email sending
 * for a configuration set when the reputation metrics for that configuration
 * set (such as your bounce on complaint rate) exceed certain thresholds.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class UpdateConfigurationSetSendingEnabledRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the configuration set that you want to update.
     * </p>
     */
    private String configurationSetName;

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for the
     * configuration set.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The name of the configuration set that you want to update.
     * </p>
     *
     * @return <p>
     *         The name of the configuration set that you want to update.
     *         </p>
     */
    public String getConfigurationSetName() {
        return configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to update.
     * </p>
     *
     * @param configurationSetName <p>
     *            The name of the configuration set that you want to update.
     *            </p>
     */
    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSetName <p>
     *            The name of the configuration set that you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationSetSendingEnabledRequest withConfigurationSetName(
            String configurationSetName) {
        this.configurationSetName = configurationSetName;
        return this;
    }

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for the
     * configuration set.
     * </p>
     *
     * @return <p>
     *         Describes whether email sending is enabled or disabled for the
     *         configuration set.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for the
     * configuration set.
     * </p>
     *
     * @return <p>
     *         Describes whether email sending is enabled or disabled for the
     *         configuration set.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for the
     * configuration set.
     * </p>
     *
     * @param enabled <p>
     *            Describes whether email sending is enabled or disabled for the
     *            configuration set.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for the
     * configuration set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Describes whether email sending is enabled or disabled for the
     *            configuration set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationSetSendingEnabledRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: " + getConfigurationSetName() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConfigurationSetSendingEnabledRequest == false)
            return false;
        UpdateConfigurationSetSendingEnabledRequest other = (UpdateConfigurationSetSendingEnabledRequest) obj;

        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null
                && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}

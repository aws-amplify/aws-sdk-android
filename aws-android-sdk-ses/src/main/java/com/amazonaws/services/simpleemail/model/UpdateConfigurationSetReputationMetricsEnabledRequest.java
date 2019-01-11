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
 * Enables or disables the publishing of reputation metrics for emails sent
 * using a specific configuration set in a given AWS Region. Reputation metrics
 * include bounce and complaint rates. These metrics are published to Amazon
 * CloudWatch. By using CloudWatch, you can create alarms when bounce or
 * complaint rates exceed certain thresholds.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class UpdateConfigurationSetReputationMetricsEnabledRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The name of the configuration set that you want to update.
     * </p>
     */
    private String configurationSetName;

    /**
     * <p>
     * Describes whether or not Amazon SES will publish reputation metrics for
     * the configuration set, such as bounce and complaint rates, to Amazon
     * CloudWatch.
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
    public UpdateConfigurationSetReputationMetricsEnabledRequest withConfigurationSetName(
            String configurationSetName) {
        this.configurationSetName = configurationSetName;
        return this;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES will publish reputation metrics for
     * the configuration set, such as bounce and complaint rates, to Amazon
     * CloudWatch.
     * </p>
     *
     * @return <p>
     *         Describes whether or not Amazon SES will publish reputation
     *         metrics for the configuration set, such as bounce and complaint
     *         rates, to Amazon CloudWatch.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES will publish reputation metrics for
     * the configuration set, such as bounce and complaint rates, to Amazon
     * CloudWatch.
     * </p>
     *
     * @return <p>
     *         Describes whether or not Amazon SES will publish reputation
     *         metrics for the configuration set, such as bounce and complaint
     *         rates, to Amazon CloudWatch.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES will publish reputation metrics for
     * the configuration set, such as bounce and complaint rates, to Amazon
     * CloudWatch.
     * </p>
     *
     * @param enabled <p>
     *            Describes whether or not Amazon SES will publish reputation
     *            metrics for the configuration set, such as bounce and
     *            complaint rates, to Amazon CloudWatch.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES will publish reputation metrics for
     * the configuration set, such as bounce and complaint rates, to Amazon
     * CloudWatch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Describes whether or not Amazon SES will publish reputation
     *            metrics for the configuration set, such as bounce and
     *            complaint rates, to Amazon CloudWatch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationSetReputationMetricsEnabledRequest withEnabled(Boolean enabled) {
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

        if (obj instanceof UpdateConfigurationSetReputationMetricsEnabledRequest == false)
            return false;
        UpdateConfigurationSetReputationMetricsEnabledRequest other = (UpdateConfigurationSetReputationMetricsEnabledRequest) obj;

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

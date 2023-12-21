/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Adds or updates the delivery options for a configuration set.
 * </p>
 */
public class PutConfigurationSetDeliveryOptionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the configuration set.
     * </p>
     */
    private String configurationSetName;

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to
     * use Transport Layer Security (TLS).
     * </p>
     */
    private DeliveryOptions deliveryOptions;

    /**
     * <p>
     * The name of the configuration set.
     * </p>
     *
     * @return <p>
     *         The name of the configuration set.
     *         </p>
     */
    public String getConfigurationSetName() {
        return configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set.
     * </p>
     *
     * @param configurationSetName <p>
     *            The name of the configuration set.
     *            </p>
     */
    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSetName <p>
     *            The name of the configuration set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutConfigurationSetDeliveryOptionsRequest withConfigurationSetName(
            String configurationSetName) {
        this.configurationSetName = configurationSetName;
        return this;
    }

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to
     * use Transport Layer Security (TLS).
     * </p>
     *
     * @return <p>
     *         Specifies whether messages that use the configuration set are
     *         required to use Transport Layer Security (TLS).
     *         </p>
     */
    public DeliveryOptions getDeliveryOptions() {
        return deliveryOptions;
    }

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to
     * use Transport Layer Security (TLS).
     * </p>
     *
     * @param deliveryOptions <p>
     *            Specifies whether messages that use the configuration set are
     *            required to use Transport Layer Security (TLS).
     *            </p>
     */
    public void setDeliveryOptions(DeliveryOptions deliveryOptions) {
        this.deliveryOptions = deliveryOptions;
    }

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to
     * use Transport Layer Security (TLS).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deliveryOptions <p>
     *            Specifies whether messages that use the configuration set are
     *            required to use Transport Layer Security (TLS).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutConfigurationSetDeliveryOptionsRequest withDeliveryOptions(
            DeliveryOptions deliveryOptions) {
        this.deliveryOptions = deliveryOptions;
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
        if (getDeliveryOptions() != null)
            sb.append("DeliveryOptions: " + getDeliveryOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode
                + ((getDeliveryOptions() == null) ? 0 : getDeliveryOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutConfigurationSetDeliveryOptionsRequest == false)
            return false;
        PutConfigurationSetDeliveryOptionsRequest other = (PutConfigurationSetDeliveryOptionsRequest) obj;

        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null
                && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getDeliveryOptions() == null ^ this.getDeliveryOptions() == null)
            return false;
        if (other.getDeliveryOptions() != null
                && other.getDeliveryOptions().equals(this.getDeliveryOptions()) == false)
            return false;
        return true;
    }
}

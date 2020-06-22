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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class ExportClientVpnClientConfigurationResult implements Serializable {
    /**
     * <p>
     * The contents of the Client VPN endpoint configuration file.
     * </p>
     */
    private String clientConfiguration;

    /**
     * <p>
     * The contents of the Client VPN endpoint configuration file.
     * </p>
     *
     * @return <p>
     *         The contents of the Client VPN endpoint configuration file.
     *         </p>
     */
    public String getClientConfiguration() {
        return clientConfiguration;
    }

    /**
     * <p>
     * The contents of the Client VPN endpoint configuration file.
     * </p>
     *
     * @param clientConfiguration <p>
     *            The contents of the Client VPN endpoint configuration file.
     *            </p>
     */
    public void setClientConfiguration(String clientConfiguration) {
        this.clientConfiguration = clientConfiguration;
    }

    /**
     * <p>
     * The contents of the Client VPN endpoint configuration file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientConfiguration <p>
     *            The contents of the Client VPN endpoint configuration file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportClientVpnClientConfigurationResult withClientConfiguration(
            String clientConfiguration) {
        this.clientConfiguration = clientConfiguration;
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
        if (getClientConfiguration() != null)
            sb.append("ClientConfiguration: " + getClientConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientConfiguration() == null) ? 0 : getClientConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportClientVpnClientConfigurationResult == false)
            return false;
        ExportClientVpnClientConfigurationResult other = (ExportClientVpnClientConfigurationResult) obj;

        if (other.getClientConfiguration() == null ^ this.getClientConfiguration() == null)
            return false;
        if (other.getClientConfiguration() != null
                && other.getClientConfiguration().equals(this.getClientConfiguration()) == false)
            return false;
        return true;
    }
}

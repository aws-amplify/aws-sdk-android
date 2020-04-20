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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

public class GetSecurityConfigurationResult implements Serializable {
    /**
     * <p>
     * The requested security configuration.
     * </p>
     */
    private SecurityConfiguration securityConfiguration;

    /**
     * <p>
     * The requested security configuration.
     * </p>
     *
     * @return <p>
     *         The requested security configuration.
     *         </p>
     */
    public SecurityConfiguration getSecurityConfiguration() {
        return securityConfiguration;
    }

    /**
     * <p>
     * The requested security configuration.
     * </p>
     *
     * @param securityConfiguration <p>
     *            The requested security configuration.
     *            </p>
     */
    public void setSecurityConfiguration(SecurityConfiguration securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The requested security configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityConfiguration <p>
     *            The requested security configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSecurityConfigurationResult withSecurityConfiguration(
            SecurityConfiguration securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
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
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: " + getSecurityConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSecurityConfigurationResult == false)
            return false;
        GetSecurityConfigurationResult other = (GetSecurityConfigurationResult) obj;

        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null
                && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        return true;
    }
}

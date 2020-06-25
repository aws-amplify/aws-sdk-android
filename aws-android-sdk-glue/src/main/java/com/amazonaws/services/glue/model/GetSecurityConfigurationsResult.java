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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

public class GetSecurityConfigurationsResult implements Serializable {
    /**
     * <p>
     * A list of security configurations.
     * </p>
     */
    private java.util.List<SecurityConfiguration> securityConfigurations;

    /**
     * <p>
     * A continuation token, if there are more security configurations to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of security configurations.
     * </p>
     *
     * @return <p>
     *         A list of security configurations.
     *         </p>
     */
    public java.util.List<SecurityConfiguration> getSecurityConfigurations() {
        return securityConfigurations;
    }

    /**
     * <p>
     * A list of security configurations.
     * </p>
     *
     * @param securityConfigurations <p>
     *            A list of security configurations.
     *            </p>
     */
    public void setSecurityConfigurations(
            java.util.Collection<SecurityConfiguration> securityConfigurations) {
        if (securityConfigurations == null) {
            this.securityConfigurations = null;
            return;
        }

        this.securityConfigurations = new java.util.ArrayList<SecurityConfiguration>(
                securityConfigurations);
    }

    /**
     * <p>
     * A list of security configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityConfigurations <p>
     *            A list of security configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSecurityConfigurationsResult withSecurityConfigurations(
            SecurityConfiguration... securityConfigurations) {
        if (getSecurityConfigurations() == null) {
            this.securityConfigurations = new java.util.ArrayList<SecurityConfiguration>(
                    securityConfigurations.length);
        }
        for (SecurityConfiguration value : securityConfigurations) {
            this.securityConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of security configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityConfigurations <p>
     *            A list of security configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSecurityConfigurationsResult withSecurityConfigurations(
            java.util.Collection<SecurityConfiguration> securityConfigurations) {
        setSecurityConfigurations(securityConfigurations);
        return this;
    }

    /**
     * <p>
     * A continuation token, if there are more security configurations to
     * return.
     * </p>
     *
     * @return <p>
     *         A continuation token, if there are more security configurations
     *         to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if there are more security configurations to
     * return.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if there are more security
     *            configurations to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if there are more security configurations to
     * return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if there are more security
     *            configurations to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSecurityConfigurationsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getSecurityConfigurations() != null)
            sb.append("SecurityConfigurations: " + getSecurityConfigurations() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSecurityConfigurations() == null) ? 0 : getSecurityConfigurations()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSecurityConfigurationsResult == false)
            return false;
        GetSecurityConfigurationsResult other = (GetSecurityConfigurationsResult) obj;

        if (other.getSecurityConfigurations() == null ^ this.getSecurityConfigurations() == null)
            return false;
        if (other.getSecurityConfigurations() != null
                && other.getSecurityConfigurations().equals(this.getSecurityConfigurations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

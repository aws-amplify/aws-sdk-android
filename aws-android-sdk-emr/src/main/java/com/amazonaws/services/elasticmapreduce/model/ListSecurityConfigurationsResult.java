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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

public class ListSecurityConfigurationsResult implements Serializable {
    /**
     * <p>
     * The creation date and time, and name, of each security configuration.
     * </p>
     */
    private java.util.List<SecurityConfigurationSummary> securityConfigurations;

    /**
     * <p>
     * A pagination token that indicates the next set of results to retrieve.
     * Include the marker in the next ListSecurityConfiguration call to retrieve
     * the next page of results, if required.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The creation date and time, and name, of each security configuration.
     * </p>
     *
     * @return <p>
     *         The creation date and time, and name, of each security
     *         configuration.
     *         </p>
     */
    public java.util.List<SecurityConfigurationSummary> getSecurityConfigurations() {
        return securityConfigurations;
    }

    /**
     * <p>
     * The creation date and time, and name, of each security configuration.
     * </p>
     *
     * @param securityConfigurations <p>
     *            The creation date and time, and name, of each security
     *            configuration.
     *            </p>
     */
    public void setSecurityConfigurations(
            java.util.Collection<SecurityConfigurationSummary> securityConfigurations) {
        if (securityConfigurations == null) {
            this.securityConfigurations = null;
            return;
        }

        this.securityConfigurations = new java.util.ArrayList<SecurityConfigurationSummary>(
                securityConfigurations);
    }

    /**
     * <p>
     * The creation date and time, and name, of each security configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityConfigurations <p>
     *            The creation date and time, and name, of each security
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSecurityConfigurationsResult withSecurityConfigurations(
            SecurityConfigurationSummary... securityConfigurations) {
        if (getSecurityConfigurations() == null) {
            this.securityConfigurations = new java.util.ArrayList<SecurityConfigurationSummary>(
                    securityConfigurations.length);
        }
        for (SecurityConfigurationSummary value : securityConfigurations) {
            this.securityConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The creation date and time, and name, of each security configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityConfigurations <p>
     *            The creation date and time, and name, of each security
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSecurityConfigurationsResult withSecurityConfigurations(
            java.util.Collection<SecurityConfigurationSummary> securityConfigurations) {
        setSecurityConfigurations(securityConfigurations);
        return this;
    }

    /**
     * <p>
     * A pagination token that indicates the next set of results to retrieve.
     * Include the marker in the next ListSecurityConfiguration call to retrieve
     * the next page of results, if required.
     * </p>
     *
     * @return <p>
     *         A pagination token that indicates the next set of results to
     *         retrieve. Include the marker in the next
     *         ListSecurityConfiguration call to retrieve the next page of
     *         results, if required.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * A pagination token that indicates the next set of results to retrieve.
     * Include the marker in the next ListSecurityConfiguration call to retrieve
     * the next page of results, if required.
     * </p>
     *
     * @param marker <p>
     *            A pagination token that indicates the next set of results to
     *            retrieve. Include the marker in the next
     *            ListSecurityConfiguration call to retrieve the next page of
     *            results, if required.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token that indicates the next set of results to retrieve.
     * Include the marker in the next ListSecurityConfiguration call to retrieve
     * the next page of results, if required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            A pagination token that indicates the next set of results to
     *            retrieve. Include the marker in the next
     *            ListSecurityConfiguration call to retrieve the next page of
     *            results, if required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSecurityConfigurationsResult withMarker(String marker) {
        this.marker = marker;
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
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
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSecurityConfigurationsResult == false)
            return false;
        ListSecurityConfigurationsResult other = (ListSecurityConfigurationsResult) obj;

        if (other.getSecurityConfigurations() == null ^ this.getSecurityConfigurations() == null)
            return false;
        if (other.getSecurityConfigurations() != null
                && other.getSecurityConfigurations().equals(this.getSecurityConfigurations()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}

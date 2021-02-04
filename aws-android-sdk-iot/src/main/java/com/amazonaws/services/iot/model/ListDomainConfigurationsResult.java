/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListDomainConfigurationsResult implements Serializable {
    /**
     * <p>
     * A list of objects that contain summary information about the user's
     * domain configurations.
     * </p>
     */
    private java.util.List<DomainConfigurationSummary> domainConfigurations;

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * A list of objects that contain summary information about the user's
     * domain configurations.
     * </p>
     *
     * @return <p>
     *         A list of objects that contain summary information about the
     *         user's domain configurations.
     *         </p>
     */
    public java.util.List<DomainConfigurationSummary> getDomainConfigurations() {
        return domainConfigurations;
    }

    /**
     * <p>
     * A list of objects that contain summary information about the user's
     * domain configurations.
     * </p>
     *
     * @param domainConfigurations <p>
     *            A list of objects that contain summary information about the
     *            user's domain configurations.
     *            </p>
     */
    public void setDomainConfigurations(
            java.util.Collection<DomainConfigurationSummary> domainConfigurations) {
        if (domainConfigurations == null) {
            this.domainConfigurations = null;
            return;
        }

        this.domainConfigurations = new java.util.ArrayList<DomainConfigurationSummary>(
                domainConfigurations);
    }

    /**
     * <p>
     * A list of objects that contain summary information about the user's
     * domain configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainConfigurations <p>
     *            A list of objects that contain summary information about the
     *            user's domain configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDomainConfigurationsResult withDomainConfigurations(
            DomainConfigurationSummary... domainConfigurations) {
        if (getDomainConfigurations() == null) {
            this.domainConfigurations = new java.util.ArrayList<DomainConfigurationSummary>(
                    domainConfigurations.length);
        }
        for (DomainConfigurationSummary value : domainConfigurations) {
            this.domainConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that contain summary information about the user's
     * domain configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainConfigurations <p>
     *            A list of objects that contain summary information about the
     *            user's domain configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDomainConfigurationsResult withDomainConfigurations(
            java.util.Collection<DomainConfigurationSummary> domainConfigurations) {
        setDomainConfigurations(domainConfigurations);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @return <p>
     *         The marker for the next set of results.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param nextMarker <p>
     *            The marker for the next set of results.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param nextMarker <p>
     *            The marker for the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDomainConfigurationsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getDomainConfigurations() != null)
            sb.append("domainConfigurations: " + getDomainConfigurations() + ",");
        if (getNextMarker() != null)
            sb.append("nextMarker: " + getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDomainConfigurations() == null) ? 0 : getDomainConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDomainConfigurationsResult == false)
            return false;
        ListDomainConfigurationsResult other = (ListDomainConfigurationsResult) obj;

        if (other.getDomainConfigurations() == null ^ this.getDomainConfigurations() == null)
            return false;
        if (other.getDomainConfigurations() != null
                && other.getDomainConfigurations().equals(this.getDomainConfigurations()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }
}

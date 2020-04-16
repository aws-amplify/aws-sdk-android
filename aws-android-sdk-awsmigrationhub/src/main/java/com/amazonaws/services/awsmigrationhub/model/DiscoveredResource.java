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

package com.amazonaws.services.awsmigrationhub.model;

import java.io.Serializable;

/**
 * <p>
 * Object representing the on-premises resource being migrated.
 * </p>
 */
public class DiscoveredResource implements Serializable {
    /**
     * <p>
     * The configurationId in Application Discovery Service that uniquely
     * identifies the on-premise resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^.{1,1600}$<br/>
     */
    private String configurationId;

    /**
     * <p>
     * A description that can be free-form text to record additional detail
     * about the discovered resource for clarity or later reference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>^.{0,500}$<br/>
     */
    private String description;

    /**
     * <p>
     * The configurationId in Application Discovery Service that uniquely
     * identifies the on-premise resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^.{1,1600}$<br/>
     *
     * @return <p>
     *         The configurationId in Application Discovery Service that
     *         uniquely identifies the on-premise resource.
     *         </p>
     */
    public String getConfigurationId() {
        return configurationId;
    }

    /**
     * <p>
     * The configurationId in Application Discovery Service that uniquely
     * identifies the on-premise resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^.{1,1600}$<br/>
     *
     * @param configurationId <p>
     *            The configurationId in Application Discovery Service that
     *            uniquely identifies the on-premise resource.
     *            </p>
     */
    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    /**
     * <p>
     * The configurationId in Application Discovery Service that uniquely
     * identifies the on-premise resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^.{1,1600}$<br/>
     *
     * @param configurationId <p>
     *            The configurationId in Application Discovery Service that
     *            uniquely identifies the on-premise resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscoveredResource withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    /**
     * <p>
     * A description that can be free-form text to record additional detail
     * about the discovered resource for clarity or later reference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>^.{0,500}$<br/>
     *
     * @return <p>
     *         A description that can be free-form text to record additional
     *         detail about the discovered resource for clarity or later
     *         reference.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description that can be free-form text to record additional detail
     * about the discovered resource for clarity or later reference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>^.{0,500}$<br/>
     *
     * @param description <p>
     *            A description that can be free-form text to record additional
     *            detail about the discovered resource for clarity or later
     *            reference.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description that can be free-form text to record additional detail
     * about the discovered resource for clarity or later reference.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>^.{0,500}$<br/>
     *
     * @param description <p>
     *            A description that can be free-form text to record additional
     *            detail about the discovered resource for clarity or later
     *            reference.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscoveredResource withDescription(String description) {
        this.description = description;
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
        if (getConfigurationId() != null)
            sb.append("ConfigurationId: " + getConfigurationId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfigurationId() == null) ? 0 : getConfigurationId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscoveredResource == false)
            return false;
        DiscoveredResource other = (DiscoveredResource) obj;

        if (other.getConfigurationId() == null ^ this.getConfigurationId() == null)
            return false;
        if (other.getConfigurationId() != null
                && other.getConfigurationId().equals(this.getConfigurationId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}

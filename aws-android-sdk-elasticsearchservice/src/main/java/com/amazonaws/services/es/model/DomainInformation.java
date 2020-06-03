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

package com.amazonaws.services.es.model;

import java.io.Serializable;

public class DomainInformation implements Serializable {
    /**
     * The new value for the ownerId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     */
    private String ownerId;

    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the
     * domains owned by an account within an AWS region. Domain names start with
     * a letter or number and can contain the following characters: a-z
     * (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

    /**
     * The new value for the region property for this object.
     */
    private String region;

    /**
     * Returns the value of the ownerId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @return The value of the ownerId property for this object.
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of ownerId
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @param ownerId The new value for the ownerId property for this object.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Sets the value of the ownerId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @param ownerId The new value for the ownerId property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainInformation withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the
     * domains owned by an account within an AWS region. Domain names start with
     * a letter or number and can contain the following characters: a-z
     * (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return <p>
     *         The name of an Elasticsearch domain. Domain names are unique
     *         across the domains owned by an account within an AWS region.
     *         Domain names start with a letter or number and can contain the
     *         following characters: a-z (lowercase), 0-9, and - (hyphen).
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the
     * domains owned by an account within an AWS region. Domain names start with
     * a letter or number and can contain the following characters: a-z
     * (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName <p>
     *            The name of an Elasticsearch domain. Domain names are unique
     *            across the domains owned by an account within an AWS region.
     *            Domain names start with a letter or number and can contain the
     *            following characters: a-z (lowercase), 0-9, and - (hyphen).
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the
     * domains owned by an account within an AWS region. Domain names start with
     * a letter or number and can contain the following characters: a-z
     * (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName <p>
     *            The name of an Elasticsearch domain. Domain names are unique
     *            across the domains owned by an account within an AWS region.
     *            Domain names start with a letter or number and can contain the
     *            following characters: a-z (lowercase), 0-9, and - (hyphen).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainInformation withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Returns the value of the region property for this object.
     *
     * @return The value of the region property for this object.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of region
     *
     * @param region The new value for the region property for this object.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Sets the value of the region property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region The new value for the region property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainInformation withRegion(String region) {
        this.region = region;
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
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainInformation == false)
            return false;
        DomainInformation other = (DomainInformation) obj;

        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }
}

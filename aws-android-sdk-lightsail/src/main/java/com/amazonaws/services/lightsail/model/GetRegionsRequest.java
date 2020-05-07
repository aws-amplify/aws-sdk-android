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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of all valid regions for Amazon Lightsail. Use the
 * <code>include availability zones</code> parameter to also return the
 * Availability Zones in a region.
 * </p>
 */
public class GetRegionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A Boolean value indicating whether to also include Availability Zones in
     * your get regions request. Availability Zones are indicated with a letter:
     * e.g., <code>us-east-2a</code>.
     * </p>
     */
    private Boolean includeAvailabilityZones;

    /**
     * <p>
     * &gt;A Boolean value indicating whether to also include Availability Zones
     * for databases in your get regions request. Availability Zones are
     * indicated with a letter (e.g., <code>us-east-2a</code>).
     * </p>
     */
    private Boolean includeRelationalDatabaseAvailabilityZones;

    /**
     * <p>
     * A Boolean value indicating whether to also include Availability Zones in
     * your get regions request. Availability Zones are indicated with a letter:
     * e.g., <code>us-east-2a</code>.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether to also include Availability
     *         Zones in your get regions request. Availability Zones are
     *         indicated with a letter: e.g., <code>us-east-2a</code>.
     *         </p>
     */
    public Boolean isIncludeAvailabilityZones() {
        return includeAvailabilityZones;
    }

    /**
     * <p>
     * A Boolean value indicating whether to also include Availability Zones in
     * your get regions request. Availability Zones are indicated with a letter:
     * e.g., <code>us-east-2a</code>.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether to also include Availability
     *         Zones in your get regions request. Availability Zones are
     *         indicated with a letter: e.g., <code>us-east-2a</code>.
     *         </p>
     */
    public Boolean getIncludeAvailabilityZones() {
        return includeAvailabilityZones;
    }

    /**
     * <p>
     * A Boolean value indicating whether to also include Availability Zones in
     * your get regions request. Availability Zones are indicated with a letter:
     * e.g., <code>us-east-2a</code>.
     * </p>
     *
     * @param includeAvailabilityZones <p>
     *            A Boolean value indicating whether to also include
     *            Availability Zones in your get regions request. Availability
     *            Zones are indicated with a letter: e.g.,
     *            <code>us-east-2a</code>.
     *            </p>
     */
    public void setIncludeAvailabilityZones(Boolean includeAvailabilityZones) {
        this.includeAvailabilityZones = includeAvailabilityZones;
    }

    /**
     * <p>
     * A Boolean value indicating whether to also include Availability Zones in
     * your get regions request. Availability Zones are indicated with a letter:
     * e.g., <code>us-east-2a</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeAvailabilityZones <p>
     *            A Boolean value indicating whether to also include
     *            Availability Zones in your get regions request. Availability
     *            Zones are indicated with a letter: e.g.,
     *            <code>us-east-2a</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRegionsRequest withIncludeAvailabilityZones(Boolean includeAvailabilityZones) {
        this.includeAvailabilityZones = includeAvailabilityZones;
        return this;
    }

    /**
     * <p>
     * &gt;A Boolean value indicating whether to also include Availability Zones
     * for databases in your get regions request. Availability Zones are
     * indicated with a letter (e.g., <code>us-east-2a</code>).
     * </p>
     *
     * @return <p>
     *         &gt;A Boolean value indicating whether to also include
     *         Availability Zones for databases in your get regions request.
     *         Availability Zones are indicated with a letter (e.g.,
     *         <code>us-east-2a</code>).
     *         </p>
     */
    public Boolean isIncludeRelationalDatabaseAvailabilityZones() {
        return includeRelationalDatabaseAvailabilityZones;
    }

    /**
     * <p>
     * &gt;A Boolean value indicating whether to also include Availability Zones
     * for databases in your get regions request. Availability Zones are
     * indicated with a letter (e.g., <code>us-east-2a</code>).
     * </p>
     *
     * @return <p>
     *         &gt;A Boolean value indicating whether to also include
     *         Availability Zones for databases in your get regions request.
     *         Availability Zones are indicated with a letter (e.g.,
     *         <code>us-east-2a</code>).
     *         </p>
     */
    public Boolean getIncludeRelationalDatabaseAvailabilityZones() {
        return includeRelationalDatabaseAvailabilityZones;
    }

    /**
     * <p>
     * &gt;A Boolean value indicating whether to also include Availability Zones
     * for databases in your get regions request. Availability Zones are
     * indicated with a letter (e.g., <code>us-east-2a</code>).
     * </p>
     *
     * @param includeRelationalDatabaseAvailabilityZones <p>
     *            &gt;A Boolean value indicating whether to also include
     *            Availability Zones for databases in your get regions request.
     *            Availability Zones are indicated with a letter (e.g.,
     *            <code>us-east-2a</code>).
     *            </p>
     */
    public void setIncludeRelationalDatabaseAvailabilityZones(
            Boolean includeRelationalDatabaseAvailabilityZones) {
        this.includeRelationalDatabaseAvailabilityZones = includeRelationalDatabaseAvailabilityZones;
    }

    /**
     * <p>
     * &gt;A Boolean value indicating whether to also include Availability Zones
     * for databases in your get regions request. Availability Zones are
     * indicated with a letter (e.g., <code>us-east-2a</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeRelationalDatabaseAvailabilityZones <p>
     *            &gt;A Boolean value indicating whether to also include
     *            Availability Zones for databases in your get regions request.
     *            Availability Zones are indicated with a letter (e.g.,
     *            <code>us-east-2a</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRegionsRequest withIncludeRelationalDatabaseAvailabilityZones(
            Boolean includeRelationalDatabaseAvailabilityZones) {
        this.includeRelationalDatabaseAvailabilityZones = includeRelationalDatabaseAvailabilityZones;
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
        if (getIncludeAvailabilityZones() != null)
            sb.append("includeAvailabilityZones: " + getIncludeAvailabilityZones() + ",");
        if (getIncludeRelationalDatabaseAvailabilityZones() != null)
            sb.append("includeRelationalDatabaseAvailabilityZones: "
                    + getIncludeRelationalDatabaseAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getIncludeAvailabilityZones() == null) ? 0 : getIncludeAvailabilityZones()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludeRelationalDatabaseAvailabilityZones() == null) ? 0
                        : getIncludeRelationalDatabaseAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRegionsRequest == false)
            return false;
        GetRegionsRequest other = (GetRegionsRequest) obj;

        if (other.getIncludeAvailabilityZones() == null
                ^ this.getIncludeAvailabilityZones() == null)
            return false;
        if (other.getIncludeAvailabilityZones() != null
                && other.getIncludeAvailabilityZones().equals(this.getIncludeAvailabilityZones()) == false)
            return false;
        if (other.getIncludeRelationalDatabaseAvailabilityZones() == null
                ^ this.getIncludeRelationalDatabaseAvailabilityZones() == null)
            return false;
        if (other.getIncludeRelationalDatabaseAvailabilityZones() != null
                && other.getIncludeRelationalDatabaseAvailabilityZones().equals(
                        this.getIncludeRelationalDatabaseAvailabilityZones()) == false)
            return false;
        return true;
    }
}

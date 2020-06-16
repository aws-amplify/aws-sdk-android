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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Get the information about an invalidation.
 * </p>
 */
public class GetInvalidation2019_03_26Request extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The distribution's ID.
     * </p>
     */
    private String distributionId;

    /**
     * <p>
     * The identifier for the invalidation request, for example,
     * <code>IDFDVBD632BHDS5</code>.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The distribution's ID.
     * </p>
     *
     * @return <p>
     *         The distribution's ID.
     *         </p>
     */
    public String getDistributionId() {
        return distributionId;
    }

    /**
     * <p>
     * The distribution's ID.
     * </p>
     *
     * @param distributionId <p>
     *            The distribution's ID.
     *            </p>
     */
    public void setDistributionId(String distributionId) {
        this.distributionId = distributionId;
    }

    /**
     * <p>
     * The distribution's ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param distributionId <p>
     *            The distribution's ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInvalidation2019_03_26Request withDistributionId(String distributionId) {
        this.distributionId = distributionId;
        return this;
    }

    /**
     * <p>
     * The identifier for the invalidation request, for example,
     * <code>IDFDVBD632BHDS5</code>.
     * </p>
     *
     * @return <p>
     *         The identifier for the invalidation request, for example,
     *         <code>IDFDVBD632BHDS5</code>.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier for the invalidation request, for example,
     * <code>IDFDVBD632BHDS5</code>.
     * </p>
     *
     * @param id <p>
     *            The identifier for the invalidation request, for example,
     *            <code>IDFDVBD632BHDS5</code>.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the invalidation request, for example,
     * <code>IDFDVBD632BHDS5</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier for the invalidation request, for example,
     *            <code>IDFDVBD632BHDS5</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInvalidation2019_03_26Request withId(String id) {
        this.id = id;
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
        if (getDistributionId() != null)
            sb.append("DistributionId: " + getDistributionId() + ",");
        if (getId() != null)
            sb.append("Id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDistributionId() == null) ? 0 : getDistributionId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInvalidation2019_03_26Request == false)
            return false;
        GetInvalidation2019_03_26Request other = (GetInvalidation2019_03_26Request) obj;

        if (other.getDistributionId() == null ^ this.getDistributionId() == null)
            return false;
        if (other.getDistributionId() != null
                && other.getDistributionId().equals(this.getDistributionId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }
}

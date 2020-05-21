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

/**
 * <p>
 * Details about the target configuration.
 * </p>
 */
public class TargetConfigurationRequest implements Serializable {
    /**
     * <p>
     * The number of instances the Covertible Reserved Instance offering can be
     * applied to. This parameter is reserved and cannot be specified in a
     * request
     * </p>
     */
    private Integer instanceCount;

    /**
     * <p>
     * The Convertible Reserved Instance offering ID.
     * </p>
     */
    private String offeringId;

    /**
     * <p>
     * The number of instances the Covertible Reserved Instance offering can be
     * applied to. This parameter is reserved and cannot be specified in a
     * request
     * </p>
     *
     * @return <p>
     *         The number of instances the Covertible Reserved Instance offering
     *         can be applied to. This parameter is reserved and cannot be
     *         specified in a request
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * The number of instances the Covertible Reserved Instance offering can be
     * applied to. This parameter is reserved and cannot be specified in a
     * request
     * </p>
     *
     * @param instanceCount <p>
     *            The number of instances the Covertible Reserved Instance
     *            offering can be applied to. This parameter is reserved and
     *            cannot be specified in a request
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances the Covertible Reserved Instance offering can be
     * applied to. This parameter is reserved and cannot be specified in a
     * request
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCount <p>
     *            The number of instances the Covertible Reserved Instance
     *            offering can be applied to. This parameter is reserved and
     *            cannot be specified in a request
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetConfigurationRequest withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * <p>
     * The Convertible Reserved Instance offering ID.
     * </p>
     *
     * @return <p>
     *         The Convertible Reserved Instance offering ID.
     *         </p>
     */
    public String getOfferingId() {
        return offeringId;
    }

    /**
     * <p>
     * The Convertible Reserved Instance offering ID.
     * </p>
     *
     * @param offeringId <p>
     *            The Convertible Reserved Instance offering ID.
     *            </p>
     */
    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * <p>
     * The Convertible Reserved Instance offering ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offeringId <p>
     *            The Convertible Reserved Instance offering ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetConfigurationRequest withOfferingId(String offeringId) {
        this.offeringId = offeringId;
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
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getOfferingId() != null)
            sb.append("OfferingId: " + getOfferingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetConfigurationRequest == false)
            return false;
        TargetConfigurationRequest other = (TargetConfigurationRequest) obj;

        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null
                && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        return true;
    }
}

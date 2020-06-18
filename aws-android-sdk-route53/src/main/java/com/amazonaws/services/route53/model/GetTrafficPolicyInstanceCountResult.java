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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains information about the resource record sets that
 * Amazon Route 53 created based on a specified traffic policy.
 * </p>
 */
public class GetTrafficPolicyInstanceCountResult implements Serializable {
    /**
     * <p>
     * The number of traffic policy instances that are associated with the
     * current AWS account.
     * </p>
     */
    private Integer trafficPolicyInstanceCount;

    /**
     * <p>
     * The number of traffic policy instances that are associated with the
     * current AWS account.
     * </p>
     *
     * @return <p>
     *         The number of traffic policy instances that are associated with
     *         the current AWS account.
     *         </p>
     */
    public Integer getTrafficPolicyInstanceCount() {
        return trafficPolicyInstanceCount;
    }

    /**
     * <p>
     * The number of traffic policy instances that are associated with the
     * current AWS account.
     * </p>
     *
     * @param trafficPolicyInstanceCount <p>
     *            The number of traffic policy instances that are associated
     *            with the current AWS account.
     *            </p>
     */
    public void setTrafficPolicyInstanceCount(Integer trafficPolicyInstanceCount) {
        this.trafficPolicyInstanceCount = trafficPolicyInstanceCount;
    }

    /**
     * <p>
     * The number of traffic policy instances that are associated with the
     * current AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficPolicyInstanceCount <p>
     *            The number of traffic policy instances that are associated
     *            with the current AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTrafficPolicyInstanceCountResult withTrafficPolicyInstanceCount(
            Integer trafficPolicyInstanceCount) {
        this.trafficPolicyInstanceCount = trafficPolicyInstanceCount;
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
        if (getTrafficPolicyInstanceCount() != null)
            sb.append("TrafficPolicyInstanceCount: " + getTrafficPolicyInstanceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTrafficPolicyInstanceCount() == null) ? 0 : getTrafficPolicyInstanceCount()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTrafficPolicyInstanceCountResult == false)
            return false;
        GetTrafficPolicyInstanceCountResult other = (GetTrafficPolicyInstanceCountResult) obj;

        if (other.getTrafficPolicyInstanceCount() == null
                ^ this.getTrafficPolicyInstanceCount() == null)
            return false;
        if (other.getTrafficPolicyInstanceCount() != null
                && other.getTrafficPolicyInstanceCount().equals(
                        this.getTrafficPolicyInstanceCount()) == false)
            return false;
        return true;
    }
}

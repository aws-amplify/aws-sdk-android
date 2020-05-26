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

public class DeleteTrafficMirrorFilterRuleResult implements Serializable {
    /**
     * <p>
     * The ID of the deleted Traffic Mirror rule.
     * </p>
     */
    private String trafficMirrorFilterRuleId;

    /**
     * <p>
     * The ID of the deleted Traffic Mirror rule.
     * </p>
     *
     * @return <p>
     *         The ID of the deleted Traffic Mirror rule.
     *         </p>
     */
    public String getTrafficMirrorFilterRuleId() {
        return trafficMirrorFilterRuleId;
    }

    /**
     * <p>
     * The ID of the deleted Traffic Mirror rule.
     * </p>
     *
     * @param trafficMirrorFilterRuleId <p>
     *            The ID of the deleted Traffic Mirror rule.
     *            </p>
     */
    public void setTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
        this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
    }

    /**
     * <p>
     * The ID of the deleted Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorFilterRuleId <p>
     *            The ID of the deleted Traffic Mirror rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTrafficMirrorFilterRuleResult withTrafficMirrorFilterRuleId(
            String trafficMirrorFilterRuleId) {
        this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
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
        if (getTrafficMirrorFilterRuleId() != null)
            sb.append("TrafficMirrorFilterRuleId: " + getTrafficMirrorFilterRuleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTrafficMirrorFilterRuleId() == null) ? 0 : getTrafficMirrorFilterRuleId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTrafficMirrorFilterRuleResult == false)
            return false;
        DeleteTrafficMirrorFilterRuleResult other = (DeleteTrafficMirrorFilterRuleResult) obj;

        if (other.getTrafficMirrorFilterRuleId() == null
                ^ this.getTrafficMirrorFilterRuleId() == null)
            return false;
        if (other.getTrafficMirrorFilterRuleId() != null
                && other.getTrafficMirrorFilterRuleId().equals(this.getTrafficMirrorFilterRuleId()) == false)
            return false;
        return true;
    }
}

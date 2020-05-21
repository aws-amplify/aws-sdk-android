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

public class ModifyTrafficMirrorFilterRuleResult implements Serializable {
    /**
     * <p>
     * Modifies a Traffic Mirror rule.
     * </p>
     */
    private TrafficMirrorFilterRule trafficMirrorFilterRule;

    /**
     * <p>
     * Modifies a Traffic Mirror rule.
     * </p>
     *
     * @return <p>
     *         Modifies a Traffic Mirror rule.
     *         </p>
     */
    public TrafficMirrorFilterRule getTrafficMirrorFilterRule() {
        return trafficMirrorFilterRule;
    }

    /**
     * <p>
     * Modifies a Traffic Mirror rule.
     * </p>
     *
     * @param trafficMirrorFilterRule <p>
     *            Modifies a Traffic Mirror rule.
     *            </p>
     */
    public void setTrafficMirrorFilterRule(TrafficMirrorFilterRule trafficMirrorFilterRule) {
        this.trafficMirrorFilterRule = trafficMirrorFilterRule;
    }

    /**
     * <p>
     * Modifies a Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorFilterRule <p>
     *            Modifies a Traffic Mirror rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorFilterRuleResult withTrafficMirrorFilterRule(
            TrafficMirrorFilterRule trafficMirrorFilterRule) {
        this.trafficMirrorFilterRule = trafficMirrorFilterRule;
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
        if (getTrafficMirrorFilterRule() != null)
            sb.append("TrafficMirrorFilterRule: " + getTrafficMirrorFilterRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTrafficMirrorFilterRule() == null) ? 0 : getTrafficMirrorFilterRule()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyTrafficMirrorFilterRuleResult == false)
            return false;
        ModifyTrafficMirrorFilterRuleResult other = (ModifyTrafficMirrorFilterRuleResult) obj;

        if (other.getTrafficMirrorFilterRule() == null ^ this.getTrafficMirrorFilterRule() == null)
            return false;
        if (other.getTrafficMirrorFilterRule() != null
                && other.getTrafficMirrorFilterRule().equals(this.getTrafficMirrorFilterRule()) == false)
            return false;
        return true;
    }
}

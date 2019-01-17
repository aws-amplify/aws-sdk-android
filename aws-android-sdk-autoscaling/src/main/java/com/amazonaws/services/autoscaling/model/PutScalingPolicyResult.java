/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of PutScalingPolicy.
 * </p>
 */
public class PutScalingPolicyResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String policyARN;

    /**
     * <p>
     * The CloudWatch alarms created for the target tracking policy.
     * </p>
     */
    private java.util.List<Alarm> alarms = new java.util.ArrayList<Alarm>();

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the policy.
     *         </p>
     */
    public String getPolicyARN() {
        return policyARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param policyARN <p>
     *            The Amazon Resource Name (ARN) of the policy.
     *            </p>
     */
    public void setPolicyARN(String policyARN) {
        this.policyARN = policyARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param policyARN <p>
     *            The Amazon Resource Name (ARN) of the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScalingPolicyResult withPolicyARN(String policyARN) {
        this.policyARN = policyARN;
        return this;
    }

    /**
     * <p>
     * The CloudWatch alarms created for the target tracking policy.
     * </p>
     *
     * @return <p>
     *         The CloudWatch alarms created for the target tracking policy.
     *         </p>
     */
    public java.util.List<Alarm> getAlarms() {
        return alarms;
    }

    /**
     * <p>
     * The CloudWatch alarms created for the target tracking policy.
     * </p>
     *
     * @param alarms <p>
     *            The CloudWatch alarms created for the target tracking policy.
     *            </p>
     */
    public void setAlarms(java.util.Collection<Alarm> alarms) {
        if (alarms == null) {
            this.alarms = null;
            return;
        }

        this.alarms = new java.util.ArrayList<Alarm>(alarms);
    }

    /**
     * <p>
     * The CloudWatch alarms created for the target tracking policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarms <p>
     *            The CloudWatch alarms created for the target tracking policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScalingPolicyResult withAlarms(Alarm... alarms) {
        if (getAlarms() == null) {
            this.alarms = new java.util.ArrayList<Alarm>(alarms.length);
        }
        for (Alarm value : alarms) {
            this.alarms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The CloudWatch alarms created for the target tracking policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarms <p>
     *            The CloudWatch alarms created for the target tracking policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScalingPolicyResult withAlarms(java.util.Collection<Alarm> alarms) {
        setAlarms(alarms);
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
        if (getPolicyARN() != null)
            sb.append("PolicyARN: " + getPolicyARN() + ",");
        if (getAlarms() != null)
            sb.append("Alarms: " + getAlarms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyARN() == null) ? 0 : getPolicyARN().hashCode());
        hashCode = prime * hashCode + ((getAlarms() == null) ? 0 : getAlarms().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutScalingPolicyResult == false)
            return false;
        PutScalingPolicyResult other = (PutScalingPolicyResult) obj;

        if (other.getPolicyARN() == null ^ this.getPolicyARN() == null)
            return false;
        if (other.getPolicyARN() != null
                && other.getPolicyARN().equals(this.getPolicyARN()) == false)
            return false;
        if (other.getAlarms() == null ^ this.getAlarms() == null)
            return false;
        if (other.getAlarms() != null && other.getAlarms().equals(this.getAlarms()) == false)
            return false;
        return true;
    }
}

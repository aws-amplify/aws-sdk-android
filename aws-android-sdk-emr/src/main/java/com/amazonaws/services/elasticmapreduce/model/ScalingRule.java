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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * A scale-in or scale-out rule that defines scaling activity, including the
 * CloudWatch metric alarm that triggers activity, how EC2 instances are added
 * or removed, and the periodicity of adjustments. The automatic scaling policy
 * for an instance group can comprise one or more automatic scaling rules.
 * </p>
 */
public class ScalingRule implements Serializable {
    /**
     * <p>
     * The name used to identify an automatic scaling rule. Rule names must be
     * unique within a scaling policy.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A friendly, more verbose description of the automatic scaling rule.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The conditions that trigger an automatic scaling activity.
     * </p>
     */
    private ScalingAction action;

    /**
     * <p>
     * The CloudWatch alarm definition that determines when automatic scaling
     * activity is triggered.
     * </p>
     */
    private ScalingTrigger trigger;

    /**
     * <p>
     * The name used to identify an automatic scaling rule. Rule names must be
     * unique within a scaling policy.
     * </p>
     *
     * @return <p>
     *         The name used to identify an automatic scaling rule. Rule names
     *         must be unique within a scaling policy.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name used to identify an automatic scaling rule. Rule names must be
     * unique within a scaling policy.
     * </p>
     *
     * @param name <p>
     *            The name used to identify an automatic scaling rule. Rule
     *            names must be unique within a scaling policy.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name used to identify an automatic scaling rule. Rule names must be
     * unique within a scaling policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name used to identify an automatic scaling rule. Rule
     *            names must be unique within a scaling policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A friendly, more verbose description of the automatic scaling rule.
     * </p>
     *
     * @return <p>
     *         A friendly, more verbose description of the automatic scaling
     *         rule.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A friendly, more verbose description of the automatic scaling rule.
     * </p>
     *
     * @param description <p>
     *            A friendly, more verbose description of the automatic scaling
     *            rule.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A friendly, more verbose description of the automatic scaling rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A friendly, more verbose description of the automatic scaling
     *            rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The conditions that trigger an automatic scaling activity.
     * </p>
     *
     * @return <p>
     *         The conditions that trigger an automatic scaling activity.
     *         </p>
     */
    public ScalingAction getAction() {
        return action;
    }

    /**
     * <p>
     * The conditions that trigger an automatic scaling activity.
     * </p>
     *
     * @param action <p>
     *            The conditions that trigger an automatic scaling activity.
     *            </p>
     */
    public void setAction(ScalingAction action) {
        this.action = action;
    }

    /**
     * <p>
     * The conditions that trigger an automatic scaling activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param action <p>
     *            The conditions that trigger an automatic scaling activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingRule withAction(ScalingAction action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The CloudWatch alarm definition that determines when automatic scaling
     * activity is triggered.
     * </p>
     *
     * @return <p>
     *         The CloudWatch alarm definition that determines when automatic
     *         scaling activity is triggered.
     *         </p>
     */
    public ScalingTrigger getTrigger() {
        return trigger;
    }

    /**
     * <p>
     * The CloudWatch alarm definition that determines when automatic scaling
     * activity is triggered.
     * </p>
     *
     * @param trigger <p>
     *            The CloudWatch alarm definition that determines when automatic
     *            scaling activity is triggered.
     *            </p>
     */
    public void setTrigger(ScalingTrigger trigger) {
        this.trigger = trigger;
    }

    /**
     * <p>
     * The CloudWatch alarm definition that determines when automatic scaling
     * activity is triggered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trigger <p>
     *            The CloudWatch alarm definition that determines when automatic
     *            scaling activity is triggered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingRule withTrigger(ScalingTrigger trigger) {
        this.trigger = trigger;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getTrigger() != null)
            sb.append("Trigger: " + getTrigger());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getTrigger() == null) ? 0 : getTrigger().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingRule == false)
            return false;
        ScalingRule other = (ScalingRule) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getTrigger() == null ^ this.getTrigger() == null)
            return false;
        if (other.getTrigger() != null && other.getTrigger().equals(this.getTrigger()) == false)
            return false;
        return true;
    }
}

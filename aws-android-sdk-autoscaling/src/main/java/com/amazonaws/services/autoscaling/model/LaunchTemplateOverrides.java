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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an override for a launch template.
 * </p>
 */
public class LaunchTemplateOverrides implements Serializable {
    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * For information about available instance types, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     * >Available Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String instanceType;

    /**
     * <p>
     * The number of capacity units, which gives the instance type a
     * proportional weight to other instance types. For example, larger instance
     * types are generally weighted more than smaller instance types. These are
     * the same units that you chose to set the desired capacity in terms of
     * instances, or a performance attribute such as vCPUs, memory, or I/O.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 999.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String weightedCapacity;

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * For information about available instance types, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     * >Available Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The instance type.
     *         </p>
     *         <p>
     *         For information about available instance types, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     *         >Available Instance Types</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide.</i>
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * For information about available instance types, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     * >Available Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     *            <p>
     *            For information about available instance types, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     *            >Available Instance Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide.</i>
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * For information about available instance types, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     * >Available Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     *            <p>
     *            For information about available instance types, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     *            >Available Instance Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateOverrides withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The number of capacity units, which gives the instance type a
     * proportional weight to other instance types. For example, larger instance
     * types are generally weighted more than smaller instance types. These are
     * the same units that you chose to set the desired capacity in terms of
     * instances, or a performance attribute such as vCPUs, memory, or I/O.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 999.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The number of capacity units, which gives the instance type a
     *         proportional weight to other instance types. For example, larger
     *         instance types are generally weighted more than smaller instance
     *         types. These are the same units that you chose to set the desired
     *         capacity in terms of instances, or a performance attribute such
     *         as vCPUs, memory, or I/O.
     *         </p>
     *         <p>
     *         Valid Range: Minimum value of 1. Maximum value of 999.
     *         </p>
     */
    public String getWeightedCapacity() {
        return weightedCapacity;
    }

    /**
     * <p>
     * The number of capacity units, which gives the instance type a
     * proportional weight to other instance types. For example, larger instance
     * types are generally weighted more than smaller instance types. These are
     * the same units that you chose to set the desired capacity in terms of
     * instances, or a performance attribute such as vCPUs, memory, or I/O.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 999.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param weightedCapacity <p>
     *            The number of capacity units, which gives the instance type a
     *            proportional weight to other instance types. For example,
     *            larger instance types are generally weighted more than smaller
     *            instance types. These are the same units that you chose to set
     *            the desired capacity in terms of instances, or a performance
     *            attribute such as vCPUs, memory, or I/O.
     *            </p>
     *            <p>
     *            Valid Range: Minimum value of 1. Maximum value of 999.
     *            </p>
     */
    public void setWeightedCapacity(String weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    /**
     * <p>
     * The number of capacity units, which gives the instance type a
     * proportional weight to other instance types. For example, larger instance
     * types are generally weighted more than smaller instance types. These are
     * the same units that you chose to set the desired capacity in terms of
     * instances, or a performance attribute such as vCPUs, memory, or I/O.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 999.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param weightedCapacity <p>
     *            The number of capacity units, which gives the instance type a
     *            proportional weight to other instance types. For example,
     *            larger instance types are generally weighted more than smaller
     *            instance types. These are the same units that you chose to set
     *            the desired capacity in terms of instances, or a performance
     *            attribute such as vCPUs, memory, or I/O.
     *            </p>
     *            <p>
     *            Valid Range: Minimum value of 1. Maximum value of 999.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateOverrides withWeightedCapacity(String weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
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
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getWeightedCapacity() != null)
            sb.append("WeightedCapacity: " + getWeightedCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getWeightedCapacity() == null) ? 0 : getWeightedCapacity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateOverrides == false)
            return false;
        LaunchTemplateOverrides other = (LaunchTemplateOverrides) obj;

        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getWeightedCapacity() == null ^ this.getWeightedCapacity() == null)
            return false;
        if (other.getWeightedCapacity() != null
                && other.getWeightedCapacity().equals(this.getWeightedCapacity()) == false)
            return false;
        return true;
    }
}

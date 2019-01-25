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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Terminates the specified instance and optionally adjusts the desired group
 * size.
 * </p>
 * <p>
 * This call simply makes a termination request. The instance is not terminated
 * immediately.
 * </p>
 */
public class TerminateInstanceInAutoScalingGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String instanceId;

    /**
     * <p>
     * Indicates whether terminating the instance also decrements the size of
     * the Auto Scaling group.
     * </p>
     */
    private Boolean shouldDecrementDesiredCapacity;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateInstanceInAutoScalingGroupRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * Indicates whether terminating the instance also decrements the size of
     * the Auto Scaling group.
     * </p>
     *
     * @return <p>
     *         Indicates whether terminating the instance also decrements the
     *         size of the Auto Scaling group.
     *         </p>
     */
    public Boolean isShouldDecrementDesiredCapacity() {
        return shouldDecrementDesiredCapacity;
    }

    /**
     * <p>
     * Indicates whether terminating the instance also decrements the size of
     * the Auto Scaling group.
     * </p>
     *
     * @return <p>
     *         Indicates whether terminating the instance also decrements the
     *         size of the Auto Scaling group.
     *         </p>
     */
    public Boolean getShouldDecrementDesiredCapacity() {
        return shouldDecrementDesiredCapacity;
    }

    /**
     * <p>
     * Indicates whether terminating the instance also decrements the size of
     * the Auto Scaling group.
     * </p>
     *
     * @param shouldDecrementDesiredCapacity <p>
     *            Indicates whether terminating the instance also decrements the
     *            size of the Auto Scaling group.
     *            </p>
     */
    public void setShouldDecrementDesiredCapacity(Boolean shouldDecrementDesiredCapacity) {
        this.shouldDecrementDesiredCapacity = shouldDecrementDesiredCapacity;
    }

    /**
     * <p>
     * Indicates whether terminating the instance also decrements the size of
     * the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shouldDecrementDesiredCapacity <p>
     *            Indicates whether terminating the instance also decrements the
     *            size of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateInstanceInAutoScalingGroupRequest withShouldDecrementDesiredCapacity(
            Boolean shouldDecrementDesiredCapacity) {
        this.shouldDecrementDesiredCapacity = shouldDecrementDesiredCapacity;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getShouldDecrementDesiredCapacity() != null)
            sb.append("ShouldDecrementDesiredCapacity: " + getShouldDecrementDesiredCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getShouldDecrementDesiredCapacity() == null) ? 0
                        : getShouldDecrementDesiredCapacity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateInstanceInAutoScalingGroupRequest == false)
            return false;
        TerminateInstanceInAutoScalingGroupRequest other = (TerminateInstanceInAutoScalingGroupRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getShouldDecrementDesiredCapacity() == null
                ^ this.getShouldDecrementDesiredCapacity() == null)
            return false;
        if (other.getShouldDecrementDesiredCapacity() != null
                && other.getShouldDecrementDesiredCapacity().equals(
                        this.getShouldDecrementDesiredCapacity()) == false)
            return false;
        return true;
    }
}

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
 * Deletes the specified Auto Scaling group.
 * </p>
 * <p>
 * If the group has instances or scaling activities in progress, you must
 * specify the option to force the deletion in order for it to succeed.
 * </p>
 * <p>
 * If the group has policies, deleting the group deletes the policies, the
 * underlying alarm actions, and any alarm that no longer has an associated
 * action.
 * </p>
 * <p>
 * To remove instances from the Auto Scaling group before deleting it, call
 * <a>DetachInstances</a> with the list of instances and the option to decrement
 * the desired capacity. This ensures that Amazon EC2 Auto Scaling does not
 * launch replacement instances.
 * </p>
 * <p>
 * To terminate all instances before deleting the Auto Scaling group, call
 * <a>UpdateAutoScalingGroup</a> and set the minimum size and desired capacity
 * of the Auto Scaling group to zero.
 * </p>
 */
public class DeleteAutoScalingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupName;

    /**
     * <p>
     * Specifies that the group is to be deleted along with all instances
     * associated with the group, without waiting for all instances to be
     * terminated. This parameter also deletes any lifecycle actions associated
     * with the group.
     * </p>
     */
    private Boolean forceDelete;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the Auto Scaling group.
     *         </p>
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
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
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAutoScalingGroupRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * Specifies that the group is to be deleted along with all instances
     * associated with the group, without waiting for all instances to be
     * terminated. This parameter also deletes any lifecycle actions associated
     * with the group.
     * </p>
     *
     * @return <p>
     *         Specifies that the group is to be deleted along with all
     *         instances associated with the group, without waiting for all
     *         instances to be terminated. This parameter also deletes any
     *         lifecycle actions associated with the group.
     *         </p>
     */
    public Boolean isForceDelete() {
        return forceDelete;
    }

    /**
     * <p>
     * Specifies that the group is to be deleted along with all instances
     * associated with the group, without waiting for all instances to be
     * terminated. This parameter also deletes any lifecycle actions associated
     * with the group.
     * </p>
     *
     * @return <p>
     *         Specifies that the group is to be deleted along with all
     *         instances associated with the group, without waiting for all
     *         instances to be terminated. This parameter also deletes any
     *         lifecycle actions associated with the group.
     *         </p>
     */
    public Boolean getForceDelete() {
        return forceDelete;
    }

    /**
     * <p>
     * Specifies that the group is to be deleted along with all instances
     * associated with the group, without waiting for all instances to be
     * terminated. This parameter also deletes any lifecycle actions associated
     * with the group.
     * </p>
     *
     * @param forceDelete <p>
     *            Specifies that the group is to be deleted along with all
     *            instances associated with the group, without waiting for all
     *            instances to be terminated. This parameter also deletes any
     *            lifecycle actions associated with the group.
     *            </p>
     */
    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    /**
     * <p>
     * Specifies that the group is to be deleted along with all instances
     * associated with the group, without waiting for all instances to be
     * terminated. This parameter also deletes any lifecycle actions associated
     * with the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forceDelete <p>
     *            Specifies that the group is to be deleted along with all
     *            instances associated with the group, without waiting for all
     *            instances to be terminated. This parameter also deletes any
     *            lifecycle actions associated with the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAutoScalingGroupRequest withForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getForceDelete() != null)
            sb.append("ForceDelete: " + getForceDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getForceDelete() == null) ? 0 : getForceDelete().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAutoScalingGroupRequest == false)
            return false;
        DeleteAutoScalingGroupRequest other = (DeleteAutoScalingGroupRequest) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getForceDelete() == null ^ this.getForceDelete() == null)
            return false;
        if (other.getForceDelete() != null
                && other.getForceDelete().equals(this.getForceDelete()) == false)
            return false;
        return true;
    }
}

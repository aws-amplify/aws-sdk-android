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
 * Creates or updates one or more scheduled scaling actions for an Auto Scaling
 * group. If you leave a parameter unspecified when updating a scheduled scaling
 * action, the corresponding value remains unchanged.
 * </p>
 */
public class BatchPutScheduledUpdateGroupActionRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * One or more scheduled actions. The maximum number allowed is 50.
     * </p>
     */
    private java.util.List<ScheduledUpdateGroupActionRequest> scheduledUpdateGroupActions = new java.util.ArrayList<ScheduledUpdateGroupActionRequest>();

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
    public BatchPutScheduledUpdateGroupActionRequest withAutoScalingGroupName(
            String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * One or more scheduled actions. The maximum number allowed is 50.
     * </p>
     *
     * @return <p>
     *         One or more scheduled actions. The maximum number allowed is 50.
     *         </p>
     */
    public java.util.List<ScheduledUpdateGroupActionRequest> getScheduledUpdateGroupActions() {
        return scheduledUpdateGroupActions;
    }

    /**
     * <p>
     * One or more scheduled actions. The maximum number allowed is 50.
     * </p>
     *
     * @param scheduledUpdateGroupActions <p>
     *            One or more scheduled actions. The maximum number allowed is
     *            50.
     *            </p>
     */
    public void setScheduledUpdateGroupActions(
            java.util.Collection<ScheduledUpdateGroupActionRequest> scheduledUpdateGroupActions) {
        if (scheduledUpdateGroupActions == null) {
            this.scheduledUpdateGroupActions = null;
            return;
        }

        this.scheduledUpdateGroupActions = new java.util.ArrayList<ScheduledUpdateGroupActionRequest>(
                scheduledUpdateGroupActions);
    }

    /**
     * <p>
     * One or more scheduled actions. The maximum number allowed is 50.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledUpdateGroupActions <p>
     *            One or more scheduled actions. The maximum number allowed is
     *            50.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutScheduledUpdateGroupActionRequest withScheduledUpdateGroupActions(
            ScheduledUpdateGroupActionRequest... scheduledUpdateGroupActions) {
        if (getScheduledUpdateGroupActions() == null) {
            this.scheduledUpdateGroupActions = new java.util.ArrayList<ScheduledUpdateGroupActionRequest>(
                    scheduledUpdateGroupActions.length);
        }
        for (ScheduledUpdateGroupActionRequest value : scheduledUpdateGroupActions) {
            this.scheduledUpdateGroupActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more scheduled actions. The maximum number allowed is 50.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledUpdateGroupActions <p>
     *            One or more scheduled actions. The maximum number allowed is
     *            50.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutScheduledUpdateGroupActionRequest withScheduledUpdateGroupActions(
            java.util.Collection<ScheduledUpdateGroupActionRequest> scheduledUpdateGroupActions) {
        setScheduledUpdateGroupActions(scheduledUpdateGroupActions);
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
        if (getScheduledUpdateGroupActions() != null)
            sb.append("ScheduledUpdateGroupActions: " + getScheduledUpdateGroupActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getScheduledUpdateGroupActions() == null) ? 0
                        : getScheduledUpdateGroupActions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutScheduledUpdateGroupActionRequest == false)
            return false;
        BatchPutScheduledUpdateGroupActionRequest other = (BatchPutScheduledUpdateGroupActionRequest) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getScheduledUpdateGroupActions() == null
                ^ this.getScheduledUpdateGroupActions() == null)
            return false;
        if (other.getScheduledUpdateGroupActions() != null
                && other.getScheduledUpdateGroupActions().equals(
                        this.getScheduledUpdateGroupActions()) == false)
            return false;
        return true;
    }
}

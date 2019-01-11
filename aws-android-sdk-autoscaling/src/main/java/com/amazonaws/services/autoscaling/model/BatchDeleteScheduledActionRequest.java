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
 * Deletes one or more scheduled actions for the specified Auto Scaling group.
 * </p>
 */
public class BatchDeleteScheduledActionRequest extends AmazonWebServiceRequest implements
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
     * The names of the scheduled actions to delete. The maximum number allowed
     * is 50.
     * </p>
     */
    private java.util.List<String> scheduledActionNames = new java.util.ArrayList<String>();

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
    public BatchDeleteScheduledActionRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The names of the scheduled actions to delete. The maximum number allowed
     * is 50.
     * </p>
     *
     * @return <p>
     *         The names of the scheduled actions to delete. The maximum number
     *         allowed is 50.
     *         </p>
     */
    public java.util.List<String> getScheduledActionNames() {
        return scheduledActionNames;
    }

    /**
     * <p>
     * The names of the scheduled actions to delete. The maximum number allowed
     * is 50.
     * </p>
     *
     * @param scheduledActionNames <p>
     *            The names of the scheduled actions to delete. The maximum
     *            number allowed is 50.
     *            </p>
     */
    public void setScheduledActionNames(java.util.Collection<String> scheduledActionNames) {
        if (scheduledActionNames == null) {
            this.scheduledActionNames = null;
            return;
        }

        this.scheduledActionNames = new java.util.ArrayList<String>(scheduledActionNames);
    }

    /**
     * <p>
     * The names of the scheduled actions to delete. The maximum number allowed
     * is 50.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledActionNames <p>
     *            The names of the scheduled actions to delete. The maximum
     *            number allowed is 50.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteScheduledActionRequest withScheduledActionNames(
            String... scheduledActionNames) {
        if (getScheduledActionNames() == null) {
            this.scheduledActionNames = new java.util.ArrayList<String>(scheduledActionNames.length);
        }
        for (String value : scheduledActionNames) {
            this.scheduledActionNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the scheduled actions to delete. The maximum number allowed
     * is 50.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledActionNames <p>
     *            The names of the scheduled actions to delete. The maximum
     *            number allowed is 50.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteScheduledActionRequest withScheduledActionNames(
            java.util.Collection<String> scheduledActionNames) {
        setScheduledActionNames(scheduledActionNames);
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
        if (getScheduledActionNames() != null)
            sb.append("ScheduledActionNames: " + getScheduledActionNames());
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
                + ((getScheduledActionNames() == null) ? 0 : getScheduledActionNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteScheduledActionRequest == false)
            return false;
        BatchDeleteScheduledActionRequest other = (BatchDeleteScheduledActionRequest) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getScheduledActionNames() == null ^ this.getScheduledActionNames() == null)
            return false;
        if (other.getScheduledActionNames() != null
                && other.getScheduledActionNames().equals(this.getScheduledActionNames()) == false)
            return false;
        return true;
    }
}

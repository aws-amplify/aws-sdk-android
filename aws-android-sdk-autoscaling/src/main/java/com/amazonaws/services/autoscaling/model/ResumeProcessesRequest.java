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
 * Resumes the specified suspended automatic scaling processes, or all suspended
 * process, for the specified Auto Scaling group.
 * </p>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html"
 * >Suspending and Resuming Scaling Processes</a> in the <i>Amazon EC2 Auto
 * Scaling User Guide</i>.
 * </p>
 */
public class ResumeProcessesRequest extends AmazonWebServiceRequest implements Serializable {
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
     * One or more of the following processes. If you omit this parameter, all
     * processes are specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Launch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HealthCheck</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplaceUnhealthy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AZRebalance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AlarmNotification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActions</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AddToLoadBalancer</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> scalingProcesses = new java.util.ArrayList<String>();

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
    public ResumeProcessesRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * One or more of the following processes. If you omit this parameter, all
     * processes are specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Launch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HealthCheck</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplaceUnhealthy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AZRebalance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AlarmNotification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActions</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AddToLoadBalancer</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         One or more of the following processes. If you omit this
     *         parameter, all processes are specified.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Launch</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Terminate</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HealthCheck</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReplaceUnhealthy</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AZRebalance</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AlarmNotification</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ScheduledActions</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AddToLoadBalancer</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getScalingProcesses() {
        return scalingProcesses;
    }

    /**
     * <p>
     * One or more of the following processes. If you omit this parameter, all
     * processes are specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Launch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HealthCheck</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplaceUnhealthy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AZRebalance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AlarmNotification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActions</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AddToLoadBalancer</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param scalingProcesses <p>
     *            One or more of the following processes. If you omit this
     *            parameter, all processes are specified.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Launch</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Terminate</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HealthCheck</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReplaceUnhealthy</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AZRebalance</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AlarmNotification</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ScheduledActions</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AddToLoadBalancer</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setScalingProcesses(java.util.Collection<String> scalingProcesses) {
        if (scalingProcesses == null) {
            this.scalingProcesses = null;
            return;
        }

        this.scalingProcesses = new java.util.ArrayList<String>(scalingProcesses);
    }

    /**
     * <p>
     * One or more of the following processes. If you omit this parameter, all
     * processes are specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Launch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HealthCheck</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplaceUnhealthy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AZRebalance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AlarmNotification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActions</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AddToLoadBalancer</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scalingProcesses <p>
     *            One or more of the following processes. If you omit this
     *            parameter, all processes are specified.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Launch</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Terminate</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HealthCheck</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReplaceUnhealthy</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AZRebalance</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AlarmNotification</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ScheduledActions</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AddToLoadBalancer</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResumeProcessesRequest withScalingProcesses(String... scalingProcesses) {
        if (getScalingProcesses() == null) {
            this.scalingProcesses = new java.util.ArrayList<String>(scalingProcesses.length);
        }
        for (String value : scalingProcesses) {
            this.scalingProcesses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more of the following processes. If you omit this parameter, all
     * processes are specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Launch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HealthCheck</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplaceUnhealthy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AZRebalance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AlarmNotification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActions</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AddToLoadBalancer</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scalingProcesses <p>
     *            One or more of the following processes. If you omit this
     *            parameter, all processes are specified.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Launch</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Terminate</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HealthCheck</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReplaceUnhealthy</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AZRebalance</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AlarmNotification</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ScheduledActions</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AddToLoadBalancer</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResumeProcessesRequest withScalingProcesses(java.util.Collection<String> scalingProcesses) {
        setScalingProcesses(scalingProcesses);
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
        if (getScalingProcesses() != null)
            sb.append("ScalingProcesses: " + getScalingProcesses());
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
                + ((getScalingProcesses() == null) ? 0 : getScalingProcesses().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResumeProcessesRequest == false)
            return false;
        ResumeProcessesRequest other = (ResumeProcessesRequest) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getScalingProcesses() == null ^ this.getScalingProcesses() == null)
            return false;
        if (other.getScalingProcesses() != null
                && other.getScalingProcesses().equals(this.getScalingProcesses()) == false)
            return false;
        return true;
    }
}

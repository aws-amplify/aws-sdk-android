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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts a new instance refresh operation, which triggers a rolling replacement
 * of all previously launched instances in the Auto Scaling group with a new
 * group of instances.
 * </p>
 * <p>
 * If successful, this call creates a new instance refresh request with a unique
 * ID that you can use to track its progress. To query its status, call the
 * <a>DescribeInstanceRefreshes</a> API. To describe the instance refreshes that
 * have already run, call the <a>DescribeInstanceRefreshes</a> API. To cancel an
 * instance refresh operation in progress, use the <a>CancelInstanceRefresh</a>
 * API.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html"
 * >Replacing Auto Scaling Instances Based on an Instance Refresh</a>.
 * </p>
 */
public class StartInstanceRefreshRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupName;

    /**
     * <p>
     * The strategy to use for the instance refresh. The only valid value is
     * <code>Rolling</code>.
     * </p>
     * <p>
     * A rolling update is an update that is applied to all instances in an Auto
     * Scaling group until all instances have been updated. A rolling update can
     * fail due to failed health checks or if instances are on standby or are
     * protected from scale in. If the rolling update process fails, any
     * instances that were already replaced are not rolled back to their
     * previous configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Rolling
     */
    private String strategy;

    /**
     * <p>
     * Set of preferences associated with the instance refresh request.
     * </p>
     * <p>
     * If not provided, the default values are used. For
     * <code>MinHealthyPercentage</code>, the default value is <code>90</code>.
     * For <code>InstanceWarmup</code>, the default is to use the value
     * specified for the health check grace period for the Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_RefreshPreferences.html"
     * >RefreshPreferences</a> in the <i>Amazon EC2 Auto Scaling API
     * Reference</i>.
     * </p>
     */
    private RefreshPreferences preferences;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
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
     * <b>Length: </b>1 - 255<br/>
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
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartInstanceRefreshRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The strategy to use for the instance refresh. The only valid value is
     * <code>Rolling</code>.
     * </p>
     * <p>
     * A rolling update is an update that is applied to all instances in an Auto
     * Scaling group until all instances have been updated. A rolling update can
     * fail due to failed health checks or if instances are on standby or are
     * protected from scale in. If the rolling update process fails, any
     * instances that were already replaced are not rolled back to their
     * previous configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Rolling
     *
     * @return <p>
     *         The strategy to use for the instance refresh. The only valid
     *         value is <code>Rolling</code>.
     *         </p>
     *         <p>
     *         A rolling update is an update that is applied to all instances in
     *         an Auto Scaling group until all instances have been updated. A
     *         rolling update can fail due to failed health checks or if
     *         instances are on standby or are protected from scale in. If the
     *         rolling update process fails, any instances that were already
     *         replaced are not rolled back to their previous configuration.
     *         </p>
     * @see RefreshStrategy
     */
    public String getStrategy() {
        return strategy;
    }

    /**
     * <p>
     * The strategy to use for the instance refresh. The only valid value is
     * <code>Rolling</code>.
     * </p>
     * <p>
     * A rolling update is an update that is applied to all instances in an Auto
     * Scaling group until all instances have been updated. A rolling update can
     * fail due to failed health checks or if instances are on standby or are
     * protected from scale in. If the rolling update process fails, any
     * instances that were already replaced are not rolled back to their
     * previous configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Rolling
     *
     * @param strategy <p>
     *            The strategy to use for the instance refresh. The only valid
     *            value is <code>Rolling</code>.
     *            </p>
     *            <p>
     *            A rolling update is an update that is applied to all instances
     *            in an Auto Scaling group until all instances have been
     *            updated. A rolling update can fail due to failed health checks
     *            or if instances are on standby or are protected from scale in.
     *            If the rolling update process fails, any instances that were
     *            already replaced are not rolled back to their previous
     *            configuration.
     *            </p>
     * @see RefreshStrategy
     */
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * <p>
     * The strategy to use for the instance refresh. The only valid value is
     * <code>Rolling</code>.
     * </p>
     * <p>
     * A rolling update is an update that is applied to all instances in an Auto
     * Scaling group until all instances have been updated. A rolling update can
     * fail due to failed health checks or if instances are on standby or are
     * protected from scale in. If the rolling update process fails, any
     * instances that were already replaced are not rolled back to their
     * previous configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Rolling
     *
     * @param strategy <p>
     *            The strategy to use for the instance refresh. The only valid
     *            value is <code>Rolling</code>.
     *            </p>
     *            <p>
     *            A rolling update is an update that is applied to all instances
     *            in an Auto Scaling group until all instances have been
     *            updated. A rolling update can fail due to failed health checks
     *            or if instances are on standby or are protected from scale in.
     *            If the rolling update process fails, any instances that were
     *            already replaced are not rolled back to their previous
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RefreshStrategy
     */
    public StartInstanceRefreshRequest withStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * <p>
     * The strategy to use for the instance refresh. The only valid value is
     * <code>Rolling</code>.
     * </p>
     * <p>
     * A rolling update is an update that is applied to all instances in an Auto
     * Scaling group until all instances have been updated. A rolling update can
     * fail due to failed health checks or if instances are on standby or are
     * protected from scale in. If the rolling update process fails, any
     * instances that were already replaced are not rolled back to their
     * previous configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Rolling
     *
     * @param strategy <p>
     *            The strategy to use for the instance refresh. The only valid
     *            value is <code>Rolling</code>.
     *            </p>
     *            <p>
     *            A rolling update is an update that is applied to all instances
     *            in an Auto Scaling group until all instances have been
     *            updated. A rolling update can fail due to failed health checks
     *            or if instances are on standby or are protected from scale in.
     *            If the rolling update process fails, any instances that were
     *            already replaced are not rolled back to their previous
     *            configuration.
     *            </p>
     * @see RefreshStrategy
     */
    public void setStrategy(RefreshStrategy strategy) {
        this.strategy = strategy.toString();
    }

    /**
     * <p>
     * The strategy to use for the instance refresh. The only valid value is
     * <code>Rolling</code>.
     * </p>
     * <p>
     * A rolling update is an update that is applied to all instances in an Auto
     * Scaling group until all instances have been updated. A rolling update can
     * fail due to failed health checks or if instances are on standby or are
     * protected from scale in. If the rolling update process fails, any
     * instances that were already replaced are not rolled back to their
     * previous configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Rolling
     *
     * @param strategy <p>
     *            The strategy to use for the instance refresh. The only valid
     *            value is <code>Rolling</code>.
     *            </p>
     *            <p>
     *            A rolling update is an update that is applied to all instances
     *            in an Auto Scaling group until all instances have been
     *            updated. A rolling update can fail due to failed health checks
     *            or if instances are on standby or are protected from scale in.
     *            If the rolling update process fails, any instances that were
     *            already replaced are not rolled back to their previous
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RefreshStrategy
     */
    public StartInstanceRefreshRequest withStrategy(RefreshStrategy strategy) {
        this.strategy = strategy.toString();
        return this;
    }

    /**
     * <p>
     * Set of preferences associated with the instance refresh request.
     * </p>
     * <p>
     * If not provided, the default values are used. For
     * <code>MinHealthyPercentage</code>, the default value is <code>90</code>.
     * For <code>InstanceWarmup</code>, the default is to use the value
     * specified for the health check grace period for the Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_RefreshPreferences.html"
     * >RefreshPreferences</a> in the <i>Amazon EC2 Auto Scaling API
     * Reference</i>.
     * </p>
     *
     * @return <p>
     *         Set of preferences associated with the instance refresh request.
     *         </p>
     *         <p>
     *         If not provided, the default values are used. For
     *         <code>MinHealthyPercentage</code>, the default value is
     *         <code>90</code>. For <code>InstanceWarmup</code>, the default is
     *         to use the value specified for the health check grace period for
     *         the Auto Scaling group.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_RefreshPreferences.html"
     *         >RefreshPreferences</a> in the <i>Amazon EC2 Auto Scaling API
     *         Reference</i>.
     *         </p>
     */
    public RefreshPreferences getPreferences() {
        return preferences;
    }

    /**
     * <p>
     * Set of preferences associated with the instance refresh request.
     * </p>
     * <p>
     * If not provided, the default values are used. For
     * <code>MinHealthyPercentage</code>, the default value is <code>90</code>.
     * For <code>InstanceWarmup</code>, the default is to use the value
     * specified for the health check grace period for the Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_RefreshPreferences.html"
     * >RefreshPreferences</a> in the <i>Amazon EC2 Auto Scaling API
     * Reference</i>.
     * </p>
     *
     * @param preferences <p>
     *            Set of preferences associated with the instance refresh
     *            request.
     *            </p>
     *            <p>
     *            If not provided, the default values are used. For
     *            <code>MinHealthyPercentage</code>, the default value is
     *            <code>90</code>. For <code>InstanceWarmup</code>, the default
     *            is to use the value specified for the health check grace
     *            period for the Auto Scaling group.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_RefreshPreferences.html"
     *            >RefreshPreferences</a> in the <i>Amazon EC2 Auto Scaling API
     *            Reference</i>.
     *            </p>
     */
    public void setPreferences(RefreshPreferences preferences) {
        this.preferences = preferences;
    }

    /**
     * <p>
     * Set of preferences associated with the instance refresh request.
     * </p>
     * <p>
     * If not provided, the default values are used. For
     * <code>MinHealthyPercentage</code>, the default value is <code>90</code>.
     * For <code>InstanceWarmup</code>, the default is to use the value
     * specified for the health check grace period for the Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_RefreshPreferences.html"
     * >RefreshPreferences</a> in the <i>Amazon EC2 Auto Scaling API
     * Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferences <p>
     *            Set of preferences associated with the instance refresh
     *            request.
     *            </p>
     *            <p>
     *            If not provided, the default values are used. For
     *            <code>MinHealthyPercentage</code>, the default value is
     *            <code>90</code>. For <code>InstanceWarmup</code>, the default
     *            is to use the value specified for the health check grace
     *            period for the Auto Scaling group.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_RefreshPreferences.html"
     *            >RefreshPreferences</a> in the <i>Amazon EC2 Auto Scaling API
     *            Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartInstanceRefreshRequest withPreferences(RefreshPreferences preferences) {
        this.preferences = preferences;
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
        if (getStrategy() != null)
            sb.append("Strategy: " + getStrategy() + ",");
        if (getPreferences() != null)
            sb.append("Preferences: " + getPreferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getStrategy() == null) ? 0 : getStrategy().hashCode());
        hashCode = prime * hashCode
                + ((getPreferences() == null) ? 0 : getPreferences().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartInstanceRefreshRequest == false)
            return false;
        StartInstanceRefreshRequest other = (StartInstanceRefreshRequest) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getStrategy() == null ^ this.getStrategy() == null)
            return false;
        if (other.getStrategy() != null && other.getStrategy().equals(this.getStrategy()) == false)
            return false;
        if (other.getPreferences() == null ^ this.getPreferences() == null)
            return false;
        if (other.getPreferences() != null
                && other.getPreferences().equals(this.getPreferences()) == false)
            return false;
        return true;
    }
}

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
 * Sets the health status of the specified instance.
 * </p>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html"
 * >Health Checks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
 * </p>
 */
public class SetInstanceHealthRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The health status of the instance. Set to <code>Healthy</code> to have
     * the instance remain in service. Set to <code>Unhealthy</code> to have the
     * instance be out of service. Amazon EC2 Auto Scaling terminates and
     * replaces the unhealthy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String healthStatus;

    /**
     * <p>
     * If the Auto Scaling group of the specified instance has a
     * <code>HealthCheckGracePeriod</code> specified for the group, by default,
     * this call respects the grace period. Set this to <code>False</code>, to
     * have the call not respect the grace period associated with the group.
     * </p>
     * <p>
     * For more information about the health check grace period, see
     * <a>CreateAutoScalingGroup</a>.
     * </p>
     */
    private Boolean shouldRespectGracePeriod;

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
    public SetInstanceHealthRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The health status of the instance. Set to <code>Healthy</code> to have
     * the instance remain in service. Set to <code>Unhealthy</code> to have the
     * instance be out of service. Amazon EC2 Auto Scaling terminates and
     * replaces the unhealthy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The health status of the instance. Set to <code>Healthy</code> to
     *         have the instance remain in service. Set to
     *         <code>Unhealthy</code> to have the instance be out of service.
     *         Amazon EC2 Auto Scaling terminates and replaces the unhealthy
     *         instance.
     *         </p>
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * <p>
     * The health status of the instance. Set to <code>Healthy</code> to have
     * the instance remain in service. Set to <code>Unhealthy</code> to have the
     * instance be out of service. Amazon EC2 Auto Scaling terminates and
     * replaces the unhealthy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param healthStatus <p>
     *            The health status of the instance. Set to <code>Healthy</code>
     *            to have the instance remain in service. Set to
     *            <code>Unhealthy</code> to have the instance be out of service.
     *            Amazon EC2 Auto Scaling terminates and replaces the unhealthy
     *            instance.
     *            </p>
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * The health status of the instance. Set to <code>Healthy</code> to have
     * the instance remain in service. Set to <code>Unhealthy</code> to have the
     * instance be out of service. Amazon EC2 Auto Scaling terminates and
     * replaces the unhealthy instance.
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
     * @param healthStatus <p>
     *            The health status of the instance. Set to <code>Healthy</code>
     *            to have the instance remain in service. Set to
     *            <code>Unhealthy</code> to have the instance be out of service.
     *            Amazon EC2 Auto Scaling terminates and replaces the unhealthy
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetInstanceHealthRequest withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * <p>
     * If the Auto Scaling group of the specified instance has a
     * <code>HealthCheckGracePeriod</code> specified for the group, by default,
     * this call respects the grace period. Set this to <code>False</code>, to
     * have the call not respect the grace period associated with the group.
     * </p>
     * <p>
     * For more information about the health check grace period, see
     * <a>CreateAutoScalingGroup</a>.
     * </p>
     *
     * @return <p>
     *         If the Auto Scaling group of the specified instance has a
     *         <code>HealthCheckGracePeriod</code> specified for the group, by
     *         default, this call respects the grace period. Set this to
     *         <code>False</code>, to have the call not respect the grace period
     *         associated with the group.
     *         </p>
     *         <p>
     *         For more information about the health check grace period, see
     *         <a>CreateAutoScalingGroup</a>.
     *         </p>
     */
    public Boolean isShouldRespectGracePeriod() {
        return shouldRespectGracePeriod;
    }

    /**
     * <p>
     * If the Auto Scaling group of the specified instance has a
     * <code>HealthCheckGracePeriod</code> specified for the group, by default,
     * this call respects the grace period. Set this to <code>False</code>, to
     * have the call not respect the grace period associated with the group.
     * </p>
     * <p>
     * For more information about the health check grace period, see
     * <a>CreateAutoScalingGroup</a>.
     * </p>
     *
     * @return <p>
     *         If the Auto Scaling group of the specified instance has a
     *         <code>HealthCheckGracePeriod</code> specified for the group, by
     *         default, this call respects the grace period. Set this to
     *         <code>False</code>, to have the call not respect the grace period
     *         associated with the group.
     *         </p>
     *         <p>
     *         For more information about the health check grace period, see
     *         <a>CreateAutoScalingGroup</a>.
     *         </p>
     */
    public Boolean getShouldRespectGracePeriod() {
        return shouldRespectGracePeriod;
    }

    /**
     * <p>
     * If the Auto Scaling group of the specified instance has a
     * <code>HealthCheckGracePeriod</code> specified for the group, by default,
     * this call respects the grace period. Set this to <code>False</code>, to
     * have the call not respect the grace period associated with the group.
     * </p>
     * <p>
     * For more information about the health check grace period, see
     * <a>CreateAutoScalingGroup</a>.
     * </p>
     *
     * @param shouldRespectGracePeriod <p>
     *            If the Auto Scaling group of the specified instance has a
     *            <code>HealthCheckGracePeriod</code> specified for the group,
     *            by default, this call respects the grace period. Set this to
     *            <code>False</code>, to have the call not respect the grace
     *            period associated with the group.
     *            </p>
     *            <p>
     *            For more information about the health check grace period, see
     *            <a>CreateAutoScalingGroup</a>.
     *            </p>
     */
    public void setShouldRespectGracePeriod(Boolean shouldRespectGracePeriod) {
        this.shouldRespectGracePeriod = shouldRespectGracePeriod;
    }

    /**
     * <p>
     * If the Auto Scaling group of the specified instance has a
     * <code>HealthCheckGracePeriod</code> specified for the group, by default,
     * this call respects the grace period. Set this to <code>False</code>, to
     * have the call not respect the grace period associated with the group.
     * </p>
     * <p>
     * For more information about the health check grace period, see
     * <a>CreateAutoScalingGroup</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shouldRespectGracePeriod <p>
     *            If the Auto Scaling group of the specified instance has a
     *            <code>HealthCheckGracePeriod</code> specified for the group,
     *            by default, this call respects the grace period. Set this to
     *            <code>False</code>, to have the call not respect the grace
     *            period associated with the group.
     *            </p>
     *            <p>
     *            For more information about the health check grace period, see
     *            <a>CreateAutoScalingGroup</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetInstanceHealthRequest withShouldRespectGracePeriod(Boolean shouldRespectGracePeriod) {
        this.shouldRespectGracePeriod = shouldRespectGracePeriod;
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
        if (getHealthStatus() != null)
            sb.append("HealthStatus: " + getHealthStatus() + ",");
        if (getShouldRespectGracePeriod() != null)
            sb.append("ShouldRespectGracePeriod: " + getShouldRespectGracePeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getShouldRespectGracePeriod() == null) ? 0 : getShouldRespectGracePeriod()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetInstanceHealthRequest == false)
            return false;
        SetInstanceHealthRequest other = (SetInstanceHealthRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null
                && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getShouldRespectGracePeriod() == null
                ^ this.getShouldRespectGracePeriod() == null)
            return false;
        if (other.getShouldRespectGracePeriod() != null
                && other.getShouldRespectGracePeriod().equals(this.getShouldRespectGracePeriod()) == false)
            return false;
        return true;
    }
}

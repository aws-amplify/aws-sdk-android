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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * Optional deployment parameters that control how many tasks run during a
 * deployment and the ordering of stopping and starting tasks.
 * </p>
 */
public class DeploymentConfiguration implements Serializable {
    /**
     * <p>
     * If a service is using the rolling update (<code>ECS</code>) deployment
     * type, the <b>maximum percent</b> parameter represents an upper limit on
     * the number of tasks in a service that are allowed in the
     * <code>RUNNING</code> or <code>PENDING</code> state during a deployment,
     * as a percentage of the desired number of tasks (rounded down to the
     * nearest integer), and while any container instances are in the
     * <code>DRAINING</code> state if the service contains tasks using the EC2
     * launch type. This parameter enables you to define the deployment batch
     * size. For example, if your service has a desired number of four tasks and
     * a maximum percent value of 200%, the scheduler may start four new tasks
     * before stopping the four older tasks (provided that the cluster resources
     * required to do this are available). The default value for maximum percent
     * is 200%.
     * </p>
     * <p>
     * If a service is using the blue/green (<code>CODE_DEPLOY</code>) or
     * <code>EXTERNAL</code> deployment types and tasks that use the EC2 launch
     * type, the <b>maximum percent</b> value is set to the default value and is
     * used to define the upper limit on the number of the tasks in the service
     * that remain in the <code>RUNNING</code> state while the container
     * instances are in the <code>DRAINING</code> state. If the tasks in the
     * service use the Fargate launch type, the maximum percent value is not
     * used, although it is returned when describing your service.
     * </p>
     */
    private Integer maximumPercent;

    /**
     * <p>
     * If a service is using the rolling update (<code>ECS</code>) deployment
     * type, the <b>minimum healthy percent</b> represents a lower limit on the
     * number of tasks in a service that must remain in the <code>RUNNING</code>
     * state during a deployment, as a percentage of the desired number of tasks
     * (rounded up to the nearest integer), and while any container instances
     * are in the <code>DRAINING</code> state if the service contains tasks
     * using the EC2 launch type. This parameter enables you to deploy without
     * using additional cluster capacity. For example, if your service has a
     * desired number of four tasks and a minimum healthy percent of 50%, the
     * scheduler may stop two existing tasks to free up cluster capacity before
     * starting two new tasks. Tasks for services that <i>do not</i> use a load
     * balancer are considered healthy if they are in the <code>RUNNING</code>
     * state; tasks for services that <i>do</i> use a load balancer are
     * considered healthy if they are in the <code>RUNNING</code> state and they
     * are reported as healthy by the load balancer. The default value for
     * minimum healthy percent is 100%.
     * </p>
     * <p>
     * If a service is using the blue/green (<code>CODE_DEPLOY</code>) or
     * <code>EXTERNAL</code> deployment types and tasks that use the EC2 launch
     * type, the <b>minimum healthy percent</b> value is set to the default
     * value and is used to define the lower limit on the number of the tasks in
     * the service that remain in the <code>RUNNING</code> state while the
     * container instances are in the <code>DRAINING</code> state. If the tasks
     * in the service use the Fargate launch type, the minimum healthy percent
     * value is not used, although it is returned when describing your service.
     * </p>
     */
    private Integer minimumHealthyPercent;

    /**
     * <p>
     * If a service is using the rolling update (<code>ECS</code>) deployment
     * type, the <b>maximum percent</b> parameter represents an upper limit on
     * the number of tasks in a service that are allowed in the
     * <code>RUNNING</code> or <code>PENDING</code> state during a deployment,
     * as a percentage of the desired number of tasks (rounded down to the
     * nearest integer), and while any container instances are in the
     * <code>DRAINING</code> state if the service contains tasks using the EC2
     * launch type. This parameter enables you to define the deployment batch
     * size. For example, if your service has a desired number of four tasks and
     * a maximum percent value of 200%, the scheduler may start four new tasks
     * before stopping the four older tasks (provided that the cluster resources
     * required to do this are available). The default value for maximum percent
     * is 200%.
     * </p>
     * <p>
     * If a service is using the blue/green (<code>CODE_DEPLOY</code>) or
     * <code>EXTERNAL</code> deployment types and tasks that use the EC2 launch
     * type, the <b>maximum percent</b> value is set to the default value and is
     * used to define the upper limit on the number of the tasks in the service
     * that remain in the <code>RUNNING</code> state while the container
     * instances are in the <code>DRAINING</code> state. If the tasks in the
     * service use the Fargate launch type, the maximum percent value is not
     * used, although it is returned when describing your service.
     * </p>
     *
     * @return <p>
     *         If a service is using the rolling update (<code>ECS</code>)
     *         deployment type, the <b>maximum percent</b> parameter represents
     *         an upper limit on the number of tasks in a service that are
     *         allowed in the <code>RUNNING</code> or <code>PENDING</code> state
     *         during a deployment, as a percentage of the desired number of
     *         tasks (rounded down to the nearest integer), and while any
     *         container instances are in the <code>DRAINING</code> state if the
     *         service contains tasks using the EC2 launch type. This parameter
     *         enables you to define the deployment batch size. For example, if
     *         your service has a desired number of four tasks and a maximum
     *         percent value of 200%, the scheduler may start four new tasks
     *         before stopping the four older tasks (provided that the cluster
     *         resources required to do this are available). The default value
     *         for maximum percent is 200%.
     *         </p>
     *         <p>
     *         If a service is using the blue/green (<code>CODE_DEPLOY</code>)
     *         or <code>EXTERNAL</code> deployment types and tasks that use the
     *         EC2 launch type, the <b>maximum percent</b> value is set to the
     *         default value and is used to define the upper limit on the number
     *         of the tasks in the service that remain in the
     *         <code>RUNNING</code> state while the container instances are in
     *         the <code>DRAINING</code> state. If the tasks in the service use
     *         the Fargate launch type, the maximum percent value is not used,
     *         although it is returned when describing your service.
     *         </p>
     */
    public Integer getMaximumPercent() {
        return maximumPercent;
    }

    /**
     * <p>
     * If a service is using the rolling update (<code>ECS</code>) deployment
     * type, the <b>maximum percent</b> parameter represents an upper limit on
     * the number of tasks in a service that are allowed in the
     * <code>RUNNING</code> or <code>PENDING</code> state during a deployment,
     * as a percentage of the desired number of tasks (rounded down to the
     * nearest integer), and while any container instances are in the
     * <code>DRAINING</code> state if the service contains tasks using the EC2
     * launch type. This parameter enables you to define the deployment batch
     * size. For example, if your service has a desired number of four tasks and
     * a maximum percent value of 200%, the scheduler may start four new tasks
     * before stopping the four older tasks (provided that the cluster resources
     * required to do this are available). The default value for maximum percent
     * is 200%.
     * </p>
     * <p>
     * If a service is using the blue/green (<code>CODE_DEPLOY</code>) or
     * <code>EXTERNAL</code> deployment types and tasks that use the EC2 launch
     * type, the <b>maximum percent</b> value is set to the default value and is
     * used to define the upper limit on the number of the tasks in the service
     * that remain in the <code>RUNNING</code> state while the container
     * instances are in the <code>DRAINING</code> state. If the tasks in the
     * service use the Fargate launch type, the maximum percent value is not
     * used, although it is returned when describing your service.
     * </p>
     *
     * @param maximumPercent <p>
     *            If a service is using the rolling update (<code>ECS</code>)
     *            deployment type, the <b>maximum percent</b> parameter
     *            represents an upper limit on the number of tasks in a service
     *            that are allowed in the <code>RUNNING</code> or
     *            <code>PENDING</code> state during a deployment, as a
     *            percentage of the desired number of tasks (rounded down to the
     *            nearest integer), and while any container instances are in the
     *            <code>DRAINING</code> state if the service contains tasks
     *            using the EC2 launch type. This parameter enables you to
     *            define the deployment batch size. For example, if your service
     *            has a desired number of four tasks and a maximum percent value
     *            of 200%, the scheduler may start four new tasks before
     *            stopping the four older tasks (provided that the cluster
     *            resources required to do this are available). The default
     *            value for maximum percent is 200%.
     *            </p>
     *            <p>
     *            If a service is using the blue/green (<code>CODE_DEPLOY</code>
     *            ) or <code>EXTERNAL</code> deployment types and tasks that use
     *            the EC2 launch type, the <b>maximum percent</b> value is set
     *            to the default value and is used to define the upper limit on
     *            the number of the tasks in the service that remain in the
     *            <code>RUNNING</code> state while the container instances are
     *            in the <code>DRAINING</code> state. If the tasks in the
     *            service use the Fargate launch type, the maximum percent value
     *            is not used, although it is returned when describing your
     *            service.
     *            </p>
     */
    public void setMaximumPercent(Integer maximumPercent) {
        this.maximumPercent = maximumPercent;
    }

    /**
     * <p>
     * If a service is using the rolling update (<code>ECS</code>) deployment
     * type, the <b>maximum percent</b> parameter represents an upper limit on
     * the number of tasks in a service that are allowed in the
     * <code>RUNNING</code> or <code>PENDING</code> state during a deployment,
     * as a percentage of the desired number of tasks (rounded down to the
     * nearest integer), and while any container instances are in the
     * <code>DRAINING</code> state if the service contains tasks using the EC2
     * launch type. This parameter enables you to define the deployment batch
     * size. For example, if your service has a desired number of four tasks and
     * a maximum percent value of 200%, the scheduler may start four new tasks
     * before stopping the four older tasks (provided that the cluster resources
     * required to do this are available). The default value for maximum percent
     * is 200%.
     * </p>
     * <p>
     * If a service is using the blue/green (<code>CODE_DEPLOY</code>) or
     * <code>EXTERNAL</code> deployment types and tasks that use the EC2 launch
     * type, the <b>maximum percent</b> value is set to the default value and is
     * used to define the upper limit on the number of the tasks in the service
     * that remain in the <code>RUNNING</code> state while the container
     * instances are in the <code>DRAINING</code> state. If the tasks in the
     * service use the Fargate launch type, the maximum percent value is not
     * used, although it is returned when describing your service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximumPercent <p>
     *            If a service is using the rolling update (<code>ECS</code>)
     *            deployment type, the <b>maximum percent</b> parameter
     *            represents an upper limit on the number of tasks in a service
     *            that are allowed in the <code>RUNNING</code> or
     *            <code>PENDING</code> state during a deployment, as a
     *            percentage of the desired number of tasks (rounded down to the
     *            nearest integer), and while any container instances are in the
     *            <code>DRAINING</code> state if the service contains tasks
     *            using the EC2 launch type. This parameter enables you to
     *            define the deployment batch size. For example, if your service
     *            has a desired number of four tasks and a maximum percent value
     *            of 200%, the scheduler may start four new tasks before
     *            stopping the four older tasks (provided that the cluster
     *            resources required to do this are available). The default
     *            value for maximum percent is 200%.
     *            </p>
     *            <p>
     *            If a service is using the blue/green (<code>CODE_DEPLOY</code>
     *            ) or <code>EXTERNAL</code> deployment types and tasks that use
     *            the EC2 launch type, the <b>maximum percent</b> value is set
     *            to the default value and is used to define the upper limit on
     *            the number of the tasks in the service that remain in the
     *            <code>RUNNING</code> state while the container instances are
     *            in the <code>DRAINING</code> state. If the tasks in the
     *            service use the Fargate launch type, the maximum percent value
     *            is not used, although it is returned when describing your
     *            service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentConfiguration withMaximumPercent(Integer maximumPercent) {
        this.maximumPercent = maximumPercent;
        return this;
    }

    /**
     * <p>
     * If a service is using the rolling update (<code>ECS</code>) deployment
     * type, the <b>minimum healthy percent</b> represents a lower limit on the
     * number of tasks in a service that must remain in the <code>RUNNING</code>
     * state during a deployment, as a percentage of the desired number of tasks
     * (rounded up to the nearest integer), and while any container instances
     * are in the <code>DRAINING</code> state if the service contains tasks
     * using the EC2 launch type. This parameter enables you to deploy without
     * using additional cluster capacity. For example, if your service has a
     * desired number of four tasks and a minimum healthy percent of 50%, the
     * scheduler may stop two existing tasks to free up cluster capacity before
     * starting two new tasks. Tasks for services that <i>do not</i> use a load
     * balancer are considered healthy if they are in the <code>RUNNING</code>
     * state; tasks for services that <i>do</i> use a load balancer are
     * considered healthy if they are in the <code>RUNNING</code> state and they
     * are reported as healthy by the load balancer. The default value for
     * minimum healthy percent is 100%.
     * </p>
     * <p>
     * If a service is using the blue/green (<code>CODE_DEPLOY</code>) or
     * <code>EXTERNAL</code> deployment types and tasks that use the EC2 launch
     * type, the <b>minimum healthy percent</b> value is set to the default
     * value and is used to define the lower limit on the number of the tasks in
     * the service that remain in the <code>RUNNING</code> state while the
     * container instances are in the <code>DRAINING</code> state. If the tasks
     * in the service use the Fargate launch type, the minimum healthy percent
     * value is not used, although it is returned when describing your service.
     * </p>
     *
     * @return <p>
     *         If a service is using the rolling update (<code>ECS</code>)
     *         deployment type, the <b>minimum healthy percent</b> represents a
     *         lower limit on the number of tasks in a service that must remain
     *         in the <code>RUNNING</code> state during a deployment, as a
     *         percentage of the desired number of tasks (rounded up to the
     *         nearest integer), and while any container instances are in the
     *         <code>DRAINING</code> state if the service contains tasks using
     *         the EC2 launch type. This parameter enables you to deploy without
     *         using additional cluster capacity. For example, if your service
     *         has a desired number of four tasks and a minimum healthy percent
     *         of 50%, the scheduler may stop two existing tasks to free up
     *         cluster capacity before starting two new tasks. Tasks for
     *         services that <i>do not</i> use a load balancer are considered
     *         healthy if they are in the <code>RUNNING</code> state; tasks for
     *         services that <i>do</i> use a load balancer are considered
     *         healthy if they are in the <code>RUNNING</code> state and they
     *         are reported as healthy by the load balancer. The default value
     *         for minimum healthy percent is 100%.
     *         </p>
     *         <p>
     *         If a service is using the blue/green (<code>CODE_DEPLOY</code>)
     *         or <code>EXTERNAL</code> deployment types and tasks that use the
     *         EC2 launch type, the <b>minimum healthy percent</b> value is set
     *         to the default value and is used to define the lower limit on the
     *         number of the tasks in the service that remain in the
     *         <code>RUNNING</code> state while the container instances are in
     *         the <code>DRAINING</code> state. If the tasks in the service use
     *         the Fargate launch type, the minimum healthy percent value is not
     *         used, although it is returned when describing your service.
     *         </p>
     */
    public Integer getMinimumHealthyPercent() {
        return minimumHealthyPercent;
    }

    /**
     * <p>
     * If a service is using the rolling update (<code>ECS</code>) deployment
     * type, the <b>minimum healthy percent</b> represents a lower limit on the
     * number of tasks in a service that must remain in the <code>RUNNING</code>
     * state during a deployment, as a percentage of the desired number of tasks
     * (rounded up to the nearest integer), and while any container instances
     * are in the <code>DRAINING</code> state if the service contains tasks
     * using the EC2 launch type. This parameter enables you to deploy without
     * using additional cluster capacity. For example, if your service has a
     * desired number of four tasks and a minimum healthy percent of 50%, the
     * scheduler may stop two existing tasks to free up cluster capacity before
     * starting two new tasks. Tasks for services that <i>do not</i> use a load
     * balancer are considered healthy if they are in the <code>RUNNING</code>
     * state; tasks for services that <i>do</i> use a load balancer are
     * considered healthy if they are in the <code>RUNNING</code> state and they
     * are reported as healthy by the load balancer. The default value for
     * minimum healthy percent is 100%.
     * </p>
     * <p>
     * If a service is using the blue/green (<code>CODE_DEPLOY</code>) or
     * <code>EXTERNAL</code> deployment types and tasks that use the EC2 launch
     * type, the <b>minimum healthy percent</b> value is set to the default
     * value and is used to define the lower limit on the number of the tasks in
     * the service that remain in the <code>RUNNING</code> state while the
     * container instances are in the <code>DRAINING</code> state. If the tasks
     * in the service use the Fargate launch type, the minimum healthy percent
     * value is not used, although it is returned when describing your service.
     * </p>
     *
     * @param minimumHealthyPercent <p>
     *            If a service is using the rolling update (<code>ECS</code>)
     *            deployment type, the <b>minimum healthy percent</b> represents
     *            a lower limit on the number of tasks in a service that must
     *            remain in the <code>RUNNING</code> state during a deployment,
     *            as a percentage of the desired number of tasks (rounded up to
     *            the nearest integer), and while any container instances are in
     *            the <code>DRAINING</code> state if the service contains tasks
     *            using the EC2 launch type. This parameter enables you to
     *            deploy without using additional cluster capacity. For example,
     *            if your service has a desired number of four tasks and a
     *            minimum healthy percent of 50%, the scheduler may stop two
     *            existing tasks to free up cluster capacity before starting two
     *            new tasks. Tasks for services that <i>do not</i> use a load
     *            balancer are considered healthy if they are in the
     *            <code>RUNNING</code> state; tasks for services that <i>do</i>
     *            use a load balancer are considered healthy if they are in the
     *            <code>RUNNING</code> state and they are reported as healthy by
     *            the load balancer. The default value for minimum healthy
     *            percent is 100%.
     *            </p>
     *            <p>
     *            If a service is using the blue/green (<code>CODE_DEPLOY</code>
     *            ) or <code>EXTERNAL</code> deployment types and tasks that use
     *            the EC2 launch type, the <b>minimum healthy percent</b> value
     *            is set to the default value and is used to define the lower
     *            limit on the number of the tasks in the service that remain in
     *            the <code>RUNNING</code> state while the container instances
     *            are in the <code>DRAINING</code> state. If the tasks in the
     *            service use the Fargate launch type, the minimum healthy
     *            percent value is not used, although it is returned when
     *            describing your service.
     *            </p>
     */
    public void setMinimumHealthyPercent(Integer minimumHealthyPercent) {
        this.minimumHealthyPercent = minimumHealthyPercent;
    }

    /**
     * <p>
     * If a service is using the rolling update (<code>ECS</code>) deployment
     * type, the <b>minimum healthy percent</b> represents a lower limit on the
     * number of tasks in a service that must remain in the <code>RUNNING</code>
     * state during a deployment, as a percentage of the desired number of tasks
     * (rounded up to the nearest integer), and while any container instances
     * are in the <code>DRAINING</code> state if the service contains tasks
     * using the EC2 launch type. This parameter enables you to deploy without
     * using additional cluster capacity. For example, if your service has a
     * desired number of four tasks and a minimum healthy percent of 50%, the
     * scheduler may stop two existing tasks to free up cluster capacity before
     * starting two new tasks. Tasks for services that <i>do not</i> use a load
     * balancer are considered healthy if they are in the <code>RUNNING</code>
     * state; tasks for services that <i>do</i> use a load balancer are
     * considered healthy if they are in the <code>RUNNING</code> state and they
     * are reported as healthy by the load balancer. The default value for
     * minimum healthy percent is 100%.
     * </p>
     * <p>
     * If a service is using the blue/green (<code>CODE_DEPLOY</code>) or
     * <code>EXTERNAL</code> deployment types and tasks that use the EC2 launch
     * type, the <b>minimum healthy percent</b> value is set to the default
     * value and is used to define the lower limit on the number of the tasks in
     * the service that remain in the <code>RUNNING</code> state while the
     * container instances are in the <code>DRAINING</code> state. If the tasks
     * in the service use the Fargate launch type, the minimum healthy percent
     * value is not used, although it is returned when describing your service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimumHealthyPercent <p>
     *            If a service is using the rolling update (<code>ECS</code>)
     *            deployment type, the <b>minimum healthy percent</b> represents
     *            a lower limit on the number of tasks in a service that must
     *            remain in the <code>RUNNING</code> state during a deployment,
     *            as a percentage of the desired number of tasks (rounded up to
     *            the nearest integer), and while any container instances are in
     *            the <code>DRAINING</code> state if the service contains tasks
     *            using the EC2 launch type. This parameter enables you to
     *            deploy without using additional cluster capacity. For example,
     *            if your service has a desired number of four tasks and a
     *            minimum healthy percent of 50%, the scheduler may stop two
     *            existing tasks to free up cluster capacity before starting two
     *            new tasks. Tasks for services that <i>do not</i> use a load
     *            balancer are considered healthy if they are in the
     *            <code>RUNNING</code> state; tasks for services that <i>do</i>
     *            use a load balancer are considered healthy if they are in the
     *            <code>RUNNING</code> state and they are reported as healthy by
     *            the load balancer. The default value for minimum healthy
     *            percent is 100%.
     *            </p>
     *            <p>
     *            If a service is using the blue/green (<code>CODE_DEPLOY</code>
     *            ) or <code>EXTERNAL</code> deployment types and tasks that use
     *            the EC2 launch type, the <b>minimum healthy percent</b> value
     *            is set to the default value and is used to define the lower
     *            limit on the number of the tasks in the service that remain in
     *            the <code>RUNNING</code> state while the container instances
     *            are in the <code>DRAINING</code> state. If the tasks in the
     *            service use the Fargate launch type, the minimum healthy
     *            percent value is not used, although it is returned when
     *            describing your service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentConfiguration withMinimumHealthyPercent(Integer minimumHealthyPercent) {
        this.minimumHealthyPercent = minimumHealthyPercent;
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
        if (getMaximumPercent() != null)
            sb.append("maximumPercent: " + getMaximumPercent() + ",");
        if (getMinimumHealthyPercent() != null)
            sb.append("minimumHealthyPercent: " + getMinimumHealthyPercent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMaximumPercent() == null) ? 0 : getMaximumPercent().hashCode());
        hashCode = prime
                * hashCode
                + ((getMinimumHealthyPercent() == null) ? 0 : getMinimumHealthyPercent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentConfiguration == false)
            return false;
        DeploymentConfiguration other = (DeploymentConfiguration) obj;

        if (other.getMaximumPercent() == null ^ this.getMaximumPercent() == null)
            return false;
        if (other.getMaximumPercent() != null
                && other.getMaximumPercent().equals(this.getMaximumPercent()) == false)
            return false;
        if (other.getMinimumHealthyPercent() == null ^ this.getMinimumHealthyPercent() == null)
            return false;
        if (other.getMinimumHealthyPercent() != null
                && other.getMinimumHealthyPercent().equals(this.getMinimumHealthyPercent()) == false)
            return false;
        return true;
    }
}

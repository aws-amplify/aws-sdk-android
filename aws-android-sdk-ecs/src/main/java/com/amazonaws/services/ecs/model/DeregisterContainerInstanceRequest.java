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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deregisters an Amazon ECS container instance from the specified cluster. This
 * instance is no longer available to run tasks.
 * </p>
 * <p>
 * If you intend to use the container instance for some other purpose after
 * deregistration, you should stop all of the tasks running on the container
 * instance before deregistration. That prevents any orphaned tasks from
 * consuming resources.
 * </p>
 * <p>
 * Deregistering a container instance removes the instance from a cluster, but
 * it does not terminate the EC2 instance. If you are finished using the
 * instance, be sure to terminate it in the Amazon EC2 console to stop billing.
 * </p>
 * <note>
 * <p>
 * If you terminate a running container instance, Amazon ECS automatically
 * deregisters the instance from your cluster (stopped container instances or
 * instances with disconnected agents are not automatically deregistered when
 * terminated).
 * </p>
 * </note>
 */
public class DeregisterContainerInstanceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instance to deregister. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The container instance ID or full ARN of the container instance to
     * deregister. The ARN contains the <code>arn:aws:ecs</code> namespace,
     * followed by the Region of the container instance, the AWS account ID of
     * the container instance owner, the <code>container-instance</code>
     * namespace, and then the container instance ID. For example,
     * <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     * .
     * </p>
     */
    private String containerInstance;

    /**
     * <p>
     * Forces the deregistration of the container instance. If you have tasks
     * running on the container instance when you deregister it with the
     * <code>force</code> option, these tasks remain running until you terminate
     * the instance or the tasks stop through some other means, but they are
     * orphaned (no longer monitored or accounted for by Amazon ECS). If an
     * orphaned task on your container instance is part of an Amazon ECS
     * service, then the service scheduler starts another copy of that task, on
     * a different container instance if possible.
     * </p>
     * <p>
     * Any containers in orphaned service tasks that are registered with a
     * Classic Load Balancer or an Application Load Balancer target group are
     * deregistered. They begin connection draining according to the settings on
     * the load balancer or target group.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instance to deregister. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         that hosts the container instance to deregister. If you do not
     *         specify a cluster, the default cluster is assumed.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instance to deregister. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the container instance to deregister. If
     *            you do not specify a cluster, the default cluster is assumed.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instance to deregister. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the container instance to deregister. If
     *            you do not specify a cluster, the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeregisterContainerInstanceRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The container instance ID or full ARN of the container instance to
     * deregister. The ARN contains the <code>arn:aws:ecs</code> namespace,
     * followed by the Region of the container instance, the AWS account ID of
     * the container instance owner, the <code>container-instance</code>
     * namespace, and then the container instance ID. For example,
     * <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     * .
     * </p>
     *
     * @return <p>
     *         The container instance ID or full ARN of the container instance
     *         to deregister. The ARN contains the <code>arn:aws:ecs</code>
     *         namespace, followed by the Region of the container instance, the
     *         AWS account ID of the container instance owner, the
     *         <code>container-instance</code> namespace, and then the container
     *         instance ID. For example,
     *         <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     *         .
     *         </p>
     */
    public String getContainerInstance() {
        return containerInstance;
    }

    /**
     * <p>
     * The container instance ID or full ARN of the container instance to
     * deregister. The ARN contains the <code>arn:aws:ecs</code> namespace,
     * followed by the Region of the container instance, the AWS account ID of
     * the container instance owner, the <code>container-instance</code>
     * namespace, and then the container instance ID. For example,
     * <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     * .
     * </p>
     *
     * @param containerInstance <p>
     *            The container instance ID or full ARN of the container
     *            instance to deregister. The ARN contains the
     *            <code>arn:aws:ecs</code> namespace, followed by the Region of
     *            the container instance, the AWS account ID of the container
     *            instance owner, the <code>container-instance</code> namespace,
     *            and then the container instance ID. For example,
     *            <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     *            .
     *            </p>
     */
    public void setContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
    }

    /**
     * <p>
     * The container instance ID or full ARN of the container instance to
     * deregister. The ARN contains the <code>arn:aws:ecs</code> namespace,
     * followed by the Region of the container instance, the AWS account ID of
     * the container instance owner, the <code>container-instance</code>
     * namespace, and then the container instance ID. For example,
     * <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerInstance <p>
     *            The container instance ID or full ARN of the container
     *            instance to deregister. The ARN contains the
     *            <code>arn:aws:ecs</code> namespace, followed by the Region of
     *            the container instance, the AWS account ID of the container
     *            instance owner, the <code>container-instance</code> namespace,
     *            and then the container instance ID. For example,
     *            <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeregisterContainerInstanceRequest withContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
        return this;
    }

    /**
     * <p>
     * Forces the deregistration of the container instance. If you have tasks
     * running on the container instance when you deregister it with the
     * <code>force</code> option, these tasks remain running until you terminate
     * the instance or the tasks stop through some other means, but they are
     * orphaned (no longer monitored or accounted for by Amazon ECS). If an
     * orphaned task on your container instance is part of an Amazon ECS
     * service, then the service scheduler starts another copy of that task, on
     * a different container instance if possible.
     * </p>
     * <p>
     * Any containers in orphaned service tasks that are registered with a
     * Classic Load Balancer or an Application Load Balancer target group are
     * deregistered. They begin connection draining according to the settings on
     * the load balancer or target group.
     * </p>
     *
     * @return <p>
     *         Forces the deregistration of the container instance. If you have
     *         tasks running on the container instance when you deregister it
     *         with the <code>force</code> option, these tasks remain running
     *         until you terminate the instance or the tasks stop through some
     *         other means, but they are orphaned (no longer monitored or
     *         accounted for by Amazon ECS). If an orphaned task on your
     *         container instance is part of an Amazon ECS service, then the
     *         service scheduler starts another copy of that task, on a
     *         different container instance if possible.
     *         </p>
     *         <p>
     *         Any containers in orphaned service tasks that are registered with
     *         a Classic Load Balancer or an Application Load Balancer target
     *         group are deregistered. They begin connection draining according
     *         to the settings on the load balancer or target group.
     *         </p>
     */
    public Boolean isForce() {
        return force;
    }

    /**
     * <p>
     * Forces the deregistration of the container instance. If you have tasks
     * running on the container instance when you deregister it with the
     * <code>force</code> option, these tasks remain running until you terminate
     * the instance or the tasks stop through some other means, but they are
     * orphaned (no longer monitored or accounted for by Amazon ECS). If an
     * orphaned task on your container instance is part of an Amazon ECS
     * service, then the service scheduler starts another copy of that task, on
     * a different container instance if possible.
     * </p>
     * <p>
     * Any containers in orphaned service tasks that are registered with a
     * Classic Load Balancer or an Application Load Balancer target group are
     * deregistered. They begin connection draining according to the settings on
     * the load balancer or target group.
     * </p>
     *
     * @return <p>
     *         Forces the deregistration of the container instance. If you have
     *         tasks running on the container instance when you deregister it
     *         with the <code>force</code> option, these tasks remain running
     *         until you terminate the instance or the tasks stop through some
     *         other means, but they are orphaned (no longer monitored or
     *         accounted for by Amazon ECS). If an orphaned task on your
     *         container instance is part of an Amazon ECS service, then the
     *         service scheduler starts another copy of that task, on a
     *         different container instance if possible.
     *         </p>
     *         <p>
     *         Any containers in orphaned service tasks that are registered with
     *         a Classic Load Balancer or an Application Load Balancer target
     *         group are deregistered. They begin connection draining according
     *         to the settings on the load balancer or target group.
     *         </p>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * <p>
     * Forces the deregistration of the container instance. If you have tasks
     * running on the container instance when you deregister it with the
     * <code>force</code> option, these tasks remain running until you terminate
     * the instance or the tasks stop through some other means, but they are
     * orphaned (no longer monitored or accounted for by Amazon ECS). If an
     * orphaned task on your container instance is part of an Amazon ECS
     * service, then the service scheduler starts another copy of that task, on
     * a different container instance if possible.
     * </p>
     * <p>
     * Any containers in orphaned service tasks that are registered with a
     * Classic Load Balancer or an Application Load Balancer target group are
     * deregistered. They begin connection draining according to the settings on
     * the load balancer or target group.
     * </p>
     *
     * @param force <p>
     *            Forces the deregistration of the container instance. If you
     *            have tasks running on the container instance when you
     *            deregister it with the <code>force</code> option, these tasks
     *            remain running until you terminate the instance or the tasks
     *            stop through some other means, but they are orphaned (no
     *            longer monitored or accounted for by Amazon ECS). If an
     *            orphaned task on your container instance is part of an Amazon
     *            ECS service, then the service scheduler starts another copy of
     *            that task, on a different container instance if possible.
     *            </p>
     *            <p>
     *            Any containers in orphaned service tasks that are registered
     *            with a Classic Load Balancer or an Application Load Balancer
     *            target group are deregistered. They begin connection draining
     *            according to the settings on the load balancer or target
     *            group.
     *            </p>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Forces the deregistration of the container instance. If you have tasks
     * running on the container instance when you deregister it with the
     * <code>force</code> option, these tasks remain running until you terminate
     * the instance or the tasks stop through some other means, but they are
     * orphaned (no longer monitored or accounted for by Amazon ECS). If an
     * orphaned task on your container instance is part of an Amazon ECS
     * service, then the service scheduler starts another copy of that task, on
     * a different container instance if possible.
     * </p>
     * <p>
     * Any containers in orphaned service tasks that are registered with a
     * Classic Load Balancer or an Application Load Balancer target group are
     * deregistered. They begin connection draining according to the settings on
     * the load balancer or target group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param force <p>
     *            Forces the deregistration of the container instance. If you
     *            have tasks running on the container instance when you
     *            deregister it with the <code>force</code> option, these tasks
     *            remain running until you terminate the instance or the tasks
     *            stop through some other means, but they are orphaned (no
     *            longer monitored or accounted for by Amazon ECS). If an
     *            orphaned task on your container instance is part of an Amazon
     *            ECS service, then the service scheduler starts another copy of
     *            that task, on a different container instance if possible.
     *            </p>
     *            <p>
     *            Any containers in orphaned service tasks that are registered
     *            with a Classic Load Balancer or an Application Load Balancer
     *            target group are deregistered. They begin connection draining
     *            according to the settings on the load balancer or target
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeregisterContainerInstanceRequest withForce(Boolean force) {
        this.force = force;
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
        if (getCluster() != null)
            sb.append("cluster: " + getCluster() + ",");
        if (getContainerInstance() != null)
            sb.append("containerInstance: " + getContainerInstance() + ",");
        if (getForce() != null)
            sb.append("force: " + getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode
                + ((getContainerInstance() == null) ? 0 : getContainerInstance().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterContainerInstanceRequest == false)
            return false;
        DeregisterContainerInstanceRequest other = (DeregisterContainerInstanceRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getContainerInstance() == null ^ this.getContainerInstance() == null)
            return false;
        if (other.getContainerInstance() != null
                && other.getContainerInstance().equals(this.getContainerInstance()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }
}

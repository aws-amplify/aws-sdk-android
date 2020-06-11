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
 * <note>
 * <p>
 * This action is only used by the Amazon ECS agent, and it is not intended for
 * use outside of the agent.
 * </p>
 * </note>
 * <p>
 * Returns an endpoint for the Amazon ECS agent to poll for updates.
 * </p>
 */
public class DiscoverPollEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The container instance ID or full ARN of the container instance. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the Region
     * of the container instance, the AWS account ID of the container instance
     * owner, the <code>container-instance</code> namespace, and then the
     * container instance ID. For example,
     * <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     * .
     * </p>
     */
    private String containerInstance;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to which
     * the container instance belongs.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The container instance ID or full ARN of the container instance. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the Region
     * of the container instance, the AWS account ID of the container instance
     * owner, the <code>container-instance</code> namespace, and then the
     * container instance ID. For example,
     * <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     * .
     * </p>
     *
     * @return <p>
     *         The container instance ID or full ARN of the container instance.
     *         The ARN contains the <code>arn:aws:ecs</code> namespace, followed
     *         by the Region of the container instance, the AWS account ID of
     *         the container instance owner, the <code>container-instance</code>
     *         namespace, and then the container instance ID. For example,
     *         <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     *         .
     *         </p>
     */
    public String getContainerInstance() {
        return containerInstance;
    }

    /**
     * <p>
     * The container instance ID or full ARN of the container instance. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the Region
     * of the container instance, the AWS account ID of the container instance
     * owner, the <code>container-instance</code> namespace, and then the
     * container instance ID. For example,
     * <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     * .
     * </p>
     *
     * @param containerInstance <p>
     *            The container instance ID or full ARN of the container
     *            instance. The ARN contains the <code>arn:aws:ecs</code>
     *            namespace, followed by the Region of the container instance,
     *            the AWS account ID of the container instance owner, the
     *            <code>container-instance</code> namespace, and then the
     *            container instance ID. For example,
     *            <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     *            .
     *            </p>
     */
    public void setContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
    }

    /**
     * <p>
     * The container instance ID or full ARN of the container instance. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the Region
     * of the container instance, the AWS account ID of the container instance
     * owner, the <code>container-instance</code> namespace, and then the
     * container instance ID. For example,
     * <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerInstance <p>
     *            The container instance ID or full ARN of the container
     *            instance. The ARN contains the <code>arn:aws:ecs</code>
     *            namespace, followed by the Region of the container instance,
     *            the AWS account ID of the container instance owner, the
     *            <code>container-instance</code> namespace, and then the
     *            container instance ID. For example,
     *            <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscoverPollEndpointRequest withContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to which
     * the container instance belongs.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         to which the container instance belongs.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to which
     * the container instance belongs.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster to which the container instance belongs.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to which
     * the container instance belongs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster to which the container instance belongs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscoverPollEndpointRequest withCluster(String cluster) {
        this.cluster = cluster;
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
        if (getContainerInstance() != null)
            sb.append("containerInstance: " + getContainerInstance() + ",");
        if (getCluster() != null)
            sb.append("cluster: " + getCluster());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContainerInstance() == null) ? 0 : getContainerInstance().hashCode());
        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscoverPollEndpointRequest == false)
            return false;
        DiscoverPollEndpointRequest other = (DiscoverPollEndpointRequest) obj;

        if (other.getContainerInstance() == null ^ this.getContainerInstance() == null)
            return false;
        if (other.getContainerInstance() != null
                && other.getContainerInstance().equals(this.getContainerInstance()) == false)
            return false;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        return true;
    }
}

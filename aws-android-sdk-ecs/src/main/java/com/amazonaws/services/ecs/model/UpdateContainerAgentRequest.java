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
 * Updates the Amazon ECS container agent on a specified container instance.
 * Updating the Amazon ECS container agent does not interrupt running tasks or
 * services on the container instance. The process for updating the agent
 * differs depending on whether your container instance was launched with the
 * Amazon ECS-optimized AMI or another operating system.
 * </p>
 * <p>
 * <code>UpdateContainerAgent</code> requires the Amazon ECS-optimized AMI or
 * Amazon Linux with the <code>ecs-init</code> service installed and running.
 * For help updating the Amazon ECS container agent on other operating systems,
 * see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html#manually_update_agent"
 * >Manually Updating the Amazon ECS Container Agent</a> in the <i>Amazon
 * Elastic Container Service Developer Guide</i>.
 * </p>
 */
public class UpdateContainerAgentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * your container instance is running on. If you do not specify a cluster,
     * the default cluster is assumed.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The container instance ID or full ARN entries for the container instance
     * on which you would like to update the Amazon ECS container agent.
     * </p>
     */
    private String containerInstance;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * your container instance is running on. If you do not specify a cluster,
     * the default cluster is assumed.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         that your container instance is running on. If you do not specify
     *         a cluster, the default cluster is assumed.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * your container instance is running on. If you do not specify a cluster,
     * the default cluster is assumed.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that your container instance is running on. If you do
     *            not specify a cluster, the default cluster is assumed.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * your container instance is running on. If you do not specify a cluster,
     * the default cluster is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that your container instance is running on. If you do
     *            not specify a cluster, the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContainerAgentRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The container instance ID or full ARN entries for the container instance
     * on which you would like to update the Amazon ECS container agent.
     * </p>
     *
     * @return <p>
     *         The container instance ID or full ARN entries for the container
     *         instance on which you would like to update the Amazon ECS
     *         container agent.
     *         </p>
     */
    public String getContainerInstance() {
        return containerInstance;
    }

    /**
     * <p>
     * The container instance ID or full ARN entries for the container instance
     * on which you would like to update the Amazon ECS container agent.
     * </p>
     *
     * @param containerInstance <p>
     *            The container instance ID or full ARN entries for the
     *            container instance on which you would like to update the
     *            Amazon ECS container agent.
     *            </p>
     */
    public void setContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
    }

    /**
     * <p>
     * The container instance ID or full ARN entries for the container instance
     * on which you would like to update the Amazon ECS container agent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerInstance <p>
     *            The container instance ID or full ARN entries for the
     *            container instance on which you would like to update the
     *            Amazon ECS container agent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContainerAgentRequest withContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
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
            sb.append("containerInstance: " + getContainerInstance());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContainerAgentRequest == false)
            return false;
        UpdateContainerAgentRequest other = (UpdateContainerAgentRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getContainerInstance() == null ^ this.getContainerInstance() == null)
            return false;
        if (other.getContainerInstance() != null
                && other.getContainerInstance().equals(this.getContainerInstance()) == false)
            return false;
        return true;
    }
}

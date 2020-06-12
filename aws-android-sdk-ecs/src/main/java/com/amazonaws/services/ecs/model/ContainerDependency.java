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
 * The dependencies defined for container startup and shutdown. A container can
 * contain multiple dependencies. When a dependency is defined for container
 * startup, for container shutdown it is reversed.
 * </p>
 * <p>
 * Your Amazon ECS container instances require at least version 1.26.0 of the
 * container agent to enable container dependencies. However, we recommend using
 * the latest container agent version. For information about checking your agent
 * version and updating to the latest version, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html"
 * >Updating the Amazon ECS Container Agent</a> in the <i>Amazon Elastic
 * Container Service Developer Guide</i>. If you are using an Amazon
 * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the
 * <code>ecs-init</code> package. If your container instances are launched from
 * version <code>20190301</code> or later, then they contain the required
 * versions of the container agent and <code>ecs-init</code>. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html"
 * >Amazon ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container
 * Service Developer Guide</i>.
 * </p>
 * <note>
 * <p>
 * For tasks using the Fargate launch type, this parameter requires that the
 * task or service uses platform version 1.3.0 or later.
 * </p>
 * </note>
 */
public class ContainerDependency implements Serializable {
    /**
     * <p>
     * The name of a container.
     * </p>
     */
    private String containerName;

    /**
     * <p>
     * The dependency condition of the container. The following are the
     * available conditions and their behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>START</code> - This condition emulates the behavior of links and
     * volumes today. It validates that a dependent container is started before
     * permitting other containers to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - This condition validates that a dependent
     * container runs to completion (exits) before permitting other containers
     * to start. This can be useful for nonessential containers that run a
     * script and then exit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> - This condition is the same as
     * <code>COMPLETE</code>, but it also requires that the container exits with
     * a <code>zero</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code> - This condition validates that the dependent
     * container passes its Docker health check before permitting other
     * containers to start. This requires that the dependent container has
     * health checks configured. This condition is confirmed only at task
     * startup.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START, COMPLETE, SUCCESS, HEALTHY
     */
    private String condition;

    /**
     * <p>
     * The name of a container.
     * </p>
     *
     * @return <p>
     *         The name of a container.
     *         </p>
     */
    public String getContainerName() {
        return containerName;
    }

    /**
     * <p>
     * The name of a container.
     * </p>
     *
     * @param containerName <p>
     *            The name of a container.
     *            </p>
     */
    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name of a container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerName <p>
     *            The name of a container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerDependency withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * <p>
     * The dependency condition of the container. The following are the
     * available conditions and their behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>START</code> - This condition emulates the behavior of links and
     * volumes today. It validates that a dependent container is started before
     * permitting other containers to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - This condition validates that a dependent
     * container runs to completion (exits) before permitting other containers
     * to start. This can be useful for nonessential containers that run a
     * script and then exit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> - This condition is the same as
     * <code>COMPLETE</code>, but it also requires that the container exits with
     * a <code>zero</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code> - This condition validates that the dependent
     * container passes its Docker health check before permitting other
     * containers to start. This requires that the dependent container has
     * health checks configured. This condition is confirmed only at task
     * startup.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START, COMPLETE, SUCCESS, HEALTHY
     *
     * @return <p>
     *         The dependency condition of the container. The following are the
     *         available conditions and their behavior:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>START</code> - This condition emulates the behavior of
     *         links and volumes today. It validates that a dependent container
     *         is started before permitting other containers to start.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETE</code> - This condition validates that a dependent
     *         container runs to completion (exits) before permitting other
     *         containers to start. This can be useful for nonessential
     *         containers that run a script and then exit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCESS</code> - This condition is the same as
     *         <code>COMPLETE</code>, but it also requires that the container
     *         exits with a <code>zero</code> status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HEALTHY</code> - This condition validates that the
     *         dependent container passes its Docker health check before
     *         permitting other containers to start. This requires that the
     *         dependent container has health checks configured. This condition
     *         is confirmed only at task startup.
     *         </p>
     *         </li>
     *         </ul>
     * @see ContainerCondition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * <p>
     * The dependency condition of the container. The following are the
     * available conditions and their behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>START</code> - This condition emulates the behavior of links and
     * volumes today. It validates that a dependent container is started before
     * permitting other containers to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - This condition validates that a dependent
     * container runs to completion (exits) before permitting other containers
     * to start. This can be useful for nonessential containers that run a
     * script and then exit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> - This condition is the same as
     * <code>COMPLETE</code>, but it also requires that the container exits with
     * a <code>zero</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code> - This condition validates that the dependent
     * container passes its Docker health check before permitting other
     * containers to start. This requires that the dependent container has
     * health checks configured. This condition is confirmed only at task
     * startup.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START, COMPLETE, SUCCESS, HEALTHY
     *
     * @param condition <p>
     *            The dependency condition of the container. The following are
     *            the available conditions and their behavior:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>START</code> - This condition emulates the behavior of
     *            links and volumes today. It validates that a dependent
     *            container is started before permitting other containers to
     *            start.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COMPLETE</code> - This condition validates that a
     *            dependent container runs to completion (exits) before
     *            permitting other containers to start. This can be useful for
     *            nonessential containers that run a script and then exit.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCESS</code> - This condition is the same as
     *            <code>COMPLETE</code>, but it also requires that the container
     *            exits with a <code>zero</code> status.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HEALTHY</code> - This condition validates that the
     *            dependent container passes its Docker health check before
     *            permitting other containers to start. This requires that the
     *            dependent container has health checks configured. This
     *            condition is confirmed only at task startup.
     *            </p>
     *            </li>
     *            </ul>
     * @see ContainerCondition
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The dependency condition of the container. The following are the
     * available conditions and their behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>START</code> - This condition emulates the behavior of links and
     * volumes today. It validates that a dependent container is started before
     * permitting other containers to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - This condition validates that a dependent
     * container runs to completion (exits) before permitting other containers
     * to start. This can be useful for nonessential containers that run a
     * script and then exit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> - This condition is the same as
     * <code>COMPLETE</code>, but it also requires that the container exits with
     * a <code>zero</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code> - This condition validates that the dependent
     * container passes its Docker health check before permitting other
     * containers to start. This requires that the dependent container has
     * health checks configured. This condition is confirmed only at task
     * startup.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START, COMPLETE, SUCCESS, HEALTHY
     *
     * @param condition <p>
     *            The dependency condition of the container. The following are
     *            the available conditions and their behavior:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>START</code> - This condition emulates the behavior of
     *            links and volumes today. It validates that a dependent
     *            container is started before permitting other containers to
     *            start.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COMPLETE</code> - This condition validates that a
     *            dependent container runs to completion (exits) before
     *            permitting other containers to start. This can be useful for
     *            nonessential containers that run a script and then exit.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCESS</code> - This condition is the same as
     *            <code>COMPLETE</code>, but it also requires that the container
     *            exits with a <code>zero</code> status.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HEALTHY</code> - This condition validates that the
     *            dependent container passes its Docker health check before
     *            permitting other containers to start. This requires that the
     *            dependent container has health checks configured. This
     *            condition is confirmed only at task startup.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContainerCondition
     */
    public ContainerDependency withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * <p>
     * The dependency condition of the container. The following are the
     * available conditions and their behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>START</code> - This condition emulates the behavior of links and
     * volumes today. It validates that a dependent container is started before
     * permitting other containers to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - This condition validates that a dependent
     * container runs to completion (exits) before permitting other containers
     * to start. This can be useful for nonessential containers that run a
     * script and then exit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> - This condition is the same as
     * <code>COMPLETE</code>, but it also requires that the container exits with
     * a <code>zero</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code> - This condition validates that the dependent
     * container passes its Docker health check before permitting other
     * containers to start. This requires that the dependent container has
     * health checks configured. This condition is confirmed only at task
     * startup.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START, COMPLETE, SUCCESS, HEALTHY
     *
     * @param condition <p>
     *            The dependency condition of the container. The following are
     *            the available conditions and their behavior:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>START</code> - This condition emulates the behavior of
     *            links and volumes today. It validates that a dependent
     *            container is started before permitting other containers to
     *            start.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COMPLETE</code> - This condition validates that a
     *            dependent container runs to completion (exits) before
     *            permitting other containers to start. This can be useful for
     *            nonessential containers that run a script and then exit.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCESS</code> - This condition is the same as
     *            <code>COMPLETE</code>, but it also requires that the container
     *            exits with a <code>zero</code> status.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HEALTHY</code> - This condition validates that the
     *            dependent container passes its Docker health check before
     *            permitting other containers to start. This requires that the
     *            dependent container has health checks configured. This
     *            condition is confirmed only at task startup.
     *            </p>
     *            </li>
     *            </ul>
     * @see ContainerCondition
     */
    public void setCondition(ContainerCondition condition) {
        this.condition = condition.toString();
    }

    /**
     * <p>
     * The dependency condition of the container. The following are the
     * available conditions and their behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>START</code> - This condition emulates the behavior of links and
     * volumes today. It validates that a dependent container is started before
     * permitting other containers to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - This condition validates that a dependent
     * container runs to completion (exits) before permitting other containers
     * to start. This can be useful for nonessential containers that run a
     * script and then exit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> - This condition is the same as
     * <code>COMPLETE</code>, but it also requires that the container exits with
     * a <code>zero</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code> - This condition validates that the dependent
     * container passes its Docker health check before permitting other
     * containers to start. This requires that the dependent container has
     * health checks configured. This condition is confirmed only at task
     * startup.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START, COMPLETE, SUCCESS, HEALTHY
     *
     * @param condition <p>
     *            The dependency condition of the container. The following are
     *            the available conditions and their behavior:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>START</code> - This condition emulates the behavior of
     *            links and volumes today. It validates that a dependent
     *            container is started before permitting other containers to
     *            start.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COMPLETE</code> - This condition validates that a
     *            dependent container runs to completion (exits) before
     *            permitting other containers to start. This can be useful for
     *            nonessential containers that run a script and then exit.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCESS</code> - This condition is the same as
     *            <code>COMPLETE</code>, but it also requires that the container
     *            exits with a <code>zero</code> status.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HEALTHY</code> - This condition validates that the
     *            dependent container passes its Docker health check before
     *            permitting other containers to start. This requires that the
     *            dependent container has health checks configured. This
     *            condition is confirmed only at task startup.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContainerCondition
     */
    public ContainerDependency withCondition(ContainerCondition condition) {
        this.condition = condition.toString();
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
        if (getContainerName() != null)
            sb.append("containerName: " + getContainerName() + ",");
        if (getCondition() != null)
            sb.append("condition: " + getCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerDependency == false)
            return false;
        ContainerDependency other = (ContainerDependency) obj;

        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null
                && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null
                && other.getCondition().equals(this.getCondition()) == false)
            return false;
        return true;
    }
}

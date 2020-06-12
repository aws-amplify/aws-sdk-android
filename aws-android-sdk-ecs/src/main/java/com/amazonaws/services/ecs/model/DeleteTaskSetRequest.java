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
 * Deletes a specified task set within a service. This is used when a service
 * uses the <code>EXTERNAL</code> deployment controller type. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html"
 * >Amazon ECS Deployment Types</a> in the <i>Amazon Elastic Container Service
 * Developer Guide</i>.
 * </p>
 */
public class DeleteTaskSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service that the task set exists in to delete.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that
     * hosts the task set to delete.
     * </p>
     */
    private String service;

    /**
     * <p>
     * The task set ID or full Amazon Resource Name (ARN) of the task set to
     * delete.
     * </p>
     */
    private String taskSet;

    /**
     * <p>
     * If <code>true</code>, this allows you to delete a task set even if it
     * hasn't been scaled down to zero.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service that the task set exists in to delete.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         that hosts the service that the task set exists in to delete.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service that the task set exists in to delete.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the service that the task set exists in to
     *            delete.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service that the task set exists in to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the service that the task set exists in to
     *            delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTaskSetRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that
     * hosts the task set to delete.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the service
     *         that hosts the task set to delete.
     *         </p>
     */
    public String getService() {
        return service;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that
     * hosts the task set to delete.
     * </p>
     *
     * @param service <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            service that hosts the task set to delete.
     *            </p>
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that
     * hosts the task set to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param service <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            service that hosts the task set to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTaskSetRequest withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * <p>
     * The task set ID or full Amazon Resource Name (ARN) of the task set to
     * delete.
     * </p>
     *
     * @return <p>
     *         The task set ID or full Amazon Resource Name (ARN) of the task
     *         set to delete.
     *         </p>
     */
    public String getTaskSet() {
        return taskSet;
    }

    /**
     * <p>
     * The task set ID or full Amazon Resource Name (ARN) of the task set to
     * delete.
     * </p>
     *
     * @param taskSet <p>
     *            The task set ID or full Amazon Resource Name (ARN) of the task
     *            set to delete.
     *            </p>
     */
    public void setTaskSet(String taskSet) {
        this.taskSet = taskSet;
    }

    /**
     * <p>
     * The task set ID or full Amazon Resource Name (ARN) of the task set to
     * delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskSet <p>
     *            The task set ID or full Amazon Resource Name (ARN) of the task
     *            set to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTaskSetRequest withTaskSet(String taskSet) {
        this.taskSet = taskSet;
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, this allows you to delete a task set even if it
     * hasn't been scaled down to zero.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, this allows you to delete a task set even
     *         if it hasn't been scaled down to zero.
     *         </p>
     */
    public Boolean isForce() {
        return force;
    }

    /**
     * <p>
     * If <code>true</code>, this allows you to delete a task set even if it
     * hasn't been scaled down to zero.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, this allows you to delete a task set even
     *         if it hasn't been scaled down to zero.
     *         </p>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * <p>
     * If <code>true</code>, this allows you to delete a task set even if it
     * hasn't been scaled down to zero.
     * </p>
     *
     * @param force <p>
     *            If <code>true</code>, this allows you to delete a task set
     *            even if it hasn't been scaled down to zero.
     *            </p>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * If <code>true</code>, this allows you to delete a task set even if it
     * hasn't been scaled down to zero.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param force <p>
     *            If <code>true</code>, this allows you to delete a task set
     *            even if it hasn't been scaled down to zero.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTaskSetRequest withForce(Boolean force) {
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
        if (getService() != null)
            sb.append("service: " + getService() + ",");
        if (getTaskSet() != null)
            sb.append("taskSet: " + getTaskSet() + ",");
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
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getTaskSet() == null) ? 0 : getTaskSet().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTaskSetRequest == false)
            return false;
        DeleteTaskSetRequest other = (DeleteTaskSetRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getTaskSet() == null ^ this.getTaskSet() == null)
            return false;
        if (other.getTaskSet() != null && other.getTaskSet().equals(this.getTaskSet()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }
}

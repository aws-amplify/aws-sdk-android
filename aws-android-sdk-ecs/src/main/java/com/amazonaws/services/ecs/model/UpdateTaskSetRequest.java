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
 * Modifies a task set. This is used when a service uses the
 * <code>EXTERNAL</code> deployment controller type. For more information, see
 * <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html"
 * >Amazon ECS Deployment Types</a> in the <i>Amazon Elastic Container Service
 * Developer Guide</i>.
 * </p>
 */
public class UpdateTaskSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service that the task set exists in.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that the
     * task set exists in.
     * </p>
     */
    private String service;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the task set to
     * update.
     * </p>
     */
    private String taskSet;

    /**
     * <p>
     * A floating-point percentage of the desired number of tasks to place and
     * keep running in the task set.
     * </p>
     */
    private Scale scale;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service that the task set exists in.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         that hosts the service that the task set exists in.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service that the task set exists in.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the service that the task set exists in.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service that the task set exists in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the service that the task set exists in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTaskSetRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that the
     * task set exists in.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the service
     *         that the task set exists in.
     *         </p>
     */
    public String getService() {
        return service;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that the
     * task set exists in.
     * </p>
     *
     * @param service <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            service that the task set exists in.
     *            </p>
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that the
     * task set exists in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param service <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            service that the task set exists in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTaskSetRequest withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the task set to
     * update.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the task set
     *         to update.
     *         </p>
     */
    public String getTaskSet() {
        return taskSet;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the task set to
     * update.
     * </p>
     *
     * @param taskSet <p>
     *            The short name or full Amazon Resource Name (ARN) of the task
     *            set to update.
     *            </p>
     */
    public void setTaskSet(String taskSet) {
        this.taskSet = taskSet;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the task set to
     * update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskSet <p>
     *            The short name or full Amazon Resource Name (ARN) of the task
     *            set to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTaskSetRequest withTaskSet(String taskSet) {
        this.taskSet = taskSet;
        return this;
    }

    /**
     * <p>
     * A floating-point percentage of the desired number of tasks to place and
     * keep running in the task set.
     * </p>
     *
     * @return <p>
     *         A floating-point percentage of the desired number of tasks to
     *         place and keep running in the task set.
     *         </p>
     */
    public Scale getScale() {
        return scale;
    }

    /**
     * <p>
     * A floating-point percentage of the desired number of tasks to place and
     * keep running in the task set.
     * </p>
     *
     * @param scale <p>
     *            A floating-point percentage of the desired number of tasks to
     *            place and keep running in the task set.
     *            </p>
     */
    public void setScale(Scale scale) {
        this.scale = scale;
    }

    /**
     * <p>
     * A floating-point percentage of the desired number of tasks to place and
     * keep running in the task set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scale <p>
     *            A floating-point percentage of the desired number of tasks to
     *            place and keep running in the task set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTaskSetRequest withScale(Scale scale) {
        this.scale = scale;
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
        if (getScale() != null)
            sb.append("scale: " + getScale());
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
        hashCode = prime * hashCode + ((getScale() == null) ? 0 : getScale().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTaskSetRequest == false)
            return false;
        UpdateTaskSetRequest other = (UpdateTaskSetRequest) obj;

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
        if (other.getScale() == null ^ this.getScale() == null)
            return false;
        if (other.getScale() != null && other.getScale().equals(this.getScale()) == false)
            return false;
        return true;
    }
}

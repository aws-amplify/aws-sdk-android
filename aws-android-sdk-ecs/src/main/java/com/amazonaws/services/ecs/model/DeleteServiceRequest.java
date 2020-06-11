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
 * Deletes a specified service within a cluster. You can delete a service if you
 * have no running tasks in it and the desired task count is zero. If the
 * service is actively maintaining tasks, you cannot delete it, and you must
 * update the service to a desired task count of zero. For more information, see
 * <a>UpdateService</a>.
 * </p>
 * <note>
 * <p>
 * When you delete a service, if there are still running tasks that require
 * cleanup, the service status moves from <code>ACTIVE</code> to
 * <code>DRAINING</code>, and the service is no longer visible in the console or
 * in the <a>ListServices</a> API operation. After all tasks have transitioned
 * to either <code>STOPPING</code> or <code>STOPPED</code> status, the service
 * status moves from <code>DRAINING</code> to <code>INACTIVE</code>. Services in
 * the <code>DRAINING</code> or <code>INACTIVE</code> status can still be viewed
 * with the <a>DescribeServices</a> API operation. However, in the future,
 * <code>INACTIVE</code> services may be cleaned up and purged from Amazon ECS
 * record keeping, and <a>DescribeServices</a> calls on those services return a
 * <code>ServiceNotFoundException</code> error.
 * </p>
 * </note> <important>
 * <p>
 * If you attempt to create a new service with the same name as an existing
 * service in either <code>ACTIVE</code> or <code>DRAINING</code> status, you
 * receive an error.
 * </p>
 * </important>
 */
public class DeleteServiceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service to delete. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The name of the service to delete.
     * </p>
     */
    private String service;

    /**
     * <p>
     * If <code>true</code>, allows you to delete a service even if it has not
     * been scaled down to zero tasks. It is only necessary to use this if the
     * service is using the <code>REPLICA</code> scheduling strategy.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service to delete. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         that hosts the service to delete. If you do not specify a
     *         cluster, the default cluster is assumed.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service to delete. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the service to delete. If you do not
     *            specify a cluster, the default cluster is assumed.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service to delete. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the service to delete. If you do not
     *            specify a cluster, the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteServiceRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The name of the service to delete.
     * </p>
     *
     * @return <p>
     *         The name of the service to delete.
     *         </p>
     */
    public String getService() {
        return service;
    }

    /**
     * <p>
     * The name of the service to delete.
     * </p>
     *
     * @param service <p>
     *            The name of the service to delete.
     *            </p>
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The name of the service to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param service <p>
     *            The name of the service to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteServiceRequest withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, allows you to delete a service even if it has not
     * been scaled down to zero tasks. It is only necessary to use this if the
     * service is using the <code>REPLICA</code> scheduling strategy.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, allows you to delete a service even if it
     *         has not been scaled down to zero tasks. It is only necessary to
     *         use this if the service is using the <code>REPLICA</code>
     *         scheduling strategy.
     *         </p>
     */
    public Boolean isForce() {
        return force;
    }

    /**
     * <p>
     * If <code>true</code>, allows you to delete a service even if it has not
     * been scaled down to zero tasks. It is only necessary to use this if the
     * service is using the <code>REPLICA</code> scheduling strategy.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, allows you to delete a service even if it
     *         has not been scaled down to zero tasks. It is only necessary to
     *         use this if the service is using the <code>REPLICA</code>
     *         scheduling strategy.
     *         </p>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * <p>
     * If <code>true</code>, allows you to delete a service even if it has not
     * been scaled down to zero tasks. It is only necessary to use this if the
     * service is using the <code>REPLICA</code> scheduling strategy.
     * </p>
     *
     * @param force <p>
     *            If <code>true</code>, allows you to delete a service even if
     *            it has not been scaled down to zero tasks. It is only
     *            necessary to use this if the service is using the
     *            <code>REPLICA</code> scheduling strategy.
     *            </p>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * If <code>true</code>, allows you to delete a service even if it has not
     * been scaled down to zero tasks. It is only necessary to use this if the
     * service is using the <code>REPLICA</code> scheduling strategy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param force <p>
     *            If <code>true</code>, allows you to delete a service even if
     *            it has not been scaled down to zero tasks. It is only
     *            necessary to use this if the service is using the
     *            <code>REPLICA</code> scheduling strategy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteServiceRequest withForce(Boolean force) {
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
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteServiceRequest == false)
            return false;
        DeleteServiceRequest other = (DeleteServiceRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }
}

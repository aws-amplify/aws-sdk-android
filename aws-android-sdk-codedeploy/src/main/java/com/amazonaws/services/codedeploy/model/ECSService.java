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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the service and cluster names used to identify an Amazon ECS
 * deployment's target.
 * </p>
 */
public class ECSService implements Serializable {
    /**
     * <p>
     * The name of the target Amazon ECS service.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The name of the cluster that the Amazon ECS service is associated with.
     * </p>
     */
    private String clusterName;

    /**
     * <p>
     * The name of the target Amazon ECS service.
     * </p>
     *
     * @return <p>
     *         The name of the target Amazon ECS service.
     *         </p>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * The name of the target Amazon ECS service.
     * </p>
     *
     * @param serviceName <p>
     *            The name of the target Amazon ECS service.
     *            </p>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the target Amazon ECS service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceName <p>
     *            The name of the target Amazon ECS service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ECSService withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * <p>
     * The name of the cluster that the Amazon ECS service is associated with.
     * </p>
     *
     * @return <p>
     *         The name of the cluster that the Amazon ECS service is associated
     *         with.
     *         </p>
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * <p>
     * The name of the cluster that the Amazon ECS service is associated with.
     * </p>
     *
     * @param clusterName <p>
     *            The name of the cluster that the Amazon ECS service is
     *            associated with.
     *            </p>
     */
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster that the Amazon ECS service is associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterName <p>
     *            The name of the cluster that the Amazon ECS service is
     *            associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ECSService withClusterName(String clusterName) {
        this.clusterName = clusterName;
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
        if (getServiceName() != null)
            sb.append("serviceName: " + getServiceName() + ",");
        if (getClusterName() != null)
            sb.append("clusterName: " + getClusterName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode
                + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ECSService == false)
            return false;
        ECSService other = (ECSService) obj;

        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null
                && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        return true;
    }
}

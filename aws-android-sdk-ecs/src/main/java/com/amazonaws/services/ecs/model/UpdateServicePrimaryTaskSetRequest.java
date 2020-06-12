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
 * Modifies which task set in a service is the primary task set. Any parameters
 * that are updated on the primary task set in a service will transition to the
 * service. This is used when a service uses the <code>EXTERNAL</code>
 * deployment controller type. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html"
 * >Amazon ECS Deployment Types</a> in the <i>Amazon Elastic Container Service
 * Developer Guide</i>.
 * </p>
 */
public class UpdateServicePrimaryTaskSetRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The short name or full Amazon Resource Name (ARN) of the task set to set
     * as the primary task set in the deployment.
     * </p>
     */
    private String primaryTaskSet;

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
    public UpdateServicePrimaryTaskSetRequest withCluster(String cluster) {
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
    public UpdateServicePrimaryTaskSetRequest withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the task set to set
     * as the primary task set in the deployment.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the task set
     *         to set as the primary task set in the deployment.
     *         </p>
     */
    public String getPrimaryTaskSet() {
        return primaryTaskSet;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the task set to set
     * as the primary task set in the deployment.
     * </p>
     *
     * @param primaryTaskSet <p>
     *            The short name or full Amazon Resource Name (ARN) of the task
     *            set to set as the primary task set in the deployment.
     *            </p>
     */
    public void setPrimaryTaskSet(String primaryTaskSet) {
        this.primaryTaskSet = primaryTaskSet;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the task set to set
     * as the primary task set in the deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param primaryTaskSet <p>
     *            The short name or full Amazon Resource Name (ARN) of the task
     *            set to set as the primary task set in the deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServicePrimaryTaskSetRequest withPrimaryTaskSet(String primaryTaskSet) {
        this.primaryTaskSet = primaryTaskSet;
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
        if (getPrimaryTaskSet() != null)
            sb.append("primaryTaskSet: " + getPrimaryTaskSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode
                + ((getPrimaryTaskSet() == null) ? 0 : getPrimaryTaskSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServicePrimaryTaskSetRequest == false)
            return false;
        UpdateServicePrimaryTaskSetRequest other = (UpdateServicePrimaryTaskSetRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getPrimaryTaskSet() == null ^ this.getPrimaryTaskSet() == null)
            return false;
        if (other.getPrimaryTaskSet() != null
                && other.getPrimaryTaskSet().equals(this.getPrimaryTaskSet()) == false)
            return false;
        return true;
    }
}

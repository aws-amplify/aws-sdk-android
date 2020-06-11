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
 * Deletes the specified capacity provider.
 * </p>
 * <note>
 * <p>
 * The <code>FARGATE</code> and <code>FARGATE_SPOT</code> capacity providers are
 * reserved and cannot be deleted. You can disassociate them from a cluster
 * using either the <a>PutClusterCapacityProviders</a> API or by deleting the
 * cluster.
 * </p>
 * </note>
 * <p>
 * Prior to a capacity provider being deleted, the capacity provider must be
 * removed from the capacity provider strategy from all services. The
 * <a>UpdateService</a> API can be used to remove a capacity provider from a
 * service's capacity provider strategy. When updating a service, the
 * <code>forceNewDeployment</code> option can be used to ensure that any tasks
 * using the Amazon EC2 instance capacity provided by the capacity provider are
 * transitioned to use the capacity from the remaining capacity providers. Only
 * capacity providers that are not associated with a cluster can be deleted. To
 * remove a capacity provider from a cluster, you can either use
 * <a>PutClusterCapacityProviders</a> or delete the cluster.
 * </p>
 */
public class DeleteCapacityProviderRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the capacity
     * provider to delete.
     * </p>
     */
    private String capacityProvider;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the capacity
     * provider to delete.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the capacity
     *         provider to delete.
     *         </p>
     */
    public String getCapacityProvider() {
        return capacityProvider;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the capacity
     * provider to delete.
     * </p>
     *
     * @param capacityProvider <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            capacity provider to delete.
     *            </p>
     */
    public void setCapacityProvider(String capacityProvider) {
        this.capacityProvider = capacityProvider;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the capacity
     * provider to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProvider <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            capacity provider to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteCapacityProviderRequest withCapacityProvider(String capacityProvider) {
        this.capacityProvider = capacityProvider;
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
        if (getCapacityProvider() != null)
            sb.append("capacityProvider: " + getCapacityProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCapacityProvider() == null) ? 0 : getCapacityProvider().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCapacityProviderRequest == false)
            return false;
        DeleteCapacityProviderRequest other = (DeleteCapacityProviderRequest) obj;

        if (other.getCapacityProvider() == null ^ this.getCapacityProvider() == null)
            return false;
        if (other.getCapacityProvider() != null
                && other.getCapacityProvider().equals(this.getCapacityProvider()) == false)
            return false;
        return true;
    }
}

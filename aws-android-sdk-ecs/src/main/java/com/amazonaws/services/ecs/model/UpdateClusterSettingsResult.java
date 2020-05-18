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

public class UpdateClusterSettingsResult implements Serializable {
    /**
     * <p>
     * A regional grouping of one or more container instances on which you can
     * run task requests. Each account receives a default cluster the first time
     * you use the Amazon ECS service, but you may also create other clusters.
     * Clusters may contain more than one instance type simultaneously.
     * </p>
     */
    private Cluster cluster;

    /**
     * <p>
     * A regional grouping of one or more container instances on which you can
     * run task requests. Each account receives a default cluster the first time
     * you use the Amazon ECS service, but you may also create other clusters.
     * Clusters may contain more than one instance type simultaneously.
     * </p>
     *
     * @return <p>
     *         A regional grouping of one or more container instances on which
     *         you can run task requests. Each account receives a default
     *         cluster the first time you use the Amazon ECS service, but you
     *         may also create other clusters. Clusters may contain more than
     *         one instance type simultaneously.
     *         </p>
     */
    public Cluster getCluster() {
        return cluster;
    }

    /**
     * <p>
     * A regional grouping of one or more container instances on which you can
     * run task requests. Each account receives a default cluster the first time
     * you use the Amazon ECS service, but you may also create other clusters.
     * Clusters may contain more than one instance type simultaneously.
     * </p>
     *
     * @param cluster <p>
     *            A regional grouping of one or more container instances on
     *            which you can run task requests. Each account receives a
     *            default cluster the first time you use the Amazon ECS service,
     *            but you may also create other clusters. Clusters may contain
     *            more than one instance type simultaneously.
     *            </p>
     */
    public void setCluster(Cluster cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * A regional grouping of one or more container instances on which you can
     * run task requests. Each account receives a default cluster the first time
     * you use the Amazon ECS service, but you may also create other clusters.
     * Clusters may contain more than one instance type simultaneously.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            A regional grouping of one or more container instances on
     *            which you can run task requests. Each account receives a
     *            default cluster the first time you use the Amazon ECS service,
     *            but you may also create other clusters. Clusters may contain
     *            more than one instance type simultaneously.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateClusterSettingsResult withCluster(Cluster cluster) {
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
        if (getCluster() != null)
            sb.append("cluster: " + getCluster());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateClusterSettingsResult == false)
            return false;
        UpdateClusterSettingsResult other = (UpdateClusterSettingsResult) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        return true;
    }
}

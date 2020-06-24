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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

public class AddInstanceFleetResult implements Serializable {
    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String clusterId;

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     */
    private String instanceFleetId;

    /**
     * <p>
     * The Amazon Resource Name of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String clusterArn;

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The unique identifier of the cluster.
     *         </p>
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param clusterId <p>
     *            The unique identifier of the cluster.
     *            </p>
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param clusterId <p>
     *            The unique identifier of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddInstanceFleetResult withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the instance fleet.
     *         </p>
     */
    public String getInstanceFleetId() {
        return instanceFleetId;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     *
     * @param instanceFleetId <p>
     *            The unique identifier of the instance fleet.
     *            </p>
     */
    public void setInstanceFleetId(String instanceFleetId) {
        this.instanceFleetId = instanceFleetId;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceFleetId <p>
     *            The unique identifier of the instance fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddInstanceFleetResult withInstanceFleetId(String instanceFleetId) {
        this.instanceFleetId = instanceFleetId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name of the cluster.
     *         </p>
     */
    public String getClusterArn() {
        return clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param clusterArn <p>
     *            The Amazon Resource Name of the cluster.
     *            </p>
     */
    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param clusterArn <p>
     *            The Amazon Resource Name of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddInstanceFleetResult withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
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
        if (getClusterId() != null)
            sb.append("ClusterId: " + getClusterId() + ",");
        if (getInstanceFleetId() != null)
            sb.append("InstanceFleetId: " + getInstanceFleetId() + ",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: " + getClusterArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceFleetId() == null) ? 0 : getInstanceFleetId().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddInstanceFleetResult == false)
            return false;
        AddInstanceFleetResult other = (AddInstanceFleetResult) obj;

        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null
                && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getInstanceFleetId() == null ^ this.getInstanceFleetId() == null)
            return false;
        if (other.getInstanceFleetId() != null
                && other.getInstanceFleetId().equals(this.getInstanceFleetId()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null
                && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        return true;
    }
}

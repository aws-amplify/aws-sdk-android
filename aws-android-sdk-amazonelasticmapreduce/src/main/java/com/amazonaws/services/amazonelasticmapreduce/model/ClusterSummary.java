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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The summary description of the cluster.
 * </p>
 */
public class ClusterSummary implements Serializable {
    /**
     * <p>
     * The unique identifier for the cluster.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The name of the cluster.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The details about the current status of the cluster.
     * </p>
     */
    private ClusterStatus status;

    /**
     * <p>
     * An approximation of the cost of the cluster, represented in
     * m1.small/hours. This value is incremented one time for every hour an
     * m1.small instance runs. Larger instances are weighted more, so an EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is only
     * an approximation and does not reflect the actual billing rate.
     * </p>
     */
    private Integer normalizedInstanceHours;

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
     * The Amazon Resource Name (ARN) of the Outpost where the cluster is
     * launched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String outpostArn;

    /**
     * <p>
     * The unique identifier for the cluster.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the cluster.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the cluster.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the cluster.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     *
     * @return <p>
     *         The name of the cluster.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     *
     * @param name <p>
     *            The name of the cluster.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The details about the current status of the cluster.
     * </p>
     *
     * @return <p>
     *         The details about the current status of the cluster.
     *         </p>
     */
    public ClusterStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The details about the current status of the cluster.
     * </p>
     *
     * @param status <p>
     *            The details about the current status of the cluster.
     *            </p>
     */
    public void setStatus(ClusterStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The details about the current status of the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The details about the current status of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSummary withStatus(ClusterStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * An approximation of the cost of the cluster, represented in
     * m1.small/hours. This value is incremented one time for every hour an
     * m1.small instance runs. Larger instances are weighted more, so an EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is only
     * an approximation and does not reflect the actual billing rate.
     * </p>
     *
     * @return <p>
     *         An approximation of the cost of the cluster, represented in
     *         m1.small/hours. This value is incremented one time for every hour
     *         an m1.small instance runs. Larger instances are weighted more, so
     *         an EC2 instance that is roughly four times more expensive would
     *         result in the normalized instance hours being incremented by
     *         four. This result is only an approximation and does not reflect
     *         the actual billing rate.
     *         </p>
     */
    public Integer getNormalizedInstanceHours() {
        return normalizedInstanceHours;
    }

    /**
     * <p>
     * An approximation of the cost of the cluster, represented in
     * m1.small/hours. This value is incremented one time for every hour an
     * m1.small instance runs. Larger instances are weighted more, so an EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is only
     * an approximation and does not reflect the actual billing rate.
     * </p>
     *
     * @param normalizedInstanceHours <p>
     *            An approximation of the cost of the cluster, represented in
     *            m1.small/hours. This value is incremented one time for every
     *            hour an m1.small instance runs. Larger instances are weighted
     *            more, so an EC2 instance that is roughly four times more
     *            expensive would result in the normalized instance hours being
     *            incremented by four. This result is only an approximation and
     *            does not reflect the actual billing rate.
     *            </p>
     */
    public void setNormalizedInstanceHours(Integer normalizedInstanceHours) {
        this.normalizedInstanceHours = normalizedInstanceHours;
    }

    /**
     * <p>
     * An approximation of the cost of the cluster, represented in
     * m1.small/hours. This value is incremented one time for every hour an
     * m1.small instance runs. Larger instances are weighted more, so an EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is only
     * an approximation and does not reflect the actual billing rate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param normalizedInstanceHours <p>
     *            An approximation of the cost of the cluster, represented in
     *            m1.small/hours. This value is incremented one time for every
     *            hour an m1.small instance runs. Larger instances are weighted
     *            more, so an EC2 instance that is roughly four times more
     *            expensive would result in the normalized instance hours being
     *            incremented by four. This result is only an approximation and
     *            does not reflect the actual billing rate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSummary withNormalizedInstanceHours(Integer normalizedInstanceHours) {
        this.normalizedInstanceHours = normalizedInstanceHours;
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
    public ClusterSummary withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost where the cluster is
     * launched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Outpost where the cluster
     *         is launched.
     *         </p>
     */
    public String getOutpostArn() {
        return outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost where the cluster is
     * launched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the Outpost where the
     *            cluster is launched.
     *            </p>
     */
    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost where the cluster is
     * launched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the Outpost where the
     *            cluster is launched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSummary withOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getNormalizedInstanceHours() != null)
            sb.append("NormalizedInstanceHours: " + getNormalizedInstanceHours() + ",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: " + getClusterArn() + ",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: " + getOutpostArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getNormalizedInstanceHours() == null) ? 0 : getNormalizedInstanceHours()
                        .hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterSummary == false)
            return false;
        ClusterSummary other = (ClusterSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNormalizedInstanceHours() == null ^ this.getNormalizedInstanceHours() == null)
            return false;
        if (other.getNormalizedInstanceHours() != null
                && other.getNormalizedInstanceHours().equals(this.getNormalizedInstanceHours()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null
                && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null
                && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        return true;
    }
}

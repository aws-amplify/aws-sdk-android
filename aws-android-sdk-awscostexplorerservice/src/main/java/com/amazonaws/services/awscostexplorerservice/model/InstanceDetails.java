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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Details about the instances that AWS recommends that you purchase.
 * </p>
 */
public class InstanceDetails implements Serializable {
    /**
     * <p>
     * The Amazon EC2 instances that AWS recommends that you purchase.
     * </p>
     */
    private EC2InstanceDetails eC2InstanceDetails;

    /**
     * <p>
     * The Amazon RDS instances that AWS recommends that you purchase.
     * </p>
     */
    private RDSInstanceDetails rDSInstanceDetails;

    /**
     * <p>
     * The Amazon Redshift instances that AWS recommends that you purchase.
     * </p>
     */
    private RedshiftInstanceDetails redshiftInstanceDetails;

    /**
     * <p>
     * The ElastiCache instances that AWS recommends that you purchase.
     * </p>
     */
    private ElastiCacheInstanceDetails elastiCacheInstanceDetails;

    /**
     * <p>
     * The Amazon ES instances that AWS recommends that you purchase.
     * </p>
     */
    private ESInstanceDetails eSInstanceDetails;

    /**
     * <p>
     * The Amazon EC2 instances that AWS recommends that you purchase.
     * </p>
     *
     * @return <p>
     *         The Amazon EC2 instances that AWS recommends that you purchase.
     *         </p>
     */
    public EC2InstanceDetails getEC2InstanceDetails() {
        return eC2InstanceDetails;
    }

    /**
     * <p>
     * The Amazon EC2 instances that AWS recommends that you purchase.
     * </p>
     *
     * @param eC2InstanceDetails <p>
     *            The Amazon EC2 instances that AWS recommends that you
     *            purchase.
     *            </p>
     */
    public void setEC2InstanceDetails(EC2InstanceDetails eC2InstanceDetails) {
        this.eC2InstanceDetails = eC2InstanceDetails;
    }

    /**
     * <p>
     * The Amazon EC2 instances that AWS recommends that you purchase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eC2InstanceDetails <p>
     *            The Amazon EC2 instances that AWS recommends that you
     *            purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withEC2InstanceDetails(EC2InstanceDetails eC2InstanceDetails) {
        this.eC2InstanceDetails = eC2InstanceDetails;
        return this;
    }

    /**
     * <p>
     * The Amazon RDS instances that AWS recommends that you purchase.
     * </p>
     *
     * @return <p>
     *         The Amazon RDS instances that AWS recommends that you purchase.
     *         </p>
     */
    public RDSInstanceDetails getRDSInstanceDetails() {
        return rDSInstanceDetails;
    }

    /**
     * <p>
     * The Amazon RDS instances that AWS recommends that you purchase.
     * </p>
     *
     * @param rDSInstanceDetails <p>
     *            The Amazon RDS instances that AWS recommends that you
     *            purchase.
     *            </p>
     */
    public void setRDSInstanceDetails(RDSInstanceDetails rDSInstanceDetails) {
        this.rDSInstanceDetails = rDSInstanceDetails;
    }

    /**
     * <p>
     * The Amazon RDS instances that AWS recommends that you purchase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rDSInstanceDetails <p>
     *            The Amazon RDS instances that AWS recommends that you
     *            purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withRDSInstanceDetails(RDSInstanceDetails rDSInstanceDetails) {
        this.rDSInstanceDetails = rDSInstanceDetails;
        return this;
    }

    /**
     * <p>
     * The Amazon Redshift instances that AWS recommends that you purchase.
     * </p>
     *
     * @return <p>
     *         The Amazon Redshift instances that AWS recommends that you
     *         purchase.
     *         </p>
     */
    public RedshiftInstanceDetails getRedshiftInstanceDetails() {
        return redshiftInstanceDetails;
    }

    /**
     * <p>
     * The Amazon Redshift instances that AWS recommends that you purchase.
     * </p>
     *
     * @param redshiftInstanceDetails <p>
     *            The Amazon Redshift instances that AWS recommends that you
     *            purchase.
     *            </p>
     */
    public void setRedshiftInstanceDetails(RedshiftInstanceDetails redshiftInstanceDetails) {
        this.redshiftInstanceDetails = redshiftInstanceDetails;
    }

    /**
     * <p>
     * The Amazon Redshift instances that AWS recommends that you purchase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param redshiftInstanceDetails <p>
     *            The Amazon Redshift instances that AWS recommends that you
     *            purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withRedshiftInstanceDetails(
            RedshiftInstanceDetails redshiftInstanceDetails) {
        this.redshiftInstanceDetails = redshiftInstanceDetails;
        return this;
    }

    /**
     * <p>
     * The ElastiCache instances that AWS recommends that you purchase.
     * </p>
     *
     * @return <p>
     *         The ElastiCache instances that AWS recommends that you purchase.
     *         </p>
     */
    public ElastiCacheInstanceDetails getElastiCacheInstanceDetails() {
        return elastiCacheInstanceDetails;
    }

    /**
     * <p>
     * The ElastiCache instances that AWS recommends that you purchase.
     * </p>
     *
     * @param elastiCacheInstanceDetails <p>
     *            The ElastiCache instances that AWS recommends that you
     *            purchase.
     *            </p>
     */
    public void setElastiCacheInstanceDetails(ElastiCacheInstanceDetails elastiCacheInstanceDetails) {
        this.elastiCacheInstanceDetails = elastiCacheInstanceDetails;
    }

    /**
     * <p>
     * The ElastiCache instances that AWS recommends that you purchase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elastiCacheInstanceDetails <p>
     *            The ElastiCache instances that AWS recommends that you
     *            purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withElastiCacheInstanceDetails(
            ElastiCacheInstanceDetails elastiCacheInstanceDetails) {
        this.elastiCacheInstanceDetails = elastiCacheInstanceDetails;
        return this;
    }

    /**
     * <p>
     * The Amazon ES instances that AWS recommends that you purchase.
     * </p>
     *
     * @return <p>
     *         The Amazon ES instances that AWS recommends that you purchase.
     *         </p>
     */
    public ESInstanceDetails getESInstanceDetails() {
        return eSInstanceDetails;
    }

    /**
     * <p>
     * The Amazon ES instances that AWS recommends that you purchase.
     * </p>
     *
     * @param eSInstanceDetails <p>
     *            The Amazon ES instances that AWS recommends that you purchase.
     *            </p>
     */
    public void setESInstanceDetails(ESInstanceDetails eSInstanceDetails) {
        this.eSInstanceDetails = eSInstanceDetails;
    }

    /**
     * <p>
     * The Amazon ES instances that AWS recommends that you purchase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eSInstanceDetails <p>
     *            The Amazon ES instances that AWS recommends that you purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withESInstanceDetails(ESInstanceDetails eSInstanceDetails) {
        this.eSInstanceDetails = eSInstanceDetails;
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
        if (getEC2InstanceDetails() != null)
            sb.append("EC2InstanceDetails: " + getEC2InstanceDetails() + ",");
        if (getRDSInstanceDetails() != null)
            sb.append("RDSInstanceDetails: " + getRDSInstanceDetails() + ",");
        if (getRedshiftInstanceDetails() != null)
            sb.append("RedshiftInstanceDetails: " + getRedshiftInstanceDetails() + ",");
        if (getElastiCacheInstanceDetails() != null)
            sb.append("ElastiCacheInstanceDetails: " + getElastiCacheInstanceDetails() + ",");
        if (getESInstanceDetails() != null)
            sb.append("ESInstanceDetails: " + getESInstanceDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEC2InstanceDetails() == null) ? 0 : getEC2InstanceDetails().hashCode());
        hashCode = prime * hashCode
                + ((getRDSInstanceDetails() == null) ? 0 : getRDSInstanceDetails().hashCode());
        hashCode = prime
                * hashCode
                + ((getRedshiftInstanceDetails() == null) ? 0 : getRedshiftInstanceDetails()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getElastiCacheInstanceDetails() == null) ? 0 : getElastiCacheInstanceDetails()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getESInstanceDetails() == null) ? 0 : getESInstanceDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceDetails == false)
            return false;
        InstanceDetails other = (InstanceDetails) obj;

        if (other.getEC2InstanceDetails() == null ^ this.getEC2InstanceDetails() == null)
            return false;
        if (other.getEC2InstanceDetails() != null
                && other.getEC2InstanceDetails().equals(this.getEC2InstanceDetails()) == false)
            return false;
        if (other.getRDSInstanceDetails() == null ^ this.getRDSInstanceDetails() == null)
            return false;
        if (other.getRDSInstanceDetails() != null
                && other.getRDSInstanceDetails().equals(this.getRDSInstanceDetails()) == false)
            return false;
        if (other.getRedshiftInstanceDetails() == null ^ this.getRedshiftInstanceDetails() == null)
            return false;
        if (other.getRedshiftInstanceDetails() != null
                && other.getRedshiftInstanceDetails().equals(this.getRedshiftInstanceDetails()) == false)
            return false;
        if (other.getElastiCacheInstanceDetails() == null
                ^ this.getElastiCacheInstanceDetails() == null)
            return false;
        if (other.getElastiCacheInstanceDetails() != null
                && other.getElastiCacheInstanceDetails().equals(
                        this.getElastiCacheInstanceDetails()) == false)
            return false;
        if (other.getESInstanceDetails() == null ^ this.getESInstanceDetails() == null)
            return false;
        if (other.getESInstanceDetails() != null
                && other.getESInstanceDetails().equals(this.getESInstanceDetails()) == false)
            return false;
        return true;
    }
}

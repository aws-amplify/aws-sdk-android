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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Information about valid modifications that you can make to your DB instance.
 * Contains the result of a successful call to the
 * <code>DescribeValidDBInstanceModifications</code> action.
 * </p>
 */
public class ValidStorageOptions implements Serializable {
    /**
     * <p>
     * The valid storage types for your DB instance. For example, gp2, io1.
     * </p>
     */
    private String storageType;

    /**
     * <p>
     * The valid range of storage in gibibytes. For example, 100 to 16384.
     * </p>
     */
    private java.util.List<Range> storageSize;

    /**
     * <p>
     * The valid range of provisioned IOPS. For example, 1000-20000.
     * </p>
     */
    private java.util.List<Range> provisionedIops;

    /**
     * <p>
     * The valid range of Provisioned IOPS to gibibytes of storage multiplier.
     * For example, 3-10, which means that provisioned IOPS can be between 3 and
     * 10 times storage.
     * </p>
     */
    private java.util.List<DoubleRange> iopsToStorageRatio;

    /**
     * <p>
     * Whether or not Amazon RDS can automatically scale storage for DB
     * instances that use the new instance class.
     * </p>
     */
    private Boolean supportsStorageAutoscaling;

    /**
     * <p>
     * The valid storage types for your DB instance. For example, gp2, io1.
     * </p>
     *
     * @return <p>
     *         The valid storage types for your DB instance. For example, gp2,
     *         io1.
     *         </p>
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * <p>
     * The valid storage types for your DB instance. For example, gp2, io1.
     * </p>
     *
     * @param storageType <p>
     *            The valid storage types for your DB instance. For example,
     *            gp2, io1.
     *            </p>
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The valid storage types for your DB instance. For example, gp2, io1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageType <p>
     *            The valid storage types for your DB instance. For example,
     *            gp2, io1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidStorageOptions withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * <p>
     * The valid range of storage in gibibytes. For example, 100 to 16384.
     * </p>
     *
     * @return <p>
     *         The valid range of storage in gibibytes. For example, 100 to
     *         16384.
     *         </p>
     */
    public java.util.List<Range> getStorageSize() {
        return storageSize;
    }

    /**
     * <p>
     * The valid range of storage in gibibytes. For example, 100 to 16384.
     * </p>
     *
     * @param storageSize <p>
     *            The valid range of storage in gibibytes. For example, 100 to
     *            16384.
     *            </p>
     */
    public void setStorageSize(java.util.Collection<Range> storageSize) {
        if (storageSize == null) {
            this.storageSize = null;
            return;
        }

        this.storageSize = new java.util.ArrayList<Range>(storageSize);
    }

    /**
     * <p>
     * The valid range of storage in gibibytes. For example, 100 to 16384.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageSize <p>
     *            The valid range of storage in gibibytes. For example, 100 to
     *            16384.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidStorageOptions withStorageSize(Range... storageSize) {
        if (getStorageSize() == null) {
            this.storageSize = new java.util.ArrayList<Range>(storageSize.length);
        }
        for (Range value : storageSize) {
            this.storageSize.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The valid range of storage in gibibytes. For example, 100 to 16384.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageSize <p>
     *            The valid range of storage in gibibytes. For example, 100 to
     *            16384.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidStorageOptions withStorageSize(java.util.Collection<Range> storageSize) {
        setStorageSize(storageSize);
        return this;
    }

    /**
     * <p>
     * The valid range of provisioned IOPS. For example, 1000-20000.
     * </p>
     *
     * @return <p>
     *         The valid range of provisioned IOPS. For example, 1000-20000.
     *         </p>
     */
    public java.util.List<Range> getProvisionedIops() {
        return provisionedIops;
    }

    /**
     * <p>
     * The valid range of provisioned IOPS. For example, 1000-20000.
     * </p>
     *
     * @param provisionedIops <p>
     *            The valid range of provisioned IOPS. For example, 1000-20000.
     *            </p>
     */
    public void setProvisionedIops(java.util.Collection<Range> provisionedIops) {
        if (provisionedIops == null) {
            this.provisionedIops = null;
            return;
        }

        this.provisionedIops = new java.util.ArrayList<Range>(provisionedIops);
    }

    /**
     * <p>
     * The valid range of provisioned IOPS. For example, 1000-20000.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisionedIops <p>
     *            The valid range of provisioned IOPS. For example, 1000-20000.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidStorageOptions withProvisionedIops(Range... provisionedIops) {
        if (getProvisionedIops() == null) {
            this.provisionedIops = new java.util.ArrayList<Range>(provisionedIops.length);
        }
        for (Range value : provisionedIops) {
            this.provisionedIops.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The valid range of provisioned IOPS. For example, 1000-20000.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisionedIops <p>
     *            The valid range of provisioned IOPS. For example, 1000-20000.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidStorageOptions withProvisionedIops(java.util.Collection<Range> provisionedIops) {
        setProvisionedIops(provisionedIops);
        return this;
    }

    /**
     * <p>
     * The valid range of Provisioned IOPS to gibibytes of storage multiplier.
     * For example, 3-10, which means that provisioned IOPS can be between 3 and
     * 10 times storage.
     * </p>
     *
     * @return <p>
     *         The valid range of Provisioned IOPS to gibibytes of storage
     *         multiplier. For example, 3-10, which means that provisioned IOPS
     *         can be between 3 and 10 times storage.
     *         </p>
     */
    public java.util.List<DoubleRange> getIopsToStorageRatio() {
        return iopsToStorageRatio;
    }

    /**
     * <p>
     * The valid range of Provisioned IOPS to gibibytes of storage multiplier.
     * For example, 3-10, which means that provisioned IOPS can be between 3 and
     * 10 times storage.
     * </p>
     *
     * @param iopsToStorageRatio <p>
     *            The valid range of Provisioned IOPS to gibibytes of storage
     *            multiplier. For example, 3-10, which means that provisioned
     *            IOPS can be between 3 and 10 times storage.
     *            </p>
     */
    public void setIopsToStorageRatio(java.util.Collection<DoubleRange> iopsToStorageRatio) {
        if (iopsToStorageRatio == null) {
            this.iopsToStorageRatio = null;
            return;
        }

        this.iopsToStorageRatio = new java.util.ArrayList<DoubleRange>(iopsToStorageRatio);
    }

    /**
     * <p>
     * The valid range of Provisioned IOPS to gibibytes of storage multiplier.
     * For example, 3-10, which means that provisioned IOPS can be between 3 and
     * 10 times storage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iopsToStorageRatio <p>
     *            The valid range of Provisioned IOPS to gibibytes of storage
     *            multiplier. For example, 3-10, which means that provisioned
     *            IOPS can be between 3 and 10 times storage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidStorageOptions withIopsToStorageRatio(DoubleRange... iopsToStorageRatio) {
        if (getIopsToStorageRatio() == null) {
            this.iopsToStorageRatio = new java.util.ArrayList<DoubleRange>(
                    iopsToStorageRatio.length);
        }
        for (DoubleRange value : iopsToStorageRatio) {
            this.iopsToStorageRatio.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The valid range of Provisioned IOPS to gibibytes of storage multiplier.
     * For example, 3-10, which means that provisioned IOPS can be between 3 and
     * 10 times storage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iopsToStorageRatio <p>
     *            The valid range of Provisioned IOPS to gibibytes of storage
     *            multiplier. For example, 3-10, which means that provisioned
     *            IOPS can be between 3 and 10 times storage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidStorageOptions withIopsToStorageRatio(
            java.util.Collection<DoubleRange> iopsToStorageRatio) {
        setIopsToStorageRatio(iopsToStorageRatio);
        return this;
    }

    /**
     * <p>
     * Whether or not Amazon RDS can automatically scale storage for DB
     * instances that use the new instance class.
     * </p>
     *
     * @return <p>
     *         Whether or not Amazon RDS can automatically scale storage for DB
     *         instances that use the new instance class.
     *         </p>
     */
    public Boolean isSupportsStorageAutoscaling() {
        return supportsStorageAutoscaling;
    }

    /**
     * <p>
     * Whether or not Amazon RDS can automatically scale storage for DB
     * instances that use the new instance class.
     * </p>
     *
     * @return <p>
     *         Whether or not Amazon RDS can automatically scale storage for DB
     *         instances that use the new instance class.
     *         </p>
     */
    public Boolean getSupportsStorageAutoscaling() {
        return supportsStorageAutoscaling;
    }

    /**
     * <p>
     * Whether or not Amazon RDS can automatically scale storage for DB
     * instances that use the new instance class.
     * </p>
     *
     * @param supportsStorageAutoscaling <p>
     *            Whether or not Amazon RDS can automatically scale storage for
     *            DB instances that use the new instance class.
     *            </p>
     */
    public void setSupportsStorageAutoscaling(Boolean supportsStorageAutoscaling) {
        this.supportsStorageAutoscaling = supportsStorageAutoscaling;
    }

    /**
     * <p>
     * Whether or not Amazon RDS can automatically scale storage for DB
     * instances that use the new instance class.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportsStorageAutoscaling <p>
     *            Whether or not Amazon RDS can automatically scale storage for
     *            DB instances that use the new instance class.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidStorageOptions withSupportsStorageAutoscaling(Boolean supportsStorageAutoscaling) {
        this.supportsStorageAutoscaling = supportsStorageAutoscaling;
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
        if (getStorageType() != null)
            sb.append("StorageType: " + getStorageType() + ",");
        if (getStorageSize() != null)
            sb.append("StorageSize: " + getStorageSize() + ",");
        if (getProvisionedIops() != null)
            sb.append("ProvisionedIops: " + getProvisionedIops() + ",");
        if (getIopsToStorageRatio() != null)
            sb.append("IopsToStorageRatio: " + getIopsToStorageRatio() + ",");
        if (getSupportsStorageAutoscaling() != null)
            sb.append("SupportsStorageAutoscaling: " + getSupportsStorageAutoscaling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode
                + ((getStorageSize() == null) ? 0 : getStorageSize().hashCode());
        hashCode = prime * hashCode
                + ((getProvisionedIops() == null) ? 0 : getProvisionedIops().hashCode());
        hashCode = prime * hashCode
                + ((getIopsToStorageRatio() == null) ? 0 : getIopsToStorageRatio().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportsStorageAutoscaling() == null) ? 0 : getSupportsStorageAutoscaling()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidStorageOptions == false)
            return false;
        ValidStorageOptions other = (ValidStorageOptions) obj;

        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null
                && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getStorageSize() == null ^ this.getStorageSize() == null)
            return false;
        if (other.getStorageSize() != null
                && other.getStorageSize().equals(this.getStorageSize()) == false)
            return false;
        if (other.getProvisionedIops() == null ^ this.getProvisionedIops() == null)
            return false;
        if (other.getProvisionedIops() != null
                && other.getProvisionedIops().equals(this.getProvisionedIops()) == false)
            return false;
        if (other.getIopsToStorageRatio() == null ^ this.getIopsToStorageRatio() == null)
            return false;
        if (other.getIopsToStorageRatio() != null
                && other.getIopsToStorageRatio().equals(this.getIopsToStorageRatio()) == false)
            return false;
        if (other.getSupportsStorageAutoscaling() == null
                ^ this.getSupportsStorageAutoscaling() == null)
            return false;
        if (other.getSupportsStorageAutoscaling() != null
                && other.getSupportsStorageAutoscaling().equals(
                        this.getSupportsStorageAutoscaling()) == false)
            return false;
        return true;
    }
}

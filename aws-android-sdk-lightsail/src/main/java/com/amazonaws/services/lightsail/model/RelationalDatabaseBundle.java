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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a database bundle. A bundle describes the performance
 * specifications of the database.
 * </p>
 */
public class RelationalDatabaseBundle implements Serializable {
    /**
     * <p>
     * The ID for the database bundle.
     * </p>
     */
    private String bundleId;

    /**
     * <p>
     * The name for the database bundle.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The cost of the database bundle in US currency.
     * </p>
     */
    private Float price;

    /**
     * <p>
     * The amount of RAM in GB (for example, <code>2.0</code>) for the database
     * bundle.
     * </p>
     */
    private Float ramSizeInGb;

    /**
     * <p>
     * The size of the disk for the database bundle.
     * </p>
     */
    private Integer diskSizeInGb;

    /**
     * <p>
     * The data transfer rate per month in GB for the database bundle.
     * </p>
     */
    private Integer transferPerMonthInGb;

    /**
     * <p>
     * The number of virtual CPUs (vCPUs) for the database bundle.
     * </p>
     */
    private Integer cpuCount;

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is encrypted.
     * </p>
     */
    private Boolean isEncrypted;

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is active.
     * </p>
     */
    private Boolean isActive;

    /**
     * <p>
     * The ID for the database bundle.
     * </p>
     *
     * @return <p>
     *         The ID for the database bundle.
     *         </p>
     */
    public String getBundleId() {
        return bundleId;
    }

    /**
     * <p>
     * The ID for the database bundle.
     * </p>
     *
     * @param bundleId <p>
     *            The ID for the database bundle.
     *            </p>
     */
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The ID for the database bundle.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bundleId <p>
     *            The ID for the database bundle.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseBundle withBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * <p>
     * The name for the database bundle.
     * </p>
     *
     * @return <p>
     *         The name for the database bundle.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name for the database bundle.
     * </p>
     *
     * @param name <p>
     *            The name for the database bundle.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the database bundle.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name for the database bundle.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseBundle withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The cost of the database bundle in US currency.
     * </p>
     *
     * @return <p>
     *         The cost of the database bundle in US currency.
     *         </p>
     */
    public Float getPrice() {
        return price;
    }

    /**
     * <p>
     * The cost of the database bundle in US currency.
     * </p>
     *
     * @param price <p>
     *            The cost of the database bundle in US currency.
     *            </p>
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * <p>
     * The cost of the database bundle in US currency.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param price <p>
     *            The cost of the database bundle in US currency.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseBundle withPrice(Float price) {
        this.price = price;
        return this;
    }

    /**
     * <p>
     * The amount of RAM in GB (for example, <code>2.0</code>) for the database
     * bundle.
     * </p>
     *
     * @return <p>
     *         The amount of RAM in GB (for example, <code>2.0</code>) for the
     *         database bundle.
     *         </p>
     */
    public Float getRamSizeInGb() {
        return ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM in GB (for example, <code>2.0</code>) for the database
     * bundle.
     * </p>
     *
     * @param ramSizeInGb <p>
     *            The amount of RAM in GB (for example, <code>2.0</code>) for
     *            the database bundle.
     *            </p>
     */
    public void setRamSizeInGb(Float ramSizeInGb) {
        this.ramSizeInGb = ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM in GB (for example, <code>2.0</code>) for the database
     * bundle.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ramSizeInGb <p>
     *            The amount of RAM in GB (for example, <code>2.0</code>) for
     *            the database bundle.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseBundle withRamSizeInGb(Float ramSizeInGb) {
        this.ramSizeInGb = ramSizeInGb;
        return this;
    }

    /**
     * <p>
     * The size of the disk for the database bundle.
     * </p>
     *
     * @return <p>
     *         The size of the disk for the database bundle.
     *         </p>
     */
    public Integer getDiskSizeInGb() {
        return diskSizeInGb;
    }

    /**
     * <p>
     * The size of the disk for the database bundle.
     * </p>
     *
     * @param diskSizeInGb <p>
     *            The size of the disk for the database bundle.
     *            </p>
     */
    public void setDiskSizeInGb(Integer diskSizeInGb) {
        this.diskSizeInGb = diskSizeInGb;
    }

    /**
     * <p>
     * The size of the disk for the database bundle.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskSizeInGb <p>
     *            The size of the disk for the database bundle.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseBundle withDiskSizeInGb(Integer diskSizeInGb) {
        this.diskSizeInGb = diskSizeInGb;
        return this;
    }

    /**
     * <p>
     * The data transfer rate per month in GB for the database bundle.
     * </p>
     *
     * @return <p>
     *         The data transfer rate per month in GB for the database bundle.
     *         </p>
     */
    public Integer getTransferPerMonthInGb() {
        return transferPerMonthInGb;
    }

    /**
     * <p>
     * The data transfer rate per month in GB for the database bundle.
     * </p>
     *
     * @param transferPerMonthInGb <p>
     *            The data transfer rate per month in GB for the database
     *            bundle.
     *            </p>
     */
    public void setTransferPerMonthInGb(Integer transferPerMonthInGb) {
        this.transferPerMonthInGb = transferPerMonthInGb;
    }

    /**
     * <p>
     * The data transfer rate per month in GB for the database bundle.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transferPerMonthInGb <p>
     *            The data transfer rate per month in GB for the database
     *            bundle.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseBundle withTransferPerMonthInGb(Integer transferPerMonthInGb) {
        this.transferPerMonthInGb = transferPerMonthInGb;
        return this;
    }

    /**
     * <p>
     * The number of virtual CPUs (vCPUs) for the database bundle.
     * </p>
     *
     * @return <p>
     *         The number of virtual CPUs (vCPUs) for the database bundle.
     *         </p>
     */
    public Integer getCpuCount() {
        return cpuCount;
    }

    /**
     * <p>
     * The number of virtual CPUs (vCPUs) for the database bundle.
     * </p>
     *
     * @param cpuCount <p>
     *            The number of virtual CPUs (vCPUs) for the database bundle.
     *            </p>
     */
    public void setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
    }

    /**
     * <p>
     * The number of virtual CPUs (vCPUs) for the database bundle.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cpuCount <p>
     *            The number of virtual CPUs (vCPUs) for the database bundle.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseBundle withCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is encrypted.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the database bundle is
     *         encrypted.
     *         </p>
     */
    public Boolean isIsEncrypted() {
        return isEncrypted;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is encrypted.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the database bundle is
     *         encrypted.
     *         </p>
     */
    public Boolean getIsEncrypted() {
        return isEncrypted;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is encrypted.
     * </p>
     *
     * @param isEncrypted <p>
     *            A Boolean value indicating whether the database bundle is
     *            encrypted.
     *            </p>
     */
    public void setIsEncrypted(Boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isEncrypted <p>
     *            A Boolean value indicating whether the database bundle is
     *            encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseBundle withIsEncrypted(Boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is active.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the database bundle is active.
     *         </p>
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is active.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the database bundle is active.
     *         </p>
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is active.
     * </p>
     *
     * @param isActive <p>
     *            A Boolean value indicating whether the database bundle is
     *            active.
     *            </p>
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is active.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isActive <p>
     *            A Boolean value indicating whether the database bundle is
     *            active.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseBundle withIsActive(Boolean isActive) {
        this.isActive = isActive;
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
        if (getBundleId() != null)
            sb.append("bundleId: " + getBundleId() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getPrice() != null)
            sb.append("price: " + getPrice() + ",");
        if (getRamSizeInGb() != null)
            sb.append("ramSizeInGb: " + getRamSizeInGb() + ",");
        if (getDiskSizeInGb() != null)
            sb.append("diskSizeInGb: " + getDiskSizeInGb() + ",");
        if (getTransferPerMonthInGb() != null)
            sb.append("transferPerMonthInGb: " + getTransferPerMonthInGb() + ",");
        if (getCpuCount() != null)
            sb.append("cpuCount: " + getCpuCount() + ",");
        if (getIsEncrypted() != null)
            sb.append("isEncrypted: " + getIsEncrypted() + ",");
        if (getIsActive() != null)
            sb.append("isActive: " + getIsActive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        hashCode = prime * hashCode
                + ((getRamSizeInGb() == null) ? 0 : getRamSizeInGb().hashCode());
        hashCode = prime * hashCode
                + ((getDiskSizeInGb() == null) ? 0 : getDiskSizeInGb().hashCode());
        hashCode = prime * hashCode
                + ((getTransferPerMonthInGb() == null) ? 0 : getTransferPerMonthInGb().hashCode());
        hashCode = prime * hashCode + ((getCpuCount() == null) ? 0 : getCpuCount().hashCode());
        hashCode = prime * hashCode
                + ((getIsEncrypted() == null) ? 0 : getIsEncrypted().hashCode());
        hashCode = prime * hashCode + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationalDatabaseBundle == false)
            return false;
        RelationalDatabaseBundle other = (RelationalDatabaseBundle) obj;

        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPrice() == null ^ this.getPrice() == null)
            return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false)
            return false;
        if (other.getRamSizeInGb() == null ^ this.getRamSizeInGb() == null)
            return false;
        if (other.getRamSizeInGb() != null
                && other.getRamSizeInGb().equals(this.getRamSizeInGb()) == false)
            return false;
        if (other.getDiskSizeInGb() == null ^ this.getDiskSizeInGb() == null)
            return false;
        if (other.getDiskSizeInGb() != null
                && other.getDiskSizeInGb().equals(this.getDiskSizeInGb()) == false)
            return false;
        if (other.getTransferPerMonthInGb() == null ^ this.getTransferPerMonthInGb() == null)
            return false;
        if (other.getTransferPerMonthInGb() != null
                && other.getTransferPerMonthInGb().equals(this.getTransferPerMonthInGb()) == false)
            return false;
        if (other.getCpuCount() == null ^ this.getCpuCount() == null)
            return false;
        if (other.getCpuCount() != null && other.getCpuCount().equals(this.getCpuCount()) == false)
            return false;
        if (other.getIsEncrypted() == null ^ this.getIsEncrypted() == null)
            return false;
        if (other.getIsEncrypted() != null
                && other.getIsEncrypted().equals(this.getIsEncrypted()) == false)
            return false;
        if (other.getIsActive() == null ^ this.getIsActive() == null)
            return false;
        if (other.getIsActive() != null && other.getIsActive().equals(this.getIsActive()) == false)
            return false;
        return true;
    }
}

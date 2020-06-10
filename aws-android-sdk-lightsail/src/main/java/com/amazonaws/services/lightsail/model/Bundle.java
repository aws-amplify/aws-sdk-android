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
 * Describes a bundle, which is a set of specs describing your virtual private
 * server (or <i>instance</i>).
 * </p>
 */
public class Bundle implements Serializable {
    /**
     * <p>
     * The price in US dollars (e.g., <code>5.0</code>) of the bundle.
     * </p>
     */
    private Float price;

    /**
     * <p>
     * The number of vCPUs included in the bundle (e.g., <code>2</code>).
     * </p>
     */
    private Integer cpuCount;

    /**
     * <p>
     * The size of the SSD (e.g., <code>30</code>).
     * </p>
     */
    private Integer diskSizeInGb;

    /**
     * <p>
     * The bundle ID (e.g., <code>micro_1_0</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String bundleId;

    /**
     * <p>
     * The Amazon EC2 instance type (e.g., <code>t2.micro</code>).
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * A Boolean value indicating whether the bundle is active.
     * </p>
     */
    private Boolean isActive;

    /**
     * <p>
     * A friendly name for the bundle (e.g., <code>Micro</code>).
     * </p>
     */
    private String name;

    /**
     * <p>
     * A numeric value that represents the power of the bundle (e.g.,
     * <code>500</code>). You can use the bundle's power value in conjunction
     * with a blueprint's minimum power value to determine whether the blueprint
     * will run on the bundle. For example, you need a bundle with a power value
     * of 500 or more to create an instance that uses a blueprint with a minimum
     * power value of 500.
     * </p>
     */
    private Integer power;

    /**
     * <p>
     * The amount of RAM in GB (e.g., <code>2.0</code>).
     * </p>
     */
    private Float ramSizeInGb;

    /**
     * <p>
     * The data transfer rate per month in GB (e.g., <code>2000</code>).
     * </p>
     */
    private Integer transferPerMonthInGb;

    /**
     * <p>
     * The operating system platform (Linux/Unix-based or Windows Server-based)
     * that the bundle supports. You can only launch a <code>WINDOWS</code>
     * bundle on a blueprint that supports the <code>WINDOWS</code> platform.
     * <code>LINUX_UNIX</code> blueprints require a <code>LINUX_UNIX</code>
     * bundle.
     * </p>
     */
    private java.util.List<String> supportedPlatforms;

    /**
     * <p>
     * The price in US dollars (e.g., <code>5.0</code>) of the bundle.
     * </p>
     *
     * @return <p>
     *         The price in US dollars (e.g., <code>5.0</code>) of the bundle.
     *         </p>
     */
    public Float getPrice() {
        return price;
    }

    /**
     * <p>
     * The price in US dollars (e.g., <code>5.0</code>) of the bundle.
     * </p>
     *
     * @param price <p>
     *            The price in US dollars (e.g., <code>5.0</code>) of the
     *            bundle.
     *            </p>
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * <p>
     * The price in US dollars (e.g., <code>5.0</code>) of the bundle.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param price <p>
     *            The price in US dollars (e.g., <code>5.0</code>) of the
     *            bundle.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bundle withPrice(Float price) {
        this.price = price;
        return this;
    }

    /**
     * <p>
     * The number of vCPUs included in the bundle (e.g., <code>2</code>).
     * </p>
     *
     * @return <p>
     *         The number of vCPUs included in the bundle (e.g., <code>2</code>
     *         ).
     *         </p>
     */
    public Integer getCpuCount() {
        return cpuCount;
    }

    /**
     * <p>
     * The number of vCPUs included in the bundle (e.g., <code>2</code>).
     * </p>
     *
     * @param cpuCount <p>
     *            The number of vCPUs included in the bundle (e.g.,
     *            <code>2</code>).
     *            </p>
     */
    public void setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
    }

    /**
     * <p>
     * The number of vCPUs included in the bundle (e.g., <code>2</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cpuCount <p>
     *            The number of vCPUs included in the bundle (e.g.,
     *            <code>2</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bundle withCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    /**
     * <p>
     * The size of the SSD (e.g., <code>30</code>).
     * </p>
     *
     * @return <p>
     *         The size of the SSD (e.g., <code>30</code>).
     *         </p>
     */
    public Integer getDiskSizeInGb() {
        return diskSizeInGb;
    }

    /**
     * <p>
     * The size of the SSD (e.g., <code>30</code>).
     * </p>
     *
     * @param diskSizeInGb <p>
     *            The size of the SSD (e.g., <code>30</code>).
     *            </p>
     */
    public void setDiskSizeInGb(Integer diskSizeInGb) {
        this.diskSizeInGb = diskSizeInGb;
    }

    /**
     * <p>
     * The size of the SSD (e.g., <code>30</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskSizeInGb <p>
     *            The size of the SSD (e.g., <code>30</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bundle withDiskSizeInGb(Integer diskSizeInGb) {
        this.diskSizeInGb = diskSizeInGb;
        return this;
    }

    /**
     * <p>
     * The bundle ID (e.g., <code>micro_1_0</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The bundle ID (e.g., <code>micro_1_0</code>).
     *         </p>
     */
    public String getBundleId() {
        return bundleId;
    }

    /**
     * <p>
     * The bundle ID (e.g., <code>micro_1_0</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param bundleId <p>
     *            The bundle ID (e.g., <code>micro_1_0</code>).
     *            </p>
     */
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The bundle ID (e.g., <code>micro_1_0</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param bundleId <p>
     *            The bundle ID (e.g., <code>micro_1_0</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bundle withBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance type (e.g., <code>t2.micro</code>).
     * </p>
     *
     * @return <p>
     *         The Amazon EC2 instance type (e.g., <code>t2.micro</code>).
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The Amazon EC2 instance type (e.g., <code>t2.micro</code>).
     * </p>
     *
     * @param instanceType <p>
     *            The Amazon EC2 instance type (e.g., <code>t2.micro</code>).
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The Amazon EC2 instance type (e.g., <code>t2.micro</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceType <p>
     *            The Amazon EC2 instance type (e.g., <code>t2.micro</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bundle withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the bundle is active.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the bundle is active.
     *         </p>
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * <p>
     * A Boolean value indicating whether the bundle is active.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the bundle is active.
     *         </p>
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * <p>
     * A Boolean value indicating whether the bundle is active.
     * </p>
     *
     * @param isActive <p>
     *            A Boolean value indicating whether the bundle is active.
     *            </p>
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * <p>
     * A Boolean value indicating whether the bundle is active.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isActive <p>
     *            A Boolean value indicating whether the bundle is active.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bundle withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * <p>
     * A friendly name for the bundle (e.g., <code>Micro</code>).
     * </p>
     *
     * @return <p>
     *         A friendly name for the bundle (e.g., <code>Micro</code>).
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A friendly name for the bundle (e.g., <code>Micro</code>).
     * </p>
     *
     * @param name <p>
     *            A friendly name for the bundle (e.g., <code>Micro</code>).
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name for the bundle (e.g., <code>Micro</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            A friendly name for the bundle (e.g., <code>Micro</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bundle withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A numeric value that represents the power of the bundle (e.g.,
     * <code>500</code>). You can use the bundle's power value in conjunction
     * with a blueprint's minimum power value to determine whether the blueprint
     * will run on the bundle. For example, you need a bundle with a power value
     * of 500 or more to create an instance that uses a blueprint with a minimum
     * power value of 500.
     * </p>
     *
     * @return <p>
     *         A numeric value that represents the power of the bundle (e.g.,
     *         <code>500</code>). You can use the bundle's power value in
     *         conjunction with a blueprint's minimum power value to determine
     *         whether the blueprint will run on the bundle. For example, you
     *         need a bundle with a power value of 500 or more to create an
     *         instance that uses a blueprint with a minimum power value of 500.
     *         </p>
     */
    public Integer getPower() {
        return power;
    }

    /**
     * <p>
     * A numeric value that represents the power of the bundle (e.g.,
     * <code>500</code>). You can use the bundle's power value in conjunction
     * with a blueprint's minimum power value to determine whether the blueprint
     * will run on the bundle. For example, you need a bundle with a power value
     * of 500 or more to create an instance that uses a blueprint with a minimum
     * power value of 500.
     * </p>
     *
     * @param power <p>
     *            A numeric value that represents the power of the bundle (e.g.,
     *            <code>500</code>). You can use the bundle's power value in
     *            conjunction with a blueprint's minimum power value to
     *            determine whether the blueprint will run on the bundle. For
     *            example, you need a bundle with a power value of 500 or more
     *            to create an instance that uses a blueprint with a minimum
     *            power value of 500.
     *            </p>
     */
    public void setPower(Integer power) {
        this.power = power;
    }

    /**
     * <p>
     * A numeric value that represents the power of the bundle (e.g.,
     * <code>500</code>). You can use the bundle's power value in conjunction
     * with a blueprint's minimum power value to determine whether the blueprint
     * will run on the bundle. For example, you need a bundle with a power value
     * of 500 or more to create an instance that uses a blueprint with a minimum
     * power value of 500.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param power <p>
     *            A numeric value that represents the power of the bundle (e.g.,
     *            <code>500</code>). You can use the bundle's power value in
     *            conjunction with a blueprint's minimum power value to
     *            determine whether the blueprint will run on the bundle. For
     *            example, you need a bundle with a power value of 500 or more
     *            to create an instance that uses a blueprint with a minimum
     *            power value of 500.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bundle withPower(Integer power) {
        this.power = power;
        return this;
    }

    /**
     * <p>
     * The amount of RAM in GB (e.g., <code>2.0</code>).
     * </p>
     *
     * @return <p>
     *         The amount of RAM in GB (e.g., <code>2.0</code>).
     *         </p>
     */
    public Float getRamSizeInGb() {
        return ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM in GB (e.g., <code>2.0</code>).
     * </p>
     *
     * @param ramSizeInGb <p>
     *            The amount of RAM in GB (e.g., <code>2.0</code>).
     *            </p>
     */
    public void setRamSizeInGb(Float ramSizeInGb) {
        this.ramSizeInGb = ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM in GB (e.g., <code>2.0</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ramSizeInGb <p>
     *            The amount of RAM in GB (e.g., <code>2.0</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bundle withRamSizeInGb(Float ramSizeInGb) {
        this.ramSizeInGb = ramSizeInGb;
        return this;
    }

    /**
     * <p>
     * The data transfer rate per month in GB (e.g., <code>2000</code>).
     * </p>
     *
     * @return <p>
     *         The data transfer rate per month in GB (e.g., <code>2000</code>).
     *         </p>
     */
    public Integer getTransferPerMonthInGb() {
        return transferPerMonthInGb;
    }

    /**
     * <p>
     * The data transfer rate per month in GB (e.g., <code>2000</code>).
     * </p>
     *
     * @param transferPerMonthInGb <p>
     *            The data transfer rate per month in GB (e.g.,
     *            <code>2000</code>).
     *            </p>
     */
    public void setTransferPerMonthInGb(Integer transferPerMonthInGb) {
        this.transferPerMonthInGb = transferPerMonthInGb;
    }

    /**
     * <p>
     * The data transfer rate per month in GB (e.g., <code>2000</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transferPerMonthInGb <p>
     *            The data transfer rate per month in GB (e.g.,
     *            <code>2000</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bundle withTransferPerMonthInGb(Integer transferPerMonthInGb) {
        this.transferPerMonthInGb = transferPerMonthInGb;
        return this;
    }

    /**
     * <p>
     * The operating system platform (Linux/Unix-based or Windows Server-based)
     * that the bundle supports. You can only launch a <code>WINDOWS</code>
     * bundle on a blueprint that supports the <code>WINDOWS</code> platform.
     * <code>LINUX_UNIX</code> blueprints require a <code>LINUX_UNIX</code>
     * bundle.
     * </p>
     *
     * @return <p>
     *         The operating system platform (Linux/Unix-based or Windows
     *         Server-based) that the bundle supports. You can only launch a
     *         <code>WINDOWS</code> bundle on a blueprint that supports the
     *         <code>WINDOWS</code> platform. <code>LINUX_UNIX</code> blueprints
     *         require a <code>LINUX_UNIX</code> bundle.
     *         </p>
     */
    public java.util.List<String> getSupportedPlatforms() {
        return supportedPlatforms;
    }

    /**
     * <p>
     * The operating system platform (Linux/Unix-based or Windows Server-based)
     * that the bundle supports. You can only launch a <code>WINDOWS</code>
     * bundle on a blueprint that supports the <code>WINDOWS</code> platform.
     * <code>LINUX_UNIX</code> blueprints require a <code>LINUX_UNIX</code>
     * bundle.
     * </p>
     *
     * @param supportedPlatforms <p>
     *            The operating system platform (Linux/Unix-based or Windows
     *            Server-based) that the bundle supports. You can only launch a
     *            <code>WINDOWS</code> bundle on a blueprint that supports the
     *            <code>WINDOWS</code> platform. <code>LINUX_UNIX</code>
     *            blueprints require a <code>LINUX_UNIX</code> bundle.
     *            </p>
     */
    public void setSupportedPlatforms(java.util.Collection<String> supportedPlatforms) {
        if (supportedPlatforms == null) {
            this.supportedPlatforms = null;
            return;
        }

        this.supportedPlatforms = new java.util.ArrayList<String>(supportedPlatforms);
    }

    /**
     * <p>
     * The operating system platform (Linux/Unix-based or Windows Server-based)
     * that the bundle supports. You can only launch a <code>WINDOWS</code>
     * bundle on a blueprint that supports the <code>WINDOWS</code> platform.
     * <code>LINUX_UNIX</code> blueprints require a <code>LINUX_UNIX</code>
     * bundle.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedPlatforms <p>
     *            The operating system platform (Linux/Unix-based or Windows
     *            Server-based) that the bundle supports. You can only launch a
     *            <code>WINDOWS</code> bundle on a blueprint that supports the
     *            <code>WINDOWS</code> platform. <code>LINUX_UNIX</code>
     *            blueprints require a <code>LINUX_UNIX</code> bundle.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bundle withSupportedPlatforms(String... supportedPlatforms) {
        if (getSupportedPlatforms() == null) {
            this.supportedPlatforms = new java.util.ArrayList<String>(supportedPlatforms.length);
        }
        for (String value : supportedPlatforms) {
            this.supportedPlatforms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The operating system platform (Linux/Unix-based or Windows Server-based)
     * that the bundle supports. You can only launch a <code>WINDOWS</code>
     * bundle on a blueprint that supports the <code>WINDOWS</code> platform.
     * <code>LINUX_UNIX</code> blueprints require a <code>LINUX_UNIX</code>
     * bundle.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedPlatforms <p>
     *            The operating system platform (Linux/Unix-based or Windows
     *            Server-based) that the bundle supports. You can only launch a
     *            <code>WINDOWS</code> bundle on a blueprint that supports the
     *            <code>WINDOWS</code> platform. <code>LINUX_UNIX</code>
     *            blueprints require a <code>LINUX_UNIX</code> bundle.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bundle withSupportedPlatforms(java.util.Collection<String> supportedPlatforms) {
        setSupportedPlatforms(supportedPlatforms);
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
        if (getPrice() != null)
            sb.append("price: " + getPrice() + ",");
        if (getCpuCount() != null)
            sb.append("cpuCount: " + getCpuCount() + ",");
        if (getDiskSizeInGb() != null)
            sb.append("diskSizeInGb: " + getDiskSizeInGb() + ",");
        if (getBundleId() != null)
            sb.append("bundleId: " + getBundleId() + ",");
        if (getInstanceType() != null)
            sb.append("instanceType: " + getInstanceType() + ",");
        if (getIsActive() != null)
            sb.append("isActive: " + getIsActive() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getPower() != null)
            sb.append("power: " + getPower() + ",");
        if (getRamSizeInGb() != null)
            sb.append("ramSizeInGb: " + getRamSizeInGb() + ",");
        if (getTransferPerMonthInGb() != null)
            sb.append("transferPerMonthInGb: " + getTransferPerMonthInGb() + ",");
        if (getSupportedPlatforms() != null)
            sb.append("supportedPlatforms: " + getSupportedPlatforms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        hashCode = prime * hashCode + ((getCpuCount() == null) ? 0 : getCpuCount().hashCode());
        hashCode = prime * hashCode
                + ((getDiskSizeInGb() == null) ? 0 : getDiskSizeInGb().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPower() == null) ? 0 : getPower().hashCode());
        hashCode = prime * hashCode
                + ((getRamSizeInGb() == null) ? 0 : getRamSizeInGb().hashCode());
        hashCode = prime * hashCode
                + ((getTransferPerMonthInGb() == null) ? 0 : getTransferPerMonthInGb().hashCode());
        hashCode = prime * hashCode
                + ((getSupportedPlatforms() == null) ? 0 : getSupportedPlatforms().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Bundle == false)
            return false;
        Bundle other = (Bundle) obj;

        if (other.getPrice() == null ^ this.getPrice() == null)
            return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false)
            return false;
        if (other.getCpuCount() == null ^ this.getCpuCount() == null)
            return false;
        if (other.getCpuCount() != null && other.getCpuCount().equals(this.getCpuCount()) == false)
            return false;
        if (other.getDiskSizeInGb() == null ^ this.getDiskSizeInGb() == null)
            return false;
        if (other.getDiskSizeInGb() != null
                && other.getDiskSizeInGb().equals(this.getDiskSizeInGb()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getIsActive() == null ^ this.getIsActive() == null)
            return false;
        if (other.getIsActive() != null && other.getIsActive().equals(this.getIsActive()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPower() == null ^ this.getPower() == null)
            return false;
        if (other.getPower() != null && other.getPower().equals(this.getPower()) == false)
            return false;
        if (other.getRamSizeInGb() == null ^ this.getRamSizeInGb() == null)
            return false;
        if (other.getRamSizeInGb() != null
                && other.getRamSizeInGb().equals(this.getRamSizeInGb()) == false)
            return false;
        if (other.getTransferPerMonthInGb() == null ^ this.getTransferPerMonthInGb() == null)
            return false;
        if (other.getTransferPerMonthInGb() != null
                && other.getTransferPerMonthInGb().equals(this.getTransferPerMonthInGb()) == false)
            return false;
        if (other.getSupportedPlatforms() == null ^ this.getSupportedPlatforms() == null)
            return false;
        if (other.getSupportedPlatforms() != null
                && other.getSupportedPlatforms().equals(this.getSupportedPlatforms()) == false)
            return false;
        return true;
    }
}

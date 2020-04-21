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
 * Details on the Amazon EC2 Resource.
 * </p>
 */
public class EC2ResourceDetails implements Serializable {
    /**
     * <p>
     * Hourly public On Demand rate for the instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String hourlyOnDemandRate;

    /**
     * <p>
     * The type of Amazon Web Services instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String instanceType;

    /**
     * <p>
     * The platform of the Amazon Web Services instance. The platform is the
     * specific combination of operating system, license model, and software on
     * an instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String platform;

    /**
     * <p>
     * The Amazon Web Services Region of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String region;

    /**
     * <p>
     * The SKU of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String sku;

    /**
     * <p>
     * Memory capacity of Amazon Web Services instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String memory;

    /**
     * <p>
     * Network performance capacity of the Amazon Web Services instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String networkPerformance;

    /**
     * <p>
     * The disk storage of the Amazon Web Services instance (Not EBS storage).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String storage;

    /**
     * <p>
     * Number of VCPU cores in the Amazon Web Services instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String vcpu;

    /**
     * <p>
     * Hourly public On Demand rate for the instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         Hourly public On Demand rate for the instance type.
     *         </p>
     */
    public String getHourlyOnDemandRate() {
        return hourlyOnDemandRate;
    }

    /**
     * <p>
     * Hourly public On Demand rate for the instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param hourlyOnDemandRate <p>
     *            Hourly public On Demand rate for the instance type.
     *            </p>
     */
    public void setHourlyOnDemandRate(String hourlyOnDemandRate) {
        this.hourlyOnDemandRate = hourlyOnDemandRate;
    }

    /**
     * <p>
     * Hourly public On Demand rate for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param hourlyOnDemandRate <p>
     *            Hourly public On Demand rate for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2ResourceDetails withHourlyOnDemandRate(String hourlyOnDemandRate) {
        this.hourlyOnDemandRate = hourlyOnDemandRate;
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The type of Amazon Web Services instance.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param instanceType <p>
     *            The type of Amazon Web Services instance.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param instanceType <p>
     *            The type of Amazon Web Services instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2ResourceDetails withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The platform of the Amazon Web Services instance. The platform is the
     * specific combination of operating system, license model, and software on
     * an instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The platform of the Amazon Web Services instance. The platform is
     *         the specific combination of operating system, license model, and
     *         software on an instance.
     *         </p>
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The platform of the Amazon Web Services instance. The platform is the
     * specific combination of operating system, license model, and software on
     * an instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param platform <p>
     *            The platform of the Amazon Web Services instance. The platform
     *            is the specific combination of operating system, license
     *            model, and software on an instance.
     *            </p>
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the Amazon Web Services instance. The platform is the
     * specific combination of operating system, license model, and software on
     * an instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param platform <p>
     *            The platform of the Amazon Web Services instance. The platform
     *            is the specific combination of operating system, license
     *            model, and software on an instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2ResourceDetails withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The Amazon Web Services Region of the instance.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param region <p>
     *            The Amazon Web Services Region of the instance.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param region <p>
     *            The Amazon Web Services Region of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2ResourceDetails withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The SKU of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The SKU of the product.
     *         </p>
     */
    public String getSku() {
        return sku;
    }

    /**
     * <p>
     * The SKU of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param sku <p>
     *            The SKU of the product.
     *            </p>
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * <p>
     * The SKU of the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param sku <p>
     *            The SKU of the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2ResourceDetails withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * <p>
     * Memory capacity of Amazon Web Services instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         Memory capacity of Amazon Web Services instance.
     *         </p>
     */
    public String getMemory() {
        return memory;
    }

    /**
     * <p>
     * Memory capacity of Amazon Web Services instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param memory <p>
     *            Memory capacity of Amazon Web Services instance.
     *            </p>
     */
    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * Memory capacity of Amazon Web Services instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param memory <p>
     *            Memory capacity of Amazon Web Services instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2ResourceDetails withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * <p>
     * Network performance capacity of the Amazon Web Services instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         Network performance capacity of the Amazon Web Services instance.
     *         </p>
     */
    public String getNetworkPerformance() {
        return networkPerformance;
    }

    /**
     * <p>
     * Network performance capacity of the Amazon Web Services instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param networkPerformance <p>
     *            Network performance capacity of the Amazon Web Services
     *            instance.
     *            </p>
     */
    public void setNetworkPerformance(String networkPerformance) {
        this.networkPerformance = networkPerformance;
    }

    /**
     * <p>
     * Network performance capacity of the Amazon Web Services instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param networkPerformance <p>
     *            Network performance capacity of the Amazon Web Services
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2ResourceDetails withNetworkPerformance(String networkPerformance) {
        this.networkPerformance = networkPerformance;
        return this;
    }

    /**
     * <p>
     * The disk storage of the Amazon Web Services instance (Not EBS storage).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The disk storage of the Amazon Web Services instance (Not EBS
     *         storage).
     *         </p>
     */
    public String getStorage() {
        return storage;
    }

    /**
     * <p>
     * The disk storage of the Amazon Web Services instance (Not EBS storage).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param storage <p>
     *            The disk storage of the Amazon Web Services instance (Not EBS
     *            storage).
     *            </p>
     */
    public void setStorage(String storage) {
        this.storage = storage;
    }

    /**
     * <p>
     * The disk storage of the Amazon Web Services instance (Not EBS storage).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param storage <p>
     *            The disk storage of the Amazon Web Services instance (Not EBS
     *            storage).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2ResourceDetails withStorage(String storage) {
        this.storage = storage;
        return this;
    }

    /**
     * <p>
     * Number of VCPU cores in the Amazon Web Services instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         Number of VCPU cores in the Amazon Web Services instance type.
     *         </p>
     */
    public String getVcpu() {
        return vcpu;
    }

    /**
     * <p>
     * Number of VCPU cores in the Amazon Web Services instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param vcpu <p>
     *            Number of VCPU cores in the Amazon Web Services instance type.
     *            </p>
     */
    public void setVcpu(String vcpu) {
        this.vcpu = vcpu;
    }

    /**
     * <p>
     * Number of VCPU cores in the Amazon Web Services instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param vcpu <p>
     *            Number of VCPU cores in the Amazon Web Services instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2ResourceDetails withVcpu(String vcpu) {
        this.vcpu = vcpu;
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
        if (getHourlyOnDemandRate() != null)
            sb.append("HourlyOnDemandRate: " + getHourlyOnDemandRate() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getSku() != null)
            sb.append("Sku: " + getSku() + ",");
        if (getMemory() != null)
            sb.append("Memory: " + getMemory() + ",");
        if (getNetworkPerformance() != null)
            sb.append("NetworkPerformance: " + getNetworkPerformance() + ",");
        if (getStorage() != null)
            sb.append("Storage: " + getStorage() + ",");
        if (getVcpu() != null)
            sb.append("Vcpu: " + getVcpu());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHourlyOnDemandRate() == null) ? 0 : getHourlyOnDemandRate().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getSku() == null) ? 0 : getSku().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkPerformance() == null) ? 0 : getNetworkPerformance().hashCode());
        hashCode = prime * hashCode + ((getStorage() == null) ? 0 : getStorage().hashCode());
        hashCode = prime * hashCode + ((getVcpu() == null) ? 0 : getVcpu().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2ResourceDetails == false)
            return false;
        EC2ResourceDetails other = (EC2ResourceDetails) obj;

        if (other.getHourlyOnDemandRate() == null ^ this.getHourlyOnDemandRate() == null)
            return false;
        if (other.getHourlyOnDemandRate() != null
                && other.getHourlyOnDemandRate().equals(this.getHourlyOnDemandRate()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getSku() == null ^ this.getSku() == null)
            return false;
        if (other.getSku() != null && other.getSku().equals(this.getSku()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getNetworkPerformance() == null ^ this.getNetworkPerformance() == null)
            return false;
        if (other.getNetworkPerformance() != null
                && other.getNetworkPerformance().equals(this.getNetworkPerformance()) == false)
            return false;
        if (other.getStorage() == null ^ this.getStorage() == null)
            return false;
        if (other.getStorage() != null && other.getStorage().equals(this.getStorage()) == false)
            return false;
        if (other.getVcpu() == null ^ this.getVcpu() == null)
            return false;
        if (other.getVcpu() != null && other.getVcpu().equals(this.getVcpu()) == false)
            return false;
        return true;
    }
}

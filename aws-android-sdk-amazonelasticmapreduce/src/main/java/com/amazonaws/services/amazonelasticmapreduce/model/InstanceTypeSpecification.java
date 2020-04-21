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
 * The configuration specification for each instance type in an instance fleet.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions
 * 4.8.0 and later, excluding 5.0.x versions.
 * </p>
 * </note>
 */
public class InstanceTypeSpecification implements Serializable {
    /**
     * <p>
     * The EC2 instance type, for example <code>m3.xlarge</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String instanceType;

    /**
     * <p>
     * The number of units that a provisioned instance of this type provides
     * toward fulfilling the target capacities defined in
     * <a>InstanceFleetConfig</a>. Capacity values represent performance
     * characteristics such as vCPUs, memory, or I/O. If not specified, the
     * default value is 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer weightedCapacity;

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by
     * <code>InstanceType</code>. Expressed in USD.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String bidPrice;

    /**
     * <p>
     * The bid price, as a percentage of On-Demand price, for each EC2 Spot
     * instance as defined by <code>InstanceType</code>. Expressed as a number
     * (for example, 20 specifies 20%).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double bidPriceAsPercentageOfOnDemandPrice;

    /**
     * <p>
     * A configuration classification that applies when provisioning cluster
     * instances, which can include configurations for applications and software
     * bundled with Amazon EMR.
     * </p>
     */
    private java.util.List<Configuration> configurations;

    /**
     * <p>
     * The configuration of Amazon Elastic Block Storage (EBS) attached to each
     * instance as defined by <code>InstanceType</code>.
     * </p>
     */
    private java.util.List<EbsBlockDevice> ebsBlockDevices;

    /**
     * <p>
     * Evaluates to <code>TRUE</code> when the specified
     * <code>InstanceType</code> is EBS-optimized.
     * </p>
     */
    private Boolean ebsOptimized;

    /**
     * <p>
     * The EC2 instance type, for example <code>m3.xlarge</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The EC2 instance type, for example <code>m3.xlarge</code>.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The EC2 instance type, for example <code>m3.xlarge</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceType <p>
     *            The EC2 instance type, for example <code>m3.xlarge</code>.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The EC2 instance type, for example <code>m3.xlarge</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceType <p>
     *            The EC2 instance type, for example <code>m3.xlarge</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeSpecification withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The number of units that a provisioned instance of this type provides
     * toward fulfilling the target capacities defined in
     * <a>InstanceFleetConfig</a>. Capacity values represent performance
     * characteristics such as vCPUs, memory, or I/O. If not specified, the
     * default value is 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of units that a provisioned instance of this type
     *         provides toward fulfilling the target capacities defined in
     *         <a>InstanceFleetConfig</a>. Capacity values represent performance
     *         characteristics such as vCPUs, memory, or I/O. If not specified,
     *         the default value is 1.
     *         </p>
     */
    public Integer getWeightedCapacity() {
        return weightedCapacity;
    }

    /**
     * <p>
     * The number of units that a provisioned instance of this type provides
     * toward fulfilling the target capacities defined in
     * <a>InstanceFleetConfig</a>. Capacity values represent performance
     * characteristics such as vCPUs, memory, or I/O. If not specified, the
     * default value is 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param weightedCapacity <p>
     *            The number of units that a provisioned instance of this type
     *            provides toward fulfilling the target capacities defined in
     *            <a>InstanceFleetConfig</a>. Capacity values represent
     *            performance characteristics such as vCPUs, memory, or I/O. If
     *            not specified, the default value is 1.
     *            </p>
     */
    public void setWeightedCapacity(Integer weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    /**
     * <p>
     * The number of units that a provisioned instance of this type provides
     * toward fulfilling the target capacities defined in
     * <a>InstanceFleetConfig</a>. Capacity values represent performance
     * characteristics such as vCPUs, memory, or I/O. If not specified, the
     * default value is 1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param weightedCapacity <p>
     *            The number of units that a provisioned instance of this type
     *            provides toward fulfilling the target capacities defined in
     *            <a>InstanceFleetConfig</a>. Capacity values represent
     *            performance characteristics such as vCPUs, memory, or I/O. If
     *            not specified, the default value is 1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeSpecification withWeightedCapacity(Integer weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
        return this;
    }

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by
     * <code>InstanceType</code>. Expressed in USD.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The bid price for each EC2 Spot instance type as defined by
     *         <code>InstanceType</code>. Expressed in USD.
     *         </p>
     */
    public String getBidPrice() {
        return bidPrice;
    }

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by
     * <code>InstanceType</code>. Expressed in USD.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param bidPrice <p>
     *            The bid price for each EC2 Spot instance type as defined by
     *            <code>InstanceType</code>. Expressed in USD.
     *            </p>
     */
    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by
     * <code>InstanceType</code>. Expressed in USD.
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
     * @param bidPrice <p>
     *            The bid price for each EC2 Spot instance type as defined by
     *            <code>InstanceType</code>. Expressed in USD.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeSpecification withBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    /**
     * <p>
     * The bid price, as a percentage of On-Demand price, for each EC2 Spot
     * instance as defined by <code>InstanceType</code>. Expressed as a number
     * (for example, 20 specifies 20%).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The bid price, as a percentage of On-Demand price, for each EC2
     *         Spot instance as defined by <code>InstanceType</code>. Expressed
     *         as a number (for example, 20 specifies 20%).
     *         </p>
     */
    public Double getBidPriceAsPercentageOfOnDemandPrice() {
        return bidPriceAsPercentageOfOnDemandPrice;
    }

    /**
     * <p>
     * The bid price, as a percentage of On-Demand price, for each EC2 Spot
     * instance as defined by <code>InstanceType</code>. Expressed as a number
     * (for example, 20 specifies 20%).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param bidPriceAsPercentageOfOnDemandPrice <p>
     *            The bid price, as a percentage of On-Demand price, for each
     *            EC2 Spot instance as defined by <code>InstanceType</code>.
     *            Expressed as a number (for example, 20 specifies 20%).
     *            </p>
     */
    public void setBidPriceAsPercentageOfOnDemandPrice(Double bidPriceAsPercentageOfOnDemandPrice) {
        this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
    }

    /**
     * <p>
     * The bid price, as a percentage of On-Demand price, for each EC2 Spot
     * instance as defined by <code>InstanceType</code>. Expressed as a number
     * (for example, 20 specifies 20%).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param bidPriceAsPercentageOfOnDemandPrice <p>
     *            The bid price, as a percentage of On-Demand price, for each
     *            EC2 Spot instance as defined by <code>InstanceType</code>.
     *            Expressed as a number (for example, 20 specifies 20%).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeSpecification withBidPriceAsPercentageOfOnDemandPrice(
            Double bidPriceAsPercentageOfOnDemandPrice) {
        this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
        return this;
    }

    /**
     * <p>
     * A configuration classification that applies when provisioning cluster
     * instances, which can include configurations for applications and software
     * bundled with Amazon EMR.
     * </p>
     *
     * @return <p>
     *         A configuration classification that applies when provisioning
     *         cluster instances, which can include configurations for
     *         applications and software bundled with Amazon EMR.
     *         </p>
     */
    public java.util.List<Configuration> getConfigurations() {
        return configurations;
    }

    /**
     * <p>
     * A configuration classification that applies when provisioning cluster
     * instances, which can include configurations for applications and software
     * bundled with Amazon EMR.
     * </p>
     *
     * @param configurations <p>
     *            A configuration classification that applies when provisioning
     *            cluster instances, which can include configurations for
     *            applications and software bundled with Amazon EMR.
     *            </p>
     */
    public void setConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new java.util.ArrayList<Configuration>(configurations);
    }

    /**
     * <p>
     * A configuration classification that applies when provisioning cluster
     * instances, which can include configurations for applications and software
     * bundled with Amazon EMR.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurations <p>
     *            A configuration classification that applies when provisioning
     *            cluster instances, which can include configurations for
     *            applications and software bundled with Amazon EMR.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeSpecification withConfigurations(Configuration... configurations) {
        if (getConfigurations() == null) {
            this.configurations = new java.util.ArrayList<Configuration>(configurations.length);
        }
        for (Configuration value : configurations) {
            this.configurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A configuration classification that applies when provisioning cluster
     * instances, which can include configurations for applications and software
     * bundled with Amazon EMR.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurations <p>
     *            A configuration classification that applies when provisioning
     *            cluster instances, which can include configurations for
     *            applications and software bundled with Amazon EMR.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeSpecification withConfigurations(
            java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * <p>
     * The configuration of Amazon Elastic Block Storage (EBS) attached to each
     * instance as defined by <code>InstanceType</code>.
     * </p>
     *
     * @return <p>
     *         The configuration of Amazon Elastic Block Storage (EBS) attached
     *         to each instance as defined by <code>InstanceType</code>.
     *         </p>
     */
    public java.util.List<EbsBlockDevice> getEbsBlockDevices() {
        return ebsBlockDevices;
    }

    /**
     * <p>
     * The configuration of Amazon Elastic Block Storage (EBS) attached to each
     * instance as defined by <code>InstanceType</code>.
     * </p>
     *
     * @param ebsBlockDevices <p>
     *            The configuration of Amazon Elastic Block Storage (EBS)
     *            attached to each instance as defined by
     *            <code>InstanceType</code>.
     *            </p>
     */
    public void setEbsBlockDevices(java.util.Collection<EbsBlockDevice> ebsBlockDevices) {
        if (ebsBlockDevices == null) {
            this.ebsBlockDevices = null;
            return;
        }

        this.ebsBlockDevices = new java.util.ArrayList<EbsBlockDevice>(ebsBlockDevices);
    }

    /**
     * <p>
     * The configuration of Amazon Elastic Block Storage (EBS) attached to each
     * instance as defined by <code>InstanceType</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsBlockDevices <p>
     *            The configuration of Amazon Elastic Block Storage (EBS)
     *            attached to each instance as defined by
     *            <code>InstanceType</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeSpecification withEbsBlockDevices(EbsBlockDevice... ebsBlockDevices) {
        if (getEbsBlockDevices() == null) {
            this.ebsBlockDevices = new java.util.ArrayList<EbsBlockDevice>(ebsBlockDevices.length);
        }
        for (EbsBlockDevice value : ebsBlockDevices) {
            this.ebsBlockDevices.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The configuration of Amazon Elastic Block Storage (EBS) attached to each
     * instance as defined by <code>InstanceType</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsBlockDevices <p>
     *            The configuration of Amazon Elastic Block Storage (EBS)
     *            attached to each instance as defined by
     *            <code>InstanceType</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeSpecification withEbsBlockDevices(
            java.util.Collection<EbsBlockDevice> ebsBlockDevices) {
        setEbsBlockDevices(ebsBlockDevices);
        return this;
    }

    /**
     * <p>
     * Evaluates to <code>TRUE</code> when the specified
     * <code>InstanceType</code> is EBS-optimized.
     * </p>
     *
     * @return <p>
     *         Evaluates to <code>TRUE</code> when the specified
     *         <code>InstanceType</code> is EBS-optimized.
     *         </p>
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * <p>
     * Evaluates to <code>TRUE</code> when the specified
     * <code>InstanceType</code> is EBS-optimized.
     * </p>
     *
     * @return <p>
     *         Evaluates to <code>TRUE</code> when the specified
     *         <code>InstanceType</code> is EBS-optimized.
     *         </p>
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * <p>
     * Evaluates to <code>TRUE</code> when the specified
     * <code>InstanceType</code> is EBS-optimized.
     * </p>
     *
     * @param ebsOptimized <p>
     *            Evaluates to <code>TRUE</code> when the specified
     *            <code>InstanceType</code> is EBS-optimized.
     *            </p>
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Evaluates to <code>TRUE</code> when the specified
     * <code>InstanceType</code> is EBS-optimized.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsOptimized <p>
     *            Evaluates to <code>TRUE</code> when the specified
     *            <code>InstanceType</code> is EBS-optimized.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeSpecification withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
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
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getWeightedCapacity() != null)
            sb.append("WeightedCapacity: " + getWeightedCapacity() + ",");
        if (getBidPrice() != null)
            sb.append("BidPrice: " + getBidPrice() + ",");
        if (getBidPriceAsPercentageOfOnDemandPrice() != null)
            sb.append("BidPriceAsPercentageOfOnDemandPrice: "
                    + getBidPriceAsPercentageOfOnDemandPrice() + ",");
        if (getConfigurations() != null)
            sb.append("Configurations: " + getConfigurations() + ",");
        if (getEbsBlockDevices() != null)
            sb.append("EbsBlockDevices: " + getEbsBlockDevices() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getWeightedCapacity() == null) ? 0 : getWeightedCapacity().hashCode());
        hashCode = prime * hashCode + ((getBidPrice() == null) ? 0 : getBidPrice().hashCode());
        hashCode = prime
                * hashCode
                + ((getBidPriceAsPercentageOfOnDemandPrice() == null) ? 0
                        : getBidPriceAsPercentageOfOnDemandPrice().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        hashCode = prime * hashCode
                + ((getEbsBlockDevices() == null) ? 0 : getEbsBlockDevices().hashCode());
        hashCode = prime * hashCode
                + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceTypeSpecification == false)
            return false;
        InstanceTypeSpecification other = (InstanceTypeSpecification) obj;

        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getWeightedCapacity() == null ^ this.getWeightedCapacity() == null)
            return false;
        if (other.getWeightedCapacity() != null
                && other.getWeightedCapacity().equals(this.getWeightedCapacity()) == false)
            return false;
        if (other.getBidPrice() == null ^ this.getBidPrice() == null)
            return false;
        if (other.getBidPrice() != null && other.getBidPrice().equals(this.getBidPrice()) == false)
            return false;
        if (other.getBidPriceAsPercentageOfOnDemandPrice() == null
                ^ this.getBidPriceAsPercentageOfOnDemandPrice() == null)
            return false;
        if (other.getBidPriceAsPercentageOfOnDemandPrice() != null
                && other.getBidPriceAsPercentageOfOnDemandPrice().equals(
                        this.getBidPriceAsPercentageOfOnDemandPrice()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null
                && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        if (other.getEbsBlockDevices() == null ^ this.getEbsBlockDevices() == null)
            return false;
        if (other.getEbsBlockDevices() != null
                && other.getEbsBlockDevices().equals(this.getEbsBlockDevices()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null
                && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        return true;
    }
}

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
 * An instance type configuration for each instance type in an instance fleet,
 * which determines the EC2 instances Amazon EMR attempts to provision to
 * fulfill On-Demand and Spot target capacities. There can be a maximum of 5
 * instance type configurations in a fleet.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions
 * 4.8.0 and later, excluding 5.0.x versions.
 * </p>
 * </note>
 */
public class InstanceTypeConfig implements Serializable {
    /**
     * <p>
     * An EC2 instance type, such as <code>m3.xlarge</code>.
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
     * <a>InstanceFleetConfig</a>. This value is 1 for a master instance fleet,
     * and must be 1 or greater for core and task instance fleets. Defaults to 1
     * if not specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer weightedCapacity;

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by
     * <code>InstanceType</code>. Expressed in USD. If neither
     * <code>BidPrice</code> nor
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
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
     * (for example, 20 specifies 20%). If neither <code>BidPrice</code> nor
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double bidPriceAsPercentageOfOnDemandPrice;

    /**
     * <p>
     * The configuration of Amazon Elastic Block Storage (EBS) attached to each
     * instance as defined by <code>InstanceType</code>.
     * </p>
     */
    private EbsConfiguration ebsConfiguration;

    /**
     * <p>
     * A configuration classification that applies when provisioning cluster
     * instances, which can include configurations for applications and software
     * that run on the cluster.
     * </p>
     */
    private java.util.List<Configuration> configurations;

    /**
     * <p>
     * An EC2 instance type, such as <code>m3.xlarge</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         An EC2 instance type, such as <code>m3.xlarge</code>.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * An EC2 instance type, such as <code>m3.xlarge</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceType <p>
     *            An EC2 instance type, such as <code>m3.xlarge</code>.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * An EC2 instance type, such as <code>m3.xlarge</code>.
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
     *            An EC2 instance type, such as <code>m3.xlarge</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeConfig withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The number of units that a provisioned instance of this type provides
     * toward fulfilling the target capacities defined in
     * <a>InstanceFleetConfig</a>. This value is 1 for a master instance fleet,
     * and must be 1 or greater for core and task instance fleets. Defaults to 1
     * if not specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of units that a provisioned instance of this type
     *         provides toward fulfilling the target capacities defined in
     *         <a>InstanceFleetConfig</a>. This value is 1 for a master instance
     *         fleet, and must be 1 or greater for core and task instance
     *         fleets. Defaults to 1 if not specified.
     *         </p>
     */
    public Integer getWeightedCapacity() {
        return weightedCapacity;
    }

    /**
     * <p>
     * The number of units that a provisioned instance of this type provides
     * toward fulfilling the target capacities defined in
     * <a>InstanceFleetConfig</a>. This value is 1 for a master instance fleet,
     * and must be 1 or greater for core and task instance fleets. Defaults to 1
     * if not specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param weightedCapacity <p>
     *            The number of units that a provisioned instance of this type
     *            provides toward fulfilling the target capacities defined in
     *            <a>InstanceFleetConfig</a>. This value is 1 for a master
     *            instance fleet, and must be 1 or greater for core and task
     *            instance fleets. Defaults to 1 if not specified.
     *            </p>
     */
    public void setWeightedCapacity(Integer weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    /**
     * <p>
     * The number of units that a provisioned instance of this type provides
     * toward fulfilling the target capacities defined in
     * <a>InstanceFleetConfig</a>. This value is 1 for a master instance fleet,
     * and must be 1 or greater for core and task instance fleets. Defaults to 1
     * if not specified.
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
     *            <a>InstanceFleetConfig</a>. This value is 1 for a master
     *            instance fleet, and must be 1 or greater for core and task
     *            instance fleets. Defaults to 1 if not specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeConfig withWeightedCapacity(Integer weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
        return this;
    }

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by
     * <code>InstanceType</code>. Expressed in USD. If neither
     * <code>BidPrice</code> nor
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The bid price for each EC2 Spot instance type as defined by
     *         <code>InstanceType</code>. Expressed in USD. If neither
     *         <code>BidPrice</code> nor
     *         <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     *         <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to
     *         100%.
     *         </p>
     */
    public String getBidPrice() {
        return bidPrice;
    }

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by
     * <code>InstanceType</code>. Expressed in USD. If neither
     * <code>BidPrice</code> nor
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param bidPrice <p>
     *            The bid price for each EC2 Spot instance type as defined by
     *            <code>InstanceType</code>. Expressed in USD. If neither
     *            <code>BidPrice</code> nor
     *            <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     *            <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to
     *            100%.
     *            </p>
     */
    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by
     * <code>InstanceType</code>. Expressed in USD. If neither
     * <code>BidPrice</code> nor
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
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
     *            <code>InstanceType</code>. Expressed in USD. If neither
     *            <code>BidPrice</code> nor
     *            <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     *            <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to
     *            100%.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeConfig withBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    /**
     * <p>
     * The bid price, as a percentage of On-Demand price, for each EC2 Spot
     * instance as defined by <code>InstanceType</code>. Expressed as a number
     * (for example, 20 specifies 20%). If neither <code>BidPrice</code> nor
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The bid price, as a percentage of On-Demand price, for each EC2
     *         Spot instance as defined by <code>InstanceType</code>. Expressed
     *         as a number (for example, 20 specifies 20%). If neither
     *         <code>BidPrice</code> nor
     *         <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     *         <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to
     *         100%.
     *         </p>
     */
    public Double getBidPriceAsPercentageOfOnDemandPrice() {
        return bidPriceAsPercentageOfOnDemandPrice;
    }

    /**
     * <p>
     * The bid price, as a percentage of On-Demand price, for each EC2 Spot
     * instance as defined by <code>InstanceType</code>. Expressed as a number
     * (for example, 20 specifies 20%). If neither <code>BidPrice</code> nor
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param bidPriceAsPercentageOfOnDemandPrice <p>
     *            The bid price, as a percentage of On-Demand price, for each
     *            EC2 Spot instance as defined by <code>InstanceType</code>.
     *            Expressed as a number (for example, 20 specifies 20%). If
     *            neither <code>BidPrice</code> nor
     *            <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     *            <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to
     *            100%.
     *            </p>
     */
    public void setBidPriceAsPercentageOfOnDemandPrice(Double bidPriceAsPercentageOfOnDemandPrice) {
        this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
    }

    /**
     * <p>
     * The bid price, as a percentage of On-Demand price, for each EC2 Spot
     * instance as defined by <code>InstanceType</code>. Expressed as a number
     * (for example, 20 specifies 20%). If neither <code>BidPrice</code> nor
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
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
     *            Expressed as a number (for example, 20 specifies 20%). If
     *            neither <code>BidPrice</code> nor
     *            <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     *            <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to
     *            100%.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeConfig withBidPriceAsPercentageOfOnDemandPrice(
            Double bidPriceAsPercentageOfOnDemandPrice) {
        this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
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
    public EbsConfiguration getEbsConfiguration() {
        return ebsConfiguration;
    }

    /**
     * <p>
     * The configuration of Amazon Elastic Block Storage (EBS) attached to each
     * instance as defined by <code>InstanceType</code>.
     * </p>
     *
     * @param ebsConfiguration <p>
     *            The configuration of Amazon Elastic Block Storage (EBS)
     *            attached to each instance as defined by
     *            <code>InstanceType</code>.
     *            </p>
     */
    public void setEbsConfiguration(EbsConfiguration ebsConfiguration) {
        this.ebsConfiguration = ebsConfiguration;
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
     * @param ebsConfiguration <p>
     *            The configuration of Amazon Elastic Block Storage (EBS)
     *            attached to each instance as defined by
     *            <code>InstanceType</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeConfig withEbsConfiguration(EbsConfiguration ebsConfiguration) {
        this.ebsConfiguration = ebsConfiguration;
        return this;
    }

    /**
     * <p>
     * A configuration classification that applies when provisioning cluster
     * instances, which can include configurations for applications and software
     * that run on the cluster.
     * </p>
     *
     * @return <p>
     *         A configuration classification that applies when provisioning
     *         cluster instances, which can include configurations for
     *         applications and software that run on the cluster.
     *         </p>
     */
    public java.util.List<Configuration> getConfigurations() {
        return configurations;
    }

    /**
     * <p>
     * A configuration classification that applies when provisioning cluster
     * instances, which can include configurations for applications and software
     * that run on the cluster.
     * </p>
     *
     * @param configurations <p>
     *            A configuration classification that applies when provisioning
     *            cluster instances, which can include configurations for
     *            applications and software that run on the cluster.
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
     * that run on the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurations <p>
     *            A configuration classification that applies when provisioning
     *            cluster instances, which can include configurations for
     *            applications and software that run on the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeConfig withConfigurations(Configuration... configurations) {
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
     * that run on the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurations <p>
     *            A configuration classification that applies when provisioning
     *            cluster instances, which can include configurations for
     *            applications and software that run on the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeConfig withConfigurations(java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
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
        if (getEbsConfiguration() != null)
            sb.append("EbsConfiguration: " + getEbsConfiguration() + ",");
        if (getConfigurations() != null)
            sb.append("Configurations: " + getConfigurations());
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
                + ((getEbsConfiguration() == null) ? 0 : getEbsConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceTypeConfig == false)
            return false;
        InstanceTypeConfig other = (InstanceTypeConfig) obj;

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
        if (other.getEbsConfiguration() == null ^ this.getEbsConfiguration() == null)
            return false;
        if (other.getEbsConfiguration() != null
                && other.getEbsConfiguration().equals(this.getEbsConfiguration()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null
                && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        return true;
    }
}

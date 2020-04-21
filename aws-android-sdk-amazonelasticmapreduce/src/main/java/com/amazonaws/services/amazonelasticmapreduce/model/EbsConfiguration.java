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
 * The Amazon EBS configuration of a cluster instance.
 * </p>
 */
public class EbsConfiguration implements Serializable {
    /**
     * <p>
     * An array of Amazon EBS volume specifications attached to a cluster
     * instance.
     * </p>
     */
    private java.util.List<EbsBlockDeviceConfig> ebsBlockDeviceConfigs;

    /**
     * <p>
     * Indicates whether an Amazon EBS volume is EBS-optimized.
     * </p>
     */
    private Boolean ebsOptimized;

    /**
     * <p>
     * An array of Amazon EBS volume specifications attached to a cluster
     * instance.
     * </p>
     *
     * @return <p>
     *         An array of Amazon EBS volume specifications attached to a
     *         cluster instance.
     *         </p>
     */
    public java.util.List<EbsBlockDeviceConfig> getEbsBlockDeviceConfigs() {
        return ebsBlockDeviceConfigs;
    }

    /**
     * <p>
     * An array of Amazon EBS volume specifications attached to a cluster
     * instance.
     * </p>
     *
     * @param ebsBlockDeviceConfigs <p>
     *            An array of Amazon EBS volume specifications attached to a
     *            cluster instance.
     *            </p>
     */
    public void setEbsBlockDeviceConfigs(
            java.util.Collection<EbsBlockDeviceConfig> ebsBlockDeviceConfigs) {
        if (ebsBlockDeviceConfigs == null) {
            this.ebsBlockDeviceConfigs = null;
            return;
        }

        this.ebsBlockDeviceConfigs = new java.util.ArrayList<EbsBlockDeviceConfig>(
                ebsBlockDeviceConfigs);
    }

    /**
     * <p>
     * An array of Amazon EBS volume specifications attached to a cluster
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsBlockDeviceConfigs <p>
     *            An array of Amazon EBS volume specifications attached to a
     *            cluster instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsConfiguration withEbsBlockDeviceConfigs(EbsBlockDeviceConfig... ebsBlockDeviceConfigs) {
        if (getEbsBlockDeviceConfigs() == null) {
            this.ebsBlockDeviceConfigs = new java.util.ArrayList<EbsBlockDeviceConfig>(
                    ebsBlockDeviceConfigs.length);
        }
        for (EbsBlockDeviceConfig value : ebsBlockDeviceConfigs) {
            this.ebsBlockDeviceConfigs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of Amazon EBS volume specifications attached to a cluster
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsBlockDeviceConfigs <p>
     *            An array of Amazon EBS volume specifications attached to a
     *            cluster instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsConfiguration withEbsBlockDeviceConfigs(
            java.util.Collection<EbsBlockDeviceConfig> ebsBlockDeviceConfigs) {
        setEbsBlockDeviceConfigs(ebsBlockDeviceConfigs);
        return this;
    }

    /**
     * <p>
     * Indicates whether an Amazon EBS volume is EBS-optimized.
     * </p>
     *
     * @return <p>
     *         Indicates whether an Amazon EBS volume is EBS-optimized.
     *         </p>
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether an Amazon EBS volume is EBS-optimized.
     * </p>
     *
     * @return <p>
     *         Indicates whether an Amazon EBS volume is EBS-optimized.
     *         </p>
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether an Amazon EBS volume is EBS-optimized.
     * </p>
     *
     * @param ebsOptimized <p>
     *            Indicates whether an Amazon EBS volume is EBS-optimized.
     *            </p>
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether an Amazon EBS volume is EBS-optimized.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsOptimized <p>
     *            Indicates whether an Amazon EBS volume is EBS-optimized.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsConfiguration withEbsOptimized(Boolean ebsOptimized) {
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
        if (getEbsBlockDeviceConfigs() != null)
            sb.append("EbsBlockDeviceConfigs: " + getEbsBlockDeviceConfigs() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEbsBlockDeviceConfigs() == null) ? 0 : getEbsBlockDeviceConfigs().hashCode());
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

        if (obj instanceof EbsConfiguration == false)
            return false;
        EbsConfiguration other = (EbsConfiguration) obj;

        if (other.getEbsBlockDeviceConfigs() == null ^ this.getEbsBlockDeviceConfigs() == null)
            return false;
        if (other.getEbsBlockDeviceConfigs() != null
                && other.getEbsBlockDeviceConfigs().equals(this.getEbsBlockDeviceConfigs()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null
                && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        return true;
    }
}

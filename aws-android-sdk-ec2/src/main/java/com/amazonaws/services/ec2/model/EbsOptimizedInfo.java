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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the optimized EBS performance for supported instance types.
 * </p>
 */
public class EbsOptimizedInfo implements Serializable {
    /**
     * <p>
     * The baseline bandwidth performance for an EBS-optimized instance type, in
     * Mbps.
     * </p>
     */
    private Integer baselineBandwidthInMbps;

    /**
     * <p>
     * The baseline throughput performance for an EBS-optimized instance type,
     * in MBps.
     * </p>
     */
    private Double baselineThroughputInMBps;

    /**
     * <p>
     * The baseline input/output storage operations per seconds for an
     * EBS-optimized instance type.
     * </p>
     */
    private Integer baselineIops;

    /**
     * <p>
     * The maximum bandwidth performance for an EBS-optimized instance type, in
     * Mbps.
     * </p>
     */
    private Integer maximumBandwidthInMbps;

    /**
     * <p>
     * The maximum throughput performance for an EBS-optimized instance type, in
     * MBps.
     * </p>
     */
    private Double maximumThroughputInMBps;

    /**
     * <p>
     * The maximum input/output storage operations per second for an
     * EBS-optimized instance type.
     * </p>
     */
    private Integer maximumIops;

    /**
     * <p>
     * The baseline bandwidth performance for an EBS-optimized instance type, in
     * Mbps.
     * </p>
     *
     * @return <p>
     *         The baseline bandwidth performance for an EBS-optimized instance
     *         type, in Mbps.
     *         </p>
     */
    public Integer getBaselineBandwidthInMbps() {
        return baselineBandwidthInMbps;
    }

    /**
     * <p>
     * The baseline bandwidth performance for an EBS-optimized instance type, in
     * Mbps.
     * </p>
     *
     * @param baselineBandwidthInMbps <p>
     *            The baseline bandwidth performance for an EBS-optimized
     *            instance type, in Mbps.
     *            </p>
     */
    public void setBaselineBandwidthInMbps(Integer baselineBandwidthInMbps) {
        this.baselineBandwidthInMbps = baselineBandwidthInMbps;
    }

    /**
     * <p>
     * The baseline bandwidth performance for an EBS-optimized instance type, in
     * Mbps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baselineBandwidthInMbps <p>
     *            The baseline bandwidth performance for an EBS-optimized
     *            instance type, in Mbps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsOptimizedInfo withBaselineBandwidthInMbps(Integer baselineBandwidthInMbps) {
        this.baselineBandwidthInMbps = baselineBandwidthInMbps;
        return this;
    }

    /**
     * <p>
     * The baseline throughput performance for an EBS-optimized instance type,
     * in MBps.
     * </p>
     *
     * @return <p>
     *         The baseline throughput performance for an EBS-optimized instance
     *         type, in MBps.
     *         </p>
     */
    public Double getBaselineThroughputInMBps() {
        return baselineThroughputInMBps;
    }

    /**
     * <p>
     * The baseline throughput performance for an EBS-optimized instance type,
     * in MBps.
     * </p>
     *
     * @param baselineThroughputInMBps <p>
     *            The baseline throughput performance for an EBS-optimized
     *            instance type, in MBps.
     *            </p>
     */
    public void setBaselineThroughputInMBps(Double baselineThroughputInMBps) {
        this.baselineThroughputInMBps = baselineThroughputInMBps;
    }

    /**
     * <p>
     * The baseline throughput performance for an EBS-optimized instance type,
     * in MBps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baselineThroughputInMBps <p>
     *            The baseline throughput performance for an EBS-optimized
     *            instance type, in MBps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsOptimizedInfo withBaselineThroughputInMBps(Double baselineThroughputInMBps) {
        this.baselineThroughputInMBps = baselineThroughputInMBps;
        return this;
    }

    /**
     * <p>
     * The baseline input/output storage operations per seconds for an
     * EBS-optimized instance type.
     * </p>
     *
     * @return <p>
     *         The baseline input/output storage operations per seconds for an
     *         EBS-optimized instance type.
     *         </p>
     */
    public Integer getBaselineIops() {
        return baselineIops;
    }

    /**
     * <p>
     * The baseline input/output storage operations per seconds for an
     * EBS-optimized instance type.
     * </p>
     *
     * @param baselineIops <p>
     *            The baseline input/output storage operations per seconds for
     *            an EBS-optimized instance type.
     *            </p>
     */
    public void setBaselineIops(Integer baselineIops) {
        this.baselineIops = baselineIops;
    }

    /**
     * <p>
     * The baseline input/output storage operations per seconds for an
     * EBS-optimized instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baselineIops <p>
     *            The baseline input/output storage operations per seconds for
     *            an EBS-optimized instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsOptimizedInfo withBaselineIops(Integer baselineIops) {
        this.baselineIops = baselineIops;
        return this;
    }

    /**
     * <p>
     * The maximum bandwidth performance for an EBS-optimized instance type, in
     * Mbps.
     * </p>
     *
     * @return <p>
     *         The maximum bandwidth performance for an EBS-optimized instance
     *         type, in Mbps.
     *         </p>
     */
    public Integer getMaximumBandwidthInMbps() {
        return maximumBandwidthInMbps;
    }

    /**
     * <p>
     * The maximum bandwidth performance for an EBS-optimized instance type, in
     * Mbps.
     * </p>
     *
     * @param maximumBandwidthInMbps <p>
     *            The maximum bandwidth performance for an EBS-optimized
     *            instance type, in Mbps.
     *            </p>
     */
    public void setMaximumBandwidthInMbps(Integer maximumBandwidthInMbps) {
        this.maximumBandwidthInMbps = maximumBandwidthInMbps;
    }

    /**
     * <p>
     * The maximum bandwidth performance for an EBS-optimized instance type, in
     * Mbps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximumBandwidthInMbps <p>
     *            The maximum bandwidth performance for an EBS-optimized
     *            instance type, in Mbps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsOptimizedInfo withMaximumBandwidthInMbps(Integer maximumBandwidthInMbps) {
        this.maximumBandwidthInMbps = maximumBandwidthInMbps;
        return this;
    }

    /**
     * <p>
     * The maximum throughput performance for an EBS-optimized instance type, in
     * MBps.
     * </p>
     *
     * @return <p>
     *         The maximum throughput performance for an EBS-optimized instance
     *         type, in MBps.
     *         </p>
     */
    public Double getMaximumThroughputInMBps() {
        return maximumThroughputInMBps;
    }

    /**
     * <p>
     * The maximum throughput performance for an EBS-optimized instance type, in
     * MBps.
     * </p>
     *
     * @param maximumThroughputInMBps <p>
     *            The maximum throughput performance for an EBS-optimized
     *            instance type, in MBps.
     *            </p>
     */
    public void setMaximumThroughputInMBps(Double maximumThroughputInMBps) {
        this.maximumThroughputInMBps = maximumThroughputInMBps;
    }

    /**
     * <p>
     * The maximum throughput performance for an EBS-optimized instance type, in
     * MBps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximumThroughputInMBps <p>
     *            The maximum throughput performance for an EBS-optimized
     *            instance type, in MBps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsOptimizedInfo withMaximumThroughputInMBps(Double maximumThroughputInMBps) {
        this.maximumThroughputInMBps = maximumThroughputInMBps;
        return this;
    }

    /**
     * <p>
     * The maximum input/output storage operations per second for an
     * EBS-optimized instance type.
     * </p>
     *
     * @return <p>
     *         The maximum input/output storage operations per second for an
     *         EBS-optimized instance type.
     *         </p>
     */
    public Integer getMaximumIops() {
        return maximumIops;
    }

    /**
     * <p>
     * The maximum input/output storage operations per second for an
     * EBS-optimized instance type.
     * </p>
     *
     * @param maximumIops <p>
     *            The maximum input/output storage operations per second for an
     *            EBS-optimized instance type.
     *            </p>
     */
    public void setMaximumIops(Integer maximumIops) {
        this.maximumIops = maximumIops;
    }

    /**
     * <p>
     * The maximum input/output storage operations per second for an
     * EBS-optimized instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximumIops <p>
     *            The maximum input/output storage operations per second for an
     *            EBS-optimized instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsOptimizedInfo withMaximumIops(Integer maximumIops) {
        this.maximumIops = maximumIops;
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
        if (getBaselineBandwidthInMbps() != null)
            sb.append("BaselineBandwidthInMbps: " + getBaselineBandwidthInMbps() + ",");
        if (getBaselineThroughputInMBps() != null)
            sb.append("BaselineThroughputInMBps: " + getBaselineThroughputInMBps() + ",");
        if (getBaselineIops() != null)
            sb.append("BaselineIops: " + getBaselineIops() + ",");
        if (getMaximumBandwidthInMbps() != null)
            sb.append("MaximumBandwidthInMbps: " + getMaximumBandwidthInMbps() + ",");
        if (getMaximumThroughputInMBps() != null)
            sb.append("MaximumThroughputInMBps: " + getMaximumThroughputInMBps() + ",");
        if (getMaximumIops() != null)
            sb.append("MaximumIops: " + getMaximumIops());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getBaselineBandwidthInMbps() == null) ? 0 : getBaselineBandwidthInMbps()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getBaselineThroughputInMBps() == null) ? 0 : getBaselineThroughputInMBps()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getBaselineIops() == null) ? 0 : getBaselineIops().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaximumBandwidthInMbps() == null) ? 0 : getMaximumBandwidthInMbps()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMaximumThroughputInMBps() == null) ? 0 : getMaximumThroughputInMBps()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMaximumIops() == null) ? 0 : getMaximumIops().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsOptimizedInfo == false)
            return false;
        EbsOptimizedInfo other = (EbsOptimizedInfo) obj;

        if (other.getBaselineBandwidthInMbps() == null ^ this.getBaselineBandwidthInMbps() == null)
            return false;
        if (other.getBaselineBandwidthInMbps() != null
                && other.getBaselineBandwidthInMbps().equals(this.getBaselineBandwidthInMbps()) == false)
            return false;
        if (other.getBaselineThroughputInMBps() == null
                ^ this.getBaselineThroughputInMBps() == null)
            return false;
        if (other.getBaselineThroughputInMBps() != null
                && other.getBaselineThroughputInMBps().equals(this.getBaselineThroughputInMBps()) == false)
            return false;
        if (other.getBaselineIops() == null ^ this.getBaselineIops() == null)
            return false;
        if (other.getBaselineIops() != null
                && other.getBaselineIops().equals(this.getBaselineIops()) == false)
            return false;
        if (other.getMaximumBandwidthInMbps() == null ^ this.getMaximumBandwidthInMbps() == null)
            return false;
        if (other.getMaximumBandwidthInMbps() != null
                && other.getMaximumBandwidthInMbps().equals(this.getMaximumBandwidthInMbps()) == false)
            return false;
        if (other.getMaximumThroughputInMBps() == null ^ this.getMaximumThroughputInMBps() == null)
            return false;
        if (other.getMaximumThroughputInMBps() != null
                && other.getMaximumThroughputInMBps().equals(this.getMaximumThroughputInMBps()) == false)
            return false;
        if (other.getMaximumIops() == null ^ this.getMaximumIops() == null)
            return false;
        if (other.getMaximumIops() != null
                && other.getMaximumIops().equals(this.getMaximumIops()) == false)
            return false;
        return true;
    }
}

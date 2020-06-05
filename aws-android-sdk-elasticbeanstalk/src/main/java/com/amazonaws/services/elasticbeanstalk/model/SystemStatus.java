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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * CPU utilization and load average metrics for an Amazon EC2 instance.
 * </p>
 */
public class SystemStatus implements Serializable {
    /**
     * <p>
     * CPU utilization metrics for the instance.
     * </p>
     */
    private CPUUtilization cPUUtilization;

    /**
     * <p>
     * Load average in the last 1-minute, 5-minute, and 15-minute periods. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     * >Operating System Metrics</a>.
     * </p>
     */
    private java.util.List<Double> loadAverage;

    /**
     * <p>
     * CPU utilization metrics for the instance.
     * </p>
     *
     * @return <p>
     *         CPU utilization metrics for the instance.
     *         </p>
     */
    public CPUUtilization getCPUUtilization() {
        return cPUUtilization;
    }

    /**
     * <p>
     * CPU utilization metrics for the instance.
     * </p>
     *
     * @param cPUUtilization <p>
     *            CPU utilization metrics for the instance.
     *            </p>
     */
    public void setCPUUtilization(CPUUtilization cPUUtilization) {
        this.cPUUtilization = cPUUtilization;
    }

    /**
     * <p>
     * CPU utilization metrics for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cPUUtilization <p>
     *            CPU utilization metrics for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SystemStatus withCPUUtilization(CPUUtilization cPUUtilization) {
        this.cPUUtilization = cPUUtilization;
        return this;
    }

    /**
     * <p>
     * Load average in the last 1-minute, 5-minute, and 15-minute periods. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     * >Operating System Metrics</a>.
     * </p>
     *
     * @return <p>
     *         Load average in the last 1-minute, 5-minute, and 15-minute
     *         periods. For more information, see <a href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     *         >Operating System Metrics</a>.
     *         </p>
     */
    public java.util.List<Double> getLoadAverage() {
        return loadAverage;
    }

    /**
     * <p>
     * Load average in the last 1-minute, 5-minute, and 15-minute periods. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     * >Operating System Metrics</a>.
     * </p>
     *
     * @param loadAverage <p>
     *            Load average in the last 1-minute, 5-minute, and 15-minute
     *            periods. For more information, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     *            >Operating System Metrics</a>.
     *            </p>
     */
    public void setLoadAverage(java.util.Collection<Double> loadAverage) {
        if (loadAverage == null) {
            this.loadAverage = null;
            return;
        }

        this.loadAverage = new java.util.ArrayList<Double>(loadAverage);
    }

    /**
     * <p>
     * Load average in the last 1-minute, 5-minute, and 15-minute periods. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     * >Operating System Metrics</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadAverage <p>
     *            Load average in the last 1-minute, 5-minute, and 15-minute
     *            periods. For more information, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     *            >Operating System Metrics</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SystemStatus withLoadAverage(Double... loadAverage) {
        if (getLoadAverage() == null) {
            this.loadAverage = new java.util.ArrayList<Double>(loadAverage.length);
        }
        for (Double value : loadAverage) {
            this.loadAverage.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Load average in the last 1-minute, 5-minute, and 15-minute periods. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     * >Operating System Metrics</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadAverage <p>
     *            Load average in the last 1-minute, 5-minute, and 15-minute
     *            periods. For more information, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     *            >Operating System Metrics</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SystemStatus withLoadAverage(java.util.Collection<Double> loadAverage) {
        setLoadAverage(loadAverage);
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
        if (getCPUUtilization() != null)
            sb.append("CPUUtilization: " + getCPUUtilization() + ",");
        if (getLoadAverage() != null)
            sb.append("LoadAverage: " + getLoadAverage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCPUUtilization() == null) ? 0 : getCPUUtilization().hashCode());
        hashCode = prime * hashCode
                + ((getLoadAverage() == null) ? 0 : getLoadAverage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SystemStatus == false)
            return false;
        SystemStatus other = (SystemStatus) obj;

        if (other.getCPUUtilization() == null ^ this.getCPUUtilization() == null)
            return false;
        if (other.getCPUUtilization() != null
                && other.getCPUUtilization().equals(this.getCPUUtilization()) == false)
            return false;
        if (other.getLoadAverage() == null ^ this.getLoadAverage() == null)
            return false;
        if (other.getLoadAverage() != null
                && other.getLoadAverage().equals(this.getLoadAverage()) == false)
            return false;
        return true;
    }
}

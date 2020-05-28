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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

/**
 * 
 <p>
 * JMX and Node monitoring for the MSK cluster.
 * </p>
 */
public class OpenMonitoringInfo implements Serializable {
    /**
     * 
     <p>
     * Prometheus settings.
     * </p>
     */
    private PrometheusInfo prometheus;

    /**
     * 
     <p>
     * Prometheus settings.
     * </p>
     * 
     * @return <p>
     *         Prometheus settings.
     *         </p>
     */
    public PrometheusInfo getPrometheus() {
        return prometheus;
    }

    /**
     * 
     <p>
     * Prometheus settings.
     * </p>
     * 
     * @param prometheus <p>
     *            Prometheus settings.
     *            </p>
     */
    public void setPrometheus(PrometheusInfo prometheus) {
        this.prometheus = prometheus;
    }

    /**
     * 
     <p>
     * Prometheus settings.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prometheus <p>
     *            Prometheus settings.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpenMonitoringInfo withPrometheus(PrometheusInfo prometheus) {
        this.prometheus = prometheus;
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
        if (getPrometheus() != null)
            sb.append("Prometheus: " + getPrometheus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrometheus() == null) ? 0 : getPrometheus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpenMonitoringInfo == false)
            return false;
        OpenMonitoringInfo other = (OpenMonitoringInfo) obj;

        if (other.getPrometheus() == null ^ this.getPrometheus() == null)
            return false;
        if (other.getPrometheus() != null
                && other.getPrometheus().equals(this.getPrometheus()) == false)
            return false;
        return true;
    }
}

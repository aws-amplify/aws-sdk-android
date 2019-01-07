/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The value to be compared with the <code>metric</code>.
 * </p>
 */
public class MetricValue implements Serializable {
    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a numeric value, use
     * this to specify that numeric value to be compared with the
     * <code>metric</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long count;

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of CIDRs, use this
     * to specify that set to be compared with the <code>metric</code>.
     * </p>
     */
    private java.util.List<String> cidrs;

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of ports, use this
     * to specify that set to be compared with the <code>metric</code>.
     * </p>
     */
    private java.util.List<Integer> ports;

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a numeric value, use
     * this to specify that numeric value to be compared with the
     * <code>metric</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         If the <code>comparisonOperator</code> calls for a numeric value,
     *         use this to specify that numeric value to be compared with the
     *         <code>metric</code>.
     *         </p>
     */
    public Long getCount() {
        return count;
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a numeric value, use
     * this to specify that numeric value to be compared with the
     * <code>metric</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param count <p>
     *            If the <code>comparisonOperator</code> calls for a numeric
     *            value, use this to specify that numeric value to be compared
     *            with the <code>metric</code>.
     *            </p>
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a numeric value, use
     * this to specify that numeric value to be compared with the
     * <code>metric</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param count <p>
     *            If the <code>comparisonOperator</code> calls for a numeric
     *            value, use this to specify that numeric value to be compared
     *            with the <code>metric</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricValue withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of CIDRs, use this
     * to specify that set to be compared with the <code>metric</code>.
     * </p>
     *
     * @return <p>
     *         If the <code>comparisonOperator</code> calls for a set of CIDRs,
     *         use this to specify that set to be compared with the
     *         <code>metric</code>.
     *         </p>
     */
    public java.util.List<String> getCidrs() {
        return cidrs;
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of CIDRs, use this
     * to specify that set to be compared with the <code>metric</code>.
     * </p>
     *
     * @param cidrs <p>
     *            If the <code>comparisonOperator</code> calls for a set of
     *            CIDRs, use this to specify that set to be compared with the
     *            <code>metric</code>.
     *            </p>
     */
    public void setCidrs(java.util.Collection<String> cidrs) {
        if (cidrs == null) {
            this.cidrs = null;
            return;
        }

        this.cidrs = new java.util.ArrayList<String>(cidrs);
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of CIDRs, use this
     * to specify that set to be compared with the <code>metric</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrs <p>
     *            If the <code>comparisonOperator</code> calls for a set of
     *            CIDRs, use this to specify that set to be compared with the
     *            <code>metric</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricValue withCidrs(String... cidrs) {
        if (getCidrs() == null) {
            this.cidrs = new java.util.ArrayList<String>(cidrs.length);
        }
        for (String value : cidrs) {
            this.cidrs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of CIDRs, use this
     * to specify that set to be compared with the <code>metric</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrs <p>
     *            If the <code>comparisonOperator</code> calls for a set of
     *            CIDRs, use this to specify that set to be compared with the
     *            <code>metric</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricValue withCidrs(java.util.Collection<String> cidrs) {
        setCidrs(cidrs);
        return this;
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of ports, use this
     * to specify that set to be compared with the <code>metric</code>.
     * </p>
     *
     * @return <p>
     *         If the <code>comparisonOperator</code> calls for a set of ports,
     *         use this to specify that set to be compared with the
     *         <code>metric</code>.
     *         </p>
     */
    public java.util.List<Integer> getPorts() {
        return ports;
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of ports, use this
     * to specify that set to be compared with the <code>metric</code>.
     * </p>
     *
     * @param ports <p>
     *            If the <code>comparisonOperator</code> calls for a set of
     *            ports, use this to specify that set to be compared with the
     *            <code>metric</code>.
     *            </p>
     */
    public void setPorts(java.util.Collection<Integer> ports) {
        if (ports == null) {
            this.ports = null;
            return;
        }

        this.ports = new java.util.ArrayList<Integer>(ports);
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of ports, use this
     * to specify that set to be compared with the <code>metric</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ports <p>
     *            If the <code>comparisonOperator</code> calls for a set of
     *            ports, use this to specify that set to be compared with the
     *            <code>metric</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricValue withPorts(Integer... ports) {
        if (getPorts() == null) {
            this.ports = new java.util.ArrayList<Integer>(ports.length);
        }
        for (Integer value : ports) {
            this.ports.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of ports, use this
     * to specify that set to be compared with the <code>metric</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ports <p>
     *            If the <code>comparisonOperator</code> calls for a set of
     *            ports, use this to specify that set to be compared with the
     *            <code>metric</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricValue withPorts(java.util.Collection<Integer> ports) {
        setPorts(ports);
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
        if (getCount() != null)
            sb.append("count: " + getCount() + ",");
        if (getCidrs() != null)
            sb.append("cidrs: " + getCidrs() + ",");
        if (getPorts() != null)
            sb.append("ports: " + getPorts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getCidrs() == null) ? 0 : getCidrs().hashCode());
        hashCode = prime * hashCode + ((getPorts() == null) ? 0 : getPorts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricValue == false)
            return false;
        MetricValue other = (MetricValue) obj;

        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getCidrs() == null ^ this.getCidrs() == null)
            return false;
        if (other.getCidrs() != null && other.getCidrs().equals(this.getCidrs()) == false)
            return false;
        if (other.getPorts() == null ^ this.getPorts() == null)
            return false;
        if (other.getPorts() != null && other.getPorts().equals(this.getPorts()) == false)
            return false;
        return true;
    }
}

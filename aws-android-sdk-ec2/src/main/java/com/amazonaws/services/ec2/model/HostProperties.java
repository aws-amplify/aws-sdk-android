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
 * Describes the properties of a Dedicated Host.
 * </p>
 */
public class HostProperties implements Serializable {
    /**
     * <p>
     * The number of cores on the Dedicated Host.
     * </p>
     */
    private Integer cores;

    /**
     * <p>
     * The instance type supported by the Dedicated Host. For example,
     * <code>m5.large</code>. If the host supports multiple instance types, no
     * <b>instanceType</b> is returned.
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * The instance family supported by the Dedicated Host. For example,
     * <code>m5</code>.
     * </p>
     */
    private String instanceFamily;

    /**
     * <p>
     * The number of sockets on the Dedicated Host.
     * </p>
     */
    private Integer sockets;

    /**
     * <p>
     * The total number of vCPUs on the Dedicated Host.
     * </p>
     */
    private Integer totalVCpus;

    /**
     * <p>
     * The number of cores on the Dedicated Host.
     * </p>
     *
     * @return <p>
     *         The number of cores on the Dedicated Host.
     *         </p>
     */
    public Integer getCores() {
        return cores;
    }

    /**
     * <p>
     * The number of cores on the Dedicated Host.
     * </p>
     *
     * @param cores <p>
     *            The number of cores on the Dedicated Host.
     *            </p>
     */
    public void setCores(Integer cores) {
        this.cores = cores;
    }

    /**
     * <p>
     * The number of cores on the Dedicated Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cores <p>
     *            The number of cores on the Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostProperties withCores(Integer cores) {
        this.cores = cores;
        return this;
    }

    /**
     * <p>
     * The instance type supported by the Dedicated Host. For example,
     * <code>m5.large</code>. If the host supports multiple instance types, no
     * <b>instanceType</b> is returned.
     * </p>
     *
     * @return <p>
     *         The instance type supported by the Dedicated Host. For example,
     *         <code>m5.large</code>. If the host supports multiple instance
     *         types, no <b>instanceType</b> is returned.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type supported by the Dedicated Host. For example,
     * <code>m5.large</code>. If the host supports multiple instance types, no
     * <b>instanceType</b> is returned.
     * </p>
     *
     * @param instanceType <p>
     *            The instance type supported by the Dedicated Host. For
     *            example, <code>m5.large</code>. If the host supports multiple
     *            instance types, no <b>instanceType</b> is returned.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type supported by the Dedicated Host. For example,
     * <code>m5.large</code>. If the host supports multiple instance types, no
     * <b>instanceType</b> is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceType <p>
     *            The instance type supported by the Dedicated Host. For
     *            example, <code>m5.large</code>. If the host supports multiple
     *            instance types, no <b>instanceType</b> is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostProperties withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The instance family supported by the Dedicated Host. For example,
     * <code>m5</code>.
     * </p>
     *
     * @return <p>
     *         The instance family supported by the Dedicated Host. For example,
     *         <code>m5</code>.
     *         </p>
     */
    public String getInstanceFamily() {
        return instanceFamily;
    }

    /**
     * <p>
     * The instance family supported by the Dedicated Host. For example,
     * <code>m5</code>.
     * </p>
     *
     * @param instanceFamily <p>
     *            The instance family supported by the Dedicated Host. For
     *            example, <code>m5</code>.
     *            </p>
     */
    public void setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
    }

    /**
     * <p>
     * The instance family supported by the Dedicated Host. For example,
     * <code>m5</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceFamily <p>
     *            The instance family supported by the Dedicated Host. For
     *            example, <code>m5</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostProperties withInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
        return this;
    }

    /**
     * <p>
     * The number of sockets on the Dedicated Host.
     * </p>
     *
     * @return <p>
     *         The number of sockets on the Dedicated Host.
     *         </p>
     */
    public Integer getSockets() {
        return sockets;
    }

    /**
     * <p>
     * The number of sockets on the Dedicated Host.
     * </p>
     *
     * @param sockets <p>
     *            The number of sockets on the Dedicated Host.
     *            </p>
     */
    public void setSockets(Integer sockets) {
        this.sockets = sockets;
    }

    /**
     * <p>
     * The number of sockets on the Dedicated Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sockets <p>
     *            The number of sockets on the Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostProperties withSockets(Integer sockets) {
        this.sockets = sockets;
        return this;
    }

    /**
     * <p>
     * The total number of vCPUs on the Dedicated Host.
     * </p>
     *
     * @return <p>
     *         The total number of vCPUs on the Dedicated Host.
     *         </p>
     */
    public Integer getTotalVCpus() {
        return totalVCpus;
    }

    /**
     * <p>
     * The total number of vCPUs on the Dedicated Host.
     * </p>
     *
     * @param totalVCpus <p>
     *            The total number of vCPUs on the Dedicated Host.
     *            </p>
     */
    public void setTotalVCpus(Integer totalVCpus) {
        this.totalVCpus = totalVCpus;
    }

    /**
     * <p>
     * The total number of vCPUs on the Dedicated Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalVCpus <p>
     *            The total number of vCPUs on the Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostProperties withTotalVCpus(Integer totalVCpus) {
        this.totalVCpus = totalVCpus;
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
        if (getCores() != null)
            sb.append("Cores: " + getCores() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getInstanceFamily() != null)
            sb.append("InstanceFamily: " + getInstanceFamily() + ",");
        if (getSockets() != null)
            sb.append("Sockets: " + getSockets() + ",");
        if (getTotalVCpus() != null)
            sb.append("TotalVCpus: " + getTotalVCpus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCores() == null) ? 0 : getCores().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceFamily() == null) ? 0 : getInstanceFamily().hashCode());
        hashCode = prime * hashCode + ((getSockets() == null) ? 0 : getSockets().hashCode());
        hashCode = prime * hashCode + ((getTotalVCpus() == null) ? 0 : getTotalVCpus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostProperties == false)
            return false;
        HostProperties other = (HostProperties) obj;

        if (other.getCores() == null ^ this.getCores() == null)
            return false;
        if (other.getCores() != null && other.getCores().equals(this.getCores()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceFamily() == null ^ this.getInstanceFamily() == null)
            return false;
        if (other.getInstanceFamily() != null
                && other.getInstanceFamily().equals(this.getInstanceFamily()) == false)
            return false;
        if (other.getSockets() == null ^ this.getSockets() == null)
            return false;
        if (other.getSockets() != null && other.getSockets().equals(this.getSockets()) == false)
            return false;
        if (other.getTotalVCpus() == null ^ this.getTotalVCpus() == null)
            return false;
        if (other.getTotalVCpus() != null
                && other.getTotalVCpus().equals(this.getTotalVCpus()) == false)
            return false;
        return true;
    }
}

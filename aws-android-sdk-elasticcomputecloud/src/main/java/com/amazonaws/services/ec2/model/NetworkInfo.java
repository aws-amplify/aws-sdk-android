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
 * Describes the networking features of the instance type.
 * </p>
 */
public class NetworkInfo implements Serializable {
    /**
     * <p>
     * Describes the network performance.
     * </p>
     */
    private String networkPerformance;

    /**
     * <p>
     * The maximum number of network interfaces for the instance type.
     * </p>
     */
    private Integer maximumNetworkInterfaces;

    /**
     * <p>
     * The maximum number of IPv4 addresses per network interface.
     * </p>
     */
    private Integer ipv4AddressesPerInterface;

    /**
     * <p>
     * The maximum number of IPv6 addresses per network interface.
     * </p>
     */
    private Integer ipv6AddressesPerInterface;

    /**
     * <p>
     * Indicates whether IPv6 is supported.
     * </p>
     */
    private Boolean ipv6Supported;

    /**
     * <p>
     * Indicates whether Elastic Network Adapter (ENA) is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported, required
     */
    private String enaSupport;

    /**
     * <p>
     * Describes the network performance.
     * </p>
     *
     * @return <p>
     *         Describes the network performance.
     *         </p>
     */
    public String getNetworkPerformance() {
        return networkPerformance;
    }

    /**
     * <p>
     * Describes the network performance.
     * </p>
     *
     * @param networkPerformance <p>
     *            Describes the network performance.
     *            </p>
     */
    public void setNetworkPerformance(String networkPerformance) {
        this.networkPerformance = networkPerformance;
    }

    /**
     * <p>
     * Describes the network performance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkPerformance <p>
     *            Describes the network performance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInfo withNetworkPerformance(String networkPerformance) {
        this.networkPerformance = networkPerformance;
        return this;
    }

    /**
     * <p>
     * The maximum number of network interfaces for the instance type.
     * </p>
     *
     * @return <p>
     *         The maximum number of network interfaces for the instance type.
     *         </p>
     */
    public Integer getMaximumNetworkInterfaces() {
        return maximumNetworkInterfaces;
    }

    /**
     * <p>
     * The maximum number of network interfaces for the instance type.
     * </p>
     *
     * @param maximumNetworkInterfaces <p>
     *            The maximum number of network interfaces for the instance
     *            type.
     *            </p>
     */
    public void setMaximumNetworkInterfaces(Integer maximumNetworkInterfaces) {
        this.maximumNetworkInterfaces = maximumNetworkInterfaces;
    }

    /**
     * <p>
     * The maximum number of network interfaces for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximumNetworkInterfaces <p>
     *            The maximum number of network interfaces for the instance
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInfo withMaximumNetworkInterfaces(Integer maximumNetworkInterfaces) {
        this.maximumNetworkInterfaces = maximumNetworkInterfaces;
        return this;
    }

    /**
     * <p>
     * The maximum number of IPv4 addresses per network interface.
     * </p>
     *
     * @return <p>
     *         The maximum number of IPv4 addresses per network interface.
     *         </p>
     */
    public Integer getIpv4AddressesPerInterface() {
        return ipv4AddressesPerInterface;
    }

    /**
     * <p>
     * The maximum number of IPv4 addresses per network interface.
     * </p>
     *
     * @param ipv4AddressesPerInterface <p>
     *            The maximum number of IPv4 addresses per network interface.
     *            </p>
     */
    public void setIpv4AddressesPerInterface(Integer ipv4AddressesPerInterface) {
        this.ipv4AddressesPerInterface = ipv4AddressesPerInterface;
    }

    /**
     * <p>
     * The maximum number of IPv4 addresses per network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv4AddressesPerInterface <p>
     *            The maximum number of IPv4 addresses per network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInfo withIpv4AddressesPerInterface(Integer ipv4AddressesPerInterface) {
        this.ipv4AddressesPerInterface = ipv4AddressesPerInterface;
        return this;
    }

    /**
     * <p>
     * The maximum number of IPv6 addresses per network interface.
     * </p>
     *
     * @return <p>
     *         The maximum number of IPv6 addresses per network interface.
     *         </p>
     */
    public Integer getIpv6AddressesPerInterface() {
        return ipv6AddressesPerInterface;
    }

    /**
     * <p>
     * The maximum number of IPv6 addresses per network interface.
     * </p>
     *
     * @param ipv6AddressesPerInterface <p>
     *            The maximum number of IPv6 addresses per network interface.
     *            </p>
     */
    public void setIpv6AddressesPerInterface(Integer ipv6AddressesPerInterface) {
        this.ipv6AddressesPerInterface = ipv6AddressesPerInterface;
    }

    /**
     * <p>
     * The maximum number of IPv6 addresses per network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6AddressesPerInterface <p>
     *            The maximum number of IPv6 addresses per network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInfo withIpv6AddressesPerInterface(Integer ipv6AddressesPerInterface) {
        this.ipv6AddressesPerInterface = ipv6AddressesPerInterface;
        return this;
    }

    /**
     * <p>
     * Indicates whether IPv6 is supported.
     * </p>
     *
     * @return <p>
     *         Indicates whether IPv6 is supported.
     *         </p>
     */
    public Boolean isIpv6Supported() {
        return ipv6Supported;
    }

    /**
     * <p>
     * Indicates whether IPv6 is supported.
     * </p>
     *
     * @return <p>
     *         Indicates whether IPv6 is supported.
     *         </p>
     */
    public Boolean getIpv6Supported() {
        return ipv6Supported;
    }

    /**
     * <p>
     * Indicates whether IPv6 is supported.
     * </p>
     *
     * @param ipv6Supported <p>
     *            Indicates whether IPv6 is supported.
     *            </p>
     */
    public void setIpv6Supported(Boolean ipv6Supported) {
        this.ipv6Supported = ipv6Supported;
    }

    /**
     * <p>
     * Indicates whether IPv6 is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Supported <p>
     *            Indicates whether IPv6 is supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInfo withIpv6Supported(Boolean ipv6Supported) {
        this.ipv6Supported = ipv6Supported;
        return this;
    }

    /**
     * <p>
     * Indicates whether Elastic Network Adapter (ENA) is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported, required
     *
     * @return <p>
     *         Indicates whether Elastic Network Adapter (ENA) is supported.
     *         </p>
     * @see EnaSupport
     */
    public String getEnaSupport() {
        return enaSupport;
    }

    /**
     * <p>
     * Indicates whether Elastic Network Adapter (ENA) is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported, required
     *
     * @param enaSupport <p>
     *            Indicates whether Elastic Network Adapter (ENA) is supported.
     *            </p>
     * @see EnaSupport
     */
    public void setEnaSupport(String enaSupport) {
        this.enaSupport = enaSupport;
    }

    /**
     * <p>
     * Indicates whether Elastic Network Adapter (ENA) is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported, required
     *
     * @param enaSupport <p>
     *            Indicates whether Elastic Network Adapter (ENA) is supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnaSupport
     */
    public NetworkInfo withEnaSupport(String enaSupport) {
        this.enaSupport = enaSupport;
        return this;
    }

    /**
     * <p>
     * Indicates whether Elastic Network Adapter (ENA) is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported, required
     *
     * @param enaSupport <p>
     *            Indicates whether Elastic Network Adapter (ENA) is supported.
     *            </p>
     * @see EnaSupport
     */
    public void setEnaSupport(EnaSupport enaSupport) {
        this.enaSupport = enaSupport.toString();
    }

    /**
     * <p>
     * Indicates whether Elastic Network Adapter (ENA) is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported, required
     *
     * @param enaSupport <p>
     *            Indicates whether Elastic Network Adapter (ENA) is supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnaSupport
     */
    public NetworkInfo withEnaSupport(EnaSupport enaSupport) {
        this.enaSupport = enaSupport.toString();
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
        if (getNetworkPerformance() != null)
            sb.append("NetworkPerformance: " + getNetworkPerformance() + ",");
        if (getMaximumNetworkInterfaces() != null)
            sb.append("MaximumNetworkInterfaces: " + getMaximumNetworkInterfaces() + ",");
        if (getIpv4AddressesPerInterface() != null)
            sb.append("Ipv4AddressesPerInterface: " + getIpv4AddressesPerInterface() + ",");
        if (getIpv6AddressesPerInterface() != null)
            sb.append("Ipv6AddressesPerInterface: " + getIpv6AddressesPerInterface() + ",");
        if (getIpv6Supported() != null)
            sb.append("Ipv6Supported: " + getIpv6Supported() + ",");
        if (getEnaSupport() != null)
            sb.append("EnaSupport: " + getEnaSupport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNetworkPerformance() == null) ? 0 : getNetworkPerformance().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaximumNetworkInterfaces() == null) ? 0 : getMaximumNetworkInterfaces()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getIpv4AddressesPerInterface() == null) ? 0 : getIpv4AddressesPerInterface()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getIpv6AddressesPerInterface() == null) ? 0 : getIpv6AddressesPerInterface()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getIpv6Supported() == null) ? 0 : getIpv6Supported().hashCode());
        hashCode = prime * hashCode + ((getEnaSupport() == null) ? 0 : getEnaSupport().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkInfo == false)
            return false;
        NetworkInfo other = (NetworkInfo) obj;

        if (other.getNetworkPerformance() == null ^ this.getNetworkPerformance() == null)
            return false;
        if (other.getNetworkPerformance() != null
                && other.getNetworkPerformance().equals(this.getNetworkPerformance()) == false)
            return false;
        if (other.getMaximumNetworkInterfaces() == null
                ^ this.getMaximumNetworkInterfaces() == null)
            return false;
        if (other.getMaximumNetworkInterfaces() != null
                && other.getMaximumNetworkInterfaces().equals(this.getMaximumNetworkInterfaces()) == false)
            return false;
        if (other.getIpv4AddressesPerInterface() == null
                ^ this.getIpv4AddressesPerInterface() == null)
            return false;
        if (other.getIpv4AddressesPerInterface() != null
                && other.getIpv4AddressesPerInterface().equals(this.getIpv4AddressesPerInterface()) == false)
            return false;
        if (other.getIpv6AddressesPerInterface() == null
                ^ this.getIpv6AddressesPerInterface() == null)
            return false;
        if (other.getIpv6AddressesPerInterface() != null
                && other.getIpv6AddressesPerInterface().equals(this.getIpv6AddressesPerInterface()) == false)
            return false;
        if (other.getIpv6Supported() == null ^ this.getIpv6Supported() == null)
            return false;
        if (other.getIpv6Supported() != null
                && other.getIpv6Supported().equals(this.getIpv6Supported()) == false)
            return false;
        if (other.getEnaSupport() == null ^ this.getEnaSupport() == null)
            return false;
        if (other.getEnaSupport() != null
                && other.getEnaSupport().equals(this.getEnaSupport()) == false)
            return false;
        return true;
    }
}

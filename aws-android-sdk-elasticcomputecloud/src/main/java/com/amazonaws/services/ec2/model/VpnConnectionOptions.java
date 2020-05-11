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
 * Describes VPN connection options.
 * </p>
 */
public class VpnConnectionOptions implements Serializable {
    /**
     * <p>
     * Indicates whether acceleration is enabled for the VPN connection.
     * </p>
     */
    private Boolean enableAcceleration;

    /**
     * <p>
     * Indicates whether the VPN connection uses static routes only. Static
     * routes must be used for devices that don't support BGP.
     * </p>
     */
    private Boolean staticRoutesOnly;

    /**
     * <p>
     * Indicates the VPN tunnel options.
     * </p>
     */
    private java.util.List<TunnelOption> tunnelOptions;

    /**
     * <p>
     * Indicates whether acceleration is enabled for the VPN connection.
     * </p>
     *
     * @return <p>
     *         Indicates whether acceleration is enabled for the VPN connection.
     *         </p>
     */
    public Boolean isEnableAcceleration() {
        return enableAcceleration;
    }

    /**
     * <p>
     * Indicates whether acceleration is enabled for the VPN connection.
     * </p>
     *
     * @return <p>
     *         Indicates whether acceleration is enabled for the VPN connection.
     *         </p>
     */
    public Boolean getEnableAcceleration() {
        return enableAcceleration;
    }

    /**
     * <p>
     * Indicates whether acceleration is enabled for the VPN connection.
     * </p>
     *
     * @param enableAcceleration <p>
     *            Indicates whether acceleration is enabled for the VPN
     *            connection.
     *            </p>
     */
    public void setEnableAcceleration(Boolean enableAcceleration) {
        this.enableAcceleration = enableAcceleration;
    }

    /**
     * <p>
     * Indicates whether acceleration is enabled for the VPN connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableAcceleration <p>
     *            Indicates whether acceleration is enabled for the VPN
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnConnectionOptions withEnableAcceleration(Boolean enableAcceleration) {
        this.enableAcceleration = enableAcceleration;
        return this;
    }

    /**
     * <p>
     * Indicates whether the VPN connection uses static routes only. Static
     * routes must be used for devices that don't support BGP.
     * </p>
     *
     * @return <p>
     *         Indicates whether the VPN connection uses static routes only.
     *         Static routes must be used for devices that don't support BGP.
     *         </p>
     */
    public Boolean isStaticRoutesOnly() {
        return staticRoutesOnly;
    }

    /**
     * <p>
     * Indicates whether the VPN connection uses static routes only. Static
     * routes must be used for devices that don't support BGP.
     * </p>
     *
     * @return <p>
     *         Indicates whether the VPN connection uses static routes only.
     *         Static routes must be used for devices that don't support BGP.
     *         </p>
     */
    public Boolean getStaticRoutesOnly() {
        return staticRoutesOnly;
    }

    /**
     * <p>
     * Indicates whether the VPN connection uses static routes only. Static
     * routes must be used for devices that don't support BGP.
     * </p>
     *
     * @param staticRoutesOnly <p>
     *            Indicates whether the VPN connection uses static routes only.
     *            Static routes must be used for devices that don't support BGP.
     *            </p>
     */
    public void setStaticRoutesOnly(Boolean staticRoutesOnly) {
        this.staticRoutesOnly = staticRoutesOnly;
    }

    /**
     * <p>
     * Indicates whether the VPN connection uses static routes only. Static
     * routes must be used for devices that don't support BGP.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param staticRoutesOnly <p>
     *            Indicates whether the VPN connection uses static routes only.
     *            Static routes must be used for devices that don't support BGP.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnConnectionOptions withStaticRoutesOnly(Boolean staticRoutesOnly) {
        this.staticRoutesOnly = staticRoutesOnly;
        return this;
    }

    /**
     * <p>
     * Indicates the VPN tunnel options.
     * </p>
     *
     * @return <p>
     *         Indicates the VPN tunnel options.
     *         </p>
     */
    public java.util.List<TunnelOption> getTunnelOptions() {
        return tunnelOptions;
    }

    /**
     * <p>
     * Indicates the VPN tunnel options.
     * </p>
     *
     * @param tunnelOptions <p>
     *            Indicates the VPN tunnel options.
     *            </p>
     */
    public void setTunnelOptions(java.util.Collection<TunnelOption> tunnelOptions) {
        if (tunnelOptions == null) {
            this.tunnelOptions = null;
            return;
        }

        this.tunnelOptions = new java.util.ArrayList<TunnelOption>(tunnelOptions);
    }

    /**
     * <p>
     * Indicates the VPN tunnel options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tunnelOptions <p>
     *            Indicates the VPN tunnel options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnConnectionOptions withTunnelOptions(TunnelOption... tunnelOptions) {
        if (getTunnelOptions() == null) {
            this.tunnelOptions = new java.util.ArrayList<TunnelOption>(tunnelOptions.length);
        }
        for (TunnelOption value : tunnelOptions) {
            this.tunnelOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the VPN tunnel options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tunnelOptions <p>
     *            Indicates the VPN tunnel options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnConnectionOptions withTunnelOptions(java.util.Collection<TunnelOption> tunnelOptions) {
        setTunnelOptions(tunnelOptions);
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
        if (getEnableAcceleration() != null)
            sb.append("EnableAcceleration: " + getEnableAcceleration() + ",");
        if (getStaticRoutesOnly() != null)
            sb.append("StaticRoutesOnly: " + getStaticRoutesOnly() + ",");
        if (getTunnelOptions() != null)
            sb.append("TunnelOptions: " + getTunnelOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnableAcceleration() == null) ? 0 : getEnableAcceleration().hashCode());
        hashCode = prime * hashCode
                + ((getStaticRoutesOnly() == null) ? 0 : getStaticRoutesOnly().hashCode());
        hashCode = prime * hashCode
                + ((getTunnelOptions() == null) ? 0 : getTunnelOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpnConnectionOptions == false)
            return false;
        VpnConnectionOptions other = (VpnConnectionOptions) obj;

        if (other.getEnableAcceleration() == null ^ this.getEnableAcceleration() == null)
            return false;
        if (other.getEnableAcceleration() != null
                && other.getEnableAcceleration().equals(this.getEnableAcceleration()) == false)
            return false;
        if (other.getStaticRoutesOnly() == null ^ this.getStaticRoutesOnly() == null)
            return false;
        if (other.getStaticRoutesOnly() != null
                && other.getStaticRoutesOnly().equals(this.getStaticRoutesOnly()) == false)
            return false;
        if (other.getTunnelOptions() == null ^ this.getTunnelOptions() == null)
            return false;
        if (other.getTunnelOptions() != null
                && other.getTunnelOptions().equals(this.getTunnelOptions()) == false)
            return false;
        return true;
    }
}

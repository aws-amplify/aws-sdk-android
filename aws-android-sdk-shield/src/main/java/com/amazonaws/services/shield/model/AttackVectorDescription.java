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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the attack.
 * </p>
 */
public class AttackVectorDescription implements Serializable {
    /**
     * <p>
     * The attack type. Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UDP_TRAFFIC
     * </p>
     * </li>
     * <li>
     * <p>
     * UDP_FRAGMENT
     * </p>
     * </li>
     * <li>
     * <p>
     * GENERIC_UDP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * DNS_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * NTP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * CHARGEN_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * SSDP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * PORT_MAPPER
     * </p>
     * </li>
     * <li>
     * <p>
     * RIP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * SNMP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * MSSQL_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * NET_BIOS_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * SYN_FLOOD
     * </p>
     * </li>
     * <li>
     * <p>
     * ACK_FLOOD
     * </p>
     * </li>
     * <li>
     * <p>
     * REQUEST_FLOOD
     * </p>
     * </li>
     * <li>
     * <p>
     * HTTP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * UDS_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * MEMCACHED_REFLECTION
     * </p>
     * </li>
     * </ul>
     */
    private String vectorType;

    /**
     * <p>
     * The attack type. Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UDP_TRAFFIC
     * </p>
     * </li>
     * <li>
     * <p>
     * UDP_FRAGMENT
     * </p>
     * </li>
     * <li>
     * <p>
     * GENERIC_UDP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * DNS_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * NTP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * CHARGEN_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * SSDP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * PORT_MAPPER
     * </p>
     * </li>
     * <li>
     * <p>
     * RIP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * SNMP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * MSSQL_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * NET_BIOS_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * SYN_FLOOD
     * </p>
     * </li>
     * <li>
     * <p>
     * ACK_FLOOD
     * </p>
     * </li>
     * <li>
     * <p>
     * REQUEST_FLOOD
     * </p>
     * </li>
     * <li>
     * <p>
     * HTTP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * UDS_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * MEMCACHED_REFLECTION
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The attack type. Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         UDP_TRAFFIC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UDP_FRAGMENT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GENERIC_UDP_REFLECTION
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DNS_REFLECTION
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NTP_REFLECTION
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CHARGEN_REFLECTION
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSDP_REFLECTION
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PORT_MAPPER
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RIP_REFLECTION
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SNMP_REFLECTION
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MSSQL_REFLECTION
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NET_BIOS_REFLECTION
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SYN_FLOOD
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACK_FLOOD
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REQUEST_FLOOD
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HTTP_REFLECTION
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UDS_REFLECTION
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMCACHED_REFLECTION
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getVectorType() {
        return vectorType;
    }

    /**
     * <p>
     * The attack type. Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UDP_TRAFFIC
     * </p>
     * </li>
     * <li>
     * <p>
     * UDP_FRAGMENT
     * </p>
     * </li>
     * <li>
     * <p>
     * GENERIC_UDP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * DNS_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * NTP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * CHARGEN_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * SSDP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * PORT_MAPPER
     * </p>
     * </li>
     * <li>
     * <p>
     * RIP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * SNMP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * MSSQL_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * NET_BIOS_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * SYN_FLOOD
     * </p>
     * </li>
     * <li>
     * <p>
     * ACK_FLOOD
     * </p>
     * </li>
     * <li>
     * <p>
     * REQUEST_FLOOD
     * </p>
     * </li>
     * <li>
     * <p>
     * HTTP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * UDS_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * MEMCACHED_REFLECTION
     * </p>
     * </li>
     * </ul>
     *
     * @param vectorType <p>
     *            The attack type. Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            UDP_TRAFFIC
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UDP_FRAGMENT
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GENERIC_UDP_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DNS_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NTP_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CHARGEN_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SSDP_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PORT_MAPPER
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RIP_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SNMP_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            MSSQL_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NET_BIOS_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SYN_FLOOD
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ACK_FLOOD
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REQUEST_FLOOD
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            HTTP_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UDS_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            MEMCACHED_REFLECTION
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setVectorType(String vectorType) {
        this.vectorType = vectorType;
    }

    /**
     * <p>
     * The attack type. Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UDP_TRAFFIC
     * </p>
     * </li>
     * <li>
     * <p>
     * UDP_FRAGMENT
     * </p>
     * </li>
     * <li>
     * <p>
     * GENERIC_UDP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * DNS_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * NTP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * CHARGEN_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * SSDP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * PORT_MAPPER
     * </p>
     * </li>
     * <li>
     * <p>
     * RIP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * SNMP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * MSSQL_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * NET_BIOS_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * SYN_FLOOD
     * </p>
     * </li>
     * <li>
     * <p>
     * ACK_FLOOD
     * </p>
     * </li>
     * <li>
     * <p>
     * REQUEST_FLOOD
     * </p>
     * </li>
     * <li>
     * <p>
     * HTTP_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * UDS_REFLECTION
     * </p>
     * </li>
     * <li>
     * <p>
     * MEMCACHED_REFLECTION
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vectorType <p>
     *            The attack type. Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            UDP_TRAFFIC
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UDP_FRAGMENT
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GENERIC_UDP_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DNS_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NTP_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CHARGEN_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SSDP_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PORT_MAPPER
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RIP_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SNMP_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            MSSQL_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NET_BIOS_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SYN_FLOOD
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ACK_FLOOD
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REQUEST_FLOOD
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            HTTP_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UDS_REFLECTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            MEMCACHED_REFLECTION
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackVectorDescription withVectorType(String vectorType) {
        this.vectorType = vectorType;
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
        if (getVectorType() != null)
            sb.append("VectorType: " + getVectorType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVectorType() == null) ? 0 : getVectorType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttackVectorDescription == false)
            return false;
        AttackVectorDescription other = (AttackVectorDescription) obj;

        if (other.getVectorType() == null ^ this.getVectorType() == null)
            return false;
        if (other.getVectorType() != null
                && other.getVectorType().equals(this.getVectorType()) == false)
            return false;
        return true;
    }
}

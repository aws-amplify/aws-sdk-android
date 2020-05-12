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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

public class UpdateGatewayCapabilityConfigurationResult implements Serializable {
    /**
     * <p>
     * The namespace of the gateway capability.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>^[a-zA-Z]+:[a-zA-Z]+:[0-9]+$<br/>
     */
    private String capabilityNamespace;

    /**
     * <p>
     * The synchronization status of the capability configuration. The sync
     * status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_SYNC</code> – The gateway is running the capability
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYNC_FAILED</code> – The gateway rejected the capability
     * configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you update a capability configuration, its sync status is
     * <code>OUT_OF_SYNC</code> until the gateway receives and applies or
     * rejects the updated configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, OUT_OF_SYNC, SYNC_FAILED
     */
    private String capabilitySyncStatus;

    /**
     * <p>
     * The namespace of the gateway capability.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>^[a-zA-Z]+:[a-zA-Z]+:[0-9]+$<br/>
     *
     * @return <p>
     *         The namespace of the gateway capability.
     *         </p>
     */
    public String getCapabilityNamespace() {
        return capabilityNamespace;
    }

    /**
     * <p>
     * The namespace of the gateway capability.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>^[a-zA-Z]+:[a-zA-Z]+:[0-9]+$<br/>
     *
     * @param capabilityNamespace <p>
     *            The namespace of the gateway capability.
     *            </p>
     */
    public void setCapabilityNamespace(String capabilityNamespace) {
        this.capabilityNamespace = capabilityNamespace;
    }

    /**
     * <p>
     * The namespace of the gateway capability.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>^[a-zA-Z]+:[a-zA-Z]+:[0-9]+$<br/>
     *
     * @param capabilityNamespace <p>
     *            The namespace of the gateway capability.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGatewayCapabilityConfigurationResult withCapabilityNamespace(
            String capabilityNamespace) {
        this.capabilityNamespace = capabilityNamespace;
        return this;
    }

    /**
     * <p>
     * The synchronization status of the capability configuration. The sync
     * status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_SYNC</code> – The gateway is running the capability
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYNC_FAILED</code> – The gateway rejected the capability
     * configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you update a capability configuration, its sync status is
     * <code>OUT_OF_SYNC</code> until the gateway receives and applies or
     * rejects the updated configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, OUT_OF_SYNC, SYNC_FAILED
     *
     * @return <p>
     *         The synchronization status of the capability configuration. The
     *         sync status can be one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IN_SYNC</code> – The gateway is running the capability
     *         configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OUT_OF_SYNC</code> – The gateway hasn't received the
     *         capability configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SYNC_FAILED</code> – The gateway rejected the capability
     *         configuration.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         After you update a capability configuration, its sync status is
     *         <code>OUT_OF_SYNC</code> until the gateway receives and applies
     *         or rejects the updated configuration.
     *         </p>
     * @see CapabilitySyncStatus
     */
    public String getCapabilitySyncStatus() {
        return capabilitySyncStatus;
    }

    /**
     * <p>
     * The synchronization status of the capability configuration. The sync
     * status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_SYNC</code> – The gateway is running the capability
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYNC_FAILED</code> – The gateway rejected the capability
     * configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you update a capability configuration, its sync status is
     * <code>OUT_OF_SYNC</code> until the gateway receives and applies or
     * rejects the updated configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, OUT_OF_SYNC, SYNC_FAILED
     *
     * @param capabilitySyncStatus <p>
     *            The synchronization status of the capability configuration.
     *            The sync status can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code> – The gateway is running the capability
     *            configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OUT_OF_SYNC</code> – The gateway hasn't received the
     *            capability configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SYNC_FAILED</code> – The gateway rejected the capability
     *            configuration.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            After you update a capability configuration, its sync status
     *            is <code>OUT_OF_SYNC</code> until the gateway receives and
     *            applies or rejects the updated configuration.
     *            </p>
     * @see CapabilitySyncStatus
     */
    public void setCapabilitySyncStatus(String capabilitySyncStatus) {
        this.capabilitySyncStatus = capabilitySyncStatus;
    }

    /**
     * <p>
     * The synchronization status of the capability configuration. The sync
     * status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_SYNC</code> – The gateway is running the capability
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYNC_FAILED</code> – The gateway rejected the capability
     * configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you update a capability configuration, its sync status is
     * <code>OUT_OF_SYNC</code> until the gateway receives and applies or
     * rejects the updated configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, OUT_OF_SYNC, SYNC_FAILED
     *
     * @param capabilitySyncStatus <p>
     *            The synchronization status of the capability configuration.
     *            The sync status can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code> – The gateway is running the capability
     *            configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OUT_OF_SYNC</code> – The gateway hasn't received the
     *            capability configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SYNC_FAILED</code> – The gateway rejected the capability
     *            configuration.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            After you update a capability configuration, its sync status
     *            is <code>OUT_OF_SYNC</code> until the gateway receives and
     *            applies or rejects the updated configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapabilitySyncStatus
     */
    public UpdateGatewayCapabilityConfigurationResult withCapabilitySyncStatus(
            String capabilitySyncStatus) {
        this.capabilitySyncStatus = capabilitySyncStatus;
        return this;
    }

    /**
     * <p>
     * The synchronization status of the capability configuration. The sync
     * status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_SYNC</code> – The gateway is running the capability
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYNC_FAILED</code> – The gateway rejected the capability
     * configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you update a capability configuration, its sync status is
     * <code>OUT_OF_SYNC</code> until the gateway receives and applies or
     * rejects the updated configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, OUT_OF_SYNC, SYNC_FAILED
     *
     * @param capabilitySyncStatus <p>
     *            The synchronization status of the capability configuration.
     *            The sync status can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code> – The gateway is running the capability
     *            configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OUT_OF_SYNC</code> – The gateway hasn't received the
     *            capability configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SYNC_FAILED</code> – The gateway rejected the capability
     *            configuration.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            After you update a capability configuration, its sync status
     *            is <code>OUT_OF_SYNC</code> until the gateway receives and
     *            applies or rejects the updated configuration.
     *            </p>
     * @see CapabilitySyncStatus
     */
    public void setCapabilitySyncStatus(CapabilitySyncStatus capabilitySyncStatus) {
        this.capabilitySyncStatus = capabilitySyncStatus.toString();
    }

    /**
     * <p>
     * The synchronization status of the capability configuration. The sync
     * status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_SYNC</code> – The gateway is running the capability
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYNC_FAILED</code> – The gateway rejected the capability
     * configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you update a capability configuration, its sync status is
     * <code>OUT_OF_SYNC</code> until the gateway receives and applies or
     * rejects the updated configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, OUT_OF_SYNC, SYNC_FAILED
     *
     * @param capabilitySyncStatus <p>
     *            The synchronization status of the capability configuration.
     *            The sync status can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code> – The gateway is running the capability
     *            configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OUT_OF_SYNC</code> – The gateway hasn't received the
     *            capability configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SYNC_FAILED</code> – The gateway rejected the capability
     *            configuration.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            After you update a capability configuration, its sync status
     *            is <code>OUT_OF_SYNC</code> until the gateway receives and
     *            applies or rejects the updated configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapabilitySyncStatus
     */
    public UpdateGatewayCapabilityConfigurationResult withCapabilitySyncStatus(
            CapabilitySyncStatus capabilitySyncStatus) {
        this.capabilitySyncStatus = capabilitySyncStatus.toString();
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
        if (getCapabilityNamespace() != null)
            sb.append("capabilityNamespace: " + getCapabilityNamespace() + ",");
        if (getCapabilitySyncStatus() != null)
            sb.append("capabilitySyncStatus: " + getCapabilitySyncStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCapabilityNamespace() == null) ? 0 : getCapabilityNamespace().hashCode());
        hashCode = prime * hashCode
                + ((getCapabilitySyncStatus() == null) ? 0 : getCapabilitySyncStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGatewayCapabilityConfigurationResult == false)
            return false;
        UpdateGatewayCapabilityConfigurationResult other = (UpdateGatewayCapabilityConfigurationResult) obj;

        if (other.getCapabilityNamespace() == null ^ this.getCapabilityNamespace() == null)
            return false;
        if (other.getCapabilityNamespace() != null
                && other.getCapabilityNamespace().equals(this.getCapabilityNamespace()) == false)
            return false;
        if (other.getCapabilitySyncStatus() == null ^ this.getCapabilitySyncStatus() == null)
            return false;
        if (other.getCapabilitySyncStatus() != null
                && other.getCapabilitySyncStatus().equals(this.getCapabilitySyncStatus()) == false)
            return false;
        return true;
    }
}

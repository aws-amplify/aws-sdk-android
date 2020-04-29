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

package com.amazonaws.services.awsiotsitewise.model;

import java.io.Serializable;

public class DescribeGatewayCapabilityConfigurationResult implements Serializable {
    /**
     * <p>
     * The ID of the gateway that defines the capability configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String gatewayId;

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
     * The JSON document that defines the gateway capability's configuration.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     * >Configuring data sources (CLI)</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 204800<br/>
     */
    private String capabilityConfiguration;

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
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, OUT_OF_SYNC, SYNC_FAILED
     */
    private String capabilitySyncStatus;

    /**
     * <p>
     * The ID of the gateway that defines the capability configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the gateway that defines the capability configuration.
     *         </p>
     */
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * <p>
     * The ID of the gateway that defines the capability configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param gatewayId <p>
     *            The ID of the gateway that defines the capability
     *            configuration.
     *            </p>
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of the gateway that defines the capability configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param gatewayId <p>
     *            The ID of the gateway that defines the capability
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayCapabilityConfigurationResult withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
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
    public DescribeGatewayCapabilityConfigurationResult withCapabilityNamespace(
            String capabilityNamespace) {
        this.capabilityNamespace = capabilityNamespace;
        return this;
    }

    /**
     * <p>
     * The JSON document that defines the gateway capability's configuration.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     * >Configuring data sources (CLI)</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 204800<br/>
     *
     * @return <p>
     *         The JSON document that defines the gateway capability's
     *         configuration. For more information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     *         >Configuring data sources (CLI)</a> in the <i>AWS IoT SiteWise
     *         User Guide</i>.
     *         </p>
     */
    public String getCapabilityConfiguration() {
        return capabilityConfiguration;
    }

    /**
     * <p>
     * The JSON document that defines the gateway capability's configuration.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     * >Configuring data sources (CLI)</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 204800<br/>
     *
     * @param capabilityConfiguration <p>
     *            The JSON document that defines the gateway capability's
     *            configuration. For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     *            >Configuring data sources (CLI)</a> in the <i>AWS IoT SiteWise
     *            User Guide</i>.
     *            </p>
     */
    public void setCapabilityConfiguration(String capabilityConfiguration) {
        this.capabilityConfiguration = capabilityConfiguration;
    }

    /**
     * <p>
     * The JSON document that defines the gateway capability's configuration.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     * >Configuring data sources (CLI)</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 204800<br/>
     *
     * @param capabilityConfiguration <p>
     *            The JSON document that defines the gateway capability's
     *            configuration. For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     *            >Configuring data sources (CLI)</a> in the <i>AWS IoT SiteWise
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayCapabilityConfigurationResult withCapabilityConfiguration(
            String capabilityConfiguration) {
        this.capabilityConfiguration = capabilityConfiguration;
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapabilitySyncStatus
     */
    public DescribeGatewayCapabilityConfigurationResult withCapabilitySyncStatus(
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapabilitySyncStatus
     */
    public DescribeGatewayCapabilityConfigurationResult withCapabilitySyncStatus(
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
        if (getGatewayId() != null)
            sb.append("gatewayId: " + getGatewayId() + ",");
        if (getCapabilityNamespace() != null)
            sb.append("capabilityNamespace: " + getCapabilityNamespace() + ",");
        if (getCapabilityConfiguration() != null)
            sb.append("capabilityConfiguration: " + getCapabilityConfiguration() + ",");
        if (getCapabilitySyncStatus() != null)
            sb.append("capabilitySyncStatus: " + getCapabilitySyncStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getCapabilityNamespace() == null) ? 0 : getCapabilityNamespace().hashCode());
        hashCode = prime
                * hashCode
                + ((getCapabilityConfiguration() == null) ? 0 : getCapabilityConfiguration()
                        .hashCode());
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

        if (obj instanceof DescribeGatewayCapabilityConfigurationResult == false)
            return false;
        DescribeGatewayCapabilityConfigurationResult other = (DescribeGatewayCapabilityConfigurationResult) obj;

        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null
                && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getCapabilityNamespace() == null ^ this.getCapabilityNamespace() == null)
            return false;
        if (other.getCapabilityNamespace() != null
                && other.getCapabilityNamespace().equals(this.getCapabilityNamespace()) == false)
            return false;
        if (other.getCapabilityConfiguration() == null ^ this.getCapabilityConfiguration() == null)
            return false;
        if (other.getCapabilityConfiguration() != null
                && other.getCapabilityConfiguration().equals(this.getCapabilityConfiguration()) == false)
            return false;
        if (other.getCapabilitySyncStatus() == null ^ this.getCapabilitySyncStatus() == null)
            return false;
        if (other.getCapabilitySyncStatus() != null
                && other.getCapabilitySyncStatus().equals(this.getCapabilitySyncStatus()) == false)
            return false;
        return true;
    }
}

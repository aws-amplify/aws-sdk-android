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

/**
 * <p>
 * Contains a summary of a gateway.
 * </p>
 */
public class GatewaySummary implements Serializable {
    /**
     * <p>
     * The ID of the gateway device.
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
     * The name of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String gatewayName;

    /**
     * <p>
     * A list of gateway capability summaries that each contain a namespace and
     * status. Each gateway capability defines data sources for the gateway. To
     * retrieve a capability configuration's definition, use <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     * >DescribeGatewayCapabilityConfiguration</a>.
     * </p>
     */
    private java.util.List<GatewayCapabilitySummary> gatewayCapabilitySummaries;

    /**
     * <p>
     * The date the gateway was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date the gateway was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date lastUpdateDate;

    /**
     * <p>
     * The ID of the gateway device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the gateway device.
     *         </p>
     */
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * <p>
     * The ID of the gateway device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param gatewayId <p>
     *            The ID of the gateway device.
     *            </p>
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of the gateway device.
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
     *            The ID of the gateway device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GatewaySummary withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The name of the asset.
     *         </p>
     */
    public String getGatewayName() {
        return gatewayName;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param gatewayName <p>
     *            The name of the asset.
     *            </p>
     */
    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param gatewayName <p>
     *            The name of the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GatewaySummary withGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }

    /**
     * <p>
     * A list of gateway capability summaries that each contain a namespace and
     * status. Each gateway capability defines data sources for the gateway. To
     * retrieve a capability configuration's definition, use <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     * >DescribeGatewayCapabilityConfiguration</a>.
     * </p>
     *
     * @return <p>
     *         A list of gateway capability summaries that each contain a
     *         namespace and status. Each gateway capability defines data
     *         sources for the gateway. To retrieve a capability configuration's
     *         definition, use <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     *         >DescribeGatewayCapabilityConfiguration</a>.
     *         </p>
     */
    public java.util.List<GatewayCapabilitySummary> getGatewayCapabilitySummaries() {
        return gatewayCapabilitySummaries;
    }

    /**
     * <p>
     * A list of gateway capability summaries that each contain a namespace and
     * status. Each gateway capability defines data sources for the gateway. To
     * retrieve a capability configuration's definition, use <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     * >DescribeGatewayCapabilityConfiguration</a>.
     * </p>
     *
     * @param gatewayCapabilitySummaries <p>
     *            A list of gateway capability summaries that each contain a
     *            namespace and status. Each gateway capability defines data
     *            sources for the gateway. To retrieve a capability
     *            configuration's definition, use <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     *            >DescribeGatewayCapabilityConfiguration</a>.
     *            </p>
     */
    public void setGatewayCapabilitySummaries(
            java.util.Collection<GatewayCapabilitySummary> gatewayCapabilitySummaries) {
        if (gatewayCapabilitySummaries == null) {
            this.gatewayCapabilitySummaries = null;
            return;
        }

        this.gatewayCapabilitySummaries = new java.util.ArrayList<GatewayCapabilitySummary>(
                gatewayCapabilitySummaries);
    }

    /**
     * <p>
     * A list of gateway capability summaries that each contain a namespace and
     * status. Each gateway capability defines data sources for the gateway. To
     * retrieve a capability configuration's definition, use <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     * >DescribeGatewayCapabilityConfiguration</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gatewayCapabilitySummaries <p>
     *            A list of gateway capability summaries that each contain a
     *            namespace and status. Each gateway capability defines data
     *            sources for the gateway. To retrieve a capability
     *            configuration's definition, use <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     *            >DescribeGatewayCapabilityConfiguration</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GatewaySummary withGatewayCapabilitySummaries(
            GatewayCapabilitySummary... gatewayCapabilitySummaries) {
        if (getGatewayCapabilitySummaries() == null) {
            this.gatewayCapabilitySummaries = new java.util.ArrayList<GatewayCapabilitySummary>(
                    gatewayCapabilitySummaries.length);
        }
        for (GatewayCapabilitySummary value : gatewayCapabilitySummaries) {
            this.gatewayCapabilitySummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of gateway capability summaries that each contain a namespace and
     * status. Each gateway capability defines data sources for the gateway. To
     * retrieve a capability configuration's definition, use <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     * >DescribeGatewayCapabilityConfiguration</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gatewayCapabilitySummaries <p>
     *            A list of gateway capability summaries that each contain a
     *            namespace and status. Each gateway capability defines data
     *            sources for the gateway. To retrieve a capability
     *            configuration's definition, use <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html"
     *            >DescribeGatewayCapabilityConfiguration</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GatewaySummary withGatewayCapabilitySummaries(
            java.util.Collection<GatewayCapabilitySummary> gatewayCapabilitySummaries) {
        setGatewayCapabilitySummaries(gatewayCapabilitySummaries);
        return this;
    }

    /**
     * <p>
     * The date the gateway was created, in Unix epoch time.
     * </p>
     *
     * @return <p>
     *         The date the gateway was created, in Unix epoch time.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date the gateway was created, in Unix epoch time.
     * </p>
     *
     * @param creationDate <p>
     *            The date the gateway was created, in Unix epoch time.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the gateway was created, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date the gateway was created, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GatewaySummary withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date the gateway was last updated, in Unix epoch time.
     * </p>
     *
     * @return <p>
     *         The date the gateway was last updated, in Unix epoch time.
     *         </p>
     */
    public java.util.Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * <p>
     * The date the gateway was last updated, in Unix epoch time.
     * </p>
     *
     * @param lastUpdateDate <p>
     *            The date the gateway was last updated, in Unix epoch time.
     *            </p>
     */
    public void setLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * <p>
     * The date the gateway was last updated, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdateDate <p>
     *            The date the gateway was last updated, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GatewaySummary withLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
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
        if (getGatewayName() != null)
            sb.append("gatewayName: " + getGatewayName() + ",");
        if (getGatewayCapabilitySummaries() != null)
            sb.append("gatewayCapabilitySummaries: " + getGatewayCapabilitySummaries() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastUpdateDate() != null)
            sb.append("lastUpdateDate: " + getLastUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getGatewayName() == null) ? 0 : getGatewayName().hashCode());
        hashCode = prime
                * hashCode
                + ((getGatewayCapabilitySummaries() == null) ? 0 : getGatewayCapabilitySummaries()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewaySummary == false)
            return false;
        GatewaySummary other = (GatewaySummary) obj;

        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null
                && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getGatewayName() == null ^ this.getGatewayName() == null)
            return false;
        if (other.getGatewayName() != null
                && other.getGatewayName().equals(this.getGatewayName()) == false)
            return false;
        if (other.getGatewayCapabilitySummaries() == null
                ^ this.getGatewayCapabilitySummaries() == null)
            return false;
        if (other.getGatewayCapabilitySummaries() != null
                && other.getGatewayCapabilitySummaries().equals(
                        this.getGatewayCapabilitySummaries()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastUpdateDate() == null ^ this.getLastUpdateDate() == null)
            return false;
        if (other.getLastUpdateDate() != null
                && other.getLastUpdateDate().equals(this.getLastUpdateDate()) == false)
            return false;
        return true;
    }
}

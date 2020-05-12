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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves information about a gateway capability configuration. Each gateway
 * capability defines data sources for a gateway. A capability configuration can
 * contain multiple data source configurations. If you define OPC-UA sources for
 * a gateway in the AWS IoT SiteWise console, all of your OPC-UA sources are
 * stored in one capability configuration. To list all capability configurations
 * for a gateway, use <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGateway.html"
 * >DescribeGateway</a>.
 * </p>
 */
public class DescribeGatewayCapabilityConfigurationRequest extends AmazonWebServiceRequest
        implements Serializable {
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
     * The namespace of the capability configuration. For example, if you
     * configure OPC-UA sources from the AWS IoT SiteWise console, your OPC-UA
     * capability configuration has the namespace
     * <code>iotsitewise:opcuacollector:version</code>, where
     * <code>version</code> is a number such as <code>1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>^[a-zA-Z]+:[a-zA-Z]+:[0-9]+$<br/>
     */
    private String capabilityNamespace;

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
    public DescribeGatewayCapabilityConfigurationRequest withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * <p>
     * The namespace of the capability configuration. For example, if you
     * configure OPC-UA sources from the AWS IoT SiteWise console, your OPC-UA
     * capability configuration has the namespace
     * <code>iotsitewise:opcuacollector:version</code>, where
     * <code>version</code> is a number such as <code>1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>^[a-zA-Z]+:[a-zA-Z]+:[0-9]+$<br/>
     *
     * @return <p>
     *         The namespace of the capability configuration. For example, if
     *         you configure OPC-UA sources from the AWS IoT SiteWise console,
     *         your OPC-UA capability configuration has the namespace
     *         <code>iotsitewise:opcuacollector:version</code>, where
     *         <code>version</code> is a number such as <code>1</code>.
     *         </p>
     */
    public String getCapabilityNamespace() {
        return capabilityNamespace;
    }

    /**
     * <p>
     * The namespace of the capability configuration. For example, if you
     * configure OPC-UA sources from the AWS IoT SiteWise console, your OPC-UA
     * capability configuration has the namespace
     * <code>iotsitewise:opcuacollector:version</code>, where
     * <code>version</code> is a number such as <code>1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>^[a-zA-Z]+:[a-zA-Z]+:[0-9]+$<br/>
     *
     * @param capabilityNamespace <p>
     *            The namespace of the capability configuration. For example, if
     *            you configure OPC-UA sources from the AWS IoT SiteWise
     *            console, your OPC-UA capability configuration has the
     *            namespace <code>iotsitewise:opcuacollector:version</code>,
     *            where <code>version</code> is a number such as <code>1</code>.
     *            </p>
     */
    public void setCapabilityNamespace(String capabilityNamespace) {
        this.capabilityNamespace = capabilityNamespace;
    }

    /**
     * <p>
     * The namespace of the capability configuration. For example, if you
     * configure OPC-UA sources from the AWS IoT SiteWise console, your OPC-UA
     * capability configuration has the namespace
     * <code>iotsitewise:opcuacollector:version</code>, where
     * <code>version</code> is a number such as <code>1</code>.
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
     *            The namespace of the capability configuration. For example, if
     *            you configure OPC-UA sources from the AWS IoT SiteWise
     *            console, your OPC-UA capability configuration has the
     *            namespace <code>iotsitewise:opcuacollector:version</code>,
     *            where <code>version</code> is a number such as <code>1</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayCapabilityConfigurationRequest withCapabilityNamespace(
            String capabilityNamespace) {
        this.capabilityNamespace = capabilityNamespace;
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
            sb.append("capabilityNamespace: " + getCapabilityNamespace());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGatewayCapabilityConfigurationRequest == false)
            return false;
        DescribeGatewayCapabilityConfigurationRequest other = (DescribeGatewayCapabilityConfigurationRequest) obj;

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
        return true;
    }
}

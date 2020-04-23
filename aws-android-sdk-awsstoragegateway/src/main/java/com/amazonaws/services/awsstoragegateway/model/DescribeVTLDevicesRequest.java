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

package com.amazonaws.services.awsstoragegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a description of virtual tape library (VTL) devices for the specified
 * tape gateway. In the response, AWS Storage Gateway returns VTL device
 * information.
 * </p>
 * <p>
 * This operation is only supported in the tape gateway type.
 * </p>
 */
public class DescribeVTLDevicesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * <p>
     * An array of strings, where each string represents the Amazon Resource
     * Name (ARN) of a VTL device.
     * </p>
     * <note>
     * <p>
     * All of the specified VTL devices must be from the same gateway. If no VTL
     * devices are specified, the result will contain all devices on the
     * specified gateway.
     * </p>
     * </note>
     */
    private java.util.List<String> vTLDeviceARNs;

    /**
     * <p>
     * An opaque string that indicates the position at which to begin describing
     * the VTL devices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String marker;

    /**
     * <p>
     * Specifies that the number of VTL devices described be limited to the
     * specified number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer limit;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for
     *         your account and AWS Region.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVTLDevicesRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * An array of strings, where each string represents the Amazon Resource
     * Name (ARN) of a VTL device.
     * </p>
     * <note>
     * <p>
     * All of the specified VTL devices must be from the same gateway. If no VTL
     * devices are specified, the result will contain all devices on the
     * specified gateway.
     * </p>
     * </note>
     *
     * @return <p>
     *         An array of strings, where each string represents the Amazon
     *         Resource Name (ARN) of a VTL device.
     *         </p>
     *         <note>
     *         <p>
     *         All of the specified VTL devices must be from the same gateway.
     *         If no VTL devices are specified, the result will contain all
     *         devices on the specified gateway.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getVTLDeviceARNs() {
        return vTLDeviceARNs;
    }

    /**
     * <p>
     * An array of strings, where each string represents the Amazon Resource
     * Name (ARN) of a VTL device.
     * </p>
     * <note>
     * <p>
     * All of the specified VTL devices must be from the same gateway. If no VTL
     * devices are specified, the result will contain all devices on the
     * specified gateway.
     * </p>
     * </note>
     *
     * @param vTLDeviceARNs <p>
     *            An array of strings, where each string represents the Amazon
     *            Resource Name (ARN) of a VTL device.
     *            </p>
     *            <note>
     *            <p>
     *            All of the specified VTL devices must be from the same
     *            gateway. If no VTL devices are specified, the result will
     *            contain all devices on the specified gateway.
     *            </p>
     *            </note>
     */
    public void setVTLDeviceARNs(java.util.Collection<String> vTLDeviceARNs) {
        if (vTLDeviceARNs == null) {
            this.vTLDeviceARNs = null;
            return;
        }

        this.vTLDeviceARNs = new java.util.ArrayList<String>(vTLDeviceARNs);
    }

    /**
     * <p>
     * An array of strings, where each string represents the Amazon Resource
     * Name (ARN) of a VTL device.
     * </p>
     * <note>
     * <p>
     * All of the specified VTL devices must be from the same gateway. If no VTL
     * devices are specified, the result will contain all devices on the
     * specified gateway.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vTLDeviceARNs <p>
     *            An array of strings, where each string represents the Amazon
     *            Resource Name (ARN) of a VTL device.
     *            </p>
     *            <note>
     *            <p>
     *            All of the specified VTL devices must be from the same
     *            gateway. If no VTL devices are specified, the result will
     *            contain all devices on the specified gateway.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVTLDevicesRequest withVTLDeviceARNs(String... vTLDeviceARNs) {
        if (getVTLDeviceARNs() == null) {
            this.vTLDeviceARNs = new java.util.ArrayList<String>(vTLDeviceARNs.length);
        }
        for (String value : vTLDeviceARNs) {
            this.vTLDeviceARNs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings, where each string represents the Amazon Resource
     * Name (ARN) of a VTL device.
     * </p>
     * <note>
     * <p>
     * All of the specified VTL devices must be from the same gateway. If no VTL
     * devices are specified, the result will contain all devices on the
     * specified gateway.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vTLDeviceARNs <p>
     *            An array of strings, where each string represents the Amazon
     *            Resource Name (ARN) of a VTL device.
     *            </p>
     *            <note>
     *            <p>
     *            All of the specified VTL devices must be from the same
     *            gateway. If no VTL devices are specified, the result will
     *            contain all devices on the specified gateway.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVTLDevicesRequest withVTLDeviceARNs(java.util.Collection<String> vTLDeviceARNs) {
        setVTLDeviceARNs(vTLDeviceARNs);
        return this;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin describing
     * the VTL devices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         An opaque string that indicates the position at which to begin
     *         describing the VTL devices.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin describing
     * the VTL devices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            An opaque string that indicates the position at which to begin
     *            describing the VTL devices.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin describing
     * the VTL devices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            An opaque string that indicates the position at which to begin
     *            describing the VTL devices.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVTLDevicesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Specifies that the number of VTL devices described be limited to the
     * specified number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         Specifies that the number of VTL devices described be limited to
     *         the specified number.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * Specifies that the number of VTL devices described be limited to the
     * specified number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit <p>
     *            Specifies that the number of VTL devices described be limited
     *            to the specified number.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Specifies that the number of VTL devices described be limited to the
     * specified number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit <p>
     *            Specifies that the number of VTL devices described be limited
     *            to the specified number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVTLDevicesRequest withLimit(Integer limit) {
        this.limit = limit;
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getVTLDeviceARNs() != null)
            sb.append("VTLDeviceARNs: " + getVTLDeviceARNs() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode
                + ((getVTLDeviceARNs() == null) ? 0 : getVTLDeviceARNs().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVTLDevicesRequest == false)
            return false;
        DescribeVTLDevicesRequest other = (DescribeVTLDevicesRequest) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getVTLDeviceARNs() == null ^ this.getVTLDeviceARNs() == null)
            return false;
        if (other.getVTLDeviceARNs() != null
                && other.getVTLDeviceARNs().equals(this.getVTLDeviceARNs()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }
}

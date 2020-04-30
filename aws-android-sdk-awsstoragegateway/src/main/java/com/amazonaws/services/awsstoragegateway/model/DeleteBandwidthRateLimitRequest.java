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
 * Deletes the bandwidth rate limits of a gateway. You can delete either the
 * upload and download bandwidth rate limit, or you can delete both. If you
 * delete only one of the limits, the other limit remains unchanged. To specify
 * which gateway to work with, use the Amazon Resource Name (ARN) of the gateway
 * in your request. This operation is supported for the stored volume, cached
 * volume and tape gateway types.
 * </p>
 */
public class DeleteBandwidthRateLimitRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * One of the BandwidthType values that indicates the gateway bandwidth rate
     * limit to delete.
     * </p>
     * <p>
     * Valid Values: <code>Upload</code>, <code>Download</code>,
     * <code>All</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 25<br/>
     */
    private String bandwidthType;

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
    public DeleteBandwidthRateLimitRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * One of the BandwidthType values that indicates the gateway bandwidth rate
     * limit to delete.
     * </p>
     * <p>
     * Valid Values: <code>Upload</code>, <code>Download</code>,
     * <code>All</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 25<br/>
     *
     * @return <p>
     *         One of the BandwidthType values that indicates the gateway
     *         bandwidth rate limit to delete.
     *         </p>
     *         <p>
     *         Valid Values: <code>Upload</code>, <code>Download</code>,
     *         <code>All</code>.
     *         </p>
     */
    public String getBandwidthType() {
        return bandwidthType;
    }

    /**
     * <p>
     * One of the BandwidthType values that indicates the gateway bandwidth rate
     * limit to delete.
     * </p>
     * <p>
     * Valid Values: <code>Upload</code>, <code>Download</code>,
     * <code>All</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 25<br/>
     *
     * @param bandwidthType <p>
     *            One of the BandwidthType values that indicates the gateway
     *            bandwidth rate limit to delete.
     *            </p>
     *            <p>
     *            Valid Values: <code>Upload</code>, <code>Download</code>,
     *            <code>All</code>.
     *            </p>
     */
    public void setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
    }

    /**
     * <p>
     * One of the BandwidthType values that indicates the gateway bandwidth rate
     * limit to delete.
     * </p>
     * <p>
     * Valid Values: <code>Upload</code>, <code>Download</code>,
     * <code>All</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 25<br/>
     *
     * @param bandwidthType <p>
     *            One of the BandwidthType values that indicates the gateway
     *            bandwidth rate limit to delete.
     *            </p>
     *            <p>
     *            Valid Values: <code>Upload</code>, <code>Download</code>,
     *            <code>All</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteBandwidthRateLimitRequest withBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
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
        if (getBandwidthType() != null)
            sb.append("BandwidthType: " + getBandwidthType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode
                + ((getBandwidthType() == null) ? 0 : getBandwidthType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBandwidthRateLimitRequest == false)
            return false;
        DeleteBandwidthRateLimitRequest other = (DeleteBandwidthRateLimitRequest) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getBandwidthType() == null ^ this.getBandwidthType() == null)
            return false;
        if (other.getBandwidthType() != null
                && other.getBandwidthType().equals(this.getBandwidthType()) == false)
            return false;
        return true;
    }
}

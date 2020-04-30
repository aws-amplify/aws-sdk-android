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
 * Updates the bandwidth rate limits of a gateway. You can update both the
 * upload and download bandwidth rate limit or specify only one of the two. If
 * you don't set a bandwidth rate limit, the existing rate limit remains. This
 * operation is supported for the stored volume, cached volume and tape gateway
 * types.'
 * </p>
 * <p>
 * By default, a gateway's bandwidth rate limits are not set. If you don't set
 * any limit, the gateway does not have any limitations on its bandwidth usage
 * and could potentially use the maximum available bandwidth.
 * </p>
 * <p>
 * To specify which gateway to update, use the Amazon Resource Name (ARN) of the
 * gateway in your request.
 * </p>
 */
public class UpdateBandwidthRateLimitRequest extends AmazonWebServiceRequest implements
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
     * The average upload bandwidth rate limit in bits per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>51200 - <br/>
     */
    private Long averageUploadRateLimitInBitsPerSec;

    /**
     * <p>
     * The average download bandwidth rate limit in bits per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>102400 - <br/>
     */
    private Long averageDownloadRateLimitInBitsPerSec;

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
    public UpdateBandwidthRateLimitRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * The average upload bandwidth rate limit in bits per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>51200 - <br/>
     *
     * @return <p>
     *         The average upload bandwidth rate limit in bits per second.
     *         </p>
     */
    public Long getAverageUploadRateLimitInBitsPerSec() {
        return averageUploadRateLimitInBitsPerSec;
    }

    /**
     * <p>
     * The average upload bandwidth rate limit in bits per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>51200 - <br/>
     *
     * @param averageUploadRateLimitInBitsPerSec <p>
     *            The average upload bandwidth rate limit in bits per second.
     *            </p>
     */
    public void setAverageUploadRateLimitInBitsPerSec(Long averageUploadRateLimitInBitsPerSec) {
        this.averageUploadRateLimitInBitsPerSec = averageUploadRateLimitInBitsPerSec;
    }

    /**
     * <p>
     * The average upload bandwidth rate limit in bits per second.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>51200 - <br/>
     *
     * @param averageUploadRateLimitInBitsPerSec <p>
     *            The average upload bandwidth rate limit in bits per second.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateBandwidthRateLimitRequest withAverageUploadRateLimitInBitsPerSec(
            Long averageUploadRateLimitInBitsPerSec) {
        this.averageUploadRateLimitInBitsPerSec = averageUploadRateLimitInBitsPerSec;
        return this;
    }

    /**
     * <p>
     * The average download bandwidth rate limit in bits per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>102400 - <br/>
     *
     * @return <p>
     *         The average download bandwidth rate limit in bits per second.
     *         </p>
     */
    public Long getAverageDownloadRateLimitInBitsPerSec() {
        return averageDownloadRateLimitInBitsPerSec;
    }

    /**
     * <p>
     * The average download bandwidth rate limit in bits per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>102400 - <br/>
     *
     * @param averageDownloadRateLimitInBitsPerSec <p>
     *            The average download bandwidth rate limit in bits per second.
     *            </p>
     */
    public void setAverageDownloadRateLimitInBitsPerSec(Long averageDownloadRateLimitInBitsPerSec) {
        this.averageDownloadRateLimitInBitsPerSec = averageDownloadRateLimitInBitsPerSec;
    }

    /**
     * <p>
     * The average download bandwidth rate limit in bits per second.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>102400 - <br/>
     *
     * @param averageDownloadRateLimitInBitsPerSec <p>
     *            The average download bandwidth rate limit in bits per second.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateBandwidthRateLimitRequest withAverageDownloadRateLimitInBitsPerSec(
            Long averageDownloadRateLimitInBitsPerSec) {
        this.averageDownloadRateLimitInBitsPerSec = averageDownloadRateLimitInBitsPerSec;
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
        if (getAverageUploadRateLimitInBitsPerSec() != null)
            sb.append("AverageUploadRateLimitInBitsPerSec: "
                    + getAverageUploadRateLimitInBitsPerSec() + ",");
        if (getAverageDownloadRateLimitInBitsPerSec() != null)
            sb.append("AverageDownloadRateLimitInBitsPerSec: "
                    + getAverageDownloadRateLimitInBitsPerSec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getAverageUploadRateLimitInBitsPerSec() == null) ? 0
                        : getAverageUploadRateLimitInBitsPerSec().hashCode());
        hashCode = prime
                * hashCode
                + ((getAverageDownloadRateLimitInBitsPerSec() == null) ? 0
                        : getAverageDownloadRateLimitInBitsPerSec().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBandwidthRateLimitRequest == false)
            return false;
        UpdateBandwidthRateLimitRequest other = (UpdateBandwidthRateLimitRequest) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getAverageUploadRateLimitInBitsPerSec() == null
                ^ this.getAverageUploadRateLimitInBitsPerSec() == null)
            return false;
        if (other.getAverageUploadRateLimitInBitsPerSec() != null
                && other.getAverageUploadRateLimitInBitsPerSec().equals(
                        this.getAverageUploadRateLimitInBitsPerSec()) == false)
            return false;
        if (other.getAverageDownloadRateLimitInBitsPerSec() == null
                ^ this.getAverageDownloadRateLimitInBitsPerSec() == null)
            return false;
        if (other.getAverageDownloadRateLimitInBitsPerSec() != null
                && other.getAverageDownloadRateLimitInBitsPerSec().equals(
                        this.getAverageDownloadRateLimitInBitsPerSec()) == false)
            return false;
        return true;
    }
}

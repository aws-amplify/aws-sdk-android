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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

public class DescribeAvailabilityMonitorTestResult implements Serializable {
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
     * The status of the High Availability monitoring test. If a test hasn't
     * been performed, the value of this field is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, FAILED, PENDING
     */
    private String status;

    /**
     * <p>
     * The time the High Availability monitoring test was started. If a test
     * hasn't been performed, the value of this field is null.
     * </p>
     */
    private java.util.Date startTime;

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
    public DescribeAvailabilityMonitorTestResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * The status of the High Availability monitoring test. If a test hasn't
     * been performed, the value of this field is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, FAILED, PENDING
     *
     * @return <p>
     *         The status of the High Availability monitoring test. If a test
     *         hasn't been performed, the value of this field is null.
     *         </p>
     * @see AvailabilityMonitorTestStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the High Availability monitoring test. If a test hasn't
     * been performed, the value of this field is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, FAILED, PENDING
     *
     * @param status <p>
     *            The status of the High Availability monitoring test. If a test
     *            hasn't been performed, the value of this field is null.
     *            </p>
     * @see AvailabilityMonitorTestStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the High Availability monitoring test. If a test hasn't
     * been performed, the value of this field is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, FAILED, PENDING
     *
     * @param status <p>
     *            The status of the High Availability monitoring test. If a test
     *            hasn't been performed, the value of this field is null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AvailabilityMonitorTestStatus
     */
    public DescribeAvailabilityMonitorTestResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the High Availability monitoring test. If a test hasn't
     * been performed, the value of this field is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, FAILED, PENDING
     *
     * @param status <p>
     *            The status of the High Availability monitoring test. If a test
     *            hasn't been performed, the value of this field is null.
     *            </p>
     * @see AvailabilityMonitorTestStatus
     */
    public void setStatus(AvailabilityMonitorTestStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the High Availability monitoring test. If a test hasn't
     * been performed, the value of this field is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, FAILED, PENDING
     *
     * @param status <p>
     *            The status of the High Availability monitoring test. If a test
     *            hasn't been performed, the value of this field is null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AvailabilityMonitorTestStatus
     */
    public DescribeAvailabilityMonitorTestResult withStatus(AvailabilityMonitorTestStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time the High Availability monitoring test was started. If a test
     * hasn't been performed, the value of this field is null.
     * </p>
     *
     * @return <p>
     *         The time the High Availability monitoring test was started. If a
     *         test hasn't been performed, the value of this field is null.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The time the High Availability monitoring test was started. If a test
     * hasn't been performed, the value of this field is null.
     * </p>
     *
     * @param startTime <p>
     *            The time the High Availability monitoring test was started. If
     *            a test hasn't been performed, the value of this field is null.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the High Availability monitoring test was started. If a test
     * hasn't been performed, the value of this field is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The time the High Availability monitoring test was started. If
     *            a test hasn't been performed, the value of this field is null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAvailabilityMonitorTestResult withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAvailabilityMonitorTestResult == false)
            return false;
        DescribeAvailabilityMonitorTestResult other = (DescribeAvailabilityMonitorTestResult) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }
}

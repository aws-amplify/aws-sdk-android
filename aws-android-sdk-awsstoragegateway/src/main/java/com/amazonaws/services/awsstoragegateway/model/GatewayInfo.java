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

/**
 * <p>
 * Describes a gateway object.
 * </p>
 */
public class GatewayInfo implements Serializable {
    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID
     * becomes part of the gateway Amazon Resource Name (ARN), which you use as
     * input for other operations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     */
    private String gatewayId;

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
     * The type of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     */
    private String gatewayType;

    /**
     * <p>
     * The state of the gateway.
     * </p>
     * <p>
     * Valid Values: DISABLED or ACTIVE
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     */
    private String gatewayOperationalState;

    /**
     * <p>
     * The name of the gateway.
     * </p>
     */
    private String gatewayName;

    /**
     * <p>
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * </p>
     */
    private String ec2InstanceId;

    /**
     * <p>
     * The AWS Region where the Amazon EC2 instance is located.
     * </p>
     */
    private String ec2InstanceRegion;

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID
     * becomes part of the gateway Amazon Resource Name (ARN), which you use as
     * input for other operations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @return <p>
     *         The unique identifier assigned to your gateway during activation.
     *         This ID becomes part of the gateway Amazon Resource Name (ARN),
     *         which you use as input for other operations.
     *         </p>
     */
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID
     * becomes part of the gateway Amazon Resource Name (ARN), which you use as
     * input for other operations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param gatewayId <p>
     *            The unique identifier assigned to your gateway during
     *            activation. This ID becomes part of the gateway Amazon
     *            Resource Name (ARN), which you use as input for other
     *            operations.
     *            </p>
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID
     * becomes part of the gateway Amazon Resource Name (ARN), which you use as
     * input for other operations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param gatewayId <p>
     *            The unique identifier assigned to your gateway during
     *            activation. This ID becomes part of the gateway Amazon
     *            Resource Name (ARN), which you use as input for other
     *            operations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GatewayInfo withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
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
    public GatewayInfo withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * The type of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @return <p>
     *         The type of the gateway.
     *         </p>
     */
    public String getGatewayType() {
        return gatewayType;
    }

    /**
     * <p>
     * The type of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @param gatewayType <p>
     *            The type of the gateway.
     *            </p>
     */
    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
    }

    /**
     * <p>
     * The type of the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @param gatewayType <p>
     *            The type of the gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GatewayInfo withGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }

    /**
     * <p>
     * The state of the gateway.
     * </p>
     * <p>
     * Valid Values: DISABLED or ACTIVE
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     *
     * @return <p>
     *         The state of the gateway.
     *         </p>
     *         <p>
     *         Valid Values: DISABLED or ACTIVE
     *         </p>
     */
    public String getGatewayOperationalState() {
        return gatewayOperationalState;
    }

    /**
     * <p>
     * The state of the gateway.
     * </p>
     * <p>
     * Valid Values: DISABLED or ACTIVE
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     *
     * @param gatewayOperationalState <p>
     *            The state of the gateway.
     *            </p>
     *            <p>
     *            Valid Values: DISABLED or ACTIVE
     *            </p>
     */
    public void setGatewayOperationalState(String gatewayOperationalState) {
        this.gatewayOperationalState = gatewayOperationalState;
    }

    /**
     * <p>
     * The state of the gateway.
     * </p>
     * <p>
     * Valid Values: DISABLED or ACTIVE
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     *
     * @param gatewayOperationalState <p>
     *            The state of the gateway.
     *            </p>
     *            <p>
     *            Valid Values: DISABLED or ACTIVE
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GatewayInfo withGatewayOperationalState(String gatewayOperationalState) {
        this.gatewayOperationalState = gatewayOperationalState;
        return this;
    }

    /**
     * <p>
     * The name of the gateway.
     * </p>
     *
     * @return <p>
     *         The name of the gateway.
     *         </p>
     */
    public String getGatewayName() {
        return gatewayName;
    }

    /**
     * <p>
     * The name of the gateway.
     * </p>
     *
     * @param gatewayName <p>
     *            The name of the gateway.
     *            </p>
     */
    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    /**
     * <p>
     * The name of the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gatewayName <p>
     *            The name of the gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GatewayInfo withGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the Amazon EC2 instance that was used to launch the
     *         gateway.
     *         </p>
     */
    public String getEc2InstanceId() {
        return ec2InstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * </p>
     *
     * @param ec2InstanceId <p>
     *            The ID of the Amazon EC2 instance that was used to launch the
     *            gateway.
     *            </p>
     */
    public void setEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2InstanceId <p>
     *            The ID of the Amazon EC2 instance that was used to launch the
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GatewayInfo withEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
        return this;
    }

    /**
     * <p>
     * The AWS Region where the Amazon EC2 instance is located.
     * </p>
     *
     * @return <p>
     *         The AWS Region where the Amazon EC2 instance is located.
     *         </p>
     */
    public String getEc2InstanceRegion() {
        return ec2InstanceRegion;
    }

    /**
     * <p>
     * The AWS Region where the Amazon EC2 instance is located.
     * </p>
     *
     * @param ec2InstanceRegion <p>
     *            The AWS Region where the Amazon EC2 instance is located.
     *            </p>
     */
    public void setEc2InstanceRegion(String ec2InstanceRegion) {
        this.ec2InstanceRegion = ec2InstanceRegion;
    }

    /**
     * <p>
     * The AWS Region where the Amazon EC2 instance is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2InstanceRegion <p>
     *            The AWS Region where the Amazon EC2 instance is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GatewayInfo withEc2InstanceRegion(String ec2InstanceRegion) {
        this.ec2InstanceRegion = ec2InstanceRegion;
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
            sb.append("GatewayId: " + getGatewayId() + ",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getGatewayType() != null)
            sb.append("GatewayType: " + getGatewayType() + ",");
        if (getGatewayOperationalState() != null)
            sb.append("GatewayOperationalState: " + getGatewayOperationalState() + ",");
        if (getGatewayName() != null)
            sb.append("GatewayName: " + getGatewayName() + ",");
        if (getEc2InstanceId() != null)
            sb.append("Ec2InstanceId: " + getEc2InstanceId() + ",");
        if (getEc2InstanceRegion() != null)
            sb.append("Ec2InstanceRegion: " + getEc2InstanceRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode
                + ((getGatewayType() == null) ? 0 : getGatewayType().hashCode());
        hashCode = prime
                * hashCode
                + ((getGatewayOperationalState() == null) ? 0 : getGatewayOperationalState()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getGatewayName() == null) ? 0 : getGatewayName().hashCode());
        hashCode = prime * hashCode
                + ((getEc2InstanceId() == null) ? 0 : getEc2InstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getEc2InstanceRegion() == null) ? 0 : getEc2InstanceRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewayInfo == false)
            return false;
        GatewayInfo other = (GatewayInfo) obj;

        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null
                && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getGatewayType() == null ^ this.getGatewayType() == null)
            return false;
        if (other.getGatewayType() != null
                && other.getGatewayType().equals(this.getGatewayType()) == false)
            return false;
        if (other.getGatewayOperationalState() == null ^ this.getGatewayOperationalState() == null)
            return false;
        if (other.getGatewayOperationalState() != null
                && other.getGatewayOperationalState().equals(this.getGatewayOperationalState()) == false)
            return false;
        if (other.getGatewayName() == null ^ this.getGatewayName() == null)
            return false;
        if (other.getGatewayName() != null
                && other.getGatewayName().equals(this.getGatewayName()) == false)
            return false;
        if (other.getEc2InstanceId() == null ^ this.getEc2InstanceId() == null)
            return false;
        if (other.getEc2InstanceId() != null
                && other.getEc2InstanceId().equals(this.getEc2InstanceId()) == false)
            return false;
        if (other.getEc2InstanceRegion() == null ^ this.getEc2InstanceRegion() == null)
            return false;
        if (other.getEc2InstanceRegion() != null
                && other.getEc2InstanceRegion().equals(this.getEc2InstanceRegion()) == false)
            return false;
        return true;
    }
}

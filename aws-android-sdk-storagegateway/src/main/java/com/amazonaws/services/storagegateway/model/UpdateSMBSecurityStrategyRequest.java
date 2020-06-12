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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the SMB security strategy on a file gateway. This action is only
 * supported in file gateways.
 * </p>
 * <note>
 * <p>
 * This API is called Security level in the User Guide.
 * </p>
 * <p>
 * A higher security level can affect performance of the gateway.
 * </p>
 * </note>
 */
public class UpdateSMBSecurityStrategyRequest extends AmazonWebServiceRequest implements
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
     * Specifies the type of security strategy.
     * </p>
     * <p>
     * ClientSpecified: if you use this option, requests are established based
     * on what is negotiated by the client. This option is recommended when you
     * want to maximize compatibility across different clients in your
     * environment.
     * </p>
     * <p>
     * MandatorySigning: if you use this option, file gateway only allows
     * connections from SMBv2 or SMBv3 clients that have signing enabled. This
     * option works with SMB clients on Microsoft Windows Vista, Windows Server
     * 2008 or newer.
     * </p>
     * <p>
     * MandatoryEncryption: if you use this option, file gateway only allows
     * connections from SMBv3 clients that have encryption enabled. This option
     * is highly recommended for environments that handle sensitive data. This
     * option works with SMB clients on Microsoft Windows 8, Windows Server 2012
     * or newer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientSpecified, MandatorySigning,
     * MandatoryEncryption
     */
    private String sMBSecurityStrategy;

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
    public UpdateSMBSecurityStrategyRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * Specifies the type of security strategy.
     * </p>
     * <p>
     * ClientSpecified: if you use this option, requests are established based
     * on what is negotiated by the client. This option is recommended when you
     * want to maximize compatibility across different clients in your
     * environment.
     * </p>
     * <p>
     * MandatorySigning: if you use this option, file gateway only allows
     * connections from SMBv2 or SMBv3 clients that have signing enabled. This
     * option works with SMB clients on Microsoft Windows Vista, Windows Server
     * 2008 or newer.
     * </p>
     * <p>
     * MandatoryEncryption: if you use this option, file gateway only allows
     * connections from SMBv3 clients that have encryption enabled. This option
     * is highly recommended for environments that handle sensitive data. This
     * option works with SMB clients on Microsoft Windows 8, Windows Server 2012
     * or newer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientSpecified, MandatorySigning,
     * MandatoryEncryption
     *
     * @return <p>
     *         Specifies the type of security strategy.
     *         </p>
     *         <p>
     *         ClientSpecified: if you use this option, requests are established
     *         based on what is negotiated by the client. This option is
     *         recommended when you want to maximize compatibility across
     *         different clients in your environment.
     *         </p>
     *         <p>
     *         MandatorySigning: if you use this option, file gateway only
     *         allows connections from SMBv2 or SMBv3 clients that have signing
     *         enabled. This option works with SMB clients on Microsoft Windows
     *         Vista, Windows Server 2008 or newer.
     *         </p>
     *         <p>
     *         MandatoryEncryption: if you use this option, file gateway only
     *         allows connections from SMBv3 clients that have encryption
     *         enabled. This option is highly recommended for environments that
     *         handle sensitive data. This option works with SMB clients on
     *         Microsoft Windows 8, Windows Server 2012 or newer.
     *         </p>
     * @see SMBSecurityStrategy
     */
    public String getSMBSecurityStrategy() {
        return sMBSecurityStrategy;
    }

    /**
     * <p>
     * Specifies the type of security strategy.
     * </p>
     * <p>
     * ClientSpecified: if you use this option, requests are established based
     * on what is negotiated by the client. This option is recommended when you
     * want to maximize compatibility across different clients in your
     * environment.
     * </p>
     * <p>
     * MandatorySigning: if you use this option, file gateway only allows
     * connections from SMBv2 or SMBv3 clients that have signing enabled. This
     * option works with SMB clients on Microsoft Windows Vista, Windows Server
     * 2008 or newer.
     * </p>
     * <p>
     * MandatoryEncryption: if you use this option, file gateway only allows
     * connections from SMBv3 clients that have encryption enabled. This option
     * is highly recommended for environments that handle sensitive data. This
     * option works with SMB clients on Microsoft Windows 8, Windows Server 2012
     * or newer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientSpecified, MandatorySigning,
     * MandatoryEncryption
     *
     * @param sMBSecurityStrategy <p>
     *            Specifies the type of security strategy.
     *            </p>
     *            <p>
     *            ClientSpecified: if you use this option, requests are
     *            established based on what is negotiated by the client. This
     *            option is recommended when you want to maximize compatibility
     *            across different clients in your environment.
     *            </p>
     *            <p>
     *            MandatorySigning: if you use this option, file gateway only
     *            allows connections from SMBv2 or SMBv3 clients that have
     *            signing enabled. This option works with SMB clients on
     *            Microsoft Windows Vista, Windows Server 2008 or newer.
     *            </p>
     *            <p>
     *            MandatoryEncryption: if you use this option, file gateway only
     *            allows connections from SMBv3 clients that have encryption
     *            enabled. This option is highly recommended for environments
     *            that handle sensitive data. This option works with SMB clients
     *            on Microsoft Windows 8, Windows Server 2012 or newer.
     *            </p>
     * @see SMBSecurityStrategy
     */
    public void setSMBSecurityStrategy(String sMBSecurityStrategy) {
        this.sMBSecurityStrategy = sMBSecurityStrategy;
    }

    /**
     * <p>
     * Specifies the type of security strategy.
     * </p>
     * <p>
     * ClientSpecified: if you use this option, requests are established based
     * on what is negotiated by the client. This option is recommended when you
     * want to maximize compatibility across different clients in your
     * environment.
     * </p>
     * <p>
     * MandatorySigning: if you use this option, file gateway only allows
     * connections from SMBv2 or SMBv3 clients that have signing enabled. This
     * option works with SMB clients on Microsoft Windows Vista, Windows Server
     * 2008 or newer.
     * </p>
     * <p>
     * MandatoryEncryption: if you use this option, file gateway only allows
     * connections from SMBv3 clients that have encryption enabled. This option
     * is highly recommended for environments that handle sensitive data. This
     * option works with SMB clients on Microsoft Windows 8, Windows Server 2012
     * or newer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientSpecified, MandatorySigning,
     * MandatoryEncryption
     *
     * @param sMBSecurityStrategy <p>
     *            Specifies the type of security strategy.
     *            </p>
     *            <p>
     *            ClientSpecified: if you use this option, requests are
     *            established based on what is negotiated by the client. This
     *            option is recommended when you want to maximize compatibility
     *            across different clients in your environment.
     *            </p>
     *            <p>
     *            MandatorySigning: if you use this option, file gateway only
     *            allows connections from SMBv2 or SMBv3 clients that have
     *            signing enabled. This option works with SMB clients on
     *            Microsoft Windows Vista, Windows Server 2008 or newer.
     *            </p>
     *            <p>
     *            MandatoryEncryption: if you use this option, file gateway only
     *            allows connections from SMBv3 clients that have encryption
     *            enabled. This option is highly recommended for environments
     *            that handle sensitive data. This option works with SMB clients
     *            on Microsoft Windows 8, Windows Server 2012 or newer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SMBSecurityStrategy
     */
    public UpdateSMBSecurityStrategyRequest withSMBSecurityStrategy(String sMBSecurityStrategy) {
        this.sMBSecurityStrategy = sMBSecurityStrategy;
        return this;
    }

    /**
     * <p>
     * Specifies the type of security strategy.
     * </p>
     * <p>
     * ClientSpecified: if you use this option, requests are established based
     * on what is negotiated by the client. This option is recommended when you
     * want to maximize compatibility across different clients in your
     * environment.
     * </p>
     * <p>
     * MandatorySigning: if you use this option, file gateway only allows
     * connections from SMBv2 or SMBv3 clients that have signing enabled. This
     * option works with SMB clients on Microsoft Windows Vista, Windows Server
     * 2008 or newer.
     * </p>
     * <p>
     * MandatoryEncryption: if you use this option, file gateway only allows
     * connections from SMBv3 clients that have encryption enabled. This option
     * is highly recommended for environments that handle sensitive data. This
     * option works with SMB clients on Microsoft Windows 8, Windows Server 2012
     * or newer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientSpecified, MandatorySigning,
     * MandatoryEncryption
     *
     * @param sMBSecurityStrategy <p>
     *            Specifies the type of security strategy.
     *            </p>
     *            <p>
     *            ClientSpecified: if you use this option, requests are
     *            established based on what is negotiated by the client. This
     *            option is recommended when you want to maximize compatibility
     *            across different clients in your environment.
     *            </p>
     *            <p>
     *            MandatorySigning: if you use this option, file gateway only
     *            allows connections from SMBv2 or SMBv3 clients that have
     *            signing enabled. This option works with SMB clients on
     *            Microsoft Windows Vista, Windows Server 2008 or newer.
     *            </p>
     *            <p>
     *            MandatoryEncryption: if you use this option, file gateway only
     *            allows connections from SMBv3 clients that have encryption
     *            enabled. This option is highly recommended for environments
     *            that handle sensitive data. This option works with SMB clients
     *            on Microsoft Windows 8, Windows Server 2012 or newer.
     *            </p>
     * @see SMBSecurityStrategy
     */
    public void setSMBSecurityStrategy(SMBSecurityStrategy sMBSecurityStrategy) {
        this.sMBSecurityStrategy = sMBSecurityStrategy.toString();
    }

    /**
     * <p>
     * Specifies the type of security strategy.
     * </p>
     * <p>
     * ClientSpecified: if you use this option, requests are established based
     * on what is negotiated by the client. This option is recommended when you
     * want to maximize compatibility across different clients in your
     * environment.
     * </p>
     * <p>
     * MandatorySigning: if you use this option, file gateway only allows
     * connections from SMBv2 or SMBv3 clients that have signing enabled. This
     * option works with SMB clients on Microsoft Windows Vista, Windows Server
     * 2008 or newer.
     * </p>
     * <p>
     * MandatoryEncryption: if you use this option, file gateway only allows
     * connections from SMBv3 clients that have encryption enabled. This option
     * is highly recommended for environments that handle sensitive data. This
     * option works with SMB clients on Microsoft Windows 8, Windows Server 2012
     * or newer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientSpecified, MandatorySigning,
     * MandatoryEncryption
     *
     * @param sMBSecurityStrategy <p>
     *            Specifies the type of security strategy.
     *            </p>
     *            <p>
     *            ClientSpecified: if you use this option, requests are
     *            established based on what is negotiated by the client. This
     *            option is recommended when you want to maximize compatibility
     *            across different clients in your environment.
     *            </p>
     *            <p>
     *            MandatorySigning: if you use this option, file gateway only
     *            allows connections from SMBv2 or SMBv3 clients that have
     *            signing enabled. This option works with SMB clients on
     *            Microsoft Windows Vista, Windows Server 2008 or newer.
     *            </p>
     *            <p>
     *            MandatoryEncryption: if you use this option, file gateway only
     *            allows connections from SMBv3 clients that have encryption
     *            enabled. This option is highly recommended for environments
     *            that handle sensitive data. This option works with SMB clients
     *            on Microsoft Windows 8, Windows Server 2012 or newer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SMBSecurityStrategy
     */
    public UpdateSMBSecurityStrategyRequest withSMBSecurityStrategy(
            SMBSecurityStrategy sMBSecurityStrategy) {
        this.sMBSecurityStrategy = sMBSecurityStrategy.toString();
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
        if (getSMBSecurityStrategy() != null)
            sb.append("SMBSecurityStrategy: " + getSMBSecurityStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode
                + ((getSMBSecurityStrategy() == null) ? 0 : getSMBSecurityStrategy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSMBSecurityStrategyRequest == false)
            return false;
        UpdateSMBSecurityStrategyRequest other = (UpdateSMBSecurityStrategyRequest) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getSMBSecurityStrategy() == null ^ this.getSMBSecurityStrategy() == null)
            return false;
        if (other.getSMBSecurityStrategy() != null
                && other.getSMBSecurityStrategy().equals(this.getSMBSecurityStrategy()) == false)
            return false;
        return true;
    }
}

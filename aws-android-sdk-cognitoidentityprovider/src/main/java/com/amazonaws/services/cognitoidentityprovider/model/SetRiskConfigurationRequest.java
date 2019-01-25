/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Configures actions on detected risks. To delete the risk configuration for
 * <code>UserPoolId</code> or <code>ClientId</code>, pass null values for all
 * four configuration types.
 * </p>
 * <p>
 * To enable Amazon Cognito advanced security features, update the user pool to
 * include the <code>UserPoolAddOns</code> key<code>AdvancedSecurityMode</code>.
 * </p>
 * <p>
 * See .
 * </p>
 */
public class SetRiskConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The app client ID. If <code>ClientId</code> is null, then the risk
     * configuration is mapped to <code>userPoolId</code>. When the client ID is
     * null, the same risk configuration is applied to all the clients in the
     * userPool.
     * </p>
     * <p>
     * Otherwise, <code>ClientId</code> is mapped to the client. When the client
     * ID is not null, the user pool configuration is overridden and the risk
     * configuration for the client is used instead.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     */
    private String clientId;

    /**
     * <p>
     * The compromised credentials risk configuration.
     * </p>
     */
    private CompromisedCredentialsRiskConfigurationType compromisedCredentialsRiskConfiguration;

    /**
     * <p>
     * The account takeover risk configuration.
     * </p>
     */
    private AccountTakeoverRiskConfigurationType accountTakeoverRiskConfiguration;

    /**
     * <p>
     * The configuration to override the risk decision.
     * </p>
     */
    private RiskExceptionConfigurationType riskExceptionConfiguration;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetRiskConfigurationRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The app client ID. If <code>ClientId</code> is null, then the risk
     * configuration is mapped to <code>userPoolId</code>. When the client ID is
     * null, the same risk configuration is applied to all the clients in the
     * userPool.
     * </p>
     * <p>
     * Otherwise, <code>ClientId</code> is mapped to the client. When the client
     * ID is not null, the user pool configuration is overridden and the risk
     * configuration for the client is used instead.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @return <p>
     *         The app client ID. If <code>ClientId</code> is null, then the
     *         risk configuration is mapped to <code>userPoolId</code>. When the
     *         client ID is null, the same risk configuration is applied to all
     *         the clients in the userPool.
     *         </p>
     *         <p>
     *         Otherwise, <code>ClientId</code> is mapped to the client. When
     *         the client ID is not null, the user pool configuration is
     *         overridden and the risk configuration for the client is used
     *         instead.
     *         </p>
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <p>
     * The app client ID. If <code>ClientId</code> is null, then the risk
     * configuration is mapped to <code>userPoolId</code>. When the client ID is
     * null, the same risk configuration is applied to all the clients in the
     * userPool.
     * </p>
     * <p>
     * Otherwise, <code>ClientId</code> is mapped to the client. When the client
     * ID is not null, the user pool configuration is overridden and the risk
     * configuration for the client is used instead.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            The app client ID. If <code>ClientId</code> is null, then the
     *            risk configuration is mapped to <code>userPoolId</code>. When
     *            the client ID is null, the same risk configuration is applied
     *            to all the clients in the userPool.
     *            </p>
     *            <p>
     *            Otherwise, <code>ClientId</code> is mapped to the client. When
     *            the client ID is not null, the user pool configuration is
     *            overridden and the risk configuration for the client is used
     *            instead.
     *            </p>
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The app client ID. If <code>ClientId</code> is null, then the risk
     * configuration is mapped to <code>userPoolId</code>. When the client ID is
     * null, the same risk configuration is applied to all the clients in the
     * userPool.
     * </p>
     * <p>
     * Otherwise, <code>ClientId</code> is mapped to the client. When the client
     * ID is not null, the user pool configuration is overridden and the risk
     * configuration for the client is used instead.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            The app client ID. If <code>ClientId</code> is null, then the
     *            risk configuration is mapped to <code>userPoolId</code>. When
     *            the client ID is null, the same risk configuration is applied
     *            to all the clients in the userPool.
     *            </p>
     *            <p>
     *            Otherwise, <code>ClientId</code> is mapped to the client. When
     *            the client ID is not null, the user pool configuration is
     *            overridden and the risk configuration for the client is used
     *            instead.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetRiskConfigurationRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * <p>
     * The compromised credentials risk configuration.
     * </p>
     *
     * @return <p>
     *         The compromised credentials risk configuration.
     *         </p>
     */
    public CompromisedCredentialsRiskConfigurationType getCompromisedCredentialsRiskConfiguration() {
        return compromisedCredentialsRiskConfiguration;
    }

    /**
     * <p>
     * The compromised credentials risk configuration.
     * </p>
     *
     * @param compromisedCredentialsRiskConfiguration <p>
     *            The compromised credentials risk configuration.
     *            </p>
     */
    public void setCompromisedCredentialsRiskConfiguration(
            CompromisedCredentialsRiskConfigurationType compromisedCredentialsRiskConfiguration) {
        this.compromisedCredentialsRiskConfiguration = compromisedCredentialsRiskConfiguration;
    }

    /**
     * <p>
     * The compromised credentials risk configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compromisedCredentialsRiskConfiguration <p>
     *            The compromised credentials risk configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetRiskConfigurationRequest withCompromisedCredentialsRiskConfiguration(
            CompromisedCredentialsRiskConfigurationType compromisedCredentialsRiskConfiguration) {
        this.compromisedCredentialsRiskConfiguration = compromisedCredentialsRiskConfiguration;
        return this;
    }

    /**
     * <p>
     * The account takeover risk configuration.
     * </p>
     *
     * @return <p>
     *         The account takeover risk configuration.
     *         </p>
     */
    public AccountTakeoverRiskConfigurationType getAccountTakeoverRiskConfiguration() {
        return accountTakeoverRiskConfiguration;
    }

    /**
     * <p>
     * The account takeover risk configuration.
     * </p>
     *
     * @param accountTakeoverRiskConfiguration <p>
     *            The account takeover risk configuration.
     *            </p>
     */
    public void setAccountTakeoverRiskConfiguration(
            AccountTakeoverRiskConfigurationType accountTakeoverRiskConfiguration) {
        this.accountTakeoverRiskConfiguration = accountTakeoverRiskConfiguration;
    }

    /**
     * <p>
     * The account takeover risk configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountTakeoverRiskConfiguration <p>
     *            The account takeover risk configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetRiskConfigurationRequest withAccountTakeoverRiskConfiguration(
            AccountTakeoverRiskConfigurationType accountTakeoverRiskConfiguration) {
        this.accountTakeoverRiskConfiguration = accountTakeoverRiskConfiguration;
        return this;
    }

    /**
     * <p>
     * The configuration to override the risk decision.
     * </p>
     *
     * @return <p>
     *         The configuration to override the risk decision.
     *         </p>
     */
    public RiskExceptionConfigurationType getRiskExceptionConfiguration() {
        return riskExceptionConfiguration;
    }

    /**
     * <p>
     * The configuration to override the risk decision.
     * </p>
     *
     * @param riskExceptionConfiguration <p>
     *            The configuration to override the risk decision.
     *            </p>
     */
    public void setRiskExceptionConfiguration(
            RiskExceptionConfigurationType riskExceptionConfiguration) {
        this.riskExceptionConfiguration = riskExceptionConfiguration;
    }

    /**
     * <p>
     * The configuration to override the risk decision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param riskExceptionConfiguration <p>
     *            The configuration to override the risk decision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetRiskConfigurationRequest withRiskExceptionConfiguration(
            RiskExceptionConfigurationType riskExceptionConfiguration) {
        this.riskExceptionConfiguration = riskExceptionConfiguration;
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getCompromisedCredentialsRiskConfiguration() != null)
            sb.append("CompromisedCredentialsRiskConfiguration: "
                    + getCompromisedCredentialsRiskConfiguration() + ",");
        if (getAccountTakeoverRiskConfiguration() != null)
            sb.append("AccountTakeoverRiskConfiguration: " + getAccountTakeoverRiskConfiguration()
                    + ",");
        if (getRiskExceptionConfiguration() != null)
            sb.append("RiskExceptionConfiguration: " + getRiskExceptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCompromisedCredentialsRiskConfiguration() == null) ? 0
                        : getCompromisedCredentialsRiskConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getAccountTakeoverRiskConfiguration() == null) ? 0
                        : getAccountTakeoverRiskConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getRiskExceptionConfiguration() == null) ? 0 : getRiskExceptionConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetRiskConfigurationRequest == false)
            return false;
        SetRiskConfigurationRequest other = (SetRiskConfigurationRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getCompromisedCredentialsRiskConfiguration() == null
                ^ this.getCompromisedCredentialsRiskConfiguration() == null)
            return false;
        if (other.getCompromisedCredentialsRiskConfiguration() != null
                && other.getCompromisedCredentialsRiskConfiguration().equals(
                        this.getCompromisedCredentialsRiskConfiguration()) == false)
            return false;
        if (other.getAccountTakeoverRiskConfiguration() == null
                ^ this.getAccountTakeoverRiskConfiguration() == null)
            return false;
        if (other.getAccountTakeoverRiskConfiguration() != null
                && other.getAccountTakeoverRiskConfiguration().equals(
                        this.getAccountTakeoverRiskConfiguration()) == false)
            return false;
        if (other.getRiskExceptionConfiguration() == null
                ^ this.getRiskExceptionConfiguration() == null)
            return false;
        if (other.getRiskExceptionConfiguration() != null
                && other.getRiskExceptionConfiguration().equals(
                        this.getRiskExceptionConfiguration()) == false)
            return false;
        return true;
    }
}

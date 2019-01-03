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

/**
 * <p>
 * The risk configuration type.
 * </p>
 */
public class RiskConfigurationType implements Serializable {
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
     * The app client ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     */
    private String clientId;

    /**
     * <p>
     * The compromised credentials risk configuration object including the
     * <code>EventFilter</code> and the <code>EventAction</code>
     * </p>
     */
    private CompromisedCredentialsRiskConfigurationType compromisedCredentialsRiskConfiguration;

    /**
     * <p>
     * The account takeover risk configuration object including the
     * <code>NotifyConfiguration</code> object and <code>Actions</code> to take
     * in the case of an account takeover.
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
     * The last modified date.
     * </p>
     */
    private java.util.Date lastModifiedDate;

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
    public RiskConfigurationType withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The app client ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @return <p>
     *         The app client ID.
     *         </p>
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <p>
     * The app client ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            The app client ID.
     *            </p>
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The app client ID.
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
     *            The app client ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RiskConfigurationType withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * <p>
     * The compromised credentials risk configuration object including the
     * <code>EventFilter</code> and the <code>EventAction</code>
     * </p>
     *
     * @return <p>
     *         The compromised credentials risk configuration object including
     *         the <code>EventFilter</code> and the <code>EventAction</code>
     *         </p>
     */
    public CompromisedCredentialsRiskConfigurationType getCompromisedCredentialsRiskConfiguration() {
        return compromisedCredentialsRiskConfiguration;
    }

    /**
     * <p>
     * The compromised credentials risk configuration object including the
     * <code>EventFilter</code> and the <code>EventAction</code>
     * </p>
     *
     * @param compromisedCredentialsRiskConfiguration <p>
     *            The compromised credentials risk configuration object
     *            including the <code>EventFilter</code> and the
     *            <code>EventAction</code>
     *            </p>
     */
    public void setCompromisedCredentialsRiskConfiguration(
            CompromisedCredentialsRiskConfigurationType compromisedCredentialsRiskConfiguration) {
        this.compromisedCredentialsRiskConfiguration = compromisedCredentialsRiskConfiguration;
    }

    /**
     * <p>
     * The compromised credentials risk configuration object including the
     * <code>EventFilter</code> and the <code>EventAction</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compromisedCredentialsRiskConfiguration <p>
     *            The compromised credentials risk configuration object
     *            including the <code>EventFilter</code> and the
     *            <code>EventAction</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RiskConfigurationType withCompromisedCredentialsRiskConfiguration(
            CompromisedCredentialsRiskConfigurationType compromisedCredentialsRiskConfiguration) {
        this.compromisedCredentialsRiskConfiguration = compromisedCredentialsRiskConfiguration;
        return this;
    }

    /**
     * <p>
     * The account takeover risk configuration object including the
     * <code>NotifyConfiguration</code> object and <code>Actions</code> to take
     * in the case of an account takeover.
     * </p>
     *
     * @return <p>
     *         The account takeover risk configuration object including the
     *         <code>NotifyConfiguration</code> object and <code>Actions</code>
     *         to take in the case of an account takeover.
     *         </p>
     */
    public AccountTakeoverRiskConfigurationType getAccountTakeoverRiskConfiguration() {
        return accountTakeoverRiskConfiguration;
    }

    /**
     * <p>
     * The account takeover risk configuration object including the
     * <code>NotifyConfiguration</code> object and <code>Actions</code> to take
     * in the case of an account takeover.
     * </p>
     *
     * @param accountTakeoverRiskConfiguration <p>
     *            The account takeover risk configuration object including the
     *            <code>NotifyConfiguration</code> object and
     *            <code>Actions</code> to take in the case of an account
     *            takeover.
     *            </p>
     */
    public void setAccountTakeoverRiskConfiguration(
            AccountTakeoverRiskConfigurationType accountTakeoverRiskConfiguration) {
        this.accountTakeoverRiskConfiguration = accountTakeoverRiskConfiguration;
    }

    /**
     * <p>
     * The account takeover risk configuration object including the
     * <code>NotifyConfiguration</code> object and <code>Actions</code> to take
     * in the case of an account takeover.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountTakeoverRiskConfiguration <p>
     *            The account takeover risk configuration object including the
     *            <code>NotifyConfiguration</code> object and
     *            <code>Actions</code> to take in the case of an account
     *            takeover.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RiskConfigurationType withAccountTakeoverRiskConfiguration(
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
    public RiskConfigurationType withRiskExceptionConfiguration(
            RiskExceptionConfigurationType riskExceptionConfiguration) {
        this.riskExceptionConfiguration = riskExceptionConfiguration;
        return this;
    }

    /**
     * <p>
     * The last modified date.
     * </p>
     *
     * @return <p>
     *         The last modified date.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The last modified date.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The last modified date.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The last modified date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The last modified date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RiskConfigurationType withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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
            sb.append("RiskExceptionConfiguration: " + getRiskExceptionConfiguration() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate());
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
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RiskConfigurationType == false)
            return false;
        RiskConfigurationType other = (RiskConfigurationType) obj;

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
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }
}

/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Sets the user pool multi-factor authentication (MFA) configuration.
 * </p>
 * <note>
 * <p>
 * This action might generate an SMS text message. Starting June 1, 2021, US
 * telecom carriers require you to register an origination phone number before
 * you can send SMS messages to U.S. phone numbers. If you use SMS text messages
 * in Amazon Cognito, you must register a phone number with <a
 * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
 * Amazon Cognito will use the registered number automatically. Otherwise,
 * Amazon Cognito users that must receive SMS messages might be unable to sign
 * up, activate their accounts, or sign in.
 * </p>
 * <p>
 * If you have never used SMS text messages with Amazon Cognito or any other
 * Amazon Web Service, Amazon Simple Notification Service might place your
 * account in SMS sandbox. In <i> <a
 * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox
 * mode</a> </i>, you will have limitations, such as sending messages only to
 * verified phone numbers. After testing in the sandbox environment, you can
 * move out of the SMS sandbox and into production. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
 * > SMS message settings for Amazon Cognito User Pools</a> in the <i>Amazon
 * Cognito Developer Guide</i>.
 * </p>
 * </note>
 */
public class SetUserPoolMfaConfigRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The SMS text message MFA configuration.
     * </p>
     */
    private SmsMfaConfigType smsMfaConfiguration;

    /**
     * <p>
     * The software token MFA configuration.
     * </p>
     */
    private SoftwareTokenMfaConfigType softwareTokenMfaConfiguration;

    /**
     * <p>
     * The MFA configuration. If you set the MfaConfiguration value to ‘ON’,
     * only users with an MFA factor set up can sign in. To learn more, see <a
     * href="cognito/latest/developerguide/user-pool-settings-mfa.html">Adding
     * Multi-Factor Authentication (MFA) to a User Pool</a>. Valid values
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> MFA won't be used for any users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> MFA is required for all users to sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> MFA will be required only for individual users who
     * have an MFA factor activated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     */
    private String mfaConfiguration;

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
    public SetUserPoolMfaConfigRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The SMS text message MFA configuration.
     * </p>
     *
     * @return <p>
     *         The SMS text message MFA configuration.
     *         </p>
     */
    public SmsMfaConfigType getSmsMfaConfiguration() {
        return smsMfaConfiguration;
    }

    /**
     * <p>
     * The SMS text message MFA configuration.
     * </p>
     *
     * @param smsMfaConfiguration <p>
     *            The SMS text message MFA configuration.
     *            </p>
     */
    public void setSmsMfaConfiguration(SmsMfaConfigType smsMfaConfiguration) {
        this.smsMfaConfiguration = smsMfaConfiguration;
    }

    /**
     * <p>
     * The SMS text message MFA configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param smsMfaConfiguration <p>
     *            The SMS text message MFA configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetUserPoolMfaConfigRequest withSmsMfaConfiguration(SmsMfaConfigType smsMfaConfiguration) {
        this.smsMfaConfiguration = smsMfaConfiguration;
        return this;
    }

    /**
     * <p>
     * The software token MFA configuration.
     * </p>
     *
     * @return <p>
     *         The software token MFA configuration.
     *         </p>
     */
    public SoftwareTokenMfaConfigType getSoftwareTokenMfaConfiguration() {
        return softwareTokenMfaConfiguration;
    }

    /**
     * <p>
     * The software token MFA configuration.
     * </p>
     *
     * @param softwareTokenMfaConfiguration <p>
     *            The software token MFA configuration.
     *            </p>
     */
    public void setSoftwareTokenMfaConfiguration(
            SoftwareTokenMfaConfigType softwareTokenMfaConfiguration) {
        this.softwareTokenMfaConfiguration = softwareTokenMfaConfiguration;
    }

    /**
     * <p>
     * The software token MFA configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param softwareTokenMfaConfiguration <p>
     *            The software token MFA configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetUserPoolMfaConfigRequest withSoftwareTokenMfaConfiguration(
            SoftwareTokenMfaConfigType softwareTokenMfaConfiguration) {
        this.softwareTokenMfaConfiguration = softwareTokenMfaConfiguration;
        return this;
    }

    /**
     * <p>
     * The MFA configuration. If you set the MfaConfiguration value to ‘ON’,
     * only users with an MFA factor set up can sign in. To learn more, see <a
     * href="cognito/latest/developerguide/user-pool-settings-mfa.html">Adding
     * Multi-Factor Authentication (MFA) to a User Pool</a>. Valid values
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> MFA won't be used for any users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> MFA is required for all users to sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> MFA will be required only for individual users who
     * have an MFA factor activated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @return <p>
     *         The MFA configuration. If you set the MfaConfiguration value to
     *         ‘ON’, only users with an MFA factor set up can sign in. To learn
     *         more, see <a href=
     *         "cognito/latest/developerguide/user-pool-settings-mfa.html"
     *         >Adding Multi-Factor Authentication (MFA) to a User Pool</a>.
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>OFF</code> MFA won't be used for any users.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ON</code> MFA is required for all users to sign in.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPTIONAL</code> MFA will be required only for individual
     *         users who have an MFA factor activated.
     *         </p>
     *         </li>
     *         </ul>
     * @see UserPoolMfaType
     */
    public String getMfaConfiguration() {
        return mfaConfiguration;
    }

    /**
     * <p>
     * The MFA configuration. If you set the MfaConfiguration value to ‘ON’,
     * only users with an MFA factor set up can sign in. To learn more, see <a
     * href="cognito/latest/developerguide/user-pool-settings-mfa.html">Adding
     * Multi-Factor Authentication (MFA) to a User Pool</a>. Valid values
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> MFA won't be used for any users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> MFA is required for all users to sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> MFA will be required only for individual users who
     * have an MFA factor activated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration <p>
     *            The MFA configuration. If you set the MfaConfiguration value
     *            to ‘ON’, only users with an MFA factor set up can sign in. To
     *            learn more, see <a href=
     *            "cognito/latest/developerguide/user-pool-settings-mfa.html"
     *            >Adding Multi-Factor Authentication (MFA) to a User Pool</a>.
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>OFF</code> MFA won't be used for any users.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ON</code> MFA is required for all users to sign in.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OPTIONAL</code> MFA will be required only for individual
     *            users who have an MFA factor activated.
     *            </p>
     *            </li>
     *            </ul>
     * @see UserPoolMfaType
     */
    public void setMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
    }

    /**
     * <p>
     * The MFA configuration. If you set the MfaConfiguration value to ‘ON’,
     * only users with an MFA factor set up can sign in. To learn more, see <a
     * href="cognito/latest/developerguide/user-pool-settings-mfa.html">Adding
     * Multi-Factor Authentication (MFA) to a User Pool</a>. Valid values
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> MFA won't be used for any users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> MFA is required for all users to sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> MFA will be required only for individual users who
     * have an MFA factor activated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration <p>
     *            The MFA configuration. If you set the MfaConfiguration value
     *            to ‘ON’, only users with an MFA factor set up can sign in. To
     *            learn more, see <a href=
     *            "cognito/latest/developerguide/user-pool-settings-mfa.html"
     *            >Adding Multi-Factor Authentication (MFA) to a User Pool</a>.
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>OFF</code> MFA won't be used for any users.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ON</code> MFA is required for all users to sign in.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OPTIONAL</code> MFA will be required only for individual
     *            users who have an MFA factor activated.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserPoolMfaType
     */
    public SetUserPoolMfaConfigRequest withMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
        return this;
    }

    /**
     * <p>
     * The MFA configuration. If you set the MfaConfiguration value to ‘ON’,
     * only users with an MFA factor set up can sign in. To learn more, see <a
     * href="cognito/latest/developerguide/user-pool-settings-mfa.html">Adding
     * Multi-Factor Authentication (MFA) to a User Pool</a>. Valid values
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> MFA won't be used for any users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> MFA is required for all users to sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> MFA will be required only for individual users who
     * have an MFA factor activated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration <p>
     *            The MFA configuration. If you set the MfaConfiguration value
     *            to ‘ON’, only users with an MFA factor set up can sign in. To
     *            learn more, see <a href=
     *            "cognito/latest/developerguide/user-pool-settings-mfa.html"
     *            >Adding Multi-Factor Authentication (MFA) to a User Pool</a>.
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>OFF</code> MFA won't be used for any users.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ON</code> MFA is required for all users to sign in.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OPTIONAL</code> MFA will be required only for individual
     *            users who have an MFA factor activated.
     *            </p>
     *            </li>
     *            </ul>
     * @see UserPoolMfaType
     */
    public void setMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration.toString();
    }

    /**
     * <p>
     * The MFA configuration. If you set the MfaConfiguration value to ‘ON’,
     * only users with an MFA factor set up can sign in. To learn more, see <a
     * href="cognito/latest/developerguide/user-pool-settings-mfa.html">Adding
     * Multi-Factor Authentication (MFA) to a User Pool</a>. Valid values
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> MFA won't be used for any users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> MFA is required for all users to sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> MFA will be required only for individual users who
     * have an MFA factor activated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration <p>
     *            The MFA configuration. If you set the MfaConfiguration value
     *            to ‘ON’, only users with an MFA factor set up can sign in. To
     *            learn more, see <a href=
     *            "cognito/latest/developerguide/user-pool-settings-mfa.html"
     *            >Adding Multi-Factor Authentication (MFA) to a User Pool</a>.
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>OFF</code> MFA won't be used for any users.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ON</code> MFA is required for all users to sign in.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OPTIONAL</code> MFA will be required only for individual
     *            users who have an MFA factor activated.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserPoolMfaType
     */
    public SetUserPoolMfaConfigRequest withMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration.toString();
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
        if (getSmsMfaConfiguration() != null)
            sb.append("SmsMfaConfiguration: " + getSmsMfaConfiguration() + ",");
        if (getSoftwareTokenMfaConfiguration() != null)
            sb.append("SoftwareTokenMfaConfiguration: " + getSoftwareTokenMfaConfiguration() + ",");
        if (getMfaConfiguration() != null)
            sb.append("MfaConfiguration: " + getMfaConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getSmsMfaConfiguration() == null) ? 0 : getSmsMfaConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getSoftwareTokenMfaConfiguration() == null) ? 0
                        : getSoftwareTokenMfaConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getMfaConfiguration() == null) ? 0 : getMfaConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetUserPoolMfaConfigRequest == false)
            return false;
        SetUserPoolMfaConfigRequest other = (SetUserPoolMfaConfigRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getSmsMfaConfiguration() == null ^ this.getSmsMfaConfiguration() == null)
            return false;
        if (other.getSmsMfaConfiguration() != null
                && other.getSmsMfaConfiguration().equals(this.getSmsMfaConfiguration()) == false)
            return false;
        if (other.getSoftwareTokenMfaConfiguration() == null
                ^ this.getSoftwareTokenMfaConfiguration() == null)
            return false;
        if (other.getSoftwareTokenMfaConfiguration() != null
                && other.getSoftwareTokenMfaConfiguration().equals(
                        this.getSoftwareTokenMfaConfiguration()) == false)
            return false;
        if (other.getMfaConfiguration() == null ^ this.getMfaConfiguration() == null)
            return false;
        if (other.getMfaConfiguration() != null
                && other.getMfaConfiguration().equals(this.getMfaConfiguration()) == false)
            return false;
        return true;
    }
}

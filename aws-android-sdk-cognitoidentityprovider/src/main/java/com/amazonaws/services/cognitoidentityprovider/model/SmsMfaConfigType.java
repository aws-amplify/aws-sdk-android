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
 * The SMS text message multi-factor authentication (MFA) configuration type.
 * </p>
 */
public class SmsMfaConfigType implements Serializable {
    /**
     * <p>
     * The SMS authentication message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     */
    private String smsAuthenticationMessage;

    /**
     * <p>
     * The SMS configuration.
     * </p>
     */
    private SmsConfigurationType smsConfiguration;

    /**
     * <p>
     * The SMS authentication message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @return <p>
     *         The SMS authentication message.
     *         </p>
     */
    public String getSmsAuthenticationMessage() {
        return smsAuthenticationMessage;
    }

    /**
     * <p>
     * The SMS authentication message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsAuthenticationMessage <p>
     *            The SMS authentication message.
     *            </p>
     */
    public void setSmsAuthenticationMessage(String smsAuthenticationMessage) {
        this.smsAuthenticationMessage = smsAuthenticationMessage;
    }

    /**
     * <p>
     * The SMS authentication message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsAuthenticationMessage <p>
     *            The SMS authentication message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SmsMfaConfigType withSmsAuthenticationMessage(String smsAuthenticationMessage) {
        this.smsAuthenticationMessage = smsAuthenticationMessage;
        return this;
    }

    /**
     * <p>
     * The SMS configuration.
     * </p>
     *
     * @return <p>
     *         The SMS configuration.
     *         </p>
     */
    public SmsConfigurationType getSmsConfiguration() {
        return smsConfiguration;
    }

    /**
     * <p>
     * The SMS configuration.
     * </p>
     *
     * @param smsConfiguration <p>
     *            The SMS configuration.
     *            </p>
     */
    public void setSmsConfiguration(SmsConfigurationType smsConfiguration) {
        this.smsConfiguration = smsConfiguration;
    }

    /**
     * <p>
     * The SMS configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param smsConfiguration <p>
     *            The SMS configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SmsMfaConfigType withSmsConfiguration(SmsConfigurationType smsConfiguration) {
        this.smsConfiguration = smsConfiguration;
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
        if (getSmsAuthenticationMessage() != null)
            sb.append("SmsAuthenticationMessage: " + getSmsAuthenticationMessage() + ",");
        if (getSmsConfiguration() != null)
            sb.append("SmsConfiguration: " + getSmsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSmsAuthenticationMessage() == null) ? 0 : getSmsAuthenticationMessage()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSmsConfiguration() == null) ? 0 : getSmsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SmsMfaConfigType == false)
            return false;
        SmsMfaConfigType other = (SmsMfaConfigType) obj;

        if (other.getSmsAuthenticationMessage() == null
                ^ this.getSmsAuthenticationMessage() == null)
            return false;
        if (other.getSmsAuthenticationMessage() != null
                && other.getSmsAuthenticationMessage().equals(this.getSmsAuthenticationMessage()) == false)
            return false;
        if (other.getSmsConfiguration() == null ^ this.getSmsConfiguration() == null)
            return false;
        if (other.getSmsConfiguration() != null
                && other.getSmsConfiguration().equals(this.getSmsConfiguration()) == false)
            return false;
        return true;
    }
}

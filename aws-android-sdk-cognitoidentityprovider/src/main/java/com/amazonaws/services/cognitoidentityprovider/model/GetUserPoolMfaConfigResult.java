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

public class GetUserPoolMfaConfigResult implements Serializable {
    /**
     * <p>
     * The SMS text message multi-factor (MFA) configuration.
     * </p>
     */
    private SmsMfaConfigType smsMfaConfiguration;

    /**
     * <p>
     * The software token multi-factor (MFA) configuration.
     * </p>
     */
    private SoftwareTokenMfaConfigType softwareTokenMfaConfiguration;

    /**
     * <p>
     * The multi-factor (MFA) configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     */
    private String mfaConfiguration;

    /**
     * <p>
     * The SMS text message multi-factor (MFA) configuration.
     * </p>
     *
     * @return <p>
     *         The SMS text message multi-factor (MFA) configuration.
     *         </p>
     */
    public SmsMfaConfigType getSmsMfaConfiguration() {
        return smsMfaConfiguration;
    }

    /**
     * <p>
     * The SMS text message multi-factor (MFA) configuration.
     * </p>
     *
     * @param smsMfaConfiguration <p>
     *            The SMS text message multi-factor (MFA) configuration.
     *            </p>
     */
    public void setSmsMfaConfiguration(SmsMfaConfigType smsMfaConfiguration) {
        this.smsMfaConfiguration = smsMfaConfiguration;
    }

    /**
     * <p>
     * The SMS text message multi-factor (MFA) configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param smsMfaConfiguration <p>
     *            The SMS text message multi-factor (MFA) configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUserPoolMfaConfigResult withSmsMfaConfiguration(SmsMfaConfigType smsMfaConfiguration) {
        this.smsMfaConfiguration = smsMfaConfiguration;
        return this;
    }

    /**
     * <p>
     * The software token multi-factor (MFA) configuration.
     * </p>
     *
     * @return <p>
     *         The software token multi-factor (MFA) configuration.
     *         </p>
     */
    public SoftwareTokenMfaConfigType getSoftwareTokenMfaConfiguration() {
        return softwareTokenMfaConfiguration;
    }

    /**
     * <p>
     * The software token multi-factor (MFA) configuration.
     * </p>
     *
     * @param softwareTokenMfaConfiguration <p>
     *            The software token multi-factor (MFA) configuration.
     *            </p>
     */
    public void setSoftwareTokenMfaConfiguration(
            SoftwareTokenMfaConfigType softwareTokenMfaConfiguration) {
        this.softwareTokenMfaConfiguration = softwareTokenMfaConfiguration;
    }

    /**
     * <p>
     * The software token multi-factor (MFA) configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param softwareTokenMfaConfiguration <p>
     *            The software token multi-factor (MFA) configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUserPoolMfaConfigResult withSoftwareTokenMfaConfiguration(
            SoftwareTokenMfaConfigType softwareTokenMfaConfiguration) {
        this.softwareTokenMfaConfiguration = softwareTokenMfaConfiguration;
        return this;
    }

    /**
     * <p>
     * The multi-factor (MFA) configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @return <p>
     *         The multi-factor (MFA) configuration.
     *         </p>
     * @see UserPoolMfaType
     */
    public String getMfaConfiguration() {
        return mfaConfiguration;
    }

    /**
     * <p>
     * The multi-factor (MFA) configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration <p>
     *            The multi-factor (MFA) configuration.
     *            </p>
     * @see UserPoolMfaType
     */
    public void setMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
    }

    /**
     * <p>
     * The multi-factor (MFA) configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration <p>
     *            The multi-factor (MFA) configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserPoolMfaType
     */
    public GetUserPoolMfaConfigResult withMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
        return this;
    }

    /**
     * <p>
     * The multi-factor (MFA) configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration <p>
     *            The multi-factor (MFA) configuration.
     *            </p>
     * @see UserPoolMfaType
     */
    public void setMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration.toString();
    }

    /**
     * <p>
     * The multi-factor (MFA) configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration <p>
     *            The multi-factor (MFA) configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserPoolMfaType
     */
    public GetUserPoolMfaConfigResult withMfaConfiguration(UserPoolMfaType mfaConfiguration) {
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

        if (obj instanceof GetUserPoolMfaConfigResult == false)
            return false;
        GetUserPoolMfaConfigResult other = (GetUserPoolMfaConfigResult) obj;

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

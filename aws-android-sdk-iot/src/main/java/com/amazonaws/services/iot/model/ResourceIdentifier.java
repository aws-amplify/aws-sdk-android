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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Information identifying the non-compliant resource.
 * </p>
 */
public class ResourceIdentifier implements Serializable {
    /**
     * <p>
     * The ID of the certificate attached to the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     */
    private String deviceCertificateId;

    /**
     * <p>
     * The ID of the CA certificate used to authorize the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     */
    private String caCertificateId;

    /**
     * <p>
     * The ID of the Cognito Identity Pool.
     * </p>
     */
    private String cognitoIdentityPoolId;

    /**
     * <p>
     * The client ID.
     * </p>
     */
    private String clientId;

    /**
     * <p>
     * The version of the policy associated with the resource.
     * </p>
     */
    private PolicyVersionIdentifier policyVersionIdentifier;

    /**
     * <p>
     * The account with which the resource is associated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     */
    private String account;

    /**
     * <p>
     * The ID of the certificate attached to the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @return <p>
     *         The ID of the certificate attached to the resource.
     *         </p>
     */
    public String getDeviceCertificateId() {
        return deviceCertificateId;
    }

    /**
     * <p>
     * The ID of the certificate attached to the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param deviceCertificateId <p>
     *            The ID of the certificate attached to the resource.
     *            </p>
     */
    public void setDeviceCertificateId(String deviceCertificateId) {
        this.deviceCertificateId = deviceCertificateId;
    }

    /**
     * <p>
     * The ID of the certificate attached to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param deviceCertificateId <p>
     *            The ID of the certificate attached to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceIdentifier withDeviceCertificateId(String deviceCertificateId) {
        this.deviceCertificateId = deviceCertificateId;
        return this;
    }

    /**
     * <p>
     * The ID of the CA certificate used to authorize the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @return <p>
     *         The ID of the CA certificate used to authorize the certificate.
     *         </p>
     */
    public String getCaCertificateId() {
        return caCertificateId;
    }

    /**
     * <p>
     * The ID of the CA certificate used to authorize the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param caCertificateId <p>
     *            The ID of the CA certificate used to authorize the
     *            certificate.
     *            </p>
     */
    public void setCaCertificateId(String caCertificateId) {
        this.caCertificateId = caCertificateId;
    }

    /**
     * <p>
     * The ID of the CA certificate used to authorize the certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param caCertificateId <p>
     *            The ID of the CA certificate used to authorize the
     *            certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceIdentifier withCaCertificateId(String caCertificateId) {
        this.caCertificateId = caCertificateId;
        return this;
    }

    /**
     * <p>
     * The ID of the Cognito Identity Pool.
     * </p>
     *
     * @return <p>
     *         The ID of the Cognito Identity Pool.
     *         </p>
     */
    public String getCognitoIdentityPoolId() {
        return cognitoIdentityPoolId;
    }

    /**
     * <p>
     * The ID of the Cognito Identity Pool.
     * </p>
     *
     * @param cognitoIdentityPoolId <p>
     *            The ID of the Cognito Identity Pool.
     *            </p>
     */
    public void setCognitoIdentityPoolId(String cognitoIdentityPoolId) {
        this.cognitoIdentityPoolId = cognitoIdentityPoolId;
    }

    /**
     * <p>
     * The ID of the Cognito Identity Pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cognitoIdentityPoolId <p>
     *            The ID of the Cognito Identity Pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceIdentifier withCognitoIdentityPoolId(String cognitoIdentityPoolId) {
        this.cognitoIdentityPoolId = cognitoIdentityPoolId;
        return this;
    }

    /**
     * <p>
     * The client ID.
     * </p>
     *
     * @return <p>
     *         The client ID.
     *         </p>
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <p>
     * The client ID.
     * </p>
     *
     * @param clientId <p>
     *            The client ID.
     *            </p>
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The client ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientId <p>
     *            The client ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceIdentifier withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * <p>
     * The version of the policy associated with the resource.
     * </p>
     *
     * @return <p>
     *         The version of the policy associated with the resource.
     *         </p>
     */
    public PolicyVersionIdentifier getPolicyVersionIdentifier() {
        return policyVersionIdentifier;
    }

    /**
     * <p>
     * The version of the policy associated with the resource.
     * </p>
     *
     * @param policyVersionIdentifier <p>
     *            The version of the policy associated with the resource.
     *            </p>
     */
    public void setPolicyVersionIdentifier(PolicyVersionIdentifier policyVersionIdentifier) {
        this.policyVersionIdentifier = policyVersionIdentifier;
    }

    /**
     * <p>
     * The version of the policy associated with the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyVersionIdentifier <p>
     *            The version of the policy associated with the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceIdentifier withPolicyVersionIdentifier(
            PolicyVersionIdentifier policyVersionIdentifier) {
        this.policyVersionIdentifier = policyVersionIdentifier;
        return this;
    }

    /**
     * <p>
     * The account with which the resource is associated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @return <p>
     *         The account with which the resource is associated.
     *         </p>
     */
    public String getAccount() {
        return account;
    }

    /**
     * <p>
     * The account with which the resource is associated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param account <p>
     *            The account with which the resource is associated.
     *            </p>
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * The account with which the resource is associated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param account <p>
     *            The account with which the resource is associated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceIdentifier withAccount(String account) {
        this.account = account;
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
        if (getDeviceCertificateId() != null)
            sb.append("deviceCertificateId: " + getDeviceCertificateId() + ",");
        if (getCaCertificateId() != null)
            sb.append("caCertificateId: " + getCaCertificateId() + ",");
        if (getCognitoIdentityPoolId() != null)
            sb.append("cognitoIdentityPoolId: " + getCognitoIdentityPoolId() + ",");
        if (getClientId() != null)
            sb.append("clientId: " + getClientId() + ",");
        if (getPolicyVersionIdentifier() != null)
            sb.append("policyVersionIdentifier: " + getPolicyVersionIdentifier() + ",");
        if (getAccount() != null)
            sb.append("account: " + getAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeviceCertificateId() == null) ? 0 : getDeviceCertificateId().hashCode());
        hashCode = prime * hashCode
                + ((getCaCertificateId() == null) ? 0 : getCaCertificateId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCognitoIdentityPoolId() == null) ? 0 : getCognitoIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime
                * hashCode
                + ((getPolicyVersionIdentifier() == null) ? 0 : getPolicyVersionIdentifier()
                        .hashCode());
        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceIdentifier == false)
            return false;
        ResourceIdentifier other = (ResourceIdentifier) obj;

        if (other.getDeviceCertificateId() == null ^ this.getDeviceCertificateId() == null)
            return false;
        if (other.getDeviceCertificateId() != null
                && other.getDeviceCertificateId().equals(this.getDeviceCertificateId()) == false)
            return false;
        if (other.getCaCertificateId() == null ^ this.getCaCertificateId() == null)
            return false;
        if (other.getCaCertificateId() != null
                && other.getCaCertificateId().equals(this.getCaCertificateId()) == false)
            return false;
        if (other.getCognitoIdentityPoolId() == null ^ this.getCognitoIdentityPoolId() == null)
            return false;
        if (other.getCognitoIdentityPoolId() != null
                && other.getCognitoIdentityPoolId().equals(this.getCognitoIdentityPoolId()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getPolicyVersionIdentifier() == null ^ this.getPolicyVersionIdentifier() == null)
            return false;
        if (other.getPolicyVersionIdentifier() != null
                && other.getPolicyVersionIdentifier().equals(this.getPolicyVersionIdentifier()) == false)
            return false;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        return true;
    }
}

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
 * Resends the confirmation (for confirmation of registration) to a specific
 * user in the user pool.
 * </p>
 */
public class ResendConfirmationCodeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     */
    private String clientId;

    /**
     * <p>
     * A keyed-hash message authentication code (HMAC) calculated using the
     * secret key of a user pool client and username plus the client ID in the
     * message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=/]+<br/>
     */
    private String secretHash;

    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or
     * location used for evaluating the risk of an unexpected event by Amazon
     * Cognito advanced security.
     * </p>
     */
    private UserContextDataType userContextData;

    /**
     * <p>
     * The user name of the user to whom you wish to resend a confirmation code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for
     * <code>ResendConfirmationCode</code> calls.
     * </p>
     */
    private AnalyticsMetadataType analyticsMetadata;

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @return <p>
     *         The ID of the client associated with the user pool.
     *         </p>
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            The ID of the client associated with the user pool.
     *            </p>
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The ID of the client associated with the user pool.
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
     *            The ID of the client associated with the user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResendConfirmationCodeRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * <p>
     * A keyed-hash message authentication code (HMAC) calculated using the
     * secret key of a user pool client and username plus the client ID in the
     * message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=/]+<br/>
     *
     * @return <p>
     *         A keyed-hash message authentication code (HMAC) calculated using
     *         the secret key of a user pool client and username plus the client
     *         ID in the message.
     *         </p>
     */
    public String getSecretHash() {
        return secretHash;
    }

    /**
     * <p>
     * A keyed-hash message authentication code (HMAC) calculated using the
     * secret key of a user pool client and username plus the client ID in the
     * message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=/]+<br/>
     *
     * @param secretHash <p>
     *            A keyed-hash message authentication code (HMAC) calculated
     *            using the secret key of a user pool client and username plus
     *            the client ID in the message.
     *            </p>
     */
    public void setSecretHash(String secretHash) {
        this.secretHash = secretHash;
    }

    /**
     * <p>
     * A keyed-hash message authentication code (HMAC) calculated using the
     * secret key of a user pool client and username plus the client ID in the
     * message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=/]+<br/>
     *
     * @param secretHash <p>
     *            A keyed-hash message authentication code (HMAC) calculated
     *            using the secret key of a user pool client and username plus
     *            the client ID in the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResendConfirmationCodeRequest withSecretHash(String secretHash) {
        this.secretHash = secretHash;
        return this;
    }

    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or
     * location used for evaluating the risk of an unexpected event by Amazon
     * Cognito advanced security.
     * </p>
     *
     * @return <p>
     *         Contextual data such as the user's device fingerprint, IP
     *         address, or location used for evaluating the risk of an
     *         unexpected event by Amazon Cognito advanced security.
     *         </p>
     */
    public UserContextDataType getUserContextData() {
        return userContextData;
    }

    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or
     * location used for evaluating the risk of an unexpected event by Amazon
     * Cognito advanced security.
     * </p>
     *
     * @param userContextData <p>
     *            Contextual data such as the user's device fingerprint, IP
     *            address, or location used for evaluating the risk of an
     *            unexpected event by Amazon Cognito advanced security.
     *            </p>
     */
    public void setUserContextData(UserContextDataType userContextData) {
        this.userContextData = userContextData;
    }

    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or
     * location used for evaluating the risk of an unexpected event by Amazon
     * Cognito advanced security.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userContextData <p>
     *            Contextual data such as the user's device fingerprint, IP
     *            address, or location used for evaluating the risk of an
     *            unexpected event by Amazon Cognito advanced security.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResendConfirmationCodeRequest withUserContextData(UserContextDataType userContextData) {
        this.userContextData = userContextData;
        return this;
    }

    /**
     * <p>
     * The user name of the user to whom you wish to resend a confirmation code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The user name of the user to whom you wish to resend a
     *         confirmation code.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name of the user to whom you wish to resend a confirmation code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user name of the user to whom you wish to resend a
     *            confirmation code.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name of the user to whom you wish to resend a confirmation code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user name of the user to whom you wish to resend a
     *            confirmation code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResendConfirmationCodeRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for
     * <code>ResendConfirmationCode</code> calls.
     * </p>
     *
     * @return <p>
     *         The Amazon Pinpoint analytics metadata for collecting metrics for
     *         <code>ResendConfirmationCode</code> calls.
     *         </p>
     */
    public AnalyticsMetadataType getAnalyticsMetadata() {
        return analyticsMetadata;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for
     * <code>ResendConfirmationCode</code> calls.
     * </p>
     *
     * @param analyticsMetadata <p>
     *            The Amazon Pinpoint analytics metadata for collecting metrics
     *            for <code>ResendConfirmationCode</code> calls.
     *            </p>
     */
    public void setAnalyticsMetadata(AnalyticsMetadataType analyticsMetadata) {
        this.analyticsMetadata = analyticsMetadata;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for
     * <code>ResendConfirmationCode</code> calls.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyticsMetadata <p>
     *            The Amazon Pinpoint analytics metadata for collecting metrics
     *            for <code>ResendConfirmationCode</code> calls.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResendConfirmationCodeRequest withAnalyticsMetadata(
            AnalyticsMetadataType analyticsMetadata) {
        this.analyticsMetadata = analyticsMetadata;
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
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getSecretHash() != null)
            sb.append("SecretHash: " + getSecretHash() + ",");
        if (getUserContextData() != null)
            sb.append("UserContextData: " + getUserContextData() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getAnalyticsMetadata() != null)
            sb.append("AnalyticsMetadata: " + getAnalyticsMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getSecretHash() == null) ? 0 : getSecretHash().hashCode());
        hashCode = prime * hashCode
                + ((getUserContextData() == null) ? 0 : getUserContextData().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode
                + ((getAnalyticsMetadata() == null) ? 0 : getAnalyticsMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResendConfirmationCodeRequest == false)
            return false;
        ResendConfirmationCodeRequest other = (ResendConfirmationCodeRequest) obj;

        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getSecretHash() == null ^ this.getSecretHash() == null)
            return false;
        if (other.getSecretHash() != null
                && other.getSecretHash().equals(this.getSecretHash()) == false)
            return false;
        if (other.getUserContextData() == null ^ this.getUserContextData() == null)
            return false;
        if (other.getUserContextData() != null
                && other.getUserContextData().equals(this.getUserContextData()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getAnalyticsMetadata() == null ^ this.getAnalyticsMetadata() == null)
            return false;
        if (other.getAnalyticsMetadata() != null
                && other.getAnalyticsMetadata().equals(this.getAnalyticsMetadata()) == false)
            return false;
        return true;
    }
}

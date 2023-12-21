/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Allows a user to enter a confirmation code to reset a forgotten password.
 * </p>
 * <note>
 * <p>
 * Amazon Cognito doesn't evaluate Identity and Access Management (IAM) policies
 * in requests for this API operation. For this operation, you can't use IAM
 * credentials to authorize requests, and you can't grant IAM permissions in
 * policies. For more information about authorization models in Amazon Cognito,
 * see <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
 * >Using the Amazon Cognito native and OIDC APIs</a>.
 * </p>
 * </note>
 */
public class ConfirmForgotPasswordRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The app client ID of the app associated with the user pool.
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
     * message. For more information about <code>SecretHash</code>, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/signing-up-users-in-your-app.html#cognito-user-pools-computing-secret-hash"
     * >Computing secret hash values</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=/]+<br/>
     */
    private String secretHash;

    /**
     * <p>
     * The user name of the user for whom you want to enter a code to retrieve a
     * forgotten password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * <p>
     * The confirmation code from your user's request to reset their password.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ForgotPassword.html"
     * >ForgotPassword</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String confirmationCode;

    /**
     * <p>
     * The new password that your user wants to set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String password;

    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for
     * <code>ConfirmForgotPassword</code> calls.
     * </p>
     */
    private AnalyticsMetadataType analyticsMetadata;

    /**
     * <p>
     * Contextual data about your user session, such as the device fingerprint,
     * IP address, or location. Amazon Cognito advanced security evaluates the
     * risk of an authentication event based on the context that your app
     * generates and passes to Amazon Cognito when it makes API requests.
     * </p>
     */
    private UserContextDataType userContextData;

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the ConfirmForgotPassword API action, Amazon
     * Cognito invokes the function that is assigned to the <i>post
     * confirmation</i> trigger. When Amazon Cognito invokes this function, it
     * passes a JSON payload, which the function receives as input. This payload
     * contains a <code>clientMetadata</code> attribute, which provides the data
     * that you assigned to the ClientMetadata parameter in your
     * ConfirmForgotPassword request. In your function code in Lambda, you can
     * process the <code>clientMetadata</code> value to enhance your workflow
     * for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito
     * won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda
     * triggers that are assigned to a user pool to support custom workflows. If
     * your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide
     * sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private java.util.Map<String, String> clientMetadata;

    /**
     * <p>
     * The app client ID of the app associated with the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @return <p>
     *         The app client ID of the app associated with the user pool.
     *         </p>
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <p>
     * The app client ID of the app associated with the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            The app client ID of the app associated with the user pool.
     *            </p>
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The app client ID of the app associated with the user pool.
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
     *            The app client ID of the app associated with the user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmForgotPasswordRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * <p>
     * A keyed-hash message authentication code (HMAC) calculated using the
     * secret key of a user pool client and username plus the client ID in the
     * message. For more information about <code>SecretHash</code>, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/signing-up-users-in-your-app.html#cognito-user-pools-computing-secret-hash"
     * >Computing secret hash values</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=/]+<br/>
     *
     * @return <p>
     *         A keyed-hash message authentication code (HMAC) calculated using
     *         the secret key of a user pool client and username plus the client
     *         ID in the message. For more information about
     *         <code>SecretHash</code>, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/signing-up-users-in-your-app.html#cognito-user-pools-computing-secret-hash"
     *         >Computing secret hash values</a>.
     *         </p>
     */
    public String getSecretHash() {
        return secretHash;
    }

    /**
     * <p>
     * A keyed-hash message authentication code (HMAC) calculated using the
     * secret key of a user pool client and username plus the client ID in the
     * message. For more information about <code>SecretHash</code>, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/signing-up-users-in-your-app.html#cognito-user-pools-computing-secret-hash"
     * >Computing secret hash values</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=/]+<br/>
     *
     * @param secretHash <p>
     *            A keyed-hash message authentication code (HMAC) calculated
     *            using the secret key of a user pool client and username plus
     *            the client ID in the message. For more information about
     *            <code>SecretHash</code>, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/signing-up-users-in-your-app.html#cognito-user-pools-computing-secret-hash"
     *            >Computing secret hash values</a>.
     *            </p>
     */
    public void setSecretHash(String secretHash) {
        this.secretHash = secretHash;
    }

    /**
     * <p>
     * A keyed-hash message authentication code (HMAC) calculated using the
     * secret key of a user pool client and username plus the client ID in the
     * message. For more information about <code>SecretHash</code>, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/signing-up-users-in-your-app.html#cognito-user-pools-computing-secret-hash"
     * >Computing secret hash values</a>.
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
     *            the client ID in the message. For more information about
     *            <code>SecretHash</code>, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/signing-up-users-in-your-app.html#cognito-user-pools-computing-secret-hash"
     *            >Computing secret hash values</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmForgotPasswordRequest withSecretHash(String secretHash) {
        this.secretHash = secretHash;
        return this;
    }

    /**
     * <p>
     * The user name of the user for whom you want to enter a code to retrieve a
     * forgotten password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The user name of the user for whom you want to enter a code to
     *         retrieve a forgotten password.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name of the user for whom you want to enter a code to retrieve a
     * forgotten password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user name of the user for whom you want to enter a code to
     *            retrieve a forgotten password.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name of the user for whom you want to enter a code to retrieve a
     * forgotten password.
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
     *            The user name of the user for whom you want to enter a code to
     *            retrieve a forgotten password.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmForgotPasswordRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * The confirmation code from your user's request to reset their password.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ForgotPassword.html"
     * >ForgotPassword</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return <p>
     *         The confirmation code from your user's request to reset their
     *         password. For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ForgotPassword.html"
     *         >ForgotPassword</a>.
     *         </p>
     */
    public String getConfirmationCode() {
        return confirmationCode;
    }

    /**
     * <p>
     * The confirmation code from your user's request to reset their password.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ForgotPassword.html"
     * >ForgotPassword</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param confirmationCode <p>
     *            The confirmation code from your user's request to reset their
     *            password. For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ForgotPassword.html"
     *            >ForgotPassword</a>.
     *            </p>
     */
    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode;
    }

    /**
     * <p>
     * The confirmation code from your user's request to reset their password.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ForgotPassword.html"
     * >ForgotPassword</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param confirmationCode <p>
     *            The confirmation code from your user's request to reset their
     *            password. For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ForgotPassword.html"
     *            >ForgotPassword</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmForgotPasswordRequest withConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode;
        return this;
    }

    /**
     * <p>
     * The new password that your user wants to set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return <p>
     *         The new password that your user wants to set.
     *         </p>
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * The new password that your user wants to set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param password <p>
     *            The new password that your user wants to set.
     *            </p>
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The new password that your user wants to set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param password <p>
     *            The new password that your user wants to set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmForgotPasswordRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for
     * <code>ConfirmForgotPassword</code> calls.
     * </p>
     *
     * @return <p>
     *         The Amazon Pinpoint analytics metadata for collecting metrics for
     *         <code>ConfirmForgotPassword</code> calls.
     *         </p>
     */
    public AnalyticsMetadataType getAnalyticsMetadata() {
        return analyticsMetadata;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for
     * <code>ConfirmForgotPassword</code> calls.
     * </p>
     *
     * @param analyticsMetadata <p>
     *            The Amazon Pinpoint analytics metadata for collecting metrics
     *            for <code>ConfirmForgotPassword</code> calls.
     *            </p>
     */
    public void setAnalyticsMetadata(AnalyticsMetadataType analyticsMetadata) {
        this.analyticsMetadata = analyticsMetadata;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for
     * <code>ConfirmForgotPassword</code> calls.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyticsMetadata <p>
     *            The Amazon Pinpoint analytics metadata for collecting metrics
     *            for <code>ConfirmForgotPassword</code> calls.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmForgotPasswordRequest withAnalyticsMetadata(
            AnalyticsMetadataType analyticsMetadata) {
        this.analyticsMetadata = analyticsMetadata;
        return this;
    }

    /**
     * <p>
     * Contextual data about your user session, such as the device fingerprint,
     * IP address, or location. Amazon Cognito advanced security evaluates the
     * risk of an authentication event based on the context that your app
     * generates and passes to Amazon Cognito when it makes API requests.
     * </p>
     *
     * @return <p>
     *         Contextual data about your user session, such as the device
     *         fingerprint, IP address, or location. Amazon Cognito advanced
     *         security evaluates the risk of an authentication event based on
     *         the context that your app generates and passes to Amazon Cognito
     *         when it makes API requests.
     *         </p>
     */
    public UserContextDataType getUserContextData() {
        return userContextData;
    }

    /**
     * <p>
     * Contextual data about your user session, such as the device fingerprint,
     * IP address, or location. Amazon Cognito advanced security evaluates the
     * risk of an authentication event based on the context that your app
     * generates and passes to Amazon Cognito when it makes API requests.
     * </p>
     *
     * @param userContextData <p>
     *            Contextual data about your user session, such as the device
     *            fingerprint, IP address, or location. Amazon Cognito advanced
     *            security evaluates the risk of an authentication event based
     *            on the context that your app generates and passes to Amazon
     *            Cognito when it makes API requests.
     *            </p>
     */
    public void setUserContextData(UserContextDataType userContextData) {
        this.userContextData = userContextData;
    }

    /**
     * <p>
     * Contextual data about your user session, such as the device fingerprint,
     * IP address, or location. Amazon Cognito advanced security evaluates the
     * risk of an authentication event based on the context that your app
     * generates and passes to Amazon Cognito when it makes API requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userContextData <p>
     *            Contextual data about your user session, such as the device
     *            fingerprint, IP address, or location. Amazon Cognito advanced
     *            security evaluates the risk of an authentication event based
     *            on the context that your app generates and passes to Amazon
     *            Cognito when it makes API requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmForgotPasswordRequest withUserContextData(UserContextDataType userContextData) {
        this.userContextData = userContextData;
        return this;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the ConfirmForgotPassword API action, Amazon
     * Cognito invokes the function that is assigned to the <i>post
     * confirmation</i> trigger. When Amazon Cognito invokes this function, it
     * passes a JSON payload, which the function receives as input. This payload
     * contains a <code>clientMetadata</code> attribute, which provides the data
     * that you assigned to the ClientMetadata parameter in your
     * ConfirmForgotPassword request. In your function code in Lambda, you can
     * process the <code>clientMetadata</code> value to enhance your workflow
     * for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito
     * won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda
     * triggers that are assigned to a user pool to support custom workflows. If
     * your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide
     * sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     *
     * @return <p>
     *         A map of custom key-value pairs that you can provide as input for
     *         any custom workflows that this action triggers.
     *         </p>
     *         <p>
     *         You create custom workflows by assigning Lambda functions to user
     *         pool triggers. When you use the ConfirmForgotPassword API action,
     *         Amazon Cognito invokes the function that is assigned to the
     *         <i>post confirmation</i> trigger. When Amazon Cognito invokes
     *         this function, it passes a JSON payload, which the function
     *         receives as input. This payload contains a
     *         <code>clientMetadata</code> attribute, which provides the data
     *         that you assigned to the ClientMetadata parameter in your
     *         ConfirmForgotPassword request. In your function code in Lambda,
     *         you can process the <code>clientMetadata</code> value to enhance
     *         your workflow for your specific needs.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *         > Customizing user pool Workflows with Lambda Triggers</a> in the
     *         <i>Amazon Cognito Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         When you use the ClientMetadata parameter, remember that Amazon
     *         Cognito won't do the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Store the ClientMetadata value. This data is available only to
     *         Lambda triggers that are assigned to a user pool to support
     *         custom workflows. If your user pool configuration doesn't include
     *         triggers, the ClientMetadata parameter serves no purpose.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Validate the ClientMetadata value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Encrypt the ClientMetadata value. Don't use Amazon Cognito to
     *         provide sensitive information.
     *         </p>
     *         </li>
     *         </ul>
     *         </note>
     */
    public java.util.Map<String, String> getClientMetadata() {
        return clientMetadata;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the ConfirmForgotPassword API action, Amazon
     * Cognito invokes the function that is assigned to the <i>post
     * confirmation</i> trigger. When Amazon Cognito invokes this function, it
     * passes a JSON payload, which the function receives as input. This payload
     * contains a <code>clientMetadata</code> attribute, which provides the data
     * that you assigned to the ClientMetadata parameter in your
     * ConfirmForgotPassword request. In your function code in Lambda, you can
     * process the <code>clientMetadata</code> value to enhance your workflow
     * for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito
     * won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda
     * triggers that are assigned to a user pool to support custom workflows. If
     * your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide
     * sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     *
     * @param clientMetadata <p>
     *            A map of custom key-value pairs that you can provide as input
     *            for any custom workflows that this action triggers.
     *            </p>
     *            <p>
     *            You create custom workflows by assigning Lambda functions to
     *            user pool triggers. When you use the ConfirmForgotPassword API
     *            action, Amazon Cognito invokes the function that is assigned
     *            to the <i>post confirmation</i> trigger. When Amazon Cognito
     *            invokes this function, it passes a JSON payload, which the
     *            function receives as input. This payload contains a
     *            <code>clientMetadata</code> attribute, which provides the data
     *            that you assigned to the ClientMetadata parameter in your
     *            ConfirmForgotPassword request. In your function code in
     *            Lambda, you can process the <code>clientMetadata</code> value
     *            to enhance your workflow for your specific needs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *            > Customizing user pool Workflows with Lambda Triggers</a> in
     *            the <i>Amazon Cognito Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            When you use the ClientMetadata parameter, remember that
     *            Amazon Cognito won't do the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Store the ClientMetadata value. This data is available only to
     *            Lambda triggers that are assigned to a user pool to support
     *            custom workflows. If your user pool configuration doesn't
     *            include triggers, the ClientMetadata parameter serves no
     *            purpose.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Validate the ClientMetadata value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Encrypt the ClientMetadata value. Don't use Amazon Cognito to
     *            provide sensitive information.
     *            </p>
     *            </li>
     *            </ul>
     *            </note>
     */
    public void setClientMetadata(java.util.Map<String, String> clientMetadata) {
        this.clientMetadata = clientMetadata;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the ConfirmForgotPassword API action, Amazon
     * Cognito invokes the function that is assigned to the <i>post
     * confirmation</i> trigger. When Amazon Cognito invokes this function, it
     * passes a JSON payload, which the function receives as input. This payload
     * contains a <code>clientMetadata</code> attribute, which provides the data
     * that you assigned to the ClientMetadata parameter in your
     * ConfirmForgotPassword request. In your function code in Lambda, you can
     * process the <code>clientMetadata</code> value to enhance your workflow
     * for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito
     * won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda
     * triggers that are assigned to a user pool to support custom workflows. If
     * your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide
     * sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientMetadata <p>
     *            A map of custom key-value pairs that you can provide as input
     *            for any custom workflows that this action triggers.
     *            </p>
     *            <p>
     *            You create custom workflows by assigning Lambda functions to
     *            user pool triggers. When you use the ConfirmForgotPassword API
     *            action, Amazon Cognito invokes the function that is assigned
     *            to the <i>post confirmation</i> trigger. When Amazon Cognito
     *            invokes this function, it passes a JSON payload, which the
     *            function receives as input. This payload contains a
     *            <code>clientMetadata</code> attribute, which provides the data
     *            that you assigned to the ClientMetadata parameter in your
     *            ConfirmForgotPassword request. In your function code in
     *            Lambda, you can process the <code>clientMetadata</code> value
     *            to enhance your workflow for your specific needs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *            > Customizing user pool Workflows with Lambda Triggers</a> in
     *            the <i>Amazon Cognito Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            When you use the ClientMetadata parameter, remember that
     *            Amazon Cognito won't do the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Store the ClientMetadata value. This data is available only to
     *            Lambda triggers that are assigned to a user pool to support
     *            custom workflows. If your user pool configuration doesn't
     *            include triggers, the ClientMetadata parameter serves no
     *            purpose.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Validate the ClientMetadata value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Encrypt the ClientMetadata value. Don't use Amazon Cognito to
     *            provide sensitive information.
     *            </p>
     *            </li>
     *            </ul>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmForgotPasswordRequest withClientMetadata(
            java.util.Map<String, String> clientMetadata) {
        this.clientMetadata = clientMetadata;
        return this;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the ConfirmForgotPassword API action, Amazon
     * Cognito invokes the function that is assigned to the <i>post
     * confirmation</i> trigger. When Amazon Cognito invokes this function, it
     * passes a JSON payload, which the function receives as input. This payload
     * contains a <code>clientMetadata</code> attribute, which provides the data
     * that you assigned to the ClientMetadata parameter in your
     * ConfirmForgotPassword request. In your function code in Lambda, you can
     * process the <code>clientMetadata</code> value to enhance your workflow
     * for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito
     * won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda
     * triggers that are assigned to a user pool to support custom workflows. If
     * your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide
     * sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * The method adds a new key-value pair into ClientMetadata parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into ClientMetadata.
     * @param value The corresponding value of the entry to be added into
     *            ClientMetadata.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmForgotPasswordRequest addClientMetadataEntry(String key, String value) {
        if (null == this.clientMetadata) {
            this.clientMetadata = new java.util.HashMap<String, String>();
        }
        if (this.clientMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.clientMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ClientMetadata.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ConfirmForgotPasswordRequest clearClientMetadataEntries() {
        this.clientMetadata = null;
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
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getConfirmationCode() != null)
            sb.append("ConfirmationCode: " + getConfirmationCode() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword() + ",");
        if (getAnalyticsMetadata() != null)
            sb.append("AnalyticsMetadata: " + getAnalyticsMetadata() + ",");
        if (getUserContextData() != null)
            sb.append("UserContextData: " + getUserContextData() + ",");
        if (getClientMetadata() != null)
            sb.append("ClientMetadata: " + getClientMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getSecretHash() == null) ? 0 : getSecretHash().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode
                + ((getConfirmationCode() == null) ? 0 : getConfirmationCode().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode
                + ((getAnalyticsMetadata() == null) ? 0 : getAnalyticsMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getUserContextData() == null) ? 0 : getUserContextData().hashCode());
        hashCode = prime * hashCode
                + ((getClientMetadata() == null) ? 0 : getClientMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfirmForgotPasswordRequest == false)
            return false;
        ConfirmForgotPasswordRequest other = (ConfirmForgotPasswordRequest) obj;

        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getSecretHash() == null ^ this.getSecretHash() == null)
            return false;
        if (other.getSecretHash() != null
                && other.getSecretHash().equals(this.getSecretHash()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getConfirmationCode() == null ^ this.getConfirmationCode() == null)
            return false;
        if (other.getConfirmationCode() != null
                && other.getConfirmationCode().equals(this.getConfirmationCode()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getAnalyticsMetadata() == null ^ this.getAnalyticsMetadata() == null)
            return false;
        if (other.getAnalyticsMetadata() != null
                && other.getAnalyticsMetadata().equals(this.getAnalyticsMetadata()) == false)
            return false;
        if (other.getUserContextData() == null ^ this.getUserContextData() == null)
            return false;
        if (other.getUserContextData() != null
                && other.getUserContextData().equals(this.getUserContextData()) == false)
            return false;
        if (other.getClientMetadata() == null ^ this.getClientMetadata() == null)
            return false;
        if (other.getClientMetadata() != null
                && other.getClientMetadata().equals(this.getClientMetadata()) == false)
            return false;
        return true;
    }
}

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
 * Allows a user to update a specific attribute (one at a time).
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
public class UpdateUserAttributesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     */
    private java.util.List<AttributeType> userAttributes;

    /**
     * <p>
     * The access token for the request to update user attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     */
    private String accessToken;

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action initiates.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the UpdateUserAttributes API action, Amazon
     * Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes
     * a JSON payload, which the function receives as input. This payload
     * contains a <code>clientMetadata</code> attribute, which provides the data
     * that you assigned to the ClientMetadata parameter in your
     * UpdateUserAttributes request. In your function code in Lambda, you can
     * process the <code>clientMetadata</code> value to enhance your workflow
     * for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the
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
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     *
     * @return <p>
     *         An array of name-value pairs representing user attributes.
     *         </p>
     *         <p>
     *         For custom attributes, you must prepend the <code>custom:</code>
     *         prefix to the attribute name.
     *         </p>
     */
    public java.util.List<AttributeType> getUserAttributes() {
        return userAttributes;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     *
     * @param userAttributes <p>
     *            An array of name-value pairs representing user attributes.
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     */
    public void setUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
            return;
        }

        this.userAttributes = new java.util.ArrayList<AttributeType>(userAttributes);
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userAttributes <p>
     *            An array of name-value pairs representing user attributes.
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserAttributesRequest withUserAttributes(AttributeType... userAttributes) {
        if (getUserAttributes() == null) {
            this.userAttributes = new java.util.ArrayList<AttributeType>(userAttributes.length);
        }
        for (AttributeType value : userAttributes) {
            this.userAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userAttributes <p>
     *            An array of name-value pairs representing user attributes.
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserAttributesRequest withUserAttributes(
            java.util.Collection<AttributeType> userAttributes) {
        setUserAttributes(userAttributes);
        return this;
    }

    /**
     * <p>
     * The access token for the request to update user attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @return <p>
     *         The access token for the request to update user attributes.
     *         </p>
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * <p>
     * The access token for the request to update user attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken <p>
     *            The access token for the request to update user attributes.
     *            </p>
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The access token for the request to update user attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken <p>
     *            The access token for the request to update user attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserAttributesRequest withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action initiates.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the UpdateUserAttributes API action, Amazon
     * Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes
     * a JSON payload, which the function receives as input. This payload
     * contains a <code>clientMetadata</code> attribute, which provides the data
     * that you assigned to the ClientMetadata parameter in your
     * UpdateUserAttributes request. In your function code in Lambda, you can
     * process the <code>clientMetadata</code> value to enhance your workflow
     * for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the
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
     *         any custom workflows that this action initiates.
     *         </p>
     *         <p>
     *         You create custom workflows by assigning Lambda functions to user
     *         pool triggers. When you use the UpdateUserAttributes API action,
     *         Amazon Cognito invokes the function that is assigned to the
     *         <i>custom message</i> trigger. When Amazon Cognito invokes this
     *         function, it passes a JSON payload, which the function receives
     *         as input. This payload contains a <code>clientMetadata</code>
     *         attribute, which provides the data that you assigned to the
     *         ClientMetadata parameter in your UpdateUserAttributes request. In
     *         your function code in Lambda, you can process the
     *         <code>clientMetadata</code> value to enhance your workflow for
     *         your specific needs.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *         >Customizing User Pool Workflows with Lambda Triggers</a> in the
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
     * custom workflows that this action initiates.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the UpdateUserAttributes API action, Amazon
     * Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes
     * a JSON payload, which the function receives as input. This payload
     * contains a <code>clientMetadata</code> attribute, which provides the data
     * that you assigned to the ClientMetadata parameter in your
     * UpdateUserAttributes request. In your function code in Lambda, you can
     * process the <code>clientMetadata</code> value to enhance your workflow
     * for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the
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
     *            for any custom workflows that this action initiates.
     *            </p>
     *            <p>
     *            You create custom workflows by assigning Lambda functions to
     *            user pool triggers. When you use the UpdateUserAttributes API
     *            action, Amazon Cognito invokes the function that is assigned
     *            to the <i>custom message</i> trigger. When Amazon Cognito
     *            invokes this function, it passes a JSON payload, which the
     *            function receives as input. This payload contains a
     *            <code>clientMetadata</code> attribute, which provides the data
     *            that you assigned to the ClientMetadata parameter in your
     *            UpdateUserAttributes request. In your function code in Lambda,
     *            you can process the <code>clientMetadata</code> value to
     *            enhance your workflow for your specific needs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *            >Customizing User Pool Workflows with Lambda Triggers</a> in
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
     * custom workflows that this action initiates.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the UpdateUserAttributes API action, Amazon
     * Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes
     * a JSON payload, which the function receives as input. This payload
     * contains a <code>clientMetadata</code> attribute, which provides the data
     * that you assigned to the ClientMetadata parameter in your
     * UpdateUserAttributes request. In your function code in Lambda, you can
     * process the <code>clientMetadata</code> value to enhance your workflow
     * for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the
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
     *            for any custom workflows that this action initiates.
     *            </p>
     *            <p>
     *            You create custom workflows by assigning Lambda functions to
     *            user pool triggers. When you use the UpdateUserAttributes API
     *            action, Amazon Cognito invokes the function that is assigned
     *            to the <i>custom message</i> trigger. When Amazon Cognito
     *            invokes this function, it passes a JSON payload, which the
     *            function receives as input. This payload contains a
     *            <code>clientMetadata</code> attribute, which provides the data
     *            that you assigned to the ClientMetadata parameter in your
     *            UpdateUserAttributes request. In your function code in Lambda,
     *            you can process the <code>clientMetadata</code> value to
     *            enhance your workflow for your specific needs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *            >Customizing User Pool Workflows with Lambda Triggers</a> in
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
    public UpdateUserAttributesRequest withClientMetadata(
            java.util.Map<String, String> clientMetadata) {
        this.clientMetadata = clientMetadata;
        return this;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action initiates.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the UpdateUserAttributes API action, Amazon
     * Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes
     * a JSON payload, which the function receives as input. This payload
     * contains a <code>clientMetadata</code> attribute, which provides the data
     * that you assigned to the ClientMetadata parameter in your
     * UpdateUserAttributes request. In your function code in Lambda, you can
     * process the <code>clientMetadata</code> value to enhance your workflow
     * for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the
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
    public UpdateUserAttributesRequest addClientMetadataEntry(String key, String value) {
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
    public UpdateUserAttributesRequest clearClientMetadataEntries() {
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
        if (getUserAttributes() != null)
            sb.append("UserAttributes: " + getUserAttributes() + ",");
        if (getAccessToken() != null)
            sb.append("AccessToken: " + getAccessToken() + ",");
        if (getClientMetadata() != null)
            sb.append("ClientMetadata: " + getClientMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
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

        if (obj instanceof UpdateUserAttributesRequest == false)
            return false;
        UpdateUserAttributesRequest other = (UpdateUserAttributesRequest) obj;

        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null
                && other.getUserAttributes().equals(this.getUserAttributes()) == false)
            return false;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null
                && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getClientMetadata() == null ^ this.getClientMetadata() == null)
            return false;
        if (other.getClientMetadata() != null
                && other.getClientMetadata().equals(this.getClientMetadata()) == false)
            return false;
        return true;
    }
}

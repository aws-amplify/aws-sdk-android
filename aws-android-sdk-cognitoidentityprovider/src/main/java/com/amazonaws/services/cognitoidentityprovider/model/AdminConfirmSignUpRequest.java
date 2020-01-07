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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Confirms user registration as an admin without using a confirmation code.
 * Works on any user.
 * </p>
 * <p>
 * Calling this action requires developer credentials.
 * </p>
 */
public class AdminConfirmSignUpRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user pool ID for which you want to confirm user registration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The user name for which you want to confirm user registration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * If your user pool configuration includes triggers, the AdminConfirmSignUp
     * API action invokes the AWS Lambda function that is specified for the
     * <i>post confirmation</i> trigger. When Amazon Cognito invokes this
     * function, it passes a JSON payload, which the function receives as input.
     * In this payload, the <code>clientMetadata</code> attribute provides the
     * data that you assigned to the ClientMetadata parameter in your
     * AdminConfirmSignUp request. In your function code in AWS Lambda, you can
     * process the ClientMetadata value to enhance your workflow for your
     * specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Take the following limitations into consideration when you use the
     * ClientMetadata parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Cognito does not store the ClientMetadata value. This data is
     * available only to AWS Lambda triggers that are assigned to a user pool to
     * support custom workflows. If your user pool configuration does not
     * include triggers, the ClientMetadata parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not encrypt the the ClientMetadata value, so don't
     * use it to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private java.util.Map<String, String> clientMetadata;

    /**
     * <p>
     * The user pool ID for which you want to confirm user registration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID for which you want to confirm user registration.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for which you want to confirm user registration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for which you want to confirm user
     *            registration.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for which you want to confirm user registration.
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
     *            The user pool ID for which you want to confirm user
     *            registration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminConfirmSignUpRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The user name for which you want to confirm user registration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The user name for which you want to confirm user registration.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name for which you want to confirm user registration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user name for which you want to confirm user registration.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name for which you want to confirm user registration.
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
     *            The user name for which you want to confirm user registration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminConfirmSignUpRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * If your user pool configuration includes triggers, the AdminConfirmSignUp
     * API action invokes the AWS Lambda function that is specified for the
     * <i>post confirmation</i> trigger. When Amazon Cognito invokes this
     * function, it passes a JSON payload, which the function receives as input.
     * In this payload, the <code>clientMetadata</code> attribute provides the
     * data that you assigned to the ClientMetadata parameter in your
     * AdminConfirmSignUp request. In your function code in AWS Lambda, you can
     * process the ClientMetadata value to enhance your workflow for your
     * specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Take the following limitations into consideration when you use the
     * ClientMetadata parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Cognito does not store the ClientMetadata value. This data is
     * available only to AWS Lambda triggers that are assigned to a user pool to
     * support custom workflows. If your user pool configuration does not
     * include triggers, the ClientMetadata parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not encrypt the the ClientMetadata value, so don't
     * use it to provide sensitive information.
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
     *         If your user pool configuration includes triggers, the
     *         AdminConfirmSignUp API action invokes the AWS Lambda function
     *         that is specified for the <i>post confirmation</i> trigger. When
     *         Amazon Cognito invokes this function, it passes a JSON payload,
     *         which the function receives as input. In this payload, the
     *         <code>clientMetadata</code> attribute provides the data that you
     *         assigned to the ClientMetadata parameter in your
     *         AdminConfirmSignUp request. In your function code in AWS Lambda,
     *         you can process the ClientMetadata value to enhance your workflow
     *         for your specific needs.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *         >Customizing User Pool Workflows with Lambda Triggers</a> in the
     *         <i>Amazon Cognito Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         Take the following limitations into consideration when you use
     *         the ClientMetadata parameter:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Amazon Cognito does not store the ClientMetadata value. This data
     *         is available only to AWS Lambda triggers that are assigned to a
     *         user pool to support custom workflows. If your user pool
     *         configuration does not include triggers, the ClientMetadata
     *         parameter serves no purpose.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Cognito does not validate the ClientMetadata value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Cognito does not encrypt the the ClientMetadata value, so
     *         don't use it to provide sensitive information.
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
     * If your user pool configuration includes triggers, the AdminConfirmSignUp
     * API action invokes the AWS Lambda function that is specified for the
     * <i>post confirmation</i> trigger. When Amazon Cognito invokes this
     * function, it passes a JSON payload, which the function receives as input.
     * In this payload, the <code>clientMetadata</code> attribute provides the
     * data that you assigned to the ClientMetadata parameter in your
     * AdminConfirmSignUp request. In your function code in AWS Lambda, you can
     * process the ClientMetadata value to enhance your workflow for your
     * specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Take the following limitations into consideration when you use the
     * ClientMetadata parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Cognito does not store the ClientMetadata value. This data is
     * available only to AWS Lambda triggers that are assigned to a user pool to
     * support custom workflows. If your user pool configuration does not
     * include triggers, the ClientMetadata parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not encrypt the the ClientMetadata value, so don't
     * use it to provide sensitive information.
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
     *            If your user pool configuration includes triggers, the
     *            AdminConfirmSignUp API action invokes the AWS Lambda function
     *            that is specified for the <i>post confirmation</i> trigger.
     *            When Amazon Cognito invokes this function, it passes a JSON
     *            payload, which the function receives as input. In this
     *            payload, the <code>clientMetadata</code> attribute provides
     *            the data that you assigned to the ClientMetadata parameter in
     *            your AdminConfirmSignUp request. In your function code in AWS
     *            Lambda, you can process the ClientMetadata value to enhance
     *            your workflow for your specific needs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *            >Customizing User Pool Workflows with Lambda Triggers</a> in
     *            the <i>Amazon Cognito Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            Take the following limitations into consideration when you use
     *            the ClientMetadata parameter:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Amazon Cognito does not store the ClientMetadata value. This
     *            data is available only to AWS Lambda triggers that are
     *            assigned to a user pool to support custom workflows. If your
     *            user pool configuration does not include triggers, the
     *            ClientMetadata parameter serves no purpose.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Cognito does not validate the ClientMetadata value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Cognito does not encrypt the the ClientMetadata value,
     *            so don't use it to provide sensitive information.
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
     * If your user pool configuration includes triggers, the AdminConfirmSignUp
     * API action invokes the AWS Lambda function that is specified for the
     * <i>post confirmation</i> trigger. When Amazon Cognito invokes this
     * function, it passes a JSON payload, which the function receives as input.
     * In this payload, the <code>clientMetadata</code> attribute provides the
     * data that you assigned to the ClientMetadata parameter in your
     * AdminConfirmSignUp request. In your function code in AWS Lambda, you can
     * process the ClientMetadata value to enhance your workflow for your
     * specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Take the following limitations into consideration when you use the
     * ClientMetadata parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Cognito does not store the ClientMetadata value. This data is
     * available only to AWS Lambda triggers that are assigned to a user pool to
     * support custom workflows. If your user pool configuration does not
     * include triggers, the ClientMetadata parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not encrypt the the ClientMetadata value, so don't
     * use it to provide sensitive information.
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
     *            If your user pool configuration includes triggers, the
     *            AdminConfirmSignUp API action invokes the AWS Lambda function
     *            that is specified for the <i>post confirmation</i> trigger.
     *            When Amazon Cognito invokes this function, it passes a JSON
     *            payload, which the function receives as input. In this
     *            payload, the <code>clientMetadata</code> attribute provides
     *            the data that you assigned to the ClientMetadata parameter in
     *            your AdminConfirmSignUp request. In your function code in AWS
     *            Lambda, you can process the ClientMetadata value to enhance
     *            your workflow for your specific needs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *            >Customizing User Pool Workflows with Lambda Triggers</a> in
     *            the <i>Amazon Cognito Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            Take the following limitations into consideration when you use
     *            the ClientMetadata parameter:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Amazon Cognito does not store the ClientMetadata value. This
     *            data is available only to AWS Lambda triggers that are
     *            assigned to a user pool to support custom workflows. If your
     *            user pool configuration does not include triggers, the
     *            ClientMetadata parameter serves no purpose.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Cognito does not validate the ClientMetadata value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Cognito does not encrypt the the ClientMetadata value,
     *            so don't use it to provide sensitive information.
     *            </p>
     *            </li>
     *            </ul>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminConfirmSignUpRequest withClientMetadata(java.util.Map<String, String> clientMetadata) {
        this.clientMetadata = clientMetadata;
        return this;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * If your user pool configuration includes triggers, the AdminConfirmSignUp
     * API action invokes the AWS Lambda function that is specified for the
     * <i>post confirmation</i> trigger. When Amazon Cognito invokes this
     * function, it passes a JSON payload, which the function receives as input.
     * In this payload, the <code>clientMetadata</code> attribute provides the
     * data that you assigned to the ClientMetadata parameter in your
     * AdminConfirmSignUp request. In your function code in AWS Lambda, you can
     * process the ClientMetadata value to enhance your workflow for your
     * specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Take the following limitations into consideration when you use the
     * ClientMetadata parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Cognito does not store the ClientMetadata value. This data is
     * available only to AWS Lambda triggers that are assigned to a user pool to
     * support custom workflows. If your user pool configuration does not
     * include triggers, the ClientMetadata parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not encrypt the the ClientMetadata value, so don't
     * use it to provide sensitive information.
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
    public AdminConfirmSignUpRequest addClientMetadataEntry(String key, String value) {
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
    public AdminConfirmSignUpRequest clearClientMetadataEntries() {
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getClientMetadata() != null)
            sb.append("ClientMetadata: " + getClientMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
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

        if (obj instanceof AdminConfirmSignUpRequest == false)
            return false;
        AdminConfirmSignUpRequest other = (AdminConfirmSignUpRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getClientMetadata() == null ^ this.getClientMetadata() == null)
            return false;
        if (other.getClientMetadata() != null
                && other.getClientMetadata().equals(this.getClientMetadata()) == false)
            return false;
        return true;
    }
}

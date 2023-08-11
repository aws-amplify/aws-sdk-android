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

/**
 * <p>
 * The settings for updates to user attributes. These settings include the
 * property <code>AttributesRequireVerificationBeforeUpdate</code>, a user-pool
 * setting that tells Amazon Cognito how to handle changes to the value of your
 * users' email address and phone number attributes. For more information, see
 * <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates"
 * > Verifying updates to email addresses and phone numbers</a>.
 * </p>
 */
public class UserAttributeUpdateSettingsType implements Serializable {
    /**
     * <p>
     * Requires that your user verifies their email address, phone number, or
     * both before Amazon Cognito updates the value of that attribute. When you
     * update a user attribute that has this option activated, Amazon Cognito
     * sends a verification message to the new phone number or email address.
     * Amazon Cognito doesn’t change the value of the attribute until your user
     * responds to the verification message and confirms the new value.
     * </p>
     * <p>
     * You can verify an updated email address or phone number with a <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     * >VerifyUserAttribute</a> API request. You can also call the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     * >AdminUpdateUserAttributes</a> API and set <code>email_verified</code> or
     * <code>phone_number_verified</code> to true.
     * </p>
     * <p>
     * When <code>AttributesRequireVerificationBeforeUpdate</code> is false,
     * your user pool doesn't require that your users verify attribute changes
     * before Amazon Cognito updates them. In a user pool where
     * <code>AttributesRequireVerificationBeforeUpdate</code> is false, API
     * operations that change attribute values can immediately update a user’s
     * <code>email</code> or <code>phone_number</code> attribute.
     * </p>
     */
    private java.util.List<String> attributesRequireVerificationBeforeUpdate;

    /**
     * <p>
     * Requires that your user verifies their email address, phone number, or
     * both before Amazon Cognito updates the value of that attribute. When you
     * update a user attribute that has this option activated, Amazon Cognito
     * sends a verification message to the new phone number or email address.
     * Amazon Cognito doesn’t change the value of the attribute until your user
     * responds to the verification message and confirms the new value.
     * </p>
     * <p>
     * You can verify an updated email address or phone number with a <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     * >VerifyUserAttribute</a> API request. You can also call the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     * >AdminUpdateUserAttributes</a> API and set <code>email_verified</code> or
     * <code>phone_number_verified</code> to true.
     * </p>
     * <p>
     * When <code>AttributesRequireVerificationBeforeUpdate</code> is false,
     * your user pool doesn't require that your users verify attribute changes
     * before Amazon Cognito updates them. In a user pool where
     * <code>AttributesRequireVerificationBeforeUpdate</code> is false, API
     * operations that change attribute values can immediately update a user’s
     * <code>email</code> or <code>phone_number</code> attribute.
     * </p>
     *
     * @return <p>
     *         Requires that your user verifies their email address, phone
     *         number, or both before Amazon Cognito updates the value of that
     *         attribute. When you update a user attribute that has this option
     *         activated, Amazon Cognito sends a verification message to the new
     *         phone number or email address. Amazon Cognito doesn’t change the
     *         value of the attribute until your user responds to the
     *         verification message and confirms the new value.
     *         </p>
     *         <p>
     *         You can verify an updated email address or phone number with a <a
     *         href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     *         >VerifyUserAttribute</a> API request. You can also call the <a
     *         href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     *         >AdminUpdateUserAttributes</a> API and set
     *         <code>email_verified</code> or <code>phone_number_verified</code>
     *         to true.
     *         </p>
     *         <p>
     *         When <code>AttributesRequireVerificationBeforeUpdate</code> is
     *         false, your user pool doesn't require that your users verify
     *         attribute changes before Amazon Cognito updates them. In a user
     *         pool where <code>AttributesRequireVerificationBeforeUpdate</code>
     *         is false, API operations that change attribute values can
     *         immediately update a user’s <code>email</code> or
     *         <code>phone_number</code> attribute.
     *         </p>
     */
    public java.util.List<String> getAttributesRequireVerificationBeforeUpdate() {
        return attributesRequireVerificationBeforeUpdate;
    }

    /**
     * <p>
     * Requires that your user verifies their email address, phone number, or
     * both before Amazon Cognito updates the value of that attribute. When you
     * update a user attribute that has this option activated, Amazon Cognito
     * sends a verification message to the new phone number or email address.
     * Amazon Cognito doesn’t change the value of the attribute until your user
     * responds to the verification message and confirms the new value.
     * </p>
     * <p>
     * You can verify an updated email address or phone number with a <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     * >VerifyUserAttribute</a> API request. You can also call the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     * >AdminUpdateUserAttributes</a> API and set <code>email_verified</code> or
     * <code>phone_number_verified</code> to true.
     * </p>
     * <p>
     * When <code>AttributesRequireVerificationBeforeUpdate</code> is false,
     * your user pool doesn't require that your users verify attribute changes
     * before Amazon Cognito updates them. In a user pool where
     * <code>AttributesRequireVerificationBeforeUpdate</code> is false, API
     * operations that change attribute values can immediately update a user’s
     * <code>email</code> or <code>phone_number</code> attribute.
     * </p>
     *
     * @param attributesRequireVerificationBeforeUpdate <p>
     *            Requires that your user verifies their email address, phone
     *            number, or both before Amazon Cognito updates the value of
     *            that attribute. When you update a user attribute that has this
     *            option activated, Amazon Cognito sends a verification message
     *            to the new phone number or email address. Amazon Cognito
     *            doesn’t change the value of the attribute until your user
     *            responds to the verification message and confirms the new
     *            value.
     *            </p>
     *            <p>
     *            You can verify an updated email address or phone number with a
     *            <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     *            >VerifyUserAttribute</a> API request. You can also call the <a
     *            href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     *            >AdminUpdateUserAttributes</a> API and set
     *            <code>email_verified</code> or
     *            <code>phone_number_verified</code> to true.
     *            </p>
     *            <p>
     *            When <code>AttributesRequireVerificationBeforeUpdate</code> is
     *            false, your user pool doesn't require that your users verify
     *            attribute changes before Amazon Cognito updates them. In a
     *            user pool where
     *            <code>AttributesRequireVerificationBeforeUpdate</code> is
     *            false, API operations that change attribute values can
     *            immediately update a user’s <code>email</code> or
     *            <code>phone_number</code> attribute.
     *            </p>
     */
    public void setAttributesRequireVerificationBeforeUpdate(
            java.util.Collection<String> attributesRequireVerificationBeforeUpdate) {
        if (attributesRequireVerificationBeforeUpdate == null) {
            this.attributesRequireVerificationBeforeUpdate = null;
            return;
        }

        this.attributesRequireVerificationBeforeUpdate = new java.util.ArrayList<String>(
                attributesRequireVerificationBeforeUpdate);
    }

    /**
     * <p>
     * Requires that your user verifies their email address, phone number, or
     * both before Amazon Cognito updates the value of that attribute. When you
     * update a user attribute that has this option activated, Amazon Cognito
     * sends a verification message to the new phone number or email address.
     * Amazon Cognito doesn’t change the value of the attribute until your user
     * responds to the verification message and confirms the new value.
     * </p>
     * <p>
     * You can verify an updated email address or phone number with a <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     * >VerifyUserAttribute</a> API request. You can also call the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     * >AdminUpdateUserAttributes</a> API and set <code>email_verified</code> or
     * <code>phone_number_verified</code> to true.
     * </p>
     * <p>
     * When <code>AttributesRequireVerificationBeforeUpdate</code> is false,
     * your user pool doesn't require that your users verify attribute changes
     * before Amazon Cognito updates them. In a user pool where
     * <code>AttributesRequireVerificationBeforeUpdate</code> is false, API
     * operations that change attribute values can immediately update a user’s
     * <code>email</code> or <code>phone_number</code> attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributesRequireVerificationBeforeUpdate <p>
     *            Requires that your user verifies their email address, phone
     *            number, or both before Amazon Cognito updates the value of
     *            that attribute. When you update a user attribute that has this
     *            option activated, Amazon Cognito sends a verification message
     *            to the new phone number or email address. Amazon Cognito
     *            doesn’t change the value of the attribute until your user
     *            responds to the verification message and confirms the new
     *            value.
     *            </p>
     *            <p>
     *            You can verify an updated email address or phone number with a
     *            <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     *            >VerifyUserAttribute</a> API request. You can also call the <a
     *            href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     *            >AdminUpdateUserAttributes</a> API and set
     *            <code>email_verified</code> or
     *            <code>phone_number_verified</code> to true.
     *            </p>
     *            <p>
     *            When <code>AttributesRequireVerificationBeforeUpdate</code> is
     *            false, your user pool doesn't require that your users verify
     *            attribute changes before Amazon Cognito updates them. In a
     *            user pool where
     *            <code>AttributesRequireVerificationBeforeUpdate</code> is
     *            false, API operations that change attribute values can
     *            immediately update a user’s <code>email</code> or
     *            <code>phone_number</code> attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserAttributeUpdateSettingsType withAttributesRequireVerificationBeforeUpdate(
            String... attributesRequireVerificationBeforeUpdate) {
        if (getAttributesRequireVerificationBeforeUpdate() == null) {
            this.attributesRequireVerificationBeforeUpdate = new java.util.ArrayList<String>(
                    attributesRequireVerificationBeforeUpdate.length);
        }
        for (String value : attributesRequireVerificationBeforeUpdate) {
            this.attributesRequireVerificationBeforeUpdate.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Requires that your user verifies their email address, phone number, or
     * both before Amazon Cognito updates the value of that attribute. When you
     * update a user attribute that has this option activated, Amazon Cognito
     * sends a verification message to the new phone number or email address.
     * Amazon Cognito doesn’t change the value of the attribute until your user
     * responds to the verification message and confirms the new value.
     * </p>
     * <p>
     * You can verify an updated email address or phone number with a <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     * >VerifyUserAttribute</a> API request. You can also call the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     * >AdminUpdateUserAttributes</a> API and set <code>email_verified</code> or
     * <code>phone_number_verified</code> to true.
     * </p>
     * <p>
     * When <code>AttributesRequireVerificationBeforeUpdate</code> is false,
     * your user pool doesn't require that your users verify attribute changes
     * before Amazon Cognito updates them. In a user pool where
     * <code>AttributesRequireVerificationBeforeUpdate</code> is false, API
     * operations that change attribute values can immediately update a user’s
     * <code>email</code> or <code>phone_number</code> attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributesRequireVerificationBeforeUpdate <p>
     *            Requires that your user verifies their email address, phone
     *            number, or both before Amazon Cognito updates the value of
     *            that attribute. When you update a user attribute that has this
     *            option activated, Amazon Cognito sends a verification message
     *            to the new phone number or email address. Amazon Cognito
     *            doesn’t change the value of the attribute until your user
     *            responds to the verification message and confirms the new
     *            value.
     *            </p>
     *            <p>
     *            You can verify an updated email address or phone number with a
     *            <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     *            >VerifyUserAttribute</a> API request. You can also call the <a
     *            href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     *            >AdminUpdateUserAttributes</a> API and set
     *            <code>email_verified</code> or
     *            <code>phone_number_verified</code> to true.
     *            </p>
     *            <p>
     *            When <code>AttributesRequireVerificationBeforeUpdate</code> is
     *            false, your user pool doesn't require that your users verify
     *            attribute changes before Amazon Cognito updates them. In a
     *            user pool where
     *            <code>AttributesRequireVerificationBeforeUpdate</code> is
     *            false, API operations that change attribute values can
     *            immediately update a user’s <code>email</code> or
     *            <code>phone_number</code> attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserAttributeUpdateSettingsType withAttributesRequireVerificationBeforeUpdate(
            java.util.Collection<String> attributesRequireVerificationBeforeUpdate) {
        setAttributesRequireVerificationBeforeUpdate(attributesRequireVerificationBeforeUpdate);
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
        if (getAttributesRequireVerificationBeforeUpdate() != null)
            sb.append("AttributesRequireVerificationBeforeUpdate: "
                    + getAttributesRequireVerificationBeforeUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAttributesRequireVerificationBeforeUpdate() == null) ? 0
                        : getAttributesRequireVerificationBeforeUpdate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserAttributeUpdateSettingsType == false)
            return false;
        UserAttributeUpdateSettingsType other = (UserAttributeUpdateSettingsType) obj;

        if (other.getAttributesRequireVerificationBeforeUpdate() == null
                ^ this.getAttributesRequireVerificationBeforeUpdate() == null)
            return false;
        if (other.getAttributesRequireVerificationBeforeUpdate() != null
                && other.getAttributesRequireVerificationBeforeUpdate().equals(
                        this.getAttributesRequireVerificationBeforeUpdate()) == false)
            return false;
        return true;
    }
}

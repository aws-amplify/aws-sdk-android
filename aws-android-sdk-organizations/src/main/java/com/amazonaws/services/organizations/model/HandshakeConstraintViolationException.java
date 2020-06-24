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

package com.amazonaws.services.organizations.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The requested operation would violate the constraint identified in the reason
 * code.
 * </p>
 * <note>
 * <p>
 * Some of the reasons in the following list might not be applicable to this
 * specific API or operation:
 * </p>
 * </note>
 * <ul>
 * <li>
 * <p>
 * ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the
 * number of accounts in an organization. Note that deleted and closed accounts
 * still count toward your limit.
 * </p>
 * <important>
 * <p>
 * If you get this exception immediately after creating the organization, wait
 * one hour and try again. If after an hour it continues to fail with this
 * error, contact <a href="https://console.aws.amazon.com/support/home#/">AWS
 * Support</a>.
 * </p>
 * </important></li>
 * <li>
 * <p>
 * ALREADY_IN_AN_ORGANIZATION: The handshake request is invalid because the
 * invited account is already a member of an organization.
 * </p>
 * </li>
 * <li>
 * <p>
 * HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of
 * handshakes that you can send in one day.
 * </p>
 * </li>
 * <li>
 * <p>
 * INVITE_DISABLED_DURING_ENABLE_ALL_FEATURES: You can't issue new invitations
 * to join an organization while it's in the process of enabling all features.
 * You can resume inviting accounts after you finalize the process when all
 * accounts have agreed to the change.
 * </p>
 * </li>
 * <li>
 * <p>
 * ORGANIZATION_ALREADY_HAS_ALL_FEATURES: The handshake request is invalid
 * because the organization has already enabled all features.
 * </p>
 * </li>
 * <li>
 * <p>
 * ORGANIZATION_FROM_DIFFERENT_SELLER_OF_RECORD: The request failed because the
 * account is from a different marketplace than the accounts in the
 * organization. For example, accounts with India addresses must be associated
 * with the AISPL marketplace. All accounts in an organization must be from the
 * same marketplace.
 * </p>
 * </li>
 * <li>
 * <p>
 * ORGANIZATION_MEMBERSHIP_CHANGE_RATE_LIMIT_EXCEEDED: You attempted to change
 * the membership of an account too quickly after its previous change.
 * </p>
 * </li>
 * <li>
 * <p>
 * PAYMENT_INSTRUMENT_REQUIRED: You can't complete the operation with an account
 * that doesn't have a payment instrument, such as a credit card, associated
 * with it.
 * </p>
 * </li>
 * </ul>
 */
public class HandshakeConstraintViolationException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String reason;

    /**
     * Constructs a new HandshakeConstraintViolationException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public HandshakeConstraintViolationException(String message) {
        super(message);
    }

    /**
     * Returns the value of the reason property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT_NUMBER_LIMIT_EXCEEDED,
     * HANDSHAKE_RATE_LIMIT_EXCEEDED, ALREADY_IN_AN_ORGANIZATION,
     * ORGANIZATION_ALREADY_HAS_ALL_FEATURES,
     * INVITE_DISABLED_DURING_ENABLE_ALL_FEATURES, PAYMENT_INSTRUMENT_REQUIRED,
     * ORGANIZATION_FROM_DIFFERENT_SELLER_OF_RECORD,
     * ORGANIZATION_MEMBERSHIP_CHANGE_RATE_LIMIT_EXCEEDED
     *
     * @return The value of the reason property for this object.
     * @see HandshakeConstraintViolationExceptionReason
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of reason
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT_NUMBER_LIMIT_EXCEEDED,
     * HANDSHAKE_RATE_LIMIT_EXCEEDED, ALREADY_IN_AN_ORGANIZATION,
     * ORGANIZATION_ALREADY_HAS_ALL_FEATURES,
     * INVITE_DISABLED_DURING_ENABLE_ALL_FEATURES, PAYMENT_INSTRUMENT_REQUIRED,
     * ORGANIZATION_FROM_DIFFERENT_SELLER_OF_RECORD,
     * ORGANIZATION_MEMBERSHIP_CHANGE_RATE_LIMIT_EXCEEDED
     *
     * @param reason The new value for the reason property for this object.
     * @see HandshakeConstraintViolationExceptionReason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
}

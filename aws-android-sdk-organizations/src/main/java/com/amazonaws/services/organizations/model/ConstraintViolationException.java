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
 * Performing this operation violates a minimum or maximum value limit. For
 * example, attempting to remove the last service control policy (SCP) from an
 * OU or root, inviting or creating too many accounts to the organization, or
 * attaching too many policies to an account, OU, or root. This exception
 * includes a reason that contains additional information about the violated
 * limit:
 * </p>
 * <note>
 * <p>
 * Some of the reasons in the following list might not be applicable to this
 * specific API or operation.
 * </p>
 * </note>
 * <ul>
 * <li>
 * <p>
 * ACCOUNT_CANNOT_LEAVE_ORGANIZAION: You attempted to remove the master account
 * from the organization. You can't remove the master account. Instead, after
 * you remove all member accounts, delete the organization itself.
 * </p>
 * </li>
 * <li>
 * <p>
 * ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from
 * the organization that doesn't yet have enough information to exist as a
 * standalone account. This account requires you to first agree to the AWS
 * Customer Agreement. Follow the steps at <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
 * >Removing a member account from your organization</a>in the <i>AWS
 * Organizations User Guide.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an
 * account from the organization that doesn't yet have enough information to
 * exist as a standalone account. This account requires you to first complete
 * phone verification. Follow the steps at <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master"
 * >Removing a member account from your organization</a> in the <i>AWS
 * Organizations User Guide.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of
 * accounts that you can create in one day.
 * </p>
 * </li>
 * <li>
 * <p>
 * ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the
 * number of accounts in an organization. If you need more accounts, contact <a
 * href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to
 * request an increase in your limit.
 * </p>
 * <p>
 * Or the number of invitations that you tried to send would cause you to exceed
 * the limit of accounts in your organization. Send fewer invitations or contact
 * AWS Support to request an increase in the number of accounts.
 * </p>
 * <note>
 * <p>
 * Deleted and closed accounts still count toward your limit.
 * </p>
 * </note> <important>
 * <p>
 * If you get this exception when running a command immediately after creating
 * the organization, wait one hour and try again. After an hour, if the command
 * continues to fail with this error, contact <a
 * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
 * </p>
 * </important></li>
 * <li>
 * <p>
 * CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR: You attempted to register
 * the master account of the organization as a delegated administrator for an
 * AWS service integrated with Organizations. You can designate only a member
 * account as a delegated administrator.
 * </p>
 * </li>
 * <li>
 * <p>
 * CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG: You attempted to remove an
 * account that is registered as a delegated administrator for a service
 * integrated with your organization. To complete this operation, you must first
 * deregister this account as a delegated administrator.
 * </p>
 * </li>
 * <li>
 * <p>
 * CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION: To create an
 * organization in the specified region, you must enable all features mode.
 * </p>
 * </li>
 * <li>
 * <p>
 * DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE: You attempted to register an
 * AWS account as a delegated administrator for an AWS service that already has
 * a delegated administrator. To complete this operation, you must first
 * deregister any existing delegated administrators for this service.
 * </p>
 * </li>
 * <li>
 * <p>
 * EMAIL_VERIFICATION_CODE_EXPIRED: The email verification code is only valid
 * for a limited period of time. You must resubmit the request and generate a
 * new verfication code.
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
 * MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in
 * this organization, you first must migrate the organization's master account
 * to the marketplace that corresponds to the master account's address. For
 * example, accounts with India addresses must be associated with the AISPL
 * marketplace. All accounts in an organization must be associated with the same
 * marketplace.
 * </p>
 * </li>
 * <li>
 * <p>
 * MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE: Applies only to the AWS Regions in
 * China. To create an organization, the master must have an valid business
 * license. For more information, contact customer support.
 * </p>
 * </li>
 * <li>
 * <p>
 * MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must
 * first provide a valid contact address and phone number for the master
 * account. Then try the operation again.
 * </p>
 * </li>
 * <li>
 * <p>
 * MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master
 * account must have an associated account in the AWS GovCloud (US-West) Region.
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html"
 * >AWS Organizations</a> in the <i>AWS GovCloud User Guide.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with
 * this master account, you first must associate a valid payment instrument,
 * such as a credit card, with the account. Follow the steps at <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
 * >To leave an organization when all required account information has not yet
 * been provided</a> in the <i>AWS Organizations User Guide.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED: You attempted to
 * register more delegated administrators than allowed for the service
 * principal.
 * </p>
 * </li>
 * <li>
 * <p>
 * MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number
 * of policies of a certain type that can be attached to an entity at one time.
 * </p>
 * </li>
 * <li>
 * <p>
 * MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this
 * resource.
 * </p>
 * </li>
 * <li>
 * <p>
 * MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with
 * this member account, you first must associate a valid payment instrument,
 * such as a credit card, with the account. Follow the steps at <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
 * >To leave an organization when all required account information has not yet
 * been provided</a> in the <i>AWS Organizations User Guide.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy
 * from an entity that would cause the entity to have fewer than the minimum
 * number of policies of a certain type required.
 * </p>
 * </li>
 * <li>
 * <p>
 * ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation
 * that requires the organization to be configured to support all features. An
 * organization that supports only consolidated billing features can't perform
 * this operation.
 * </p>
 * </li>
 * <li>
 * <p>
 * OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many
 * levels deep.
 * </p>
 * </li>
 * <li>
 * <p>
 * OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you
 * can have in an organization.
 * </p>
 * </li>
 * <li>
 * <p>
 * POLICY_CONTENT_LIMIT_EXCEEDED: You attempted to create a policy that is
 * larger than the maximum size.
 * </p>
 * </li>
 * <li>
 * <p>
 * POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies
 * that you can have in an organization.
 * </p>
 * </li>
 * <li>
 * <p>
 * TAG_POLICY_VIOLATION: You attempted to create or update a resource with tags
 * that are not compliant with the tag policy requirements for this account.
 * </p>
 * </li>
 * </ul>
 */
public class ConstraintViolationException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String reason;

    /**
     * Constructs a new ConstraintViolationException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ConstraintViolationException(String message) {
        super(message);
    }

    /**
     * Returns the value of the reason property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT_NUMBER_LIMIT_EXCEEDED,
     * HANDSHAKE_RATE_LIMIT_EXCEEDED, OU_NUMBER_LIMIT_EXCEEDED,
     * OU_DEPTH_LIMIT_EXCEEDED, POLICY_NUMBER_LIMIT_EXCEEDED,
     * POLICY_CONTENT_LIMIT_EXCEEDED, MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED,
     * MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED,
     * ACCOUNT_CANNOT_LEAVE_ORGANIZATION, ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA,
     * ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION,
     * MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED,
     * MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED,
     * ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED,
     * MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE,
     * MASTER_ACCOUNT_MISSING_CONTACT_INFO, MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED,
     * ORGANIZATION_NOT_IN_ALL_FEATURES_MODE,
     * CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION,
     * EMAIL_VERIFICATION_CODE_EXPIRED, WAIT_PERIOD_ACTIVE,
     * MAX_TAG_LIMIT_EXCEEDED, TAG_POLICY_VIOLATION,
     * MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED,
     * CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR,
     * CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG,
     * DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE,
     * MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE
     *
     * @return The value of the reason property for this object.
     * @see ConstraintViolationExceptionReason
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of reason
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT_NUMBER_LIMIT_EXCEEDED,
     * HANDSHAKE_RATE_LIMIT_EXCEEDED, OU_NUMBER_LIMIT_EXCEEDED,
     * OU_DEPTH_LIMIT_EXCEEDED, POLICY_NUMBER_LIMIT_EXCEEDED,
     * POLICY_CONTENT_LIMIT_EXCEEDED, MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED,
     * MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED,
     * ACCOUNT_CANNOT_LEAVE_ORGANIZATION, ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA,
     * ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION,
     * MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED,
     * MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED,
     * ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED,
     * MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE,
     * MASTER_ACCOUNT_MISSING_CONTACT_INFO, MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED,
     * ORGANIZATION_NOT_IN_ALL_FEATURES_MODE,
     * CREATE_ORGANIZATION_IN_BILLING_MODE_UNSUPPORTED_REGION,
     * EMAIL_VERIFICATION_CODE_EXPIRED, WAIT_PERIOD_ACTIVE,
     * MAX_TAG_LIMIT_EXCEEDED, TAG_POLICY_VIOLATION,
     * MAX_DELEGATED_ADMINISTRATORS_FOR_SERVICE_LIMIT_EXCEEDED,
     * CANNOT_REGISTER_MASTER_AS_DELEGATED_ADMINISTRATOR,
     * CANNOT_REMOVE_DELEGATED_ADMINISTRATOR_FROM_ORG,
     * DELEGATED_ADMINISTRATOR_EXISTS_FOR_THIS_SERVICE,
     * MASTER_ACCOUNT_MISSING_BUSINESS_LICENSE
     *
     * @param reason The new value for the reason property for this object.
     * @see ConstraintViolationExceptionReason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
}

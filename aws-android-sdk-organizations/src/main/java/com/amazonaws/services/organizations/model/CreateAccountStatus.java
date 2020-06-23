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

import java.io.Serializable;

/**
 * <p>
 * Contains the status about a <a>CreateAccount</a> or
 * <a>CreateGovCloudAccount</a> request to create an AWS account or an AWS
 * GovCloud (US) account in an organization.
 * </p>
 */
public class CreateAccountStatus implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) that references this request. You get this
     * value from the response of the initial <a>CreateAccount</a> request to
     * create the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * create account request ID string requires "car-" followed by from 8 to 32
     * lower-case letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^car-[a-z0-9]{8,32}$<br/>
     */
    private String id;

    /**
     * <p>
     * The account name given to the account when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[ -\u007E]+<br/>
     */
    private String accountName;

    /**
     * <p>
     * The status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     */
    private String state;

    /**
     * <p>
     * The date and time that the request was made for the account creation.
     * </p>
     */
    private java.util.Date requestedTimestamp;

    /**
     * <p>
     * The date and time that the account was created and the request completed.
     * </p>
     */
    private java.util.Date completedTimestamp;

    /**
     * <p>
     * If the account was created successfully, the unique identifier (ID) of
     * the new account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     */
    private String accountId;

    /**
     * <p>
     * If the account was created successfully, the unique identifier (ID) of
     * the new account in the AWS GovCloud (US) Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     */
    private String govCloudAccountId;

    /**
     * <p>
     * If the request failed, a description of the reason for the failure.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have
     * reached the limit on the number of accounts in your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL_ALREADY_EXISTS: The account could not be created because another
     * AWS account with that email address already exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * GOVCLOUD_ACCOUNT_ALREADY_EXISTS: The account in the AWS GovCloud (US)
     * Region could not be created because this Region already includes an
     * account with that email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_ADDRESS: The account could not be created because the address you
     * provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_EMAIL: The account could not be created because the email address
     * you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_FAILURE: The account could not be created because of an internal
     * failure. Try again later. If the problem persists, contact Customer
     * Support.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT_LIMIT_EXCEEDED, EMAIL_ALREADY_EXISTS,
     * INVALID_ADDRESS, INVALID_EMAIL, CONCURRENT_ACCOUNT_MODIFICATION,
     * INTERNAL_FAILURE, GOVCLOUD_ACCOUNT_ALREADY_EXISTS
     */
    private String failureReason;

    /**
     * <p>
     * The unique identifier (ID) that references this request. You get this
     * value from the response of the initial <a>CreateAccount</a> request to
     * create the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * create account request ID string requires "car-" followed by from 8 to 32
     * lower-case letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^car-[a-z0-9]{8,32}$<br/>
     *
     * @return <p>
     *         The unique identifier (ID) that references this request. You get
     *         this value from the response of the initial <a>CreateAccount</a>
     *         request to create the account.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for a create account request ID string requires "car-" followed
     *         by from 8 to 32 lower-case letters or digits.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier (ID) that references this request. You get this
     * value from the response of the initial <a>CreateAccount</a> request to
     * create the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * create account request ID string requires "car-" followed by from 8 to 32
     * lower-case letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^car-[a-z0-9]{8,32}$<br/>
     *
     * @param id <p>
     *            The unique identifier (ID) that references this request. You
     *            get this value from the response of the initial
     *            <a>CreateAccount</a> request to create the account.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a create account request ID string requires
     *            "car-" followed by from 8 to 32 lower-case letters or digits.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) that references this request. You get this
     * value from the response of the initial <a>CreateAccount</a> request to
     * create the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * create account request ID string requires "car-" followed by from 8 to 32
     * lower-case letters or digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^car-[a-z0-9]{8,32}$<br/>
     *
     * @param id <p>
     *            The unique identifier (ID) that references this request. You
     *            get this value from the response of the initial
     *            <a>CreateAccount</a> request to create the account.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a create account request ID string requires
     *            "car-" followed by from 8 to 32 lower-case letters or digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAccountStatus withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The account name given to the account when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[ -\u007E]+<br/>
     *
     * @return <p>
     *         The account name given to the account when it was created.
     *         </p>
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * <p>
     * The account name given to the account when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[ -\u007E]+<br/>
     *
     * @param accountName <p>
     *            The account name given to the account when it was created.
     *            </p>
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * <p>
     * The account name given to the account when it was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[ -\u007E]+<br/>
     *
     * @param accountName <p>
     *            The account name given to the account when it was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAccountStatus withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @return <p>
     *         The status of the request.
     *         </p>
     * @see CreateAccountState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param state <p>
     *            The status of the request.
     *            </p>
     * @see CreateAccountState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param state <p>
     *            The status of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CreateAccountState
     */
    public CreateAccountStatus withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param state <p>
     *            The status of the request.
     *            </p>
     * @see CreateAccountState
     */
    public void setState(CreateAccountState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param state <p>
     *            The status of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CreateAccountState
     */
    public CreateAccountStatus withState(CreateAccountState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the request was made for the account creation.
     * </p>
     *
     * @return <p>
     *         The date and time that the request was made for the account
     *         creation.
     *         </p>
     */
    public java.util.Date getRequestedTimestamp() {
        return requestedTimestamp;
    }

    /**
     * <p>
     * The date and time that the request was made for the account creation.
     * </p>
     *
     * @param requestedTimestamp <p>
     *            The date and time that the request was made for the account
     *            creation.
     *            </p>
     */
    public void setRequestedTimestamp(java.util.Date requestedTimestamp) {
        this.requestedTimestamp = requestedTimestamp;
    }

    /**
     * <p>
     * The date and time that the request was made for the account creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestedTimestamp <p>
     *            The date and time that the request was made for the account
     *            creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAccountStatus withRequestedTimestamp(java.util.Date requestedTimestamp) {
        this.requestedTimestamp = requestedTimestamp;
        return this;
    }

    /**
     * <p>
     * The date and time that the account was created and the request completed.
     * </p>
     *
     * @return <p>
     *         The date and time that the account was created and the request
     *         completed.
     *         </p>
     */
    public java.util.Date getCompletedTimestamp() {
        return completedTimestamp;
    }

    /**
     * <p>
     * The date and time that the account was created and the request completed.
     * </p>
     *
     * @param completedTimestamp <p>
     *            The date and time that the account was created and the request
     *            completed.
     *            </p>
     */
    public void setCompletedTimestamp(java.util.Date completedTimestamp) {
        this.completedTimestamp = completedTimestamp;
    }

    /**
     * <p>
     * The date and time that the account was created and the request completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completedTimestamp <p>
     *            The date and time that the account was created and the request
     *            completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAccountStatus withCompletedTimestamp(java.util.Date completedTimestamp) {
        this.completedTimestamp = completedTimestamp;
        return this;
    }

    /**
     * <p>
     * If the account was created successfully, the unique identifier (ID) of
     * the new account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @return <p>
     *         If the account was created successfully, the unique identifier
     *         (ID) of the new account.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for an account ID string requires exactly 12 digits.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * If the account was created successfully, the unique identifier (ID) of
     * the new account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p>
     *            If the account was created successfully, the unique identifier
     *            (ID) of the new account.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an account ID string requires exactly 12
     *            digits.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * If the account was created successfully, the unique identifier (ID) of
     * the new account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p>
     *            If the account was created successfully, the unique identifier
     *            (ID) of the new account.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an account ID string requires exactly 12
     *            digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAccountStatus withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * If the account was created successfully, the unique identifier (ID) of
     * the new account in the AWS GovCloud (US) Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @return <p>
     *         If the account was created successfully, the unique identifier
     *         (ID) of the new account in the AWS GovCloud (US) Region.
     *         </p>
     */
    public String getGovCloudAccountId() {
        return govCloudAccountId;
    }

    /**
     * <p>
     * If the account was created successfully, the unique identifier (ID) of
     * the new account in the AWS GovCloud (US) Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param govCloudAccountId <p>
     *            If the account was created successfully, the unique identifier
     *            (ID) of the new account in the AWS GovCloud (US) Region.
     *            </p>
     */
    public void setGovCloudAccountId(String govCloudAccountId) {
        this.govCloudAccountId = govCloudAccountId;
    }

    /**
     * <p>
     * If the account was created successfully, the unique identifier (ID) of
     * the new account in the AWS GovCloud (US) Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param govCloudAccountId <p>
     *            If the account was created successfully, the unique identifier
     *            (ID) of the new account in the AWS GovCloud (US) Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAccountStatus withGovCloudAccountId(String govCloudAccountId) {
        this.govCloudAccountId = govCloudAccountId;
        return this;
    }

    /**
     * <p>
     * If the request failed, a description of the reason for the failure.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have
     * reached the limit on the number of accounts in your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL_ALREADY_EXISTS: The account could not be created because another
     * AWS account with that email address already exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * GOVCLOUD_ACCOUNT_ALREADY_EXISTS: The account in the AWS GovCloud (US)
     * Region could not be created because this Region already includes an
     * account with that email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_ADDRESS: The account could not be created because the address you
     * provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_EMAIL: The account could not be created because the email address
     * you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_FAILURE: The account could not be created because of an internal
     * failure. Try again later. If the problem persists, contact Customer
     * Support.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT_LIMIT_EXCEEDED, EMAIL_ALREADY_EXISTS,
     * INVALID_ADDRESS, INVALID_EMAIL, CONCURRENT_ACCOUNT_MODIFICATION,
     * INTERNAL_FAILURE, GOVCLOUD_ACCOUNT_ALREADY_EXISTS
     *
     * @return <p>
     *         If the request failed, a description of the reason for the
     *         failure.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_LIMIT_EXCEEDED: The account could not be created because
     *         you have reached the limit on the number of accounts in your
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_ALREADY_EXISTS: The account could not be created because
     *         another AWS account with that email address already exists.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GOVCLOUD_ACCOUNT_ALREADY_EXISTS: The account in the AWS GovCloud
     *         (US) Region could not be created because this Region already
     *         includes an account with that email address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ADDRESS: The account could not be created because the
     *         address you provided is not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL: The account could not be created because the email
     *         address you provided is not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INTERNAL_FAILURE: The account could not be created because of an
     *         internal failure. Try again later. If the problem persists,
     *         contact Customer Support.
     *         </p>
     *         </li>
     *         </ul>
     * @see CreateAccountFailureReason
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If the request failed, a description of the reason for the failure.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have
     * reached the limit on the number of accounts in your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL_ALREADY_EXISTS: The account could not be created because another
     * AWS account with that email address already exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * GOVCLOUD_ACCOUNT_ALREADY_EXISTS: The account in the AWS GovCloud (US)
     * Region could not be created because this Region already includes an
     * account with that email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_ADDRESS: The account could not be created because the address you
     * provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_EMAIL: The account could not be created because the email address
     * you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_FAILURE: The account could not be created because of an internal
     * failure. Try again later. If the problem persists, contact Customer
     * Support.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT_LIMIT_EXCEEDED, EMAIL_ALREADY_EXISTS,
     * INVALID_ADDRESS, INVALID_EMAIL, CONCURRENT_ACCOUNT_MODIFICATION,
     * INTERNAL_FAILURE, GOVCLOUD_ACCOUNT_ALREADY_EXISTS
     *
     * @param failureReason <p>
     *            If the request failed, a description of the reason for the
     *            failure.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ACCOUNT_LIMIT_EXCEEDED: The account could not be created
     *            because you have reached the limit on the number of accounts
     *            in your organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EMAIL_ALREADY_EXISTS: The account could not be created because
     *            another AWS account with that email address already exists.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GOVCLOUD_ACCOUNT_ALREADY_EXISTS: The account in the AWS
     *            GovCloud (US) Region could not be created because this Region
     *            already includes an account with that email address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INVALID_ADDRESS: The account could not be created because the
     *            address you provided is not valid.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INVALID_EMAIL: The account could not be created because the
     *            email address you provided is not valid.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INTERNAL_FAILURE: The account could not be created because of
     *            an internal failure. Try again later. If the problem persists,
     *            contact Customer Support.
     *            </p>
     *            </li>
     *            </ul>
     * @see CreateAccountFailureReason
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the request failed, a description of the reason for the failure.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have
     * reached the limit on the number of accounts in your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL_ALREADY_EXISTS: The account could not be created because another
     * AWS account with that email address already exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * GOVCLOUD_ACCOUNT_ALREADY_EXISTS: The account in the AWS GovCloud (US)
     * Region could not be created because this Region already includes an
     * account with that email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_ADDRESS: The account could not be created because the address you
     * provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_EMAIL: The account could not be created because the email address
     * you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_FAILURE: The account could not be created because of an internal
     * failure. Try again later. If the problem persists, contact Customer
     * Support.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT_LIMIT_EXCEEDED, EMAIL_ALREADY_EXISTS,
     * INVALID_ADDRESS, INVALID_EMAIL, CONCURRENT_ACCOUNT_MODIFICATION,
     * INTERNAL_FAILURE, GOVCLOUD_ACCOUNT_ALREADY_EXISTS
     *
     * @param failureReason <p>
     *            If the request failed, a description of the reason for the
     *            failure.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ACCOUNT_LIMIT_EXCEEDED: The account could not be created
     *            because you have reached the limit on the number of accounts
     *            in your organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EMAIL_ALREADY_EXISTS: The account could not be created because
     *            another AWS account with that email address already exists.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GOVCLOUD_ACCOUNT_ALREADY_EXISTS: The account in the AWS
     *            GovCloud (US) Region could not be created because this Region
     *            already includes an account with that email address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INVALID_ADDRESS: The account could not be created because the
     *            address you provided is not valid.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INVALID_EMAIL: The account could not be created because the
     *            email address you provided is not valid.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INTERNAL_FAILURE: The account could not be created because of
     *            an internal failure. Try again later. If the problem persists,
     *            contact Customer Support.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CreateAccountFailureReason
     */
    public CreateAccountStatus withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * If the request failed, a description of the reason for the failure.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have
     * reached the limit on the number of accounts in your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL_ALREADY_EXISTS: The account could not be created because another
     * AWS account with that email address already exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * GOVCLOUD_ACCOUNT_ALREADY_EXISTS: The account in the AWS GovCloud (US)
     * Region could not be created because this Region already includes an
     * account with that email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_ADDRESS: The account could not be created because the address you
     * provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_EMAIL: The account could not be created because the email address
     * you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_FAILURE: The account could not be created because of an internal
     * failure. Try again later. If the problem persists, contact Customer
     * Support.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT_LIMIT_EXCEEDED, EMAIL_ALREADY_EXISTS,
     * INVALID_ADDRESS, INVALID_EMAIL, CONCURRENT_ACCOUNT_MODIFICATION,
     * INTERNAL_FAILURE, GOVCLOUD_ACCOUNT_ALREADY_EXISTS
     *
     * @param failureReason <p>
     *            If the request failed, a description of the reason for the
     *            failure.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ACCOUNT_LIMIT_EXCEEDED: The account could not be created
     *            because you have reached the limit on the number of accounts
     *            in your organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EMAIL_ALREADY_EXISTS: The account could not be created because
     *            another AWS account with that email address already exists.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GOVCLOUD_ACCOUNT_ALREADY_EXISTS: The account in the AWS
     *            GovCloud (US) Region could not be created because this Region
     *            already includes an account with that email address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INVALID_ADDRESS: The account could not be created because the
     *            address you provided is not valid.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INVALID_EMAIL: The account could not be created because the
     *            email address you provided is not valid.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INTERNAL_FAILURE: The account could not be created because of
     *            an internal failure. Try again later. If the problem persists,
     *            contact Customer Support.
     *            </p>
     *            </li>
     *            </ul>
     * @see CreateAccountFailureReason
     */
    public void setFailureReason(CreateAccountFailureReason failureReason) {
        this.failureReason = failureReason.toString();
    }

    /**
     * <p>
     * If the request failed, a description of the reason for the failure.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have
     * reached the limit on the number of accounts in your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL_ALREADY_EXISTS: The account could not be created because another
     * AWS account with that email address already exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * GOVCLOUD_ACCOUNT_ALREADY_EXISTS: The account in the AWS GovCloud (US)
     * Region could not be created because this Region already includes an
     * account with that email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_ADDRESS: The account could not be created because the address you
     * provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_EMAIL: The account could not be created because the email address
     * you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_FAILURE: The account could not be created because of an internal
     * failure. Try again later. If the problem persists, contact Customer
     * Support.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT_LIMIT_EXCEEDED, EMAIL_ALREADY_EXISTS,
     * INVALID_ADDRESS, INVALID_EMAIL, CONCURRENT_ACCOUNT_MODIFICATION,
     * INTERNAL_FAILURE, GOVCLOUD_ACCOUNT_ALREADY_EXISTS
     *
     * @param failureReason <p>
     *            If the request failed, a description of the reason for the
     *            failure.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ACCOUNT_LIMIT_EXCEEDED: The account could not be created
     *            because you have reached the limit on the number of accounts
     *            in your organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EMAIL_ALREADY_EXISTS: The account could not be created because
     *            another AWS account with that email address already exists.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GOVCLOUD_ACCOUNT_ALREADY_EXISTS: The account in the AWS
     *            GovCloud (US) Region could not be created because this Region
     *            already includes an account with that email address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INVALID_ADDRESS: The account could not be created because the
     *            address you provided is not valid.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INVALID_EMAIL: The account could not be created because the
     *            email address you provided is not valid.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INTERNAL_FAILURE: The account could not be created because of
     *            an internal failure. Try again later. If the problem persists,
     *            contact Customer Support.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CreateAccountFailureReason
     */
    public CreateAccountStatus withFailureReason(CreateAccountFailureReason failureReason) {
        this.failureReason = failureReason.toString();
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getAccountName() != null)
            sb.append("AccountName: " + getAccountName() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getRequestedTimestamp() != null)
            sb.append("RequestedTimestamp: " + getRequestedTimestamp() + ",");
        if (getCompletedTimestamp() != null)
            sb.append("CompletedTimestamp: " + getCompletedTimestamp() + ",");
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getGovCloudAccountId() != null)
            sb.append("GovCloudAccountId: " + getGovCloudAccountId() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getRequestedTimestamp() == null) ? 0 : getRequestedTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getCompletedTimestamp() == null) ? 0 : getCompletedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getGovCloudAccountId() == null) ? 0 : getGovCloudAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccountStatus == false)
            return false;
        CreateAccountStatus other = (CreateAccountStatus) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAccountName() == null ^ this.getAccountName() == null)
            return false;
        if (other.getAccountName() != null
                && other.getAccountName().equals(this.getAccountName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getRequestedTimestamp() == null ^ this.getRequestedTimestamp() == null)
            return false;
        if (other.getRequestedTimestamp() != null
                && other.getRequestedTimestamp().equals(this.getRequestedTimestamp()) == false)
            return false;
        if (other.getCompletedTimestamp() == null ^ this.getCompletedTimestamp() == null)
            return false;
        if (other.getCompletedTimestamp() != null
                && other.getCompletedTimestamp().equals(this.getCompletedTimestamp()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getGovCloudAccountId() == null ^ this.getGovCloudAccountId() == null)
            return false;
        if (other.getGovCloudAccountId() != null
                && other.getGovCloudAccountId().equals(this.getGovCloudAccountId()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }
}

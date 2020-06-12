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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The structure that contains information about a specified operation's results
 * for a given account in a given Region.
 * </p>
 */
public class StackSetOperationResultSummary implements Serializable {
    /**
     * <p>
     * [<code>Self-managed</code> permissions] The name of the AWS account for
     * this operation result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String account;

    /**
     * <p>
     * The name of the AWS Region for this operation result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]{1,128}$<br/>
     */
    private String region;

    /**
     * <p>
     * The result status of the stack set operation for the given account in the
     * given Region.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and Region
     * has been cancelled. This is either because a user has stopped the stack
     * set operation, or because the failure tolerance of the stack set
     * operation has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and Region
     * failed.
     * </p>
     * <p>
     * If the stack set operation fails in enough accounts within a Region, the
     * failure tolerance for the stack set operation as a whole might be
     * exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and Region
     * is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation in the specified account and Region
     * has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and Region
     * completed successfully.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED
     */
    private String status;

    /**
     * <p>
     * The reason for the assigned result status.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * The results of the account gate function AWS CloudFormation invokes, if
     * present, before proceeding with stack set operations in an account
     * </p>
     */
    private AccountGateResult accountGateResult;

    /**
     * <p>
     * [<code>Service-managed</code> permissions] The organization root ID or
     * organizational unit (OU) IDs that you specified for <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DeploymentTargets.html"
     * >DeploymentTargets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(ou-[a-z0-9]{4,32}-[a-z0-9]{8,32}|r-[a-z0-9]{4,32})$
     * <br/>
     */
    private String organizationalUnitId;

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The name of the AWS account for
     * this operation result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         [<code>Self-managed</code> permissions] The name of the AWS
     *         account for this operation result.
     *         </p>
     */
    public String getAccount() {
        return account;
    }

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The name of the AWS account for
     * this operation result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param account <p>
     *            [<code>Self-managed</code> permissions] The name of the AWS
     *            account for this operation result.
     *            </p>
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The name of the AWS account for
     * this operation result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param account <p>
     *            [<code>Self-managed</code> permissions] The name of the AWS
     *            account for this operation result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperationResultSummary withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * <p>
     * The name of the AWS Region for this operation result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]{1,128}$<br/>
     *
     * @return <p>
     *         The name of the AWS Region for this operation result.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The name of the AWS Region for this operation result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]{1,128}$<br/>
     *
     * @param region <p>
     *            The name of the AWS Region for this operation result.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The name of the AWS Region for this operation result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]{1,128}$<br/>
     *
     * @param region <p>
     *            The name of the AWS Region for this operation result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperationResultSummary withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The result status of the stack set operation for the given account in the
     * given Region.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and Region
     * has been cancelled. This is either because a user has stopped the stack
     * set operation, or because the failure tolerance of the stack set
     * operation has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and Region
     * failed.
     * </p>
     * <p>
     * If the stack set operation fails in enough accounts within a Region, the
     * failure tolerance for the stack set operation as a whole might be
     * exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and Region
     * is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation in the specified account and Region
     * has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and Region
     * completed successfully.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED
     *
     * @return <p>
     *         The result status of the stack set operation for the given
     *         account in the given Region.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CANCELLED</code>: The operation in the specified account
     *         and Region has been cancelled. This is either because a user has
     *         stopped the stack set operation, or because the failure tolerance
     *         of the stack set operation has been exceeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The operation in the specified account and
     *         Region failed.
     *         </p>
     *         <p>
     *         If the stack set operation fails in enough accounts within a
     *         Region, the failure tolerance for the stack set operation as a
     *         whole might be exceeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RUNNING</code>: The operation in the specified account and
     *         Region is currently in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING</code>: The operation in the specified account and
     *         Region has yet to start.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code>: The operation in the specified account
     *         and Region completed successfully.
     *         </p>
     *         </li>
     *         </ul>
     * @see StackSetOperationResultStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The result status of the stack set operation for the given account in the
     * given Region.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and Region
     * has been cancelled. This is either because a user has stopped the stack
     * set operation, or because the failure tolerance of the stack set
     * operation has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and Region
     * failed.
     * </p>
     * <p>
     * If the stack set operation fails in enough accounts within a Region, the
     * failure tolerance for the stack set operation as a whole might be
     * exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and Region
     * is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation in the specified account and Region
     * has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and Region
     * completed successfully.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED
     *
     * @param status <p>
     *            The result status of the stack set operation for the given
     *            account in the given Region.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CANCELLED</code>: The operation in the specified account
     *            and Region has been cancelled. This is either because a user
     *            has stopped the stack set operation, or because the failure
     *            tolerance of the stack set operation has been exceeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The operation in the specified account
     *            and Region failed.
     *            </p>
     *            <p>
     *            If the stack set operation fails in enough accounts within a
     *            Region, the failure tolerance for the stack set operation as a
     *            whole might be exceeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RUNNING</code>: The operation in the specified account
     *            and Region is currently in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PENDING</code>: The operation in the specified account
     *            and Region has yet to start.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The operation in the specified account
     *            and Region completed successfully.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackSetOperationResultStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The result status of the stack set operation for the given account in the
     * given Region.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and Region
     * has been cancelled. This is either because a user has stopped the stack
     * set operation, or because the failure tolerance of the stack set
     * operation has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and Region
     * failed.
     * </p>
     * <p>
     * If the stack set operation fails in enough accounts within a Region, the
     * failure tolerance for the stack set operation as a whole might be
     * exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and Region
     * is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation in the specified account and Region
     * has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and Region
     * completed successfully.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED
     *
     * @param status <p>
     *            The result status of the stack set operation for the given
     *            account in the given Region.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CANCELLED</code>: The operation in the specified account
     *            and Region has been cancelled. This is either because a user
     *            has stopped the stack set operation, or because the failure
     *            tolerance of the stack set operation has been exceeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The operation in the specified account
     *            and Region failed.
     *            </p>
     *            <p>
     *            If the stack set operation fails in enough accounts within a
     *            Region, the failure tolerance for the stack set operation as a
     *            whole might be exceeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RUNNING</code>: The operation in the specified account
     *            and Region is currently in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PENDING</code>: The operation in the specified account
     *            and Region has yet to start.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The operation in the specified account
     *            and Region completed successfully.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetOperationResultStatus
     */
    public StackSetOperationResultSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The result status of the stack set operation for the given account in the
     * given Region.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and Region
     * has been cancelled. This is either because a user has stopped the stack
     * set operation, or because the failure tolerance of the stack set
     * operation has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and Region
     * failed.
     * </p>
     * <p>
     * If the stack set operation fails in enough accounts within a Region, the
     * failure tolerance for the stack set operation as a whole might be
     * exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and Region
     * is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation in the specified account and Region
     * has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and Region
     * completed successfully.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED
     *
     * @param status <p>
     *            The result status of the stack set operation for the given
     *            account in the given Region.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CANCELLED</code>: The operation in the specified account
     *            and Region has been cancelled. This is either because a user
     *            has stopped the stack set operation, or because the failure
     *            tolerance of the stack set operation has been exceeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The operation in the specified account
     *            and Region failed.
     *            </p>
     *            <p>
     *            If the stack set operation fails in enough accounts within a
     *            Region, the failure tolerance for the stack set operation as a
     *            whole might be exceeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RUNNING</code>: The operation in the specified account
     *            and Region is currently in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PENDING</code>: The operation in the specified account
     *            and Region has yet to start.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The operation in the specified account
     *            and Region completed successfully.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackSetOperationResultStatus
     */
    public void setStatus(StackSetOperationResultStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The result status of the stack set operation for the given account in the
     * given Region.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and Region
     * has been cancelled. This is either because a user has stopped the stack
     * set operation, or because the failure tolerance of the stack set
     * operation has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and Region
     * failed.
     * </p>
     * <p>
     * If the stack set operation fails in enough accounts within a Region, the
     * failure tolerance for the stack set operation as a whole might be
     * exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and Region
     * is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation in the specified account and Region
     * has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and Region
     * completed successfully.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED
     *
     * @param status <p>
     *            The result status of the stack set operation for the given
     *            account in the given Region.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CANCELLED</code>: The operation in the specified account
     *            and Region has been cancelled. This is either because a user
     *            has stopped the stack set operation, or because the failure
     *            tolerance of the stack set operation has been exceeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The operation in the specified account
     *            and Region failed.
     *            </p>
     *            <p>
     *            If the stack set operation fails in enough accounts within a
     *            Region, the failure tolerance for the stack set operation as a
     *            whole might be exceeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RUNNING</code>: The operation in the specified account
     *            and Region is currently in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PENDING</code>: The operation in the specified account
     *            and Region has yet to start.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The operation in the specified account
     *            and Region completed successfully.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetOperationResultStatus
     */
    public StackSetOperationResultSummary withStatus(StackSetOperationResultStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the assigned result status.
     * </p>
     *
     * @return <p>
     *         The reason for the assigned result status.
     *         </p>
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * <p>
     * The reason for the assigned result status.
     * </p>
     *
     * @param statusReason <p>
     *            The reason for the assigned result status.
     *            </p>
     */
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the assigned result status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusReason <p>
     *            The reason for the assigned result status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperationResultSummary withStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * <p>
     * The results of the account gate function AWS CloudFormation invokes, if
     * present, before proceeding with stack set operations in an account
     * </p>
     *
     * @return <p>
     *         The results of the account gate function AWS CloudFormation
     *         invokes, if present, before proceeding with stack set operations
     *         in an account
     *         </p>
     */
    public AccountGateResult getAccountGateResult() {
        return accountGateResult;
    }

    /**
     * <p>
     * The results of the account gate function AWS CloudFormation invokes, if
     * present, before proceeding with stack set operations in an account
     * </p>
     *
     * @param accountGateResult <p>
     *            The results of the account gate function AWS CloudFormation
     *            invokes, if present, before proceeding with stack set
     *            operations in an account
     *            </p>
     */
    public void setAccountGateResult(AccountGateResult accountGateResult) {
        this.accountGateResult = accountGateResult;
    }

    /**
     * <p>
     * The results of the account gate function AWS CloudFormation invokes, if
     * present, before proceeding with stack set operations in an account
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountGateResult <p>
     *            The results of the account gate function AWS CloudFormation
     *            invokes, if present, before proceeding with stack set
     *            operations in an account
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperationResultSummary withAccountGateResult(AccountGateResult accountGateResult) {
        this.accountGateResult = accountGateResult;
        return this;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] The organization root ID or
     * organizational unit (OU) IDs that you specified for <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DeploymentTargets.html"
     * >DeploymentTargets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(ou-[a-z0-9]{4,32}-[a-z0-9]{8,32}|r-[a-z0-9]{4,32})$
     * <br/>
     *
     * @return <p>
     *         [<code>Service-managed</code> permissions] The organization root
     *         ID or organizational unit (OU) IDs that you specified for <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DeploymentTargets.html"
     *         >DeploymentTargets</a>.
     *         </p>
     */
    public String getOrganizationalUnitId() {
        return organizationalUnitId;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] The organization root ID or
     * organizational unit (OU) IDs that you specified for <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DeploymentTargets.html"
     * >DeploymentTargets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(ou-[a-z0-9]{4,32}-[a-z0-9]{8,32}|r-[a-z0-9]{4,32})$
     * <br/>
     *
     * @param organizationalUnitId <p>
     *            [<code>Service-managed</code> permissions] The organization
     *            root ID or organizational unit (OU) IDs that you specified for
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DeploymentTargets.html"
     *            >DeploymentTargets</a>.
     *            </p>
     */
    public void setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] The organization root ID or
     * organizational unit (OU) IDs that you specified for <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DeploymentTargets.html"
     * >DeploymentTargets</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(ou-[a-z0-9]{4,32}-[a-z0-9]{8,32}|r-[a-z0-9]{4,32})$
     * <br/>
     *
     * @param organizationalUnitId <p>
     *            [<code>Service-managed</code> permissions] The organization
     *            root ID or organizational unit (OU) IDs that you specified for
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DeploymentTargets.html"
     *            >DeploymentTargets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperationResultSummary withOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
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
        if (getAccount() != null)
            sb.append("Account: " + getAccount() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusReason() != null)
            sb.append("StatusReason: " + getStatusReason() + ",");
        if (getAccountGateResult() != null)
            sb.append("AccountGateResult: " + getAccountGateResult() + ",");
        if (getOrganizationalUnitId() != null)
            sb.append("OrganizationalUnitId: " + getOrganizationalUnitId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode
                + ((getAccountGateResult() == null) ? 0 : getAccountGateResult().hashCode());
        hashCode = prime * hashCode
                + ((getOrganizationalUnitId() == null) ? 0 : getOrganizationalUnitId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSetOperationResultSummary == false)
            return false;
        StackSetOperationResultSummary other = (StackSetOperationResultSummary) obj;

        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null
                && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getAccountGateResult() == null ^ this.getAccountGateResult() == null)
            return false;
        if (other.getAccountGateResult() != null
                && other.getAccountGateResult().equals(this.getAccountGateResult()) == false)
            return false;
        if (other.getOrganizationalUnitId() == null ^ this.getOrganizationalUnitId() == null)
            return false;
        if (other.getOrganizationalUnitId() != null
                && other.getOrganizationalUnitId().equals(this.getOrganizationalUnitId()) == false)
            return false;
        return true;
    }
}

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
 * The structures that contain summary information about the specified stack
 * set.
 * </p>
 */
public class StackSetSummary implements Serializable {
    /**
     * <p>
     * The name of the stack set.
     * </p>
     */
    private String stackSetName;

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     */
    private String stackSetId;

    /**
     * <p>
     * A description of the stack set that you specify when the stack set is
     * created or updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     */
    private String status;

    /**
     * <p>
     * [<code>Service-managed</code> permissions] Describes whether StackSets
     * automatically deploys to AWS Organizations accounts that are added to a
     * target organizational unit (OU).
     * </p>
     */
    private AutoDeployment autoDeployment;

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the
     * administrator and execution roles required to deploy to target accounts.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     * >Grant Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically
     * creates the IAM roles required to deploy to accounts managed by AWS
     * Organizations. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, SELF_MANAGED
     */
    private String permissionModel;

    /**
     * <p>
     * Status of the stack set's actual configuration compared to its expected
     * template and parameter configuration. A stack set is considered to have
     * drifted if one or more of its stack instances have drifted from their
     * expected template and parameter configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: One or more of the stack instances belonging to the
     * stack set stack differs from the expected template and parameter
     * configuration. A stack instance is considered to have drifted if one or
     * more of the resources in the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the stack
     * set for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: All of the stack instances belonging to the stack
     * set stack match from the expected template and parameter configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, UNKNOWN, NOT_CHECKED
     */
    private String driftStatus;

    /**
     * <p>
     * Most recent time when CloudFormation performed a drift detection
     * operation on the stack set. This value will be <code>NULL</code> for any
     * stack set on which drift detection has not yet been performed.
     * </p>
     */
    private java.util.Date lastDriftCheckTimestamp;

    /**
     * <p>
     * The name of the stack set.
     * </p>
     *
     * @return <p>
     *         The name of the stack set.
     *         </p>
     */
    public String getStackSetName() {
        return stackSetName;
    }

    /**
     * <p>
     * The name of the stack set.
     * </p>
     *
     * @param stackSetName <p>
     *            The name of the stack set.
     *            </p>
     */
    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name of the stack set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetName <p>
     *            The name of the stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetSummary withStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
        return this;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     *
     * @return <p>
     *         The ID of the stack set.
     *         </p>
     */
    public String getStackSetId() {
        return stackSetId;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     *
     * @param stackSetId <p>
     *            The ID of the stack set.
     *            </p>
     */
    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetId <p>
     *            The ID of the stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetSummary withStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
        return this;
    }

    /**
     * <p>
     * A description of the stack set that you specify when the stack set is
     * created or updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A description of the stack set that you specify when the stack
     *         set is created or updated.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the stack set that you specify when the stack set is
     * created or updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A description of the stack set that you specify when the stack
     *            set is created or updated.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the stack set that you specify when the stack set is
     * created or updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A description of the stack set that you specify when the stack
     *            set is created or updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetSummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     *
     * @return <p>
     *         The status of the stack set.
     *         </p>
     * @see StackSetStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     *
     * @param status <p>
     *            The status of the stack set.
     *            </p>
     * @see StackSetStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     *
     * @param status <p>
     *            The status of the stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetStatus
     */
    public StackSetSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     *
     * @param status <p>
     *            The status of the stack set.
     *            </p>
     * @see StackSetStatus
     */
    public void setStatus(StackSetStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     *
     * @param status <p>
     *            The status of the stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetStatus
     */
    public StackSetSummary withStatus(StackSetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] Describes whether StackSets
     * automatically deploys to AWS Organizations accounts that are added to a
     * target organizational unit (OU).
     * </p>
     *
     * @return <p>
     *         [<code>Service-managed</code> permissions] Describes whether
     *         StackSets automatically deploys to AWS Organizations accounts
     *         that are added to a target organizational unit (OU).
     *         </p>
     */
    public AutoDeployment getAutoDeployment() {
        return autoDeployment;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] Describes whether StackSets
     * automatically deploys to AWS Organizations accounts that are added to a
     * target organizational unit (OU).
     * </p>
     *
     * @param autoDeployment <p>
     *            [<code>Service-managed</code> permissions] Describes whether
     *            StackSets automatically deploys to AWS Organizations accounts
     *            that are added to a target organizational unit (OU).
     *            </p>
     */
    public void setAutoDeployment(AutoDeployment autoDeployment) {
        this.autoDeployment = autoDeployment;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] Describes whether StackSets
     * automatically deploys to AWS Organizations accounts that are added to a
     * target organizational unit (OU).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoDeployment <p>
     *            [<code>Service-managed</code> permissions] Describes whether
     *            StackSets automatically deploys to AWS Organizations accounts
     *            that are added to a target organizational unit (OU).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetSummary withAutoDeployment(AutoDeployment autoDeployment) {
        this.autoDeployment = autoDeployment;
        return this;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the
     * administrator and execution roles required to deploy to target accounts.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     * >Grant Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically
     * creates the IAM roles required to deploy to accounts managed by AWS
     * Organizations. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, SELF_MANAGED
     *
     * @return <p>
     *         Describes how the IAM roles required for stack set operations are
     *         created.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         With <code>self-managed</code> permissions, you must create the
     *         administrator and execution roles required to deploy to target
     *         accounts. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     *         >Grant Self-Managed Stack Set Permissions</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         With <code>service-managed</code> permissions, StackSets
     *         automatically creates the IAM roles required to deploy to
     *         accounts managed by AWS Organizations. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *         >Grant Service-Managed Stack Set Permissions</a>.
     *         </p>
     *         </li>
     *         </ul>
     * @see PermissionModels
     */
    public String getPermissionModel() {
        return permissionModel;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the
     * administrator and execution roles required to deploy to target accounts.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     * >Grant Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically
     * creates the IAM roles required to deploy to accounts managed by AWS
     * Organizations. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, SELF_MANAGED
     *
     * @param permissionModel <p>
     *            Describes how the IAM roles required for stack set operations
     *            are created.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            With <code>self-managed</code> permissions, you must create
     *            the administrator and execution roles required to deploy to
     *            target accounts. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     *            >Grant Self-Managed Stack Set Permissions</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            With <code>service-managed</code> permissions, StackSets
     *            automatically creates the IAM roles required to deploy to
     *            accounts managed by AWS Organizations. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *            >Grant Service-Managed Stack Set Permissions</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @see PermissionModels
     */
    public void setPermissionModel(String permissionModel) {
        this.permissionModel = permissionModel;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the
     * administrator and execution roles required to deploy to target accounts.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     * >Grant Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically
     * creates the IAM roles required to deploy to accounts managed by AWS
     * Organizations. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, SELF_MANAGED
     *
     * @param permissionModel <p>
     *            Describes how the IAM roles required for stack set operations
     *            are created.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            With <code>self-managed</code> permissions, you must create
     *            the administrator and execution roles required to deploy to
     *            target accounts. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     *            >Grant Self-Managed Stack Set Permissions</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            With <code>service-managed</code> permissions, StackSets
     *            automatically creates the IAM roles required to deploy to
     *            accounts managed by AWS Organizations. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *            >Grant Service-Managed Stack Set Permissions</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PermissionModels
     */
    public StackSetSummary withPermissionModel(String permissionModel) {
        this.permissionModel = permissionModel;
        return this;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the
     * administrator and execution roles required to deploy to target accounts.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     * >Grant Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically
     * creates the IAM roles required to deploy to accounts managed by AWS
     * Organizations. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, SELF_MANAGED
     *
     * @param permissionModel <p>
     *            Describes how the IAM roles required for stack set operations
     *            are created.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            With <code>self-managed</code> permissions, you must create
     *            the administrator and execution roles required to deploy to
     *            target accounts. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     *            >Grant Self-Managed Stack Set Permissions</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            With <code>service-managed</code> permissions, StackSets
     *            automatically creates the IAM roles required to deploy to
     *            accounts managed by AWS Organizations. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *            >Grant Service-Managed Stack Set Permissions</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @see PermissionModels
     */
    public void setPermissionModel(PermissionModels permissionModel) {
        this.permissionModel = permissionModel.toString();
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the
     * administrator and execution roles required to deploy to target accounts.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     * >Grant Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically
     * creates the IAM roles required to deploy to accounts managed by AWS
     * Organizations. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, SELF_MANAGED
     *
     * @param permissionModel <p>
     *            Describes how the IAM roles required for stack set operations
     *            are created.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            With <code>self-managed</code> permissions, you must create
     *            the administrator and execution roles required to deploy to
     *            target accounts. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     *            >Grant Self-Managed Stack Set Permissions</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            With <code>service-managed</code> permissions, StackSets
     *            automatically creates the IAM roles required to deploy to
     *            accounts managed by AWS Organizations. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *            >Grant Service-Managed Stack Set Permissions</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PermissionModels
     */
    public StackSetSummary withPermissionModel(PermissionModels permissionModel) {
        this.permissionModel = permissionModel.toString();
        return this;
    }

    /**
     * <p>
     * Status of the stack set's actual configuration compared to its expected
     * template and parameter configuration. A stack set is considered to have
     * drifted if one or more of its stack instances have drifted from their
     * expected template and parameter configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: One or more of the stack instances belonging to the
     * stack set stack differs from the expected template and parameter
     * configuration. A stack instance is considered to have drifted if one or
     * more of the resources in the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the stack
     * set for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: All of the stack instances belonging to the stack
     * set stack match from the expected template and parameter configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, UNKNOWN, NOT_CHECKED
     *
     * @return <p>
     *         Status of the stack set's actual configuration compared to its
     *         expected template and parameter configuration. A stack set is
     *         considered to have drifted if one or more of its stack instances
     *         have drifted from their expected template and parameter
     *         configuration.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DRIFTED</code>: One or more of the stack instances
     *         belonging to the stack set stack differs from the expected
     *         template and parameter configuration. A stack instance is
     *         considered to have drifted if one or more of the resources in the
     *         associated stack have drifted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the
     *         stack set for drift.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_SYNC</code>: All of the stack instances belonging to the
     *         stack set stack match from the expected template and parameter
     *         configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNKNOWN</code>: This value is reserved for future use.
     *         </p>
     *         </li>
     *         </ul>
     * @see StackDriftStatus
     */
    public String getDriftStatus() {
        return driftStatus;
    }

    /**
     * <p>
     * Status of the stack set's actual configuration compared to its expected
     * template and parameter configuration. A stack set is considered to have
     * drifted if one or more of its stack instances have drifted from their
     * expected template and parameter configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: One or more of the stack instances belonging to the
     * stack set stack differs from the expected template and parameter
     * configuration. A stack instance is considered to have drifted if one or
     * more of the resources in the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the stack
     * set for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: All of the stack instances belonging to the stack
     * set stack match from the expected template and parameter configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, UNKNOWN, NOT_CHECKED
     *
     * @param driftStatus <p>
     *            Status of the stack set's actual configuration compared to its
     *            expected template and parameter configuration. A stack set is
     *            considered to have drifted if one or more of its stack
     *            instances have drifted from their expected template and
     *            parameter configuration.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DRIFTED</code>: One or more of the stack instances
     *            belonging to the stack set stack differs from the expected
     *            template and parameter configuration. A stack instance is
     *            considered to have drifted if one or more of the resources in
     *            the associated stack have drifted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation has not checked
     *            the stack set for drift.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: All of the stack instances belonging to
     *            the stack set stack match from the expected template and
     *            parameter configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UNKNOWN</code>: This value is reserved for future use.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackDriftStatus
     */
    public void setDriftStatus(String driftStatus) {
        this.driftStatus = driftStatus;
    }

    /**
     * <p>
     * Status of the stack set's actual configuration compared to its expected
     * template and parameter configuration. A stack set is considered to have
     * drifted if one or more of its stack instances have drifted from their
     * expected template and parameter configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: One or more of the stack instances belonging to the
     * stack set stack differs from the expected template and parameter
     * configuration. A stack instance is considered to have drifted if one or
     * more of the resources in the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the stack
     * set for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: All of the stack instances belonging to the stack
     * set stack match from the expected template and parameter configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, UNKNOWN, NOT_CHECKED
     *
     * @param driftStatus <p>
     *            Status of the stack set's actual configuration compared to its
     *            expected template and parameter configuration. A stack set is
     *            considered to have drifted if one or more of its stack
     *            instances have drifted from their expected template and
     *            parameter configuration.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DRIFTED</code>: One or more of the stack instances
     *            belonging to the stack set stack differs from the expected
     *            template and parameter configuration. A stack instance is
     *            considered to have drifted if one or more of the resources in
     *            the associated stack have drifted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation has not checked
     *            the stack set for drift.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: All of the stack instances belonging to
     *            the stack set stack match from the expected template and
     *            parameter configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UNKNOWN</code>: This value is reserved for future use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackDriftStatus
     */
    public StackSetSummary withDriftStatus(String driftStatus) {
        this.driftStatus = driftStatus;
        return this;
    }

    /**
     * <p>
     * Status of the stack set's actual configuration compared to its expected
     * template and parameter configuration. A stack set is considered to have
     * drifted if one or more of its stack instances have drifted from their
     * expected template and parameter configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: One or more of the stack instances belonging to the
     * stack set stack differs from the expected template and parameter
     * configuration. A stack instance is considered to have drifted if one or
     * more of the resources in the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the stack
     * set for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: All of the stack instances belonging to the stack
     * set stack match from the expected template and parameter configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, UNKNOWN, NOT_CHECKED
     *
     * @param driftStatus <p>
     *            Status of the stack set's actual configuration compared to its
     *            expected template and parameter configuration. A stack set is
     *            considered to have drifted if one or more of its stack
     *            instances have drifted from their expected template and
     *            parameter configuration.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DRIFTED</code>: One or more of the stack instances
     *            belonging to the stack set stack differs from the expected
     *            template and parameter configuration. A stack instance is
     *            considered to have drifted if one or more of the resources in
     *            the associated stack have drifted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation has not checked
     *            the stack set for drift.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: All of the stack instances belonging to
     *            the stack set stack match from the expected template and
     *            parameter configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UNKNOWN</code>: This value is reserved for future use.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackDriftStatus
     */
    public void setDriftStatus(StackDriftStatus driftStatus) {
        this.driftStatus = driftStatus.toString();
    }

    /**
     * <p>
     * Status of the stack set's actual configuration compared to its expected
     * template and parameter configuration. A stack set is considered to have
     * drifted if one or more of its stack instances have drifted from their
     * expected template and parameter configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: One or more of the stack instances belonging to the
     * stack set stack differs from the expected template and parameter
     * configuration. A stack instance is considered to have drifted if one or
     * more of the resources in the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the stack
     * set for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: All of the stack instances belonging to the stack
     * set stack match from the expected template and parameter configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, UNKNOWN, NOT_CHECKED
     *
     * @param driftStatus <p>
     *            Status of the stack set's actual configuration compared to its
     *            expected template and parameter configuration. A stack set is
     *            considered to have drifted if one or more of its stack
     *            instances have drifted from their expected template and
     *            parameter configuration.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DRIFTED</code>: One or more of the stack instances
     *            belonging to the stack set stack differs from the expected
     *            template and parameter configuration. A stack instance is
     *            considered to have drifted if one or more of the resources in
     *            the associated stack have drifted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation has not checked
     *            the stack set for drift.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: All of the stack instances belonging to
     *            the stack set stack match from the expected template and
     *            parameter configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UNKNOWN</code>: This value is reserved for future use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackDriftStatus
     */
    public StackSetSummary withDriftStatus(StackDriftStatus driftStatus) {
        this.driftStatus = driftStatus.toString();
        return this;
    }

    /**
     * <p>
     * Most recent time when CloudFormation performed a drift detection
     * operation on the stack set. This value will be <code>NULL</code> for any
     * stack set on which drift detection has not yet been performed.
     * </p>
     *
     * @return <p>
     *         Most recent time when CloudFormation performed a drift detection
     *         operation on the stack set. This value will be <code>NULL</code>
     *         for any stack set on which drift detection has not yet been
     *         performed.
     *         </p>
     */
    public java.util.Date getLastDriftCheckTimestamp() {
        return lastDriftCheckTimestamp;
    }

    /**
     * <p>
     * Most recent time when CloudFormation performed a drift detection
     * operation on the stack set. This value will be <code>NULL</code> for any
     * stack set on which drift detection has not yet been performed.
     * </p>
     *
     * @param lastDriftCheckTimestamp <p>
     *            Most recent time when CloudFormation performed a drift
     *            detection operation on the stack set. This value will be
     *            <code>NULL</code> for any stack set on which drift detection
     *            has not yet been performed.
     *            </p>
     */
    public void setLastDriftCheckTimestamp(java.util.Date lastDriftCheckTimestamp) {
        this.lastDriftCheckTimestamp = lastDriftCheckTimestamp;
    }

    /**
     * <p>
     * Most recent time when CloudFormation performed a drift detection
     * operation on the stack set. This value will be <code>NULL</code> for any
     * stack set on which drift detection has not yet been performed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastDriftCheckTimestamp <p>
     *            Most recent time when CloudFormation performed a drift
     *            detection operation on the stack set. This value will be
     *            <code>NULL</code> for any stack set on which drift detection
     *            has not yet been performed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetSummary withLastDriftCheckTimestamp(java.util.Date lastDriftCheckTimestamp) {
        this.lastDriftCheckTimestamp = lastDriftCheckTimestamp;
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
        if (getStackSetName() != null)
            sb.append("StackSetName: " + getStackSetName() + ",");
        if (getStackSetId() != null)
            sb.append("StackSetId: " + getStackSetId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getAutoDeployment() != null)
            sb.append("AutoDeployment: " + getAutoDeployment() + ",");
        if (getPermissionModel() != null)
            sb.append("PermissionModel: " + getPermissionModel() + ",");
        if (getDriftStatus() != null)
            sb.append("DriftStatus: " + getDriftStatus() + ",");
        if (getLastDriftCheckTimestamp() != null)
            sb.append("LastDriftCheckTimestamp: " + getLastDriftCheckTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getStackSetId() == null) ? 0 : getStackSetId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getAutoDeployment() == null) ? 0 : getAutoDeployment().hashCode());
        hashCode = prime * hashCode
                + ((getPermissionModel() == null) ? 0 : getPermissionModel().hashCode());
        hashCode = prime * hashCode
                + ((getDriftStatus() == null) ? 0 : getDriftStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastDriftCheckTimestamp() == null) ? 0 : getLastDriftCheckTimestamp()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSetSummary == false)
            return false;
        StackSetSummary other = (StackSetSummary) obj;

        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null
                && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getStackSetId() == null ^ this.getStackSetId() == null)
            return false;
        if (other.getStackSetId() != null
                && other.getStackSetId().equals(this.getStackSetId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAutoDeployment() == null ^ this.getAutoDeployment() == null)
            return false;
        if (other.getAutoDeployment() != null
                && other.getAutoDeployment().equals(this.getAutoDeployment()) == false)
            return false;
        if (other.getPermissionModel() == null ^ this.getPermissionModel() == null)
            return false;
        if (other.getPermissionModel() != null
                && other.getPermissionModel().equals(this.getPermissionModel()) == false)
            return false;
        if (other.getDriftStatus() == null ^ this.getDriftStatus() == null)
            return false;
        if (other.getDriftStatus() != null
                && other.getDriftStatus().equals(this.getDriftStatus()) == false)
            return false;
        if (other.getLastDriftCheckTimestamp() == null ^ this.getLastDriftCheckTimestamp() == null)
            return false;
        if (other.getLastDriftCheckTimestamp() != null
                && other.getLastDriftCheckTimestamp().equals(this.getLastDriftCheckTimestamp()) == false)
            return false;
        return true;
    }
}

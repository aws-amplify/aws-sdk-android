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
 * The Stack data type.
 * </p>
 */
public class Stack implements Serializable {
    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     */
    private String stackId;

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     */
    private String stackName;

    /**
     * <p>
     * The unique ID of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>arn:[-a-zA-Z0-9:/]*<br/>
     */
    private String changeSetId;

    /**
     * <p>
     * A user-defined description associated with the stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * A list of <code>Parameter</code> structures.
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * The time at which the stack was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     */
    private java.util.Date deletionTime;

    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if
     * the stack has been updated at least once.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The rollback triggers for AWS CloudFormation to monitor during stack
     * creation and updating operations, and for the specified monitoring period
     * afterwards.
     * </p>
     */
    private RollbackConfiguration rollbackConfiguration;

    /**
     * <p>
     * Current status of the stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED,
     * ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE,
     * UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED,
     * UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE,
     * REVIEW_IN_PROGRESS, IMPORT_IN_PROGRESS, IMPORT_COMPLETE,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     */
    private String stackStatus;

    /**
     * <p>
     * Success/failure message associated with the stack status.
     * </p>
     */
    private String stackStatusReason;

    /**
     * <p>
     * Boolean to enable or disable rollback on stack creation failures:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: disable rollback
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: enable rollback
     * </p>
     * </li>
     * </ul>
     */
    private Boolean disableRollback;

    /**
     * <p>
     * SNS topic ARNs to which stack related events are published.
     * </p>
     */
    private java.util.List<String> notificationARNs;

    /**
     * <p>
     * The amount of time within which stack creation should complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer timeoutInMinutes;

    /**
     * <p>
     * The capabilities allowed in the stack.
     * </p>
     */
    private java.util.List<String> capabilities;

    /**
     * <p>
     * A list of output structures.
     * </p>
     */
    private java.util.List<Output> outputs;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that is associated with the stack. During a stack operation,
     * AWS CloudFormation uses this role's credentials to make calls on your
     * behalf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleARN;

    /**
     * <p>
     * A list of <code>Tag</code>s that specify information about the stack.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Whether termination protection is enabled for the stack.
     * </p>
     * <p>
     * For <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >nested stacks</a>, termination protection is set on the root stack and
     * cannot be changed directly on the nested stack. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     * >Protecting a Stack From Being Deleted</a> in the <i>AWS CloudFormation
     * User Guide</i>.
     * </p>
     */
    private Boolean enableTerminationProtection;

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the
     * stack ID of the direct parent of this stack. For the first level of
     * nested stacks, the root stack is also the parent stack.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     */
    private String parentId;

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the
     * stack ID of the top-level stack to which the nested stack ultimately
     * belongs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     */
    private String rootId;

    /**
     * <p>
     * Information on whether a stack's actual configuration differs, or has
     * <i>drifted</i>, from it's expected configuration, as defined in the stack
     * template and any values specified as template parameters. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     */
    private StackDriftInformation driftInformation;

    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     *
     * @return <p>
     *         Unique identifier of the stack.
     *         </p>
     */
    public String getStackId() {
        return stackId;
    }

    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     *
     * @param stackId <p>
     *            Unique identifier of the stack.
     *            </p>
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackId <p>
     *            Unique identifier of the stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     *
     * @return <p>
     *         The name associated with the stack.
     *         </p>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     *
     * @param stackName <p>
     *            The name associated with the stack.
     *            </p>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackName <p>
     *            The name associated with the stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * <p>
     * The unique ID of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @return <p>
     *         The unique ID of the change set.
     *         </p>
     */
    public String getChangeSetId() {
        return changeSetId;
    }

    /**
     * <p>
     * The unique ID of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @param changeSetId <p>
     *            The unique ID of the change set.
     *            </p>
     */
    public void setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
    }

    /**
     * <p>
     * The unique ID of the change set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @param changeSetId <p>
     *            The unique ID of the change set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }

    /**
     * <p>
     * A user-defined description associated with the stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A user-defined description associated with the stack.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A user-defined description associated with the stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A user-defined description associated with the stack.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-defined description associated with the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A user-defined description associated with the stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures.
     * </p>
     *
     * @return <p>
     *         A list of <code>Parameter</code> structures.
     *         </p>
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures.
     * </p>
     *
     * @param parameters <p>
     *            A list of <code>Parameter</code> structures.
     *            </p>
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<Parameter>(parameters);
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of <code>Parameter</code> structures.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withParameters(Parameter... parameters) {
        if (getParameters() == null) {
            this.parameters = new java.util.ArrayList<Parameter>(parameters.length);
        }
        for (Parameter value : parameters) {
            this.parameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of <code>Parameter</code> structures.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The time at which the stack was created.
     * </p>
     *
     * @return <p>
     *         The time at which the stack was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time at which the stack was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time at which the stack was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the stack was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time at which the stack was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     *
     * @return <p>
     *         The time the stack was deleted.
     *         </p>
     */
    public java.util.Date getDeletionTime() {
        return deletionTime;
    }

    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     *
     * @param deletionTime <p>
     *            The time the stack was deleted.
     *            </p>
     */
    public void setDeletionTime(java.util.Date deletionTime) {
        this.deletionTime = deletionTime;
    }

    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionTime <p>
     *            The time the stack was deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withDeletionTime(java.util.Date deletionTime) {
        this.deletionTime = deletionTime;
        return this;
    }

    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if
     * the stack has been updated at least once.
     * </p>
     *
     * @return <p>
     *         The time the stack was last updated. This field will only be
     *         returned if the stack has been updated at least once.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if
     * the stack has been updated at least once.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The time the stack was last updated. This field will only be
     *            returned if the stack has been updated at least once.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if
     * the stack has been updated at least once.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The time the stack was last updated. This field will only be
     *            returned if the stack has been updated at least once.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * The rollback triggers for AWS CloudFormation to monitor during stack
     * creation and updating operations, and for the specified monitoring period
     * afterwards.
     * </p>
     *
     * @return <p>
     *         The rollback triggers for AWS CloudFormation to monitor during
     *         stack creation and updating operations, and for the specified
     *         monitoring period afterwards.
     *         </p>
     */
    public RollbackConfiguration getRollbackConfiguration() {
        return rollbackConfiguration;
    }

    /**
     * <p>
     * The rollback triggers for AWS CloudFormation to monitor during stack
     * creation and updating operations, and for the specified monitoring period
     * afterwards.
     * </p>
     *
     * @param rollbackConfiguration <p>
     *            The rollback triggers for AWS CloudFormation to monitor during
     *            stack creation and updating operations, and for the specified
     *            monitoring period afterwards.
     *            </p>
     */
    public void setRollbackConfiguration(RollbackConfiguration rollbackConfiguration) {
        this.rollbackConfiguration = rollbackConfiguration;
    }

    /**
     * <p>
     * The rollback triggers for AWS CloudFormation to monitor during stack
     * creation and updating operations, and for the specified monitoring period
     * afterwards.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rollbackConfiguration <p>
     *            The rollback triggers for AWS CloudFormation to monitor during
     *            stack creation and updating operations, and for the specified
     *            monitoring period afterwards.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withRollbackConfiguration(RollbackConfiguration rollbackConfiguration) {
        this.rollbackConfiguration = rollbackConfiguration;
        return this;
    }

    /**
     * <p>
     * Current status of the stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED,
     * ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE,
     * UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED,
     * UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE,
     * REVIEW_IN_PROGRESS, IMPORT_IN_PROGRESS, IMPORT_COMPLETE,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     *
     * @return <p>
     *         Current status of the stack.
     *         </p>
     * @see StackStatus
     */
    public String getStackStatus() {
        return stackStatus;
    }

    /**
     * <p>
     * Current status of the stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED,
     * ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE,
     * UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED,
     * UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE,
     * REVIEW_IN_PROGRESS, IMPORT_IN_PROGRESS, IMPORT_COMPLETE,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     *
     * @param stackStatus <p>
     *            Current status of the stack.
     *            </p>
     * @see StackStatus
     */
    public void setStackStatus(String stackStatus) {
        this.stackStatus = stackStatus;
    }

    /**
     * <p>
     * Current status of the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED,
     * ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE,
     * UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED,
     * UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE,
     * REVIEW_IN_PROGRESS, IMPORT_IN_PROGRESS, IMPORT_COMPLETE,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     *
     * @param stackStatus <p>
     *            Current status of the stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackStatus
     */
    public Stack withStackStatus(String stackStatus) {
        this.stackStatus = stackStatus;
        return this;
    }

    /**
     * <p>
     * Current status of the stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED,
     * ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE,
     * UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED,
     * UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE,
     * REVIEW_IN_PROGRESS, IMPORT_IN_PROGRESS, IMPORT_COMPLETE,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     *
     * @param stackStatus <p>
     *            Current status of the stack.
     *            </p>
     * @see StackStatus
     */
    public void setStackStatus(StackStatus stackStatus) {
        this.stackStatus = stackStatus.toString();
    }

    /**
     * <p>
     * Current status of the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED,
     * ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE,
     * UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED,
     * UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE,
     * REVIEW_IN_PROGRESS, IMPORT_IN_PROGRESS, IMPORT_COMPLETE,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     *
     * @param stackStatus <p>
     *            Current status of the stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackStatus
     */
    public Stack withStackStatus(StackStatus stackStatus) {
        this.stackStatus = stackStatus.toString();
        return this;
    }

    /**
     * <p>
     * Success/failure message associated with the stack status.
     * </p>
     *
     * @return <p>
     *         Success/failure message associated with the stack status.
     *         </p>
     */
    public String getStackStatusReason() {
        return stackStatusReason;
    }

    /**
     * <p>
     * Success/failure message associated with the stack status.
     * </p>
     *
     * @param stackStatusReason <p>
     *            Success/failure message associated with the stack status.
     *            </p>
     */
    public void setStackStatusReason(String stackStatusReason) {
        this.stackStatusReason = stackStatusReason;
    }

    /**
     * <p>
     * Success/failure message associated with the stack status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackStatusReason <p>
     *            Success/failure message associated with the stack status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withStackStatusReason(String stackStatusReason) {
        this.stackStatusReason = stackStatusReason;
        return this;
    }

    /**
     * <p>
     * Boolean to enable or disable rollback on stack creation failures:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: disable rollback
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: enable rollback
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Boolean to enable or disable rollback on stack creation failures:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code>: disable rollback
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code>: enable rollback
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean isDisableRollback() {
        return disableRollback;
    }

    /**
     * <p>
     * Boolean to enable or disable rollback on stack creation failures:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: disable rollback
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: enable rollback
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Boolean to enable or disable rollback on stack creation failures:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code>: disable rollback
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code>: enable rollback
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean getDisableRollback() {
        return disableRollback;
    }

    /**
     * <p>
     * Boolean to enable or disable rollback on stack creation failures:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: disable rollback
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: enable rollback
     * </p>
     * </li>
     * </ul>
     *
     * @param disableRollback <p>
     *            Boolean to enable or disable rollback on stack creation
     *            failures:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>true</code>: disable rollback
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>false</code>: enable rollback
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
    }

    /**
     * <p>
     * Boolean to enable or disable rollback on stack creation failures:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: disable rollback
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: enable rollback
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableRollback <p>
     *            Boolean to enable or disable rollback on stack creation
     *            failures:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>true</code>: disable rollback
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>false</code>: enable rollback
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }

    /**
     * <p>
     * SNS topic ARNs to which stack related events are published.
     * </p>
     *
     * @return <p>
     *         SNS topic ARNs to which stack related events are published.
     *         </p>
     */
    public java.util.List<String> getNotificationARNs() {
        return notificationARNs;
    }

    /**
     * <p>
     * SNS topic ARNs to which stack related events are published.
     * </p>
     *
     * @param notificationARNs <p>
     *            SNS topic ARNs to which stack related events are published.
     *            </p>
     */
    public void setNotificationARNs(java.util.Collection<String> notificationARNs) {
        if (notificationARNs == null) {
            this.notificationARNs = null;
            return;
        }

        this.notificationARNs = new java.util.ArrayList<String>(notificationARNs);
    }

    /**
     * <p>
     * SNS topic ARNs to which stack related events are published.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationARNs <p>
     *            SNS topic ARNs to which stack related events are published.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withNotificationARNs(String... notificationARNs) {
        if (getNotificationARNs() == null) {
            this.notificationARNs = new java.util.ArrayList<String>(notificationARNs.length);
        }
        for (String value : notificationARNs) {
            this.notificationARNs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * SNS topic ARNs to which stack related events are published.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationARNs <p>
     *            SNS topic ARNs to which stack related events are published.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withNotificationARNs(java.util.Collection<String> notificationARNs) {
        setNotificationARNs(notificationARNs);
        return this;
    }

    /**
     * <p>
     * The amount of time within which stack creation should complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The amount of time within which stack creation should complete.
     *         </p>
     */
    public Integer getTimeoutInMinutes() {
        return timeoutInMinutes;
    }

    /**
     * <p>
     * The amount of time within which stack creation should complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeoutInMinutes <p>
     *            The amount of time within which stack creation should
     *            complete.
     *            </p>
     */
    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    /**
     * <p>
     * The amount of time within which stack creation should complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeoutInMinutes <p>
     *            The amount of time within which stack creation should
     *            complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }

    /**
     * <p>
     * The capabilities allowed in the stack.
     * </p>
     *
     * @return <p>
     *         The capabilities allowed in the stack.
     *         </p>
     */
    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * The capabilities allowed in the stack.
     * </p>
     *
     * @param capabilities <p>
     *            The capabilities allowed in the stack.
     *            </p>
     */
    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new java.util.ArrayList<String>(capabilities);
    }

    /**
     * <p>
     * The capabilities allowed in the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            The capabilities allowed in the stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withCapabilities(String... capabilities) {
        if (getCapabilities() == null) {
            this.capabilities = new java.util.ArrayList<String>(capabilities.length);
        }
        for (String value : capabilities) {
            this.capabilities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The capabilities allowed in the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            The capabilities allowed in the stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * A list of output structures.
     * </p>
     *
     * @return <p>
     *         A list of output structures.
     *         </p>
     */
    public java.util.List<Output> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * A list of output structures.
     * </p>
     *
     * @param outputs <p>
     *            A list of output structures.
     *            </p>
     */
    public void setOutputs(java.util.Collection<Output> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<Output>(outputs);
    }

    /**
     * <p>
     * A list of output structures.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputs <p>
     *            A list of output structures.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withOutputs(Output... outputs) {
        if (getOutputs() == null) {
            this.outputs = new java.util.ArrayList<Output>(outputs.length);
        }
        for (Output value : outputs) {
            this.outputs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of output structures.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputs <p>
     *            A list of output structures.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withOutputs(java.util.Collection<Output> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that is associated with the stack. During a stack operation,
     * AWS CloudFormation uses this role's credentials to make calls on your
     * behalf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an AWS Identity and Access
     *         Management (IAM) role that is associated with the stack. During a
     *         stack operation, AWS CloudFormation uses this role's credentials
     *         to make calls on your behalf.
     *         </p>
     */
    public String getRoleARN() {
        return roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that is associated with the stack. During a stack operation,
     * AWS CloudFormation uses this role's credentials to make calls on your
     * behalf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleARN <p>
     *            The Amazon Resource Name (ARN) of an AWS Identity and Access
     *            Management (IAM) role that is associated with the stack.
     *            During a stack operation, AWS CloudFormation uses this role's
     *            credentials to make calls on your behalf.
     *            </p>
     */
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that is associated with the stack. During a stack operation,
     * AWS CloudFormation uses this role's credentials to make calls on your
     * behalf.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleARN <p>
     *            The Amazon Resource Name (ARN) of an AWS Identity and Access
     *            Management (IAM) role that is associated with the stack.
     *            During a stack operation, AWS CloudFormation uses this role's
     *            credentials to make calls on your behalf.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * <p>
     * A list of <code>Tag</code>s that specify information about the stack.
     * </p>
     *
     * @return <p>
     *         A list of <code>Tag</code>s that specify information about the
     *         stack.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of <code>Tag</code>s that specify information about the stack.
     * </p>
     *
     * @param tags <p>
     *            A list of <code>Tag</code>s that specify information about the
     *            stack.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of <code>Tag</code>s that specify information about the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of <code>Tag</code>s that specify information about the
     *            stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>Tag</code>s that specify information about the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of <code>Tag</code>s that specify information about the
     *            stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Whether termination protection is enabled for the stack.
     * </p>
     * <p>
     * For <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >nested stacks</a>, termination protection is set on the root stack and
     * cannot be changed directly on the nested stack. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     * >Protecting a Stack From Being Deleted</a> in the <i>AWS CloudFormation
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Whether termination protection is enabled for the stack.
     *         </p>
     *         <p>
     *         For <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *         >nested stacks</a>, termination protection is set on the root
     *         stack and cannot be changed directly on the nested stack. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     *         >Protecting a Stack From Being Deleted</a> in the <i>AWS
     *         CloudFormation User Guide</i>.
     *         </p>
     */
    public Boolean isEnableTerminationProtection() {
        return enableTerminationProtection;
    }

    /**
     * <p>
     * Whether termination protection is enabled for the stack.
     * </p>
     * <p>
     * For <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >nested stacks</a>, termination protection is set on the root stack and
     * cannot be changed directly on the nested stack. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     * >Protecting a Stack From Being Deleted</a> in the <i>AWS CloudFormation
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Whether termination protection is enabled for the stack.
     *         </p>
     *         <p>
     *         For <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *         >nested stacks</a>, termination protection is set on the root
     *         stack and cannot be changed directly on the nested stack. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     *         >Protecting a Stack From Being Deleted</a> in the <i>AWS
     *         CloudFormation User Guide</i>.
     *         </p>
     */
    public Boolean getEnableTerminationProtection() {
        return enableTerminationProtection;
    }

    /**
     * <p>
     * Whether termination protection is enabled for the stack.
     * </p>
     * <p>
     * For <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >nested stacks</a>, termination protection is set on the root stack and
     * cannot be changed directly on the nested stack. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     * >Protecting a Stack From Being Deleted</a> in the <i>AWS CloudFormation
     * User Guide</i>.
     * </p>
     *
     * @param enableTerminationProtection <p>
     *            Whether termination protection is enabled for the stack.
     *            </p>
     *            <p>
     *            For <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *            >nested stacks</a>, termination protection is set on the root
     *            stack and cannot be changed directly on the nested stack. For
     *            more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     *            >Protecting a Stack From Being Deleted</a> in the <i>AWS
     *            CloudFormation User Guide</i>.
     *            </p>
     */
    public void setEnableTerminationProtection(Boolean enableTerminationProtection) {
        this.enableTerminationProtection = enableTerminationProtection;
    }

    /**
     * <p>
     * Whether termination protection is enabled for the stack.
     * </p>
     * <p>
     * For <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >nested stacks</a>, termination protection is set on the root stack and
     * cannot be changed directly on the nested stack. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     * >Protecting a Stack From Being Deleted</a> in the <i>AWS CloudFormation
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableTerminationProtection <p>
     *            Whether termination protection is enabled for the stack.
     *            </p>
     *            <p>
     *            For <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *            >nested stacks</a>, termination protection is set on the root
     *            stack and cannot be changed directly on the nested stack. For
     *            more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     *            >Protecting a Stack From Being Deleted</a> in the <i>AWS
     *            CloudFormation User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withEnableTerminationProtection(Boolean enableTerminationProtection) {
        this.enableTerminationProtection = enableTerminationProtection;
        return this;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the
     * stack ID of the direct parent of this stack. For the first level of
     * nested stacks, the root stack is also the parent stack.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         For nested stacks--stacks created as resources for another
     *         stack--the stack ID of the direct parent of this stack. For the
     *         first level of nested stacks, the root stack is also the parent
     *         stack.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *         >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     *         Guide</i>.
     *         </p>
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the
     * stack ID of the direct parent of this stack. For the first level of
     * nested stacks, the root stack is also the parent stack.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     *
     * @param parentId <p>
     *            For nested stacks--stacks created as resources for another
     *            stack--the stack ID of the direct parent of this stack. For
     *            the first level of nested stacks, the root stack is also the
     *            parent stack.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *            >Working with Nested Stacks</a> in the <i>AWS CloudFormation
     *            User Guide</i>.
     *            </p>
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the
     * stack ID of the direct parent of this stack. For the first level of
     * nested stacks, the root stack is also the parent stack.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parentId <p>
     *            For nested stacks--stacks created as resources for another
     *            stack--the stack ID of the direct parent of this stack. For
     *            the first level of nested stacks, the root stack is also the
     *            parent stack.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *            >Working with Nested Stacks</a> in the <i>AWS CloudFormation
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the
     * stack ID of the top-level stack to which the nested stack ultimately
     * belongs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         For nested stacks--stacks created as resources for another
     *         stack--the stack ID of the top-level stack to which the nested
     *         stack ultimately belongs.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *         >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     *         Guide</i>.
     *         </p>
     */
    public String getRootId() {
        return rootId;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the
     * stack ID of the top-level stack to which the nested stack ultimately
     * belongs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     *
     * @param rootId <p>
     *            For nested stacks--stacks created as resources for another
     *            stack--the stack ID of the top-level stack to which the nested
     *            stack ultimately belongs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *            >Working with Nested Stacks</a> in the <i>AWS CloudFormation
     *            User Guide</i>.
     *            </p>
     */
    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the
     * stack ID of the top-level stack to which the nested stack ultimately
     * belongs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rootId <p>
     *            For nested stacks--stacks created as resources for another
     *            stack--the stack ID of the top-level stack to which the nested
     *            stack ultimately belongs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *            >Working with Nested Stacks</a> in the <i>AWS CloudFormation
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withRootId(String rootId) {
        this.rootId = rootId;
        return this;
    }

    /**
     * <p>
     * Information on whether a stack's actual configuration differs, or has
     * <i>drifted</i>, from it's expected configuration, as defined in the stack
     * template and any values specified as template parameters. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     *
     * @return <p>
     *         Information on whether a stack's actual configuration differs, or
     *         has <i>drifted</i>, from it's expected configuration, as defined
     *         in the stack template and any values specified as template
     *         parameters. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     *         >Detecting Unregulated Configuration Changes to Stacks and
     *         Resources</a>.
     *         </p>
     */
    public StackDriftInformation getDriftInformation() {
        return driftInformation;
    }

    /**
     * <p>
     * Information on whether a stack's actual configuration differs, or has
     * <i>drifted</i>, from it's expected configuration, as defined in the stack
     * template and any values specified as template parameters. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     *
     * @param driftInformation <p>
     *            Information on whether a stack's actual configuration differs,
     *            or has <i>drifted</i>, from it's expected configuration, as
     *            defined in the stack template and any values specified as
     *            template parameters. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     *            >Detecting Unregulated Configuration Changes to Stacks and
     *            Resources</a>.
     *            </p>
     */
    public void setDriftInformation(StackDriftInformation driftInformation) {
        this.driftInformation = driftInformation;
    }

    /**
     * <p>
     * Information on whether a stack's actual configuration differs, or has
     * <i>drifted</i>, from it's expected configuration, as defined in the stack
     * template and any values specified as template parameters. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param driftInformation <p>
     *            Information on whether a stack's actual configuration differs,
     *            or has <i>drifted</i>, from it's expected configuration, as
     *            defined in the stack template and any values specified as
     *            template parameters. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     *            >Detecting Unregulated Configuration Changes to Stacks and
     *            Resources</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stack withDriftInformation(StackDriftInformation driftInformation) {
        this.driftInformation = driftInformation;
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
        if (getStackId() != null)
            sb.append("StackId: " + getStackId() + ",");
        if (getStackName() != null)
            sb.append("StackName: " + getStackName() + ",");
        if (getChangeSetId() != null)
            sb.append("ChangeSetId: " + getChangeSetId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getDeletionTime() != null)
            sb.append("DeletionTime: " + getDeletionTime() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getRollbackConfiguration() != null)
            sb.append("RollbackConfiguration: " + getRollbackConfiguration() + ",");
        if (getStackStatus() != null)
            sb.append("StackStatus: " + getStackStatus() + ",");
        if (getStackStatusReason() != null)
            sb.append("StackStatusReason: " + getStackStatusReason() + ",");
        if (getDisableRollback() != null)
            sb.append("DisableRollback: " + getDisableRollback() + ",");
        if (getNotificationARNs() != null)
            sb.append("NotificationARNs: " + getNotificationARNs() + ",");
        if (getTimeoutInMinutes() != null)
            sb.append("TimeoutInMinutes: " + getTimeoutInMinutes() + ",");
        if (getCapabilities() != null)
            sb.append("Capabilities: " + getCapabilities() + ",");
        if (getOutputs() != null)
            sb.append("Outputs: " + getOutputs() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getEnableTerminationProtection() != null)
            sb.append("EnableTerminationProtection: " + getEnableTerminationProtection() + ",");
        if (getParentId() != null)
            sb.append("ParentId: " + getParentId() + ",");
        if (getRootId() != null)
            sb.append("RootId: " + getRootId() + ",");
        if (getDriftInformation() != null)
            sb.append("DriftInformation: " + getDriftInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode
                + ((getChangeSetId() == null) ? 0 : getChangeSetId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionTime() == null) ? 0 : getDeletionTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getRollbackConfiguration() == null) ? 0 : getRollbackConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getStackStatus() == null) ? 0 : getStackStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStackStatusReason() == null) ? 0 : getStackStatusReason().hashCode());
        hashCode = prime * hashCode
                + ((getDisableRollback() == null) ? 0 : getDisableRollback().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationARNs() == null) ? 0 : getNotificationARNs().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutInMinutes() == null) ? 0 : getTimeoutInMinutes().hashCode());
        hashCode = prime * hashCode
                + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableTerminationProtection() == null) ? 0
                        : getEnableTerminationProtection().hashCode());
        hashCode = prime * hashCode + ((getParentId() == null) ? 0 : getParentId().hashCode());
        hashCode = prime * hashCode + ((getRootId() == null) ? 0 : getRootId().hashCode());
        hashCode = prime * hashCode
                + ((getDriftInformation() == null) ? 0 : getDriftInformation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Stack == false)
            return false;
        Stack other = (Stack) obj;

        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getChangeSetId() == null ^ this.getChangeSetId() == null)
            return false;
        if (other.getChangeSetId() != null
                && other.getChangeSetId().equals(this.getChangeSetId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDeletionTime() == null ^ this.getDeletionTime() == null)
            return false;
        if (other.getDeletionTime() != null
                && other.getDeletionTime().equals(this.getDeletionTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getRollbackConfiguration() == null ^ this.getRollbackConfiguration() == null)
            return false;
        if (other.getRollbackConfiguration() != null
                && other.getRollbackConfiguration().equals(this.getRollbackConfiguration()) == false)
            return false;
        if (other.getStackStatus() == null ^ this.getStackStatus() == null)
            return false;
        if (other.getStackStatus() != null
                && other.getStackStatus().equals(this.getStackStatus()) == false)
            return false;
        if (other.getStackStatusReason() == null ^ this.getStackStatusReason() == null)
            return false;
        if (other.getStackStatusReason() != null
                && other.getStackStatusReason().equals(this.getStackStatusReason()) == false)
            return false;
        if (other.getDisableRollback() == null ^ this.getDisableRollback() == null)
            return false;
        if (other.getDisableRollback() != null
                && other.getDisableRollback().equals(this.getDisableRollback()) == false)
            return false;
        if (other.getNotificationARNs() == null ^ this.getNotificationARNs() == null)
            return false;
        if (other.getNotificationARNs() != null
                && other.getNotificationARNs().equals(this.getNotificationARNs()) == false)
            return false;
        if (other.getTimeoutInMinutes() == null ^ this.getTimeoutInMinutes() == null)
            return false;
        if (other.getTimeoutInMinutes() != null
                && other.getTimeoutInMinutes().equals(this.getTimeoutInMinutes()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null
                && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getEnableTerminationProtection() == null
                ^ this.getEnableTerminationProtection() == null)
            return false;
        if (other.getEnableTerminationProtection() != null
                && other.getEnableTerminationProtection().equals(
                        this.getEnableTerminationProtection()) == false)
            return false;
        if (other.getParentId() == null ^ this.getParentId() == null)
            return false;
        if (other.getParentId() != null && other.getParentId().equals(this.getParentId()) == false)
            return false;
        if (other.getRootId() == null ^ this.getRootId() == null)
            return false;
        if (other.getRootId() != null && other.getRootId().equals(this.getRootId()) == false)
            return false;
        if (other.getDriftInformation() == null ^ this.getDriftInformation() == null)
            return false;
        if (other.getDriftInformation() != null
                && other.getDriftInformation().equals(this.getDriftInformation()) == false)
            return false;
        return true;
    }
}

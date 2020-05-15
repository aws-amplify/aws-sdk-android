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
 * The output for the <a>DescribeChangeSet</a> action.
 * </p>
 */
public class DescribeChangeSetResult implements Serializable {
    /**
     * <p>
     * The name of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*<br/>
     */
    private String changeSetName;

    /**
     * <p>
     * The ARN of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>arn:[-a-zA-Z0-9:/]*<br/>
     */
    private String changeSetId;

    /**
     * <p>
     * The ARN of the stack that is associated with the change set.
     * </p>
     */
    private String stackId;

    /**
     * <p>
     * The name of the stack that is associated with the change set.
     * </p>
     */
    private String stackName;

    /**
     * <p>
     * Information about the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * A list of <code>Parameter</code> structures that describes the input
     * parameters and their values used to create the change set. For more
     * information, see the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     * >Parameter</a> data type.
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * The start time when the change set was created, in UTC.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can
     * execute the change set. If you can’t execute the change set, the status
     * indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still
     * creating it or in an <code>OBSOLETE</code> state because the stack was
     * already updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNAVAILABLE, AVAILABLE, EXECUTE_IN_PROGRESS,
     * EXECUTE_COMPLETE, EXECUTE_FAILED, OBSOLETE
     */
    private String executionStatus;

    /**
     * <p>
     * The current status of the change set, such as
     * <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     * <code>FAILED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, DELETE_COMPLETE, FAILED
     */
    private String status;

    /**
     * <p>
     * A description of the change set's status. For example, if your attempt to
     * create a change set failed, AWS CloudFormation shows the error message.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * The ARNs of the Amazon Simple Notification Service (Amazon SNS) topics
     * that will be associated with the stack if you execute the change set.
     * </p>
     */
    private java.util.List<String> notificationARNs;

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
     * If you execute the change set, the list of capabilities that were
     * explicitly acknowledged when the change set was created.
     * </p>
     */
    private java.util.List<String> capabilities;

    /**
     * <p>
     * If you execute the change set, the tags that will be associated with the
     * stack.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A list of <code>Change</code> structures that describes the resources AWS
     * CloudFormation changes if you execute the change set.
     * </p>
     */
    private java.util.List<Change> changes;

    /**
     * <p>
     * If the output exceeds 1 MB, a string that identifies the next page of
     * changes. If there is no additional page, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The name of the change set.
     *         </p>
     */
    public String getChangeSetName() {
        return changeSetName;
    }

    /**
     * <p>
     * The name of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*<br/>
     *
     * @param changeSetName <p>
     *            The name of the change set.
     *            </p>
     */
    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * The name of the change set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*<br/>
     *
     * @param changeSetName <p>
     *            The name of the change set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }

    /**
     * <p>
     * The ARN of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @return <p>
     *         The ARN of the change set.
     *         </p>
     */
    public String getChangeSetId() {
        return changeSetId;
    }

    /**
     * <p>
     * The ARN of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @param changeSetId <p>
     *            The ARN of the change set.
     *            </p>
     */
    public void setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
    }

    /**
     * <p>
     * The ARN of the change set.
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
     *            The ARN of the change set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }

    /**
     * <p>
     * The ARN of the stack that is associated with the change set.
     * </p>
     *
     * @return <p>
     *         The ARN of the stack that is associated with the change set.
     *         </p>
     */
    public String getStackId() {
        return stackId;
    }

    /**
     * <p>
     * The ARN of the stack that is associated with the change set.
     * </p>
     *
     * @param stackId <p>
     *            The ARN of the stack that is associated with the change set.
     *            </p>
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The ARN of the stack that is associated with the change set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackId <p>
     *            The ARN of the stack that is associated with the change set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * <p>
     * The name of the stack that is associated with the change set.
     * </p>
     *
     * @return <p>
     *         The name of the stack that is associated with the change set.
     *         </p>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * The name of the stack that is associated with the change set.
     * </p>
     *
     * @param stackName <p>
     *            The name of the stack that is associated with the change set.
     *            </p>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name of the stack that is associated with the change set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackName <p>
     *            The name of the stack that is associated with the change set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * <p>
     * Information about the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Information about the change set.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Information about the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            Information about the change set.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Information about the change set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            Information about the change set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures that describes the input
     * parameters and their values used to create the change set. For more
     * information, see the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     * >Parameter</a> data type.
     * </p>
     *
     * @return <p>
     *         A list of <code>Parameter</code> structures that describes the
     *         input parameters and their values used to create the change set.
     *         For more information, see the <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     *         >Parameter</a> data type.
     *         </p>
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures that describes the input
     * parameters and their values used to create the change set. For more
     * information, see the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     * >Parameter</a> data type.
     * </p>
     *
     * @param parameters <p>
     *            A list of <code>Parameter</code> structures that describes the
     *            input parameters and their values used to create the change
     *            set. For more information, see the <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     *            >Parameter</a> data type.
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
     * A list of <code>Parameter</code> structures that describes the input
     * parameters and their values used to create the change set. For more
     * information, see the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     * >Parameter</a> data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of <code>Parameter</code> structures that describes the
     *            input parameters and their values used to create the change
     *            set. For more information, see the <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     *            >Parameter</a> data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withParameters(Parameter... parameters) {
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
     * A list of <code>Parameter</code> structures that describes the input
     * parameters and their values used to create the change set. For more
     * information, see the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     * >Parameter</a> data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of <code>Parameter</code> structures that describes the
     *            input parameters and their values used to create the change
     *            set. For more information, see the <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     *            >Parameter</a> data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The start time when the change set was created, in UTC.
     * </p>
     *
     * @return <p>
     *         The start time when the change set was created, in UTC.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The start time when the change set was created, in UTC.
     * </p>
     *
     * @param creationTime <p>
     *            The start time when the change set was created, in UTC.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The start time when the change set was created, in UTC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The start time when the change set was created, in UTC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can
     * execute the change set. If you can’t execute the change set, the status
     * indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still
     * creating it or in an <code>OBSOLETE</code> state because the stack was
     * already updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNAVAILABLE, AVAILABLE, EXECUTE_IN_PROGRESS,
     * EXECUTE_COMPLETE, EXECUTE_FAILED, OBSOLETE
     *
     * @return <p>
     *         If the change set execution status is <code>AVAILABLE</code>, you
     *         can execute the change set. If you can’t execute the change set,
     *         the status indicates why. For example, a change set might be in
     *         an <code>UNAVAILABLE</code> state because AWS CloudFormation is
     *         still creating it or in an <code>OBSOLETE</code> state because
     *         the stack was already updated.
     *         </p>
     * @see ExecutionStatus
     */
    public String getExecutionStatus() {
        return executionStatus;
    }

    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can
     * execute the change set. If you can’t execute the change set, the status
     * indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still
     * creating it or in an <code>OBSOLETE</code> state because the stack was
     * already updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNAVAILABLE, AVAILABLE, EXECUTE_IN_PROGRESS,
     * EXECUTE_COMPLETE, EXECUTE_FAILED, OBSOLETE
     *
     * @param executionStatus <p>
     *            If the change set execution status is <code>AVAILABLE</code>,
     *            you can execute the change set. If you can’t execute the
     *            change set, the status indicates why. For example, a change
     *            set might be in an <code>UNAVAILABLE</code> state because AWS
     *            CloudFormation is still creating it or in an
     *            <code>OBSOLETE</code> state because the stack was already
     *            updated.
     *            </p>
     * @see ExecutionStatus
     */
    public void setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
    }

    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can
     * execute the change set. If you can’t execute the change set, the status
     * indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still
     * creating it or in an <code>OBSOLETE</code> state because the stack was
     * already updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNAVAILABLE, AVAILABLE, EXECUTE_IN_PROGRESS,
     * EXECUTE_COMPLETE, EXECUTE_FAILED, OBSOLETE
     *
     * @param executionStatus <p>
     *            If the change set execution status is <code>AVAILABLE</code>,
     *            you can execute the change set. If you can’t execute the
     *            change set, the status indicates why. For example, a change
     *            set might be in an <code>UNAVAILABLE</code> state because AWS
     *            CloudFormation is still creating it or in an
     *            <code>OBSOLETE</code> state because the stack was already
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExecutionStatus
     */
    public DescribeChangeSetResult withExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }

    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can
     * execute the change set. If you can’t execute the change set, the status
     * indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still
     * creating it or in an <code>OBSOLETE</code> state because the stack was
     * already updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNAVAILABLE, AVAILABLE, EXECUTE_IN_PROGRESS,
     * EXECUTE_COMPLETE, EXECUTE_FAILED, OBSOLETE
     *
     * @param executionStatus <p>
     *            If the change set execution status is <code>AVAILABLE</code>,
     *            you can execute the change set. If you can’t execute the
     *            change set, the status indicates why. For example, a change
     *            set might be in an <code>UNAVAILABLE</code> state because AWS
     *            CloudFormation is still creating it or in an
     *            <code>OBSOLETE</code> state because the stack was already
     *            updated.
     *            </p>
     * @see ExecutionStatus
     */
    public void setExecutionStatus(ExecutionStatus executionStatus) {
        this.executionStatus = executionStatus.toString();
    }

    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can
     * execute the change set. If you can’t execute the change set, the status
     * indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still
     * creating it or in an <code>OBSOLETE</code> state because the stack was
     * already updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNAVAILABLE, AVAILABLE, EXECUTE_IN_PROGRESS,
     * EXECUTE_COMPLETE, EXECUTE_FAILED, OBSOLETE
     *
     * @param executionStatus <p>
     *            If the change set execution status is <code>AVAILABLE</code>,
     *            you can execute the change set. If you can’t execute the
     *            change set, the status indicates why. For example, a change
     *            set might be in an <code>UNAVAILABLE</code> state because AWS
     *            CloudFormation is still creating it or in an
     *            <code>OBSOLETE</code> state because the stack was already
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExecutionStatus
     */
    public DescribeChangeSetResult withExecutionStatus(ExecutionStatus executionStatus) {
        this.executionStatus = executionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The current status of the change set, such as
     * <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     * <code>FAILED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, DELETE_COMPLETE, FAILED
     *
     * @return <p>
     *         The current status of the change set, such as
     *         <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     *         <code>FAILED</code>.
     *         </p>
     * @see ChangeSetStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the change set, such as
     * <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     * <code>FAILED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, DELETE_COMPLETE, FAILED
     *
     * @param status <p>
     *            The current status of the change set, such as
     *            <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>,
     *            or <code>FAILED</code>.
     *            </p>
     * @see ChangeSetStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the change set, such as
     * <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     * <code>FAILED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, DELETE_COMPLETE, FAILED
     *
     * @param status <p>
     *            The current status of the change set, such as
     *            <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>,
     *            or <code>FAILED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeSetStatus
     */
    public DescribeChangeSetResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the change set, such as
     * <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     * <code>FAILED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, DELETE_COMPLETE, FAILED
     *
     * @param status <p>
     *            The current status of the change set, such as
     *            <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>,
     *            or <code>FAILED</code>.
     *            </p>
     * @see ChangeSetStatus
     */
    public void setStatus(ChangeSetStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the change set, such as
     * <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     * <code>FAILED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, DELETE_COMPLETE, FAILED
     *
     * @param status <p>
     *            The current status of the change set, such as
     *            <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>,
     *            or <code>FAILED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeSetStatus
     */
    public DescribeChangeSetResult withStatus(ChangeSetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description of the change set's status. For example, if your attempt to
     * create a change set failed, AWS CloudFormation shows the error message.
     * </p>
     *
     * @return <p>
     *         A description of the change set's status. For example, if your
     *         attempt to create a change set failed, AWS CloudFormation shows
     *         the error message.
     *         </p>
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * <p>
     * A description of the change set's status. For example, if your attempt to
     * create a change set failed, AWS CloudFormation shows the error message.
     * </p>
     *
     * @param statusReason <p>
     *            A description of the change set's status. For example, if your
     *            attempt to create a change set failed, AWS CloudFormation
     *            shows the error message.
     *            </p>
     */
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * A description of the change set's status. For example, if your attempt to
     * create a change set failed, AWS CloudFormation shows the error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusReason <p>
     *            A description of the change set's status. For example, if your
     *            attempt to create a change set failed, AWS CloudFormation
     *            shows the error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * <p>
     * The ARNs of the Amazon Simple Notification Service (Amazon SNS) topics
     * that will be associated with the stack if you execute the change set.
     * </p>
     *
     * @return <p>
     *         The ARNs of the Amazon Simple Notification Service (Amazon SNS)
     *         topics that will be associated with the stack if you execute the
     *         change set.
     *         </p>
     */
    public java.util.List<String> getNotificationARNs() {
        return notificationARNs;
    }

    /**
     * <p>
     * The ARNs of the Amazon Simple Notification Service (Amazon SNS) topics
     * that will be associated with the stack if you execute the change set.
     * </p>
     *
     * @param notificationARNs <p>
     *            The ARNs of the Amazon Simple Notification Service (Amazon
     *            SNS) topics that will be associated with the stack if you
     *            execute the change set.
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
     * The ARNs of the Amazon Simple Notification Service (Amazon SNS) topics
     * that will be associated with the stack if you execute the change set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationARNs <p>
     *            The ARNs of the Amazon Simple Notification Service (Amazon
     *            SNS) topics that will be associated with the stack if you
     *            execute the change set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withNotificationARNs(String... notificationARNs) {
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
     * The ARNs of the Amazon Simple Notification Service (Amazon SNS) topics
     * that will be associated with the stack if you execute the change set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationARNs <p>
     *            The ARNs of the Amazon Simple Notification Service (Amazon
     *            SNS) topics that will be associated with the stack if you
     *            execute the change set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withNotificationARNs(
            java.util.Collection<String> notificationARNs) {
        setNotificationARNs(notificationARNs);
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
    public DescribeChangeSetResult withRollbackConfiguration(
            RollbackConfiguration rollbackConfiguration) {
        this.rollbackConfiguration = rollbackConfiguration;
        return this;
    }

    /**
     * <p>
     * If you execute the change set, the list of capabilities that were
     * explicitly acknowledged when the change set was created.
     * </p>
     *
     * @return <p>
     *         If you execute the change set, the list of capabilities that were
     *         explicitly acknowledged when the change set was created.
     *         </p>
     */
    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * If you execute the change set, the list of capabilities that were
     * explicitly acknowledged when the change set was created.
     * </p>
     *
     * @param capabilities <p>
     *            If you execute the change set, the list of capabilities that
     *            were explicitly acknowledged when the change set was created.
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
     * If you execute the change set, the list of capabilities that were
     * explicitly acknowledged when the change set was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            If you execute the change set, the list of capabilities that
     *            were explicitly acknowledged when the change set was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withCapabilities(String... capabilities) {
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
     * If you execute the change set, the list of capabilities that were
     * explicitly acknowledged when the change set was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            If you execute the change set, the list of capabilities that
     *            were explicitly acknowledged when the change set was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * If you execute the change set, the tags that will be associated with the
     * stack.
     * </p>
     *
     * @return <p>
     *         If you execute the change set, the tags that will be associated
     *         with the stack.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * If you execute the change set, the tags that will be associated with the
     * stack.
     * </p>
     *
     * @param tags <p>
     *            If you execute the change set, the tags that will be
     *            associated with the stack.
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
     * If you execute the change set, the tags that will be associated with the
     * stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            If you execute the change set, the tags that will be
     *            associated with the stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withTags(Tag... tags) {
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
     * If you execute the change set, the tags that will be associated with the
     * stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            If you execute the change set, the tags that will be
     *            associated with the stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A list of <code>Change</code> structures that describes the resources AWS
     * CloudFormation changes if you execute the change set.
     * </p>
     *
     * @return <p>
     *         A list of <code>Change</code> structures that describes the
     *         resources AWS CloudFormation changes if you execute the change
     *         set.
     *         </p>
     */
    public java.util.List<Change> getChanges() {
        return changes;
    }

    /**
     * <p>
     * A list of <code>Change</code> structures that describes the resources AWS
     * CloudFormation changes if you execute the change set.
     * </p>
     *
     * @param changes <p>
     *            A list of <code>Change</code> structures that describes the
     *            resources AWS CloudFormation changes if you execute the change
     *            set.
     *            </p>
     */
    public void setChanges(java.util.Collection<Change> changes) {
        if (changes == null) {
            this.changes = null;
            return;
        }

        this.changes = new java.util.ArrayList<Change>(changes);
    }

    /**
     * <p>
     * A list of <code>Change</code> structures that describes the resources AWS
     * CloudFormation changes if you execute the change set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param changes <p>
     *            A list of <code>Change</code> structures that describes the
     *            resources AWS CloudFormation changes if you execute the change
     *            set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withChanges(Change... changes) {
        if (getChanges() == null) {
            this.changes = new java.util.ArrayList<Change>(changes.length);
        }
        for (Change value : changes) {
            this.changes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>Change</code> structures that describes the resources AWS
     * CloudFormation changes if you execute the change set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param changes <p>
     *            A list of <code>Change</code> structures that describes the
     *            resources AWS CloudFormation changes if you execute the change
     *            set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withChanges(java.util.Collection<Change> changes) {
        setChanges(changes);
        return this;
    }

    /**
     * <p>
     * If the output exceeds 1 MB, a string that identifies the next page of
     * changes. If there is no additional page, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         If the output exceeds 1 MB, a string that identifies the next
     *         page of changes. If there is no additional page, this value is
     *         null.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the output exceeds 1 MB, a string that identifies the next page of
     * changes. If there is no additional page, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the output exceeds 1 MB, a string that identifies the next
     *            page of changes. If there is no additional page, this value is
     *            null.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the output exceeds 1 MB, a string that identifies the next page of
     * changes. If there is no additional page, this value is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the output exceeds 1 MB, a string that identifies the next
     *            page of changes. If there is no additional page, this value is
     *            null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: " + getChangeSetName() + ",");
        if (getChangeSetId() != null)
            sb.append("ChangeSetId: " + getChangeSetId() + ",");
        if (getStackId() != null)
            sb.append("StackId: " + getStackId() + ",");
        if (getStackName() != null)
            sb.append("StackName: " + getStackName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getExecutionStatus() != null)
            sb.append("ExecutionStatus: " + getExecutionStatus() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusReason() != null)
            sb.append("StatusReason: " + getStatusReason() + ",");
        if (getNotificationARNs() != null)
            sb.append("NotificationARNs: " + getNotificationARNs() + ",");
        if (getRollbackConfiguration() != null)
            sb.append("RollbackConfiguration: " + getRollbackConfiguration() + ",");
        if (getCapabilities() != null)
            sb.append("Capabilities: " + getCapabilities() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getChanges() != null)
            sb.append("Changes: " + getChanges() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode
                + ((getChangeSetId() == null) ? 0 : getChangeSetId().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionStatus() == null) ? 0 : getExecutionStatus().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationARNs() == null) ? 0 : getNotificationARNs().hashCode());
        hashCode = prime
                * hashCode
                + ((getRollbackConfiguration() == null) ? 0 : getRollbackConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getChanges() == null) ? 0 : getChanges().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChangeSetResult == false)
            return false;
        DescribeChangeSetResult other = (DescribeChangeSetResult) obj;

        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null)
            return false;
        if (other.getChangeSetName() != null
                && other.getChangeSetName().equals(this.getChangeSetName()) == false)
            return false;
        if (other.getChangeSetId() == null ^ this.getChangeSetId() == null)
            return false;
        if (other.getChangeSetId() != null
                && other.getChangeSetId().equals(this.getChangeSetId()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
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
        if (other.getExecutionStatus() == null ^ this.getExecutionStatus() == null)
            return false;
        if (other.getExecutionStatus() != null
                && other.getExecutionStatus().equals(this.getExecutionStatus()) == false)
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
        if (other.getNotificationARNs() == null ^ this.getNotificationARNs() == null)
            return false;
        if (other.getNotificationARNs() != null
                && other.getNotificationARNs().equals(this.getNotificationARNs()) == false)
            return false;
        if (other.getRollbackConfiguration() == null ^ this.getRollbackConfiguration() == null)
            return false;
        if (other.getRollbackConfiguration() != null
                && other.getRollbackConfiguration().equals(this.getRollbackConfiguration()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null
                && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getChanges() == null ^ this.getChanges() == null)
            return false;
        if (other.getChanges() != null && other.getChanges().equals(this.getChanges()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

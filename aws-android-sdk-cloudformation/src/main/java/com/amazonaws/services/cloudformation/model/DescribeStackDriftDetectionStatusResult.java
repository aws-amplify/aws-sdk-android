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

public class DescribeStackDriftDetectionStatusResult implements Serializable {
    /**
     * <p>
     * The ID of the stack.
     * </p>
     */
    private String stackId;

    /**
     * <p>
     * The ID of the drift detection results of this operation.
     * </p>
     * <p>
     * AWS CloudFormation generates new results, with a new drift detection ID,
     * each time this operation is run. However, the number of reports AWS
     * CloudFormation retains for any given stack, and for how long, may vary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String stackDriftDetectionId;

    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected
     * configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The stack differs from its expected template
     * configuration. A stack is considered to have drifted if one or more of
     * its resources have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack
     * differs from its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The stack's actual configuration matches its
     * expected template configuration.
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
    private String stackDriftStatus;

    /**
     * <p>
     * The status of the stack drift detection operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DETECTION_COMPLETE</code>: The stack drift detection operation has
     * successfully completed for all resources in the stack that support drift
     * detection. (Resources that do not currently support stack detection
     * remain unchecked.)
     * </p>
     * <p>
     * If you specified logical resource IDs for AWS CloudFormation to use as a
     * filter for the stack drift detection operation, only the resources with
     * those logical IDs are checked for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETECTION_FAILED</code>: The stack drift detection operation has
     * failed for at least one resource in the stack. Results will be available
     * for resources on which AWS CloudFormation successfully completed drift
     * detection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETECTION_IN_PROGRESS</code>: The stack drift detection operation
     * is currently in progress.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTION_IN_PROGRESS, DETECTION_FAILED,
     * DETECTION_COMPLETE
     */
    private String detectionStatus;

    /**
     * <p>
     * The reason the stack drift detection operation has its current status.
     * </p>
     */
    private String detectionStatusReason;

    /**
     * <p>
     * Total number of stack resources that have drifted. This is NULL until the
     * drift detection operation reaches a status of
     * <code>DETECTION_COMPLETE</code>. This value will be 0 for stacks whose
     * drift status is <code>IN_SYNC</code>.
     * </p>
     */
    private Integer driftedStackResourceCount;

    /**
     * <p>
     * Time at which the stack drift detection operation was initiated.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The ID of the stack.
     * </p>
     *
     * @return <p>
     *         The ID of the stack.
     *         </p>
     */
    public String getStackId() {
        return stackId;
    }

    /**
     * <p>
     * The ID of the stack.
     * </p>
     *
     * @param stackId <p>
     *            The ID of the stack.
     *            </p>
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The ID of the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackId <p>
     *            The ID of the stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStackDriftDetectionStatusResult withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * <p>
     * The ID of the drift detection results of this operation.
     * </p>
     * <p>
     * AWS CloudFormation generates new results, with a new drift detection ID,
     * each time this operation is run. However, the number of reports AWS
     * CloudFormation retains for any given stack, and for how long, may vary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The ID of the drift detection results of this operation.
     *         </p>
     *         <p>
     *         AWS CloudFormation generates new results, with a new drift
     *         detection ID, each time this operation is run. However, the
     *         number of reports AWS CloudFormation retains for any given stack,
     *         and for how long, may vary.
     *         </p>
     */
    public String getStackDriftDetectionId() {
        return stackDriftDetectionId;
    }

    /**
     * <p>
     * The ID of the drift detection results of this operation.
     * </p>
     * <p>
     * AWS CloudFormation generates new results, with a new drift detection ID,
     * each time this operation is run. However, the number of reports AWS
     * CloudFormation retains for any given stack, and for how long, may vary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param stackDriftDetectionId <p>
     *            The ID of the drift detection results of this operation.
     *            </p>
     *            <p>
     *            AWS CloudFormation generates new results, with a new drift
     *            detection ID, each time this operation is run. However, the
     *            number of reports AWS CloudFormation retains for any given
     *            stack, and for how long, may vary.
     *            </p>
     */
    public void setStackDriftDetectionId(String stackDriftDetectionId) {
        this.stackDriftDetectionId = stackDriftDetectionId;
    }

    /**
     * <p>
     * The ID of the drift detection results of this operation.
     * </p>
     * <p>
     * AWS CloudFormation generates new results, with a new drift detection ID,
     * each time this operation is run. However, the number of reports AWS
     * CloudFormation retains for any given stack, and for how long, may vary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param stackDriftDetectionId <p>
     *            The ID of the drift detection results of this operation.
     *            </p>
     *            <p>
     *            AWS CloudFormation generates new results, with a new drift
     *            detection ID, each time this operation is run. However, the
     *            number of reports AWS CloudFormation retains for any given
     *            stack, and for how long, may vary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStackDriftDetectionStatusResult withStackDriftDetectionId(
            String stackDriftDetectionId) {
        this.stackDriftDetectionId = stackDriftDetectionId;
        return this;
    }

    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected
     * configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The stack differs from its expected template
     * configuration. A stack is considered to have drifted if one or more of
     * its resources have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack
     * differs from its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The stack's actual configuration matches its
     * expected template configuration.
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
     *         Status of the stack's actual configuration compared to its
     *         expected configuration.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DRIFTED</code>: The stack differs from its expected
     *         template configuration. A stack is considered to have drifted if
     *         one or more of its resources have drifted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if
     *         the stack differs from its expected template configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_SYNC</code>: The stack's actual configuration matches
     *         its expected template configuration.
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
    public String getStackDriftStatus() {
        return stackDriftStatus;
    }

    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected
     * configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The stack differs from its expected template
     * configuration. A stack is considered to have drifted if one or more of
     * its resources have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack
     * differs from its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The stack's actual configuration matches its
     * expected template configuration.
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
     * @param stackDriftStatus <p>
     *            Status of the stack's actual configuration compared to its
     *            expected configuration.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DRIFTED</code>: The stack differs from its expected
     *            template configuration. A stack is considered to have drifted
     *            if one or more of its resources have drifted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation has not checked
     *            if the stack differs from its expected template configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The stack's actual configuration matches
     *            its expected template configuration.
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
    public void setStackDriftStatus(String stackDriftStatus) {
        this.stackDriftStatus = stackDriftStatus;
    }

    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected
     * configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The stack differs from its expected template
     * configuration. A stack is considered to have drifted if one or more of
     * its resources have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack
     * differs from its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The stack's actual configuration matches its
     * expected template configuration.
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
     * @param stackDriftStatus <p>
     *            Status of the stack's actual configuration compared to its
     *            expected configuration.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DRIFTED</code>: The stack differs from its expected
     *            template configuration. A stack is considered to have drifted
     *            if one or more of its resources have drifted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation has not checked
     *            if the stack differs from its expected template configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The stack's actual configuration matches
     *            its expected template configuration.
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
    public DescribeStackDriftDetectionStatusResult withStackDriftStatus(String stackDriftStatus) {
        this.stackDriftStatus = stackDriftStatus;
        return this;
    }

    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected
     * configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The stack differs from its expected template
     * configuration. A stack is considered to have drifted if one or more of
     * its resources have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack
     * differs from its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The stack's actual configuration matches its
     * expected template configuration.
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
     * @param stackDriftStatus <p>
     *            Status of the stack's actual configuration compared to its
     *            expected configuration.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DRIFTED</code>: The stack differs from its expected
     *            template configuration. A stack is considered to have drifted
     *            if one or more of its resources have drifted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation has not checked
     *            if the stack differs from its expected template configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The stack's actual configuration matches
     *            its expected template configuration.
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
    public void setStackDriftStatus(StackDriftStatus stackDriftStatus) {
        this.stackDriftStatus = stackDriftStatus.toString();
    }

    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected
     * configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The stack differs from its expected template
     * configuration. A stack is considered to have drifted if one or more of
     * its resources have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack
     * differs from its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The stack's actual configuration matches its
     * expected template configuration.
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
     * @param stackDriftStatus <p>
     *            Status of the stack's actual configuration compared to its
     *            expected configuration.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DRIFTED</code>: The stack differs from its expected
     *            template configuration. A stack is considered to have drifted
     *            if one or more of its resources have drifted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation has not checked
     *            if the stack differs from its expected template configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The stack's actual configuration matches
     *            its expected template configuration.
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
    public DescribeStackDriftDetectionStatusResult withStackDriftStatus(
            StackDriftStatus stackDriftStatus) {
        this.stackDriftStatus = stackDriftStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status of the stack drift detection operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DETECTION_COMPLETE</code>: The stack drift detection operation has
     * successfully completed for all resources in the stack that support drift
     * detection. (Resources that do not currently support stack detection
     * remain unchecked.)
     * </p>
     * <p>
     * If you specified logical resource IDs for AWS CloudFormation to use as a
     * filter for the stack drift detection operation, only the resources with
     * those logical IDs are checked for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETECTION_FAILED</code>: The stack drift detection operation has
     * failed for at least one resource in the stack. Results will be available
     * for resources on which AWS CloudFormation successfully completed drift
     * detection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETECTION_IN_PROGRESS</code>: The stack drift detection operation
     * is currently in progress.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTION_IN_PROGRESS, DETECTION_FAILED,
     * DETECTION_COMPLETE
     *
     * @return <p>
     *         The status of the stack drift detection operation.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DETECTION_COMPLETE</code>: The stack drift detection
     *         operation has successfully completed for all resources in the
     *         stack that support drift detection. (Resources that do not
     *         currently support stack detection remain unchecked.)
     *         </p>
     *         <p>
     *         If you specified logical resource IDs for AWS CloudFormation to
     *         use as a filter for the stack drift detection operation, only the
     *         resources with those logical IDs are checked for drift.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DETECTION_FAILED</code>: The stack drift detection
     *         operation has failed for at least one resource in the stack.
     *         Results will be available for resources on which AWS
     *         CloudFormation successfully completed drift detection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DETECTION_IN_PROGRESS</code>: The stack drift detection
     *         operation is currently in progress.
     *         </p>
     *         </li>
     *         </ul>
     * @see StackDriftDetectionStatus
     */
    public String getDetectionStatus() {
        return detectionStatus;
    }

    /**
     * <p>
     * The status of the stack drift detection operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DETECTION_COMPLETE</code>: The stack drift detection operation has
     * successfully completed for all resources in the stack that support drift
     * detection. (Resources that do not currently support stack detection
     * remain unchecked.)
     * </p>
     * <p>
     * If you specified logical resource IDs for AWS CloudFormation to use as a
     * filter for the stack drift detection operation, only the resources with
     * those logical IDs are checked for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETECTION_FAILED</code>: The stack drift detection operation has
     * failed for at least one resource in the stack. Results will be available
     * for resources on which AWS CloudFormation successfully completed drift
     * detection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETECTION_IN_PROGRESS</code>: The stack drift detection operation
     * is currently in progress.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTION_IN_PROGRESS, DETECTION_FAILED,
     * DETECTION_COMPLETE
     *
     * @param detectionStatus <p>
     *            The status of the stack drift detection operation.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DETECTION_COMPLETE</code>: The stack drift detection
     *            operation has successfully completed for all resources in the
     *            stack that support drift detection. (Resources that do not
     *            currently support stack detection remain unchecked.)
     *            </p>
     *            <p>
     *            If you specified logical resource IDs for AWS CloudFormation
     *            to use as a filter for the stack drift detection operation,
     *            only the resources with those logical IDs are checked for
     *            drift.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DETECTION_FAILED</code>: The stack drift detection
     *            operation has failed for at least one resource in the stack.
     *            Results will be available for resources on which AWS
     *            CloudFormation successfully completed drift detection.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DETECTION_IN_PROGRESS</code>: The stack drift detection
     *            operation is currently in progress.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackDriftDetectionStatus
     */
    public void setDetectionStatus(String detectionStatus) {
        this.detectionStatus = detectionStatus;
    }

    /**
     * <p>
     * The status of the stack drift detection operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DETECTION_COMPLETE</code>: The stack drift detection operation has
     * successfully completed for all resources in the stack that support drift
     * detection. (Resources that do not currently support stack detection
     * remain unchecked.)
     * </p>
     * <p>
     * If you specified logical resource IDs for AWS CloudFormation to use as a
     * filter for the stack drift detection operation, only the resources with
     * those logical IDs are checked for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETECTION_FAILED</code>: The stack drift detection operation has
     * failed for at least one resource in the stack. Results will be available
     * for resources on which AWS CloudFormation successfully completed drift
     * detection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETECTION_IN_PROGRESS</code>: The stack drift detection operation
     * is currently in progress.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTION_IN_PROGRESS, DETECTION_FAILED,
     * DETECTION_COMPLETE
     *
     * @param detectionStatus <p>
     *            The status of the stack drift detection operation.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DETECTION_COMPLETE</code>: The stack drift detection
     *            operation has successfully completed for all resources in the
     *            stack that support drift detection. (Resources that do not
     *            currently support stack detection remain unchecked.)
     *            </p>
     *            <p>
     *            If you specified logical resource IDs for AWS CloudFormation
     *            to use as a filter for the stack drift detection operation,
     *            only the resources with those logical IDs are checked for
     *            drift.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DETECTION_FAILED</code>: The stack drift detection
     *            operation has failed for at least one resource in the stack.
     *            Results will be available for resources on which AWS
     *            CloudFormation successfully completed drift detection.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DETECTION_IN_PROGRESS</code>: The stack drift detection
     *            operation is currently in progress.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackDriftDetectionStatus
     */
    public DescribeStackDriftDetectionStatusResult withDetectionStatus(String detectionStatus) {
        this.detectionStatus = detectionStatus;
        return this;
    }

    /**
     * <p>
     * The status of the stack drift detection operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DETECTION_COMPLETE</code>: The stack drift detection operation has
     * successfully completed for all resources in the stack that support drift
     * detection. (Resources that do not currently support stack detection
     * remain unchecked.)
     * </p>
     * <p>
     * If you specified logical resource IDs for AWS CloudFormation to use as a
     * filter for the stack drift detection operation, only the resources with
     * those logical IDs are checked for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETECTION_FAILED</code>: The stack drift detection operation has
     * failed for at least one resource in the stack. Results will be available
     * for resources on which AWS CloudFormation successfully completed drift
     * detection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETECTION_IN_PROGRESS</code>: The stack drift detection operation
     * is currently in progress.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTION_IN_PROGRESS, DETECTION_FAILED,
     * DETECTION_COMPLETE
     *
     * @param detectionStatus <p>
     *            The status of the stack drift detection operation.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DETECTION_COMPLETE</code>: The stack drift detection
     *            operation has successfully completed for all resources in the
     *            stack that support drift detection. (Resources that do not
     *            currently support stack detection remain unchecked.)
     *            </p>
     *            <p>
     *            If you specified logical resource IDs for AWS CloudFormation
     *            to use as a filter for the stack drift detection operation,
     *            only the resources with those logical IDs are checked for
     *            drift.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DETECTION_FAILED</code>: The stack drift detection
     *            operation has failed for at least one resource in the stack.
     *            Results will be available for resources on which AWS
     *            CloudFormation successfully completed drift detection.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DETECTION_IN_PROGRESS</code>: The stack drift detection
     *            operation is currently in progress.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackDriftDetectionStatus
     */
    public void setDetectionStatus(StackDriftDetectionStatus detectionStatus) {
        this.detectionStatus = detectionStatus.toString();
    }

    /**
     * <p>
     * The status of the stack drift detection operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DETECTION_COMPLETE</code>: The stack drift detection operation has
     * successfully completed for all resources in the stack that support drift
     * detection. (Resources that do not currently support stack detection
     * remain unchecked.)
     * </p>
     * <p>
     * If you specified logical resource IDs for AWS CloudFormation to use as a
     * filter for the stack drift detection operation, only the resources with
     * those logical IDs are checked for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETECTION_FAILED</code>: The stack drift detection operation has
     * failed for at least one resource in the stack. Results will be available
     * for resources on which AWS CloudFormation successfully completed drift
     * detection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETECTION_IN_PROGRESS</code>: The stack drift detection operation
     * is currently in progress.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTION_IN_PROGRESS, DETECTION_FAILED,
     * DETECTION_COMPLETE
     *
     * @param detectionStatus <p>
     *            The status of the stack drift detection operation.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DETECTION_COMPLETE</code>: The stack drift detection
     *            operation has successfully completed for all resources in the
     *            stack that support drift detection. (Resources that do not
     *            currently support stack detection remain unchecked.)
     *            </p>
     *            <p>
     *            If you specified logical resource IDs for AWS CloudFormation
     *            to use as a filter for the stack drift detection operation,
     *            only the resources with those logical IDs are checked for
     *            drift.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DETECTION_FAILED</code>: The stack drift detection
     *            operation has failed for at least one resource in the stack.
     *            Results will be available for resources on which AWS
     *            CloudFormation successfully completed drift detection.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DETECTION_IN_PROGRESS</code>: The stack drift detection
     *            operation is currently in progress.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackDriftDetectionStatus
     */
    public DescribeStackDriftDetectionStatusResult withDetectionStatus(
            StackDriftDetectionStatus detectionStatus) {
        this.detectionStatus = detectionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The reason the stack drift detection operation has its current status.
     * </p>
     *
     * @return <p>
     *         The reason the stack drift detection operation has its current
     *         status.
     *         </p>
     */
    public String getDetectionStatusReason() {
        return detectionStatusReason;
    }

    /**
     * <p>
     * The reason the stack drift detection operation has its current status.
     * </p>
     *
     * @param detectionStatusReason <p>
     *            The reason the stack drift detection operation has its current
     *            status.
     *            </p>
     */
    public void setDetectionStatusReason(String detectionStatusReason) {
        this.detectionStatusReason = detectionStatusReason;
    }

    /**
     * <p>
     * The reason the stack drift detection operation has its current status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectionStatusReason <p>
     *            The reason the stack drift detection operation has its current
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStackDriftDetectionStatusResult withDetectionStatusReason(
            String detectionStatusReason) {
        this.detectionStatusReason = detectionStatusReason;
        return this;
    }

    /**
     * <p>
     * Total number of stack resources that have drifted. This is NULL until the
     * drift detection operation reaches a status of
     * <code>DETECTION_COMPLETE</code>. This value will be 0 for stacks whose
     * drift status is <code>IN_SYNC</code>.
     * </p>
     *
     * @return <p>
     *         Total number of stack resources that have drifted. This is NULL
     *         until the drift detection operation reaches a status of
     *         <code>DETECTION_COMPLETE</code>. This value will be 0 for stacks
     *         whose drift status is <code>IN_SYNC</code>.
     *         </p>
     */
    public Integer getDriftedStackResourceCount() {
        return driftedStackResourceCount;
    }

    /**
     * <p>
     * Total number of stack resources that have drifted. This is NULL until the
     * drift detection operation reaches a status of
     * <code>DETECTION_COMPLETE</code>. This value will be 0 for stacks whose
     * drift status is <code>IN_SYNC</code>.
     * </p>
     *
     * @param driftedStackResourceCount <p>
     *            Total number of stack resources that have drifted. This is
     *            NULL until the drift detection operation reaches a status of
     *            <code>DETECTION_COMPLETE</code>. This value will be 0 for
     *            stacks whose drift status is <code>IN_SYNC</code>.
     *            </p>
     */
    public void setDriftedStackResourceCount(Integer driftedStackResourceCount) {
        this.driftedStackResourceCount = driftedStackResourceCount;
    }

    /**
     * <p>
     * Total number of stack resources that have drifted. This is NULL until the
     * drift detection operation reaches a status of
     * <code>DETECTION_COMPLETE</code>. This value will be 0 for stacks whose
     * drift status is <code>IN_SYNC</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param driftedStackResourceCount <p>
     *            Total number of stack resources that have drifted. This is
     *            NULL until the drift detection operation reaches a status of
     *            <code>DETECTION_COMPLETE</code>. This value will be 0 for
     *            stacks whose drift status is <code>IN_SYNC</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStackDriftDetectionStatusResult withDriftedStackResourceCount(
            Integer driftedStackResourceCount) {
        this.driftedStackResourceCount = driftedStackResourceCount;
        return this;
    }

    /**
     * <p>
     * Time at which the stack drift detection operation was initiated.
     * </p>
     *
     * @return <p>
     *         Time at which the stack drift detection operation was initiated.
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * Time at which the stack drift detection operation was initiated.
     * </p>
     *
     * @param timestamp <p>
     *            Time at which the stack drift detection operation was
     *            initiated.
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Time at which the stack drift detection operation was initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            Time at which the stack drift detection operation was
     *            initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStackDriftDetectionStatusResult withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
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
        if (getStackDriftDetectionId() != null)
            sb.append("StackDriftDetectionId: " + getStackDriftDetectionId() + ",");
        if (getStackDriftStatus() != null)
            sb.append("StackDriftStatus: " + getStackDriftStatus() + ",");
        if (getDetectionStatus() != null)
            sb.append("DetectionStatus: " + getDetectionStatus() + ",");
        if (getDetectionStatusReason() != null)
            sb.append("DetectionStatusReason: " + getDetectionStatusReason() + ",");
        if (getDriftedStackResourceCount() != null)
            sb.append("DriftedStackResourceCount: " + getDriftedStackResourceCount() + ",");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime
                * hashCode
                + ((getStackDriftDetectionId() == null) ? 0 : getStackDriftDetectionId().hashCode());
        hashCode = prime * hashCode
                + ((getStackDriftStatus() == null) ? 0 : getStackDriftStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDetectionStatus() == null) ? 0 : getDetectionStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getDetectionStatusReason() == null) ? 0 : getDetectionStatusReason().hashCode());
        hashCode = prime
                * hashCode
                + ((getDriftedStackResourceCount() == null) ? 0 : getDriftedStackResourceCount()
                        .hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStackDriftDetectionStatusResult == false)
            return false;
        DescribeStackDriftDetectionStatusResult other = (DescribeStackDriftDetectionStatusResult) obj;

        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getStackDriftDetectionId() == null ^ this.getStackDriftDetectionId() == null)
            return false;
        if (other.getStackDriftDetectionId() != null
                && other.getStackDriftDetectionId().equals(this.getStackDriftDetectionId()) == false)
            return false;
        if (other.getStackDriftStatus() == null ^ this.getStackDriftStatus() == null)
            return false;
        if (other.getStackDriftStatus() != null
                && other.getStackDriftStatus().equals(this.getStackDriftStatus()) == false)
            return false;
        if (other.getDetectionStatus() == null ^ this.getDetectionStatus() == null)
            return false;
        if (other.getDetectionStatus() != null
                && other.getDetectionStatus().equals(this.getDetectionStatus()) == false)
            return false;
        if (other.getDetectionStatusReason() == null ^ this.getDetectionStatusReason() == null)
            return false;
        if (other.getDetectionStatusReason() != null
                && other.getDetectionStatusReason().equals(this.getDetectionStatusReason()) == false)
            return false;
        if (other.getDriftedStackResourceCount() == null
                ^ this.getDriftedStackResourceCount() == null)
            return false;
        if (other.getDriftedStackResourceCount() != null
                && other.getDriftedStackResourceCount().equals(this.getDriftedStackResourceCount()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }
}

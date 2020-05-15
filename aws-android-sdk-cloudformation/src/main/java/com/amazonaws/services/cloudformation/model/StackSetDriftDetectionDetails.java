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
 * Detailed information about the drift status of the stack set.
 * </p>
 * <p>
 * For stack sets, contains information about the last <i>completed</i> drift
 * operation performed on the stack set. Information about drift operations
 * in-progress is not included.
 * </p>
 * <p>
 * For stack set operations, includes information about drift operations
 * currently being performed on the stack set.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html"
 * >Detecting Unmanaged Changes in Stack Sets</a> in the <i>AWS CloudFormation
 * User Guide</i>.
 * </p>
 */
public class StackSetDriftDetectionDetails implements Serializable {
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
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, NOT_CHECKED
     */
    private String driftStatus;

    /**
     * <p>
     * The status of the stack set drift detection operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The drift detection operation completed without
     * failing on any stack instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The drift detection operation exceeded the specified
     * failure tolerance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIAL_SUCCESS</code>: The drift detection operation completed
     * without exceeding the failure tolerance for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The drift detection operation is currently
     * being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the drift detection
     * operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, PARTIAL_SUCCESS, IN_PROGRESS,
     * STOPPED
     */
    private String driftDetectionStatus;

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
     * The total number of stack instances belonging to this stack set.
     * </p>
     * <p>
     * The total number of stack instances is equal to the total of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Stack instances that match the stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stack instances that have drifted from the stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stack instances where the drift detection operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stack instances currently being checked for drift.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer totalStackInstancesCount;

    /**
     * <p>
     * The number of stack instances that have drifted from the expected
     * template and parameter configuration of the stack set. A stack instance
     * is considered to have drifted if one or more of the resources in the
     * associated stack do not match their expected configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer driftedStackInstancesCount;

    /**
     * <p>
     * The number of stack instances which match the expected template and
     * parameter configuration of the stack set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer inSyncStackInstancesCount;

    /**
     * <p>
     * The number of stack instances that are currently being checked for drift.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer inProgressStackInstancesCount;

    /**
     * <p>
     * The number of stack instances for which the drift detection operation
     * failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer failedStackInstancesCount;

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
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, NOT_CHECKED
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
     *         </ul>
     * @see StackSetDriftStatus
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
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, NOT_CHECKED
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
     *            </ul>
     * @see StackSetDriftStatus
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
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, NOT_CHECKED
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
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetDriftStatus
     */
    public StackSetDriftDetectionDetails withDriftStatus(String driftStatus) {
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
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, NOT_CHECKED
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
     *            </ul>
     * @see StackSetDriftStatus
     */
    public void setDriftStatus(StackSetDriftStatus driftStatus) {
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
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, NOT_CHECKED
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
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetDriftStatus
     */
    public StackSetDriftDetectionDetails withDriftStatus(StackSetDriftStatus driftStatus) {
        this.driftStatus = driftStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status of the stack set drift detection operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The drift detection operation completed without
     * failing on any stack instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The drift detection operation exceeded the specified
     * failure tolerance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIAL_SUCCESS</code>: The drift detection operation completed
     * without exceeding the failure tolerance for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The drift detection operation is currently
     * being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the drift detection
     * operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, PARTIAL_SUCCESS, IN_PROGRESS,
     * STOPPED
     *
     * @return <p>
     *         The status of the stack set drift detection operation.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code>: The drift detection operation completed
     *         without failing on any stack instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The drift detection operation exceeded the
     *         specified failure tolerance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PARTIAL_SUCCESS</code>: The drift detection operation
     *         completed without exceeding the failure tolerance for the
     *         operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code>: The drift detection operation is
     *         currently being performed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOPPED</code>: The user has cancelled the drift detection
     *         operation.
     *         </p>
     *         </li>
     *         </ul>
     * @see StackSetDriftDetectionStatus
     */
    public String getDriftDetectionStatus() {
        return driftDetectionStatus;
    }

    /**
     * <p>
     * The status of the stack set drift detection operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The drift detection operation completed without
     * failing on any stack instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The drift detection operation exceeded the specified
     * failure tolerance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIAL_SUCCESS</code>: The drift detection operation completed
     * without exceeding the failure tolerance for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The drift detection operation is currently
     * being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the drift detection
     * operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, PARTIAL_SUCCESS, IN_PROGRESS,
     * STOPPED
     *
     * @param driftDetectionStatus <p>
     *            The status of the stack set drift detection operation.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>COMPLETED</code>: The drift detection operation
     *            completed without failing on any stack instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The drift detection operation exceeded
     *            the specified failure tolerance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PARTIAL_SUCCESS</code>: The drift detection operation
     *            completed without exceeding the failure tolerance for the
     *            operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code>: The drift detection operation is
     *            currently being performed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPED</code>: The user has cancelled the drift
     *            detection operation.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackSetDriftDetectionStatus
     */
    public void setDriftDetectionStatus(String driftDetectionStatus) {
        this.driftDetectionStatus = driftDetectionStatus;
    }

    /**
     * <p>
     * The status of the stack set drift detection operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The drift detection operation completed without
     * failing on any stack instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The drift detection operation exceeded the specified
     * failure tolerance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIAL_SUCCESS</code>: The drift detection operation completed
     * without exceeding the failure tolerance for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The drift detection operation is currently
     * being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the drift detection
     * operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, PARTIAL_SUCCESS, IN_PROGRESS,
     * STOPPED
     *
     * @param driftDetectionStatus <p>
     *            The status of the stack set drift detection operation.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>COMPLETED</code>: The drift detection operation
     *            completed without failing on any stack instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The drift detection operation exceeded
     *            the specified failure tolerance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PARTIAL_SUCCESS</code>: The drift detection operation
     *            completed without exceeding the failure tolerance for the
     *            operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code>: The drift detection operation is
     *            currently being performed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPED</code>: The user has cancelled the drift
     *            detection operation.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetDriftDetectionStatus
     */
    public StackSetDriftDetectionDetails withDriftDetectionStatus(String driftDetectionStatus) {
        this.driftDetectionStatus = driftDetectionStatus;
        return this;
    }

    /**
     * <p>
     * The status of the stack set drift detection operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The drift detection operation completed without
     * failing on any stack instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The drift detection operation exceeded the specified
     * failure tolerance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIAL_SUCCESS</code>: The drift detection operation completed
     * without exceeding the failure tolerance for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The drift detection operation is currently
     * being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the drift detection
     * operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, PARTIAL_SUCCESS, IN_PROGRESS,
     * STOPPED
     *
     * @param driftDetectionStatus <p>
     *            The status of the stack set drift detection operation.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>COMPLETED</code>: The drift detection operation
     *            completed without failing on any stack instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The drift detection operation exceeded
     *            the specified failure tolerance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PARTIAL_SUCCESS</code>: The drift detection operation
     *            completed without exceeding the failure tolerance for the
     *            operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code>: The drift detection operation is
     *            currently being performed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPED</code>: The user has cancelled the drift
     *            detection operation.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackSetDriftDetectionStatus
     */
    public void setDriftDetectionStatus(StackSetDriftDetectionStatus driftDetectionStatus) {
        this.driftDetectionStatus = driftDetectionStatus.toString();
    }

    /**
     * <p>
     * The status of the stack set drift detection operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The drift detection operation completed without
     * failing on any stack instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The drift detection operation exceeded the specified
     * failure tolerance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIAL_SUCCESS</code>: The drift detection operation completed
     * without exceeding the failure tolerance for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The drift detection operation is currently
     * being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the drift detection
     * operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, PARTIAL_SUCCESS, IN_PROGRESS,
     * STOPPED
     *
     * @param driftDetectionStatus <p>
     *            The status of the stack set drift detection operation.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>COMPLETED</code>: The drift detection operation
     *            completed without failing on any stack instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The drift detection operation exceeded
     *            the specified failure tolerance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PARTIAL_SUCCESS</code>: The drift detection operation
     *            completed without exceeding the failure tolerance for the
     *            operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code>: The drift detection operation is
     *            currently being performed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPED</code>: The user has cancelled the drift
     *            detection operation.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetDriftDetectionStatus
     */
    public StackSetDriftDetectionDetails withDriftDetectionStatus(
            StackSetDriftDetectionStatus driftDetectionStatus) {
        this.driftDetectionStatus = driftDetectionStatus.toString();
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
    public StackSetDriftDetectionDetails withLastDriftCheckTimestamp(
            java.util.Date lastDriftCheckTimestamp) {
        this.lastDriftCheckTimestamp = lastDriftCheckTimestamp;
        return this;
    }

    /**
     * <p>
     * The total number of stack instances belonging to this stack set.
     * </p>
     * <p>
     * The total number of stack instances is equal to the total of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Stack instances that match the stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stack instances that have drifted from the stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stack instances where the drift detection operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stack instances currently being checked for drift.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total number of stack instances belonging to this stack set.
     *         </p>
     *         <p>
     *         The total number of stack instances is equal to the total of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Stack instances that match the stack set configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Stack instances that have drifted from the stack set
     *         configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Stack instances where the drift detection operation has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Stack instances currently being checked for drift.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Integer getTotalStackInstancesCount() {
        return totalStackInstancesCount;
    }

    /**
     * <p>
     * The total number of stack instances belonging to this stack set.
     * </p>
     * <p>
     * The total number of stack instances is equal to the total of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Stack instances that match the stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stack instances that have drifted from the stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stack instances where the drift detection operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stack instances currently being checked for drift.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param totalStackInstancesCount <p>
     *            The total number of stack instances belonging to this stack
     *            set.
     *            </p>
     *            <p>
     *            The total number of stack instances is equal to the total of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Stack instances that match the stack set configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Stack instances that have drifted from the stack set
     *            configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Stack instances where the drift detection operation has
     *            failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Stack instances currently being checked for drift.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTotalStackInstancesCount(Integer totalStackInstancesCount) {
        this.totalStackInstancesCount = totalStackInstancesCount;
    }

    /**
     * <p>
     * The total number of stack instances belonging to this stack set.
     * </p>
     * <p>
     * The total number of stack instances is equal to the total of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Stack instances that match the stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stack instances that have drifted from the stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stack instances where the drift detection operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stack instances currently being checked for drift.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param totalStackInstancesCount <p>
     *            The total number of stack instances belonging to this stack
     *            set.
     *            </p>
     *            <p>
     *            The total number of stack instances is equal to the total of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Stack instances that match the stack set configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Stack instances that have drifted from the stack set
     *            configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Stack instances where the drift detection operation has
     *            failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Stack instances currently being checked for drift.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetDriftDetectionDetails withTotalStackInstancesCount(
            Integer totalStackInstancesCount) {
        this.totalStackInstancesCount = totalStackInstancesCount;
        return this;
    }

    /**
     * <p>
     * The number of stack instances that have drifted from the expected
     * template and parameter configuration of the stack set. A stack instance
     * is considered to have drifted if one or more of the resources in the
     * associated stack do not match their expected configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of stack instances that have drifted from the expected
     *         template and parameter configuration of the stack set. A stack
     *         instance is considered to have drifted if one or more of the
     *         resources in the associated stack do not match their expected
     *         configuration.
     *         </p>
     */
    public Integer getDriftedStackInstancesCount() {
        return driftedStackInstancesCount;
    }

    /**
     * <p>
     * The number of stack instances that have drifted from the expected
     * template and parameter configuration of the stack set. A stack instance
     * is considered to have drifted if one or more of the resources in the
     * associated stack do not match their expected configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param driftedStackInstancesCount <p>
     *            The number of stack instances that have drifted from the
     *            expected template and parameter configuration of the stack
     *            set. A stack instance is considered to have drifted if one or
     *            more of the resources in the associated stack do not match
     *            their expected configuration.
     *            </p>
     */
    public void setDriftedStackInstancesCount(Integer driftedStackInstancesCount) {
        this.driftedStackInstancesCount = driftedStackInstancesCount;
    }

    /**
     * <p>
     * The number of stack instances that have drifted from the expected
     * template and parameter configuration of the stack set. A stack instance
     * is considered to have drifted if one or more of the resources in the
     * associated stack do not match their expected configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param driftedStackInstancesCount <p>
     *            The number of stack instances that have drifted from the
     *            expected template and parameter configuration of the stack
     *            set. A stack instance is considered to have drifted if one or
     *            more of the resources in the associated stack do not match
     *            their expected configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetDriftDetectionDetails withDriftedStackInstancesCount(
            Integer driftedStackInstancesCount) {
        this.driftedStackInstancesCount = driftedStackInstancesCount;
        return this;
    }

    /**
     * <p>
     * The number of stack instances which match the expected template and
     * parameter configuration of the stack set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of stack instances which match the expected template
     *         and parameter configuration of the stack set.
     *         </p>
     */
    public Integer getInSyncStackInstancesCount() {
        return inSyncStackInstancesCount;
    }

    /**
     * <p>
     * The number of stack instances which match the expected template and
     * parameter configuration of the stack set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param inSyncStackInstancesCount <p>
     *            The number of stack instances which match the expected
     *            template and parameter configuration of the stack set.
     *            </p>
     */
    public void setInSyncStackInstancesCount(Integer inSyncStackInstancesCount) {
        this.inSyncStackInstancesCount = inSyncStackInstancesCount;
    }

    /**
     * <p>
     * The number of stack instances which match the expected template and
     * parameter configuration of the stack set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param inSyncStackInstancesCount <p>
     *            The number of stack instances which match the expected
     *            template and parameter configuration of the stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetDriftDetectionDetails withInSyncStackInstancesCount(
            Integer inSyncStackInstancesCount) {
        this.inSyncStackInstancesCount = inSyncStackInstancesCount;
        return this;
    }

    /**
     * <p>
     * The number of stack instances that are currently being checked for drift.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of stack instances that are currently being checked
     *         for drift.
     *         </p>
     */
    public Integer getInProgressStackInstancesCount() {
        return inProgressStackInstancesCount;
    }

    /**
     * <p>
     * The number of stack instances that are currently being checked for drift.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param inProgressStackInstancesCount <p>
     *            The number of stack instances that are currently being checked
     *            for drift.
     *            </p>
     */
    public void setInProgressStackInstancesCount(Integer inProgressStackInstancesCount) {
        this.inProgressStackInstancesCount = inProgressStackInstancesCount;
    }

    /**
     * <p>
     * The number of stack instances that are currently being checked for drift.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param inProgressStackInstancesCount <p>
     *            The number of stack instances that are currently being checked
     *            for drift.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetDriftDetectionDetails withInProgressStackInstancesCount(
            Integer inProgressStackInstancesCount) {
        this.inProgressStackInstancesCount = inProgressStackInstancesCount;
        return this;
    }

    /**
     * <p>
     * The number of stack instances for which the drift detection operation
     * failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of stack instances for which the drift detection
     *         operation failed.
     *         </p>
     */
    public Integer getFailedStackInstancesCount() {
        return failedStackInstancesCount;
    }

    /**
     * <p>
     * The number of stack instances for which the drift detection operation
     * failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param failedStackInstancesCount <p>
     *            The number of stack instances for which the drift detection
     *            operation failed.
     *            </p>
     */
    public void setFailedStackInstancesCount(Integer failedStackInstancesCount) {
        this.failedStackInstancesCount = failedStackInstancesCount;
    }

    /**
     * <p>
     * The number of stack instances for which the drift detection operation
     * failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param failedStackInstancesCount <p>
     *            The number of stack instances for which the drift detection
     *            operation failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetDriftDetectionDetails withFailedStackInstancesCount(
            Integer failedStackInstancesCount) {
        this.failedStackInstancesCount = failedStackInstancesCount;
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
        if (getDriftStatus() != null)
            sb.append("DriftStatus: " + getDriftStatus() + ",");
        if (getDriftDetectionStatus() != null)
            sb.append("DriftDetectionStatus: " + getDriftDetectionStatus() + ",");
        if (getLastDriftCheckTimestamp() != null)
            sb.append("LastDriftCheckTimestamp: " + getLastDriftCheckTimestamp() + ",");
        if (getTotalStackInstancesCount() != null)
            sb.append("TotalStackInstancesCount: " + getTotalStackInstancesCount() + ",");
        if (getDriftedStackInstancesCount() != null)
            sb.append("DriftedStackInstancesCount: " + getDriftedStackInstancesCount() + ",");
        if (getInSyncStackInstancesCount() != null)
            sb.append("InSyncStackInstancesCount: " + getInSyncStackInstancesCount() + ",");
        if (getInProgressStackInstancesCount() != null)
            sb.append("InProgressStackInstancesCount: " + getInProgressStackInstancesCount() + ",");
        if (getFailedStackInstancesCount() != null)
            sb.append("FailedStackInstancesCount: " + getFailedStackInstancesCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDriftStatus() == null) ? 0 : getDriftStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDriftDetectionStatus() == null) ? 0 : getDriftDetectionStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastDriftCheckTimestamp() == null) ? 0 : getLastDriftCheckTimestamp()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalStackInstancesCount() == null) ? 0 : getTotalStackInstancesCount()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDriftedStackInstancesCount() == null) ? 0 : getDriftedStackInstancesCount()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getInSyncStackInstancesCount() == null) ? 0 : getInSyncStackInstancesCount()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getInProgressStackInstancesCount() == null) ? 0
                        : getInProgressStackInstancesCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getFailedStackInstancesCount() == null) ? 0 : getFailedStackInstancesCount()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSetDriftDetectionDetails == false)
            return false;
        StackSetDriftDetectionDetails other = (StackSetDriftDetectionDetails) obj;

        if (other.getDriftStatus() == null ^ this.getDriftStatus() == null)
            return false;
        if (other.getDriftStatus() != null
                && other.getDriftStatus().equals(this.getDriftStatus()) == false)
            return false;
        if (other.getDriftDetectionStatus() == null ^ this.getDriftDetectionStatus() == null)
            return false;
        if (other.getDriftDetectionStatus() != null
                && other.getDriftDetectionStatus().equals(this.getDriftDetectionStatus()) == false)
            return false;
        if (other.getLastDriftCheckTimestamp() == null ^ this.getLastDriftCheckTimestamp() == null)
            return false;
        if (other.getLastDriftCheckTimestamp() != null
                && other.getLastDriftCheckTimestamp().equals(this.getLastDriftCheckTimestamp()) == false)
            return false;
        if (other.getTotalStackInstancesCount() == null
                ^ this.getTotalStackInstancesCount() == null)
            return false;
        if (other.getTotalStackInstancesCount() != null
                && other.getTotalStackInstancesCount().equals(this.getTotalStackInstancesCount()) == false)
            return false;
        if (other.getDriftedStackInstancesCount() == null
                ^ this.getDriftedStackInstancesCount() == null)
            return false;
        if (other.getDriftedStackInstancesCount() != null
                && other.getDriftedStackInstancesCount().equals(
                        this.getDriftedStackInstancesCount()) == false)
            return false;
        if (other.getInSyncStackInstancesCount() == null
                ^ this.getInSyncStackInstancesCount() == null)
            return false;
        if (other.getInSyncStackInstancesCount() != null
                && other.getInSyncStackInstancesCount().equals(this.getInSyncStackInstancesCount()) == false)
            return false;
        if (other.getInProgressStackInstancesCount() == null
                ^ this.getInProgressStackInstancesCount() == null)
            return false;
        if (other.getInProgressStackInstancesCount() != null
                && other.getInProgressStackInstancesCount().equals(
                        this.getInProgressStackInstancesCount()) == false)
            return false;
        if (other.getFailedStackInstancesCount() == null
                ^ this.getFailedStackInstancesCount() == null)
            return false;
        if (other.getFailedStackInstancesCount() != null
                && other.getFailedStackInstancesCount().equals(this.getFailedStackInstancesCount()) == false)
            return false;
        return true;
    }
}

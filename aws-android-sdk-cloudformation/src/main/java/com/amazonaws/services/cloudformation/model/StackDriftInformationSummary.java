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
 * Contains information about whether the stack's actual configuration differs,
 * or has <i>drifted</i>, from its expected configuration, as defined in the
 * stack template and any values specified as template parameters. A stack is
 * considered to have drifted if one or more of its resources have drifted.
 * </p>
 */
public class StackDriftInformationSummary implements Serializable {
    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected
     * template configuration.
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
     * Most recent time when a drift detection operation was initiated on the
     * stack, or any of its individual resources that support drift detection.
     * </p>
     */
    private java.util.Date lastCheckTimestamp;

    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected
     * template configuration.
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
     *         expected template configuration.
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
     * template configuration.
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
     *            expected template configuration.
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
     * template configuration.
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
     *            expected template configuration.
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
    public StackDriftInformationSummary withStackDriftStatus(String stackDriftStatus) {
        this.stackDriftStatus = stackDriftStatus;
        return this;
    }

    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected
     * template configuration.
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
     *            expected template configuration.
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
     * template configuration.
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
     *            expected template configuration.
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
    public StackDriftInformationSummary withStackDriftStatus(StackDriftStatus stackDriftStatus) {
        this.stackDriftStatus = stackDriftStatus.toString();
        return this;
    }

    /**
     * <p>
     * Most recent time when a drift detection operation was initiated on the
     * stack, or any of its individual resources that support drift detection.
     * </p>
     *
     * @return <p>
     *         Most recent time when a drift detection operation was initiated
     *         on the stack, or any of its individual resources that support
     *         drift detection.
     *         </p>
     */
    public java.util.Date getLastCheckTimestamp() {
        return lastCheckTimestamp;
    }

    /**
     * <p>
     * Most recent time when a drift detection operation was initiated on the
     * stack, or any of its individual resources that support drift detection.
     * </p>
     *
     * @param lastCheckTimestamp <p>
     *            Most recent time when a drift detection operation was
     *            initiated on the stack, or any of its individual resources
     *            that support drift detection.
     *            </p>
     */
    public void setLastCheckTimestamp(java.util.Date lastCheckTimestamp) {
        this.lastCheckTimestamp = lastCheckTimestamp;
    }

    /**
     * <p>
     * Most recent time when a drift detection operation was initiated on the
     * stack, or any of its individual resources that support drift detection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastCheckTimestamp <p>
     *            Most recent time when a drift detection operation was
     *            initiated on the stack, or any of its individual resources
     *            that support drift detection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackDriftInformationSummary withLastCheckTimestamp(java.util.Date lastCheckTimestamp) {
        this.lastCheckTimestamp = lastCheckTimestamp;
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
        if (getStackDriftStatus() != null)
            sb.append("StackDriftStatus: " + getStackDriftStatus() + ",");
        if (getLastCheckTimestamp() != null)
            sb.append("LastCheckTimestamp: " + getLastCheckTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStackDriftStatus() == null) ? 0 : getStackDriftStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLastCheckTimestamp() == null) ? 0 : getLastCheckTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackDriftInformationSummary == false)
            return false;
        StackDriftInformationSummary other = (StackDriftInformationSummary) obj;

        if (other.getStackDriftStatus() == null ^ this.getStackDriftStatus() == null)
            return false;
        if (other.getStackDriftStatus() != null
                && other.getStackDriftStatus().equals(this.getStackDriftStatus()) == false)
            return false;
        if (other.getLastCheckTimestamp() == null ^ this.getLastCheckTimestamp() == null)
            return false;
        if (other.getLastCheckTimestamp() != null
                && other.getLastCheckTimestamp().equals(this.getLastCheckTimestamp()) == false)
            return false;
        return true;
    }
}

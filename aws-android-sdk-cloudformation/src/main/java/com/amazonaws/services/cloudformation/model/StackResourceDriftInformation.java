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
 * Contains information about whether the resource's actual configuration
 * differs, or has <i>drifted</i>, from its expected configuration.
 * </p>
 */
public class StackResourceDriftInformation implements Serializable {
    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected
     * configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected
     * configuration in that it has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: The resource differs from its expected
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the
     * resource differs from its expected configuration.
     * </p>
     * <p>
     * Any resources that do not currently support drift detection have a status
     * of <code>NOT_CHECKED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its
     * expected configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, MODIFIED, DELETED, NOT_CHECKED
     */
    private String stackResourceDriftStatus;

    /**
     * <p>
     * When AWS CloudFormation last checked if the resource had drifted from its
     * expected configuration.
     * </p>
     */
    private java.util.Date lastCheckTimestamp;

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected
     * configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected
     * configuration in that it has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: The resource differs from its expected
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the
     * resource differs from its expected configuration.
     * </p>
     * <p>
     * Any resources that do not currently support drift detection have a status
     * of <code>NOT_CHECKED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its
     * expected configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, MODIFIED, DELETED, NOT_CHECKED
     *
     * @return <p>
     *         Status of the resource's actual configuration compared to its
     *         expected configuration
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DELETED</code>: The resource differs from its expected
     *         configuration in that it has been deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MODIFIED</code>: The resource differs from its expected
     *         configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if
     *         the resource differs from its expected configuration.
     *         </p>
     *         <p>
     *         Any resources that do not currently support drift detection have
     *         a status of <code>NOT_CHECKED</code>. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     *         >Resources that Support Drift Detection</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_SYNC</code>: The resources's actual configuration
     *         matches its expected configuration.
     *         </p>
     *         </li>
     *         </ul>
     * @see StackResourceDriftStatus
     */
    public String getStackResourceDriftStatus() {
        return stackResourceDriftStatus;
    }

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected
     * configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected
     * configuration in that it has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: The resource differs from its expected
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the
     * resource differs from its expected configuration.
     * </p>
     * <p>
     * Any resources that do not currently support drift detection have a status
     * of <code>NOT_CHECKED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its
     * expected configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, MODIFIED, DELETED, NOT_CHECKED
     *
     * @param stackResourceDriftStatus <p>
     *            Status of the resource's actual configuration compared to its
     *            expected configuration
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DELETED</code>: The resource differs from its expected
     *            configuration in that it has been deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MODIFIED</code>: The resource differs from its expected
     *            configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation has not checked
     *            if the resource differs from its expected configuration.
     *            </p>
     *            <p>
     *            Any resources that do not currently support drift detection
     *            have a status of <code>NOT_CHECKED</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     *            >Resources that Support Drift Detection</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The resources's actual configuration
     *            matches its expected configuration.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackResourceDriftStatus
     */
    public void setStackResourceDriftStatus(String stackResourceDriftStatus) {
        this.stackResourceDriftStatus = stackResourceDriftStatus;
    }

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected
     * configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected
     * configuration in that it has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: The resource differs from its expected
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the
     * resource differs from its expected configuration.
     * </p>
     * <p>
     * Any resources that do not currently support drift detection have a status
     * of <code>NOT_CHECKED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its
     * expected configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, MODIFIED, DELETED, NOT_CHECKED
     *
     * @param stackResourceDriftStatus <p>
     *            Status of the resource's actual configuration compared to its
     *            expected configuration
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DELETED</code>: The resource differs from its expected
     *            configuration in that it has been deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MODIFIED</code>: The resource differs from its expected
     *            configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation has not checked
     *            if the resource differs from its expected configuration.
     *            </p>
     *            <p>
     *            Any resources that do not currently support drift detection
     *            have a status of <code>NOT_CHECKED</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     *            >Resources that Support Drift Detection</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The resources's actual configuration
     *            matches its expected configuration.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackResourceDriftStatus
     */
    public StackResourceDriftInformation withStackResourceDriftStatus(
            String stackResourceDriftStatus) {
        this.stackResourceDriftStatus = stackResourceDriftStatus;
        return this;
    }

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected
     * configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected
     * configuration in that it has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: The resource differs from its expected
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the
     * resource differs from its expected configuration.
     * </p>
     * <p>
     * Any resources that do not currently support drift detection have a status
     * of <code>NOT_CHECKED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its
     * expected configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, MODIFIED, DELETED, NOT_CHECKED
     *
     * @param stackResourceDriftStatus <p>
     *            Status of the resource's actual configuration compared to its
     *            expected configuration
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DELETED</code>: The resource differs from its expected
     *            configuration in that it has been deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MODIFIED</code>: The resource differs from its expected
     *            configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation has not checked
     *            if the resource differs from its expected configuration.
     *            </p>
     *            <p>
     *            Any resources that do not currently support drift detection
     *            have a status of <code>NOT_CHECKED</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     *            >Resources that Support Drift Detection</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The resources's actual configuration
     *            matches its expected configuration.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackResourceDriftStatus
     */
    public void setStackResourceDriftStatus(StackResourceDriftStatus stackResourceDriftStatus) {
        this.stackResourceDriftStatus = stackResourceDriftStatus.toString();
    }

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected
     * configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected
     * configuration in that it has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: The resource differs from its expected
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the
     * resource differs from its expected configuration.
     * </p>
     * <p>
     * Any resources that do not currently support drift detection have a status
     * of <code>NOT_CHECKED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its
     * expected configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, MODIFIED, DELETED, NOT_CHECKED
     *
     * @param stackResourceDriftStatus <p>
     *            Status of the resource's actual configuration compared to its
     *            expected configuration
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DELETED</code>: The resource differs from its expected
     *            configuration in that it has been deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MODIFIED</code>: The resource differs from its expected
     *            configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation has not checked
     *            if the resource differs from its expected configuration.
     *            </p>
     *            <p>
     *            Any resources that do not currently support drift detection
     *            have a status of <code>NOT_CHECKED</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     *            >Resources that Support Drift Detection</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The resources's actual configuration
     *            matches its expected configuration.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackResourceDriftStatus
     */
    public StackResourceDriftInformation withStackResourceDriftStatus(
            StackResourceDriftStatus stackResourceDriftStatus) {
        this.stackResourceDriftStatus = stackResourceDriftStatus.toString();
        return this;
    }

    /**
     * <p>
     * When AWS CloudFormation last checked if the resource had drifted from its
     * expected configuration.
     * </p>
     *
     * @return <p>
     *         When AWS CloudFormation last checked if the resource had drifted
     *         from its expected configuration.
     *         </p>
     */
    public java.util.Date getLastCheckTimestamp() {
        return lastCheckTimestamp;
    }

    /**
     * <p>
     * When AWS CloudFormation last checked if the resource had drifted from its
     * expected configuration.
     * </p>
     *
     * @param lastCheckTimestamp <p>
     *            When AWS CloudFormation last checked if the resource had
     *            drifted from its expected configuration.
     *            </p>
     */
    public void setLastCheckTimestamp(java.util.Date lastCheckTimestamp) {
        this.lastCheckTimestamp = lastCheckTimestamp;
    }

    /**
     * <p>
     * When AWS CloudFormation last checked if the resource had drifted from its
     * expected configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastCheckTimestamp <p>
     *            When AWS CloudFormation last checked if the resource had
     *            drifted from its expected configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDriftInformation withLastCheckTimestamp(java.util.Date lastCheckTimestamp) {
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
        if (getStackResourceDriftStatus() != null)
            sb.append("StackResourceDriftStatus: " + getStackResourceDriftStatus() + ",");
        if (getLastCheckTimestamp() != null)
            sb.append("LastCheckTimestamp: " + getLastCheckTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getStackResourceDriftStatus() == null) ? 0 : getStackResourceDriftStatus()
                        .hashCode());
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

        if (obj instanceof StackResourceDriftInformation == false)
            return false;
        StackResourceDriftInformation other = (StackResourceDriftInformation) obj;

        if (other.getStackResourceDriftStatus() == null
                ^ this.getStackResourceDriftStatus() == null)
            return false;
        if (other.getStackResourceDriftStatus() != null
                && other.getStackResourceDriftStatus().equals(this.getStackResourceDriftStatus()) == false)
            return false;
        if (other.getLastCheckTimestamp() == null ^ this.getLastCheckTimestamp() == null)
            return false;
        if (other.getLastCheckTimestamp() != null
                && other.getLastCheckTimestamp().equals(this.getLastCheckTimestamp()) == false)
            return false;
        return true;
    }
}

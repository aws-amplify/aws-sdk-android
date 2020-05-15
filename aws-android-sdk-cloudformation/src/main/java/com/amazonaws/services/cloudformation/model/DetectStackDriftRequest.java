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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Detects whether a stack's actual configuration differs, or has
 * <i>drifted</i>, from it's expected configuration, as defined in the stack
 * template and any values specified as template parameters. For each resource
 * in the stack that supports drift detection, AWS CloudFormation compares the
 * actual configuration of the resource with its expected template
 * configuration. Only resource properties explicitly defined in the stack
 * template are checked for drift. A stack is considered to have drifted if one
 * or more of its resources differ from their expected template configurations.
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
 * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
 * </p>
 * <p>
 * Use <code>DetectStackDrift</code> to detect drift on all supported resources
 * for a given stack, or <a>DetectStackResourceDrift</a> to detect drift on
 * individual resources.
 * </p>
 * <p>
 * For a list of stack resources that currently support drift detection, see <a
 * href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
 * >Resources that Support Drift Detection</a>.
 * </p>
 * <p>
 * <code>DetectStackDrift</code> can take up to several minutes, depending on
 * the number of resources contained within the stack. Use
 * <a>DescribeStackDriftDetectionStatus</a> to monitor the progress of a detect
 * stack drift operation. Once the drift detection operation has completed, use
 * <a>DescribeStackResourceDrifts</a> to return drift information about the
 * stack and its resources.
 * </p>
 * <p>
 * When detecting drift on a stack, AWS CloudFormation does not detect drift on
 * any nested stacks belonging to that stack. Perform
 * <code>DetectStackDrift</code> directly on the nested stack itself.
 * </p>
 */
public class DetectStackDriftRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the stack for which you want to detect drift.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     */
    private String stackName;

    /**
     * <p>
     * The logical names of any resources you want to use as filters.
     * </p>
     */
    private java.util.List<String> logicalResourceIds;

    /**
     * <p>
     * The name of the stack for which you want to detect drift.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @return <p>
     *         The name of the stack for which you want to detect drift.
     *         </p>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * The name of the stack for which you want to detect drift.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName <p>
     *            The name of the stack for which you want to detect drift.
     *            </p>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name of the stack for which you want to detect drift.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName <p>
     *            The name of the stack for which you want to detect drift.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectStackDriftRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * <p>
     * The logical names of any resources you want to use as filters.
     * </p>
     *
     * @return <p>
     *         The logical names of any resources you want to use as filters.
     *         </p>
     */
    public java.util.List<String> getLogicalResourceIds() {
        return logicalResourceIds;
    }

    /**
     * <p>
     * The logical names of any resources you want to use as filters.
     * </p>
     *
     * @param logicalResourceIds <p>
     *            The logical names of any resources you want to use as filters.
     *            </p>
     */
    public void setLogicalResourceIds(java.util.Collection<String> logicalResourceIds) {
        if (logicalResourceIds == null) {
            this.logicalResourceIds = null;
            return;
        }

        this.logicalResourceIds = new java.util.ArrayList<String>(logicalResourceIds);
    }

    /**
     * <p>
     * The logical names of any resources you want to use as filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logicalResourceIds <p>
     *            The logical names of any resources you want to use as filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectStackDriftRequest withLogicalResourceIds(String... logicalResourceIds) {
        if (getLogicalResourceIds() == null) {
            this.logicalResourceIds = new java.util.ArrayList<String>(logicalResourceIds.length);
        }
        for (String value : logicalResourceIds) {
            this.logicalResourceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The logical names of any resources you want to use as filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logicalResourceIds <p>
     *            The logical names of any resources you want to use as filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectStackDriftRequest withLogicalResourceIds(
            java.util.Collection<String> logicalResourceIds) {
        setLogicalResourceIds(logicalResourceIds);
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
        if (getStackName() != null)
            sb.append("StackName: " + getStackName() + ",");
        if (getLogicalResourceIds() != null)
            sb.append("LogicalResourceIds: " + getLogicalResourceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode
                + ((getLogicalResourceIds() == null) ? 0 : getLogicalResourceIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectStackDriftRequest == false)
            return false;
        DetectStackDriftRequest other = (DetectStackDriftRequest) obj;

        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getLogicalResourceIds() == null ^ this.getLogicalResourceIds() == null)
            return false;
        if (other.getLogicalResourceIds() != null
                && other.getLogicalResourceIds().equals(this.getLogicalResourceIds()) == false)
            return false;
        return true;
    }
}

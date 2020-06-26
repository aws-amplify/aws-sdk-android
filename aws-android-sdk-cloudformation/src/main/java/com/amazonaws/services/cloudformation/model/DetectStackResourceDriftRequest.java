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
 * Returns information about whether a resource's actual configuration differs,
 * or has <i>drifted</i>, from it's expected configuration, as defined in the
 * stack template and any values specified as template parameters. This
 * information includes actual and expected property values for resources in
 * which AWS CloudFormation detects drift. Only resource properties explicitly
 * defined in the stack template are checked for drift. For more information
 * about stack and resource drift, see <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
 * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
 * </p>
 * <p>
 * Use <code>DetectStackResourceDrift</code> to detect drift on individual
 * resources, or <a>DetectStackDrift</a> to detect drift on all resources in a
 * given stack that support drift detection.
 * </p>
 * <p>
 * Resources that do not currently support drift detection cannot be checked.
 * For a list of resources that support drift detection, see <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
 * >Resources that Support Drift Detection</a>.
 * </p>
 */
public class DetectStackResourceDriftRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the stack to which the resource belongs.
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
     * The logical name of the resource for which to return drift information.
     * </p>
     */
    private String logicalResourceId;

    /**
     * <p>
     * The name of the stack to which the resource belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @return <p>
     *         The name of the stack to which the resource belongs.
     *         </p>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * The name of the stack to which the resource belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName <p>
     *            The name of the stack to which the resource belongs.
     *            </p>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name of the stack to which the resource belongs.
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
     *            The name of the stack to which the resource belongs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectStackResourceDriftRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * <p>
     * The logical name of the resource for which to return drift information.
     * </p>
     *
     * @return <p>
     *         The logical name of the resource for which to return drift
     *         information.
     *         </p>
     */
    public String getLogicalResourceId() {
        return logicalResourceId;
    }

    /**
     * <p>
     * The logical name of the resource for which to return drift information.
     * </p>
     *
     * @param logicalResourceId <p>
     *            The logical name of the resource for which to return drift
     *            information.
     *            </p>
     */
    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The logical name of the resource for which to return drift information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logicalResourceId <p>
     *            The logical name of the resource for which to return drift
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectStackResourceDriftRequest withLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
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
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: " + getLogicalResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode
                + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectStackResourceDriftRequest == false)
            return false;
        DetectStackResourceDriftRequest other = (DetectStackResourceDriftRequest) obj;

        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null
                && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        return true;
    }
}

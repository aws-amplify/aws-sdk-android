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
 * Updates termination protection for the specified stack. If a user attempts to
 * delete a stack with termination protection enabled, the operation fails and
 * the stack remains unchanged. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
 * >Protecting a Stack From Being Deleted</a> in the <i>AWS CloudFormation User
 * Guide</i>.
 * </p>
 * <p>
 * For <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
 * >nested stacks</a>, termination protection is set on the root stack and
 * cannot be changed directly on the nested stack.
 * </p>
 */
public class UpdateTerminationProtectionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Whether to enable termination protection on the specified stack.
     * </p>
     */
    private Boolean enableTerminationProtection;

    /**
     * <p>
     * The name or unique ID of the stack for which you want to set termination
     * protection.
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
     * Whether to enable termination protection on the specified stack.
     * </p>
     *
     * @return <p>
     *         Whether to enable termination protection on the specified stack.
     *         </p>
     */
    public Boolean isEnableTerminationProtection() {
        return enableTerminationProtection;
    }

    /**
     * <p>
     * Whether to enable termination protection on the specified stack.
     * </p>
     *
     * @return <p>
     *         Whether to enable termination protection on the specified stack.
     *         </p>
     */
    public Boolean getEnableTerminationProtection() {
        return enableTerminationProtection;
    }

    /**
     * <p>
     * Whether to enable termination protection on the specified stack.
     * </p>
     *
     * @param enableTerminationProtection <p>
     *            Whether to enable termination protection on the specified
     *            stack.
     *            </p>
     */
    public void setEnableTerminationProtection(Boolean enableTerminationProtection) {
        this.enableTerminationProtection = enableTerminationProtection;
    }

    /**
     * <p>
     * Whether to enable termination protection on the specified stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableTerminationProtection <p>
     *            Whether to enable termination protection on the specified
     *            stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTerminationProtectionRequest withEnableTerminationProtection(
            Boolean enableTerminationProtection) {
        this.enableTerminationProtection = enableTerminationProtection;
        return this;
    }

    /**
     * <p>
     * The name or unique ID of the stack for which you want to set termination
     * protection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @return <p>
     *         The name or unique ID of the stack for which you want to set
     *         termination protection.
     *         </p>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * The name or unique ID of the stack for which you want to set termination
     * protection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName <p>
     *            The name or unique ID of the stack for which you want to set
     *            termination protection.
     *            </p>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or unique ID of the stack for which you want to set termination
     * protection.
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
     *            The name or unique ID of the stack for which you want to set
     *            termination protection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTerminationProtectionRequest withStackName(String stackName) {
        this.stackName = stackName;
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
        if (getEnableTerminationProtection() != null)
            sb.append("EnableTerminationProtection: " + getEnableTerminationProtection() + ",");
        if (getStackName() != null)
            sb.append("StackName: " + getStackName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEnableTerminationProtection() == null) ? 0
                        : getEnableTerminationProtection().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTerminationProtectionRequest == false)
            return false;
        UpdateTerminationProtectionRequest other = (UpdateTerminationProtectionRequest) obj;

        if (other.getEnableTerminationProtection() == null
                ^ this.getEnableTerminationProtection() == null)
            return false;
        if (other.getEnableTerminationProtection() != null
                && other.getEnableTerminationProtection().equals(
                        this.getEnableTerminationProtection()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
            return false;
        return true;
    }
}

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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Registers an on-premises instance.
 * </p>
 * <note>
 * <p>
 * Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the
 * request. You cannot use both.
 * </p>
 * </note>
 */
public class RegisterOnPremisesInstanceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the on-premises instance to register.
     * </p>
     */
    private String instanceName;

    /**
     * <p>
     * The ARN of the IAM session to associate with the on-premises instance.
     * </p>
     */
    private String iamSessionArn;

    /**
     * <p>
     * The ARN of the IAM user to associate with the on-premises instance.
     * </p>
     */
    private String iamUserArn;

    /**
     * <p>
     * The name of the on-premises instance to register.
     * </p>
     *
     * @return <p>
     *         The name of the on-premises instance to register.
     *         </p>
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * <p>
     * The name of the on-premises instance to register.
     * </p>
     *
     * @param instanceName <p>
     *            The name of the on-premises instance to register.
     *            </p>
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the on-premises instance to register.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceName <p>
     *            The name of the on-premises instance to register.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterOnPremisesInstanceRequest withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM session to associate with the on-premises instance.
     * </p>
     *
     * @return <p>
     *         The ARN of the IAM session to associate with the on-premises
     *         instance.
     *         </p>
     */
    public String getIamSessionArn() {
        return iamSessionArn;
    }

    /**
     * <p>
     * The ARN of the IAM session to associate with the on-premises instance.
     * </p>
     *
     * @param iamSessionArn <p>
     *            The ARN of the IAM session to associate with the on-premises
     *            instance.
     *            </p>
     */
    public void setIamSessionArn(String iamSessionArn) {
        this.iamSessionArn = iamSessionArn;
    }

    /**
     * <p>
     * The ARN of the IAM session to associate with the on-premises instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamSessionArn <p>
     *            The ARN of the IAM session to associate with the on-premises
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterOnPremisesInstanceRequest withIamSessionArn(String iamSessionArn) {
        this.iamSessionArn = iamSessionArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM user to associate with the on-premises instance.
     * </p>
     *
     * @return <p>
     *         The ARN of the IAM user to associate with the on-premises
     *         instance.
     *         </p>
     */
    public String getIamUserArn() {
        return iamUserArn;
    }

    /**
     * <p>
     * The ARN of the IAM user to associate with the on-premises instance.
     * </p>
     *
     * @param iamUserArn <p>
     *            The ARN of the IAM user to associate with the on-premises
     *            instance.
     *            </p>
     */
    public void setIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
    }

    /**
     * <p>
     * The ARN of the IAM user to associate with the on-premises instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamUserArn <p>
     *            The ARN of the IAM user to associate with the on-premises
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterOnPremisesInstanceRequest withIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
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
        if (getInstanceName() != null)
            sb.append("instanceName: " + getInstanceName() + ",");
        if (getIamSessionArn() != null)
            sb.append("iamSessionArn: " + getIamSessionArn() + ",");
        if (getIamUserArn() != null)
            sb.append("iamUserArn: " + getIamUserArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode
                + ((getIamSessionArn() == null) ? 0 : getIamSessionArn().hashCode());
        hashCode = prime * hashCode + ((getIamUserArn() == null) ? 0 : getIamUserArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterOnPremisesInstanceRequest == false)
            return false;
        RegisterOnPremisesInstanceRequest other = (RegisterOnPremisesInstanceRequest) obj;

        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null
                && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getIamSessionArn() == null ^ this.getIamSessionArn() == null)
            return false;
        if (other.getIamSessionArn() != null
                && other.getIamSessionArn().equals(this.getIamSessionArn()) == false)
            return false;
        if (other.getIamUserArn() == null ^ this.getIamUserArn() == null)
            return false;
        if (other.getIamUserArn() != null
                && other.getIamUserArn().equals(this.getIamUserArn()) == false)
            return false;
        return true;
    }
}

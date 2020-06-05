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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Add or change the operations role used by an environment. After this call is
 * made, Elastic Beanstalk uses the associated operations role for permissions
 * to downstream services during subsequent calls acting on this environment.
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
 * >Operations roles</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
 * </p>
 */
public class AssociateEnvironmentOperationsRoleRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the environment to which to set the operations role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     */
    private String environmentName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an existing IAM role to be used as the
     * environment's operations role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String operationsRole;

    /**
     * <p>
     * The name of the environment to which to set the operations role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @return <p>
     *         The name of the environment to which to set the operations role.
     *         </p>
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * <p>
     * The name of the environment to which to set the operations role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The name of the environment to which to set the operations
     *            role.
     *            </p>
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment to which to set the operations role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The name of the environment to which to set the operations
     *            role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateEnvironmentOperationsRoleRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an existing IAM role to be used as the
     * environment's operations role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an existing IAM role to be used
     *         as the environment's operations role.
     *         </p>
     */
    public String getOperationsRole() {
        return operationsRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an existing IAM role to be used as the
     * environment's operations role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param operationsRole <p>
     *            The Amazon Resource Name (ARN) of an existing IAM role to be
     *            used as the environment's operations role.
     *            </p>
     */
    public void setOperationsRole(String operationsRole) {
        this.operationsRole = operationsRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an existing IAM role to be used as the
     * environment's operations role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param operationsRole <p>
     *            The Amazon Resource Name (ARN) of an existing IAM role to be
     *            used as the environment's operations role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateEnvironmentOperationsRoleRequest withOperationsRole(String operationsRole) {
        this.operationsRole = operationsRole;
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getOperationsRole() != null)
            sb.append("OperationsRole: " + getOperationsRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode
                + ((getOperationsRole() == null) ? 0 : getOperationsRole().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateEnvironmentOperationsRoleRequest == false)
            return false;
        AssociateEnvironmentOperationsRoleRequest other = (AssociateEnvironmentOperationsRoleRequest) obj;

        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null
                && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getOperationsRole() == null ^ this.getOperationsRole() == null)
            return false;
        if (other.getOperationsRole() != null
                && other.getOperationsRole().equals(this.getOperationsRole()) == false)
            return false;
        return true;
    }
}

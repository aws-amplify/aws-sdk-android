/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the definition for the specified mitigation action.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >UpdateMitigationAction</a> action.
 * </p>
 */
public class UpdateMitigationActionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The friendly name for the mitigation action. You cannot change the name
     * by using <code>UpdateMitigationAction</code>. Instead, you must delete
     * and recreate the mitigation action with the new name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String actionName;

    /**
     * <p>
     * The ARN of the IAM role that is used to apply the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleArn;

    /**
     * <p>
     * Defines the type of action and the parameters for that action.
     * </p>
     */
    private MitigationActionParams actionParams;

    /**
     * <p>
     * The friendly name for the mitigation action. You cannot change the name
     * by using <code>UpdateMitigationAction</code>. Instead, you must delete
     * and recreate the mitigation action with the new name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The friendly name for the mitigation action. You cannot change
     *         the name by using <code>UpdateMitigationAction</code>. Instead,
     *         you must delete and recreate the mitigation action with the new
     *         name.
     *         </p>
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * <p>
     * The friendly name for the mitigation action. You cannot change the name
     * by using <code>UpdateMitigationAction</code>. Instead, you must delete
     * and recreate the mitigation action with the new name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param actionName <p>
     *            The friendly name for the mitigation action. You cannot change
     *            the name by using <code>UpdateMitigationAction</code>.
     *            Instead, you must delete and recreate the mitigation action
     *            with the new name.
     *            </p>
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The friendly name for the mitigation action. You cannot change the name
     * by using <code>UpdateMitigationAction</code>. Instead, you must delete
     * and recreate the mitigation action with the new name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param actionName <p>
     *            The friendly name for the mitigation action. You cannot change
     *            the name by using <code>UpdateMitigationAction</code>.
     *            Instead, you must delete and recreate the mitigation action
     *            with the new name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMitigationActionRequest withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that is used to apply the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the IAM role that is used to apply the mitigation
     *         action.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that is used to apply the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The ARN of the IAM role that is used to apply the mitigation
     *            action.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that is used to apply the mitigation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The ARN of the IAM role that is used to apply the mitigation
     *            action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMitigationActionRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * Defines the type of action and the parameters for that action.
     * </p>
     *
     * @return <p>
     *         Defines the type of action and the parameters for that action.
     *         </p>
     */
    public MitigationActionParams getActionParams() {
        return actionParams;
    }

    /**
     * <p>
     * Defines the type of action and the parameters for that action.
     * </p>
     *
     * @param actionParams <p>
     *            Defines the type of action and the parameters for that action.
     *            </p>
     */
    public void setActionParams(MitigationActionParams actionParams) {
        this.actionParams = actionParams;
    }

    /**
     * <p>
     * Defines the type of action and the parameters for that action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionParams <p>
     *            Defines the type of action and the parameters for that action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMitigationActionRequest withActionParams(MitigationActionParams actionParams) {
        this.actionParams = actionParams;
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
        if (getActionName() != null)
            sb.append("actionName: " + getActionName() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getActionParams() != null)
            sb.append("actionParams: " + getActionParams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getActionParams() == null) ? 0 : getActionParams().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMitigationActionRequest == false)
            return false;
        UpdateMitigationActionRequest other = (UpdateMitigationActionRequest) obj;

        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null
                && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getActionParams() == null ^ this.getActionParams() == null)
            return false;
        if (other.getActionParams() != null
                && other.getActionParams().equals(this.getActionParams()) == false)
            return false;
        return true;
    }
}

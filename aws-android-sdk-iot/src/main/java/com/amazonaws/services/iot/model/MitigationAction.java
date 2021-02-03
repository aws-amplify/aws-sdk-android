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

/**
 * <p>
 * Describes which changes should be applied as part of a mitigation action.
 * </p>
 */
public class MitigationAction implements Serializable {
    /**
     * <p>
     * A user-friendly name for the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String name;

    /**
     * <p>
     * A unique identifier for the mitigation action.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The IAM role ARN used to apply this mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The set of parameters for this mitigation action. The parameters vary,
     * depending on the kind of action you apply.
     * </p>
     */
    private MitigationActionParams actionParams;

    /**
     * <p>
     * A user-friendly name for the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         A user-friendly name for the mitigation action.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A user-friendly name for the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param name <p>
     *            A user-friendly name for the mitigation action.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A user-friendly name for the mitigation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param name <p>
     *            A user-friendly name for the mitigation action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MitigationAction withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the mitigation action.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the mitigation action.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * A unique identifier for the mitigation action.
     * </p>
     *
     * @param id <p>
     *            A unique identifier for the mitigation action.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the mitigation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            A unique identifier for the mitigation action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MitigationAction withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The IAM role ARN used to apply this mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The IAM role ARN used to apply this mitigation action.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The IAM role ARN used to apply this mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The IAM role ARN used to apply this mitigation action.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role ARN used to apply this mitigation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The IAM role ARN used to apply this mitigation action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MitigationAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The set of parameters for this mitigation action. The parameters vary,
     * depending on the kind of action you apply.
     * </p>
     *
     * @return <p>
     *         The set of parameters for this mitigation action. The parameters
     *         vary, depending on the kind of action you apply.
     *         </p>
     */
    public MitigationActionParams getActionParams() {
        return actionParams;
    }

    /**
     * <p>
     * The set of parameters for this mitigation action. The parameters vary,
     * depending on the kind of action you apply.
     * </p>
     *
     * @param actionParams <p>
     *            The set of parameters for this mitigation action. The
     *            parameters vary, depending on the kind of action you apply.
     *            </p>
     */
    public void setActionParams(MitigationActionParams actionParams) {
        this.actionParams = actionParams;
    }

    /**
     * <p>
     * The set of parameters for this mitigation action. The parameters vary,
     * depending on the kind of action you apply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionParams <p>
     *            The set of parameters for this mitigation action. The
     *            parameters vary, depending on the kind of action you apply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MitigationAction withActionParams(MitigationActionParams actionParams) {
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getId() != null)
            sb.append("id: " + getId() + ",");
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
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

        if (obj instanceof MitigationAction == false)
            return false;
        MitigationAction other = (MitigationAction) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

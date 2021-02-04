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

public class UpdateMitigationActionResult implements Serializable {
    /**
     * <p>
     * The ARN for the new mitigation action.
     * </p>
     */
    private String actionArn;

    /**
     * <p>
     * A unique identifier for the mitigation action.
     * </p>
     */
    private String actionId;

    /**
     * <p>
     * The ARN for the new mitigation action.
     * </p>
     *
     * @return <p>
     *         The ARN for the new mitigation action.
     *         </p>
     */
    public String getActionArn() {
        return actionArn;
    }

    /**
     * <p>
     * The ARN for the new mitigation action.
     * </p>
     *
     * @param actionArn <p>
     *            The ARN for the new mitigation action.
     *            </p>
     */
    public void setActionArn(String actionArn) {
        this.actionArn = actionArn;
    }

    /**
     * <p>
     * The ARN for the new mitigation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionArn <p>
     *            The ARN for the new mitigation action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMitigationActionResult withActionArn(String actionArn) {
        this.actionArn = actionArn;
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
    public String getActionId() {
        return actionId;
    }

    /**
     * <p>
     * A unique identifier for the mitigation action.
     * </p>
     *
     * @param actionId <p>
     *            A unique identifier for the mitigation action.
     *            </p>
     */
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * A unique identifier for the mitigation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionId <p>
     *            A unique identifier for the mitigation action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMitigationActionResult withActionId(String actionId) {
        this.actionId = actionId;
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
        if (getActionArn() != null)
            sb.append("actionArn: " + getActionArn() + ",");
        if (getActionId() != null)
            sb.append("actionId: " + getActionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionArn() == null) ? 0 : getActionArn().hashCode());
        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMitigationActionResult == false)
            return false;
        UpdateMitigationActionResult other = (UpdateMitigationActionResult) obj;

        if (other.getActionArn() == null ^ this.getActionArn() == null)
            return false;
        if (other.getActionArn() != null
                && other.getActionArn().equals(this.getActionArn()) == false)
            return false;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        return true;
    }
}

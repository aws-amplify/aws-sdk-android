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
 * Information that identifies a mitigation action. This information is returned
 * by ListMitigationActions.
 * </p>
 */
public class MitigationActionIdentifier implements Serializable {
    /**
     * <p>
     * The friendly name of the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String actionName;

    /**
     * <p>
     * The IAM role ARN used to apply this mitigation action.
     * </p>
     */
    private String actionArn;

    /**
     * <p>
     * The date when this mitigation action was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The friendly name of the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The friendly name of the mitigation action.
     *         </p>
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * <p>
     * The friendly name of the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param actionName <p>
     *            The friendly name of the mitigation action.
     *            </p>
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The friendly name of the mitigation action.
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
     *            The friendly name of the mitigation action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MitigationActionIdentifier withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * <p>
     * The IAM role ARN used to apply this mitigation action.
     * </p>
     *
     * @return <p>
     *         The IAM role ARN used to apply this mitigation action.
     *         </p>
     */
    public String getActionArn() {
        return actionArn;
    }

    /**
     * <p>
     * The IAM role ARN used to apply this mitigation action.
     * </p>
     *
     * @param actionArn <p>
     *            The IAM role ARN used to apply this mitigation action.
     *            </p>
     */
    public void setActionArn(String actionArn) {
        this.actionArn = actionArn;
    }

    /**
     * <p>
     * The IAM role ARN used to apply this mitigation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionArn <p>
     *            The IAM role ARN used to apply this mitigation action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MitigationActionIdentifier withActionArn(String actionArn) {
        this.actionArn = actionArn;
        return this;
    }

    /**
     * <p>
     * The date when this mitigation action was created.
     * </p>
     *
     * @return <p>
     *         The date when this mitigation action was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date when this mitigation action was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date when this mitigation action was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when this mitigation action was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date when this mitigation action was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MitigationActionIdentifier withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
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
        if (getActionArn() != null)
            sb.append("actionArn: " + getActionArn() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getActionArn() == null) ? 0 : getActionArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MitigationActionIdentifier == false)
            return false;
        MitigationActionIdentifier other = (MitigationActionIdentifier) obj;

        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null
                && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getActionArn() == null ^ this.getActionArn() == null)
            return false;
        if (other.getActionArn() != null
                && other.getActionArn().equals(this.getActionArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }
}

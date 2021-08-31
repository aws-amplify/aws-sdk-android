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

public class DescribeMitigationActionResult implements Serializable {
    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String actionName;

    /**
     * <p>
     * The type of mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPDATE_DEVICE_CERTIFICATE, UPDATE_CA_CERTIFICATE,
     * ADD_THINGS_TO_THING_GROUP, REPLACE_DEFAULT_POLICY_VERSION,
     * ENABLE_IOT_LOGGING, PUBLISH_FINDING_TO_SNS
     */
    private String actionType;

    /**
     * <p>
     * The ARN that identifies this migration action.
     * </p>
     */
    private String actionArn;

    /**
     * <p>
     * A unique identifier for this action.
     * </p>
     */
    private String actionId;

    /**
     * <p>
     * The ARN of the IAM role used to apply this action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleArn;

    /**
     * <p>
     * Parameters that control how the mitigation action is applied, specific to
     * the type of mitigation action.
     * </p>
     */
    private MitigationActionParams actionParams;

    /**
     * <p>
     * The date and time when the mitigation action was added to your Amazon Web
     * Services accounts.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date and time when the mitigation action was last changed.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The friendly name that uniquely identifies the mitigation action.
     *         </p>
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param actionName <p>
     *            The friendly name that uniquely identifies the mitigation
     *            action.
     *            </p>
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
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
     *            The friendly name that uniquely identifies the mitigation
     *            action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMitigationActionResult withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * <p>
     * The type of mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPDATE_DEVICE_CERTIFICATE, UPDATE_CA_CERTIFICATE,
     * ADD_THINGS_TO_THING_GROUP, REPLACE_DEFAULT_POLICY_VERSION,
     * ENABLE_IOT_LOGGING, PUBLISH_FINDING_TO_SNS
     *
     * @return <p>
     *         The type of mitigation action.
     *         </p>
     * @see MitigationActionType
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * <p>
     * The type of mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPDATE_DEVICE_CERTIFICATE, UPDATE_CA_CERTIFICATE,
     * ADD_THINGS_TO_THING_GROUP, REPLACE_DEFAULT_POLICY_VERSION,
     * ENABLE_IOT_LOGGING, PUBLISH_FINDING_TO_SNS
     *
     * @param actionType <p>
     *            The type of mitigation action.
     *            </p>
     * @see MitigationActionType
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of mitigation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPDATE_DEVICE_CERTIFICATE, UPDATE_CA_CERTIFICATE,
     * ADD_THINGS_TO_THING_GROUP, REPLACE_DEFAULT_POLICY_VERSION,
     * ENABLE_IOT_LOGGING, PUBLISH_FINDING_TO_SNS
     *
     * @param actionType <p>
     *            The type of mitigation action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MitigationActionType
     */
    public DescribeMitigationActionResult withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * <p>
     * The type of mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPDATE_DEVICE_CERTIFICATE, UPDATE_CA_CERTIFICATE,
     * ADD_THINGS_TO_THING_GROUP, REPLACE_DEFAULT_POLICY_VERSION,
     * ENABLE_IOT_LOGGING, PUBLISH_FINDING_TO_SNS
     *
     * @param actionType <p>
     *            The type of mitigation action.
     *            </p>
     * @see MitigationActionType
     */
    public void setActionType(MitigationActionType actionType) {
        this.actionType = actionType.toString();
    }

    /**
     * <p>
     * The type of mitigation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPDATE_DEVICE_CERTIFICATE, UPDATE_CA_CERTIFICATE,
     * ADD_THINGS_TO_THING_GROUP, REPLACE_DEFAULT_POLICY_VERSION,
     * ENABLE_IOT_LOGGING, PUBLISH_FINDING_TO_SNS
     *
     * @param actionType <p>
     *            The type of mitigation action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MitigationActionType
     */
    public DescribeMitigationActionResult withActionType(MitigationActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN that identifies this migration action.
     * </p>
     *
     * @return <p>
     *         The ARN that identifies this migration action.
     *         </p>
     */
    public String getActionArn() {
        return actionArn;
    }

    /**
     * <p>
     * The ARN that identifies this migration action.
     * </p>
     *
     * @param actionArn <p>
     *            The ARN that identifies this migration action.
     *            </p>
     */
    public void setActionArn(String actionArn) {
        this.actionArn = actionArn;
    }

    /**
     * <p>
     * The ARN that identifies this migration action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionArn <p>
     *            The ARN that identifies this migration action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMitigationActionResult withActionArn(String actionArn) {
        this.actionArn = actionArn;
        return this;
    }

    /**
     * <p>
     * A unique identifier for this action.
     * </p>
     *
     * @return <p>
     *         A unique identifier for this action.
     *         </p>
     */
    public String getActionId() {
        return actionId;
    }

    /**
     * <p>
     * A unique identifier for this action.
     * </p>
     *
     * @param actionId <p>
     *            A unique identifier for this action.
     *            </p>
     */
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * A unique identifier for this action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionId <p>
     *            A unique identifier for this action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMitigationActionResult withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role used to apply this action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the IAM role used to apply this action.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role used to apply this action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The ARN of the IAM role used to apply this action.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role used to apply this action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The ARN of the IAM role used to apply this action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMitigationActionResult withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * Parameters that control how the mitigation action is applied, specific to
     * the type of mitigation action.
     * </p>
     *
     * @return <p>
     *         Parameters that control how the mitigation action is applied,
     *         specific to the type of mitigation action.
     *         </p>
     */
    public MitigationActionParams getActionParams() {
        return actionParams;
    }

    /**
     * <p>
     * Parameters that control how the mitigation action is applied, specific to
     * the type of mitigation action.
     * </p>
     *
     * @param actionParams <p>
     *            Parameters that control how the mitigation action is applied,
     *            specific to the type of mitigation action.
     *            </p>
     */
    public void setActionParams(MitigationActionParams actionParams) {
        this.actionParams = actionParams;
    }

    /**
     * <p>
     * Parameters that control how the mitigation action is applied, specific to
     * the type of mitigation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionParams <p>
     *            Parameters that control how the mitigation action is applied,
     *            specific to the type of mitigation action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMitigationActionResult withActionParams(MitigationActionParams actionParams) {
        this.actionParams = actionParams;
        return this;
    }

    /**
     * <p>
     * The date and time when the mitigation action was added to your Amazon Web
     * Services accounts.
     * </p>
     *
     * @return <p>
     *         The date and time when the mitigation action was added to your
     *         Amazon Web Services accounts.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time when the mitigation action was added to your Amazon Web
     * Services accounts.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time when the mitigation action was added to your
     *            Amazon Web Services accounts.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the mitigation action was added to your Amazon Web
     * Services accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time when the mitigation action was added to your
     *            Amazon Web Services accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMitigationActionResult withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date and time when the mitigation action was last changed.
     * </p>
     *
     * @return <p>
     *         The date and time when the mitigation action was last changed.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date and time when the mitigation action was last changed.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date and time when the mitigation action was last changed.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time when the mitigation action was last changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date and time when the mitigation action was last changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMitigationActionResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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
        if (getActionType() != null)
            sb.append("actionType: " + getActionType() + ",");
        if (getActionArn() != null)
            sb.append("actionArn: " + getActionArn() + ",");
        if (getActionId() != null)
            sb.append("actionId: " + getActionId() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getActionParams() != null)
            sb.append("actionParams: " + getActionParams() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null)
            sb.append("lastModifiedDate: " + getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getActionArn() == null) ? 0 : getActionArn().hashCode());
        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getActionParams() == null) ? 0 : getActionParams().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMitigationActionResult == false)
            return false;
        DescribeMitigationActionResult other = (DescribeMitigationActionResult) obj;

        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null
                && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null
                && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getActionArn() == null ^ this.getActionArn() == null)
            return false;
        if (other.getActionArn() != null
                && other.getActionArn().equals(this.getActionArn()) == false)
            return false;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
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
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }
}

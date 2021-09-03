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
 * Defines an action that can be applied to audit findings by using
 * StartAuditMitigationActionsTask. Only certain types of mitigation actions can
 * be applied to specific check names. For more information, see <a href=
 * "https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-mitigation-actions.html"
 * >Mitigation actions</a>. Each mitigation action can apply only one type of
 * change.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >CreateMitigationAction</a> action.
 * </p>
 */
public class CreateMitigationActionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A friendly name for the action. Choose a friendly name that accurately
     * describes the action (for example, <code>EnableLoggingAction</code>).
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
     * Metadata that can be used to manage the mitigation action.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A friendly name for the action. Choose a friendly name that accurately
     * describes the action (for example, <code>EnableLoggingAction</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         A friendly name for the action. Choose a friendly name that
     *         accurately describes the action (for example,
     *         <code>EnableLoggingAction</code>).
     *         </p>
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * <p>
     * A friendly name for the action. Choose a friendly name that accurately
     * describes the action (for example, <code>EnableLoggingAction</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param actionName <p>
     *            A friendly name for the action. Choose a friendly name that
     *            accurately describes the action (for example,
     *            <code>EnableLoggingAction</code>).
     *            </p>
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * A friendly name for the action. Choose a friendly name that accurately
     * describes the action (for example, <code>EnableLoggingAction</code>).
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
     *            A friendly name for the action. Choose a friendly name that
     *            accurately describes the action (for example,
     *            <code>EnableLoggingAction</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMitigationActionRequest withActionName(String actionName) {
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
    public CreateMitigationActionRequest withRoleArn(String roleArn) {
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
    public CreateMitigationActionRequest withActionParams(MitigationActionParams actionParams) {
        this.actionParams = actionParams;
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the mitigation action.
     * </p>
     *
     * @return <p>
     *         Metadata that can be used to manage the mitigation action.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the mitigation action.
     * </p>
     *
     * @param tags <p>
     *            Metadata that can be used to manage the mitigation action.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata that can be used to manage the mitigation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata that can be used to manage the mitigation action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMitigationActionRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the mitigation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata that can be used to manage the mitigation action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMitigationActionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
            sb.append("actionParams: " + getActionParams() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMitigationActionRequest == false)
            return false;
        CreateMitigationActionRequest other = (CreateMitigationActionRequest) obj;

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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}

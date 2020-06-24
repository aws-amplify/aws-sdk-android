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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a webhook that connects repository events to an Amplify app.
 * </p>
 */
public class Webhook implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String webhookArn;

    /**
     * <p>
     * The ID of the webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String webhookId;

    /**
     * <p>
     * The URL of the webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String webhookUrl;

    /**
     * <p>
     * The name for a branch that is part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String branchName;

    /**
     * <p>
     * The description for a webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * The create date and time for a webhook.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * Updates the date and time for a webhook.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the webhook.
     *         </p>
     */
    public String getWebhookArn() {
        return webhookArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param webhookArn <p>
     *            The Amazon Resource Name (ARN) for the webhook.
     *            </p>
     */
    public void setWebhookArn(String webhookArn) {
        this.webhookArn = webhookArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the webhook.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param webhookArn <p>
     *            The Amazon Resource Name (ARN) for the webhook.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Webhook withWebhookArn(String webhookArn) {
        this.webhookArn = webhookArn;
        return this;
    }

    /**
     * <p>
     * The ID of the webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The ID of the webhook.
     *         </p>
     */
    public String getWebhookId() {
        return webhookId;
    }

    /**
     * <p>
     * The ID of the webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param webhookId <p>
     *            The ID of the webhook.
     *            </p>
     */
    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    /**
     * <p>
     * The ID of the webhook.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param webhookId <p>
     *            The ID of the webhook.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Webhook withWebhookId(String webhookId) {
        this.webhookId = webhookId;
        return this;
    }

    /**
     * <p>
     * The URL of the webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The URL of the webhook.
     *         </p>
     */
    public String getWebhookUrl() {
        return webhookUrl;
    }

    /**
     * <p>
     * The URL of the webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param webhookUrl <p>
     *            The URL of the webhook.
     *            </p>
     */
    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    /**
     * <p>
     * The URL of the webhook.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param webhookUrl <p>
     *            The URL of the webhook.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Webhook withWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
        return this;
    }

    /**
     * <p>
     * The name for a branch that is part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name for a branch that is part of an Amplify app.
     *         </p>
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * <p>
     * The name for a branch that is part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param branchName <p>
     *            The name for a branch that is part of an Amplify app.
     *            </p>
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name for a branch that is part of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param branchName <p>
     *            The name for a branch that is part of an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Webhook withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * <p>
     * The description for a webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The description for a webhook.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for a webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param description <p>
     *            The description for a webhook.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for a webhook.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param description <p>
     *            The description for a webhook.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Webhook withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The create date and time for a webhook.
     * </p>
     *
     * @return <p>
     *         The create date and time for a webhook.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The create date and time for a webhook.
     * </p>
     *
     * @param createTime <p>
     *            The create date and time for a webhook.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The create date and time for a webhook.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The create date and time for a webhook.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Webhook withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * Updates the date and time for a webhook.
     * </p>
     *
     * @return <p>
     *         Updates the date and time for a webhook.
     *         </p>
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    /**
     * <p>
     * Updates the date and time for a webhook.
     * </p>
     *
     * @param updateTime <p>
     *            Updates the date and time for a webhook.
     *            </p>
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * Updates the date and time for a webhook.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateTime <p>
     *            Updates the date and time for a webhook.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Webhook withUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
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
        if (getWebhookArn() != null)
            sb.append("webhookArn: " + getWebhookArn() + ",");
        if (getWebhookId() != null)
            sb.append("webhookId: " + getWebhookId() + ",");
        if (getWebhookUrl() != null)
            sb.append("webhookUrl: " + getWebhookUrl() + ",");
        if (getBranchName() != null)
            sb.append("branchName: " + getBranchName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getCreateTime() != null)
            sb.append("createTime: " + getCreateTime() + ",");
        if (getUpdateTime() != null)
            sb.append("updateTime: " + getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebhookArn() == null) ? 0 : getWebhookArn().hashCode());
        hashCode = prime * hashCode + ((getWebhookId() == null) ? 0 : getWebhookId().hashCode());
        hashCode = prime * hashCode + ((getWebhookUrl() == null) ? 0 : getWebhookUrl().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Webhook == false)
            return false;
        Webhook other = (Webhook) obj;

        if (other.getWebhookArn() == null ^ this.getWebhookArn() == null)
            return false;
        if (other.getWebhookArn() != null
                && other.getWebhookArn().equals(this.getWebhookArn()) == false)
            return false;
        if (other.getWebhookId() == null ^ this.getWebhookId() == null)
            return false;
        if (other.getWebhookId() != null
                && other.getWebhookId().equals(this.getWebhookId()) == false)
            return false;
        if (other.getWebhookUrl() == null ^ this.getWebhookUrl() == null)
            return false;
        if (other.getWebhookUrl() != null
                && other.getWebhookUrl().equals(this.getWebhookUrl()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null
                && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null
                && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }
}

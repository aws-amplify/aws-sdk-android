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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a webhook.
 * </p>
 */
public class DeleteWebhookRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID for a webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String webhookId;

    /**
     * <p>
     * The unique ID for a webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The unique ID for a webhook.
     *         </p>
     */
    public String getWebhookId() {
        return webhookId;
    }

    /**
     * <p>
     * The unique ID for a webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param webhookId <p>
     *            The unique ID for a webhook.
     *            </p>
     */
    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    /**
     * <p>
     * The unique ID for a webhook.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param webhookId <p>
     *            The unique ID for a webhook.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteWebhookRequest withWebhookId(String webhookId) {
        this.webhookId = webhookId;
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
        if (getWebhookId() != null)
            sb.append("webhookId: " + getWebhookId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebhookId() == null) ? 0 : getWebhookId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteWebhookRequest == false)
            return false;
        DeleteWebhookRequest other = (DeleteWebhookRequest) obj;

        if (other.getWebhookId() == null ^ this.getWebhookId() == null)
            return false;
        if (other.getWebhookId() != null
                && other.getWebhookId().equals(this.getWebhookId()) == false)
            return false;
        return true;
    }
}

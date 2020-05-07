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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

public class CreateWebhookResult implements Serializable {
    /**
     * <p>
     * Information about a webhook that connects repository events to a build
     * project in AWS CodeBuild.
     * </p>
     */
    private Webhook webhook;

    /**
     * <p>
     * Information about a webhook that connects repository events to a build
     * project in AWS CodeBuild.
     * </p>
     *
     * @return <p>
     *         Information about a webhook that connects repository events to a
     *         build project in AWS CodeBuild.
     *         </p>
     */
    public Webhook getWebhook() {
        return webhook;
    }

    /**
     * <p>
     * Information about a webhook that connects repository events to a build
     * project in AWS CodeBuild.
     * </p>
     *
     * @param webhook <p>
     *            Information about a webhook that connects repository events to
     *            a build project in AWS CodeBuild.
     *            </p>
     */
    public void setWebhook(Webhook webhook) {
        this.webhook = webhook;
    }

    /**
     * <p>
     * Information about a webhook that connects repository events to a build
     * project in AWS CodeBuild.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param webhook <p>
     *            Information about a webhook that connects repository events to
     *            a build project in AWS CodeBuild.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateWebhookResult withWebhook(Webhook webhook) {
        this.webhook = webhook;
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
        if (getWebhook() != null)
            sb.append("webhook: " + getWebhook());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebhook() == null) ? 0 : getWebhook().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWebhookResult == false)
            return false;
        CreateWebhookResult other = (CreateWebhookResult) obj;

        if (other.getWebhook() == null ^ this.getWebhook() == null)
            return false;
        if (other.getWebhook() != null && other.getWebhook().equals(this.getWebhook()) == false)
            return false;
        return true;
    }
}

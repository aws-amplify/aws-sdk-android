/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class GetPushTemplateResult implements Serializable {
    /**
     * <p>
     * Provides information about the content and settings for a message
     * template that can be used in messages that are sent through a push
     * notification channel.
     * </p>
     */
    private PushNotificationTemplateResponse pushNotificationTemplateResponse;

    /**
     * <p>
     * Provides information about the content and settings for a message
     * template that can be used in messages that are sent through a push
     * notification channel.
     * </p>
     *
     * @return <p>
     *         Provides information about the content and settings for a message
     *         template that can be used in messages that are sent through a
     *         push notification channel.
     *         </p>
     */
    public PushNotificationTemplateResponse getPushNotificationTemplateResponse() {
        return pushNotificationTemplateResponse;
    }

    /**
     * <p>
     * Provides information about the content and settings for a message
     * template that can be used in messages that are sent through a push
     * notification channel.
     * </p>
     *
     * @param pushNotificationTemplateResponse <p>
     *            Provides information about the content and settings for a
     *            message template that can be used in messages that are sent
     *            through a push notification channel.
     *            </p>
     */
    public void setPushNotificationTemplateResponse(
            PushNotificationTemplateResponse pushNotificationTemplateResponse) {
        this.pushNotificationTemplateResponse = pushNotificationTemplateResponse;
    }

    /**
     * <p>
     * Provides information about the content and settings for a message
     * template that can be used in messages that are sent through a push
     * notification channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pushNotificationTemplateResponse <p>
     *            Provides information about the content and settings for a
     *            message template that can be used in messages that are sent
     *            through a push notification channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPushTemplateResult withPushNotificationTemplateResponse(
            PushNotificationTemplateResponse pushNotificationTemplateResponse) {
        this.pushNotificationTemplateResponse = pushNotificationTemplateResponse;
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
        if (getPushNotificationTemplateResponse() != null)
            sb.append("PushNotificationTemplateResponse: " + getPushNotificationTemplateResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPushNotificationTemplateResponse() == null) ? 0
                        : getPushNotificationTemplateResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPushTemplateResult == false)
            return false;
        GetPushTemplateResult other = (GetPushTemplateResult) obj;

        if (other.getPushNotificationTemplateResponse() == null
                ^ this.getPushNotificationTemplateResponse() == null)
            return false;
        if (other.getPushNotificationTemplateResponse() != null
                && other.getPushNotificationTemplateResponse().equals(
                        this.getPushNotificationTemplateResponse()) == false)
            return false;
        return true;
    }
}

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

public class GetEmailTemplateResult implements Serializable {
    /**
     * <p>
     * Provides information about the content and settings for a message
     * template that can be used in messages that are sent through the email
     * channel.
     * </p>
     */
    private EmailTemplateResponse emailTemplateResponse;

    /**
     * <p>
     * Provides information about the content and settings for a message
     * template that can be used in messages that are sent through the email
     * channel.
     * </p>
     *
     * @return <p>
     *         Provides information about the content and settings for a message
     *         template that can be used in messages that are sent through the
     *         email channel.
     *         </p>
     */
    public EmailTemplateResponse getEmailTemplateResponse() {
        return emailTemplateResponse;
    }

    /**
     * <p>
     * Provides information about the content and settings for a message
     * template that can be used in messages that are sent through the email
     * channel.
     * </p>
     *
     * @param emailTemplateResponse <p>
     *            Provides information about the content and settings for a
     *            message template that can be used in messages that are sent
     *            through the email channel.
     *            </p>
     */
    public void setEmailTemplateResponse(EmailTemplateResponse emailTemplateResponse) {
        this.emailTemplateResponse = emailTemplateResponse;
    }

    /**
     * <p>
     * Provides information about the content and settings for a message
     * template that can be used in messages that are sent through the email
     * channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emailTemplateResponse <p>
     *            Provides information about the content and settings for a
     *            message template that can be used in messages that are sent
     *            through the email channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetEmailTemplateResult withEmailTemplateResponse(
            EmailTemplateResponse emailTemplateResponse) {
        this.emailTemplateResponse = emailTemplateResponse;
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
        if (getEmailTemplateResponse() != null)
            sb.append("EmailTemplateResponse: " + getEmailTemplateResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEmailTemplateResponse() == null) ? 0 : getEmailTemplateResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEmailTemplateResult == false)
            return false;
        GetEmailTemplateResult other = (GetEmailTemplateResult) obj;

        if (other.getEmailTemplateResponse() == null ^ this.getEmailTemplateResponse() == null)
            return false;
        if (other.getEmailTemplateResponse() != null
                && other.getEmailTemplateResponse().equals(this.getEmailTemplateResponse()) == false)
            return false;
        return true;
    }
}

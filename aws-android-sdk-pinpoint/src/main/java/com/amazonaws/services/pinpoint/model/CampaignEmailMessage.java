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

/**
 * The email message configuration.
 */
public class CampaignEmailMessage implements Serializable {
    /**
     * The email text body.
     */
    private String body;

    /**
     * The email address used to send the email from. Defaults to use
     * FromAddress specified in the Email Channel.
     */
    private String fromAddress;

    /**
     * The email html body.
     */
    private String htmlBody;

    /**
     * The email title (Or subject).
     */
    private String title;

    /**
     * The email text body.
     *
     * @return The email text body.
     */
    public String getBody() {
        return body;
    }

    /**
     * The email text body.
     *
     * @param body The email text body.
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * The email text body.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body The email text body.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignEmailMessage withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * The email address used to send the email from. Defaults to use
     * FromAddress specified in the Email Channel.
     *
     * @return The email address used to send the email from. Defaults to use
     *         FromAddress specified in the Email Channel.
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * The email address used to send the email from. Defaults to use
     * FromAddress specified in the Email Channel.
     *
     * @param fromAddress The email address used to send the email from.
     *            Defaults to use FromAddress specified in the Email Channel.
     */
    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * The email address used to send the email from. Defaults to use
     * FromAddress specified in the Email Channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromAddress The email address used to send the email from.
     *            Defaults to use FromAddress specified in the Email Channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignEmailMessage withFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }

    /**
     * The email html body.
     *
     * @return The email html body.
     */
    public String getHtmlBody() {
        return htmlBody;
    }

    /**
     * The email html body.
     *
     * @param htmlBody The email html body.
     */
    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    /**
     * The email html body.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param htmlBody The email html body.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignEmailMessage withHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
        return this;
    }

    /**
     * The email title (Or subject).
     *
     * @return The email title (Or subject).
     */
    public String getTitle() {
        return title;
    }

    /**
     * The email title (Or subject).
     *
     * @param title The email title (Or subject).
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The email title (Or subject).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param title The email title (Or subject).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignEmailMessage withTitle(String title) {
        this.title = title;
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
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getFromAddress() != null)
            sb.append("FromAddress: " + getFromAddress() + ",");
        if (getHtmlBody() != null)
            sb.append("HtmlBody: " + getHtmlBody() + ",");
        if (getTitle() != null)
            sb.append("Title: " + getTitle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode
                + ((getFromAddress() == null) ? 0 : getFromAddress().hashCode());
        hashCode = prime * hashCode + ((getHtmlBody() == null) ? 0 : getHtmlBody().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignEmailMessage == false)
            return false;
        CampaignEmailMessage other = (CampaignEmailMessage) obj;

        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getFromAddress() == null ^ this.getFromAddress() == null)
            return false;
        if (other.getFromAddress() != null
                && other.getFromAddress().equals(this.getFromAddress()) == false)
            return false;
        if (other.getHtmlBody() == null ^ this.getHtmlBody() == null)
            return false;
        if (other.getHtmlBody() != null && other.getHtmlBody().equals(this.getHtmlBody()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }
}

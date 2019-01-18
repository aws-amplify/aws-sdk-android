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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The notify email type.
 * </p>
 */
public class NotifyEmailType implements Serializable {
    /**
     * <p>
     * The subject.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     */
    private String subject;

    /**
     * <p>
     * The HTML body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]+<br/>
     */
    private String htmlBody;

    /**
     * <p>
     * The text body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]+<br/>
     */
    private String textBody;

    /**
     * <p>
     * The subject.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @return <p>
     *         The subject.
     *         </p>
     */
    public String getSubject() {
        return subject;
    }

    /**
     * <p>
     * The subject.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @param subject <p>
     *            The subject.
     *            </p>
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @param subject <p>
     *            The subject.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotifyEmailType withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * <p>
     * The HTML body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]+<br/>
     *
     * @return <p>
     *         The HTML body.
     *         </p>
     */
    public String getHtmlBody() {
        return htmlBody;
    }

    /**
     * <p>
     * The HTML body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]+<br/>
     *
     * @param htmlBody <p>
     *            The HTML body.
     *            </p>
     */
    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    /**
     * <p>
     * The HTML body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]+<br/>
     *
     * @param htmlBody <p>
     *            The HTML body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotifyEmailType withHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
        return this;
    }

    /**
     * <p>
     * The text body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]+<br/>
     *
     * @return <p>
     *         The text body.
     *         </p>
     */
    public String getTextBody() {
        return textBody;
    }

    /**
     * <p>
     * The text body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]+<br/>
     *
     * @param textBody <p>
     *            The text body.
     *            </p>
     */
    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    /**
     * <p>
     * The text body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]+<br/>
     *
     * @param textBody <p>
     *            The text body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotifyEmailType withTextBody(String textBody) {
        this.textBody = textBody;
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
        if (getSubject() != null)
            sb.append("Subject: " + getSubject() + ",");
        if (getHtmlBody() != null)
            sb.append("HtmlBody: " + getHtmlBody() + ",");
        if (getTextBody() != null)
            sb.append("TextBody: " + getTextBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getHtmlBody() == null) ? 0 : getHtmlBody().hashCode());
        hashCode = prime * hashCode + ((getTextBody() == null) ? 0 : getTextBody().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotifyEmailType == false)
            return false;
        NotifyEmailType other = (NotifyEmailType) obj;

        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getHtmlBody() == null ^ this.getHtmlBody() == null)
            return false;
        if (other.getHtmlBody() != null && other.getHtmlBody().equals(this.getHtmlBody()) == false)
            return false;
        if (other.getTextBody() == null ^ this.getTextBody() == null)
            return false;
        if (other.getTextBody() != null && other.getTextBody().equals(this.getTextBody()) == false)
            return false;
        return true;
    }
}

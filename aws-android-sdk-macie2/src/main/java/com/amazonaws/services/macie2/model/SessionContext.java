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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about a session that was created for an entity who
 * performed an action by using temporary security credentials.
 * </p>
 */
public class SessionContext implements Serializable {
    /**
     * <p>
     * The date and time when the credentials were issued, and whether the
     * credentials were authenticated with a multi-factor authentication (MFA)
     * device.
     * </p>
     */
    private SessionContextAttributes attributes;

    /**
     * <p>
     * The source and type of credentials that the entity obtained.
     * </p>
     */
    private SessionIssuer sessionIssuer;

    /**
     * <p>
     * The date and time when the credentials were issued, and whether the
     * credentials were authenticated with a multi-factor authentication (MFA)
     * device.
     * </p>
     *
     * @return <p>
     *         The date and time when the credentials were issued, and whether
     *         the credentials were authenticated with a multi-factor
     *         authentication (MFA) device.
     *         </p>
     */
    public SessionContextAttributes getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The date and time when the credentials were issued, and whether the
     * credentials were authenticated with a multi-factor authentication (MFA)
     * device.
     * </p>
     *
     * @param attributes <p>
     *            The date and time when the credentials were issued, and
     *            whether the credentials were authenticated with a multi-factor
     *            authentication (MFA) device.
     *            </p>
     */
    public void setAttributes(SessionContextAttributes attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The date and time when the credentials were issued, and whether the
     * credentials were authenticated with a multi-factor authentication (MFA)
     * device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The date and time when the credentials were issued, and
     *            whether the credentials were authenticated with a multi-factor
     *            authentication (MFA) device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SessionContext withAttributes(SessionContextAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * The source and type of credentials that the entity obtained.
     * </p>
     *
     * @return <p>
     *         The source and type of credentials that the entity obtained.
     *         </p>
     */
    public SessionIssuer getSessionIssuer() {
        return sessionIssuer;
    }

    /**
     * <p>
     * The source and type of credentials that the entity obtained.
     * </p>
     *
     * @param sessionIssuer <p>
     *            The source and type of credentials that the entity obtained.
     *            </p>
     */
    public void setSessionIssuer(SessionIssuer sessionIssuer) {
        this.sessionIssuer = sessionIssuer;
    }

    /**
     * <p>
     * The source and type of credentials that the entity obtained.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionIssuer <p>
     *            The source and type of credentials that the entity obtained.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SessionContext withSessionIssuer(SessionIssuer sessionIssuer) {
        this.sessionIssuer = sessionIssuer;
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
        if (getAttributes() != null)
            sb.append("attributes: " + getAttributes() + ",");
        if (getSessionIssuer() != null)
            sb.append("sessionIssuer: " + getSessionIssuer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getSessionIssuer() == null) ? 0 : getSessionIssuer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionContext == false)
            return false;
        SessionContext other = (SessionContext) obj;

        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getSessionIssuer() == null ^ this.getSessionIssuer() == null)
            return false;
        if (other.getSessionIssuer() != null
                && other.getSessionIssuer().equals(this.getSessionIssuer()) == false)
            return false;
        return true;
    }
}

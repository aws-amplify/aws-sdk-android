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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * When the certificate is valid.
 * </p>
 */
public class CertificateValidity implements Serializable {
    /**
     * <p>
     * The certificate is not valid before this date.
     * </p>
     */
    private java.util.Date notBefore;

    /**
     * <p>
     * The certificate is not valid after this date.
     * </p>
     */
    private java.util.Date notAfter;

    /**
     * <p>
     * The certificate is not valid before this date.
     * </p>
     *
     * @return <p>
     *         The certificate is not valid before this date.
     *         </p>
     */
    public java.util.Date getNotBefore() {
        return notBefore;
    }

    /**
     * <p>
     * The certificate is not valid before this date.
     * </p>
     *
     * @param notBefore <p>
     *            The certificate is not valid before this date.
     *            </p>
     */
    public void setNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * <p>
     * The certificate is not valid before this date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notBefore <p>
     *            The certificate is not valid before this date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CertificateValidity withNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * <p>
     * The certificate is not valid after this date.
     * </p>
     *
     * @return <p>
     *         The certificate is not valid after this date.
     *         </p>
     */
    public java.util.Date getNotAfter() {
        return notAfter;
    }

    /**
     * <p>
     * The certificate is not valid after this date.
     * </p>
     *
     * @param notAfter <p>
     *            The certificate is not valid after this date.
     *            </p>
     */
    public void setNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * <p>
     * The certificate is not valid after this date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notAfter <p>
     *            The certificate is not valid after this date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CertificateValidity withNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
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
        if (getNotBefore() != null)
            sb.append("notBefore: " + getNotBefore() + ",");
        if (getNotAfter() != null)
            sb.append("notAfter: " + getNotAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode());
        hashCode = prime * hashCode + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateValidity == false)
            return false;
        CertificateValidity other = (CertificateValidity) obj;

        if (other.getNotBefore() == null ^ this.getNotBefore() == null)
            return false;
        if (other.getNotBefore() != null
                && other.getNotBefore().equals(this.getNotBefore()) == false)
            return false;
        if (other.getNotAfter() == null ^ this.getNotAfter() == null)
            return false;
        if (other.getNotAfter() != null && other.getNotAfter().equals(this.getNotAfter()) == false)
            return false;
        return true;
    }
}

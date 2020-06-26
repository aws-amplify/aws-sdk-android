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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class DescribeAccountAttributesResult implements Serializable {
    /**
     * <p>
     * Account quota information.
     * </p>
     */
    private java.util.List<AccountQuota> accountQuotas;

    /**
     * <p>
     * A unique AWS DMS identifier for an account in a particular AWS Region.
     * The value of this identifier has the following format:
     * <code>c99999999999</code>. DMS uses this identifier to name artifacts.
     * For example, DMS uses this identifier to name the default Amazon S3
     * bucket for storing task assessment reports in a given AWS Region. The
     * format of this S3 bucket name is the following:
     * <code>dms-<i>AccountNumber</i>-<i>UniqueAccountIdentifier</i>.</code>
     * Here is an example name for this default S3 bucket:
     * <code>dms-111122223333-c44445555666</code>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>UniqueAccountIdentifier</code> parameter in
     * versions 3.1.4 and later.
     * </p>
     * </note>
     */
    private String uniqueAccountIdentifier;

    /**
     * <p>
     * Account quota information.
     * </p>
     *
     * @return <p>
     *         Account quota information.
     *         </p>
     */
    public java.util.List<AccountQuota> getAccountQuotas() {
        return accountQuotas;
    }

    /**
     * <p>
     * Account quota information.
     * </p>
     *
     * @param accountQuotas <p>
     *            Account quota information.
     *            </p>
     */
    public void setAccountQuotas(java.util.Collection<AccountQuota> accountQuotas) {
        if (accountQuotas == null) {
            this.accountQuotas = null;
            return;
        }

        this.accountQuotas = new java.util.ArrayList<AccountQuota>(accountQuotas);
    }

    /**
     * <p>
     * Account quota information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountQuotas <p>
     *            Account quota information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountAttributesResult withAccountQuotas(AccountQuota... accountQuotas) {
        if (getAccountQuotas() == null) {
            this.accountQuotas = new java.util.ArrayList<AccountQuota>(accountQuotas.length);
        }
        for (AccountQuota value : accountQuotas) {
            this.accountQuotas.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Account quota information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountQuotas <p>
     *            Account quota information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountAttributesResult withAccountQuotas(
            java.util.Collection<AccountQuota> accountQuotas) {
        setAccountQuotas(accountQuotas);
        return this;
    }

    /**
     * <p>
     * A unique AWS DMS identifier for an account in a particular AWS Region.
     * The value of this identifier has the following format:
     * <code>c99999999999</code>. DMS uses this identifier to name artifacts.
     * For example, DMS uses this identifier to name the default Amazon S3
     * bucket for storing task assessment reports in a given AWS Region. The
     * format of this S3 bucket name is the following:
     * <code>dms-<i>AccountNumber</i>-<i>UniqueAccountIdentifier</i>.</code>
     * Here is an example name for this default S3 bucket:
     * <code>dms-111122223333-c44445555666</code>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>UniqueAccountIdentifier</code> parameter in
     * versions 3.1.4 and later.
     * </p>
     * </note>
     *
     * @return <p>
     *         A unique AWS DMS identifier for an account in a particular AWS
     *         Region. The value of this identifier has the following format:
     *         <code>c99999999999</code>. DMS uses this identifier to name
     *         artifacts. For example, DMS uses this identifier to name the
     *         default Amazon S3 bucket for storing task assessment reports in a
     *         given AWS Region. The format of this S3 bucket name is the
     *         following:
     *         <code>dms-<i>AccountNumber</i>-<i>UniqueAccountIdentifier</i>.</code>
     *         Here is an example name for this default S3 bucket:
     *         <code>dms-111122223333-c44445555666</code>.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS supports the <code>UniqueAccountIdentifier</code>
     *         parameter in versions 3.1.4 and later.
     *         </p>
     *         </note>
     */
    public String getUniqueAccountIdentifier() {
        return uniqueAccountIdentifier;
    }

    /**
     * <p>
     * A unique AWS DMS identifier for an account in a particular AWS Region.
     * The value of this identifier has the following format:
     * <code>c99999999999</code>. DMS uses this identifier to name artifacts.
     * For example, DMS uses this identifier to name the default Amazon S3
     * bucket for storing task assessment reports in a given AWS Region. The
     * format of this S3 bucket name is the following:
     * <code>dms-<i>AccountNumber</i>-<i>UniqueAccountIdentifier</i>.</code>
     * Here is an example name for this default S3 bucket:
     * <code>dms-111122223333-c44445555666</code>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>UniqueAccountIdentifier</code> parameter in
     * versions 3.1.4 and later.
     * </p>
     * </note>
     *
     * @param uniqueAccountIdentifier <p>
     *            A unique AWS DMS identifier for an account in a particular AWS
     *            Region. The value of this identifier has the following format:
     *            <code>c99999999999</code>. DMS uses this identifier to name
     *            artifacts. For example, DMS uses this identifier to name the
     *            default Amazon S3 bucket for storing task assessment reports
     *            in a given AWS Region. The format of this S3 bucket name is
     *            the following:
     *            <code>dms-<i>AccountNumber</i>-<i>UniqueAccountIdentifier</i>.</code>
     *            Here is an example name for this default S3 bucket:
     *            <code>dms-111122223333-c44445555666</code>.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS supports the <code>UniqueAccountIdentifier</code>
     *            parameter in versions 3.1.4 and later.
     *            </p>
     *            </note>
     */
    public void setUniqueAccountIdentifier(String uniqueAccountIdentifier) {
        this.uniqueAccountIdentifier = uniqueAccountIdentifier;
    }

    /**
     * <p>
     * A unique AWS DMS identifier for an account in a particular AWS Region.
     * The value of this identifier has the following format:
     * <code>c99999999999</code>. DMS uses this identifier to name artifacts.
     * For example, DMS uses this identifier to name the default Amazon S3
     * bucket for storing task assessment reports in a given AWS Region. The
     * format of this S3 bucket name is the following:
     * <code>dms-<i>AccountNumber</i>-<i>UniqueAccountIdentifier</i>.</code>
     * Here is an example name for this default S3 bucket:
     * <code>dms-111122223333-c44445555666</code>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>UniqueAccountIdentifier</code> parameter in
     * versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uniqueAccountIdentifier <p>
     *            A unique AWS DMS identifier for an account in a particular AWS
     *            Region. The value of this identifier has the following format:
     *            <code>c99999999999</code>. DMS uses this identifier to name
     *            artifacts. For example, DMS uses this identifier to name the
     *            default Amazon S3 bucket for storing task assessment reports
     *            in a given AWS Region. The format of this S3 bucket name is
     *            the following:
     *            <code>dms-<i>AccountNumber</i>-<i>UniqueAccountIdentifier</i>.</code>
     *            Here is an example name for this default S3 bucket:
     *            <code>dms-111122223333-c44445555666</code>.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS supports the <code>UniqueAccountIdentifier</code>
     *            parameter in versions 3.1.4 and later.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountAttributesResult withUniqueAccountIdentifier(
            String uniqueAccountIdentifier) {
        this.uniqueAccountIdentifier = uniqueAccountIdentifier;
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
        if (getAccountQuotas() != null)
            sb.append("AccountQuotas: " + getAccountQuotas() + ",");
        if (getUniqueAccountIdentifier() != null)
            sb.append("UniqueAccountIdentifier: " + getUniqueAccountIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccountQuotas() == null) ? 0 : getAccountQuotas().hashCode());
        hashCode = prime
                * hashCode
                + ((getUniqueAccountIdentifier() == null) ? 0 : getUniqueAccountIdentifier()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountAttributesResult == false)
            return false;
        DescribeAccountAttributesResult other = (DescribeAccountAttributesResult) obj;

        if (other.getAccountQuotas() == null ^ this.getAccountQuotas() == null)
            return false;
        if (other.getAccountQuotas() != null
                && other.getAccountQuotas().equals(this.getAccountQuotas()) == false)
            return false;
        if (other.getUniqueAccountIdentifier() == null ^ this.getUniqueAccountIdentifier() == null)
            return false;
        if (other.getUniqueAccountIdentifier() != null
                && other.getUniqueAccountIdentifier().equals(this.getUniqueAccountIdentifier()) == false)
            return false;
        return true;
    }
}

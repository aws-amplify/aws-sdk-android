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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * Data source credentials. This is a variant type structure. For this structure
 * to be valid, only one of the attributes can be non-null.
 * </p>
 */
public class DataSourceCredentials implements Serializable {
    /**
     * <p>
     * Credential pair. For more information, see <a>CredentialPair</a>.
     * </p>
     */
    private CredentialPair credentialPair;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a data source that has the credential
     * pair that you want to use. When <code>CopySourceArn</code> is not null,
     * the credential pair from the data source in the ARN is used as the
     * credentials for the <code>DataSourceCredentials</code> structure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:[-a-z0-9]*:quicksight:[-a-z0-9]*:[0-9]{12}:datasource/.+<br/>
     */
    private String copySourceArn;

    /**
     * <p>
     * Credential pair. For more information, see <a>CredentialPair</a>.
     * </p>
     *
     * @return <p>
     *         Credential pair. For more information, see <a>CredentialPair</a>.
     *         </p>
     */
    public CredentialPair getCredentialPair() {
        return credentialPair;
    }

    /**
     * <p>
     * Credential pair. For more information, see <a>CredentialPair</a>.
     * </p>
     *
     * @param credentialPair <p>
     *            Credential pair. For more information, see
     *            <a>CredentialPair</a>.
     *            </p>
     */
    public void setCredentialPair(CredentialPair credentialPair) {
        this.credentialPair = credentialPair;
    }

    /**
     * <p>
     * Credential pair. For more information, see <a>CredentialPair</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param credentialPair <p>
     *            Credential pair. For more information, see
     *            <a>CredentialPair</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceCredentials withCredentialPair(CredentialPair credentialPair) {
        this.credentialPair = credentialPair;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a data source that has the credential
     * pair that you want to use. When <code>CopySourceArn</code> is not null,
     * the credential pair from the data source in the ARN is used as the
     * credentials for the <code>DataSourceCredentials</code> structure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:[-a-z0-9]*:quicksight:[-a-z0-9]*:[0-9]{12}:datasource/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of a data source that has the
     *         credential pair that you want to use. When
     *         <code>CopySourceArn</code> is not null, the credential pair from
     *         the data source in the ARN is used as the credentials for the
     *         <code>DataSourceCredentials</code> structure.
     *         </p>
     */
    public String getCopySourceArn() {
        return copySourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a data source that has the credential
     * pair that you want to use. When <code>CopySourceArn</code> is not null,
     * the credential pair from the data source in the ARN is used as the
     * credentials for the <code>DataSourceCredentials</code> structure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:[-a-z0-9]*:quicksight:[-a-z0-9]*:[0-9]{12}:datasource/.+<br/>
     *
     * @param copySourceArn <p>
     *            The Amazon Resource Name (ARN) of a data source that has the
     *            credential pair that you want to use. When
     *            <code>CopySourceArn</code> is not null, the credential pair
     *            from the data source in the ARN is used as the credentials for
     *            the <code>DataSourceCredentials</code> structure.
     *            </p>
     */
    public void setCopySourceArn(String copySourceArn) {
        this.copySourceArn = copySourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a data source that has the credential
     * pair that you want to use. When <code>CopySourceArn</code> is not null,
     * the credential pair from the data source in the ARN is used as the
     * credentials for the <code>DataSourceCredentials</code> structure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:[-a-z0-9]*:quicksight:[-a-z0-9]*:[0-9]{12}:datasource/.+<br/>
     *
     * @param copySourceArn <p>
     *            The Amazon Resource Name (ARN) of a data source that has the
     *            credential pair that you want to use. When
     *            <code>CopySourceArn</code> is not null, the credential pair
     *            from the data source in the ARN is used as the credentials for
     *            the <code>DataSourceCredentials</code> structure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceCredentials withCopySourceArn(String copySourceArn) {
        this.copySourceArn = copySourceArn;
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
        if (getCredentialPair() != null)
            sb.append("CredentialPair: " + getCredentialPair() + ",");
        if (getCopySourceArn() != null)
            sb.append("CopySourceArn: " + getCopySourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCredentialPair() == null) ? 0 : getCredentialPair().hashCode());
        hashCode = prime * hashCode
                + ((getCopySourceArn() == null) ? 0 : getCopySourceArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceCredentials == false)
            return false;
        DataSourceCredentials other = (DataSourceCredentials) obj;

        if (other.getCredentialPair() == null ^ this.getCredentialPair() == null)
            return false;
        if (other.getCredentialPair() != null
                && other.getCredentialPair().equals(this.getCredentialPair()) == false)
            return false;
        if (other.getCopySourceArn() == null ^ this.getCopySourceArn() == null)
            return false;
        if (other.getCopySourceArn() != null
                && other.getCopySourceArn().equals(this.getCopySourceArn()) == false)
            return false;
        return true;
    }
}

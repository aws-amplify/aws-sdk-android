/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

/**
 * <p>
 * KMS uses the authentication credential to sign requests that it sends to the
 * external key store proxy (XKS proxy) on your behalf. You establish these
 * credentials on your external key store proxy and report them to KMS.
 * </p>
 * <p>
 * The <code>XksProxyAuthenticationCredential</code> includes two required
 * elements.
 * </p>
 */
public class XksProxyAuthenticationCredentialType implements Serializable {
    /**
     * <p>
     * A unique identifier for the raw secret access key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 30<br/>
     * <b>Pattern: </b>^[A-Z2-7]+$<br/>
     */
    private String accessKeyId;

    /**
     * <p>
     * A secret string of 43-64 characters. Valid characters are a-z, A-Z, 0-9,
     * /, +, and =.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>43 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/+=]+$<br/>
     */
    private String rawSecretAccessKey;

    /**
     * <p>
     * A unique identifier for the raw secret access key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 30<br/>
     * <b>Pattern: </b>^[A-Z2-7]+$<br/>
     *
     * @return <p>
     *         A unique identifier for the raw secret access key.
     *         </p>
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * <p>
     * A unique identifier for the raw secret access key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 30<br/>
     * <b>Pattern: </b>^[A-Z2-7]+$<br/>
     *
     * @param accessKeyId <p>
     *            A unique identifier for the raw secret access key.
     *            </p>
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * A unique identifier for the raw secret access key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 30<br/>
     * <b>Pattern: </b>^[A-Z2-7]+$<br/>
     *
     * @param accessKeyId <p>
     *            A unique identifier for the raw secret access key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public XksProxyAuthenticationCredentialType withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * <p>
     * A secret string of 43-64 characters. Valid characters are a-z, A-Z, 0-9,
     * /, +, and =.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>43 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/+=]+$<br/>
     *
     * @return <p>
     *         A secret string of 43-64 characters. Valid characters are a-z,
     *         A-Z, 0-9, /, +, and =.
     *         </p>
     */
    public String getRawSecretAccessKey() {
        return rawSecretAccessKey;
    }

    /**
     * <p>
     * A secret string of 43-64 characters. Valid characters are a-z, A-Z, 0-9,
     * /, +, and =.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>43 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/+=]+$<br/>
     *
     * @param rawSecretAccessKey <p>
     *            A secret string of 43-64 characters. Valid characters are a-z,
     *            A-Z, 0-9, /, +, and =.
     *            </p>
     */
    public void setRawSecretAccessKey(String rawSecretAccessKey) {
        this.rawSecretAccessKey = rawSecretAccessKey;
    }

    /**
     * <p>
     * A secret string of 43-64 characters. Valid characters are a-z, A-Z, 0-9,
     * /, +, and =.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>43 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/+=]+$<br/>
     *
     * @param rawSecretAccessKey <p>
     *            A secret string of 43-64 characters. Valid characters are a-z,
     *            A-Z, 0-9, /, +, and =.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public XksProxyAuthenticationCredentialType withRawSecretAccessKey(String rawSecretAccessKey) {
        this.rawSecretAccessKey = rawSecretAccessKey;
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
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: " + getAccessKeyId() + ",");
        if (getRawSecretAccessKey() != null)
            sb.append("RawSecretAccessKey: " + getRawSecretAccessKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getRawSecretAccessKey() == null) ? 0 : getRawSecretAccessKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof XksProxyAuthenticationCredentialType == false)
            return false;
        XksProxyAuthenticationCredentialType other = (XksProxyAuthenticationCredentialType) obj;

        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null
                && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        if (other.getRawSecretAccessKey() == null ^ this.getRawSecretAccessKey() == null)
            return false;
        if (other.getRawSecretAccessKey() != null
                && other.getRawSecretAccessKey().equals(this.getRawSecretAccessKey()) == false)
            return false;
        return true;
    }
}

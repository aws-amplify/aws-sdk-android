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
 * Data source credentials.
 * </p>
 */
public class DataSourceCredentials implements Serializable {
    /**
     * <p>
     * Credential pair.
     * </p>
     */
    private CredentialPair credentialPair;

    /**
     * <p>
     * Credential pair.
     * </p>
     *
     * @return <p>
     *         Credential pair.
     *         </p>
     */
    public CredentialPair getCredentialPair() {
        return credentialPair;
    }

    /**
     * <p>
     * Credential pair.
     * </p>
     *
     * @param credentialPair <p>
     *            Credential pair.
     *            </p>
     */
    public void setCredentialPair(CredentialPair credentialPair) {
        this.credentialPair = credentialPair;
    }

    /**
     * <p>
     * Credential pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param credentialPair <p>
     *            Credential pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceCredentials withCredentialPair(CredentialPair credentialPair) {
        this.credentialPair = credentialPair;
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
            sb.append("CredentialPair: " + getCredentialPair());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCredentialPair() == null) ? 0 : getCredentialPair().hashCode());
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
        return true;
    }
}

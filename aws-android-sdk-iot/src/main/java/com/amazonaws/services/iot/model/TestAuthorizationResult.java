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

public class TestAuthorizationResult implements Serializable {
    /**
     * <p>
     * The authentication results.
     * </p>
     */
    private java.util.List<AuthResult> authResults;

    /**
     * <p>
     * The authentication results.
     * </p>
     *
     * @return <p>
     *         The authentication results.
     *         </p>
     */
    public java.util.List<AuthResult> getAuthResults() {
        return authResults;
    }

    /**
     * <p>
     * The authentication results.
     * </p>
     *
     * @param authResults <p>
     *            The authentication results.
     *            </p>
     */
    public void setAuthResults(java.util.Collection<AuthResult> authResults) {
        if (authResults == null) {
            this.authResults = null;
            return;
        }

        this.authResults = new java.util.ArrayList<AuthResult>(authResults);
    }

    /**
     * <p>
     * The authentication results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authResults <p>
     *            The authentication results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestAuthorizationResult withAuthResults(AuthResult... authResults) {
        if (getAuthResults() == null) {
            this.authResults = new java.util.ArrayList<AuthResult>(authResults.length);
        }
        for (AuthResult value : authResults) {
            this.authResults.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The authentication results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authResults <p>
     *            The authentication results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestAuthorizationResult withAuthResults(java.util.Collection<AuthResult> authResults) {
        setAuthResults(authResults);
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
        if (getAuthResults() != null)
            sb.append("authResults: " + getAuthResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuthResults() == null) ? 0 : getAuthResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestAuthorizationResult == false)
            return false;
        TestAuthorizationResult other = (TestAuthorizationResult) obj;

        if (other.getAuthResults() == null ^ this.getAuthResults() == null)
            return false;
        if (other.getAuthResults() != null
                && other.getAuthResults().equals(this.getAuthResults()) == false)
            return false;
        return true;
    }
}

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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a <code>DeleteGitHubAccountToken</code> operation.
 * </p>
 */
public class DeleteGitHubAccountTokenResult implements Serializable {
    /**
     * <p>
     * The name of the GitHub account connection that was deleted.
     * </p>
     */
    private String tokenName;

    /**
     * <p>
     * The name of the GitHub account connection that was deleted.
     * </p>
     *
     * @return <p>
     *         The name of the GitHub account connection that was deleted.
     *         </p>
     */
    public String getTokenName() {
        return tokenName;
    }

    /**
     * <p>
     * The name of the GitHub account connection that was deleted.
     * </p>
     *
     * @param tokenName <p>
     *            The name of the GitHub account connection that was deleted.
     *            </p>
     */
    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    /**
     * <p>
     * The name of the GitHub account connection that was deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tokenName <p>
     *            The name of the GitHub account connection that was deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteGitHubAccountTokenResult withTokenName(String tokenName) {
        this.tokenName = tokenName;
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
        if (getTokenName() != null)
            sb.append("tokenName: " + getTokenName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTokenName() == null) ? 0 : getTokenName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteGitHubAccountTokenResult == false)
            return false;
        DeleteGitHubAccountTokenResult other = (DeleteGitHubAccountTokenResult) obj;

        if (other.getTokenName() == null ^ this.getTokenName() == null)
            return false;
        if (other.getTokenName() != null
                && other.getTokenName().equals(this.getTokenName()) == false)
            return false;
        return true;
    }
}

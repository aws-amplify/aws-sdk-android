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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * The result structure for the list backend environments result.
 * </p>
 */
public class ListBackendEnvironmentsResult implements Serializable {
    /**
     * <p>
     * The list of backend environments for an Amplify app.
     * </p>
     */
    private java.util.List<BackendEnvironment> backendEnvironments;

    /**
     * <p>
     * A pagination token. If a non-null pagination token is returned in a
     * result, pass its value in another request to retrieve more entries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The list of backend environments for an Amplify app.
     * </p>
     *
     * @return <p>
     *         The list of backend environments for an Amplify app.
     *         </p>
     */
    public java.util.List<BackendEnvironment> getBackendEnvironments() {
        return backendEnvironments;
    }

    /**
     * <p>
     * The list of backend environments for an Amplify app.
     * </p>
     *
     * @param backendEnvironments <p>
     *            The list of backend environments for an Amplify app.
     *            </p>
     */
    public void setBackendEnvironments(java.util.Collection<BackendEnvironment> backendEnvironments) {
        if (backendEnvironments == null) {
            this.backendEnvironments = null;
            return;
        }

        this.backendEnvironments = new java.util.ArrayList<BackendEnvironment>(backendEnvironments);
    }

    /**
     * <p>
     * The list of backend environments for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backendEnvironments <p>
     *            The list of backend environments for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBackendEnvironmentsResult withBackendEnvironments(
            BackendEnvironment... backendEnvironments) {
        if (getBackendEnvironments() == null) {
            this.backendEnvironments = new java.util.ArrayList<BackendEnvironment>(
                    backendEnvironments.length);
        }
        for (BackendEnvironment value : backendEnvironments) {
            this.backendEnvironments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of backend environments for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backendEnvironments <p>
     *            The list of backend environments for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBackendEnvironmentsResult withBackendEnvironments(
            java.util.Collection<BackendEnvironment> backendEnvironments) {
        setBackendEnvironments(backendEnvironments);
        return this;
    }

    /**
     * <p>
     * A pagination token. If a non-null pagination token is returned in a
     * result, pass its value in another request to retrieve more entries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @return <p>
     *         A pagination token. If a non-null pagination token is returned in
     *         a result, pass its value in another request to retrieve more
     *         entries.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token. If a non-null pagination token is returned in a
     * result, pass its value in another request to retrieve more entries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param nextToken <p>
     *            A pagination token. If a non-null pagination token is returned
     *            in a result, pass its value in another request to retrieve
     *            more entries.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token. If a non-null pagination token is returned in a
     * result, pass its value in another request to retrieve more entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param nextToken <p>
     *            A pagination token. If a non-null pagination token is returned
     *            in a result, pass its value in another request to retrieve
     *            more entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBackendEnvironmentsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getBackendEnvironments() != null)
            sb.append("backendEnvironments: " + getBackendEnvironments() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackendEnvironments() == null) ? 0 : getBackendEnvironments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBackendEnvironmentsResult == false)
            return false;
        ListBackendEnvironmentsResult other = (ListBackendEnvironmentsResult) obj;

        if (other.getBackendEnvironments() == null ^ this.getBackendEnvironments() == null)
            return false;
        if (other.getBackendEnvironments() != null
                && other.getBackendEnvironments().equals(this.getBackendEnvironments()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

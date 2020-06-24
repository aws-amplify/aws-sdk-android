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
 * The result structure for the list branches request.
 * </p>
 */
public class ListBranchesResult implements Serializable {
    /**
     * <p>
     * A list of branches for an Amplify app.
     * </p>
     */
    private java.util.List<Branch> branches;

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
     * A list of branches for an Amplify app.
     * </p>
     *
     * @return <p>
     *         A list of branches for an Amplify app.
     *         </p>
     */
    public java.util.List<Branch> getBranches() {
        return branches;
    }

    /**
     * <p>
     * A list of branches for an Amplify app.
     * </p>
     *
     * @param branches <p>
     *            A list of branches for an Amplify app.
     *            </p>
     */
    public void setBranches(java.util.Collection<Branch> branches) {
        if (branches == null) {
            this.branches = null;
            return;
        }

        this.branches = new java.util.ArrayList<Branch>(branches);
    }

    /**
     * <p>
     * A list of branches for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param branches <p>
     *            A list of branches for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBranchesResult withBranches(Branch... branches) {
        if (getBranches() == null) {
            this.branches = new java.util.ArrayList<Branch>(branches.length);
        }
        for (Branch value : branches) {
            this.branches.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of branches for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param branches <p>
     *            A list of branches for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBranchesResult withBranches(java.util.Collection<Branch> branches) {
        setBranches(branches);
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
    public ListBranchesResult withNextToken(String nextToken) {
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
        if (getBranches() != null)
            sb.append("branches: " + getBranches() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranches() == null) ? 0 : getBranches().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBranchesResult == false)
            return false;
        ListBranchesResult other = (ListBranchesResult) obj;

        if (other.getBranches() == null ^ this.getBranches() == null)
            return false;
        if (other.getBranches() != null && other.getBranches().equals(this.getBranches()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

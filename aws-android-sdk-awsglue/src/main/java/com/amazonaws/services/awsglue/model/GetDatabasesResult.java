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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

public class GetDatabasesResult implements Serializable {
    /**
     * <p>
     * A list of <code>Database</code> objects from the specified catalog.
     * </p>
     */
    private java.util.List<Database> databaseList;

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned
     * if the current segment of the list is not the last.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>Database</code> objects from the specified catalog.
     * </p>
     *
     * @return <p>
     *         A list of <code>Database</code> objects from the specified
     *         catalog.
     *         </p>
     */
    public java.util.List<Database> getDatabaseList() {
        return databaseList;
    }

    /**
     * <p>
     * A list of <code>Database</code> objects from the specified catalog.
     * </p>
     *
     * @param databaseList <p>
     *            A list of <code>Database</code> objects from the specified
     *            catalog.
     *            </p>
     */
    public void setDatabaseList(java.util.Collection<Database> databaseList) {
        if (databaseList == null) {
            this.databaseList = null;
            return;
        }

        this.databaseList = new java.util.ArrayList<Database>(databaseList);
    }

    /**
     * <p>
     * A list of <code>Database</code> objects from the specified catalog.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseList <p>
     *            A list of <code>Database</code> objects from the specified
     *            catalog.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDatabasesResult withDatabaseList(Database... databaseList) {
        if (getDatabaseList() == null) {
            this.databaseList = new java.util.ArrayList<Database>(databaseList.length);
        }
        for (Database value : databaseList) {
            this.databaseList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>Database</code> objects from the specified catalog.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseList <p>
     *            A list of <code>Database</code> objects from the specified
     *            catalog.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDatabasesResult withDatabaseList(java.util.Collection<Database> databaseList) {
        setDatabaseList(databaseList);
        return this;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned
     * if the current segment of the list is not the last.
     * </p>
     *
     * @return <p>
     *         A continuation token for paginating the returned list of tokens,
     *         returned if the current segment of the list is not the last.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned
     * if the current segment of the list is not the last.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token for paginating the returned list of
     *            tokens, returned if the current segment of the list is not the
     *            last.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned
     * if the current segment of the list is not the last.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token for paginating the returned list of
     *            tokens, returned if the current segment of the list is not the
     *            last.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDatabasesResult withNextToken(String nextToken) {
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
        if (getDatabaseList() != null)
            sb.append("DatabaseList: " + getDatabaseList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDatabaseList() == null) ? 0 : getDatabaseList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDatabasesResult == false)
            return false;
        GetDatabasesResult other = (GetDatabasesResult) obj;

        if (other.getDatabaseList() == null ^ this.getDatabaseList() == null)
            return false;
        if (other.getDatabaseList() != null
                && other.getDatabaseList().equals(this.getDatabaseList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

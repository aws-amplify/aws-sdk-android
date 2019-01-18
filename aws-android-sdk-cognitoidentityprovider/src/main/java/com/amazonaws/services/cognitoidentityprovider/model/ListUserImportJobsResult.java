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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the response from the server to the request to list the user
 * import jobs.
 * </p>
 */
public class ListUserImportJobsResult implements Serializable {
    /**
     * <p>
     * The user import jobs.
     * </p>
     */
    private java.util.List<UserImportJobType> userImportJobs;

    /**
     * <p>
     * An identifier that can be used to return the next set of user import jobs
     * in the list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String paginationToken;

    /**
     * <p>
     * The user import jobs.
     * </p>
     *
     * @return <p>
     *         The user import jobs.
     *         </p>
     */
    public java.util.List<UserImportJobType> getUserImportJobs() {
        return userImportJobs;
    }

    /**
     * <p>
     * The user import jobs.
     * </p>
     *
     * @param userImportJobs <p>
     *            The user import jobs.
     *            </p>
     */
    public void setUserImportJobs(java.util.Collection<UserImportJobType> userImportJobs) {
        if (userImportJobs == null) {
            this.userImportJobs = null;
            return;
        }

        this.userImportJobs = new java.util.ArrayList<UserImportJobType>(userImportJobs);
    }

    /**
     * <p>
     * The user import jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userImportJobs <p>
     *            The user import jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUserImportJobsResult withUserImportJobs(UserImportJobType... userImportJobs) {
        if (getUserImportJobs() == null) {
            this.userImportJobs = new java.util.ArrayList<UserImportJobType>(userImportJobs.length);
        }
        for (UserImportJobType value : userImportJobs) {
            this.userImportJobs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The user import jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userImportJobs <p>
     *            The user import jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUserImportJobsResult withUserImportJobs(
            java.util.Collection<UserImportJobType> userImportJobs) {
        setUserImportJobs(userImportJobs);
        return this;
    }

    /**
     * <p>
     * An identifier that can be used to return the next set of user import jobs
     * in the list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return <p>
     *         An identifier that can be used to return the next set of user
     *         import jobs in the list.
     *         </p>
     */
    public String getPaginationToken() {
        return paginationToken;
    }

    /**
     * <p>
     * An identifier that can be used to return the next set of user import jobs
     * in the list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param paginationToken <p>
     *            An identifier that can be used to return the next set of user
     *            import jobs in the list.
     *            </p>
     */
    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * An identifier that can be used to return the next set of user import jobs
     * in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param paginationToken <p>
     *            An identifier that can be used to return the next set of user
     *            import jobs in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUserImportJobsResult withPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
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
        if (getUserImportJobs() != null)
            sb.append("UserImportJobs: " + getUserImportJobs() + ",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: " + getPaginationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserImportJobs() == null) ? 0 : getUserImportJobs().hashCode());
        hashCode = prime * hashCode
                + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUserImportJobsResult == false)
            return false;
        ListUserImportJobsResult other = (ListUserImportJobsResult) obj;

        if (other.getUserImportJobs() == null ^ this.getUserImportJobs() == null)
            return false;
        if (other.getUserImportJobs() != null
                && other.getUserImportJobs().equals(this.getUserImportJobs()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null
                && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        return true;
    }
}

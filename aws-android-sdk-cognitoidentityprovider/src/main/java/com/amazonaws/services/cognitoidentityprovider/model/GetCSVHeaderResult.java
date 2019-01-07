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
 * Represents the response from the server to the request to get the header
 * information for the .csv file for the user import job.
 * </p>
 */
public class GetCSVHeaderResult implements Serializable {
    /**
     * <p>
     * The user pool ID for the user pool that the users are to be imported
     * into.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The header information for the .csv file for the user import job.
     * </p>
     */
    private java.util.List<String> cSVHeader;

    /**
     * <p>
     * The user pool ID for the user pool that the users are to be imported
     * into.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID for the user pool that the users are to be
     *         imported into.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool that the users are to be imported
     * into.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool that the users are to be
     *            imported into.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool that the users are to be imported
     * into.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool that the users are to be
     *            imported into.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCSVHeaderResult withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The header information for the .csv file for the user import job.
     * </p>
     *
     * @return <p>
     *         The header information for the .csv file for the user import job.
     *         </p>
     */
    public java.util.List<String> getCSVHeader() {
        return cSVHeader;
    }

    /**
     * <p>
     * The header information for the .csv file for the user import job.
     * </p>
     *
     * @param cSVHeader <p>
     *            The header information for the .csv file for the user import
     *            job.
     *            </p>
     */
    public void setCSVHeader(java.util.Collection<String> cSVHeader) {
        if (cSVHeader == null) {
            this.cSVHeader = null;
            return;
        }

        this.cSVHeader = new java.util.ArrayList<String>(cSVHeader);
    }

    /**
     * <p>
     * The header information for the .csv file for the user import job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cSVHeader <p>
     *            The header information for the .csv file for the user import
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCSVHeaderResult withCSVHeader(String... cSVHeader) {
        if (getCSVHeader() == null) {
            this.cSVHeader = new java.util.ArrayList<String>(cSVHeader.length);
        }
        for (String value : cSVHeader) {
            this.cSVHeader.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The header information for the .csv file for the user import job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cSVHeader <p>
     *            The header information for the .csv file for the user import
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCSVHeaderResult withCSVHeader(java.util.Collection<String> cSVHeader) {
        setCSVHeader(cSVHeader);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getCSVHeader() != null)
            sb.append("CSVHeader: " + getCSVHeader());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getCSVHeader() == null) ? 0 : getCSVHeader().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCSVHeaderResult == false)
            return false;
        GetCSVHeaderResult other = (GetCSVHeaderResult) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getCSVHeader() == null ^ this.getCSVHeader() == null)
            return false;
        if (other.getCSVHeader() != null
                && other.getCSVHeader().equals(this.getCSVHeader()) == false)
            return false;
        return true;
    }
}

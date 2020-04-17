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

package com.amazonaws.services.awsopsworkscm.model;

import java.io.Serializable;

public class DescribeBackupsResult implements Serializable {
    /**
     * <p>
     * Contains the response to a <code>DescribeBackups</code> request.
     * </p>
     */
    private java.util.List<Backup> backups;

    /**
     * <p>
     * This is not currently implemented for <code>DescribeBackups</code>
     * requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Contains the response to a <code>DescribeBackups</code> request.
     * </p>
     *
     * @return <p>
     *         Contains the response to a <code>DescribeBackups</code> request.
     *         </p>
     */
    public java.util.List<Backup> getBackups() {
        return backups;
    }

    /**
     * <p>
     * Contains the response to a <code>DescribeBackups</code> request.
     * </p>
     *
     * @param backups <p>
     *            Contains the response to a <code>DescribeBackups</code>
     *            request.
     *            </p>
     */
    public void setBackups(java.util.Collection<Backup> backups) {
        if (backups == null) {
            this.backups = null;
            return;
        }

        this.backups = new java.util.ArrayList<Backup>(backups);
    }

    /**
     * <p>
     * Contains the response to a <code>DescribeBackups</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backups <p>
     *            Contains the response to a <code>DescribeBackups</code>
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBackupsResult withBackups(Backup... backups) {
        if (getBackups() == null) {
            this.backups = new java.util.ArrayList<Backup>(backups.length);
        }
        for (Backup value : backups) {
            this.backups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains the response to a <code>DescribeBackups</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backups <p>
     *            Contains the response to a <code>DescribeBackups</code>
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBackupsResult withBackups(java.util.Collection<Backup> backups) {
        setBackups(backups);
        return this;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeBackups</code>
     * requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         This is not currently implemented for
     *         <code>DescribeBackups</code> requests.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeBackups</code>
     * requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param nextToken <p>
     *            This is not currently implemented for
     *            <code>DescribeBackups</code> requests.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeBackups</code>
     * requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param nextToken <p>
     *            This is not currently implemented for
     *            <code>DescribeBackups</code> requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBackupsResult withNextToken(String nextToken) {
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
        if (getBackups() != null)
            sb.append("Backups: " + getBackups() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackups() == null) ? 0 : getBackups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBackupsResult == false)
            return false;
        DescribeBackupsResult other = (DescribeBackupsResult) obj;

        if (other.getBackups() == null ^ this.getBackups() == null)
            return false;
        if (other.getBackups() != null && other.getBackups().equals(this.getBackups()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

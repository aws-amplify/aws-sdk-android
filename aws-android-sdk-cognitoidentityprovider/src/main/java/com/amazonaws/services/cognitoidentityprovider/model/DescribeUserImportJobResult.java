/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class DescribeUserImportJobResult implements Serializable {
    /**
     * The new value for the userImportJob property for this object.
     */
    private UserImportJobType userImportJob;

    /**
     * Returns the value of the userImportJob property for this object.
     *
     * @return The value of the userImportJob property for this object.
     */
    public UserImportJobType getUserImportJob() {
        return userImportJob;
    }

    /**
     * Sets the value of userImportJob
     *
     * @param userImportJob The new value for the userImportJob property for
     *            this object.
     */
    public void setUserImportJob(UserImportJobType userImportJob) {
        this.userImportJob = userImportJob;
    }

    /**
     * Sets the value of the userImportJob property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userImportJob The new value for the userImportJob property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserImportJobResult withUserImportJob(UserImportJobType userImportJob) {
        this.userImportJob = userImportJob;
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
        if (getUserImportJob() != null)
            sb.append("UserImportJob: " + getUserImportJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserImportJob() == null) ? 0 : getUserImportJob().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUserImportJobResult == false)
            return false;
        DescribeUserImportJobResult other = (DescribeUserImportJobResult) obj;

        if (other.getUserImportJob() == null ^ this.getUserImportJob() == null)
            return false;
        if (other.getUserImportJob() != null
                && other.getUserImportJob().equals(this.getUserImportJob()) == false)
            return false;
        return true;
    }
}

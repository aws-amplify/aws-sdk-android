/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the response from the server to the request to stop the user
 * import job.
 * </p>
 */
public class StopUserImportJobResult implements Serializable {
    /**
     * <p>
     * The job object that represents the user import job.
     * </p>
     */
    private UserImportJobType userImportJob;

    /**
     * <p>
     * The job object that represents the user import job.
     * </p>
     *
     * @return <p>
     *         The job object that represents the user import job.
     *         </p>
     */
    public UserImportJobType getUserImportJob() {
        return userImportJob;
    }

    /**
     * <p>
     * The job object that represents the user import job.
     * </p>
     *
     * @param userImportJob <p>
     *            The job object that represents the user import job.
     *            </p>
     */
    public void setUserImportJob(UserImportJobType userImportJob) {
        this.userImportJob = userImportJob;
    }

    /**
     * <p>
     * The job object that represents the user import job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userImportJob <p>
     *            The job object that represents the user import job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopUserImportJobResult withUserImportJob(UserImportJobType userImportJob) {
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

        if (obj instanceof StopUserImportJobResult == false)
            return false;
        StopUserImportJobResult other = (StopUserImportJobResult) obj;

        if (other.getUserImportJob() == null ^ this.getUserImportJob() == null)
            return false;
        if (other.getUserImportJob() != null
                && other.getUserImportJob().equals(this.getUserImportJob()) == false)
            return false;
        return true;
    }
}

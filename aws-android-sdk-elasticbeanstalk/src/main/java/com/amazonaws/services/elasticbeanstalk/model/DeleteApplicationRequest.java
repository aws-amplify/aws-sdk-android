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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes the specified application along with all associated versions and
 * configurations. The application versions will not be deleted from your Amazon
 * S3 bucket.
 * </p>
 * <note>
 * <p>
 * You cannot delete an application that has a running environment.
 * </p>
 * </note>
 */
public class DeleteApplicationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the application to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * When set to true, running environments will be terminated before deleting
     * the application.
     * </p>
     */
    private Boolean terminateEnvByForce;

    /**
     * <p>
     * The name of the application to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the application to delete.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of the application to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application to delete.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteApplicationRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * When set to true, running environments will be terminated before deleting
     * the application.
     * </p>
     *
     * @return <p>
     *         When set to true, running environments will be terminated before
     *         deleting the application.
     *         </p>
     */
    public Boolean isTerminateEnvByForce() {
        return terminateEnvByForce;
    }

    /**
     * <p>
     * When set to true, running environments will be terminated before deleting
     * the application.
     * </p>
     *
     * @return <p>
     *         When set to true, running environments will be terminated before
     *         deleting the application.
     *         </p>
     */
    public Boolean getTerminateEnvByForce() {
        return terminateEnvByForce;
    }

    /**
     * <p>
     * When set to true, running environments will be terminated before deleting
     * the application.
     * </p>
     *
     * @param terminateEnvByForce <p>
     *            When set to true, running environments will be terminated
     *            before deleting the application.
     *            </p>
     */
    public void setTerminateEnvByForce(Boolean terminateEnvByForce) {
        this.terminateEnvByForce = terminateEnvByForce;
    }

    /**
     * <p>
     * When set to true, running environments will be terminated before deleting
     * the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminateEnvByForce <p>
     *            When set to true, running environments will be terminated
     *            before deleting the application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteApplicationRequest withTerminateEnvByForce(Boolean terminateEnvByForce) {
        this.terminateEnvByForce = terminateEnvByForce;
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getTerminateEnvByForce() != null)
            sb.append("TerminateEnvByForce: " + getTerminateEnvByForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode
                + ((getTerminateEnvByForce() == null) ? 0 : getTerminateEnvByForce().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApplicationRequest == false)
            return false;
        DeleteApplicationRequest other = (DeleteApplicationRequest) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getTerminateEnvByForce() == null ^ this.getTerminateEnvByForce() == null)
            return false;
        if (other.getTerminateEnvByForce() != null
                && other.getTerminateEnvByForce().equals(this.getTerminateEnvByForce()) == false)
            return false;
        return true;
    }
}

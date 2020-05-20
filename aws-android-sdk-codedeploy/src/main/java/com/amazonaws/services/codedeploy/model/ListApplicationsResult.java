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
 * Represents the output of a ListApplications operation.
 * </p>
 */
public class ListApplicationsResult implements Serializable {
    /**
     * <p>
     * A list of application names.
     * </p>
     */
    private java.util.List<String> applications;

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent list applications call to return
     * the next set of applications in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of application names.
     * </p>
     *
     * @return <p>
     *         A list of application names.
     *         </p>
     */
    public java.util.List<String> getApplications() {
        return applications;
    }

    /**
     * <p>
     * A list of application names.
     * </p>
     *
     * @param applications <p>
     *            A list of application names.
     *            </p>
     */
    public void setApplications(java.util.Collection<String> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }

        this.applications = new java.util.ArrayList<String>(applications);
    }

    /**
     * <p>
     * A list of application names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applications <p>
     *            A list of application names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListApplicationsResult withApplications(String... applications) {
        if (getApplications() == null) {
            this.applications = new java.util.ArrayList<String>(applications.length);
        }
        for (String value : applications) {
            this.applications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of application names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applications <p>
     *            A list of application names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListApplicationsResult withApplications(java.util.Collection<String> applications) {
        setApplications(applications);
        return this;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent list applications call to return
     * the next set of applications in the list.
     * </p>
     *
     * @return <p>
     *         If a large amount of information is returned, an identifier is
     *         also returned. It can be used in a subsequent list applications
     *         call to return the next set of applications in the list.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent list applications call to return
     * the next set of applications in the list.
     * </p>
     *
     * @param nextToken <p>
     *            If a large amount of information is returned, an identifier is
     *            also returned. It can be used in a subsequent list
     *            applications call to return the next set of applications in
     *            the list.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent list applications call to return
     * the next set of applications in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If a large amount of information is returned, an identifier is
     *            also returned. It can be used in a subsequent list
     *            applications call to return the next set of applications in
     *            the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListApplicationsResult withNextToken(String nextToken) {
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
        if (getApplications() != null)
            sb.append("applications: " + getApplications() + ",");
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
                + ((getApplications() == null) ? 0 : getApplications().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListApplicationsResult == false)
            return false;
        ListApplicationsResult other = (ListApplicationsResult) obj;

        if (other.getApplications() == null ^ this.getApplications() == null)
            return false;
        if (other.getApplications() != null
                && other.getApplications().equals(this.getApplications()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

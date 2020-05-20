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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets information about one or more application revisions. The maximum number
 * of application revisions that can be returned is 25.
 * </p>
 */
public class BatchGetApplicationRevisionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of an AWS CodeDeploy application about which to get revision
     * information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * An array of <code>RevisionLocation</code> objects that specify
     * information to get about the application revisions, including type and
     * location. The maximum number of <code>RevisionLocation</code> objects you
     * can specify is 25.
     * </p>
     */
    private java.util.List<RevisionLocation> revisions;

    /**
     * <p>
     * The name of an AWS CodeDeploy application about which to get revision
     * information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of an AWS CodeDeploy application about which to get
     *         revision information.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application about which to get revision
     * information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of an AWS CodeDeploy application about which to get
     *            revision information.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application about which to get revision
     * information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of an AWS CodeDeploy application about which to get
     *            revision information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetApplicationRevisionsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * An array of <code>RevisionLocation</code> objects that specify
     * information to get about the application revisions, including type and
     * location. The maximum number of <code>RevisionLocation</code> objects you
     * can specify is 25.
     * </p>
     *
     * @return <p>
     *         An array of <code>RevisionLocation</code> objects that specify
     *         information to get about the application revisions, including
     *         type and location. The maximum number of
     *         <code>RevisionLocation</code> objects you can specify is 25.
     *         </p>
     */
    public java.util.List<RevisionLocation> getRevisions() {
        return revisions;
    }

    /**
     * <p>
     * An array of <code>RevisionLocation</code> objects that specify
     * information to get about the application revisions, including type and
     * location. The maximum number of <code>RevisionLocation</code> objects you
     * can specify is 25.
     * </p>
     *
     * @param revisions <p>
     *            An array of <code>RevisionLocation</code> objects that specify
     *            information to get about the application revisions, including
     *            type and location. The maximum number of
     *            <code>RevisionLocation</code> objects you can specify is 25.
     *            </p>
     */
    public void setRevisions(java.util.Collection<RevisionLocation> revisions) {
        if (revisions == null) {
            this.revisions = null;
            return;
        }

        this.revisions = new java.util.ArrayList<RevisionLocation>(revisions);
    }

    /**
     * <p>
     * An array of <code>RevisionLocation</code> objects that specify
     * information to get about the application revisions, including type and
     * location. The maximum number of <code>RevisionLocation</code> objects you
     * can specify is 25.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisions <p>
     *            An array of <code>RevisionLocation</code> objects that specify
     *            information to get about the application revisions, including
     *            type and location. The maximum number of
     *            <code>RevisionLocation</code> objects you can specify is 25.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetApplicationRevisionsRequest withRevisions(RevisionLocation... revisions) {
        if (getRevisions() == null) {
            this.revisions = new java.util.ArrayList<RevisionLocation>(revisions.length);
        }
        for (RevisionLocation value : revisions) {
            this.revisions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>RevisionLocation</code> objects that specify
     * information to get about the application revisions, including type and
     * location. The maximum number of <code>RevisionLocation</code> objects you
     * can specify is 25.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisions <p>
     *            An array of <code>RevisionLocation</code> objects that specify
     *            information to get about the application revisions, including
     *            type and location. The maximum number of
     *            <code>RevisionLocation</code> objects you can specify is 25.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetApplicationRevisionsRequest withRevisions(
            java.util.Collection<RevisionLocation> revisions) {
        setRevisions(revisions);
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
            sb.append("applicationName: " + getApplicationName() + ",");
        if (getRevisions() != null)
            sb.append("revisions: " + getRevisions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getRevisions() == null) ? 0 : getRevisions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetApplicationRevisionsRequest == false)
            return false;
        BatchGetApplicationRevisionsRequest other = (BatchGetApplicationRevisionsRequest) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getRevisions() == null ^ this.getRevisions() == null)
            return false;
        if (other.getRevisions() != null
                && other.getRevisions().equals(this.getRevisions()) == false)
            return false;
        return true;
    }
}

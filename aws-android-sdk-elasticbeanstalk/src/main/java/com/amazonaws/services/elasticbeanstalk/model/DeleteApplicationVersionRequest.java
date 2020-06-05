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
 * Deletes the specified version from the specified application.
 * </p>
 * <note>
 * <p>
 * You cannot delete an application version that is associated with a running
 * environment.
 * </p>
 * </note>
 */
public class DeleteApplicationVersionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the application to which the version belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The label of the version to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * <p>
     * Set to <code>true</code> to delete the source bundle from your storage
     * bucket. Otherwise, the application version is deleted only from Elastic
     * Beanstalk and the source bundle remains in Amazon S3.
     * </p>
     */
    private Boolean deleteSourceBundle;

    /**
     * <p>
     * The name of the application to which the version belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the application to which the version belongs.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of the application to which the version belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application to which the version belongs.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application to which the version belongs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application to which the version belongs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteApplicationVersionRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The label of the version to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The label of the version to delete.
     *         </p>
     */
    public String getVersionLabel() {
        return versionLabel;
    }

    /**
     * <p>
     * The label of the version to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel <p>
     *            The label of the version to delete.
     *            </p>
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * The label of the version to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel <p>
     *            The label of the version to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteApplicationVersionRequest withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete the source bundle from your storage
     * bucket. Otherwise, the application version is deleted only from Elastic
     * Beanstalk and the source bundle remains in Amazon S3.
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to delete the source bundle from your
     *         storage bucket. Otherwise, the application version is deleted
     *         only from Elastic Beanstalk and the source bundle remains in
     *         Amazon S3.
     *         </p>
     */
    public Boolean isDeleteSourceBundle() {
        return deleteSourceBundle;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete the source bundle from your storage
     * bucket. Otherwise, the application version is deleted only from Elastic
     * Beanstalk and the source bundle remains in Amazon S3.
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to delete the source bundle from your
     *         storage bucket. Otherwise, the application version is deleted
     *         only from Elastic Beanstalk and the source bundle remains in
     *         Amazon S3.
     *         </p>
     */
    public Boolean getDeleteSourceBundle() {
        return deleteSourceBundle;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete the source bundle from your storage
     * bucket. Otherwise, the application version is deleted only from Elastic
     * Beanstalk and the source bundle remains in Amazon S3.
     * </p>
     *
     * @param deleteSourceBundle <p>
     *            Set to <code>true</code> to delete the source bundle from your
     *            storage bucket. Otherwise, the application version is deleted
     *            only from Elastic Beanstalk and the source bundle remains in
     *            Amazon S3.
     *            </p>
     */
    public void setDeleteSourceBundle(Boolean deleteSourceBundle) {
        this.deleteSourceBundle = deleteSourceBundle;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete the source bundle from your storage
     * bucket. Otherwise, the application version is deleted only from Elastic
     * Beanstalk and the source bundle remains in Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteSourceBundle <p>
     *            Set to <code>true</code> to delete the source bundle from your
     *            storage bucket. Otherwise, the application version is deleted
     *            only from Elastic Beanstalk and the source bundle remains in
     *            Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteApplicationVersionRequest withDeleteSourceBundle(Boolean deleteSourceBundle) {
        this.deleteSourceBundle = deleteSourceBundle;
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
        if (getVersionLabel() != null)
            sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getDeleteSourceBundle() != null)
            sb.append("DeleteSourceBundle: " + getDeleteSourceBundle());
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
                + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime * hashCode
                + ((getDeleteSourceBundle() == null) ? 0 : getDeleteSourceBundle().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApplicationVersionRequest == false)
            return false;
        DeleteApplicationVersionRequest other = (DeleteApplicationVersionRequest) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null
                && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        if (other.getDeleteSourceBundle() == null ^ this.getDeleteSourceBundle() == null)
            return false;
        if (other.getDeleteSourceBundle() != null
                && other.getDeleteSourceBundle().equals(this.getDeleteSourceBundle()) == false)
            return false;
        return true;
    }
}

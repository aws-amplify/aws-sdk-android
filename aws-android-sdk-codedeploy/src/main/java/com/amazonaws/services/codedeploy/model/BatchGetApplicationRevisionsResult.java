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
 * Represents the output of a <code>BatchGetApplicationRevisions</code>
 * operation.
 * </p>
 */
public class BatchGetApplicationRevisionsResult implements Serializable {
    /**
     * <p>
     * The name of the application that corresponds to the revisions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * Information about errors that might have occurred during the API call.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * Additional information about the revisions, including the type and
     * location.
     * </p>
     */
    private java.util.List<RevisionInfo> revisions;

    /**
     * <p>
     * The name of the application that corresponds to the revisions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the application that corresponds to the revisions.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of the application that corresponds to the revisions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application that corresponds to the revisions.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application that corresponds to the revisions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application that corresponds to the revisions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetApplicationRevisionsResult withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * Information about errors that might have occurred during the API call.
     * </p>
     *
     * @return <p>
     *         Information about errors that might have occurred during the API
     *         call.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * Information about errors that might have occurred during the API call.
     * </p>
     *
     * @param errorMessage <p>
     *            Information about errors that might have occurred during the
     *            API call.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Information about errors that might have occurred during the API call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage <p>
     *            Information about errors that might have occurred during the
     *            API call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetApplicationRevisionsResult withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * <p>
     * Additional information about the revisions, including the type and
     * location.
     * </p>
     *
     * @return <p>
     *         Additional information about the revisions, including the type
     *         and location.
     *         </p>
     */
    public java.util.List<RevisionInfo> getRevisions() {
        return revisions;
    }

    /**
     * <p>
     * Additional information about the revisions, including the type and
     * location.
     * </p>
     *
     * @param revisions <p>
     *            Additional information about the revisions, including the type
     *            and location.
     *            </p>
     */
    public void setRevisions(java.util.Collection<RevisionInfo> revisions) {
        if (revisions == null) {
            this.revisions = null;
            return;
        }

        this.revisions = new java.util.ArrayList<RevisionInfo>(revisions);
    }

    /**
     * <p>
     * Additional information about the revisions, including the type and
     * location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisions <p>
     *            Additional information about the revisions, including the type
     *            and location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetApplicationRevisionsResult withRevisions(RevisionInfo... revisions) {
        if (getRevisions() == null) {
            this.revisions = new java.util.ArrayList<RevisionInfo>(revisions.length);
        }
        for (RevisionInfo value : revisions) {
            this.revisions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Additional information about the revisions, including the type and
     * location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisions <p>
     *            Additional information about the revisions, including the type
     *            and location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetApplicationRevisionsResult withRevisions(
            java.util.Collection<RevisionInfo> revisions) {
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
        if (getErrorMessage() != null)
            sb.append("errorMessage: " + getErrorMessage() + ",");
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
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getRevisions() == null) ? 0 : getRevisions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetApplicationRevisionsResult == false)
            return false;
        BatchGetApplicationRevisionsResult other = (BatchGetApplicationRevisionsResult) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getRevisions() == null ^ this.getRevisions() == null)
            return false;
        if (other.getRevisions() != null
                && other.getRevisions().equals(this.getRevisions()) == false)
            return false;
        return true;
    }
}

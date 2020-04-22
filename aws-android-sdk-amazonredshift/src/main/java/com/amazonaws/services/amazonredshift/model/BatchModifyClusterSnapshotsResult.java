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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

public class BatchModifyClusterSnapshotsResult implements Serializable {
    /**
     * <p>
     * A list of the snapshots that were modified.
     * </p>
     */
    private java.util.List<String> resources;

    /**
     * <p>
     * A list of any errors returned.
     * </p>
     */
    private java.util.List<SnapshotErrorMessage> errors;

    /**
     * <p>
     * A list of the snapshots that were modified.
     * </p>
     *
     * @return <p>
     *         A list of the snapshots that were modified.
     *         </p>
     */
    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * <p>
     * A list of the snapshots that were modified.
     * </p>
     *
     * @param resources <p>
     *            A list of the snapshots that were modified.
     *            </p>
     */
    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<String>(resources);
    }

    /**
     * <p>
     * A list of the snapshots that were modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            A list of the snapshots that were modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchModifyClusterSnapshotsResult withResources(String... resources) {
        if (getResources() == null) {
            this.resources = new java.util.ArrayList<String>(resources.length);
        }
        for (String value : resources) {
            this.resources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the snapshots that were modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            A list of the snapshots that were modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchModifyClusterSnapshotsResult withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * A list of any errors returned.
     * </p>
     *
     * @return <p>
     *         A list of any errors returned.
     *         </p>
     */
    public java.util.List<SnapshotErrorMessage> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of any errors returned.
     * </p>
     *
     * @param errors <p>
     *            A list of any errors returned.
     *            </p>
     */
    public void setErrors(java.util.Collection<SnapshotErrorMessage> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<SnapshotErrorMessage>(errors);
    }

    /**
     * <p>
     * A list of any errors returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            A list of any errors returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchModifyClusterSnapshotsResult withErrors(SnapshotErrorMessage... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<SnapshotErrorMessage>(errors.length);
        }
        for (SnapshotErrorMessage value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of any errors returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            A list of any errors returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchModifyClusterSnapshotsResult withErrors(
            java.util.Collection<SnapshotErrorMessage> errors) {
        setErrors(errors);
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
        if (getResources() != null)
            sb.append("Resources: " + getResources() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchModifyClusterSnapshotsResult == false)
            return false;
        BatchModifyClusterSnapshotsResult other = (BatchModifyClusterSnapshotsResult) obj;

        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null
                && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}

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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

public class BatchDeleteBuildsResult implements Serializable {
    /**
     * <p>
     * The IDs of the builds that were successfully deleted.
     * </p>
     */
    private java.util.List<String> buildsDeleted;

    /**
     * <p>
     * Information about any builds that could not be successfully deleted.
     * </p>
     */
    private java.util.List<BuildNotDeleted> buildsNotDeleted;

    /**
     * <p>
     * The IDs of the builds that were successfully deleted.
     * </p>
     *
     * @return <p>
     *         The IDs of the builds that were successfully deleted.
     *         </p>
     */
    public java.util.List<String> getBuildsDeleted() {
        return buildsDeleted;
    }

    /**
     * <p>
     * The IDs of the builds that were successfully deleted.
     * </p>
     *
     * @param buildsDeleted <p>
     *            The IDs of the builds that were successfully deleted.
     *            </p>
     */
    public void setBuildsDeleted(java.util.Collection<String> buildsDeleted) {
        if (buildsDeleted == null) {
            this.buildsDeleted = null;
            return;
        }

        this.buildsDeleted = new java.util.ArrayList<String>(buildsDeleted);
    }

    /**
     * <p>
     * The IDs of the builds that were successfully deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buildsDeleted <p>
     *            The IDs of the builds that were successfully deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteBuildsResult withBuildsDeleted(String... buildsDeleted) {
        if (getBuildsDeleted() == null) {
            this.buildsDeleted = new java.util.ArrayList<String>(buildsDeleted.length);
        }
        for (String value : buildsDeleted) {
            this.buildsDeleted.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the builds that were successfully deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buildsDeleted <p>
     *            The IDs of the builds that were successfully deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteBuildsResult withBuildsDeleted(java.util.Collection<String> buildsDeleted) {
        setBuildsDeleted(buildsDeleted);
        return this;
    }

    /**
     * <p>
     * Information about any builds that could not be successfully deleted.
     * </p>
     *
     * @return <p>
     *         Information about any builds that could not be successfully
     *         deleted.
     *         </p>
     */
    public java.util.List<BuildNotDeleted> getBuildsNotDeleted() {
        return buildsNotDeleted;
    }

    /**
     * <p>
     * Information about any builds that could not be successfully deleted.
     * </p>
     *
     * @param buildsNotDeleted <p>
     *            Information about any builds that could not be successfully
     *            deleted.
     *            </p>
     */
    public void setBuildsNotDeleted(java.util.Collection<BuildNotDeleted> buildsNotDeleted) {
        if (buildsNotDeleted == null) {
            this.buildsNotDeleted = null;
            return;
        }

        this.buildsNotDeleted = new java.util.ArrayList<BuildNotDeleted>(buildsNotDeleted);
    }

    /**
     * <p>
     * Information about any builds that could not be successfully deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buildsNotDeleted <p>
     *            Information about any builds that could not be successfully
     *            deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteBuildsResult withBuildsNotDeleted(BuildNotDeleted... buildsNotDeleted) {
        if (getBuildsNotDeleted() == null) {
            this.buildsNotDeleted = new java.util.ArrayList<BuildNotDeleted>(
                    buildsNotDeleted.length);
        }
        for (BuildNotDeleted value : buildsNotDeleted) {
            this.buildsNotDeleted.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about any builds that could not be successfully deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buildsNotDeleted <p>
     *            Information about any builds that could not be successfully
     *            deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteBuildsResult withBuildsNotDeleted(
            java.util.Collection<BuildNotDeleted> buildsNotDeleted) {
        setBuildsNotDeleted(buildsNotDeleted);
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
        if (getBuildsDeleted() != null)
            sb.append("buildsDeleted: " + getBuildsDeleted() + ",");
        if (getBuildsNotDeleted() != null)
            sb.append("buildsNotDeleted: " + getBuildsNotDeleted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBuildsDeleted() == null) ? 0 : getBuildsDeleted().hashCode());
        hashCode = prime * hashCode
                + ((getBuildsNotDeleted() == null) ? 0 : getBuildsNotDeleted().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteBuildsResult == false)
            return false;
        BatchDeleteBuildsResult other = (BatchDeleteBuildsResult) obj;

        if (other.getBuildsDeleted() == null ^ this.getBuildsDeleted() == null)
            return false;
        if (other.getBuildsDeleted() != null
                && other.getBuildsDeleted().equals(this.getBuildsDeleted()) == false)
            return false;
        if (other.getBuildsNotDeleted() == null ^ this.getBuildsNotDeleted() == null)
            return false;
        if (other.getBuildsNotDeleted() != null
                && other.getBuildsNotDeleted().equals(this.getBuildsNotDeleted()) == false)
            return false;
        return true;
    }
}

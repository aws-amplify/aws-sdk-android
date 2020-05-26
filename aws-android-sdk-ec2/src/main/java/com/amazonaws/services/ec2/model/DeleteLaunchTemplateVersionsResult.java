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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class DeleteLaunchTemplateVersionsResult implements Serializable {
    /**
     * <p>
     * Information about the launch template versions that were successfully
     * deleted.
     * </p>
     */
    private java.util.List<DeleteLaunchTemplateVersionsResponseSuccessItem> successfullyDeletedLaunchTemplateVersions;

    /**
     * <p>
     * Information about the launch template versions that could not be deleted.
     * </p>
     */
    private java.util.List<DeleteLaunchTemplateVersionsResponseErrorItem> unsuccessfullyDeletedLaunchTemplateVersions;

    /**
     * <p>
     * Information about the launch template versions that were successfully
     * deleted.
     * </p>
     *
     * @return <p>
     *         Information about the launch template versions that were
     *         successfully deleted.
     *         </p>
     */
    public java.util.List<DeleteLaunchTemplateVersionsResponseSuccessItem> getSuccessfullyDeletedLaunchTemplateVersions() {
        return successfullyDeletedLaunchTemplateVersions;
    }

    /**
     * <p>
     * Information about the launch template versions that were successfully
     * deleted.
     * </p>
     *
     * @param successfullyDeletedLaunchTemplateVersions <p>
     *            Information about the launch template versions that were
     *            successfully deleted.
     *            </p>
     */
    public void setSuccessfullyDeletedLaunchTemplateVersions(
            java.util.Collection<DeleteLaunchTemplateVersionsResponseSuccessItem> successfullyDeletedLaunchTemplateVersions) {
        if (successfullyDeletedLaunchTemplateVersions == null) {
            this.successfullyDeletedLaunchTemplateVersions = null;
            return;
        }

        this.successfullyDeletedLaunchTemplateVersions = new java.util.ArrayList<DeleteLaunchTemplateVersionsResponseSuccessItem>(
                successfullyDeletedLaunchTemplateVersions);
    }

    /**
     * <p>
     * Information about the launch template versions that were successfully
     * deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfullyDeletedLaunchTemplateVersions <p>
     *            Information about the launch template versions that were
     *            successfully deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLaunchTemplateVersionsResult withSuccessfullyDeletedLaunchTemplateVersions(
            DeleteLaunchTemplateVersionsResponseSuccessItem... successfullyDeletedLaunchTemplateVersions) {
        if (getSuccessfullyDeletedLaunchTemplateVersions() == null) {
            this.successfullyDeletedLaunchTemplateVersions = new java.util.ArrayList<DeleteLaunchTemplateVersionsResponseSuccessItem>(
                    successfullyDeletedLaunchTemplateVersions.length);
        }
        for (DeleteLaunchTemplateVersionsResponseSuccessItem value : successfullyDeletedLaunchTemplateVersions) {
            this.successfullyDeletedLaunchTemplateVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the launch template versions that were successfully
     * deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfullyDeletedLaunchTemplateVersions <p>
     *            Information about the launch template versions that were
     *            successfully deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLaunchTemplateVersionsResult withSuccessfullyDeletedLaunchTemplateVersions(
            java.util.Collection<DeleteLaunchTemplateVersionsResponseSuccessItem> successfullyDeletedLaunchTemplateVersions) {
        setSuccessfullyDeletedLaunchTemplateVersions(successfullyDeletedLaunchTemplateVersions);
        return this;
    }

    /**
     * <p>
     * Information about the launch template versions that could not be deleted.
     * </p>
     *
     * @return <p>
     *         Information about the launch template versions that could not be
     *         deleted.
     *         </p>
     */
    public java.util.List<DeleteLaunchTemplateVersionsResponseErrorItem> getUnsuccessfullyDeletedLaunchTemplateVersions() {
        return unsuccessfullyDeletedLaunchTemplateVersions;
    }

    /**
     * <p>
     * Information about the launch template versions that could not be deleted.
     * </p>
     *
     * @param unsuccessfullyDeletedLaunchTemplateVersions <p>
     *            Information about the launch template versions that could not
     *            be deleted.
     *            </p>
     */
    public void setUnsuccessfullyDeletedLaunchTemplateVersions(
            java.util.Collection<DeleteLaunchTemplateVersionsResponseErrorItem> unsuccessfullyDeletedLaunchTemplateVersions) {
        if (unsuccessfullyDeletedLaunchTemplateVersions == null) {
            this.unsuccessfullyDeletedLaunchTemplateVersions = null;
            return;
        }

        this.unsuccessfullyDeletedLaunchTemplateVersions = new java.util.ArrayList<DeleteLaunchTemplateVersionsResponseErrorItem>(
                unsuccessfullyDeletedLaunchTemplateVersions);
    }

    /**
     * <p>
     * Information about the launch template versions that could not be deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessfullyDeletedLaunchTemplateVersions <p>
     *            Information about the launch template versions that could not
     *            be deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLaunchTemplateVersionsResult withUnsuccessfullyDeletedLaunchTemplateVersions(
            DeleteLaunchTemplateVersionsResponseErrorItem... unsuccessfullyDeletedLaunchTemplateVersions) {
        if (getUnsuccessfullyDeletedLaunchTemplateVersions() == null) {
            this.unsuccessfullyDeletedLaunchTemplateVersions = new java.util.ArrayList<DeleteLaunchTemplateVersionsResponseErrorItem>(
                    unsuccessfullyDeletedLaunchTemplateVersions.length);
        }
        for (DeleteLaunchTemplateVersionsResponseErrorItem value : unsuccessfullyDeletedLaunchTemplateVersions) {
            this.unsuccessfullyDeletedLaunchTemplateVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the launch template versions that could not be deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessfullyDeletedLaunchTemplateVersions <p>
     *            Information about the launch template versions that could not
     *            be deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLaunchTemplateVersionsResult withUnsuccessfullyDeletedLaunchTemplateVersions(
            java.util.Collection<DeleteLaunchTemplateVersionsResponseErrorItem> unsuccessfullyDeletedLaunchTemplateVersions) {
        setUnsuccessfullyDeletedLaunchTemplateVersions(unsuccessfullyDeletedLaunchTemplateVersions);
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
        if (getSuccessfullyDeletedLaunchTemplateVersions() != null)
            sb.append("SuccessfullyDeletedLaunchTemplateVersions: "
                    + getSuccessfullyDeletedLaunchTemplateVersions() + ",");
        if (getUnsuccessfullyDeletedLaunchTemplateVersions() != null)
            sb.append("UnsuccessfullyDeletedLaunchTemplateVersions: "
                    + getUnsuccessfullyDeletedLaunchTemplateVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSuccessfullyDeletedLaunchTemplateVersions() == null) ? 0
                        : getSuccessfullyDeletedLaunchTemplateVersions().hashCode());
        hashCode = prime
                * hashCode
                + ((getUnsuccessfullyDeletedLaunchTemplateVersions() == null) ? 0
                        : getUnsuccessfullyDeletedLaunchTemplateVersions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLaunchTemplateVersionsResult == false)
            return false;
        DeleteLaunchTemplateVersionsResult other = (DeleteLaunchTemplateVersionsResult) obj;

        if (other.getSuccessfullyDeletedLaunchTemplateVersions() == null
                ^ this.getSuccessfullyDeletedLaunchTemplateVersions() == null)
            return false;
        if (other.getSuccessfullyDeletedLaunchTemplateVersions() != null
                && other.getSuccessfullyDeletedLaunchTemplateVersions().equals(
                        this.getSuccessfullyDeletedLaunchTemplateVersions()) == false)
            return false;
        if (other.getUnsuccessfullyDeletedLaunchTemplateVersions() == null
                ^ this.getUnsuccessfullyDeletedLaunchTemplateVersions() == null)
            return false;
        if (other.getUnsuccessfullyDeletedLaunchTemplateVersions() != null
                && other.getUnsuccessfullyDeletedLaunchTemplateVersions().equals(
                        this.getUnsuccessfullyDeletedLaunchTemplateVersions()) == false)
            return false;
        return true;
    }
}

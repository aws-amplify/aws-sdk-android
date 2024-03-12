/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class BatchAssociateAnalyticsDataSetResult implements Serializable {
    /**
     * <p>
     * Information about associations that are successfully created:
     * <code>DataSetId</code>, <code>TargetAccountId</code>,
     * <code>ResourceShareId</code>, <code>ResourceShareArn</code>.
     * </p>
     */
    private java.util.List<AnalyticsDataAssociationResult> created;

    /**
     * <p>
     * A list of errors for datasets that aren't successfully associated with
     * the target account.
     * </p>
     */
    private java.util.List<ErrorResult> errors;

    /**
     * <p>
     * Information about associations that are successfully created:
     * <code>DataSetId</code>, <code>TargetAccountId</code>,
     * <code>ResourceShareId</code>, <code>ResourceShareArn</code>.
     * </p>
     *
     * @return <p>
     *         Information about associations that are successfully created:
     *         <code>DataSetId</code>, <code>TargetAccountId</code>,
     *         <code>ResourceShareId</code>, <code>ResourceShareArn</code>.
     *         </p>
     */
    public java.util.List<AnalyticsDataAssociationResult> getCreated() {
        return created;
    }

    /**
     * <p>
     * Information about associations that are successfully created:
     * <code>DataSetId</code>, <code>TargetAccountId</code>,
     * <code>ResourceShareId</code>, <code>ResourceShareArn</code>.
     * </p>
     *
     * @param created <p>
     *            Information about associations that are successfully created:
     *            <code>DataSetId</code>, <code>TargetAccountId</code>,
     *            <code>ResourceShareId</code>, <code>ResourceShareArn</code>.
     *            </p>
     */
    public void setCreated(java.util.Collection<AnalyticsDataAssociationResult> created) {
        if (created == null) {
            this.created = null;
            return;
        }

        this.created = new java.util.ArrayList<AnalyticsDataAssociationResult>(created);
    }

    /**
     * <p>
     * Information about associations that are successfully created:
     * <code>DataSetId</code>, <code>TargetAccountId</code>,
     * <code>ResourceShareId</code>, <code>ResourceShareArn</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param created <p>
     *            Information about associations that are successfully created:
     *            <code>DataSetId</code>, <code>TargetAccountId</code>,
     *            <code>ResourceShareId</code>, <code>ResourceShareArn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchAssociateAnalyticsDataSetResult withCreated(
            AnalyticsDataAssociationResult... created) {
        if (getCreated() == null) {
            this.created = new java.util.ArrayList<AnalyticsDataAssociationResult>(created.length);
        }
        for (AnalyticsDataAssociationResult value : created) {
            this.created.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about associations that are successfully created:
     * <code>DataSetId</code>, <code>TargetAccountId</code>,
     * <code>ResourceShareId</code>, <code>ResourceShareArn</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param created <p>
     *            Information about associations that are successfully created:
     *            <code>DataSetId</code>, <code>TargetAccountId</code>,
     *            <code>ResourceShareId</code>, <code>ResourceShareArn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchAssociateAnalyticsDataSetResult withCreated(
            java.util.Collection<AnalyticsDataAssociationResult> created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * A list of errors for datasets that aren't successfully associated with
     * the target account.
     * </p>
     *
     * @return <p>
     *         A list of errors for datasets that aren't successfully associated
     *         with the target account.
     *         </p>
     */
    public java.util.List<ErrorResult> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of errors for datasets that aren't successfully associated with
     * the target account.
     * </p>
     *
     * @param errors <p>
     *            A list of errors for datasets that aren't successfully
     *            associated with the target account.
     *            </p>
     */
    public void setErrors(java.util.Collection<ErrorResult> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<ErrorResult>(errors);
    }

    /**
     * <p>
     * A list of errors for datasets that aren't successfully associated with
     * the target account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            A list of errors for datasets that aren't successfully
     *            associated with the target account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchAssociateAnalyticsDataSetResult withErrors(ErrorResult... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<ErrorResult>(errors.length);
        }
        for (ErrorResult value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of errors for datasets that aren't successfully associated with
     * the target account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            A list of errors for datasets that aren't successfully
     *            associated with the target account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchAssociateAnalyticsDataSetResult withErrors(java.util.Collection<ErrorResult> errors) {
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
        if (getCreated() != null)
            sb.append("Created: " + getCreated() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchAssociateAnalyticsDataSetResult == false)
            return false;
        BatchAssociateAnalyticsDataSetResult other = (BatchAssociateAnalyticsDataSetResult) obj;

        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}

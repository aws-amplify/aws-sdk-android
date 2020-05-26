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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Associates the specified Systems Manager document with the specified
 * instances or targets.
 * </p>
 * <p>
 * When you associate a document with one or more instances using instance IDs
 * or tags, SSM Agent running on the instance processes the document and
 * configures the instance as specified.
 * </p>
 * <p>
 * If you associate a document with an instance that already has an associated
 * document, the system returns the AssociationAlreadyExists exception.
 * </p>
 */
public class CreateAssociationBatchRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * One or more associations.
     * </p>
     */
    private java.util.List<CreateAssociationBatchRequestEntry> entries;

    /**
     * <p>
     * One or more associations.
     * </p>
     *
     * @return <p>
     *         One or more associations.
     *         </p>
     */
    public java.util.List<CreateAssociationBatchRequestEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * One or more associations.
     * </p>
     *
     * @param entries <p>
     *            One or more associations.
     *            </p>
     */
    public void setEntries(java.util.Collection<CreateAssociationBatchRequestEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<CreateAssociationBatchRequestEntry>(entries);
    }

    /**
     * <p>
     * One or more associations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entries <p>
     *            One or more associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssociationBatchRequest withEntries(CreateAssociationBatchRequestEntry... entries) {
        if (getEntries() == null) {
            this.entries = new java.util.ArrayList<CreateAssociationBatchRequestEntry>(
                    entries.length);
        }
        for (CreateAssociationBatchRequestEntry value : entries) {
            this.entries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more associations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entries <p>
     *            One or more associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssociationBatchRequest withEntries(
            java.util.Collection<CreateAssociationBatchRequestEntry> entries) {
        setEntries(entries);
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
        if (getEntries() != null)
            sb.append("Entries: " + getEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssociationBatchRequest == false)
            return false;
        CreateAssociationBatchRequest other = (CreateAssociationBatchRequest) obj;

        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        return true;
    }
}

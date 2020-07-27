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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


public class CreateAssociationBatchResult implements Serializable {
    /**
     * <p>Information about the associations that succeeded.</p>
     */
    private java.util.List<AssociationDescription> successful;

    /**
     * <p>Information about the associations that failed.</p>
     */
    private java.util.List<FailedCreateAssociation> failed;

    /**
     * <p>Information about the associations that succeeded.</p>
     *
     * @return <p>Information about the associations that succeeded.</p>
     */
    public java.util.List<AssociationDescription> getSuccessful() {
        return successful;
    }

    /**
     * <p>Information about the associations that succeeded.</p>
     *
     * @param successful <p>Information about the associations that succeeded.</p>
     */
    public void setSuccessful(java.util.Collection<AssociationDescription> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }

        this.successful = new java.util.ArrayList<AssociationDescription>(successful);
    }

    /**
     * <p>Information about the associations that succeeded.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param successful <p>Information about the associations that succeeded.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAssociationBatchResult withSuccessful(AssociationDescription... successful) {
        if (getSuccessful() == null) {
            this.successful = new java.util.ArrayList<AssociationDescription>(successful.length);
        }
        for (AssociationDescription value : successful) {
            this.successful.add(value);
        }
        return this;
    }

    /**
     * <p>Information about the associations that succeeded.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param successful <p>Information about the associations that succeeded.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAssociationBatchResult withSuccessful(java.util.Collection<AssociationDescription> successful) {
        setSuccessful(successful);
        return this;
    }

    /**
     * <p>Information about the associations that failed.</p>
     *
     * @return <p>Information about the associations that failed.</p>
     */
    public java.util.List<FailedCreateAssociation> getFailed() {
        return failed;
    }

    /**
     * <p>Information about the associations that failed.</p>
     *
     * @param failed <p>Information about the associations that failed.</p>
     */
    public void setFailed(java.util.Collection<FailedCreateAssociation> failed) {
        if (failed == null) {
            this.failed = null;
            return;
        }

        this.failed = new java.util.ArrayList<FailedCreateAssociation>(failed);
    }

    /**
     * <p>Information about the associations that failed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failed <p>Information about the associations that failed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAssociationBatchResult withFailed(FailedCreateAssociation... failed) {
        if (getFailed() == null) {
            this.failed = new java.util.ArrayList<FailedCreateAssociation>(failed.length);
        }
        for (FailedCreateAssociation value : failed) {
            this.failed.add(value);
        }
        return this;
    }

    /**
     * <p>Information about the associations that failed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failed <p>Information about the associations that failed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAssociationBatchResult withFailed(java.util.Collection<FailedCreateAssociation> failed) {
        setFailed(failed);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSuccessful() != null) sb.append("Successful: " + getSuccessful() + ",");
        if (getFailed() != null) sb.append("Failed: " + getFailed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessful() == null) ? 0 : getSuccessful().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateAssociationBatchResult == false) return false;
        CreateAssociationBatchResult other = (CreateAssociationBatchResult)obj;

        if (other.getSuccessful() == null ^ this.getSuccessful() == null) return false;
        if (other.getSuccessful() != null && other.getSuccessful().equals(this.getSuccessful()) == false) return false;
        if (other.getFailed() == null ^ this.getFailed() == null) return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false) return false;
        return true;
    }
}

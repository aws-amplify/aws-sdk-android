/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information regarding DocumentGroups and UndetectedDocumentTypes.
 * </p>
 */
public class LendingSummary implements Serializable {
    /**
     * <p>
     * Contains an array of all DocumentGroup objects.
     * </p>
     */
    private java.util.List<DocumentGroup> documentGroups;

    /**
     * <p>
     * UndetectedDocumentTypes.
     * </p>
     */
    private java.util.List<String> undetectedDocumentTypes;

    /**
     * <p>
     * Contains an array of all DocumentGroup objects.
     * </p>
     *
     * @return <p>
     *         Contains an array of all DocumentGroup objects.
     *         </p>
     */
    public java.util.List<DocumentGroup> getDocumentGroups() {
        return documentGroups;
    }

    /**
     * <p>
     * Contains an array of all DocumentGroup objects.
     * </p>
     *
     * @param documentGroups <p>
     *            Contains an array of all DocumentGroup objects.
     *            </p>
     */
    public void setDocumentGroups(java.util.Collection<DocumentGroup> documentGroups) {
        if (documentGroups == null) {
            this.documentGroups = null;
            return;
        }

        this.documentGroups = new java.util.ArrayList<DocumentGroup>(documentGroups);
    }

    /**
     * <p>
     * Contains an array of all DocumentGroup objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentGroups <p>
     *            Contains an array of all DocumentGroup objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LendingSummary withDocumentGroups(DocumentGroup... documentGroups) {
        if (getDocumentGroups() == null) {
            this.documentGroups = new java.util.ArrayList<DocumentGroup>(documentGroups.length);
        }
        for (DocumentGroup value : documentGroups) {
            this.documentGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains an array of all DocumentGroup objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentGroups <p>
     *            Contains an array of all DocumentGroup objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LendingSummary withDocumentGroups(java.util.Collection<DocumentGroup> documentGroups) {
        setDocumentGroups(documentGroups);
        return this;
    }

    /**
     * <p>
     * UndetectedDocumentTypes.
     * </p>
     *
     * @return <p>
     *         UndetectedDocumentTypes.
     *         </p>
     */
    public java.util.List<String> getUndetectedDocumentTypes() {
        return undetectedDocumentTypes;
    }

    /**
     * <p>
     * UndetectedDocumentTypes.
     * </p>
     *
     * @param undetectedDocumentTypes <p>
     *            UndetectedDocumentTypes.
     *            </p>
     */
    public void setUndetectedDocumentTypes(java.util.Collection<String> undetectedDocumentTypes) {
        if (undetectedDocumentTypes == null) {
            this.undetectedDocumentTypes = null;
            return;
        }

        this.undetectedDocumentTypes = new java.util.ArrayList<String>(undetectedDocumentTypes);
    }

    /**
     * <p>
     * UndetectedDocumentTypes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param undetectedDocumentTypes <p>
     *            UndetectedDocumentTypes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LendingSummary withUndetectedDocumentTypes(String... undetectedDocumentTypes) {
        if (getUndetectedDocumentTypes() == null) {
            this.undetectedDocumentTypes = new java.util.ArrayList<String>(
                    undetectedDocumentTypes.length);
        }
        for (String value : undetectedDocumentTypes) {
            this.undetectedDocumentTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * UndetectedDocumentTypes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param undetectedDocumentTypes <p>
     *            UndetectedDocumentTypes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LendingSummary withUndetectedDocumentTypes(
            java.util.Collection<String> undetectedDocumentTypes) {
        setUndetectedDocumentTypes(undetectedDocumentTypes);
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
        if (getDocumentGroups() != null)
            sb.append("DocumentGroups: " + getDocumentGroups() + ",");
        if (getUndetectedDocumentTypes() != null)
            sb.append("UndetectedDocumentTypes: " + getUndetectedDocumentTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDocumentGroups() == null) ? 0 : getDocumentGroups().hashCode());
        hashCode = prime
                * hashCode
                + ((getUndetectedDocumentTypes() == null) ? 0 : getUndetectedDocumentTypes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LendingSummary == false)
            return false;
        LendingSummary other = (LendingSummary) obj;

        if (other.getDocumentGroups() == null ^ this.getDocumentGroups() == null)
            return false;
        if (other.getDocumentGroups() != null
                && other.getDocumentGroups().equals(this.getDocumentGroups()) == false)
            return false;
        if (other.getUndetectedDocumentTypes() == null ^ this.getUndetectedDocumentTypes() == null)
            return false;
        if (other.getUndetectedDocumentTypes() != null
                && other.getUndetectedDocumentTypes().equals(this.getUndetectedDocumentTypes()) == false)
            return false;
        return true;
    }
}

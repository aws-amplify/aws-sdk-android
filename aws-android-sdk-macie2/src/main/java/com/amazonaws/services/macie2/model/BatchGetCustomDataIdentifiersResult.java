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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

public class BatchGetCustomDataIdentifiersResult implements Serializable {
    /**
     * <p>
     * An array of objects, one for each custom data identifier that meets the
     * criteria specified in the request.
     * </p>
     */
    private java.util.List<BatchGetCustomDataIdentifierSummary> customDataIdentifiers;

    /**
     * <p>
     * An array of identifiers, one for each identifier that was specified in
     * the request, but doesn't correlate to an existing custom data identifier.
     * </p>
     */
    private java.util.List<String> notFoundIdentifierIds;

    /**
     * <p>
     * An array of objects, one for each custom data identifier that meets the
     * criteria specified in the request.
     * </p>
     *
     * @return <p>
     *         An array of objects, one for each custom data identifier that
     *         meets the criteria specified in the request.
     *         </p>
     */
    public java.util.List<BatchGetCustomDataIdentifierSummary> getCustomDataIdentifiers() {
        return customDataIdentifiers;
    }

    /**
     * <p>
     * An array of objects, one for each custom data identifier that meets the
     * criteria specified in the request.
     * </p>
     *
     * @param customDataIdentifiers <p>
     *            An array of objects, one for each custom data identifier that
     *            meets the criteria specified in the request.
     *            </p>
     */
    public void setCustomDataIdentifiers(
            java.util.Collection<BatchGetCustomDataIdentifierSummary> customDataIdentifiers) {
        if (customDataIdentifiers == null) {
            this.customDataIdentifiers = null;
            return;
        }

        this.customDataIdentifiers = new java.util.ArrayList<BatchGetCustomDataIdentifierSummary>(
                customDataIdentifiers);
    }

    /**
     * <p>
     * An array of objects, one for each custom data identifier that meets the
     * criteria specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customDataIdentifiers <p>
     *            An array of objects, one for each custom data identifier that
     *            meets the criteria specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCustomDataIdentifiersResult withCustomDataIdentifiers(
            BatchGetCustomDataIdentifierSummary... customDataIdentifiers) {
        if (getCustomDataIdentifiers() == null) {
            this.customDataIdentifiers = new java.util.ArrayList<BatchGetCustomDataIdentifierSummary>(
                    customDataIdentifiers.length);
        }
        for (BatchGetCustomDataIdentifierSummary value : customDataIdentifiers) {
            this.customDataIdentifiers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each custom data identifier that meets the
     * criteria specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customDataIdentifiers <p>
     *            An array of objects, one for each custom data identifier that
     *            meets the criteria specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCustomDataIdentifiersResult withCustomDataIdentifiers(
            java.util.Collection<BatchGetCustomDataIdentifierSummary> customDataIdentifiers) {
        setCustomDataIdentifiers(customDataIdentifiers);
        return this;
    }

    /**
     * <p>
     * An array of identifiers, one for each identifier that was specified in
     * the request, but doesn't correlate to an existing custom data identifier.
     * </p>
     *
     * @return <p>
     *         An array of identifiers, one for each identifier that was
     *         specified in the request, but doesn't correlate to an existing
     *         custom data identifier.
     *         </p>
     */
    public java.util.List<String> getNotFoundIdentifierIds() {
        return notFoundIdentifierIds;
    }

    /**
     * <p>
     * An array of identifiers, one for each identifier that was specified in
     * the request, but doesn't correlate to an existing custom data identifier.
     * </p>
     *
     * @param notFoundIdentifierIds <p>
     *            An array of identifiers, one for each identifier that was
     *            specified in the request, but doesn't correlate to an existing
     *            custom data identifier.
     *            </p>
     */
    public void setNotFoundIdentifierIds(java.util.Collection<String> notFoundIdentifierIds) {
        if (notFoundIdentifierIds == null) {
            this.notFoundIdentifierIds = null;
            return;
        }

        this.notFoundIdentifierIds = new java.util.ArrayList<String>(notFoundIdentifierIds);
    }

    /**
     * <p>
     * An array of identifiers, one for each identifier that was specified in
     * the request, but doesn't correlate to an existing custom data identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notFoundIdentifierIds <p>
     *            An array of identifiers, one for each identifier that was
     *            specified in the request, but doesn't correlate to an existing
     *            custom data identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCustomDataIdentifiersResult withNotFoundIdentifierIds(
            String... notFoundIdentifierIds) {
        if (getNotFoundIdentifierIds() == null) {
            this.notFoundIdentifierIds = new java.util.ArrayList<String>(
                    notFoundIdentifierIds.length);
        }
        for (String value : notFoundIdentifierIds) {
            this.notFoundIdentifierIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of identifiers, one for each identifier that was specified in
     * the request, but doesn't correlate to an existing custom data identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notFoundIdentifierIds <p>
     *            An array of identifiers, one for each identifier that was
     *            specified in the request, but doesn't correlate to an existing
     *            custom data identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCustomDataIdentifiersResult withNotFoundIdentifierIds(
            java.util.Collection<String> notFoundIdentifierIds) {
        setNotFoundIdentifierIds(notFoundIdentifierIds);
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
        if (getCustomDataIdentifiers() != null)
            sb.append("customDataIdentifiers: " + getCustomDataIdentifiers() + ",");
        if (getNotFoundIdentifierIds() != null)
            sb.append("notFoundIdentifierIds: " + getNotFoundIdentifierIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCustomDataIdentifiers() == null) ? 0 : getCustomDataIdentifiers().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotFoundIdentifierIds() == null) ? 0 : getNotFoundIdentifierIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetCustomDataIdentifiersResult == false)
            return false;
        BatchGetCustomDataIdentifiersResult other = (BatchGetCustomDataIdentifiersResult) obj;

        if (other.getCustomDataIdentifiers() == null ^ this.getCustomDataIdentifiers() == null)
            return false;
        if (other.getCustomDataIdentifiers() != null
                && other.getCustomDataIdentifiers().equals(this.getCustomDataIdentifiers()) == false)
            return false;
        if (other.getNotFoundIdentifierIds() == null ^ this.getNotFoundIdentifierIds() == null)
            return false;
        if (other.getNotFoundIdentifierIds() != null
                && other.getNotFoundIdentifierIds().equals(this.getNotFoundIdentifierIds()) == false)
            return false;
        return true;
    }
}

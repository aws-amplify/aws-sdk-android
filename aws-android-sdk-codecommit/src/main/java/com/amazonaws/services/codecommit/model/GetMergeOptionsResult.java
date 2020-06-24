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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

public class GetMergeOptionsResult implements Serializable {
    /**
     * <p>
     * The merge option or strategy used to merge the code.
     * </p>
     */
    private java.util.List<String> mergeOptions;

    /**
     * <p>
     * The commit ID of the source commit specifier that was used in the merge
     * evaluation.
     * </p>
     */
    private String sourceCommitId;

    /**
     * <p>
     * The commit ID of the destination commit specifier that was used in the
     * merge evaluation.
     * </p>
     */
    private String destinationCommitId;

    /**
     * <p>
     * The commit ID of the merge base.
     * </p>
     */
    private String baseCommitId;

    /**
     * <p>
     * The merge option or strategy used to merge the code.
     * </p>
     *
     * @return <p>
     *         The merge option or strategy used to merge the code.
     *         </p>
     */
    public java.util.List<String> getMergeOptions() {
        return mergeOptions;
    }

    /**
     * <p>
     * The merge option or strategy used to merge the code.
     * </p>
     *
     * @param mergeOptions <p>
     *            The merge option or strategy used to merge the code.
     *            </p>
     */
    public void setMergeOptions(java.util.Collection<String> mergeOptions) {
        if (mergeOptions == null) {
            this.mergeOptions = null;
            return;
        }

        this.mergeOptions = new java.util.ArrayList<String>(mergeOptions);
    }

    /**
     * <p>
     * The merge option or strategy used to merge the code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mergeOptions <p>
     *            The merge option or strategy used to merge the code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMergeOptionsResult withMergeOptions(String... mergeOptions) {
        if (getMergeOptions() == null) {
            this.mergeOptions = new java.util.ArrayList<String>(mergeOptions.length);
        }
        for (String value : mergeOptions) {
            this.mergeOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The merge option or strategy used to merge the code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mergeOptions <p>
     *            The merge option or strategy used to merge the code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMergeOptionsResult withMergeOptions(java.util.Collection<String> mergeOptions) {
        setMergeOptions(mergeOptions);
        return this;
    }

    /**
     * <p>
     * The commit ID of the source commit specifier that was used in the merge
     * evaluation.
     * </p>
     *
     * @return <p>
     *         The commit ID of the source commit specifier that was used in the
     *         merge evaluation.
     *         </p>
     */
    public String getSourceCommitId() {
        return sourceCommitId;
    }

    /**
     * <p>
     * The commit ID of the source commit specifier that was used in the merge
     * evaluation.
     * </p>
     *
     * @param sourceCommitId <p>
     *            The commit ID of the source commit specifier that was used in
     *            the merge evaluation.
     *            </p>
     */
    public void setSourceCommitId(String sourceCommitId) {
        this.sourceCommitId = sourceCommitId;
    }

    /**
     * <p>
     * The commit ID of the source commit specifier that was used in the merge
     * evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceCommitId <p>
     *            The commit ID of the source commit specifier that was used in
     *            the merge evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMergeOptionsResult withSourceCommitId(String sourceCommitId) {
        this.sourceCommitId = sourceCommitId;
        return this;
    }

    /**
     * <p>
     * The commit ID of the destination commit specifier that was used in the
     * merge evaluation.
     * </p>
     *
     * @return <p>
     *         The commit ID of the destination commit specifier that was used
     *         in the merge evaluation.
     *         </p>
     */
    public String getDestinationCommitId() {
        return destinationCommitId;
    }

    /**
     * <p>
     * The commit ID of the destination commit specifier that was used in the
     * merge evaluation.
     * </p>
     *
     * @param destinationCommitId <p>
     *            The commit ID of the destination commit specifier that was
     *            used in the merge evaluation.
     *            </p>
     */
    public void setDestinationCommitId(String destinationCommitId) {
        this.destinationCommitId = destinationCommitId;
    }

    /**
     * <p>
     * The commit ID of the destination commit specifier that was used in the
     * merge evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationCommitId <p>
     *            The commit ID of the destination commit specifier that was
     *            used in the merge evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMergeOptionsResult withDestinationCommitId(String destinationCommitId) {
        this.destinationCommitId = destinationCommitId;
        return this;
    }

    /**
     * <p>
     * The commit ID of the merge base.
     * </p>
     *
     * @return <p>
     *         The commit ID of the merge base.
     *         </p>
     */
    public String getBaseCommitId() {
        return baseCommitId;
    }

    /**
     * <p>
     * The commit ID of the merge base.
     * </p>
     *
     * @param baseCommitId <p>
     *            The commit ID of the merge base.
     *            </p>
     */
    public void setBaseCommitId(String baseCommitId) {
        this.baseCommitId = baseCommitId;
    }

    /**
     * <p>
     * The commit ID of the merge base.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baseCommitId <p>
     *            The commit ID of the merge base.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMergeOptionsResult withBaseCommitId(String baseCommitId) {
        this.baseCommitId = baseCommitId;
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
        if (getMergeOptions() != null)
            sb.append("mergeOptions: " + getMergeOptions() + ",");
        if (getSourceCommitId() != null)
            sb.append("sourceCommitId: " + getSourceCommitId() + ",");
        if (getDestinationCommitId() != null)
            sb.append("destinationCommitId: " + getDestinationCommitId() + ",");
        if (getBaseCommitId() != null)
            sb.append("baseCommitId: " + getBaseCommitId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMergeOptions() == null) ? 0 : getMergeOptions().hashCode());
        hashCode = prime * hashCode
                + ((getSourceCommitId() == null) ? 0 : getSourceCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationCommitId() == null) ? 0 : getDestinationCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getBaseCommitId() == null) ? 0 : getBaseCommitId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMergeOptionsResult == false)
            return false;
        GetMergeOptionsResult other = (GetMergeOptionsResult) obj;

        if (other.getMergeOptions() == null ^ this.getMergeOptions() == null)
            return false;
        if (other.getMergeOptions() != null
                && other.getMergeOptions().equals(this.getMergeOptions()) == false)
            return false;
        if (other.getSourceCommitId() == null ^ this.getSourceCommitId() == null)
            return false;
        if (other.getSourceCommitId() != null
                && other.getSourceCommitId().equals(this.getSourceCommitId()) == false)
            return false;
        if (other.getDestinationCommitId() == null ^ this.getDestinationCommitId() == null)
            return false;
        if (other.getDestinationCommitId() != null
                && other.getDestinationCommitId().equals(this.getDestinationCommitId()) == false)
            return false;
        if (other.getBaseCommitId() == null ^ this.getBaseCommitId() == null)
            return false;
        if (other.getBaseCommitId() != null
                && other.getBaseCommitId().equals(this.getBaseCommitId()) == false)
            return false;
        return true;
    }
}

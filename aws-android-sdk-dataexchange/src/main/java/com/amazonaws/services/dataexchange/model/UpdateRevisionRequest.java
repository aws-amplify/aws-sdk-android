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

package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This operation updates a revision.
 * </p>
 */
public class UpdateRevisionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16384<br/>
     */
    private String comment;

    /**
     * <p>
     * The unique identifier for a data set.
     * </p>
     */
    private String dataSetId;

    /**
     * <p>
     * Finalizing a revision tells AWS Data Exchange that your changes to the
     * assets in the revision are complete. After it's in this read-only state,
     * you can publish the revision to your products.
     * </p>
     */
    private Boolean finalized;

    /**
     * <p>
     * The unique identifier for a revision.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16384<br/>
     *
     * @return <p>
     *         An optional comment about the revision.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16384<br/>
     *
     * @param comment <p>
     *            An optional comment about the revision.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16384<br/>
     *
     * @param comment <p>
     *            An optional comment about the revision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRevisionRequest withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * <p>
     * The unique identifier for a data set.
     * </p>
     *
     * @return <p>
     *         The unique identifier for a data set.
     *         </p>
     */
    public String getDataSetId() {
        return dataSetId;
    }

    /**
     * <p>
     * The unique identifier for a data set.
     * </p>
     *
     * @param dataSetId <p>
     *            The unique identifier for a data set.
     *            </p>
     */
    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The unique identifier for a data set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSetId <p>
     *            The unique identifier for a data set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRevisionRequest withDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }

    /**
     * <p>
     * Finalizing a revision tells AWS Data Exchange that your changes to the
     * assets in the revision are complete. After it's in this read-only state,
     * you can publish the revision to your products.
     * </p>
     *
     * @return <p>
     *         Finalizing a revision tells AWS Data Exchange that your changes
     *         to the assets in the revision are complete. After it's in this
     *         read-only state, you can publish the revision to your products.
     *         </p>
     */
    public Boolean isFinalized() {
        return finalized;
    }

    /**
     * <p>
     * Finalizing a revision tells AWS Data Exchange that your changes to the
     * assets in the revision are complete. After it's in this read-only state,
     * you can publish the revision to your products.
     * </p>
     *
     * @return <p>
     *         Finalizing a revision tells AWS Data Exchange that your changes
     *         to the assets in the revision are complete. After it's in this
     *         read-only state, you can publish the revision to your products.
     *         </p>
     */
    public Boolean getFinalized() {
        return finalized;
    }

    /**
     * <p>
     * Finalizing a revision tells AWS Data Exchange that your changes to the
     * assets in the revision are complete. After it's in this read-only state,
     * you can publish the revision to your products.
     * </p>
     *
     * @param finalized <p>
     *            Finalizing a revision tells AWS Data Exchange that your
     *            changes to the assets in the revision are complete. After it's
     *            in this read-only state, you can publish the revision to your
     *            products.
     *            </p>
     */
    public void setFinalized(Boolean finalized) {
        this.finalized = finalized;
    }

    /**
     * <p>
     * Finalizing a revision tells AWS Data Exchange that your changes to the
     * assets in the revision are complete. After it's in this read-only state,
     * you can publish the revision to your products.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finalized <p>
     *            Finalizing a revision tells AWS Data Exchange that your
     *            changes to the assets in the revision are complete. After it's
     *            in this read-only state, you can publish the revision to your
     *            products.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRevisionRequest withFinalized(Boolean finalized) {
        this.finalized = finalized;
        return this;
    }

    /**
     * <p>
     * The unique identifier for a revision.
     * </p>
     *
     * @return <p>
     *         The unique identifier for a revision.
     *         </p>
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * <p>
     * The unique identifier for a revision.
     * </p>
     *
     * @param revisionId <p>
     *            The unique identifier for a revision.
     *            </p>
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The unique identifier for a revision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisionId <p>
     *            The unique identifier for a revision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRevisionRequest withRevisionId(String revisionId) {
        this.revisionId = revisionId;
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
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getDataSetId() != null)
            sb.append("DataSetId: " + getDataSetId() + ",");
        if (getFinalized() != null)
            sb.append("Finalized: " + getFinalized() + ",");
        if (getRevisionId() != null)
            sb.append("RevisionId: " + getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getFinalized() == null) ? 0 : getFinalized().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRevisionRequest == false)
            return false;
        UpdateRevisionRequest other = (UpdateRevisionRequest) obj;

        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null
                && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getFinalized() == null ^ this.getFinalized() == null)
            return false;
        if (other.getFinalized() != null
                && other.getFinalized().equals(this.getFinalized()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null
                && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }
}

/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Statistics about a label used in a dataset. For more information, see
 * <a>DatasetLabelDescription</a>.
 * </p>
 */
public class DatasetLabelStats implements Serializable {
    /**
     * <p>
     * The total number of images that use the label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer entryCount;

    /**
     * <p>
     * The total number of images that have the label assigned to a bounding
     * box.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer boundingBoxCount;

    /**
     * <p>
     * The total number of images that use the label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total number of images that use the label.
     *         </p>
     */
    public Integer getEntryCount() {
        return entryCount;
    }

    /**
     * <p>
     * The total number of images that use the label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param entryCount <p>
     *            The total number of images that use the label.
     *            </p>
     */
    public void setEntryCount(Integer entryCount) {
        this.entryCount = entryCount;
    }

    /**
     * <p>
     * The total number of images that use the label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param entryCount <p>
     *            The total number of images that use the label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetLabelStats withEntryCount(Integer entryCount) {
        this.entryCount = entryCount;
        return this;
    }

    /**
     * <p>
     * The total number of images that have the label assigned to a bounding
     * box.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total number of images that have the label assigned to a
     *         bounding box.
     *         </p>
     */
    public Integer getBoundingBoxCount() {
        return boundingBoxCount;
    }

    /**
     * <p>
     * The total number of images that have the label assigned to a bounding
     * box.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param boundingBoxCount <p>
     *            The total number of images that have the label assigned to a
     *            bounding box.
     *            </p>
     */
    public void setBoundingBoxCount(Integer boundingBoxCount) {
        this.boundingBoxCount = boundingBoxCount;
    }

    /**
     * <p>
     * The total number of images that have the label assigned to a bounding
     * box.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param boundingBoxCount <p>
     *            The total number of images that have the label assigned to a
     *            bounding box.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetLabelStats withBoundingBoxCount(Integer boundingBoxCount) {
        this.boundingBoxCount = boundingBoxCount;
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
        if (getEntryCount() != null)
            sb.append("EntryCount: " + getEntryCount() + ",");
        if (getBoundingBoxCount() != null)
            sb.append("BoundingBoxCount: " + getBoundingBoxCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryCount() == null) ? 0 : getEntryCount().hashCode());
        hashCode = prime * hashCode
                + ((getBoundingBoxCount() == null) ? 0 : getBoundingBoxCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetLabelStats == false)
            return false;
        DatasetLabelStats other = (DatasetLabelStats) obj;

        if (other.getEntryCount() == null ^ this.getEntryCount() == null)
            return false;
        if (other.getEntryCount() != null
                && other.getEntryCount().equals(this.getEntryCount()) == false)
            return false;
        if (other.getBoundingBoxCount() == null ^ this.getBoundingBoxCount() == null)
            return false;
        if (other.getBoundingBoxCount() != null
                && other.getBoundingBoxCount().equals(this.getBoundingBoxCount()) == false)
            return false;
        return true;
    }
}

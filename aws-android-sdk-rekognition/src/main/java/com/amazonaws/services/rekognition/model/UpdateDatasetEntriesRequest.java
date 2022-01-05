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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds or updates one or more entries (images) in a dataset. An entry is a JSON
 * Line which contains the information for a single image, including the image
 * location, assigned labels, and object location bounding boxes. For more
 * information, see Image-Level labels in manifest files and Object localization
 * in manifest files in the <i>Amazon Rekognition Custom Labels Developer
 * Guide</i>.
 * </p>
 * <p>
 * If the <code>source-ref</code> field in the JSON line references an existing
 * image, the existing image in the dataset is updated. If
 * <code>source-ref</code> field doesn't reference an existing image, the image
 * is added as a new image to the dataset.
 * </p>
 * <p>
 * You specify the changes that you want to make in the <code>Changes</code>
 * input parameter. There isn't a limit to the number JSON Lines that you can
 * change, but the size of <code>Changes</code> must be less than 5MB.
 * </p>
 * <p>
 * <code>UpdateDatasetEntries</code> returns immediatly, but the dataset update
 * might take a while to complete. Use <a>DescribeDataset</a> to check the
 * current status. The dataset updated successfully if the value of
 * <code>Status</code> is <code>UPDATE_COMPLETE</code>.
 * </p>
 * <p>
 * To check if any non-terminal errors occured, call <a>ListDatasetEntries</a>
 * and check for the presence of <code>errors</code> lists in the JSON Lines.
 * </p>
 * <p>
 * Dataset update fails if a terminal error occurs (<code>Status</code> =
 * <code>UPDATE_FAILED</code>). Currently, you can't access the terminal error
 * information from the Amazon Rekognition Custom Labels SDK.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:UpdateDatasetEntries</code> action.
 * </p>
 */
public class UpdateDatasetEntriesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/dataset\/(train|test)\/[0-9]+$)<br/>
     */
    private String datasetArn;

    /**
     * <p>
     * The changes that you want to make to the dataset.
     * </p>
     */
    private DatasetChanges changes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/dataset\/(train|test)\/[0-9]+$)<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the dataset that you want to
     *         update.
     *         </p>
     */
    public String getDatasetArn() {
        return datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/dataset\/(train|test)\/[0-9]+$)<br/>
     *
     * @param datasetArn <p>
     *            The Amazon Resource Name (ARN) of the dataset that you want to
     *            update.
     *            </p>
     */
    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/dataset\/(train|test)\/[0-9]+$)<br/>
     *
     * @param datasetArn <p>
     *            The Amazon Resource Name (ARN) of the dataset that you want to
     *            update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDatasetEntriesRequest withDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
        return this;
    }

    /**
     * <p>
     * The changes that you want to make to the dataset.
     * </p>
     *
     * @return <p>
     *         The changes that you want to make to the dataset.
     *         </p>
     */
    public DatasetChanges getChanges() {
        return changes;
    }

    /**
     * <p>
     * The changes that you want to make to the dataset.
     * </p>
     *
     * @param changes <p>
     *            The changes that you want to make to the dataset.
     *            </p>
     */
    public void setChanges(DatasetChanges changes) {
        this.changes = changes;
    }

    /**
     * <p>
     * The changes that you want to make to the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param changes <p>
     *            The changes that you want to make to the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDatasetEntriesRequest withChanges(DatasetChanges changes) {
        this.changes = changes;
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
        if (getDatasetArn() != null)
            sb.append("DatasetArn: " + getDatasetArn() + ",");
        if (getChanges() != null)
            sb.append("Changes: " + getChanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getChanges() == null) ? 0 : getChanges().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDatasetEntriesRequest == false)
            return false;
        UpdateDatasetEntriesRequest other = (UpdateDatasetEntriesRequest) obj;

        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null
                && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getChanges() == null ^ this.getChanges() == null)
            return false;
        if (other.getChanges() != null && other.getChanges().equals(this.getChanges()) == false)
            return false;
        return true;
    }
}

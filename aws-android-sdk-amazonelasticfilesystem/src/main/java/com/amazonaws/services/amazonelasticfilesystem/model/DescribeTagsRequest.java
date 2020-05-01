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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the tags associated with a file system. The order of tags returned in
 * the response of one <code>DescribeTags</code> call and the order of tags
 * returned across the responses of a multiple-call iteration (when using
 * pagination) is unspecified.
 * </p>
 * <p>
 * This operation requires permissions for the
 * <code>elasticfilesystem:DescribeTags</code> action.
 * </p>
 */
public class DescribeTagsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * (Optional) The maximum number of file system tags to return in the
     * response. Currently, this number is automatically set to 100, and other
     * values are ignored. The response is paginated at 100 per page if you have
     * more than 100 tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxItems;

    /**
     * <p>
     * (Optional) An opaque pagination token returned from a previous
     * <code>DescribeTags</code> operation (String). If present, it specifies to
     * continue the list from where the previous call left off.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The ID of the file system whose tag set you want to retrieve.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * (Optional) The maximum number of file system tags to return in the
     * response. Currently, this number is automatically set to 100, and other
     * values are ignored. The response is paginated at 100 per page if you have
     * more than 100 tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         (Optional) The maximum number of file system tags to return in
     *         the response. Currently, this number is automatically set to 100,
     *         and other values are ignored. The response is paginated at 100
     *         per page if you have more than 100 tags.
     *         </p>
     */
    public Integer getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of file system tags to return in the
     * response. Currently, this number is automatically set to 100, and other
     * values are ignored. The response is paginated at 100 per page if you have
     * more than 100 tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxItems <p>
     *            (Optional) The maximum number of file system tags to return in
     *            the response. Currently, this number is automatically set to
     *            100, and other values are ignored. The response is paginated
     *            at 100 per page if you have more than 100 tags.
     *            </p>
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of file system tags to return in the
     * response. Currently, this number is automatically set to 100, and other
     * values are ignored. The response is paginated at 100 per page if you have
     * more than 100 tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxItems <p>
     *            (Optional) The maximum number of file system tags to return in
     *            the response. Currently, this number is automatically set to
     *            100, and other values are ignored. The response is paginated
     *            at 100 per page if you have more than 100 tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * <p>
     * (Optional) An opaque pagination token returned from a previous
     * <code>DescribeTags</code> operation (String). If present, it specifies to
     * continue the list from where the previous call left off.
     * </p>
     *
     * @return <p>
     *         (Optional) An opaque pagination token returned from a previous
     *         <code>DescribeTags</code> operation (String). If present, it
     *         specifies to continue the list from where the previous call left
     *         off.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * (Optional) An opaque pagination token returned from a previous
     * <code>DescribeTags</code> operation (String). If present, it specifies to
     * continue the list from where the previous call left off.
     * </p>
     *
     * @param marker <p>
     *            (Optional) An opaque pagination token returned from a previous
     *            <code>DescribeTags</code> operation (String). If present, it
     *            specifies to continue the list from where the previous call
     *            left off.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * (Optional) An opaque pagination token returned from a previous
     * <code>DescribeTags</code> operation (String). If present, it specifies to
     * continue the list from where the previous call left off.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            (Optional) An opaque pagination token returned from a previous
     *            <code>DescribeTags</code> operation (String). If present, it
     *            specifies to continue the list from where the previous call
     *            left off.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The ID of the file system whose tag set you want to retrieve.
     * </p>
     *
     * @return <p>
     *         The ID of the file system whose tag set you want to retrieve.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system whose tag set you want to retrieve.
     * </p>
     *
     * @param fileSystemId <p>
     *            The ID of the file system whose tag set you want to retrieve.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system whose tag set you want to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemId <p>
     *            The ID of the file system whose tag set you want to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
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
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTagsRequest == false)
            return false;
        DescribeTagsRequest other = (DescribeTagsRequest) obj;

        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        return true;
    }
}

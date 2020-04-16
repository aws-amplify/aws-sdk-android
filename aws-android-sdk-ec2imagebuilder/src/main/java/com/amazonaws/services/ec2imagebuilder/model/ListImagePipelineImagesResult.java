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

package com.amazonaws.services.ec2imagebuilder.model;

import java.io.Serializable;

public class ListImagePipelineImagesResult implements Serializable {
    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String requestId;

    /**
     * <p>
     * The list of images built by this pipeline.
     * </p>
     */
    private java.util.List<ImageSummary> imageSummaryList;

    /**
     * <p>
     * The next token used for paginated responses. When this is not empty,
     * there are additional elements that the service has not included in this
     * request. Use this token with the next request to retrieve additional
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The request ID that uniquely identifies this request.
     *         </p>
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param requestId <p>
     *            The request ID that uniquely identifies this request.
     *            </p>
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param requestId <p>
     *            The request ID that uniquely identifies this request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListImagePipelineImagesResult withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * <p>
     * The list of images built by this pipeline.
     * </p>
     *
     * @return <p>
     *         The list of images built by this pipeline.
     *         </p>
     */
    public java.util.List<ImageSummary> getImageSummaryList() {
        return imageSummaryList;
    }

    /**
     * <p>
     * The list of images built by this pipeline.
     * </p>
     *
     * @param imageSummaryList <p>
     *            The list of images built by this pipeline.
     *            </p>
     */
    public void setImageSummaryList(java.util.Collection<ImageSummary> imageSummaryList) {
        if (imageSummaryList == null) {
            this.imageSummaryList = null;
            return;
        }

        this.imageSummaryList = new java.util.ArrayList<ImageSummary>(imageSummaryList);
    }

    /**
     * <p>
     * The list of images built by this pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageSummaryList <p>
     *            The list of images built by this pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListImagePipelineImagesResult withImageSummaryList(ImageSummary... imageSummaryList) {
        if (getImageSummaryList() == null) {
            this.imageSummaryList = new java.util.ArrayList<ImageSummary>(imageSummaryList.length);
        }
        for (ImageSummary value : imageSummaryList) {
            this.imageSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of images built by this pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageSummaryList <p>
     *            The list of images built by this pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListImagePipelineImagesResult withImageSummaryList(
            java.util.Collection<ImageSummary> imageSummaryList) {
        setImageSummaryList(imageSummaryList);
        return this;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this is not empty,
     * there are additional elements that the service has not included in this
     * request. Use this token with the next request to retrieve additional
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The next token used for paginated responses. When this is not
     *         empty, there are additional elements that the service has not
     *         included in this request. Use this token with the next request to
     *         retrieve additional objects.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this is not empty,
     * there are additional elements that the service has not included in this
     * request. Use this token with the next request to retrieve additional
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            The next token used for paginated responses. When this is not
     *            empty, there are additional elements that the service has not
     *            included in this request. Use this token with the next request
     *            to retrieve additional objects.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this is not empty,
     * there are additional elements that the service has not included in this
     * request. Use this token with the next request to retrieve additional
     * objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            The next token used for paginated responses. When this is not
     *            empty, there are additional elements that the service has not
     *            included in this request. Use this token with the next request
     *            to retrieve additional objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListImagePipelineImagesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getRequestId() != null)
            sb.append("requestId: " + getRequestId() + ",");
        if (getImageSummaryList() != null)
            sb.append("imageSummaryList: " + getImageSummaryList() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode
                + ((getImageSummaryList() == null) ? 0 : getImageSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListImagePipelineImagesResult == false)
            return false;
        ListImagePipelineImagesResult other = (ListImagePipelineImagesResult) obj;

        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getImageSummaryList() == null ^ this.getImageSummaryList() == null)
            return false;
        if (other.getImageSummaryList() != null
                && other.getImageSummaryList().equals(this.getImageSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

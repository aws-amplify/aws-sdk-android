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

package com.amazonaws.services.api.ecr.model;

import java.io.Serializable;

public class DescribeImagesResult implements Serializable {
    /**
     * <p>
     * A list of <a>ImageDetail</a> objects that contain data about the image.
     * </p>
     */
    private java.util.List<ImageDetail> imageDetails;

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>DescribeImages</code> request. When the results of a
     * <code>DescribeImages</code> request exceed <code>maxResults</code>, this
     * value can be used to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <a>ImageDetail</a> objects that contain data about the image.
     * </p>
     *
     * @return <p>
     *         A list of <a>ImageDetail</a> objects that contain data about the
     *         image.
     *         </p>
     */
    public java.util.List<ImageDetail> getImageDetails() {
        return imageDetails;
    }

    /**
     * <p>
     * A list of <a>ImageDetail</a> objects that contain data about the image.
     * </p>
     *
     * @param imageDetails <p>
     *            A list of <a>ImageDetail</a> objects that contain data about
     *            the image.
     *            </p>
     */
    public void setImageDetails(java.util.Collection<ImageDetail> imageDetails) {
        if (imageDetails == null) {
            this.imageDetails = null;
            return;
        }

        this.imageDetails = new java.util.ArrayList<ImageDetail>(imageDetails);
    }

    /**
     * <p>
     * A list of <a>ImageDetail</a> objects that contain data about the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageDetails <p>
     *            A list of <a>ImageDetail</a> objects that contain data about
     *            the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImagesResult withImageDetails(ImageDetail... imageDetails) {
        if (getImageDetails() == null) {
            this.imageDetails = new java.util.ArrayList<ImageDetail>(imageDetails.length);
        }
        for (ImageDetail value : imageDetails) {
            this.imageDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>ImageDetail</a> objects that contain data about the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageDetails <p>
     *            A list of <a>ImageDetail</a> objects that contain data about
     *            the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImagesResult withImageDetails(java.util.Collection<ImageDetail> imageDetails) {
        setImageDetails(imageDetails);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>DescribeImages</code> request. When the results of a
     * <code>DescribeImages</code> request exceed <code>maxResults</code>, this
     * value can be used to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The <code>nextToken</code> value to include in a future
     *         <code>DescribeImages</code> request. When the results of a
     *         <code>DescribeImages</code> request exceed
     *         <code>maxResults</code>, this value can be used to retrieve the
     *         next page of results. This value is <code>null</code> when there
     *         are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>DescribeImages</code> request. When the results of a
     * <code>DescribeImages</code> request exceed <code>maxResults</code>, this
     * value can be used to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>DescribeImages</code> request. When the results of a
     *            <code>DescribeImages</code> request exceed
     *            <code>maxResults</code>, this value can be used to retrieve
     *            the next page of results. This value is <code>null</code> when
     *            there are no more results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>DescribeImages</code> request. When the results of a
     * <code>DescribeImages</code> request exceed <code>maxResults</code>, this
     * value can be used to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>DescribeImages</code> request. When the results of a
     *            <code>DescribeImages</code> request exceed
     *            <code>maxResults</code>, this value can be used to retrieve
     *            the next page of results. This value is <code>null</code> when
     *            there are no more results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImagesResult withNextToken(String nextToken) {
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
        if (getImageDetails() != null)
            sb.append("imageDetails: " + getImageDetails() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getImageDetails() == null) ? 0 : getImageDetails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImagesResult == false)
            return false;
        DescribeImagesResult other = (DescribeImagesResult) obj;

        if (other.getImageDetails() == null ^ this.getImageDetails() == null)
            return false;
        if (other.getImageDetails() != null
                && other.getImageDetails().equals(this.getImageDetails()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}

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
package com.amazonaws.services.amazonec2containerregistry.model;

import java.io.Serializable;


public class DescribeImageScanFindingsResult implements Serializable {
    /**
     * <p>The registry ID associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String registryId;

    /**
     * <p>The repository name associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     */
    private String repositoryName;

    /**
     * <p>An object with identifying information for an Amazon ECR image.</p>
     */
    private ImageIdentifier imageId;

    /**
     * <p>The current state of the scan.</p>
     */
    private ImageScanStatus imageScanStatus;

    /**
     * <p>The information contained in the image scan findings.</p>
     */
    private ImageScanFindings imageScanFindings;

    /**
     * <p>The <code>nextToken</code> value to include in a future <code>DescribeImageScanFindings</code> request. When the results of a <code>DescribeImageScanFindings</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.</p>
     */
    private String nextToken;

    /**
     * <p>The registry ID associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>The registry ID associated with the request.</p>
     */
    public String getRegistryId() {
        return registryId;
    }

    /**
     * <p>The registry ID associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The registry ID associated with the request.</p>
     */
    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>The registry ID associated with the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The registry ID associated with the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeImageScanFindingsResult withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * <p>The repository name associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @return <p>The repository name associated with the request.</p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>The repository name associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The repository name associated with the request.</p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>The repository name associated with the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The repository name associated with the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeImageScanFindingsResult withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>An object with identifying information for an Amazon ECR image.</p>
     *
     * @return <p>An object with identifying information for an Amazon ECR image.</p>
     */
    public ImageIdentifier getImageId() {
        return imageId;
    }

    /**
     * <p>An object with identifying information for an Amazon ECR image.</p>
     *
     * @param imageId <p>An object with identifying information for an Amazon ECR image.</p>
     */
    public void setImageId(ImageIdentifier imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>An object with identifying information for an Amazon ECR image.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId <p>An object with identifying information for an Amazon ECR image.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeImageScanFindingsResult withImageId(ImageIdentifier imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * <p>The current state of the scan.</p>
     *
     * @return <p>The current state of the scan.</p>
     */
    public ImageScanStatus getImageScanStatus() {
        return imageScanStatus;
    }

    /**
     * <p>The current state of the scan.</p>
     *
     * @param imageScanStatus <p>The current state of the scan.</p>
     */
    public void setImageScanStatus(ImageScanStatus imageScanStatus) {
        this.imageScanStatus = imageScanStatus;
    }

    /**
     * <p>The current state of the scan.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageScanStatus <p>The current state of the scan.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeImageScanFindingsResult withImageScanStatus(ImageScanStatus imageScanStatus) {
        this.imageScanStatus = imageScanStatus;
        return this;
    }

    /**
     * <p>The information contained in the image scan findings.</p>
     *
     * @return <p>The information contained in the image scan findings.</p>
     */
    public ImageScanFindings getImageScanFindings() {
        return imageScanFindings;
    }

    /**
     * <p>The information contained in the image scan findings.</p>
     *
     * @param imageScanFindings <p>The information contained in the image scan findings.</p>
     */
    public void setImageScanFindings(ImageScanFindings imageScanFindings) {
        this.imageScanFindings = imageScanFindings;
    }

    /**
     * <p>The information contained in the image scan findings.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageScanFindings <p>The information contained in the image scan findings.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeImageScanFindingsResult withImageScanFindings(ImageScanFindings imageScanFindings) {
        this.imageScanFindings = imageScanFindings;
        return this;
    }

    /**
     * <p>The <code>nextToken</code> value to include in a future <code>DescribeImageScanFindings</code> request. When the results of a <code>DescribeImageScanFindings</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.</p>
     *
     * @return <p>The <code>nextToken</code> value to include in a future <code>DescribeImageScanFindings</code> request. When the results of a <code>DescribeImageScanFindings</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The <code>nextToken</code> value to include in a future <code>DescribeImageScanFindings</code> request. When the results of a <code>DescribeImageScanFindings</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.</p>
     *
     * @param nextToken <p>The <code>nextToken</code> value to include in a future <code>DescribeImageScanFindings</code> request. When the results of a <code>DescribeImageScanFindings</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The <code>nextToken</code> value to include in a future <code>DescribeImageScanFindings</code> request. When the results of a <code>DescribeImageScanFindings</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The <code>nextToken</code> value to include in a future <code>DescribeImageScanFindings</code> request. When the results of a <code>DescribeImageScanFindings</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeImageScanFindingsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getRegistryId() != null) sb.append("registryId: " + getRegistryId() + ",");
        if (getRepositoryName() != null) sb.append("repositoryName: " + getRepositoryName() + ",");
        if (getImageId() != null) sb.append("imageId: " + getImageId() + ",");
        if (getImageScanStatus() != null) sb.append("imageScanStatus: " + getImageScanStatus() + ",");
        if (getImageScanFindings() != null) sb.append("imageScanFindings: " + getImageScanFindings() + ",");
        if (getNextToken() != null) sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getImageScanStatus() == null) ? 0 : getImageScanStatus().hashCode());
        hashCode = prime * hashCode + ((getImageScanFindings() == null) ? 0 : getImageScanFindings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeImageScanFindingsResult == false) return false;
        DescribeImageScanFindingsResult other = (DescribeImageScanFindingsResult)obj;

        if (other.getRegistryId() == null ^ this.getRegistryId() == null) return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false) return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null) return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false) return false;
        if (other.getImageId() == null ^ this.getImageId() == null) return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false) return false;
        if (other.getImageScanStatus() == null ^ this.getImageScanStatus() == null) return false;
        if (other.getImageScanStatus() != null && other.getImageScanStatus().equals(this.getImageScanStatus()) == false) return false;
        if (other.getImageScanFindings() == null ^ this.getImageScanFindings() == null) return false;
        if (other.getImageScanFindings() != null && other.getImageScanFindings().equals(this.getImageScanFindings()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}

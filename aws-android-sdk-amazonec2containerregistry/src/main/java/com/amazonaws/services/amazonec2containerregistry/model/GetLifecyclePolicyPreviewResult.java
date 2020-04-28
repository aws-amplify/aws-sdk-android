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


public class GetLifecyclePolicyPreviewResult implements Serializable {
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
     * <p>The JSON lifecycle policy text.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>100 - 30720<br/>
     */
    private String lifecyclePolicyText;

    /**
     * <p>The status of the lifecycle policy preview request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, EXPIRED, FAILED
     */
    private String status;

    /**
     * <p>The <code>nextToken</code> value to include in a future <code>GetLifecyclePolicyPreview</code> request. When the results of a <code>GetLifecyclePolicyPreview</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.</p>
     */
    private String nextToken;

    /**
     * <p>The results of the lifecycle policy preview request.</p>
     */
    private java.util.List<LifecyclePolicyPreviewResult> previewResults;

    /**
     * <p>The list of images that is returned as a result of the action.</p>
     */
    private LifecyclePolicyPreviewSummary summary;

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
    public GetLifecyclePolicyPreviewResult withRegistryId(String registryId) {
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
    public GetLifecyclePolicyPreviewResult withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>The JSON lifecycle policy text.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>100 - 30720<br/>
     *
     * @return <p>The JSON lifecycle policy text.</p>
     */
    public String getLifecyclePolicyText() {
        return lifecyclePolicyText;
    }

    /**
     * <p>The JSON lifecycle policy text.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>100 - 30720<br/>
     *
     * @param lifecyclePolicyText <p>The JSON lifecycle policy text.</p>
     */
    public void setLifecyclePolicyText(String lifecyclePolicyText) {
        this.lifecyclePolicyText = lifecyclePolicyText;
    }

    /**
     * <p>The JSON lifecycle policy text.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>100 - 30720<br/>
     *
     * @param lifecyclePolicyText <p>The JSON lifecycle policy text.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetLifecyclePolicyPreviewResult withLifecyclePolicyText(String lifecyclePolicyText) {
        this.lifecyclePolicyText = lifecyclePolicyText;
        return this;
    }

    /**
     * <p>The status of the lifecycle policy preview request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, EXPIRED, FAILED
     *
     * @return <p>The status of the lifecycle policy preview request.</p>
     *
     * @see LifecyclePolicyPreviewStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The status of the lifecycle policy preview request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, EXPIRED, FAILED
     *
     * @param status <p>The status of the lifecycle policy preview request.</p>
     *
     * @see LifecyclePolicyPreviewStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The status of the lifecycle policy preview request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, EXPIRED, FAILED
     *
     * @param status <p>The status of the lifecycle policy preview request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see LifecyclePolicyPreviewStatus
     */
    public GetLifecyclePolicyPreviewResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>The status of the lifecycle policy preview request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, EXPIRED, FAILED
     *
     * @param status <p>The status of the lifecycle policy preview request.</p>
     *
     * @see LifecyclePolicyPreviewStatus
     */
    public void setStatus(LifecyclePolicyPreviewStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>The status of the lifecycle policy preview request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, EXPIRED, FAILED
     *
     * @param status <p>The status of the lifecycle policy preview request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see LifecyclePolicyPreviewStatus
     */
    public GetLifecyclePolicyPreviewResult withStatus(LifecyclePolicyPreviewStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>The <code>nextToken</code> value to include in a future <code>GetLifecyclePolicyPreview</code> request. When the results of a <code>GetLifecyclePolicyPreview</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.</p>
     *
     * @return <p>The <code>nextToken</code> value to include in a future <code>GetLifecyclePolicyPreview</code> request. When the results of a <code>GetLifecyclePolicyPreview</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The <code>nextToken</code> value to include in a future <code>GetLifecyclePolicyPreview</code> request. When the results of a <code>GetLifecyclePolicyPreview</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.</p>
     *
     * @param nextToken <p>The <code>nextToken</code> value to include in a future <code>GetLifecyclePolicyPreview</code> request. When the results of a <code>GetLifecyclePolicyPreview</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The <code>nextToken</code> value to include in a future <code>GetLifecyclePolicyPreview</code> request. When the results of a <code>GetLifecyclePolicyPreview</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The <code>nextToken</code> value to include in a future <code>GetLifecyclePolicyPreview</code> request. When the results of a <code>GetLifecyclePolicyPreview</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetLifecyclePolicyPreviewResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>The results of the lifecycle policy preview request.</p>
     *
     * @return <p>The results of the lifecycle policy preview request.</p>
     */
    public java.util.List<LifecyclePolicyPreviewResult> getPreviewResults() {
        return previewResults;
    }

    /**
     * <p>The results of the lifecycle policy preview request.</p>
     *
     * @param previewResults <p>The results of the lifecycle policy preview request.</p>
     */
    public void setPreviewResults(java.util.Collection<LifecyclePolicyPreviewResult> previewResults) {
        if (previewResults == null) {
            this.previewResults = null;
            return;
        }

        this.previewResults = new java.util.ArrayList<LifecyclePolicyPreviewResult>(previewResults);
    }

    /**
     * <p>The results of the lifecycle policy preview request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param previewResults <p>The results of the lifecycle policy preview request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetLifecyclePolicyPreviewResult withPreviewResults(LifecyclePolicyPreviewResult... previewResults) {
        if (getPreviewResults() == null) {
            this.previewResults = new java.util.ArrayList<LifecyclePolicyPreviewResult>(previewResults.length);
        }
        for (LifecyclePolicyPreviewResult value : previewResults) {
            this.previewResults.add(value);
        }
        return this;
    }

    /**
     * <p>The results of the lifecycle policy preview request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param previewResults <p>The results of the lifecycle policy preview request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetLifecyclePolicyPreviewResult withPreviewResults(java.util.Collection<LifecyclePolicyPreviewResult> previewResults) {
        setPreviewResults(previewResults);
        return this;
    }

    /**
     * <p>The list of images that is returned as a result of the action.</p>
     *
     * @return <p>The list of images that is returned as a result of the action.</p>
     */
    public LifecyclePolicyPreviewSummary getSummary() {
        return summary;
    }

    /**
     * <p>The list of images that is returned as a result of the action.</p>
     *
     * @param summary <p>The list of images that is returned as a result of the action.</p>
     */
    public void setSummary(LifecyclePolicyPreviewSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>The list of images that is returned as a result of the action.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param summary <p>The list of images that is returned as a result of the action.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetLifecyclePolicyPreviewResult withSummary(LifecyclePolicyPreviewSummary summary) {
        this.summary = summary;
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
        if (getLifecyclePolicyText() != null) sb.append("lifecyclePolicyText: " + getLifecyclePolicyText() + ",");
        if (getStatus() != null) sb.append("status: " + getStatus() + ",");
        if (getNextToken() != null) sb.append("nextToken: " + getNextToken() + ",");
        if (getPreviewResults() != null) sb.append("previewResults: " + getPreviewResults() + ",");
        if (getSummary() != null) sb.append("summary: " + getSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getLifecyclePolicyText() == null) ? 0 : getLifecyclePolicyText().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPreviewResults() == null) ? 0 : getPreviewResults().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetLifecyclePolicyPreviewResult == false) return false;
        GetLifecyclePolicyPreviewResult other = (GetLifecyclePolicyPreviewResult)obj;

        if (other.getRegistryId() == null ^ this.getRegistryId() == null) return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false) return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null) return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false) return false;
        if (other.getLifecyclePolicyText() == null ^ this.getLifecyclePolicyText() == null) return false;
        if (other.getLifecyclePolicyText() != null && other.getLifecyclePolicyText().equals(this.getLifecyclePolicyText()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getPreviewResults() == null ^ this.getPreviewResults() == null) return false;
        if (other.getPreviewResults() != null && other.getPreviewResults().equals(this.getPreviewResults()) == false) return false;
        if (other.getSummary() == null ^ this.getSummary() == null) return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false) return false;
        return true;
    }
}

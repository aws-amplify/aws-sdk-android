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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * The result structure for the create a new deployment request.
 * </p>
 */
public class CreateDeploymentResult implements Serializable {
    /**
     * <p>
     * The job ID for this deployment. will supply to start deployment api.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String jobId;

    /**
     * <p>
     * When the <code>fileMap</code> argument is provided in the request,
     * <code>fileUploadUrls</code> will contain a map of file names to upload
     * URLs.
     * </p>
     */
    private java.util.Map<String, String> fileUploadUrls;

    /**
     * <p>
     * When the <code>fileMap</code> argument is not provided in the request,
     * this <code>zipUploadUrl</code> is returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String zipUploadUrl;

    /**
     * <p>
     * The job ID for this deployment. will supply to start deployment api.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The job ID for this deployment. will supply to start deployment
     *         api.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The job ID for this deployment. will supply to start deployment api.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param jobId <p>
     *            The job ID for this deployment. will supply to start
     *            deployment api.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID for this deployment. will supply to start deployment api.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param jobId <p>
     *            The job ID for this deployment. will supply to start
     *            deployment api.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * When the <code>fileMap</code> argument is provided in the request,
     * <code>fileUploadUrls</code> will contain a map of file names to upload
     * URLs.
     * </p>
     *
     * @return <p>
     *         When the <code>fileMap</code> argument is provided in the
     *         request, <code>fileUploadUrls</code> will contain a map of file
     *         names to upload URLs.
     *         </p>
     */
    public java.util.Map<String, String> getFileUploadUrls() {
        return fileUploadUrls;
    }

    /**
     * <p>
     * When the <code>fileMap</code> argument is provided in the request,
     * <code>fileUploadUrls</code> will contain a map of file names to upload
     * URLs.
     * </p>
     *
     * @param fileUploadUrls <p>
     *            When the <code>fileMap</code> argument is provided in the
     *            request, <code>fileUploadUrls</code> will contain a map of
     *            file names to upload URLs.
     *            </p>
     */
    public void setFileUploadUrls(java.util.Map<String, String> fileUploadUrls) {
        this.fileUploadUrls = fileUploadUrls;
    }

    /**
     * <p>
     * When the <code>fileMap</code> argument is provided in the request,
     * <code>fileUploadUrls</code> will contain a map of file names to upload
     * URLs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileUploadUrls <p>
     *            When the <code>fileMap</code> argument is provided in the
     *            request, <code>fileUploadUrls</code> will contain a map of
     *            file names to upload URLs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentResult withFileUploadUrls(java.util.Map<String, String> fileUploadUrls) {
        this.fileUploadUrls = fileUploadUrls;
        return this;
    }

    /**
     * <p>
     * When the <code>fileMap</code> argument is provided in the request,
     * <code>fileUploadUrls</code> will contain a map of file names to upload
     * URLs.
     * </p>
     * <p>
     * The method adds a new key-value pair into fileUploadUrls parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into fileUploadUrls.
     * @param value The corresponding value of the entry to be added into
     *            fileUploadUrls.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentResult addfileUploadUrlsEntry(String key, String value) {
        if (null == this.fileUploadUrls) {
            this.fileUploadUrls = new java.util.HashMap<String, String>();
        }
        if (this.fileUploadUrls.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.fileUploadUrls.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into fileUploadUrls.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateDeploymentResult clearfileUploadUrlsEntries() {
        this.fileUploadUrls = null;
        return this;
    }

    /**
     * <p>
     * When the <code>fileMap</code> argument is not provided in the request,
     * this <code>zipUploadUrl</code> is returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         When the <code>fileMap</code> argument is not provided in the
     *         request, this <code>zipUploadUrl</code> is returned.
     *         </p>
     */
    public String getZipUploadUrl() {
        return zipUploadUrl;
    }

    /**
     * <p>
     * When the <code>fileMap</code> argument is not provided in the request,
     * this <code>zipUploadUrl</code> is returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param zipUploadUrl <p>
     *            When the <code>fileMap</code> argument is not provided in the
     *            request, this <code>zipUploadUrl</code> is returned.
     *            </p>
     */
    public void setZipUploadUrl(String zipUploadUrl) {
        this.zipUploadUrl = zipUploadUrl;
    }

    /**
     * <p>
     * When the <code>fileMap</code> argument is not provided in the request,
     * this <code>zipUploadUrl</code> is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param zipUploadUrl <p>
     *            When the <code>fileMap</code> argument is not provided in the
     *            request, this <code>zipUploadUrl</code> is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentResult withZipUploadUrl(String zipUploadUrl) {
        this.zipUploadUrl = zipUploadUrl;
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
        if (getJobId() != null)
            sb.append("jobId: " + getJobId() + ",");
        if (getFileUploadUrls() != null)
            sb.append("fileUploadUrls: " + getFileUploadUrls() + ",");
        if (getZipUploadUrl() != null)
            sb.append("zipUploadUrl: " + getZipUploadUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode
                + ((getFileUploadUrls() == null) ? 0 : getFileUploadUrls().hashCode());
        hashCode = prime * hashCode
                + ((getZipUploadUrl() == null) ? 0 : getZipUploadUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentResult == false)
            return false;
        CreateDeploymentResult other = (CreateDeploymentResult) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getFileUploadUrls() == null ^ this.getFileUploadUrls() == null)
            return false;
        if (other.getFileUploadUrls() != null
                && other.getFileUploadUrls().equals(this.getFileUploadUrls()) == false)
            return false;
        if (other.getZipUploadUrl() == null ^ this.getZipUploadUrl() == null)
            return false;
        if (other.getZipUploadUrl() != null
                && other.getZipUploadUrl().equals(this.getZipUploadUrl()) == false)
            return false;
        return true;
    }
}

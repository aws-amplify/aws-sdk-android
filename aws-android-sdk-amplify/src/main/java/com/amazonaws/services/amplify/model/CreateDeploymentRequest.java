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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a deployment for a manually deployed Amplify app. Manually deployed
 * apps are not connected to a repository.
 * </p>
 */
public class CreateDeploymentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String appId;

    /**
     * <p>
     * The name for the branch, for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String branchName;

    /**
     * <p>
     * An optional file map that contains the file name as the key and the file
     * content md5 hash as the value. If this argument is provided, the service
     * will generate a unique upload URL per file. Otherwise, the service will
     * only generate a single upload URL for the zipped files.
     * </p>
     */
    private java.util.Map<String, String> fileMap;

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The unique ID for an Amplify app.
     *         </p>
     */
    public String getAppId() {
        return appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param appId <p>
     *            The unique ID for an Amplify app.
     *            </p>
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param appId <p>
     *            The unique ID for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * <p>
     * The name for the branch, for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name for the branch, for the job.
     *         </p>
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * <p>
     * The name for the branch, for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param branchName <p>
     *            The name for the branch, for the job.
     *            </p>
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name for the branch, for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param branchName <p>
     *            The name for the branch, for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * <p>
     * An optional file map that contains the file name as the key and the file
     * content md5 hash as the value. If this argument is provided, the service
     * will generate a unique upload URL per file. Otherwise, the service will
     * only generate a single upload URL for the zipped files.
     * </p>
     *
     * @return <p>
     *         An optional file map that contains the file name as the key and
     *         the file content md5 hash as the value. If this argument is
     *         provided, the service will generate a unique upload URL per file.
     *         Otherwise, the service will only generate a single upload URL for
     *         the zipped files.
     *         </p>
     */
    public java.util.Map<String, String> getFileMap() {
        return fileMap;
    }

    /**
     * <p>
     * An optional file map that contains the file name as the key and the file
     * content md5 hash as the value. If this argument is provided, the service
     * will generate a unique upload URL per file. Otherwise, the service will
     * only generate a single upload URL for the zipped files.
     * </p>
     *
     * @param fileMap <p>
     *            An optional file map that contains the file name as the key
     *            and the file content md5 hash as the value. If this argument
     *            is provided, the service will generate a unique upload URL per
     *            file. Otherwise, the service will only generate a single
     *            upload URL for the zipped files.
     *            </p>
     */
    public void setFileMap(java.util.Map<String, String> fileMap) {
        this.fileMap = fileMap;
    }

    /**
     * <p>
     * An optional file map that contains the file name as the key and the file
     * content md5 hash as the value. If this argument is provided, the service
     * will generate a unique upload URL per file. Otherwise, the service will
     * only generate a single upload URL for the zipped files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileMap <p>
     *            An optional file map that contains the file name as the key
     *            and the file content md5 hash as the value. If this argument
     *            is provided, the service will generate a unique upload URL per
     *            file. Otherwise, the service will only generate a single
     *            upload URL for the zipped files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withFileMap(java.util.Map<String, String> fileMap) {
        this.fileMap = fileMap;
        return this;
    }

    /**
     * <p>
     * An optional file map that contains the file name as the key and the file
     * content md5 hash as the value. If this argument is provided, the service
     * will generate a unique upload URL per file. Otherwise, the service will
     * only generate a single upload URL for the zipped files.
     * </p>
     * <p>
     * The method adds a new key-value pair into fileMap parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into fileMap.
     * @param value The corresponding value of the entry to be added into
     *            fileMap.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest addfileMapEntry(String key, String value) {
        if (null == this.fileMap) {
            this.fileMap = new java.util.HashMap<String, String>();
        }
        if (this.fileMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.fileMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into fileMap.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateDeploymentRequest clearfileMapEntries() {
        this.fileMap = null;
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
        if (getAppId() != null)
            sb.append("appId: " + getAppId() + ",");
        if (getBranchName() != null)
            sb.append("branchName: " + getBranchName() + ",");
        if (getFileMap() != null)
            sb.append("fileMap: " + getFileMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getFileMap() == null) ? 0 : getFileMap().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentRequest == false)
            return false;
        CreateDeploymentRequest other = (CreateDeploymentRequest) obj;

        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null
                && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getFileMap() == null ^ this.getFileMap() == null)
            return false;
        if (other.getFileMap() != null && other.getFileMap().equals(this.getFileMap()) == false)
            return false;
        return true;
    }
}

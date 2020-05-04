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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


/**
 * <p>Contains the information required to locate a manifest object.</p>
 */
public class JobManifestLocation implements Serializable {
    /**
     * <p>The Amazon Resource Name (ARN) for a manifest object.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>arn:[^:]+:s3:.*<br/>
     */
    private String objectArn;

    /**
     * <p>The optional version ID to identify a specific version of the manifest object.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String objectVersionId;

    /**
     * <p>The ETag for the specified manifest object.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String eTag;

    /**
     * <p>The Amazon Resource Name (ARN) for a manifest object.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>arn:[^:]+:s3:.*<br/>
     *
     * @return <p>The Amazon Resource Name (ARN) for a manifest object.</p>
     */
    public String getObjectArn() {
        return objectArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for a manifest object.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>arn:[^:]+:s3:.*<br/>
     *
     * @param objectArn <p>The Amazon Resource Name (ARN) for a manifest object.</p>
     */
    public void setObjectArn(String objectArn) {
        this.objectArn = objectArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for a manifest object.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>arn:[^:]+:s3:.*<br/>
     *
     * @param objectArn <p>The Amazon Resource Name (ARN) for a manifest object.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobManifestLocation withObjectArn(String objectArn) {
        this.objectArn = objectArn;
        return this;
    }

    /**
     * <p>The optional version ID to identify a specific version of the manifest object.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>The optional version ID to identify a specific version of the manifest object.</p>
     */
    public String getObjectVersionId() {
        return objectVersionId;
    }

    /**
     * <p>The optional version ID to identify a specific version of the manifest object.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param objectVersionId <p>The optional version ID to identify a specific version of the manifest object.</p>
     */
    public void setObjectVersionId(String objectVersionId) {
        this.objectVersionId = objectVersionId;
    }

    /**
     * <p>The optional version ID to identify a specific version of the manifest object.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param objectVersionId <p>The optional version ID to identify a specific version of the manifest object.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobManifestLocation withObjectVersionId(String objectVersionId) {
        this.objectVersionId = objectVersionId;
        return this;
    }

    /**
     * <p>The ETag for the specified manifest object.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>The ETag for the specified manifest object.</p>
     */
    public String getETag() {
        return eTag;
    }

    /**
     * <p>The ETag for the specified manifest object.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param eTag <p>The ETag for the specified manifest object.</p>
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>The ETag for the specified manifest object.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param eTag <p>The ETag for the specified manifest object.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobManifestLocation withETag(String eTag) {
        this.eTag = eTag;
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
        if (getObjectArn() != null) sb.append("ObjectArn: " + getObjectArn() + ",");
        if (getObjectVersionId() != null) sb.append("ObjectVersionId: " + getObjectVersionId() + ",");
        if (getETag() != null) sb.append("ETag: " + getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectArn() == null) ? 0 : getObjectArn().hashCode());
        hashCode = prime * hashCode + ((getObjectVersionId() == null) ? 0 : getObjectVersionId().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof JobManifestLocation == false) return false;
        JobManifestLocation other = (JobManifestLocation)obj;

        if (other.getObjectArn() == null ^ this.getObjectArn() == null) return false;
        if (other.getObjectArn() != null && other.getObjectArn().equals(this.getObjectArn()) == false) return false;
        if (other.getObjectVersionId() == null ^ this.getObjectVersionId() == null) return false;
        if (other.getObjectVersionId() != null && other.getObjectVersionId().equals(this.getObjectVersionId()) == false) return false;
        if (other.getETag() == null ^ this.getETag() == null) return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false) return false;
        return true;
    }
}

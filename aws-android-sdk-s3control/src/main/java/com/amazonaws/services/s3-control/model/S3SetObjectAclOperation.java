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
 * <p>Contains the configuration parameters for a Set Object ACL operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object acl API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUTacl.html">PUT Object acl</a>.</p>
 */
public class S3SetObjectAclOperation implements Serializable {
    /**
     * <p/>
     */
    private S3AccessControlPolicy accessControlPolicy;

    /**
     * <p/>
     *
     * @return <p/>
     */
    public S3AccessControlPolicy getAccessControlPolicy() {
        return accessControlPolicy;
    }

    /**
     * <p/>
     *
     * @param accessControlPolicy <p/>
     */
    public void setAccessControlPolicy(S3AccessControlPolicy accessControlPolicy) {
        this.accessControlPolicy = accessControlPolicy;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessControlPolicy <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3SetObjectAclOperation withAccessControlPolicy(S3AccessControlPolicy accessControlPolicy) {
        this.accessControlPolicy = accessControlPolicy;
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
        if (getAccessControlPolicy() != null) sb.append("AccessControlPolicy: " + getAccessControlPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessControlPolicy() == null) ? 0 : getAccessControlPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3SetObjectAclOperation == false) return false;
        S3SetObjectAclOperation other = (S3SetObjectAclOperation)obj;

        if (other.getAccessControlPolicy() == null ^ this.getAccessControlPolicy() == null) return false;
        if (other.getAccessControlPolicy() != null && other.getAccessControlPolicy().equals(this.getAccessControlPolicy()) == false) return false;
        return true;
    }
}

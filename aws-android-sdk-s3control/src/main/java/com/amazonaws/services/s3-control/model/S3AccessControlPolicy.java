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
 * <p/>
 */
public class S3AccessControlPolicy implements Serializable {
    /**
     * <p/>
     */
    private S3AccessControlList accessControlList;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write, aws-exec-read, authenticated-read, bucket-owner-read, bucket-owner-full-control
     */
    private String cannedAccessControlList;

    /**
     * <p/>
     *
     * @return <p/>
     */
    public S3AccessControlList getAccessControlList() {
        return accessControlList;
    }

    /**
     * <p/>
     *
     * @param accessControlList <p/>
     */
    public void setAccessControlList(S3AccessControlList accessControlList) {
        this.accessControlList = accessControlList;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessControlList <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3AccessControlPolicy withAccessControlList(S3AccessControlList accessControlList) {
        this.accessControlList = accessControlList;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write, aws-exec-read, authenticated-read, bucket-owner-read, bucket-owner-full-control
     *
     * @return <p/>
     *
     * @see S3CannedAccessControlList
     */
    public String getCannedAccessControlList() {
        return cannedAccessControlList;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write, aws-exec-read, authenticated-read, bucket-owner-read, bucket-owner-full-control
     *
     * @param cannedAccessControlList <p/>
     *
     * @see S3CannedAccessControlList
     */
    public void setCannedAccessControlList(String cannedAccessControlList) {
        this.cannedAccessControlList = cannedAccessControlList;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write, aws-exec-read, authenticated-read, bucket-owner-read, bucket-owner-full-control
     *
     * @param cannedAccessControlList <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3CannedAccessControlList
     */
    public S3AccessControlPolicy withCannedAccessControlList(String cannedAccessControlList) {
        this.cannedAccessControlList = cannedAccessControlList;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write, aws-exec-read, authenticated-read, bucket-owner-read, bucket-owner-full-control
     *
     * @param cannedAccessControlList <p/>
     *
     * @see S3CannedAccessControlList
     */
    public void setCannedAccessControlList(S3CannedAccessControlList cannedAccessControlList) {
        this.cannedAccessControlList = cannedAccessControlList.toString();
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write, aws-exec-read, authenticated-read, bucket-owner-read, bucket-owner-full-control
     *
     * @param cannedAccessControlList <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3CannedAccessControlList
     */
    public S3AccessControlPolicy withCannedAccessControlList(S3CannedAccessControlList cannedAccessControlList) {
        this.cannedAccessControlList = cannedAccessControlList.toString();
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
        if (getAccessControlList() != null) sb.append("AccessControlList: " + getAccessControlList() + ",");
        if (getCannedAccessControlList() != null) sb.append("CannedAccessControlList: " + getCannedAccessControlList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessControlList() == null) ? 0 : getAccessControlList().hashCode());
        hashCode = prime * hashCode + ((getCannedAccessControlList() == null) ? 0 : getCannedAccessControlList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3AccessControlPolicy == false) return false;
        S3AccessControlPolicy other = (S3AccessControlPolicy)obj;

        if (other.getAccessControlList() == null ^ this.getAccessControlList() == null) return false;
        if (other.getAccessControlList() != null && other.getAccessControlList().equals(this.getAccessControlList()) == false) return false;
        if (other.getCannedAccessControlList() == null ^ this.getCannedAccessControlList() == null) return false;
        if (other.getCannedAccessControlList() != null && other.getCannedAccessControlList().equals(this.getCannedAccessControlList()) == false) return false;
        return true;
    }
}

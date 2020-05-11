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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * User accounts whose documents should be indexed.
 * </p>
 */
public class OneDriveUsers implements Serializable {
    /**
     * <p>
     * A list of users whose documents should be indexed. Specify the user names
     * in email format, for example, <code>username@tenantdomain</code>. If you
     * need to index the documents of more than 100 users, use the
     * <code>OneDriveUserS3Path</code> field to specify the location of a file
     * containing a list of users.
     * </p>
     */
    private java.util.List<String> oneDriveUserList;

    /**
     * <p>
     * The S3 bucket location of a file containing a list of users whose
     * documents should be indexed.
     * </p>
     */
    private S3Path oneDriveUserS3Path;

    /**
     * <p>
     * A list of users whose documents should be indexed. Specify the user names
     * in email format, for example, <code>username@tenantdomain</code>. If you
     * need to index the documents of more than 100 users, use the
     * <code>OneDriveUserS3Path</code> field to specify the location of a file
     * containing a list of users.
     * </p>
     *
     * @return <p>
     *         A list of users whose documents should be indexed. Specify the
     *         user names in email format, for example,
     *         <code>username@tenantdomain</code>. If you need to index the
     *         documents of more than 100 users, use the
     *         <code>OneDriveUserS3Path</code> field to specify the location of
     *         a file containing a list of users.
     *         </p>
     */
    public java.util.List<String> getOneDriveUserList() {
        return oneDriveUserList;
    }

    /**
     * <p>
     * A list of users whose documents should be indexed. Specify the user names
     * in email format, for example, <code>username@tenantdomain</code>. If you
     * need to index the documents of more than 100 users, use the
     * <code>OneDriveUserS3Path</code> field to specify the location of a file
     * containing a list of users.
     * </p>
     *
     * @param oneDriveUserList <p>
     *            A list of users whose documents should be indexed. Specify the
     *            user names in email format, for example,
     *            <code>username@tenantdomain</code>. If you need to index the
     *            documents of more than 100 users, use the
     *            <code>OneDriveUserS3Path</code> field to specify the location
     *            of a file containing a list of users.
     *            </p>
     */
    public void setOneDriveUserList(java.util.Collection<String> oneDriveUserList) {
        if (oneDriveUserList == null) {
            this.oneDriveUserList = null;
            return;
        }

        this.oneDriveUserList = new java.util.ArrayList<String>(oneDriveUserList);
    }

    /**
     * <p>
     * A list of users whose documents should be indexed. Specify the user names
     * in email format, for example, <code>username@tenantdomain</code>. If you
     * need to index the documents of more than 100 users, use the
     * <code>OneDriveUserS3Path</code> field to specify the location of a file
     * containing a list of users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param oneDriveUserList <p>
     *            A list of users whose documents should be indexed. Specify the
     *            user names in email format, for example,
     *            <code>username@tenantdomain</code>. If you need to index the
     *            documents of more than 100 users, use the
     *            <code>OneDriveUserS3Path</code> field to specify the location
     *            of a file containing a list of users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OneDriveUsers withOneDriveUserList(String... oneDriveUserList) {
        if (getOneDriveUserList() == null) {
            this.oneDriveUserList = new java.util.ArrayList<String>(oneDriveUserList.length);
        }
        for (String value : oneDriveUserList) {
            this.oneDriveUserList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of users whose documents should be indexed. Specify the user names
     * in email format, for example, <code>username@tenantdomain</code>. If you
     * need to index the documents of more than 100 users, use the
     * <code>OneDriveUserS3Path</code> field to specify the location of a file
     * containing a list of users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param oneDriveUserList <p>
     *            A list of users whose documents should be indexed. Specify the
     *            user names in email format, for example,
     *            <code>username@tenantdomain</code>. If you need to index the
     *            documents of more than 100 users, use the
     *            <code>OneDriveUserS3Path</code> field to specify the location
     *            of a file containing a list of users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OneDriveUsers withOneDriveUserList(java.util.Collection<String> oneDriveUserList) {
        setOneDriveUserList(oneDriveUserList);
        return this;
    }

    /**
     * <p>
     * The S3 bucket location of a file containing a list of users whose
     * documents should be indexed.
     * </p>
     *
     * @return <p>
     *         The S3 bucket location of a file containing a list of users whose
     *         documents should be indexed.
     *         </p>
     */
    public S3Path getOneDriveUserS3Path() {
        return oneDriveUserS3Path;
    }

    /**
     * <p>
     * The S3 bucket location of a file containing a list of users whose
     * documents should be indexed.
     * </p>
     *
     * @param oneDriveUserS3Path <p>
     *            The S3 bucket location of a file containing a list of users
     *            whose documents should be indexed.
     *            </p>
     */
    public void setOneDriveUserS3Path(S3Path oneDriveUserS3Path) {
        this.oneDriveUserS3Path = oneDriveUserS3Path;
    }

    /**
     * <p>
     * The S3 bucket location of a file containing a list of users whose
     * documents should be indexed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param oneDriveUserS3Path <p>
     *            The S3 bucket location of a file containing a list of users
     *            whose documents should be indexed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OneDriveUsers withOneDriveUserS3Path(S3Path oneDriveUserS3Path) {
        this.oneDriveUserS3Path = oneDriveUserS3Path;
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
        if (getOneDriveUserList() != null)
            sb.append("OneDriveUserList: " + getOneDriveUserList() + ",");
        if (getOneDriveUserS3Path() != null)
            sb.append("OneDriveUserS3Path: " + getOneDriveUserS3Path());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOneDriveUserList() == null) ? 0 : getOneDriveUserList().hashCode());
        hashCode = prime * hashCode
                + ((getOneDriveUserS3Path() == null) ? 0 : getOneDriveUserS3Path().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OneDriveUsers == false)
            return false;
        OneDriveUsers other = (OneDriveUsers) obj;

        if (other.getOneDriveUserList() == null ^ this.getOneDriveUserList() == null)
            return false;
        if (other.getOneDriveUserList() != null
                && other.getOneDriveUserList().equals(this.getOneDriveUserList()) == false)
            return false;
        if (other.getOneDriveUserS3Path() == null ^ this.getOneDriveUserS3Path() == null)
            return false;
        if (other.getOneDriveUserS3Path() != null
                && other.getOneDriveUserS3Path().equals(this.getOneDriveUserS3Path()) == false)
            return false;
        return true;
    }
}

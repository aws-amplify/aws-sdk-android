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
 * Access Control List files for the documents in a data source.
 * </p>
 */
public class AccessControlListConfiguration implements Serializable {
    /**
     * <p>
     * Path to the AWS S3 bucket that contains the ACL files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String keyPath;

    /**
     * <p>
     * Path to the AWS S3 bucket that contains the ACL files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Path to the AWS S3 bucket that contains the ACL files.
     *         </p>
     */
    public String getKeyPath() {
        return keyPath;
    }

    /**
     * <p>
     * Path to the AWS S3 bucket that contains the ACL files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param keyPath <p>
     *            Path to the AWS S3 bucket that contains the ACL files.
     *            </p>
     */
    public void setKeyPath(String keyPath) {
        this.keyPath = keyPath;
    }

    /**
     * <p>
     * Path to the AWS S3 bucket that contains the ACL files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param keyPath <p>
     *            Path to the AWS S3 bucket that contains the ACL files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessControlListConfiguration withKeyPath(String keyPath) {
        this.keyPath = keyPath;
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
        if (getKeyPath() != null)
            sb.append("KeyPath: " + getKeyPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyPath() == null) ? 0 : getKeyPath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessControlListConfiguration == false)
            return false;
        AccessControlListConfiguration other = (AccessControlListConfiguration) obj;

        if (other.getKeyPath() == null ^ this.getKeyPath() == null)
            return false;
        if (other.getKeyPath() != null && other.getKeyPath().equals(this.getKeyPath()) == false)
            return false;
        return true;
    }
}

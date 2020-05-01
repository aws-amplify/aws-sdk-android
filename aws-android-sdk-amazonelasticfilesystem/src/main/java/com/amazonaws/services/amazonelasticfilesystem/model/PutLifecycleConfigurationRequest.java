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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Enables lifecycle management by creating a new
 * <code>LifecycleConfiguration</code> object. A
 * <code>LifecycleConfiguration</code> object defines when files in an Amazon
 * EFS file system are automatically transitioned to the lower-cost EFS
 * Infrequent Access (IA) storage class. A <code>LifecycleConfiguration</code>
 * applies to all files in a file system.
 * </p>
 * <p>
 * Each Amazon EFS file system supports one lifecycle configuration, which
 * applies to all files in the file system. If a
 * <code>LifecycleConfiguration</code> object already exists for the specified
 * file system, a <code>PutLifecycleConfiguration</code> call modifies the
 * existing configuration. A <code>PutLifecycleConfiguration</code> call with an
 * empty <code>LifecyclePolicies</code> array in the request body deletes any
 * existing <code>LifecycleConfiguration</code> and disables lifecycle
 * management.
 * </p>
 * <p>
 * In the request, specify the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The ID for the file system for which you are enabling, disabling, or
 * modifying lifecycle management.
 * </p>
 * </li>
 * <li>
 * <p>
 * A <code>LifecyclePolicies</code> array of <code>LifecyclePolicy</code>
 * objects that define when files are moved to the IA storage class. The array
 * can contain only one <code>LifecyclePolicy</code> item.
 * </p>
 * </li>
 * </ul>
 * <p>
 * This operation requires permissions for the
 * <code>elasticfilesystem:PutLifecycleConfiguration</code> operation.
 * </p>
 * <p>
 * To apply a <code>LifecycleConfiguration</code> object to an encrypted file
 * system, you need the same AWS Key Management Service (AWS KMS) permissions as
 * when you created the encrypted file system.
 * </p>
 */
public class PutLifecycleConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the file system for which you are creating the
     * <code>LifecycleConfiguration</code> object (String).
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * An array of <code>LifecyclePolicy</code> objects that define the file
     * system's <code>LifecycleConfiguration</code> object. A
     * <code>LifecycleConfiguration</code> object tells lifecycle management
     * when to transition files from the Standard storage class to the
     * Infrequent Access storage class.
     * </p>
     */
    private java.util.List<LifecyclePolicy> lifecyclePolicies;

    /**
     * <p>
     * The ID of the file system for which you are creating the
     * <code>LifecycleConfiguration</code> object (String).
     * </p>
     *
     * @return <p>
     *         The ID of the file system for which you are creating the
     *         <code>LifecycleConfiguration</code> object (String).
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system for which you are creating the
     * <code>LifecycleConfiguration</code> object (String).
     * </p>
     *
     * @param fileSystemId <p>
     *            The ID of the file system for which you are creating the
     *            <code>LifecycleConfiguration</code> object (String).
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system for which you are creating the
     * <code>LifecycleConfiguration</code> object (String).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemId <p>
     *            The ID of the file system for which you are creating the
     *            <code>LifecycleConfiguration</code> object (String).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLifecycleConfigurationRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * An array of <code>LifecyclePolicy</code> objects that define the file
     * system's <code>LifecycleConfiguration</code> object. A
     * <code>LifecycleConfiguration</code> object tells lifecycle management
     * when to transition files from the Standard storage class to the
     * Infrequent Access storage class.
     * </p>
     *
     * @return <p>
     *         An array of <code>LifecyclePolicy</code> objects that define the
     *         file system's <code>LifecycleConfiguration</code> object. A
     *         <code>LifecycleConfiguration</code> object tells lifecycle
     *         management when to transition files from the Standard storage
     *         class to the Infrequent Access storage class.
     *         </p>
     */
    public java.util.List<LifecyclePolicy> getLifecyclePolicies() {
        return lifecyclePolicies;
    }

    /**
     * <p>
     * An array of <code>LifecyclePolicy</code> objects that define the file
     * system's <code>LifecycleConfiguration</code> object. A
     * <code>LifecycleConfiguration</code> object tells lifecycle management
     * when to transition files from the Standard storage class to the
     * Infrequent Access storage class.
     * </p>
     *
     * @param lifecyclePolicies <p>
     *            An array of <code>LifecyclePolicy</code> objects that define
     *            the file system's <code>LifecycleConfiguration</code> object.
     *            A <code>LifecycleConfiguration</code> object tells lifecycle
     *            management when to transition files from the Standard storage
     *            class to the Infrequent Access storage class.
     *            </p>
     */
    public void setLifecyclePolicies(java.util.Collection<LifecyclePolicy> lifecyclePolicies) {
        if (lifecyclePolicies == null) {
            this.lifecyclePolicies = null;
            return;
        }

        this.lifecyclePolicies = new java.util.ArrayList<LifecyclePolicy>(lifecyclePolicies);
    }

    /**
     * <p>
     * An array of <code>LifecyclePolicy</code> objects that define the file
     * system's <code>LifecycleConfiguration</code> object. A
     * <code>LifecycleConfiguration</code> object tells lifecycle management
     * when to transition files from the Standard storage class to the
     * Infrequent Access storage class.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecyclePolicies <p>
     *            An array of <code>LifecyclePolicy</code> objects that define
     *            the file system's <code>LifecycleConfiguration</code> object.
     *            A <code>LifecycleConfiguration</code> object tells lifecycle
     *            management when to transition files from the Standard storage
     *            class to the Infrequent Access storage class.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLifecycleConfigurationRequest withLifecyclePolicies(
            LifecyclePolicy... lifecyclePolicies) {
        if (getLifecyclePolicies() == null) {
            this.lifecyclePolicies = new java.util.ArrayList<LifecyclePolicy>(
                    lifecyclePolicies.length);
        }
        for (LifecyclePolicy value : lifecyclePolicies) {
            this.lifecyclePolicies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>LifecyclePolicy</code> objects that define the file
     * system's <code>LifecycleConfiguration</code> object. A
     * <code>LifecycleConfiguration</code> object tells lifecycle management
     * when to transition files from the Standard storage class to the
     * Infrequent Access storage class.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecyclePolicies <p>
     *            An array of <code>LifecyclePolicy</code> objects that define
     *            the file system's <code>LifecycleConfiguration</code> object.
     *            A <code>LifecycleConfiguration</code> object tells lifecycle
     *            management when to transition files from the Standard storage
     *            class to the Infrequent Access storage class.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLifecycleConfigurationRequest withLifecyclePolicies(
            java.util.Collection<LifecyclePolicy> lifecyclePolicies) {
        setLifecyclePolicies(lifecyclePolicies);
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getLifecyclePolicies() != null)
            sb.append("LifecyclePolicies: " + getLifecyclePolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode
                + ((getLifecyclePolicies() == null) ? 0 : getLifecyclePolicies().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLifecycleConfigurationRequest == false)
            return false;
        PutLifecycleConfigurationRequest other = (PutLifecycleConfigurationRequest) obj;

        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getLifecyclePolicies() == null ^ this.getLifecyclePolicies() == null)
            return false;
        if (other.getLifecyclePolicies() != null
                && other.getLifecyclePolicies().equals(this.getLifecyclePolicies()) == false)
            return false;
        return true;
    }
}

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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates sample findings.
 * </p>
 */
public class CreateSampleFindingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An array that lists one or more types of findings to include in the set
     * of sample findings. Currently, the only supported value is
     * Policy:IAMUser/S3BucketEncryptionDisabled.
     * </p>
     */
    private java.util.List<String> findingTypes;

    /**
     * <p>
     * An array that lists one or more types of findings to include in the set
     * of sample findings. Currently, the only supported value is
     * Policy:IAMUser/S3BucketEncryptionDisabled.
     * </p>
     *
     * @return <p>
     *         An array that lists one or more types of findings to include in
     *         the set of sample findings. Currently, the only supported value
     *         is Policy:IAMUser/S3BucketEncryptionDisabled.
     *         </p>
     */
    public java.util.List<String> getFindingTypes() {
        return findingTypes;
    }

    /**
     * <p>
     * An array that lists one or more types of findings to include in the set
     * of sample findings. Currently, the only supported value is
     * Policy:IAMUser/S3BucketEncryptionDisabled.
     * </p>
     *
     * @param findingTypes <p>
     *            An array that lists one or more types of findings to include
     *            in the set of sample findings. Currently, the only supported
     *            value is Policy:IAMUser/S3BucketEncryptionDisabled.
     *            </p>
     */
    public void setFindingTypes(java.util.Collection<String> findingTypes) {
        if (findingTypes == null) {
            this.findingTypes = null;
            return;
        }

        this.findingTypes = new java.util.ArrayList<String>(findingTypes);
    }

    /**
     * <p>
     * An array that lists one or more types of findings to include in the set
     * of sample findings. Currently, the only supported value is
     * Policy:IAMUser/S3BucketEncryptionDisabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingTypes <p>
     *            An array that lists one or more types of findings to include
     *            in the set of sample findings. Currently, the only supported
     *            value is Policy:IAMUser/S3BucketEncryptionDisabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSampleFindingsRequest withFindingTypes(String... findingTypes) {
        if (getFindingTypes() == null) {
            this.findingTypes = new java.util.ArrayList<String>(findingTypes.length);
        }
        for (String value : findingTypes) {
            this.findingTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array that lists one or more types of findings to include in the set
     * of sample findings. Currently, the only supported value is
     * Policy:IAMUser/S3BucketEncryptionDisabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingTypes <p>
     *            An array that lists one or more types of findings to include
     *            in the set of sample findings. Currently, the only supported
     *            value is Policy:IAMUser/S3BucketEncryptionDisabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSampleFindingsRequest withFindingTypes(java.util.Collection<String> findingTypes) {
        setFindingTypes(findingTypes);
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
        if (getFindingTypes() != null)
            sb.append("findingTypes: " + getFindingTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFindingTypes() == null) ? 0 : getFindingTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSampleFindingsRequest == false)
            return false;
        CreateSampleFindingsRequest other = (CreateSampleFindingsRequest) obj;

        if (other.getFindingTypes() == null ^ this.getFindingTypes() == null)
            return false;
        if (other.getFindingTypes() != null
                && other.getFindingTypes().equals(this.getFindingTypes()) == false)
            return false;
        return true;
    }
}

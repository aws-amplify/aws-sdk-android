/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class DescribeDocumentClassifierResult implements Serializable {
    /**
     * <p>
     * An object that contains the properties associated with a document
     * classifier.
     * </p>
     */
    private DocumentClassifierProperties documentClassifierProperties;

    /**
     * <p>
     * An object that contains the properties associated with a document
     * classifier.
     * </p>
     *
     * @return <p>
     *         An object that contains the properties associated with a document
     *         classifier.
     *         </p>
     */
    public DocumentClassifierProperties getDocumentClassifierProperties() {
        return documentClassifierProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a document
     * classifier.
     * </p>
     *
     * @param documentClassifierProperties <p>
     *            An object that contains the properties associated with a
     *            document classifier.
     *            </p>
     */
    public void setDocumentClassifierProperties(
            DocumentClassifierProperties documentClassifierProperties) {
        this.documentClassifierProperties = documentClassifierProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a document
     * classifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentClassifierProperties <p>
     *            An object that contains the properties associated with a
     *            document classifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDocumentClassifierResult withDocumentClassifierProperties(
            DocumentClassifierProperties documentClassifierProperties) {
        this.documentClassifierProperties = documentClassifierProperties;
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
        if (getDocumentClassifierProperties() != null)
            sb.append("DocumentClassifierProperties: " + getDocumentClassifierProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDocumentClassifierProperties() == null) ? 0
                        : getDocumentClassifierProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDocumentClassifierResult == false)
            return false;
        DescribeDocumentClassifierResult other = (DescribeDocumentClassifierResult) obj;

        if (other.getDocumentClassifierProperties() == null
                ^ this.getDocumentClassifierProperties() == null)
            return false;
        if (other.getDocumentClassifierProperties() != null
                && other.getDocumentClassifierProperties().equals(
                        this.getDocumentClassifierProperties()) == false)
            return false;
        return true;
    }
}

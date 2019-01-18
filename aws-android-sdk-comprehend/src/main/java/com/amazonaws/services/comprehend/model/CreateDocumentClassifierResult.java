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

public class CreateDocumentClassifierResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document-classifier
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String documentClassifierArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document-classifier
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that identifies the document
     *         classifier.
     *         </p>
     */
    public String getDocumentClassifierArn() {
        return documentClassifierArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document-classifier
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param documentClassifierArn <p>
     *            The Amazon Resource Name (ARN) that identifies the document
     *            classifier.
     *            </p>
     */
    public void setDocumentClassifierArn(String documentClassifierArn) {
        this.documentClassifierArn = documentClassifierArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document-classifier
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param documentClassifierArn <p>
     *            The Amazon Resource Name (ARN) that identifies the document
     *            classifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDocumentClassifierResult withDocumentClassifierArn(String documentClassifierArn) {
        this.documentClassifierArn = documentClassifierArn;
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
        if (getDocumentClassifierArn() != null)
            sb.append("DocumentClassifierArn: " + getDocumentClassifierArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDocumentClassifierArn() == null) ? 0 : getDocumentClassifierArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDocumentClassifierResult == false)
            return false;
        CreateDocumentClassifierResult other = (CreateDocumentClassifierResult) obj;

        if (other.getDocumentClassifierArn() == null ^ this.getDocumentClassifierArn() == null)
            return false;
        if (other.getDocumentClassifierArn() != null
                && other.getDocumentClassifierArn().equals(this.getDocumentClassifierArn()) == false)
            return false;
        return true;
    }
}

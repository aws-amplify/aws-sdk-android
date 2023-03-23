/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * Summary information about documents grouped by the same document type.
 * </p>
 */
public class DocumentGroup implements Serializable {
    /**
     * <p>
     * The type of document that Amazon Textract has detected. See <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/lending-response-objects.html"
     * >Analyze Lending Response Objects</a> for a list of all types returned by
     * Textract.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String type;

    /**
     * <p>
     * An array that contains information about the pages of a document, defined
     * by logical boundary.
     * </p>
     */
    private java.util.List<SplitDocument> splitDocuments;

    /**
     * <p>
     * A list of the detected signatures found in a document group.
     * </p>
     */
    private java.util.List<DetectedSignature> detectedSignatures;

    /**
     * <p>
     * A list of any expected signatures not found in a document group.
     * </p>
     */
    private java.util.List<UndetectedSignature> undetectedSignatures;

    /**
     * <p>
     * The type of document that Amazon Textract has detected. See <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/lending-response-objects.html"
     * >Analyze Lending Response Objects</a> for a list of all types returned by
     * Textract.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The type of document that Amazon Textract has detected. See <a
     *         href=
     *         "https://docs.aws.amazon.com/textract/latest/dg/lending-response-objects.html"
     *         >Analyze Lending Response Objects</a> for a list of all types
     *         returned by Textract.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of document that Amazon Textract has detected. See <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/lending-response-objects.html"
     * >Analyze Lending Response Objects</a> for a list of all types returned by
     * Textract.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            The type of document that Amazon Textract has detected. See <a
     *            href=
     *            "https://docs.aws.amazon.com/textract/latest/dg/lending-response-objects.html"
     *            >Analyze Lending Response Objects</a> for a list of all types
     *            returned by Textract.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of document that Amazon Textract has detected. See <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/lending-response-objects.html"
     * >Analyze Lending Response Objects</a> for a list of all types returned by
     * Textract.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            The type of document that Amazon Textract has detected. See <a
     *            href=
     *            "https://docs.aws.amazon.com/textract/latest/dg/lending-response-objects.html"
     *            >Analyze Lending Response Objects</a> for a list of all types
     *            returned by Textract.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentGroup withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * An array that contains information about the pages of a document, defined
     * by logical boundary.
     * </p>
     *
     * @return <p>
     *         An array that contains information about the pages of a document,
     *         defined by logical boundary.
     *         </p>
     */
    public java.util.List<SplitDocument> getSplitDocuments() {
        return splitDocuments;
    }

    /**
     * <p>
     * An array that contains information about the pages of a document, defined
     * by logical boundary.
     * </p>
     *
     * @param splitDocuments <p>
     *            An array that contains information about the pages of a
     *            document, defined by logical boundary.
     *            </p>
     */
    public void setSplitDocuments(java.util.Collection<SplitDocument> splitDocuments) {
        if (splitDocuments == null) {
            this.splitDocuments = null;
            return;
        }

        this.splitDocuments = new java.util.ArrayList<SplitDocument>(splitDocuments);
    }

    /**
     * <p>
     * An array that contains information about the pages of a document, defined
     * by logical boundary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param splitDocuments <p>
     *            An array that contains information about the pages of a
     *            document, defined by logical boundary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentGroup withSplitDocuments(SplitDocument... splitDocuments) {
        if (getSplitDocuments() == null) {
            this.splitDocuments = new java.util.ArrayList<SplitDocument>(splitDocuments.length);
        }
        for (SplitDocument value : splitDocuments) {
            this.splitDocuments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains information about the pages of a document, defined
     * by logical boundary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param splitDocuments <p>
     *            An array that contains information about the pages of a
     *            document, defined by logical boundary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentGroup withSplitDocuments(java.util.Collection<SplitDocument> splitDocuments) {
        setSplitDocuments(splitDocuments);
        return this;
    }

    /**
     * <p>
     * A list of the detected signatures found in a document group.
     * </p>
     *
     * @return <p>
     *         A list of the detected signatures found in a document group.
     *         </p>
     */
    public java.util.List<DetectedSignature> getDetectedSignatures() {
        return detectedSignatures;
    }

    /**
     * <p>
     * A list of the detected signatures found in a document group.
     * </p>
     *
     * @param detectedSignatures <p>
     *            A list of the detected signatures found in a document group.
     *            </p>
     */
    public void setDetectedSignatures(java.util.Collection<DetectedSignature> detectedSignatures) {
        if (detectedSignatures == null) {
            this.detectedSignatures = null;
            return;
        }

        this.detectedSignatures = new java.util.ArrayList<DetectedSignature>(detectedSignatures);
    }

    /**
     * <p>
     * A list of the detected signatures found in a document group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectedSignatures <p>
     *            A list of the detected signatures found in a document group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentGroup withDetectedSignatures(DetectedSignature... detectedSignatures) {
        if (getDetectedSignatures() == null) {
            this.detectedSignatures = new java.util.ArrayList<DetectedSignature>(
                    detectedSignatures.length);
        }
        for (DetectedSignature value : detectedSignatures) {
            this.detectedSignatures.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the detected signatures found in a document group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectedSignatures <p>
     *            A list of the detected signatures found in a document group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentGroup withDetectedSignatures(
            java.util.Collection<DetectedSignature> detectedSignatures) {
        setDetectedSignatures(detectedSignatures);
        return this;
    }

    /**
     * <p>
     * A list of any expected signatures not found in a document group.
     * </p>
     *
     * @return <p>
     *         A list of any expected signatures not found in a document group.
     *         </p>
     */
    public java.util.List<UndetectedSignature> getUndetectedSignatures() {
        return undetectedSignatures;
    }

    /**
     * <p>
     * A list of any expected signatures not found in a document group.
     * </p>
     *
     * @param undetectedSignatures <p>
     *            A list of any expected signatures not found in a document
     *            group.
     *            </p>
     */
    public void setUndetectedSignatures(
            java.util.Collection<UndetectedSignature> undetectedSignatures) {
        if (undetectedSignatures == null) {
            this.undetectedSignatures = null;
            return;
        }

        this.undetectedSignatures = new java.util.ArrayList<UndetectedSignature>(
                undetectedSignatures);
    }

    /**
     * <p>
     * A list of any expected signatures not found in a document group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param undetectedSignatures <p>
     *            A list of any expected signatures not found in a document
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentGroup withUndetectedSignatures(UndetectedSignature... undetectedSignatures) {
        if (getUndetectedSignatures() == null) {
            this.undetectedSignatures = new java.util.ArrayList<UndetectedSignature>(
                    undetectedSignatures.length);
        }
        for (UndetectedSignature value : undetectedSignatures) {
            this.undetectedSignatures.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of any expected signatures not found in a document group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param undetectedSignatures <p>
     *            A list of any expected signatures not found in a document
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentGroup withUndetectedSignatures(
            java.util.Collection<UndetectedSignature> undetectedSignatures) {
        setUndetectedSignatures(undetectedSignatures);
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getSplitDocuments() != null)
            sb.append("SplitDocuments: " + getSplitDocuments() + ",");
        if (getDetectedSignatures() != null)
            sb.append("DetectedSignatures: " + getDetectedSignatures() + ",");
        if (getUndetectedSignatures() != null)
            sb.append("UndetectedSignatures: " + getUndetectedSignatures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getSplitDocuments() == null) ? 0 : getSplitDocuments().hashCode());
        hashCode = prime * hashCode
                + ((getDetectedSignatures() == null) ? 0 : getDetectedSignatures().hashCode());
        hashCode = prime * hashCode
                + ((getUndetectedSignatures() == null) ? 0 : getUndetectedSignatures().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentGroup == false)
            return false;
        DocumentGroup other = (DocumentGroup) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSplitDocuments() == null ^ this.getSplitDocuments() == null)
            return false;
        if (other.getSplitDocuments() != null
                && other.getSplitDocuments().equals(this.getSplitDocuments()) == false)
            return false;
        if (other.getDetectedSignatures() == null ^ this.getDetectedSignatures() == null)
            return false;
        if (other.getDetectedSignatures() != null
                && other.getDetectedSignatures().equals(this.getDetectedSignatures()) == false)
            return false;
        if (other.getUndetectedSignatures() == null ^ this.getUndetectedSignatures() == null)
            return false;
        if (other.getUndetectedSignatures() != null
                && other.getUndetectedSignatures().equals(this.getUndetectedSignatures()) == false)
            return false;
        return true;
    }
}

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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class ClassifyDocumentResult implements Serializable {
    /**
     * <p>
     * The classes used by the document being analyzed. These are used for
     * multi-class trained models. Individual classes are mutually exclusive and
     * each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     */
    private java.util.List<DocumentClass> classes;

    /**
     * <p>
     * The labels used the document being analyzed. These are used for
     * multi-label trained models. Individual labels represent different
     * categories that are related in some manner and are not mutually
     * exclusive. For example, a movie can be just an action movie, or it can be
     * an action movie, a science fiction movie, and a comedy, all at the same
     * time.
     * </p>
     */
    private java.util.List<DocumentLabel> labels;

    /**
     * <p>
     * Extraction information about the document. This field is present in the
     * response only if your request includes the <code>Byte</code> parameter.
     * </p>
     */
    private DocumentMetadata documentMetadata;

    /**
     * <p>
     * The document type for each page in the input document. This field is
     * present in the response only if your request includes the
     * <code>Byte</code> parameter.
     * </p>
     */
    private java.util.List<DocumentTypeListItem> documentType;

    /**
     * <p>
     * Page-level errors that the system detected while processing the input
     * document. The field is empty if the system encountered no errors.
     * </p>
     */
    private java.util.List<ErrorsListItem> errors;

    /**
     * <p>
     * Warnings detected while processing the input document. The response
     * includes a warning if there is a mismatch between the input document type
     * and the model type associated with the endpoint that you specified. The
     * response can also include warnings for individual pages that have a
     * mismatch.
     * </p>
     * <p>
     * The field is empty if the system generated no warnings.
     * </p>
     */
    private java.util.List<WarningsListItem> warnings;

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for
     * multi-class trained models. Individual classes are mutually exclusive and
     * each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     *
     * @return <p>
     *         The classes used by the document being analyzed. These are used
     *         for multi-class trained models. Individual classes are mutually
     *         exclusive and each document is expected to have only a single
     *         class assigned to it. For example, an animal can be a dog or a
     *         cat, but not both at the same time.
     *         </p>
     */
    public java.util.List<DocumentClass> getClasses() {
        return classes;
    }

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for
     * multi-class trained models. Individual classes are mutually exclusive and
     * each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     *
     * @param classes <p>
     *            The classes used by the document being analyzed. These are
     *            used for multi-class trained models. Individual classes are
     *            mutually exclusive and each document is expected to have only
     *            a single class assigned to it. For example, an animal can be a
     *            dog or a cat, but not both at the same time.
     *            </p>
     */
    public void setClasses(java.util.Collection<DocumentClass> classes) {
        if (classes == null) {
            this.classes = null;
            return;
        }

        this.classes = new java.util.ArrayList<DocumentClass>(classes);
    }

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for
     * multi-class trained models. Individual classes are mutually exclusive and
     * each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classes <p>
     *            The classes used by the document being analyzed. These are
     *            used for multi-class trained models. Individual classes are
     *            mutually exclusive and each document is expected to have only
     *            a single class assigned to it. For example, an animal can be a
     *            dog or a cat, but not both at the same time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentResult withClasses(DocumentClass... classes) {
        if (getClasses() == null) {
            this.classes = new java.util.ArrayList<DocumentClass>(classes.length);
        }
        for (DocumentClass value : classes) {
            this.classes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for
     * multi-class trained models. Individual classes are mutually exclusive and
     * each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classes <p>
     *            The classes used by the document being analyzed. These are
     *            used for multi-class trained models. Individual classes are
     *            mutually exclusive and each document is expected to have only
     *            a single class assigned to it. For example, an animal can be a
     *            dog or a cat, but not both at the same time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentResult withClasses(java.util.Collection<DocumentClass> classes) {
        setClasses(classes);
        return this;
    }

    /**
     * <p>
     * The labels used the document being analyzed. These are used for
     * multi-label trained models. Individual labels represent different
     * categories that are related in some manner and are not mutually
     * exclusive. For example, a movie can be just an action movie, or it can be
     * an action movie, a science fiction movie, and a comedy, all at the same
     * time.
     * </p>
     *
     * @return <p>
     *         The labels used the document being analyzed. These are used for
     *         multi-label trained models. Individual labels represent different
     *         categories that are related in some manner and are not mutually
     *         exclusive. For example, a movie can be just an action movie, or
     *         it can be an action movie, a science fiction movie, and a comedy,
     *         all at the same time.
     *         </p>
     */
    public java.util.List<DocumentLabel> getLabels() {
        return labels;
    }

    /**
     * <p>
     * The labels used the document being analyzed. These are used for
     * multi-label trained models. Individual labels represent different
     * categories that are related in some manner and are not mutually
     * exclusive. For example, a movie can be just an action movie, or it can be
     * an action movie, a science fiction movie, and a comedy, all at the same
     * time.
     * </p>
     *
     * @param labels <p>
     *            The labels used the document being analyzed. These are used
     *            for multi-label trained models. Individual labels represent
     *            different categories that are related in some manner and are
     *            not mutually exclusive. For example, a movie can be just an
     *            action movie, or it can be an action movie, a science fiction
     *            movie, and a comedy, all at the same time.
     *            </p>
     */
    public void setLabels(java.util.Collection<DocumentLabel> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<DocumentLabel>(labels);
    }

    /**
     * <p>
     * The labels used the document being analyzed. These are used for
     * multi-label trained models. Individual labels represent different
     * categories that are related in some manner and are not mutually
     * exclusive. For example, a movie can be just an action movie, or it can be
     * an action movie, a science fiction movie, and a comedy, all at the same
     * time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            The labels used the document being analyzed. These are used
     *            for multi-label trained models. Individual labels represent
     *            different categories that are related in some manner and are
     *            not mutually exclusive. For example, a movie can be just an
     *            action movie, or it can be an action movie, a science fiction
     *            movie, and a comedy, all at the same time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentResult withLabels(DocumentLabel... labels) {
        if (getLabels() == null) {
            this.labels = new java.util.ArrayList<DocumentLabel>(labels.length);
        }
        for (DocumentLabel value : labels) {
            this.labels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The labels used the document being analyzed. These are used for
     * multi-label trained models. Individual labels represent different
     * categories that are related in some manner and are not mutually
     * exclusive. For example, a movie can be just an action movie, or it can be
     * an action movie, a science fiction movie, and a comedy, all at the same
     * time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            The labels used the document being analyzed. These are used
     *            for multi-label trained models. Individual labels represent
     *            different categories that are related in some manner and are
     *            not mutually exclusive. For example, a movie can be just an
     *            action movie, or it can be an action movie, a science fiction
     *            movie, and a comedy, all at the same time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentResult withLabels(java.util.Collection<DocumentLabel> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * Extraction information about the document. This field is present in the
     * response only if your request includes the <code>Byte</code> parameter.
     * </p>
     *
     * @return <p>
     *         Extraction information about the document. This field is present
     *         in the response only if your request includes the
     *         <code>Byte</code> parameter.
     *         </p>
     */
    public DocumentMetadata getDocumentMetadata() {
        return documentMetadata;
    }

    /**
     * <p>
     * Extraction information about the document. This field is present in the
     * response only if your request includes the <code>Byte</code> parameter.
     * </p>
     *
     * @param documentMetadata <p>
     *            Extraction information about the document. This field is
     *            present in the response only if your request includes the
     *            <code>Byte</code> parameter.
     *            </p>
     */
    public void setDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
    }

    /**
     * <p>
     * Extraction information about the document. This field is present in the
     * response only if your request includes the <code>Byte</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentMetadata <p>
     *            Extraction information about the document. This field is
     *            present in the response only if your request includes the
     *            <code>Byte</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentResult withDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
        return this;
    }

    /**
     * <p>
     * The document type for each page in the input document. This field is
     * present in the response only if your request includes the
     * <code>Byte</code> parameter.
     * </p>
     *
     * @return <p>
     *         The document type for each page in the input document. This field
     *         is present in the response only if your request includes the
     *         <code>Byte</code> parameter.
     *         </p>
     */
    public java.util.List<DocumentTypeListItem> getDocumentType() {
        return documentType;
    }

    /**
     * <p>
     * The document type for each page in the input document. This field is
     * present in the response only if your request includes the
     * <code>Byte</code> parameter.
     * </p>
     *
     * @param documentType <p>
     *            The document type for each page in the input document. This
     *            field is present in the response only if your request includes
     *            the <code>Byte</code> parameter.
     *            </p>
     */
    public void setDocumentType(java.util.Collection<DocumentTypeListItem> documentType) {
        if (documentType == null) {
            this.documentType = null;
            return;
        }

        this.documentType = new java.util.ArrayList<DocumentTypeListItem>(documentType);
    }

    /**
     * <p>
     * The document type for each page in the input document. This field is
     * present in the response only if your request includes the
     * <code>Byte</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentType <p>
     *            The document type for each page in the input document. This
     *            field is present in the response only if your request includes
     *            the <code>Byte</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentResult withDocumentType(DocumentTypeListItem... documentType) {
        if (getDocumentType() == null) {
            this.documentType = new java.util.ArrayList<DocumentTypeListItem>(documentType.length);
        }
        for (DocumentTypeListItem value : documentType) {
            this.documentType.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The document type for each page in the input document. This field is
     * present in the response only if your request includes the
     * <code>Byte</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentType <p>
     *            The document type for each page in the input document. This
     *            field is present in the response only if your request includes
     *            the <code>Byte</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentResult withDocumentType(
            java.util.Collection<DocumentTypeListItem> documentType) {
        setDocumentType(documentType);
        return this;
    }

    /**
     * <p>
     * Page-level errors that the system detected while processing the input
     * document. The field is empty if the system encountered no errors.
     * </p>
     *
     * @return <p>
     *         Page-level errors that the system detected while processing the
     *         input document. The field is empty if the system encountered no
     *         errors.
     *         </p>
     */
    public java.util.List<ErrorsListItem> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Page-level errors that the system detected while processing the input
     * document. The field is empty if the system encountered no errors.
     * </p>
     *
     * @param errors <p>
     *            Page-level errors that the system detected while processing
     *            the input document. The field is empty if the system
     *            encountered no errors.
     *            </p>
     */
    public void setErrors(java.util.Collection<ErrorsListItem> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<ErrorsListItem>(errors);
    }

    /**
     * <p>
     * Page-level errors that the system detected while processing the input
     * document. The field is empty if the system encountered no errors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Page-level errors that the system detected while processing
     *            the input document. The field is empty if the system
     *            encountered no errors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentResult withErrors(ErrorsListItem... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<ErrorsListItem>(errors.length);
        }
        for (ErrorsListItem value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Page-level errors that the system detected while processing the input
     * document. The field is empty if the system encountered no errors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Page-level errors that the system detected while processing
     *            the input document. The field is empty if the system
     *            encountered no errors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentResult withErrors(java.util.Collection<ErrorsListItem> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * Warnings detected while processing the input document. The response
     * includes a warning if there is a mismatch between the input document type
     * and the model type associated with the endpoint that you specified. The
     * response can also include warnings for individual pages that have a
     * mismatch.
     * </p>
     * <p>
     * The field is empty if the system generated no warnings.
     * </p>
     *
     * @return <p>
     *         Warnings detected while processing the input document. The
     *         response includes a warning if there is a mismatch between the
     *         input document type and the model type associated with the
     *         endpoint that you specified. The response can also include
     *         warnings for individual pages that have a mismatch.
     *         </p>
     *         <p>
     *         The field is empty if the system generated no warnings.
     *         </p>
     */
    public java.util.List<WarningsListItem> getWarnings() {
        return warnings;
    }

    /**
     * <p>
     * Warnings detected while processing the input document. The response
     * includes a warning if there is a mismatch between the input document type
     * and the model type associated with the endpoint that you specified. The
     * response can also include warnings for individual pages that have a
     * mismatch.
     * </p>
     * <p>
     * The field is empty if the system generated no warnings.
     * </p>
     *
     * @param warnings <p>
     *            Warnings detected while processing the input document. The
     *            response includes a warning if there is a mismatch between the
     *            input document type and the model type associated with the
     *            endpoint that you specified. The response can also include
     *            warnings for individual pages that have a mismatch.
     *            </p>
     *            <p>
     *            The field is empty if the system generated no warnings.
     *            </p>
     */
    public void setWarnings(java.util.Collection<WarningsListItem> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new java.util.ArrayList<WarningsListItem>(warnings);
    }

    /**
     * <p>
     * Warnings detected while processing the input document. The response
     * includes a warning if there is a mismatch between the input document type
     * and the model type associated with the endpoint that you specified. The
     * response can also include warnings for individual pages that have a
     * mismatch.
     * </p>
     * <p>
     * The field is empty if the system generated no warnings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warnings <p>
     *            Warnings detected while processing the input document. The
     *            response includes a warning if there is a mismatch between the
     *            input document type and the model type associated with the
     *            endpoint that you specified. The response can also include
     *            warnings for individual pages that have a mismatch.
     *            </p>
     *            <p>
     *            The field is empty if the system generated no warnings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentResult withWarnings(WarningsListItem... warnings) {
        if (getWarnings() == null) {
            this.warnings = new java.util.ArrayList<WarningsListItem>(warnings.length);
        }
        for (WarningsListItem value : warnings) {
            this.warnings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Warnings detected while processing the input document. The response
     * includes a warning if there is a mismatch between the input document type
     * and the model type associated with the endpoint that you specified. The
     * response can also include warnings for individual pages that have a
     * mismatch.
     * </p>
     * <p>
     * The field is empty if the system generated no warnings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warnings <p>
     *            Warnings detected while processing the input document. The
     *            response includes a warning if there is a mismatch between the
     *            input document type and the model type associated with the
     *            endpoint that you specified. The response can also include
     *            warnings for individual pages that have a mismatch.
     *            </p>
     *            <p>
     *            The field is empty if the system generated no warnings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentResult withWarnings(java.util.Collection<WarningsListItem> warnings) {
        setWarnings(warnings);
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
        if (getClasses() != null)
            sb.append("Classes: " + getClasses() + ",");
        if (getLabels() != null)
            sb.append("Labels: " + getLabels() + ",");
        if (getDocumentMetadata() != null)
            sb.append("DocumentMetadata: " + getDocumentMetadata() + ",");
        if (getDocumentType() != null)
            sb.append("DocumentType: " + getDocumentType() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors() + ",");
        if (getWarnings() != null)
            sb.append("Warnings: " + getWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClasses() == null) ? 0 : getClasses().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentMetadata() == null) ? 0 : getDocumentMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassifyDocumentResult == false)
            return false;
        ClassifyDocumentResult other = (ClassifyDocumentResult) obj;

        if (other.getClasses() == null ^ this.getClasses() == null)
            return false;
        if (other.getClasses() != null && other.getClasses().equals(this.getClasses()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getDocumentMetadata() == null ^ this.getDocumentMetadata() == null)
            return false;
        if (other.getDocumentMetadata() != null
                && other.getDocumentMetadata().equals(this.getDocumentMetadata()) == false)
            return false;
        if (other.getDocumentType() == null ^ this.getDocumentType() == null)
            return false;
        if (other.getDocumentType() != null
                && other.getDocumentType().equals(this.getDocumentType()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        return true;
    }
}

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

public class DetectEntitiesResult implements Serializable {
    /**
     * <p>
     * A collection of entities identified in the input text. For each entity,
     * the response provides the entity text, entity type, where the entity text
     * begins and ends, and the level of confidence that Amazon Comprehend has
     * in the detection.
     * </p>
     * <p>
     * If your request uses a custom entity recognition model, Amazon Comprehend
     * detects the entities that the model is trained to recognize. Otherwise,
     * it detects the default entity types. For a list of default entity types,
     * see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html"
     * >Entities</a> in the Comprehend Developer Guide.
     * </p>
     */
    private java.util.List<Entity> entities;

    /**
     * <p>
     * Information about the document, discovered during text extraction. This
     * field is present in the response only if your request used the
     * <code>Byte</code> parameter.
     * </p>
     */
    private DocumentMetadata documentMetadata;

    /**
     * <p>
     * The document type for each page in the input document. This field is
     * present in the response only if your request used the <code>Byte</code>
     * parameter.
     * </p>
     */
    private java.util.List<DocumentTypeListItem> documentType;

    /**
     * <p>
     * Information about each block of text in the input document. Blocks are
     * nested. A page block contains a block for each line of text, which
     * contains a block for each word.
     * </p>
     * <p>
     * The <code>Block</code> content for a Word input document does not include
     * a <code>Geometry</code> field.
     * </p>
     * <p>
     * The <code>Block</code> field is not present in the response for
     * plain-text inputs.
     * </p>
     */
    private java.util.List<Block> blocks;

    /**
     * <p>
     * Page-level errors that the system detected while processing the input
     * document. The field is empty if the system encountered no errors.
     * </p>
     */
    private java.util.List<ErrorsListItem> errors;

    /**
     * <p>
     * A collection of entities identified in the input text. For each entity,
     * the response provides the entity text, entity type, where the entity text
     * begins and ends, and the level of confidence that Amazon Comprehend has
     * in the detection.
     * </p>
     * <p>
     * If your request uses a custom entity recognition model, Amazon Comprehend
     * detects the entities that the model is trained to recognize. Otherwise,
     * it detects the default entity types. For a list of default entity types,
     * see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html"
     * >Entities</a> in the Comprehend Developer Guide.
     * </p>
     *
     * @return <p>
     *         A collection of entities identified in the input text. For each
     *         entity, the response provides the entity text, entity type, where
     *         the entity text begins and ends, and the level of confidence that
     *         Amazon Comprehend has in the detection.
     *         </p>
     *         <p>
     *         If your request uses a custom entity recognition model, Amazon
     *         Comprehend detects the entities that the model is trained to
     *         recognize. Otherwise, it detects the default entity types. For a
     *         list of default entity types, see <a href=
     *         "https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html"
     *         >Entities</a> in the Comprehend Developer Guide.
     *         </p>
     */
    public java.util.List<Entity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * A collection of entities identified in the input text. For each entity,
     * the response provides the entity text, entity type, where the entity text
     * begins and ends, and the level of confidence that Amazon Comprehend has
     * in the detection.
     * </p>
     * <p>
     * If your request uses a custom entity recognition model, Amazon Comprehend
     * detects the entities that the model is trained to recognize. Otherwise,
     * it detects the default entity types. For a list of default entity types,
     * see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html"
     * >Entities</a> in the Comprehend Developer Guide.
     * </p>
     *
     * @param entities <p>
     *            A collection of entities identified in the input text. For
     *            each entity, the response provides the entity text, entity
     *            type, where the entity text begins and ends, and the level of
     *            confidence that Amazon Comprehend has in the detection.
     *            </p>
     *            <p>
     *            If your request uses a custom entity recognition model, Amazon
     *            Comprehend detects the entities that the model is trained to
     *            recognize. Otherwise, it detects the default entity types. For
     *            a list of default entity types, see <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html"
     *            >Entities</a> in the Comprehend Developer Guide.
     *            </p>
     */
    public void setEntities(java.util.Collection<Entity> entities) {
        if (entities == null) {
            this.entities = null;
            return;
        }

        this.entities = new java.util.ArrayList<Entity>(entities);
    }

    /**
     * <p>
     * A collection of entities identified in the input text. For each entity,
     * the response provides the entity text, entity type, where the entity text
     * begins and ends, and the level of confidence that Amazon Comprehend has
     * in the detection.
     * </p>
     * <p>
     * If your request uses a custom entity recognition model, Amazon Comprehend
     * detects the entities that the model is trained to recognize. Otherwise,
     * it detects the default entity types. For a list of default entity types,
     * see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html"
     * >Entities</a> in the Comprehend Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entities <p>
     *            A collection of entities identified in the input text. For
     *            each entity, the response provides the entity text, entity
     *            type, where the entity text begins and ends, and the level of
     *            confidence that Amazon Comprehend has in the detection.
     *            </p>
     *            <p>
     *            If your request uses a custom entity recognition model, Amazon
     *            Comprehend detects the entities that the model is trained to
     *            recognize. Otherwise, it detects the default entity types. For
     *            a list of default entity types, see <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html"
     *            >Entities</a> in the Comprehend Developer Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectEntitiesResult withEntities(Entity... entities) {
        if (getEntities() == null) {
            this.entities = new java.util.ArrayList<Entity>(entities.length);
        }
        for (Entity value : entities) {
            this.entities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A collection of entities identified in the input text. For each entity,
     * the response provides the entity text, entity type, where the entity text
     * begins and ends, and the level of confidence that Amazon Comprehend has
     * in the detection.
     * </p>
     * <p>
     * If your request uses a custom entity recognition model, Amazon Comprehend
     * detects the entities that the model is trained to recognize. Otherwise,
     * it detects the default entity types. For a list of default entity types,
     * see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html"
     * >Entities</a> in the Comprehend Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entities <p>
     *            A collection of entities identified in the input text. For
     *            each entity, the response provides the entity text, entity
     *            type, where the entity text begins and ends, and the level of
     *            confidence that Amazon Comprehend has in the detection.
     *            </p>
     *            <p>
     *            If your request uses a custom entity recognition model, Amazon
     *            Comprehend detects the entities that the model is trained to
     *            recognize. Otherwise, it detects the default entity types. For
     *            a list of default entity types, see <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html"
     *            >Entities</a> in the Comprehend Developer Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectEntitiesResult withEntities(java.util.Collection<Entity> entities) {
        setEntities(entities);
        return this;
    }

    /**
     * <p>
     * Information about the document, discovered during text extraction. This
     * field is present in the response only if your request used the
     * <code>Byte</code> parameter.
     * </p>
     *
     * @return <p>
     *         Information about the document, discovered during text
     *         extraction. This field is present in the response only if your
     *         request used the <code>Byte</code> parameter.
     *         </p>
     */
    public DocumentMetadata getDocumentMetadata() {
        return documentMetadata;
    }

    /**
     * <p>
     * Information about the document, discovered during text extraction. This
     * field is present in the response only if your request used the
     * <code>Byte</code> parameter.
     * </p>
     *
     * @param documentMetadata <p>
     *            Information about the document, discovered during text
     *            extraction. This field is present in the response only if your
     *            request used the <code>Byte</code> parameter.
     *            </p>
     */
    public void setDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
    }

    /**
     * <p>
     * Information about the document, discovered during text extraction. This
     * field is present in the response only if your request used the
     * <code>Byte</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentMetadata <p>
     *            Information about the document, discovered during text
     *            extraction. This field is present in the response only if your
     *            request used the <code>Byte</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectEntitiesResult withDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
        return this;
    }

    /**
     * <p>
     * The document type for each page in the input document. This field is
     * present in the response only if your request used the <code>Byte</code>
     * parameter.
     * </p>
     *
     * @return <p>
     *         The document type for each page in the input document. This field
     *         is present in the response only if your request used the
     *         <code>Byte</code> parameter.
     *         </p>
     */
    public java.util.List<DocumentTypeListItem> getDocumentType() {
        return documentType;
    }

    /**
     * <p>
     * The document type for each page in the input document. This field is
     * present in the response only if your request used the <code>Byte</code>
     * parameter.
     * </p>
     *
     * @param documentType <p>
     *            The document type for each page in the input document. This
     *            field is present in the response only if your request used the
     *            <code>Byte</code> parameter.
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
     * present in the response only if your request used the <code>Byte</code>
     * parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentType <p>
     *            The document type for each page in the input document. This
     *            field is present in the response only if your request used the
     *            <code>Byte</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectEntitiesResult withDocumentType(DocumentTypeListItem... documentType) {
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
     * present in the response only if your request used the <code>Byte</code>
     * parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentType <p>
     *            The document type for each page in the input document. This
     *            field is present in the response only if your request used the
     *            <code>Byte</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectEntitiesResult withDocumentType(
            java.util.Collection<DocumentTypeListItem> documentType) {
        setDocumentType(documentType);
        return this;
    }

    /**
     * <p>
     * Information about each block of text in the input document. Blocks are
     * nested. A page block contains a block for each line of text, which
     * contains a block for each word.
     * </p>
     * <p>
     * The <code>Block</code> content for a Word input document does not include
     * a <code>Geometry</code> field.
     * </p>
     * <p>
     * The <code>Block</code> field is not present in the response for
     * plain-text inputs.
     * </p>
     *
     * @return <p>
     *         Information about each block of text in the input document.
     *         Blocks are nested. A page block contains a block for each line of
     *         text, which contains a block for each word.
     *         </p>
     *         <p>
     *         The <code>Block</code> content for a Word input document does not
     *         include a <code>Geometry</code> field.
     *         </p>
     *         <p>
     *         The <code>Block</code> field is not present in the response for
     *         plain-text inputs.
     *         </p>
     */
    public java.util.List<Block> getBlocks() {
        return blocks;
    }

    /**
     * <p>
     * Information about each block of text in the input document. Blocks are
     * nested. A page block contains a block for each line of text, which
     * contains a block for each word.
     * </p>
     * <p>
     * The <code>Block</code> content for a Word input document does not include
     * a <code>Geometry</code> field.
     * </p>
     * <p>
     * The <code>Block</code> field is not present in the response for
     * plain-text inputs.
     * </p>
     *
     * @param blocks <p>
     *            Information about each block of text in the input document.
     *            Blocks are nested. A page block contains a block for each line
     *            of text, which contains a block for each word.
     *            </p>
     *            <p>
     *            The <code>Block</code> content for a Word input document does
     *            not include a <code>Geometry</code> field.
     *            </p>
     *            <p>
     *            The <code>Block</code> field is not present in the response
     *            for plain-text inputs.
     *            </p>
     */
    public void setBlocks(java.util.Collection<Block> blocks) {
        if (blocks == null) {
            this.blocks = null;
            return;
        }

        this.blocks = new java.util.ArrayList<Block>(blocks);
    }

    /**
     * <p>
     * Information about each block of text in the input document. Blocks are
     * nested. A page block contains a block for each line of text, which
     * contains a block for each word.
     * </p>
     * <p>
     * The <code>Block</code> content for a Word input document does not include
     * a <code>Geometry</code> field.
     * </p>
     * <p>
     * The <code>Block</code> field is not present in the response for
     * plain-text inputs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blocks <p>
     *            Information about each block of text in the input document.
     *            Blocks are nested. A page block contains a block for each line
     *            of text, which contains a block for each word.
     *            </p>
     *            <p>
     *            The <code>Block</code> content for a Word input document does
     *            not include a <code>Geometry</code> field.
     *            </p>
     *            <p>
     *            The <code>Block</code> field is not present in the response
     *            for plain-text inputs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectEntitiesResult withBlocks(Block... blocks) {
        if (getBlocks() == null) {
            this.blocks = new java.util.ArrayList<Block>(blocks.length);
        }
        for (Block value : blocks) {
            this.blocks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about each block of text in the input document. Blocks are
     * nested. A page block contains a block for each line of text, which
     * contains a block for each word.
     * </p>
     * <p>
     * The <code>Block</code> content for a Word input document does not include
     * a <code>Geometry</code> field.
     * </p>
     * <p>
     * The <code>Block</code> field is not present in the response for
     * plain-text inputs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blocks <p>
     *            Information about each block of text in the input document.
     *            Blocks are nested. A page block contains a block for each line
     *            of text, which contains a block for each word.
     *            </p>
     *            <p>
     *            The <code>Block</code> content for a Word input document does
     *            not include a <code>Geometry</code> field.
     *            </p>
     *            <p>
     *            The <code>Block</code> field is not present in the response
     *            for plain-text inputs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectEntitiesResult withBlocks(java.util.Collection<Block> blocks) {
        setBlocks(blocks);
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
    public DetectEntitiesResult withErrors(ErrorsListItem... errors) {
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
    public DetectEntitiesResult withErrors(java.util.Collection<ErrorsListItem> errors) {
        setErrors(errors);
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
        if (getEntities() != null)
            sb.append("Entities: " + getEntities() + ",");
        if (getDocumentMetadata() != null)
            sb.append("DocumentMetadata: " + getDocumentMetadata() + ",");
        if (getDocumentType() != null)
            sb.append("DocumentType: " + getDocumentType() + ",");
        if (getBlocks() != null)
            sb.append("Blocks: " + getBlocks() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentMetadata() == null) ? 0 : getDocumentMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        hashCode = prime * hashCode + ((getBlocks() == null) ? 0 : getBlocks().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectEntitiesResult == false)
            return false;
        DetectEntitiesResult other = (DetectEntitiesResult) obj;

        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
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
        if (other.getBlocks() == null ^ this.getBlocks() == null)
            return false;
        if (other.getBlocks() != null && other.getBlocks().equals(this.getBlocks()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}

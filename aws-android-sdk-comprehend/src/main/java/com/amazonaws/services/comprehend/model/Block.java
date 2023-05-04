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

/**
 * <p>
 * Information about each word or line of text in the input document.
 * </p>
 * <p>
 * For additional information, see <a
 * href="https://docs.aws.amazon.com/textract/latest/dg/API_Block.html"
 * >Block</a> in the Amazon Textract API reference.
 * </p>
 */
public class Block implements Serializable {
    /**
     * <p>
     * Unique identifier for the block.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String id;

    /**
     * <p>
     * The block represents a line of text or one word of text.
     * </p>
     * <ul>
     * <li>
     * <p>
     * WORD - A word that's detected on a document page. A word is one or more
     * ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINE - A string of tab-delimited, contiguous words that are detected on a
     * document page
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINE, WORD
     */
    private String blockType;

    /**
     * <p>
     * The word or line of text extracted from the block.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String text;

    /**
     * <p>
     * Page number where the block appears.
     * </p>
     */
    private Integer page;

    /**
     * <p>
     * Co-ordinates of the rectangle or polygon that contains the text.
     * </p>
     */
    private Geometry geometry;

    /**
     * <p>
     * A list of child blocks of the current block. For example, a LINE object
     * has child blocks for each WORD block that's part of the line of text.
     * </p>
     */
    private java.util.List<RelationshipsListItem> relationships;

    /**
     * <p>
     * Unique identifier for the block.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Unique identifier for the block.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * Unique identifier for the block.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param id <p>
     *            Unique identifier for the block.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Unique identifier for the block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param id <p>
     *            Unique identifier for the block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Block withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The block represents a line of text or one word of text.
     * </p>
     * <ul>
     * <li>
     * <p>
     * WORD - A word that's detected on a document page. A word is one or more
     * ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINE - A string of tab-delimited, contiguous words that are detected on a
     * document page
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINE, WORD
     *
     * @return <p>
     *         The block represents a line of text or one word of text.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         WORD - A word that's detected on a document page. A word is one
     *         or more ISO basic Latin script characters that aren't separated
     *         by spaces.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LINE - A string of tab-delimited, contiguous words that are
     *         detected on a document page
     *         </p>
     *         </li>
     *         </ul>
     * @see BlockType
     */
    public String getBlockType() {
        return blockType;
    }

    /**
     * <p>
     * The block represents a line of text or one word of text.
     * </p>
     * <ul>
     * <li>
     * <p>
     * WORD - A word that's detected on a document page. A word is one or more
     * ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINE - A string of tab-delimited, contiguous words that are detected on a
     * document page
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINE, WORD
     *
     * @param blockType <p>
     *            The block represents a line of text or one word of text.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            WORD - A word that's detected on a document page. A word is
     *            one or more ISO basic Latin script characters that aren't
     *            separated by spaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINE - A string of tab-delimited, contiguous words that are
     *            detected on a document page
     *            </p>
     *            </li>
     *            </ul>
     * @see BlockType
     */
    public void setBlockType(String blockType) {
        this.blockType = blockType;
    }

    /**
     * <p>
     * The block represents a line of text or one word of text.
     * </p>
     * <ul>
     * <li>
     * <p>
     * WORD - A word that's detected on a document page. A word is one or more
     * ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINE - A string of tab-delimited, contiguous words that are detected on a
     * document page
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINE, WORD
     *
     * @param blockType <p>
     *            The block represents a line of text or one word of text.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            WORD - A word that's detected on a document page. A word is
     *            one or more ISO basic Latin script characters that aren't
     *            separated by spaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINE - A string of tab-delimited, contiguous words that are
     *            detected on a document page
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BlockType
     */
    public Block withBlockType(String blockType) {
        this.blockType = blockType;
        return this;
    }

    /**
     * <p>
     * The block represents a line of text or one word of text.
     * </p>
     * <ul>
     * <li>
     * <p>
     * WORD - A word that's detected on a document page. A word is one or more
     * ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINE - A string of tab-delimited, contiguous words that are detected on a
     * document page
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINE, WORD
     *
     * @param blockType <p>
     *            The block represents a line of text or one word of text.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            WORD - A word that's detected on a document page. A word is
     *            one or more ISO basic Latin script characters that aren't
     *            separated by spaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINE - A string of tab-delimited, contiguous words that are
     *            detected on a document page
     *            </p>
     *            </li>
     *            </ul>
     * @see BlockType
     */
    public void setBlockType(BlockType blockType) {
        this.blockType = blockType.toString();
    }

    /**
     * <p>
     * The block represents a line of text or one word of text.
     * </p>
     * <ul>
     * <li>
     * <p>
     * WORD - A word that's detected on a document page. A word is one or more
     * ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINE - A string of tab-delimited, contiguous words that are detected on a
     * document page
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINE, WORD
     *
     * @param blockType <p>
     *            The block represents a line of text or one word of text.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            WORD - A word that's detected on a document page. A word is
     *            one or more ISO basic Latin script characters that aren't
     *            separated by spaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINE - A string of tab-delimited, contiguous words that are
     *            detected on a document page
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BlockType
     */
    public Block withBlockType(BlockType blockType) {
        this.blockType = blockType.toString();
        return this;
    }

    /**
     * <p>
     * The word or line of text extracted from the block.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The word or line of text extracted from the block.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The word or line of text extracted from the block.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            The word or line of text extracted from the block.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The word or line of text extracted from the block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            The word or line of text extracted from the block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Block withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * Page number where the block appears.
     * </p>
     *
     * @return <p>
     *         Page number where the block appears.
     *         </p>
     */
    public Integer getPage() {
        return page;
    }

    /**
     * <p>
     * Page number where the block appears.
     * </p>
     *
     * @param page <p>
     *            Page number where the block appears.
     *            </p>
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * <p>
     * Page number where the block appears.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param page <p>
     *            Page number where the block appears.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Block withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * <p>
     * Co-ordinates of the rectangle or polygon that contains the text.
     * </p>
     *
     * @return <p>
     *         Co-ordinates of the rectangle or polygon that contains the text.
     *         </p>
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * <p>
     * Co-ordinates of the rectangle or polygon that contains the text.
     * </p>
     *
     * @param geometry <p>
     *            Co-ordinates of the rectangle or polygon that contains the
     *            text.
     *            </p>
     */
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    /**
     * <p>
     * Co-ordinates of the rectangle or polygon that contains the text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geometry <p>
     *            Co-ordinates of the rectangle or polygon that contains the
     *            text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Block withGeometry(Geometry geometry) {
        this.geometry = geometry;
        return this;
    }

    /**
     * <p>
     * A list of child blocks of the current block. For example, a LINE object
     * has child blocks for each WORD block that's part of the line of text.
     * </p>
     *
     * @return <p>
     *         A list of child blocks of the current block. For example, a LINE
     *         object has child blocks for each WORD block that's part of the
     *         line of text.
     *         </p>
     */
    public java.util.List<RelationshipsListItem> getRelationships() {
        return relationships;
    }

    /**
     * <p>
     * A list of child blocks of the current block. For example, a LINE object
     * has child blocks for each WORD block that's part of the line of text.
     * </p>
     *
     * @param relationships <p>
     *            A list of child blocks of the current block. For example, a
     *            LINE object has child blocks for each WORD block that's part
     *            of the line of text.
     *            </p>
     */
    public void setRelationships(java.util.Collection<RelationshipsListItem> relationships) {
        if (relationships == null) {
            this.relationships = null;
            return;
        }

        this.relationships = new java.util.ArrayList<RelationshipsListItem>(relationships);
    }

    /**
     * <p>
     * A list of child blocks of the current block. For example, a LINE object
     * has child blocks for each WORD block that's part of the line of text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relationships <p>
     *            A list of child blocks of the current block. For example, a
     *            LINE object has child blocks for each WORD block that's part
     *            of the line of text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Block withRelationships(RelationshipsListItem... relationships) {
        if (getRelationships() == null) {
            this.relationships = new java.util.ArrayList<RelationshipsListItem>(
                    relationships.length);
        }
        for (RelationshipsListItem value : relationships) {
            this.relationships.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of child blocks of the current block. For example, a LINE object
     * has child blocks for each WORD block that's part of the line of text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relationships <p>
     *            A list of child blocks of the current block. For example, a
     *            LINE object has child blocks for each WORD block that's part
     *            of the line of text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Block withRelationships(java.util.Collection<RelationshipsListItem> relationships) {
        setRelationships(relationships);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getBlockType() != null)
            sb.append("BlockType: " + getBlockType() + ",");
        if (getText() != null)
            sb.append("Text: " + getText() + ",");
        if (getPage() != null)
            sb.append("Page: " + getPage() + ",");
        if (getGeometry() != null)
            sb.append("Geometry: " + getGeometry() + ",");
        if (getRelationships() != null)
            sb.append("Relationships: " + getRelationships());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getBlockType() == null) ? 0 : getBlockType().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        hashCode = prime * hashCode
                + ((getRelationships() == null) ? 0 : getRelationships().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Block == false)
            return false;
        Block other = (Block) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getBlockType() == null ^ this.getBlockType() == null)
            return false;
        if (other.getBlockType() != null
                && other.getBlockType().equals(this.getBlockType()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        if (other.getGeometry() == null ^ this.getGeometry() == null)
            return false;
        if (other.getGeometry() != null && other.getGeometry().equals(this.getGeometry()) == false)
            return false;
        if (other.getRelationships() == null ^ this.getRelationships() == null)
            return false;
        if (other.getRelationships() != null
                && other.getRelationships().equals(this.getRelationships()) == false)
            return false;
        return true;
    }
}

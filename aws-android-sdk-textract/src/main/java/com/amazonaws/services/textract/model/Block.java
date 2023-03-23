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
 * A <code>Block</code> represents items that are recognized in a document
 * within a group of pixels close to each other. The information returned in a
 * <code>Block</code> object depends on the type of operation. In text detection
 * for documents (for example <a>DetectDocumentText</a>), you get information
 * about the detected words and lines of text. In text analysis (for example
 * <a>AnalyzeDocument</a>), you can also get information about the fields,
 * tables, and selection elements that are detected in the document.
 * </p>
 * <p>
 * An array of <code>Block</code> objects is returned by both synchronous and
 * asynchronous operations. In synchronous operations, such as
 * <a>DetectDocumentText</a>, the array of <code>Block</code> objects is the
 * entire set of results. In asynchronous operations, such as
 * <a>GetDocumentAnalysis</a>, the array is returned over one or more responses.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/textract/latest/dg/how-it-works.html">How
 * Amazon Textract Works</a>.
 * </p>
 */
public class Block implements Serializable {
    /**
     * <p>
     * The type of text item that's recognized. In operations for text
     * detection, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of the LINE <code>Block</code> objects that
     * are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word detected on a document page. A word is one or more
     * ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that are
     * detected on a document page.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In text analysis operations, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of child <code>Block</code> objects that
     * are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE <code>Block</code>
     * objects for linked text that's detected on a document page. Use the
     * <code>EntityType</code> field to determine if a KEY_VALUE_SET object is a
     * KEY <code>Block</code> object or a VALUE <code>Block</code> object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word that's detected on a document page. A word is one or
     * more ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that are
     * detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE</i> - A table that's detected on a document page. A table is
     * grid-based information with two or more rows or columns, with a cell span
     * of one row and one column each.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_TITLE</i> - The title of a table. A title is typically a line of
     * text above or below a table, or embedded as the first row of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_FOOTER</i> - The footer associated with a table. A footer is
     * typically a line or lines of text below a table or embedded as the last
     * row of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CELL</i> - A cell within a detected table. The cell is the parent of
     * the block that contains the text in the cell.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>MERGED_CELL</i> - A cell in a table whose content spans more than one
     * row or column. The <code>Relationships</code> array for this cell contain
     * data from individual cells.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SELECTION_ELEMENT</i> - A selection element such as an option button
     * (radio button) or a check box that's detected on a document page. Use the
     * value of <code>SelectionStatus</code> to determine the status of the
     * selection element.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SIGNATURE</i> - The location and confidene score of a signature
     * detected on a document page. Can be returned as part of a Key-Value pair
     * or a detected cell.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>QUERY</i> - A question asked during the call of AnalyzeDocument.
     * Contains an alias and an ID that attaches it to its answer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>QUERY_RESULT</i> - A response to a question asked during the call of
     * analyze document. Comes with an alias and ID for ease of locating in a
     * response. Also contains location and confidence score.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_VALUE_SET, PAGE, LINE, WORD, TABLE, CELL,
     * SELECTION_ELEMENT, MERGED_CELL, TITLE, QUERY, QUERY_RESULT, SIGNATURE,
     * TABLE_TITLE, TABLE_FOOTER
     */
    private String blockType;

    /**
     * <p>
     * The confidence score that Amazon Textract has in the accuracy of the
     * recognized text and the accuracy of the geometry points around the
     * recognized text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     */
    private Float confidence;

    /**
     * <p>
     * The word or line of text that's recognized by Amazon Textract.
     * </p>
     */
    private String text;

    /**
     * <p>
     * The kind of text that Amazon Textract has detected. Can check for
     * handwritten text and printed text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HANDWRITING, PRINTED
     */
    private String textType;

    /**
     * <p>
     * The row in which a table cell is located. The first row position is 1.
     * <code>RowIndex</code> isn't returned by <code>DetectDocumentText</code>
     * and <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer rowIndex;

    /**
     * <p>
     * The column in which a table cell appears. The first column position is 1.
     * <code>ColumnIndex</code> isn't returned by
     * <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer columnIndex;

    /**
     * <p>
     * The number of rows that a table cell spans. <code>RowSpan</code> isn't
     * returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer rowSpan;

    /**
     * <p>
     * The number of columns that a table cell spans. <code>ColumnSpan</code>
     * isn't returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer columnSpan;

    /**
     * <p>
     * The location of the recognized text on the image. It includes an
     * axis-aligned, coarse bounding box that surrounds the text, and a
     * finer-grain polygon for more accurate spatial information.
     * </p>
     */
    private Geometry geometry;

    /**
     * <p>
     * The identifier for the recognized text. The identifier is only unique for
     * a single operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String id;

    /**
     * <p>
     * A list of relationship objects that describe how blocks are related to
     * each other. For example, a LINE block object contains a CHILD
     * relationship type with the WORD blocks that make up the line of text.
     * There aren't Relationship objects in the list for relationships that
     * don't exist, such as when the current block has no child blocks.
     * </p>
     */
    private java.util.List<Relationship> relationships;

    /**
     * <p>
     * The type of entity.
     * </p>
     * <p>
     * The following entity types can be returned by FORMS analysis:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEY</i> - An identifier for a field on the document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>VALUE</i> - The field text.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following entity types can be returned by TABLES analysis:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COLUMN_HEADER</i> - Identifies a cell that is a header of a column.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_TITLE</i> - Identifies a cell that is a title within the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_SECTION_TITLE</i> - Identifies a cell that is a title of a
     * section within a table. A section title is a cell that typically spans an
     * entire row above a section.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_FOOTER</i> - Identifies a cell that is a footer of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_SUMMARY</i> - Identifies a summary cell of a table. A summary
     * cell can be a row of a table or an additional, smaller table that
     * contains summary information for another table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>STRUCTURED_TABLE </i> - Identifies a table with column headers where
     * the content of each row corresponds to the headers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SEMI_STRUCTURED_TABLE</i> - Identifies a non-structured table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>EntityTypes</code> isn't returned by
     * <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>
     * .
     * </p>
     */
    private java.util.List<String> entityTypes;

    /**
     * <p>
     * The selection status of a selection element, such as an option button or
     * check box.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELECTED, NOT_SELECTED
     */
    private String selectionStatus;

    /**
     * <p>
     * The page on which a block was detected. <code>Page</code> is returned by
     * synchronous and asynchronous operations. Page values greater than 1 are
     * only returned for multipage documents that are in PDF or TIFF format. A
     * scanned image (JPEG/PNG) provided to an asynchronous operation, even if
     * it contains multiple document pages, is considered a single-page
     * document. This means that for scanned images the value of
     * <code>Page</code> is always 1. Synchronous operations will also return a
     * <code>Page</code> value of 1 because every input document is considered
     * to be a single-page document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer page;

    /**
     * <p/>
     */
    private Query query;

    /**
     * <p>
     * The type of text item that's recognized. In operations for text
     * detection, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of the LINE <code>Block</code> objects that
     * are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word detected on a document page. A word is one or more
     * ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that are
     * detected on a document page.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In text analysis operations, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of child <code>Block</code> objects that
     * are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE <code>Block</code>
     * objects for linked text that's detected on a document page. Use the
     * <code>EntityType</code> field to determine if a KEY_VALUE_SET object is a
     * KEY <code>Block</code> object or a VALUE <code>Block</code> object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word that's detected on a document page. A word is one or
     * more ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that are
     * detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE</i> - A table that's detected on a document page. A table is
     * grid-based information with two or more rows or columns, with a cell span
     * of one row and one column each.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_TITLE</i> - The title of a table. A title is typically a line of
     * text above or below a table, or embedded as the first row of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_FOOTER</i> - The footer associated with a table. A footer is
     * typically a line or lines of text below a table or embedded as the last
     * row of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CELL</i> - A cell within a detected table. The cell is the parent of
     * the block that contains the text in the cell.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>MERGED_CELL</i> - A cell in a table whose content spans more than one
     * row or column. The <code>Relationships</code> array for this cell contain
     * data from individual cells.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SELECTION_ELEMENT</i> - A selection element such as an option button
     * (radio button) or a check box that's detected on a document page. Use the
     * value of <code>SelectionStatus</code> to determine the status of the
     * selection element.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SIGNATURE</i> - The location and confidene score of a signature
     * detected on a document page. Can be returned as part of a Key-Value pair
     * or a detected cell.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>QUERY</i> - A question asked during the call of AnalyzeDocument.
     * Contains an alias and an ID that attaches it to its answer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>QUERY_RESULT</i> - A response to a question asked during the call of
     * analyze document. Comes with an alias and ID for ease of locating in a
     * response. Also contains location and confidence score.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_VALUE_SET, PAGE, LINE, WORD, TABLE, CELL,
     * SELECTION_ELEMENT, MERGED_CELL, TITLE, QUERY, QUERY_RESULT, SIGNATURE,
     * TABLE_TITLE, TABLE_FOOTER
     *
     * @return <p>
     *         The type of text item that's recognized. In operations for text
     *         detection, the following types are returned:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>PAGE</i> - Contains a list of the LINE <code>Block</code>
     *         objects that are detected on a document page.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>WORD</i> - A word detected on a document page. A word is one
     *         or more ISO basic Latin script characters that aren't separated
     *         by spaces.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>LINE</i> - A string of tab-delimited, contiguous words that
     *         are detected on a document page.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         In text analysis operations, the following types are returned:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>PAGE</i> - Contains a list of child <code>Block</code> objects
     *         that are detected on a document page.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE
     *         <code>Block</code> objects for linked text that's detected on a
     *         document page. Use the <code>EntityType</code> field to determine
     *         if a KEY_VALUE_SET object is a KEY <code>Block</code> object or a
     *         VALUE <code>Block</code> object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>WORD</i> - A word that's detected on a document page. A word
     *         is one or more ISO basic Latin script characters that aren't
     *         separated by spaces.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>LINE</i> - A string of tab-delimited, contiguous words that
     *         are detected on a document page.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>TABLE</i> - A table that's detected on a document page. A
     *         table is grid-based information with two or more rows or columns,
     *         with a cell span of one row and one column each.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>TABLE_TITLE</i> - The title of a table. A title is typically a
     *         line of text above or below a table, or embedded as the first row
     *         of a table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>TABLE_FOOTER</i> - The footer associated with a table. A
     *         footer is typically a line or lines of text below a table or
     *         embedded as the last row of a table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>CELL</i> - A cell within a detected table. The cell is the
     *         parent of the block that contains the text in the cell.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>MERGED_CELL</i> - A cell in a table whose content spans more
     *         than one row or column. The <code>Relationships</code> array for
     *         this cell contain data from individual cells.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SELECTION_ELEMENT</i> - A selection element such as an option
     *         button (radio button) or a check box that's detected on a
     *         document page. Use the value of <code>SelectionStatus</code> to
     *         determine the status of the selection element.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SIGNATURE</i> - The location and confidene score of a
     *         signature detected on a document page. Can be returned as part of
     *         a Key-Value pair or a detected cell.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>QUERY</i> - A question asked during the call of
     *         AnalyzeDocument. Contains an alias and an ID that attaches it to
     *         its answer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>QUERY_RESULT</i> - A response to a question asked during the
     *         call of analyze document. Comes with an alias and ID for ease of
     *         locating in a response. Also contains location and confidence
     *         score.
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
     * The type of text item that's recognized. In operations for text
     * detection, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of the LINE <code>Block</code> objects that
     * are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word detected on a document page. A word is one or more
     * ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that are
     * detected on a document page.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In text analysis operations, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of child <code>Block</code> objects that
     * are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE <code>Block</code>
     * objects for linked text that's detected on a document page. Use the
     * <code>EntityType</code> field to determine if a KEY_VALUE_SET object is a
     * KEY <code>Block</code> object or a VALUE <code>Block</code> object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word that's detected on a document page. A word is one or
     * more ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that are
     * detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE</i> - A table that's detected on a document page. A table is
     * grid-based information with two or more rows or columns, with a cell span
     * of one row and one column each.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_TITLE</i> - The title of a table. A title is typically a line of
     * text above or below a table, or embedded as the first row of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_FOOTER</i> - The footer associated with a table. A footer is
     * typically a line or lines of text below a table or embedded as the last
     * row of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CELL</i> - A cell within a detected table. The cell is the parent of
     * the block that contains the text in the cell.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>MERGED_CELL</i> - A cell in a table whose content spans more than one
     * row or column. The <code>Relationships</code> array for this cell contain
     * data from individual cells.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SELECTION_ELEMENT</i> - A selection element such as an option button
     * (radio button) or a check box that's detected on a document page. Use the
     * value of <code>SelectionStatus</code> to determine the status of the
     * selection element.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SIGNATURE</i> - The location and confidene score of a signature
     * detected on a document page. Can be returned as part of a Key-Value pair
     * or a detected cell.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>QUERY</i> - A question asked during the call of AnalyzeDocument.
     * Contains an alias and an ID that attaches it to its answer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>QUERY_RESULT</i> - A response to a question asked during the call of
     * analyze document. Comes with an alias and ID for ease of locating in a
     * response. Also contains location and confidence score.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_VALUE_SET, PAGE, LINE, WORD, TABLE, CELL,
     * SELECTION_ELEMENT, MERGED_CELL, TITLE, QUERY, QUERY_RESULT, SIGNATURE,
     * TABLE_TITLE, TABLE_FOOTER
     *
     * @param blockType <p>
     *            The type of text item that's recognized. In operations for
     *            text detection, the following types are returned:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>PAGE</i> - Contains a list of the LINE <code>Block</code>
     *            objects that are detected on a document page.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>WORD</i> - A word detected on a document page. A word is
     *            one or more ISO basic Latin script characters that aren't
     *            separated by spaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>LINE</i> - A string of tab-delimited, contiguous words that
     *            are detected on a document page.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            In text analysis operations, the following types are returned:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>PAGE</i> - Contains a list of child <code>Block</code>
     *            objects that are detected on a document page.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE
     *            <code>Block</code> objects for linked text that's detected on
     *            a document page. Use the <code>EntityType</code> field to
     *            determine if a KEY_VALUE_SET object is a KEY
     *            <code>Block</code> object or a VALUE <code>Block</code>
     *            object.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>WORD</i> - A word that's detected on a document page. A
     *            word is one or more ISO basic Latin script characters that
     *            aren't separated by spaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>LINE</i> - A string of tab-delimited, contiguous words that
     *            are detected on a document page.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE</i> - A table that's detected on a document page. A
     *            table is grid-based information with two or more rows or
     *            columns, with a cell span of one row and one column each.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_TITLE</i> - The title of a table. A title is
     *            typically a line of text above or below a table, or embedded
     *            as the first row of a table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_FOOTER</i> - The footer associated with a table. A
     *            footer is typically a line or lines of text below a table or
     *            embedded as the last row of a table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>CELL</i> - A cell within a detected table. The cell is the
     *            parent of the block that contains the text in the cell.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>MERGED_CELL</i> - A cell in a table whose content spans
     *            more than one row or column. The <code>Relationships</code>
     *            array for this cell contain data from individual cells.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>SELECTION_ELEMENT</i> - A selection element such as an
     *            option button (radio button) or a check box that's detected on
     *            a document page. Use the value of <code>SelectionStatus</code>
     *            to determine the status of the selection element.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>SIGNATURE</i> - The location and confidene score of a
     *            signature detected on a document page. Can be returned as part
     *            of a Key-Value pair or a detected cell.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>QUERY</i> - A question asked during the call of
     *            AnalyzeDocument. Contains an alias and an ID that attaches it
     *            to its answer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>QUERY_RESULT</i> - A response to a question asked during
     *            the call of analyze document. Comes with an alias and ID for
     *            ease of locating in a response. Also contains location and
     *            confidence score.
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
     * The type of text item that's recognized. In operations for text
     * detection, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of the LINE <code>Block</code> objects that
     * are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word detected on a document page. A word is one or more
     * ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that are
     * detected on a document page.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In text analysis operations, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of child <code>Block</code> objects that
     * are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE <code>Block</code>
     * objects for linked text that's detected on a document page. Use the
     * <code>EntityType</code> field to determine if a KEY_VALUE_SET object is a
     * KEY <code>Block</code> object or a VALUE <code>Block</code> object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word that's detected on a document page. A word is one or
     * more ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that are
     * detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE</i> - A table that's detected on a document page. A table is
     * grid-based information with two or more rows or columns, with a cell span
     * of one row and one column each.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_TITLE</i> - The title of a table. A title is typically a line of
     * text above or below a table, or embedded as the first row of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_FOOTER</i> - The footer associated with a table. A footer is
     * typically a line or lines of text below a table or embedded as the last
     * row of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CELL</i> - A cell within a detected table. The cell is the parent of
     * the block that contains the text in the cell.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>MERGED_CELL</i> - A cell in a table whose content spans more than one
     * row or column. The <code>Relationships</code> array for this cell contain
     * data from individual cells.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SELECTION_ELEMENT</i> - A selection element such as an option button
     * (radio button) or a check box that's detected on a document page. Use the
     * value of <code>SelectionStatus</code> to determine the status of the
     * selection element.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SIGNATURE</i> - The location and confidene score of a signature
     * detected on a document page. Can be returned as part of a Key-Value pair
     * or a detected cell.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>QUERY</i> - A question asked during the call of AnalyzeDocument.
     * Contains an alias and an ID that attaches it to its answer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>QUERY_RESULT</i> - A response to a question asked during the call of
     * analyze document. Comes with an alias and ID for ease of locating in a
     * response. Also contains location and confidence score.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_VALUE_SET, PAGE, LINE, WORD, TABLE, CELL,
     * SELECTION_ELEMENT, MERGED_CELL, TITLE, QUERY, QUERY_RESULT, SIGNATURE,
     * TABLE_TITLE, TABLE_FOOTER
     *
     * @param blockType <p>
     *            The type of text item that's recognized. In operations for
     *            text detection, the following types are returned:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>PAGE</i> - Contains a list of the LINE <code>Block</code>
     *            objects that are detected on a document page.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>WORD</i> - A word detected on a document page. A word is
     *            one or more ISO basic Latin script characters that aren't
     *            separated by spaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>LINE</i> - A string of tab-delimited, contiguous words that
     *            are detected on a document page.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            In text analysis operations, the following types are returned:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>PAGE</i> - Contains a list of child <code>Block</code>
     *            objects that are detected on a document page.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE
     *            <code>Block</code> objects for linked text that's detected on
     *            a document page. Use the <code>EntityType</code> field to
     *            determine if a KEY_VALUE_SET object is a KEY
     *            <code>Block</code> object or a VALUE <code>Block</code>
     *            object.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>WORD</i> - A word that's detected on a document page. A
     *            word is one or more ISO basic Latin script characters that
     *            aren't separated by spaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>LINE</i> - A string of tab-delimited, contiguous words that
     *            are detected on a document page.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE</i> - A table that's detected on a document page. A
     *            table is grid-based information with two or more rows or
     *            columns, with a cell span of one row and one column each.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_TITLE</i> - The title of a table. A title is
     *            typically a line of text above or below a table, or embedded
     *            as the first row of a table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_FOOTER</i> - The footer associated with a table. A
     *            footer is typically a line or lines of text below a table or
     *            embedded as the last row of a table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>CELL</i> - A cell within a detected table. The cell is the
     *            parent of the block that contains the text in the cell.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>MERGED_CELL</i> - A cell in a table whose content spans
     *            more than one row or column. The <code>Relationships</code>
     *            array for this cell contain data from individual cells.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>SELECTION_ELEMENT</i> - A selection element such as an
     *            option button (radio button) or a check box that's detected on
     *            a document page. Use the value of <code>SelectionStatus</code>
     *            to determine the status of the selection element.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>SIGNATURE</i> - The location and confidene score of a
     *            signature detected on a document page. Can be returned as part
     *            of a Key-Value pair or a detected cell.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>QUERY</i> - A question asked during the call of
     *            AnalyzeDocument. Contains an alias and an ID that attaches it
     *            to its answer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>QUERY_RESULT</i> - A response to a question asked during
     *            the call of analyze document. Comes with an alias and ID for
     *            ease of locating in a response. Also contains location and
     *            confidence score.
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
     * The type of text item that's recognized. In operations for text
     * detection, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of the LINE <code>Block</code> objects that
     * are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word detected on a document page. A word is one or more
     * ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that are
     * detected on a document page.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In text analysis operations, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of child <code>Block</code> objects that
     * are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE <code>Block</code>
     * objects for linked text that's detected on a document page. Use the
     * <code>EntityType</code> field to determine if a KEY_VALUE_SET object is a
     * KEY <code>Block</code> object or a VALUE <code>Block</code> object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word that's detected on a document page. A word is one or
     * more ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that are
     * detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE</i> - A table that's detected on a document page. A table is
     * grid-based information with two or more rows or columns, with a cell span
     * of one row and one column each.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_TITLE</i> - The title of a table. A title is typically a line of
     * text above or below a table, or embedded as the first row of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_FOOTER</i> - The footer associated with a table. A footer is
     * typically a line or lines of text below a table or embedded as the last
     * row of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CELL</i> - A cell within a detected table. The cell is the parent of
     * the block that contains the text in the cell.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>MERGED_CELL</i> - A cell in a table whose content spans more than one
     * row or column. The <code>Relationships</code> array for this cell contain
     * data from individual cells.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SELECTION_ELEMENT</i> - A selection element such as an option button
     * (radio button) or a check box that's detected on a document page. Use the
     * value of <code>SelectionStatus</code> to determine the status of the
     * selection element.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SIGNATURE</i> - The location and confidene score of a signature
     * detected on a document page. Can be returned as part of a Key-Value pair
     * or a detected cell.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>QUERY</i> - A question asked during the call of AnalyzeDocument.
     * Contains an alias and an ID that attaches it to its answer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>QUERY_RESULT</i> - A response to a question asked during the call of
     * analyze document. Comes with an alias and ID for ease of locating in a
     * response. Also contains location and confidence score.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_VALUE_SET, PAGE, LINE, WORD, TABLE, CELL,
     * SELECTION_ELEMENT, MERGED_CELL, TITLE, QUERY, QUERY_RESULT, SIGNATURE,
     * TABLE_TITLE, TABLE_FOOTER
     *
     * @param blockType <p>
     *            The type of text item that's recognized. In operations for
     *            text detection, the following types are returned:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>PAGE</i> - Contains a list of the LINE <code>Block</code>
     *            objects that are detected on a document page.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>WORD</i> - A word detected on a document page. A word is
     *            one or more ISO basic Latin script characters that aren't
     *            separated by spaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>LINE</i> - A string of tab-delimited, contiguous words that
     *            are detected on a document page.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            In text analysis operations, the following types are returned:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>PAGE</i> - Contains a list of child <code>Block</code>
     *            objects that are detected on a document page.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE
     *            <code>Block</code> objects for linked text that's detected on
     *            a document page. Use the <code>EntityType</code> field to
     *            determine if a KEY_VALUE_SET object is a KEY
     *            <code>Block</code> object or a VALUE <code>Block</code>
     *            object.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>WORD</i> - A word that's detected on a document page. A
     *            word is one or more ISO basic Latin script characters that
     *            aren't separated by spaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>LINE</i> - A string of tab-delimited, contiguous words that
     *            are detected on a document page.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE</i> - A table that's detected on a document page. A
     *            table is grid-based information with two or more rows or
     *            columns, with a cell span of one row and one column each.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_TITLE</i> - The title of a table. A title is
     *            typically a line of text above or below a table, or embedded
     *            as the first row of a table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_FOOTER</i> - The footer associated with a table. A
     *            footer is typically a line or lines of text below a table or
     *            embedded as the last row of a table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>CELL</i> - A cell within a detected table. The cell is the
     *            parent of the block that contains the text in the cell.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>MERGED_CELL</i> - A cell in a table whose content spans
     *            more than one row or column. The <code>Relationships</code>
     *            array for this cell contain data from individual cells.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>SELECTION_ELEMENT</i> - A selection element such as an
     *            option button (radio button) or a check box that's detected on
     *            a document page. Use the value of <code>SelectionStatus</code>
     *            to determine the status of the selection element.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>SIGNATURE</i> - The location and confidene score of a
     *            signature detected on a document page. Can be returned as part
     *            of a Key-Value pair or a detected cell.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>QUERY</i> - A question asked during the call of
     *            AnalyzeDocument. Contains an alias and an ID that attaches it
     *            to its answer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>QUERY_RESULT</i> - A response to a question asked during
     *            the call of analyze document. Comes with an alias and ID for
     *            ease of locating in a response. Also contains location and
     *            confidence score.
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
     * The type of text item that's recognized. In operations for text
     * detection, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of the LINE <code>Block</code> objects that
     * are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word detected on a document page. A word is one or more
     * ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that are
     * detected on a document page.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In text analysis operations, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of child <code>Block</code> objects that
     * are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE <code>Block</code>
     * objects for linked text that's detected on a document page. Use the
     * <code>EntityType</code> field to determine if a KEY_VALUE_SET object is a
     * KEY <code>Block</code> object or a VALUE <code>Block</code> object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word that's detected on a document page. A word is one or
     * more ISO basic Latin script characters that aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that are
     * detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE</i> - A table that's detected on a document page. A table is
     * grid-based information with two or more rows or columns, with a cell span
     * of one row and one column each.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_TITLE</i> - The title of a table. A title is typically a line of
     * text above or below a table, or embedded as the first row of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_FOOTER</i> - The footer associated with a table. A footer is
     * typically a line or lines of text below a table or embedded as the last
     * row of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CELL</i> - A cell within a detected table. The cell is the parent of
     * the block that contains the text in the cell.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>MERGED_CELL</i> - A cell in a table whose content spans more than one
     * row or column. The <code>Relationships</code> array for this cell contain
     * data from individual cells.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SELECTION_ELEMENT</i> - A selection element such as an option button
     * (radio button) or a check box that's detected on a document page. Use the
     * value of <code>SelectionStatus</code> to determine the status of the
     * selection element.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SIGNATURE</i> - The location and confidene score of a signature
     * detected on a document page. Can be returned as part of a Key-Value pair
     * or a detected cell.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>QUERY</i> - A question asked during the call of AnalyzeDocument.
     * Contains an alias and an ID that attaches it to its answer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>QUERY_RESULT</i> - A response to a question asked during the call of
     * analyze document. Comes with an alias and ID for ease of locating in a
     * response. Also contains location and confidence score.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_VALUE_SET, PAGE, LINE, WORD, TABLE, CELL,
     * SELECTION_ELEMENT, MERGED_CELL, TITLE, QUERY, QUERY_RESULT, SIGNATURE,
     * TABLE_TITLE, TABLE_FOOTER
     *
     * @param blockType <p>
     *            The type of text item that's recognized. In operations for
     *            text detection, the following types are returned:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>PAGE</i> - Contains a list of the LINE <code>Block</code>
     *            objects that are detected on a document page.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>WORD</i> - A word detected on a document page. A word is
     *            one or more ISO basic Latin script characters that aren't
     *            separated by spaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>LINE</i> - A string of tab-delimited, contiguous words that
     *            are detected on a document page.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            In text analysis operations, the following types are returned:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>PAGE</i> - Contains a list of child <code>Block</code>
     *            objects that are detected on a document page.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE
     *            <code>Block</code> objects for linked text that's detected on
     *            a document page. Use the <code>EntityType</code> field to
     *            determine if a KEY_VALUE_SET object is a KEY
     *            <code>Block</code> object or a VALUE <code>Block</code>
     *            object.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>WORD</i> - A word that's detected on a document page. A
     *            word is one or more ISO basic Latin script characters that
     *            aren't separated by spaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>LINE</i> - A string of tab-delimited, contiguous words that
     *            are detected on a document page.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE</i> - A table that's detected on a document page. A
     *            table is grid-based information with two or more rows or
     *            columns, with a cell span of one row and one column each.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_TITLE</i> - The title of a table. A title is
     *            typically a line of text above or below a table, or embedded
     *            as the first row of a table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_FOOTER</i> - The footer associated with a table. A
     *            footer is typically a line or lines of text below a table or
     *            embedded as the last row of a table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>CELL</i> - A cell within a detected table. The cell is the
     *            parent of the block that contains the text in the cell.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>MERGED_CELL</i> - A cell in a table whose content spans
     *            more than one row or column. The <code>Relationships</code>
     *            array for this cell contain data from individual cells.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>SELECTION_ELEMENT</i> - A selection element such as an
     *            option button (radio button) or a check box that's detected on
     *            a document page. Use the value of <code>SelectionStatus</code>
     *            to determine the status of the selection element.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>SIGNATURE</i> - The location and confidene score of a
     *            signature detected on a document page. Can be returned as part
     *            of a Key-Value pair or a detected cell.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>QUERY</i> - A question asked during the call of
     *            AnalyzeDocument. Contains an alias and an ID that attaches it
     *            to its answer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>QUERY_RESULT</i> - A response to a question asked during
     *            the call of analyze document. Comes with an alias and ID for
     *            ease of locating in a response. Also contains location and
     *            confidence score.
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
     * The confidence score that Amazon Textract has in the accuracy of the
     * recognized text and the accuracy of the geometry points around the
     * recognized text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         The confidence score that Amazon Textract has in the accuracy of
     *         the recognized text and the accuracy of the geometry points
     *         around the recognized text.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The confidence score that Amazon Textract has in the accuracy of the
     * recognized text and the accuracy of the geometry points around the
     * recognized text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param confidence <p>
     *            The confidence score that Amazon Textract has in the accuracy
     *            of the recognized text and the accuracy of the geometry points
     *            around the recognized text.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence score that Amazon Textract has in the accuracy of the
     * recognized text and the accuracy of the geometry points around the
     * recognized text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param confidence <p>
     *            The confidence score that Amazon Textract has in the accuracy
     *            of the recognized text and the accuracy of the geometry points
     *            around the recognized text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Block withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * <p>
     * The word or line of text that's recognized by Amazon Textract.
     * </p>
     *
     * @return <p>
     *         The word or line of text that's recognized by Amazon Textract.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The word or line of text that's recognized by Amazon Textract.
     * </p>
     *
     * @param text <p>
     *            The word or line of text that's recognized by Amazon Textract.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The word or line of text that's recognized by Amazon Textract.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param text <p>
     *            The word or line of text that's recognized by Amazon Textract.
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
     * The kind of text that Amazon Textract has detected. Can check for
     * handwritten text and printed text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HANDWRITING, PRINTED
     *
     * @return <p>
     *         The kind of text that Amazon Textract has detected. Can check for
     *         handwritten text and printed text.
     *         </p>
     * @see TextType
     */
    public String getTextType() {
        return textType;
    }

    /**
     * <p>
     * The kind of text that Amazon Textract has detected. Can check for
     * handwritten text and printed text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HANDWRITING, PRINTED
     *
     * @param textType <p>
     *            The kind of text that Amazon Textract has detected. Can check
     *            for handwritten text and printed text.
     *            </p>
     * @see TextType
     */
    public void setTextType(String textType) {
        this.textType = textType;
    }

    /**
     * <p>
     * The kind of text that Amazon Textract has detected. Can check for
     * handwritten text and printed text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HANDWRITING, PRINTED
     *
     * @param textType <p>
     *            The kind of text that Amazon Textract has detected. Can check
     *            for handwritten text and printed text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TextType
     */
    public Block withTextType(String textType) {
        this.textType = textType;
        return this;
    }

    /**
     * <p>
     * The kind of text that Amazon Textract has detected. Can check for
     * handwritten text and printed text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HANDWRITING, PRINTED
     *
     * @param textType <p>
     *            The kind of text that Amazon Textract has detected. Can check
     *            for handwritten text and printed text.
     *            </p>
     * @see TextType
     */
    public void setTextType(TextType textType) {
        this.textType = textType.toString();
    }

    /**
     * <p>
     * The kind of text that Amazon Textract has detected. Can check for
     * handwritten text and printed text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HANDWRITING, PRINTED
     *
     * @param textType <p>
     *            The kind of text that Amazon Textract has detected. Can check
     *            for handwritten text and printed text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TextType
     */
    public Block withTextType(TextType textType) {
        this.textType = textType.toString();
        return this;
    }

    /**
     * <p>
     * The row in which a table cell is located. The first row position is 1.
     * <code>RowIndex</code> isn't returned by <code>DetectDocumentText</code>
     * and <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The row in which a table cell is located. The first row position
     *         is 1. <code>RowIndex</code> isn't returned by
     *         <code>DetectDocumentText</code> and
     *         <code>GetDocumentTextDetection</code>.
     *         </p>
     */
    public Integer getRowIndex() {
        return rowIndex;
    }

    /**
     * <p>
     * The row in which a table cell is located. The first row position is 1.
     * <code>RowIndex</code> isn't returned by <code>DetectDocumentText</code>
     * and <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param rowIndex <p>
     *            The row in which a table cell is located. The first row
     *            position is 1. <code>RowIndex</code> isn't returned by
     *            <code>DetectDocumentText</code> and
     *            <code>GetDocumentTextDetection</code>.
     *            </p>
     */
    public void setRowIndex(Integer rowIndex) {
        this.rowIndex = rowIndex;
    }

    /**
     * <p>
     * The row in which a table cell is located. The first row position is 1.
     * <code>RowIndex</code> isn't returned by <code>DetectDocumentText</code>
     * and <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param rowIndex <p>
     *            The row in which a table cell is located. The first row
     *            position is 1. <code>RowIndex</code> isn't returned by
     *            <code>DetectDocumentText</code> and
     *            <code>GetDocumentTextDetection</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Block withRowIndex(Integer rowIndex) {
        this.rowIndex = rowIndex;
        return this;
    }

    /**
     * <p>
     * The column in which a table cell appears. The first column position is 1.
     * <code>ColumnIndex</code> isn't returned by
     * <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The column in which a table cell appears. The first column
     *         position is 1. <code>ColumnIndex</code> isn't returned by
     *         <code>DetectDocumentText</code> and
     *         <code>GetDocumentTextDetection</code>.
     *         </p>
     */
    public Integer getColumnIndex() {
        return columnIndex;
    }

    /**
     * <p>
     * The column in which a table cell appears. The first column position is 1.
     * <code>ColumnIndex</code> isn't returned by
     * <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param columnIndex <p>
     *            The column in which a table cell appears. The first column
     *            position is 1. <code>ColumnIndex</code> isn't returned by
     *            <code>DetectDocumentText</code> and
     *            <code>GetDocumentTextDetection</code>.
     *            </p>
     */
    public void setColumnIndex(Integer columnIndex) {
        this.columnIndex = columnIndex;
    }

    /**
     * <p>
     * The column in which a table cell appears. The first column position is 1.
     * <code>ColumnIndex</code> isn't returned by
     * <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param columnIndex <p>
     *            The column in which a table cell appears. The first column
     *            position is 1. <code>ColumnIndex</code> isn't returned by
     *            <code>DetectDocumentText</code> and
     *            <code>GetDocumentTextDetection</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Block withColumnIndex(Integer columnIndex) {
        this.columnIndex = columnIndex;
        return this;
    }

    /**
     * <p>
     * The number of rows that a table cell spans. <code>RowSpan</code> isn't
     * returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of rows that a table cell spans. <code>RowSpan</code>
     *         isn't returned by <code>DetectDocumentText</code> and
     *         <code>GetDocumentTextDetection</code>.
     *         </p>
     */
    public Integer getRowSpan() {
        return rowSpan;
    }

    /**
     * <p>
     * The number of rows that a table cell spans. <code>RowSpan</code> isn't
     * returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param rowSpan <p>
     *            The number of rows that a table cell spans.
     *            <code>RowSpan</code> isn't returned by
     *            <code>DetectDocumentText</code> and
     *            <code>GetDocumentTextDetection</code>.
     *            </p>
     */
    public void setRowSpan(Integer rowSpan) {
        this.rowSpan = rowSpan;
    }

    /**
     * <p>
     * The number of rows that a table cell spans. <code>RowSpan</code> isn't
     * returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param rowSpan <p>
     *            The number of rows that a table cell spans.
     *            <code>RowSpan</code> isn't returned by
     *            <code>DetectDocumentText</code> and
     *            <code>GetDocumentTextDetection</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Block withRowSpan(Integer rowSpan) {
        this.rowSpan = rowSpan;
        return this;
    }

    /**
     * <p>
     * The number of columns that a table cell spans. <code>ColumnSpan</code>
     * isn't returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of columns that a table cell spans.
     *         <code>ColumnSpan</code> isn't returned by
     *         <code>DetectDocumentText</code> and
     *         <code>GetDocumentTextDetection</code>.
     *         </p>
     */
    public Integer getColumnSpan() {
        return columnSpan;
    }

    /**
     * <p>
     * The number of columns that a table cell spans. <code>ColumnSpan</code>
     * isn't returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param columnSpan <p>
     *            The number of columns that a table cell spans.
     *            <code>ColumnSpan</code> isn't returned by
     *            <code>DetectDocumentText</code> and
     *            <code>GetDocumentTextDetection</code>.
     *            </p>
     */
    public void setColumnSpan(Integer columnSpan) {
        this.columnSpan = columnSpan;
    }

    /**
     * <p>
     * The number of columns that a table cell spans. <code>ColumnSpan</code>
     * isn't returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param columnSpan <p>
     *            The number of columns that a table cell spans.
     *            <code>ColumnSpan</code> isn't returned by
     *            <code>DetectDocumentText</code> and
     *            <code>GetDocumentTextDetection</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Block withColumnSpan(Integer columnSpan) {
        this.columnSpan = columnSpan;
        return this;
    }

    /**
     * <p>
     * The location of the recognized text on the image. It includes an
     * axis-aligned, coarse bounding box that surrounds the text, and a
     * finer-grain polygon for more accurate spatial information.
     * </p>
     *
     * @return <p>
     *         The location of the recognized text on the image. It includes an
     *         axis-aligned, coarse bounding box that surrounds the text, and a
     *         finer-grain polygon for more accurate spatial information.
     *         </p>
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * <p>
     * The location of the recognized text on the image. It includes an
     * axis-aligned, coarse bounding box that surrounds the text, and a
     * finer-grain polygon for more accurate spatial information.
     * </p>
     *
     * @param geometry <p>
     *            The location of the recognized text on the image. It includes
     *            an axis-aligned, coarse bounding box that surrounds the text,
     *            and a finer-grain polygon for more accurate spatial
     *            information.
     *            </p>
     */
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    /**
     * <p>
     * The location of the recognized text on the image. It includes an
     * axis-aligned, coarse bounding box that surrounds the text, and a
     * finer-grain polygon for more accurate spatial information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geometry <p>
     *            The location of the recognized text on the image. It includes
     *            an axis-aligned, coarse bounding box that surrounds the text,
     *            and a finer-grain polygon for more accurate spatial
     *            information.
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
     * The identifier for the recognized text. The identifier is only unique for
     * a single operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The identifier for the recognized text. The identifier is only
     *         unique for a single operation.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier for the recognized text. The identifier is only unique for
     * a single operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param id <p>
     *            The identifier for the recognized text. The identifier is only
     *            unique for a single operation.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the recognized text. The identifier is only unique for
     * a single operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param id <p>
     *            The identifier for the recognized text. The identifier is only
     *            unique for a single operation.
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
     * A list of relationship objects that describe how blocks are related to
     * each other. For example, a LINE block object contains a CHILD
     * relationship type with the WORD blocks that make up the line of text.
     * There aren't Relationship objects in the list for relationships that
     * don't exist, such as when the current block has no child blocks.
     * </p>
     *
     * @return <p>
     *         A list of relationship objects that describe how blocks are
     *         related to each other. For example, a LINE block object contains
     *         a CHILD relationship type with the WORD blocks that make up the
     *         line of text. There aren't Relationship objects in the list for
     *         relationships that don't exist, such as when the current block
     *         has no child blocks.
     *         </p>
     */
    public java.util.List<Relationship> getRelationships() {
        return relationships;
    }

    /**
     * <p>
     * A list of relationship objects that describe how blocks are related to
     * each other. For example, a LINE block object contains a CHILD
     * relationship type with the WORD blocks that make up the line of text.
     * There aren't Relationship objects in the list for relationships that
     * don't exist, such as when the current block has no child blocks.
     * </p>
     *
     * @param relationships <p>
     *            A list of relationship objects that describe how blocks are
     *            related to each other. For example, a LINE block object
     *            contains a CHILD relationship type with the WORD blocks that
     *            make up the line of text. There aren't Relationship objects in
     *            the list for relationships that don't exist, such as when the
     *            current block has no child blocks.
     *            </p>
     */
    public void setRelationships(java.util.Collection<Relationship> relationships) {
        if (relationships == null) {
            this.relationships = null;
            return;
        }

        this.relationships = new java.util.ArrayList<Relationship>(relationships);
    }

    /**
     * <p>
     * A list of relationship objects that describe how blocks are related to
     * each other. For example, a LINE block object contains a CHILD
     * relationship type with the WORD blocks that make up the line of text.
     * There aren't Relationship objects in the list for relationships that
     * don't exist, such as when the current block has no child blocks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relationships <p>
     *            A list of relationship objects that describe how blocks are
     *            related to each other. For example, a LINE block object
     *            contains a CHILD relationship type with the WORD blocks that
     *            make up the line of text. There aren't Relationship objects in
     *            the list for relationships that don't exist, such as when the
     *            current block has no child blocks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Block withRelationships(Relationship... relationships) {
        if (getRelationships() == null) {
            this.relationships = new java.util.ArrayList<Relationship>(relationships.length);
        }
        for (Relationship value : relationships) {
            this.relationships.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of relationship objects that describe how blocks are related to
     * each other. For example, a LINE block object contains a CHILD
     * relationship type with the WORD blocks that make up the line of text.
     * There aren't Relationship objects in the list for relationships that
     * don't exist, such as when the current block has no child blocks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relationships <p>
     *            A list of relationship objects that describe how blocks are
     *            related to each other. For example, a LINE block object
     *            contains a CHILD relationship type with the WORD blocks that
     *            make up the line of text. There aren't Relationship objects in
     *            the list for relationships that don't exist, such as when the
     *            current block has no child blocks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Block withRelationships(java.util.Collection<Relationship> relationships) {
        setRelationships(relationships);
        return this;
    }

    /**
     * <p>
     * The type of entity.
     * </p>
     * <p>
     * The following entity types can be returned by FORMS analysis:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEY</i> - An identifier for a field on the document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>VALUE</i> - The field text.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following entity types can be returned by TABLES analysis:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COLUMN_HEADER</i> - Identifies a cell that is a header of a column.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_TITLE</i> - Identifies a cell that is a title within the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_SECTION_TITLE</i> - Identifies a cell that is a title of a
     * section within a table. A section title is a cell that typically spans an
     * entire row above a section.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_FOOTER</i> - Identifies a cell that is a footer of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_SUMMARY</i> - Identifies a summary cell of a table. A summary
     * cell can be a row of a table or an additional, smaller table that
     * contains summary information for another table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>STRUCTURED_TABLE </i> - Identifies a table with column headers where
     * the content of each row corresponds to the headers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SEMI_STRUCTURED_TABLE</i> - Identifies a non-structured table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>EntityTypes</code> isn't returned by
     * <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>
     * .
     * </p>
     *
     * @return <p>
     *         The type of entity.
     *         </p>
     *         <p>
     *         The following entity types can be returned by FORMS analysis:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>KEY</i> - An identifier for a field on the document.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>VALUE</i> - The field text.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following entity types can be returned by TABLES analysis:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>COLUMN_HEADER</i> - Identifies a cell that is a header of a
     *         column.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>TABLE_TITLE</i> - Identifies a cell that is a title within the
     *         table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>TABLE_SECTION_TITLE</i> - Identifies a cell that is a title of
     *         a section within a table. A section title is a cell that
     *         typically spans an entire row above a section.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>TABLE_FOOTER</i> - Identifies a cell that is a footer of a
     *         table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>TABLE_SUMMARY</i> - Identifies a summary cell of a table. A
     *         summary cell can be a row of a table or an additional, smaller
     *         table that contains summary information for another table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>STRUCTURED_TABLE </i> - Identifies a table with column headers
     *         where the content of each row corresponds to the headers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SEMI_STRUCTURED_TABLE</i> - Identifies a non-structured table.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>EntityTypes</code> isn't returned by
     *         <code>DetectDocumentText</code> and
     *         <code>GetDocumentTextDetection</code>.
     *         </p>
     */
    public java.util.List<String> getEntityTypes() {
        return entityTypes;
    }

    /**
     * <p>
     * The type of entity.
     * </p>
     * <p>
     * The following entity types can be returned by FORMS analysis:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEY</i> - An identifier for a field on the document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>VALUE</i> - The field text.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following entity types can be returned by TABLES analysis:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COLUMN_HEADER</i> - Identifies a cell that is a header of a column.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_TITLE</i> - Identifies a cell that is a title within the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_SECTION_TITLE</i> - Identifies a cell that is a title of a
     * section within a table. A section title is a cell that typically spans an
     * entire row above a section.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_FOOTER</i> - Identifies a cell that is a footer of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_SUMMARY</i> - Identifies a summary cell of a table. A summary
     * cell can be a row of a table or an additional, smaller table that
     * contains summary information for another table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>STRUCTURED_TABLE </i> - Identifies a table with column headers where
     * the content of each row corresponds to the headers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SEMI_STRUCTURED_TABLE</i> - Identifies a non-structured table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>EntityTypes</code> isn't returned by
     * <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>
     * .
     * </p>
     *
     * @param entityTypes <p>
     *            The type of entity.
     *            </p>
     *            <p>
     *            The following entity types can be returned by FORMS analysis:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>KEY</i> - An identifier for a field on the document.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>VALUE</i> - The field text.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following entity types can be returned by TABLES analysis:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>COLUMN_HEADER</i> - Identifies a cell that is a header of a
     *            column.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_TITLE</i> - Identifies a cell that is a title within
     *            the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_SECTION_TITLE</i> - Identifies a cell that is a title
     *            of a section within a table. A section title is a cell that
     *            typically spans an entire row above a section.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_FOOTER</i> - Identifies a cell that is a footer of a
     *            table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_SUMMARY</i> - Identifies a summary cell of a table. A
     *            summary cell can be a row of a table or an additional, smaller
     *            table that contains summary information for another table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>STRUCTURED_TABLE </i> - Identifies a table with column
     *            headers where the content of each row corresponds to the
     *            headers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>SEMI_STRUCTURED_TABLE</i> - Identifies a non-structured
     *            table.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <code>EntityTypes</code> isn't returned by
     *            <code>DetectDocumentText</code> and
     *            <code>GetDocumentTextDetection</code>.
     *            </p>
     */
    public void setEntityTypes(java.util.Collection<String> entityTypes) {
        if (entityTypes == null) {
            this.entityTypes = null;
            return;
        }

        this.entityTypes = new java.util.ArrayList<String>(entityTypes);
    }

    /**
     * <p>
     * The type of entity.
     * </p>
     * <p>
     * The following entity types can be returned by FORMS analysis:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEY</i> - An identifier for a field on the document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>VALUE</i> - The field text.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following entity types can be returned by TABLES analysis:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COLUMN_HEADER</i> - Identifies a cell that is a header of a column.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_TITLE</i> - Identifies a cell that is a title within the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_SECTION_TITLE</i> - Identifies a cell that is a title of a
     * section within a table. A section title is a cell that typically spans an
     * entire row above a section.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_FOOTER</i> - Identifies a cell that is a footer of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_SUMMARY</i> - Identifies a summary cell of a table. A summary
     * cell can be a row of a table or an additional, smaller table that
     * contains summary information for another table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>STRUCTURED_TABLE </i> - Identifies a table with column headers where
     * the content of each row corresponds to the headers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SEMI_STRUCTURED_TABLE</i> - Identifies a non-structured table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>EntityTypes</code> isn't returned by
     * <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityTypes <p>
     *            The type of entity.
     *            </p>
     *            <p>
     *            The following entity types can be returned by FORMS analysis:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>KEY</i> - An identifier for a field on the document.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>VALUE</i> - The field text.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following entity types can be returned by TABLES analysis:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>COLUMN_HEADER</i> - Identifies a cell that is a header of a
     *            column.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_TITLE</i> - Identifies a cell that is a title within
     *            the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_SECTION_TITLE</i> - Identifies a cell that is a title
     *            of a section within a table. A section title is a cell that
     *            typically spans an entire row above a section.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_FOOTER</i> - Identifies a cell that is a footer of a
     *            table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_SUMMARY</i> - Identifies a summary cell of a table. A
     *            summary cell can be a row of a table or an additional, smaller
     *            table that contains summary information for another table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>STRUCTURED_TABLE </i> - Identifies a table with column
     *            headers where the content of each row corresponds to the
     *            headers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>SEMI_STRUCTURED_TABLE</i> - Identifies a non-structured
     *            table.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <code>EntityTypes</code> isn't returned by
     *            <code>DetectDocumentText</code> and
     *            <code>GetDocumentTextDetection</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Block withEntityTypes(String... entityTypes) {
        if (getEntityTypes() == null) {
            this.entityTypes = new java.util.ArrayList<String>(entityTypes.length);
        }
        for (String value : entityTypes) {
            this.entityTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The type of entity.
     * </p>
     * <p>
     * The following entity types can be returned by FORMS analysis:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEY</i> - An identifier for a field on the document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>VALUE</i> - The field text.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following entity types can be returned by TABLES analysis:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COLUMN_HEADER</i> - Identifies a cell that is a header of a column.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_TITLE</i> - Identifies a cell that is a title within the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_SECTION_TITLE</i> - Identifies a cell that is a title of a
     * section within a table. A section title is a cell that typically spans an
     * entire row above a section.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_FOOTER</i> - Identifies a cell that is a footer of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE_SUMMARY</i> - Identifies a summary cell of a table. A summary
     * cell can be a row of a table or an additional, smaller table that
     * contains summary information for another table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>STRUCTURED_TABLE </i> - Identifies a table with column headers where
     * the content of each row corresponds to the headers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SEMI_STRUCTURED_TABLE</i> - Identifies a non-structured table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>EntityTypes</code> isn't returned by
     * <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityTypes <p>
     *            The type of entity.
     *            </p>
     *            <p>
     *            The following entity types can be returned by FORMS analysis:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>KEY</i> - An identifier for a field on the document.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>VALUE</i> - The field text.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following entity types can be returned by TABLES analysis:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>COLUMN_HEADER</i> - Identifies a cell that is a header of a
     *            column.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_TITLE</i> - Identifies a cell that is a title within
     *            the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_SECTION_TITLE</i> - Identifies a cell that is a title
     *            of a section within a table. A section title is a cell that
     *            typically spans an entire row above a section.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_FOOTER</i> - Identifies a cell that is a footer of a
     *            table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TABLE_SUMMARY</i> - Identifies a summary cell of a table. A
     *            summary cell can be a row of a table or an additional, smaller
     *            table that contains summary information for another table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>STRUCTURED_TABLE </i> - Identifies a table with column
     *            headers where the content of each row corresponds to the
     *            headers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>SEMI_STRUCTURED_TABLE</i> - Identifies a non-structured
     *            table.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <code>EntityTypes</code> isn't returned by
     *            <code>DetectDocumentText</code> and
     *            <code>GetDocumentTextDetection</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Block withEntityTypes(java.util.Collection<String> entityTypes) {
        setEntityTypes(entityTypes);
        return this;
    }

    /**
     * <p>
     * The selection status of a selection element, such as an option button or
     * check box.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELECTED, NOT_SELECTED
     *
     * @return <p>
     *         The selection status of a selection element, such as an option
     *         button or check box.
     *         </p>
     * @see SelectionStatus
     */
    public String getSelectionStatus() {
        return selectionStatus;
    }

    /**
     * <p>
     * The selection status of a selection element, such as an option button or
     * check box.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELECTED, NOT_SELECTED
     *
     * @param selectionStatus <p>
     *            The selection status of a selection element, such as an option
     *            button or check box.
     *            </p>
     * @see SelectionStatus
     */
    public void setSelectionStatus(String selectionStatus) {
        this.selectionStatus = selectionStatus;
    }

    /**
     * <p>
     * The selection status of a selection element, such as an option button or
     * check box.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELECTED, NOT_SELECTED
     *
     * @param selectionStatus <p>
     *            The selection status of a selection element, such as an option
     *            button or check box.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SelectionStatus
     */
    public Block withSelectionStatus(String selectionStatus) {
        this.selectionStatus = selectionStatus;
        return this;
    }

    /**
     * <p>
     * The selection status of a selection element, such as an option button or
     * check box.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELECTED, NOT_SELECTED
     *
     * @param selectionStatus <p>
     *            The selection status of a selection element, such as an option
     *            button or check box.
     *            </p>
     * @see SelectionStatus
     */
    public void setSelectionStatus(SelectionStatus selectionStatus) {
        this.selectionStatus = selectionStatus.toString();
    }

    /**
     * <p>
     * The selection status of a selection element, such as an option button or
     * check box.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELECTED, NOT_SELECTED
     *
     * @param selectionStatus <p>
     *            The selection status of a selection element, such as an option
     *            button or check box.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SelectionStatus
     */
    public Block withSelectionStatus(SelectionStatus selectionStatus) {
        this.selectionStatus = selectionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The page on which a block was detected. <code>Page</code> is returned by
     * synchronous and asynchronous operations. Page values greater than 1 are
     * only returned for multipage documents that are in PDF or TIFF format. A
     * scanned image (JPEG/PNG) provided to an asynchronous operation, even if
     * it contains multiple document pages, is considered a single-page
     * document. This means that for scanned images the value of
     * <code>Page</code> is always 1. Synchronous operations will also return a
     * <code>Page</code> value of 1 because every input document is considered
     * to be a single-page document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The page on which a block was detected. <code>Page</code> is
     *         returned by synchronous and asynchronous operations. Page values
     *         greater than 1 are only returned for multipage documents that are
     *         in PDF or TIFF format. A scanned image (JPEG/PNG) provided to an
     *         asynchronous operation, even if it contains multiple document
     *         pages, is considered a single-page document. This means that for
     *         scanned images the value of <code>Page</code> is always 1.
     *         Synchronous operations will also return a <code>Page</code> value
     *         of 1 because every input document is considered to be a
     *         single-page document.
     *         </p>
     */
    public Integer getPage() {
        return page;
    }

    /**
     * <p>
     * The page on which a block was detected. <code>Page</code> is returned by
     * synchronous and asynchronous operations. Page values greater than 1 are
     * only returned for multipage documents that are in PDF or TIFF format. A
     * scanned image (JPEG/PNG) provided to an asynchronous operation, even if
     * it contains multiple document pages, is considered a single-page
     * document. This means that for scanned images the value of
     * <code>Page</code> is always 1. Synchronous operations will also return a
     * <code>Page</code> value of 1 because every input document is considered
     * to be a single-page document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param page <p>
     *            The page on which a block was detected. <code>Page</code> is
     *            returned by synchronous and asynchronous operations. Page
     *            values greater than 1 are only returned for multipage
     *            documents that are in PDF or TIFF format. A scanned image
     *            (JPEG/PNG) provided to an asynchronous operation, even if it
     *            contains multiple document pages, is considered a single-page
     *            document. This means that for scanned images the value of
     *            <code>Page</code> is always 1. Synchronous operations will
     *            also return a <code>Page</code> value of 1 because every input
     *            document is considered to be a single-page document.
     *            </p>
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * <p>
     * The page on which a block was detected. <code>Page</code> is returned by
     * synchronous and asynchronous operations. Page values greater than 1 are
     * only returned for multipage documents that are in PDF or TIFF format. A
     * scanned image (JPEG/PNG) provided to an asynchronous operation, even if
     * it contains multiple document pages, is considered a single-page
     * document. This means that for scanned images the value of
     * <code>Page</code> is always 1. Synchronous operations will also return a
     * <code>Page</code> value of 1 because every input document is considered
     * to be a single-page document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param page <p>
     *            The page on which a block was detected. <code>Page</code> is
     *            returned by synchronous and asynchronous operations. Page
     *            values greater than 1 are only returned for multipage
     *            documents that are in PDF or TIFF format. A scanned image
     *            (JPEG/PNG) provided to an asynchronous operation, even if it
     *            contains multiple document pages, is considered a single-page
     *            document. This means that for scanned images the value of
     *            <code>Page</code> is always 1. Synchronous operations will
     *            also return a <code>Page</code> value of 1 because every input
     *            document is considered to be a single-page document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Block withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public Query getQuery() {
        return query;
    }

    /**
     * <p/>
     *
     * @param query <p/>
     */
    public void setQuery(Query query) {
        this.query = query;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param query <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Block withQuery(Query query) {
        this.query = query;
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
        if (getBlockType() != null)
            sb.append("BlockType: " + getBlockType() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence() + ",");
        if (getText() != null)
            sb.append("Text: " + getText() + ",");
        if (getTextType() != null)
            sb.append("TextType: " + getTextType() + ",");
        if (getRowIndex() != null)
            sb.append("RowIndex: " + getRowIndex() + ",");
        if (getColumnIndex() != null)
            sb.append("ColumnIndex: " + getColumnIndex() + ",");
        if (getRowSpan() != null)
            sb.append("RowSpan: " + getRowSpan() + ",");
        if (getColumnSpan() != null)
            sb.append("ColumnSpan: " + getColumnSpan() + ",");
        if (getGeometry() != null)
            sb.append("Geometry: " + getGeometry() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getRelationships() != null)
            sb.append("Relationships: " + getRelationships() + ",");
        if (getEntityTypes() != null)
            sb.append("EntityTypes: " + getEntityTypes() + ",");
        if (getSelectionStatus() != null)
            sb.append("SelectionStatus: " + getSelectionStatus() + ",");
        if (getPage() != null)
            sb.append("Page: " + getPage() + ",");
        if (getQuery() != null)
            sb.append("Query: " + getQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockType() == null) ? 0 : getBlockType().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getTextType() == null) ? 0 : getTextType().hashCode());
        hashCode = prime * hashCode + ((getRowIndex() == null) ? 0 : getRowIndex().hashCode());
        hashCode = prime * hashCode
                + ((getColumnIndex() == null) ? 0 : getColumnIndex().hashCode());
        hashCode = prime * hashCode + ((getRowSpan() == null) ? 0 : getRowSpan().hashCode());
        hashCode = prime * hashCode + ((getColumnSpan() == null) ? 0 : getColumnSpan().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getRelationships() == null) ? 0 : getRelationships().hashCode());
        hashCode = prime * hashCode
                + ((getEntityTypes() == null) ? 0 : getEntityTypes().hashCode());
        hashCode = prime * hashCode
                + ((getSelectionStatus() == null) ? 0 : getSelectionStatus().hashCode());
        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode());
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

        if (other.getBlockType() == null ^ this.getBlockType() == null)
            return false;
        if (other.getBlockType() != null
                && other.getBlockType().equals(this.getBlockType()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getTextType() == null ^ this.getTextType() == null)
            return false;
        if (other.getTextType() != null && other.getTextType().equals(this.getTextType()) == false)
            return false;
        if (other.getRowIndex() == null ^ this.getRowIndex() == null)
            return false;
        if (other.getRowIndex() != null && other.getRowIndex().equals(this.getRowIndex()) == false)
            return false;
        if (other.getColumnIndex() == null ^ this.getColumnIndex() == null)
            return false;
        if (other.getColumnIndex() != null
                && other.getColumnIndex().equals(this.getColumnIndex()) == false)
            return false;
        if (other.getRowSpan() == null ^ this.getRowSpan() == null)
            return false;
        if (other.getRowSpan() != null && other.getRowSpan().equals(this.getRowSpan()) == false)
            return false;
        if (other.getColumnSpan() == null ^ this.getColumnSpan() == null)
            return false;
        if (other.getColumnSpan() != null
                && other.getColumnSpan().equals(this.getColumnSpan()) == false)
            return false;
        if (other.getGeometry() == null ^ this.getGeometry() == null)
            return false;
        if (other.getGeometry() != null && other.getGeometry().equals(this.getGeometry()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRelationships() == null ^ this.getRelationships() == null)
            return false;
        if (other.getRelationships() != null
                && other.getRelationships().equals(this.getRelationships()) == false)
            return false;
        if (other.getEntityTypes() == null ^ this.getEntityTypes() == null)
            return false;
        if (other.getEntityTypes() != null
                && other.getEntityTypes().equals(this.getEntityTypes()) == false)
            return false;
        if (other.getSelectionStatus() == null ^ this.getSelectionStatus() == null)
            return false;
        if (other.getSelectionStatus() != null
                && other.getSelectionStatus().equals(this.getSelectionStatus()) == false)
            return false;
        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        if (other.getQuery() == null ^ this.getQuery() == null)
            return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false)
            return false;
        return true;
    }
}

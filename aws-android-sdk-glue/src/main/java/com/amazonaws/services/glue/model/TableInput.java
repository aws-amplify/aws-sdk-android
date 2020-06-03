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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * A structure used to define a table.
 * </p>
 */
public class TableInput implements Serializable {
    /**
     * <p>
     * The table name. For Hive compatibility, this is folded to lowercase when
     * it is stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String description;

    /**
     * <p>
     * The table owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String owner;

    /**
     * <p>
     * The last time that the table was accessed.
     * </p>
     */
    private java.util.Date lastAccessTime;

    /**
     * <p>
     * The last time that column statistics were computed for this table.
     * </p>
     */
    private java.util.Date lastAnalyzedTime;

    /**
     * <p>
     * The retention time for this table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer retention;

    /**
     * <p>
     * A storage descriptor containing information about the physical storage of
     * this table.
     * </p>
     */
    private StorageDescriptor storageDescriptor;

    /**
     * <p>
     * A list of columns by which the table is partitioned. Only primitive types
     * are supported as partition keys.
     * </p>
     * <p>
     * When you create a table used by Amazon Athena, and you do not specify any
     * <code>partitionKeys</code>, you must at least set the value of
     * <code>partitionKeys</code> to an empty list. For example:
     * </p>
     * <p>
     * <code>"PartitionKeys": []</code>
     * </p>
     */
    private java.util.List<Column> partitionKeys;

    /**
     * <p>
     * If the table is a view, the original text of the view; otherwise
     * <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 409600<br/>
     */
    private String viewOriginalText;

    /**
     * <p>
     * If the table is a view, the expanded text of the view; otherwise
     * <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 409600<br/>
     */
    private String viewExpandedText;

    /**
     * <p>
     * The type of this table (<code>EXTERNAL_TABLE</code>,
     * <code>VIRTUAL_VIEW</code>, etc.).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String tableType;

    /**
     * <p>
     * These key-value pairs define properties associated with the table.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The table name. For Hive compatibility, this is folded to lowercase when
     * it is stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The table name. For Hive compatibility, this is folded to
     *         lowercase when it is stored.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The table name. For Hive compatibility, this is folded to lowercase when
     * it is stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The table name. For Hive compatibility, this is folded to
     *            lowercase when it is stored.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The table name. For Hive compatibility, this is folded to lowercase when
     * it is stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The table name. For Hive compatibility, this is folded to
     *            lowercase when it is stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A description of the table.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            A description of the table.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            A description of the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableInput withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The table owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The table owner.
     *         </p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>
     * The table owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param owner <p>
     *            The table owner.
     *            </p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The table owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param owner <p>
     *            The table owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableInput withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * The last time that the table was accessed.
     * </p>
     *
     * @return <p>
     *         The last time that the table was accessed.
     *         </p>
     */
    public java.util.Date getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * <p>
     * The last time that the table was accessed.
     * </p>
     *
     * @param lastAccessTime <p>
     *            The last time that the table was accessed.
     *            </p>
     */
    public void setLastAccessTime(java.util.Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * <p>
     * The last time that the table was accessed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastAccessTime <p>
     *            The last time that the table was accessed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableInput withLastAccessTime(java.util.Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }

    /**
     * <p>
     * The last time that column statistics were computed for this table.
     * </p>
     *
     * @return <p>
     *         The last time that column statistics were computed for this
     *         table.
     *         </p>
     */
    public java.util.Date getLastAnalyzedTime() {
        return lastAnalyzedTime;
    }

    /**
     * <p>
     * The last time that column statistics were computed for this table.
     * </p>
     *
     * @param lastAnalyzedTime <p>
     *            The last time that column statistics were computed for this
     *            table.
     *            </p>
     */
    public void setLastAnalyzedTime(java.util.Date lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
    }

    /**
     * <p>
     * The last time that column statistics were computed for this table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastAnalyzedTime <p>
     *            The last time that column statistics were computed for this
     *            table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableInput withLastAnalyzedTime(java.util.Date lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
        return this;
    }

    /**
     * <p>
     * The retention time for this table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The retention time for this table.
     *         </p>
     */
    public Integer getRetention() {
        return retention;
    }

    /**
     * <p>
     * The retention time for this table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param retention <p>
     *            The retention time for this table.
     *            </p>
     */
    public void setRetention(Integer retention) {
        this.retention = retention;
    }

    /**
     * <p>
     * The retention time for this table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param retention <p>
     *            The retention time for this table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableInput withRetention(Integer retention) {
        this.retention = retention;
        return this;
    }

    /**
     * <p>
     * A storage descriptor containing information about the physical storage of
     * this table.
     * </p>
     *
     * @return <p>
     *         A storage descriptor containing information about the physical
     *         storage of this table.
     *         </p>
     */
    public StorageDescriptor getStorageDescriptor() {
        return storageDescriptor;
    }

    /**
     * <p>
     * A storage descriptor containing information about the physical storage of
     * this table.
     * </p>
     *
     * @param storageDescriptor <p>
     *            A storage descriptor containing information about the physical
     *            storage of this table.
     *            </p>
     */
    public void setStorageDescriptor(StorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
    }

    /**
     * <p>
     * A storage descriptor containing information about the physical storage of
     * this table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageDescriptor <p>
     *            A storage descriptor containing information about the physical
     *            storage of this table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableInput withStorageDescriptor(StorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
        return this;
    }

    /**
     * <p>
     * A list of columns by which the table is partitioned. Only primitive types
     * are supported as partition keys.
     * </p>
     * <p>
     * When you create a table used by Amazon Athena, and you do not specify any
     * <code>partitionKeys</code>, you must at least set the value of
     * <code>partitionKeys</code> to an empty list. For example:
     * </p>
     * <p>
     * <code>"PartitionKeys": []</code>
     * </p>
     *
     * @return <p>
     *         A list of columns by which the table is partitioned. Only
     *         primitive types are supported as partition keys.
     *         </p>
     *         <p>
     *         When you create a table used by Amazon Athena, and you do not
     *         specify any <code>partitionKeys</code>, you must at least set the
     *         value of <code>partitionKeys</code> to an empty list. For
     *         example:
     *         </p>
     *         <p>
     *         <code>"PartitionKeys": []</code>
     *         </p>
     */
    public java.util.List<Column> getPartitionKeys() {
        return partitionKeys;
    }

    /**
     * <p>
     * A list of columns by which the table is partitioned. Only primitive types
     * are supported as partition keys.
     * </p>
     * <p>
     * When you create a table used by Amazon Athena, and you do not specify any
     * <code>partitionKeys</code>, you must at least set the value of
     * <code>partitionKeys</code> to an empty list. For example:
     * </p>
     * <p>
     * <code>"PartitionKeys": []</code>
     * </p>
     *
     * @param partitionKeys <p>
     *            A list of columns by which the table is partitioned. Only
     *            primitive types are supported as partition keys.
     *            </p>
     *            <p>
     *            When you create a table used by Amazon Athena, and you do not
     *            specify any <code>partitionKeys</code>, you must at least set
     *            the value of <code>partitionKeys</code> to an empty list. For
     *            example:
     *            </p>
     *            <p>
     *            <code>"PartitionKeys": []</code>
     *            </p>
     */
    public void setPartitionKeys(java.util.Collection<Column> partitionKeys) {
        if (partitionKeys == null) {
            this.partitionKeys = null;
            return;
        }

        this.partitionKeys = new java.util.ArrayList<Column>(partitionKeys);
    }

    /**
     * <p>
     * A list of columns by which the table is partitioned. Only primitive types
     * are supported as partition keys.
     * </p>
     * <p>
     * When you create a table used by Amazon Athena, and you do not specify any
     * <code>partitionKeys</code>, you must at least set the value of
     * <code>partitionKeys</code> to an empty list. For example:
     * </p>
     * <p>
     * <code>"PartitionKeys": []</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitionKeys <p>
     *            A list of columns by which the table is partitioned. Only
     *            primitive types are supported as partition keys.
     *            </p>
     *            <p>
     *            When you create a table used by Amazon Athena, and you do not
     *            specify any <code>partitionKeys</code>, you must at least set
     *            the value of <code>partitionKeys</code> to an empty list. For
     *            example:
     *            </p>
     *            <p>
     *            <code>"PartitionKeys": []</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableInput withPartitionKeys(Column... partitionKeys) {
        if (getPartitionKeys() == null) {
            this.partitionKeys = new java.util.ArrayList<Column>(partitionKeys.length);
        }
        for (Column value : partitionKeys) {
            this.partitionKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of columns by which the table is partitioned. Only primitive types
     * are supported as partition keys.
     * </p>
     * <p>
     * When you create a table used by Amazon Athena, and you do not specify any
     * <code>partitionKeys</code>, you must at least set the value of
     * <code>partitionKeys</code> to an empty list. For example:
     * </p>
     * <p>
     * <code>"PartitionKeys": []</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitionKeys <p>
     *            A list of columns by which the table is partitioned. Only
     *            primitive types are supported as partition keys.
     *            </p>
     *            <p>
     *            When you create a table used by Amazon Athena, and you do not
     *            specify any <code>partitionKeys</code>, you must at least set
     *            the value of <code>partitionKeys</code> to an empty list. For
     *            example:
     *            </p>
     *            <p>
     *            <code>"PartitionKeys": []</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableInput withPartitionKeys(java.util.Collection<Column> partitionKeys) {
        setPartitionKeys(partitionKeys);
        return this;
    }

    /**
     * <p>
     * If the table is a view, the original text of the view; otherwise
     * <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 409600<br/>
     *
     * @return <p>
     *         If the table is a view, the original text of the view; otherwise
     *         <code>null</code>.
     *         </p>
     */
    public String getViewOriginalText() {
        return viewOriginalText;
    }

    /**
     * <p>
     * If the table is a view, the original text of the view; otherwise
     * <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 409600<br/>
     *
     * @param viewOriginalText <p>
     *            If the table is a view, the original text of the view;
     *            otherwise <code>null</code>.
     *            </p>
     */
    public void setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
    }

    /**
     * <p>
     * If the table is a view, the original text of the view; otherwise
     * <code>null</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 409600<br/>
     *
     * @param viewOriginalText <p>
     *            If the table is a view, the original text of the view;
     *            otherwise <code>null</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableInput withViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
        return this;
    }

    /**
     * <p>
     * If the table is a view, the expanded text of the view; otherwise
     * <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 409600<br/>
     *
     * @return <p>
     *         If the table is a view, the expanded text of the view; otherwise
     *         <code>null</code>.
     *         </p>
     */
    public String getViewExpandedText() {
        return viewExpandedText;
    }

    /**
     * <p>
     * If the table is a view, the expanded text of the view; otherwise
     * <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 409600<br/>
     *
     * @param viewExpandedText <p>
     *            If the table is a view, the expanded text of the view;
     *            otherwise <code>null</code>.
     *            </p>
     */
    public void setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
    }

    /**
     * <p>
     * If the table is a view, the expanded text of the view; otherwise
     * <code>null</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 409600<br/>
     *
     * @param viewExpandedText <p>
     *            If the table is a view, the expanded text of the view;
     *            otherwise <code>null</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableInput withViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
        return this;
    }

    /**
     * <p>
     * The type of this table (<code>EXTERNAL_TABLE</code>,
     * <code>VIRTUAL_VIEW</code>, etc.).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The type of this table (<code>EXTERNAL_TABLE</code>,
     *         <code>VIRTUAL_VIEW</code>, etc.).
     *         </p>
     */
    public String getTableType() {
        return tableType;
    }

    /**
     * <p>
     * The type of this table (<code>EXTERNAL_TABLE</code>,
     * <code>VIRTUAL_VIEW</code>, etc.).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param tableType <p>
     *            The type of this table (<code>EXTERNAL_TABLE</code>,
     *            <code>VIRTUAL_VIEW</code>, etc.).
     *            </p>
     */
    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    /**
     * <p>
     * The type of this table (<code>EXTERNAL_TABLE</code>,
     * <code>VIRTUAL_VIEW</code>, etc.).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param tableType <p>
     *            The type of this table (<code>EXTERNAL_TABLE</code>,
     *            <code>VIRTUAL_VIEW</code>, etc.).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableInput withTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * <p>
     * These key-value pairs define properties associated with the table.
     * </p>
     *
     * @return <p>
     *         These key-value pairs define properties associated with the
     *         table.
     *         </p>
     */
    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * These key-value pairs define properties associated with the table.
     * </p>
     *
     * @param parameters <p>
     *            These key-value pairs define properties associated with the
     *            table.
     *            </p>
     */
    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * These key-value pairs define properties associated with the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            These key-value pairs define properties associated with the
     *            table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableInput withParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * These key-value pairs define properties associated with the table.
     * </p>
     * <p>
     * The method adds a new key-value pair into Parameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Parameters.
     * @param value The corresponding value of the entry to be added into
     *            Parameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableInput addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public TableInput clearParametersEntries() {
        this.parameters = null;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getLastAccessTime() != null)
            sb.append("LastAccessTime: " + getLastAccessTime() + ",");
        if (getLastAnalyzedTime() != null)
            sb.append("LastAnalyzedTime: " + getLastAnalyzedTime() + ",");
        if (getRetention() != null)
            sb.append("Retention: " + getRetention() + ",");
        if (getStorageDescriptor() != null)
            sb.append("StorageDescriptor: " + getStorageDescriptor() + ",");
        if (getPartitionKeys() != null)
            sb.append("PartitionKeys: " + getPartitionKeys() + ",");
        if (getViewOriginalText() != null)
            sb.append("ViewOriginalText: " + getViewOriginalText() + ",");
        if (getViewExpandedText() != null)
            sb.append("ViewExpandedText: " + getViewExpandedText() + ",");
        if (getTableType() != null)
            sb.append("TableType: " + getTableType() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode
                + ((getLastAccessTime() == null) ? 0 : getLastAccessTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastAnalyzedTime() == null) ? 0 : getLastAnalyzedTime().hashCode());
        hashCode = prime * hashCode + ((getRetention() == null) ? 0 : getRetention().hashCode());
        hashCode = prime * hashCode
                + ((getStorageDescriptor() == null) ? 0 : getStorageDescriptor().hashCode());
        hashCode = prime * hashCode
                + ((getPartitionKeys() == null) ? 0 : getPartitionKeys().hashCode());
        hashCode = prime * hashCode
                + ((getViewOriginalText() == null) ? 0 : getViewOriginalText().hashCode());
        hashCode = prime * hashCode
                + ((getViewExpandedText() == null) ? 0 : getViewExpandedText().hashCode());
        hashCode = prime * hashCode + ((getTableType() == null) ? 0 : getTableType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableInput == false)
            return false;
        TableInput other = (TableInput) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getLastAccessTime() == null ^ this.getLastAccessTime() == null)
            return false;
        if (other.getLastAccessTime() != null
                && other.getLastAccessTime().equals(this.getLastAccessTime()) == false)
            return false;
        if (other.getLastAnalyzedTime() == null ^ this.getLastAnalyzedTime() == null)
            return false;
        if (other.getLastAnalyzedTime() != null
                && other.getLastAnalyzedTime().equals(this.getLastAnalyzedTime()) == false)
            return false;
        if (other.getRetention() == null ^ this.getRetention() == null)
            return false;
        if (other.getRetention() != null
                && other.getRetention().equals(this.getRetention()) == false)
            return false;
        if (other.getStorageDescriptor() == null ^ this.getStorageDescriptor() == null)
            return false;
        if (other.getStorageDescriptor() != null
                && other.getStorageDescriptor().equals(this.getStorageDescriptor()) == false)
            return false;
        if (other.getPartitionKeys() == null ^ this.getPartitionKeys() == null)
            return false;
        if (other.getPartitionKeys() != null
                && other.getPartitionKeys().equals(this.getPartitionKeys()) == false)
            return false;
        if (other.getViewOriginalText() == null ^ this.getViewOriginalText() == null)
            return false;
        if (other.getViewOriginalText() != null
                && other.getViewOriginalText().equals(this.getViewOriginalText()) == false)
            return false;
        if (other.getViewExpandedText() == null ^ this.getViewExpandedText() == null)
            return false;
        if (other.getViewExpandedText() != null
                && other.getViewExpandedText().equals(this.getViewExpandedText()) == false)
            return false;
        if (other.getTableType() == null ^ this.getTableType() == null)
            return false;
        if (other.getTableType() != null
                && other.getTableType().equals(this.getTableType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }
}

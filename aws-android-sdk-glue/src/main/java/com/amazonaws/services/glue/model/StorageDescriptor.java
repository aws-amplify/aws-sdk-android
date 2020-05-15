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
 * Describes the physical storage of table data.
 * </p>
 */
public class StorageDescriptor implements Serializable {
    /**
     * <p>
     * A list of the <code>Columns</code> in the table.
     * </p>
     */
    private java.util.List<Column> columns;

    /**
     * <p>
     * The physical location of the table. By default, this takes the form of
     * the warehouse location, followed by the database location in the
     * warehouse, followed by the table name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2056<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String location;

    /**
     * <p>
     * The input format: <code>SequenceFileInputFormat</code> (binary), or
     * <code>TextInputFormat</code>, or a custom format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String inputFormat;

    /**
     * <p>
     * The output format: <code>SequenceFileOutputFormat</code> (binary), or
     * <code>IgnoreKeyTextOutputFormat</code>, or a custom format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String outputFormat;

    /**
     * <p>
     * <code>True</code> if the data in the table is compressed, or
     * <code>False</code> if not.
     * </p>
     */
    private Boolean compressed;

    /**
     * <p>
     * Must be specified if the table contains any dimension columns.
     * </p>
     */
    private Integer numberOfBuckets;

    /**
     * <p>
     * The serialization/deserialization (SerDe) information.
     * </p>
     */
    private SerDeInfo serdeInfo;

    /**
     * <p>
     * A list of reducer grouping columns, clustering columns, and bucketing
     * columns in the table.
     * </p>
     */
    private java.util.List<String> bucketColumns;

    /**
     * <p>
     * A list specifying the sort order of each bucket in the table.
     * </p>
     */
    private java.util.List<Order> sortColumns;

    /**
     * <p>
     * The user-supplied properties in key-value form.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The information about values that appear frequently in a column (skewed
     * values).
     * </p>
     */
    private SkewedInfo skewedInfo;

    /**
     * <p>
     * <code>True</code> if the table data is stored in subdirectories, or
     * <code>False</code> if not.
     * </p>
     */
    private Boolean storedAsSubDirectories;

    /**
     * <p>
     * A list of the <code>Columns</code> in the table.
     * </p>
     *
     * @return <p>
     *         A list of the <code>Columns</code> in the table.
     *         </p>
     */
    public java.util.List<Column> getColumns() {
        return columns;
    }

    /**
     * <p>
     * A list of the <code>Columns</code> in the table.
     * </p>
     *
     * @param columns <p>
     *            A list of the <code>Columns</code> in the table.
     *            </p>
     */
    public void setColumns(java.util.Collection<Column> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<Column>(columns);
    }

    /**
     * <p>
     * A list of the <code>Columns</code> in the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columns <p>
     *            A list of the <code>Columns</code> in the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageDescriptor withColumns(Column... columns) {
        if (getColumns() == null) {
            this.columns = new java.util.ArrayList<Column>(columns.length);
        }
        for (Column value : columns) {
            this.columns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the <code>Columns</code> in the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columns <p>
     *            A list of the <code>Columns</code> in the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageDescriptor withColumns(java.util.Collection<Column> columns) {
        setColumns(columns);
        return this;
    }

    /**
     * <p>
     * The physical location of the table. By default, this takes the form of
     * the warehouse location, followed by the database location in the
     * warehouse, followed by the table name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2056<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The physical location of the table. By default, this takes the
     *         form of the warehouse location, followed by the database location
     *         in the warehouse, followed by the table name.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The physical location of the table. By default, this takes the form of
     * the warehouse location, followed by the database location in the
     * warehouse, followed by the table name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2056<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param location <p>
     *            The physical location of the table. By default, this takes the
     *            form of the warehouse location, followed by the database
     *            location in the warehouse, followed by the table name.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The physical location of the table. By default, this takes the form of
     * the warehouse location, followed by the database location in the
     * warehouse, followed by the table name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2056<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param location <p>
     *            The physical location of the table. By default, this takes the
     *            form of the warehouse location, followed by the database
     *            location in the warehouse, followed by the table name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageDescriptor withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The input format: <code>SequenceFileInputFormat</code> (binary), or
     * <code>TextInputFormat</code>, or a custom format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The input format: <code>SequenceFileInputFormat</code> (binary),
     *         or <code>TextInputFormat</code>, or a custom format.
     *         </p>
     */
    public String getInputFormat() {
        return inputFormat;
    }

    /**
     * <p>
     * The input format: <code>SequenceFileInputFormat</code> (binary), or
     * <code>TextInputFormat</code>, or a custom format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param inputFormat <p>
     *            The input format: <code>SequenceFileInputFormat</code>
     *            (binary), or <code>TextInputFormat</code>, or a custom format.
     *            </p>
     */
    public void setInputFormat(String inputFormat) {
        this.inputFormat = inputFormat;
    }

    /**
     * <p>
     * The input format: <code>SequenceFileInputFormat</code> (binary), or
     * <code>TextInputFormat</code>, or a custom format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param inputFormat <p>
     *            The input format: <code>SequenceFileInputFormat</code>
     *            (binary), or <code>TextInputFormat</code>, or a custom format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageDescriptor withInputFormat(String inputFormat) {
        this.inputFormat = inputFormat;
        return this;
    }

    /**
     * <p>
     * The output format: <code>SequenceFileOutputFormat</code> (binary), or
     * <code>IgnoreKeyTextOutputFormat</code>, or a custom format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The output format: <code>SequenceFileOutputFormat</code>
     *         (binary), or <code>IgnoreKeyTextOutputFormat</code>, or a custom
     *         format.
     *         </p>
     */
    public String getOutputFormat() {
        return outputFormat;
    }

    /**
     * <p>
     * The output format: <code>SequenceFileOutputFormat</code> (binary), or
     * <code>IgnoreKeyTextOutputFormat</code>, or a custom format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param outputFormat <p>
     *            The output format: <code>SequenceFileOutputFormat</code>
     *            (binary), or <code>IgnoreKeyTextOutputFormat</code>, or a
     *            custom format.
     *            </p>
     */
    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * <p>
     * The output format: <code>SequenceFileOutputFormat</code> (binary), or
     * <code>IgnoreKeyTextOutputFormat</code>, or a custom format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param outputFormat <p>
     *            The output format: <code>SequenceFileOutputFormat</code>
     *            (binary), or <code>IgnoreKeyTextOutputFormat</code>, or a
     *            custom format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageDescriptor withOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }

    /**
     * <p>
     * <code>True</code> if the data in the table is compressed, or
     * <code>False</code> if not.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if the data in the table is compressed, or
     *         <code>False</code> if not.
     *         </p>
     */
    public Boolean isCompressed() {
        return compressed;
    }

    /**
     * <p>
     * <code>True</code> if the data in the table is compressed, or
     * <code>False</code> if not.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if the data in the table is compressed, or
     *         <code>False</code> if not.
     *         </p>
     */
    public Boolean getCompressed() {
        return compressed;
    }

    /**
     * <p>
     * <code>True</code> if the data in the table is compressed, or
     * <code>False</code> if not.
     * </p>
     *
     * @param compressed <p>
     *            <code>True</code> if the data in the table is compressed, or
     *            <code>False</code> if not.
     *            </p>
     */
    public void setCompressed(Boolean compressed) {
        this.compressed = compressed;
    }

    /**
     * <p>
     * <code>True</code> if the data in the table is compressed, or
     * <code>False</code> if not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compressed <p>
     *            <code>True</code> if the data in the table is compressed, or
     *            <code>False</code> if not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageDescriptor withCompressed(Boolean compressed) {
        this.compressed = compressed;
        return this;
    }

    /**
     * <p>
     * Must be specified if the table contains any dimension columns.
     * </p>
     *
     * @return <p>
     *         Must be specified if the table contains any dimension columns.
     *         </p>
     */
    public Integer getNumberOfBuckets() {
        return numberOfBuckets;
    }

    /**
     * <p>
     * Must be specified if the table contains any dimension columns.
     * </p>
     *
     * @param numberOfBuckets <p>
     *            Must be specified if the table contains any dimension columns.
     *            </p>
     */
    public void setNumberOfBuckets(Integer numberOfBuckets) {
        this.numberOfBuckets = numberOfBuckets;
    }

    /**
     * <p>
     * Must be specified if the table contains any dimension columns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfBuckets <p>
     *            Must be specified if the table contains any dimension columns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageDescriptor withNumberOfBuckets(Integer numberOfBuckets) {
        this.numberOfBuckets = numberOfBuckets;
        return this;
    }

    /**
     * <p>
     * The serialization/deserialization (SerDe) information.
     * </p>
     *
     * @return <p>
     *         The serialization/deserialization (SerDe) information.
     *         </p>
     */
    public SerDeInfo getSerdeInfo() {
        return serdeInfo;
    }

    /**
     * <p>
     * The serialization/deserialization (SerDe) information.
     * </p>
     *
     * @param serdeInfo <p>
     *            The serialization/deserialization (SerDe) information.
     *            </p>
     */
    public void setSerdeInfo(SerDeInfo serdeInfo) {
        this.serdeInfo = serdeInfo;
    }

    /**
     * <p>
     * The serialization/deserialization (SerDe) information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serdeInfo <p>
     *            The serialization/deserialization (SerDe) information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageDescriptor withSerdeInfo(SerDeInfo serdeInfo) {
        this.serdeInfo = serdeInfo;
        return this;
    }

    /**
     * <p>
     * A list of reducer grouping columns, clustering columns, and bucketing
     * columns in the table.
     * </p>
     *
     * @return <p>
     *         A list of reducer grouping columns, clustering columns, and
     *         bucketing columns in the table.
     *         </p>
     */
    public java.util.List<String> getBucketColumns() {
        return bucketColumns;
    }

    /**
     * <p>
     * A list of reducer grouping columns, clustering columns, and bucketing
     * columns in the table.
     * </p>
     *
     * @param bucketColumns <p>
     *            A list of reducer grouping columns, clustering columns, and
     *            bucketing columns in the table.
     *            </p>
     */
    public void setBucketColumns(java.util.Collection<String> bucketColumns) {
        if (bucketColumns == null) {
            this.bucketColumns = null;
            return;
        }

        this.bucketColumns = new java.util.ArrayList<String>(bucketColumns);
    }

    /**
     * <p>
     * A list of reducer grouping columns, clustering columns, and bucketing
     * columns in the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketColumns <p>
     *            A list of reducer grouping columns, clustering columns, and
     *            bucketing columns in the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageDescriptor withBucketColumns(String... bucketColumns) {
        if (getBucketColumns() == null) {
            this.bucketColumns = new java.util.ArrayList<String>(bucketColumns.length);
        }
        for (String value : bucketColumns) {
            this.bucketColumns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of reducer grouping columns, clustering columns, and bucketing
     * columns in the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketColumns <p>
     *            A list of reducer grouping columns, clustering columns, and
     *            bucketing columns in the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageDescriptor withBucketColumns(java.util.Collection<String> bucketColumns) {
        setBucketColumns(bucketColumns);
        return this;
    }

    /**
     * <p>
     * A list specifying the sort order of each bucket in the table.
     * </p>
     *
     * @return <p>
     *         A list specifying the sort order of each bucket in the table.
     *         </p>
     */
    public java.util.List<Order> getSortColumns() {
        return sortColumns;
    }

    /**
     * <p>
     * A list specifying the sort order of each bucket in the table.
     * </p>
     *
     * @param sortColumns <p>
     *            A list specifying the sort order of each bucket in the table.
     *            </p>
     */
    public void setSortColumns(java.util.Collection<Order> sortColumns) {
        if (sortColumns == null) {
            this.sortColumns = null;
            return;
        }

        this.sortColumns = new java.util.ArrayList<Order>(sortColumns);
    }

    /**
     * <p>
     * A list specifying the sort order of each bucket in the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sortColumns <p>
     *            A list specifying the sort order of each bucket in the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageDescriptor withSortColumns(Order... sortColumns) {
        if (getSortColumns() == null) {
            this.sortColumns = new java.util.ArrayList<Order>(sortColumns.length);
        }
        for (Order value : sortColumns) {
            this.sortColumns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list specifying the sort order of each bucket in the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sortColumns <p>
     *            A list specifying the sort order of each bucket in the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageDescriptor withSortColumns(java.util.Collection<Order> sortColumns) {
        setSortColumns(sortColumns);
        return this;
    }

    /**
     * <p>
     * The user-supplied properties in key-value form.
     * </p>
     *
     * @return <p>
     *         The user-supplied properties in key-value form.
     *         </p>
     */
    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The user-supplied properties in key-value form.
     * </p>
     *
     * @param parameters <p>
     *            The user-supplied properties in key-value form.
     *            </p>
     */
    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The user-supplied properties in key-value form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            The user-supplied properties in key-value form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageDescriptor withParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * The user-supplied properties in key-value form.
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
    public StorageDescriptor addParametersEntry(String key, String value) {
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
    public StorageDescriptor clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The information about values that appear frequently in a column (skewed
     * values).
     * </p>
     *
     * @return <p>
     *         The information about values that appear frequently in a column
     *         (skewed values).
     *         </p>
     */
    public SkewedInfo getSkewedInfo() {
        return skewedInfo;
    }

    /**
     * <p>
     * The information about values that appear frequently in a column (skewed
     * values).
     * </p>
     *
     * @param skewedInfo <p>
     *            The information about values that appear frequently in a
     *            column (skewed values).
     *            </p>
     */
    public void setSkewedInfo(SkewedInfo skewedInfo) {
        this.skewedInfo = skewedInfo;
    }

    /**
     * <p>
     * The information about values that appear frequently in a column (skewed
     * values).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skewedInfo <p>
     *            The information about values that appear frequently in a
     *            column (skewed values).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageDescriptor withSkewedInfo(SkewedInfo skewedInfo) {
        this.skewedInfo = skewedInfo;
        return this;
    }

    /**
     * <p>
     * <code>True</code> if the table data is stored in subdirectories, or
     * <code>False</code> if not.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if the table data is stored in subdirectories,
     *         or <code>False</code> if not.
     *         </p>
     */
    public Boolean isStoredAsSubDirectories() {
        return storedAsSubDirectories;
    }

    /**
     * <p>
     * <code>True</code> if the table data is stored in subdirectories, or
     * <code>False</code> if not.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if the table data is stored in subdirectories,
     *         or <code>False</code> if not.
     *         </p>
     */
    public Boolean getStoredAsSubDirectories() {
        return storedAsSubDirectories;
    }

    /**
     * <p>
     * <code>True</code> if the table data is stored in subdirectories, or
     * <code>False</code> if not.
     * </p>
     *
     * @param storedAsSubDirectories <p>
     *            <code>True</code> if the table data is stored in
     *            subdirectories, or <code>False</code> if not.
     *            </p>
     */
    public void setStoredAsSubDirectories(Boolean storedAsSubDirectories) {
        this.storedAsSubDirectories = storedAsSubDirectories;
    }

    /**
     * <p>
     * <code>True</code> if the table data is stored in subdirectories, or
     * <code>False</code> if not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storedAsSubDirectories <p>
     *            <code>True</code> if the table data is stored in
     *            subdirectories, or <code>False</code> if not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageDescriptor withStoredAsSubDirectories(Boolean storedAsSubDirectories) {
        this.storedAsSubDirectories = storedAsSubDirectories;
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
        if (getColumns() != null)
            sb.append("Columns: " + getColumns() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getInputFormat() != null)
            sb.append("InputFormat: " + getInputFormat() + ",");
        if (getOutputFormat() != null)
            sb.append("OutputFormat: " + getOutputFormat() + ",");
        if (getCompressed() != null)
            sb.append("Compressed: " + getCompressed() + ",");
        if (getNumberOfBuckets() != null)
            sb.append("NumberOfBuckets: " + getNumberOfBuckets() + ",");
        if (getSerdeInfo() != null)
            sb.append("SerdeInfo: " + getSerdeInfo() + ",");
        if (getBucketColumns() != null)
            sb.append("BucketColumns: " + getBucketColumns() + ",");
        if (getSortColumns() != null)
            sb.append("SortColumns: " + getSortColumns() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getSkewedInfo() != null)
            sb.append("SkewedInfo: " + getSkewedInfo() + ",");
        if (getStoredAsSubDirectories() != null)
            sb.append("StoredAsSubDirectories: " + getStoredAsSubDirectories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode
                + ((getInputFormat() == null) ? 0 : getInputFormat().hashCode());
        hashCode = prime * hashCode
                + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        hashCode = prime * hashCode + ((getCompressed() == null) ? 0 : getCompressed().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfBuckets() == null) ? 0 : getNumberOfBuckets().hashCode());
        hashCode = prime * hashCode + ((getSerdeInfo() == null) ? 0 : getSerdeInfo().hashCode());
        hashCode = prime * hashCode
                + ((getBucketColumns() == null) ? 0 : getBucketColumns().hashCode());
        hashCode = prime * hashCode
                + ((getSortColumns() == null) ? 0 : getSortColumns().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getSkewedInfo() == null) ? 0 : getSkewedInfo().hashCode());
        hashCode = prime
                * hashCode
                + ((getStoredAsSubDirectories() == null) ? 0 : getStoredAsSubDirectories()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageDescriptor == false)
            return false;
        StorageDescriptor other = (StorageDescriptor) obj;

        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getInputFormat() == null ^ this.getInputFormat() == null)
            return false;
        if (other.getInputFormat() != null
                && other.getInputFormat().equals(this.getInputFormat()) == false)
            return false;
        if (other.getOutputFormat() == null ^ this.getOutputFormat() == null)
            return false;
        if (other.getOutputFormat() != null
                && other.getOutputFormat().equals(this.getOutputFormat()) == false)
            return false;
        if (other.getCompressed() == null ^ this.getCompressed() == null)
            return false;
        if (other.getCompressed() != null
                && other.getCompressed().equals(this.getCompressed()) == false)
            return false;
        if (other.getNumberOfBuckets() == null ^ this.getNumberOfBuckets() == null)
            return false;
        if (other.getNumberOfBuckets() != null
                && other.getNumberOfBuckets().equals(this.getNumberOfBuckets()) == false)
            return false;
        if (other.getSerdeInfo() == null ^ this.getSerdeInfo() == null)
            return false;
        if (other.getSerdeInfo() != null
                && other.getSerdeInfo().equals(this.getSerdeInfo()) == false)
            return false;
        if (other.getBucketColumns() == null ^ this.getBucketColumns() == null)
            return false;
        if (other.getBucketColumns() != null
                && other.getBucketColumns().equals(this.getBucketColumns()) == false)
            return false;
        if (other.getSortColumns() == null ^ this.getSortColumns() == null)
            return false;
        if (other.getSortColumns() != null
                && other.getSortColumns().equals(this.getSortColumns()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getSkewedInfo() == null ^ this.getSkewedInfo() == null)
            return false;
        if (other.getSkewedInfo() != null
                && other.getSkewedInfo().equals(this.getSkewedInfo()) == false)
            return false;
        if (other.getStoredAsSubDirectories() == null ^ this.getStoredAsSubDirectories() == null)
            return false;
        if (other.getStoredAsSubDirectories() != null
                && other.getStoredAsSubDirectories().equals(this.getStoredAsSubDirectories()) == false)
            return false;
        return true;
    }
}

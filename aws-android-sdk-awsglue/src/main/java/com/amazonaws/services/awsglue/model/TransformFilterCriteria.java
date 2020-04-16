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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * The criteria used to filter the machine learning transforms.
 * </p>
 */
public class TransformFilterCriteria implements Serializable {
    /**
     * <p>
     * A unique transform name that is used to filter the machine learning
     * transforms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * The type of machine learning transform that is used to filter the machine
     * learning transforms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIND_MATCHES
     */
    private String transformType;

    /**
     * <p>
     * Filters the list of machine learning transforms by the last known status
     * of the transforms (to indicate whether a transform can be used or not).
     * One of "NOT_READY", "READY", or "DELETING".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_READY, READY, DELETING
     */
    private String status;

    /**
     * <p>
     * This value determines which version of AWS Glue this machine learning
     * transform is compatible with. Glue 1.0 is recommended for most customers.
     * If the value is not set, the Glue compatibility defaults to Glue 0.9. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions"
     * >AWS Glue Versions</a> in the developer guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^\w+\.\w+$<br/>
     */
    private String glueVersion;

    /**
     * <p>
     * The time and date before which the transforms were created.
     * </p>
     */
    private java.util.Date createdBefore;

    /**
     * <p>
     * The time and date after which the transforms were created.
     * </p>
     */
    private java.util.Date createdAfter;

    /**
     * <p>
     * Filter on transforms last modified before this date.
     * </p>
     */
    private java.util.Date lastModifiedBefore;

    /**
     * <p>
     * Filter on transforms last modified after this date.
     * </p>
     */
    private java.util.Date lastModifiedAfter;

    /**
     * <p>
     * Filters on datasets with a specific schema. The
     * <code>Map&lt;Column, Type&gt;</code> object is an array of key-value
     * pairs representing the schema this transform accepts, where
     * <code>Column</code> is the name of a column, and <code>Type</code> is the
     * type of the data such as an integer or string. Has an upper bound of 100
     * columns.
     * </p>
     */
    private java.util.List<SchemaColumn> schema;

    /**
     * <p>
     * A unique transform name that is used to filter the machine learning
     * transforms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         A unique transform name that is used to filter the machine
     *         learning transforms.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A unique transform name that is used to filter the machine learning
     * transforms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            A unique transform name that is used to filter the machine
     *            learning transforms.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique transform name that is used to filter the machine learning
     * transforms.
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
     *            A unique transform name that is used to filter the machine
     *            learning transforms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformFilterCriteria withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of machine learning transform that is used to filter the machine
     * learning transforms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIND_MATCHES
     *
     * @return <p>
     *         The type of machine learning transform that is used to filter the
     *         machine learning transforms.
     *         </p>
     * @see TransformType
     */
    public String getTransformType() {
        return transformType;
    }

    /**
     * <p>
     * The type of machine learning transform that is used to filter the machine
     * learning transforms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIND_MATCHES
     *
     * @param transformType <p>
     *            The type of machine learning transform that is used to filter
     *            the machine learning transforms.
     *            </p>
     * @see TransformType
     */
    public void setTransformType(String transformType) {
        this.transformType = transformType;
    }

    /**
     * <p>
     * The type of machine learning transform that is used to filter the machine
     * learning transforms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIND_MATCHES
     *
     * @param transformType <p>
     *            The type of machine learning transform that is used to filter
     *            the machine learning transforms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransformType
     */
    public TransformFilterCriteria withTransformType(String transformType) {
        this.transformType = transformType;
        return this;
    }

    /**
     * <p>
     * The type of machine learning transform that is used to filter the machine
     * learning transforms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIND_MATCHES
     *
     * @param transformType <p>
     *            The type of machine learning transform that is used to filter
     *            the machine learning transforms.
     *            </p>
     * @see TransformType
     */
    public void setTransformType(TransformType transformType) {
        this.transformType = transformType.toString();
    }

    /**
     * <p>
     * The type of machine learning transform that is used to filter the machine
     * learning transforms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIND_MATCHES
     *
     * @param transformType <p>
     *            The type of machine learning transform that is used to filter
     *            the machine learning transforms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransformType
     */
    public TransformFilterCriteria withTransformType(TransformType transformType) {
        this.transformType = transformType.toString();
        return this;
    }

    /**
     * <p>
     * Filters the list of machine learning transforms by the last known status
     * of the transforms (to indicate whether a transform can be used or not).
     * One of "NOT_READY", "READY", or "DELETING".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_READY, READY, DELETING
     *
     * @return <p>
     *         Filters the list of machine learning transforms by the last known
     *         status of the transforms (to indicate whether a transform can be
     *         used or not). One of "NOT_READY", "READY", or "DELETING".
     *         </p>
     * @see TransformStatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Filters the list of machine learning transforms by the last known status
     * of the transforms (to indicate whether a transform can be used or not).
     * One of "NOT_READY", "READY", or "DELETING".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_READY, READY, DELETING
     *
     * @param status <p>
     *            Filters the list of machine learning transforms by the last
     *            known status of the transforms (to indicate whether a
     *            transform can be used or not). One of "NOT_READY", "READY", or
     *            "DELETING".
     *            </p>
     * @see TransformStatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Filters the list of machine learning transforms by the last known status
     * of the transforms (to indicate whether a transform can be used or not).
     * One of "NOT_READY", "READY", or "DELETING".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_READY, READY, DELETING
     *
     * @param status <p>
     *            Filters the list of machine learning transforms by the last
     *            known status of the transforms (to indicate whether a
     *            transform can be used or not). One of "NOT_READY", "READY", or
     *            "DELETING".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransformStatusType
     */
    public TransformFilterCriteria withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Filters the list of machine learning transforms by the last known status
     * of the transforms (to indicate whether a transform can be used or not).
     * One of "NOT_READY", "READY", or "DELETING".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_READY, READY, DELETING
     *
     * @param status <p>
     *            Filters the list of machine learning transforms by the last
     *            known status of the transforms (to indicate whether a
     *            transform can be used or not). One of "NOT_READY", "READY", or
     *            "DELETING".
     *            </p>
     * @see TransformStatusType
     */
    public void setStatus(TransformStatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Filters the list of machine learning transforms by the last known status
     * of the transforms (to indicate whether a transform can be used or not).
     * One of "NOT_READY", "READY", or "DELETING".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_READY, READY, DELETING
     *
     * @param status <p>
     *            Filters the list of machine learning transforms by the last
     *            known status of the transforms (to indicate whether a
     *            transform can be used or not). One of "NOT_READY", "READY", or
     *            "DELETING".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransformStatusType
     */
    public TransformFilterCriteria withStatus(TransformStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * This value determines which version of AWS Glue this machine learning
     * transform is compatible with. Glue 1.0 is recommended for most customers.
     * If the value is not set, the Glue compatibility defaults to Glue 0.9. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions"
     * >AWS Glue Versions</a> in the developer guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^\w+\.\w+$<br/>
     *
     * @return <p>
     *         This value determines which version of AWS Glue this machine
     *         learning transform is compatible with. Glue 1.0 is recommended
     *         for most customers. If the value is not set, the Glue
     *         compatibility defaults to Glue 0.9. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions"
     *         >AWS Glue Versions</a> in the developer guide.
     *         </p>
     */
    public String getGlueVersion() {
        return glueVersion;
    }

    /**
     * <p>
     * This value determines which version of AWS Glue this machine learning
     * transform is compatible with. Glue 1.0 is recommended for most customers.
     * If the value is not set, the Glue compatibility defaults to Glue 0.9. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions"
     * >AWS Glue Versions</a> in the developer guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^\w+\.\w+$<br/>
     *
     * @param glueVersion <p>
     *            This value determines which version of AWS Glue this machine
     *            learning transform is compatible with. Glue 1.0 is recommended
     *            for most customers. If the value is not set, the Glue
     *            compatibility defaults to Glue 0.9. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions"
     *            >AWS Glue Versions</a> in the developer guide.
     *            </p>
     */
    public void setGlueVersion(String glueVersion) {
        this.glueVersion = glueVersion;
    }

    /**
     * <p>
     * This value determines which version of AWS Glue this machine learning
     * transform is compatible with. Glue 1.0 is recommended for most customers.
     * If the value is not set, the Glue compatibility defaults to Glue 0.9. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions"
     * >AWS Glue Versions</a> in the developer guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^\w+\.\w+$<br/>
     *
     * @param glueVersion <p>
     *            This value determines which version of AWS Glue this machine
     *            learning transform is compatible with. Glue 1.0 is recommended
     *            for most customers. If the value is not set, the Glue
     *            compatibility defaults to Glue 0.9. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions"
     *            >AWS Glue Versions</a> in the developer guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformFilterCriteria withGlueVersion(String glueVersion) {
        this.glueVersion = glueVersion;
        return this;
    }

    /**
     * <p>
     * The time and date before which the transforms were created.
     * </p>
     *
     * @return <p>
     *         The time and date before which the transforms were created.
     *         </p>
     */
    public java.util.Date getCreatedBefore() {
        return createdBefore;
    }

    /**
     * <p>
     * The time and date before which the transforms were created.
     * </p>
     *
     * @param createdBefore <p>
     *            The time and date before which the transforms were created.
     *            </p>
     */
    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * The time and date before which the transforms were created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdBefore <p>
     *            The time and date before which the transforms were created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformFilterCriteria withCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
        return this;
    }

    /**
     * <p>
     * The time and date after which the transforms were created.
     * </p>
     *
     * @return <p>
     *         The time and date after which the transforms were created.
     *         </p>
     */
    public java.util.Date getCreatedAfter() {
        return createdAfter;
    }

    /**
     * <p>
     * The time and date after which the transforms were created.
     * </p>
     *
     * @param createdAfter <p>
     *            The time and date after which the transforms were created.
     *            </p>
     */
    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * The time and date after which the transforms were created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAfter <p>
     *            The time and date after which the transforms were created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformFilterCriteria withCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
        return this;
    }

    /**
     * <p>
     * Filter on transforms last modified before this date.
     * </p>
     *
     * @return <p>
     *         Filter on transforms last modified before this date.
     *         </p>
     */
    public java.util.Date getLastModifiedBefore() {
        return lastModifiedBefore;
    }

    /**
     * <p>
     * Filter on transforms last modified before this date.
     * </p>
     *
     * @param lastModifiedBefore <p>
     *            Filter on transforms last modified before this date.
     *            </p>
     */
    public void setLastModifiedBefore(java.util.Date lastModifiedBefore) {
        this.lastModifiedBefore = lastModifiedBefore;
    }

    /**
     * <p>
     * Filter on transforms last modified before this date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedBefore <p>
     *            Filter on transforms last modified before this date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformFilterCriteria withLastModifiedBefore(java.util.Date lastModifiedBefore) {
        this.lastModifiedBefore = lastModifiedBefore;
        return this;
    }

    /**
     * <p>
     * Filter on transforms last modified after this date.
     * </p>
     *
     * @return <p>
     *         Filter on transforms last modified after this date.
     *         </p>
     */
    public java.util.Date getLastModifiedAfter() {
        return lastModifiedAfter;
    }

    /**
     * <p>
     * Filter on transforms last modified after this date.
     * </p>
     *
     * @param lastModifiedAfter <p>
     *            Filter on transforms last modified after this date.
     *            </p>
     */
    public void setLastModifiedAfter(java.util.Date lastModifiedAfter) {
        this.lastModifiedAfter = lastModifiedAfter;
    }

    /**
     * <p>
     * Filter on transforms last modified after this date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedAfter <p>
     *            Filter on transforms last modified after this date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformFilterCriteria withLastModifiedAfter(java.util.Date lastModifiedAfter) {
        this.lastModifiedAfter = lastModifiedAfter;
        return this;
    }

    /**
     * <p>
     * Filters on datasets with a specific schema. The
     * <code>Map&lt;Column, Type&gt;</code> object is an array of key-value
     * pairs representing the schema this transform accepts, where
     * <code>Column</code> is the name of a column, and <code>Type</code> is the
     * type of the data such as an integer or string. Has an upper bound of 100
     * columns.
     * </p>
     *
     * @return <p>
     *         Filters on datasets with a specific schema. The
     *         <code>Map&lt;Column, Type&gt;</code> object is an array of
     *         key-value pairs representing the schema this transform accepts,
     *         where <code>Column</code> is the name of a column, and
     *         <code>Type</code> is the type of the data such as an integer or
     *         string. Has an upper bound of 100 columns.
     *         </p>
     */
    public java.util.List<SchemaColumn> getSchema() {
        return schema;
    }

    /**
     * <p>
     * Filters on datasets with a specific schema. The
     * <code>Map&lt;Column, Type&gt;</code> object is an array of key-value
     * pairs representing the schema this transform accepts, where
     * <code>Column</code> is the name of a column, and <code>Type</code> is the
     * type of the data such as an integer or string. Has an upper bound of 100
     * columns.
     * </p>
     *
     * @param schema <p>
     *            Filters on datasets with a specific schema. The
     *            <code>Map&lt;Column, Type&gt;</code> object is an array of
     *            key-value pairs representing the schema this transform
     *            accepts, where <code>Column</code> is the name of a column,
     *            and <code>Type</code> is the type of the data such as an
     *            integer or string. Has an upper bound of 100 columns.
     *            </p>
     */
    public void setSchema(java.util.Collection<SchemaColumn> schema) {
        if (schema == null) {
            this.schema = null;
            return;
        }

        this.schema = new java.util.ArrayList<SchemaColumn>(schema);
    }

    /**
     * <p>
     * Filters on datasets with a specific schema. The
     * <code>Map&lt;Column, Type&gt;</code> object is an array of key-value
     * pairs representing the schema this transform accepts, where
     * <code>Column</code> is the name of a column, and <code>Type</code> is the
     * type of the data such as an integer or string. Has an upper bound of 100
     * columns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schema <p>
     *            Filters on datasets with a specific schema. The
     *            <code>Map&lt;Column, Type&gt;</code> object is an array of
     *            key-value pairs representing the schema this transform
     *            accepts, where <code>Column</code> is the name of a column,
     *            and <code>Type</code> is the type of the data such as an
     *            integer or string. Has an upper bound of 100 columns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformFilterCriteria withSchema(SchemaColumn... schema) {
        if (getSchema() == null) {
            this.schema = new java.util.ArrayList<SchemaColumn>(schema.length);
        }
        for (SchemaColumn value : schema) {
            this.schema.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Filters on datasets with a specific schema. The
     * <code>Map&lt;Column, Type&gt;</code> object is an array of key-value
     * pairs representing the schema this transform accepts, where
     * <code>Column</code> is the name of a column, and <code>Type</code> is the
     * type of the data such as an integer or string. Has an upper bound of 100
     * columns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schema <p>
     *            Filters on datasets with a specific schema. The
     *            <code>Map&lt;Column, Type&gt;</code> object is an array of
     *            key-value pairs representing the schema this transform
     *            accepts, where <code>Column</code> is the name of a column,
     *            and <code>Type</code> is the type of the data such as an
     *            integer or string. Has an upper bound of 100 columns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformFilterCriteria withSchema(java.util.Collection<SchemaColumn> schema) {
        setSchema(schema);
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
        if (getTransformType() != null)
            sb.append("TransformType: " + getTransformType() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getGlueVersion() != null)
            sb.append("GlueVersion: " + getGlueVersion() + ",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: " + getCreatedBefore() + ",");
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: " + getCreatedAfter() + ",");
        if (getLastModifiedBefore() != null)
            sb.append("LastModifiedBefore: " + getLastModifiedBefore() + ",");
        if (getLastModifiedAfter() != null)
            sb.append("LastModifiedAfter: " + getLastModifiedAfter() + ",");
        if (getSchema() != null)
            sb.append("Schema: " + getSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getTransformType() == null) ? 0 : getTransformType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getGlueVersion() == null) ? 0 : getGlueVersion().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedBefore() == null) ? 0 : getLastModifiedBefore().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedAfter() == null) ? 0 : getLastModifiedAfter().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransformFilterCriteria == false)
            return false;
        TransformFilterCriteria other = (TransformFilterCriteria) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTransformType() == null ^ this.getTransformType() == null)
            return false;
        if (other.getTransformType() != null
                && other.getTransformType().equals(this.getTransformType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getGlueVersion() == null ^ this.getGlueVersion() == null)
            return false;
        if (other.getGlueVersion() != null
                && other.getGlueVersion().equals(this.getGlueVersion()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null
                && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
            return false;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null
                && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getLastModifiedBefore() == null ^ this.getLastModifiedBefore() == null)
            return false;
        if (other.getLastModifiedBefore() != null
                && other.getLastModifiedBefore().equals(this.getLastModifiedBefore()) == false)
            return false;
        if (other.getLastModifiedAfter() == null ^ this.getLastModifiedAfter() == null)
            return false;
        if (other.getLastModifiedAfter() != null
                && other.getLastModifiedAfter().equals(this.getLastModifiedAfter()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        return true;
    }
}

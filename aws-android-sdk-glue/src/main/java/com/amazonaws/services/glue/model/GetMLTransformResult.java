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

public class GetMLTransformResult implements Serializable {
    /**
     * <p>
     * The unique identifier of the transform, generated at the time that the
     * transform was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String transformId;

    /**
     * <p>
     * The unique name given to the transform when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the transform.
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
     * The last known status of the transform (to indicate whether it can be
     * used or not). One of "NOT_READY", "READY", or "DELETING".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_READY, READY, DELETING
     */
    private String status;

    /**
     * <p>
     * The date and time when the transform was created.
     * </p>
     */
    private java.util.Date createdOn;

    /**
     * <p>
     * The date and time when the transform was last modified.
     * </p>
     */
    private java.util.Date lastModifiedOn;

    /**
     * <p>
     * A list of AWS Glue table definitions used by the transform.
     * </p>
     */
    private java.util.List<GlueTable> inputRecordTables;

    /**
     * <p>
     * The configuration parameters that are specific to the algorithm used.
     * </p>
     */
    private TransformParameters parameters;

    /**
     * <p>
     * The latest evaluation metrics.
     * </p>
     */
    private EvaluationMetrics evaluationMetrics;

    /**
     * <p>
     * The number of labels available for this transform.
     * </p>
     */
    private Integer labelCount;

    /**
     * <p>
     * The <code>Map&lt;Column, Type&gt;</code> object that represents the
     * schema that this transform accepts. Has an upper bound of 100 columns.
     * </p>
     */
    private java.util.List<SchemaColumn> schema;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role with the required
     * permissions.
     * </p>
     */
    private String role;

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
     * The number of AWS Glue data processing units (DPUs) that are allocated to
     * task runs for this transform. You can allocate from 2 to 100 DPUs; the
     * default is 10. A DPU is a relative measure of processing power that
     * consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than
     * <code>Standard</code>, the <code>MaxCapacity</code> field is set
     * automatically and becomes read-only.
     * </p>
     */
    private Double maxCapacity;

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs.
     * Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     */
    private String workerType;

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are
     * allocated when this task runs.
     * </p>
     */
    private Integer numberOfWorkers;

    /**
     * <p>
     * The timeout for a task run for this transform in minutes. This is the
     * maximum time that a task run for this transform can consume resources
     * before it is terminated and enters <code>TIMEOUT</code> status. The
     * default is 2,880 minutes (48 hours).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer timeout;

    /**
     * <p>
     * The maximum number of times to retry a task for this transform after a
     * task run fails.
     * </p>
     */
    private Integer maxRetries;

    /**
     * <p>
     * The unique identifier of the transform, generated at the time that the
     * transform was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The unique identifier of the transform, generated at the time
     *         that the transform was created.
     *         </p>
     */
    public String getTransformId() {
        return transformId;
    }

    /**
     * <p>
     * The unique identifier of the transform, generated at the time that the
     * transform was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param transformId <p>
     *            The unique identifier of the transform, generated at the time
     *            that the transform was created.
     *            </p>
     */
    public void setTransformId(String transformId) {
        this.transformId = transformId;
    }

    /**
     * <p>
     * The unique identifier of the transform, generated at the time that the
     * transform was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param transformId <p>
     *            The unique identifier of the transform, generated at the time
     *            that the transform was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformResult withTransformId(String transformId) {
        this.transformId = transformId;
        return this;
    }

    /**
     * <p>
     * The unique name given to the transform when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The unique name given to the transform when it was created.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The unique name given to the transform when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The unique name given to the transform when it was created.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name given to the transform when it was created.
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
     *            The unique name given to the transform when it was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A description of the transform.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            A description of the transform.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the transform.
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
     *            A description of the transform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The last known status of the transform (to indicate whether it can be
     * used or not). One of "NOT_READY", "READY", or "DELETING".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_READY, READY, DELETING
     *
     * @return <p>
     *         The last known status of the transform (to indicate whether it
     *         can be used or not). One of "NOT_READY", "READY", or "DELETING".
     *         </p>
     * @see TransformStatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The last known status of the transform (to indicate whether it can be
     * used or not). One of "NOT_READY", "READY", or "DELETING".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_READY, READY, DELETING
     *
     * @param status <p>
     *            The last known status of the transform (to indicate whether it
     *            can be used or not). One of "NOT_READY", "READY", or
     *            "DELETING".
     *            </p>
     * @see TransformStatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The last known status of the transform (to indicate whether it can be
     * used or not). One of "NOT_READY", "READY", or "DELETING".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_READY, READY, DELETING
     *
     * @param status <p>
     *            The last known status of the transform (to indicate whether it
     *            can be used or not). One of "NOT_READY", "READY", or
     *            "DELETING".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransformStatusType
     */
    public GetMLTransformResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The last known status of the transform (to indicate whether it can be
     * used or not). One of "NOT_READY", "READY", or "DELETING".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_READY, READY, DELETING
     *
     * @param status <p>
     *            The last known status of the transform (to indicate whether it
     *            can be used or not). One of "NOT_READY", "READY", or
     *            "DELETING".
     *            </p>
     * @see TransformStatusType
     */
    public void setStatus(TransformStatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The last known status of the transform (to indicate whether it can be
     * used or not). One of "NOT_READY", "READY", or "DELETING".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_READY, READY, DELETING
     *
     * @param status <p>
     *            The last known status of the transform (to indicate whether it
     *            can be used or not). One of "NOT_READY", "READY", or
     *            "DELETING".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransformStatusType
     */
    public GetMLTransformResult withStatus(TransformStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the transform was created.
     * </p>
     *
     * @return <p>
     *         The date and time when the transform was created.
     *         </p>
     */
    public java.util.Date getCreatedOn() {
        return createdOn;
    }

    /**
     * <p>
     * The date and time when the transform was created.
     * </p>
     *
     * @param createdOn <p>
     *            The date and time when the transform was created.
     *            </p>
     */
    public void setCreatedOn(java.util.Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * <p>
     * The date and time when the transform was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdOn <p>
     *            The date and time when the transform was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformResult withCreatedOn(java.util.Date createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * <p>
     * The date and time when the transform was last modified.
     * </p>
     *
     * @return <p>
     *         The date and time when the transform was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedOn() {
        return lastModifiedOn;
    }

    /**
     * <p>
     * The date and time when the transform was last modified.
     * </p>
     *
     * @param lastModifiedOn <p>
     *            The date and time when the transform was last modified.
     *            </p>
     */
    public void setLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * <p>
     * The date and time when the transform was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedOn <p>
     *            The date and time when the transform was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformResult withLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
        return this;
    }

    /**
     * <p>
     * A list of AWS Glue table definitions used by the transform.
     * </p>
     *
     * @return <p>
     *         A list of AWS Glue table definitions used by the transform.
     *         </p>
     */
    public java.util.List<GlueTable> getInputRecordTables() {
        return inputRecordTables;
    }

    /**
     * <p>
     * A list of AWS Glue table definitions used by the transform.
     * </p>
     *
     * @param inputRecordTables <p>
     *            A list of AWS Glue table definitions used by the transform.
     *            </p>
     */
    public void setInputRecordTables(java.util.Collection<GlueTable> inputRecordTables) {
        if (inputRecordTables == null) {
            this.inputRecordTables = null;
            return;
        }

        this.inputRecordTables = new java.util.ArrayList<GlueTable>(inputRecordTables);
    }

    /**
     * <p>
     * A list of AWS Glue table definitions used by the transform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputRecordTables <p>
     *            A list of AWS Glue table definitions used by the transform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformResult withInputRecordTables(GlueTable... inputRecordTables) {
        if (getInputRecordTables() == null) {
            this.inputRecordTables = new java.util.ArrayList<GlueTable>(inputRecordTables.length);
        }
        for (GlueTable value : inputRecordTables) {
            this.inputRecordTables.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of AWS Glue table definitions used by the transform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputRecordTables <p>
     *            A list of AWS Glue table definitions used by the transform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformResult withInputRecordTables(
            java.util.Collection<GlueTable> inputRecordTables) {
        setInputRecordTables(inputRecordTables);
        return this;
    }

    /**
     * <p>
     * The configuration parameters that are specific to the algorithm used.
     * </p>
     *
     * @return <p>
     *         The configuration parameters that are specific to the algorithm
     *         used.
     *         </p>
     */
    public TransformParameters getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The configuration parameters that are specific to the algorithm used.
     * </p>
     *
     * @param parameters <p>
     *            The configuration parameters that are specific to the
     *            algorithm used.
     *            </p>
     */
    public void setParameters(TransformParameters parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The configuration parameters that are specific to the algorithm used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            The configuration parameters that are specific to the
     *            algorithm used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformResult withParameters(TransformParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * The latest evaluation metrics.
     * </p>
     *
     * @return <p>
     *         The latest evaluation metrics.
     *         </p>
     */
    public EvaluationMetrics getEvaluationMetrics() {
        return evaluationMetrics;
    }

    /**
     * <p>
     * The latest evaluation metrics.
     * </p>
     *
     * @param evaluationMetrics <p>
     *            The latest evaluation metrics.
     *            </p>
     */
    public void setEvaluationMetrics(EvaluationMetrics evaluationMetrics) {
        this.evaluationMetrics = evaluationMetrics;
    }

    /**
     * <p>
     * The latest evaluation metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationMetrics <p>
     *            The latest evaluation metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformResult withEvaluationMetrics(EvaluationMetrics evaluationMetrics) {
        this.evaluationMetrics = evaluationMetrics;
        return this;
    }

    /**
     * <p>
     * The number of labels available for this transform.
     * </p>
     *
     * @return <p>
     *         The number of labels available for this transform.
     *         </p>
     */
    public Integer getLabelCount() {
        return labelCount;
    }

    /**
     * <p>
     * The number of labels available for this transform.
     * </p>
     *
     * @param labelCount <p>
     *            The number of labels available for this transform.
     *            </p>
     */
    public void setLabelCount(Integer labelCount) {
        this.labelCount = labelCount;
    }

    /**
     * <p>
     * The number of labels available for this transform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelCount <p>
     *            The number of labels available for this transform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformResult withLabelCount(Integer labelCount) {
        this.labelCount = labelCount;
        return this;
    }

    /**
     * <p>
     * The <code>Map&lt;Column, Type&gt;</code> object that represents the
     * schema that this transform accepts. Has an upper bound of 100 columns.
     * </p>
     *
     * @return <p>
     *         The <code>Map&lt;Column, Type&gt;</code> object that represents
     *         the schema that this transform accepts. Has an upper bound of 100
     *         columns.
     *         </p>
     */
    public java.util.List<SchemaColumn> getSchema() {
        return schema;
    }

    /**
     * <p>
     * The <code>Map&lt;Column, Type&gt;</code> object that represents the
     * schema that this transform accepts. Has an upper bound of 100 columns.
     * </p>
     *
     * @param schema <p>
     *            The <code>Map&lt;Column, Type&gt;</code> object that
     *            represents the schema that this transform accepts. Has an
     *            upper bound of 100 columns.
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
     * The <code>Map&lt;Column, Type&gt;</code> object that represents the
     * schema that this transform accepts. Has an upper bound of 100 columns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schema <p>
     *            The <code>Map&lt;Column, Type&gt;</code> object that
     *            represents the schema that this transform accepts. Has an
     *            upper bound of 100 columns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformResult withSchema(SchemaColumn... schema) {
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
     * The <code>Map&lt;Column, Type&gt;</code> object that represents the
     * schema that this transform accepts. Has an upper bound of 100 columns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schema <p>
     *            The <code>Map&lt;Column, Type&gt;</code> object that
     *            represents the schema that this transform accepts. Has an
     *            upper bound of 100 columns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformResult withSchema(java.util.Collection<SchemaColumn> schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role with the required
     * permissions.
     * </p>
     *
     * @return <p>
     *         The name or Amazon Resource Name (ARN) of the IAM role with the
     *         required permissions.
     *         </p>
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role with the required
     * permissions.
     * </p>
     *
     * @param role <p>
     *            The name or Amazon Resource Name (ARN) of the IAM role with
     *            the required permissions.
     *            </p>
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role with the required
     * permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param role <p>
     *            The name or Amazon Resource Name (ARN) of the IAM role with
     *            the required permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformResult withRole(String role) {
        this.role = role;
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
    public GetMLTransformResult withGlueVersion(String glueVersion) {
        this.glueVersion = glueVersion;
        return this;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that are allocated to
     * task runs for this transform. You can allocate from 2 to 100 DPUs; the
     * default is 10. A DPU is a relative measure of processing power that
     * consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than
     * <code>Standard</code>, the <code>MaxCapacity</code> field is set
     * automatically and becomes read-only.
     * </p>
     *
     * @return <p>
     *         The number of AWS Glue data processing units (DPUs) that are
     *         allocated to task runs for this transform. You can allocate from
     *         2 to 100 DPUs; the default is 10. A DPU is a relative measure of
     *         processing power that consists of 4 vCPUs of compute capacity and
     *         16 GB of memory. For more information, see the <a
     *         href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing
     *         page</a>.
     *         </p>
     *         <p>
     *         When the <code>WorkerType</code> field is set to a value other
     *         than <code>Standard</code>, the <code>MaxCapacity</code> field is
     *         set automatically and becomes read-only.
     *         </p>
     */
    public Double getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that are allocated to
     * task runs for this transform. You can allocate from 2 to 100 DPUs; the
     * default is 10. A DPU is a relative measure of processing power that
     * consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than
     * <code>Standard</code>, the <code>MaxCapacity</code> field is set
     * automatically and becomes read-only.
     * </p>
     *
     * @param maxCapacity <p>
     *            The number of AWS Glue data processing units (DPUs) that are
     *            allocated to task runs for this transform. You can allocate
     *            from 2 to 100 DPUs; the default is 10. A DPU is a relative
     *            measure of processing power that consists of 4 vCPUs of
     *            compute capacity and 16 GB of memory. For more information,
     *            see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     *            Glue pricing page</a>.
     *            </p>
     *            <p>
     *            When the <code>WorkerType</code> field is set to a value other
     *            than <code>Standard</code>, the <code>MaxCapacity</code> field
     *            is set automatically and becomes read-only.
     *            </p>
     */
    public void setMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that are allocated to
     * task runs for this transform. You can allocate from 2 to 100 DPUs; the
     * default is 10. A DPU is a relative measure of processing power that
     * consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than
     * <code>Standard</code>, the <code>MaxCapacity</code> field is set
     * automatically and becomes read-only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxCapacity <p>
     *            The number of AWS Glue data processing units (DPUs) that are
     *            allocated to task runs for this transform. You can allocate
     *            from 2 to 100 DPUs; the default is 10. A DPU is a relative
     *            measure of processing power that consists of 4 vCPUs of
     *            compute capacity and 16 GB of memory. For more information,
     *            see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     *            Glue pricing page</a>.
     *            </p>
     *            <p>
     *            When the <code>WorkerType</code> field is set to a value other
     *            than <code>Standard</code>, the <code>MaxCapacity</code> field
     *            is set automatically and becomes read-only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformResult withMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs.
     * Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @return <p>
     *         The type of predefined worker that is allocated when this task
     *         runs. Accepts a value of Standard, G.1X, or G.2X.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For the <code>Standard</code> worker type, each worker provides 4
     *         vCPU, 16 GB of memory and a 50GB disk, and 2 executors per
     *         worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.1X</code> worker type, each worker provides 4
     *         vCPU, 16 GB of memory and a 64GB disk, and 1 executor per worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.2X</code> worker type, each worker provides 8
     *         vCPU, 32 GB of memory and a 128GB disk, and 1 executor per
     *         worker.
     *         </p>
     *         </li>
     *         </ul>
     * @see WorkerType
     */
    public String getWorkerType() {
        return workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs.
     * Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated when this task
     *            runs. Accepts a value of Standard, G.1X, or G.2X.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>Standard</code> worker type, each worker
     *            provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     *            executors per worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.1X</code> worker type, each worker provides 4
     *            vCPU, 16 GB of memory and a 64GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker provides 8
     *            vCPU, 32 GB of memory and a 128GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            </ul>
     * @see WorkerType
     */
    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs.
     * Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated when this task
     *            runs. Accepts a value of Standard, G.1X, or G.2X.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>Standard</code> worker type, each worker
     *            provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     *            executors per worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.1X</code> worker type, each worker provides 4
     *            vCPU, 16 GB of memory and a 64GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker provides 8
     *            vCPU, 32 GB of memory and a 128GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkerType
     */
    public GetMLTransformResult withWorkerType(String workerType) {
        this.workerType = workerType;
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs.
     * Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated when this task
     *            runs. Accepts a value of Standard, G.1X, or G.2X.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>Standard</code> worker type, each worker
     *            provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     *            executors per worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.1X</code> worker type, each worker provides 4
     *            vCPU, 16 GB of memory and a 64GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker provides 8
     *            vCPU, 32 GB of memory and a 128GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            </ul>
     * @see WorkerType
     */
    public void setWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs.
     * Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated when this task
     *            runs. Accepts a value of Standard, G.1X, or G.2X.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>Standard</code> worker type, each worker
     *            provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     *            executors per worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.1X</code> worker type, each worker provides 4
     *            vCPU, 16 GB of memory and a 64GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker provides 8
     *            vCPU, 32 GB of memory and a 128GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkerType
     */
    public GetMLTransformResult withWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
        return this;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are
     * allocated when this task runs.
     * </p>
     *
     * @return <p>
     *         The number of workers of a defined <code>workerType</code> that
     *         are allocated when this task runs.
     *         </p>
     */
    public Integer getNumberOfWorkers() {
        return numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are
     * allocated when this task runs.
     * </p>
     *
     * @param numberOfWorkers <p>
     *            The number of workers of a defined <code>workerType</code>
     *            that are allocated when this task runs.
     *            </p>
     */
    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are
     * allocated when this task runs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfWorkers <p>
     *            The number of workers of a defined <code>workerType</code>
     *            that are allocated when this task runs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformResult withNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
        return this;
    }

    /**
     * <p>
     * The timeout for a task run for this transform in minutes. This is the
     * maximum time that a task run for this transform can consume resources
     * before it is terminated and enters <code>TIMEOUT</code> status. The
     * default is 2,880 minutes (48 hours).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The timeout for a task run for this transform in minutes. This is
     *         the maximum time that a task run for this transform can consume
     *         resources before it is terminated and enters <code>TIMEOUT</code>
     *         status. The default is 2,880 minutes (48 hours).
     *         </p>
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * <p>
     * The timeout for a task run for this transform in minutes. This is the
     * maximum time that a task run for this transform can consume resources
     * before it is terminated and enters <code>TIMEOUT</code> status. The
     * default is 2,880 minutes (48 hours).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeout <p>
     *            The timeout for a task run for this transform in minutes. This
     *            is the maximum time that a task run for this transform can
     *            consume resources before it is terminated and enters
     *            <code>TIMEOUT</code> status. The default is 2,880 minutes (48
     *            hours).
     *            </p>
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The timeout for a task run for this transform in minutes. This is the
     * maximum time that a task run for this transform can consume resources
     * before it is terminated and enters <code>TIMEOUT</code> status. The
     * default is 2,880 minutes (48 hours).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeout <p>
     *            The timeout for a task run for this transform in minutes. This
     *            is the maximum time that a task run for this transform can
     *            consume resources before it is terminated and enters
     *            <code>TIMEOUT</code> status. The default is 2,880 minutes (48
     *            hours).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformResult withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * <p>
     * The maximum number of times to retry a task for this transform after a
     * task run fails.
     * </p>
     *
     * @return <p>
     *         The maximum number of times to retry a task for this transform
     *         after a task run fails.
     *         </p>
     */
    public Integer getMaxRetries() {
        return maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry a task for this transform after a
     * task run fails.
     * </p>
     *
     * @param maxRetries <p>
     *            The maximum number of times to retry a task for this transform
     *            after a task run fails.
     *            </p>
     */
    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry a task for this transform after a
     * task run fails.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRetries <p>
     *            The maximum number of times to retry a task for this transform
     *            after a task run fails.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformResult withMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
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
        if (getTransformId() != null)
            sb.append("TransformId: " + getTransformId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCreatedOn() != null)
            sb.append("CreatedOn: " + getCreatedOn() + ",");
        if (getLastModifiedOn() != null)
            sb.append("LastModifiedOn: " + getLastModifiedOn() + ",");
        if (getInputRecordTables() != null)
            sb.append("InputRecordTables: " + getInputRecordTables() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getEvaluationMetrics() != null)
            sb.append("EvaluationMetrics: " + getEvaluationMetrics() + ",");
        if (getLabelCount() != null)
            sb.append("LabelCount: " + getLabelCount() + ",");
        if (getSchema() != null)
            sb.append("Schema: " + getSchema() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getGlueVersion() != null)
            sb.append("GlueVersion: " + getGlueVersion() + ",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: " + getMaxCapacity() + ",");
        if (getWorkerType() != null)
            sb.append("WorkerType: " + getWorkerType() + ",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: " + getNumberOfWorkers() + ",");
        if (getTimeout() != null)
            sb.append("Timeout: " + getTimeout() + ",");
        if (getMaxRetries() != null)
            sb.append("MaxRetries: " + getMaxRetries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransformId() == null) ? 0 : getTransformId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedOn() == null) ? 0 : getCreatedOn().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedOn() == null) ? 0 : getLastModifiedOn().hashCode());
        hashCode = prime * hashCode
                + ((getInputRecordTables() == null) ? 0 : getInputRecordTables().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationMetrics() == null) ? 0 : getEvaluationMetrics().hashCode());
        hashCode = prime * hashCode + ((getLabelCount() == null) ? 0 : getLabelCount().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode
                + ((getGlueVersion() == null) ? 0 : getGlueVersion().hashCode());
        hashCode = prime * hashCode
                + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getMaxRetries() == null) ? 0 : getMaxRetries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMLTransformResult == false)
            return false;
        GetMLTransformResult other = (GetMLTransformResult) obj;

        if (other.getTransformId() == null ^ this.getTransformId() == null)
            return false;
        if (other.getTransformId() != null
                && other.getTransformId().equals(this.getTransformId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedOn() == null ^ this.getCreatedOn() == null)
            return false;
        if (other.getCreatedOn() != null
                && other.getCreatedOn().equals(this.getCreatedOn()) == false)
            return false;
        if (other.getLastModifiedOn() == null ^ this.getLastModifiedOn() == null)
            return false;
        if (other.getLastModifiedOn() != null
                && other.getLastModifiedOn().equals(this.getLastModifiedOn()) == false)
            return false;
        if (other.getInputRecordTables() == null ^ this.getInputRecordTables() == null)
            return false;
        if (other.getInputRecordTables() != null
                && other.getInputRecordTables().equals(this.getInputRecordTables()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getEvaluationMetrics() == null ^ this.getEvaluationMetrics() == null)
            return false;
        if (other.getEvaluationMetrics() != null
                && other.getEvaluationMetrics().equals(this.getEvaluationMetrics()) == false)
            return false;
        if (other.getLabelCount() == null ^ this.getLabelCount() == null)
            return false;
        if (other.getLabelCount() != null
                && other.getLabelCount().equals(this.getLabelCount()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getGlueVersion() == null ^ this.getGlueVersion() == null)
            return false;
        if (other.getGlueVersion() != null
                && other.getGlueVersion().equals(this.getGlueVersion()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null
                && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getWorkerType() == null ^ this.getWorkerType() == null)
            return false;
        if (other.getWorkerType() != null
                && other.getWorkerType().equals(this.getWorkerType()) == false)
            return false;
        if (other.getNumberOfWorkers() == null ^ this.getNumberOfWorkers() == null)
            return false;
        if (other.getNumberOfWorkers() != null
                && other.getNumberOfWorkers().equals(this.getNumberOfWorkers()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getMaxRetries() == null ^ this.getMaxRetries() == null)
            return false;
        if (other.getMaxRetries() != null
                && other.getMaxRetries().equals(this.getMaxRetries()) == false)
            return false;
        return true;
    }
}

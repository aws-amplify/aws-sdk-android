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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Details about a function's configuration.
 * </p>
 */
public class AwsLambdaFunctionDetails implements Serializable {
    /**
     * <p>
     * An <code>AwsLambdaFunctionCode</code> object.
     * </p>
     */
    private AwsLambdaFunctionCode code;

    /**
     * <p>
     * The SHA256 hash of the function's deployment package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String codeSha256;

    /**
     * <p>
     * The function's dead letter queue.
     * </p>
     */
    private AwsLambdaFunctionDeadLetterConfig deadLetterConfig;

    /**
     * <p>
     * The function's environment variables.
     * </p>
     */
    private AwsLambdaFunctionEnvironment environment;

    /**
     * <p>
     * The name of the function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String functionName;

    /**
     * <p>
     * The function that Lambda calls to begin executing your function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String handler;

    /**
     * <p>
     * The KMS key that's used to encrypt the function's environment variables.
     * This key is only returned if you've configured a customer managed CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The date and time that the function was last updated, in ISO-8601 format
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String lastModified;

    /**
     * <p>
     * The function's layers.
     * </p>
     */
    private java.util.List<AwsLambdaFunctionLayer> layers;

    /**
     * <p>
     * For Lambda@Edge functions, the ARN of the master function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String masterArn;

    /**
     * <p>
     * The memory that's allocated to the function.
     * </p>
     */
    private Integer memorySize;

    /**
     * <p>
     * The latest updated revision of the function or alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String revisionId;

    /**
     * <p>
     * The function's execution role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String role;

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String runtime;

    /**
     * <p>
     * The amount of time that Lambda allows a function to run before stopping
     * it.
     * </p>
     */
    private Integer timeout;

    /**
     * <p>
     * The function's AWS X-Ray tracing configuration.
     * </p>
     */
    private AwsLambdaFunctionTracingConfig tracingConfig;

    /**
     * <p>
     * The function's networking configuration.
     * </p>
     */
    private AwsLambdaFunctionVpcConfig vpcConfig;

    /**
     * <p>
     * The version of the Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String version;

    /**
     * <p>
     * An <code>AwsLambdaFunctionCode</code> object.
     * </p>
     *
     * @return <p>
     *         An <code>AwsLambdaFunctionCode</code> object.
     *         </p>
     */
    public AwsLambdaFunctionCode getCode() {
        return code;
    }

    /**
     * <p>
     * An <code>AwsLambdaFunctionCode</code> object.
     * </p>
     *
     * @param code <p>
     *            An <code>AwsLambdaFunctionCode</code> object.
     *            </p>
     */
    public void setCode(AwsLambdaFunctionCode code) {
        this.code = code;
    }

    /**
     * <p>
     * An <code>AwsLambdaFunctionCode</code> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param code <p>
     *            An <code>AwsLambdaFunctionCode</code> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withCode(AwsLambdaFunctionCode code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * The SHA256 hash of the function's deployment package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The SHA256 hash of the function's deployment package.
     *         </p>
     */
    public String getCodeSha256() {
        return codeSha256;
    }

    /**
     * <p>
     * The SHA256 hash of the function's deployment package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param codeSha256 <p>
     *            The SHA256 hash of the function's deployment package.
     *            </p>
     */
    public void setCodeSha256(String codeSha256) {
        this.codeSha256 = codeSha256;
    }

    /**
     * <p>
     * The SHA256 hash of the function's deployment package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param codeSha256 <p>
     *            The SHA256 hash of the function's deployment package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withCodeSha256(String codeSha256) {
        this.codeSha256 = codeSha256;
        return this;
    }

    /**
     * <p>
     * The function's dead letter queue.
     * </p>
     *
     * @return <p>
     *         The function's dead letter queue.
     *         </p>
     */
    public AwsLambdaFunctionDeadLetterConfig getDeadLetterConfig() {
        return deadLetterConfig;
    }

    /**
     * <p>
     * The function's dead letter queue.
     * </p>
     *
     * @param deadLetterConfig <p>
     *            The function's dead letter queue.
     *            </p>
     */
    public void setDeadLetterConfig(AwsLambdaFunctionDeadLetterConfig deadLetterConfig) {
        this.deadLetterConfig = deadLetterConfig;
    }

    /**
     * <p>
     * The function's dead letter queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deadLetterConfig <p>
     *            The function's dead letter queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withDeadLetterConfig(
            AwsLambdaFunctionDeadLetterConfig deadLetterConfig) {
        this.deadLetterConfig = deadLetterConfig;
        return this;
    }

    /**
     * <p>
     * The function's environment variables.
     * </p>
     *
     * @return <p>
     *         The function's environment variables.
     *         </p>
     */
    public AwsLambdaFunctionEnvironment getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The function's environment variables.
     * </p>
     *
     * @param environment <p>
     *            The function's environment variables.
     *            </p>
     */
    public void setEnvironment(AwsLambdaFunctionEnvironment environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * The function's environment variables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environment <p>
     *            The function's environment variables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withEnvironment(AwsLambdaFunctionEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /**
     * <p>
     * The name of the function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of the function.
     *         </p>
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * <p>
     * The name of the function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param functionName <p>
     *            The name of the function.
     *            </p>
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param functionName <p>
     *            The name of the function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * <p>
     * The function that Lambda calls to begin executing your function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The function that Lambda calls to begin executing your function.
     *         </p>
     */
    public String getHandler() {
        return handler;
    }

    /**
     * <p>
     * The function that Lambda calls to begin executing your function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param handler <p>
     *            The function that Lambda calls to begin executing your
     *            function.
     *            </p>
     */
    public void setHandler(String handler) {
        this.handler = handler;
    }

    /**
     * <p>
     * The function that Lambda calls to begin executing your function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param handler <p>
     *            The function that Lambda calls to begin executing your
     *            function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withHandler(String handler) {
        this.handler = handler;
        return this;
    }

    /**
     * <p>
     * The KMS key that's used to encrypt the function's environment variables.
     * This key is only returned if you've configured a customer managed CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The KMS key that's used to encrypt the function's environment
     *         variables. This key is only returned if you've configured a
     *         customer managed CMK.
     *         </p>
     */
    public String getKmsKeyArn() {
        return kmsKeyArn;
    }

    /**
     * <p>
     * The KMS key that's used to encrypt the function's environment variables.
     * This key is only returned if you've configured a customer managed CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param kmsKeyArn <p>
     *            The KMS key that's used to encrypt the function's environment
     *            variables. This key is only returned if you've configured a
     *            customer managed CMK.
     *            </p>
     */
    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The KMS key that's used to encrypt the function's environment variables.
     * This key is only returned if you've configured a customer managed CMK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param kmsKeyArn <p>
     *            The KMS key that's used to encrypt the function's environment
     *            variables. This key is only returned if you've configured a
     *            customer managed CMK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
        return this;
    }

    /**
     * <p>
     * The date and time that the function was last updated, in ISO-8601 format
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The date and time that the function was last updated, in ISO-8601
     *         format (YYYY-MM-DDThh:mm:ss.sTZD).
     *         </p>
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * <p>
     * The date and time that the function was last updated, in ISO-8601 format
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param lastModified <p>
     *            The date and time that the function was last updated, in
     *            ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
     *            </p>
     */
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time that the function was last updated, in ISO-8601 format
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param lastModified <p>
     *            The date and time that the function was last updated, in
     *            ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * <p>
     * The function's layers.
     * </p>
     *
     * @return <p>
     *         The function's layers.
     *         </p>
     */
    public java.util.List<AwsLambdaFunctionLayer> getLayers() {
        return layers;
    }

    /**
     * <p>
     * The function's layers.
     * </p>
     *
     * @param layers <p>
     *            The function's layers.
     *            </p>
     */
    public void setLayers(java.util.Collection<AwsLambdaFunctionLayer> layers) {
        if (layers == null) {
            this.layers = null;
            return;
        }

        this.layers = new java.util.ArrayList<AwsLambdaFunctionLayer>(layers);
    }

    /**
     * <p>
     * The function's layers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param layers <p>
     *            The function's layers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withLayers(AwsLambdaFunctionLayer... layers) {
        if (getLayers() == null) {
            this.layers = new java.util.ArrayList<AwsLambdaFunctionLayer>(layers.length);
        }
        for (AwsLambdaFunctionLayer value : layers) {
            this.layers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The function's layers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param layers <p>
     *            The function's layers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withLayers(java.util.Collection<AwsLambdaFunctionLayer> layers) {
        setLayers(layers);
        return this;
    }

    /**
     * <p>
     * For Lambda@Edge functions, the ARN of the master function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         For Lambda@Edge functions, the ARN of the master function.
     *         </p>
     */
    public String getMasterArn() {
        return masterArn;
    }

    /**
     * <p>
     * For Lambda@Edge functions, the ARN of the master function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param masterArn <p>
     *            For Lambda@Edge functions, the ARN of the master function.
     *            </p>
     */
    public void setMasterArn(String masterArn) {
        this.masterArn = masterArn;
    }

    /**
     * <p>
     * For Lambda@Edge functions, the ARN of the master function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param masterArn <p>
     *            For Lambda@Edge functions, the ARN of the master function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withMasterArn(String masterArn) {
        this.masterArn = masterArn;
        return this;
    }

    /**
     * <p>
     * The memory that's allocated to the function.
     * </p>
     *
     * @return <p>
     *         The memory that's allocated to the function.
     *         </p>
     */
    public Integer getMemorySize() {
        return memorySize;
    }

    /**
     * <p>
     * The memory that's allocated to the function.
     * </p>
     *
     * @param memorySize <p>
     *            The memory that's allocated to the function.
     *            </p>
     */
    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    /**
     * <p>
     * The memory that's allocated to the function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memorySize <p>
     *            The memory that's allocated to the function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }

    /**
     * <p>
     * The latest updated revision of the function or alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The latest updated revision of the function or alias.
     *         </p>
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * <p>
     * The latest updated revision of the function or alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param revisionId <p>
     *            The latest updated revision of the function or alias.
     *            </p>
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The latest updated revision of the function or alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param revisionId <p>
     *            The latest updated revision of the function or alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }

    /**
     * <p>
     * The function's execution role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The function's execution role.
     *         </p>
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * The function's execution role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param role <p>
     *            The function's execution role.
     *            </p>
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The function's execution role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param role <p>
     *            The function's execution role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The runtime environment for the Lambda function.
     *         </p>
     */
    public String getRuntime() {
        return runtime;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param runtime <p>
     *            The runtime environment for the Lambda function.
     *            </p>
     */
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param runtime <p>
     *            The runtime environment for the Lambda function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * <p>
     * The amount of time that Lambda allows a function to run before stopping
     * it.
     * </p>
     *
     * @return <p>
     *         The amount of time that Lambda allows a function to run before
     *         stopping it.
     *         </p>
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * <p>
     * The amount of time that Lambda allows a function to run before stopping
     * it.
     * </p>
     *
     * @param timeout <p>
     *            The amount of time that Lambda allows a function to run before
     *            stopping it.
     *            </p>
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The amount of time that Lambda allows a function to run before stopping
     * it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeout <p>
     *            The amount of time that Lambda allows a function to run before
     *            stopping it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * <p>
     * The function's AWS X-Ray tracing configuration.
     * </p>
     *
     * @return <p>
     *         The function's AWS X-Ray tracing configuration.
     *         </p>
     */
    public AwsLambdaFunctionTracingConfig getTracingConfig() {
        return tracingConfig;
    }

    /**
     * <p>
     * The function's AWS X-Ray tracing configuration.
     * </p>
     *
     * @param tracingConfig <p>
     *            The function's AWS X-Ray tracing configuration.
     *            </p>
     */
    public void setTracingConfig(AwsLambdaFunctionTracingConfig tracingConfig) {
        this.tracingConfig = tracingConfig;
    }

    /**
     * <p>
     * The function's AWS X-Ray tracing configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tracingConfig <p>
     *            The function's AWS X-Ray tracing configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withTracingConfig(AwsLambdaFunctionTracingConfig tracingConfig) {
        this.tracingConfig = tracingConfig;
        return this;
    }

    /**
     * <p>
     * The function's networking configuration.
     * </p>
     *
     * @return <p>
     *         The function's networking configuration.
     *         </p>
     */
    public AwsLambdaFunctionVpcConfig getVpcConfig() {
        return vpcConfig;
    }

    /**
     * <p>
     * The function's networking configuration.
     * </p>
     *
     * @param vpcConfig <p>
     *            The function's networking configuration.
     *            </p>
     */
    public void setVpcConfig(AwsLambdaFunctionVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * The function's networking configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfig <p>
     *            The function's networking configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withVpcConfig(AwsLambdaFunctionVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * <p>
     * The version of the Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The version of the Lambda function.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param version <p>
     *            The version of the Lambda function.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the Lambda function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param version <p>
     *            The version of the Lambda function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionDetails withVersion(String version) {
        this.version = version;
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
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getCodeSha256() != null)
            sb.append("CodeSha256: " + getCodeSha256() + ",");
        if (getDeadLetterConfig() != null)
            sb.append("DeadLetterConfig: " + getDeadLetterConfig() + ",");
        if (getEnvironment() != null)
            sb.append("Environment: " + getEnvironment() + ",");
        if (getFunctionName() != null)
            sb.append("FunctionName: " + getFunctionName() + ",");
        if (getHandler() != null)
            sb.append("Handler: " + getHandler() + ",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: " + getKmsKeyArn() + ",");
        if (getLastModified() != null)
            sb.append("LastModified: " + getLastModified() + ",");
        if (getLayers() != null)
            sb.append("Layers: " + getLayers() + ",");
        if (getMasterArn() != null)
            sb.append("MasterArn: " + getMasterArn() + ",");
        if (getMemorySize() != null)
            sb.append("MemorySize: " + getMemorySize() + ",");
        if (getRevisionId() != null)
            sb.append("RevisionId: " + getRevisionId() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getRuntime() != null)
            sb.append("Runtime: " + getRuntime() + ",");
        if (getTimeout() != null)
            sb.append("Timeout: " + getTimeout() + ",");
        if (getTracingConfig() != null)
            sb.append("TracingConfig: " + getTracingConfig() + ",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: " + getVpcConfig() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getCodeSha256() == null) ? 0 : getCodeSha256().hashCode());
        hashCode = prime * hashCode
                + ((getDeadLetterConfig() == null) ? 0 : getDeadLetterConfig().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode
                + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getHandler() == null) ? 0 : getHandler().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode
                + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getLayers() == null) ? 0 : getLayers().hashCode());
        hashCode = prime * hashCode + ((getMasterArn() == null) ? 0 : getMasterArn().hashCode());
        hashCode = prime * hashCode + ((getMemorySize() == null) ? 0 : getMemorySize().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode
                + ((getTracingConfig() == null) ? 0 : getTracingConfig().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsLambdaFunctionDetails == false)
            return false;
        AwsLambdaFunctionDetails other = (AwsLambdaFunctionDetails) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getCodeSha256() == null ^ this.getCodeSha256() == null)
            return false;
        if (other.getCodeSha256() != null
                && other.getCodeSha256().equals(this.getCodeSha256()) == false)
            return false;
        if (other.getDeadLetterConfig() == null ^ this.getDeadLetterConfig() == null)
            return false;
        if (other.getDeadLetterConfig() != null
                && other.getDeadLetterConfig().equals(this.getDeadLetterConfig()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null
                && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null
                && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getHandler() == null ^ this.getHandler() == null)
            return false;
        if (other.getHandler() != null && other.getHandler().equals(this.getHandler()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null
                && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null
                && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getLayers() == null ^ this.getLayers() == null)
            return false;
        if (other.getLayers() != null && other.getLayers().equals(this.getLayers()) == false)
            return false;
        if (other.getMasterArn() == null ^ this.getMasterArn() == null)
            return false;
        if (other.getMasterArn() != null
                && other.getMasterArn().equals(this.getMasterArn()) == false)
            return false;
        if (other.getMemorySize() == null ^ this.getMemorySize() == null)
            return false;
        if (other.getMemorySize() != null
                && other.getMemorySize().equals(this.getMemorySize()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null
                && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getRuntime() == null ^ this.getRuntime() == null)
            return false;
        if (other.getRuntime() != null && other.getRuntime().equals(this.getRuntime()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getTracingConfig() == null ^ this.getTracingConfig() == null)
            return false;
        if (other.getTracingConfig() != null
                && other.getTracingConfig().equals(this.getTracingConfig()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null
                && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}

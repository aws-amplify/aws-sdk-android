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

public class CreateDevEndpointResult implements Serializable {
    /**
     * <p>
     * The name assigned to the new <code>DevEndpoint</code>.
     * </p>
     */
    private String endpointName;

    /**
     * <p>
     * The current status of the new <code>DevEndpoint</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The security groups assigned to the new <code>DevEndpoint</code>.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * The subnet ID assigned to the new <code>DevEndpoint</code>.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role assigned to the new
     * <code>DevEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/.*<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The address of the YARN endpoint used by this <code>DevEndpoint</code>.
     * </p>
     */
    private String yarnEndpointAddress;

    /**
     * <p>
     * The Apache Zeppelin port for the remote Apache Spark interpreter.
     * </p>
     */
    private Integer zeppelinRemoteSparkInterpreterPort;

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this
     * DevEndpoint.
     * </p>
     */
    private Integer numberOfNodes;

    /**
     * <p>
     * The type of predefined worker that is allocated to the development
     * endpoint. May be a value of Standard, G.1X, or G.2X.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     */
    private String workerType;

    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS
     * Glue supports. The Python version indicates the version supported for
     * running your ETL scripts on development endpoints.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^\w+\.\w+$<br/>
     */
    private String glueVersion;

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are
     * allocated to the development endpoint.
     * </p>
     */
    private Integer numberOfWorkers;

    /**
     * <p>
     * The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) used by this
     * <code>DevEndpoint</code>.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The paths to one or more Python libraries in an S3 bucket that will be
     * loaded in your <code>DevEndpoint</code>.
     * </p>
     */
    private String extraPythonLibsS3Path;

    /**
     * <p>
     * Path to one or more Java <code>.jar</code> files in an S3 bucket that
     * will be loaded in your <code>DevEndpoint</code>.
     * </p>
     */
    private String extraJarsS3Path;

    /**
     * <p>
     * The reason for a current failure in this <code>DevEndpoint</code>.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure being used
     * with this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String securityConfiguration;

    /**
     * <p>
     * The point in time at which this <code>DevEndpoint</code> was created.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The map of arguments used to configure this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by
     * using the <code>Arguments</code> parameter in the
     * <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If
     * no arguments are provided, the version defaults to Python 2.
     * </p>
     */
    private java.util.Map<String, String> arguments;

    /**
     * <p>
     * The name assigned to the new <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         The name assigned to the new <code>DevEndpoint</code>.
     *         </p>
     */
    public String getEndpointName() {
        return endpointName;
    }

    /**
     * <p>
     * The name assigned to the new <code>DevEndpoint</code>.
     * </p>
     *
     * @param endpointName <p>
     *            The name assigned to the new <code>DevEndpoint</code>.
     *            </p>
     */
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name assigned to the new <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointName <p>
     *            The name assigned to the new <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * <p>
     * The current status of the new <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         The current status of the new <code>DevEndpoint</code>.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the new <code>DevEndpoint</code>.
     * </p>
     *
     * @param status <p>
     *            The current status of the new <code>DevEndpoint</code>.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the new <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current status of the new <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The security groups assigned to the new <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         The security groups assigned to the new <code>DevEndpoint</code>.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The security groups assigned to the new <code>DevEndpoint</code>.
     * </p>
     *
     * @param securityGroupIds <p>
     *            The security groups assigned to the new
     *            <code>DevEndpoint</code>.
     *            </p>
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The security groups assigned to the new <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The security groups assigned to the new
     *            <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) {
            this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds.length);
        }
        for (String value : securityGroupIds) {
            this.securityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The security groups assigned to the new <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The security groups assigned to the new
     *            <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withSecurityGroupIds(
            java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The subnet ID assigned to the new <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         The subnet ID assigned to the new <code>DevEndpoint</code>.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The subnet ID assigned to the new <code>DevEndpoint</code>.
     * </p>
     *
     * @param subnetId <p>
     *            The subnet ID assigned to the new <code>DevEndpoint</code>.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet ID assigned to the new <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetId <p>
     *            The subnet ID assigned to the new <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role assigned to the new
     * <code>DevEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the role assigned to the new
     *         <code>DevEndpoint</code>.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role assigned to the new
     * <code>DevEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/.*<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the role assigned to the new
     *            <code>DevEndpoint</code>.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role assigned to the new
     * <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/.*<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the role assigned to the new
     *            <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The address of the YARN endpoint used by this <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         The address of the YARN endpoint used by this
     *         <code>DevEndpoint</code>.
     *         </p>
     */
    public String getYarnEndpointAddress() {
        return yarnEndpointAddress;
    }

    /**
     * <p>
     * The address of the YARN endpoint used by this <code>DevEndpoint</code>.
     * </p>
     *
     * @param yarnEndpointAddress <p>
     *            The address of the YARN endpoint used by this
     *            <code>DevEndpoint</code>.
     *            </p>
     */
    public void setYarnEndpointAddress(String yarnEndpointAddress) {
        this.yarnEndpointAddress = yarnEndpointAddress;
    }

    /**
     * <p>
     * The address of the YARN endpoint used by this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param yarnEndpointAddress <p>
     *            The address of the YARN endpoint used by this
     *            <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withYarnEndpointAddress(String yarnEndpointAddress) {
        this.yarnEndpointAddress = yarnEndpointAddress;
        return this;
    }

    /**
     * <p>
     * The Apache Zeppelin port for the remote Apache Spark interpreter.
     * </p>
     *
     * @return <p>
     *         The Apache Zeppelin port for the remote Apache Spark interpreter.
     *         </p>
     */
    public Integer getZeppelinRemoteSparkInterpreterPort() {
        return zeppelinRemoteSparkInterpreterPort;
    }

    /**
     * <p>
     * The Apache Zeppelin port for the remote Apache Spark interpreter.
     * </p>
     *
     * @param zeppelinRemoteSparkInterpreterPort <p>
     *            The Apache Zeppelin port for the remote Apache Spark
     *            interpreter.
     *            </p>
     */
    public void setZeppelinRemoteSparkInterpreterPort(Integer zeppelinRemoteSparkInterpreterPort) {
        this.zeppelinRemoteSparkInterpreterPort = zeppelinRemoteSparkInterpreterPort;
    }

    /**
     * <p>
     * The Apache Zeppelin port for the remote Apache Spark interpreter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param zeppelinRemoteSparkInterpreterPort <p>
     *            The Apache Zeppelin port for the remote Apache Spark
     *            interpreter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withZeppelinRemoteSparkInterpreterPort(
            Integer zeppelinRemoteSparkInterpreterPort) {
        this.zeppelinRemoteSparkInterpreterPort = zeppelinRemoteSparkInterpreterPort;
        return this;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this
     * DevEndpoint.
     * </p>
     *
     * @return <p>
     *         The number of AWS Glue Data Processing Units (DPUs) allocated to
     *         this DevEndpoint.
     *         </p>
     */
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this
     * DevEndpoint.
     * </p>
     *
     * @param numberOfNodes <p>
     *            The number of AWS Glue Data Processing Units (DPUs) allocated
     *            to this DevEndpoint.
     *            </p>
     */
    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this
     * DevEndpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfNodes <p>
     *            The number of AWS Glue Data Processing Units (DPUs) allocated
     *            to this DevEndpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development
     * endpoint. May be a value of Standard, G.1X, or G.2X.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @return <p>
     *         The type of predefined worker that is allocated to the
     *         development endpoint. May be a value of Standard, G.1X, or G.2X.
     *         </p>
     * @see WorkerType
     */
    public String getWorkerType() {
        return workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development
     * endpoint. May be a value of Standard, G.1X, or G.2X.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated to the
     *            development endpoint. May be a value of Standard, G.1X, or
     *            G.2X.
     *            </p>
     * @see WorkerType
     */
    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development
     * endpoint. May be a value of Standard, G.1X, or G.2X.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated to the
     *            development endpoint. May be a value of Standard, G.1X, or
     *            G.2X.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkerType
     */
    public CreateDevEndpointResult withWorkerType(String workerType) {
        this.workerType = workerType;
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development
     * endpoint. May be a value of Standard, G.1X, or G.2X.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated to the
     *            development endpoint. May be a value of Standard, G.1X, or
     *            G.2X.
     *            </p>
     * @see WorkerType
     */
    public void setWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development
     * endpoint. May be a value of Standard, G.1X, or G.2X.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated to the
     *            development endpoint. May be a value of Standard, G.1X, or
     *            G.2X.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkerType
     */
    public CreateDevEndpointResult withWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
        return this;
    }

    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS
     * Glue supports. The Python version indicates the version supported for
     * running your ETL scripts on development endpoints.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^\w+\.\w+$<br/>
     *
     * @return <p>
     *         Glue version determines the versions of Apache Spark and Python
     *         that AWS Glue supports. The Python version indicates the version
     *         supported for running your ETL scripts on development endpoints.
     *         </p>
     */
    public String getGlueVersion() {
        return glueVersion;
    }

    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS
     * Glue supports. The Python version indicates the version supported for
     * running your ETL scripts on development endpoints.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^\w+\.\w+$<br/>
     *
     * @param glueVersion <p>
     *            Glue version determines the versions of Apache Spark and
     *            Python that AWS Glue supports. The Python version indicates
     *            the version supported for running your ETL scripts on
     *            development endpoints.
     *            </p>
     */
    public void setGlueVersion(String glueVersion) {
        this.glueVersion = glueVersion;
    }

    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS
     * Glue supports. The Python version indicates the version supported for
     * running your ETL scripts on development endpoints.
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
     *            Glue version determines the versions of Apache Spark and
     *            Python that AWS Glue supports. The Python version indicates
     *            the version supported for running your ETL scripts on
     *            development endpoints.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withGlueVersion(String glueVersion) {
        this.glueVersion = glueVersion;
        return this;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are
     * allocated to the development endpoint.
     * </p>
     *
     * @return <p>
     *         The number of workers of a defined <code>workerType</code> that
     *         are allocated to the development endpoint.
     *         </p>
     */
    public Integer getNumberOfWorkers() {
        return numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are
     * allocated to the development endpoint.
     * </p>
     *
     * @param numberOfWorkers <p>
     *            The number of workers of a defined <code>workerType</code>
     *            that are allocated to the development endpoint.
     *            </p>
     */
    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are
     * allocated to the development endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfWorkers <p>
     *            The number of workers of a defined <code>workerType</code>
     *            that are allocated to the development endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
        return this;
    }

    /**
     * <p>
     * The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     * </p>
     *
     * @return <p>
     *         The AWS Availability Zone where this <code>DevEndpoint</code> is
     *         located.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     * </p>
     *
     * @param availabilityZone <p>
     *            The AWS Availability Zone where this <code>DevEndpoint</code>
     *            is located.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The AWS Availability Zone where this <code>DevEndpoint</code>
     *            is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) used by this
     * <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual private cloud (VPC) used by this
     *         <code>DevEndpoint</code>.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) used by this
     * <code>DevEndpoint</code>.
     * </p>
     *
     * @param vpcId <p>
     *            The ID of the virtual private cloud (VPC) used by this
     *            <code>DevEndpoint</code>.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) used by this
     * <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The ID of the virtual private cloud (VPC) used by this
     *            <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The paths to one or more Python libraries in an S3 bucket that will be
     * loaded in your <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         The paths to one or more Python libraries in an S3 bucket that
     *         will be loaded in your <code>DevEndpoint</code>.
     *         </p>
     */
    public String getExtraPythonLibsS3Path() {
        return extraPythonLibsS3Path;
    }

    /**
     * <p>
     * The paths to one or more Python libraries in an S3 bucket that will be
     * loaded in your <code>DevEndpoint</code>.
     * </p>
     *
     * @param extraPythonLibsS3Path <p>
     *            The paths to one or more Python libraries in an S3 bucket that
     *            will be loaded in your <code>DevEndpoint</code>.
     *            </p>
     */
    public void setExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
    }

    /**
     * <p>
     * The paths to one or more Python libraries in an S3 bucket that will be
     * loaded in your <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extraPythonLibsS3Path <p>
     *            The paths to one or more Python libraries in an S3 bucket that
     *            will be loaded in your <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
        return this;
    }

    /**
     * <p>
     * Path to one or more Java <code>.jar</code> files in an S3 bucket that
     * will be loaded in your <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         Path to one or more Java <code>.jar</code> files in an S3 bucket
     *         that will be loaded in your <code>DevEndpoint</code>.
     *         </p>
     */
    public String getExtraJarsS3Path() {
        return extraJarsS3Path;
    }

    /**
     * <p>
     * Path to one or more Java <code>.jar</code> files in an S3 bucket that
     * will be loaded in your <code>DevEndpoint</code>.
     * </p>
     *
     * @param extraJarsS3Path <p>
     *            Path to one or more Java <code>.jar</code> files in an S3
     *            bucket that will be loaded in your <code>DevEndpoint</code>.
     *            </p>
     */
    public void setExtraJarsS3Path(String extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
    }

    /**
     * <p>
     * Path to one or more Java <code>.jar</code> files in an S3 bucket that
     * will be loaded in your <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extraJarsS3Path <p>
     *            Path to one or more Java <code>.jar</code> files in an S3
     *            bucket that will be loaded in your <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withExtraJarsS3Path(String extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
        return this;
    }

    /**
     * <p>
     * The reason for a current failure in this <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         The reason for a current failure in this <code>DevEndpoint</code>
     *         .
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * The reason for a current failure in this <code>DevEndpoint</code>.
     * </p>
     *
     * @param failureReason <p>
     *            The reason for a current failure in this
     *            <code>DevEndpoint</code>.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason for a current failure in this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            The reason for a current failure in this
     *            <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure being used
     * with this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the <code>SecurityConfiguration</code> structure
     *         being used with this <code>DevEndpoint</code>.
     *         </p>
     */
    public String getSecurityConfiguration() {
        return securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure being used
     * with this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param securityConfiguration <p>
     *            The name of the <code>SecurityConfiguration</code> structure
     *            being used with this <code>DevEndpoint</code>.
     *            </p>
     */
    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure being used
     * with this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param securityConfiguration <p>
     *            The name of the <code>SecurityConfiguration</code> structure
     *            being used with this <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
        return this;
    }

    /**
     * <p>
     * The point in time at which this <code>DevEndpoint</code> was created.
     * </p>
     *
     * @return <p>
     *         The point in time at which this <code>DevEndpoint</code> was
     *         created.
     *         </p>
     */
    public java.util.Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * <p>
     * The point in time at which this <code>DevEndpoint</code> was created.
     * </p>
     *
     * @param createdTimestamp <p>
     *            The point in time at which this <code>DevEndpoint</code> was
     *            created.
     *            </p>
     */
    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The point in time at which this <code>DevEndpoint</code> was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTimestamp <p>
     *            The point in time at which this <code>DevEndpoint</code> was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    /**
     * <p>
     * The map of arguments used to configure this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by
     * using the <code>Arguments</code> parameter in the
     * <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If
     * no arguments are provided, the version defaults to Python 2.
     * </p>
     *
     * @return <p>
     *         The map of arguments used to configure this
     *         <code>DevEndpoint</code>.
     *         </p>
     *         <p>
     *         Valid arguments are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"--enable-glue-datacatalog": ""</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"GLUE_PYTHON_VERSION": "3"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"GLUE_PYTHON_VERSION": "2"</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can specify a version of Python support for development
     *         endpoints by using the <code>Arguments</code> parameter in the
     *         <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code>
     *         APIs. If no arguments are provided, the version defaults to
     *         Python 2.
     *         </p>
     */
    public java.util.Map<String, String> getArguments() {
        return arguments;
    }

    /**
     * <p>
     * The map of arguments used to configure this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by
     * using the <code>Arguments</code> parameter in the
     * <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If
     * no arguments are provided, the version defaults to Python 2.
     * </p>
     *
     * @param arguments <p>
     *            The map of arguments used to configure this
     *            <code>DevEndpoint</code>.
     *            </p>
     *            <p>
     *            Valid arguments are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>"--enable-glue-datacatalog": ""</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"GLUE_PYTHON_VERSION": "3"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"GLUE_PYTHON_VERSION": "2"</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can specify a version of Python support for development
     *            endpoints by using the <code>Arguments</code> parameter in the
     *            <code>CreateDevEndpoint</code> or
     *            <code>UpdateDevEndpoint</code> APIs. If no arguments are
     *            provided, the version defaults to Python 2.
     *            </p>
     */
    public void setArguments(java.util.Map<String, String> arguments) {
        this.arguments = arguments;
    }

    /**
     * <p>
     * The map of arguments used to configure this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by
     * using the <code>Arguments</code> parameter in the
     * <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If
     * no arguments are provided, the version defaults to Python 2.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arguments <p>
     *            The map of arguments used to configure this
     *            <code>DevEndpoint</code>.
     *            </p>
     *            <p>
     *            Valid arguments are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>"--enable-glue-datacatalog": ""</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"GLUE_PYTHON_VERSION": "3"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"GLUE_PYTHON_VERSION": "2"</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can specify a version of Python support for development
     *            endpoints by using the <code>Arguments</code> parameter in the
     *            <code>CreateDevEndpoint</code> or
     *            <code>UpdateDevEndpoint</code> APIs. If no arguments are
     *            provided, the version defaults to Python 2.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult withArguments(java.util.Map<String, String> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * <p>
     * The map of arguments used to configure this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by
     * using the <code>Arguments</code> parameter in the
     * <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If
     * no arguments are provided, the version defaults to Python 2.
     * </p>
     * <p>
     * The method adds a new key-value pair into Arguments parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Arguments.
     * @param value The corresponding value of the entry to be added into
     *            Arguments.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDevEndpointResult addArgumentsEntry(String key, String value) {
        if (null == this.arguments) {
            this.arguments = new java.util.HashMap<String, String>();
        }
        if (this.arguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.arguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Arguments.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateDevEndpointResult clearArgumentsEntries() {
        this.arguments = null;
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
        if (getEndpointName() != null)
            sb.append("EndpointName: " + getEndpointName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getYarnEndpointAddress() != null)
            sb.append("YarnEndpointAddress: " + getYarnEndpointAddress() + ",");
        if (getZeppelinRemoteSparkInterpreterPort() != null)
            sb.append("ZeppelinRemoteSparkInterpreterPort: "
                    + getZeppelinRemoteSparkInterpreterPort() + ",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: " + getNumberOfNodes() + ",");
        if (getWorkerType() != null)
            sb.append("WorkerType: " + getWorkerType() + ",");
        if (getGlueVersion() != null)
            sb.append("GlueVersion: " + getGlueVersion() + ",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: " + getNumberOfWorkers() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getExtraPythonLibsS3Path() != null)
            sb.append("ExtraPythonLibsS3Path: " + getExtraPythonLibsS3Path() + ",");
        if (getExtraJarsS3Path() != null)
            sb.append("ExtraJarsS3Path: " + getExtraJarsS3Path() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: " + getSecurityConfiguration() + ",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: " + getCreatedTimestamp() + ",");
        if (getArguments() != null)
            sb.append("Arguments: " + getArguments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getYarnEndpointAddress() == null) ? 0 : getYarnEndpointAddress().hashCode());
        hashCode = prime
                * hashCode
                + ((getZeppelinRemoteSparkInterpreterPort() == null) ? 0
                        : getZeppelinRemoteSparkInterpreterPort().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode
                + ((getGlueVersion() == null) ? 0 : getGlueVersion().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime
                * hashCode
                + ((getExtraPythonLibsS3Path() == null) ? 0 : getExtraPythonLibsS3Path().hashCode());
        hashCode = prime * hashCode
                + ((getExtraJarsS3Path() == null) ? 0 : getExtraJarsS3Path().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getArguments() == null) ? 0 : getArguments().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDevEndpointResult == false)
            return false;
        CreateDevEndpointResult other = (CreateDevEndpointResult) obj;

        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null
                && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null
                && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getYarnEndpointAddress() == null ^ this.getYarnEndpointAddress() == null)
            return false;
        if (other.getYarnEndpointAddress() != null
                && other.getYarnEndpointAddress().equals(this.getYarnEndpointAddress()) == false)
            return false;
        if (other.getZeppelinRemoteSparkInterpreterPort() == null
                ^ this.getZeppelinRemoteSparkInterpreterPort() == null)
            return false;
        if (other.getZeppelinRemoteSparkInterpreterPort() != null
                && other.getZeppelinRemoteSparkInterpreterPort().equals(
                        this.getZeppelinRemoteSparkInterpreterPort()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null
                && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getWorkerType() == null ^ this.getWorkerType() == null)
            return false;
        if (other.getWorkerType() != null
                && other.getWorkerType().equals(this.getWorkerType()) == false)
            return false;
        if (other.getGlueVersion() == null ^ this.getGlueVersion() == null)
            return false;
        if (other.getGlueVersion() != null
                && other.getGlueVersion().equals(this.getGlueVersion()) == false)
            return false;
        if (other.getNumberOfWorkers() == null ^ this.getNumberOfWorkers() == null)
            return false;
        if (other.getNumberOfWorkers() != null
                && other.getNumberOfWorkers().equals(this.getNumberOfWorkers()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getExtraPythonLibsS3Path() == null ^ this.getExtraPythonLibsS3Path() == null)
            return false;
        if (other.getExtraPythonLibsS3Path() != null
                && other.getExtraPythonLibsS3Path().equals(this.getExtraPythonLibsS3Path()) == false)
            return false;
        if (other.getExtraJarsS3Path() == null ^ this.getExtraJarsS3Path() == null)
            return false;
        if (other.getExtraJarsS3Path() != null
                && other.getExtraJarsS3Path().equals(this.getExtraJarsS3Path()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null
                && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null
                && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getArguments() == null ^ this.getArguments() == null)
            return false;
        if (other.getArguments() != null
                && other.getArguments().equals(this.getArguments()) == false)
            return false;
        return true;
    }
}

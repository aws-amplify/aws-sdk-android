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
 * A development endpoint where a developer can remotely debug extract,
 * transform, and load (ETL) scripts.
 * </p>
 */
public class DevEndpoint implements Serializable {
    /**
     * <p>
     * The name of the <code>DevEndpoint</code>.
     * </p>
     */
    private String endpointName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used in this
     * <code>DevEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/.*<br/>
     */
    private String roleArn;

    /**
     * <p>
     * A list of security group identifiers used in this
     * <code>DevEndpoint</code>.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * The subnet ID for this <code>DevEndpoint</code>.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * The YARN endpoint address used by this <code>DevEndpoint</code>.
     * </p>
     */
    private String yarnEndpointAddress;

    /**
     * <p>
     * A private IP address to access the <code>DevEndpoint</code> within a VPC
     * if the <code>DevEndpoint</code> is created within one. The
     * <code>PrivateAddress</code> field is present only when you create the
     * <code>DevEndpoint</code> within your VPC.
     * </p>
     */
    private String privateAddress;

    /**
     * <p>
     * The Apache Zeppelin port for the remote Apache Spark interpreter.
     * </p>
     */
    private Integer zeppelinRemoteSparkInterpreterPort;

    /**
     * <p>
     * The public IP address used by this <code>DevEndpoint</code>. The
     * <code>PublicAddress</code> field is present only when you create a
     * non-virtual private cloud (VPC) <code>DevEndpoint</code>.
     * </p>
     */
    private String publicAddress;

    /**
     * <p>
     * The current status of this <code>DevEndpoint</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The type of predefined worker that is allocated to the development
     * endpoint. Accepts a value of Standard, G.1X, or G.2X.
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
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU,
     * 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU,
     * 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Known issue: when a development endpoint is created with the
     * <code>G.2X</code> <code>WorkerType</code> configuration, the Spark
     * drivers for the development endpoint will run on 4 vCPU, 16 GB of memory,
     * and a 64 GB disk.
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
     * For more information about the available AWS Glue versions and
     * corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue
     * version</a> in the developer guide.
     * </p>
     * <p>
     * Development endpoints that are created without specifying a Glue version
     * default to Glue 0.9.
     * </p>
     * <p>
     * You can specify a version of Python support for development endpoints by
     * using the <code>Arguments</code> parameter in the
     * <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If
     * no arguments are provided, the version defaults to Python 2.
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
     * <p>
     * The maximum number of workers you can define are 299 for
     * <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     */
    private Integer numberOfWorkers;

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this
     * <code>DevEndpoint</code>.
     * </p>
     */
    private Integer numberOfNodes;

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
     * The paths to one or more Python libraries in an Amazon S3 bucket that
     * should be loaded in your <code>DevEndpoint</code>. Multiple values must
     * be complete paths separated by a comma.
     * </p>
     * <note>
     * <p>
     * You can only use pure Python libraries with a <code>DevEndpoint</code>.
     * Libraries that rely on C extensions, such as the <a
     * href="http://pandas.pydata.org/">pandas</a> Python data analysis library,
     * are not currently supported.
     * </p>
     * </note>
     */
    private String extraPythonLibsS3Path;

    /**
     * <p>
     * The path to one or more Java <code>.jar</code> files in an S3 bucket that
     * should be loaded in your <code>DevEndpoint</code>.
     * </p>
     * <note>
     * <p>
     * You can only use pure Java/Scala libraries with a
     * <code>DevEndpoint</code>.
     * </p>
     * </note>
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
     * The status of the last update.
     * </p>
     */
    private String lastUpdateStatus;

    /**
     * <p>
     * The point in time at which this DevEndpoint was created.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The point in time at which this <code>DevEndpoint</code> was last
     * modified.
     * </p>
     */
    private java.util.Date lastModifiedTimestamp;

    /**
     * <p>
     * The public key to be used by this <code>DevEndpoint</code> for
     * authentication. This attribute is provided for backward compatibility
     * because the recommended attribute to use is public keys.
     * </p>
     */
    private String publicKey;

    /**
     * <p>
     * A list of public keys to be used by the <code>DevEndpoints</code> for
     * authentication. Using this attribute is preferred over a single public
     * key because the public keys allow you to have a different private key per
     * client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove
     * that key to be able to set a list of public keys. Call the
     * <code>UpdateDevEndpoint</code> API operation with the public key content
     * in the <code>deletePublicKeys</code> attribute, and the list of new keys
     * in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     */
    private java.util.List<String> publicKeys;

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
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
     * A map of arguments used to configure the <code>DevEndpoint</code>.
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
     * The name of the <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         The name of the <code>DevEndpoint</code>.
     *         </p>
     */
    public String getEndpointName() {
        return endpointName;
    }

    /**
     * <p>
     * The name of the <code>DevEndpoint</code>.
     * </p>
     *
     * @param endpointName <p>
     *            The name of the <code>DevEndpoint</code>.
     *            </p>
     */
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointName <p>
     *            The name of the <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used in this
     * <code>DevEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role used in this
     *         <code>DevEndpoint</code>.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used in this
     * <code>DevEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/.*<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role used in this
     *            <code>DevEndpoint</code>.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used in this
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
     *            The Amazon Resource Name (ARN) of the IAM role used in this
     *            <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * A list of security group identifiers used in this
     * <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         A list of security group identifiers used in this
     *         <code>DevEndpoint</code>.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of security group identifiers used in this
     * <code>DevEndpoint</code>.
     * </p>
     *
     * @param securityGroupIds <p>
     *            A list of security group identifiers used in this
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
     * A list of security group identifiers used in this
     * <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            A list of security group identifiers used in this
     *            <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withSecurityGroupIds(String... securityGroupIds) {
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
     * A list of security group identifiers used in this
     * <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            A list of security group identifiers used in this
     *            <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The subnet ID for this <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         The subnet ID for this <code>DevEndpoint</code>.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The subnet ID for this <code>DevEndpoint</code>.
     * </p>
     *
     * @param subnetId <p>
     *            The subnet ID for this <code>DevEndpoint</code>.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet ID for this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetId <p>
     *            The subnet ID for this <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * The YARN endpoint address used by this <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         The YARN endpoint address used by this <code>DevEndpoint</code>.
     *         </p>
     */
    public String getYarnEndpointAddress() {
        return yarnEndpointAddress;
    }

    /**
     * <p>
     * The YARN endpoint address used by this <code>DevEndpoint</code>.
     * </p>
     *
     * @param yarnEndpointAddress <p>
     *            The YARN endpoint address used by this
     *            <code>DevEndpoint</code>.
     *            </p>
     */
    public void setYarnEndpointAddress(String yarnEndpointAddress) {
        this.yarnEndpointAddress = yarnEndpointAddress;
    }

    /**
     * <p>
     * The YARN endpoint address used by this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param yarnEndpointAddress <p>
     *            The YARN endpoint address used by this
     *            <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withYarnEndpointAddress(String yarnEndpointAddress) {
        this.yarnEndpointAddress = yarnEndpointAddress;
        return this;
    }

    /**
     * <p>
     * A private IP address to access the <code>DevEndpoint</code> within a VPC
     * if the <code>DevEndpoint</code> is created within one. The
     * <code>PrivateAddress</code> field is present only when you create the
     * <code>DevEndpoint</code> within your VPC.
     * </p>
     *
     * @return <p>
     *         A private IP address to access the <code>DevEndpoint</code>
     *         within a VPC if the <code>DevEndpoint</code> is created within
     *         one. The <code>PrivateAddress</code> field is present only when
     *         you create the <code>DevEndpoint</code> within your VPC.
     *         </p>
     */
    public String getPrivateAddress() {
        return privateAddress;
    }

    /**
     * <p>
     * A private IP address to access the <code>DevEndpoint</code> within a VPC
     * if the <code>DevEndpoint</code> is created within one. The
     * <code>PrivateAddress</code> field is present only when you create the
     * <code>DevEndpoint</code> within your VPC.
     * </p>
     *
     * @param privateAddress <p>
     *            A private IP address to access the <code>DevEndpoint</code>
     *            within a VPC if the <code>DevEndpoint</code> is created within
     *            one. The <code>PrivateAddress</code> field is present only
     *            when you create the <code>DevEndpoint</code> within your VPC.
     *            </p>
     */
    public void setPrivateAddress(String privateAddress) {
        this.privateAddress = privateAddress;
    }

    /**
     * <p>
     * A private IP address to access the <code>DevEndpoint</code> within a VPC
     * if the <code>DevEndpoint</code> is created within one. The
     * <code>PrivateAddress</code> field is present only when you create the
     * <code>DevEndpoint</code> within your VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateAddress <p>
     *            A private IP address to access the <code>DevEndpoint</code>
     *            within a VPC if the <code>DevEndpoint</code> is created within
     *            one. The <code>PrivateAddress</code> field is present only
     *            when you create the <code>DevEndpoint</code> within your VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withPrivateAddress(String privateAddress) {
        this.privateAddress = privateAddress;
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
    public DevEndpoint withZeppelinRemoteSparkInterpreterPort(
            Integer zeppelinRemoteSparkInterpreterPort) {
        this.zeppelinRemoteSparkInterpreterPort = zeppelinRemoteSparkInterpreterPort;
        return this;
    }

    /**
     * <p>
     * The public IP address used by this <code>DevEndpoint</code>. The
     * <code>PublicAddress</code> field is present only when you create a
     * non-virtual private cloud (VPC) <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         The public IP address used by this <code>DevEndpoint</code>. The
     *         <code>PublicAddress</code> field is present only when you create
     *         a non-virtual private cloud (VPC) <code>DevEndpoint</code>.
     *         </p>
     */
    public String getPublicAddress() {
        return publicAddress;
    }

    /**
     * <p>
     * The public IP address used by this <code>DevEndpoint</code>. The
     * <code>PublicAddress</code> field is present only when you create a
     * non-virtual private cloud (VPC) <code>DevEndpoint</code>.
     * </p>
     *
     * @param publicAddress <p>
     *            The public IP address used by this <code>DevEndpoint</code>.
     *            The <code>PublicAddress</code> field is present only when you
     *            create a non-virtual private cloud (VPC)
     *            <code>DevEndpoint</code>.
     *            </p>
     */
    public void setPublicAddress(String publicAddress) {
        this.publicAddress = publicAddress;
    }

    /**
     * <p>
     * The public IP address used by this <code>DevEndpoint</code>. The
     * <code>PublicAddress</code> field is present only when you create a
     * non-virtual private cloud (VPC) <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicAddress <p>
     *            The public IP address used by this <code>DevEndpoint</code>.
     *            The <code>PublicAddress</code> field is present only when you
     *            create a non-virtual private cloud (VPC)
     *            <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withPublicAddress(String publicAddress) {
        this.publicAddress = publicAddress;
        return this;
    }

    /**
     * <p>
     * The current status of this <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         The current status of this <code>DevEndpoint</code>.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of this <code>DevEndpoint</code>.
     * </p>
     *
     * @param status <p>
     *            The current status of this <code>DevEndpoint</code>.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current status of this <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development
     * endpoint. Accepts a value of Standard, G.1X, or G.2X.
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
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU,
     * 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU,
     * 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Known issue: when a development endpoint is created with the
     * <code>G.2X</code> <code>WorkerType</code> configuration, the Spark
     * drivers for the development endpoint will run on 4 vCPU, 16 GB of memory,
     * and a 64 GB disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @return <p>
     *         The type of predefined worker that is allocated to the
     *         development endpoint. Accepts a value of Standard, G.1X, or G.2X.
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
     *         For the <code>G.1X</code> worker type, each worker maps to 1 DPU
     *         (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1 executor
     *         per worker. We recommend this worker type for memory-intensive
     *         jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.2X</code> worker type, each worker maps to 2 DPU
     *         (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1 executor
     *         per worker. We recommend this worker type for memory-intensive
     *         jobs.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Known issue: when a development endpoint is created with the
     *         <code>G.2X</code> <code>WorkerType</code> configuration, the
     *         Spark drivers for the development endpoint will run on 4 vCPU, 16
     *         GB of memory, and a 64 GB disk.
     *         </p>
     * @see WorkerType
     */
    public String getWorkerType() {
        return workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development
     * endpoint. Accepts a value of Standard, G.1X, or G.2X.
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
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU,
     * 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU,
     * 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Known issue: when a development endpoint is created with the
     * <code>G.2X</code> <code>WorkerType</code> configuration, the Spark
     * drivers for the development endpoint will run on 4 vCPU, 16 GB of memory,
     * and a 64 GB disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated to the
     *            development endpoint. Accepts a value of Standard, G.1X, or
     *            G.2X.
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
     *            For the <code>G.1X</code> worker type, each worker maps to 1
     *            DPU (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1
     *            executor per worker. We recommend this worker type for
     *            memory-intensive jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker maps to 2
     *            DPU (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1
     *            executor per worker. We recommend this worker type for
     *            memory-intensive jobs.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Known issue: when a development endpoint is created with the
     *            <code>G.2X</code> <code>WorkerType</code> configuration, the
     *            Spark drivers for the development endpoint will run on 4 vCPU,
     *            16 GB of memory, and a 64 GB disk.
     *            </p>
     * @see WorkerType
     */
    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development
     * endpoint. Accepts a value of Standard, G.1X, or G.2X.
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
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU,
     * 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU,
     * 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Known issue: when a development endpoint is created with the
     * <code>G.2X</code> <code>WorkerType</code> configuration, the Spark
     * drivers for the development endpoint will run on 4 vCPU, 16 GB of memory,
     * and a 64 GB disk.
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
     *            development endpoint. Accepts a value of Standard, G.1X, or
     *            G.2X.
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
     *            For the <code>G.1X</code> worker type, each worker maps to 1
     *            DPU (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1
     *            executor per worker. We recommend this worker type for
     *            memory-intensive jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker maps to 2
     *            DPU (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1
     *            executor per worker. We recommend this worker type for
     *            memory-intensive jobs.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Known issue: when a development endpoint is created with the
     *            <code>G.2X</code> <code>WorkerType</code> configuration, the
     *            Spark drivers for the development endpoint will run on 4 vCPU,
     *            16 GB of memory, and a 64 GB disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkerType
     */
    public DevEndpoint withWorkerType(String workerType) {
        this.workerType = workerType;
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development
     * endpoint. Accepts a value of Standard, G.1X, or G.2X.
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
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU,
     * 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU,
     * 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Known issue: when a development endpoint is created with the
     * <code>G.2X</code> <code>WorkerType</code> configuration, the Spark
     * drivers for the development endpoint will run on 4 vCPU, 16 GB of memory,
     * and a 64 GB disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated to the
     *            development endpoint. Accepts a value of Standard, G.1X, or
     *            G.2X.
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
     *            For the <code>G.1X</code> worker type, each worker maps to 1
     *            DPU (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1
     *            executor per worker. We recommend this worker type for
     *            memory-intensive jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker maps to 2
     *            DPU (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1
     *            executor per worker. We recommend this worker type for
     *            memory-intensive jobs.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Known issue: when a development endpoint is created with the
     *            <code>G.2X</code> <code>WorkerType</code> configuration, the
     *            Spark drivers for the development endpoint will run on 4 vCPU,
     *            16 GB of memory, and a 64 GB disk.
     *            </p>
     * @see WorkerType
     */
    public void setWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development
     * endpoint. Accepts a value of Standard, G.1X, or G.2X.
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
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU,
     * 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU,
     * 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Known issue: when a development endpoint is created with the
     * <code>G.2X</code> <code>WorkerType</code> configuration, the Spark
     * drivers for the development endpoint will run on 4 vCPU, 16 GB of memory,
     * and a 64 GB disk.
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
     *            development endpoint. Accepts a value of Standard, G.1X, or
     *            G.2X.
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
     *            For the <code>G.1X</code> worker type, each worker maps to 1
     *            DPU (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1
     *            executor per worker. We recommend this worker type for
     *            memory-intensive jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker maps to 2
     *            DPU (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1
     *            executor per worker. We recommend this worker type for
     *            memory-intensive jobs.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Known issue: when a development endpoint is created with the
     *            <code>G.2X</code> <code>WorkerType</code> configuration, the
     *            Spark drivers for the development endpoint will run on 4 vCPU,
     *            16 GB of memory, and a 64 GB disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkerType
     */
    public DevEndpoint withWorkerType(WorkerType workerType) {
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
     * For more information about the available AWS Glue versions and
     * corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue
     * version</a> in the developer guide.
     * </p>
     * <p>
     * Development endpoints that are created without specifying a Glue version
     * default to Glue 0.9.
     * </p>
     * <p>
     * You can specify a version of Python support for development endpoints by
     * using the <code>Arguments</code> parameter in the
     * <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If
     * no arguments are provided, the version defaults to Python 2.
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
     *         <p>
     *         For more information about the available AWS Glue versions and
     *         corresponding Spark and Python versions, see <a
     *         href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html"
     *         >Glue version</a> in the developer guide.
     *         </p>
     *         <p>
     *         Development endpoints that are created without specifying a Glue
     *         version default to Glue 0.9.
     *         </p>
     *         <p>
     *         You can specify a version of Python support for development
     *         endpoints by using the <code>Arguments</code> parameter in the
     *         <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code>
     *         APIs. If no arguments are provided, the version defaults to
     *         Python 2.
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
     * For more information about the available AWS Glue versions and
     * corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue
     * version</a> in the developer guide.
     * </p>
     * <p>
     * Development endpoints that are created without specifying a Glue version
     * default to Glue 0.9.
     * </p>
     * <p>
     * You can specify a version of Python support for development endpoints by
     * using the <code>Arguments</code> parameter in the
     * <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If
     * no arguments are provided, the version defaults to Python 2.
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
     *            <p>
     *            For more information about the available AWS Glue versions and
     *            corresponding Spark and Python versions, see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue
     *            version</a> in the developer guide.
     *            </p>
     *            <p>
     *            Development endpoints that are created without specifying a
     *            Glue version default to Glue 0.9.
     *            </p>
     *            <p>
     *            You can specify a version of Python support for development
     *            endpoints by using the <code>Arguments</code> parameter in the
     *            <code>CreateDevEndpoint</code> or
     *            <code>UpdateDevEndpoint</code> APIs. If no arguments are
     *            provided, the version defaults to Python 2.
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
     * For more information about the available AWS Glue versions and
     * corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue
     * version</a> in the developer guide.
     * </p>
     * <p>
     * Development endpoints that are created without specifying a Glue version
     * default to Glue 0.9.
     * </p>
     * <p>
     * You can specify a version of Python support for development endpoints by
     * using the <code>Arguments</code> parameter in the
     * <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If
     * no arguments are provided, the version defaults to Python 2.
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
     *            <p>
     *            For more information about the available AWS Glue versions and
     *            corresponding Spark and Python versions, see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue
     *            version</a> in the developer guide.
     *            </p>
     *            <p>
     *            Development endpoints that are created without specifying a
     *            Glue version default to Glue 0.9.
     *            </p>
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
    public DevEndpoint withGlueVersion(String glueVersion) {
        this.glueVersion = glueVersion;
        return this;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are
     * allocated to the development endpoint.
     * </p>
     * <p>
     * The maximum number of workers you can define are 299 for
     * <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     *
     * @return <p>
     *         The number of workers of a defined <code>workerType</code> that
     *         are allocated to the development endpoint.
     *         </p>
     *         <p>
     *         The maximum number of workers you can define are 299 for
     *         <code>G.1X</code>, and 149 for <code>G.2X</code>.
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
     * <p>
     * The maximum number of workers you can define are 299 for
     * <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     *
     * @param numberOfWorkers <p>
     *            The number of workers of a defined <code>workerType</code>
     *            that are allocated to the development endpoint.
     *            </p>
     *            <p>
     *            The maximum number of workers you can define are 299 for
     *            <code>G.1X</code>, and 149 for <code>G.2X</code>.
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
     * The maximum number of workers you can define are 299 for
     * <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfWorkers <p>
     *            The number of workers of a defined <code>workerType</code>
     *            that are allocated to the development endpoint.
     *            </p>
     *            <p>
     *            The maximum number of workers you can define are 299 for
     *            <code>G.1X</code>, and 149 for <code>G.2X</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
        return this;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this
     * <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         The number of AWS Glue Data Processing Units (DPUs) allocated to
     *         this <code>DevEndpoint</code>.
     *         </p>
     */
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this
     * <code>DevEndpoint</code>.
     * </p>
     *
     * @param numberOfNodes <p>
     *            The number of AWS Glue Data Processing Units (DPUs) allocated
     *            to this <code>DevEndpoint</code>.
     *            </p>
     */
    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this
     * <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfNodes <p>
     *            The number of AWS Glue Data Processing Units (DPUs) allocated
     *            to this <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
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
    public DevEndpoint withAvailabilityZone(String availabilityZone) {
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
    public DevEndpoint withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The paths to one or more Python libraries in an Amazon S3 bucket that
     * should be loaded in your <code>DevEndpoint</code>. Multiple values must
     * be complete paths separated by a comma.
     * </p>
     * <note>
     * <p>
     * You can only use pure Python libraries with a <code>DevEndpoint</code>.
     * Libraries that rely on C extensions, such as the <a
     * href="http://pandas.pydata.org/">pandas</a> Python data analysis library,
     * are not currently supported.
     * </p>
     * </note>
     *
     * @return <p>
     *         The paths to one or more Python libraries in an Amazon S3 bucket
     *         that should be loaded in your <code>DevEndpoint</code>. Multiple
     *         values must be complete paths separated by a comma.
     *         </p>
     *         <note>
     *         <p>
     *         You can only use pure Python libraries with a
     *         <code>DevEndpoint</code>. Libraries that rely on C extensions,
     *         such as the <a href="http://pandas.pydata.org/">pandas</a> Python
     *         data analysis library, are not currently supported.
     *         </p>
     *         </note>
     */
    public String getExtraPythonLibsS3Path() {
        return extraPythonLibsS3Path;
    }

    /**
     * <p>
     * The paths to one or more Python libraries in an Amazon S3 bucket that
     * should be loaded in your <code>DevEndpoint</code>. Multiple values must
     * be complete paths separated by a comma.
     * </p>
     * <note>
     * <p>
     * You can only use pure Python libraries with a <code>DevEndpoint</code>.
     * Libraries that rely on C extensions, such as the <a
     * href="http://pandas.pydata.org/">pandas</a> Python data analysis library,
     * are not currently supported.
     * </p>
     * </note>
     *
     * @param extraPythonLibsS3Path <p>
     *            The paths to one or more Python libraries in an Amazon S3
     *            bucket that should be loaded in your <code>DevEndpoint</code>.
     *            Multiple values must be complete paths separated by a comma.
     *            </p>
     *            <note>
     *            <p>
     *            You can only use pure Python libraries with a
     *            <code>DevEndpoint</code>. Libraries that rely on C extensions,
     *            such as the <a href="http://pandas.pydata.org/">pandas</a>
     *            Python data analysis library, are not currently supported.
     *            </p>
     *            </note>
     */
    public void setExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
    }

    /**
     * <p>
     * The paths to one or more Python libraries in an Amazon S3 bucket that
     * should be loaded in your <code>DevEndpoint</code>. Multiple values must
     * be complete paths separated by a comma.
     * </p>
     * <note>
     * <p>
     * You can only use pure Python libraries with a <code>DevEndpoint</code>.
     * Libraries that rely on C extensions, such as the <a
     * href="http://pandas.pydata.org/">pandas</a> Python data analysis library,
     * are not currently supported.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extraPythonLibsS3Path <p>
     *            The paths to one or more Python libraries in an Amazon S3
     *            bucket that should be loaded in your <code>DevEndpoint</code>.
     *            Multiple values must be complete paths separated by a comma.
     *            </p>
     *            <note>
     *            <p>
     *            You can only use pure Python libraries with a
     *            <code>DevEndpoint</code>. Libraries that rely on C extensions,
     *            such as the <a href="http://pandas.pydata.org/">pandas</a>
     *            Python data analysis library, are not currently supported.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
        return this;
    }

    /**
     * <p>
     * The path to one or more Java <code>.jar</code> files in an S3 bucket that
     * should be loaded in your <code>DevEndpoint</code>.
     * </p>
     * <note>
     * <p>
     * You can only use pure Java/Scala libraries with a
     * <code>DevEndpoint</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The path to one or more Java <code>.jar</code> files in an S3
     *         bucket that should be loaded in your <code>DevEndpoint</code>.
     *         </p>
     *         <note>
     *         <p>
     *         You can only use pure Java/Scala libraries with a
     *         <code>DevEndpoint</code>.
     *         </p>
     *         </note>
     */
    public String getExtraJarsS3Path() {
        return extraJarsS3Path;
    }

    /**
     * <p>
     * The path to one or more Java <code>.jar</code> files in an S3 bucket that
     * should be loaded in your <code>DevEndpoint</code>.
     * </p>
     * <note>
     * <p>
     * You can only use pure Java/Scala libraries with a
     * <code>DevEndpoint</code>.
     * </p>
     * </note>
     *
     * @param extraJarsS3Path <p>
     *            The path to one or more Java <code>.jar</code> files in an S3
     *            bucket that should be loaded in your <code>DevEndpoint</code>.
     *            </p>
     *            <note>
     *            <p>
     *            You can only use pure Java/Scala libraries with a
     *            <code>DevEndpoint</code>.
     *            </p>
     *            </note>
     */
    public void setExtraJarsS3Path(String extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
    }

    /**
     * <p>
     * The path to one or more Java <code>.jar</code> files in an S3 bucket that
     * should be loaded in your <code>DevEndpoint</code>.
     * </p>
     * <note>
     * <p>
     * You can only use pure Java/Scala libraries with a
     * <code>DevEndpoint</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extraJarsS3Path <p>
     *            The path to one or more Java <code>.jar</code> files in an S3
     *            bucket that should be loaded in your <code>DevEndpoint</code>.
     *            </p>
     *            <note>
     *            <p>
     *            You can only use pure Java/Scala libraries with a
     *            <code>DevEndpoint</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withExtraJarsS3Path(String extraJarsS3Path) {
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
    public DevEndpoint withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The status of the last update.
     * </p>
     *
     * @return <p>
     *         The status of the last update.
     *         </p>
     */
    public String getLastUpdateStatus() {
        return lastUpdateStatus;
    }

    /**
     * <p>
     * The status of the last update.
     * </p>
     *
     * @param lastUpdateStatus <p>
     *            The status of the last update.
     *            </p>
     */
    public void setLastUpdateStatus(String lastUpdateStatus) {
        this.lastUpdateStatus = lastUpdateStatus;
    }

    /**
     * <p>
     * The status of the last update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdateStatus <p>
     *            The status of the last update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withLastUpdateStatus(String lastUpdateStatus) {
        this.lastUpdateStatus = lastUpdateStatus;
        return this;
    }

    /**
     * <p>
     * The point in time at which this DevEndpoint was created.
     * </p>
     *
     * @return <p>
     *         The point in time at which this DevEndpoint was created.
     *         </p>
     */
    public java.util.Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * <p>
     * The point in time at which this DevEndpoint was created.
     * </p>
     *
     * @param createdTimestamp <p>
     *            The point in time at which this DevEndpoint was created.
     *            </p>
     */
    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The point in time at which this DevEndpoint was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTimestamp <p>
     *            The point in time at which this DevEndpoint was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    /**
     * <p>
     * The point in time at which this <code>DevEndpoint</code> was last
     * modified.
     * </p>
     *
     * @return <p>
     *         The point in time at which this <code>DevEndpoint</code> was last
     *         modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTimestamp() {
        return lastModifiedTimestamp;
    }

    /**
     * <p>
     * The point in time at which this <code>DevEndpoint</code> was last
     * modified.
     * </p>
     *
     * @param lastModifiedTimestamp <p>
     *            The point in time at which this <code>DevEndpoint</code> was
     *            last modified.
     *            </p>
     */
    public void setLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    /**
     * <p>
     * The point in time at which this <code>DevEndpoint</code> was last
     * modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTimestamp <p>
     *            The point in time at which this <code>DevEndpoint</code> was
     *            last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
        return this;
    }

    /**
     * <p>
     * The public key to be used by this <code>DevEndpoint</code> for
     * authentication. This attribute is provided for backward compatibility
     * because the recommended attribute to use is public keys.
     * </p>
     *
     * @return <p>
     *         The public key to be used by this <code>DevEndpoint</code> for
     *         authentication. This attribute is provided for backward
     *         compatibility because the recommended attribute to use is public
     *         keys.
     *         </p>
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * <p>
     * The public key to be used by this <code>DevEndpoint</code> for
     * authentication. This attribute is provided for backward compatibility
     * because the recommended attribute to use is public keys.
     * </p>
     *
     * @param publicKey <p>
     *            The public key to be used by this <code>DevEndpoint</code> for
     *            authentication. This attribute is provided for backward
     *            compatibility because the recommended attribute to use is
     *            public keys.
     *            </p>
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The public key to be used by this <code>DevEndpoint</code> for
     * authentication. This attribute is provided for backward compatibility
     * because the recommended attribute to use is public keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicKey <p>
     *            The public key to be used by this <code>DevEndpoint</code> for
     *            authentication. This attribute is provided for backward
     *            compatibility because the recommended attribute to use is
     *            public keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * <p>
     * A list of public keys to be used by the <code>DevEndpoints</code> for
     * authentication. Using this attribute is preferred over a single public
     * key because the public keys allow you to have a different private key per
     * client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove
     * that key to be able to set a list of public keys. Call the
     * <code>UpdateDevEndpoint</code> API operation with the public key content
     * in the <code>deletePublicKeys</code> attribute, and the list of new keys
     * in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     *
     * @return <p>
     *         A list of public keys to be used by the <code>DevEndpoints</code>
     *         for authentication. Using this attribute is preferred over a
     *         single public key because the public keys allow you to have a
     *         different private key per client.
     *         </p>
     *         <note>
     *         <p>
     *         If you previously created an endpoint with a public key, you must
     *         remove that key to be able to set a list of public keys. Call the
     *         <code>UpdateDevEndpoint</code> API operation with the public key
     *         content in the <code>deletePublicKeys</code> attribute, and the
     *         list of new keys in the <code>addPublicKeys</code> attribute.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getPublicKeys() {
        return publicKeys;
    }

    /**
     * <p>
     * A list of public keys to be used by the <code>DevEndpoints</code> for
     * authentication. Using this attribute is preferred over a single public
     * key because the public keys allow you to have a different private key per
     * client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove
     * that key to be able to set a list of public keys. Call the
     * <code>UpdateDevEndpoint</code> API operation with the public key content
     * in the <code>deletePublicKeys</code> attribute, and the list of new keys
     * in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     *
     * @param publicKeys <p>
     *            A list of public keys to be used by the
     *            <code>DevEndpoints</code> for authentication. Using this
     *            attribute is preferred over a single public key because the
     *            public keys allow you to have a different private key per
     *            client.
     *            </p>
     *            <note>
     *            <p>
     *            If you previously created an endpoint with a public key, you
     *            must remove that key to be able to set a list of public keys.
     *            Call the <code>UpdateDevEndpoint</code> API operation with the
     *            public key content in the <code>deletePublicKeys</code>
     *            attribute, and the list of new keys in the
     *            <code>addPublicKeys</code> attribute.
     *            </p>
     *            </note>
     */
    public void setPublicKeys(java.util.Collection<String> publicKeys) {
        if (publicKeys == null) {
            this.publicKeys = null;
            return;
        }

        this.publicKeys = new java.util.ArrayList<String>(publicKeys);
    }

    /**
     * <p>
     * A list of public keys to be used by the <code>DevEndpoints</code> for
     * authentication. Using this attribute is preferred over a single public
     * key because the public keys allow you to have a different private key per
     * client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove
     * that key to be able to set a list of public keys. Call the
     * <code>UpdateDevEndpoint</code> API operation with the public key content
     * in the <code>deletePublicKeys</code> attribute, and the list of new keys
     * in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicKeys <p>
     *            A list of public keys to be used by the
     *            <code>DevEndpoints</code> for authentication. Using this
     *            attribute is preferred over a single public key because the
     *            public keys allow you to have a different private key per
     *            client.
     *            </p>
     *            <note>
     *            <p>
     *            If you previously created an endpoint with a public key, you
     *            must remove that key to be able to set a list of public keys.
     *            Call the <code>UpdateDevEndpoint</code> API operation with the
     *            public key content in the <code>deletePublicKeys</code>
     *            attribute, and the list of new keys in the
     *            <code>addPublicKeys</code> attribute.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withPublicKeys(String... publicKeys) {
        if (getPublicKeys() == null) {
            this.publicKeys = new java.util.ArrayList<String>(publicKeys.length);
        }
        for (String value : publicKeys) {
            this.publicKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of public keys to be used by the <code>DevEndpoints</code> for
     * authentication. Using this attribute is preferred over a single public
     * key because the public keys allow you to have a different private key per
     * client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove
     * that key to be able to set a list of public keys. Call the
     * <code>UpdateDevEndpoint</code> API operation with the public key content
     * in the <code>deletePublicKeys</code> attribute, and the list of new keys
     * in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicKeys <p>
     *            A list of public keys to be used by the
     *            <code>DevEndpoints</code> for authentication. Using this
     *            attribute is preferred over a single public key because the
     *            public keys allow you to have a different private key per
     *            client.
     *            </p>
     *            <note>
     *            <p>
     *            If you previously created an endpoint with a public key, you
     *            must remove that key to be able to set a list of public keys.
     *            Call the <code>UpdateDevEndpoint</code> API operation with the
     *            public key content in the <code>deletePublicKeys</code>
     *            attribute, and the list of new keys in the
     *            <code>addPublicKeys</code> attribute.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withPublicKeys(java.util.Collection<String> publicKeys) {
        setPublicKeys(publicKeys);
        return this;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * with this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the <code>SecurityConfiguration</code> structure to
     *         be used with this <code>DevEndpoint</code>.
     *         </p>
     */
    public String getSecurityConfiguration() {
        return securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * with this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param securityConfiguration <p>
     *            The name of the <code>SecurityConfiguration</code> structure
     *            to be used with this <code>DevEndpoint</code>.
     *            </p>
     */
    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
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
     *            to be used with this <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpoint withSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
        return this;
    }

    /**
     * <p>
     * A map of arguments used to configure the <code>DevEndpoint</code>.
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
     *         A map of arguments used to configure the <code>DevEndpoint</code>
     *         .
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
     * A map of arguments used to configure the <code>DevEndpoint</code>.
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
     *            A map of arguments used to configure the
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
     * A map of arguments used to configure the <code>DevEndpoint</code>.
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
     *            A map of arguments used to configure the
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
    public DevEndpoint withArguments(java.util.Map<String, String> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * <p>
     * A map of arguments used to configure the <code>DevEndpoint</code>.
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
    public DevEndpoint addArgumentsEntry(String key, String value) {
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
    public DevEndpoint clearArgumentsEntries() {
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
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getYarnEndpointAddress() != null)
            sb.append("YarnEndpointAddress: " + getYarnEndpointAddress() + ",");
        if (getPrivateAddress() != null)
            sb.append("PrivateAddress: " + getPrivateAddress() + ",");
        if (getZeppelinRemoteSparkInterpreterPort() != null)
            sb.append("ZeppelinRemoteSparkInterpreterPort: "
                    + getZeppelinRemoteSparkInterpreterPort() + ",");
        if (getPublicAddress() != null)
            sb.append("PublicAddress: " + getPublicAddress() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getWorkerType() != null)
            sb.append("WorkerType: " + getWorkerType() + ",");
        if (getGlueVersion() != null)
            sb.append("GlueVersion: " + getGlueVersion() + ",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: " + getNumberOfWorkers() + ",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: " + getNumberOfNodes() + ",");
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
        if (getLastUpdateStatus() != null)
            sb.append("LastUpdateStatus: " + getLastUpdateStatus() + ",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: " + getCreatedTimestamp() + ",");
        if (getLastModifiedTimestamp() != null)
            sb.append("LastModifiedTimestamp: " + getLastModifiedTimestamp() + ",");
        if (getPublicKey() != null)
            sb.append("PublicKey: " + getPublicKey() + ",");
        if (getPublicKeys() != null)
            sb.append("PublicKeys: " + getPublicKeys() + ",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: " + getSecurityConfiguration() + ",");
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
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode
                + ((getYarnEndpointAddress() == null) ? 0 : getYarnEndpointAddress().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateAddress() == null) ? 0 : getPrivateAddress().hashCode());
        hashCode = prime
                * hashCode
                + ((getZeppelinRemoteSparkInterpreterPort() == null) ? 0
                        : getZeppelinRemoteSparkInterpreterPort().hashCode());
        hashCode = prime * hashCode
                + ((getPublicAddress() == null) ? 0 : getPublicAddress().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode
                + ((getGlueVersion() == null) ? 0 : getGlueVersion().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
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
        hashCode = prime * hashCode
                + ((getLastUpdateStatus() == null) ? 0 : getLastUpdateStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastModifiedTimestamp() == null) ? 0 : getLastModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getPublicKeys() == null) ? 0 : getPublicKeys().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getArguments() == null) ? 0 : getArguments().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DevEndpoint == false)
            return false;
        DevEndpoint other = (DevEndpoint) obj;

        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null
                && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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
        if (other.getYarnEndpointAddress() == null ^ this.getYarnEndpointAddress() == null)
            return false;
        if (other.getYarnEndpointAddress() != null
                && other.getYarnEndpointAddress().equals(this.getYarnEndpointAddress()) == false)
            return false;
        if (other.getPrivateAddress() == null ^ this.getPrivateAddress() == null)
            return false;
        if (other.getPrivateAddress() != null
                && other.getPrivateAddress().equals(this.getPrivateAddress()) == false)
            return false;
        if (other.getZeppelinRemoteSparkInterpreterPort() == null
                ^ this.getZeppelinRemoteSparkInterpreterPort() == null)
            return false;
        if (other.getZeppelinRemoteSparkInterpreterPort() != null
                && other.getZeppelinRemoteSparkInterpreterPort().equals(
                        this.getZeppelinRemoteSparkInterpreterPort()) == false)
            return false;
        if (other.getPublicAddress() == null ^ this.getPublicAddress() == null)
            return false;
        if (other.getPublicAddress() != null
                && other.getPublicAddress().equals(this.getPublicAddress()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null
                && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
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
        if (other.getLastUpdateStatus() == null ^ this.getLastUpdateStatus() == null)
            return false;
        if (other.getLastUpdateStatus() != null
                && other.getLastUpdateStatus().equals(this.getLastUpdateStatus()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null
                && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastModifiedTimestamp() == null ^ this.getLastModifiedTimestamp() == null)
            return false;
        if (other.getLastModifiedTimestamp() != null
                && other.getLastModifiedTimestamp().equals(this.getLastModifiedTimestamp()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null
                && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getPublicKeys() == null ^ this.getPublicKeys() == null)
            return false;
        if (other.getPublicKeys() != null
                && other.getPublicKeys().equals(this.getPublicKeys()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null
                && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        if (other.getArguments() == null ^ this.getArguments() == null)
            return false;
        if (other.getArguments() != null
                && other.getArguments().equals(this.getArguments()) == false)
            return false;
        return true;
    }
}

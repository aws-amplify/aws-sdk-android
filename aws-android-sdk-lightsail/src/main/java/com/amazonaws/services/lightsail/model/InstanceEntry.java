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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the Amazon Elastic Compute Cloud instance and related resources to
 * be created using the <code>create cloud formation stack</code> operation.
 * </p>
 */
public class InstanceEntry implements Serializable {
    /**
     * <p>
     * The name of the export snapshot record, which contains the exported
     * Lightsail instance snapshot that will be used as the source of the new
     * Amazon EC2 instance.
     * </p>
     * <p>
     * Use the <code>get export snapshot records</code> operation to get a list
     * of export snapshot records that you can use to create a CloudFormation
     * stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String sourceName;

    /**
     * <p>
     * The instance type (e.g., <code>t2.micro</code>) to use for the new Amazon
     * EC2 instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String instanceType;

    /**
     * <p>
     * The port configuration to use for the new Amazon EC2 instance.
     * </p>
     * <p>
     * The following configuration options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DEFAULT</code> - Use the default firewall settings from the
     * Lightsail instance blueprint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE</code> - Use the configured firewall settings from the
     * source Lightsail instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Use the default Amazon EC2 security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLOSED</code> - All ports closed.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you configured <code>lightsail-connect</code> as a
     * <code>cidrListAliases</code> on your instance, or if you chose to allow
     * the Lightsail browser-based SSH or RDP clients to connect to your
     * instance, that configuration is not carried over to your new Amazon EC2
     * instance.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, INSTANCE, NONE, CLOSED
     */
    private String portInfoSource;

    /**
     * <p>
     * A launch script you can create that configures a server with additional
     * user data. For example, you might want to run
     * <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on
     * your instance varies. Amazon Linux and CentOS use <code>yum</code>,
     * Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     * <code>pkg</code>.
     * </p>
     * </note>
     */
    private String userData;

    /**
     * <p>
     * The Availability Zone for the new Amazon EC2 instance.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The name of the export snapshot record, which contains the exported
     * Lightsail instance snapshot that will be used as the source of the new
     * Amazon EC2 instance.
     * </p>
     * <p>
     * Use the <code>get export snapshot records</code> operation to get a list
     * of export snapshot records that you can use to create a CloudFormation
     * stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the export snapshot record, which contains the
     *         exported Lightsail instance snapshot that will be used as the
     *         source of the new Amazon EC2 instance.
     *         </p>
     *         <p>
     *         Use the <code>get export snapshot records</code> operation to get
     *         a list of export snapshot records that you can use to create a
     *         CloudFormation stack.
     *         </p>
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * <p>
     * The name of the export snapshot record, which contains the exported
     * Lightsail instance snapshot that will be used as the source of the new
     * Amazon EC2 instance.
     * </p>
     * <p>
     * Use the <code>get export snapshot records</code> operation to get a list
     * of export snapshot records that you can use to create a CloudFormation
     * stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param sourceName <p>
     *            The name of the export snapshot record, which contains the
     *            exported Lightsail instance snapshot that will be used as the
     *            source of the new Amazon EC2 instance.
     *            </p>
     *            <p>
     *            Use the <code>get export snapshot records</code> operation to
     *            get a list of export snapshot records that you can use to
     *            create a CloudFormation stack.
     *            </p>
     */
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * <p>
     * The name of the export snapshot record, which contains the exported
     * Lightsail instance snapshot that will be used as the source of the new
     * Amazon EC2 instance.
     * </p>
     * <p>
     * Use the <code>get export snapshot records</code> operation to get a list
     * of export snapshot records that you can use to create a CloudFormation
     * stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param sourceName <p>
     *            The name of the export snapshot record, which contains the
     *            exported Lightsail instance snapshot that will be used as the
     *            source of the new Amazon EC2 instance.
     *            </p>
     *            <p>
     *            Use the <code>get export snapshot records</code> operation to
     *            get a list of export snapshot records that you can use to
     *            create a CloudFormation stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceEntry withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * <p>
     * The instance type (e.g., <code>t2.micro</code>) to use for the new Amazon
     * EC2 instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The instance type (e.g., <code>t2.micro</code>) to use for the
     *         new Amazon EC2 instance.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type (e.g., <code>t2.micro</code>) to use for the new Amazon
     * EC2 instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param instanceType <p>
     *            The instance type (e.g., <code>t2.micro</code>) to use for the
     *            new Amazon EC2 instance.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type (e.g., <code>t2.micro</code>) to use for the new Amazon
     * EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param instanceType <p>
     *            The instance type (e.g., <code>t2.micro</code>) to use for the
     *            new Amazon EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceEntry withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The port configuration to use for the new Amazon EC2 instance.
     * </p>
     * <p>
     * The following configuration options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DEFAULT</code> - Use the default firewall settings from the
     * Lightsail instance blueprint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE</code> - Use the configured firewall settings from the
     * source Lightsail instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Use the default Amazon EC2 security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLOSED</code> - All ports closed.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you configured <code>lightsail-connect</code> as a
     * <code>cidrListAliases</code> on your instance, or if you chose to allow
     * the Lightsail browser-based SSH or RDP clients to connect to your
     * instance, that configuration is not carried over to your new Amazon EC2
     * instance.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, INSTANCE, NONE, CLOSED
     *
     * @return <p>
     *         The port configuration to use for the new Amazon EC2 instance.
     *         </p>
     *         <p>
     *         The following configuration options are available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DEFAULT</code> - Use the default firewall settings from the
     *         Lightsail instance blueprint.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSTANCE</code> - Use the configured firewall settings from
     *         the source Lightsail instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code> - Use the default Amazon EC2 security group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CLOSED</code> - All ports closed.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         If you configured <code>lightsail-connect</code> as a
     *         <code>cidrListAliases</code> on your instance, or if you chose to
     *         allow the Lightsail browser-based SSH or RDP clients to connect
     *         to your instance, that configuration is not carried over to your
     *         new Amazon EC2 instance.
     *         </p>
     *         </note>
     * @see PortInfoSourceType
     */
    public String getPortInfoSource() {
        return portInfoSource;
    }

    /**
     * <p>
     * The port configuration to use for the new Amazon EC2 instance.
     * </p>
     * <p>
     * The following configuration options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DEFAULT</code> - Use the default firewall settings from the
     * Lightsail instance blueprint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE</code> - Use the configured firewall settings from the
     * source Lightsail instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Use the default Amazon EC2 security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLOSED</code> - All ports closed.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you configured <code>lightsail-connect</code> as a
     * <code>cidrListAliases</code> on your instance, or if you chose to allow
     * the Lightsail browser-based SSH or RDP clients to connect to your
     * instance, that configuration is not carried over to your new Amazon EC2
     * instance.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, INSTANCE, NONE, CLOSED
     *
     * @param portInfoSource <p>
     *            The port configuration to use for the new Amazon EC2 instance.
     *            </p>
     *            <p>
     *            The following configuration options are available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DEFAULT</code> - Use the default firewall settings from
     *            the Lightsail instance blueprint.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSTANCE</code> - Use the configured firewall settings
     *            from the source Lightsail instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code> - Use the default Amazon EC2 security group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CLOSED</code> - All ports closed.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            If you configured <code>lightsail-connect</code> as a
     *            <code>cidrListAliases</code> on your instance, or if you chose
     *            to allow the Lightsail browser-based SSH or RDP clients to
     *            connect to your instance, that configuration is not carried
     *            over to your new Amazon EC2 instance.
     *            </p>
     *            </note>
     * @see PortInfoSourceType
     */
    public void setPortInfoSource(String portInfoSource) {
        this.portInfoSource = portInfoSource;
    }

    /**
     * <p>
     * The port configuration to use for the new Amazon EC2 instance.
     * </p>
     * <p>
     * The following configuration options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DEFAULT</code> - Use the default firewall settings from the
     * Lightsail instance blueprint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE</code> - Use the configured firewall settings from the
     * source Lightsail instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Use the default Amazon EC2 security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLOSED</code> - All ports closed.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you configured <code>lightsail-connect</code> as a
     * <code>cidrListAliases</code> on your instance, or if you chose to allow
     * the Lightsail browser-based SSH or RDP clients to connect to your
     * instance, that configuration is not carried over to your new Amazon EC2
     * instance.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, INSTANCE, NONE, CLOSED
     *
     * @param portInfoSource <p>
     *            The port configuration to use for the new Amazon EC2 instance.
     *            </p>
     *            <p>
     *            The following configuration options are available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DEFAULT</code> - Use the default firewall settings from
     *            the Lightsail instance blueprint.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSTANCE</code> - Use the configured firewall settings
     *            from the source Lightsail instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code> - Use the default Amazon EC2 security group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CLOSED</code> - All ports closed.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            If you configured <code>lightsail-connect</code> as a
     *            <code>cidrListAliases</code> on your instance, or if you chose
     *            to allow the Lightsail browser-based SSH or RDP clients to
     *            connect to your instance, that configuration is not carried
     *            over to your new Amazon EC2 instance.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PortInfoSourceType
     */
    public InstanceEntry withPortInfoSource(String portInfoSource) {
        this.portInfoSource = portInfoSource;
        return this;
    }

    /**
     * <p>
     * The port configuration to use for the new Amazon EC2 instance.
     * </p>
     * <p>
     * The following configuration options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DEFAULT</code> - Use the default firewall settings from the
     * Lightsail instance blueprint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE</code> - Use the configured firewall settings from the
     * source Lightsail instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Use the default Amazon EC2 security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLOSED</code> - All ports closed.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you configured <code>lightsail-connect</code> as a
     * <code>cidrListAliases</code> on your instance, or if you chose to allow
     * the Lightsail browser-based SSH or RDP clients to connect to your
     * instance, that configuration is not carried over to your new Amazon EC2
     * instance.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, INSTANCE, NONE, CLOSED
     *
     * @param portInfoSource <p>
     *            The port configuration to use for the new Amazon EC2 instance.
     *            </p>
     *            <p>
     *            The following configuration options are available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DEFAULT</code> - Use the default firewall settings from
     *            the Lightsail instance blueprint.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSTANCE</code> - Use the configured firewall settings
     *            from the source Lightsail instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code> - Use the default Amazon EC2 security group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CLOSED</code> - All ports closed.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            If you configured <code>lightsail-connect</code> as a
     *            <code>cidrListAliases</code> on your instance, or if you chose
     *            to allow the Lightsail browser-based SSH or RDP clients to
     *            connect to your instance, that configuration is not carried
     *            over to your new Amazon EC2 instance.
     *            </p>
     *            </note>
     * @see PortInfoSourceType
     */
    public void setPortInfoSource(PortInfoSourceType portInfoSource) {
        this.portInfoSource = portInfoSource.toString();
    }

    /**
     * <p>
     * The port configuration to use for the new Amazon EC2 instance.
     * </p>
     * <p>
     * The following configuration options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DEFAULT</code> - Use the default firewall settings from the
     * Lightsail instance blueprint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE</code> - Use the configured firewall settings from the
     * source Lightsail instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Use the default Amazon EC2 security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLOSED</code> - All ports closed.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you configured <code>lightsail-connect</code> as a
     * <code>cidrListAliases</code> on your instance, or if you chose to allow
     * the Lightsail browser-based SSH or RDP clients to connect to your
     * instance, that configuration is not carried over to your new Amazon EC2
     * instance.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, INSTANCE, NONE, CLOSED
     *
     * @param portInfoSource <p>
     *            The port configuration to use for the new Amazon EC2 instance.
     *            </p>
     *            <p>
     *            The following configuration options are available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DEFAULT</code> - Use the default firewall settings from
     *            the Lightsail instance blueprint.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSTANCE</code> - Use the configured firewall settings
     *            from the source Lightsail instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code> - Use the default Amazon EC2 security group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CLOSED</code> - All ports closed.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            If you configured <code>lightsail-connect</code> as a
     *            <code>cidrListAliases</code> on your instance, or if you chose
     *            to allow the Lightsail browser-based SSH or RDP clients to
     *            connect to your instance, that configuration is not carried
     *            over to your new Amazon EC2 instance.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PortInfoSourceType
     */
    public InstanceEntry withPortInfoSource(PortInfoSourceType portInfoSource) {
        this.portInfoSource = portInfoSource.toString();
        return this;
    }

    /**
     * <p>
     * A launch script you can create that configures a server with additional
     * user data. For example, you might want to run
     * <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on
     * your instance varies. Amazon Linux and CentOS use <code>yum</code>,
     * Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     * <code>pkg</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         A launch script you can create that configures a server with
     *         additional user data. For example, you might want to run
     *         <code>apt-get -y update</code>.
     *         </p>
     *         <note>
     *         <p>
     *         Depending on the machine image you choose, the command to get
     *         software on your instance varies. Amazon Linux and CentOS use
     *         <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and
     *         FreeBSD uses <code>pkg</code>.
     *         </p>
     *         </note>
     */
    public String getUserData() {
        return userData;
    }

    /**
     * <p>
     * A launch script you can create that configures a server with additional
     * user data. For example, you might want to run
     * <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on
     * your instance varies. Amazon Linux and CentOS use <code>yum</code>,
     * Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     * <code>pkg</code>.
     * </p>
     * </note>
     *
     * @param userData <p>
     *            A launch script you can create that configures a server with
     *            additional user data. For example, you might want to run
     *            <code>apt-get -y update</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Depending on the machine image you choose, the command to get
     *            software on your instance varies. Amazon Linux and CentOS use
     *            <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>,
     *            and FreeBSD uses <code>pkg</code>.
     *            </p>
     *            </note>
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * A launch script you can create that configures a server with additional
     * user data. For example, you might want to run
     * <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on
     * your instance varies. Amazon Linux and CentOS use <code>yum</code>,
     * Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     * <code>pkg</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userData <p>
     *            A launch script you can create that configures a server with
     *            additional user data. For example, you might want to run
     *            <code>apt-get -y update</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Depending on the machine image you choose, the command to get
     *            software on your instance varies. Amazon Linux and CentOS use
     *            <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>,
     *            and FreeBSD uses <code>pkg</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceEntry withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * <p>
     * The Availability Zone for the new Amazon EC2 instance.
     * </p>
     *
     * @return <p>
     *         The Availability Zone for the new Amazon EC2 instance.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the new Amazon EC2 instance.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone for the new Amazon EC2 instance.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the new Amazon EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone for the new Amazon EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceEntry withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
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
        if (getSourceName() != null)
            sb.append("sourceName: " + getSourceName() + ",");
        if (getInstanceType() != null)
            sb.append("instanceType: " + getInstanceType() + ",");
        if (getPortInfoSource() != null)
            sb.append("portInfoSource: " + getPortInfoSource() + ",");
        if (getUserData() != null)
            sb.append("userData: " + getUserData() + ",");
        if (getAvailabilityZone() != null)
            sb.append("availabilityZone: " + getAvailabilityZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceName() == null) ? 0 : getSourceName().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getPortInfoSource() == null) ? 0 : getPortInfoSource().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceEntry == false)
            return false;
        InstanceEntry other = (InstanceEntry) obj;

        if (other.getSourceName() == null ^ this.getSourceName() == null)
            return false;
        if (other.getSourceName() != null
                && other.getSourceName().equals(this.getSourceName()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getPortInfoSource() == null ^ this.getPortInfoSource() == null)
            return false;
        if (other.getPortInfoSource() != null
                && other.getPortInfoSource().equals(this.getPortInfoSource()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        return true;
    }
}

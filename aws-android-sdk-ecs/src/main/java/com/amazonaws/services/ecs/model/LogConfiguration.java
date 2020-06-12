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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * The log configuration specification for the container.
 * </p>
 * <p>
 * This parameter maps to <code>LogConfig</code> in the <a
 * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
 * >Create a container</a> section of the <a
 * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and
 * the <code>--log-driver</code> option to <a
 * href="https://docs.docker.com/engine/reference/commandline/run/">
 * <code>docker run</code> </a>. By default, containers use the same logging
 * driver that the Docker daemon uses; however the container may use a different
 * logging driver than the Docker daemon by specifying a log driver with this
 * parameter in the container definition. To use a different logging driver for
 * a container, the log system must be configured properly on the container
 * instance (or on a different log server for remote logging options). For more
 * information on the options for different supported log drivers, see <a
 * href="https://docs.docker.com/engine/admin/logging/overview/">Configure
 * logging drivers</a> in the Docker documentation.
 * </p>
 * <p>
 * The following should be noted when specifying a log configuration for your
 * containers:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Amazon ECS currently supports a subset of the logging drivers available to
 * the Docker daemon (shown in the valid values below). Additional log drivers
 * may be available in future releases of the Amazon ECS container agent.
 * </p>
 * </li>
 * <li>
 * <p>
 * This parameter requires version 1.18 of the Docker Remote API or greater on
 * your container instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * For tasks using the EC2 launch type, the Amazon ECS container agent running
 * on a container instance must register the logging drivers available on that
 * instance with the <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment
 * variable before containers placed on that instance can use these log
 * configuration options. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html"
 * >Amazon ECS Container Agent Configuration</a> in the <i>Amazon Elastic
 * Container Service Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For tasks using the Fargate launch type, because you do not have access to
 * the underlying infrastructure your tasks are hosted on, any additional
 * software needed will have to be installed outside of the task. For example,
 * the Fluentd output aggregators or a remote host running Logstash to send Gelf
 * logs to.
 * </p>
 * </li>
 * </ul>
 */
public class LogConfiguration implements Serializable {
    /**
     * <p>
     * The log driver to use for the container. The valid values listed earlier
     * are log drivers that the Amazon ECS container agent can communicate with
     * by default.
     * </p>
     * <p>
     * For tasks using the Fargate launch type, the supported log drivers are
     * <code>awslogs</code>, <code>splunk</code>, and <code>awsfirelens</code>.
     * </p>
     * <p>
     * For tasks using the EC2 launch type, the supported log drivers are
     * <code>awslogs</code>, <code>fluentd</code>, <code>gelf</code>,
     * <code>json-file</code>, <code>journald</code>, <code>logentries</code>,
     * <code>syslog</code>, <code>splunk</code>, and <code>awsfirelens</code>.
     * </p>
     * <p>
     * For more information about using the <code>awslogs</code> log driver, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html"
     * >Using the awslogs Log Driver</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * For more information about using the <code>awsfirelens</code> log driver,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html"
     * >Custom Log Routing</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you have a custom driver that is not listed, you can fork the Amazon
     * ECS container agent project that is <a
     * href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a>
     * and customize it to work with that driver. We encourage you to submit
     * pull requests for changes that you would like to have included. However,
     * we do not currently provide support for running modified copies of this
     * software.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json-file, syslog, journald, gelf, fluentd,
     * awslogs, splunk, awsfirelens
     */
    private String logDriver;

    /**
     * <p>
     * The configuration options to send to the log driver. This parameter
     * requires version 1.19 of the Docker Remote API or greater on your
     * container instance. To check the Docker Remote API version on your
     * container instance, log in to your container instance and run the
     * following command:
     * <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     */
    private java.util.Map<String, String> options;

    /**
     * <p>
     * The secrets to pass to the log configuration. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html"
     * >Specifying Sensitive Data</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     */
    private java.util.List<Secret> secretOptions;

    /**
     * <p>
     * The log driver to use for the container. The valid values listed earlier
     * are log drivers that the Amazon ECS container agent can communicate with
     * by default.
     * </p>
     * <p>
     * For tasks using the Fargate launch type, the supported log drivers are
     * <code>awslogs</code>, <code>splunk</code>, and <code>awsfirelens</code>.
     * </p>
     * <p>
     * For tasks using the EC2 launch type, the supported log drivers are
     * <code>awslogs</code>, <code>fluentd</code>, <code>gelf</code>,
     * <code>json-file</code>, <code>journald</code>, <code>logentries</code>,
     * <code>syslog</code>, <code>splunk</code>, and <code>awsfirelens</code>.
     * </p>
     * <p>
     * For more information about using the <code>awslogs</code> log driver, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html"
     * >Using the awslogs Log Driver</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * For more information about using the <code>awsfirelens</code> log driver,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html"
     * >Custom Log Routing</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you have a custom driver that is not listed, you can fork the Amazon
     * ECS container agent project that is <a
     * href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a>
     * and customize it to work with that driver. We encourage you to submit
     * pull requests for changes that you would like to have included. However,
     * we do not currently provide support for running modified copies of this
     * software.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json-file, syslog, journald, gelf, fluentd,
     * awslogs, splunk, awsfirelens
     *
     * @return <p>
     *         The log driver to use for the container. The valid values listed
     *         earlier are log drivers that the Amazon ECS container agent can
     *         communicate with by default.
     *         </p>
     *         <p>
     *         For tasks using the Fargate launch type, the supported log
     *         drivers are <code>awslogs</code>, <code>splunk</code>, and
     *         <code>awsfirelens</code>.
     *         </p>
     *         <p>
     *         For tasks using the EC2 launch type, the supported log drivers
     *         are <code>awslogs</code>, <code>fluentd</code>, <code>gelf</code>, <code>json-file</code>, <code>journald</code>,
     *         <code>logentries</code>,<code>syslog</code>, <code>splunk</code>,
     *         and <code>awsfirelens</code>.
     *         </p>
     *         <p>
     *         For more information about using the <code>awslogs</code> log
     *         driver, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html"
     *         >Using the awslogs Log Driver</a> in the <i>Amazon Elastic
     *         Container Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         For more information about using the <code>awsfirelens</code> log
     *         driver, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html"
     *         >Custom Log Routing</a> in the <i>Amazon Elastic Container
     *         Service Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         If you have a custom driver that is not listed, you can fork the
     *         Amazon ECS container agent project that is <a
     *         href="https://github.com/aws/amazon-ecs-agent">available on
     *         GitHub</a> and customize it to work with that driver. We
     *         encourage you to submit pull requests for changes that you would
     *         like to have included. However, we do not currently provide
     *         support for running modified copies of this software.
     *         </p>
     *         </note>
     * @see LogDriver
     */
    public String getLogDriver() {
        return logDriver;
    }

    /**
     * <p>
     * The log driver to use for the container. The valid values listed earlier
     * are log drivers that the Amazon ECS container agent can communicate with
     * by default.
     * </p>
     * <p>
     * For tasks using the Fargate launch type, the supported log drivers are
     * <code>awslogs</code>, <code>splunk</code>, and <code>awsfirelens</code>.
     * </p>
     * <p>
     * For tasks using the EC2 launch type, the supported log drivers are
     * <code>awslogs</code>, <code>fluentd</code>, <code>gelf</code>,
     * <code>json-file</code>, <code>journald</code>, <code>logentries</code>,
     * <code>syslog</code>, <code>splunk</code>, and <code>awsfirelens</code>.
     * </p>
     * <p>
     * For more information about using the <code>awslogs</code> log driver, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html"
     * >Using the awslogs Log Driver</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * For more information about using the <code>awsfirelens</code> log driver,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html"
     * >Custom Log Routing</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you have a custom driver that is not listed, you can fork the Amazon
     * ECS container agent project that is <a
     * href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a>
     * and customize it to work with that driver. We encourage you to submit
     * pull requests for changes that you would like to have included. However,
     * we do not currently provide support for running modified copies of this
     * software.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json-file, syslog, journald, gelf, fluentd,
     * awslogs, splunk, awsfirelens
     *
     * @param logDriver <p>
     *            The log driver to use for the container. The valid values
     *            listed earlier are log drivers that the Amazon ECS container
     *            agent can communicate with by default.
     *            </p>
     *            <p>
     *            For tasks using the Fargate launch type, the supported log
     *            drivers are <code>awslogs</code>, <code>splunk</code>, and
     *            <code>awsfirelens</code>.
     *            </p>
     *            <p>
     *            For tasks using the EC2 launch type, the supported log drivers
     *            are <code>awslogs</code>, <code>fluentd</code>,
     *            <code>gelf</code>, <code>json-file</code>,
     *            <code>journald</code>, <code>logentries</code>,
     *            <code>syslog</code>, <code>splunk</code>, and
     *            <code>awsfirelens</code>.
     *            </p>
     *            <p>
     *            For more information about using the <code>awslogs</code> log
     *            driver, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html"
     *            >Using the awslogs Log Driver</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            For more information about using the <code>awsfirelens</code>
     *            log driver, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html"
     *            >Custom Log Routing</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            If you have a custom driver that is not listed, you can fork
     *            the Amazon ECS container agent project that is <a
     *            href="https://github.com/aws/amazon-ecs-agent">available on
     *            GitHub</a> and customize it to work with that driver. We
     *            encourage you to submit pull requests for changes that you
     *            would like to have included. However, we do not currently
     *            provide support for running modified copies of this software.
     *            </p>
     *            </note>
     * @see LogDriver
     */
    public void setLogDriver(String logDriver) {
        this.logDriver = logDriver;
    }

    /**
     * <p>
     * The log driver to use for the container. The valid values listed earlier
     * are log drivers that the Amazon ECS container agent can communicate with
     * by default.
     * </p>
     * <p>
     * For tasks using the Fargate launch type, the supported log drivers are
     * <code>awslogs</code>, <code>splunk</code>, and <code>awsfirelens</code>.
     * </p>
     * <p>
     * For tasks using the EC2 launch type, the supported log drivers are
     * <code>awslogs</code>, <code>fluentd</code>, <code>gelf</code>,
     * <code>json-file</code>, <code>journald</code>, <code>logentries</code>,
     * <code>syslog</code>, <code>splunk</code>, and <code>awsfirelens</code>.
     * </p>
     * <p>
     * For more information about using the <code>awslogs</code> log driver, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html"
     * >Using the awslogs Log Driver</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * For more information about using the <code>awsfirelens</code> log driver,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html"
     * >Custom Log Routing</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you have a custom driver that is not listed, you can fork the Amazon
     * ECS container agent project that is <a
     * href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a>
     * and customize it to work with that driver. We encourage you to submit
     * pull requests for changes that you would like to have included. However,
     * we do not currently provide support for running modified copies of this
     * software.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json-file, syslog, journald, gelf, fluentd,
     * awslogs, splunk, awsfirelens
     *
     * @param logDriver <p>
     *            The log driver to use for the container. The valid values
     *            listed earlier are log drivers that the Amazon ECS container
     *            agent can communicate with by default.
     *            </p>
     *            <p>
     *            For tasks using the Fargate launch type, the supported log
     *            drivers are <code>awslogs</code>, <code>splunk</code>, and
     *            <code>awsfirelens</code>.
     *            </p>
     *            <p>
     *            For tasks using the EC2 launch type, the supported log drivers
     *            are <code>awslogs</code>, <code>fluentd</code>,
     *            <code>gelf</code>, <code>json-file</code>,
     *            <code>journald</code>, <code>logentries</code>,
     *            <code>syslog</code>, <code>splunk</code>, and
     *            <code>awsfirelens</code>.
     *            </p>
     *            <p>
     *            For more information about using the <code>awslogs</code> log
     *            driver, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html"
     *            >Using the awslogs Log Driver</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            For more information about using the <code>awsfirelens</code>
     *            log driver, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html"
     *            >Custom Log Routing</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            If you have a custom driver that is not listed, you can fork
     *            the Amazon ECS container agent project that is <a
     *            href="https://github.com/aws/amazon-ecs-agent">available on
     *            GitHub</a> and customize it to work with that driver. We
     *            encourage you to submit pull requests for changes that you
     *            would like to have included. However, we do not currently
     *            provide support for running modified copies of this software.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogDriver
     */
    public LogConfiguration withLogDriver(String logDriver) {
        this.logDriver = logDriver;
        return this;
    }

    /**
     * <p>
     * The log driver to use for the container. The valid values listed earlier
     * are log drivers that the Amazon ECS container agent can communicate with
     * by default.
     * </p>
     * <p>
     * For tasks using the Fargate launch type, the supported log drivers are
     * <code>awslogs</code>, <code>splunk</code>, and <code>awsfirelens</code>.
     * </p>
     * <p>
     * For tasks using the EC2 launch type, the supported log drivers are
     * <code>awslogs</code>, <code>fluentd</code>, <code>gelf</code>,
     * <code>json-file</code>, <code>journald</code>, <code>logentries</code>,
     * <code>syslog</code>, <code>splunk</code>, and <code>awsfirelens</code>.
     * </p>
     * <p>
     * For more information about using the <code>awslogs</code> log driver, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html"
     * >Using the awslogs Log Driver</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * For more information about using the <code>awsfirelens</code> log driver,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html"
     * >Custom Log Routing</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you have a custom driver that is not listed, you can fork the Amazon
     * ECS container agent project that is <a
     * href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a>
     * and customize it to work with that driver. We encourage you to submit
     * pull requests for changes that you would like to have included. However,
     * we do not currently provide support for running modified copies of this
     * software.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json-file, syslog, journald, gelf, fluentd,
     * awslogs, splunk, awsfirelens
     *
     * @param logDriver <p>
     *            The log driver to use for the container. The valid values
     *            listed earlier are log drivers that the Amazon ECS container
     *            agent can communicate with by default.
     *            </p>
     *            <p>
     *            For tasks using the Fargate launch type, the supported log
     *            drivers are <code>awslogs</code>, <code>splunk</code>, and
     *            <code>awsfirelens</code>.
     *            </p>
     *            <p>
     *            For tasks using the EC2 launch type, the supported log drivers
     *            are <code>awslogs</code>, <code>fluentd</code>,
     *            <code>gelf</code>, <code>json-file</code>,
     *            <code>journald</code>, <code>logentries</code>,
     *            <code>syslog</code>, <code>splunk</code>, and
     *            <code>awsfirelens</code>.
     *            </p>
     *            <p>
     *            For more information about using the <code>awslogs</code> log
     *            driver, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html"
     *            >Using the awslogs Log Driver</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            For more information about using the <code>awsfirelens</code>
     *            log driver, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html"
     *            >Custom Log Routing</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            If you have a custom driver that is not listed, you can fork
     *            the Amazon ECS container agent project that is <a
     *            href="https://github.com/aws/amazon-ecs-agent">available on
     *            GitHub</a> and customize it to work with that driver. We
     *            encourage you to submit pull requests for changes that you
     *            would like to have included. However, we do not currently
     *            provide support for running modified copies of this software.
     *            </p>
     *            </note>
     * @see LogDriver
     */
    public void setLogDriver(LogDriver logDriver) {
        this.logDriver = logDriver.toString();
    }

    /**
     * <p>
     * The log driver to use for the container. The valid values listed earlier
     * are log drivers that the Amazon ECS container agent can communicate with
     * by default.
     * </p>
     * <p>
     * For tasks using the Fargate launch type, the supported log drivers are
     * <code>awslogs</code>, <code>splunk</code>, and <code>awsfirelens</code>.
     * </p>
     * <p>
     * For tasks using the EC2 launch type, the supported log drivers are
     * <code>awslogs</code>, <code>fluentd</code>, <code>gelf</code>,
     * <code>json-file</code>, <code>journald</code>, <code>logentries</code>,
     * <code>syslog</code>, <code>splunk</code>, and <code>awsfirelens</code>.
     * </p>
     * <p>
     * For more information about using the <code>awslogs</code> log driver, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html"
     * >Using the awslogs Log Driver</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * For more information about using the <code>awsfirelens</code> log driver,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html"
     * >Custom Log Routing</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you have a custom driver that is not listed, you can fork the Amazon
     * ECS container agent project that is <a
     * href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a>
     * and customize it to work with that driver. We encourage you to submit
     * pull requests for changes that you would like to have included. However,
     * we do not currently provide support for running modified copies of this
     * software.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json-file, syslog, journald, gelf, fluentd,
     * awslogs, splunk, awsfirelens
     *
     * @param logDriver <p>
     *            The log driver to use for the container. The valid values
     *            listed earlier are log drivers that the Amazon ECS container
     *            agent can communicate with by default.
     *            </p>
     *            <p>
     *            For tasks using the Fargate launch type, the supported log
     *            drivers are <code>awslogs</code>, <code>splunk</code>, and
     *            <code>awsfirelens</code>.
     *            </p>
     *            <p>
     *            For tasks using the EC2 launch type, the supported log drivers
     *            are <code>awslogs</code>, <code>fluentd</code>,
     *            <code>gelf</code>, <code>json-file</code>,
     *            <code>journald</code>, <code>logentries</code>,
     *            <code>syslog</code>, <code>splunk</code>, and
     *            <code>awsfirelens</code>.
     *            </p>
     *            <p>
     *            For more information about using the <code>awslogs</code> log
     *            driver, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html"
     *            >Using the awslogs Log Driver</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            For more information about using the <code>awsfirelens</code>
     *            log driver, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html"
     *            >Custom Log Routing</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            If you have a custom driver that is not listed, you can fork
     *            the Amazon ECS container agent project that is <a
     *            href="https://github.com/aws/amazon-ecs-agent">available on
     *            GitHub</a> and customize it to work with that driver. We
     *            encourage you to submit pull requests for changes that you
     *            would like to have included. However, we do not currently
     *            provide support for running modified copies of this software.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogDriver
     */
    public LogConfiguration withLogDriver(LogDriver logDriver) {
        this.logDriver = logDriver.toString();
        return this;
    }

    /**
     * <p>
     * The configuration options to send to the log driver. This parameter
     * requires version 1.19 of the Docker Remote API or greater on your
     * container instance. To check the Docker Remote API version on your
     * container instance, log in to your container instance and run the
     * following command:
     * <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     *
     * @return <p>
     *         The configuration options to send to the log driver. This
     *         parameter requires version 1.19 of the Docker Remote API or
     *         greater on your container instance. To check the Docker Remote
     *         API version on your container instance, log in to your container
     *         instance and run the following command:
     *         <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     *         </p>
     */
    public java.util.Map<String, String> getOptions() {
        return options;
    }

    /**
     * <p>
     * The configuration options to send to the log driver. This parameter
     * requires version 1.19 of the Docker Remote API or greater on your
     * container instance. To check the Docker Remote API version on your
     * container instance, log in to your container instance and run the
     * following command:
     * <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     *
     * @param options <p>
     *            The configuration options to send to the log driver. This
     *            parameter requires version 1.19 of the Docker Remote API or
     *            greater on your container instance. To check the Docker Remote
     *            API version on your container instance, log in to your
     *            container instance and run the following command:
     *            <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     *            </p>
     */
    public void setOptions(java.util.Map<String, String> options) {
        this.options = options;
    }

    /**
     * <p>
     * The configuration options to send to the log driver. This parameter
     * requires version 1.19 of the Docker Remote API or greater on your
     * container instance. To check the Docker Remote API version on your
     * container instance, log in to your container instance and run the
     * following command:
     * <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param options <p>
     *            The configuration options to send to the log driver. This
     *            parameter requires version 1.19 of the Docker Remote API or
     *            greater on your container instance. To check the Docker Remote
     *            API version on your container instance, log in to your
     *            container instance and run the following command:
     *            <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogConfiguration withOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }

    /**
     * <p>
     * The configuration options to send to the log driver. This parameter
     * requires version 1.19 of the Docker Remote API or greater on your
     * container instance. To check the Docker Remote API version on your
     * container instance, log in to your container instance and run the
     * following command:
     * <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     * <p>
     * The method adds a new key-value pair into options parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into options.
     * @param value The corresponding value of the entry to be added into
     *            options.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogConfiguration addoptionsEntry(String key, String value) {
        if (null == this.options) {
            this.options = new java.util.HashMap<String, String>();
        }
        if (this.options.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.options.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into options.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public LogConfiguration clearoptionsEntries() {
        this.options = null;
        return this;
    }

    /**
     * <p>
     * The secrets to pass to the log configuration. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html"
     * >Specifying Sensitive Data</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The secrets to pass to the log configuration. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html"
     *         >Specifying Sensitive Data</a> in the <i>Amazon Elastic Container
     *         Service Developer Guide</i>.
     *         </p>
     */
    public java.util.List<Secret> getSecretOptions() {
        return secretOptions;
    }

    /**
     * <p>
     * The secrets to pass to the log configuration. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html"
     * >Specifying Sensitive Data</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     *
     * @param secretOptions <p>
     *            The secrets to pass to the log configuration. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html"
     *            >Specifying Sensitive Data</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     */
    public void setSecretOptions(java.util.Collection<Secret> secretOptions) {
        if (secretOptions == null) {
            this.secretOptions = null;
            return;
        }

        this.secretOptions = new java.util.ArrayList<Secret>(secretOptions);
    }

    /**
     * <p>
     * The secrets to pass to the log configuration. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html"
     * >Specifying Sensitive Data</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secretOptions <p>
     *            The secrets to pass to the log configuration. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html"
     *            >Specifying Sensitive Data</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogConfiguration withSecretOptions(Secret... secretOptions) {
        if (getSecretOptions() == null) {
            this.secretOptions = new java.util.ArrayList<Secret>(secretOptions.length);
        }
        for (Secret value : secretOptions) {
            this.secretOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The secrets to pass to the log configuration. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html"
     * >Specifying Sensitive Data</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secretOptions <p>
     *            The secrets to pass to the log configuration. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html"
     *            >Specifying Sensitive Data</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogConfiguration withSecretOptions(java.util.Collection<Secret> secretOptions) {
        setSecretOptions(secretOptions);
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
        if (getLogDriver() != null)
            sb.append("logDriver: " + getLogDriver() + ",");
        if (getOptions() != null)
            sb.append("options: " + getOptions() + ",");
        if (getSecretOptions() != null)
            sb.append("secretOptions: " + getSecretOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogDriver() == null) ? 0 : getLogDriver().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode
                + ((getSecretOptions() == null) ? 0 : getSecretOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogConfiguration == false)
            return false;
        LogConfiguration other = (LogConfiguration) obj;

        if (other.getLogDriver() == null ^ this.getLogDriver() == null)
            return false;
        if (other.getLogDriver() != null
                && other.getLogDriver().equals(this.getLogDriver()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getSecretOptions() == null ^ this.getSecretOptions() == null)
            return false;
        if (other.getSecretOptions() != null
                && other.getSecretOptions().equals(this.getSecretOptions()) == false)
            return false;
        return true;
    }
}

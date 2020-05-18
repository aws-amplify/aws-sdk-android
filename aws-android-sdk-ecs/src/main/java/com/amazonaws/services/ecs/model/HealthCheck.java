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
 * An object representing a container health check. Health check parameters that
 * are specified in a container definition override any Docker health checks
 * that exist in the container image (such as those specified in a parent image
 * or from the image's Dockerfile).
 * </p>
 * <p>
 * You can view the health status of both individual containers and a task with
 * the DescribeTasks API operation or when viewing the task details in the
 * console.
 * </p>
 * <p>
 * The following describes the possible <code>healthStatus</code> values for a
 * container:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>HEALTHY</code>-The container health check has passed successfully.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UNHEALTHY</code>-The container health check has failed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UNKNOWN</code>-The container health check is being evaluated or there
 * is no container health check defined.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The following describes the possible <code>healthStatus</code> values for a
 * task. The container health check status of nonessential containers do not
 * have an effect on the health status of a task.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>HEALTHY</code>-All essential containers within the task have passed
 * their health checks.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UNHEALTHY</code>-One or more essential containers have failed their
 * health check.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UNKNOWN</code>-The essential containers within the task are still
 * having their health checks evaluated or there are no container health checks
 * defined.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If a task is run manually, and not as part of a service, the task will
 * continue its lifecycle regardless of its health status. For tasks that are
 * part of a service, if the task reports as unhealthy then the task will be
 * stopped and the service scheduler will replace it.
 * </p>
 * <p>
 * The following are notes about container health check support:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Container health checks require version 1.17.0 or greater of the Amazon ECS
 * container agent. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html"
 * >Updating the Amazon ECS Container Agent</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Container health checks are supported for Fargate tasks if you are using
 * platform version 1.1.0 or greater. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
 * >AWS Fargate Platform Versions</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Container health checks are not supported for tasks that are part of a
 * service that is configured to use a Classic Load Balancer.
 * </p>
 * </li>
 * </ul>
 */
public class HealthCheck implements Serializable {
    /**
     * <p>
     * A string array representing the command that the container runs to
     * determine if it is healthy. The string array must start with
     * <code>CMD</code> to execute the command arguments directly, or
     * <code>CMD-SHELL</code> to run the command with the container's default
     * shell. For example:
     * </p>
     * <p>
     * <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     * </p>
     * <p>
     * An exit code of 0 indicates success, and non-zero exit code indicates
     * failure. For more information, see <code>HealthCheck</code> in the <a
     * href
     * ="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     * </p>
     */
    private java.util.List<String> command;

    /**
     * <p>
     * The time period in seconds between each health check execution. You may
     * specify between 5 and 300 seconds. The default value is 30 seconds.
     * </p>
     */
    private Integer interval;

    /**
     * <p>
     * The time period in seconds to wait for a health check to succeed before
     * it is considered a failure. You may specify between 2 and 60 seconds. The
     * default value is 5.
     * </p>
     */
    private Integer timeout;

    /**
     * <p>
     * The number of times to retry a failed health check before the container
     * is considered unhealthy. You may specify between 1 and 10 retries. The
     * default value is 3.
     * </p>
     */
    private Integer retries;

    /**
     * <p>
     * The optional grace period within which to provide containers time to
     * bootstrap before failed health checks count towards the maximum number of
     * retries. You may specify between 0 and 300 seconds. The
     * <code>startPeriod</code> is disabled by default.
     * </p>
     * <note>
     * <p>
     * If a health check succeeds within the <code>startPeriod</code>, then the
     * container is considered healthy and any subsequent failures count toward
     * the maximum number of retries.
     * </p>
     * </note>
     */
    private Integer startPeriod;

    /**
     * <p>
     * A string array representing the command that the container runs to
     * determine if it is healthy. The string array must start with
     * <code>CMD</code> to execute the command arguments directly, or
     * <code>CMD-SHELL</code> to run the command with the container's default
     * shell. For example:
     * </p>
     * <p>
     * <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     * </p>
     * <p>
     * An exit code of 0 indicates success, and non-zero exit code indicates
     * failure. For more information, see <code>HealthCheck</code> in the <a
     * href
     * ="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     * </p>
     *
     * @return <p>
     *         A string array representing the command that the container runs
     *         to determine if it is healthy. The string array must start with
     *         <code>CMD</code> to execute the command arguments directly, or
     *         <code>CMD-SHELL</code> to run the command with the container's
     *         default shell. For example:
     *         </p>
     *         <p>
     *         <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     *         </p>
     *         <p>
     *         An exit code of 0 indicates success, and non-zero exit code
     *         indicates failure. For more information, see
     *         <code>HealthCheck</code> in the <a href=
     *         "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     *         >Create a container</a> section of the <a
     *         href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *         API</a>.
     *         </p>
     */
    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * <p>
     * A string array representing the command that the container runs to
     * determine if it is healthy. The string array must start with
     * <code>CMD</code> to execute the command arguments directly, or
     * <code>CMD-SHELL</code> to run the command with the container's default
     * shell. For example:
     * </p>
     * <p>
     * <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     * </p>
     * <p>
     * An exit code of 0 indicates success, and non-zero exit code indicates
     * failure. For more information, see <code>HealthCheck</code> in the <a
     * href
     * ="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     * </p>
     *
     * @param command <p>
     *            A string array representing the command that the container
     *            runs to determine if it is healthy. The string array must
     *            start with <code>CMD</code> to execute the command arguments
     *            directly, or <code>CMD-SHELL</code> to run the command with
     *            the container's default shell. For example:
     *            </p>
     *            <p>
     *            <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     *            </p>
     *            <p>
     *            An exit code of 0 indicates success, and non-zero exit code
     *            indicates failure. For more information, see
     *            <code>HealthCheck</code> in the <a href=
     *            "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     *            >Create a container</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a>.
     *            </p>
     */
    public void setCommand(java.util.Collection<String> command) {
        if (command == null) {
            this.command = null;
            return;
        }

        this.command = new java.util.ArrayList<String>(command);
    }

    /**
     * <p>
     * A string array representing the command that the container runs to
     * determine if it is healthy. The string array must start with
     * <code>CMD</code> to execute the command arguments directly, or
     * <code>CMD-SHELL</code> to run the command with the container's default
     * shell. For example:
     * </p>
     * <p>
     * <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     * </p>
     * <p>
     * An exit code of 0 indicates success, and non-zero exit code indicates
     * failure. For more information, see <code>HealthCheck</code> in the <a
     * href
     * ="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param command <p>
     *            A string array representing the command that the container
     *            runs to determine if it is healthy. The string array must
     *            start with <code>CMD</code> to execute the command arguments
     *            directly, or <code>CMD-SHELL</code> to run the command with
     *            the container's default shell. For example:
     *            </p>
     *            <p>
     *            <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     *            </p>
     *            <p>
     *            An exit code of 0 indicates success, and non-zero exit code
     *            indicates failure. For more information, see
     *            <code>HealthCheck</code> in the <a href=
     *            "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     *            >Create a container</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheck withCommand(String... command) {
        if (getCommand() == null) {
            this.command = new java.util.ArrayList<String>(command.length);
        }
        for (String value : command) {
            this.command.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A string array representing the command that the container runs to
     * determine if it is healthy. The string array must start with
     * <code>CMD</code> to execute the command arguments directly, or
     * <code>CMD-SHELL</code> to run the command with the container's default
     * shell. For example:
     * </p>
     * <p>
     * <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     * </p>
     * <p>
     * An exit code of 0 indicates success, and non-zero exit code indicates
     * failure. For more information, see <code>HealthCheck</code> in the <a
     * href
     * ="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param command <p>
     *            A string array representing the command that the container
     *            runs to determine if it is healthy. The string array must
     *            start with <code>CMD</code> to execute the command arguments
     *            directly, or <code>CMD-SHELL</code> to run the command with
     *            the container's default shell. For example:
     *            </p>
     *            <p>
     *            <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     *            </p>
     *            <p>
     *            An exit code of 0 indicates success, and non-zero exit code
     *            indicates failure. For more information, see
     *            <code>HealthCheck</code> in the <a href=
     *            "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     *            >Create a container</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheck withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The time period in seconds between each health check execution. You may
     * specify between 5 and 300 seconds. The default value is 30 seconds.
     * </p>
     *
     * @return <p>
     *         The time period in seconds between each health check execution.
     *         You may specify between 5 and 300 seconds. The default value is
     *         30 seconds.
     *         </p>
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * <p>
     * The time period in seconds between each health check execution. You may
     * specify between 5 and 300 seconds. The default value is 30 seconds.
     * </p>
     *
     * @param interval <p>
     *            The time period in seconds between each health check
     *            execution. You may specify between 5 and 300 seconds. The
     *            default value is 30 seconds.
     *            </p>
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The time period in seconds between each health check execution. You may
     * specify between 5 and 300 seconds. The default value is 30 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param interval <p>
     *            The time period in seconds between each health check
     *            execution. You may specify between 5 and 300 seconds. The
     *            default value is 30 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheck withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * <p>
     * The time period in seconds to wait for a health check to succeed before
     * it is considered a failure. You may specify between 2 and 60 seconds. The
     * default value is 5.
     * </p>
     *
     * @return <p>
     *         The time period in seconds to wait for a health check to succeed
     *         before it is considered a failure. You may specify between 2 and
     *         60 seconds. The default value is 5.
     *         </p>
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * <p>
     * The time period in seconds to wait for a health check to succeed before
     * it is considered a failure. You may specify between 2 and 60 seconds. The
     * default value is 5.
     * </p>
     *
     * @param timeout <p>
     *            The time period in seconds to wait for a health check to
     *            succeed before it is considered a failure. You may specify
     *            between 2 and 60 seconds. The default value is 5.
     *            </p>
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The time period in seconds to wait for a health check to succeed before
     * it is considered a failure. You may specify between 2 and 60 seconds. The
     * default value is 5.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeout <p>
     *            The time period in seconds to wait for a health check to
     *            succeed before it is considered a failure. You may specify
     *            between 2 and 60 seconds. The default value is 5.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheck withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * <p>
     * The number of times to retry a failed health check before the container
     * is considered unhealthy. You may specify between 1 and 10 retries. The
     * default value is 3.
     * </p>
     *
     * @return <p>
     *         The number of times to retry a failed health check before the
     *         container is considered unhealthy. You may specify between 1 and
     *         10 retries. The default value is 3.
     *         </p>
     */
    public Integer getRetries() {
        return retries;
    }

    /**
     * <p>
     * The number of times to retry a failed health check before the container
     * is considered unhealthy. You may specify between 1 and 10 retries. The
     * default value is 3.
     * </p>
     *
     * @param retries <p>
     *            The number of times to retry a failed health check before the
     *            container is considered unhealthy. You may specify between 1
     *            and 10 retries. The default value is 3.
     *            </p>
     */
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    /**
     * <p>
     * The number of times to retry a failed health check before the container
     * is considered unhealthy. You may specify between 1 and 10 retries. The
     * default value is 3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retries <p>
     *            The number of times to retry a failed health check before the
     *            container is considered unhealthy. You may specify between 1
     *            and 10 retries. The default value is 3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheck withRetries(Integer retries) {
        this.retries = retries;
        return this;
    }

    /**
     * <p>
     * The optional grace period within which to provide containers time to
     * bootstrap before failed health checks count towards the maximum number of
     * retries. You may specify between 0 and 300 seconds. The
     * <code>startPeriod</code> is disabled by default.
     * </p>
     * <note>
     * <p>
     * If a health check succeeds within the <code>startPeriod</code>, then the
     * container is considered healthy and any subsequent failures count toward
     * the maximum number of retries.
     * </p>
     * </note>
     *
     * @return <p>
     *         The optional grace period within which to provide containers time
     *         to bootstrap before failed health checks count towards the
     *         maximum number of retries. You may specify between 0 and 300
     *         seconds. The <code>startPeriod</code> is disabled by default.
     *         </p>
     *         <note>
     *         <p>
     *         If a health check succeeds within the <code>startPeriod</code>,
     *         then the container is considered healthy and any subsequent
     *         failures count toward the maximum number of retries.
     *         </p>
     *         </note>
     */
    public Integer getStartPeriod() {
        return startPeriod;
    }

    /**
     * <p>
     * The optional grace period within which to provide containers time to
     * bootstrap before failed health checks count towards the maximum number of
     * retries. You may specify between 0 and 300 seconds. The
     * <code>startPeriod</code> is disabled by default.
     * </p>
     * <note>
     * <p>
     * If a health check succeeds within the <code>startPeriod</code>, then the
     * container is considered healthy and any subsequent failures count toward
     * the maximum number of retries.
     * </p>
     * </note>
     *
     * @param startPeriod <p>
     *            The optional grace period within which to provide containers
     *            time to bootstrap before failed health checks count towards
     *            the maximum number of retries. You may specify between 0 and
     *            300 seconds. The <code>startPeriod</code> is disabled by
     *            default.
     *            </p>
     *            <note>
     *            <p>
     *            If a health check succeeds within the <code>startPeriod</code>
     *            , then the container is considered healthy and any subsequent
     *            failures count toward the maximum number of retries.
     *            </p>
     *            </note>
     */
    public void setStartPeriod(Integer startPeriod) {
        this.startPeriod = startPeriod;
    }

    /**
     * <p>
     * The optional grace period within which to provide containers time to
     * bootstrap before failed health checks count towards the maximum number of
     * retries. You may specify between 0 and 300 seconds. The
     * <code>startPeriod</code> is disabled by default.
     * </p>
     * <note>
     * <p>
     * If a health check succeeds within the <code>startPeriod</code>, then the
     * container is considered healthy and any subsequent failures count toward
     * the maximum number of retries.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startPeriod <p>
     *            The optional grace period within which to provide containers
     *            time to bootstrap before failed health checks count towards
     *            the maximum number of retries. You may specify between 0 and
     *            300 seconds. The <code>startPeriod</code> is disabled by
     *            default.
     *            </p>
     *            <note>
     *            <p>
     *            If a health check succeeds within the <code>startPeriod</code>
     *            , then the container is considered healthy and any subsequent
     *            failures count toward the maximum number of retries.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheck withStartPeriod(Integer startPeriod) {
        this.startPeriod = startPeriod;
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
        if (getCommand() != null)
            sb.append("command: " + getCommand() + ",");
        if (getInterval() != null)
            sb.append("interval: " + getInterval() + ",");
        if (getTimeout() != null)
            sb.append("timeout: " + getTimeout() + ",");
        if (getRetries() != null)
            sb.append("retries: " + getRetries() + ",");
        if (getStartPeriod() != null)
            sb.append("startPeriod: " + getStartPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getRetries() == null) ? 0 : getRetries().hashCode());
        hashCode = prime * hashCode
                + ((getStartPeriod() == null) ? 0 : getStartPeriod().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthCheck == false)
            return false;
        HealthCheck other = (HealthCheck) obj;

        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getRetries() == null ^ this.getRetries() == null)
            return false;
        if (other.getRetries() != null && other.getRetries().equals(this.getRetries()) == false)
            return false;
        if (other.getStartPeriod() == null ^ this.getStartPeriod() == null)
            return false;
        if (other.getStartPeriod() != null
                && other.getStartPeriod().equals(this.getStartPeriod()) == false)
            return false;
        return true;
    }
}

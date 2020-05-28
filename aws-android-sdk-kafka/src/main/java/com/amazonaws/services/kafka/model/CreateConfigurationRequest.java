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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 <p>
 * Creates a new MSK configuration.
 * </p>
 */
public class CreateConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * 
     <p>
     * The description of the configuration.
     * </p>
     */
    private String description;

    /**
     * 
     <p>
     * The versions of Apache Kafka with which you can use this MSK
     * configuration.
     * </p>
     */
    private java.util.List<String> kafkaVersions;

    /**
     * 
     <p>
     * The name of the configuration.
     * </p>
     */
    private String name;

    /**
     * 
     <p>
     * Contents of the <filename>server.properties</filename> file. When using
     * the API, you must ensure that the contents of the file are base64
     * encoded. When using the AWS Management Console, the SDK, or the AWS CLI,
     * the contents of <filename>server.properties</filename> can be in
     * plaintext.
     * </p>
     */
    private java.nio.ByteBuffer serverProperties;

    /**
     * 
     <p>
     * The description of the configuration.
     * </p>
     * 
     * @return <p>
     *         The description of the configuration.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     <p>
     * The description of the configuration.
     * </p>
     * 
     * @param description <p>
     *            The description of the configuration.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     <p>
     * The description of the configuration.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the configuration.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     <p>
     * The versions of Apache Kafka with which you can use this MSK
     * configuration.
     * </p>
     * 
     * @return <p>
     *         The versions of Apache Kafka with which you can use this MSK
     *         configuration.
     *         </p>
     */
    public java.util.List<String> getKafkaVersions() {
        return kafkaVersions;
    }

    /**
     * 
     <p>
     * The versions of Apache Kafka with which you can use this MSK
     * configuration.
     * </p>
     * 
     * @param kafkaVersions <p>
     *            The versions of Apache Kafka with which you can use this MSK
     *            configuration.
     *            </p>
     */
    public void setKafkaVersions(java.util.Collection<String> kafkaVersions) {
        if (kafkaVersions == null) {
            this.kafkaVersions = null;
            return;
        }

        this.kafkaVersions = new java.util.ArrayList<String>(kafkaVersions);
    }

    /**
     * 
     <p>
     * The versions of Apache Kafka with which you can use this MSK
     * configuration.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kafkaVersions <p>
     *            The versions of Apache Kafka with which you can use this MSK
     *            configuration.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationRequest withKafkaVersions(String... kafkaVersions) {
        if (getKafkaVersions() == null) {
            this.kafkaVersions = new java.util.ArrayList<String>(kafkaVersions.length);
        }
        for (String value : kafkaVersions) {
            this.kafkaVersions.add(value);
        }
        return this;
    }

    /**
     * 
     <p>
     * The versions of Apache Kafka with which you can use this MSK
     * configuration.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kafkaVersions <p>
     *            The versions of Apache Kafka with which you can use this MSK
     *            configuration.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationRequest withKafkaVersions(java.util.Collection<String> kafkaVersions) {
        setKafkaVersions(kafkaVersions);
        return this;
    }

    /**
     * 
     <p>
     * The name of the configuration.
     * </p>
     * 
     * @return <p>
     *         The name of the configuration.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * 
     <p>
     * The name of the configuration.
     * </p>
     * 
     * @param name <p>
     *            The name of the configuration.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     <p>
     * The name of the configuration.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the configuration.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     <p>
     * Contents of the <filename>server.properties</filename> file. When using
     * the API, you must ensure that the contents of the file are base64
     * encoded. When using the AWS Management Console, the SDK, or the AWS CLI,
     * the contents of <filename>server.properties</filename> can be in
     * plaintext.
     * </p>
     * 
     * @return <p>
     *         Contents of the <filename>server.properties</filename> file. When
     *         using the API, you must ensure that the contents of the file are
     *         base64 encoded. When using the AWS Management Console, the SDK,
     *         or the AWS CLI, the contents of
     *         <filename>server.properties</filename> can be in plaintext.
     *         </p>
     */
    public java.nio.ByteBuffer getServerProperties() {
        return serverProperties;
    }

    /**
     * 
     <p>
     * Contents of the <filename>server.properties</filename> file. When using
     * the API, you must ensure that the contents of the file are base64
     * encoded. When using the AWS Management Console, the SDK, or the AWS CLI,
     * the contents of <filename>server.properties</filename> can be in
     * plaintext.
     * </p>
     * 
     * @param serverProperties <p>
     *            Contents of the <filename>server.properties</filename> file.
     *            When using the API, you must ensure that the contents of the
     *            file are base64 encoded. When using the AWS Management
     *            Console, the SDK, or the AWS CLI, the contents of
     *            <filename>server.properties</filename> can be in plaintext.
     *            </p>
     */
    public void setServerProperties(java.nio.ByteBuffer serverProperties) {
        this.serverProperties = serverProperties;
    }

    /**
     * 
     <p>
     * Contents of the <filename>server.properties</filename> file. When using
     * the API, you must ensure that the contents of the file are base64
     * encoded. When using the AWS Management Console, the SDK, or the AWS CLI,
     * the contents of <filename>server.properties</filename> can be in
     * plaintext.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverProperties <p>
     *            Contents of the <filename>server.properties</filename> file.
     *            When using the API, you must ensure that the contents of the
     *            file are base64 encoded. When using the AWS Management
     *            Console, the SDK, or the AWS CLI, the contents of
     *            <filename>server.properties</filename> can be in plaintext.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationRequest withServerProperties(java.nio.ByteBuffer serverProperties) {
        this.serverProperties = serverProperties;
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getKafkaVersions() != null)
            sb.append("KafkaVersions: " + getKafkaVersions() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getServerProperties() != null)
            sb.append("ServerProperties: " + getServerProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getKafkaVersions() == null) ? 0 : getKafkaVersions().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getServerProperties() == null) ? 0 : getServerProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConfigurationRequest == false)
            return false;
        CreateConfigurationRequest other = (CreateConfigurationRequest) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKafkaVersions() == null ^ this.getKafkaVersions() == null)
            return false;
        if (other.getKafkaVersions() != null
                && other.getKafkaVersions().equals(this.getKafkaVersions()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getServerProperties() == null ^ this.getServerProperties() == null)
            return false;
        if (other.getServerProperties() != null
                && other.getServerProperties().equals(this.getServerProperties()) == false)
            return false;
        return true;
    }
}

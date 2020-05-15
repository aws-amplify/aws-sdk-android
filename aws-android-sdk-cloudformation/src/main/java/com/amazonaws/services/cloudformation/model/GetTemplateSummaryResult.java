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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The output for the <a>GetTemplateSummary</a> action.
 * </p>
 */
public class GetTemplateSummaryResult implements Serializable {
    /**
     * <p>
     * A list of parameter declarations that describe various properties for
     * each parameter.
     * </p>
     */
    private java.util.List<ParameterDeclaration> parameters;

    /**
     * <p>
     * The value that is defined in the <code>Description</code> property of the
     * template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The capabilities found within the template. If your template contains IAM
     * resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM
     * value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those actions
     * return an InsufficientCapabilities error.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     */
    private java.util.List<String> capabilities;

    /**
     * <p>
     * The list of resources that generated the values in the
     * <code>Capabilities</code> response element.
     * </p>
     */
    private String capabilitiesReason;

    /**
     * <p>
     * A list of all the template resource types that are defined in the
     * template, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::Dynamo::Table</code>, and
     * <code>Custom::MyCustomInstance</code>.
     * </p>
     */
    private java.util.List<String> resourceTypes;

    /**
     * <p>
     * The AWS template format version, which identifies the capabilities of the
     * template.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The value that is defined for the <code>Metadata</code> property of the
     * template.
     * </p>
     */
    private String metadata;

    /**
     * <p>
     * A list of the transforms that are declared in the template.
     * </p>
     */
    private java.util.List<String> declaredTransforms;

    /**
     * <p>
     * A list of resource identifier summaries that describe the target
     * resources of an import operation and the properties you can provide
     * during the import to identify the target resources. For example,
     * <code>BucketName</code> is a possible identifier property for an
     * <code>AWS::S3::Bucket</code> resource.
     * </p>
     */
    private java.util.List<ResourceIdentifierSummary> resourceIdentifierSummaries;

    /**
     * <p>
     * A list of parameter declarations that describe various properties for
     * each parameter.
     * </p>
     *
     * @return <p>
     *         A list of parameter declarations that describe various properties
     *         for each parameter.
     *         </p>
     */
    public java.util.List<ParameterDeclaration> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A list of parameter declarations that describe various properties for
     * each parameter.
     * </p>
     *
     * @param parameters <p>
     *            A list of parameter declarations that describe various
     *            properties for each parameter.
     *            </p>
     */
    public void setParameters(java.util.Collection<ParameterDeclaration> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<ParameterDeclaration>(parameters);
    }

    /**
     * <p>
     * A list of parameter declarations that describe various properties for
     * each parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of parameter declarations that describe various
     *            properties for each parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateSummaryResult withParameters(ParameterDeclaration... parameters) {
        if (getParameters() == null) {
            this.parameters = new java.util.ArrayList<ParameterDeclaration>(parameters.length);
        }
        for (ParameterDeclaration value : parameters) {
            this.parameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of parameter declarations that describe various properties for
     * each parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of parameter declarations that describe various
     *            properties for each parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateSummaryResult withParameters(
            java.util.Collection<ParameterDeclaration> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The value that is defined in the <code>Description</code> property of the
     * template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The value that is defined in the <code>Description</code>
     *         property of the template.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The value that is defined in the <code>Description</code> property of the
     * template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The value that is defined in the <code>Description</code>
     *            property of the template.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The value that is defined in the <code>Description</code> property of the
     * template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The value that is defined in the <code>Description</code>
     *            property of the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateSummaryResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The capabilities found within the template. If your template contains IAM
     * resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM
     * value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those actions
     * return an InsufficientCapabilities error.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     *
     * @return <p>
     *         The capabilities found within the template. If your template
     *         contains IAM resources, you must specify the CAPABILITY_IAM or
     *         CAPABILITY_NAMED_IAM value for this parameter when you use the
     *         <a>CreateStack</a> or <a>UpdateStack</a> actions with your
     *         template; otherwise, those actions return an
     *         InsufficientCapabilities error.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *         >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     *         </p>
     */
    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * The capabilities found within the template. If your template contains IAM
     * resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM
     * value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those actions
     * return an InsufficientCapabilities error.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     *
     * @param capabilities <p>
     *            The capabilities found within the template. If your template
     *            contains IAM resources, you must specify the CAPABILITY_IAM or
     *            CAPABILITY_NAMED_IAM value for this parameter when you use the
     *            <a>CreateStack</a> or <a>UpdateStack</a> actions with your
     *            template; otherwise, those actions return an
     *            InsufficientCapabilities error.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *            >Acknowledging IAM Resources in AWS CloudFormation
     *            Templates</a>.
     *            </p>
     */
    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new java.util.ArrayList<String>(capabilities);
    }

    /**
     * <p>
     * The capabilities found within the template. If your template contains IAM
     * resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM
     * value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those actions
     * return an InsufficientCapabilities error.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            The capabilities found within the template. If your template
     *            contains IAM resources, you must specify the CAPABILITY_IAM or
     *            CAPABILITY_NAMED_IAM value for this parameter when you use the
     *            <a>CreateStack</a> or <a>UpdateStack</a> actions with your
     *            template; otherwise, those actions return an
     *            InsufficientCapabilities error.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *            >Acknowledging IAM Resources in AWS CloudFormation
     *            Templates</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateSummaryResult withCapabilities(String... capabilities) {
        if (getCapabilities() == null) {
            this.capabilities = new java.util.ArrayList<String>(capabilities.length);
        }
        for (String value : capabilities) {
            this.capabilities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The capabilities found within the template. If your template contains IAM
     * resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM
     * value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those actions
     * return an InsufficientCapabilities error.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            The capabilities found within the template. If your template
     *            contains IAM resources, you must specify the CAPABILITY_IAM or
     *            CAPABILITY_NAMED_IAM value for this parameter when you use the
     *            <a>CreateStack</a> or <a>UpdateStack</a> actions with your
     *            template; otherwise, those actions return an
     *            InsufficientCapabilities error.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *            >Acknowledging IAM Resources in AWS CloudFormation
     *            Templates</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateSummaryResult withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * The list of resources that generated the values in the
     * <code>Capabilities</code> response element.
     * </p>
     *
     * @return <p>
     *         The list of resources that generated the values in the
     *         <code>Capabilities</code> response element.
     *         </p>
     */
    public String getCapabilitiesReason() {
        return capabilitiesReason;
    }

    /**
     * <p>
     * The list of resources that generated the values in the
     * <code>Capabilities</code> response element.
     * </p>
     *
     * @param capabilitiesReason <p>
     *            The list of resources that generated the values in the
     *            <code>Capabilities</code> response element.
     *            </p>
     */
    public void setCapabilitiesReason(String capabilitiesReason) {
        this.capabilitiesReason = capabilitiesReason;
    }

    /**
     * <p>
     * The list of resources that generated the values in the
     * <code>Capabilities</code> response element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilitiesReason <p>
     *            The list of resources that generated the values in the
     *            <code>Capabilities</code> response element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateSummaryResult withCapabilitiesReason(String capabilitiesReason) {
        this.capabilitiesReason = capabilitiesReason;
        return this;
    }

    /**
     * <p>
     * A list of all the template resource types that are defined in the
     * template, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::Dynamo::Table</code>, and
     * <code>Custom::MyCustomInstance</code>.
     * </p>
     *
     * @return <p>
     *         A list of all the template resource types that are defined in the
     *         template, such as <code>AWS::EC2::Instance</code>,
     *         <code>AWS::Dynamo::Table</code>, and
     *         <code>Custom::MyCustomInstance</code>.
     *         </p>
     */
    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * A list of all the template resource types that are defined in the
     * template, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::Dynamo::Table</code>, and
     * <code>Custom::MyCustomInstance</code>.
     * </p>
     *
     * @param resourceTypes <p>
     *            A list of all the template resource types that are defined in
     *            the template, such as <code>AWS::EC2::Instance</code>,
     *            <code>AWS::Dynamo::Table</code>, and
     *            <code>Custom::MyCustomInstance</code>.
     *            </p>
     */
    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<String>(resourceTypes);
    }

    /**
     * <p>
     * A list of all the template resource types that are defined in the
     * template, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::Dynamo::Table</code>, and
     * <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypes <p>
     *            A list of all the template resource types that are defined in
     *            the template, such as <code>AWS::EC2::Instance</code>,
     *            <code>AWS::Dynamo::Table</code>, and
     *            <code>Custom::MyCustomInstance</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateSummaryResult withResourceTypes(String... resourceTypes) {
        if (getResourceTypes() == null) {
            this.resourceTypes = new java.util.ArrayList<String>(resourceTypes.length);
        }
        for (String value : resourceTypes) {
            this.resourceTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of all the template resource types that are defined in the
     * template, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::Dynamo::Table</code>, and
     * <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypes <p>
     *            A list of all the template resource types that are defined in
     *            the template, such as <code>AWS::EC2::Instance</code>,
     *            <code>AWS::Dynamo::Table</code>, and
     *            <code>Custom::MyCustomInstance</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateSummaryResult withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The AWS template format version, which identifies the capabilities of the
     * template.
     * </p>
     *
     * @return <p>
     *         The AWS template format version, which identifies the
     *         capabilities of the template.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The AWS template format version, which identifies the capabilities of the
     * template.
     * </p>
     *
     * @param version <p>
     *            The AWS template format version, which identifies the
     *            capabilities of the template.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The AWS template format version, which identifies the capabilities of the
     * template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The AWS template format version, which identifies the
     *            capabilities of the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateSummaryResult withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The value that is defined for the <code>Metadata</code> property of the
     * template.
     * </p>
     *
     * @return <p>
     *         The value that is defined for the <code>Metadata</code> property
     *         of the template.
     *         </p>
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The value that is defined for the <code>Metadata</code> property of the
     * template.
     * </p>
     *
     * @param metadata <p>
     *            The value that is defined for the <code>Metadata</code>
     *            property of the template.
     *            </p>
     */
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The value that is defined for the <code>Metadata</code> property of the
     * template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            The value that is defined for the <code>Metadata</code>
     *            property of the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateSummaryResult withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * <p>
     * A list of the transforms that are declared in the template.
     * </p>
     *
     * @return <p>
     *         A list of the transforms that are declared in the template.
     *         </p>
     */
    public java.util.List<String> getDeclaredTransforms() {
        return declaredTransforms;
    }

    /**
     * <p>
     * A list of the transforms that are declared in the template.
     * </p>
     *
     * @param declaredTransforms <p>
     *            A list of the transforms that are declared in the template.
     *            </p>
     */
    public void setDeclaredTransforms(java.util.Collection<String> declaredTransforms) {
        if (declaredTransforms == null) {
            this.declaredTransforms = null;
            return;
        }

        this.declaredTransforms = new java.util.ArrayList<String>(declaredTransforms);
    }

    /**
     * <p>
     * A list of the transforms that are declared in the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param declaredTransforms <p>
     *            A list of the transforms that are declared in the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateSummaryResult withDeclaredTransforms(String... declaredTransforms) {
        if (getDeclaredTransforms() == null) {
            this.declaredTransforms = new java.util.ArrayList<String>(declaredTransforms.length);
        }
        for (String value : declaredTransforms) {
            this.declaredTransforms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the transforms that are declared in the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param declaredTransforms <p>
     *            A list of the transforms that are declared in the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateSummaryResult withDeclaredTransforms(
            java.util.Collection<String> declaredTransforms) {
        setDeclaredTransforms(declaredTransforms);
        return this;
    }

    /**
     * <p>
     * A list of resource identifier summaries that describe the target
     * resources of an import operation and the properties you can provide
     * during the import to identify the target resources. For example,
     * <code>BucketName</code> is a possible identifier property for an
     * <code>AWS::S3::Bucket</code> resource.
     * </p>
     *
     * @return <p>
     *         A list of resource identifier summaries that describe the target
     *         resources of an import operation and the properties you can
     *         provide during the import to identify the target resources. For
     *         example, <code>BucketName</code> is a possible identifier
     *         property for an <code>AWS::S3::Bucket</code> resource.
     *         </p>
     */
    public java.util.List<ResourceIdentifierSummary> getResourceIdentifierSummaries() {
        return resourceIdentifierSummaries;
    }

    /**
     * <p>
     * A list of resource identifier summaries that describe the target
     * resources of an import operation and the properties you can provide
     * during the import to identify the target resources. For example,
     * <code>BucketName</code> is a possible identifier property for an
     * <code>AWS::S3::Bucket</code> resource.
     * </p>
     *
     * @param resourceIdentifierSummaries <p>
     *            A list of resource identifier summaries that describe the
     *            target resources of an import operation and the properties you
     *            can provide during the import to identify the target
     *            resources. For example, <code>BucketName</code> is a possible
     *            identifier property for an <code>AWS::S3::Bucket</code>
     *            resource.
     *            </p>
     */
    public void setResourceIdentifierSummaries(
            java.util.Collection<ResourceIdentifierSummary> resourceIdentifierSummaries) {
        if (resourceIdentifierSummaries == null) {
            this.resourceIdentifierSummaries = null;
            return;
        }

        this.resourceIdentifierSummaries = new java.util.ArrayList<ResourceIdentifierSummary>(
                resourceIdentifierSummaries);
    }

    /**
     * <p>
     * A list of resource identifier summaries that describe the target
     * resources of an import operation and the properties you can provide
     * during the import to identify the target resources. For example,
     * <code>BucketName</code> is a possible identifier property for an
     * <code>AWS::S3::Bucket</code> resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceIdentifierSummaries <p>
     *            A list of resource identifier summaries that describe the
     *            target resources of an import operation and the properties you
     *            can provide during the import to identify the target
     *            resources. For example, <code>BucketName</code> is a possible
     *            identifier property for an <code>AWS::S3::Bucket</code>
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateSummaryResult withResourceIdentifierSummaries(
            ResourceIdentifierSummary... resourceIdentifierSummaries) {
        if (getResourceIdentifierSummaries() == null) {
            this.resourceIdentifierSummaries = new java.util.ArrayList<ResourceIdentifierSummary>(
                    resourceIdentifierSummaries.length);
        }
        for (ResourceIdentifierSummary value : resourceIdentifierSummaries) {
            this.resourceIdentifierSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource identifier summaries that describe the target
     * resources of an import operation and the properties you can provide
     * during the import to identify the target resources. For example,
     * <code>BucketName</code> is a possible identifier property for an
     * <code>AWS::S3::Bucket</code> resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceIdentifierSummaries <p>
     *            A list of resource identifier summaries that describe the
     *            target resources of an import operation and the properties you
     *            can provide during the import to identify the target
     *            resources. For example, <code>BucketName</code> is a possible
     *            identifier property for an <code>AWS::S3::Bucket</code>
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateSummaryResult withResourceIdentifierSummaries(
            java.util.Collection<ResourceIdentifierSummary> resourceIdentifierSummaries) {
        setResourceIdentifierSummaries(resourceIdentifierSummaries);
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
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCapabilities() != null)
            sb.append("Capabilities: " + getCapabilities() + ",");
        if (getCapabilitiesReason() != null)
            sb.append("CapabilitiesReason: " + getCapabilitiesReason() + ",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: " + getResourceTypes() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getMetadata() != null)
            sb.append("Metadata: " + getMetadata() + ",");
        if (getDeclaredTransforms() != null)
            sb.append("DeclaredTransforms: " + getDeclaredTransforms() + ",");
        if (getResourceIdentifierSummaries() != null)
            sb.append("ResourceIdentifierSummaries: " + getResourceIdentifierSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode
                + ((getCapabilitiesReason() == null) ? 0 : getCapabilitiesReason().hashCode());
        hashCode = prime * hashCode
                + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getDeclaredTransforms() == null) ? 0 : getDeclaredTransforms().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceIdentifierSummaries() == null) ? 0
                        : getResourceIdentifierSummaries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTemplateSummaryResult == false)
            return false;
        GetTemplateSummaryResult other = (GetTemplateSummaryResult) obj;

        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null
                && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getCapabilitiesReason() == null ^ this.getCapabilitiesReason() == null)
            return false;
        if (other.getCapabilitiesReason() != null
                && other.getCapabilitiesReason().equals(this.getCapabilitiesReason()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null
                && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getDeclaredTransforms() == null ^ this.getDeclaredTransforms() == null)
            return false;
        if (other.getDeclaredTransforms() != null
                && other.getDeclaredTransforms().equals(this.getDeclaredTransforms()) == false)
            return false;
        if (other.getResourceIdentifierSummaries() == null
                ^ this.getResourceIdentifierSummaries() == null)
            return false;
        if (other.getResourceIdentifierSummaries() != null
                && other.getResourceIdentifierSummaries().equals(
                        this.getResourceIdentifierSummaries()) == false)
            return false;
        return true;
    }
}

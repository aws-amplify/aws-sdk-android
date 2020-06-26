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
 * For a resource with <code>Modify</code> as the action, the
 * <code>ResourceChange</code> structure describes the changes AWS
 * CloudFormation will make to that resource.
 * </p>
 */
public class ResourceChangeDetail implements Serializable {
    /**
     * <p>
     * A <code>ResourceTargetDefinition</code> structure that describes the
     * field that AWS CloudFormation will change and whether the resource will
     * be recreated.
     * </p>
     */
    private ResourceTargetDefinition target;

    /**
     * <p>
     * Indicates whether AWS CloudFormation can determine the target value, and
     * whether the target value will change before you execute a change set.
     * </p>
     * <p>
     * For <code>Static</code> evaluations, AWS CloudFormation can determine
     * that the target value will change, and its value. For example, if you
     * directly modify the <code>InstanceType</code> property of an EC2
     * instance, AWS CloudFormation knows that this property value will change,
     * and its value, so this is a <code>Static</code> evaluation.
     * </p>
     * <p>
     * For <code>Dynamic</code> evaluations, cannot determine the target value
     * because it depends on the result of an intrinsic function, such as a
     * <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic function, when the
     * stack is updated. For example, if your template includes a reference to a
     * resource that is conditionally recreated, the value of the reference (the
     * physical ID of the resource) might change, depending on if the resource
     * is recreated. If the resource is recreated, it will have a new physical
     * ID, so all references to that resource will also be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Static, Dynamic
     */
    private String evaluation;

    /**
     * <p>
     * The group to which the <code>CausingEntity</code> value belongs. There
     * are five entity groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceReference</code> entities are <code>Ref</code> intrinsic
     * functions that refer to resources in the template, such as
     * <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParameterReference</code> entities are <code>Ref</code> intrinsic
     * functions that get template parameter values, such as
     * <code>{ "Ref" : "MyPasswordParameter" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceAttribute</code> entities are <code>Fn::GetAtt</code>
     * intrinsic functions that get resource attribute values, such as
     * <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DirectModification</code> entities are changes that are made
     * directly to the template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Automatic</code> entities are
     * <code>AWS::CloudFormation::Stack</code> resource types, which are also
     * known as nested stacks. If you made no changes to the
     * <code>AWS::CloudFormation::Stack</code> resource, AWS CloudFormation sets
     * the <code>ChangeSource</code> to <code>Automatic</code> because the
     * nested stack's template might have changed. Changes to a nested stack's
     * template aren't visible to AWS CloudFormation until you run an update on
     * the parent stack.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceReference, ParameterReference,
     * ResourceAttribute, DirectModification, Automatic
     */
    private String changeSource;

    /**
     * <p>
     * The identity of the entity that triggered this change. This entity is a
     * member of the group that is specified by the <code>ChangeSource</code>
     * field. For example, if you modified the value of the
     * <code>KeyPairName</code> parameter, the <code>CausingEntity</code> is the
     * name of the parameter (<code>KeyPairName</code>).
     * </p>
     * <p>
     * If the <code>ChangeSource</code> value is <code>DirectModification</code>
     * , no value is given for <code>CausingEntity</code>.
     * </p>
     */
    private String causingEntity;

    /**
     * <p>
     * A <code>ResourceTargetDefinition</code> structure that describes the
     * field that AWS CloudFormation will change and whether the resource will
     * be recreated.
     * </p>
     *
     * @return <p>
     *         A <code>ResourceTargetDefinition</code> structure that describes
     *         the field that AWS CloudFormation will change and whether the
     *         resource will be recreated.
     *         </p>
     */
    public ResourceTargetDefinition getTarget() {
        return target;
    }

    /**
     * <p>
     * A <code>ResourceTargetDefinition</code> structure that describes the
     * field that AWS CloudFormation will change and whether the resource will
     * be recreated.
     * </p>
     *
     * @param target <p>
     *            A <code>ResourceTargetDefinition</code> structure that
     *            describes the field that AWS CloudFormation will change and
     *            whether the resource will be recreated.
     *            </p>
     */
    public void setTarget(ResourceTargetDefinition target) {
        this.target = target;
    }

    /**
     * <p>
     * A <code>ResourceTargetDefinition</code> structure that describes the
     * field that AWS CloudFormation will change and whether the resource will
     * be recreated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param target <p>
     *            A <code>ResourceTargetDefinition</code> structure that
     *            describes the field that AWS CloudFormation will change and
     *            whether the resource will be recreated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChangeDetail withTarget(ResourceTargetDefinition target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * Indicates whether AWS CloudFormation can determine the target value, and
     * whether the target value will change before you execute a change set.
     * </p>
     * <p>
     * For <code>Static</code> evaluations, AWS CloudFormation can determine
     * that the target value will change, and its value. For example, if you
     * directly modify the <code>InstanceType</code> property of an EC2
     * instance, AWS CloudFormation knows that this property value will change,
     * and its value, so this is a <code>Static</code> evaluation.
     * </p>
     * <p>
     * For <code>Dynamic</code> evaluations, cannot determine the target value
     * because it depends on the result of an intrinsic function, such as a
     * <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic function, when the
     * stack is updated. For example, if your template includes a reference to a
     * resource that is conditionally recreated, the value of the reference (the
     * physical ID of the resource) might change, depending on if the resource
     * is recreated. If the resource is recreated, it will have a new physical
     * ID, so all references to that resource will also be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Static, Dynamic
     *
     * @return <p>
     *         Indicates whether AWS CloudFormation can determine the target
     *         value, and whether the target value will change before you
     *         execute a change set.
     *         </p>
     *         <p>
     *         For <code>Static</code> evaluations, AWS CloudFormation can
     *         determine that the target value will change, and its value. For
     *         example, if you directly modify the <code>InstanceType</code>
     *         property of an EC2 instance, AWS CloudFormation knows that this
     *         property value will change, and its value, so this is a
     *         <code>Static</code> evaluation.
     *         </p>
     *         <p>
     *         For <code>Dynamic</code> evaluations, cannot determine the target
     *         value because it depends on the result of an intrinsic function,
     *         such as a <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic
     *         function, when the stack is updated. For example, if your
     *         template includes a reference to a resource that is conditionally
     *         recreated, the value of the reference (the physical ID of the
     *         resource) might change, depending on if the resource is
     *         recreated. If the resource is recreated, it will have a new
     *         physical ID, so all references to that resource will also be
     *         updated.
     *         </p>
     * @see EvaluationType
     */
    public String getEvaluation() {
        return evaluation;
    }

    /**
     * <p>
     * Indicates whether AWS CloudFormation can determine the target value, and
     * whether the target value will change before you execute a change set.
     * </p>
     * <p>
     * For <code>Static</code> evaluations, AWS CloudFormation can determine
     * that the target value will change, and its value. For example, if you
     * directly modify the <code>InstanceType</code> property of an EC2
     * instance, AWS CloudFormation knows that this property value will change,
     * and its value, so this is a <code>Static</code> evaluation.
     * </p>
     * <p>
     * For <code>Dynamic</code> evaluations, cannot determine the target value
     * because it depends on the result of an intrinsic function, such as a
     * <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic function, when the
     * stack is updated. For example, if your template includes a reference to a
     * resource that is conditionally recreated, the value of the reference (the
     * physical ID of the resource) might change, depending on if the resource
     * is recreated. If the resource is recreated, it will have a new physical
     * ID, so all references to that resource will also be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Static, Dynamic
     *
     * @param evaluation <p>
     *            Indicates whether AWS CloudFormation can determine the target
     *            value, and whether the target value will change before you
     *            execute a change set.
     *            </p>
     *            <p>
     *            For <code>Static</code> evaluations, AWS CloudFormation can
     *            determine that the target value will change, and its value.
     *            For example, if you directly modify the
     *            <code>InstanceType</code> property of an EC2 instance, AWS
     *            CloudFormation knows that this property value will change, and
     *            its value, so this is a <code>Static</code> evaluation.
     *            </p>
     *            <p>
     *            For <code>Dynamic</code> evaluations, cannot determine the
     *            target value because it depends on the result of an intrinsic
     *            function, such as a <code>Ref</code> or
     *            <code>Fn::GetAtt</code> intrinsic function, when the stack is
     *            updated. For example, if your template includes a reference to
     *            a resource that is conditionally recreated, the value of the
     *            reference (the physical ID of the resource) might change,
     *            depending on if the resource is recreated. If the resource is
     *            recreated, it will have a new physical ID, so all references
     *            to that resource will also be updated.
     *            </p>
     * @see EvaluationType
     */
    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    /**
     * <p>
     * Indicates whether AWS CloudFormation can determine the target value, and
     * whether the target value will change before you execute a change set.
     * </p>
     * <p>
     * For <code>Static</code> evaluations, AWS CloudFormation can determine
     * that the target value will change, and its value. For example, if you
     * directly modify the <code>InstanceType</code> property of an EC2
     * instance, AWS CloudFormation knows that this property value will change,
     * and its value, so this is a <code>Static</code> evaluation.
     * </p>
     * <p>
     * For <code>Dynamic</code> evaluations, cannot determine the target value
     * because it depends on the result of an intrinsic function, such as a
     * <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic function, when the
     * stack is updated. For example, if your template includes a reference to a
     * resource that is conditionally recreated, the value of the reference (the
     * physical ID of the resource) might change, depending on if the resource
     * is recreated. If the resource is recreated, it will have a new physical
     * ID, so all references to that resource will also be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Static, Dynamic
     *
     * @param evaluation <p>
     *            Indicates whether AWS CloudFormation can determine the target
     *            value, and whether the target value will change before you
     *            execute a change set.
     *            </p>
     *            <p>
     *            For <code>Static</code> evaluations, AWS CloudFormation can
     *            determine that the target value will change, and its value.
     *            For example, if you directly modify the
     *            <code>InstanceType</code> property of an EC2 instance, AWS
     *            CloudFormation knows that this property value will change, and
     *            its value, so this is a <code>Static</code> evaluation.
     *            </p>
     *            <p>
     *            For <code>Dynamic</code> evaluations, cannot determine the
     *            target value because it depends on the result of an intrinsic
     *            function, such as a <code>Ref</code> or
     *            <code>Fn::GetAtt</code> intrinsic function, when the stack is
     *            updated. For example, if your template includes a reference to
     *            a resource that is conditionally recreated, the value of the
     *            reference (the physical ID of the resource) might change,
     *            depending on if the resource is recreated. If the resource is
     *            recreated, it will have a new physical ID, so all references
     *            to that resource will also be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationType
     */
    public ResourceChangeDetail withEvaluation(String evaluation) {
        this.evaluation = evaluation;
        return this;
    }

    /**
     * <p>
     * Indicates whether AWS CloudFormation can determine the target value, and
     * whether the target value will change before you execute a change set.
     * </p>
     * <p>
     * For <code>Static</code> evaluations, AWS CloudFormation can determine
     * that the target value will change, and its value. For example, if you
     * directly modify the <code>InstanceType</code> property of an EC2
     * instance, AWS CloudFormation knows that this property value will change,
     * and its value, so this is a <code>Static</code> evaluation.
     * </p>
     * <p>
     * For <code>Dynamic</code> evaluations, cannot determine the target value
     * because it depends on the result of an intrinsic function, such as a
     * <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic function, when the
     * stack is updated. For example, if your template includes a reference to a
     * resource that is conditionally recreated, the value of the reference (the
     * physical ID of the resource) might change, depending on if the resource
     * is recreated. If the resource is recreated, it will have a new physical
     * ID, so all references to that resource will also be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Static, Dynamic
     *
     * @param evaluation <p>
     *            Indicates whether AWS CloudFormation can determine the target
     *            value, and whether the target value will change before you
     *            execute a change set.
     *            </p>
     *            <p>
     *            For <code>Static</code> evaluations, AWS CloudFormation can
     *            determine that the target value will change, and its value.
     *            For example, if you directly modify the
     *            <code>InstanceType</code> property of an EC2 instance, AWS
     *            CloudFormation knows that this property value will change, and
     *            its value, so this is a <code>Static</code> evaluation.
     *            </p>
     *            <p>
     *            For <code>Dynamic</code> evaluations, cannot determine the
     *            target value because it depends on the result of an intrinsic
     *            function, such as a <code>Ref</code> or
     *            <code>Fn::GetAtt</code> intrinsic function, when the stack is
     *            updated. For example, if your template includes a reference to
     *            a resource that is conditionally recreated, the value of the
     *            reference (the physical ID of the resource) might change,
     *            depending on if the resource is recreated. If the resource is
     *            recreated, it will have a new physical ID, so all references
     *            to that resource will also be updated.
     *            </p>
     * @see EvaluationType
     */
    public void setEvaluation(EvaluationType evaluation) {
        this.evaluation = evaluation.toString();
    }

    /**
     * <p>
     * Indicates whether AWS CloudFormation can determine the target value, and
     * whether the target value will change before you execute a change set.
     * </p>
     * <p>
     * For <code>Static</code> evaluations, AWS CloudFormation can determine
     * that the target value will change, and its value. For example, if you
     * directly modify the <code>InstanceType</code> property of an EC2
     * instance, AWS CloudFormation knows that this property value will change,
     * and its value, so this is a <code>Static</code> evaluation.
     * </p>
     * <p>
     * For <code>Dynamic</code> evaluations, cannot determine the target value
     * because it depends on the result of an intrinsic function, such as a
     * <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic function, when the
     * stack is updated. For example, if your template includes a reference to a
     * resource that is conditionally recreated, the value of the reference (the
     * physical ID of the resource) might change, depending on if the resource
     * is recreated. If the resource is recreated, it will have a new physical
     * ID, so all references to that resource will also be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Static, Dynamic
     *
     * @param evaluation <p>
     *            Indicates whether AWS CloudFormation can determine the target
     *            value, and whether the target value will change before you
     *            execute a change set.
     *            </p>
     *            <p>
     *            For <code>Static</code> evaluations, AWS CloudFormation can
     *            determine that the target value will change, and its value.
     *            For example, if you directly modify the
     *            <code>InstanceType</code> property of an EC2 instance, AWS
     *            CloudFormation knows that this property value will change, and
     *            its value, so this is a <code>Static</code> evaluation.
     *            </p>
     *            <p>
     *            For <code>Dynamic</code> evaluations, cannot determine the
     *            target value because it depends on the result of an intrinsic
     *            function, such as a <code>Ref</code> or
     *            <code>Fn::GetAtt</code> intrinsic function, when the stack is
     *            updated. For example, if your template includes a reference to
     *            a resource that is conditionally recreated, the value of the
     *            reference (the physical ID of the resource) might change,
     *            depending on if the resource is recreated. If the resource is
     *            recreated, it will have a new physical ID, so all references
     *            to that resource will also be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationType
     */
    public ResourceChangeDetail withEvaluation(EvaluationType evaluation) {
        this.evaluation = evaluation.toString();
        return this;
    }

    /**
     * <p>
     * The group to which the <code>CausingEntity</code> value belongs. There
     * are five entity groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceReference</code> entities are <code>Ref</code> intrinsic
     * functions that refer to resources in the template, such as
     * <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParameterReference</code> entities are <code>Ref</code> intrinsic
     * functions that get template parameter values, such as
     * <code>{ "Ref" : "MyPasswordParameter" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceAttribute</code> entities are <code>Fn::GetAtt</code>
     * intrinsic functions that get resource attribute values, such as
     * <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DirectModification</code> entities are changes that are made
     * directly to the template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Automatic</code> entities are
     * <code>AWS::CloudFormation::Stack</code> resource types, which are also
     * known as nested stacks. If you made no changes to the
     * <code>AWS::CloudFormation::Stack</code> resource, AWS CloudFormation sets
     * the <code>ChangeSource</code> to <code>Automatic</code> because the
     * nested stack's template might have changed. Changes to a nested stack's
     * template aren't visible to AWS CloudFormation until you run an update on
     * the parent stack.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceReference, ParameterReference,
     * ResourceAttribute, DirectModification, Automatic
     *
     * @return <p>
     *         The group to which the <code>CausingEntity</code> value belongs.
     *         There are five entity groups:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ResourceReference</code> entities are <code>Ref</code>
     *         intrinsic functions that refer to resources in the template, such
     *         as <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ParameterReference</code> entities are <code>Ref</code>
     *         intrinsic functions that get template parameter values, such as
     *         <code>{ "Ref" : "MyPasswordParameter" }</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ResourceAttribute</code> entities are
     *         <code>Fn::GetAtt</code> intrinsic functions that get resource
     *         attribute values, such as
     *         <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DirectModification</code> entities are changes that are
     *         made directly to the template.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Automatic</code> entities are
     *         <code>AWS::CloudFormation::Stack</code> resource types, which are
     *         also known as nested stacks. If you made no changes to the
     *         <code>AWS::CloudFormation::Stack</code> resource, AWS
     *         CloudFormation sets the <code>ChangeSource</code> to
     *         <code>Automatic</code> because the nested stack's template might
     *         have changed. Changes to a nested stack's template aren't visible
     *         to AWS CloudFormation until you run an update on the parent
     *         stack.
     *         </p>
     *         </li>
     *         </ul>
     * @see ChangeSource
     */
    public String getChangeSource() {
        return changeSource;
    }

    /**
     * <p>
     * The group to which the <code>CausingEntity</code> value belongs. There
     * are five entity groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceReference</code> entities are <code>Ref</code> intrinsic
     * functions that refer to resources in the template, such as
     * <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParameterReference</code> entities are <code>Ref</code> intrinsic
     * functions that get template parameter values, such as
     * <code>{ "Ref" : "MyPasswordParameter" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceAttribute</code> entities are <code>Fn::GetAtt</code>
     * intrinsic functions that get resource attribute values, such as
     * <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DirectModification</code> entities are changes that are made
     * directly to the template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Automatic</code> entities are
     * <code>AWS::CloudFormation::Stack</code> resource types, which are also
     * known as nested stacks. If you made no changes to the
     * <code>AWS::CloudFormation::Stack</code> resource, AWS CloudFormation sets
     * the <code>ChangeSource</code> to <code>Automatic</code> because the
     * nested stack's template might have changed. Changes to a nested stack's
     * template aren't visible to AWS CloudFormation until you run an update on
     * the parent stack.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceReference, ParameterReference,
     * ResourceAttribute, DirectModification, Automatic
     *
     * @param changeSource <p>
     *            The group to which the <code>CausingEntity</code> value
     *            belongs. There are five entity groups:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ResourceReference</code> entities are <code>Ref</code>
     *            intrinsic functions that refer to resources in the template,
     *            such as <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ParameterReference</code> entities are <code>Ref</code>
     *            intrinsic functions that get template parameter values, such
     *            as <code>{ "Ref" : "MyPasswordParameter" }</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ResourceAttribute</code> entities are
     *            <code>Fn::GetAtt</code> intrinsic functions that get resource
     *            attribute values, such as
     *            <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DirectModification</code> entities are changes that are
     *            made directly to the template.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Automatic</code> entities are
     *            <code>AWS::CloudFormation::Stack</code> resource types, which
     *            are also known as nested stacks. If you made no changes to the
     *            <code>AWS::CloudFormation::Stack</code> resource, AWS
     *            CloudFormation sets the <code>ChangeSource</code> to
     *            <code>Automatic</code> because the nested stack's template
     *            might have changed. Changes to a nested stack's template
     *            aren't visible to AWS CloudFormation until you run an update
     *            on the parent stack.
     *            </p>
     *            </li>
     *            </ul>
     * @see ChangeSource
     */
    public void setChangeSource(String changeSource) {
        this.changeSource = changeSource;
    }

    /**
     * <p>
     * The group to which the <code>CausingEntity</code> value belongs. There
     * are five entity groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceReference</code> entities are <code>Ref</code> intrinsic
     * functions that refer to resources in the template, such as
     * <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParameterReference</code> entities are <code>Ref</code> intrinsic
     * functions that get template parameter values, such as
     * <code>{ "Ref" : "MyPasswordParameter" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceAttribute</code> entities are <code>Fn::GetAtt</code>
     * intrinsic functions that get resource attribute values, such as
     * <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DirectModification</code> entities are changes that are made
     * directly to the template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Automatic</code> entities are
     * <code>AWS::CloudFormation::Stack</code> resource types, which are also
     * known as nested stacks. If you made no changes to the
     * <code>AWS::CloudFormation::Stack</code> resource, AWS CloudFormation sets
     * the <code>ChangeSource</code> to <code>Automatic</code> because the
     * nested stack's template might have changed. Changes to a nested stack's
     * template aren't visible to AWS CloudFormation until you run an update on
     * the parent stack.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceReference, ParameterReference,
     * ResourceAttribute, DirectModification, Automatic
     *
     * @param changeSource <p>
     *            The group to which the <code>CausingEntity</code> value
     *            belongs. There are five entity groups:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ResourceReference</code> entities are <code>Ref</code>
     *            intrinsic functions that refer to resources in the template,
     *            such as <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ParameterReference</code> entities are <code>Ref</code>
     *            intrinsic functions that get template parameter values, such
     *            as <code>{ "Ref" : "MyPasswordParameter" }</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ResourceAttribute</code> entities are
     *            <code>Fn::GetAtt</code> intrinsic functions that get resource
     *            attribute values, such as
     *            <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DirectModification</code> entities are changes that are
     *            made directly to the template.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Automatic</code> entities are
     *            <code>AWS::CloudFormation::Stack</code> resource types, which
     *            are also known as nested stacks. If you made no changes to the
     *            <code>AWS::CloudFormation::Stack</code> resource, AWS
     *            CloudFormation sets the <code>ChangeSource</code> to
     *            <code>Automatic</code> because the nested stack's template
     *            might have changed. Changes to a nested stack's template
     *            aren't visible to AWS CloudFormation until you run an update
     *            on the parent stack.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeSource
     */
    public ResourceChangeDetail withChangeSource(String changeSource) {
        this.changeSource = changeSource;
        return this;
    }

    /**
     * <p>
     * The group to which the <code>CausingEntity</code> value belongs. There
     * are five entity groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceReference</code> entities are <code>Ref</code> intrinsic
     * functions that refer to resources in the template, such as
     * <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParameterReference</code> entities are <code>Ref</code> intrinsic
     * functions that get template parameter values, such as
     * <code>{ "Ref" : "MyPasswordParameter" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceAttribute</code> entities are <code>Fn::GetAtt</code>
     * intrinsic functions that get resource attribute values, such as
     * <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DirectModification</code> entities are changes that are made
     * directly to the template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Automatic</code> entities are
     * <code>AWS::CloudFormation::Stack</code> resource types, which are also
     * known as nested stacks. If you made no changes to the
     * <code>AWS::CloudFormation::Stack</code> resource, AWS CloudFormation sets
     * the <code>ChangeSource</code> to <code>Automatic</code> because the
     * nested stack's template might have changed. Changes to a nested stack's
     * template aren't visible to AWS CloudFormation until you run an update on
     * the parent stack.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceReference, ParameterReference,
     * ResourceAttribute, DirectModification, Automatic
     *
     * @param changeSource <p>
     *            The group to which the <code>CausingEntity</code> value
     *            belongs. There are five entity groups:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ResourceReference</code> entities are <code>Ref</code>
     *            intrinsic functions that refer to resources in the template,
     *            such as <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ParameterReference</code> entities are <code>Ref</code>
     *            intrinsic functions that get template parameter values, such
     *            as <code>{ "Ref" : "MyPasswordParameter" }</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ResourceAttribute</code> entities are
     *            <code>Fn::GetAtt</code> intrinsic functions that get resource
     *            attribute values, such as
     *            <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DirectModification</code> entities are changes that are
     *            made directly to the template.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Automatic</code> entities are
     *            <code>AWS::CloudFormation::Stack</code> resource types, which
     *            are also known as nested stacks. If you made no changes to the
     *            <code>AWS::CloudFormation::Stack</code> resource, AWS
     *            CloudFormation sets the <code>ChangeSource</code> to
     *            <code>Automatic</code> because the nested stack's template
     *            might have changed. Changes to a nested stack's template
     *            aren't visible to AWS CloudFormation until you run an update
     *            on the parent stack.
     *            </p>
     *            </li>
     *            </ul>
     * @see ChangeSource
     */
    public void setChangeSource(ChangeSource changeSource) {
        this.changeSource = changeSource.toString();
    }

    /**
     * <p>
     * The group to which the <code>CausingEntity</code> value belongs. There
     * are five entity groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceReference</code> entities are <code>Ref</code> intrinsic
     * functions that refer to resources in the template, such as
     * <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParameterReference</code> entities are <code>Ref</code> intrinsic
     * functions that get template parameter values, such as
     * <code>{ "Ref" : "MyPasswordParameter" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceAttribute</code> entities are <code>Fn::GetAtt</code>
     * intrinsic functions that get resource attribute values, such as
     * <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DirectModification</code> entities are changes that are made
     * directly to the template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Automatic</code> entities are
     * <code>AWS::CloudFormation::Stack</code> resource types, which are also
     * known as nested stacks. If you made no changes to the
     * <code>AWS::CloudFormation::Stack</code> resource, AWS CloudFormation sets
     * the <code>ChangeSource</code> to <code>Automatic</code> because the
     * nested stack's template might have changed. Changes to a nested stack's
     * template aren't visible to AWS CloudFormation until you run an update on
     * the parent stack.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceReference, ParameterReference,
     * ResourceAttribute, DirectModification, Automatic
     *
     * @param changeSource <p>
     *            The group to which the <code>CausingEntity</code> value
     *            belongs. There are five entity groups:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ResourceReference</code> entities are <code>Ref</code>
     *            intrinsic functions that refer to resources in the template,
     *            such as <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ParameterReference</code> entities are <code>Ref</code>
     *            intrinsic functions that get template parameter values, such
     *            as <code>{ "Ref" : "MyPasswordParameter" }</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ResourceAttribute</code> entities are
     *            <code>Fn::GetAtt</code> intrinsic functions that get resource
     *            attribute values, such as
     *            <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DirectModification</code> entities are changes that are
     *            made directly to the template.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Automatic</code> entities are
     *            <code>AWS::CloudFormation::Stack</code> resource types, which
     *            are also known as nested stacks. If you made no changes to the
     *            <code>AWS::CloudFormation::Stack</code> resource, AWS
     *            CloudFormation sets the <code>ChangeSource</code> to
     *            <code>Automatic</code> because the nested stack's template
     *            might have changed. Changes to a nested stack's template
     *            aren't visible to AWS CloudFormation until you run an update
     *            on the parent stack.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeSource
     */
    public ResourceChangeDetail withChangeSource(ChangeSource changeSource) {
        this.changeSource = changeSource.toString();
        return this;
    }

    /**
     * <p>
     * The identity of the entity that triggered this change. This entity is a
     * member of the group that is specified by the <code>ChangeSource</code>
     * field. For example, if you modified the value of the
     * <code>KeyPairName</code> parameter, the <code>CausingEntity</code> is the
     * name of the parameter (<code>KeyPairName</code>).
     * </p>
     * <p>
     * If the <code>ChangeSource</code> value is <code>DirectModification</code>
     * , no value is given for <code>CausingEntity</code>.
     * </p>
     *
     * @return <p>
     *         The identity of the entity that triggered this change. This
     *         entity is a member of the group that is specified by the
     *         <code>ChangeSource</code> field. For example, if you modified the
     *         value of the <code>KeyPairName</code> parameter, the
     *         <code>CausingEntity</code> is the name of the parameter (
     *         <code>KeyPairName</code>).
     *         </p>
     *         <p>
     *         If the <code>ChangeSource</code> value is
     *         <code>DirectModification</code>, no value is given for
     *         <code>CausingEntity</code>.
     *         </p>
     */
    public String getCausingEntity() {
        return causingEntity;
    }

    /**
     * <p>
     * The identity of the entity that triggered this change. This entity is a
     * member of the group that is specified by the <code>ChangeSource</code>
     * field. For example, if you modified the value of the
     * <code>KeyPairName</code> parameter, the <code>CausingEntity</code> is the
     * name of the parameter (<code>KeyPairName</code>).
     * </p>
     * <p>
     * If the <code>ChangeSource</code> value is <code>DirectModification</code>
     * , no value is given for <code>CausingEntity</code>.
     * </p>
     *
     * @param causingEntity <p>
     *            The identity of the entity that triggered this change. This
     *            entity is a member of the group that is specified by the
     *            <code>ChangeSource</code> field. For example, if you modified
     *            the value of the <code>KeyPairName</code> parameter, the
     *            <code>CausingEntity</code> is the name of the parameter (
     *            <code>KeyPairName</code>).
     *            </p>
     *            <p>
     *            If the <code>ChangeSource</code> value is
     *            <code>DirectModification</code>, no value is given for
     *            <code>CausingEntity</code>.
     *            </p>
     */
    public void setCausingEntity(String causingEntity) {
        this.causingEntity = causingEntity;
    }

    /**
     * <p>
     * The identity of the entity that triggered this change. This entity is a
     * member of the group that is specified by the <code>ChangeSource</code>
     * field. For example, if you modified the value of the
     * <code>KeyPairName</code> parameter, the <code>CausingEntity</code> is the
     * name of the parameter (<code>KeyPairName</code>).
     * </p>
     * <p>
     * If the <code>ChangeSource</code> value is <code>DirectModification</code>
     * , no value is given for <code>CausingEntity</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param causingEntity <p>
     *            The identity of the entity that triggered this change. This
     *            entity is a member of the group that is specified by the
     *            <code>ChangeSource</code> field. For example, if you modified
     *            the value of the <code>KeyPairName</code> parameter, the
     *            <code>CausingEntity</code> is the name of the parameter (
     *            <code>KeyPairName</code>).
     *            </p>
     *            <p>
     *            If the <code>ChangeSource</code> value is
     *            <code>DirectModification</code>, no value is given for
     *            <code>CausingEntity</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChangeDetail withCausingEntity(String causingEntity) {
        this.causingEntity = causingEntity;
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
        if (getTarget() != null)
            sb.append("Target: " + getTarget() + ",");
        if (getEvaluation() != null)
            sb.append("Evaluation: " + getEvaluation() + ",");
        if (getChangeSource() != null)
            sb.append("ChangeSource: " + getChangeSource() + ",");
        if (getCausingEntity() != null)
            sb.append("CausingEntity: " + getCausingEntity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getEvaluation() == null) ? 0 : getEvaluation().hashCode());
        hashCode = prime * hashCode
                + ((getChangeSource() == null) ? 0 : getChangeSource().hashCode());
        hashCode = prime * hashCode
                + ((getCausingEntity() == null) ? 0 : getCausingEntity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceChangeDetail == false)
            return false;
        ResourceChangeDetail other = (ResourceChangeDetail) obj;

        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getEvaluation() == null ^ this.getEvaluation() == null)
            return false;
        if (other.getEvaluation() != null
                && other.getEvaluation().equals(this.getEvaluation()) == false)
            return false;
        if (other.getChangeSource() == null ^ this.getChangeSource() == null)
            return false;
        if (other.getChangeSource() != null
                && other.getChangeSource().equals(this.getChangeSource()) == false)
            return false;
        if (other.getCausingEntity() == null ^ this.getCausingEntity() == null)
            return false;
        if (other.getCausingEntity() != null
                && other.getCausingEntity().equals(this.getCausingEntity()) == false)
            return false;
        return true;
    }
}

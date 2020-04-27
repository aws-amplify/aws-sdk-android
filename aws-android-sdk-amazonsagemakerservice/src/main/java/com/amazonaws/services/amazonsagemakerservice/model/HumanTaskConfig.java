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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Information required for human workers to complete a labeling task.
 * </p>
 */
public class HumanTaskConfig implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team assigned to complete the
     * tasks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     */
    private String workteamArn;

    /**
     * <p>
     * Information about the user interface that workers use to complete the
     * labeling task.
     * </p>
     */
    private UiConfig uiConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function that is run before a
     * data object is sent to a human worker. Use this function to provide input
     * to a custom labeling job.
     * </p>
     * <p>
     * For the built-in bounding box, image classification, semantic
     * segmentation, and text classification task types, Amazon SageMaker Ground
     * Truth provides the following Lambda functions:
     * </p>
     * <p>
     * <b>US East (Northern Virginia) (us-east-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>US East (Ohio) (us-east-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>US West (Oregon) (us-west-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Canada (Central) (ca-central-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EU (Ireland) (eu-west-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EU (London) (eu-west-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EU Frankfurt (eu-central-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Tokyo) (ap-northeast-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Seoul) (ap-northeast-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Mumbai) (ap-south-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Singapore) (ap-southeast-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Sydney) (ap-southeast-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function
     * :[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String preHumanTaskLambdaArn;

    /**
     * <p>
     * Keywords used to describe the task so that workers on Amazon Mechanical
     * Turk can discover the task.
     * </p>
     */
    private java.util.List<String> taskKeywords;

    /**
     * <p>
     * A title for the task for your human workers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[\t\n\r -\uD7FF\uE000-\uFFFD]*$<br/>
     */
    private String taskTitle;

    /**
     * <p>
     * A description of the task for your human workers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String taskDescription;

    /**
     * <p>
     * The number of human workers that will label an object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 9<br/>
     */
    private Integer numberOfHumanWorkersPerDataObject;

    /**
     * <p>
     * The amount of time that a worker has to complete a task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 28800<br/>
     */
    private Integer taskTimeLimitInSeconds;

    /**
     * <p>
     * The length of time that a task remains available for labeling by human
     * workers. <b>If you choose the Amazon Mechanical Turk workforce, the
     * maximum is 12 hours (43200)</b>. The default value is 864000 seconds (10
     * days). For private and vendor workforces, the maximum is as listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 864000<br/>
     */
    private Integer taskAvailabilityLifetimeInSeconds;

    /**
     * <p>
     * Defines the maximum number of data objects that can be labeled by human
     * workers at the same time. Also referred to as batch size. Each object may
     * have more than one worker at one time. The default value is 1000 objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxConcurrentTaskCount;

    /**
     * <p>
     * Configures how labels are consolidated across human workers.
     * </p>
     */
    private AnnotationConsolidationConfig annotationConsolidationConfig;

    /**
     * <p>
     * The price that you pay for each task performed by an Amazon Mechanical
     * Turk worker.
     * </p>
     */
    private PublicWorkforceTaskPrice publicWorkforceTaskPrice;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team assigned to complete the
     * tasks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the work team assigned to
     *         complete the tasks.
     *         </p>
     */
    public String getWorkteamArn() {
        return workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team assigned to complete the
     * tasks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     *
     * @param workteamArn <p>
     *            The Amazon Resource Name (ARN) of the work team assigned to
     *            complete the tasks.
     *            </p>
     */
    public void setWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team assigned to complete the
     * tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     *
     * @param workteamArn <p>
     *            The Amazon Resource Name (ARN) of the work team assigned to
     *            complete the tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanTaskConfig withWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
        return this;
    }

    /**
     * <p>
     * Information about the user interface that workers use to complete the
     * labeling task.
     * </p>
     *
     * @return <p>
     *         Information about the user interface that workers use to complete
     *         the labeling task.
     *         </p>
     */
    public UiConfig getUiConfig() {
        return uiConfig;
    }

    /**
     * <p>
     * Information about the user interface that workers use to complete the
     * labeling task.
     * </p>
     *
     * @param uiConfig <p>
     *            Information about the user interface that workers use to
     *            complete the labeling task.
     *            </p>
     */
    public void setUiConfig(UiConfig uiConfig) {
        this.uiConfig = uiConfig;
    }

    /**
     * <p>
     * Information about the user interface that workers use to complete the
     * labeling task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uiConfig <p>
     *            Information about the user interface that workers use to
     *            complete the labeling task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanTaskConfig withUiConfig(UiConfig uiConfig) {
        this.uiConfig = uiConfig;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function that is run before a
     * data object is sent to a human worker. Use this function to provide input
     * to a custom labeling job.
     * </p>
     * <p>
     * For the built-in bounding box, image classification, semantic
     * segmentation, and text classification task types, Amazon SageMaker Ground
     * Truth provides the following Lambda functions:
     * </p>
     * <p>
     * <b>US East (Northern Virginia) (us-east-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>US East (Ohio) (us-east-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>US West (Oregon) (us-west-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Canada (Central) (ca-central-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EU (Ireland) (eu-west-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EU (London) (eu-west-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EU Frankfurt (eu-central-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Tokyo) (ap-northeast-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Seoul) (ap-northeast-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Mumbai) (ap-south-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Singapore) (ap-southeast-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Sydney) (ap-southeast-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function
     * :[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of a Lambda function that is run
     *         before a data object is sent to a human worker. Use this function
     *         to provide input to a custom labeling job.
     *         </p>
     *         <p>
     *         For the built-in bounding box, image classification, semantic
     *         segmentation, and text classification task types, Amazon
     *         SageMaker Ground Truth provides the following Lambda functions:
     *         </p>
     *         <p>
     *         <b>US East (Northern Virginia) (us-east-1):</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-NamedEntityRecognition</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-VerificationBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-VerificationSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-AdjustmentBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>US East (Ohio) (us-east-2):</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-NamedEntityRecognition</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-VerificationBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-VerificationSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-AdjustmentBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>US West (Oregon) (us-west-2):</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-NamedEntityRecognition</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-VerificationBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-VerificationSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-AdjustmentBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Canada (Central) (ca-central-1):</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-ImageMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-TextMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-TextMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-NamedEntityRecognition</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-VerificationBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-VerificationSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-AdjustmentBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>EU (Ireland) (eu-west-1):</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-NamedEntityRecognition</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-VerificationBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-VerificationSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-AdjustmentBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>EU (London) (eu-west-2):</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-ImageMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-TextMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-TextMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-NamedEntityRecognition</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-VerificationBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-VerificationSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-AdjustmentBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>EU Frankfurt (eu-central-1):</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-ImageMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-TextMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-TextMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-NamedEntityRecognition</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-VerificationBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-VerificationSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-AdjustmentBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Asia Pacific (Tokyo) (ap-northeast-1):</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-NamedEntityRecognition</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-VerificationBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-VerificationSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-AdjustmentBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Asia Pacific (Seoul) (ap-northeast-2):</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-ImageMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-TextMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-TextMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-NamedEntityRecognition</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-VerificationBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-VerificationSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-AdjustmentBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Asia Pacific (Mumbai) (ap-south-1):</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-ImageMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-TextMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-TextMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-NamedEntityRecognition</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-VerificationBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-VerificationSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-AdjustmentBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Asia Pacific (Singapore) (ap-southeast-1):</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-ImageMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-TextMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-TextMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-NamedEntityRecognition</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-VerificationBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-VerificationSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-AdjustmentBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Asia Pacific (Sydney) (ap-southeast-2):</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-ImageMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-TextMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-TextMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-NamedEntityRecognition</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-VerificationBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-VerificationSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-AdjustmentBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getPreHumanTaskLambdaArn() {
        return preHumanTaskLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function that is run before a
     * data object is sent to a human worker. Use this function to provide input
     * to a custom labeling job.
     * </p>
     * <p>
     * For the built-in bounding box, image classification, semantic
     * segmentation, and text classification task types, Amazon SageMaker Ground
     * Truth provides the following Lambda functions:
     * </p>
     * <p>
     * <b>US East (Northern Virginia) (us-east-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>US East (Ohio) (us-east-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>US West (Oregon) (us-west-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Canada (Central) (ca-central-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EU (Ireland) (eu-west-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EU (London) (eu-west-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EU Frankfurt (eu-central-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Tokyo) (ap-northeast-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Seoul) (ap-northeast-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Mumbai) (ap-south-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Singapore) (ap-southeast-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Sydney) (ap-southeast-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function
     * :[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param preHumanTaskLambdaArn <p>
     *            The Amazon Resource Name (ARN) of a Lambda function that is
     *            run before a data object is sent to a human worker. Use this
     *            function to provide input to a custom labeling job.
     *            </p>
     *            <p>
     *            For the built-in bounding box, image classification, semantic
     *            segmentation, and text classification task types, Amazon
     *            SageMaker Ground Truth provides the following Lambda
     *            functions:
     *            </p>
     *            <p>
     *            <b>US East (Northern Virginia) (us-east-1):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>US East (Ohio) (us-east-2):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>US West (Oregon) (us-west-2):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Canada (Central) (ca-central-1):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>EU (Ireland) (eu-west-1):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>EU (London) (eu-west-2):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>EU Frankfurt (eu-central-1):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Asia Pacific (Tokyo) (ap-northeast-1):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Asia Pacific (Seoul) (ap-northeast-2):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Asia Pacific (Mumbai) (ap-south-1):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Asia Pacific (Singapore) (ap-southeast-1):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Asia Pacific (Sydney) (ap-southeast-2):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPreHumanTaskLambdaArn(String preHumanTaskLambdaArn) {
        this.preHumanTaskLambdaArn = preHumanTaskLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function that is run before a
     * data object is sent to a human worker. Use this function to provide input
     * to a custom labeling job.
     * </p>
     * <p>
     * For the built-in bounding box, image classification, semantic
     * segmentation, and text classification task types, Amazon SageMaker Ground
     * Truth provides the following Lambda functions:
     * </p>
     * <p>
     * <b>US East (Northern Virginia) (us-east-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>US East (Ohio) (us-east-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>US West (Oregon) (us-west-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Canada (Central) (ca-central-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EU (Ireland) (eu-west-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EU (London) (eu-west-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EU Frankfurt (eu-central-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Tokyo) (ap-northeast-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Seoul) (ap-northeast-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Mumbai) (ap-south-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Singapore) (ap-southeast-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Sydney) (ap-southeast-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function
     * :[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param preHumanTaskLambdaArn <p>
     *            The Amazon Resource Name (ARN) of a Lambda function that is
     *            run before a data object is sent to a human worker. Use this
     *            function to provide input to a custom labeling job.
     *            </p>
     *            <p>
     *            For the built-in bounding box, image classification, semantic
     *            segmentation, and text classification task types, Amazon
     *            SageMaker Ground Truth provides the following Lambda
     *            functions:
     *            </p>
     *            <p>
     *            <b>US East (Northern Virginia) (us-east-1):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>US East (Ohio) (us-east-2):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>US West (Oregon) (us-west-2):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Canada (Central) (ca-central-1):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>EU (Ireland) (eu-west-1):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>EU (London) (eu-west-2):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>EU Frankfurt (eu-central-1):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Asia Pacific (Tokyo) (ap-northeast-1):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Asia Pacific (Seoul) (ap-northeast-2):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Asia Pacific (Mumbai) (ap-south-1):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Asia Pacific (Singapore) (ap-southeast-1):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Asia Pacific (Sydney) (ap-southeast-2):</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanTaskConfig withPreHumanTaskLambdaArn(String preHumanTaskLambdaArn) {
        this.preHumanTaskLambdaArn = preHumanTaskLambdaArn;
        return this;
    }

    /**
     * <p>
     * Keywords used to describe the task so that workers on Amazon Mechanical
     * Turk can discover the task.
     * </p>
     *
     * @return <p>
     *         Keywords used to describe the task so that workers on Amazon
     *         Mechanical Turk can discover the task.
     *         </p>
     */
    public java.util.List<String> getTaskKeywords() {
        return taskKeywords;
    }

    /**
     * <p>
     * Keywords used to describe the task so that workers on Amazon Mechanical
     * Turk can discover the task.
     * </p>
     *
     * @param taskKeywords <p>
     *            Keywords used to describe the task so that workers on Amazon
     *            Mechanical Turk can discover the task.
     *            </p>
     */
    public void setTaskKeywords(java.util.Collection<String> taskKeywords) {
        if (taskKeywords == null) {
            this.taskKeywords = null;
            return;
        }

        this.taskKeywords = new java.util.ArrayList<String>(taskKeywords);
    }

    /**
     * <p>
     * Keywords used to describe the task so that workers on Amazon Mechanical
     * Turk can discover the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskKeywords <p>
     *            Keywords used to describe the task so that workers on Amazon
     *            Mechanical Turk can discover the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanTaskConfig withTaskKeywords(String... taskKeywords) {
        if (getTaskKeywords() == null) {
            this.taskKeywords = new java.util.ArrayList<String>(taskKeywords.length);
        }
        for (String value : taskKeywords) {
            this.taskKeywords.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Keywords used to describe the task so that workers on Amazon Mechanical
     * Turk can discover the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskKeywords <p>
     *            Keywords used to describe the task so that workers on Amazon
     *            Mechanical Turk can discover the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanTaskConfig withTaskKeywords(java.util.Collection<String> taskKeywords) {
        setTaskKeywords(taskKeywords);
        return this;
    }

    /**
     * <p>
     * A title for the task for your human workers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[\t\n\r -\uD7FF\uE000-\uFFFD]*$<br/>
     *
     * @return <p>
     *         A title for the task for your human workers.
     *         </p>
     */
    public String getTaskTitle() {
        return taskTitle;
    }

    /**
     * <p>
     * A title for the task for your human workers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[\t\n\r -\uD7FF\uE000-\uFFFD]*$<br/>
     *
     * @param taskTitle <p>
     *            A title for the task for your human workers.
     *            </p>
     */
    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    /**
     * <p>
     * A title for the task for your human workers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[\t\n\r -\uD7FF\uE000-\uFFFD]*$<br/>
     *
     * @param taskTitle <p>
     *            A title for the task for your human workers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanTaskConfig withTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
        return this;
    }

    /**
     * <p>
     * A description of the task for your human workers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         A description of the task for your human workers.
     *         </p>
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * <p>
     * A description of the task for your human workers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param taskDescription <p>
     *            A description of the task for your human workers.
     *            </p>
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     * <p>
     * A description of the task for your human workers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param taskDescription <p>
     *            A description of the task for your human workers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanTaskConfig withTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }

    /**
     * <p>
     * The number of human workers that will label an object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 9<br/>
     *
     * @return <p>
     *         The number of human workers that will label an object.
     *         </p>
     */
    public Integer getNumberOfHumanWorkersPerDataObject() {
        return numberOfHumanWorkersPerDataObject;
    }

    /**
     * <p>
     * The number of human workers that will label an object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 9<br/>
     *
     * @param numberOfHumanWorkersPerDataObject <p>
     *            The number of human workers that will label an object.
     *            </p>
     */
    public void setNumberOfHumanWorkersPerDataObject(Integer numberOfHumanWorkersPerDataObject) {
        this.numberOfHumanWorkersPerDataObject = numberOfHumanWorkersPerDataObject;
    }

    /**
     * <p>
     * The number of human workers that will label an object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 9<br/>
     *
     * @param numberOfHumanWorkersPerDataObject <p>
     *            The number of human workers that will label an object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanTaskConfig withNumberOfHumanWorkersPerDataObject(
            Integer numberOfHumanWorkersPerDataObject) {
        this.numberOfHumanWorkersPerDataObject = numberOfHumanWorkersPerDataObject;
        return this;
    }

    /**
     * <p>
     * The amount of time that a worker has to complete a task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 28800<br/>
     *
     * @return <p>
     *         The amount of time that a worker has to complete a task.
     *         </p>
     */
    public Integer getTaskTimeLimitInSeconds() {
        return taskTimeLimitInSeconds;
    }

    /**
     * <p>
     * The amount of time that a worker has to complete a task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 28800<br/>
     *
     * @param taskTimeLimitInSeconds <p>
     *            The amount of time that a worker has to complete a task.
     *            </p>
     */
    public void setTaskTimeLimitInSeconds(Integer taskTimeLimitInSeconds) {
        this.taskTimeLimitInSeconds = taskTimeLimitInSeconds;
    }

    /**
     * <p>
     * The amount of time that a worker has to complete a task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 28800<br/>
     *
     * @param taskTimeLimitInSeconds <p>
     *            The amount of time that a worker has to complete a task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanTaskConfig withTaskTimeLimitInSeconds(Integer taskTimeLimitInSeconds) {
        this.taskTimeLimitInSeconds = taskTimeLimitInSeconds;
        return this;
    }

    /**
     * <p>
     * The length of time that a task remains available for labeling by human
     * workers. <b>If you choose the Amazon Mechanical Turk workforce, the
     * maximum is 12 hours (43200)</b>. The default value is 864000 seconds (10
     * days). For private and vendor workforces, the maximum is as listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 864000<br/>
     *
     * @return <p>
     *         The length of time that a task remains available for labeling by
     *         human workers. <b>If you choose the Amazon Mechanical Turk
     *         workforce, the maximum is 12 hours (43200)</b>. The default value
     *         is 864000 seconds (10 days). For private and vendor workforces,
     *         the maximum is as listed.
     *         </p>
     */
    public Integer getTaskAvailabilityLifetimeInSeconds() {
        return taskAvailabilityLifetimeInSeconds;
    }

    /**
     * <p>
     * The length of time that a task remains available for labeling by human
     * workers. <b>If you choose the Amazon Mechanical Turk workforce, the
     * maximum is 12 hours (43200)</b>. The default value is 864000 seconds (10
     * days). For private and vendor workforces, the maximum is as listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 864000<br/>
     *
     * @param taskAvailabilityLifetimeInSeconds <p>
     *            The length of time that a task remains available for labeling
     *            by human workers. <b>If you choose the Amazon Mechanical Turk
     *            workforce, the maximum is 12 hours (43200)</b>. The default
     *            value is 864000 seconds (10 days). For private and vendor
     *            workforces, the maximum is as listed.
     *            </p>
     */
    public void setTaskAvailabilityLifetimeInSeconds(Integer taskAvailabilityLifetimeInSeconds) {
        this.taskAvailabilityLifetimeInSeconds = taskAvailabilityLifetimeInSeconds;
    }

    /**
     * <p>
     * The length of time that a task remains available for labeling by human
     * workers. <b>If you choose the Amazon Mechanical Turk workforce, the
     * maximum is 12 hours (43200)</b>. The default value is 864000 seconds (10
     * days). For private and vendor workforces, the maximum is as listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 864000<br/>
     *
     * @param taskAvailabilityLifetimeInSeconds <p>
     *            The length of time that a task remains available for labeling
     *            by human workers. <b>If you choose the Amazon Mechanical Turk
     *            workforce, the maximum is 12 hours (43200)</b>. The default
     *            value is 864000 seconds (10 days). For private and vendor
     *            workforces, the maximum is as listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanTaskConfig withTaskAvailabilityLifetimeInSeconds(
            Integer taskAvailabilityLifetimeInSeconds) {
        this.taskAvailabilityLifetimeInSeconds = taskAvailabilityLifetimeInSeconds;
        return this;
    }

    /**
     * <p>
     * Defines the maximum number of data objects that can be labeled by human
     * workers at the same time. Also referred to as batch size. Each object may
     * have more than one worker at one time. The default value is 1000 objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         Defines the maximum number of data objects that can be labeled by
     *         human workers at the same time. Also referred to as batch size.
     *         Each object may have more than one worker at one time. The
     *         default value is 1000 objects.
     *         </p>
     */
    public Integer getMaxConcurrentTaskCount() {
        return maxConcurrentTaskCount;
    }

    /**
     * <p>
     * Defines the maximum number of data objects that can be labeled by human
     * workers at the same time. Also referred to as batch size. Each object may
     * have more than one worker at one time. The default value is 1000 objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxConcurrentTaskCount <p>
     *            Defines the maximum number of data objects that can be labeled
     *            by human workers at the same time. Also referred to as batch
     *            size. Each object may have more than one worker at one time.
     *            The default value is 1000 objects.
     *            </p>
     */
    public void setMaxConcurrentTaskCount(Integer maxConcurrentTaskCount) {
        this.maxConcurrentTaskCount = maxConcurrentTaskCount;
    }

    /**
     * <p>
     * Defines the maximum number of data objects that can be labeled by human
     * workers at the same time. Also referred to as batch size. Each object may
     * have more than one worker at one time. The default value is 1000 objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxConcurrentTaskCount <p>
     *            Defines the maximum number of data objects that can be labeled
     *            by human workers at the same time. Also referred to as batch
     *            size. Each object may have more than one worker at one time.
     *            The default value is 1000 objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanTaskConfig withMaxConcurrentTaskCount(Integer maxConcurrentTaskCount) {
        this.maxConcurrentTaskCount = maxConcurrentTaskCount;
        return this;
    }

    /**
     * <p>
     * Configures how labels are consolidated across human workers.
     * </p>
     *
     * @return <p>
     *         Configures how labels are consolidated across human workers.
     *         </p>
     */
    public AnnotationConsolidationConfig getAnnotationConsolidationConfig() {
        return annotationConsolidationConfig;
    }

    /**
     * <p>
     * Configures how labels are consolidated across human workers.
     * </p>
     *
     * @param annotationConsolidationConfig <p>
     *            Configures how labels are consolidated across human workers.
     *            </p>
     */
    public void setAnnotationConsolidationConfig(
            AnnotationConsolidationConfig annotationConsolidationConfig) {
        this.annotationConsolidationConfig = annotationConsolidationConfig;
    }

    /**
     * <p>
     * Configures how labels are consolidated across human workers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param annotationConsolidationConfig <p>
     *            Configures how labels are consolidated across human workers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanTaskConfig withAnnotationConsolidationConfig(
            AnnotationConsolidationConfig annotationConsolidationConfig) {
        this.annotationConsolidationConfig = annotationConsolidationConfig;
        return this;
    }

    /**
     * <p>
     * The price that you pay for each task performed by an Amazon Mechanical
     * Turk worker.
     * </p>
     *
     * @return <p>
     *         The price that you pay for each task performed by an Amazon
     *         Mechanical Turk worker.
     *         </p>
     */
    public PublicWorkforceTaskPrice getPublicWorkforceTaskPrice() {
        return publicWorkforceTaskPrice;
    }

    /**
     * <p>
     * The price that you pay for each task performed by an Amazon Mechanical
     * Turk worker.
     * </p>
     *
     * @param publicWorkforceTaskPrice <p>
     *            The price that you pay for each task performed by an Amazon
     *            Mechanical Turk worker.
     *            </p>
     */
    public void setPublicWorkforceTaskPrice(PublicWorkforceTaskPrice publicWorkforceTaskPrice) {
        this.publicWorkforceTaskPrice = publicWorkforceTaskPrice;
    }

    /**
     * <p>
     * The price that you pay for each task performed by an Amazon Mechanical
     * Turk worker.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicWorkforceTaskPrice <p>
     *            The price that you pay for each task performed by an Amazon
     *            Mechanical Turk worker.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanTaskConfig withPublicWorkforceTaskPrice(
            PublicWorkforceTaskPrice publicWorkforceTaskPrice) {
        this.publicWorkforceTaskPrice = publicWorkforceTaskPrice;
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
        if (getWorkteamArn() != null)
            sb.append("WorkteamArn: " + getWorkteamArn() + ",");
        if (getUiConfig() != null)
            sb.append("UiConfig: " + getUiConfig() + ",");
        if (getPreHumanTaskLambdaArn() != null)
            sb.append("PreHumanTaskLambdaArn: " + getPreHumanTaskLambdaArn() + ",");
        if (getTaskKeywords() != null)
            sb.append("TaskKeywords: " + getTaskKeywords() + ",");
        if (getTaskTitle() != null)
            sb.append("TaskTitle: " + getTaskTitle() + ",");
        if (getTaskDescription() != null)
            sb.append("TaskDescription: " + getTaskDescription() + ",");
        if (getNumberOfHumanWorkersPerDataObject() != null)
            sb.append("NumberOfHumanWorkersPerDataObject: "
                    + getNumberOfHumanWorkersPerDataObject() + ",");
        if (getTaskTimeLimitInSeconds() != null)
            sb.append("TaskTimeLimitInSeconds: " + getTaskTimeLimitInSeconds() + ",");
        if (getTaskAvailabilityLifetimeInSeconds() != null)
            sb.append("TaskAvailabilityLifetimeInSeconds: "
                    + getTaskAvailabilityLifetimeInSeconds() + ",");
        if (getMaxConcurrentTaskCount() != null)
            sb.append("MaxConcurrentTaskCount: " + getMaxConcurrentTaskCount() + ",");
        if (getAnnotationConsolidationConfig() != null)
            sb.append("AnnotationConsolidationConfig: " + getAnnotationConsolidationConfig() + ",");
        if (getPublicWorkforceTaskPrice() != null)
            sb.append("PublicWorkforceTaskPrice: " + getPublicWorkforceTaskPrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWorkteamArn() == null) ? 0 : getWorkteamArn().hashCode());
        hashCode = prime * hashCode + ((getUiConfig() == null) ? 0 : getUiConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreHumanTaskLambdaArn() == null) ? 0 : getPreHumanTaskLambdaArn().hashCode());
        hashCode = prime * hashCode
                + ((getTaskKeywords() == null) ? 0 : getTaskKeywords().hashCode());
        hashCode = prime * hashCode + ((getTaskTitle() == null) ? 0 : getTaskTitle().hashCode());
        hashCode = prime * hashCode
                + ((getTaskDescription() == null) ? 0 : getTaskDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfHumanWorkersPerDataObject() == null) ? 0
                        : getNumberOfHumanWorkersPerDataObject().hashCode());
        hashCode = prime
                * hashCode
                + ((getTaskTimeLimitInSeconds() == null) ? 0 : getTaskTimeLimitInSeconds()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTaskAvailabilityLifetimeInSeconds() == null) ? 0
                        : getTaskAvailabilityLifetimeInSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaxConcurrentTaskCount() == null) ? 0 : getMaxConcurrentTaskCount()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAnnotationConsolidationConfig() == null) ? 0
                        : getAnnotationConsolidationConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getPublicWorkforceTaskPrice() == null) ? 0 : getPublicWorkforceTaskPrice()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanTaskConfig == false)
            return false;
        HumanTaskConfig other = (HumanTaskConfig) obj;

        if (other.getWorkteamArn() == null ^ this.getWorkteamArn() == null)
            return false;
        if (other.getWorkteamArn() != null
                && other.getWorkteamArn().equals(this.getWorkteamArn()) == false)
            return false;
        if (other.getUiConfig() == null ^ this.getUiConfig() == null)
            return false;
        if (other.getUiConfig() != null && other.getUiConfig().equals(this.getUiConfig()) == false)
            return false;
        if (other.getPreHumanTaskLambdaArn() == null ^ this.getPreHumanTaskLambdaArn() == null)
            return false;
        if (other.getPreHumanTaskLambdaArn() != null
                && other.getPreHumanTaskLambdaArn().equals(this.getPreHumanTaskLambdaArn()) == false)
            return false;
        if (other.getTaskKeywords() == null ^ this.getTaskKeywords() == null)
            return false;
        if (other.getTaskKeywords() != null
                && other.getTaskKeywords().equals(this.getTaskKeywords()) == false)
            return false;
        if (other.getTaskTitle() == null ^ this.getTaskTitle() == null)
            return false;
        if (other.getTaskTitle() != null
                && other.getTaskTitle().equals(this.getTaskTitle()) == false)
            return false;
        if (other.getTaskDescription() == null ^ this.getTaskDescription() == null)
            return false;
        if (other.getTaskDescription() != null
                && other.getTaskDescription().equals(this.getTaskDescription()) == false)
            return false;
        if (other.getNumberOfHumanWorkersPerDataObject() == null
                ^ this.getNumberOfHumanWorkersPerDataObject() == null)
            return false;
        if (other.getNumberOfHumanWorkersPerDataObject() != null
                && other.getNumberOfHumanWorkersPerDataObject().equals(
                        this.getNumberOfHumanWorkersPerDataObject()) == false)
            return false;
        if (other.getTaskTimeLimitInSeconds() == null ^ this.getTaskTimeLimitInSeconds() == null)
            return false;
        if (other.getTaskTimeLimitInSeconds() != null
                && other.getTaskTimeLimitInSeconds().equals(this.getTaskTimeLimitInSeconds()) == false)
            return false;
        if (other.getTaskAvailabilityLifetimeInSeconds() == null
                ^ this.getTaskAvailabilityLifetimeInSeconds() == null)
            return false;
        if (other.getTaskAvailabilityLifetimeInSeconds() != null
                && other.getTaskAvailabilityLifetimeInSeconds().equals(
                        this.getTaskAvailabilityLifetimeInSeconds()) == false)
            return false;
        if (other.getMaxConcurrentTaskCount() == null ^ this.getMaxConcurrentTaskCount() == null)
            return false;
        if (other.getMaxConcurrentTaskCount() != null
                && other.getMaxConcurrentTaskCount().equals(this.getMaxConcurrentTaskCount()) == false)
            return false;
        if (other.getAnnotationConsolidationConfig() == null
                ^ this.getAnnotationConsolidationConfig() == null)
            return false;
        if (other.getAnnotationConsolidationConfig() != null
                && other.getAnnotationConsolidationConfig().equals(
                        this.getAnnotationConsolidationConfig()) == false)
            return false;
        if (other.getPublicWorkforceTaskPrice() == null
                ^ this.getPublicWorkforceTaskPrice() == null)
            return false;
        if (other.getPublicWorkforceTaskPrice() != null
                && other.getPublicWorkforceTaskPrice().equals(this.getPublicWorkforceTaskPrice()) == false)
            return false;
        return true;
    }
}

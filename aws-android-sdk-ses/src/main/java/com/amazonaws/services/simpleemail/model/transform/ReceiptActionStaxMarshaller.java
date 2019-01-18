/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ReceiptAction
 */
class ReceiptActionStaxMarshaller {

    public void marshall(ReceiptAction _receiptAction, Request<?> request, String _prefix) {
        String prefix;
        if (_receiptAction.getS3Action() != null) {
            prefix = _prefix + "S3Action";
            S3Action s3Action = _receiptAction.getS3Action();
            S3ActionStaxMarshaller.getInstance().marshall(s3Action, request, prefix + ".");
        }
        if (_receiptAction.getBounceAction() != null) {
            prefix = _prefix + "BounceAction";
            BounceAction bounceAction = _receiptAction.getBounceAction();
            BounceActionStaxMarshaller.getInstance().marshall(bounceAction, request, prefix + ".");
        }
        if (_receiptAction.getWorkmailAction() != null) {
            prefix = _prefix + "WorkmailAction";
            WorkmailAction workmailAction = _receiptAction.getWorkmailAction();
            WorkmailActionStaxMarshaller.getInstance().marshall(workmailAction, request,
                    prefix + ".");
        }
        if (_receiptAction.getLambdaAction() != null) {
            prefix = _prefix + "LambdaAction";
            LambdaAction lambdaAction = _receiptAction.getLambdaAction();
            LambdaActionStaxMarshaller.getInstance().marshall(lambdaAction, request, prefix + ".");
        }
        if (_receiptAction.getStopAction() != null) {
            prefix = _prefix + "StopAction";
            StopAction stopAction = _receiptAction.getStopAction();
            StopActionStaxMarshaller.getInstance().marshall(stopAction, request, prefix + ".");
        }
        if (_receiptAction.getAddHeaderAction() != null) {
            prefix = _prefix + "AddHeaderAction";
            AddHeaderAction addHeaderAction = _receiptAction.getAddHeaderAction();
            AddHeaderActionStaxMarshaller.getInstance().marshall(addHeaderAction, request,
                    prefix + ".");
        }
        if (_receiptAction.getSNSAction() != null) {
            prefix = _prefix + "SNSAction";
            SNSAction sNSAction = _receiptAction.getSNSAction();
            SNSActionStaxMarshaller.getInstance().marshall(sNSAction, request, prefix + ".");
        }
    }

    private static ReceiptActionStaxMarshaller instance;

    public static ReceiptActionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReceiptActionStaxMarshaller();
        return instance;
    }
}

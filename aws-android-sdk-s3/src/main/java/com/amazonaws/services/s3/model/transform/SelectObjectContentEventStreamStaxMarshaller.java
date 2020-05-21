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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO SelectObjectContentEventStream
 */
class SelectObjectContentEventStreamStaxMarshaller {

    public void marshall(SelectObjectContentEventStream _selectObjectContentEventStream,
            Request<?> request, String _prefix) {
        String prefix;
        if (_selectObjectContentEventStream.getRecords() != null) {
            prefix = _prefix + "Records";
            RecordsEvent records = _selectObjectContentEventStream.getRecords();
            RecordsEventStaxMarshaller.getInstance().marshall(records, request, prefix + ".");
        }
        if (_selectObjectContentEventStream.getStats() != null) {
            prefix = _prefix + "Stats";
            StatsEvent stats = _selectObjectContentEventStream.getStats();
            StatsEventStaxMarshaller.getInstance().marshall(stats, request, prefix + ".");
        }
        if (_selectObjectContentEventStream.getProgress() != null) {
            prefix = _prefix + "Progress";
            ProgressEvent progress = _selectObjectContentEventStream.getProgress();
            ProgressEventStaxMarshaller.getInstance().marshall(progress, request, prefix + ".");
        }
        if (_selectObjectContentEventStream.getCont() != null) {
            prefix = _prefix + "Cont";
            ContinuationEvent cont = _selectObjectContentEventStream.getCont();
            ContinuationEventStaxMarshaller.getInstance().marshall(cont, request, prefix + ".");
        }
        if (_selectObjectContentEventStream.getEnd() != null) {
            prefix = _prefix + "End";
            EndEvent end = _selectObjectContentEventStream.getEnd();
            EndEventStaxMarshaller.getInstance().marshall(end, request, prefix + ".");
        }
    }

    private static SelectObjectContentEventStreamStaxMarshaller instance;

    public static SelectObjectContentEventStreamStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SelectObjectContentEventStreamStaxMarshaller();
        return instance;
    }
}

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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MsSmoothGroupSettings
 */
class MsSmoothGroupSettingsJsonMarshaller {

    public void marshall(MsSmoothGroupSettings msSmoothGroupSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (msSmoothGroupSettings.getAcquisitionPointId() != null) {
            String acquisitionPointId = msSmoothGroupSettings.getAcquisitionPointId();
            jsonWriter.name("AcquisitionPointId");
            jsonWriter.value(acquisitionPointId);
        }
        if (msSmoothGroupSettings.getAudioOnlyTimecodeControl() != null) {
            String audioOnlyTimecodeControl = msSmoothGroupSettings.getAudioOnlyTimecodeControl();
            jsonWriter.name("AudioOnlyTimecodeControl");
            jsonWriter.value(audioOnlyTimecodeControl);
        }
        if (msSmoothGroupSettings.getCertificateMode() != null) {
            String certificateMode = msSmoothGroupSettings.getCertificateMode();
            jsonWriter.name("CertificateMode");
            jsonWriter.value(certificateMode);
        }
        if (msSmoothGroupSettings.getConnectionRetryInterval() != null) {
            Integer connectionRetryInterval = msSmoothGroupSettings.getConnectionRetryInterval();
            jsonWriter.name("ConnectionRetryInterval");
            jsonWriter.value(connectionRetryInterval);
        }
        if (msSmoothGroupSettings.getDestination() != null) {
            OutputLocationRef destination = msSmoothGroupSettings.getDestination();
            jsonWriter.name("Destination");
            OutputLocationRefJsonMarshaller.getInstance().marshall(destination, jsonWriter);
        }
        if (msSmoothGroupSettings.getEventId() != null) {
            String eventId = msSmoothGroupSettings.getEventId();
            jsonWriter.name("EventId");
            jsonWriter.value(eventId);
        }
        if (msSmoothGroupSettings.getEventIdMode() != null) {
            String eventIdMode = msSmoothGroupSettings.getEventIdMode();
            jsonWriter.name("EventIdMode");
            jsonWriter.value(eventIdMode);
        }
        if (msSmoothGroupSettings.getEventStopBehavior() != null) {
            String eventStopBehavior = msSmoothGroupSettings.getEventStopBehavior();
            jsonWriter.name("EventStopBehavior");
            jsonWriter.value(eventStopBehavior);
        }
        if (msSmoothGroupSettings.getFilecacheDuration() != null) {
            Integer filecacheDuration = msSmoothGroupSettings.getFilecacheDuration();
            jsonWriter.name("FilecacheDuration");
            jsonWriter.value(filecacheDuration);
        }
        if (msSmoothGroupSettings.getFragmentLength() != null) {
            Integer fragmentLength = msSmoothGroupSettings.getFragmentLength();
            jsonWriter.name("FragmentLength");
            jsonWriter.value(fragmentLength);
        }
        if (msSmoothGroupSettings.getInputLossAction() != null) {
            String inputLossAction = msSmoothGroupSettings.getInputLossAction();
            jsonWriter.name("InputLossAction");
            jsonWriter.value(inputLossAction);
        }
        if (msSmoothGroupSettings.getNumRetries() != null) {
            Integer numRetries = msSmoothGroupSettings.getNumRetries();
            jsonWriter.name("NumRetries");
            jsonWriter.value(numRetries);
        }
        if (msSmoothGroupSettings.getRestartDelay() != null) {
            Integer restartDelay = msSmoothGroupSettings.getRestartDelay();
            jsonWriter.name("RestartDelay");
            jsonWriter.value(restartDelay);
        }
        if (msSmoothGroupSettings.getSegmentationMode() != null) {
            String segmentationMode = msSmoothGroupSettings.getSegmentationMode();
            jsonWriter.name("SegmentationMode");
            jsonWriter.value(segmentationMode);
        }
        if (msSmoothGroupSettings.getSendDelayMs() != null) {
            Integer sendDelayMs = msSmoothGroupSettings.getSendDelayMs();
            jsonWriter.name("SendDelayMs");
            jsonWriter.value(sendDelayMs);
        }
        if (msSmoothGroupSettings.getSparseTrackType() != null) {
            String sparseTrackType = msSmoothGroupSettings.getSparseTrackType();
            jsonWriter.name("SparseTrackType");
            jsonWriter.value(sparseTrackType);
        }
        if (msSmoothGroupSettings.getStreamManifestBehavior() != null) {
            String streamManifestBehavior = msSmoothGroupSettings.getStreamManifestBehavior();
            jsonWriter.name("StreamManifestBehavior");
            jsonWriter.value(streamManifestBehavior);
        }
        if (msSmoothGroupSettings.getTimestampOffset() != null) {
            String timestampOffset = msSmoothGroupSettings.getTimestampOffset();
            jsonWriter.name("TimestampOffset");
            jsonWriter.value(timestampOffset);
        }
        if (msSmoothGroupSettings.getTimestampOffsetMode() != null) {
            String timestampOffsetMode = msSmoothGroupSettings.getTimestampOffsetMode();
            jsonWriter.name("TimestampOffsetMode");
            jsonWriter.value(timestampOffsetMode);
        }
        jsonWriter.endObject();
    }

    private static MsSmoothGroupSettingsJsonMarshaller instance;

    public static MsSmoothGroupSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MsSmoothGroupSettingsJsonMarshaller();
        return instance;
    }
}

package com.veeva.vault.custom.triggers;

import com.veeva.vault.sdk.api.data.RecordTriggerInfo;
import com.veeva.vault.sdk.api.data.RecordEvent;
import com.veeva.vault.sdk.api.data.RecordTrigger;
import com.veeva.vault.sdk.api.data.RecordTriggerContext;
import com.veeva.vault.sdk.api.data.RecordChange;
import com.veeva.vault.sdk.api.core.ValueType;

/**
 * Hello World sample.
 */

@RecordTriggerInfo(object = "vsdk_hello_world__c", events = {RecordEvent.BEFORE_INSERT})
public class HelloWorld implements RecordTrigger {

    public void execute(RecordTriggerContext recordTriggerContext) {

        for (RecordChange inputRecord : recordTriggerContext.getRecordChanges()) {

            inputRecord.setError("OPERATION_NOT_ALLOWED", "Hello, World.");
        }
    }
}
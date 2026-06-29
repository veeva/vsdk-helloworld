package com.veeva.vault.custom.triggers;

import com.veeva.vault.sdk.api.core.*;
import com.veeva.vault.sdk.api.data.*;

/**
 * Hello World sample.
 */

@RecordTriggerInfo(object = "vsdk_hello_world__c", events = {RecordEvent.BEFORE_INSERT})
public class HelloWorld implements RecordTrigger {
    //    The code executes on the BEFORE_INSERT event, which occurs after clicking save in the UI.
    //    Before the record is saved, the description field is set to a default value.
    public void execute(RecordTriggerContext recordTriggerContext) {
        RecordEvent event = recordTriggerContext.getRecordEvent();

        if (event.equals(RecordEvent.BEFORE_INSERT)) {
            for (RecordChange inputRecord : recordTriggerContext.getRecordChanges()) {
                String userName = inputRecord.getNew().getValue("name__v", ValueType.STRING);
                String description = "Hello, " + userName + "!";
                inputRecord.getNew().setValue("description__c", description);
            }
        }
    }
}
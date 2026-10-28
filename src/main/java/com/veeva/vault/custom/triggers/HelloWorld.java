package com.veeva.vault.custom.triggers;

import com.veeva.vault.sdk.api.core.*;
import com.veeva.vault.sdk.api.data.*;
import com.veeva.vault.sdk.api.data.Record;

import java.util.List;

/**
 * Hello World sample.
 */

@RecordTriggerInfo(object = "vsdk_hello_world__c", events = {RecordEvent.BEFORE_INSERT})
public class HelloWorld implements RecordTrigger {

//    The code in Step 1 executes on the BEFORE_INSERT event, which occurs after clicking save in the UI.
//    Before the record is saved, the description field is set to a default value.
//    *** Step 1 ***
    public void execute(RecordTriggerContext recordTriggerContext) {
        RecordEvent event = recordTriggerContext.getRecordEvent();

        if (event.equals(RecordEvent.BEFORE_INSERT)) {
            for (RecordChange inputRecord : recordTriggerContext.getRecordChanges()) {
                String userName = inputRecord.getNew().getValue("name__v", ValueType.STRING);
                String description = "Hello, " + userName + "!";
                inputRecord.getNew().setValue("description__c", description);
            }
        }

//        The code in Step 5 executes on the AFTER_INSERT event, which occurs after the BEFORE_INSERT event.
//        After the record is saved, the trigger creates a child record for the vsdk_hello_world_child__c object.
//        The child record is related to the parent record on the hello_world__c field.
//        RecordService is utilized to create the record and set the fields.
//        *** Step 5 ***
        /*
        else if (event.equals(RecordEvent.AFTER_INSERT)) {
            RecordService recordService = ServiceLocator.locate(RecordService.class);
            List<Record> records = VaultCollections.newList();

            for (RecordChange inputRecord : recordTriggerContext.getRecordChanges()) {
                Record record = recordService.newRecord("vsdk_hello_world_child__c");
                record.setValue("name__v", inputRecord.getNew().getValue("name__v", ValueType.STRING));
                record.setValue("hello_world__c", inputRecord.getNew().getValue("id", ValueType.STRING));
                records.add(record);
            }

            RecordBatchSaveRequest recordSaveRequest = recordService.newRecordBatchSaveRequestBuilder()
                    .withRecords(records)
                    .build();

            recordService.batchSaveRecords(recordSaveRequest)
//                    The code in the Debugger Tutorial adds success and error handling logic for the record save.
//                    At a minimum, an error handling strategy is required when saving records in Vault Java SDK.
//                    If an error occurs, a RollbackException is thrown, and the whole transaction is rolled back.
//                    On success, a check is done to see if the INFO log level is enabled for Debug or Runtime logs, and writes a log message.
//                    *** Debugger Tutorial ***
//                    .onSuccesses(batchOperationResults -> {
//                        LogService logService = ServiceLocator.locate(LogService.class);
//                        if (logService.isInfoEnabled()) {
//                            logService.info("Record ID: {} successfully created", batchOperationResults.get(0).getRecordId());
//                        }
//                    })
//                    .onErrors(batchOperationErrors -> {
//                        batchOperationErrors.stream().findFirst().ifPresent(error -> {
//                            String errMsg = error.getError().getMessage();
//                            int errPosition = error.getInputPosition();
//                            String name = records.get(errPosition).getValue("name__v", ValueType.STRING);
//                            throw new RollbackException("HELLO_WORLD_ERROR", "Unable to create: " + name +
//                                    "because of " + errMsg);
//                        });
//                    })
                    .execute();
        }
        */
    }
}
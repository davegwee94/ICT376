# ICT376 TEAM 3 PROJECT - CONTACT MERGER

## TEAM MEMBERS
* Finnian Ryan (32207184)
** finnian_ryan@iinet.net.au
* Dave Gwee (32529732)
** email here
* Kaito Kamiyama (31526732)
** email here

## Project Description
* An app that will merge contacts from various sources. The user will include or disclude sources 
such as sdcard, sim card, internal storage, etc, and choose which contacts to merge; or have 
likely merge candidates automatically selected. They will then be guided through any user input 
needed, such as choosing between conflicting information in a certain field; eg different 
addresses. The program will take automatic merge measures, such as names that are the same albeit 
with different capitalization. The user will be able to look at and manually change and fields. A 
common use would be merging duplicate contacts between a sim card and sd card (eg when switching 
to new phone) and produce a clean new list without duplicates.
* Potential names for app; cMerge, Contact Merger 

## PLATFORM
* We are targeting Android.
* Minimum version is 4.2 API 17. Lower if we can.

## USER INTERFACE
### DESCRIPTION

### CONCEPTS

## USER INTERACTIONS

## DATABASES
* We will be using the ContactsContract android api class to access the systems internal contacts database.
* Using this we can get a handle to the database (what android calls a cursor) to use with SQL queries.
* We may also need to create an additional database (using android's internal SQLite) to store modified/new contacts before they are saved to the systems contacts.

## MOBILE SPECIFIC FEATURES
* In the 'conflicts' activity, where a user gets to decide between conflicting data, the gyroscope can be used to 'tip' to one side or the other, to select the preferred field information.
* This may only be implemented when there is a choice between two pieces of information per field.


Revision # !MAX_REVISION!.

This is the sourses for using and testing component tSmooks

Use this component to do different data transform using a Smooks mapping capabilities.

Use tSmooks for: 
   - smooks transformation: EDI-to-XML, XML-to-XML, CSV-to-XML, XSLT-basic, XSLT-namespaces, XSLT-groovy and others. (You can see smooks exaples on http://www.smooks.org/mediawiki/index.php?title=Smooks_v1.2_Examples)
   - interaction with standard Talend components by triggered and Iterate connectors


To instal:
   1. Unzip directory "lib" content to <Talend_home>/lib/java
   2. Unzip directory "component" content to User component folder in Talend
(User component folder we can set in Talend: Window -> Preferences -> Talend -> Components -> User component folder)
To use the DEMO-jobs with tSmooks in Talend Open Studio:
   3. Unzip directory "resources" content to Component default filepath
(Component default filepath we can set in Talend: Window -> Preferences -> Talend -> Appearance -> Designer -> Component default filepath)
   4. Unzip directory "job" and import item in Talend project (as described http://code.google.com/p/soperadi-smooks/wiki/TalendImportJob?ts=1252935251&updated=TalendImportJob)
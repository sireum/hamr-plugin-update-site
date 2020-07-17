# Github hosted Sireum HAMR Plugin Update Site

Built against Sireum Kekinian Build 20200717.6b6783e - To install Kekinian see [https://github.com/sireum/kekinian/tree/6b6783e#installing](https://github.com/sireum/kekinian/tree/6b6783e#installing)

## Installation

### From within OSATE

1. Install and launch [OSATE](http://osate.org/download-and-install.html)

2. Navigate to ``Help > Install New Software ...``

3. Click ``Add...`` and in the ``Location:`` field paste the following URL

    https://raw.githubusercontent.com/sireum/hamr-plugin-update-site/master/
   
4. Uncheck the ``Group items by category`` checkbox
 
5. Check the box for ``Sireum HAMR Plugin`` and click ``Finish``

   ![install-new-software](resources/install-new-software.png)


### From within FM-IDE

The latest HAMR plugin is pre-installed in FM-IDE [releases](https://github.com/loonwerks/formal-methods-workbench/releases)

#### Updating HAMR Plugin via the Terminal

cd to the directory containing the FMIDE executable and then copy/paste the following

```
(export UPDATE_SITE=https://raw.githubusercontent.com/sireum/hamr-plugin-update-site/master; export FEATURE_ID=org.sireum.aadl.osate.hamr.feature.feature.group; ./fmide -nosplash -console -consoleLog -application org.eclipse.equinox.p2.director -repository ${UPDATE_SITE} -installIU ${FEATURE_ID} -uninstallIU ${FEATURE_ID})
```

## Usage
1. Select a system implementation from the outline outline view.

   ![outline-view](resources/system_implementation_outlin_view.png)
 
2. Click the HAMR icon from the toolbar

   ![hamr-icon](resources/hamr-toolbar.png)

3. Select the appropriate options and click ``Run``.

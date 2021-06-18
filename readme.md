# Sireum HAMR Plugin Update Site for CASE Tool Assessment 4

Built against Sireum Kekinian Build 4.20210615.0edac3a - To install Kekinian see [https://github.com/sireum/kekinian/tree/0edac3a#installing](https://github.com/sireum/kekinian/tree/0edac3a#installing)

## Installation

### From within OSATE

1. Install and launch [OSATE](http://osate.org/download-and-install.html)

2. Navigate to ``Help > Install New Software ...``

3. Click ``Add...`` and in the ``Location:`` field paste the following URL

    https://raw.githubusercontent.com/sireum/hamr-plugin-update-site/CASE-Tool-Assessment-4/
   
   \* NOTE: clicking on the above link in a web browser will result in a _400: Invalid Request_, which is expected
   
4. Uncheck the ``Group items by category`` checkbox
 
5. Check the box for ``Sireum HAMR Plugin`` and click ``Finish``

   ![install-new-software](resources/install-new-software.png)


### From within FM-IDE

The latest HAMR plugin is pre-installed in FM-IDE [releases](https://github.com/loonwerks/formal-methods-workbench/releases)


## Usage
1. Select a system implementation from the outline outline view.

   ![outline-view](resources/system_implementation_outlin_view.png)
 
2. Click the HAMR icon from the toolbar

   ![hamr-icon](resources/hamr-toolbar.png)

3. Select the appropriate options and click ``Run``.

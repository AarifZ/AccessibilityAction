addClassPath(".");
MAIN_DIRECTORY = new File(getSourceFileInfo()).getParentFile().getAbsolutePath();
String LOG_FILE = MAIN_DIRECTORY + "/log.txt";
long LONG_CLICK_DURATION = 500;
cd(MAIN_DIRECTORY);
addClassPath(".");

/* Load each module directory independently.
   In kid apps (App Factory exports), some modules may reference classes
   that aren't bundled. By wrapping each importCommands call, we ensure
   that a failure in one module doesn't prevent others from loading. */
try { importCommands("main"); } catch (Exception e) { tasker.log("importCommands main failed: " + e.getMessage()); }
try { importCommands("gestures"); } catch (Exception e) { tasker.log("importCommands gestures failed: " + e.getMessage()); }
try { importCommands("actions"); } catch (Exception e) { tasker.log("importCommands actions failed: " + e.getMessage()); }
try { importCommands("others"); } catch (Exception e) { tasker.log("importCommands others failed: " + e.getMessage()); }
try { importCommands("assist"); } catch (Exception e) { tasker.log("importCommands assist failed: " + e.getMessage()); }
try { importCommands("lib"); } catch (Exception e) { tasker.log("importCommands lib failed: " + e.getMessage()); }
try { importCommands("event"); } catch (Exception e) { tasker.log("importCommands event failed: " + e.getMessage()); }

try { source("others/globalAction.java"); } catch (Exception e) { tasker.log("globalAction.java failed: " + e.getMessage()); }

try { String RUNNING_ENV = checkEnv(); } catch (Exception e) { tasker.log("checkEnv failed: " + e.getMessage()); }
import android.view.accessibility.*;
if (debugMe == void) debugMe = false;
if (debugDelay == void) debugDelay = 1000;
if (findDelay == void) findDelay = 100;
if (debugSteps == void) debugSteps = false;
if (debugInfo == void) debugInfo = false;
if (useOffset == void) useOffset = true;
if (useA11yOffset == void) useA11yOffset = false;
if (waitNodes == void) waitNodes = true;
if (useA11yStructure == void) useA11yStructure = false;
if (includeAllMethods == void) includeAllMethods = false;
if (quickAddMode == void) quickAddMode = true;
if (stepDelay == void) stepDelay = 50;
if (waitNodesTimeout == void) waitNodesTimeout = 10000;
if (DISPLAY_ID == void) DISPLAY_ID = 0;
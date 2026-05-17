# [setDisplayIdByWindowId](/code/main/setDisplayIdByWindowId.bsh)

Select the display ID based on a specific window ID.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`setDisplayIdByWindowId` scans all windows across all displays and stores the display ID for the window whose `getId()` matches the provided value.

&nbsp;
# How it use

**Choose display by window ID:**
```
setDisplayIdByWindowId(1234);
```

&nbsp;
## Return Value
This helper does not return a value; it sets the global `DISPLAY_ID` if the window is found.